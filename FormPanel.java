import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    public FormPanel(CardLayout cardLayout, JPanel mainPanel) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // TITLE
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel judul = new JLabel("Input data mahasiswa");
        add(judul, gbc);

        // LABEL NIM
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel nimLabel = new JLabel("NIM: ");
        add(nimLabel, gbc);
        // FIELD NIM
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField nimField = new JTextField(15);
        add(nimField, gbc);

        // LABEL NAME
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel nameLabel = new JLabel("Nama: ");
        add(nameLabel, gbc);
        // FIELD NAME
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField nameField = new JTextField(15);
        add(nameField, gbc);

        // LABEL JURUSAN
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jurusanLabel = new JLabel("Jurusan: ");
        add(jurusanLabel, gbc);
        // FIELD JURUSAN
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        // JTextField jurusanField = new JTextField(15);
        String[] jurusanList = { "Sistem Informasi", "Sistem Komputer", "Teknik Informatika" };
        JComboBox<String> jurusanField = new JComboBox<>(jurusanList);
        add(jurusanField, gbc);

        // Back Button
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        JButton backButton = new JButton("Cancel");
        backButton.addActionListener(_ -> cardLayout.show(mainPanel, "list"));
        add(backButton, gbc);

        // SUBMIT BUTTON
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(_ -> {
            if (nimField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "NIM tidak boleh kosong!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nameField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String nim = nimField.getText();
            String nama = nameField.getText();
            String jurusan = (String) jurusanField.getSelectedItem();
            System.out.println("Nim: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Jurusan: " + jurusan);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!", "Success", JOptionPane.INFORMATION_MESSAGE);
        });
        add(submitButton, gbc);
    }
}
