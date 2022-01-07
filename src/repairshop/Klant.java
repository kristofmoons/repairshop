package repairshop;

import java.util.ArrayList;

public class Klant {
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
    public void addItem (Item i){
        mijnItems.add(i);
    }

    public void showItems(){
        System.out.println(mijnItems);
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
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                '}';
    }
}
