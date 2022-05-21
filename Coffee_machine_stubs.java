package myfirstproject;
public class Coffee_machine_stubs {
    public float price = 200.5F;
    int Amount =400;

    public Boolean check(int amount,int coffeeAmount){
        if (amount <= price && coffeeAmount>0 && Amount>coffeeAmount)
            return  true;
        else
            return false;
    }
}


