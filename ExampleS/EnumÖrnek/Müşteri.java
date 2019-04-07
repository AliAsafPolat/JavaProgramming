package Enum;

public class Müþteri {
private String ad;
private Tarif tarife;

public Müþteri(String ad,Tarif tarife) {
	this.ad=ad;
	this.tarife=tarife;
}

public String toString() {
	return "Ad : "+this.ad+"\tTarife : "+this.tarife;
}

public String getAd() {
	return ad;
}

public void setAd(String ad) {
	this.ad = ad;
}

public Tarif getTarife() {
	return tarife;
}

public void setTarife(Tarif tarife) {
	this.tarife = tarife;
}


}
