import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.*;
import java.awt.*;
import db.DBconnection;

public class Main2 {

    public static void main(String[] args) {

        // Setup FlatLaf dark theme
        try {
            FlatDarkLaf.setup();
            UIManager.put("Button.arc", 20);
            UIManager.put("Component.focusWidth", 1);
        } catch (Exception e) {
            System.err.println("Failed to initialize FlatLaf");
        }

        // Run GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(Main2::showWelcomePage);
    }

    // --- SCREEN: WELCOME PAGE ---
    private static void showWelcomePage() {
        OpenForm open = new OpenForm();

        // Go to Login
        open.btnBegin.addActionListener(e -> {
            Point pos = open.getLocation();
            open.dispose();
            showLoginPage(pos);
        });

        // Contact Popup
        open.btnContact.addActionListener(e -> {
            Contact dialog = new Contact(open);
            dialog.setVisible(true);
        });

        open.setVisible(true);
    }

    // --- SCREEN: LOGIN PAGE ---
    private static void showLoginPage(Point pos) {
        LoginForm loginForm = new LoginForm();
        loginForm.setLocation(pos);

        // Handle Login Action
        loginForm.btnLogin.addActionListener(e -> handleLogin(loginForm));

        // Go to Register
        loginForm.btnRegister.addActionListener(e -> {
            Point currentPos = loginForm.getLocation();
            loginForm.dispose();
            showRegisterForm(currentPos);
        });

        loginForm.setVisible(true);
    }

    // --- LOGIC: LOGIN VALIDATION ---
    private static void handleLogin(LoginForm form) {
        String user = form.txtUser.getText();
        String pass = new String(form.txtPass.getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            form.txtUser.putClientProperty(FlatClientProperties.OUTLINE, user.isEmpty() ? "error" : null);
            form.txtPass.putClientProperty(FlatClientProperties.OUTLINE, pass.isEmpty() ? "error" : null);
            JOptionPane.showMessageDialog(form, "Please fill all fields.", "Login Error", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("Login attempt: " + user);

        }
    }

    private static void showRegisterForm(Point pos) {
        // 1. Create the RegisterForm instance
        RegisterForm regForm = new RegisterForm();

        // 2. Set position
        regForm.setLocation(pos);

        // 3. Make it visible
        regForm.setVisible(true);

        // 4. Attach Submit button listener from Main form
        regForm.btnSubmit.addActionListener(e -> {
            System.out.println("Register button clicked from Main!"); // Debug
            regForm.btnSubmitActionPerformed(e);                     // Call your method
        });

        // 5. Back button
        regForm.btnBack.addActionListener(e -> {
            Point currentPos = regForm.getLocation();
            regForm.dispose();
            showLoginPage(currentPos); // call your login page
        });
    }


}
