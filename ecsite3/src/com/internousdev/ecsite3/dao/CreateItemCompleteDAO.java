package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite3.util.DBConnector;
import com.internousdev.ecsite3.util.DateUtil;

public class CreateItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO item_info_transaction (item_name,item_price,item_stock,insert_date) VALUES(?,?,?,?)";

	public void CreateItemInfo(String newItemName,String newItemPrice,String newItemStock) throws SQLException{

		try{

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newItemName);
			ps.setString(2, newItemPrice);
			ps.setString(3, newItemStock);
			ps.setString(4, dateUtil.getDate());
			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}

	}



}
