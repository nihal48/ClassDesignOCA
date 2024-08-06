package PrivateMethodRedeclaring9;

class Camel{
    private String getNumberOfHumps(){
        return "undefined";
    }
}
public class BacteriaCamel extends Camel {
    private int getNumberOfHumps()
    {
        return 2;
    }
}
//Both method is independent of each other since it is private in parent class so not visible in child class