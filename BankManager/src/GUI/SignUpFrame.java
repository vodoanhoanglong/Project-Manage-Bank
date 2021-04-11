package GUI;

import DAO.Login;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUpFrame extends JFrame
{
    private JPanel contentPane;
    private JTextField txtCMND;
    private JTextField txtFullname;
    private JTextField txtPhoneNumber;
    private JTextField txtBirthDay;
    private JTextField txtAddress;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtPasswordConfirm;

    private Image img_CMND = new ImageIcon(SignUpFrame.class.getResource("/Res/CMND.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_Fullname = new ImageIcon(SignUpFrame.class.getResource("/Res/fullname.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_Phone_Number = new ImageIcon(SignUpFrame.class.getResource("/Res/phonenumber.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_Birth_Day = new ImageIcon(SignUpFrame.class.getResource("/Res/birthday.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_Address = new ImageIcon(SignUpFrame.class.getResource("/Res/address.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_Username = new ImageIcon(SignUpFrame.class.getResource("/Res/businessman.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_Password = new ImageIcon(SignUpFrame.class.getResource("/Res/padlock.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

    public SignUpFrame()
    {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();

        contentPane.setBackground(Default.color);
        contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
        contentPane.setLayout(null);
        contentPane.setFocusable(true);
        setContentPane(contentPane);

        JPanel panelCMND = new JPanel();
        panelCMND.setBackground(Default.color);
        panelCMND.setBounds(20, 50, 250, 40);
        panelCMND.setLayout(null);
        contentPane.add(panelCMND);

        txtCMND = new JTextField();
        txtCMND.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtCMND.getText().equals("Citizen identification number"))
                {
                    txtCMND.setText("");
                } else
                {
                    txtCMND.selectAll();
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent)
            {
                if (txtCMND.getText().equals(""))
                {
                    txtCMND.setText("Citizen identification number");
                }
            }
        });
        txtCMND.setBackground(Default.color);
        txtCMND.setBorder(null);
        txtCMND.setFont(new Font("Arial", Font.PLAIN, 12));
        txtCMND.setText("Citizen identification number");
        txtCMND.setBounds(10, 10, 170, 20);
        txtCMND.setColumns(10);
        panelCMND.add(txtCMND);

        JSeparator sptCMND = new JSeparator();
        sptCMND.setForeground(Color.black);
        sptCMND.setBounds(10,35,210,1);
        panelCMND.add(sptCMND);

        JLabel lblIconCMND = new JLabel("");
        lblIconCMND.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconCMND.setBounds(210, 0, 40, 40);
        lblIconCMND.setIcon(new ImageIcon(img_CMND));
        panelCMND.add(lblIconCMND);

        JPanel panelFullname = new JPanel();
        panelFullname.setBackground(Default.color);
        panelFullname.setBounds(20, 100, 250, 40);
        panelFullname.setLayout(null);
        contentPane.add(panelFullname);

        txtFullname = new JTextField();
        txtFullname.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtFullname.getText().equals("Full Name"))
                {
                    txtFullname.setText("");
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
                    txtFullname.setText("Full Name");
                }
            }
        });
        txtFullname.setBackground(Default.color);
        txtFullname.setBorder(null);
        txtFullname.setFont(new Font("Arial", Font.PLAIN, 12));
        txtFullname.setText("Full Name");
        txtFullname.setBounds(10, 10, 170, 20);
        txtFullname.setColumns(10);
        panelFullname.add(txtFullname);

        JSeparator sptFullname = new JSeparator();
        sptFullname.setForeground(Color.black);
        sptFullname.setBounds(10,35,210,1);
        panelFullname.add(sptFullname);

        JLabel lblIconFullname = new JLabel("");
        lblIconFullname.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconFullname.setBounds(210, 0, 40, 40);
        lblIconFullname.setIcon(new ImageIcon(img_Fullname));
        panelFullname.add(lblIconFullname);

        JPanel panelPhoneNumber = new JPanel();
        panelPhoneNumber.setBackground(Default.color);
        panelPhoneNumber.setBounds(20, 150, 250, 40);
        panelPhoneNumber.setLayout(null);
        contentPane.add(panelPhoneNumber);

        txtPhoneNumber = new JTextField();
        txtPhoneNumber.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtPhoneNumber.getText().equals("Phone number"))
                {
                    txtPhoneNumber.setText("");
                } else
                {
                    txtPhoneNumber.selectAll();
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent)
            {
                if (txtPhoneNumber.getText().equals(""))
                {
                    txtPhoneNumber.setText("Phone number");
                }
            }
        });
        txtPhoneNumber.setBackground(Default.color);
        txtPhoneNumber.setBorder(null);
        txtPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 12));
        txtPhoneNumber.setText("Phone number");
        txtPhoneNumber.setBounds(10, 10, 170, 20);
        txtPhoneNumber.setColumns(10);
        panelPhoneNumber.add(txtPhoneNumber);

        JSeparator sptPhoneNumber = new JSeparator();
        sptPhoneNumber.setForeground(Color.black);
        sptPhoneNumber.setBounds(10,35,210,1);
        panelPhoneNumber.add(sptPhoneNumber);

        JLabel lblIconPhoneNumber = new JLabel("");
        lblIconPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconPhoneNumber.setBounds(210, 0, 40, 40);
        lblIconPhoneNumber.setIcon(new ImageIcon(img_Phone_Number));
        panelPhoneNumber.add(lblIconPhoneNumber);

        JPanel panelBirthDay = new JPanel();
        panelBirthDay.setBackground(Default.color);
        panelBirthDay.setBounds(20, 200, 250, 40);
        panelBirthDay.setLayout(null);
        contentPane.add(panelBirthDay);

        txtBirthDay = new JTextField();
        txtBirthDay.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtBirthDay.getText().equals("Birth day"))
                {
                    txtBirthDay.setText("");
                } else
                {
                    txtBirthDay.selectAll();
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent)
            {
                if (txtBirthDay.getText().equals(""))
                {
                    txtBirthDay.setText("Birth day");
                }
            }
        });
        txtBirthDay.setBackground(Default.color);
        txtBirthDay.setBorder(null);
        txtBirthDay.setFont(new Font("Arial", Font.PLAIN, 12));
        txtBirthDay.setText("Birth day");
        txtBirthDay.setBounds(10, 10, 170, 20);
        txtBirthDay.setColumns(10);
        panelBirthDay.add(txtBirthDay);

        JSeparator sptBirthDay = new JSeparator();
        sptBirthDay.setForeground(Color.black);
        sptBirthDay.setBounds(10,35,210,1);
        panelBirthDay.add(sptBirthDay);

        JLabel lblIconBirthDay = new JLabel("");
        lblIconBirthDay.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconBirthDay.setBounds(210, 0, 40, 40);
        lblIconBirthDay.setIcon(new ImageIcon(img_Birth_Day));
        panelBirthDay.add(lblIconBirthDay);

        JPanel panelAddress = new JPanel();
        panelAddress.setBackground(Default.color);
        panelAddress.setBounds(20, 250, 250, 40);
        panelAddress.setLayout(null);
        contentPane.add(panelAddress);

        txtAddress = new JTextField();
        txtAddress.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtAddress.getText().equals("Address"))
                {
                    txtAddress.setText("");
                } else
                {
                    txtAddress.selectAll();
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent)
            {
                if (txtAddress.getText().equals(""))
                {
                    txtAddress.setText("Address");
                }
            }
        });
        txtAddress.setBackground(Default.color);
        txtAddress.setBorder(null);
        txtAddress.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAddress.setText("Address");
        txtAddress.setBounds(10, 10, 170, 20);
        txtAddress.setColumns(10);
        panelAddress.add(txtAddress);

        JSeparator sptAddress = new JSeparator();
        sptAddress.setForeground(Color.black);
        sptAddress.setBounds(10,35,210,1);
        panelAddress.add(sptAddress);

        JLabel lblIconAddress = new JLabel("");
        lblIconAddress.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconAddress.setBounds(210, 0, 40, 40);
        lblIconAddress.setIcon(new ImageIcon(img_Address));
        panelAddress.add(lblIconAddress);

        JPanel panelUsername = new JPanel();
        panelUsername.setBackground(Default.color);
        panelUsername.setBounds(300, 100, 250, 40);
        panelUsername.setLayout(null);
        contentPane.add(panelUsername);

        txtUsername = new JTextField();
        txtUsername.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtUsername.getText().equals("Username"))
                {
                    txtUsername.setText("");
                } else
                {
                    txtUsername.selectAll();
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent)
            {
                if (txtUsername.getText().equals(""))
                {
                    txtAddress.setText("Username");
                }
            }
        });
        txtUsername.setBackground(Default.color);
        txtUsername.setBorder(null);
        txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
        txtUsername.setText("Username");
        txtUsername.setBounds(10, 10, 170, 20);
        txtUsername.setColumns(10);
        panelUsername.add(txtUsername);

        JSeparator sptUsername = new JSeparator();
        sptUsername.setForeground(Color.black);
        sptUsername.setBounds(10,35,210,1);
        panelUsername.add(sptUsername);

        JLabel lblIconUsername = new JLabel("");
        lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconUsername.setBounds(210, 0, 40, 40);
        lblIconUsername.setIcon(new ImageIcon(img_Username));
        panelUsername.add(lblIconUsername);

        JPanel panelPassword = new JPanel();
        panelPassword.setBackground(Default.color);
        panelPassword.setBounds(300, 150, 250, 40);
        panelPassword.setLayout(null);
        contentPane.add(panelPassword);

        txtPassword = new JPasswordField();
        txtPassword.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtPassword.getText().equals("Password"))
                {
                    txtPassword.setEchoChar('*');
                    txtPassword.setText("");
                } else
                {
                    txtPassword.selectAll();
                }
            }

            @Override
            public void focusLost(FocusEvent fe)
            {
                if (txtPassword.getText().equals(""))
                {
                    txtPassword.setText("Password");
                    txtPassword.setEchoChar((char) 0);
                }
            }
        });
        txtPassword.setBackground(Default.color);
        txtPassword.setBorder(null);
        txtPassword.setEchoChar((char) 0);
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 12));
        txtPassword.setText("Password");
        txtPassword.setBounds(10, 11, 170, 20);
        panelPassword.add(txtPassword);

        JSeparator sptPassword = new JSeparator();
        sptPassword.setForeground(Color.black);
        sptPassword.setBounds(10,35,210,1);
        panelPassword.add(sptPassword);

        JLabel lblIconPassword = new JLabel("");
        lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconPassword.setBounds(210, 0, 40, 40);
        lblIconPassword.setIcon(new ImageIcon(img_Password));
        panelPassword.add(lblIconPassword);

        JPanel panelPasswordConfirm = new JPanel();
        panelPasswordConfirm.setBackground(Default.color);
        panelPasswordConfirm.setBounds(300, 200, 250, 40);
        panelPasswordConfirm.setLayout(null);
        contentPane.add(panelPasswordConfirm);

        txtPasswordConfirm = new JPasswordField();
        txtPasswordConfirm.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if (txtPasswordConfirm.getText().equals("Password confirm"))
                {
                    txtPasswordConfirm.setEchoChar('*');
                    txtPasswordConfirm.setText("");
                } else
                {
                    txtPasswordConfirm.selectAll();
                }
            }

            @Override
            public void focusLost(FocusEvent fe)
            {
                if (txtPasswordConfirm.getText().equals(""))
                {
                    txtPasswordConfirm.setText("Password confirm");
                    txtPasswordConfirm.setEchoChar((char) 0);
                }
            }
        });
        txtPasswordConfirm.setBackground(Default.color);
        txtPasswordConfirm.setBorder(null);
        txtPasswordConfirm.setEchoChar((char) 0);
        txtPasswordConfirm.setFont(new Font("Arial", Font.PLAIN, 12));
        txtPasswordConfirm.setText("Password confirm");
        txtPasswordConfirm.setBounds(10, 11, 170, 20);
        panelPasswordConfirm.add(txtPasswordConfirm);

        JSeparator sptPasswordConfirm = new JSeparator();
        sptPasswordConfirm.setForeground(Color.black);
        sptPasswordConfirm.setBounds(10,35,210,1);
        panelPasswordConfirm.add(sptPasswordConfirm);

        JLabel lblIconPasswordConfirm = new JLabel("");
        lblIconPasswordConfirm.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconPasswordConfirm.setBounds(210, 0, 40, 40);
        lblIconPasswordConfirm.setIcon(new ImageIcon(img_Password));
        panelPasswordConfirm.add(lblIconPasswordConfirm);

        // Back
        JLabel lblX = new JLabel("<");
        lblX.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                    SignUpFrame.this.dispose();
                    new LoginFrame().setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent event)
            {
                lblX.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent event)
            {
                lblX.setForeground(Color.WHITE);
            }
        });
        lblX.setForeground(Color.WHITE);
        lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblX.setHorizontalAlignment(SwingConstants.CENTER);
        lblX.setBounds(2, 0, 20, 20);
        contentPane.add(lblX);

        JPanel pnlBtnLogin = new JPanel();
        pnlBtnLogin.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent)
            {
                pnlBtnLogin.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent)
            {
                pnlBtnLogin.setBackground(Default.color);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent)
            {
                pnlBtnLogin.setBackground(Color.GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent)
            {
                pnlBtnLogin.setBackground(Color.WHITE);
            }
        });
        pnlBtnLogin.setBackground(Default.color);
        pnlBtnLogin.setBounds(165, 330, 250, 50);
        pnlBtnLogin.setBorder(new LineBorder(Color.BLACK, 2,true));
        pnlBtnLogin.setLayout(null);
        contentPane.add(pnlBtnLogin);

        JLabel lblLogIn = new JLabel("SIGN UP");
        lblLogIn.setForeground(Color.BLACK);
        lblLogIn.setFont(new Font("Arial", Font.BOLD, 14));
        lblLogIn.setBounds(100, 11, 64, 28);
        pnlBtnLogin.add(lblLogIn);

    }

}
