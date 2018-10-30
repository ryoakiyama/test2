package com.internousdev.bonstagram.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.bonstagram.util.DBConnector;


public class PostDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	private String sql = "insert into kakikomi(kakikomi) VALUES(?)";

	public void PostComplete(String kakikomi)throws SQLException{


		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, kakikomi);

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
