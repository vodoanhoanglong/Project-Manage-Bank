package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelTransfer extends JPanel
{
    public PanelTransfer()
    {
        setBounds(0, 0, 558, 420);
        setLayout(null);

        JPanel panel = new RoundedPanel(10, Color.RED);
        panel.add(new JLabel("Ngu")); // do có khởi tạo ở đây nên k setLayout(null)
        panel.setBounds(10, 30, 100, 60);
        panel.setOpaque(false);
        this.add(panel);

        JLabel lblBack = new JLabel("<");
        lblBack.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                PanelService.panelMainContent.setVisible(true);
                PanelTransfer.this.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent event)
            {
                lblBack.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent event)
            {
                lblBack.setForeground(Color.BLACK);
            }
        });
        lblBack.setForeground(Color.BLACK);
        lblBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lblBack.setHorizontalAlignment(SwingConstants.CENTER);
        lblBack.setBounds(0, -2, 20, 20);
        this.add(lblBack);
    }
}
