public class FizzBuzzCheck {
    public String encode(int value)
    {
        if(divisibleBy(value,15))
        {
            return "FizzBuzz";
        }
        else if(divisibleBy(value,5))
        {
            return "Buzz";
        }
        else if(divisibleBy(value,3))
        {
            return "Fizz";
        }
        else
            return "Kuch Bhi";
    }
    private boolean divisibleBy(int value,int divisor)
    {
        return value%divisor==0;
    }

}
