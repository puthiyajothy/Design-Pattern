package designpattern.memento;

import java.util.Stack;

public class PlayHistory {
	
	Stack <PlayList.Playlistmemento> history = new Stack();
	
	public void save(PlayList playList) {
		history.push(playList.save());
	}

	public void revert(PlayList playList) {
		if(!history.isEmpty()) {
			playList.revert(history.pop());
		}else {
			System.out.println("Can not undo");
		}
			
	}
}
