public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());

		// 3 Bebidas nuevas con los 2 nuevos condimentos y 2 nuevas bebidas
		// Se agregaron las bebidas HotChocolate y ColdBrew
		// Se agregaron los condimentos Ice y Honey

		// 3 nuevas bebidas con 3 o más condimentos
		Beverage beverage4 = new HotChocolate();
		beverage4 = new Whip(beverage4);
		beverage4 = new Honey(beverage4);
		beverage4 = new Soy(beverage4);
		System.out.println(beverage4.getDescription() 
				+ " $" + beverage4.cost());

		Beverage beverage5 = new ColdBrew();
		beverage5 = new Ice(beverage5);
		beverage5 = new Honey(beverage5);
		beverage5 = new Mocha(beverage5);
		System.out.println(beverage5.getDescription() 
				+ " $" + beverage5.cost());

		Beverage beverage6 = new ColdBrew();
		beverage6 = new Ice(beverage6);
		beverage6 = new Whip(beverage6);
		beverage6 = new Mocha(beverage6);
		System.out.println(beverage6.getDescription() 
				+ " $" + beverage6.cost());
	}
}
