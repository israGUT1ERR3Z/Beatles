package beatles;

import java.io.*;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public class Musica{
    
    private Clip audioClip;
    private AudioInputStream audioStream;
    private int pos;
    
     public Musica(String path){
         File audioFile = new File(path);
         audioFile.mkdir();
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
        }
        catch (UnsupportedAudioFileException | IOException e) {
            JOptionPane.showMessageDialog(null,"ERROR\n"+e.getMessage());
        }

        AudioFormat format = audioStream.getFormat();
        var info = new DataLine.Info(Clip.class, format);

        //obtain the Clip
        try {
            audioClip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(audioFile);
            audioClip.open(ais);
        }
        catch (LineUnavailableException | IOException e) {
            JOptionPane.showMessageDialog(null,"ERROR\n"+e.getMessage());
        } catch (UnsupportedAudioFileException ex) {
            JOptionPane.showMessageDialog(null,"ERROR\n"+ex.getMessage());
        }
     }
     
     public void play() {
        new Thread( () -> {
            audioClip.setFramePosition(pos);
            audioClip.start();
        }){}.start();
    }

    public void loop() {
        new Thread( () -> {
            audioClip.setFramePosition(pos);
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);
        }){}.start();
    }

    public void Stop() {
        audioClip.setFramePosition(0);
        audioClip.stop();
    }
    
    public void pause(){
        pos= audioClip.getFramePosition();
        audioClip.stop();
    }
    
    public void continuar(){
        audioClip.setFramePosition(pos);
        audioClip.start();
    }
    
    public void adelantar(){
        pos= audioClip.getFramePosition()+175000;
        audioClip.stop();
        continuar();
    }
    
    public void atrasar(){
        pos= audioClip.getFramePosition()-175000;
        audioClip.stop();
        continuar();
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
}
