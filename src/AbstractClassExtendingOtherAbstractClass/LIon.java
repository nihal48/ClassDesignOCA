package AbstractClassExtendingOtherAbstractClass;

abstract class Animal{
    public abstract String getName();
}
abstract class BigCat extends Animal{
    public abstract void roar();
}

public class LIon extends BigCat{
    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public void roar() {
        System.out.println("the lion lets out a loud Roar!");
    }
}
//if abstract class is extended by an abstract class the child abstract class can implement parent abstract
//method or can leave it but then immediate child non abstract must define it