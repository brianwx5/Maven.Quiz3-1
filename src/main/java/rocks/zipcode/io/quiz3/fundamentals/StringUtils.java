package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(indexToCapitalize,Character.toUpperCase(sb.charAt(indexToCapitalize)));
        str = sb.toString();
        return str;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString) == characterToCheckFor) {
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> subStringArrayList = new ArrayList<>();
        for (int i = 0; i <= string.length() ; i++) {
            for (int j = i+1; j <= string.length() ; j++) {
                if(!subStringArrayList.contains(string.substring(i,j))) {
                    subStringArrayList.add(string.substring(i,j));
                }
            }
        }
        String[] subStringArray = subStringArrayList.toArray(new String[subStringArrayList.size()]);
        return subStringArray;
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] subStringArray = getAllSubStrings(input);
        return subStringArray.length;
    }
}
