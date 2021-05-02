package Views;

import javax.swing.*;
import java.awt.*;


public class PanelTransfer extends JPanel
{

    public PanelTransfer()
    {
        JPanel containAccountNumber = new JPanel();
        containAccountNumber.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));

        JPanel accountNumber = new RoundedPane();
        accountNumber.setBackground(Color.WHITE);
        accountNumber.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 8));
        containAccountNumber.add(accountNumber);

        JTextField txtAccountNumber = new JTextField();
        txtAccountNumber.setBackground(Color.WHITE);
        txtAccountNumber.setBorder(null);
        txtAccountNumber.setColumns(25);
        txtAccountNumber.setFont(new Font("Arial", Font.PLAIN, 12));
        accountNumber.add(txtAccountNumber);

        JPanel containAmount = new JPanel();
        containAmount.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));

        JPanel amount = new RoundedPane();
        amount.setBackground(Color.WHITE);
        amount.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 8));
        containAmount.add(amount);

        JTextField txtAmount = new JTextField();
        txtAmount.setBackground(Color.WHITE);
        txtAmount.setBorder(null);
        txtAmount.setColumns(25);
        txtAmount.setFont(new Font("Arial", Font.PLAIN, 12));
        amount.add(txtAmount);

        JPanel containContent = new JPanel();
        containContent.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 10));

        JPanel content = new RoundedPane();
        content.setBackground(Color.WHITE);
        content.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 8));
        containContent.add(content);

        JTextArea txtContent = new JTextArea();
        txtContent.setBackground(Color.WHITE);
        txtContent.setLineWrap(true);
        txtContent.setBorder(null);
        txtContent.setRows(15);
        txtContent.setColumns(25);
        txtContent.setFont(new Font("Arial", Font.PLAIN, 12));
        content.add(txtContent);

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(new JLabel("Enter account number need transfer"), gbc);
        gbc.gridx += 1;
        this.add(containAccountNumber, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        this.add(new JLabel("Amount"), gbc);
        gbc.gridx += 1;
        this.add(containAmount, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        this.add(new JLabel("Content"), gbc);
        gbc.gridx += 1;
        this.add(containContent, gbc);
    }
}
