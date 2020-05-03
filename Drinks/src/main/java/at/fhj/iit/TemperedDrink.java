package at.fhj.iit;

import java.util.List;

public class TemperedDrink extends ComplexDrink
{
    private float temperature;
    /**
     * Creates a Drink object with given name, liquids and temperature
     *
     * @param name    name of the drink
     * @param liquids liquids in the drink
     * @param temperature temperature of the drink
     */
    public TemperedDrink(String name, List<Liquid> liquids, float temperature)  throws UnderAbsoluteZeroException, BoilingException, NoLiquidsExeption
    {
        super(name, liquids);
        if(temperature < -273.15f)
        {
            throw new UnderAbsoluteZeroException("The temperature of the drink is under the absolute zero and therefor impossible!");
        }
        else if(temperature >= 78.37f && getAlcoholPercent() > 0f)
        {
            throw new BoilingException("The temperature of the drink is higher than the boiling temperature of the alcohol!");
        }
        else if(temperature >= 100f)
        {
            throw new BoilingException("The temperature of the drink is higher than the boiling temperature of water, which is the majority of the drink!");
        }
        this.temperature = temperature;
    }

    /**
     * Returns the temperature of the drink
     *
     * @return the temperature of drink in °C
     */
    public float getTemperature()
    {
        return temperature;
    }
}

/**
 * Throws an exception if the temperature of the drink is under the absolute Zero
 */
class UnderAbsoluteZeroException extends Exception
{
    public UnderAbsoluteZeroException(String message)
    {
        super(message);
    }
}

/**
 * Throws an exception if the temperature of the drink is higher then the boiling temperature of alcohol
 */
class BoilingException extends Exception
{
    public BoilingException(String message)
    {
        super(message);
    }
}