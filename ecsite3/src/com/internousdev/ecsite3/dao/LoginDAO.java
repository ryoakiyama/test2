package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.internousdev.ecsite3.dto.LoginDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class LoginDAO {

	List<BuyItemDTO> myPageList = new ArrayList<BuyItemDTO>();

	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try{

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){

				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}


public List<BuyItemDTO> select(){
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	String sql2 = "SELECT * FROM item_info_transaction";

	try{
		PreparedStatement ps = con.prepareStatement(sql2);
		ResultSet rs = ps.executeQuery();

	while(rs.next()){

		BuyItemDTO dto = new BuyItemDTO();
		dto.setItemName(rs.getString("item_name"));
		dto.setItemPrice(rs.getString("item_price"));
		myPageList.add(dto);
	 }
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}

	return myPageList;
    }
}


