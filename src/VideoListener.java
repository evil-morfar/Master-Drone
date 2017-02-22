import de.yadrone.base.IARDrone;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Sanne on 22-02-2017.
 */
public class VideoListener extends JFrame {
    private BufferedImage image = null;

    public VideoListener(final IARDrone drone)
    {
        setSize(640,360);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        if (image != null)
            g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
}
