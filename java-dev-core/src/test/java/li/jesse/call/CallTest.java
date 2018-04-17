package li.jesse.call;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CallTest {

    @Test
    public void testTimePrinter() {
        ActionListener listener=new TimePrinter();
        Timer timer = new Timer(10000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "quit");
        System.exit(0);
    }

    @Test
    public void testCallback() {
        Student student = new Student();
        student.setCallback(new Teacher());
        student.doTask();
    }
}
