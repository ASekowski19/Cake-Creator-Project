package prob1;

public class OrganicCake extends Cake {

	public OrganicCake(String cakeMix, String liquid, String oil, String eggs) {
		super(cakeMix);
	}
@Override
public String getCakeMix() {
	return "Organic Vanilla Cake Mix";
}
public String getLiquid() {
	return "1 ¼ cup milk ";
}

public String getOil() {
	return "1/2 cup canola oil ";
}

public String getEggs() {
	return "2 large eggs ";
	
}

public String getCakeMix() {
	return "2 tbs flour to the cake mix";

	}
public String bake() {
	return "350 degrees F for 30 minutes";
	}
}



