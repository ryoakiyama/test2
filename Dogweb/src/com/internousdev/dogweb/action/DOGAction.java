package com.internousdev.dogweb.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.dogweb.dao.DogDAO;
import com.internousdev.dogweb.dto.DogDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DOGAction extends ActionSupport {

	private List<DogDTO> DogDTOList = new ArrayList<DogDTO>();

	public String execute(){
		String ret = ERROR;
		DogDAO dao = new DogDAO();

		DogDTOList = dao.select();

		ret = SUCCESS;

	return ret;

	}

	public List<DogDTO> getDogDTOList(){
		return DogDTOList;
	}

	public void setDogDTOList(List<DogDTO> dogDTOList){
		DogDTOList = dogDTOList;
	}
}