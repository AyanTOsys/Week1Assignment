package company;

import trading.Shirt;
import trading.Toys;
import trading.TwoWheeler;

public class CompanyMain {

	public static void main(String[] args) {
		KFC kfcObj= new KFC();
		kfcObj.produceFood();
		kfcObj.produceGasBill();
		kfcObj.showReportcard();
		
		Toys tObj = new Toys();
		Shirt sObj = new Shirt();
		TwoWheeler twObj =new TwoWheeler();
		
		kfcObj.doTrading(tObj, sObj, twObj);
	}

}
