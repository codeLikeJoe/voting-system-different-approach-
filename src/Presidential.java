import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presidential extends JFrame {
    private JPanel mainFrame;
    private JButton voteButton;
    private JButton voteButton2;

    static JFrame frame = new JFrame("Presidential Vote");

    Accumulator accumulator = new Accumulator();

    public Presidential() {
        frame.add(mainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);

        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pres = accumulator.getPres1();
                accumulator.setPres1(pres + 1);
                frame.dispose();
                new Secertaries();
            }
        });

        voteButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pres = accumulator.getPres2();
                accumulator.setPres2(pres + 1);
                frame.dispose();
                new Secertaries();
            }
        });
    }

}
