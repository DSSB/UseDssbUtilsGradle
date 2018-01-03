package use.dssbutils.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

import dssb.utils.common.Nulls;
import lombok.val;
import lombok.experimental.ExtensionMethod;

@SuppressWarnings("javadoc")
@ExtensionMethod({ Nulls.class })
public class UseDssbUtilsTest {
    
    @Test
    public void testNull() {
        val string = null;
        assertTrue(string.isNull());
    }
    
}
