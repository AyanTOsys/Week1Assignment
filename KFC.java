package company;

import trading.Shirt;
import trading.Toys;
import trading.Vehicle;

public class KFC extends Restaurant{

	@Override
	public void produceFood() {
		System.out.println("Food is ready at KFC..");
		
	}

	@Override
	public void produceGasBill() {
		System.out.println("Gas bill produced at KFC..");
		
	}

	@Override
	void showReportcard() {
		System.out.println("Profit report card of KFC..");
		
	}
	Branch brObj = new Branch();
	Airconditioner acObj =new Airconditioner();
	Feedback fbObj = new Feedback();
	@Override
	public void doTrading(Toys t, Shirt s, Vehicle v) {
		System.out.println("We do trading in toys, shirts and vehicles also");
		
	}

}
