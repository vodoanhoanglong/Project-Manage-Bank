package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelButtonMouseAdapter extends MouseAdapter
{
    JPanel panel;
    public PanelButtonMouseAdapter(JPanel panel)
    {
        this.panel = panel;
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
        this.panel.setBackground(new Color(112,128,144));
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        this.panel.setBackground(new Color(47,79,79));
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        this.panel.setBackground(new Color(60,179,113));
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        this.panel.setBackground(new Color(112,128,144));
    }
}
