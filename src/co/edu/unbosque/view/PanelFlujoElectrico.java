package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelFlujoElectrico extends JPanel
{
    
    public PanelFlujoElectrico() {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents() {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Bienvenida");
        tb.setTitleFont(font);
        setBorder(tb);;
    }
}
