import de.yadrone.apps.controlcenter.CCFrame;
import de.yadrone.base.ARDrone;
import de.yadrone.base.IARDrone;
import de.yadrone.base.video.ImageListener;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args)
    {
        IARDrone drone = null;

        try
        {
            drone = new ARDrone();
            drone.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
        finally
        {
            if (drone != null)
                drone.stop();
            //System.exit(0);
        }



        /*
        VideoListener video = new VideoListener(drone);

        drone.getVideoManager().addImageListener(new ImageListener() {
            public void imageUpdated(BufferedImage newImage)
            {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run()
                    {
                        video.paint(newImage.getGraphics());
                    }
                });
            }
        });

        drone.toggleCamera();
        */

        /*
        Open CV Test - OK

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("Welcome to OpenCV " + Core.VERSION);
        Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
        System.out.println("OpenCV Mat: " + m);
        Mat mr1 = m.row(1);
        mr1.setTo(new Scalar(1));
        Mat mc5 = m.col(5);
        mc5.setTo(new Scalar(5));
        System.out.println("OpenCV Mat data:\n" + m.dump());
        */
    }

}