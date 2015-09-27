package com.hackbulgaria.programming51.week1;

public class students {
	public String name;
	String course;
	public String gender;
	public int id;
	public int [] grades = new int[5];
	
	public students(){
		
	}

	public students(String name, String course, String gender, int id){
		this.name = name;
		this.course = course;
		this.gender = gender;
		this.id = id;
	}
	
	public void addGrade(int grade, int index){
		grades[index] = grade;
	}
	
	public String toString(){
		return (name + "\n " + course + "\n " + gender + "\n " + id + "\n" + printGrades());
	}
	public String printGrades(){
		String str = "";
		for(int i = 0; i < 5; i ++){
			str = str + i+":" + grades[i] + "\n";
		}
		return str;
	}
	
	public boolean isFalling(){
		return  averageGrade() <= 3;
		
		
	}
	
	public double averageGrade(){
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + grades[i];
		}
		return sum/5;
	}
	
	
}
