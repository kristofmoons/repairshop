package repairshop;

public class Restauratie {
    private Item item;
    private int werkdagen;

    public Restauratie(Item item, int werkdagen) {
        this.item = item;
        this.werkdagen = werkdagen;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getWerkdagen() {
        return werkdagen;
    }

    public void setWerkdagen(int werkdagen) {
        this.werkdagen = werkdagen;
    }

    @Override
    public String toString() {
        return "Restauratie{" +
                "item=" + item +
                ", werkdagen=" + werkdagen +
                '}';
    }
}
