package c_s_p.enterprise;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class EnterpriseData {
	public String EnterpriseName;
	public String CustomerName;
	
public EnterpriseData() {
		
	}
	
	public String getEnterpriseName() {
		return this.EnterpriseName;
	}
	public void setEnterpriseName(String E1) {
		this.EnterpriseName = E1;
	}
	
	public String getCustomerName() {
		return this.EnterpriseName;
	}
	public void setCustomerName(String c1) {
		this.EnterpriseName = c1;
	}
	
	ArrayList<String>getEnterpriseList(){
		ArrayList<String> data= new ArrayList<String>();
		data.add("Enterprise A");
		data.add("Enterprise B");
		data.add("Enterprise C");
		return data;
	}
	
	
	
}
