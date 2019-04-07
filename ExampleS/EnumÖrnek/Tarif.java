package Enum;

public enum Tarif {
AVANTAJLIPAKET(500,100,10,40),BOLPAKET(1000,150,16,55),KONUŞMAPAKETİ(500,500,10,50);
	private int konusma,sms,internet,ücret;
	private Tarif(int konus,int sms,int internet,int ücret) {
		this.internet=internet;
		this.konusma=konus;
		this.sms=sms;
		this.ücret=ücret;
	}
	
	public int getİnternet() {
		return this.internet;
	}

	public int getSms() {
		return this.sms;
	}
	
	public int getKonusma() {
		return this.konusma;
	}
	
	public int getÜcret() {
		return this.ücret;
	}
	
	
}
