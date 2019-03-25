package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static final Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

    public static Boolean hasVowels(String word) {
        for (int i = 0; i < vowels.length ; i++) {
            if(word.contains(vowels[i].toString())) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length() ; i++) {
            for (int j = 0; j < vowels.length ; j++) {
                if(word.charAt(i) == vowels[j]) {
                    return i;
                }
            }
        } return -1;
    }


    public static Boolean startsWithVowel(String word) {
        for (int i = 0; i < vowels.length ; i++) {
            if(word.charAt(0) == vowels[i]) {
                return true;
            }
        } return false;
    }

    public static Boolean isVowel(Character character) {
        for (int i = 0; i < vowels.length ; i++) {
            if(character.equals(vowels[i])) {
                return true;
            }
        } return false;
    }
}
