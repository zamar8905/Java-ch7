package ex5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");

		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.print("ã�� ���� �ܾ��? ");
			String eng = scanner.next();
			System.out.println(dic.get(eng));
		}
		}
	}
}
