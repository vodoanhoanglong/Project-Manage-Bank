package Views;

import Controller.LoginController;
import Model.Login;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LoginFrame extends JFrame
{

    public static String username;
    public static String password;

    private JPanel mainPane;


    private Image img_logo_right = new ImageIcon(LoginFrame.class.getResource("/Res/logoright.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    private Image img_logo = new ImageIcon(LoginFrame.class.getResource("/Res/test_logo.png")).getImage().getScaledInstance(700, 600, Image.SCALE_SMOOTH);
    private Image img_username = new ImageIcon(LoginFrame.class.getResource("/Res/businessman.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_hide_password = new ImageIcon(LoginFrame.class.getResource("/Res/hide_password.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_show_password = new ImageIcon(LoginFrame.class.getResource("/Res/show_password.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

    private int count = 0;

    public LoginFrame()
    {
        new Login();
        // GUI login
        setUndecorated(true);
        setBounds(100, 100, 1000, 600);
        setLocationRelativeTo(null);
        mainPane = new JPanel();
        mainPane.setBackground(new Color(49, 47, 47));
        mainPane.setBorder(null);
        mainPane.setLayout(null);
        mainPane.setFocusable(true); // khi Frame hiện ra sẽ k lấy cái nào làm tiêu điểm
        setContentPane(mainPane);

        //khung nội dung bên trái

        JPanel contentPaneLeft = new JPanel();
        contentPaneLeft.setBorder(null);
        contentPaneLeft.setBounds(2, 2, 700, 600);
        contentPaneLeft.setLayout(null);
        mainPane.add(contentPaneLeft);

        JLabel lblIconLogo = new JLabel("");
        lblIconLogo.setBounds(0,0, 700, 600);
//        lblIconLogo.setBounds(200,300,100,100);
        lblIconLogo.setIcon(new ImageIcon(img_logo));
        contentPaneLeft.add(lblIconLogo);;


        // Khung nội dung bên phải
        JPanel contentPaneRight = new LinearGradient(0);
        contentPaneRight.setBounds(700, 2, 298,596);
        contentPaneRight.setLayout(null);
        mainPane.add(contentPaneRight);

        JLabel lblLoginMessage = new JLabel("");
        lblLoginMessage.setForeground(Color.RED);
        lblLoginMessage.setHorizontalAlignment(SwingConstants.CENTER);
        lblLoginMessage.setFont(new Font("Arial", Font.BOLD, 12));
        lblLoginMessage.setBounds(0, 350, 298, 20);
        contentPaneRight.add(lblLoginMessage);

        JLabel lblIconLogoBank = new JLabel("");
        lblIconLogoBank.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconLogoBank.setBounds(30, 42, 250, 111);
        lblIconLogoBank.setIcon(new ImageIcon(img_logo_right));
        contentPaneRight.add(lblIconLogoBank);

        JLabel lblTitle = new JLabel();
        lblTitle.setText("Login Form");
        lblTitle.setForeground(Color.BLACK);
        lblTitle.setBounds(99,170,200,30);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        contentPaneRight.add(lblTitle);

        JPanel panelUsername = new RadiusAndShadow();
        panelUsername.setBackground(Color.WHITE);
        panelUsername.setBounds(25, 220, 260, 55);
        panelUsername.setLayout(null);
        contentPaneRight.add(panelUsername);

        JTextField txtUsername = new JTextField();
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
                    txtUsername.setText("Username");
                }
            }
        });
        txtUsername.setBackground(Color.WHITE);
        txtUsername.setForeground(Color.GRAY);
        txtUsername.setBorder(null);
        txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
        txtUsername.setText("Username");
        txtUsername.setBounds(10, 10, 170, 20);
        txtUsername.setColumns(10);
        panelUsername.add(txtUsername);

        JSeparator sptUsername = new JSeparator();
        sptUsername.setForeground(Color.GRAY);
        sptUsername.setBounds(10,35,210,1);
        panelUsername.add(sptUsername);

        JLabel lblIconUsername = new JLabel("");
        lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconUsername.setBounds(210, 0, 40, 40);
        lblIconUsername.setIcon(new ImageIcon(img_username));
        panelUsername.add(lblIconUsername);

        JPanel panelPassword = new RadiusAndShadow();
        panelPassword.setBackground(Color.WHITE);
        panelPassword.setBounds(25, 280, 260, 55);
        panelPassword.setLayout(null);
        contentPaneRight.add(panelPassword);

        JPasswordField txtPassword = new JPasswordField();
        txtPassword.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if(LoginFrame.this.count % 2 == 0)
                {
                    if (txtPassword.getText().equals("Password"))
                    {
                        txtPassword.setEchoChar('*');
                        txtPassword.setText("");
                    } else
                    {
                        txtPassword.selectAll();
                    }
                }else
                {
                    if (txtPassword.getText().equals("Password"))
                    {
                        txtPassword.setEchoChar((char)0);
                        txtPassword.setText("");
                    } else
                    {
                        txtPassword.selectAll();
                    }
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
        txtPassword.setBackground(Color.WHITE);
        txtPassword.setForeground(Color.GRAY);
        txtPassword.setBorder(null);
        txtPassword.setEchoChar((char) 0);
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 12));
        txtPassword.setText("Password");
        txtPassword.setBounds(10, 11, 170, 20);
        panelPassword.add(txtPassword);

        JSeparator sptPassword = new JSeparator();
        sptPassword.setForeground(Color.GRAY);
        sptPassword.setBounds(10,35,210,1);
        panelPassword.add(sptPassword);


        JLabel lblIconPassword = new JLabel("");
        lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconPassword.setBounds(210, 0, 40, 40);
        lblIconPassword.setIcon(new ImageIcon(img_hide_password));
        lblIconPassword.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(LoginFrame.this.count % 2 == 0)
                {
                    LoginFrame.this.count++;
                    lblIconPassword.setIcon(new ImageIcon(img_show_password));
                    txtPassword.setEchoChar((char) 0);
                }else
                {
                    LoginFrame.this.count++;
                    lblIconPassword.setIcon(new ImageIcon(img_hide_password));
                    if(!txtPassword.getText().equals("Password"))
                        txtPassword.setEchoChar('*');
                }
            }
        });
        panelPassword.add(lblIconPassword);


        // Button Login
        JPanel pnlBtnLogin = new RadiusAndShadow();
        pnlBtnLogin.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (LoginController.CheckLogin(txtUsername.getText(), txtPassword.getText()))
                {
                    LoginFrame.password = txtPassword.getText();
                    LoginFrame.username = txtUsername.getText();
                    LoginController.getUserData(LoginFrame.username);
                    new MainFrame().setVisible(true);
                    LoginFrame.this.dispose();
                } else if (txtUsername.getText().equals("") || txtPassword.getText().equals("") || txtUsername.getText().equals("Username") || txtPassword.getText().equals("Password"))
                    lblLoginMessage.setText("Please input all requirements!");
                else lblLoginMessage.setText("Username or Password wrong!");
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent)
            {
                pnlBtnLogin.setBackground(new Color(21, 140, 180));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent)
            {
                pnlBtnLogin.setBackground(Color.WHITE);
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
        pnlBtnLogin.setBackground(Color.WHITE);
        pnlBtnLogin.setBounds(55, 380, 200, 50);
        pnlBtnLogin.setLayout(null);
        contentPaneRight.add(pnlBtnLogin);

        JLabel lblLogIn = new JLabel("Login");
        lblLogIn.setForeground(Color.BLACK);
        lblLogIn.setFont(new Font("Arial", Font.BOLD, 15));
        lblLogIn.setBounds(76, 7, 64, 28);
        pnlBtnLogin.add(lblLogIn);

        // Button create account
        JPanel pnlBtnSignup = new RadiusAndShadow();
        pnlBtnSignup.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                new SignUpFrame().setVisible(true);
                LoginFrame.this.dispose(); // tắt Frame cũ
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent)
            {
                pnlBtnSignup.setBackground(new Color(21, 140, 180));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent)
            {
                pnlBtnSignup.setBackground(Color.WHITE);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent)
            {
                pnlBtnSignup.setBackground(Color.GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent)
            {
                pnlBtnSignup.setBackground(Color.WHITE);
            }
        });
        pnlBtnSignup.setBackground(Color.WHITE);
        pnlBtnSignup.setBounds(82, 440, 150, 40);
        pnlBtnSignup.setLayout(null);
        contentPaneRight.add(pnlBtnSignup);

        JLabel lblSignup = new JLabel("Register");
        lblSignup.setForeground(Color.BLACK);
        lblSignup.setFont(new Font("Arial", Font.BOLD, 15));
        lblSignup.setBounds(40,8,150,15);
        pnlBtnSignup.add(lblSignup);

        JLabel lblX = new JLabel("X");
        lblX.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
                    LoginFrame.this.dispose();
            }

            @Override
            public void mouseEntered(MouseEvent event)
            {
                lblX.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent event)
            {
                lblX.setForeground(Color.BLACK);
            }
        });
        lblX.setForeground(Color.BLACK);
        lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblX.setHorizontalAlignment(SwingConstants.CENTER);
        lblX.setBounds(280, 0, 20, 20);
        contentPaneRight.add(lblX);
    }

}