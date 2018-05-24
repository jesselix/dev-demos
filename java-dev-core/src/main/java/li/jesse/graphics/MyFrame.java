package li.jesse.graphics;

import javax.swing.*;

public class MyFrame extends JFrame {

    public static final String TITLE = "Java图形绘制";

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public MyFrame() {
        super();
        initFrame();
    }

    private void initFrame() {
        // 设置 窗口标题 和 窗口大小
        setTitle(TITLE);
        setSize(WIDTH, HEIGHT);

        // 设置窗口关闭按钮的默认操作(点击关闭时退出进程)
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 把窗口位置设置到屏幕的中心
        setLocationRelativeTo(null);

        // 设置窗口的内容面板
        MyPanel panel = new MyPanel(this);
        setContentPane(panel);
    }

}
