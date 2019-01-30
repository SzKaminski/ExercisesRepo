public class Saler extends Person {

    private boolean autoSaler;

    public Saler(String name, String surname, boolean autoSaler) {
        super(name, surname);
        this.autoSaler = autoSaler;
    }



    public void sellsSmth(String smth){
        System.out.println(getName() + " sprzedaje " + smth);
    }

    public boolean isAutoSaler() {
        return autoSaler;
    }
}
