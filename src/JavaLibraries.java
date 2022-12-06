import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaLibraries {
    public static void main(String[] args) {
        Date today = new Date();


        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(today);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) -1);
        System.out.println(calendar.getTime());

        GregorianCalendar birthday = new GregorianCalendar(1995,07, 02 );
        Date birthDate = birthday.getTime();

        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(birthday);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String prettyDate = sdf.format(birthDate);
    }
}
