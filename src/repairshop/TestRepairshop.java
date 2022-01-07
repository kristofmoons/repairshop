package repairshop;

public class TestRepairshop {
    public static void main(String[] args) {
        Klant k1 = new Klant("Jos","De Wolf", "04/52455313" ,"JosDeWold@email.com");
        Bedrijf b1 = new Bedrijf("Jef","De Kat","04/2369745","bedr@rep&co.com","rep&co");
        Item i1 = new Item("horloge", "geeft tijd niet goed aan",50, "bezig met reparatie");
        Item i2 = new Item("Jas","mouw gescheurd",100,"bezig met reparatie");

        k1.addItem(i1);
        k1.addItem(i2);
        k1.showItems();
        System.out.println("------------");
        i1.statusComplete();
        k1.showItems();
        System.out.println("------------");
        System.out.println(k1.searchItem("bezig met reparatie"));
        System.out.println("------------");
        System.out.println(k1.kortingscoupon(i1));



    }
}
