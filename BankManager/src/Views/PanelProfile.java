package Views;

import javax.swing.*;
import java.awt.*;

public class PanelProfile extends JPanel
{
    public PanelProfile()
    {
        this.setLayout(new BorderLayout(0,0));
        this.add(new JPanel(), "West");
        this.add(new JPanel(), "East");

        JPanel panelMain = new RadiusAndShadow();
        panelMain.setBackground(Color.WHITE);
        panelMain.setPreferredSize(new Dimension(300,0));
        this.add(panelMain, "Center");
    }
}
