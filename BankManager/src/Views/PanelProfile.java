package Views;

import Model.Login;

import javax.swing.*;
import java.awt.*;

public class PanelProfile extends JPanel
{
    private Image img_woman = new ImageIcon(Login.class.getResource("/Res/avatar_woman.png")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
    private Image img_man = new ImageIcon(Login.class.getResource("/Res/avatar_man.png")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
    public PanelProfile()
    {
        this.setLayout(new BorderLayout(50,0));
        JPanel panelWest = new JPanel();
        panelWest.setPreferredSize(new Dimension(200,0));
        JPanel panelEast = new JPanel();
        panelEast.setPreferredSize(new Dimension(200,0));
        this.add(panelWest, "West");
        this.add(panelEast, "East");

        JLabel lblAvatar = new JLabel("");
//        lblAvatar.setHorizontalAlignment(SwingConstants.CENTER);
        if(new Login().CheckGender(LoginFrame.accountNumber))
            lblAvatar.setIcon(new ImageIcon(img_man));
        else lblAvatar.setIcon(new ImageIcon(img_woman));


        JPanel panelAvatar = new JPanel();
        panelAvatar.setBackground(Color.WHITE);
        panelAvatar.setLayout(new BoxLayout(panelAvatar, BoxLayout.X_AXIS));
        panelAvatar.add(Box.createRigidArea(new Dimension(110,0)));
        panelAvatar.add(lblAvatar);

        JPanel panelMain = new JPanel();
        panelMain.setBackground(Color.WHITE);
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(Box.createRigidArea(new Dimension(0,20)));
        panelMain.add(panelAvatar);

        JLabel lblProfile = new JLabel("Thông tin cá nhân");
        lblProfile.setLocation(0,20);
        lblProfile.setForeground(Color.BLACK);
        lblProfile.setFont(new Font("Arial", Font.BOLD, 20));
        panelMain.add(Box.createRigidArea(new Dimension(0,20)));
        panelMain.add(lblProfile);
        JPanel panelFullName = new RadiusAndShadow();
        this.add(panelMain, "Center");
    }
}
