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
                if(counter == 32) { // IF stopWord is not found move onto next word
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
        //aliterationString == removed all stop words
        String[] aliterationNoStopWordsArray = aliterationString.split(" "); //Splits the aliteration into word array
        String testLetterString = aliterationNoStopWordsArray[0]; //This is the letter in which it will test
        char[] testLetterArray = testLetterString.toCharArray();// Converts to char array
        char testLetter = testLetterArray[0]; // CORRECT DO NOT CHANGE!!!!!!!!!!!!!!!!!!!!!!!!!!!
        boolean flag = true;
        for(int i = 0;i < aliterationNoStopWordsArray.length && flag == true;++i) {
            String currentTestWordString = aliterationNoStopWordsArray[i];
            char[] currentTestWordChar = currentTestWordString.toCharArray();
            if(testLetter == currentTestWordChar[0]){
                flag = true;
            }
            else if(testLetter != currentTestWordChar[0]) {
                flag = false;
            }
        }
        return flag;
    }
}

public class aliteration {

    public static void main(String[] args) {
        String userInput = "Peter Piper Picked a Peck of Pickled Peppers".toLowerCase();
        if(aliterationChecker.checkAliteration(userInput) == true) {
            System.out.println("This is an aliteration");
        }
        else { 
            System.out.println("This is not an aliteration");
        }
    }
}
