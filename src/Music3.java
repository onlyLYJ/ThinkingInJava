import Abstract.Music;
import Abstract.*;

public class Music3 {

	static void tune(Music music) {
		music.play();
	}
	
	static void tuneAll(Music[] musics) {
		for(Music m: musics) {
			tune(m);
		}
	}
	
	public static void main(String args[]) {
		Music[] musics = {
				new ClassicMusic(),
				new PopMusic(),
				new RockMusic()
		};
		
		tuneAll(musics);
	}
	
}
