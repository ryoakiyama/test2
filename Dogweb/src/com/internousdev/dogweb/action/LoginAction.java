package com.internousdev.dogweb.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.dogweb.dao.LoginDAO;
import com.internousdev.dogweb.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String human_pass;
	private String human_id;
	private String result;
	private Map<String,Object> session;

	public String execute(){
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();


		result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(human_id,human_pass);
		session.put("loginUser", loginDTO);

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			//おそらくここがDB上のユーザー情報と照合する部分

			result = SUCCESS;
			session.put("human_id",loginDTO.getHuman_id());

			//ログイン成功した後、商品情報が必要だからここに記載
			return result;

		}
		return result;
	}

	public String getHuman_pass() {
		return human_pass;
	}

	public void setHuman_pass(String human_pass) {
		this.human_pass = human_pass;
	}

	public String getHuman_id() {
		return human_id;
	}

	public void setHuman_id(String human_id) {
		this.human_id = human_id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
