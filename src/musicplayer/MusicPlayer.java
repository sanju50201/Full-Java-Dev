package musicplayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    private Clip clip;
    private FloatControl volumeControl;

    public void play(String filePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
//        Read in the audio file
        File audioFile  = new File(filePath);
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(audioFile);

        AudioFormat format = audiostream.getFormat();

        DataLine.Info info = new DataLine.Info(Clip.class, format);
        clip = (Clip) AudioSystem.getLine(info);

        clip.open(audiostream);

//        get the volume control and set the initial volume
        volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volumeControl.setValue(-10.0f); // set volume to 10 dB below max

//        start playing the audio
        clip.start();
    }

    public void pause(){
        clip.stop();
    }

    public void skip(int seconds){
        clip.setMicrosecondPosition(clip.getMicrosecondPosition() + (seconds * 100000));
    }

    public void setVolume(float volume){
        volumeControl.setValue(volume);
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file path: ");
        String filePath = scanner.nextLine();

        player.play(filePath);

        while (true){
            System.out.println("Enter command (play, pause, skip, volume): ");
            String command = scanner.nextLine();

            if(command.equals("play")){
                player.play(filePath);
            } else if (command.equals("pause")) {
                player.pause();
            }else if(command.equals("skip")){
                System.out.println("Enter number of seconds to skip: ");
                int seconds = scanner.nextInt(); // consume newline character
                player.skip(seconds);
            } else if (command.equals("volume")) {
                System.out.println("Enter new volume (dB): ");
                float volume = scanner.nextFloat();
                scanner.nextLine();
                player.setVolume(volume);
            }else {
                System.out.println("Invalid command, Try again.");
            }
        }
    }
}
