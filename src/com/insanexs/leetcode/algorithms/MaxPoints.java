package com.insanexs.leetcode.algorithms;


public class MaxPoints {
//	Plan A;
//	public static int maxPoints(Point[] points) {
//		if (points.length < 3) {
//			return points.length;
//		}
//		int maxCount = 2;
//		int pointCounts = points.length;
//		int a, b;
//		int count = 0;
//		for (int i = 0; i < pointCounts - 1; i++) {
//			int samePointCount = 0;
//			for (int j = i + 1; j < pointCounts; j++) {
//				count = 1;
//				if (points[i].x == points[j].x) {
//					if (points[i].y == points[j].y) {
//						samePointCount++;
//					} else {
//						count++;
//						for (int k = j + 1; k < pointCounts; k++) {
//							if (points[k].x == points[i].x)
//								count++;
//						}
//						count = count + samePointCount;
//						if (count > maxCount)
//							maxCount = count;
//					}
//				} else {
//					count++;
//					for (int k = j + 1; k < pointCounts; k++) {
//						a = (points[i].y - points[j].y)
//								/ (points[i].x - points[j].x);
//						b = points[i].y - a * points[i].x;
//						if (points[k].y == (a * points[k].x) + b){
//							count++;
//						}
//					}
//					count = count + samePointCount;
//					if (count > maxCount)
//						maxCount = count;
//				}
//			}
//			
//		}
//		return maxCount;
//		}
	public static int maxPoints(Point[] points){
	if(points.length < 3)
		return points.length;
	int maxCount = 0;
	for(int i = 0; i<points.length; i++){
		int samePointCount = 1;
		for(int j = i + 1; j < points.length; j++){
			int count = 0;
			if(points[i].x == points[j].x){
				if(points[i].y == points[j].y){
					samePointCount++;
					if(samePointCount == points.length )
						return samePointCount;
					continue;
					}else{
						count = methodA(points,points[i].x) ;
					}
			}else{
				count = methodB(points,i,j) ;
			}
			if(count > maxCount)
				maxCount = count;
		}
	}
	return maxCount;
}
public static int methodA(Point[] points,int valueX){
	int count = 0;
	for(Point p : points){
		if(p.x == valueX)
			count++;
	}
	return count;
}

	public static int methodB(Point[] points, int i, int j) {
		int count = 0;
		System.out.println("i = " + i + "j = " + j);
		double len1 = Math.sqrt(Math.pow((points[i].x - points[j].x), 2)+ Math.pow((points[i].y - points[j].y), 2));
		for (Point p : points) {
			double len2 = Math.sqrt(Math.pow((points[i].x - p.x), 2)+ Math.pow((points[i].y - p.y), 2));
			double len3 = Math.sqrt(Math.pow((p.x - points[j].x), 2)+ Math.pow((p.y - points[j].y), 2));
			if ((len1 == len2 + len3) | (len2 == len1 + len3)
					| (len3 == len1 + len2)){
				count++;
			}
		}
		System.out.println("methodB count is " + count);
		return count;
	}

	public static void main(String[] args) {
		Point[] points = {new Point(3,1),new Point(12,3),new Point(3,1),new Point(-6,-1)};
		System.out.println(MaxPoints.maxPoints(points));
	}

}
