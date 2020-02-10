import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CarDataBase carDataBase = new CarDataBase();
        carDataBase.setCarList();

        System.out.println("Введіть тип кузова, діаметер коліс і тип шин на який будемо міняти");
        System.out.println(carDataBase.changeWheelsType(reader.readLine(), Integer.parseInt(reader.readLine()), reader.readLine()));
        System.out.println("Введіть мінімальний і максимальний розмір дисків");
        System.out.println(carDataBase.removeByDiameter(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
        System.out.println("Введіть тип шин, мінімальний і максимальний розмір дисків");
        System.out.println(carDataBase.findByWheelType(reader.readLine(), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));

    }
}

