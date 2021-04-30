package GUI;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame
{
    public static JPanel contentPane;
    public static JPanel panelMainContent;

    private Image img_logo = new ImageIcon(LoginFrame.class.getResource("/Res/bank.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
    private Image img_home = new ImageIcon(LoginFrame.class.getResource("/Res/home.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_profits = new ImageIcon(LoginFrame.class.getResource("/Res/profits.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_orders = new ImageIcon(LoginFrame.class.getResource("/Res/orders.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_service = new ImageIcon(LoginFrame.class.getResource("/Res/service.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_setting = new ImageIcon(LoginFrame.class.getResource("/Res/setting.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_sign_out = new ImageIcon(LoginFrame.class.getResource("/Res/sign_out.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

    public static PanelHome home;
    public static PanelProfits profits;
    public static PanelOrders orders;
    public static PanelService service;
    public static PanelSetting setting;


    public static JPanel panelHome, panelProfits, panelOrders, panelService, panelSetting, panelSignOut;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }


    public MainFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100,  1000, 750);
//        setUndecorated(true);
        setLocationRelativeTo(null);
        //setLayout(null);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        home = new PanelHome();
        profits = new PanelProfits();
        orders = new PanelOrders();
        service = new PanelService();
        setting = new PanelSetting();

        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(new Color(47, 79, 79));
        panelLeft.setPreferredSize(new Dimension(200,0));
        panelLeft.setLayout(new GridLayout(3,1));
        contentPane.add(panelLeft, "West");

        JPanel panelIcon = new JPanel();
        panelIcon.setBackground(new Color(47, 79, 79));
        panelIcon.setLocation(30,30);
        panelLeft.add(panelIcon);

        JLabel lblIconLogo = new JLabel("");
        lblIconLogo.setIcon(new ImageIcon(img_logo));
        panelIcon.add(lblIconLogo);

        JPanel panelMenu = new JPanel();
        panelMenu.setBackground(new Color(47, 79, 79));
        panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));
        panelLeft.add(panelMenu);



        panelHome = new JPanel();
        panelHome.addMouseListener(new PanelButtonMouseAdapter.PBMainFrame(panelHome, home));
        panelHome.setBackground(new Color(60, 179, 113));
//        panelHome.setBounds(0, 140, 249, 40);
//        panelHome.setLayout(null);
        panelMenu.add(panelHome);

//        JLabel lblIconHome = new JLabel("");
//        lblIconHome.setHorizontalAlignment(SwingConstants.CENTER);
//        lblIconHome.setBounds(20, 0, 40, 40);
//        lblIconHome.setIcon(new ImageIcon(img_home));
//        panelHome.add(lblIconHome);

        JLabel lblHome = new JLabel("HOME");
        lblHome.setIcon(new ImageIcon(img_home));
        lblHome.setHorizontalAlignment(SwingConstants.CENTER);
        lblHome.setForeground(Color.WHITE);
        lblHome.setFont(new Font("Dialog", Font.BOLD, 14));
        lblHome.setBounds(76, 11, 163, 18);
        panelHome.add(lblHome);


        panelProfits = new JPanel();
        panelProfits.addMouseListener(new PanelButtonMouseAdapter.PBMainFrame(panelProfits, profits));
        panelProfits.setBackground(new Color(47, 79, 79));
//        panelProfits.setBounds(0, 180, 249, 40);
//        panelProfits.setLayout(null);
        panelMenu.add(panelProfits);

//        JLabel lblIconProfits = new JLabel("");
//        lblIconProfits.setHorizontalAlignment(SwingConstants.CENTER);
//        lblIconProfits.setBounds(20, 0, 40, 40);
//        lblIconProfits.setIcon(new ImageIcon(img_profits));
//        panelProfits.add(lblIconProfits);

        JLabel lblProfits = new JLabel("PROFILE");
        lblProfits.setIcon(new ImageIcon(img_profits));
        lblProfits.setHorizontalAlignment(SwingConstants.CENTER);
        lblProfits.setForeground(Color.WHITE);
        lblProfits.setFont(new Font("Dialog", Font.BOLD, 14));
        lblProfits.setBounds(76, 11, 163, 18);
        panelProfits.add(lblProfits);


        panelOrders = new JPanel();
        panelOrders.addMouseListener(new PanelButtonMouseAdapter.PBMainFrame(panelOrders, orders));
        panelOrders.setBackground(new Color(47, 79, 79));
//        panelOrders.setBounds(0, 220, 249, 40);
//        panelOrders.setLayout(null);
        panelMenu.add(panelOrders);

//        JLabel lblIconOrders = new JLabel("");
//        lblIconOrders.setHorizontalAlignment(SwingConstants.CENTER);
//        lblIconOrders.setBounds(20, 0, 40, 40);
//        lblIconOrders.setIcon(new ImageIcon(img_orders));
//        panelOrders.add(lblIconOrders);

        JLabel lblOrders = new JLabel("ORDERS");
        lblOrders.setHorizontalAlignment(SwingConstants.CENTER);
        lblOrders.setIcon(new ImageIcon(img_orders));
        lblOrders.setForeground(Color.WHITE);
        lblOrders.setFont(new Font("Dialog", Font.BOLD, 14));
        lblOrders.setBounds(76, 11, 163, 18);
        panelOrders.add(lblOrders);


        panelService = new JPanel();
        panelService.addMouseListener(new PanelButtonMouseAdapter.PBMainFrame(panelService, service));
        panelService.setBackground(new Color(47, 79, 79));
//        panelService.setBounds(0, 260, 249, 40);
//        panelService.setLayout(null);
        panelMenu.add(panelService);

//        JLabel lblIconService = new JLabel("");
//        lblIconService.setHorizontalAlignment(SwingConstants.CENTER);
//        lblIconService.setBounds(20, 0, 40, 40);
//        lblIconService.setIcon(new ImageIcon(img_service));
//        panelService.add(lblIconService);

        JLabel lblService = new JLabel("SERVICE");
        lblService.setHorizontalAlignment(SwingConstants.CENTER);
        lblService.setIcon(new ImageIcon(img_service));
        lblService.setForeground(Color.WHITE);
        lblService.setFont(new Font("Dialog", Font.BOLD, 14));
        lblService.setBounds(76, 11, 163, 18);
        panelService.add(lblService);

        panelSetting = new JPanel();
        panelSetting.addMouseListener(new PanelButtonMouseAdapter.PBMainFrame(panelSetting, setting));
        panelSetting.setBackground(new Color(47, 79, 79));
//        panelSetting.setBounds(0, 300, 249, 40);
//        panelSetting.setLayout(null);
        panelMenu.add(panelSetting);

//        JLabel lblIconSetting = new JLabel("");
//        lblIconSetting.setHorizontalAlignment(SwingConstants.CENTER);
//        lblIconSetting.setBounds(20, 0, 40, 40);
//        lblIconSetting.setIcon(new ImageIcon(img_setting));
//        panelSetting.add(lblIconSetting);

        JLabel lblSetting = new JLabel("SETTING");
        lblSetting.setHorizontalAlignment(SwingConstants.CENTER);
        lblSetting.setIcon(new ImageIcon(img_setting));
        lblSetting.setForeground(Color.WHITE);
        lblSetting.setFont(new Font("Dialog", Font.BOLD, 14));
        lblSetting.setBounds(76, 11, 163, 18);
        panelSetting.add(lblSetting);

        panelSignOut = new JPanel();
        panelSignOut.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                Clicked(panelSignOut);
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
                {
                    new LoginFrame().setVisible(true);
                    MainFrame.this.dispose();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                panelSignOut.setBackground(new Color(112, 128, 144));
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                panelSignOut.setBackground(new Color(47, 79, 79));
                if (PanelButtonMouseAdapter.flag == panelHome || PanelButtonMouseAdapter.flag == panelProfits || PanelButtonMouseAdapter.flag == panelOrders || PanelButtonMouseAdapter.flag == panelService || PanelButtonMouseAdapter.flag == panelSetting)
                {
                    PanelButtonMouseAdapter.flag.setBackground(new Color(60, 179, 113));
                }
            }
        });
        panelSignOut.setBackground(new Color(47, 79, 79));
//        panelSignOut.setBounds(0, 340, 249, 40);
//        panelSignOut.setLayout(null);
        panelMenu.add(panelSignOut);

//        JLabel lblIconSignOut = new JLabel("");
//        lblIconSignOut.setHorizontalAlignment(SwingConstants.CENTER);
//        lblIconSignOut.setBounds(20, 0, 40, 40);
//        lblIconSignOut.setIcon(new ImageIcon(img_sign_out));
//        panelSignOut.add(lblIconSignOut);

        JLabel lblSignOut = new JLabel("SIGN OUT");
        lblSignOut.setHorizontalAlignment(SwingConstants.CENTER);
        lblSignOut.setIcon(new ImageIcon(img_sign_out));
        lblSignOut.setForeground(Color.WHITE);
        lblSignOut.setFont(new Font("Dialog", Font.BOLD, 14));
        lblSignOut.setBounds(76, 11, 163, 18);
        panelSignOut.add(lblSignOut);

//        JLabel lblX = new JLabel("X");
//        lblX.addMouseListener(new MouseAdapter()
//        {
//            @Override
//            public void mouseClicked(MouseEvent e)
//            {
//                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
//                {
//                    MainFrame.this.dispose();
//                }
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent event)
//            {
//                lblX.setForeground(Color.RED);
//            }
//
//            @Override
//            public void mouseExited(MouseEvent event)
//            {
//                lblX.setForeground(Color.BLACK);
//            }
//        });
//        lblX.setForeground(Color.BLACK);
//        lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
//        lblX.setHorizontalAlignment(SwingConstants.CENTER);
//        lblX.setBounds(788, -2, 20, 20);
//        contentPane.add(lblX);


        panelMainContent = new JPanel();
//        panelMainContent.setBounds(249, 15, 558, 420);
//        panelMainContent.setLayout(null); // nếu k có layout sẽ năm tứ tung và có thể k xuất hiện
        panelMainContent.setLayout(new BorderLayout(0,0));
        contentPane.add(panelMainContent, "Center");
        // sau khi đăng nhập sẽ mặc định trỏ vào trang home
        panelMainContent.add(home, "Center");

    }

    public static void MenuClicked(JPanel panel)
    {
        home.setVisible(false);
        profits.setVisible(false);
        orders.setVisible(false);
        service.setVisible(false);
        setting.setVisible(false);

        panel.setVisible(true);
        panelMainContent.add(panel, "North");
    }

    public static void Clicked(JPanel panel)
    {
        if (panel == panelHome)
            panelHome.setBackground(new Color(60, 179, 113));
        else panelHome.setBackground(new Color(47, 79, 79));

        if (panel == panelProfits)
            panelProfits.setBackground(new Color(60, 179, 113));
        else panelProfits.setBackground(new Color(47, 79, 79));

        if (panel == panelOrders)
            panelOrders.setBackground(new Color(60, 179, 113));
        else panelOrders.setBackground(new Color(47, 79, 79));

        if (panel == panelService)
            panelService.setBackground(new Color(60, 179, 113));
        else panelService.setBackground(new Color(47, 79, 79));

        if (panel == panelSetting)
            panelSetting.setBackground(new Color(60, 179, 113));
        else panelSetting.setBackground(new Color(47, 79, 79));

        if (panel == panelSignOut)
            panelSignOut.setBackground(new Color(60, 179, 113));
        else panelSignOut.setBackground(new Color(47, 79, 79));

    }
}


