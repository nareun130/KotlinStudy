package test;

import person.PersonKotlin;

public class PersonKotlinTest {
	public static void main(String[] args) {
		PersonKotlin ktPerson = new PersonKotlin("Kotlin", 9, false);
		System.out.println(ktPerson.getName());
		System.out.println(ktPerson.getInt());
		System.out.println(ktPerson.isMarried());
	}
}
