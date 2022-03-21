/**
 * Card is used to create playing card objects
 * @author Josh Mckensie
 *
 */
public class Card {

	private String suite;
	private int number;
	
	/**
	 * Constructor that will create a playing card with two fields
	 * @param suite the suite of a playing card
	 * @param number the number of the playing card
	 */
	public Card(String suite, int number) {
		
		this.suite = suite;
		this.number = number;
		
	}
	/**
	 * Retrieves the suite of a card object
	 * @return a string suite
	 */
	public String getSuite() {
		return suite;
	}
	/**
	 * Retrieves the number of a card object
	 * @return an int number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * Displays a cards suite and number
	 */
	public void suiteAndNum() {
		String cardInfo;
		
		if (getNumber() == 1) {
			cardInfo = "Ace" + " of " + getSuite();
		}
		else if (getNumber() == 11) {
			cardInfo = "Jack" + " of " + getSuite();
		}
		else if (getNumber() == 12) {
			cardInfo = "Queen" + " of " + getSuite();
		}
		else if (getNumber() == 13) {
			cardInfo = "King" + " of " + getSuite();
		}
		else {
			cardInfo = getNumber() + " of " + getSuite();
		}
		
		
		System.out.println(cardInfo);
		
	}
}
