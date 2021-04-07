import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui extends ActionListener {
    private int clicks = 0;
    JLabel label = new JLabel("Number of clicks: " + clicks);

    public Gui(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click");

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First Gui");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.clicks++;
        label.setText("Number of clicks: " + clicks);
    }
}
