package c_s_p.catalog;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController1 {
	
	@GetMapping("/api/catalog1")
	public ArrayList<String> getCatalogList1(){
		CatalogData e = new CatalogData();
		return e.getCatalogList1();
	}
	
	@PostMapping("/api/catalog1")
	public String postCatalog(@RequestBody String data) {
		return "Data posted" + data;
	}
	
	@PutMapping("/api/catalog1/{id}")
	String putCatalog(@PathVariable int id) {
		return "Data updated" +id;
	}
	
	@DeleteMapping("/api/catalog1/{id}")
	String deleteCatalog(@PathVariable int id) {
		return "Deleted"+" "+ id ;
	}
	
	}
			


