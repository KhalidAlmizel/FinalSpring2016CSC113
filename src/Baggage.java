
public class Baggage {
private int id;
private double weight;
public Baggage (int id, double weight) {
	this.id=id;
	this.weight=weight;
}
public Baggage (Baggage b) {
	this.id=b.id;
	this.weight=b.weight;
}
public double getWeight() {
	return weight;
}
}
