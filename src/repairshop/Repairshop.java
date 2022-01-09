package repairshop;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class Repairshop {
    private HashMap<String, String> items = new HashMap<>();
    private HashMap<String, Klant> contacten = new HashMap<>();


    public void wachtrij(Item i){
       if (i.getStatus()=="klaar"){
      items.put(i.getNaam(),"KLAAR");
   }
       else {
       items.put(i.getNaam(),"BEHANDELING");
       }
    }

   enum Status{
        KLAAR,
       BEHANDELING

   }

   public void deleteKlaar(){
       Iterator it = items.entrySet().iterator();
       while (it.hasNext()) {
           Map.Entry pair = (Map.Entry) it.next();
         if (pair.getValue().equals(Status.KLAAR.name())) {
               it.remove();
           }

       }
   }

   public void overzichtItems(){
        String overzicht = "";
       for (int i = 0; i < items.size() ; i++) {

       }
   }

//    https://examples.javacodegeeks.com/core-java/io/fileoutputstream/how-to-write-an-object-to-file-in-java/
    public void WriteObjectToFile(Object serObj) throws IOException {

        try {
            File FKlanten = new File(System.getProperty("user.home")+"\\Repairshop\\Klanten.txt");
            FKlanten.getParentFile().mkdirs();
            FKlanten.createNewFile();
            FileOutputStream f = new FileOutputStream(FKlanten, false);
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(serObj);
            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
