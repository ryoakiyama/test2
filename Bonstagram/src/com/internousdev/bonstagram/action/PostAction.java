package com.internousdev.bonstagram.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bonstagram.dao.PostDAO;
import com.opensymphony.xwork2.ActionSupport;

public class PostAction extends ActionSupport implements SessionAware {

	private String kakikomi;
	public Map<String,Object> session;
	private PostDAO postDAO = new PostDAO();


	public String execute() throws SQLException{

		postDAO.PostComplete(session.get("kakikomi").toString());

		String result = SUCCESS;
		return result;




	}


	public String getKakikomi() {
		return kakikomi;
	}

	public void setKakikomi(String kakikomi) {
		this.kakikomi = kakikomi;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}



}
