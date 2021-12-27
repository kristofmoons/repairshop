package repairshop;

public class Item {

    private String item;
    private String probleem;
    private double prijs;
    private double maxprijs;
    private int werkdagen;

    public Item(String item, String probleem, double prijs, double maxprijs, int werkdagen) {
        this.item = item;
        this.probleem = probleem;
        this.prijs = prijs;
        this.maxprijs = maxprijs;
        this.werkdagen = werkdagen;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getProbleem() {
        return probleem;
    }

    public void setProbleem(String probleem) {
        this.probleem = probleem;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getMaxprijs() {
        return maxprijs;
    }

    public void setMaxprijs(double maxprijs) {
        this.maxprijs = maxprijs;
    }

    public int getWerkdagen() {
        return werkdagen;
    }

    public void setWerkdagen(int werkdagen) {
        this.werkdagen = werkdagen;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + item + '\'' +
                ", probleem='" + probleem + '\'' +
                ", prijs=" + prijs +
                ", maxprijs=" + maxprijs +
                ", werkdagen=" + werkdagen +
                '}';
    }
}
