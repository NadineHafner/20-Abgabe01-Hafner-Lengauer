package at.fhj.iit;

import java.util.ArrayList;
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
     * @throws NoLiquidsException is thrown if list has no liquids in it
     */
    public FashionedDrink(String name, List<Liquid> liquids, List<Extra> extras) throws NoLiquidsException
    {
        super(name, liquids);
        this.extras=new ArrayList<>();
        this.extras=extras;
    }
    /**
     * Returns the extras of the drink
     *
     * @return the extras
     */
    public List<Extra> getExtras()
    {
        return extras;
    }
    /**
     * Returns the extras of the drink as string
     *
     * @return the extras as string
     */
    public String getExtrasToString()
    {
        String str="";
        for (int i=0; i<extras.size();i++){
            str+=extras.get(i).name();
            if(i<extras.size()-1){
                str+=", ";
            }
        }
        return str;
    }

}


