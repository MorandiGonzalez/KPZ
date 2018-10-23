import java.util.Scanner;

public class StringOperations {
    public static String EnterStr(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();
        in.close();

        return str;
    }

    public static String StringProcessing(String str){
        char[] chArray = str.toCharArray();

        for(int i = 0; i<chArray.length; i++){
            chArray[0] = Character.toUpperCase(chArray[0]);
            if((chArray[i] == ' ' && Character.isLetter(chArray[i+1]) )){
                chArray[i+1] = Character.toUpperCase(chArray[i+1]);
            }
        }

        String res = new String(chArray);

        return res;
    }
}
