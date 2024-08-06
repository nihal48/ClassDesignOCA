package CallingInheritedClassMember7;

class Fish{
    protected int size;
    private int age;

    public Fish(int age)
    {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}


public class Shark extends Fish{

    private int numberOfFins =8;
    public Shark(int age)
    {
        super(age);
        this.size = 4;
    }
    public void displaySharkDetials()
    {
        System.out.println("shark with age: "+ getAge());// this.getAge() or super.getAge();
        System.out.println("and "+ size+ " meters long"); //this.size or super.size;
        System.out.println("with "+numberOfFins+" fins");// this.numberOfFins
    }
}

//concept: this and super may both be used for methods or variables defined in parent class but only
// this may be used for members defined in the current class

//super() for calling constructor and super for refering a member in parent class

