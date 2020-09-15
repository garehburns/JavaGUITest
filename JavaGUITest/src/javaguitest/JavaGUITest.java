package javaguitest;

import java.awt.*;

public class JavaGUITest {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            NewJFrame window = new NewJFrame();
            window.setVisible(true);
        });
    }
    
}
