package repairshop;

public class TestRepairshop {
    public static void main(String[] args) {
        Klant k1 = new Klant("Jos","De Wolf", "04/52455313" ,"JosDeWold@email.com");
//        Klant k2 = new Klant("Jef","De Kat", telefoon, email);
        Item i1 = new Item("horloge", "geeft tijd niet goed aan",50, "bezig met reparatie");

        k1.addItem(i1);
        k1.showItems();

    }
}
