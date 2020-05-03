package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class ComplexDrink extends Drink
{
    protected List<Liquid> liquids;
    /**
     * Creates a Drink object with given name and liquids
     *
     * @param name name of the drink
     * @param liquids liquids in the drink
     * @throws NoLiquidsException is thrown if list has no liquids in it
     */
    public ComplexDrink(String name, List<Liquid> liquids) throws NoLiquidsException
    {
        super(name);
        this.liquids=new ArrayList<Liquid>();
        this.liquids=liquids;
        if(liquids.size() <= 0)
        {
            throw new NoLiquidsException("The drink has no liquids!");
        }
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {

        double wholeVolume=0;
        for(Liquid l: liquids){
            wholeVolume+=l.getVolume();
        }
        return wholeVolume;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent()
    {
        double wholeAlcoholPercent=0;
        double wholeVolume=getVolume();
        for(Liquid l: liquids)
        {
            wholeAlcoholPercent+=l.getAlcoholPercent()*(l.getVolume()/wholeVolume);
        }
        return wholeAlcoholPercent;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {

        return getAlcoholPercent()!=0;
    }
}

/**
 * Throws an exception if the drink has no liquids
 */
class NoLiquidsException extends Exception
{
    public NoLiquidsException(String message)
    {
        super(message);
    }
}