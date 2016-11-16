package client;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Toolkit;

import java.util.Random;

public class Class1 extends Canvas implements Runnable {
    public Class1(GraphicsConfiguration graphicsConfiguration) {
        super(graphicsConfiguration);
    }

    public Class1() {
        super();
        Thread t=new Thread(this);
        t.start();
        
        Thread t2=new Thread(new Class2());
        t2.start();
    }
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        
        Image taust=Toolkit.getDefaultToolkit().getImage("rohetaust320x480.gif");
                g2.drawImage(taust, x5, y5, 320, 480, this);
                
        Image taust2=Toolkit.getDefaultToolkit().getImage("rohetaust320x480.gif");
                g2.drawImage(taust2, x5, y5-480, 320, 480, this);
                
        g2.setColor(Color.BLUE);
                g2.fillOval(100, 100, 20,20);
                
                g2.setColor(Color.PINK);
                g2.fillRect(150, 200, 40, 40);
                
        g2.setColor(Color.cyan);
        g2.fillRect(120, 120 ,60, 60);
                
                
        g2.setColor(Color.YELLOW);
        g2.fillRect(NewJFrame.x, NewJFrame.y, 20, 20);
                
        g2.setColor(Color.BLACK);
        g2.drawRect(150, 200, 40, 40);
        
        lilleke=Toolkit.getDefaultToolkit().getImage("lilleke.gif");
                g2.drawImage(lilleke, x4, y4, 70, 70, this);
        
        liblikas1=Toolkit.getDefaultToolkit().getImage("Blue_butterfly_2.gif");
                g2.drawImage(liblikas1, NewJFrame.x1, NewJFrame.y1, 70, 70, this);
                
                

    }
    
    
    Image liblikas1;
    Image lilleke;
    static int x4=0;
   static int y4=0;
    int x5=0;
    static int y5=0;

    @Override
    public void run() {
        // TODO Implement this method
        Random arv= new Random();
        
        while(true){
        x4=arv.nextInt(320-70);
        y4=arv.nextInt(480-70);
            
          
            
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Katkes");
            }
        }
        
    }
}









