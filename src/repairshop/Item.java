package repairshop;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    private String naam;
    private String probleem;
    private double prijsReparatie;
    private String status;


    public Item(String naam, String probleem, double prijsReparatie, String status) {
        this.naam = naam;
        this.probleem = probleem;
        this.prijsReparatie = prijsReparatie;
        this.status = status;
    }

//    Random https://www.javatpoint.com/how-to-generate-random-number-in-java
    public void statusComplete(){
       int min =0;
       int max = 10;
       double random = Math.random()*(max-min+1)+min;

      if (random>=3){
        status="klaar met afhandeling";
      }
      else if (random>=2){
          status ="meer tijd nodig";
          System.out.println("wegens omstandigheden hebben we meer tijd nodig voor de restauratie");
      }
      else if (random>=1){
          status="extra werk nodig";
          System.out.println("er is een extra probleem voorgekomen en prijs is helaas daardoor gestegen");
          prijsReparatie*=1.05;
      }

        System.out.println(status+ "");

    }

    public void corigeerstatus(){
        String[] statussen = {"klaar","in behandeling","meer tijd nodig","extra werk nodig"};
        int teller=0;
        for (String s : statussen) {
            if (status != s) {
               teller++;
            }
        }
        if (teller ==4){
            status = "in behandeling";
        }
    }




    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getProbleem() {
        return probleem;
    }

    public void setProbleem(String probleem) {
        this.probleem = probleem;
    }

    public double getPrijsReparatie() {
        return prijsReparatie;
    }

    public void setPrijsReparatie(double prijsReparatie) {
        this.prijsReparatie = prijsReparatie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + "\nProbleem: " + probleem + "\nPrijsReparatie: " + prijsReparatie + "\nStatus: " + status;
    }
}
