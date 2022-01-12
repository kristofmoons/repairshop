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

//         corrigeert statussen naar statussen dat ik in andere methods gebruik
        i1.corigeerstatus();
        i2.corigeerstatus();
        i3.corigeerstatus();
//         klant brengt item binnen
        k1.addItem(i1);
        k1.addItem(i2);
        b1.addItem(i3);
//         alle items van een klant die binnen zijn
        k1.showItems();
        System.out.println("------------");
//        zorgt ervoor dat een item klaar is met reparatie
        i1.statusComplete();
        k1.showItems();
        System.out.println("------------");
//        klant kan met een status opzoeken en zien welke items mezig zijn met reparatie of klaar om op te halen
        System.out.println(k1.searchItem("bezig met reparatie"));
        System.out.println("------------");
//        korting op prijs
        System.out.println(k1.kortingscoupon(i1));
        System.out.println(b1.kortingscoupon(i3));
        System.out.println("--------------");
//        onders functie staat in commentaar omdat hij een nieuwe map op uw computer maakt met daarin een txt bestand
//
//        de file komt op uw c schijf terecht dan user/username/  dan zal er een mapje bijgekomen zijn repairshop met een txt bestand met daarin klant
//       r1.WriteObjectToFile(k1);
//
//
//     btw op prijs zodat klant weet wat hij/zij uiteintelijk betaalt
        k1.betaling(i3);
        b1.betaling(i3);
        System.out.println("--------------");
//        voeg item toe aan hashmap
        r1.wachtrij(i1);
        r1.wachtrij(i2);
//        laat alle items zien in hashmap
        System.out.println(r1.getItems());
//        verwijder items die klaar zijn
        r1.deleteKlaar();
        System.out.println(r1.getItems());
        System.out.println("---------------");
//        zet klant in hasmap
        r1.voegKlantToe(k1);
        r1.voegKlantToe(k2);
        r1.voegKlantToe(b1);
//        System.out.println(r1.getContacten());
        System.out.println("-------------------");
//        print klant uit met al zijn items die in de winkel is
        r1.klantEnHunItems();

        r1.ExportToCSV();
    }
}
