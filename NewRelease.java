package refactoring.solution5;

public class NewRelease implements ChargeType{
	
	@Override
	public double getCharge(int _daysRented) {
		return _daysRented * 5;
	}
	public PointsLevel changePoints() {
		return new Double(); 
	}
	
}