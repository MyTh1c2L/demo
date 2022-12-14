package com.example.demo;

import com.example.quickhull3d.Point3d;

public class VerticesDTO {
	
	private Point3d[] pointsIn;
	private Point3d[] pointsOut;
	private int[][] faces;
	
	public VerticesDTO(Point3d[] pointsIn, Point3d[] pointsOut) {
		this.setPointsIn(pointsIn);
		this.setPointsOut(pointsOut);
	}
	
	public VerticesDTO(Point3d[] pointsIn, Point3d[] pointsOut, int[][] faces) {
		this.setPointsIn(pointsIn);
		this.setPointsOut(pointsOut);
		this.faces = faces;
	}

	public Point3d[] getPointsOut() {
		return pointsOut;
	}

	public void setPointsOut(Point3d[] pointsOut) {
		this.pointsOut = pointsOut;
	}

	public Point3d[] getPointsIn() {
		return pointsIn;
	}

	public void setPointsIn(Point3d[] pointsIn) {
		this.pointsIn = pointsIn;
	}

	public int[][] getFaces() {
		return faces;
	}

	public void setFaces(int[][] faces) {
		this.faces = faces;
	}
}
