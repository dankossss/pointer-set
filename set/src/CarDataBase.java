import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class CarDataBase {

    LinkedHashSet<Car> carList = new LinkedHashSet<>();

    public void setCarList(){
        carList.add(new Car("Skoda","red", "ліфтбек", 14));
        carList.add(new Car("Volkswagen","green", "седан", 15));
        carList.add(new Car("Mazda","black", "універсал", 16 ));
        carList.add(new Car("Honda","blue", "хечбек", 17));
        carList.add(new Car("Audi","white", "купе", 18));
    }

    public LinkedHashSet<Car> changeWheelsType(String bodyType, int wheelsDiameter, String wheelsType){
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            Car car = carIterator.next();
            if (car.body.getBodyType().equals(bodyType) && car.wheels.getDiameter() == wheelsDiameter){
                car.wheels.setType(wheelsType);
            }
        }
        return carList;
    }

    public LinkedHashSet<Car> removeByDiameter(int minDiameter, int maxDiameter){
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            Car car = carIterator.next();
            if (car.wheels.getDiameter() >= minDiameter && car.wheels.getDiameter() <= maxDiameter){
                carIterator.remove();
            }
        }
        return carList;
    }

    public LinkedHashSet<Car> findByWheelType(String wheelType, int minDiameter, int maxDiameter){
        System.out.println("Введіть тип шин, мінімальний і максимальний розмір дисків");
        LinkedHashSet<Car> carByWheelType = new LinkedHashSet<>();
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            Car car = carIterator.next();
            if (car.wheels.getType().equals(wheelType) &&
                    car.wheels.getDiameter() >= minDiameter &&
                    car.wheels.getDiameter() <= maxDiameter){
                carByWheelType.add(car);}
        }
        return carByWheelType;
    }

}
