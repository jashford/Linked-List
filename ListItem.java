import jm.util.*;

//defines the variables that will be used within the other classes
public class ListItem {
	String title;
	String path;
	ListItem next;
    ListItem prev;
	float[] songData;
	//float[] hugesongData;
	
	//sets up a public method containing the name of the song used and its location on the user's computer
	public ListItem(String title, String path) {
		this.title = title;
		this.path = path;
		this.songData = Read.audio(path);
		//this.hugesongData = Read.audio(path);
	}
}