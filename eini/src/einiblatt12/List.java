package einiblatt12;

public class List {
	private Element kopf;
	private Element fuss;
	
	public List() {
		kopf = null;
		fuss = null;
				
	}
	
	public void add(int value) {
		Element new_element = new Element(value);			//neues element
		
		//... element einfügen
		
		if(this.kopf == null) {
			this.kopf = new_element;			//falls Liste vorher leer
			this.fuss = new_element;
		}
		else {
			this.fuss.setNext(new_element);		//anfügen von neuen Elementen
			this.fuss = new_element;
		}
	}
	
	public int get(int n) {
		
	}
	
}
