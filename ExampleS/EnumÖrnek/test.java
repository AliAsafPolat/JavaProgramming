package Enum;

public class test {
    
	public enum Size{
		SMALL,LARGE,XLARGE;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Size.LARGE);
		Tarif trf=Tarif.AVANTAJLIPAKET;
	Müþteri mþt=new Müþteri("Asaf",Tarif.BOLPAKET);
	Müþteri mþt1=new Müþteri("Asým",trf);
	
	System.out.println("Tarifelerimiz : ");
	for(Tarif trf1:Tarif.values()) {
		System.out.println(trf1.toString());
	}
	
	System.out.println(mþt.toString());
	System.out.println(mþt1.toString());
	
	
	System.out.println("Tarife Adý : "+mþt.getTarife()+"\tTarife Ücreti : "+mþt.getTarife().getÜcret());
	
	}

}
