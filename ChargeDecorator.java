package refactoring.solution5;
public abstract class ChargeDecorator implements ChargeType {
   protected ChargeType decoratedCharge;

   public ChargeDecorator(ChargeType decoratedCharge){
      this.decoratedCharge = decoratedCharge;
   }

   public double getCharge(int daysRented) {
	   return decoratedCharge.getCharge(daysRented);
   }	
}