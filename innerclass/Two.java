

class One {
	
	String name;

	public One(String name) {	
		this.name = name;
	}

	void showName() {
		
	};
}


public class Two {
	
	One getOne() {
		
		return new One("ok"){
			{showName();}
			void showName() {
				System.out.println("{"+this.name);
			}
			
			
		};
		
	}

	public static void main(String[] args) {
		Two t = new Two();
		One a = t.getOne();
		//a.showName();
	}

}

