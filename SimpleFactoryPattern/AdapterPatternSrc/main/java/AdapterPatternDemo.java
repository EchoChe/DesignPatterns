package main.java;

import sun.net.www.content.text.plain;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.paly("mp3", "beyond the horzon.mp3");
		audioPlayer.paly("mp4", "alone.mp4");
		audioPlayer.paly("vlc", "far far away.vlc");
		audioPlayer.paly("avi", "mind me.avi");
	}
}
