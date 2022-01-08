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



}
