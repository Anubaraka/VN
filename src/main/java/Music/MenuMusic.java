package Music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

import static java.lang.Thread.sleep;

public class MenuMusic implements Runnable {

    private Clip clip;

    @Override
    public void run() {
        try{
            clip= AudioSystem.getClip();
            AudioInputStream inputStream=AudioSystem.getAudioInputStream(new File("src/main/resources/Sound/MenuMusic.wav"));
            clip.open(inputStream);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void stop()
    {
        clip.stop();
    }
}
