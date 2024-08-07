package AbstractClasswithProtected15;

//protected abstract class Whale{ }
abstract class Whale{
    protected abstract void sing();
}

public class HumpbackWhale extends Whale{
    //private void sing(){System.out.println("Humpback whale is singing");}
    protected void sing(){System.out.println("Humpback whale is singing");}

}
//1>Abstract class cannot be proteced or private it can be only public
//2> abstract method can be protected but need to define as protected or public in child class