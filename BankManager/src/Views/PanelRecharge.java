package Views;

import javax.swing.*;
import java.awt.*;

public class PanelRecharge extends JPanel
{
    public PanelRecharge()
    {

        JPanel containAccountNumber = new JPanel();
        containAccountNumber.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JPanel accountNumber = new RadiusAndShadow();
        accountNumber.setBackground(Color.WHITE);
        accountNumber.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        containAccountNumber.add(accountNumber);


        JTextField txtAccountNumber = new JTextField();
        txtAccountNumber.setFocusable(false);
        txtAccountNumber.setForeground(Color.GRAY);
        txtAccountNumber.setText("Số tài khoản nạp tiền");
        txtAccountNumber.setBackground(Color.WHITE);
        txtAccountNumber.setBorder(null);
        txtAccountNumber.setColumns(25);
        txtAccountNumber.setFont(new Font("Arial", Font.PLAIN, 12));
        accountNumber.add(txtAccountNumber);


        JPanel containAmount = new JPanel();
        containAmount.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JPanel amount = new RadiusAndShadow();
        amount.setBackground(Color.WHITE);
        amount.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        containAmount.add(amount);


        JTextField txtAmount = new JTextField();
        txtAmount.setBackground(Color.WHITE);
        txtAmount.setBorder(null);
        txtAmount.setColumns(25);
        txtAmount.setFont(new Font("Arial", Font.PLAIN, 12));
        amount.add(txtAmount);

        JPanel containContent = new JPanel();
        containContent.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JPanel content = new RadiusAndShadow();
        content.setBackground(Color.WHITE);
        content.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        containContent.add(content);

        JTextArea txtContent = new JTextArea();
        txtContent.setBackground(Color.WHITE);
        txtContent.setLineWrap(true);
        txtContent.setBorder(null);
        txtContent.setRows(15);
        txtContent.setColumns(25);
        txtContent.setFont(new Font("Arial", Font.PLAIN, 12));
        content.add(txtContent);


        JPanel panelTextAccount = new JPanel();
        panelTextAccount.add(new JLabel("Account number received"));
        panelTextAccount.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));

        JPanel panelTextAmount = new JPanel();
        panelTextAmount.add(new JLabel("Amount"));
        panelTextAmount.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));

        JPanel panelTextContent = new JPanel();
        panelTextContent.add(new JLabel("Content"));
        panelTextContent.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        this.add(panelTextAccount, gbc);
        gbc.gridx += 1;
        this.add(containAccountNumber, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        this.add(panelTextAmount, gbc);
        gbc.gridx += 1;
        this.add(containAmount, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        this.add(panelTextContent, gbc);
        gbc.gridx += 1;
        this.add(containContent, gbc);
    }
}
