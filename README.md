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