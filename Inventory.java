package abc;
import java.io.*;
import java.util.*;
public class Solution5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inventoryId;
			int maximumQuantity;
			int currentQuantity;
			int threshold;
			Inventory inv[] = new Inventory[4];
			for(int i=0;i<4;i++)
			{
				inventoryId = br.readLine();
				maximumQuantity = Integer.parseInt(br.readLine());
				currentQuantity = Integer.parseInt(br.readLine());
				threshold = Integer.parseInt(br.readLine());
				inv[i] = new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
				
			}
		int limit  = Integer.parseInt(br.readLine());
		replenish(limit,inv);
	}
	public static void replenish(int i,Inventory in[])
	{
		ArrayList<String> al = new ArrayList<>();
		for(Inventory inv1 : in)
		{
			if(inv1.getThreshold()<=i)
			{
				al.add(inv1.getInventoryId());
			}
		}
		Collections.sort(al);
		for(String x: al)
		{
			for(Inventory inv1 : in)
			{
				if((x.equalsIgnoreCase(inv1.getInventoryId())))
				{
					
						if((inv1.getThreshold()>75))
						{	
							System.out.println(inv1.getInventoryId()+"Critical Filling");				
						}
						else if((inv1.getThreshold()>50) && (inv1.getThreshold()<75) )
						{
							System.out.println(inv1.getInventoryId()+"Moderate Filling");						
						}
						else
						{
							System.out.println(inv1.getInventoryId()+"Non-critical Filling");					
						}
				}
			}
		}
	}

}
class Inventory 
{
	private String inventoryId;
	private int maximumQuantity;
	private int currentQuantity;
	private int threshold;
	public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
		super();
		this.inventoryId = inventoryId;
		this.maximumQuantity = maximumQuantity;
		this.currentQuantity = currentQuantity;
		this.threshold = threshold;
	}
	public String getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
	public int getMaximumQuantity() {
		return maximumQuantity;
	}
	public void setMaximumQuantity(int maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}
	public int getCurrentQuantity() {
		return currentQuantity;
	}
	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
	
}
