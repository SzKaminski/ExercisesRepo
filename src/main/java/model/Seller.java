package model;

public class Seller extends Person {

    private boolean autoSeller;

    public Seller(String name, String surname, boolean autoSeller) {
        super(name, surname);
        this.autoSeller = autoSeller;
    }



    public void sellsSmth(String smth){
        System.out.println(getName() + " sprzedaje " + smth);
    }

    public boolean isAutoSeller() {
        return autoSeller;
    }
}
