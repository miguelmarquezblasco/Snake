/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
import java.io.*;
import java.util.logging.*;

public class Configuration implements Serializable {

    private static Configuration configuration = null;
    private boolean music = true;
    private int difficulty = 80;

    private Configuration() {}
    
    public static Configuration getInstance() {
        ObjectInputStream in = null;
        if (configuration == null) {
            configuration = new Configuration();
            try {
                in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("configuration.dat")));
                configuration = (Configuration) in.readObject();
                
            } catch (FileNotFoundException e) {
            } catch (IOException | ClassNotFoundException e) {
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException ex) {
                        
                    }
                }
            }
        }
        return configuration;
    }

    public void save() throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("configuration.dat")));
            out.writeObject(configuration);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public void setMusic(boolean music) {
        this.music = music;
        try {
            save();
        } catch (IOException ex) {}
    }
 
    public boolean isMusic() {
        return music;
    }
  
    public void setDifficulty(int difficulty) {
        this.difficulty=difficulty;
        try {
            save();
        } catch (IOException e) {}
    }
    
    public int getDifficulty() {
        return difficulty;
    }
    
}
