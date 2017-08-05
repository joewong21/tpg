package com.tpg.test;

public class Student implements Comparable<Student>{
	Integer id; 
	String firstName;
    Double gpa;
    
    public Student(Integer pId, String pFirstName, Double pGpa){
    	id = pId;
    	firstName = pFirstName;
    	gpa = pGpa;
    }
    
	public Integer getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public Double getGpa() {
		return gpa;
	}

	@Override
	public int compareTo(Student s) {
		if(s.gpa.compareTo(gpa) == 0 )
			if(!firstName.equals(s.firstName))
				return firstName.compareToIgnoreCase(s.firstName);
			else
				return id - s.id;
		else
			return  (s.gpa.compareTo(gpa));
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", gpa=" + gpa + "]";
	}
 
    
}
