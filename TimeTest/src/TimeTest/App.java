package TimeTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

	
	public static void main(String[] args) {
	
		LocalDateTime maDate = LocalDateTime.now();
		//System.out.println(maDate);
		
	 
		DateTimeFormatter dateEx =DateTimeFormatter.ofPattern("hh:mm");
		
		
		String formatDate=maDate.format(dateEx);
		System.out.println(formatDate);
	
		String timer = formatDate+1;
		
		System.out.println(timer);
		
		
		
		
	}

}
