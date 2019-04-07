package DersÖrneði;

public class Toy extends Item{


private int minAgeLimit;


public Toy(String barcode, String description,int min) {
	super(barcode,description);
	this.minAgeLimit=min;
	}


public boolean isSuitable(Child child) {
	if(child.getAgeinMonths()/12<minAgeLimit) 
		return false;
		else
			return true;
		
	}
}


	

