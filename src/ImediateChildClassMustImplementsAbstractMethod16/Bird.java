package ImediateChildClassMustImplementsAbstractMethod16;
abstract class Animal{
    public abstract String getName();
}
//class Bird extends Animal{ } immediate non abstract class must implement abstract class

public class Bird extends Animal {

    @Override
    public String getName() {
        return "Falmingo";
    }
}
//if abstract class not having any abstract method than child class works fine since no method need to implement