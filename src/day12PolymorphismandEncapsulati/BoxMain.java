package day12PolymorphismandEncapsulati;

public class BoxMain {

	public static void main(String[] args) {


		//Box b = new Box();  //1

		//Box b = new Box(10.3,12.3, 12.4);//2

		Box b = new Box(10.3);//3

		System.out.println(b.volume());

	}

}
