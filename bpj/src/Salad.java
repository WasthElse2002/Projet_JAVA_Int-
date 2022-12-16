package bpj.src;
public enum Salad {
	LETUCE("Laitue"),
	BATAVIA("Batavia"),
	SCAROL("Scarol"),
	ARAGULA("Roquette");

	private final String type;

	public String getType()
	{
		return this.type;
	}

	Salad(String type)
	{
		this.type = type;
	}
}
