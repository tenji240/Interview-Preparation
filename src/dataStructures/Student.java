package dataStructures;

public class Student {

	int id;
	String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getID(){return id;}
	public String toString(){return name;}
	
}
