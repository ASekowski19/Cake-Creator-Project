package prob1;

public class HighAltitudeClassicYellowCake extends ClassicYellowCake {

	public HighAltitudeClassicYellowCake(String cakeMix, String liquid, String oil, String eggs) {
		super(cakeMix, liquid, oil, eggs);
	}

public String getCakeMix() {
	return "Duncan Hines Classic Yellow Cake Mix + 2 tbs flour";
}
public String getLiquid() {
	return "1 cup tap water";
}

public String getOil() {
	return "1/3 cup vegetable oil";
}

public String getEggs() {
	return "3 large eggs";
	
}

public String bake() {
	return "375 degrees F for 26 minutes";
	}
}
