package Views;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class PanelIndex extends JPanel
{
    public PanelIndex()
    {
        this.setLayout(new BorderLayout(0,0));

        JPanel panelTitle = new JPanel();
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));

        JLabel lblTitle = new JLabel();
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setText("TRANG CHỦ");
        lblTitle.setForeground(Color.BLACK);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
        panelTitle.add(lblTitle);

        this.add(panelTitle, "North");

        JPanel panelClock = new Clock(Color.WHITE);

        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        panelSouth.add(panelClock);

        this.add(panelSouth, "South");

    }
}
