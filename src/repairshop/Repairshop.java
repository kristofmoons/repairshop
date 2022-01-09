package repairshop;

import java.io.*;
import java.util.*;

public class Repairshop {
    private HashMap<String, String> items = new HashMap<>();
    private HashMap<String, Klant> contacten = new HashMap<>();


    public void voegKlantToe(Klant k){
        contacten.put(k.getNaam(),k);
    }

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

   public void overzichtItems() {
       System.out.println(items);
   }

    public void klantEnHunItems(){
        Iterator iterator = contacten.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry me2 = (Map.Entry) iterator.next();
            ArrayList<Item> Items = ((Klant) me2.getValue()).getMijnItems();
            System.out.println("de klant "+((Klant) me2.getValue()).getNaam());

            for (int i = 0; i < Items.size() ; i++) {
                System.out.println("heeft de item");
                System.out.println(items);
            }
            if (Items.size()==0){
                System.out.println("heeft geen items in behandeling");
            }

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

    public HashMap<String, String> getItems() {
        return items;
    }

    public void setItems(HashMap<String, String> items) {
        this.items = items;
    }

    public HashMap<String, Klant> getContacten() {
        return contacten;
    }

    public void setContacten(HashMap<String, Klant> contacten) {
        this.contacten = contacten;
    }
}
