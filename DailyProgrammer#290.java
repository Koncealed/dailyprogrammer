public class KaprekarNumber {
    public static void main(String[] args) {
    	int lowNum = 101; int highNum = 9000;
    	String kaprekars = "";
    	for(int i = lowNum; i <= highNum;++i) {
    		if(i <= 3){
    			i = 4;
    		}
        	String testing123 = "" + i * i;
        	String[] test = testing123.split("");
        	int midPoint = (test.length / 2);
        	test[midPoint] = " " + test[midPoint];
        	testing123 = "";
        	for(int j = 0; j < test.length; ++j) {
        		testing123 += test[j];
        	}
        	String[] testing1234 = testing123.split(" ");
        	int half = Integer.parseInt(testing1234[0]);
        	int otherHalf = Integer.parseInt(testing1234[1]);
        	int result = half + otherHalf;
        	if(result == i){
        		kaprekars += i + " ";
        	}
    	}
    	System.out.println(kaprekars);
    }
}
