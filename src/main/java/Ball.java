import processing.core.PApplet;

public class Ball extends PApplet{
    private int speed;
    private final int height;
    private final int DIAMETER;
    private int cursor;

    public Ball(int speed, int height) {

        this.speed = speed;
        this.height = height;
        this.DIAMETER=20;
        this.cursor=0;
    }
    public void moveBall(PApplet draw)
    {
        draw.ellipse(this.cursor,this.height,this.DIAMETER,this.DIAMETER);
        changePosition();
    }

    private void changePosition() {
        this.cursor+=this.speed;
    }

}
