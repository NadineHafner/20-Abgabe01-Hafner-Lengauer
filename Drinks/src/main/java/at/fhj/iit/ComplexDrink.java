package at.fhj.iit;

import java.util.List;

public class ComplexDrink extends Drink
{
    protected List<Liquid> liquids;
    /**
     * Creates a Drink object with given name and liquids
     *
     * @param name name of the drink
     * @param liquids liquids in the drink
     */
    public ComplexDrink(String name, List<Liquid> liquids)
    {
        super(name);
        //TODO:
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        //TODO:
        return 0;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        //TODO:
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        //TODO:
        return false;
    }
}
