package repairshop;

import java.io.*;
import java.util.HashMap;

public class Repairshop {

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
