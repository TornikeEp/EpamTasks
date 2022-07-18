import org.junit.platform.commons.util.StringUtils;
import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        if(string1 == string2) {
            return 0;
        }
        if (StringUtils.isBlank(string1) || string1.length() < 2) {
            return -1;
        }
        if (StringUtils.isBlank(string2) || string2.length() < 2) {
            return 1;
        }
        if(Character.compare(string1.charAt(1), string2.charAt(1)) == 0){
            return string1.compareTo(string2);
        }
        return Character.compare(string1.charAt(1), string2.charAt(1));
    }
}

