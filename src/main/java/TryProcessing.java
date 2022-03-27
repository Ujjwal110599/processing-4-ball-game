import processing.core.PApplet;


public class TryProcessing extends PApplet{

    public static final int WIDTH = 648;
    public static final int HEIGHT = 486;
    public static final int diameter = 10;
    private int xCoordinate = 0;
    private int xCoordinate2 = 0;
    private int xCoordinate3 = 0;
    private int xCoordinate4 = 0;
    public static final int speed_1 = 1;
    public static final int speed_2 = 2;
    public static final int speed_3 = 3;
    public static final int speed_4 = 4;

    public static void main(String[] args)
    {PApplet.main("TryProcessing",args);}

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @java.lang.Override
    public void setup() {
    }

    @java.lang.Override
    public void draw() {
        paintWhite();
       // drawCircle();
        ellipse(xCoordinate += speed_1,HEIGHT*1/4,diameter,diameter);
        ellipse(xCoordinate2 += speed_2,HEIGHT*2/4,diameter,diameter);
        ellipse(xCoordinate3 += speed_3,HEIGHT*3/4,diameter,diameter);
        ellipse(xCoordinate4+= speed_4,HEIGHT*4/4,diameter,diameter);

    }

    private void drawCircle() {
        ellipse(mouseX,mouseY, diameter,diameter);
    }

    private void paintWhite() {
        background(255);
    }
}
