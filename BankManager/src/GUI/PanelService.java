package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class PanelService extends JPanel
{
    public static JPanel panelMainContent;
    private FlowLayout flowLayout = new FlowLayout();
;
    public PanelService()
    {
        flowLayout.setAlignment(FlowLayout.CENTER);
        flowLayout.setHgap(80);
        flowLayout.setVgap(40);

        this.setBackground(Color.WHITE);



        panelMainContent = new JPanel();
        panelMainContent.setBackground(Color.WHITE);
        panelMainContent.setLayout(flowLayout);
        panelMainContent.setPreferredSize(new Dimension(800,150));
        this.add(panelMainContent);

        JPanel panelTransfer = new RoundedPanel(20);
        panelTransfer.setBackground(new Color(222, 123, 77));
        panelTransfer.add(new JLabel("Transfer")); // do có khởi tạo ở đây nên k setLayout(null)
        panelTransfer.setOpaque(false);
        panelTransfer.addMouseListener(new PanelButtonMouseAdapter.PBService(panelTransfer, 222, 123, 77)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                PanelTransfer transfer = new PanelTransfer();
                MenuClicked(transfer);
            }
        });
        panelTransfer.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelTransfer.setPreferredSize(new Dimension(170,80));
        panelMainContent.add(panelTransfer);

        JPanel panelRecharge = new RoundedPanel(20);
        panelRecharge.setBackground(new Color(58, 206, 132));
        panelRecharge.add(new JLabel("Recharge"));
        panelRecharge.setOpaque(false);
        panelRecharge.addMouseListener(new PanelButtonMouseAdapter.PBService(panelRecharge, 58, 206, 132)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
        panelRecharge.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelRecharge.setPreferredSize(new Dimension(170,80));
        panelMainContent.add(panelRecharge);

        JPanel panelWithdraw = new RoundedPanel(20);
        panelWithdraw.setBackground(new Color(217, 77, 131));
        panelWithdraw.add(new JLabel("Withdraw"));
        panelWithdraw.setOpaque(false);
        panelWithdraw.addMouseListener(new PanelButtonMouseAdapter.PBService(panelWithdraw, 217, 77, 131)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
        panelWithdraw.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelWithdraw.setPreferredSize(new Dimension(170,80));
        panelMainContent.add(panelWithdraw);
    }


    public void MenuClicked(JPanel panel)
    {
        panelMainContent.setVisible(false);
        panel.setVisible(true);
        this.add(panel);
    }
}

