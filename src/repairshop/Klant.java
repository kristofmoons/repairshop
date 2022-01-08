package repairshop;

import java.util.ArrayList;
import java.io.Serializable;

public class Klant implements Serializable{
    private static final long serialVersionUID = 1L;

    private String naam;
    private String voornaam;
    private String telefoon;
    private String email;
    private ArrayList<Item> mijnItems = new ArrayList<>();


    public Klant(String naam, String voornaam, String telefoon, String email) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.telefoon = telefoon;
        this.email = email;
    }

    public double kortingscoupon(Item i){
        double korting = 0;

        if (i.getPrijsReparatie()>50){
            korting = i.getPrijsReparatie()*0.95;
        }
        else if (i.getPrijsReparatie()>=100){
            korting=i.getPrijsReparatie()*0.90;
        }
        else {
            System.out.println("sorry je betaalt te weinig geen korting");
            korting=i.getPrijsReparatie();
        }

        return korting;
    }


    public void addItem(Item i) {
        mijnItems.add(i);
    }

    public void showItems() {
        System.out.println(mijnItems);
    }

    public ArrayList<Item> searchItem(String status) {
        ArrayList<Item> foundItems = new ArrayList<>();
        int teller=0;

        for (Item mijnItem : mijnItems) {
            if (mijnItem.getStatus() == status) {
                teller++;
                foundItems.add(mijnItem);
            }
        }

        if (teller==0){
            System.out.println("sorry niks gevonden");
        }
        else {
            System.out.println(teller+ " items gevonden");
        }

        return foundItems;
    }

    public void betaling(Item i){
       double betaalprijs = i.getPrijsReparatie();
       double btw = 0.21;

       betaalprijs+= betaalprijs*btw;
        System.out.println("de prijs die je ga moeten betalen bij afhaling bedraagt "+betaalprijs+"$");

    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Naam:" + naam + "\nVoornaam: " + voornaam  + "\nTelefoon: " + telefoon + "\nEmail: " + email + "\nItems:" + mijnItems;
    }
}
