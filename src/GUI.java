import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GUI {
    private JPanel Mpanel;
    private JButton button1;

    public GUI(Heart.Window window) throws IOException {
        WFrame wf = new WFrame();
        button1.setText("To open a secret?");
        button1.addActionListener(e -> {
         wf.dispose();
         window.doVisible();
        });
    }

    public class WFrame extends JFrame{
        public WFrame() throws IOException {
            setLocationRelativeTo(null);
            setSize(320, 200);
            setTitle("Attention");
            URL url = new URL("http://iconshow.me/media/images/Mixed/small-n-flat-icon/png/512/heart.png");
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            setIconImage(image.getImage());
            setVisible(true);
            add(Mpanel);

        }
    }

    public JPanel getMpanel() {
        return Mpanel;
    }
}
