package einiblatt12;

public class ListTest1 {

	public static void main(String[] args) {
	
	List list = new List();
	list.add(47);
	list.add(237);
	list.add(9);
	if(list.get(0) != 47 || list.get(1) != 237 || list.get(2) != 9) {
	System.out.println("There are definitely errors in your code"); }
	else {
	System.out.println("All values seem to be in their place");
	}
	}
}
