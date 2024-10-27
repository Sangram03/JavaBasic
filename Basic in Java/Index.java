import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Index {
    private JFrame frame;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton saveButton, clearButton;

    public Index() {
        // Create the frame
        frame = new JFrame("Writing Pad");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create text area
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 18));

        // Create scroll pane for text area
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Create buttons
        saveButton = new JButton("Save");
        clearButton = new JButton("Clear");

        // Panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);

        // Add listeners to buttons
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveText();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearText();
            }
        });

        // Add components to the frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Set frame visible
        frame.setVisible(true);
    }

    // Save text to file
    private void saveText() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(frame);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(textArea.getText());
                JOptionPane.showMessageDialog(frame, "File saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error saving file.");
            }
        }
    }

    // Clear text from the text area
    private void clearText() {
        int option = JOptionPane.showConfirmDialog(frame, "Are you sure you want to clear all text?", "Clear Text", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            textArea.setText("");
        }
    }

    public static void main(String[] args) {
        // Create and run the writing pad application
        SwingUtilities.invokeLater(() -> new Index());
    }
}