package c_s_p.service;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class ServiceData {
	
	public String Service;
	public String provision;
	public String Testqos;
	
public ServiceData() {
		
	}
	
	public String getServiceName() {
		return this.Service;
	}
	public void setServiceName(String E1) {
		this.Service = E1;
	}
	
	public String getprovisionName() {
		return this.provision;
	}
	public void setprovisionrName(String c1) {
		this.provision = c1;
	}
	public String getTestqos() {
		return this.Testqos;
	}
	public void setTestqos(String c1) {
		this.Testqos = c1;
	}
	

}
