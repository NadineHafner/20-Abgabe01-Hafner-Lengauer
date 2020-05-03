package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * testing FashionedDrink implementation
 */

@DisplayName("Testing FashionedDrink implementation")
public class FashionedDrinkTest
{
    private Liquid gin, tonicWater, stroh80, milk;
    private String exceptionMessage;
    private ArrayList<Liquid> liquids;
    private FashionedDrink fashionedDrink;
    private  ArrayList<Extra>extras;

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
     * testing constructor
     * assigned variables extras and liquids for the constructor and then checked if no exception was thrown
     */

    @Test
    @DisplayName("Testing Constuctor")
    public void testConstructor()
    {
        exceptionMessage = null;

        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(milk);
            extras= new ArrayList<Extra>();
            extras.add(Extra.Lemon);
            fashionedDrink = new FashionedDrink("Milk",liquids,extras);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals(null,exceptionMessage);
    }

    /**
     * testing getExtras
     * assigned variables extras and liquids for the constructor and then compared the output
     */
    @Test
    @DisplayName("Testing getExtras")
    public void testGetExtras()
{
    exceptionMessage = null;

    try
    {
        liquids = new ArrayList<Liquid>();
        liquids.add(tonicWater);
        extras= new ArrayList<Extra>();
        extras.add(Extra.Lemon);
        extras.add(Extra.DrinkingStraw);
        extras.add(Extra.IceCube);
        fashionedDrink = new FashionedDrink("Milk",liquids,extras);
    }
    catch(Exception ex)
    {
        exceptionMessage = ex.getMessage();
    }
    assertEquals(extras, fashionedDrink.getExtras());
}
    /**
     * testing getExtras
     * assigned variables extras and liquids for the constructor and then compared the output
     */
    @Test
    @DisplayName("Testing getExtrasToString")
    public void testGetExtrasToString()
    {
        exceptionMessage = null;

        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(tonicWater);
            extras= new ArrayList<Extra>();
            extras.add(Extra.Lemon);
            extras.add(Extra.DrinkingStraw);
            extras.add(Extra.IceCube);
            fashionedDrink = new FashionedDrink("Milk",liquids,extras);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals("Lemon, DrinkingStraw, IceCube", fashionedDrink.getExtrasToString());
    }





}
