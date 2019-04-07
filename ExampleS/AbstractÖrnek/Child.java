package DersÖrneði;

public class Child {
private String name;
private int ageinMonths;


public Child(String name, int ageinMonths) {
	this.name = name;
	this.ageinMonths = ageinMonths;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAgeinMonths() {
	return ageinMonths;
}
public void setAgeinMonths(int ageinMonths) {
	this.ageinMonths = ageinMonths;
}
public String toString() {
	return "Ýsim : "+this.name+" Yaþ : "+this.ageinMonths/12;
}

	
}
