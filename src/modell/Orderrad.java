package modell;


public class Orderrad {
private int antal;
private Order order;
private double pris;
public double getPris() {
	return pris;
}

public void setPris(double pris) {
	this.pris = pris;
}
private Produkt produkt;


public int getAntal() {
	return antal;
}
	
public void setAntal(int antal) {
	this.antal = antal;
}

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}

public Produkt getProdukt() {
	return produkt;
}

public void setProdukt(Produkt produkt) {
	this.produkt = produkt;
}
public double kalktotpris(){
		return produkt.getPris()*antal;
}

}
