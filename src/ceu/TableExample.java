package ceu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableExample extends JFrame {

    private JTable table;

    public TableExample() {
        setTitle("Testing Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        // Create a panel to hold the table
        JPanel panel = new JPanel();

        // Create the table model with 4 columns and 0 rows initially
        DefaultTableModel model = new DefaultTableModel(0, 4) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 3; // Make all cells non-editable except for column 4
            }
        };

        // Set column headers
        String[] headers = {"Employee Name", "Department", "Type of Leave", ""};
        model.setColumnIdentifiers(headers);

        // Populate the table with 20 rows
        for (int i = 0; i < 20; i++) {
            model.addRow(new Object[]{"Francisco, Earl Ace", "Library", "Vacation", "/images/icons8-eye-24.png"});
        }
       
        // Create the table with the model
        table = new JTable(model);

        // Set the row height to 40 pixels
        table.setRowHeight(40);

        // Disable cell selection
        table.setCellSelectionEnabled(false);

        // Set a custom renderer and editor for the button column (Column 4)
        int buttonColumn = 3;
        table.getColumnModel().getColumn(buttonColumn).setCellRenderer(new ButtonRenderer());
        table.getColumnModel().getColumn(buttonColumn).setCellEditor(new ButtonEditor(new JCheckBox()));

        // Add the table to a scroll pane with only vertical scrollbar
        JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Add the scroll pane to the panel
        panel.add(scrollPane);

        // Add the panel to the frame
        add(panel);

        // Set the frame to be visible
        setVisible(true);
    }

    private static class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(false);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setIcon(new ImageIcon(getClass().getResource((String) value)));
            setText(null);
            return this;
        }
    }

    private static class ButtonEditor extends DefaultCellEditor {

        private JButton button;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setIcon(new ImageIcon(getClass().getResource(("/images/icons8-eye-24.png"))));
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return button.getIcon();
        }
    }

    public static void main(String[] args) {
        // Run the application on the event dispatch thread
        SwingUtilities.invokeLater(() -> new TableExample());
    }
}
