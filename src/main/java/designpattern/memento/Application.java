package designpattern.memento;

public class Application {

	public static void main(String[] args) {

		PlayHistory playHistory = new PlayHistory();
		PlayList playList = new PlayList();

		playList.addsong(new Song("song one"));
		playHistory.save(playList);
		System.out.println(playList);

		playList.addsong(new Song("song two"));
		playHistory.save(playList);
		System.out.println(playList);

		playList.addsong(new Song("song three"));
		playHistory.save(playList);
		System.out.println(playList);
		
		playHistory.revert(playList);
		System.out.println(playList);
		
		
		playList.addsong(new Song("song five"));
		//playHistory.save(playList);
		System.out.println(playList);

		playHistory.revert(playList);
		System.out.println(playList);
		
		playHistory.revert(playList);
		System.out.println(playList);
		
		playHistory.revert(playList);
		System.out.println(playList);
		
	}

}
