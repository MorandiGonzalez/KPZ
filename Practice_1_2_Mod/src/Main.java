
import java.util.Scanner;

public class Main {
    public static  void  main (String[] args){

       // System.out.println("----- Created by Mykhailo Skovorodin  Practice 1_2 -----");
        OutputText.WriteAuthor();
        String str = StringOperations.EnterStr();
        OutputText.StringBP(str);

        //System.out.println("Your text after processing: " + StringOperations.StringProcessing(str));
        OutputText.StringRes(str);
    }
}
