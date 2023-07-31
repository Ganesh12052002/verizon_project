package c_s_p.orders_for_enterprise;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class OrderEnterpriseData {
	
	public String orderName;
	public String EnterpriseName;
	
	public OrderEnterpriseData() {
		
	}
	
	public String getorderName() {
		return this.orderName;
	}
	public void setorderName(String n) {
		this.orderName = n;
	}
	public String getEnterpriseName() {
		return this.EnterpriseName;
	}
	public void setEnterpriseName(String E2) {
		this.EnterpriseName = E2;
	}
	
	ArrayList<String>getOrderList2(){
		 ArrayList<String> data= new ArrayList<String>();
		data.add("order 1");
		data.add("order 2");
		data.add("order 3");
		return data;
	}
	ArrayList<String>getEnterpriseList2(){
		ArrayList<String> data= new ArrayList<String>();
		data.add("Enterprise 1");
		data.add("Enterprise 2");
		data.add("Enterprise 3");
		return data;
	}
}
