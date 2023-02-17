package beatles;

import java.awt.*;
import java.io.File;
import javax.swing.*;

public class Albumes extends javax.swing.JFrame {

    private int n;
    private InfoAlbum o;
    
    public Albumes(String archivo, int num) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(234, 234, 234));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        n=num;
        o=new InfoAlbum();
        cargaImagenL(archivo);
        TextoInfo.setText(o.getInfo(n));
    }
    
    public void cargaImagenL(String archivo){
        ImageIcon imagen; 
        imagen = new ImageIcon("./src/Imagenes/"+archivo) ;
        Image imescala = imagen.getImage();
        imescala = imescala.getScaledInstance(LabelAlbum.getWidth() , LabelAlbum.getHeight(), Image.SCALE_DEFAULT);
        imagen = new ImageIcon(imescala);
        LabelAlbum.setIcon(imagen);
    }
    
    public void cargaDocumental(String ruta){
        try{
            File archivo=new File(ruta);
            if(archivo.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(archivo);
                }else{
                    JOptionPane.showMessageDialog(this, "Not Supported");
                }
                }else{
                    JOptionPane.showMessageDialog(this, "Archivo no encontrado");
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
            @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/logo_beatles.png"));
        return retValue;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAlbum = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoInfo = new javax.swing.JTextPane();
        botonVideos = new javax.swing.JButton();
        botonRetomar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        LabelAlbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextoInfo.setEditable(false);
        jScrollPane2.setViewportView(TextoInfo);

        botonVideos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonVideos.setText("VER DOCUMENTAL");
        botonVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVideosActionPerformed(evt);
            }
        });

        botonRetomar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRetomar.setText("RETOMAR CANCIÓN");
        botonRetomar.setEnabled(false);
        botonRetomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetomarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonRetomar, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(botonVideos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LabelAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonVideos)))
                .addGap(18, 18, 18)
                .addComponent(botonRetomar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVideosActionPerformed
        Ventana1.mu.pause();
        botonRetomar.setEnabled(true);
        switch(n){
            case 0:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/001 Please Please Me (1963)/Please Please Me.mp4");
            break;
            
            case 1:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/002 With the Beatles (1963)/With The Beatles.mp4");
            break;
            
            case 2:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/003 A Hard Day's Night (1964)/Hard Days Night.mp4");
            break;
            
            case 3:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/004 Beatles for Sale (1964)/Beatles For Sale.mp4");
            break;
            
            case 4:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/005 Help! (1965)/Help.mp4");
            break;
            
            case 5:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/006 Rubber Soul (1965)/Rubber Soul.mp4");
            break;
            
            case 6:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/007 Revolver (1966)/Revolver.mp4");
            break;
            
            case 7:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/008 Sgt. Pepper's Lonely Hearts Club Band "
                        + "(1967)/Sgt Pepper.mp4");
            break;
            
            case 8:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/009 Magical Mystery Tour (1967)/Magical "
                        + "Mystery Tour.mp4");
            break;
            
            case 9:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/010B The Beatles [Disc 2] (1968)/White Album.mp4");
            break;
            
            case 10:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/011 Yellow Submarine (1969)/Yellow Submarine.mp4");
            break;
            
            case 11:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/012 Abbey Road (1969)/Abbey Road.mp4");
            break;
            
            case 12:
                cargaDocumental("C:/Users/Isra Gutiérrez/Music/Beatles/013 Let It Be (1970)/Let It Be.mp4");
            break;
        }
    }//GEN-LAST:event_botonVideosActionPerformed

    private void botonRetomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetomarActionPerformed
        Ventana1.mu.continuar();
        botonRetomar.setEnabled(false);
    }//GEN-LAST:event_botonRetomarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Albumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Albumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Albumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Albumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAlbum;
    private javax.swing.JTextPane TextoInfo;
    private javax.swing.JButton botonRetomar;
    private javax.swing.JButton botonVideos;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
