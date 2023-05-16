package Pieces;

import javax.swing.*;
import java.awt.*;

public class ImageHideShow
{
   public JFrame frame;
   public JLabel imgLabel;
    public void setFrame()
    {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
    }

    public void setImgLabel()
    {
        imgLabel = new JLabel();
        imgLabel.setBounds(0,0,800,800);
        ImageIcon imgIcon = new ImageIcon(getClass().getClassLoader().getResource("TestCursor.png"));
        imgLabel.setIcon(imgIcon);
    }

}
