package ec.utbildning.hala.data;

public class TextSequencer {
    public static int TEXT_ID ;

   public static void setTextId(int id){
       TEXT_ID = id;
   }
   public static int lastTextId(){
       return TEXT_ID;
   }
   public static int nextTextId(){
       return ++TEXT_ID;
   }
   public void  reset(){

   }
}
