package stackUsingArrayList;

public class Main {

    public static String reverseString(String word){
        Stack<Character> myStack = new Stack<>();
        String reversedString="";

        for(char c : word.toCharArray()){
            myStack.push(c);
        }
        while(!myStack.isEmpty()){
            reversedString = reversedString+ myStack.pop();
        }
        return reversedString;
    }



    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}
