class Solution {
    public static int sumOfDigits(int num){
        int unitDigit = 0, sum = 0;

        while(num > 0){
            unitDigit = num%10;
            sum = sum + ((int)Math.pow(unitDigit,2));
            num = num/10;
        }
        return sum;
    }
    public boolean isHappy(int num)
    {
        while(num != 1 && num != 4){
            num = sumOfDigits(num);
        }

        if(num == 1)
        {
            return true;
        }

        else if(num == 4)
        {
            return false;
        }

        return true;

    }
}