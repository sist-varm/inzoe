package com.varm.inzoe;
import org.springframework.web.bind.annotation.*;
@RestController
public class FirstController {
	@RequestMapping("/")
	public String index() {
		return "Hello";
	}

}
