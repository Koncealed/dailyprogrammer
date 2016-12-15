    class ChangeWords {
        public static void changeWords(char[] word1,String word2) {
            System.out.println(word1);
            for(int i = 0; i < word2.length();++i) {
                word1[i] = word2.charAt(i);
                System.out.println(word1);
            }
        }

        public static void main(String[] args) {
            System.out.println("Input Output 1.)");
            changeWords("a fall to the floor".toCharArray(),"braking the door in");
            System.out.println();
            System.out.println();
            System.out.println("Input Output 2.)");
            changeWords("wood".toCharArray(),"book");
            System.out.println();
            System.out.println();
            System.out.println("Input Output 2.)");
            changeWords("floor".toCharArray(),"brake");
            System.out.println();
            System.out.println();
        }
    }
