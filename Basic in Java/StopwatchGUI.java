import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchGUI {
    private long startTime;
    private Timer timer;
    private boolean running;

    private JFrame frame;
    private JLabel timerLabel;

    public StopwatchGUI() {
        // Set up the window
        frame = new JFrame("Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Set background color for the window
        frame.getContentPane().setBackground(Color.YELLOW);

        // Set up the label to display time
        timerLabel = new JLabel("Elapsed time: 0.0 seconds", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Serif", Font.BOLD, 24));
        timerLabel.setForeground(Color.BLACK); // Set font color to green
        frame.add(timerLabel, BorderLayout.CENTER);

        // Create a start button with custom color
        JButton startButton = new JButton("Start");
        startButton.setBackground(Color.GREEN);
        startButton.setForeground(Color.WHITE); // White text on black background
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });

        // Create a stop button with custom color
        JButton stopButton = new JButton("Stop");
        stopButton.setBackground(Color.RED);
        stopButton.setForeground(Color.WHITE); // White text on red background
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });

        // Create a panel for buttons and add them
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.GRAY); // Set background color for button panel
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Set the window to be visible
        frame.setVisible(true);

        // Timer to update the display every 100 milliseconds
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateElapsedTime();
            }
        });
    }

    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
            timer.start();
        }
    }

    public void stop() {
        if (running) {
            timer.stop();
            running = false;
        }
    }

    private void updateElapsedTime() {
        if (running) {
            long currentTime = System.currentTimeMillis();
            double elapsedSeconds = (currentTime - startTime) / 1000.0;
            timerLabel.setText(String.format("Elapsed time: %.1f seconds", elapsedSeconds));
        }
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopwatchGUI();
            }
        });
    }
}
