package com.internousdev.dogweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.dogweb.util.DBConnector;


public class UCSDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();
	private String sql = "INSERT INTO users(login_id,login_pass,user_name,img,insert_date,updated_date) VALUES(?,?,?,?,now(),?)";

	public void createUser(String loginUserId,String loginUserPassword,String userName,String img)throws SQLException{

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,loginUserId);
			ps.setString(2,loginUserPassword);
			ps.setString(3,userName);
			ps.setString(4, img);
			ps.setString(5,"0001-01-01 00:00:00");

			ps.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

}
