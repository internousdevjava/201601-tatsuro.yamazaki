package com.internousdev.yamazaki.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.yamazaki.dao.LoginDAO;
import com.internousdev.yamazaki.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware{
	public String id;
	public String password;
	private Map<String,Object>session;

	public String execute(){
		LoginDAO dao = new LoginDAO();
		boolean rel = dao.select(id,password);

		if(!rel){
			return ERROR;
		}

		LoginDTO dto = new LoginDTO(id, password);
		session.put("id", dto.getId());

		return SUCCESS;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getPass(){
		return password;
	}

	public void setPass(String password){
		this.password = password;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}