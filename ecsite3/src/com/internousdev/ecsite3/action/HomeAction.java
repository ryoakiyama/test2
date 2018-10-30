package com.internousdev.ecsite3.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dao.BuyItemSelectDAO;
import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	private Map<String,Object> session;
	public String execute(){

		String result = "login";
		if(session.containsKey("login_user_id")){

			BuyItemSelectDAO buyItemSelectDAO = new BuyItemSelectDAO();
			List<BuyItemDTO> buyItemDTOList = buyItemSelectDAO.getBuyItemInfo();
			session.put("buyItemDTOList", buyItemDTOList);

			result = SUCCESS;
		}
		return result;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public Map<String,Object> getSession(){
		return this.session;
	}
}
