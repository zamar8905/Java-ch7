package ex2;

import java.util.Vector;

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		for(int i=0; i<v.size(); i++){
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}
