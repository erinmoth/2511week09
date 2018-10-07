package refactoring.solution5;

public class Double implements PointsLevel{
	@Override
	public int getPoints(int _daysRented){
		if(_daysRented>2) {
			return 2;
		}else
		return 1; 
	}
}