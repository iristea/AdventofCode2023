import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		File input = new File("input.txt");
		input.isFile();
		System.out.print("Part one: ");
		partOne(input);
		System.out.print("Part two: ");
		partTwo(input);

	}
	
	static void partOne(File input) {
		
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		try {
			Scanner in = new Scanner(input);
			
			while(in.hasNextLine()) {
				strList.add(in.nextLine());
			}
			for(String str : strList) {
				String splitArr[] = str.split("");
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				for(int i = 0; i < splitArr.length; i++) {
					if(splitArr[i].matches("[0-9]")) {
						tempList.add(Integer.parseInt(splitArr[i]));
					}
				}
				int value;
				if(tempList.size() > 1) {
					value = (tempList.get(0) * 10) + tempList.get(tempList.size() - 1);
				}
				else {
					value = tempList.get(0) * 11;
				}
				intList.add(value);
			}
			int total = 0;
			for(int i : intList) {
				total += i;
			}
			System.out.println(total);
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	static void partTwo(File input) {
		
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		try {
			Scanner in = new Scanner(input);
			
			while(in.hasNextLine()) {
				strList.add(in.nextLine());
			}
			for(String str : strList) {
				while(str.contains("one")|str.contains("two")|str.contains("three")|str.contains("four")|str.contains("five")|str.contains("six")|str.contains("seven")|str.contains("eight")|str.contains("nine")) {
					ArrayList<Integer> indexList = new ArrayList<Integer>();
					int indexOne = str.indexOf("one");
					if(indexOne != -1) {
						indexList.add(indexOne);						
					}
					else {
						indexList.add(str.length());
					}
					int indexTwo = str.indexOf("two");
					if(indexTwo != -1) {
						indexList.add(indexTwo);						
					}
					else {
						indexList.add(str.length());
					}
					int indexThree = str.indexOf("three");
					if(indexThree != -1) {
						indexList.add(indexThree);						
					}
					else {
						indexList.add(str.length());
					}
					int indexFour = str.indexOf("four");
					if(indexFour != -1) {
						indexList.add(indexFour);						
					}
					else {
						indexList.add(str.length());
					}
					int indexFive = str.indexOf("five");
					if(indexFive != -1) {
						indexList.add(indexFive);						
					}
					else {
						indexList.add(str.length());
					}
					int indexSix = str.indexOf("six");
					if(indexSix != -1) {
						indexList.add(indexSix);						
					}
					else {
						indexList.add(str.length());
					}
					int indexSeven = str.indexOf("seven");
					if(indexSeven != -1) {
						indexList.add(indexSeven);						
					}
					else {
						indexList.add(str.length());
					}
					int indexEight = str.indexOf("eight");
					if(indexEight != -1) {
						indexList.add(indexEight);						
					}
					else {
						indexList.add(str.length());
					}
					int indexNine = str.indexOf("nine");
					if(indexNine != -1) {
						indexList.add(indexNine);						
					}
					else {
						indexList.add(str.length());
					}
					int num = indexList.indexOf(Collections.min(indexList)) + 1;
					switch(num) {
					case 1:
						str = str.replace("one", "1e");
						break;
					case 2:
						str = str.replace("two", "2o");
						break;
					case 3:
						str = str.replace("three", "3e");
						break;
					case 4:
						str = str.replace("four", "4r");
						break;
					case 5:
						str = str.replace("five", "5e");
						break;
					case 6:
						str = str.replace("six", "6x");
						break;
					case 7:
						str = str.replace("seven", "7n");
						break;
					case 8:
						str = str.replace("eight", "8t");
						break;
					case 9:
						str = str.replace("nine", "9e");
						break;
					}
				}
				String splitArr[] = str.split("");
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				for(int i = 0; i < splitArr.length; i++) {
					if(splitArr[i].matches("[0-9]")) {
						tempList.add(Integer.parseInt(splitArr[i]));
					}
				}
				int value;
				if(tempList.size() > 1) {
					value = (tempList.get(0) * 10) + tempList.get(tempList.size() - 1);
				}
				else {
					value = tempList.get(0) * 11;
				}
				intList.add(value);
			}
			int total = 0;
			for(int i : intList) {
				total += i;
			}
			System.out.println(total);
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
