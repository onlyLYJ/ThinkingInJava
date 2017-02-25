package ObjLifeTime;
import static util.Print.*;

import org.omg.CORBA.portable.ValueBase;

/*Exercise 21: (1) Create an enum of the least-valuable six types of paper currency. Loop
through the values( ) and print each value and its ordinal( ).
Exercise 22: (2) Write a switch statement for the enum in the previous example. For
each case, output a description of that particular currency.*/


public class TestEnum {

	public enum Currency {
		
		YUAN(100 + "fen"),JIAO("10fen"), FEN("fen"),DOLLAR(200);
		
		private String value;
		private int fen;
		
		Currency(String value){
			this.value = value;
		}
		
		Currency(int fen){
			this.fen = fen;
		}

		public void describe() {
			print("Value: " + value + " INT: " + fen + " || ");
			switch (this) {
			case YUAN:
				println("I'm Yuan.");
				break;
			case JIAO:
				println("JIAO is good.");
				break;
			case FEN:
				println("Do not ignore FEN.");
				break;
			default:
				println("DOLLAR IS DIFFERENT.");
				break;
			}
		}

	}
	
	public static void main(String[] args) {
		
		for(Currency currency : Currency.values()) {
			currency.describe();
			println("Name: " + currency.name() + ", Default toString: " + currency+  ", Ordinal: " + currency.ordinal());
		}
	}
	
/*Output:	Value: 100fen INT: 0 || I'm Yuan.
			Name: YUAN, Default toString: YUAN, Ordinal: 0
			Value: 10fen INT: 0 || JIAO is good.
			Name: JIAO, Default toString: JIAO, Ordinal: 1
			Value: fen INT: 0 || Do not ignore FEN.
			Name: FEN, Default toString: FEN, Ordinal: 2
			Value: null INT: 200 || DOLLAR IS DIFFERENT.
			Name: DOLLAR, Default toString: DOLLAR, Ordinal: 3
*/
}
