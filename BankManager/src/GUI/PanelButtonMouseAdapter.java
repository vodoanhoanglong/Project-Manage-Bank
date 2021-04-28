package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class PanelButtonMouseAdapter
{
    public static JPanel flag = MainFrame.panelHome;

    public static class PBMainFrame extends MouseAdapter
    {
        private JPanel panel1;
        private JPanel panel2;
        // nếu đặt Flag trong đây thì mỗi lần sẽ khởi tạo sẽ trỏ tới vùng nhớ khác nên k khả thi
        public PBMainFrame(JPanel panel1, JPanel panel2)
        {
            this.panel1 = panel1;
            this.panel2 = panel2;
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            MainFrame.Clicked(this.panel1);
            MainFrame.MenuClicked(this.panel2);
            flag = panel1;
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            if (flag == panel1)
            {
                this.panel1.setBackground(new Color(60, 179, 113));
            } else
                this.panel1.setBackground(new Color(112, 128, 144));
        }

        @Override
        public void mouseExited(MouseEvent e)
        {

            if (flag == panel1)
            {
                this.panel1.setBackground(new Color(60, 179, 113));
            } else
                this.panel1.setBackground(new Color(47, 79, 79));
        }
    }

    public static class PBService extends MouseAdapter
    {
        JPanel panel;
        int x, y, z;


        public PBService(JPanel panel, int x, int y, int z)
        {
            this.panel = panel;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            this.panel.setBackground(new Color(17, 44, 148, 80));
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            this.panel.setBackground(new Color(x, y, z));
        }

        @Override
        public void mousePressed(MouseEvent e)
        {
            this.panel.setBackground(new Color(216, 53, 65));
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            this.panel.setBackground(new Color(x, y, z));
        }
    }
}
