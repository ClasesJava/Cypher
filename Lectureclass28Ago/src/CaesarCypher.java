
public class CaesarCypher {
	
	private int key; // todos los cypher tienen un key

	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static String shiftedAlphated;
	
	public CaesarCypher(int key) {
		
	this.key = key;
	String leftSubstring = alphabet.substring(0, key);
	String rightSubstring = alphabet.substring(key);
	shiftedAlphabet = rightSubstring + leftSubstring;
	}
}