package DersÖrneði;

public abstract class Item {
private String barcode;
private String description;

public Item(String barcode,String description){
	this.barcode=barcode;
	this.description=description;
}


public String getBarcode() {
	return this.barcode;
}

public String getDescription() {
	return this.description;
}

public abstract boolean isSuitable(Child child);
	
}
