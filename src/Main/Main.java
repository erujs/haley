package Main;

/**
 * Created by Eru on 4/1/2016.
 */
public class Main {
    private static Interface ui;

    private enum STATE{
        MENU,
        GAME
    };

    public static void main(String[] args) {
//        private STATE State = STATE.MENU;
//        update();
//        render();
//        if (State == STATE.GAME) {
            ui = new Interface();
            ui.init();
//        }
    }
}