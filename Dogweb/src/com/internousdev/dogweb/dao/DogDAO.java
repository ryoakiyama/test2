package com.internousdev.dogweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.dogweb.dto.DogDTO;
import com.internousdev.dogweb.util.DBConnector;
import com.internousdev.dogweb.util.DateUtil;


public class DogDAO {
	List<DogDTO> DogDTOList = new ArrayList<DogDTO>();

	public List<DogDTO> select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil date = new DateUtil();

		String sql = "select * from users where user_name IS NOT NULL";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				DogDTO dto = new DogDTO();
				dto.setUserId(rs.getInt("login_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("login_pass"));
				dto.setResult(date.getDate()+"に新しく追加された犬です");
				DogDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return DogDTOList;


	}

	public List<DogDTO> getDogDTOList(){
		return DogDTOList;
	}
	public void setDogDTOList(List<DogDTO> dogDTOList){
		DogDTOList = dogDTOList;

	}





}
