package day10Review;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Member> member = new ArrayList<>();
		
		member.add(new Member("다현",20));
		member.add(new Member("모모",23));
		member.add(new Member("쯔위",22));
		
		System.out.println(member);
		
		member.remove(1);
		System.out.println(member);

		member.add(0,new Member("사나",20));
		System.out.println(member);
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(1,5);
		System.out.println(num);
		
		num.sort(null);
		System.out.println(num);
		System.out.println(num.get(2));
		num.remove(2);
		System.out.println(num);
		
	}

}
