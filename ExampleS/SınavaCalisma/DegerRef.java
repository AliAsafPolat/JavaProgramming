package SınavaCalisma;

public class DegerRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DegerRef deneme=new DegerRef();
		int count=5;
		ilkelDuzenle(count);
		System.out.println(count); 	//Fonksiyonun içinde artırdı geri döndürmedi.
		Integer a=new Integer(5);
		Integer b=17;
		sarmalayıcıDuzenle(a);	
		System.out.println("After :" +a);
		sarmalayıcıDegistirAlt(a,b);
		System.out.println(a);
	}

	public static void ilkelDuzenle(int a) {
		a++;
	}
	public static void sarmalayıcıDuzenle(Integer a) {
		a++;
	}
	public void ilkelDegistir(int a,int b) {
		int tmp=a; a=b; b=tmp;
	}
	public void sarmalayıcıDegistir(Integer a,Integer b) {
		Integer tmp=a; a=b; b=tmp;
	}
	public static void sarmalayıcıDegistirAlt(Integer a,Integer b) {
		Integer tmp=new Integer(a);
		a=new Integer(b);
		b= new Integer(tmp);
	}
	public static void bakDegiscek(Integer x) {
		int a=x.intValue();
		a++;
	
	}
}
