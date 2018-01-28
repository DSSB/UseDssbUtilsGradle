package use.dssbutils.gradle;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dssb.utils.common.UNulls;
import lombok.val;
import lombok.experimental.ExtensionMethod;

@SuppressWarnings("javadoc")
@ExtensionMethod({ UNulls.class })
public class UseDssbUtilsTest {
    
    @Test
    public void testNull() {
        val string = null;
        assertTrue(string.isNull());
    }
    
}
