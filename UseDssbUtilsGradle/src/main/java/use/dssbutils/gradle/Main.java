package use.dssbutils.maven;

import dssb.utils.common.Nulls;
import lombok.val;
import lombok.experimental.ExtensionMethod;

@SuppressWarnings("javadoc")
@ExtensionMethod({ Nulls.class })
public class Main {
    
    public static void main(String[] args) {
        val string = null;
        System.out.println(string.isNull());
    }
    
}