package repairshop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestRepairshop {
    public static void main(String[] args) throws IOException {
        Repairshop r1 = new Repairshop();
        Klant k1 = new Klant("Jos","De Wolf", "04/52455313" ,"JosDeWold@email.com");
        Klant k2 = new Klant("Jes","De vis", "04/52455313" ,"JesDekat@email.com");
        Bedrijf b1 = new Bedrijf("Jef","De Kat","04/2369745","bedr@opn&co.com","opn&co");
        Item i1 = new Item("horloge", "geeft tijd niet goed aan",50, "bezig met reparatie");
        Item i2 = new Item("Jas","mouw gescheurd",100,"bezig met reparatie");
        Item i3 = new Item("autozetels","versleten(gescheurd, krakken,...)",500,"in werking");

        i1.corigeerstatus();
        i2.corigeerstatus();
        i3.corigeerstatus();
        k1.addItem(i1);
        k1.addItem(i2);
        b1.addItem(i3);
        k1.showItems();
        System.out.println("------------");
        i1.statusComplete();
        k1.showItems();
        System.out.println("------------");
        System.out.println(k1.searchItem("bezig met reparatie"));
        System.out.println("------------");
        System.out.println(k1.kortingscoupon(i1));
        System.out.println(b1.kortingscoupon(i3));
        System.out.println("--------------");
       r1.WriteObjectToFile(k1);
        k1.betaling(i3);
        b1.betaling(i3);
        System.out.println("--------------");
        r1.wachtrij(i1);
        r1.wachtrij(i2);
        System.out.println(r1.getItems());
        r1.deleteKlaar();
        System.out.println(r1.getItems());
        System.out.println("---------------");
        r1.voegKlantToe(k1);
        r1.voegKlantToe(k2);
        r1.voegKlantToe(b1);
//        System.out.println(r1.getContacten());
        System.out.println("-------------------");
        r1.klantEnHunItems();

        r1.ExportToCSV();
    }
}
