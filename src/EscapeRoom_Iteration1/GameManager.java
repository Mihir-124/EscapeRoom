package EscapeRoom_Iteration1;//package Point_and_Click;

public class GameManager {
    ActionHandler aHandler = new ActionHandler(this);
    UI ui = new UI(this);
    public SceneChanger sChanger = new SceneChanger(this);

    public static void main(String[] args) {
        new GameManager();
    }

    public GameManager()
    {

    }
}
