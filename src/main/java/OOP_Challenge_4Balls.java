import processing.core.PApplet;

public class OOP_Challenge_4Balls extends PApplet {

    public static final int HEIGHT = 720;
    public static final int WIDTH = 720;
    public static Ball balls[]=new Ball[4];

    public static void main(String[] args) {
        PApplet.main("OOP_Challenge_4Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        // initialising ball objects
        for (int ball = 0; ball < 4; ball++) {
            balls[ball]=new Ball(speed(ball),(speed(ball))*HEIGHT/5);
        }
    }

    private int speed(int ball) {
        return ball + 1;
    }

    @Override
    public void draw() {
        for (int ball = 0; ball < 4; ball++) {
            balls[ball].moveBall(this);
        }
    }
}
