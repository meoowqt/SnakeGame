package src;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] X = new int[ALL_DOTS];
    private int[] Y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    public GameField() {
        setBackground(Color.BLACK);
    }

    public void loadImage() {
        ImageIcon Iia = new ImageIcon("apple.png");
        apple = Iia.getImage();
        ImageIcon Iid = new ImageIcon("dot.png");
        apple = Iid.getImage();
    }

}
