package designpattern.builder;

public class User {
	public static void main(String[] args) {

		Packing.Builder builder = new Packing.Builder("Food paking");
		Packing packing = builder.breakfast("Thosai").Lunch("Rice").Dinner("Thosai").build();
		System.out.println(packing);

//		PackingTelescopical packingTelescopical = new PackingTelescopical("Food Pak");
//		PackingTelescopical packingTelescopical2 = new PackingTelescopical("Roddy");
//		System.out.println(packingTelescopical2);
	}

}
