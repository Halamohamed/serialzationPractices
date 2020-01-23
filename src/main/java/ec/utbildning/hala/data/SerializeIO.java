package ec.utbildning.hala.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SerializeIO {

    public static final String TEXTID = "text_id";
    private static List<String> stringList;
    private static final File FILE = new File("textFile/myText.txt");
    public SerializeIO(){
        stringList = new ArrayList<>();
    }
    public void setStringList(){

    }
    public static List<String> readWithBufferReader(File source){
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))){
            String line;
            while ((line = reader.readLine()) != null){
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
    public static String readText(File file){
        StringBuilder stringBuilder = new StringBuilder();
        //Properties properties = new Properties();
        try (FileReader reader = new FileReader(file)){
            int i;
            while ((i = reader.read()) != -1){
                char letter = (char) i;
                stringBuilder.append(letter);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void writeText(File file, List<String> strings){

        try (FileWriter writer = new FileWriter(file)){
            if(!file.exists()){
                file.createNewFile();
            }
            for (String s: strings){
                writer.write(s) ;
                System.out.println();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copy(File source, File destination){
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) >0){
                out.write(buffer, 0, bytesRead);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
