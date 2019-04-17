package InnerClasses;

public class Kişi {
private String name;

public Kişi(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public class Çalışan{
	private int salary;
	public Çalışan(int maas) {
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
