package beatles;

import java.awt.*;
import javax.swing.*;


public class Ventana1 extends javax.swing.JFrame {

    private DefaultListModel a;
    private Albumes v;
    private String[] A1={"I Saw Her Standing There","Misery","Anna (Go To Him)","Chains","Boys","Ask Me Why",
        "Please Please Me","Love Me Do","P.S. I Love You","Baby It's You","Do You Want To Know A Secret",
        "A Taste Of Honey","There's a Place","Twist and Shout"},
            A2={"It Won't Be Long","All I've Got to Do","All My Loving","Don't Bother Me","Little Child",
                "Till There Was You","Please Mister Postman","Roll Over Beethoveen","Hold Me Tight",
                "You've Really Got a Hold on Me","I Wanna Be Your Man","Devil in Her Heart","Not a Second Time",
                "Money (That's What I Want)"},
            A3={"A Hard Day's Night","I Should Have Known Better","If I Fell","I'm Happy Just to Dance with You",
                "And I Love Her","Tell Me Why","Can't Buy Me Love","Any Time at All","I'll Cry Instead",
                "Things We Said Today","When I Get Home","You Can't Do That","I'll Be Back"},
            A4={"No Reply","I'm a Loser","Baby's in Black","Rock & Roll Music","I'll Follow the Sun",
                "Mr. Moonlight","Kansas City-Hey-Hey-Hey-Hey! [Medley]","Eight Days a Week","Words of Love",
                "Honey Don't","Every Little Thing","I Don't Want to Spoil the Party","What You're Doing",
                "Everybody's Trying to Be My Baby"},
            A5={"Help!","The Night Before","You've Got to Hide Your Love Away","I Need You","Another Girl",
                "You're Going to Lose That Girl","Ticket to Ride","Act Naturally","It's Only Love",
                "You Like Me Too Much","Tell Me What You See","I've Just Seen a Face","Yesterday","Dizzy Miss Lizzy"},
            A6={"Drive My Car","Norwegian Wood (This Bird Has Flown)","You Won't See Me","Nowhere Man",
                "Think for Yourself","The Word","Michelle","What Goes On","Girl","I'm Looking Through You",
                "In My Life","Wait","If I Needed Someone","Run for Your Life"},
            A7={"Taxman","Eleanor Rigby","I'm Only Sleeping","Love You To","Here, There and Everywhere",
                "Yellow Submarine","She Said She Said","Good Day Sunshine","And Your Bird Can Sing","For No One",
                "Doctor Robert","I Want To Tell You","Got To Get You Into My Life","Tomorrow Never Knows"},
            A8={"Sgt. Pepper's Lonely Hearts Club Band","With A Little Help From My Friends",
                "Lucy In The Sky With Diamonds","Getting Better","Fixing a Hole","She's Leaving Home",
                "Being For The Benefit Of Mr. Kite!","Within You Without You","When I'm Sixty-Four","Lovely Rita",
                "Good Morning Good Morning","Sgt. Pepper's Lonely Hearts Club Band (Reprise)","A Day In The Life"},
            A9={"Magical Mystery Tour","The Fool On The Hill","Flying","Blue Jay Way","Your Mother Should Know",
                "I Am The Walrus","Hello Goodbye","Strawberry Fields Forever","Penny Lane","Baby You're A Rich Man",
                "All You Need Is Love"},
            A10={"Back In The U.S.S.R","Dear Prudence","Glass Onion","Ob-La-Di, Ob-La-Da","Wild Honey Pie",
                "The Continuing History Of Bungalow Bill","While My Guitar Gently Weeps","Happiness Is A Warm Gun",
                "Martha My Dear","I'm So Tired","Blackbird","Piggies","Rocky Raccoon","Don't Pass Me By",
                "Why Don't We Do It In The Road","I Will","Julia","Birthday","Yer Blues","Mother's Nature Son",
                "Everybody's Got Something To Hide Except Me And My Monkey","Sexy Sadie","Helter Skelter",
                "Long, Long, Long","Revolution 1","Honey Pie","Savoy Truffle","Cry Baby Cry","Revolution 9",
                "Good Night"},
            A11={"Yellow Submarine","Only A Northern Song","All Together Now","Hey Bulldog","It's All Too Much",
                "All You Need Is Love","Pepperland","Sea Of Time","Sea Of Holes","Sea Of Monsters",
                "March Of The Meanies","Pepperland Laid Waste","Yellow Submarine In Pepperland"},
            A12={"Come Together","Something","Maxwell's Silver Hammer","Oh! Darling","Octopus's Garden",
                "I Want You (She's So Heavy)","Here Comes The Sun","Because","You Never Give Me Your Money","Sun King",
                "Mean Mr. Mustard","Polythene Pam","She Came In Through The Bathroom Window","Golden Slumbers",
                "Carry That Weight","The End","Her Majesty"},
            A13={"Two Of Us","Dig A Pony","Across The Universe","I Me Mine","Dig It","Let It Be","Maggie Mae",
                "I've Got A Feeling","One After 909","The Long And Winding Road","For You Blue","Get Back"};
    public static Musica mu;

    public Ventana1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(234, 234, 234));
        Logo();
    }

    public void Album(String URL){
        ImageIcon imagen=new ImageIcon("./src/Imagenes/"+URL);
        Image escala=imagen.getImage();
        escala=escala.getScaledInstance(LabelAlbumes.getWidth(),LabelAlbumes.getHeight(),Image.SCALE_DEFAULT);
        imagen=new ImageIcon(escala);
        LabelAlbumes.setIcon(imagen);
    }
    
    public void Logo(){
        ImageIcon imagen=new ImageIcon("./src/Imagenes/beatles.png");
        Image escala=imagen.getImage();
        escala=escala.getScaledInstance(LabelLogo.getWidth(),LabelLogo.getHeight(),Image.SCALE_DEFAULT);
        imagen=new ImageIcon(escala);
        LabelLogo.setIcon(imagen);
    }
    
    public void TrackList(int num){
        a=new DefaultListModel();
        switch(num+1){
            case 1:
                for(int i=0; i<A1.length;i++){
                    a.addElement(A1[i]);
                }
            break;
            
            case 2:
                for(int i=0; i<A2.length;i++){
                    a.addElement(A2[i]);
                }
            break;
            
            case 3:
                for(int i=0; i<A3.length;i++){
                    a.addElement(A3[i]);
                }
            break;
            
            case 4:
                for(int i=0; i<A4.length;i++){
                    a.addElement(A4[i]);
                }
            break;
            
            case 5:
                for(int i=0; i<A5.length;i++){
                    a.addElement(A5[i]);
                }
            break;
            
            case 6:
                for(int i=0; i<A6.length;i++){
                    a.addElement(A6[i]);
                }
            break;
            
            case 7:
                for(int i=0; i<A7.length;i++){
                    a.addElement(A7[i]);
                }
            break;
            
            case 8:
                for(int i=0; i<A8.length;i++){
                    a.addElement(A8[i]);
                }
            break;
            
            case 9:
                for(int i=0; i<A9.length;i++){
                    a.addElement(A9[i]);
                }
            break;
            
            case 10:
                for(int i=0; i<A10.length;i++){
                    a.addElement(A10[i]);
                }
            break;
            
            case 11:
                for(int i=0; i<A11.length;i++){
                    a.addElement(A11[i]);
                }
            break;
            
            case 12:
                for(int i=0; i<A12.length;i++){
                    a.addElement(A12[i]);
                }
            break;
            
            case 13:
                for(int i=0; i<A13.length;i++){
                    a.addElement(A13[i]);
                }
            break;
        }
        
        TrackList.setModel(a);
        
    }
    
    public void cancion(String ruta){
        if(mu!=null){
            mu.Stop();
            mu=null;
            System.gc();
            mu=new Musica(ruta);
            mu.play();
        }else{
            mu=new Musica(ruta);
            mu.play();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TrackList = new javax.swing.JList<>();
        LabelAlbumes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaAlbumes = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        BotonInfoAlbum = new javax.swing.JButton();
        LabelLogo = new javax.swing.JLabel();
        botonPause = new javax.swing.JToggleButton();
        adelantar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        botonStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE BEATLES");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        TrackList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrackListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TrackList);

        LabelAlbumes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ListaAlbumes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Please Please Me", "With The Beatles", "A Hard Day's Night", "Beatles For Sale", "Help!", "Rubber Soul", "Revolver", "Sgt. Pepper's Lonely Hearts Club Band", "Magical Mystery Tour", "The Beatles (The White Album)", "Yellow Submarine", "Abbey Road", "Let It Be" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaAlbumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaAlbumesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListaAlbumes);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BotonInfoAlbum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonInfoAlbum.setText("VER INFORMACIÓN DEL ÁLBUM");
        BotonInfoAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInfoAlbumActionPerformed(evt);
            }
        });

        botonPause.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pause.png"))); // NOI18N
        botonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPauseActionPerformed(evt);
            }
        });

        adelantar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ade.png"))); // NOI18N
        adelantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelantarActionPerformed(evt);
            }
        });

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reg.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        botonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stop.png"))); // NOI18N
        botonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonInfoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(LabelAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPause)
                        .addGap(5, 5, 5)
                        .addComponent(botonStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adelantar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonInfoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adelantar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPause, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInfoAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInfoAlbumActionPerformed
        int opc=ListaAlbumes.getSelectedIndex();
        switch(opc){
            case 0:
                v=new Albumes("PleasePleaseMe.jpg",opc);
                v.getContentPane().setBackground(new Color(239, 246, 130 ));
                v.setVisible(true);
            break;
            
            case 1:
                v=new Albumes("WiththeBeatles.jpg",opc);
                v.getContentPane().setBackground(new Color(186, 186, 184 ));
                v.setVisible(true);
            break;
            
            case 2:
                v=new Albumes("AHardDaysNight.jpg",opc);
                v.getContentPane().setBackground(new Color(126, 151, 213));
                v.setVisible(true);
            break;
            
            case 3:
                v=new Albumes("BeatlesForSale.jpg",opc);
                v.getContentPane().setBackground(new Color(240, 244, 146 ));
                v.setVisible(true);
            break;
            
            case 4:
                v=new Albumes("Help.jpg",opc);
                v.getContentPane().setBackground(new Color(146, 200, 244 ));
                v.setVisible(true);
            break;
            
            case 5:
                v=new Albumes("RubberSoul.jpg",opc);
                v.getContentPane().setBackground(new Color(213, 157, 126));
                v.setVisible(true);
            break;
            
            case 6:
                v=new Albumes("Revolver.jpg",opc);
                v.getContentPane().setBackground(new Color(186, 186, 184 ));
                v.setVisible(true);
            break;
            
            case 7:
                v=new Albumes("SgtPepper.jpg",opc);
                v.getContentPane().setBackground(new Color(146, 200, 244 ));
                v.setVisible(true);
            break;
            
            case 8:
                v=new Albumes("MagicalMysteryTour.jpg",opc);
                v.getContentPane().setBackground(new Color(239, 246, 130 ));
                v.setVisible(true);
            break;
            
            case 9:
                v=new Albumes("WhiteAlbum.jpg",opc);
                v.getContentPane().setBackground(new Color(186, 186, 184 ));
                v.setVisible(true);
            break;
            
            case 10:
                v=new Albumes("YellowSubmarine.jpg",opc);
                v.getContentPane().setBackground(new Color(239, 246, 130 ));
                v.setVisible(true);
            break;
            
            case 11:
                v=new Albumes("AbbeyRoad.jpg",opc);
                v.getContentPane().setBackground(new Color(146, 200, 244 ));
                v.setVisible(true);
            break;
            
            case 12:
                v=new Albumes("LetItBe.jpg",opc);
                v.getContentPane().setBackground(new Color(232, 192, 159));
                v.setVisible(true);
            break;
        }
    }//GEN-LAST:event_BotonInfoAlbumActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPauseActionPerformed
        if(botonPause.isSelected()){
            botonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png")));
            mu.pause();
        }else{
            botonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pause.png")));
            mu.continuar();
        }
    }//GEN-LAST:event_botonPauseActionPerformed

    private void adelantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelantarActionPerformed
        mu.adelantar();
    }//GEN-LAST:event_adelantarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        mu.atrasar();
    }//GEN-LAST:event_regresarActionPerformed

    private void ListaAlbumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaAlbumesMouseClicked
        int opc=ListaAlbumes.getSelectedIndex();
        switch(opc){
            case 0:
                Album("PleasePleaseMe.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(239, 246, 130 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/01 I Saw Her Standing There.wav");
            break;
            
            case 1:
                Album("WiththeBeatles.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(186, 186, 184 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/01 It Won't Be Long.wav");  
            break;
            
            case 2:
                Album("AHardDaysNight.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(126, 151, 213));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/01 A Hard Day's Night.wav");
            break;
            
            case 3:
                Album("BeatlesForSale.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(240, 244, 146 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/01 No Reply.wav");
            break;
            
            case 4:
                Album("Help.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(146, 200, 244 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/01 Help!.wav");
            break;
            
            case 5:
                Album("RubberSoul.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(213, 157, 126));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/01 Drive My Car.wav");
            break;
            
             case 6:
                Album("Revolver.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(186, 186, 184 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/01 - Taxman.wav"); 
            break;
            
            case 7:
                Album("SgtPepper.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(146, 200, 244 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/01 - Sgt. Pepper's Lonely Hearts Club "
                                + "Band.wav");
            break;
            
            case 8:
                Album("MagicalMysteryTour.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(239, 246, 130 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/01 Magical Mystery Tour.wav");
            break;
            
            case 9:
                Album("WhiteAlbum.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(186, 186, 184 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/01. Back In The U.S.S.R..wav");  
            break;
            
            case 10:
                Album("YellowSubmarine.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(239, 246, 130 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/01 Yellow Submarine.wav");  
            break;
            
            case 11:
                Album("AbbeyRoad.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(146, 200, 244 ));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/01 Come Together.wav");  
            break;
            
            case 12:
                Album("LetItBe.jpg");
                TrackList(opc);
                this.getContentPane().setBackground(new Color(232, 192, 159));
                cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/01 Two Of Us.wav");  
            break;
        }
    }//GEN-LAST:event_ListaAlbumesMouseClicked

    private void TrackListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrackListMouseClicked
        int opc=ListaAlbumes.getSelectedIndex(),opc2=TrackList.getSelectedIndex();
        switch(opc){
            case 0:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/01 I Saw Her Standing There.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/02 Misery.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/03 Anna (Go to Him).wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/04 Chains.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/05 Boys.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/06 Ask Me Why.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/07 Please Please Me.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/08 Love Me Do.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/09 P.S. I Love You.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/10 Baby It's You.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/11 Do You Want to Know a Secret.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/12 A Taste of Honey.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/13 There's a Place.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM1/14 Twist and Shout.wav"); 
                    break;
                }
            break;
            
            case 1:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/01 It Won't Be Long.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/02 All I've Got to Do.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/03 All My Loving.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/04 Don't Bother Me.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/05 Little Child.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/06 Till There Was You.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/07 Please Mister Postman.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/08 Roll Over Beethoven.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/09 Hold Me Tight.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/10 You've Really Got a Hold on Me.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/11 I Wanna Be Your Man.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/12 Devil in Her Heart.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/13 Not a Second Time.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM2/14 Money (That's What I Want).wav"); 
                    break;
                }
             break;
             
             case 2:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/01 A Hard Day's Night.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/02 I Should Have Known Better.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/03 If I Fell.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/04 I'm Happy Just to Dance with You.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/05 And I Love Her.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/06 Tell Me Why.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/07 Can't Buy Me Love.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/08 Any Time at All.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/09 I'll Cry Instead.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/10 Things We Said Today.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/11 When I Get Home.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/12 You Can't Do That.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM3/13 I'll Be Back.wav"); 
                    break;
                }
             break;
             
             case 3:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/01 No Reply.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/02 I'm a Loser.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/03 Baby's in Black.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/04 Rock & Roll Music.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/05 I'll Follow the Sun.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/06 Mr. Moonlight.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/07 Medley- Kansas City-Hey-Hey-Hey-Hey! "
                                + "[Medley].wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/08 Eight Days a Week.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/09 Words of Love.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/10 Honey Don't.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/11 Every Little Thing.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/12 I Don't Want to Spoil the Party.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/13 What You're Doing.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM4/14 Everybody's Trying to Be My Baby.wav"); 
                    break;
                }
             break;
             
              case 4:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/01 Help!.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/02 The Night Before.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/03 You've Got to Hide Your Love Away.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/04 I Need You.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/05 Another Girl.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/06 You're Going to Lose That Girl.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/07 Ticket to Ride.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/08 Act Naturally.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/09 It's Only Love.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/10 You Like Me Too Much.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/11 Tell Me What You See.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/12 I've Just Seen a Face.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/13 Yesterday.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM5/14 Dizzy Miss Lizzy.wav"); 
                    break;
                }
             break;
             
             case 5:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/01 Drive My Car.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/02 Norwegian Wood (This Bird Has "
                                + "Flown).wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/03 You Won't See Me.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/04 Nowhere Man.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/05 Think for Yourself.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/06 The Word.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/07 Michelle.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/08 What Goes On.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/09 Girl.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/10 I'm Looking Through You.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/11 In My Life.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/12 Wait.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/13 If I Needed Someone.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM6/14 Run for Your Life.wav"); 
                    break;
                }
             break;
             
             case 6:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/01 - Taxman.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/02 - Eleanor Rigby.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/03 - I'm Only Sleeping.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/04 - Love You To.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/05 - Here, There And Everywhere.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/06 - Yellow Submarine.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/07 - She Said She Said.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/08 - Good Day Sunshine.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/09 - And Your Bird Can Sing.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/10 - For No One.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/11 - Doctor Robert.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/12 - I Want To Tell You.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/13 - Got To Get You Into My Life.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM7/14 - Tomorrow Never Knows.wav"); 
                    break;
                }
             break;
             
             case 7:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/01 - Sgt. Pepper's Lonely Hearts Club "
                                + "Band.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/02 - With A Little Help From My "
                                + "Friends.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/03 - Lucy In The Sky With Diamonds.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/04 - Getting Better.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/05 - Fixing A Hole.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/06 - She's Leaving Home.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/07 - Being For The Benefit Of "
                                + "Mr. Kite!.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/08 - Within You Without You.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/09 - When I'm Sixty-Four.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/10 - Lovely Rita.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/11 - Good Morning Good Morning.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/12 - Sgt. Pepper's Lonely Hearts "
                                + "Club Band (Reprise).wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM8/13 - A Day In The Life.wav"); 
                    break;
                }
             break;
             
             case 8:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/01 Magical Mystery Tour.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/02 The Fool on the Hill.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/03 Flying.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/04 Blue Jay Way.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/05 Your Mother Should Know.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/06 I Am the Walrus.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/07 Hello Goodbye.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/08 Strawberry Fields Forever.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/09 Penny Lane.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/10 Baby You're a Rich Man.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM9/11 All You Need Is Love.wav"); 
                    break;
                }
             break;
             
             case 9:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/01. Back In The U.S.S.R..wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/02. Dear Prudence.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/03. Glass Onion.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/04. Ob-La-Di, Ob-La-Da.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/05. Wild Honey Pie.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/06. The Continuing Story Of Bungalow "
                                + "Bill.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/07. While My Guitar Gently Weeps.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/08. Happiness Is A Warm Gun.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/09. Martha My Dear.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/10. I'm So Tired.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/11. Blackbird.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/12. Piggies.wav");   
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/13. Rocky Raccoon.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/14. Don't Pass Me By.wav"); 
                    break;
                    
                    case 14:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/15. Why Don't We Do It In The Road.wav"); 
                    break;
                    
                    case 15:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/16. I Will.wav"); 
                    break;
                    
                    case 16:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/17. Julia.wav"); 
                    break;
                    
                    case 17:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/18. Birthday.wav"); 
                    break;
                    
                    case 18:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/19. Yer Blues.wav"); 
                    break;
                    
                    case 19:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/20. Mother Nature's Son.wav"); 
                    break;
                    
                    case 20:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/21. Everybody's Got Something To "
                                + "Hide Except Me And My Monkey.wav"); 
                    break;
                    
                    case 21:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/22. Sexy Sadie.wav"); 
                    break;
                    
                    case 22:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/23. Helter Skelter.wav"); 
                    break;
                    
                    case 23:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/24. Long, Long, Long.wav"); 
                    break;
                    
                    case 24:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/25. Revolution 1.wav"); 
                    break;
                    
                    case 25:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/26. Honey Pie.wav"); 
                    break;
                    
                    case 26:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/27. Savoy Truffle.wav"); 
                    break;
                    
                    case 27:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/28. Cry Baby Cry.wav"); 
                    break;
                    
                    case 28:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/29. Revolution 9.wav"); 
                    break;
                    
                    case 29:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM10/30. Good Night.wav"); 
                    break;
                }
             break;
             
             case 10:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/01 Yellow Submarine.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/02 Only a Northern Song.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/03 All Together Now.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/04 Hey Bulldog.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/05 It's All Too Much.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/06 All You Need Is Love.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/07 Pepperland.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/08 Sea of Time.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/09 Sea of Holes.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/10 Sea of Monsters.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/11 March of the Meanies.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/12 Pepperland Laid Waste.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM11/13 Yellow Submarine in Pepperland.wav"); 
                    break;
                }
             break;
             
             case 11:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/01 Come Together.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/02 Something.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/03 Maxwell's Silver Hammer.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/04 Oh! Darling.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/05 Octopus's Garden.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/06 I Want You (She's So Heavy).wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/07 Here Comes The Sun.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/08 Because.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/09 You Never Give Me Your Money.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/10 Sun King.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/11 Mean Mr. Mustard.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/12 Polythene Pam.wav"); 
                    break;
                    
                    case 12:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/13 She Came In Through The Bathroom "
                                + "Window.wav"); 
                    break;
                    
                    case 13:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/14 Golden Slumbers.wav"); 
                    break;
                    
                    case 14:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/15 Carry That Weight.wav"); 
                    break;
                    
                    case 15:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/16 The End.wav"); 
                    break;
                    
                    case 16:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM12/17 Her Majesty.wav"); 
                    break;
                }
             break;
             
             case 12:
                switch(opc2){
                    case 0:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/01 Two Of Us.wav");   
                    break;
                    
                    case 1:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/02 Dig A Pony.wav"); 
                    break;
                    
                    case 2:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/03 Across The Universe.wav"); 
                    break;
                    
                    case 3:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/04 I Me Mine.wav"); 
                    break;
                    
                    case 4:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/05 Dig It.wav"); 
                    break;
                    
                    case 5:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/06 Let It Be.wav"); 
                    break;
                    
                    case 6:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/07 Maggie Mae.wav"); 
                    break;
                    
                    case 7:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/08 I've Got A Feeling.wav"); 
                    break;
                    
                    case 8:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/09 One After 909.wav"); 
                    break;
                    
                    case 9:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/10 The Long And Winding Road.wav"); 
                    break;
                    
                    case 10:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/11 For You Blue.wav"); 
                    break;
                    
                    case 11:
                        cancion("C:/Users/Isra Gutiérrez/Desktop/ALBUMES/ALBUM13/12 Get Back.wav"); 
                    break;
                }
             break;
        }
    }//GEN-LAST:event_TrackListMouseClicked

    private void botonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStopActionPerformed
        mu.Stop();
    }//GEN-LAST:event_botonStopActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInfoAlbum;
    private javax.swing.JLabel LabelAlbumes;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JList<String> ListaAlbumes;
    private javax.swing.JList<String> TrackList;
    private javax.swing.JButton adelantar;
    private javax.swing.JToggleButton botonPause;
    private javax.swing.JButton botonStop;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
