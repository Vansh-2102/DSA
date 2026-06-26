class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int orignal = x;
        int sum = 0;
        while (x > 0) {
            int last = x % 10;
            sum = sum + last;
            x = x / 10;
        }
        if (orignal % sum == 0) {
            return sum;
        }
        return -1;
    }
}