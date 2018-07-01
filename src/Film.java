
public class Film {
	public static void main(String[] args) {
		Movie HarryPotter = new Movie("Harry Potter", 3);
		Movie Spiderman = new Movie("Spiderman Homecoming", 5);
		Movie It = new Movie("It", 2);
		Movie Monday = new Movie("What happened to Monday", 1);
		Movie Me = new Movie("Me Before You", 2);
		Movie Incredibles = new Movie("Incredibles 2", 5);
		Movie Jaws = new Movie("Jaws", 3);
		Movie Pink = new Movie("Pink Panther", 4);
		Movie San = new Movie("San Andreas", 4);
		Movie Aladdin = new Movie("Aladdin", 5);
		Movie Baywatch = new Movie("Baywatch", 1);
		Movie Greatest = new Movie("The Greatest Showman", 2);
		
		It.getTicketPrice();
		NetflixQueue mine = new NetflixQueue();
		mine.addMovie(Spiderman);
		mine.addMovie(Incredibles);
		mine.addMovie(HarryPotter);
		mine.addMovie(Aladdin);
		mine.addMovie(It);
		mine.addMovie(San);
		mine.sortMoviesByRating();
		System.out.println("The best movie is " + mine.getBestMovie());
		System.out.println("The second best movie is " + mine.getMovie(1));
		mine.printMovies();
	}

}
