import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener
{
    //boolean light;
    //int countLight;
    GameManager gm;
    public ActionHandler(GameManager gm)
    {
        this.gm = gm;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String yourChoice = e.getActionCommand();
        //System.out.println(yourChoice);
        if(yourChoice == "on")
        {

            gm.ui.messageText.setText("Light is On");
         //gm.ui.window.add(gm.ui.bgPanel[2].add(gm.ui.bgLabel[2]));
        gm.sChanger.showScreen2();
            //gm.ui.createBackground(2, "LightRoom.jpg");

        }
        else if(yourChoice == "off")
        {
            gm.ui.messageText.setText("Light is Off");
            gm.sChanger.showScreen1();
        }
        else if(yourChoice == "open")
        {
            gm.ui.messageText.setText("Chest is open");
            gm.sChanger.openChest();
        }
        else if(yourChoice == "close")
        {
            gm.ui.messageText.setText("Chest is closed");
            gm.sChanger.closeChest();
        }
        /*switch(yourChoice)
        {

            case "lookHut": gm.ui.messageText.setText("This is your house"); break;
            case "talkHut": gm.ui.messageText.setText("Who are you talking to?"); break;
            case "restHut": gm.ui.messageText.setText("You rest at the house.\n(Your life has recovered)"); break;
        }*/
    }
}