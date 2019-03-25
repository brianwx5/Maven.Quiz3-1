package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        ArrayList<String> waveArray = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            if(Character.isLetter(sb.charAt(i))) {
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
                waveArray.add(sb.toString());
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            }
        }
        String[] stringWaveArray = waveArray.toArray(new String[waveArray.size()]);
        return stringWaveArray;
    }
}
