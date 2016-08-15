package main.java;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		System.out.println("playing vlc file. name: " + filename);
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub

	}

}
