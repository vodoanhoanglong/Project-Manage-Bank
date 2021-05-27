package Views;


import RadiusAndShadow.image.GaussianFilter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

public class RadiusAndShadow extends JPanel
{


    private int shadowSize = 5;

    public RadiusAndShadow()
    {
        // This is very important, as part of the panel is going to be transparent
        setOpaque(false);
    }

    @Override
    public Insets getInsets()
    {
        return new Insets(0, 0, 10, 10);
    }

//        @Override
//        public Dimension getPreferredSize() {
//            // thay đổi kích thước pannel
//            return new Dimension(170, 80);
//        }

    @Override
    protected void paintComponent(Graphics g)
    {
        int width = getWidth() - 1;
        int height = getHeight() - 1;

        Graphics2D g2d = (Graphics2D) g.create();
        applyQualityProperties(g2d);
        Insets insets = getInsets();
        Rectangle bounds = getBounds();
        bounds.x = insets.left;
        bounds.y = insets.top;
        bounds.width = width - (insets.left + insets.right);
        bounds.height = height - (insets.top + insets.bottom);

        // thay đổi độ cong của shape
        RoundRectangle2D shape = new RoundRectangle2D.Float(bounds.x, bounds.y, bounds.width, bounds.height, 20, 20);

        /**
         * * THIS SHOULD BE CAHCED AND ONLY UPDATED WHEN THE SIZE OF THE
         * COMPONENT CHANGES **
         */
        BufferedImage img = createCompatibleImage(bounds.width, bounds.height);
        Graphics2D tg2d = img.createGraphics();
        applyQualityProperties(g2d);
        // thay đổi màu cho bóng
        tg2d.setColor(Color.BLACK);
        tg2d.translate(-bounds.x, -bounds.y);
        tg2d.fill(shape);
        tg2d.dispose();
        // thay đổi màu cho bóng và kích hoạt đổ bóng
        BufferedImage shadow = generateShadow(img, shadowSize, Color.BLACK, 0.5f);

        g2d.drawImage(shadow, shadowSize, shadowSize, this);

        g2d.setColor(getBackground());
        g2d.fill(shape);

        /**
         * THIS ONE OF THE ONLY OCCASIONS THAT I WOULDN'T CALL
         * super.paintComponent *
         */
        this.getUI().paint(g2d, this);

        // màu đường viền
        g2d.setColor(Color.GRAY);
        // vẽ đường viền
//            g2d.draw(shape);
        g2d.dispose();
    }

    public GraphicsConfiguration getGraphicsConfiguration()
    {

        return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

    }

    public BufferedImage createCompatibleImage(int width, int height)
    {

        return createCompatibleImage(width, height, Transparency.TRANSLUCENT);

    }

    public static void applyQualityProperties(Graphics2D g2)
    {
        g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    }

    public BufferedImage createCompatibleImage(int width, int height, int transparency)
    {

        BufferedImage image = getGraphicsConfiguration().createCompatibleImage(width, height, transparency);
        image.coerceData(true);
        return image;

    }

    public BufferedImage generateShadow(BufferedImage imgSource, int size, Color color, float alpha)
    {

        int imgWidth = imgSource.getWidth() + (size * 2);
        int imgHeight = imgSource.getHeight() + (size * 2);

        BufferedImage imgMask = createCompatibleImage(imgWidth, imgHeight);
        Graphics2D g2 = imgMask.createGraphics();
        applyQualityProperties(g2);

        int x = Math.round((imgWidth - imgSource.getWidth()) / 2f);
        int y = Math.round((imgHeight - imgSource.getHeight()) / 2f);
//            g2.drawImage(imgSource, x, y, null);
        g2.drawImage(imgSource, 0, 0, null);
        g2.dispose();

        // ---- Blur here ---

        BufferedImage imgShadow = generateBlur(imgMask, size, color, alpha);

        return imgShadow;

    }

    public BufferedImage generateBlur(BufferedImage imgSource, int size, Color color, float alpha)
    {

        GaussianFilter filter = new GaussianFilter(size);

        int imgWidth = imgSource.getWidth();
        int imgHeight = imgSource.getHeight();

        BufferedImage imgBlur = createCompatibleImage(imgWidth, imgHeight);
        Graphics2D g2d = imgBlur.createGraphics();
        applyQualityProperties(g2d);

        g2d.drawImage(imgSource, 0, 0, null);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_IN, alpha));
        g2d.setColor(color);

        g2d.fillRect(0, 0, imgSource.getWidth(), imgSource.getHeight());
        g2d.dispose();

        imgBlur = filter.filter(imgBlur, null);

        return imgBlur;

    }
}

