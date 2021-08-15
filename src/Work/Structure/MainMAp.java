package Work.Structure;

import java.util.HashMap;
import java.util.Map;

public class MainMAp {
    public static void main(String[] args) {
        Map<String, Cat> catMap = new HashMap<>();

        Cat lori = new Cat("Lori", 5);
        Cat banny = new Cat("Banny", 3);
        Cat roxi = new Cat("Roxi", 6);
        Cat malokov = new Cat("Malik", 8);

        String lorikey = "Lori";
        String bannykey = "Banny";
        String roxikey = "Roxi";
        String mlokovkey = "Malik";

        catMap.put(lorikey, lori);
        catMap.put(bannykey, banny);
        catMap.put(roxikey, roxi);
        catMap.put(mlokovkey, malokov);

        System.out.println(catMap.get(bannykey));

        WeekDays day = WeekDays.FRIDAY;
        if(day == WeekDays.FRIDAY){
            System.out.printf("Пятница");
        }

    }
}
