package refactoring.solution5;

public class Childrens implements ChargeType{
	
	@Override
	public double getCharge(int _daysRented) {
		double thisAmount = 1.5;
		if (_daysRented > 3)
			thisAmount += (_daysRented - 3) * 1.5;
		return thisAmount;
	}
	public PointsLevel changePoints() {
		return new Single(); 
	}
	
}