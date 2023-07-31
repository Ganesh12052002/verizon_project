package c_s_p.catalog;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class CatalogData {
	public int catalogId;
	public String catalogName;
	
	CatalogData() {
		
	} 
	
	public int getcatalogId() {
		return this.catalogId;
	}
	
	public void setcatalogId(int id) {
		this.catalogId=id;
	}
	
	public String getcatalogName() {
		return this.catalogName;
	}
	
	public void setcatalogName(String name) {
		this.catalogName=name;
	}
	
	public void test(){
		System.out.println("Test  Method");
	}
	
	ArrayList<String>getCatalogList1(){
		ArrayList<String> data= new ArrayList<String>();
		data.add("Plan A");
		data.add("Plan B");
		data.add("Plan C");
		return data;
	}
	
	
}
