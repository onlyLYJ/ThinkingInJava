package newPackage;

public class Parcle10 {
	
	
	
	public Destination destination(String dest,float price) {
		
	
		return new Destination() {
			private int cost;
			// Instance initialization for each object:
			{
				cost = Math.round(price);
				if(cost > 100)
				System.out.println("Over budget!");
			}
			
			private String label = dest;
			public String readLabel() { return label; }
		};
	
	}
		
	public static void main(String[] args) {
		Parcle10 p = new Parcle10();
		

	}

}
