package ex1;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// Generic vector
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
				
		System.out.println("The number of elemnets is " + v.size());
		System.out.println("The capacity of vector is " + v.capacity());
		
		int sum = 0;
		for(int i=0;  i<v.size(); i++){
			int n = v.get(i);
			sum+=n;
			System.out.println(n);
		}
		System.out.println("Sum of vector is " + sum);
	}
}
