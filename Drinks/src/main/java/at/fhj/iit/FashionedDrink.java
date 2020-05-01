package at.fhj.iit;

import java.util.List;

enum Extra {DrinkingStraw, IceCube, Lemon, Umbrella}

public class FashionedDrink extends ComplexDrink
{

    private List<Extra> extras;

    /**
     * Creates a Drink object with given name, liquids and extras
     *
     * @param name    name of the drink
     * @param liquids liquids in the drink
     * @param extras extras in the drink
     */
    public FashionedDrink(String name, List<Liquid> liquids, Extra extras) {
        super(name, liquids);
        //TODO:
    }

    /**
     * Returns the extras of the drink
     *
     * @return the extras
     */
    public List<Extra> getExtras() {
        //TODO:
        return null;
    }
}

