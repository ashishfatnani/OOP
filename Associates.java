package abc;
import java.io.*;
import java.util.*;
public class Solution7 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String id,name,technology;
			int exp;
			Associate arr[] = new Associate[4];
		for(int i=0;i<4;i++)
		{
			id = br.readLine();
			name = br.readLine();
			technology = br.readLine();
			exp = Integer.parseInt(br.readLine());
			arr[i] = new Associate(id,name,technology,exp);
			
		}
		String search = br.readLine();
		associatesForGivenTechnology(search,arr);
		
		
	}
	public static void associatesForGivenTechnology(String s,Associate a[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(Associate a1 : a)
		{
			if(a1.getTechnology().equalsIgnoreCase(s))
			{
				if(a1.getExpriencesinyears() % 5 ==0)
				{
					System.out.print(a1.getId());
				}
			}
		}
	}

}
class Associate
{
	private String id;
	private String name;
	private String technology;
	private int expriencesinyears;
	public Associate(String id, String name, String technology, int expriencesinyears) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.expriencesinyears = expriencesinyears;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public int getExpriencesinyears() {
		return expriencesinyears;
	}
	public void setExpriencesinyears(int expriencesinyears) {
		this.expriencesinyears = expriencesinyears;
	}
	
} 
