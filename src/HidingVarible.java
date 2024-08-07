import java.sql.SQLOutput;

class Rodent{
    protected int tailLength = 4;
    public void getRodentDetails(){
        System.out.println("[ParentTail ="+tailLength+"]");
    }
}
class Mouse extends Rodent{
    protected  int tailLength = 8;
    public void getMouseDetails(){
        System.out.println("[tail= "+tailLength +", parentTail= "+super.tailLength+"]");
    }
}

public class HidingVarible {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getMouseDetails();
        mouse.getRodentDetails();
    }
}

//if one is refrencing a variable from within parent class the variable defined in the parent class is used.
//if one is refrencing a variable from whithin a child class the variable defined in child class is used.
//still we can refer to parent variable by using super keyword.