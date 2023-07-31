package c_s_p.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;

@Entity
public class OrderData {
	public int OrderId;
	public String orderName;
	
	
	
	public OrderData() {
		
	}
	
	public int getOrderId() {
		return this.OrderId;
	}
	public String getorderName() {
		return this.orderName;
	}
	public void setOrderId(int num) {
		this.OrderId=num;
	}
	public void setorderName(String n) {
		this.orderName = n;
	}
	
	 ArrayList<String>getOrderList1(){
		 ArrayList<String> data= new ArrayList<String>();
		data.add("order A");
		data.add("order B");
		data.add("order C");
		return data;
	}
	 
	 ArrayList<String>getConsumerList2(){
		 ArrayList<String> data= new ArrayList<String>();
		data.add("sam");
		data.add("ram");
		data.add("sush");
		return data;
	}
	 
	 ArrayList<String>getstatusList(){
		 ArrayList<String> data= new ArrayList<String>();
		data.add("success");
		data.add("failure");
		data.add("inprogress");
		return data;
	}
	
	}
	


