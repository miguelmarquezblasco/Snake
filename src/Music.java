
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miguel
 */
public class Music {

    private static final Music instance = new Music();
    public static InputStream music;
    public static InputStream apple;
    public static InputStream gameOver;
    public static AudioStream musicAudio;
    public static AudioStream appleAudio;
    public static AudioStream gameOverAudio;

    public Music() {
        try {
            music = new FileInputStream(new File("src/musica/fondo.wav"));
            musicAudio = new AudioStream(music);
            
        } catch (FileNotFoundException e) {
        } catch (IOException e) {}
    }

    public static Music getInstance() {
        return instance;
    }

    public static void musicOn() {
        AudioPlayer.player.start(musicAudio);
    }

    public static void musicOff() {
        AudioPlayer.player.stop(musicAudio);
    }

    public static void eatOn() {
        try {
            apple = new FileInputStream(new File("src/musica/apple.wav"));
            appleAudio = new AudioStream(apple);
            
        } catch (FileNotFoundException e) {
        } catch (IOException e) {}
        
        AudioPlayer.player.start(appleAudio);
    }
    
    public static void gameOverOn() {
        try {
            gameOver = new FileInputStream(new File("src/musica/gameOver.wav"));
            gameOverAudio = new AudioStream(gameOver);
            
        } catch (FileNotFoundException e) {
        } catch (IOException e) {} 
        
        AudioPlayer.player.start(gameOverAudio);
    }
    
}
