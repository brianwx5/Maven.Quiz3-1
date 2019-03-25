package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] stringArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length ; i++) {
            if (!VowelUtils.hasVowels(stringArray[i])) {
                sb.append(stringArray[i] + "ay");
                sb.append(" ");
            } else if (VowelUtils.startsWithVowel(stringArray[i])) {
                sb.append(stringArray[i] + "way");
                sb.append(" ");
            } else if (!VowelUtils.startsWithVowel(stringArray[i])) {
                sb.append(stringArray[i].substring(VowelUtils.getIndexOfFirstVowel(stringArray[i]))
                        + (stringArray[i].substring(0, VowelUtils.getIndexOfFirstVowel(stringArray[i]))) + "ay" );
                sb.append(" ");
            }
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
