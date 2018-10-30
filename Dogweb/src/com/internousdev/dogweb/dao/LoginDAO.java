package com.internousdev.dogweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.dogweb.dto.LoginDTO;
import com.internousdev.dogweb.util.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String human_id,String human_pass){

		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		LoginDTO loginDTO = new LoginDTO();
		String sql = "SELECT * FROM human where human_id = ? AND human_pass=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, human_id);
			ps.setString(2, human_pass);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				loginDTO.setHuman_id(rs.getString("human_id"));
				loginDTO.setHuman_pass(rs.getString("human_pass"));

				if(!(rs.getString("human_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
			}catch(Exception e){
				e.printStackTrace();
			}
			return loginDTO;
	}
}


