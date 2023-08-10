import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Result extends JFrame {
    private JPanel ResultFrame;
    private JLabel pres1Label;
    private JLabel pres2Label;
    private JLabel sec1Label;
    private JLabel sec2Label;
    private JLabel sec3Label;
    private JLabel tre1Label;
    private JLabel tre2Label;

    static JFrame frame = new JFrame("Result");

    Accumulator accumulator = new Accumulator();

    public Result() {
        frame.add(ResultFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 1000);
        frame.setJMenuBar(createMenubar());
        frame.setVisible(true);

        pres1Label.setText(String.valueOf(accumulator.getPres1()));
        pres2Label.setText(String.valueOf(accumulator.getPres2()));
        sec1Label.setText(String.valueOf(accumulator.getSec1()));
        sec2Label.setText(String.valueOf(accumulator.getSec2()));
        sec3Label.setText(String.valueOf(accumulator.getSec3()));
        tre1Label.setText(String.valueOf(accumulator.getTres1()));
        tre2Label.setText(String.valueOf(accumulator.getTres2()));
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

}
