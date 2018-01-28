package use.dssbutils.gradle;

import dssb.utils.common.UNulls;
import lombok.val;
import lombok.experimental.ExtensionMethod;

@SuppressWarnings("javadoc")
@ExtensionMethod({ UNulls.class })
public class Main {
    
    public static void main(String[] args) {
        val string = null;
        System.out.println(string.isNull());
    }
    
}