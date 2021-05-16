package Views;

import Model.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelProfile extends JPanel
{
    public static Image img_woman = new ImageIcon(PanelProfile.class.getResource("/Res/avatar_woman.png")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
    public static Image img_man = new ImageIcon(PanelProfile.class.getResource("/Res/avatar_man.png")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
    public static JLabel lblAvatar;
    public static JPanel panelAvatar;

    public PanelProfile()
    {
        this.setLayout(new BorderLayout(100,0));
        JPanel panelWest = new JPanel();
        panelWest.setPreferredSize(new Dimension(200,0));
        JPanel panelEast = new JPanel();
        panelEast.setPreferredSize(new Dimension(200,0));
        this.add(panelWest, "West");
        this.add(panelEast, "East");

        JPanel panelHeader = new JPanel();
        panelHeader.setLayout(new BoxLayout(panelHeader, BoxLayout.Y_AXIS));
        panelHeader.setBackground(Color.WHITE);

        lblAvatar = new JLabel("");
        if(new Login().CheckGender(LoginFrame.username))
            lblAvatar.setIcon(new ImageIcon(img_man));
        else lblAvatar.setIcon(new ImageIcon(img_woman));

        panelAvatar = new JPanel();
        panelAvatar.setBackground(Color.WHITE);
        panelAvatar.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
        panelAvatar.add(lblAvatar);

        JLabel lblProfile = new JLabel("hoanglong");
        lblProfile.setForeground(Color.BLACK);
        lblProfile.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel panelProfile = new JPanel();
        panelProfile.setBackground(Color.WHITE);
        panelProfile.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        panelProfile.add(lblProfile);

        panelHeader.add(panelAvatar);
        panelHeader.add(Box.createRigidArea(new Dimension(0, 20)));
        panelHeader.add(panelProfile);

        JPanel panelMain = new JPanel();
        panelMain.setBackground(Color.WHITE);
        panelMain.setLayout(new BorderLayout(50,50));
        panelMain.add(panelHeader, "North");

        this.add(panelMain, "Center");

        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(Color.WHITE);
        panelMain.add(panelLeft, "West");
        JPanel panelRight = new JPanel();
        panelRight.setBackground(Color.WHITE);
        panelMain.add(panelRight, "East");


        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        panelCenter.setBackground(Color.WHITE);
        panelMain.add(panelCenter, "Center");

        JPanel panelInformation = new RadiusAndShadow();
        panelInformation.setPreferredSize(new Dimension(400,200));
        panelInformation.setBackground(Color.GRAY);
        panelInformation.setLayout(new GridBagLayout());
        panelCenter.add(panelInformation);

        JLabel lblFullName = new JLabel("VO DOAN HOANG LONG");
        lblFullName.setForeground(Color.BLACK);
        lblFullName.setFont(new Font("Arial", Font.BOLD, 15));


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(10,10,10,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panelInformation.add(lblFullName, gbc);


        JLabel lblAccountNumber = new JLabel("21302191932290");
        lblAccountNumber.setForeground(Color.BLACK);
        lblAccountNumber.setFont(new Font("Arial", Font.BOLD, 15));
        gbc.gridy = 1;
        panelInformation.add(lblAccountNumber, gbc);

        JPanel pnlBalance = new JPanel();
        pnlBalance.setBackground(Color.WHITE);
        pnlBalance.setLayout(new BoxLayout(pnlBalance, BoxLayout.X_AXIS));
        gbc.gridy = 2;
        panelInformation.add(pnlBalance, gbc);

        JLabel lblBalance = new JLabel("100.000.000.000.000");
        lblBalance.setForeground(Color.black);
        lblBalance.setFont(new Font("Arial", Font.BOLD, 15));
        pnlBalance.add(lblBalance);
        pnlBalance.add(Box.createHorizontalGlue());
        JLabel lblVND = new JLabel("VNĐ");
        lblVND.setForeground(Color.BLACK);
        lblVND.setFont(new Font("Arial", Font.BOLD, 15));
        pnlBalance.add(lblVND);

        JLabel lblDate = new JLabel("20/05/2021");
        lblDate.setForeground(Color.black);
        lblDate.setFont(new Font("Arial", Font.BOLD, 15));
        gbc.gridy = 3;
        panelInformation.add(lblDate, gbc);

        JPanel panelFooter = new JPanel();
        panelFooter.setLayout(new GridBagLayout());
        panelFooter.setBackground(Color.WHITE);
        panelFooter.setPreferredSize(new Dimension(0, 100));
        panelMain.add(panelFooter, "South");

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(0,50,40,50);
        gridBagConstraints.weighty = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        JPanel panelEditInf = new RadiusAndShadow();
        panelEditInf.setBackground(Color.GRAY);
        panelEditInf.add(new JLabel("Chỉnh sửa thông tin"));
        panelEditInf.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                new EditProfile().setVisible(true);
            }
        });
        panelFooter.add(panelEditInf, gridBagConstraints);

        gridBagConstraints.gridx = 2;

        JPanel panelEditPassword = new RadiusAndShadow();
        panelEditPassword.setBackground(Color.GRAY);
        panelEditPassword.add(new JLabel("Chỉnh sửa mật khẩu"));
        panelEditPassword.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                new EditPassword().setVisible(true);
            }
        });
        panelFooter.add(panelEditPassword, gridBagConstraints);
    }
}
