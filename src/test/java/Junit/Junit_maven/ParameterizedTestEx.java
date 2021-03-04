package Junit.Junit_maven;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

 

import java.time.Month;

 

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

 

public class ParameterizedTestEx {

 

    @ValueSource (strings = {"radar", "acca", "abcd"})
    @ParameterizedTest
    public void junit(String arg1) {
        assertTrue(StringFunction.isPalindrome(arg1));
    }
    @EnumSource(Month.class)
    @ParameterizedTest
    public void junit2(Month month) {
        
        System.out.println(month.getValue());
        
         int monthNumber = month.getValue();
         assertTrue(monthNumber >= 1 && monthNumber <= 12);
}
    
    @EnumSource(value = Month.class, names = {"FEBRUARY"})
    @ParameterizedTest
    public void junit3(Month month) {
        assertEquals(month.length(false),28);
    }
}
 




 