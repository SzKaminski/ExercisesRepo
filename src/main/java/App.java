public class App {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        String fullName = "Jan Kowalski";
        buyCar(fullName);

    }

    public static void buyCar(String fullName)  throws IllegalAccessException, InstantiationException{
        StringParser.getNamesFromRegex(fullName);

        Person person = new Person(StringParser.getName(),StringParser.getSurname());

        Person[] people = {person};

        for (Person personJan : people) {
            System.out.println(personJan.getName() + " kupił: " + Car.class.getName() + " " + Car.carBrand.AUDI.toString() +
                    " kolor: " + Car.carColor.NIEBIESKI.toString() + " o godzinie " + Car.class.newInstance().currentTime() +
                    "\nSprawny: " + Car.class.newInstance().ismoving() +
                    "\nWydajny: " + Car.class.newInstance().isEfficient());
        }
    }



}
