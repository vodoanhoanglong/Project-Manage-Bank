package Views;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditFrame
{
    public class EditProfile extends  JFrame
    {
        public EditProfile()
        {
            this.setLocationRelativeTo(null);
            this.setUndecorated(true);
            this.setBounds(0,0,500,500);
            JPanel mainPane = new JPanel();
            mainPane.setLayout(null);
            mainPane.setFocusable(false);
            mainPane.setBorder(null);
            this.setContentPane(mainPane);

            JPanel panelFullname = new RadiusAndShadow();
            panelFullname.setBackground(Color.WHITE);
            panelFullname.setBounds(20, 120, 260, 55);
            panelFullname.setLayout(null);
            mainPane.add(panelFullname);

            JTextField txtFullname = new JTextField();
            txtFullname.addKeyListener(new KeyAdapter()
            {
                @Override
                public void keyTyped(KeyEvent e)
                {
                    if (txtFullname.getText().length() >= 30)
                        e.consume();
                }
            });
            txtFullname.addFocusListener(new FocusAdapter()
            {
                @Override
                public void focusGained(FocusEvent e)
                {
                    if (txtFullname.getText().equals("Full Name"))
                    {
                        txtFullname.setText("");
                        ((AbstractDocument) txtFullname.getDocument()).setDocumentFilter(new DocumentFilter()
                        {
                            Pattern regEx = Pattern.compile("[\\p{L}\\s]");

                            @Override
                            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException
                            {
                                Matcher matcher = regEx.matcher(text);
                                if (!matcher.matches())
                                {
                                    lblLoginMessage.setText("Enter only text");
                                    return;
                                }
                                lblLoginMessage.setText("");
                                super.replace(fb, offset, length, text, attrs);
                            }
                        });
                    } else
                    {
                        txtFullname.selectAll();
                    }
                }

                @Override
                public void focusLost(FocusEvent focusEvent)
                {
                    if (txtFullname.getText().equals(""))
                    {
                        ((AbstractDocument) txtFullname.getDocument()).setDocumentFilter(new DocumentFilter()
                        {
                            Pattern regEx = Pattern.compile("\\D*");

                            @Override
                            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException
                            {
                                Matcher matcher = regEx.matcher(text);
                                if (!matcher.matches())
                                {
                                    return;
                                }
                                super.replace(fb, offset, length, text, attrs);
                            }
                        });
                        txtFullname.setText("Full Name");
                    }
                }
            });
            txtFullname.setBackground(Color.WHITE);
            txtFullname.setForeground(Color.GRAY);
            txtFullname.setBorder(null);
            txtFullname.setFont(new Font("Arial", Font.PLAIN, 12));
            txtFullname.setText("Full Name");
            txtFullname.setBounds(10, 10, 170, 20);
            txtFullname.setColumns(10);
            panelFullname.add(txtFullname);

            JSeparator sptFullname = new JSeparator();
            sptFullname.setForeground(Color.GRAY);
            sptFullname.setBounds(10, 35, 210, 1);
            panelFullname.add(sptFullname);
        }
    }
}
