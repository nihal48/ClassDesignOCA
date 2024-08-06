package ConstructorNUisance;

public class Zoo {
    public Zoo(){
        super();
        System.out.println("ConstructorNUisance.Zoo created");
//        super(); Call to 'super()' must be first statement in constructor body
    }
}
