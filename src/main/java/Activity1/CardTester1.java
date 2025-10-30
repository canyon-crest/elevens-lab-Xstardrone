package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 c1 = new Card1("Queen", "Hearts", 10);
		Card1 c2 = new Card1("King", "Spades", 10);
		Card1 c3 = new Card1("Queen", "Hearts", 10);

		System.out.println(c1.rank());
		System.out.println(c1.suit());
		System.out.println(c1.pointValue());

		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3));

		System.out.println(c2);
	}
}
