import jm.util.*;

public class LinkedList {
	ListItem first;
	ListItem last;
	ListItem next;
	ListItem prev;
	int size;
	
	/*1. add method: method adds a new song with the title stored in the parameter new SongTitle;
	after the song with the title stored in the parameter titlePosition;
	method also adds a new song to the end of the Linked List.*/
	public void add(String title, String path) {
		if(last == null) {
			last = new ListItem(title, path);
			first = last;
			size++;
		}
		else {
			last.next = new ListItem(title, path);
			last.next.prev = last;
			last = last.next;
			size++;
		}
	}
	
	/*2. delete method: deletes the song in your playlist that matches the string passed into your method;
	the method is able to delete any of the three  songs that are in the playlist, 
	including handling the case of deleting the only song in the playlist.*/
	public void delete(String title, String path) {
		ListItem counter = first;
		while(counter.title != title)
			counter = counter.next;
		
		if(counter == first) {
			first = counter.next;
			first.prev = null;
			size--;
		}
		
		else if(counter == last) {
			last = counter.prev;
			last.next = null;
			size--;
		}
		
		else {
			counter.prev.next = counter.next;
			counter.next.prev = counter.prev;
			counter.next = null;
			counter.prev = null;
			size--;
		}
	}
	
	//3. getTitle method: locates the name of the songs the user wishes to read in at given locations
	public String getTitle(int index) {
		int counter = 0;
		ListItem item = first;
		while(counter < index && index < size) {
			item = item.next;
			counter++;
		}
			return item.title;
	}
	
	public void print(LinkedList playlist) {
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ": " + playlist.getTitle(i));
		}
	}
	
	/*4. boolean method: return trues if a song with the title passed into your method is present in the playlist;
	if a song with the title passed into the method isn't present in the playlist,  the method returns false.*/
	public boolean contains(String title, String path) {
		int rep = 0;
		if(first == null) {
			return false;
		}
		ListItem counter = first;
		while(counter != null) {
			if(counter.title.equals(title)) {
				rep++;
			}
			counter = counter.next;
		}
			if(rep >= 1) {
				return true;
			}
			else {
				return false;
			}
	}

	//5. play method: plays all of the songs in the playlist in order
	public void play() {		
		ListItem counter = first;
		while(!(counter.title.equals(last.title))) {
			Write.audio(counter.songData, "Playlist.wav", 2, 44100, 16);
			Play.au("Playlist.wav");
			counter = counter.next;
		}
		if(counter.title.equals(last.title)) {
			Write.audio(counter.songData, "Playlist.wav", 2, 44100, 16);
			Play.au("Playlist.wav");
		}
	}
}		