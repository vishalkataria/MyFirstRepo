package com.kataria.vishal.overrideEqual;

import java.util.ArrayList;
import java.util.List;

public class AddPerson {

	public static void main(String[] args) {

		int add = 0;
		List<Person> list = new ArrayList();

		Person p1 = new Person("Rajesh", 21);
		Person p2 = new Person("Ramesh", 32);
		Person p3 = new Person("Rajesh", 32);
		Person p4 = new Person("Rajesh", 21);

		Person[] arr = { p1, p4, p3, p2 };

		for (Person p : arr) {

			if (list.isEmpty()) {
				list.add(p);
				System.out.println("person added");
			} else {
				for (Person pr : list) {
					if (p.equals(pr)) {
						System.out.println("duplicate");
					} else {
						System.out.println("not duplicate");
						add = add + 1;
					}
				}
				if (add > 0) {
					add = 0;
					list.add(p);
					System.out.println("person added");
				}
			}
		}

	}
}
