package Views;

import Model.Login;

import javax.swing.*;
import java.awt.*;

public class PanelProfile extends JPanel
{
    private Image img_woman = new ImageIcon(PanelProfile.class.getResource("/Res/avatar_woman.png")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
    private Image img_man = new ImageIcon(PanelProfile.class.getResource("/Res/avatar_man.png")).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
    private Image img_edit = new ImageIcon(PanelProfile.class.getResource("/Res/edit.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
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

        JLabel lblAvatar = new JLabel("");
        if(new Login().CheckGender(LoginFrame.accountNumber))
            lblAvatar.setIcon(new ImageIcon(img_man));
        else lblAvatar.setIcon(new ImageIcon(img_woman));

        JPanel panelAvatar = new JPanel();
        panelAvatar.setBackground(Color.WHITE);
        panelAvatar.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
        panelAvatar.add(lblAvatar);

        JLabel lblProfile = new JLabel("Thông tin cá nhân");
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
        panelMain.setLayout(new BorderLayout());
        panelMain.add(panelHeader, "North");
        this.add(panelMain, "Center");

        JPanel panelForm = new JPanel();
        panelForm.setLayout(new GridBagLayout());
        panelForm.setBackground(Color.GRAY);
        panelMain.add(panelForm, "Center");

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(20,20,20,20);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;

        JLabel lblEdit = new JLabel("");
        lblEdit.setIcon(new ImageIcon(img_edit));

        JTextField txtFullName = new JTextField();
        txtFullName.setBackground(Color.WHITE);
        txtFullName.setBorder(null);
        txtFullName.setEditable(false);
        txtFullName.setForeground(Color.BLACK);
        txtFullName.setFont(new Font("Arial", Font.PLAIN,15));

        JPanel panelFullName = new RadiusAndShadow();
        panelFullName.setBackground(Color.WHITE);
        panelFullName.setLayout(new BoxLayout(panelFullName, BoxLayout.X_AXIS));
        panelFullName.add(txtFullName);
        panelFullName.add(Box.createHorizontalGlue());
        panelFullName.add(lblEdit);
        panelForm.add(panelFullName, gridBagConstraints);


    }
}
