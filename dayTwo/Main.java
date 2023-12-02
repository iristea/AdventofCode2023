import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File input = new File("input.txt");
		Scanner in = new Scanner(input);
		int partOne = 0, partTwo = 0;
		while(in.hasNextLine()) {
			String line = in.nextLine();//Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
			String split[] = line.split(":");
			int gameInt = Integer.parseInt(split[0].substring(5));//1
			String game = split[1];//3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
			String rounds[] = game.split(";");//3 blue, 4 red
			int red = 0, blue = 0, green = 0;
			boolean possible = true;
			for(String str : rounds) {
				String round[] = str.split(",");//3 blue
				for(String cube : round) {
					String cubeSplit[] = cube.split(" ");
					if(cube.contains("red")) {
						red = (red < Integer.parseInt(cubeSplit[1])) ? Integer.parseInt(cubeSplit[1]) : red;
					}
					else if(cube.contains("blue")) {
						blue = (blue < Integer.parseInt(cubeSplit[1])) ? Integer.parseInt(cubeSplit[1]) : blue;
					}
					else if(cube.contains("green")) {
						green = (green < Integer.parseInt(cubeSplit[1])) ? Integer.parseInt(cubeSplit[1]) : green;
					}
				}
				if(red > 12) {
					possible = false;
				}
				if(blue > 14) {
					possible = false;
				}
				if(green > 13) {
					possible = false;
				}
			}
			if(possible) {
				partOne += gameInt;
			}
			partTwo += red * blue * green;
		}
		System.out.println("Part one: " + partOne);
		System.out.println("Part two: " + partTwo);
		
	}
	
}