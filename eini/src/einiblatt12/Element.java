package einiblatt12;

public class Element {
	private int value;
	private Element next;

	public Element(int value) {
		this.value = value;
		next = null;
	}
	
	public Element getNext() {
		return(this.next);
	}
	
	public void setNext (Element next) {
		this.next = next;
	}
	
	public int getValue() {
		return(this.value);
	}

	
}
