package ConstructorNUisance;

public class Gorilla extends Animal {
    public Gorilla(int age) //child constructor take one argument and call parent constructor which takes two argument
    {
//        super(age,"ConstructorNUisance.Gorilla");
    }
    public Gorilla(){
//        super(5);
    }
}
//if parent class explicitly defined any args constructor thn child class must create cons to get those args
//subclass may define no args constructor even if their parent classes do not
// be aware if no args cons is not there in parent class