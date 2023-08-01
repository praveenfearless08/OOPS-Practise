interface Food{    
  void eatable();
}

class Fruit implements Food{

    @Override
    public void eatable() {
          System.out.println("print");    
    }

}
public class interfaceClass {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.eatable();
    }
}
