
import java.util.Scanner;

public class Main {
    public static  void  main (String[] args){

        System.out.println("----- Created by Mykhailo Skovorodin  Practice 1_2 -----");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();
        System.out.println("Your text before processing: " + str);
        //System.out.println(str);

        char[] chArray = str.toCharArray();

        for(int i = 0; i<chArray.length; i++){
            chArray[0] = Character.toUpperCase(chArray[0]);
            if((chArray[i] == ' ' && Character.isLetter(chArray[i+1]) )){
                chArray[i+1] = Character.toUpperCase(chArray[i+1]);
            }
        }

        String res = new String(chArray);
        System.out.println("Your text after processing: " + res);

    }
}
