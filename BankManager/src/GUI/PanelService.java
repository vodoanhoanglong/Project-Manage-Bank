package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class PanelService extends JPanel
{
    public static JPanel panelMainContent;

    public PanelService()
    {
        setBounds(0, 0, 558, 420);
        setLayout(null);

        panelMainContent = new JPanel();
        panelMainContent.setBounds(0, 0, 558, 420);
        panelMainContent.setLayout(null); // nếu k có layout sẽ năm tứ tung và có thể k xuất hiện
        this.add(panelMainContent);

        JPanel panelTransfer = new RoundedPanel(20);
        panelTransfer.setBackground(new Color(222, 123, 77));
        panelTransfer.add(new JLabel("Transfer")); // do có khởi tạo ở đây nên k setLayout(null)
        panelTransfer.setBounds(10, 30, 100, 60);
        panelTransfer.setOpaque(false);
        panelTransfer.addMouseListener(new PanelButtonMouseAdapter.PBService(panelTransfer,222, 123, 77)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                PanelTransfer transfer = new PanelTransfer();
                MenuClicked(transfer);
            }
        });
        panelMainContent.add(panelTransfer);

        JPanel panelRecharge = new RoundedPanel(20);
        panelRecharge.setBackground(new Color(58, 206, 132));
        panelRecharge.add(new JLabel("Recharge"));
        panelRecharge.setBounds(130, 30, 100, 60);
        panelRecharge.setOpaque(false);
        panelRecharge.addMouseListener(new PanelButtonMouseAdapter.PBService(panelRecharge,58, 206, 132 )
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
        panelMainContent.add(panelRecharge);

        JPanel panelWithdraw = new RoundedPanel(20);
        panelWithdraw.setBackground(new Color(217, 77, 131));
        panelWithdraw.add(new JLabel("Withdraw"));
        panelWithdraw.setBounds(250, 30, 100, 60);
        panelWithdraw.setOpaque(false);
        panelWithdraw.addMouseListener(new PanelButtonMouseAdapter.PBService(panelWithdraw,217, 77, 131)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
        panelMainContent.add(panelWithdraw);
    }


    public void MenuClicked(JPanel panel)
    {
        panelMainContent.setVisible(false);
        panel.setVisible(true);
        this.add(panel);
    }
}

