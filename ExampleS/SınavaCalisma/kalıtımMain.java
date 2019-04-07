package SýnavaCalisma;

public class kalýtýmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee []staff=new Employee[3];
	Manager boss=new Manager("Asaf Reis",5000);
	boss.setBonus(2000);
	staff[0]=boss;
	staff[1]=new Employee("Kagawa",2000);
	staff[2]=new Employee("Nagatomo",2001);
	
	for(Employee isci:staff) {
		System.out.println(isci.getName()+"  "+isci.getSalary());
	}
	
	//Employee kisi=new Person("kraþ");***HATALI***
	Person kisiler=new Employee("ali",55); //parent child ý tutabiliyor ama child parenti tutamýyor.
	//ama parent childýn methodlarýna eriþemiyor.
	}

}
