package ex7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> map = 
				new HashMap<String, Student>();
		
		map.put("Ȳ����", new Student(1, "010-111-1111"));
		map.put("�ѿ���", new Student(2, "010-222-2222"));
		map.put("�̿���", new Student(3, "010-333-3333"));
		
		System.out.println("HashMap�� ��� ������ " + map.size());
		
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String name = it.next();
			Student student = map.get(name);
			System.out.println(name + " : " + student.id
					+ " " + student.tel);
		}
	}
}
