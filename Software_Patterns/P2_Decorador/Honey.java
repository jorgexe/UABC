// Nuevo condimento Honey
public class Honey extends CondimentDecorator{
    public Honey(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Honey";
	}

	public double cost() {
		return .50 + beverage.cost();
	}
}
