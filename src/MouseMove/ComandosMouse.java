package MouseMove;

import java.awt.*;
import java.awt.event.InputEvent;

public class ComandosMouse {
    public static void main(String[] args) throws Exception {

        Robot robo = new Robot();

        robo.setAutoDelay(1000);

        //move o mouse para x, y
        robo.mouseMove(1200, 300);

        //pressionou o botão esquerdo 1
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        //mover mais para baixo
        robo.mouseMove(1300, 600);

        //soltar botão esquerdo 1
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        //scroll para baixo e para cima
        robo.mouseWheel(-1000);
        robo.mouseWheel(1000);

}}