package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


@DisplayName("Testing ComplexDrink implementation")
public class ComplexDrinkTest
{
    private Liquid gin, tonicWater, stroh80, milk;
    private String exceptionMessage;
    private ArrayList<Liquid> liquids;
    private ComplexDrink complexDrink;

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
    @DisplayName("Testing NoLiquidsException")
    public void testNoLiquidsException()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            complexDrink = new ComplexDrink("NoLiquidsDrink",liquids);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals("The drink has no liquids!",exceptionMessage);
    }

    @Test
    @DisplayName("Test Constructor")
    public void testConstructor()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(gin);
            liquids.add(tonicWater);
            complexDrink = new ComplexDrink("GinTonic",liquids);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals(null, exceptionMessage);
    }

    @Test
    @DisplayName("Testing volume getter")
    public void testVolumeGetter()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(stroh80);
            liquids.add(gin);
            liquids.add(tonicWater);
            complexDrink = new ComplexDrink("Mixture",liquids);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals(0.3d,complexDrink.getVolume(),0.001);
    }

    @Test
    @DisplayName("Testing alcoholPercent getter")
    public void testAlcoholPercentGetter()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(stroh80);
            liquids.add(gin);
            liquids.add(gin);
            liquids.add(tonicWater);
            liquids.add(milk);
            complexDrink = new ComplexDrink("Mixture",liquids);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals(4.7619d,complexDrink.getAlcoholPercent(),0.001);
    }

    @Test
    @DisplayName("Testing isAlcoholic function")
    public void testIsAlcoholic()
    {
        exceptionMessage = null;
        try
        {
            liquids = new ArrayList<Liquid>();
            liquids.add(milk);
            complexDrink = new ComplexDrink("Mixture",liquids);
        }
        catch(Exception ex)
        {
            exceptionMessage = ex.getMessage();
        }
        assertEquals(false,complexDrink.isAlcoholic());
    }
}
