package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


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
