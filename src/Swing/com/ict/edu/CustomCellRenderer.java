package Swing.com.ict.edu;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class CustomCellRenderer extends DefaultTableCellRenderer {
	
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Customize the cell background color based on row and column values
        if (row % 2 == 0) {
            // Set even row background color
            component.setBackground(Color.YELLOW);
        } else {
            // Set odd row background color
            component.setBackground(Color.CYAN);
        }

        // Customize the cell foreground (text) color
        component.setForeground(Color.BLACK);

        return component;
    }
    
}