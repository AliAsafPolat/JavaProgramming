package SýnavaCalisma;

public class Manager extends Employee {
private int bonus;
public Manager(String name,int maas) {
	super(name,maas);
	this.bonus=0;
}

public void setBonus(int bonus) {
	this.bonus=bonus;
}
public int getSalary() {
	return super.getSalary()+this.bonus;
}

}
