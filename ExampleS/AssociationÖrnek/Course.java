package DersÖrneği2;

import java.util.*;

public class Course {
private String name;
private String code;
private int Capacity;
//private ArrayList<Student> students;
private Student[] students;
private int studentCount;
	
public Course(String code,String name,int capacity) {
this.code=code;
this.name=name;
this.Capacity=capacity;
//students=new ArrayList<Student>();
students=new Student[capacity];
studentCount=0;
}

public String getCode() {
	return this.code;
}

public String getName() {
	return this.name;
}

public int getCapacity() {
	return this.Capacity;
}

public int getStudentCount() {
	//return students.size();
	return studentCount;
}

public boolean addStudent(Student stu) {
	if(this.getStudentCount()==this.getCapacity()||findStudent(stu.getNumber())!=null) {
		return false;
	}else {
		//students.add(stu);
		students[studentCount]=stu;
		studentCount++;
		return true;
	}
}

public void increaseCapacity(int newCapacity) {
	if(newCapacity<this.getCapacity())
		return;
	else{
		this.Capacity=newCapacity;
		Student []tmp=new Student[newCapacity];
		
		for(int i=0;i<studentCount;i++) 
			tmp[i]=students[i];
		students=tmp;
		
	}
}

public Student findStudent(String number) {/*
	for(Student std:students) 
		if(std.getNumber().compareTo(number)==0) 
			return std;
	return null;
*/
	for (int i=0;i<studentCount;i++)
		if(students[i].getNumber().compareTo(number)==0)
			return students[i];
		return null;

}

public void showClassList() {
	System.out.println("İsim\t\tNumara");
	/*
	for(Student std:students) {
		System.out.println(std.getName()+"\t\t"+std.getNumber());
	}*/
	for(int i=0;i<studentCount;i++)
		System.out.println(students[i].getName()+"\t\t"+students[i].getNumber());
}

public void showWithTrans() {
	LinkedList<Student> list=new LinkedList<Student>();
	students=list.toArray(students);
	for(Student std:students) {
		if(std!=null)
		System.out.println(std.getName()+"\t\t"+std.getNumber());	
	}
}


}




