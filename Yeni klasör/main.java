package arraylist;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<String> groups = new ArrayList<String>();
		groups.add("irfan");
		groups.add("kado");
		groups.add("emir");
		groups.add("kerim");
        System.out.println("0. index: "+ groups.get(0));
//        System.out.println("2. index: "+ groups.get(2));
//		System.out.println("arraylist uzunluðu: "+ groups.size());

//        groups.remove("kado");

		System.out.println(groups.indexOf("irfan"));

		for (int i = 0; i < groups.size(); i++) {
			System.out.println("eleman: " + groups.get(i));
		}

	}

}
