import javax.swing.*;
import java.awt.*;

public class ListPanel extends JPanel {
    public ListPanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout(8, 8));
        setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));

        // TITLE & FORM BUTTON
        JLabel title = new JLabel("Daftar mahasiswa");
        add(title, BorderLayout.WEST);
        JButton createBtn = new JButton("Tambah mahasiswa");
        createBtn.addActionListener(_ -> cardLayout.show(mainPanel, "form"));
        add(createBtn, BorderLayout.EAST);

        // TABLE DATA
        String[] columns = { "NIM", "Nama", "Jurusan" };
        Object[][] data = {
                { "1", "Andi", "Informatika" },
                { "2", "Budi", "Sistem Informasi" },
                { "3", "Cici", "Teknik Informatika" }
        };
        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.SOUTH);
    }
}
