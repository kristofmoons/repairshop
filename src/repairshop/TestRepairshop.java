package repairshop;

public class TestRepairshop {
    public static void main(String[] args) {
        Klant k1 = new Klant("Jos","De Wolf", "04/52455313" ,"JosDeWold@email.com");
//        Klant k2 = new Klant("Jef","De Kat", telefoon, email);
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


    }
}
