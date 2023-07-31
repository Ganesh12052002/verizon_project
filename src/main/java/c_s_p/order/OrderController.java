package c_s_p.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderController {
	
	@PostMapping("/api/consumer/customers/{customerid}/orders")
	List<OrderData> postOrder (@PathVariable int customerid,@RequestBody List<OrderData> data)
	{
		data.get(0).setOrderId(customerid);
		data.get(1).setOrderId(customerid);
	
		return data;

}
	@PutMapping("/api/consumer/customers/{customerid}/orders/{orderId}")
	
	String putOrder1(@PathVariable int customerid, @PathVariable int orderId ) {
		return "Data updated" +" " +customerid +" and " + orderId;
	}
	
	@GetMapping("/api/consumer/customers/{customerid}/orders")
	public ArrayList<String> getOrderList1(){
		OrderData e = new OrderData();
		return e.getOrderList1();
	}
	
	@GetMapping("/api/consumer/orders/{orderId}")
	public ArrayList<String> ConsumerList2(){
		OrderData e = new OrderData();
		return e.getConsumerList2();
	}
	
	@GetMapping("/api/consumer/orders/status/{orderId}")
	public ArrayList<String> statusList(){
		OrderData e = new OrderData();
		return e.getstatusList();
	}
}
	
	
