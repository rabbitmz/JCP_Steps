package mz.co.rabbitlab.interfaces;

/***
 * 
 * @author ywingester
 * A class use the key word <b>implements</b> to implement a Interface
 * 
 * A class that implements an interface must implement all abstract methods defined within the interface. 
 */
public class CharSequenceImpl implements CharSequence {

	private static final char [] data = new char [10];  
	
	static {
		data[0] = 'J';
		data[1] = 'A'; 
		data[2] = 'V'; 
		data[3] = 'A'; 
		data[4] = ' '; 
		data[5] = 'R'; 
		data[6] = 'O'; 
		data[7] = 'C'; 
		data[8] = 'K'; 
		data[9] = 'S'; 
	}
		
	@Override
	public int length() {

		return 0;
	}

	@Override
	public char charAt(int index) {
		
		if(data.length<index)
		{
			throw new IllegalArgumentException();
		}
		
		return data[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) {

		return null;
	}

}
