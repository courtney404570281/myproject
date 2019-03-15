package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        //java8
        Instant instant = Instant.now();
        System.out.println(instant); // 2019-03-15T16:12:21.558Z //T=Time Z=Zone
        //Local
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local); // 2019-03-16T00:16:27.242
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(local)); // 2019/03/16 00:19:01
        System.out.println(local.plus(Duration.ofHours(3))); // 2019-03-16T03:22:48.346
        LocalDateTime other = LocalDateTime.of(2019, 03, 15, 13, 11,33);
        System.out.println(other); // 2019-03-15T13:11:33

//        java();
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date); // Sat Mar 16 00:12:54 CST 2019
        System.out.println(date.getTime()); //1552666374667
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date)); //2019/03/16 00:12:54

        String s = "2019/03/15 12:00:03";
        try {
            Date other = sdf.parse(s);
            System.out.println(other); //Fri Mar 15 12:00:03 CST 2019
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime()); //Sat Mar 16 00:12:54 CST 2019
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime()); //Wed Oct 16 00:12:54 CST 2019
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime()); //Sat Oct 19 00:12:54 CST 2019
    }
}
