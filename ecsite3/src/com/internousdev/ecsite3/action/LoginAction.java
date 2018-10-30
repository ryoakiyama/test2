package com.internousdev.ecsite3.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.BuyItemSelectDAO;
import com.internousdev.ecsite3.dao.LoginDAO;
import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.internousdev.ecsite3.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();


	public String execute(){

		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser", loginDTO);

		BuyItemSelectDAO buyItemSelectDAO = new BuyItemSelectDAO();
		List<BuyItemDTO> buyItemDTOList = buyItemSelectDAO.getBuyItemInfo();
		session.put("buyItemDTOList", buyItemDTOList);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			//管理者かどうかチェックをする

			result = SUCCESS;
			session.put("login_user_id",loginDTO.getLoginId());

			return result;
		}

		return result;


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
