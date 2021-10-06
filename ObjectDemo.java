package packageintro;

import java.util.HashSet;

public class ObjectDemo {
	
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setTeacherId(1);
		t1.setName("Raj");
		
		Teacher t2 = new Teacher();
		t2.setTeacherId(1);
		t2.setName("Raj");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		HashSet set = new HashSet(); //it stores only unique elements
		set.add(t1);
		set.add(t2);
		
		System.out.println(set);
			
	}
	

	

}
