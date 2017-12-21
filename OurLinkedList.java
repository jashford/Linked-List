public class OurLinkedList {

	public static void main(String[] args) {
		
		/*forms a new linked list
		the main method will add each of the songs that the user has picked to the linked list and will play them;
		the user can choose to add or delete any of the songs from the playlist using the LinkedList.java methods.*/
		LinkedList playlist = new LinkedList();
		
		//add
		playlist.add("Defeated No More", "/Users/Jack/Documents/Audacity/Defeated No More.wav");
		playlist.add("My Head Is A Jungle", "/Users/Jack/Documents/Audacity/My Head Is A Jungle.wav");
		playlist.add("Palm of My Hand", "/Users/Jack/Documents/Audacity/Palm of My Hand.wav");
		playlist.print(playlist);
		
		//delete
		//playlist.delete("Defeated No More", "/Users/Jack/Documents/Audacity/Defeated No More.wav");
		//playlist.delete("My Head Is A Jungle", "/Users/Jack/Documents/Audacity/My Head Is A Jungle.wav");
		//playlist.delete("Palm of My Hand", "/Users/Jack/Documents/Audacity/Palm of My Hand.wav");
		
		//boolean
		System.out.println(playlist.contains("Defeated No More", "/Users/Jack/Documents/Audacity/Defeated No More.wav"));
		System.out.println(playlist.contains("My Head Is A Jungle", "/Users/Jack/Documents/Audacity/My Head Is A Jungle.wav"));
		System.out.println(playlist.contains("Palm of My Hand", "/Users/Jack/Documents/Audacity/Palm of My Hand.wav"));
		
		//play
		playlist.play();
	}
}