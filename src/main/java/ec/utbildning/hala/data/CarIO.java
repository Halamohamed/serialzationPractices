package ec.utbildning.hala.data;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CarIO {
    public static void save(List<Car> cars, Path path){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
            out.writeObject(cars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Car> read(Path path){
        List<Car> carList = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path.toFile()))){
            carList = (List<Car>) in.readObject();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return carList;
    }

}
