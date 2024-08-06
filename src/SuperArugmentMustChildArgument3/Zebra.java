package SuperArugmentMustChildArgument3;

public class Zebra extends Animal {

    //here parent class SuperArugmentMustChildArgument3.ConstructorNUisance.Animal is taking argument so child class SuperArugmentMustChildArgument3.Zebra will also take argument
    public Zebra(int age) {
        super(age);
    }
    public Zebra(){
        this(4);
    }
}
