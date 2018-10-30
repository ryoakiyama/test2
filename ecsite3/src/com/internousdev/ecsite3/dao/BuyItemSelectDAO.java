package com.internousdev.ecsite3.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.internousdev.ecsite3.util.DBConnector;
public class BuyItemSelectDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection con = dbConnector.getConnection();
	public List<BuyItemDTO> getBuyItemInfo(){
		List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();
		String sql = "SELECT id, item_name, item_price, item_stock FROM item_info_transaction";

		try{

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				BuyItemDTO buyItemDTO = new BuyItemDTO();
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
				buyItemDTO.setItemStock(rs.getString("item_stock"));
				buyItemDTOList.add(buyItemDTO);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return buyItemDTOList;

	}

}
