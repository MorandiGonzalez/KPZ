public class OutputText {

    public static void WriteAuthor(){
        System.out.println("----- Created by Mykhailo Skovorodin  Practice 1_2 -----");
    }

    public static void StringBP (String str){
        System.out.println("Your text before processing: " + str);
    }

    public static void StringRes(String res){
        System.out.println("Your text after processing: " + StringOperations.StringProcessing(res));
    }

}
