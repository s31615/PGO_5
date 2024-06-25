public class Item {
    private int id;
    private String nazwa;

    public Item(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void show() {
        System.out.println("Nazwa przedmiotu: " + nazwa);
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", nazwa='" + nazwa + "'}";
    }
}
