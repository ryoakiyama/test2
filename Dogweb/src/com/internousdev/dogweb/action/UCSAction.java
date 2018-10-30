package com.internousdev.dogweb.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.dogweb.dao.UCSDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UCSAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String img;
	public Map<String,Object>session;
	private UCSDAO ucsDAO = new UCSDAO();

	public String execute() throws SQLException{

		//DAOを経由して入力された内容をDBに格納します
		ucsDAO.createUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("img").toString(),
				session.get("userName").toString());

		String result = SUCCESS;
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLodinPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}




}















