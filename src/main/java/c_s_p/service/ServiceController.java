package c_s_p.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@PostMapping("/api/Service/provision")
	String postService1(@RequestBody String data) {
		return "Data posted" + data;
	}
	@PostMapping("/api/Service/test-qos")
	String postService2(@RequestBody String data) {
		return "Data posted" + data;
	}
	@PutMapping("/api/Service/disable/{connectionId}")
	String putService1(@PathVariable int connectionId) {
		return "Data updated" +connectionId;
	}
	@PutMapping("/api/Service/hold/{connectionId}")
	String putService2(@PathVariable int connectionId) {
		return "Data updated" +connectionId;
	}
	@PutMapping("/api/Service/resume/{connectionId}")
	String putService3(@PathVariable int connectionId) {
		return "Data updated" +connectionId;
	}

}
