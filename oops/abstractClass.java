abstract class car{
    int price;
     int color;

     car(int price, int color){
         this.price = price;
         this.color = color;
     }
    public car() {
    }
    public void startEngine(){
         System.out.println("Engine started");
    }
    
}
class vehicle extends car{

    vehicle() {
        super();
    }
    
}

public class abstractClass {
    public static void main(String[] args) {
        vehicle vehicle = new vehicle();
        vehicle.startEngine();
     }
}
