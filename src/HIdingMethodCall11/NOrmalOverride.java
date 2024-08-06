package HIdingMethodCall11;

class Marsupial1{
    public boolean isBiped(){
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on two legs: "+ isBiped());
    }
}

class Kangaroo1 extends Marsupial1{
    public boolean isBiped(){
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangroo hops on two legs: "+isBiped());
    }
}

public class NOrmalOverride {
    public static void main(String[] args) {
        Kangaroo1 joey = new Kangaroo1();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}

//hidingMethod
//Marsupial walks on two legs: false
//Kangroo hops on two legs: true

//in normal override
//Marsupial walks on two legs: true
//Kangroo hops on two legs: true