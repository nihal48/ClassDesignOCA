package HIdingMethodCall11;

class Marsupial{
    public static boolean isBiped(){
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on two legs: "+ isBiped());
    }
}

class Kangaroo extends Marsupial{
    public static boolean isBiped(){
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangroo hops on two legs: "+isBiped());
    }
}


public class HideMain {
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
