package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalToggleButtonUI;

public class MainFrame extends JFrame {
    private Color color_enter = new Color(39, 89, 160);
    private Color color_exit = new Color(66, 103, 178);
    private JPanel contentPane;
    private JTextField txtWelcome;
    private CardLayout cardlayout;
    private JToggleButton btnHistory;
    private JToggleButton btnServices;
    private JToggleButton btnTrading;
    private JPanel panel_cardlayout;
    private JPanel panel_cardlayout_history;
    private JPanel panel_cardlayout_service;
    private JPanel panel_cardlayout_tongquan;
    private JPopupMenu popupMenu;
    private JLabel lblNewLabel_1;
    private JMenuItem mntmdangxuat;
    static JMenuItem mntmQLNhanVien;
    private JSeparator separator;
    static boolean check;
    MetalToggleButtonUI metal = new MetalToggleButtonUI() {

        @Override
        protected Color getSelectColor() {
            return MainFrame.this.color_enter;
        }
    };

    public MainFrame() {
        this.addWindowFocusListener(new WindowFocusListener() {

            @Override
            public void windowLostFocus(WindowEvent arg0) {
            }

            @Override
            public void windowGainedFocus(WindowEvent arg0) {
                if (check) {
                    mntmQLNhanVien.setEnabled(check);
                }
            }
        });
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1383, 773);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setContentPane(this.contentPane);
        JPanel panelMenu = new JPanel();
        panelMenu.setBorder(new BevelBorder(0, new Color(64, 64, 64), new Color(64, 64, 64), Color.DARK_GRAY, Color.DARK_GRAY));
        panelMenu.setFocusable(false);
        panelMenu.setBackground(this.color_exit);
        JScrollPane scrollPane = new JScrollPane(panelMenu);
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        scrollPane.setHorizontalScrollBarPolicy(31);
        scrollPane.setViewportBorder(new TitledBorder(null, "", 4, 2, null, null));
        GridBagLayout gbl_panelMenu = new GridBagLayout();
        gbl_panelMenu.columnWidths = new int[2];
        gbl_panelMenu.rowHeights = new int[14];
        gbl_panelMenu.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panelMenu.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        panelMenu.setLayout(gbl_panelMenu);
        this.txtWelcome = new JTextField();
        this.txtWelcome.setOpaque(false);
        this.txtWelcome.setHorizontalAlignment(0);
        this.txtWelcome.setEditable(false);
        this.txtWelcome.setFont(new Font("Arial", 1, 26));
        this.txtWelcome.setText("Welcome\r\n");
        this.txtWelcome.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.txtWelcome.setForeground(Color.WHITE);
        this.txtWelcome.setPreferredSize(new Dimension(300, 70));
        GridBagConstraints gbc_txtWelcome = new GridBagConstraints();
        gbc_txtWelcome.insets = new Insets(0, 0, 5, 0);
        gbc_txtWelcome.fill = 1;
        gbc_txtWelcome.gridx = 0;
        gbc_txtWelcome.gridy = 0;
        panelMenu.add((Component) this.txtWelcome, gbc_txtWelcome);
        this.txtWelcome.setColumns(10);
        this.btnHistory = new JToggleButton("\u0110\u01a1n H\u00e0ng");
        this.btnHistory.setUI(this.metal);
        this.btnHistory.setIconTextGap(35);
        this.btnHistory.setIcon(new ImageIcon("Imager\\donhang2.png"));
        this.btnHistory.setHorizontalTextPosition(4);
        this.btnHistory.setFocusable(false);
        this.btnHistory.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent arg0) {
                MainFrame.this.btnHistory.setBackground(MainFrame.this.color_enter);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                MainFrame.this.btnHistory.setBackground(MainFrame.this.color_exit);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == 1) {
                    MainFrame.this.showlayout("history");
                }
            }
        });
        this.btnHistory.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.btnHistory.setPreferredSize(new Dimension(300, 60));
        this.btnHistory.setForeground(Color.WHITE);
        this.btnHistory.setBackground(this.color_exit);
        this.btnHistory.setFont(new Font("Arial", 0, 17));
        GridBagConstraints gbc_btnHistory = new GridBagConstraints();
        gbc_btnHistory.fill = 3;
        gbc_btnHistory.gridx = 0;
        gbc_btnHistory.gridy = 2;
        panelMenu.add((Component) this.btnHistory, gbc_btnHistory);
        this.btnTrading = new JToggleButton("Giao Dich");
//        this.btnbanhang.setVisible(DangNhap.action_giaodich);
        this.btnTrading.setUI(this.metal);
        this.btnTrading.setIconTextGap(37);
        this.btnTrading.setIcon(new ImageIcon("src\\img\\tradingIcons-01.png"));
        this.btnTrading.setHorizontalTextPosition(4);
        this.btnTrading.setFocusable(false);
        this.btnTrading.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent arg0) {
                MainFrame.this.btnTrading.setBackground(MainFrame.this.color_enter);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                MainFrame.this.btnTrading.setBackground(MainFrame.this.color_exit);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == 1) {
                    try {
//                        jfGiaodich giaodich = new jfGiaodich();
//                        giaodich.run();
                        System.out.println("thuc hien giao dich");// tạo frame giao dich
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        this.btnTrading.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.btnTrading.setPreferredSize(new Dimension(300, 60));
        this.btnTrading.setForeground(Color.WHITE);
        this.btnTrading.setBackground(this.color_exit);
        this.btnTrading.setFont(new Font("Arial", 0, 17));
        GridBagConstraints gbc_btnTrading = new GridBagConstraints();
        gbc_btnTrading.fill = 3;
        gbc_btnTrading.gridx = 0;
        gbc_btnTrading.gridy = 3;
        panelMenu.add((Component) this.btnTrading, gbc_btnTrading);
        this.btnServices = new JToggleButton("Services");
        this.btnServices.setUI(this.metal);
        this.btnServices.setIconTextGap(38);
        this.btnServices.setIcon(new ImageIcon("Imager\\sanpham.png"));
        this.btnServices.setHorizontalTextPosition(4);
        this.btnServices.setFocusable(false);
        this.btnServices.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent arg0) {
                MainFrame.this.btnServices.setBackground(MainFrame.this.color_enter);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                MainFrame.this.btnServices.setBackground(MainFrame.this.color_exit);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == 1) {
                    MainFrame.this.showlayout("sp");
                }
            }
        });
        this.btnServices.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.btnServices.setPreferredSize(new Dimension(300, 60));
        this.btnServices.setForeground(Color.WHITE);
        this.btnServices.setBackground(this.color_exit);
        this.btnServices.setFont(new Font("Open Sans", 0, 17));
        GridBagConstraints gbc_btnServices = new GridBagConstraints();
        gbc_btnServices.gridx = 0;
        gbc_btnServices.gridy = 5;
        panelMenu.add((Component) this.btnServices, gbc_btnServices);
        this.contentPane.add((Component) scrollPane, "West");
        ButtonGroup group = new ButtonGroup();
        group.add(this.btnHistory);
        group.add(this.btnTrading);
        group.add(this.btnServices);
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.WHITE);
        this.contentPane.add((Component) panel_2, "Center");
        panel_2.setLayout(new BorderLayout(0, 0));
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(0, null, null, new Color(0, 0, 255), null));
        panel_1.setBackground(new Color(240, 240, 240));
        panel_2.add((Component) panel_1, "North");
        panel_1.setLayout(new FlowLayout(2, 15, 0));
        JLabel btnNewButton_8 = new JLabel(new ImageIcon("src\\img\\account-45.png"));
        btnNewButton_8.setFocusable(false);
        btnNewButton_8.setHorizontalTextPosition(4);
        btnNewButton_8.setToolTipText("T\u00e0i Kho\u1ea3n");
        btnNewButton_8.setBorder(null);
        panel_1.add(btnNewButton_8);
        this.popupMenu = new JPopupMenu();
        this.popupMenu.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.popupMenu.setFont(new Font("Arial", 1, 17));
        this.popupMenu.setBackground(Color.WHITE);
        this.addPopup(btnNewButton_8, this.popupMenu);
        final JMenuItem mntmhoso = new JMenuItem("H\u1ed3 S\u01a1");
        mntmhoso.setPreferredSize(new Dimension(200, 40));
        mntmhoso.setOpaque(false);
        mntmhoso.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == mntmhoso) {
                    try {
//                        ThongTinCaNhan thongTinCaNhan = new ThongTinCaNhan();
//                        thongTinCaNhan.run();
                        System.out.println("Hien thi thong tin ca nhan");
                    } catch (Exception e2) {
                        System.err.println(e2.getMessage());
                    }
                }
            }
        });
        mntmhoso.setFont(new Font("Arial", 1, 15));
        this.popupMenu.add(mntmhoso);
        this.mntmdangxuat = new JMenuItem("Đăng Xuất");
        this.mntmdangxuat.setPreferredSize(new Dimension(200, 40));
        this.mntmdangxuat.setOpaque(false);
        this.mntmdangxuat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == MainFrame.this.mntmdangxuat) {
                    System.exit(0);
                }
            }
        });
        this.separator = new JSeparator();
        this.separator.setRequestFocusEnabled(false);
        this.separator.setForeground(Color.BLACK);
        this.popupMenu.add(this.separator);
        this.mntmdangxuat.setFont(new Font("Arial", 1, 15));
        this.mntmdangxuat.setBackground(Color.WHITE);
        this.popupMenu.add(this.mntmdangxuat);
        this.cardlayout = new CardLayout();
        this.panel_cardlayout = new JPanel(this.cardlayout);
        this.panel_cardlayout.setBackground(Color.WHITE);
//        this.panel_cardlayout_history = new cardpanel_history();
//        this.panel_cardlayout.add((Component) this.panel_cardlayout_history, "history");
//        this.panel_cardlayout_services = new cardpanel_services();
//        this.panel_cardlayout.add((Component) this.panel_cardlayout_services, "services");
//        this.panel_cardlayout_tongquan = new JPanel();
//        this.panel_cardlayout.add((Component) this.panel_cardlayout_tongquan, "name_73870650150400");
        panel_2.add((Component) this.panel_cardlayout, "Center");
    }

    public void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1) {
                    this.showMenu(e);
                }
            }

            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), 0, e.getComponent().getHeight());
            }
        });
    }

    public void showlayout(String constrains) {
        this.cardlayout.show(this.panel_cardlayout, constrains);
    }
}