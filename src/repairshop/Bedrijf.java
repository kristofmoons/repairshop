package repairshop;

public class Bedrijf extends Klant {
    private String bedrijf;

    public Bedrijf (String naam, String voornaam,String telefoon,String email, String bedrijf) {
        super(naam, voornaam, telefoon, email);
        this.bedrijf = bedrijf;
    }

}
