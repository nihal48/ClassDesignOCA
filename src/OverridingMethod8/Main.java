package OverridingMethod8;

class Canine{
    public double getAverageWeight(){
        return 50;
    }
    protected Number getA(){
        return 10.00;
    }
}

class Wolf extends Canine{
    public double getAverageWeight(){
        return super.getAverageWeight()+20;
        //return getAverageWeight()+20;   starts recursion infinte loop
    }
    public Integer getA(){
        return 5;

    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());


    }
}

//rule for overriding
//1> the method in yhe child class must have the same signature(the name and list of input args) as the method in the parent class
//2>the method in the child must be at least as accessible or more accessible than the method in the parent class.
//(i.e parent class-> protected child class-> protected or public)
//3> the method in the child class may not throw a checked exception that is new or broader than the class of any
// exception thrown in the parent class method(i.e parent-> IOException child-> IOException or FileNotFoundException)
//4> If method returned a value, it must be the same or a subclass of the parent class, known as covarient type
//(i.e parent-> number child->NUmber, or Integer, parent->Object child-> Object or anything(every class extends object)