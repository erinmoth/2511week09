package refactoring.solution5;
/*
 * Moving the getCharge method to the class Movie,
 * Encapsulate Field on the type code to ensure that all uses of the type code go through getting
 * and setting methods. Because most of the code came from other classes, most methods already
 * use the getting method. However, the constructors do access the price code 
 */
public class Movie {
	/*public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
*/
	private String title;
	//private int priceCode;
	private ChargeType type; 
	private PointsLevel points; 
	
	public Movie(String title) {
		this.title = title;
		type = new Regular();
		points = new Single();
		//setPriceCode(priceCode);
		
	}
	

	public String getTitle (){
		return title;
	}
	
	public void setChargeType(ChargeType type) {
		this.type =type; 
		setPointsLevel(type.changePoints()); 
	}
	public void setPointsLevel(PointsLevel points) {
		this.points = points; 
	}

	// Refactor method - refactor getCharge() to class Movie
	public double getCharge(int _daysRented) {
		return type.getCharge(_daysRented); 
	
	}
	
	
	int getFrequentRenterPoints(int _daysRented) {
		return points.getPoints(_daysRented); 
	}
	
}