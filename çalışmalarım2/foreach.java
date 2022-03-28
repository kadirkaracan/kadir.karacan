package arraylist;

import java.util.ArrayList;

public class foreach {

	public static void main(String[] args) {
		ArrayList<String> groups= new ArrayList<String>();
		int[] arr= {10,20,30,40,50};
		
		groups.add("irfan");
		groups.add("kado");
        groups.add("emir");
        groups.add("kerim");
// System.out.println(groups.indexOf("irfan"));
        
//		for (int i = 0; i < groups.size(); i++) {
//			System.out.println("eleman: "+ groups.get(i));
//		}
for(String s:groups) {
	
	System.out.println("eleman: "+ s);
}
for(int i:arr ) {
	System.out.println("eleman: "+ i);
}
	}

}
