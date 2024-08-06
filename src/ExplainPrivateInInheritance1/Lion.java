package ExplainPrivateInInheritance1;

import ExplainPrivateInInheritance1.Animal;

public class Lion extends Animal {
    private void roar(){
        System.out.println("The "+getAge()+" year old lion says: roar"); //age wont work since it is private in parent class
    }
}
