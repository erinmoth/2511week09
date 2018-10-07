package refactoring.solution5;

public class PublicHolidayDecorator extends ChargeDecorator {

   public PublicHolidayDecorator(ChargeType decoratedCharge) {
      super(decoratedCharge);		
   }

   @Override
   public double getCharge(int daysRented) {
      double newCharge = decoratedCharge.getCharge(daysRented);
      newCharge = newCharge * 1.1;
      return newCharge; 
   }


   @Override
   public PointsLevel changePoints() {
	return null;
   }
}