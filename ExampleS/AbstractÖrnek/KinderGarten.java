package DersÖrneği;

import java.util.ArrayList;

public class KinderGarten {
private ArrayList<Child> cocuklar=new ArrayList<Child>();


public boolean addChild(Child c) {
	cocuklar.add(c);
	return true;
}

public Child findOldestChild() {
	Child ret=null;
	int max=-1;
	for(Child c:cocuklar) {
		if(c.getAgeinMonths()>max) {
			max=c.getAgeinMonths();
			ret=c;
		}
	}
	return ret;
}
}
