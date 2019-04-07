package DersÖrneği2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student std =new Student("1506","Asaf");
		Student std1=new Student("3214","Asya");
		Student std2=new Student("6547","Asım");
		Student std3=new Student("8845","Aslı");
		Student std4=new Student("7847","Asma");
		Student std5=new Student("6117","Asya");
		
		
		Course crs=new Course("BLM101","Bilgisayar Bilimleri",5);
		
		crs.addStudent(std);
		crs.addStudent(std2);
		crs.addStudent(std1);
		crs.addStudent(std5);
		crs.addStudent(std4);
		crs.addStudent(std3);
		crs.showClassList();
		
		crs.increaseCapacity(6);
		crs.addStudent(std3);
		
		System.out.println("-----------------------------------------");
		//System.out.println(crs.getStudentCount());
	    //crs.showClassList();
		crs.showWithTrans();
	}

}
