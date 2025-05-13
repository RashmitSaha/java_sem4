public class CheckE {

    void checkE(String str){
    for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'e') {
                    System.out.println("'e' is present in " + str);
                    break;
                }
        }
    }
    
    public static void main(String[] args) {
        //String word = "umbrella";
        String word2 = "pants";
        CheckE check = new CheckE();
        //check.checkE(word);
        check.checkE(word2);
    }
}
