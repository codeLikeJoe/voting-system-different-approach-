import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Login extends JFrame {
    private JPanel framePanel;
    private JPanel NorthPanel;
    private JPanel middelPanel;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JLabel userNameLabel;
    private JLabel passWordLabel;
    private JButton loginButton;

    static JFrame frame = new JFrame("Login");

    Accumulator accumulator = new Accumulator();

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> allUserName = accumulator.getUserName();
                ArrayList<String> allPassword = accumulator.getPassword();
                if (textField1.getText().equals("") && passwordField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter username and password");
                } else {
                    allUserName.add(textField1.getText());
                    allPassword.add(passwordField1.getText());
                    accumulator.setUserName(allUserName);
                    accumulator.setPassword(allPassword);
                    frame.dispose();
                    new Presidential();
                }
            }
        });
    }

    //creating a method to generate a menubar
    private static JMenuBar createMenubar() {
        JMenuBar menuBar = new JMenuBar();

        //create menus to add to the menubar
        JMenu fileMenu = new JMenu("File");
        JMenu displayMenu = new JMenu("Display");
        JMenu helpMenu = new JMenu("Help");

        // create menu items to be added to the file menu
        JMenuItem addMenuItem = new JMenuItem("Add");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // create menu items to be added to the display menu
        JMenuItem resultMenuItem = new JMenuItem("Result");

        // create menu items to be added to the about menu
        JMenuItem aboutMenuItem = new JMenuItem("About");

        fileMenu.add(addMenuItem);
        fileMenu.add(exitMenuItem);

        displayMenu.add(resultMenuItem);

        helpMenu.add(aboutMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(displayMenu);
        menuBar.add(helpMenu);

        //set mnemonics
        fileMenu.setMnemonic(KeyEvent.VK_F);
        displayMenu.setMnemonic(KeyEvent.VK_D);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        addMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Revote();
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        resultMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Result();
            }
        });

        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new AboutUs();
            }
        });

        return menuBar;
    }

    public static void main(String[] args) {
        frame.setContentPane(new Login().framePanel);
        frame.setJMenuBar(createMenubar());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
