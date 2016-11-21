import java.util.Scanner;

class defuse {
	public static boolean checker(String[] input) {
		for(int i = 0; i < input.length;++i) {
			if(input[i] == "white") {
				if(input[i + 1].equals("white") || input[i + 1].equals("black")) {
					return false;
				}
			}
			else if(input[i].equals("red")) {
				if(!input[i + 1].equals("green")) {
					return false;
				}
			}
			else if(input[i].equals("black")) {
				if(input[i + 1].equals("white") || input[i + 1].equals("green") 
					
						|| input[i + 1].equals("orange")) {
					return false;
					
				}
			}
			else if(input[i].equals("orange")) {
				if(input[i + 1].equals("red") || input[i + 1].equals("black")) {
					return false;
				}
			}
			else if(input[i].equals("green")) {
				if(input[i + 1].equals("red") || input[i + 1].equals("black")
						                      || input[i + 1].equals("green")
						                      || input[i + 1].equals("purple")){
					return false;
				}
			}
			else if(input[i].equals("purple")) {
				if(input[i + 1].equals("purple") || input[i + 1].equals("green") 
						                         || input[i + 1].equals("orange")) {
					return false;
				}
			} else {
				return false; // If someone writes in random numbers
			}
		}
		return true;
	}
}
public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		String[] array = userInput.split(" ");
		if(defuse.checker(array)) {
			System.out.println("Bomb has been defused");
		} else {
			System.out.println("Kaboom");
		}
	}
}
