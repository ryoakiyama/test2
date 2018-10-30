package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite3.util.DBConnector;
import com.internousdev.ecsite3.util.DateUtil;

public class BuyItemCompleteDAO {

	private String sql = "INSERT INTO user_buy_item_transaction (item_transaction_id,total_price,total_count,user_master_id,pay,insert_date) VALUES(?,?,?,?,?,?)";
	//ここがIDなのは何故なのか
//*ではないのはitem_stockだけでいいから(*だと表の全ての項目をとってきてしまう)


	public int buyItemInfo(String item_transaction_id,String user_master_id,String total_price,String total_count,String pay)throws SQLException{

		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		DateUtil dateUtil = new DateUtil();

		int count = 0;
		try{

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, dateUtil.getDate());
			count = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return count;

	}


	//このメソッドが、商品の在庫を取ってくる
	public int itemStockInfo(String id){

		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		//これはルール。毎回書く
		String sql ="select item_stock from item_info_transaction where id= ?";
		int count = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,id);
			ResultSet rs = ps.executeQuery();
			//select分のときに使う。検索結果を返す。表をそのまま返す。
			//このrsの中に表が入っているようなイメージ
			if(rs.next()){
			count = rs.getInt("item_stock");
			}
			//表に1つでもあるかどうかのチェック。
       	}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
		return count;
	}
	//このメソッドが、商品の在庫を取ってくる
	public int updateItemStock(int id, int itemStock){

		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();
		//これはルール。毎回書く
		String sql ="update item_info_transaction set item_stock=? where id=?";

		int count = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,itemStock);
			ps.setInt(2,id);
			count = ps.executeUpdate();
       	}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
		return count;
	}
}