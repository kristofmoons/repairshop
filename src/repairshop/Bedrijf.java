package repairshop;

public class Bedrijf extends Klant {
    private String bedrijf;

    public Bedrijf (String naam, String voornaam,String telefoon,String email, String bedrijf) {
        super(naam, voornaam, telefoon, email);
        this.bedrijf = bedrijf;
    }

    public void betaling(Item i){
        double betaalprijs = i.getPrijsReparatie();
        double btw = 0.09;

        betaalprijs+= betaalprijs*btw;
        System.out.println("de prijs die je ga moeten betalen bij afhaling bedraagt "+betaalprijs+"$");

    }

    public double kortingscoupon(Item i){
        double korting = 0;
        int teller=0;
        double prijs= i.getPrijsReparatie();

        for (int j = 0; j < getMijnItems().size() ; j++) {
            teller++;
        }

        korting = prijs*0.05;
        korting*=teller;

        return korting;
    }



}
