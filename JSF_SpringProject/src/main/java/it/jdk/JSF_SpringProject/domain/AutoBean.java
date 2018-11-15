package it.jdk.JSF_SpringProject.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.jdk.JSF_SpringProject.business.AutoBO;

@Component //basta questa, senza mettere @ManagedBean
@Scope(value="session")
public class AutoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Autowired
	AutoBO autoBO;

	public AutoBO getAutoBO() {
		return autoBO;
	}

	public void setAutoBO(AutoBO autoBO) {
		this.autoBO = autoBO;
	}
	
	public String getRivenditore(){
		return autoBO.getRivenditoreName();
	}
	public List<String> getListaAuto(){
		return autoBO.getAutoInfo();
	}
}
