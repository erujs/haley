package Main;

/**
 * Created by Eru on 4/1/2016.
 */
public class Main {
    private static Interface ui;

//    public update(){
//
//    }
//
//    private void render(){
//
//    }

    public static void main(String[] args) {
//        update();
//        render();
        ui = new Interface();
        ui.init();
    }
}