import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,CarData> carcar = new HashMap<>();
        carcar.put(new Car(1,"A345R"),new CarData(2005,"Toyota","$10.000","Black"));
        carcar.put(new Car(2,"W333O"),new CarData(2000,"Honda","$5.000","White"));
        carcar.put(new Car(3,"M666U"),new CarData(2022,"Nisan","$7.000","Pink"));
        carcar.put(new Car(4,"B777S"),new CarData(2013,"Jip","$13.000","Yellow"));
        carcar.put(new Car(5,"A1111T"),new CarData(2007,"Kia","$12.000","Green"));

        System.out.println(carcar.entrySet());

    }
}