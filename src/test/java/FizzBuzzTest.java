import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void CheckForInt1()
    {
      FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
      String returnValue=fizzbuzz.encode(1);
      Assert.assertEquals("Kuch Bhi",returnValue);
    }
    @Test
    public void CheckForInt2()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(3);
        Assert.assertEquals("Fizz",returnValue);
    }
    @Test
    public void CheckForInt3()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(15);
        Assert.assertEquals("FizzBuzz",returnValue);
    }
    @Test
    public void CheckForInt4()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(5);
        Assert.assertEquals("Buzz",returnValue);
    }
    @Test
    public void CheckForInt5()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(16);
        Assert.assertEquals("Kuch Bhi",returnValue);
    }
    @Test
    public void CheckForInt6()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(20);
        Assert.assertEquals("Buzz",returnValue);
    }
    @Test
    public void CheckForInt7()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(4);
        Assert.assertEquals("Kuch Bhi",returnValue);
    }
    @Test
    public void CheckForInt8()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(17);
        Assert.assertEquals("Kuch Bhi",returnValue);
    }
    @Test
    public void CheckForInt9()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(19);
        Assert.assertEquals("Kuch Bhi",returnValue);
    }
    @Test
    public void CheckForInt10()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(45);
        Assert.assertEquals("FizzBuzz",returnValue);
    }
    @Test
    public void CheckForInt11()
    {
        FizzBuzzCheck fizzbuzz=new FizzBuzzCheck();
        String returnValue=fizzbuzz.encode(99);
        Assert.assertEquals("Fizz",returnValue);
    }
}
