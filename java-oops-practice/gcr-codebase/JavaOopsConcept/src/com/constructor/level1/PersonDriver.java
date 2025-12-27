package com.constructor.level1;

public class PersonDriver {

	public static void main(String[] args) {
		Person p1 = new Person("Utkarsh", 20);
        Person p2 = new Person(p1); // Cloning

        p1.display();
        p2.display();

	}

}
