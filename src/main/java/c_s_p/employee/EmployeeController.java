package c_s_p.employee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	//@RequestMapping("/test")
	//@ResponseBody
	// Method
		//public String hello() {
			//return "Hello how are you";
	
	@GetMapping(value="/employees", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String getData()
	{
		return "<html>\n" + "<header><title>Welcome</title></header>\n" + "<body>\n" + "<h1>Hello</h1> world\n" + "</body>\n" + "</html>";
	}
	
	@PostMapping("/api/catalog2")
	String postCatalog2(@RequestBody Employee data) {
		return( "Data posted"+data.getUserId()+ " "+data.getName());
	}

}
