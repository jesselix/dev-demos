package li.jesse.jdbasics.call;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("Now time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
