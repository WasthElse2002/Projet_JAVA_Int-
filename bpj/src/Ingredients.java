package bpj.src;
public enum Ingredients {

    MASCARPONE("Mascarpone"),
    OEUF("Oeuf"),
    CAFE("Cafe"),
    SUCRE("Sucre"),
    AMARETTO("Amaretto"),
    BISCUITS("Biscuits"),
    POUDRE_CACAO("Poudre_cacao");

    private final String type;

    public String getType()
    {
        return this.type;
    }

    Ingredients(String type)
    {
        this.type = type;
    }
}
