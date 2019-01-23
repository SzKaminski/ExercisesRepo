import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Bike implements Vahicle {

    public enum bikeBrand{
        KROSS, GIANT, ROMET;
    }

    public enum bikeColor{
        NIEBIESKI, CZARNY, ZIELONY;
    }

    public boolean isEfficient() {
        return true;
    }

    public boolean ismoving() {
        return true;
    }

    public String currentTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
}
