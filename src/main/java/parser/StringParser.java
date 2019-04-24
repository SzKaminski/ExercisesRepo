package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {

    private static String name;
    private static String surname;

    public static void getNamesFromRegex(String fullName){
        String pattern = "([a-z,A-Z]+)\\s+([a-z,A-Z]+)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(fullName);

        if (m.find()){
            name = m.group(1);
            surname = m.group(2);

        }else {
            System.out.println("Nie znaleziono informacji");
        }
    }

    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }
}
