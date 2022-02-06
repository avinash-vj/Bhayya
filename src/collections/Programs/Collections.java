package collections.Programs;

import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {

		menu();
		selection();

	}

	public static void selection() {	

		Scanner s=new Scanner(System.in);

		System.err.println("Enter the selection from above list");
		int sel=s.nextInt();

		switch(sel)
		{
		case 1: {
			disAdArray();
			break;
		}
		case 2: {
			advColl();
			break;
		}
		case 3: {
			arrList();
			break;
		}
		case 4: {
			linkList();
			break;
		}
		case 5: {
			hashSet();
			break;
		}
		case 6: {
			treeSet();
			break;
		}
		case 7: {
			linkHashSet();
			break;
		}
		case 8: {
			hashMap();
			break;
		}
		case 9: {
			treeMap();
			break;
		}
		}
		if (sel==0 || sel>9) {
			System.err.println("Invalid selection");
			menu();
			selection();
		}
	}	

	public static void menu() {
		System.out.println();
		System.out.println("01. Disadvantages of Array");
		System.out.println("02. Advantages of Collection");

		System.out.println("03. ArrayList");
		System.out.println("04. LinkedList");

		System.out.println("05. HashSet");
		System.out.println("06. TreeSet");
		System.out.println("07. LinkedHashSet");

		System.out.println("08. HashMap");
		System.out.println("09. TreeMap");
		System.out.println();
	}

	public static void disAdArray() {
		System.out.println("Disadvantages of Array : \r\n"
				+ "1] Length is fixed.\r\n"
				+ "2] Insertion possible/Deletion not possible.\r\n"
				+ "3] Stores Homogenous elements only.\r\n"
				+ "4] No inbuilt functions or methods.\r\n"
				+ "5] Hetrogenous elements are saved using Object array.\r\n"
				+ "");
		System.out.println();
		redo();
	}

	public static void advColl() {
		System.out.println("Advantages of Collection : \r\n"
				+ "1] Length is Dynamic.\r\n"
				+ "2] Insertion/Deletion are possible.\r\n"
				+ "3] Stores both Homegenous and Hetrogenous elements.\r\n"
				+ "4] Built in functions/methods available.\r\n"
				+ "");
		System.out.println();
		redo();
	}

	public static void redo() {
		System.out.println("Press 1 to continue");
		System.out.println("Press any number to stop");
		Scanner s=new Scanner(System.in);
		int sel=s.nextInt();
		if (sel==1) {
			menu();
			selection();
		}else {
			System.out.println("Thank you");
		}			
	}

	public static void collList() {
		System.out.println("List :\r\n"
				+ "1] Default size is 10.\r\n"
				+ "2] Maintain Insertion order.\r\n"
				+ "3] Duplicates are allowed.\r\n"
				+ "4] Hetrogenous in nature.\r\n"
				+ "5] Allows multiple null values.\r\n"
				+ "");
		System.out.println();
	}	

	public static void arrList() {
		collList();
		System.out.println("ArrayList :\r\n"
				+ "1] Data Structure (Dynamic/Growable).\r\n"
				+ "2] Fetching the element is the frequent operation.\r\n"
				+ "3] Constructor present = 03 [AL(), AL(collection Ref), AL(int intial capacity)] \r\n"
				+ "");
		System.out.println();
		redo();
	}

	public static void linkList() {
		collList();
		System.out.println("LinkedList :\r\n"
				+ "1] Data Structure Dobly list.\r\n"
				+ "2] Frequent operation is adding and deleting.\r\n"
				+ "3] Constructor present =02 [LL(), LL(collection Ref)]. \r\n"
				+ "");
		System.out.println();
		redo();
	}

	public static void collSet() {
		System.out.println("Set :\r\n"
				+ "1] Default size is 16.\r\n"
				+ "2] Not Maintained Insertion order.\r\n"
				+ "3] Duplicates not allowed.\r\n"
				+ "");
		System.out.println();
	}

	public static void hashSet() {
		collSet();
		System.out.println("HashSet :\r\n"
				+ "1] Data Structure Hash Table.\r\n"
				+ "2] One null is allowed.\r\n"
				+ "3] Hetrogenous in nature. (can be made Generic).\r\n"
				+ "4] Constructors = 04\r\n"
				+ "5] Elements displayed in Random orders.\r\n"
				+ "");
		System.out.println();
		redo();
	}

	public static void treeSet() {
		collSet();
		System.out.println("TreeSet :\r\n"
				+ "1] Data Structure Balanced Tree.\r\n"
				+ "2] Null is not allowed.\r\n"
				+ "3] Homogenous in nature.\r\n"
				+ "4] Constructors = 04\r\n"
				+ "5] Elements displayed in Sorted orders (Ascending).\r\n"
				+ "");
		System.out.println();
		redo();
	}

	public static void linkHashSet() {
		System.out.println("LinkedHashSet:\r\n"
				+ "1] Data structure: hashtable & doubly list.\r\n"
				+ "2] Not accept duplicate value.\r\n"
				+ "3] Maintains insertion order.\r\n"
				+ "4] Accepts both Homogenous and Heterogenous elements.\r\n"
				+ "5] Add and Remove elements\r\n"
				+ "6] Constructors = 02 [LHS(), LHS(collection Ref)]\r\n"
				+ "");
		redo();
	}

	public static void collMap() {
		System.out.println("Map :\r\n"
				+ "1] Default size is 16.\r\n"
				+ "2] Frequent operation is adding or deleting.\r\n"
				+ "");
		System.out.println();
	}

	public static void hashMap() {
		collMap();
		System.out.println("HashMap:\r\n"
				+ "1] Data Structure array and linked list (Hash Table).\r\n"
				+ "2] One null Key is allowed.\r\n"
				+ "3] Heterogenous Key in nature. (No sorting done).\r\n"
				+ "4] Elements displayed in Random orders.\r\n"
				+ "");
		System.out.println();
		redo();
	}

	public static void treeMap() {
		collMap();
		System.out.println("Tree Map:\r\n"
				+ "1] Data Structure RedBlack tree.\r\n"
				+ "2] Null values is allowed, but not null key.\r\n"
				+ "3] Homogenous in nature.\r\n"
				+ "4] Elements displayed in Sorted orders (Ascending).\r\n"
				+ "");
		System.out.println();
		redo();
	}
}