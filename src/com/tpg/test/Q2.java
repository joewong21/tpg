package com.tpg.test;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(33,"Tina",3.68));
		students.add(new Student(85,"Loius",3.85));
		students.add(new Student(56,"Samil",3.75));
		students.add(new Student(19,"Samar",3.75));
		students.add(new Student(22,"Lorry",3.76));
		students.add(new Student(31,"Tina",3.68));
		
		Collections.sort(students);
		
		for(Student s: students){
			System.out.println(s.toString());
		}
	}

}
