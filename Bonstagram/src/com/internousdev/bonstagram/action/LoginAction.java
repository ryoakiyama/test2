package com.internousdev.bonstagram.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bonstagram.dao.LoginDAO;
import com.internousdev.bonstagram.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();

	public String execute(){
		String ret = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		//DBのアクセスをDTOに入れている
		
		session.put("loginUser", loginDTO);

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			//if (hoge == true)
			ret = SUCCESS;

		}

		return ret;

	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
