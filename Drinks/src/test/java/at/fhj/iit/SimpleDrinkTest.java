package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * testing SimpleDrink implementation
 */
@DisplayName("Testing FashionedDrink implementation")
public class SimpleDrinkTest
{
    private SimpleDrink alcoholicSimpleDrink;
    private SimpleDrink antiAlcoholicSimpleDrink;

    /**
     * inits liquids for the tests
     */
    @BeforeEach
    void setup()
    {
        alcoholicSimpleDrink=new SimpleDrink("Gin",new Liquid("Gin",0.3d,40d));
        antiAlcoholicSimpleDrink=new SimpleDrink("Milk",new Liquid("Milk",0.1d,0d));
    }

    /**
     * testing getVolume
     * compared outputs of previously created SimpleDrinks
     */
    @Test
    @DisplayName("Testing getVolume")
    public void testGetVolume()
    {
        assertEquals(0.3d,alcoholicSimpleDrink.getVolume(),0.001);
    }

    /**
     * testing getAlcoholPercent
     * compared outputs of previously created SimpleDrinks
     */
    @Test
    @DisplayName("Testing getAlcoholPercent")
    public void testGetAlcoholPercent()
    {
        assertEquals(40d,alcoholicSimpleDrink.getAlcoholPercent(),0.001);
    }

    /**
     * Testing isAlcoholic
     * compared outputs of previously created SimpleDrinks
     */
    @Test
    @DisplayName("Testing isAlcoholic")
    public void testIsAlcoholic()
    {
        assertEquals(false, antiAlcoholicSimpleDrink.isAlcoholic());
        assertEquals(true, alcoholicSimpleDrink.isAlcoholic());
    }
}
