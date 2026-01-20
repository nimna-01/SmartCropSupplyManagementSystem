import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        try {
            FlatDarkLaf.setup();
            UIManager.put("Button.arc", 20);
            UIManager.put("Component.focusWidth", 1);
        } catch (Exception e) {
            System.err.println("FlatLaf init failed");
        }
        SwingUtilities.invokeLater(() -> NavigationController.showWelcome(new Point(200, 200)));
    }
}
