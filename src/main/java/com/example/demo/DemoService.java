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
	
	private void generatePoints() {
		int count = (int) (Math.random() * 500);
		points = new Point3d[count];
		for (int i = 0; i < count; i++) {
			double x = -50 + Math.random() * 50;
			double y = -50 + Math.random() * 50;
			double z = -50 + Math.random() * 50;
			points[i] = new Point3d(x, y, z);
		}
	}
}
