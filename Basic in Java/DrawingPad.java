import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingPad extends JPanel {
    private ArrayList<Line> lines = new ArrayList<>();
    private Point startPoint = null;
    private Point endPoint = null;

    public DrawingPad() {
        // Add mouse listeners for drawing
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
                endPoint = startPoint;
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                lines.add(new Line(startPoint, endPoint));
                startPoint = null;
                endPoint = null;
                repaint();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                endPoint = e.getPoint();
                repaint();
            }
        });
    }

    // Paint the lines or the current drawing line
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        // Draw all the saved lines
        for (Line line : lines) {
            g.drawLine(line.getStart().x, line.getStart().y, line.getEnd().x, line.getEnd().y);
        }

        // Draw the current line while dragging
        if (startPoint != null && endPoint != null) {
            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }

    // Clear the drawing panel
    public void clear() {
        lines.clear();
        repaint();
    }

    // Class to store a line
    private static class Line {
        private final Point start, end;

        public Line(Point start, Point end) {
            this.start = start;
            this.end = end;
        }

        public Point getStart() {
            return start;
        }

        public Point getEnd() {
            return end;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Pad");
        DrawingPad drawingPad = new DrawingPad();

        // Create a button to clear the drawing
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawingPad.clear();
            }
        });

        // Add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(drawingPad, BorderLayout.CENTER);
        frame.add(clearButton, BorderLayout.SOUTH);

        // Frame settings
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}