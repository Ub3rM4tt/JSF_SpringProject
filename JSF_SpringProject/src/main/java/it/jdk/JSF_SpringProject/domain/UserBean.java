package it.jdk.JSF_SpringProject.domain;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.jdk.JSF_SpringProject.business.UserBO;

@ManagedBean(name="user") //bean gestito da JSF, evita di configurare il bean nel faces-config.xml
@Component //bean gestito da SPRING, basta anche mettere solo questo, senza managedBean! - JSR-330 è sostituibile con @Named
@SessionScoped //annotation di jsf, altrimenti va bene anche @Scope("session")
public class UserBean implements Serializable{
	
	@Autowired //grazie al component-scan messo nell'applicationContext - con JSR-330 è sostituibile con @Inject
	UserBO userBo;
	
	private static final long serialVersionUID = 1L;
	
	public void setUserBO(UserBO userBo){
		this.userBo = userBo;
	}
	public String printMsgFromSpring(){
		return this.userBo.getMessage();
	}
}
