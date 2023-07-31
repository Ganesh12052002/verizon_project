package c_s_p.orders_for_enterprise;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderEnterpriseController {
	
	@PostMapping("/api/enterprise/customers/{customerId}/orders")
	String postCatalog(@RequestBody String data) {
		return "Data posted" + data;
	}
	@PutMapping("/api/enterprise/customers/{customerId}/orders/{orderId}")
	String putCatalog(@PathVariable int customerId,@PathVariable int orderId) {
		return "Data updated" +customerId +" "+"and"+" "+orderId;
	}
	@GetMapping("/api/enterprise/customers/{customerId}/orders")
	 ArrayList<String>getOrderList2() {
		OrderEnterpriseData e = new OrderEnterpriseData();
		return e.getOrderList2();
}
	
	@GetMapping("/api/enterprise/customers/{customerId}/orders/{orderId}")
	 ArrayList<String>getEnterpriseList2() {
		OrderEnterpriseData e1 = new OrderEnterpriseData();
		return e1.getEnterpriseList2();
}
}
