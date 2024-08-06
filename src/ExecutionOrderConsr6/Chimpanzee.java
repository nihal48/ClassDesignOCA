package ExecutionOrderConsr6;

class Primate{
    public Primate()
    {
        System.out.println("primate");
    }
}

class Ape extends Primate{
    public Ape()
    {
        System.out.println("ExecutionOrderConsr6.Ape");
    }
}


public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
    }
}
//primate
//ExecutionOrderConsr6.Ape        because the parent constructor is always executed before the child cnstructor.