package Test;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Engine implements Runnable {

//    private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);

    private boolean running = false;
    private Thread thread;

    public synchronized void start(){
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        if (!running)
            return;

        running = false;
        try {
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.exit(1);
    }

//  Game Loop
    public void run(){
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;

        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();

        while (running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1){
                update();
                updates++;
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println(updates + "Ticks, FPS " + frames);
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }
    public void update(){

    }

    public void render(){
//        BufferStrategy bs = this.getBufferStrategy();
//        if (bs == null){
//            createBufferStrategy(3);
//            return;
//        }
//
//        Graphics g = bs.getDrawGraphics();
//
//        g.drawImage(image,0,0, getWidth(), getHeight(), this);
//
//        g.dispose();
//        bs.show();
    }
}