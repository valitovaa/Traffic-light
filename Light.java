import java.awt.*;
import  java.awt.geom.*;

public class Light {
    private Color color;
    private int y;

    public Light(Color color,int y){
        this.color = color;
        this.y = y;
    }

    public void drawLight(Graphics2D g2d){
        g2d.setColor(Color.WHITE);
        g2d.fillOval(315,y-20,100,100);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillOval(315,y-8,100,100);
        g2d.setColor(color);
        g2d.fillOval(320,y,90,90);
    }

    public void drawEar(Graphics2D g2d){
        int x = 440;
        int x2 = 290;
        g2d.setColor(Color.DARK_GRAY);
        //right ear
        Path2D.Double ear = new Path2D.Double();
        ear.moveTo(x,y+59);
        ear.lineTo(x,y+4);
        ear.quadTo(x,y-1,x+5,y-1);
        ear.lineTo(x+60,y-1);
        ear.quadTo(x+65,y-1,x+65,y+6);
        ear.lineTo(x+5,y+64);
        ear.quadTo(x,y+64,x,y+59);
        g2d.fill(ear);
        //left ear
        Path2D.Double ear2 = new Path2D.Double();
        ear2.moveTo(x2,y+59);
        ear2.lineTo(x2,y+4);
        ear2.quadTo(x2,y-1,x2-5,y-1);
        ear2.lineTo(x2-60,y-1);
        ear2.quadTo(x2-65,y-1,x2-65,y+6);
        ear2.lineTo(x2-5,y+64);
        ear2.quadTo(x2,y+64,x2,y+59);
        g2d.fill(ear2);
    }

}
