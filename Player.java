import java.util.*;
import java.io.*;
public class Solution6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iccRank,noOfMatches,totalRuns;
		String playerName;
		Player p[] = new Player[5];
		for(int i=0;i<5;i++)
		{
			playerName = br.readLine();
			iccRank = Integer.parseInt(br.readLine());
			noOfMatches = Integer.parseInt(br.readLine());
			totalRuns = Integer.parseInt(br.readLine());
			p[i] = new Player(playerName,iccRank,noOfMatches,totalRuns);
		}
		int target = Integer.parseInt(br.readLine());
		playersMethod(target,p);
	}
	public static void playersMethod(int i,Player p[])
	{
		double avg;
		for(Player p1:p)
		{
			avg=p1.getTotalRuns()/p1.getNoOfMatches();
			if(p1.getNoOfMatches()>=i)
			{
				if(avg>=80)
				{
					System.out.println("Grade A Player");
				}
				else if(avg>=50 && avg<=79)
				{
					System.out.println("Grade B player");
				}
				else
				{
					System.out.println("Grade C player");
				}
			}
		}
	}

}
class Player
{
	private String playerName;
	private int iccRank;
	private int noOfMatches;
	private int totalRuns;
	public Player(String playerName, int iccRank, int noOfMatches, int totalRuns) {
		super();
		this.playerName = playerName;
		this.iccRank = iccRank;
		this.noOfMatches = noOfMatches;
		this.totalRuns = totalRuns;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getIccRank() {
		return iccRank;
	}
	public void setIccRank(int iccRank) {
		this.iccRank = iccRank;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	
}
