package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;


public class PanelService extends JPanel
{
    private FlowLayout flowLayout = new FlowLayout();

    public PanelService()
    {
        this.setLayout(new BorderLayout(0, 0));

        flowLayout.setAlignment(FlowLayout.CENTER);
        flowLayout.setHgap(80);
        flowLayout.setVgap(40);


        JPanel panelHeader = new JPanel();
        panelHeader.setLayout(flowLayout);
        this.add(panelHeader, "North");

        JPanel panelFooter = new JPanel();
        panelFooter.setBackground(Color.WHITE);
        panelFooter.setLayout(new BorderLayout(0,0));
        panelFooter.setVisible(false);
        this.add(panelFooter, "South");

        PanelTransfer transfer = new PanelTransfer();
        transfer.setVisible(false);
        this.add(transfer, "Center");

        JPanel panelMessage = new JPanel();
        panelMessage.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
        panelMessage.setBackground(Color.WHITE);
        panelMessage.setPreferredSize(new Dimension(500,30));
        panelFooter.add(panelMessage, "North");

        JLabel lblMessage = new JLabel("Số tài khoản không tồn tại");
        lblMessage.setForeground(Color.RED);
        lblMessage.setFont(new Font("Arial", Font.BOLD, 12));
        lblMessage.setVisible(false);
        panelMessage.add(lblMessage);


        JPanel footer = new JPanel();
        footer.setBackground(Color.WHITE);
        footer.setLayout(flowLayout);
        panelFooter.add(footer, "Center");


        JPanel panelCancel = new TestDropShadowBorder.RoundedPane();
        panelCancel.setBackground(new Color(86, 109, 184));
        panelCancel.add(new JLabel("Cancel"));
        panelCancel.setOpaque(false);
        panelCancel.addMouseListener(new PanelButtonMouseAdapter(panelCancel, 86, 109, 184)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                transfer.setVisible(false);
                panelFooter.setVisible(false);
            }
        });
        panelCancel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelCancel.setPreferredSize(new Dimension(170, 50));
        footer.add(panelCancel);

        JPanel panelConfirm = new TestDropShadowBorder.RoundedPane();
        panelConfirm.setBackground(new Color(55, 119, 34));
        panelConfirm.add(new JLabel("Confirm"));
        panelConfirm.setOpaque(false);
        panelConfirm.addMouseListener(new PanelButtonMouseAdapter(panelConfirm,55, 119, 34)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                lblMessage.setVisible(true);
            }
        });
        panelConfirm.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelConfirm.setPreferredSize(new Dimension(170, 50));
        footer.add(panelConfirm);


        JPanel panelTransfer = new TestDropShadowBorder.RoundedPane();
        panelTransfer.setBackground(new Color(222, 123, 77));
        panelTransfer.add(new JLabel("Transfer"));
//        panelTransfer.setOpaque(false);
        panelTransfer.addMouseListener(new PanelButtonMouseAdapter(panelTransfer, 222, 123, 77)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                lblMessage.setVisible(false);
                transfer.setVisible(true);
                panelFooter.setVisible(true);
            }
        });
        panelTransfer.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelTransfer.setPreferredSize(new Dimension(170, 80));
        panelHeader.add(panelTransfer);

        JPanel panelRecharge = new TestDropShadowBorder.RoundedPane();
        panelRecharge.setBackground(new Color(58, 206, 132));
        panelRecharge.add(new JLabel("Recharge"));
        panelRecharge.setOpaque(false);
        panelRecharge.addMouseListener(new PanelButtonMouseAdapter(panelRecharge, 58, 206, 132)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
        panelRecharge.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelRecharge.setPreferredSize(new Dimension(170, 80));
        panelHeader.add(panelRecharge);

        JPanel panelWithdraw = new TestDropShadowBorder.RoundedPane();
        panelWithdraw.setBackground(new Color(217, 77, 131));
        panelWithdraw.add(new JLabel("Withdraw"));
        panelWithdraw.setOpaque(false);
        panelWithdraw.addMouseListener(new PanelButtonMouseAdapter(panelWithdraw, 217, 77, 131)
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }
        });
        panelWithdraw.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelWithdraw.setPreferredSize(new Dimension(170, 80));
        panelHeader.add(panelWithdraw);

    }
}

