package repairshop;

public class RepShopTestGui {
    public static void main(String[] args) {
        Repairshop r1 = new Repairshop();
        Klant k1 = new Klant("De Wolf","Jos", "04/52455313" ,"JosDeWold@email.com");
        Klant k2 = new Klant("De vis","Jes", "04/52455313" ,"JesDekat@email.com");
        Bedrijf b1 = new Bedrijf("De Kat","Jef","04/2369745","bedr@opn&co.com","opn&co");
        Item i1 = new Item("horloge", "geeft tijd niet goed aan",50, "bezig met reparatie");
        Item i2 = new Item("Jas","mouw gescheurd",100,"bezig met reparatie");
        Item i3 = new Item("autozetels","versleten(gescheurd, krakken,...)",500,"in werking");

        RepshopGui repshopGui = new RepshopGui();
        KlantPanel klantPanel = new KlantPanel(k1);
//        klantPanel.run();
        repshopGui.run();
    }
}
