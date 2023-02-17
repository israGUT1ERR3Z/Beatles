package beatles;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reproducir {
    
    private Clip audioClip;
    private AudioInputStream audioStream;
    private long clipTime;
    
     public Reproducir(String path){
         File audioFile = new File(path);
         audioFile.mkdir();
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
        }
        catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
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
            e.printStackTrace();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Reproducir.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void play() {
        new Thread( () -> {
            audioClip.setFramePosition(0);
            audioClip.start();
        }){}.start();
    }

    public void loop() {
        new Thread( () -> {
            audioClip.setFramePosition(0);
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);
        }){}.start();
    }

    public void stop() {
        audioClip.stop();
    }
    
    public void pause(){
        clipTime= audioClip.getMicrosecondPosition();
        audioClip.stop();
    }
    
    public void continuar(){
        audioClip.setMicrosecondPosition(clipTime);
        audioClip.start();
    }
    
    
}
