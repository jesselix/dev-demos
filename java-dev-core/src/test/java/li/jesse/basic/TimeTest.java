package li.jesse.basic;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {

    @Test
    public void testTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string = df.format(new Date()).toString();
        System.out.println(string);
    }

    @Test
    public void testTime2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse("20111212133712");
        System.out.println(date.getHours());
    }
}
