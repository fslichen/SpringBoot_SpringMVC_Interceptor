package evolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import evolution.controller.dto.RequestDto;

@RestController
public class AnyController {
	@GetMapping("/get")
	public void get() {
		System.out.println("The get request method is being processed.");
	}
	
	@PostMapping("/post")
	public void post(@RequestBody RequestDto requestDto) {
		System.out.println("The post request method is being processed. The request body is " + requestDto + ".");
	}
}
