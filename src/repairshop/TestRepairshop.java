package repairshop;

import java.io.IOException;

public class TestRepairshop {
    public static void main(String[] args) throws IOException {
        Repairshop r1 = new Repairshop();
        Klant k1 = new Klant("Jos","De Wolf", "04/52455313" ,"JosDeWold@email.com");
        Bedrijf b1 = new Bedrijf("Jef","De Kat","04/2369745","bedr@rep&co.com","rep&co");
        Item i1 = new Item("horloge", "geeft tijd niet goed aan",50, "bezig met reparatie");
        Item i2 = new Item("Jas","mouw gescheurd",100,"bezig met reparatie");
        Item i3 = new Item("autozetels","versleten(gescheurd, krakken,...)",500,"in werking");


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
        System.out.println("--------------");
//        r1.WriteObjectToFile(k1);
        k1.betaling(i2);
        b1.betaling(i2);



    }
}
