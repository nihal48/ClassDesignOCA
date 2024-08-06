package HIiddenMethodAKAStaticMethodOverriding10;

class Bear{
    protected static void eat(){
        System.out.println("Bear is eating");
    }
}
class Panda extends Bear{
    public static void eat(){
        System.out.println("panda bear is chewing");
    }
}

public class Main {
    public static void main(String[] args) {
        Panda.eat();
        Bear.eat();
    }
}
//four rule of overriding is applied here also along with one more rule
//the method defined in the child classs must be marked as static if it is marked as static it the parent class
//(method hiding).Likewise, the method must not be marked as static in the child class if it is not marked as
// static in the child class if it is not marked as static in the parent class(method overriding).and vice-versa