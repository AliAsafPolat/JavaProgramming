package DersÖrneði;

public class Clothing extends Item{

	private int maxMonthLimit;
	private int minMonthLimit;
	
	public Clothing(String barcode,String description,int min,int max) {
		super(barcode,description);
		this.maxMonthLimit=max;
		this.minMonthLimit=min;
	}
	
	public boolean isSuitable(Child child) {
		if(child.getAgeinMonths()>this.minMonthLimit&&child.getAgeinMonths()<this.maxMonthLimit)
			return true;
		else 
			return false;
	}
}
