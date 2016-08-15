package main.java;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter  mediaAdapter;
	
	@Override
	public void paly(String audioType, String filename) {

		if(audioType.equals("mp3"))
		{
			System.out.println("playing mp3 file. Name" + filename);
		}
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.paly(audioType, filename);
		}
		else {
			System.out.println("Invalid media." + audioType + "format not supported");
		}
	}
}
