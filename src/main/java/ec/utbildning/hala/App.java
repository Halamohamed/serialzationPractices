package ec.utbildning.hala;

import ec.utbildning.hala.data.SerializeIO;
import ec.utbildning.hala.data.TextSequencer;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
    }
    public static void exercise1(){
        File targetFile = new File("textFile/myText.txt");
        System.out.println(SerializeIO.readText(targetFile));

    }
    public static void exercise2(){
        File url = new File("textFile/names.txt");
        for (String string : SerializeIO.readWithBufferReader(url)){
            System.out.println(string);
        }
    }
    public static void exercise3(){
        List<String> so = new ArrayList<>(Arrays.asList("Name: Hala", "\nName: Peter","\nName: Khalifa","\nName:Sima","\nName:Cheng"));
        SerializeIO.writeText(new File("textFile/names.txt"),so);

    }

    public static void exercise4(){
        File source = new File("textFile/sourceFile.txt");
        File destination = new File("destination_folder/copy_sourceFile.txt");
        SerializeIO.copy(source,destination);

    }
    public static void exercise5(){

        //SerializeIO.readText();
        //System.out.println(TextSequencer.nextTextId());
    }

}
