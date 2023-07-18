import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Prac2 extends JFrame {

    private JLabel clockLabel;

    public DigitalClock() {
        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new BorderLayout());

        clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(JLabel.CENTER);
        clockLabel.setFont(new Font("Serif", Font.PLAIN, 20));

        this.add(clockLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int min = c.get(Calendar.MINUTE);
                int second = c.get(Calendar.SECOND);

                String clockText = Integer.toString(hour);
                clockText = clockText.concat(":");
                clockText = clockText.concat(String.format("%02d", min));
                clockText = clockText.concat(":");
                clockText = clockText.concat(String.format("%02d", second));

                clockLabel.setText(clockText);
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DigitalClock dc = new DigitalClock();
                dc.setVisible(true);
            }
        });
    }
}
