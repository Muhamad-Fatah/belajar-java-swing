import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Belajar Java Swing");
        frame.setSize(500, 500);

        // MAIN LAYOUT
        // Digunakan untuk switch antar panel
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        FormPanel formPanel = new FormPanel(cardLayout, mainPanel);
        ListPanel listPanel = new ListPanel(cardLayout, mainPanel);

        // frame.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(listPanel, "list");
        mainPanel.add(formPanel, "form");

        frame.add(mainPanel);

        frame.setVisible(true);
    }
}