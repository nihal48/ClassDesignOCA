package InhertingFinalMethod12;

class Bird{
    public final boolean hasFeathers()
    {
        return true;
    }
}


public class Penguin extends Bird{
//    public final boolean hasFeathers(){return false;}        final method cannot be overriden

}
