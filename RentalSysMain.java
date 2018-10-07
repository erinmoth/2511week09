package refactoring.solution5;
class RentalSysMain {
	public static void main(String[] args){
		//adding some movies
		Movie a = new Movie("Generic Movie");
		Movie m = new Movie("101 Dalmations");
		m.setChargeType(new Childrens()); 
		Movie n = new Movie("Gone With The Wind");
		n.setChargeType(new Classic());
		//create some customers
		Customer me = new Customer("Erin");
		Customer notme = new Customer("Lothario");
		me.addRental(new Rental(a, 7));
		me.addRental(new Rental(n, 7));
		notme.addRental(new Rental(m, 4));
		
		System.out.println(me.statement());
		System.out.println(notme.statement());
		System.out.println("Exciting new deal: triple points for Children!\n");
		m.setPointsLevel(new Triple());
		System.out.println(notme.statement()); 
	}
}

