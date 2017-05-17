package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		for(int i=0; i<4; i++){
			System.out.print("Enter your name : ");
			a.add(input.next());
		}
		
		for(int i=0; i<a.size(); i++){
			System.out.print(a.get(i) + " ");
		}
		
		int longestIndex = 0;
		for(int i=0; i<a.size(); i++){
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("Longest name is " + a.get(longestIndex));
	}
}
