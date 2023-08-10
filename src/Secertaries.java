import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Secertaries extends JFrame {
    private JPanel SecertariesPanel;
    private JButton voteButton;
    private JButton voteButton2;
    private JButton voteButton3;

    static JFrame frame = new JFrame("Secretaries Vote");

    Accumulator accumulator = new Accumulator();

    public Secertaries() {
        frame.add(SecertariesPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);

        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sec = accumulator.getSec1();
                accumulator.setSec1(sec + 1);
                frame.dispose();
                new Tresure();
            }
        });

        voteButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sec = accumulator.getSec2();
                accumulator.setSec2(sec + 1);
                frame.dispose();
                new Tresure();
            }
        });

        voteButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sec = accumulator.getSec3();
                accumulator.setSec3(sec + 1);
                frame.dispose();
                new Tresure();
            }
        });
    }
}
