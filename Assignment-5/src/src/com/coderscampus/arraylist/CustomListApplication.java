package src.com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		myCustomList.add("element1");
		myCustomList.add("element2");
		myCustomList.add("element3");
		myCustomList.add("element4");
		myCustomList.add("element5");
		myCustomList.add("element6");
		myCustomList.add("element7");
		myCustomList.add("element8");
		myCustomList.add("element9");
		myCustomList.add("element10");
		myCustomList.add("element11");
		myCustomList.add("element12");
		myCustomList.add("element13");
		myCustomList.add("element14");
		myCustomList.add("element15");
		myCustomList.add("element16");
		myCustomList.add("element17");
		myCustomList.add("element18");
		myCustomList.add("element19");
		myCustomList.add("element20");
		myCustomList.add("element21");
		myCustomList.add("element22");
		myCustomList.add("element23");
		myCustomList.add("element24");
		myCustomList.add("element25");
		myCustomList.add("element26");
		
		for(int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
