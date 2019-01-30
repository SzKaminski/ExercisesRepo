public class App {
    public static void main(String[] args) {

        String fullName1 = "Jan Kowalski";
        String fullName2 = "Szymon Styczeń";

        buySmth(fullName1, true, String.valueOf(Car.carBrand.MERCEDES), String.valueOf(Car.carColor.NIEBIESKI));
        buySmth(fullName2, false, String.valueOf(Bike.bikeBrand.KROSS), String.valueOf(Bike.bikeColor.ZIELONY));
    }


    public static void buySmth(String fullName, boolean wantsCar, String brand, String color){
        StringParser.getNamesFromRegex(fullName);
        Person person = new Person(StringParser.getName(),StringParser.getSurname());
        Saler autoSaler = new Saler("Piotr", "Nowak", true);
        Saler bikeSaler = new Saler("Daniel", "Nowak", false);

        if (wantsCar && autoSaler.isAutoSaler()){
            Car car = new Car();
            System.out.println(person.getName() + " kupił: " + Car.carBrand.valueOf(brand) +
                    " kolor: " + Car.carColor.valueOf(color)+ " o godzinie " + car.currentTime() +
                    "\nSprawny: " + car.ismoving() +
                    "\nWydajny: " + car.isEfficient());
            autoSaler.sellsSmth(brand);

        }else {
            Bike bike = new Bike();
            System.out.println(person.getName() + " kupił: " + Bike.bikeBrand.valueOf(brand) +
                    " kolor: " + Bike.bikeColor.valueOf(color)+ " o godzinie " + bike.currentTime() +
                    "\nSprawny: " + bike.ismoving() +
                    "\nWydajny: " + bike.isEfficient());
            bikeSaler.sellsSmth(brand);
        }


    }


}
