public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play (String audio, String filename){
        if (audio.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }

}
