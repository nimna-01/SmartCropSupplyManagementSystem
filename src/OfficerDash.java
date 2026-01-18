import javax.swing.*;

public class OfficerDash extends JFrame {

    public OfficerDash(String username) {
        setTitle("Buyer Dashboard");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lbl = new JLabel("Welcome Officer: " + username);
        lbl.setHorizontalAlignment(JLabel.CENTER);

        add(lbl);
    }
}
