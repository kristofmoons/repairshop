package repairshop;

public class Item {

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
        return "Item{" +
                "item='" + naam + '\'' +
                ", probleem='" + probleem + '\'' +
                ", prijs=" + prijsReparatie +
                '}';
    }
}
