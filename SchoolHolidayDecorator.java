package refactoring.solution5;

public class SchoolHolidayDecorator extends ChargeDecorator {

   public SchoolHolidayDecorator(ChargeType decoratedCharge) {
      super(decoratedCharge);		
   }

   @Override
   public double getCharge(int daysRented) {
      double newCharge = decoratedCharge.getCharge(daysRented);
      newCharge = newCharge * 0.75;
      return newCharge; 
   }


   @Override
   public PointsLevel changePoints() {
	return null;
   }
}