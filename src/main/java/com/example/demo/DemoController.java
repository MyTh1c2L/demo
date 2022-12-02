package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DemoController {

	
	@GetMapping("getVertices")
	public ResponseEntity<?> getVertices() {
		return new ResponseEntity<>(new DemoService().getVertices(), HttpStatus.OK);
	}
	
	@GetMapping("getFaces")
	public ResponseEntity<?> getFaces() {
		return new ResponseEntity<>(new DemoService().getFaces(), HttpStatus.OK);
	}
	
	@GetMapping("getPoints")
	public VerticesDTO getPoints() {
		return new DemoService().getPoints();
	}
}
