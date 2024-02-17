public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audio , String fileName){
        if(audio.equalsIgnoreCase("mp3")){
            System.out.println("Playing Mp3 file... Name : " + fileName );
        }
        else if ( audio.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audio);
            mediaAdapter.play(audio, fileName);
        }
        else{
            System.out.println("Invalid media. " + audio + " format not supported");
        }
    }

}
