package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelService extends JPanel
{
    public PanelService()
    {
        setBounds(0,0,538,396);
        setLayout(null);


        JLabel lblCustomers = new JLabel("THIS IS SERVICE");
        lblCustomers.setForeground(new Color(0,100,0));
        lblCustomers.setFont(new Font("Tahoma", Font.BOLD, 37));
        lblCustomers.setBounds(100,139,327,112);
        this.add(lblCustomers);
    }
}
