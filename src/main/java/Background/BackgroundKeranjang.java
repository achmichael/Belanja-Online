/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Background;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author HP VCS 15
 */
public class BackgroundKeranjang extends JPanel {
    private Image backgroundImage;
    public BackgroundKeranjang (){
        backgroundImage = new ImageIcon(getClass().getResource("/image/keranjang.png")).getImage();;
    }
     protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // Gambar latar belakang sesuai ukuran JPanel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
