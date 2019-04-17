package FileIO;

public class Person implements java.io.Serializable{		//Bunu yapmam gerekiyor.
	private static final long serialVersionUID=1L;
private String name;
private String tc;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTc() {
	return tc;
}
public void setTc(String tc) {
	this.tc = tc;
}
public Person(String name, String tc) {
	this.name = name;
	this.tc = tc;
}

}
