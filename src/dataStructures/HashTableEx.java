package dataStructures;
import java.util.HashMap;

public class HashTableEx {
	
	public static void main(String args[]){
		
		HashMap<Integer, Student> students = new HashMap<Integer, Student>();
		
		for(int i = 0; i < 30; i++){
			Student temp = new Student(i, "Student"+ i);
			students.put(i, temp);
		}
		
	}
}