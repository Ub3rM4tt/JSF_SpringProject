package it.jdk.JSF_SpringProject.business.impl;

import org.springframework.stereotype.Service;

import it.jdk.JSF_SpringProject.business.UserBO;
@Service
public class UserBOImpl implements UserBO{

	public String getMessage() {
		return "The message sent is: Hello!";
	}
}