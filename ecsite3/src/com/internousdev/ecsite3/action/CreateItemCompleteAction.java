package com.internousdev.ecsite3.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.CreateItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateItemCompleteAction extends ActionSupport implements SessionAware {

	private String newItemName;
	private String newItemPrice;
	private String newItemStock;
	public Map<String,Object> session;
	private CreateItemCompleteDAO createItemCompleteDAO = new CreateItemCompleteDAO();

	public String execute() throws SQLException{

		createItemCompleteDAO.CreateItemInfo(

				session.get("newItemName").toString(),
				session.get("newItemPrice").toString(),
				session.get("newItemStock").toString());

		String result = SUCCESS;
		return result;
	}

	public String getNewItemName() {
		return newItemName;
	}

	public void setNewItemName(String newItemName) {
		this.newItemName = newItemName;
	}

	public String getNewItemPrice() {
		return newItemPrice;
	}

	public void setNewItemPrice(String newItemPrice) {
		this.newItemPrice = newItemPrice;
	}

	public String getNewItemStock() {
		return newItemStock;
	}

	public void setNewItemStock(String newItemStock) {
		this.newItemStock = newItemStock;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public CreateItemCompleteDAO getCreateItemCompleteDAO() {
		return createItemCompleteDAO;
	}

	public void setCreateItemCompleteDAO(CreateItemCompleteDAO createItemCompleteDAO) {
		this.createItemCompleteDAO = createItemCompleteDAO;
	}



}
