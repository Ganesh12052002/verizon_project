package c_s_p.enterprise;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {
	
	@PostMapping("/api/enterprise/customers")
	String postCatalog(@RequestBody String data) {
		return "Data posted" + data;
	}
	
	@PutMapping("/api/enterprise/customers/{customerId}")
	String putCatalog(@PathVariable int customerId) {
		return "Data updated" +customerId;
	}
	
	@GetMapping("/api/enterprise/customers")
	 ArrayList<String>getEnterpriseList() {
		EnterpriseData e = new EnterpriseData();
		return e.getEnterpriseList();
}
	
	@GetMapping("/api/enterprise/customers/{customerId}")
	 ArrayList<String>getEnterpriseList1() {
		EnterpriseData e1 = new EnterpriseData();
		return e1.getEnterpriseList();
}
	

}

