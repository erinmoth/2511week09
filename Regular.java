package refactoring.solution5;

public class Regular implements ChargeType{
	
	@Override
	public double getCharge(int daysRented) {
		double thisAmount = 3;
		if (daysRented > 3)
			thisAmount += (daysRented - 2) * 1;
		return thisAmount; 
	}
	
	public PointsLevel changePoints() {
		return new Single(); 
	}
	
}