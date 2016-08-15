package main.java;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String filename) {
		System.out.println("Playing Mp4 file. name:" + filename);
	}

}
