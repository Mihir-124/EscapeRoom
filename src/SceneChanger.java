public class SceneChanger
{
    GameManager gm;
    public SceneChanger(GameManager gm)
    {
        this.gm = gm;
    }

    public void showScreen1()
    {
        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
    }

    public void showScreen2()
    {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true);
    }

    public void openChest()
    {
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(true);
    }
    public void closeChest()
    {
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true);
    }
}
