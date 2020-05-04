# 20-Abgabe01-Hafner-Lengauer
This is a project by Nadine Hafner and Johannes Lengauer

The purpose of this project is practicing with JavaDoc, Github and Junit5-testing.
An existing Java-Project, implemented by our lectors, named "Drinks" will be extended.
The project "Drinks" already contains:
- Drink.java
- Liquid.java
- LiquidTest.java
- SimpleDrinks.java (extends class Drink.java)
All classes already contain constructors, getters and setters and JavaDoc. Also already implemented: Tests using junit5.
******
Planned extensions:
 
1. ComplexDrink: extends class Drink takes a list of liquids
2. TemperateDrink: extends class CompexDrink and takes additional float for temperature
3. FashionedDrink: extends class ComplexDrink and takes additional enum-list with extras (drinking-straw etc.)
4. UnderAbsoluteZeroException: is thrown when temperature is lower than -273,15°C
5. BoilingException: is thrown when temperature is higher than 73,37°C
## Code Snippet

```
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
```