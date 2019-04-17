package InnerClasses;

public class Kiþi {
private String name;

public Kiþi(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public class Çalýþan{
	private int salary;
	public Çalýþan(int maas) {
		this.salary=maas;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return name+" "+salary;
	}
}

}
