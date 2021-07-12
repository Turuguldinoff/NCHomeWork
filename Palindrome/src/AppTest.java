import org.junit.Test;
import org.junit.Assert;


public class AppTest {
    @Test
    public void testPolindrome1221() {
        
        Palindrome a = new Number(); 

        Assert.assertEquals(true, a.isPalindrome(1221));
    }
    
    @Test
    public void testPolindromeNegarive1221() {
        
        Palindrome a = new Number(); 

        Assert.assertEquals(true, a.isPalindrome(-1221));
    }

    @Test
    public void testPolindrome1231() {
        
        Palindrome a = new Number(); 

        Assert.assertEquals(false, a.isPalindrome(1231));
    }
}
