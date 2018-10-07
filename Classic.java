package refactoring.solution5;

public class Classic implements ChargeType{
	
	@Override
	public double getCharge(int daysRented) {
		double thisAmount = 2.5; //assumed this is the base charge for renting?
		//otherwise start at 0
		if (daysRented > 5)
			thisAmount += (daysRented - 5) * (1/2);
		return thisAmount;
	}
	public PointsLevel changePoints() {
		return new Triple(); 
	}
	
}