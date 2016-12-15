class aliterationChecker {
    public static boolean checkAliteration(String aliteration) {
        String[] aliterationArray = aliteration.split(" ");
        String strWords = "I a about an and are as at be by "
                + "com for from how in is it of on or "
                + "that the this to was what "
                + "when where who will with the";
        String[] stopWords = strWords.split(" ");
        int counter = 0;
        for(int i = 0; i < aliterationArray.length;) {
            if(aliterationArray[i].equals(stopWords[counter])){ 
                aliterationArray[i] = "";
                ++i;
                counter = 0;
            }
            else if(!aliterationArray[i].equals(stopWords[counter])) {
                ++counter;
                if(counter == 32) { // IF stopWord is not found move onto next word / Stops ArrayOutOfBounds
                    counter = 0;
                    ++i;
                }
            }
        }
        String aliterationString = "";
        for(int i = 0; i < aliterationArray.length;++i) {
            if(aliterationArray[i].length() > 0){
                aliterationString  += aliterationArray[i]  + " ";
            }
        }
        String[] aliterationNoStopWordsArray = aliterationString.split(" "); //Splits the aliteration into word array
        char testLetter = aliterationNoStopWordsArray[0].charAt(0); 
        for(int i = 0;i < aliterationNoStopWordsArray.length;++i) {
            if(testLetter != aliterationNoStopWordsArray[i].charAt(0)){
                return false;
            }
        }
        return true;
    }
}

public class Solution{

    public static void main(String[] args) {
        String userInput = "Peter Piper Picked a Peck of Pickled Peppers".toLowerCase();
        System.out.println(aliterationChecker.checkAliteration(userInput) ? "This is an aliteration" : "This is not an aliteration");
    }
}
