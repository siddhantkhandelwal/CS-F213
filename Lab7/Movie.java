
public class Movie {
	interface Bookable {
		public void printTicket();
		public void giveTicket(String movie);
	}
	
	public void BookTheTicket() {
		class EnglishMovie implements Bookable {
			String name;
			public void printTicket() {
				giveTicket("BlindDate");
			}
			public void giveTicket(String movie) {
				name = movie;
				System.out.println("You have booked for the movie " + name);
			}
		}
		Bookable hollywood = new EnglishMovie();
		Bookable hindiMovie = new Bookable() {
			public void printTicket() {
				giveTicket("Bachna Ae Haseeno");
			}
			
			public void giveTicket(String movie) {
				String name = movie;
				System.out.println("You have booked for the movie "+ name);
			}
		};	
	}
	
	public static void main(String[] args) {
		Movie easyMovie = new Movie();
		easyMovie.BookTheTicket();
	}
}
