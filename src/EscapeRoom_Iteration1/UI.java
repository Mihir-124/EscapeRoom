package EscapeRoom_Iteration1;//package Point_and_Click;
import EscapeRoom_Iteration1.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];
    public JButton b;
    public UI(GameManager gm) {
        this.gm = gm;
        createMainField();
        setText();
        generateScene();
        //CustomCursor();
        //createBackground();
        //createObject();
        window.setVisible(true);
    }
    public void CustomCursor()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("Cursor.png");
        Point point = new Point(0,0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");

        bgPanel[1].setCursor(cursor);
    }
    public void createMainField() {
        //This is the code that sets up the entire window
        System.out.println("I am in Create MainField");
        window = new JFrame();
        window.setSize(800, 600); //Set the window Size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

        b = new JButton();
        b.setLocation(0,0);
        b.setSize(50, 50);
        b.addActionListener(e -> {

        });


    }

    public void setText()
    {
        messageText = new JTextArea("THIS IS AN ESCAPE ROOM");
        messageText.setBounds(50, 410, 700, 150);
        messageText.setBackground(Color.black);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
        window.add(messageText);

    }

    public void createBackground(int bgNum, String bgFileName)
    {
        //This is a JPanel
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50, 50, 600, 466);
        bgPanel[bgNum].setBackground(Color.black);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);

        //This is the code that adds the background image
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0, 600, 466);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bgLabel[bgNum].setIcon(bgIcon);
        //bgPanel[1].add(bgLabel[1]);

    }
    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFileName, String choice1Name, String choice2Name, String choice1Command, String choice2Command)
    {
        JPopupMenu popMenu = new JPopupMenu();

        JMenuItem menuItem[] = new JMenuItem[4]; // Use 1, 2 and 3

        menuItem[1] = new JMenuItem(choice1Name);
        menuItem[1].addActionListener(gm.aHandler);
        menuItem[1].setActionCommand(choice1Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice2Name);
        menuItem[2].addActionListener(gm.aHandler);
        menuItem[2].setActionCommand(choice2Command);
        popMenu.add(menuItem[2]);

        /*menuItem[3] = new JMenuItem(choice3Name);
        menuItem[3].addActionListener(gm.aHandler);
        menuItem[3].setActionCommand(choice3Command);
        popMenu.add(menuItem[3]);*/


        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx, objy, objWidth, objHeight);

        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }


            public void mousePressed(MouseEvent e)
            {
                if(SwingUtilities.isRightMouseButton(e))
                {
                    popMenu.show(objectLabel, e.getX(), e.getY());
                }
            }


            public void mouseReleased(MouseEvent e) {

            }


            public void mouseEntered(MouseEvent e) {

            }


            public void mouseExited(MouseEvent e) {

            }
        });
        bgPanel[bgNum].add(objectLabel);

        bgPanel[bgNum].add(bgLabel[bgNum]);//ADD BACKGROUND LAST SO THAT IT IS IN THE BACK
    }
    public void generateScene()
    {
        // SCREEN1(ALSO MEANS THAT bgNum = 1) // DARK ROOM, DIM LIGHT AND CLOSED CHEST
        createBackground(1,"DarkRoom.jpg"); //Dark Room Background
       // createBackground(2,"LightRoom.jpg"); //Dark Room Background
        createObject(1, 440, 40, 120, 320, "Lantern.png", "On","Off","on", "off"); // Lantern
        createObject(1, 200, 200, 200, 200, "CloseChest1.jpg", "Open","Close","open", "close"); // Lantern
        bgPanel[1].add(bgLabel[1]);

        //createObject(1, 70, 180, 150, 150, "Guard.png","Look","Talk","Attack", "lookGuard", "talkGuard", "attackGuard"); // Guard
        //createObject(1, 310, 280, 70, 70, "Chest.png","Look","Talk","Open", "lookChest", "talkChest", "openChest"); // Chest
        //createObject(1, 90, 180, 150, 150, "Chest.png"); // Guard

        // SCREEN2(ALSO MEANS THAT bgNum = 2) // BRIGHT ROOM, BRIGHT LIGHT AND CLOSED CHEST

       createBackground(2,"LightRoom.jpg");
        createObject(2, 440, 40, 120, 320, "Lantern.png", "On","Off","on", "off"); // Lantern
        createObject(2, 200, 200, 200, 200, "CloseChest1.jpg", "Open","Close","open", "close"); // Lantern
        bgPanel[2].add(bgLabel[2]);

        // SCREEN3(ALSO MEANS THAT bgNum = 3) // BRIGHT ROOM, BRIGHT LIGHT AND OPEN CHEST.
        createBackground(3,"LightRoom.jpg");
        createObject(3, 440, 40, 120, 320, "Lantern.png", "On","Off","on", "off"); // Lantern
        createObject(3, 200, 200, 200, 200, "OpenChest1.jpg", "Open","Close","open", "close"); // Lantern
    }
}
//lets go home after this class ends
//second edit