package pascalproject;

import java.util.ArrayList;


public class pascalproject {

	public static void main(String[] args) {
		System.out.println(pascalproject(5));

	}
public static ArrayList<Arraylist<Integer>>pascalproject(int numrows){
	
	ArrayList<ArrayList<Integer>>list = new Arraylist <>();
for (int i = 0; i < numrows; i++) {
	for (int j = 0; j <=i j++) {
		if (j==0||i==j) {
			list.get(i).add(1);
			
		}
		else {
			int med =list.get(i-1).get(j-1)+list.get(i-1).get(j);
			
		}
	}
}
return list;
	
}

}
