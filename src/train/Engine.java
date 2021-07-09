package train;

import comp127graphics.Rectangle;

import java.awt.*;

public class Engine extends TrainCar {

    public Engine(Color col ) {
        super(col);

    }
    private void drawEngine(double x, double y) {
      //  drawCarFrame(x, y, Color.BLACK);
        drawSmokestack(x, y);
      //  drawEngineCab(x, y);
       // drawCowcatcher(x, y);
    }
    private void drawSmokestack(double x, double y) {
        // You fill this in //
        double xLeft = x + SMOKESTACK_INSET + CONNECTOR;
        double yTop = y-CAR_BASELINE-CAR_HEIGHT-SMOKESTACK_HEIGHT;
        comp127graphics.Rectangle smokestack = new Rectangle(xLeft, yTop , SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
        smokestack.setFillColor(Color.BLACK);
        smokestack.setFilled(true);
    //    canvas.add(smokestack);

    }
}
