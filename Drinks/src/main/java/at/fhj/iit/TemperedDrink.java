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
    public TemperedDrink(String name, List<Liquid> liquids, float temperature)
    {
        super(name, liquids);
        //TODO:
    }

    /**
     * Returns the temperature of the drink
     *
     * @return the temperature of drink in °C
     */
    public float getTemperature() {
        //TODO:
        return 0f;
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