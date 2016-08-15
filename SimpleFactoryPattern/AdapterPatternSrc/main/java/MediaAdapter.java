package main.java;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equals("vlc"))
			advancedMediaPlayer = new VlcPlayer();
		else if(audioType.equals("mp4"))
			advancedMediaPlayer = new Mp4Player();
	}
	
	@Override
	public void paly(String audioType, String filename) {
		if(audioType.equals("vlc"))
			advancedMediaPlayer.playVlc(filename);
		else if(audioType.equals("mp4"))
			advancedMediaPlayer.playMp4(filename);
	}

}
