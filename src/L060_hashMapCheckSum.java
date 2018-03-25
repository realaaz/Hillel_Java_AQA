import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class L060_hashMapCheckSum {

    public static void main(String[] args) {

        int[] someArray = {1, 2, 3};

        System.out.print(checkSumm(someArray, 5));
    }


    public static boolean checkSumm(int[] inArray, int inNum) {

//        Map<String, Integer> newArray = new HashMap<>();
//
//        for (int i = 0; i< inArray.length; i++){
//
//            int val = inNum - inArray[i];
//            newArray.put(val);
//
//        }
//
//        return true;
//
//

        int sum, i, a;
        for (i = 0; i < inArray.length; i++) {
            for (a = i+1; a < inArray.length; a++) {

                if (inArray[i]+ inArray[a] == inNum) {
                    return true;
                }
            }
        }
        return false;
   }

}


