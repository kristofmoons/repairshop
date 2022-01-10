package repairshop;

public class RepShopTestGui {
    public static void main(String[] args) {
        Klant k1 = new Klant("Jos","De Wolf", "04/52455313" ,"JosDeWold@email.com");
        Klant k2 = new Klant("Jes","De vis", "04/52455313" ,"JesDekat@email.com");

        RepshopGui repshopGui = new RepshopGui();
        KlantPanel klantPanel = new KlantPanel(k1);
        klantPanel.run();
//        repshopGui.run();
    }
}
