package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quickhull3d.Point3d;

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

	@GetMapping("test1")
	public VerticesDTO test1() {
		Point3d[] points = new Point3d[] { new Point3d(0.0, 0.0, 0.0), 
				new Point3d(10.0, 10.0, 5.0), new Point3d(-10.0, 10.0, 5.0), new Point3d(-10.0, -10.0, 5.0), new Point3d(10.0, -10.0, 5.0),
				new Point3d(10.0, 10.0, -5.0), new Point3d(-10.0, 10.0, -5.0), new Point3d(-10.0, -10.0, -5.0), new Point3d(10.0, -10.0, -5.0),
				new Point3d(2.0, 2.0, 2.0), new Point3d(-2.0, 2.0, -2.0), new Point3d(3.0, 1.0, 4.0), new Point3d(5.0, 10.0, 5.0) };
		return new DemoService(points).getBody();
	}
	
	@GetMapping("getBody")
	public VerticesDTO getBody() {
		return new DemoService().getBody();
	}
}
