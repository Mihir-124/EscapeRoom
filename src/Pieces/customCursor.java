package Pieces;

import javax.swing.*;
import java.awt.*;

public class customCursor
{
    JFrame window = new JFrame();
    public customCursor()
    {
        //JFrame code
        window.setSize(800,800);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        //Cursor Code
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("Lantern.png");
        Point point = new Point(0,0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");
        window.setCursor(cursor);


        window.setVisible(true);
    }


}
