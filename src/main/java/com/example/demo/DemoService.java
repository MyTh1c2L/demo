package com.example.demo;

import org.springframework.stereotype.Service;

import com.example.quickhull3d.Point3d;
import com.example.quickhull3d.QuickHull3D;

@Service
public class DemoService {

	private Point3d[] points;
	private QuickHull3D hull;
	
	public DemoService(Point3d[] points) {
		this.points = points;
		hull = new QuickHull3D();
		hull.build(points);
	}
	
	public DemoService() {
		generatePoints();
		hull = new QuickHull3D();
		hull.build(points);
	}

	public Point3d[] getVertices() {
		Point3d[] vertices = hull.getVertices();
		return vertices;
	}

	public int[][] getFaces() {
		int[][] faceIndices = hull.getFaces();
		return faceIndices;
	}
	
	public VerticesDTO getPoints() {
		Point3d[] vertices = hull.getVertices();
		VerticesDTO verticesOut = new VerticesDTO(points, vertices);
		return verticesOut;
	}
	
	public VerticesDTO getBody() {
		Point3d[] vertices = hull.getVertices();
		int[][] faces = hull.getFaces();
		VerticesDTO verDto = new VerticesDTO(points, vertices, faces);
		return verDto;
	}
	
	private void generatePoints() {
		int count = 100000;
		points = new Point3d[count];
		for (int i = 0; i < count; i++) {
			double x = -4000 + Math.random() * 8000;
			double y = -2000 + Math.random() * 4000;
			double z;
			if (i < 50000) {
				z = 100;
			}
			else 
				z = -100;
			points[i] = new Point3d(x, y, z);
		}
	}
}
