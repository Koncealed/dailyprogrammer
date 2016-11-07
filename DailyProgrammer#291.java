class GoldilocksChecker {
	public static void checkSeat(int[][] input){
		int maxWeight = input[0][0];
		int porridgeTemp = input[0][1];
		String suitableChairs = "";
		for(int i = 1; i < input.length;++i) {
			int checkingWeight = input[i][0];
			int checkingTemp = input[i][1];
			if(checkingWeight > maxWeight && porridgeTemp > checkingTemp){
				suitableChairs += i + " ";
			}
		}
		System.out.println(suitableChairs);
	} 
}

public class Goldilocks {

	public static void main(String[] args) {
		int[][] input = {  { 100, 80 },
		                   { 30, 50 },
				           { 130, 75 },
				           { 90, 60 },
				           { 150, 85 },
				           { 120, 70 },
				           { 200, 200 },
				           { 110, 100 } };
		System.out.println("Below is the Sample Input.");
		GoldilocksChecker.checkSeat(input);//Sample input
	}
}


