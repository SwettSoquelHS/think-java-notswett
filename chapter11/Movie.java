public class Movie{

	public static void main(String[] args){

		int[] testVals = new int[]{1,2,3};

		System.out.println("Welome to the movie app!");
		Movie[] catalog = new Movie[100];

		//Movie object instances
		Movie starWars = new Movie("Star Wars", 1977);
		Movie sWars = new Movie("Star Wars", 1977);
		
		if(starWars == sWars){
			System.out.println("Zuh?");
		} else {
			System.out.println("Same idea but different references.");
		}

		if(starWars.equals(sWars)){
			System.out.println("They are the same.");
		}
	}

	//member variables (instance variables too)
	String movieTitle;
	int year;

	//Movie Constructor
	public Movie(String title, int year){
		movieTitle = title;
		this.year = year;
	}

	public boolean equals(Movie m){
		if(this.year == m.year 
			&& movieTitle.equals(m.movieTitle))
			return true;
		return false;
	}

	public String toString(){
		return "[" + movieTitle + ", " + year + "]";
	}

}








