package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * testing TemperedDrink implementation
 */
@DisplayName("Testing TemperedDrink implementation")
public class TemperedDrinkTest
{
    private Liquid gin, tonicWater, stroh80, milk;
    private String exceptionMessage;
    private ArrayList<Liquid> liquids;
    private TemperedDrink temperedDrink;

    /**
     * inits liquids for the tests
     */
    @BeforeEach
    void setup()
    {
        gin = new Liquid("Gin",0.04d,40);
        tonicWater = new Liquid("TonicWater",0.25d,0);
        stroh80 = new Liquid("Stroh80",0.01d,80);
        milk = new Liquid("Milch",0.5d,0);
    }

    /**
     * testing AbsoluteZeroException
     * creating temperedDrink with temperature under absolute zero and checking if Exception is thrown
     */
    @Test
    @DisplayName("Testing AbsolutZeroException")
    public void testAbsoluteZeroException()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(milk);
            temperedDrink = new TemperedDrink("Milk",liquids,-350);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals("The temperature of the drink is under the absolute zero and therefor impossible!",exceptionMessage);
    }

    /**
     * testing BoilingException
     * creating temperedDrink with temperature at boiling temperature of alcohol and checking if Exception is thrown
     */
    @Test
    @DisplayName("Testing BoilingException Alcoholic")
    public void testBoilingExceptionAlcoholic()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(tonicWater);
            liquids.add(gin);
            temperedDrink = new TemperedDrink("GinTonic",liquids,90);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals("The temperature of the drink is higher than the boiling temperature of the alcohol!", exceptionMessage);
    }

    /**
     * testing BoilingException
     * creating non- alcoholic temperedDrink with temperature at boiling temperature of alcohol and checking if Exception is thrown
     */
    @Test
    @DisplayName("Test BoilingException NonAlcoholic")
    public void testBoilingExceptionNonAlcoholic()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(tonicWater);
            temperedDrink = new TemperedDrink("Milk",liquids,120);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals("The temperature of the drink is higher than the boiling temperature of water, which is the majority of the drink!",exceptionMessage);
    }

    /**
     * testing constructor
     * assigned variables extras and liquids for the constructor and then checked if no exception was thrown
     */
    @Test
    @DisplayName("Test Constructor")
    public void testConstructor()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(stroh80);
            liquids.add(milk);
            temperedDrink = new TemperedDrink("88er-Milk",liquids,5);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals(null, exceptionMessage);
    }

    /**
     * testing getTemperature
     * assigned variables liquids for the constructor and then checked if temperature is the same
     */
    @Test
    @DisplayName("Testing temperature getter")
    public void testTemperatureGetter()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(stroh80);
            temperedDrink = new TemperedDrink("Stroh88",liquids,12);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals(12,temperedDrink.getTemperature(),0.001);
    }
}
