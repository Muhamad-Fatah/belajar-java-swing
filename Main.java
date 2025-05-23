import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Belajar Java Swing");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        // FORM
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // TITLE
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel judul = new JLabel("Belajar Form UI");
        formPanel.add(judul, gbc);

        // LABEL NAME
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel nameLabel = new JLabel("Name: ");
        formPanel.add(nameLabel, gbc);
        // FIELD NAME
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField nameField = new JTextField(15);
        formPanel.add(nameField, gbc);

        // LABEL NIM
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel nimLabel = new JLabel("NIM: ");
        formPanel.add(nimLabel, gbc);
        // FIELD NIM
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField nimField = new JTextField(15);
        formPanel.add(nimField, gbc);

        // LABEL JURUSAN
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jurusanLabel = new JLabel("Jurusan: ");
        formPanel.add(jurusanLabel, gbc);
        // FIELD JURUSAN
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField jurusanField = new JTextField(15);
        formPanel.add(jurusanField, gbc);

        // SUBMIT BUTTON
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        JButton submitButton = new JButton("Submit");
        formPanel.add(submitButton, gbc);

        frame.add(formPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}