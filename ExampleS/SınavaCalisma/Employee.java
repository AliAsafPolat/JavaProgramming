package SýnavaCalisma;

public class Employee extends Person{
private int salary;

public Employee(String name,int salary) {
	super(name);
	this.salary=salary;
}
public int getSalary() {
	return this.salary;
}
/*public String getName() {
	return super.getName();
}*/
public void setSalary(int yeni) {
	this.salary=yeni;
}


}
