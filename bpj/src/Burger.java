package bpj.src;
public class Burger {
	public Sauce sauce;
	public boolean steak;
	public Salad salad;

	public boolean upperBread;
	public boolean lowerBread;

	/**
	 * Add a specific type of salad to your burger
	 * @param salad Type of salad
	 */
	public void addSalad(Salad salad) {
		this.salad = salad;
	}

	/**
	 * Removes the salad from your burger
	 */
	public void removeSalad() {
		this.salad = null;
	}

	/**
	 * Adds a delicious steak to your burger
	 */
	public void addSteak() {
		this.steak = true;
	}
	/**
	 * Removes the steak from your burger
	 */
	public void removeSteak() {
		this.steak = false;
	}

	public Burger(Sauce sauce) {
		this.sauce = sauce;
		this.salad = null;
	}

	/**
	 * Return a string with what compose your burger.
	 * @return String
	 */
	public String whatsInMyBurger() {
		return "Mon burger est composé " + (this.steak ? "d'un steak" : "") + (this.salad != null ? ", de salade " + this.salad.getType() : "");
	}
}
