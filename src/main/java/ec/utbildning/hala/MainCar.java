package ec.utbildning.hala;

import ec.utbildning.hala.data.Car;
import ec.utbildning.hala.data.Owner;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCar {
    public static void main(String[] args) {
        Path path = Paths.get("textFile/cars.dat");
        //Ex5
        List<Car> carList = new ArrayList<>(Arrays.asList(new Car("abc123","Volvo","v70", LocalDate.of(2010,9,8)),
                new Car("cde345","saab","s60",LocalDate.of(2005,5,5)),
                new Car("fde765","ford","480",LocalDate.of(2002,2,2))));
          //CarIO.save(carList,path);
        //System.out.println(CarIO.read(path));;

        //Exc6
        Owner owner1 = new Owner("Hala",LocalDate.of(1985,12,24));
        Owner owner2 = new Owner("Khalifa",LocalDate.of(1977,03,18));
        List<Car> carCollection = new ArrayList<>(Arrays.asList(
                new Car("AHT444", "Tesla"," t40", LocalDate.of(2019,1,1),owner1),
                new Car("DTD555", "Citron","c67", LocalDate.of(2018,2,2),owner2),
                new Car("YRT123", "Volvo", "xc90", LocalDate.of(2019,12,20),owner2)
        ));



        JsonIo jsonIo = new JsonIo();
        //jsonIo.serializeToJson(carCollection, new File("cars.json"));

        System.out.println();
        jsonIo.deserialize(new File("cars.json")).forEach(System.out::println);

    }


}
