import java.awt.*;
import java.util.Random;

public class GPS {
    private int row;
    private int col;
    private Color color;
    private int size = 50;

    public GPS (int row, int col, Color color){
        //Random rand = new Random();
        //this.row = rand.nextInt(2);
        this.row = 7;
        //this.col   = rand.nextInt(2);
        this.col = 0;
        this.color = color;
    }

    public void render(Graphics g){

        int X    = this.col * size;
        int Y    = this.row * size;

        g.setColor(this.color);
        g.fillRect(X, Y, size, size);
    }
}