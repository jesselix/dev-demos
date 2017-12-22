package li.jesse.basic;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {

    @Test
    public void testTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 设置日期格式
        String string = df.format(new Date()).toString();
        System.out.println(string); // new Date()为获取当前系统时间
    }
}
