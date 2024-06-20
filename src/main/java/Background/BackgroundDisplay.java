package Background;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class BackgroundDisplay extends JPanel {
    private Image backgroundImage;
    public BackgroundDisplay(){
        try{
            backgroundImage = new ImageIcon(getClass().getResource("/image/display.png")).getImage();
        }catch(Exception e){
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
            e.printStackTrace();
        }
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // Gambar latar belakang sesuai ukuran JPanel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
