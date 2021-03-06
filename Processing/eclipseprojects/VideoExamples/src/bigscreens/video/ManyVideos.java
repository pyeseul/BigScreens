/**
 * Fall 2013 Big Screens Examples
 * https://github.com/ITPNYU/BigScreens
 * 
 * Note this project uses Processing 2.0.1
 */


package bigscreens.video;

import processing.core.*;
import processing.video.Movie;

public class ManyVideos extends PApplet {

	//--------------------------------------
	static public void main(String args[]) {
		// Windowed
		PApplet.main(new String[] { bigscreens.video.ManyVideos.class.getName() });
		// FullScreen Exclusive Mode
		//PApplet.main(new String[] {"--present", bigscreens.video.ManyVideos.class.getName() });
	}

	Movie[] movies;

	//--------------------------------------
	public void setup() {
		size(800,600);

		movies = new Movie[20];
		for (int i = 0; i < movies.length; i++) {
			if (i % 2 == 0) {
				movies[i] = new Movie(this,"fingers.mov");
			} else {
				movies[i] = new Movie(this,"station.mov");

			}
			movies[i].loop();
			println(i);
			
		}


	}

	public void movieEvent(Movie m) {
		m.read();
	}


	public void draw() {
		background(255);




		randomSeed(1);
		for (int i = 0; i < movies.length; i++) {
			float x = random(width);
			float y = random(height);
			image(movies[i],x,y,64,64);

		}


	}





}
