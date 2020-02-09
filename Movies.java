package abc;
import java.io.*;
import java.util.*;

public class Solution4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String movieName,company,genre;
		int budget;
		Movie m[] = new Movie[4];
		for(int i=0;i<4;i++)
		{
			movieName = br.readLine();
			company = br.readLine();
			genre = br.readLine();
			budget = Integer.parseInt(br.readLine());
			m[i] = new Movie(movieName,company,genre,budget);
		}
		String search  = br.readLine();
		getMovieByGenre(search,m);

	}
	public static void getMovieByGenre(String s,Movie m1[])
	{
		ArrayList<String> al = new ArrayList<>();
		for(Movie m:m1)
		{
			if(m.getGenre().equalsIgnoreCase(s))
			{
				al.add(m.getGenre());
			}
		}
		for(String x:al)
		{
			for(Movie m:m1)
			{
				if(x.equalsIgnoreCase(m.getGenre()))
				{
					if(m.getBudget()>80000000)
					{
						System.out.println("High Budget Movie");
					}
					else
					{
						System.out.println("Low Budget Movie");
					}
				}
			}
		}
	}

}
class Movie
{
	private String movieName;
	private String company;
	private String genre;
	private int budget;
	public Movie(String movieName, String company, String genre, int budget) {
		super();
		this.movieName = movieName;
		this.company = company;
		this.genre = genre;
		this.budget = budget;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
}
