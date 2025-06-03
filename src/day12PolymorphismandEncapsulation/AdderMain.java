package day12;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder ad = new Adder();
		
		ad.sum();  //1
		
		ad.sum(12, 12);//2
		
		ad.sum(12, 12.32);//3
		
		ad.sum(29.12, 12);//4
		
		ad.sum(12, 12, 24);//5
	}

}
