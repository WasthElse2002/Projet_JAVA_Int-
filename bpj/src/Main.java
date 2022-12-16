package bpj.src;
public class Main {
	public static void main(String[] args) {
		createBurger();
	}

	public static void createBurger() {
		Burger myBigBurger = new Burger(Sauce.KETCHUP);

		System.out.println(myBigBurger.whatsInMyBurger());

		myBigBurger.addSteak();
		myBigBurger.addSalad(Salad.LETUCE);

		System.out.println(myBigBurger.whatsInMyBurger());
	}
}