package com.internousdev.ecsite3.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite3.dto.BuyItemCompleteDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String ,Object> session;
	private static final long serialVersionUID = -8314276024685310415L;
	private String id;
	private String itemTransactionId;
	private String itemName;
	private String itemPrice;
	private String totalCount;
	private String totalPrice;
	private String itemStock;
	private Collection<String> checkList;

	private String count;
	private String loginUserId;
	private String userMasterId;
	private String errorMessage;
	private String pay;

	private List<BuyItemCompleteDTO> itemInfoList = new ArrayList<BuyItemCompleteDTO>();

	public String execute() throws SQLException {

		String result = ERROR;
		System.out.println("BuyItemCompleteAction--------------");

		if(userMasterId.indexOf(",") > 0){
			userMasterId = String.valueOf((userMasterId.split(", ",0))[0]);
		}

		loginUserId = userMasterId;

		System.out.println(userMasterId);
		System.out.println(loginUserId);
		System.out.println(itemTransactionId);

		BuyItemCompleteDAO dao = new BuyItemCompleteDAO();

		System.out.println(id);
		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(itemStock);
		System.out.println(count);
		System.out.println(pay);
		System.out.println(loginUserId);
		System.out.println(userMasterId);
		System.out.println("----------------------------------");

		String[] idList = id.split(", ",0);
		String[] itemNameList = itemName.split(", ",0);
		String[] itemPriceList = itemPrice.split(", ",0);
		String[] itemStockList = itemStock.split(", ",0);
		String[] countList = count.split(", ",0);

		// 購入した商品が全て購入できたかのチェックフラグ
		int countALL=0;

		for(int i=0; i<idList.length;i++){
			BuyItemCompleteDTO dto = new BuyItemCompleteDTO();
			dto.setId(String.valueOf(idList[i]));

			dto.setItemTransactionId(String.valueOf(idList[i]));
			dto.setItemName(String.valueOf(itemNameList[i]));
			int totalCount = Integer.parseInt(countList[i]);
			int price = Integer.parseInt(itemPriceList[i]);
			dto.setItemPrice(String.valueOf(price));
			dto.setItemStock(String.valueOf(itemStockList[i]));
			dto.setCount(String.valueOf(countList[i]));
			int total=price * totalCount;
			dto.setTotalPrice(String.valueOf(total));
			dto.setTotalCount(String.valueOf(countList[i]));
			dto.setUserMasterId(userMasterId);

			if (pay.equals("2")) {
				dto.setPay("クレジットカード");
			} else {
				dto.setPay("現金支払い");
			}


			//在庫数の確認
			int dbstock = dao.itemStockInfo(idList[i]);
			//dbstockはcountが入っている
			if( Integer.parseInt(countList[i]) > dbstock ){
				//itemStockListではないのか？
				System.out.println("ここが表示されているとエラーです。");

				return ERROR;
			}

			System.out.println("-----カート情報["+i+"]---");
			System.out.println("ID               :"+dto.getId());
			System.out.println("ITEMTRANSACTIONID:"+dto.getItemTransactionId());
			System.out.println("ITEMNAME         :"+dto.getItemName());
			System.out.println("ITEMPRICE         :"+dto.getItemPrice());
			System.out.println("ITEMSTOCK        :"+dto.getItemStock());
			System.out.println("COUNT            :"+dto.getCount());
			System.out.println("TOTALPRICE       :"+dto.getTotalPrice());
			System.out.println("TOTALCOUNT       :"+dto.getTotalCount());
			System.out.println("USERMASTERID     :"+dto.getUserMasterId());
			System.out.println("PAY              :"+dto.getPay());
			System.out.println("---------------------");
			itemInfoList.add(dto);

			try{
				int c = 0;
				//実際に購入をする箇所
				c =	dao.buyItemInfo(dto.getItemTransactionId(),dto.getUserMasterId(),dto.getTotalPrice(),dto.getTotalCount(),dto.getPay());

				if (c > 0) {
					//アップデートをかける
					int intTotalCount = Integer.parseInt(dto.getTotalCount());
					int updateDbStock = dbstock - intTotalCount;
					dao.updateItemStock(Integer.parseInt(dto.getId()), updateDbStock);
				}
				countALL += c;
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		if(countALL == idList.length){
			System.out.println("DBへ登録");
			result =SUCCESS;
		}else{
			System.out.println("DBへ登録失敗");
			result = ERROR;
		}
		return result;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemTransactionId() {
		return itemTransactionId;
	}

	public void setItemTransactionId(String itemTransactionId) {
		this.itemTransactionId = itemTransactionId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public List<BuyItemCompleteDTO> getItemInfoList() {
		return itemInfoList;
	}
	public void setItemInfoList(List<BuyItemCompleteDTO> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
