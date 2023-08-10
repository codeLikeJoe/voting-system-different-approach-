import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tresure extends JFrame {
    private JPanel TresurePanel;
    private JButton voteButton;
    private JButton voteButton2;

    static JFrame frame = new JFrame("Treasure Vote");

    Accumulator accumulator = new Accumulator();

    public Tresure() {
        frame.add(TresurePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);

        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tres = accumulator.getTres1();
                accumulator.setTres1(tres + 1);
                frame.dispose();
                new Revote();
            }
        });

        voteButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tres = accumulator.getTres2();
                accumulator.setTres2(tres + 1);
                frame.dispose();
                new Revote();
            }
        });


    }
}
