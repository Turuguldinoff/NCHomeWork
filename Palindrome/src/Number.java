public class Number implements Palindrome{
    int num;

    public Number() {}

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int chec(int num, int a, int i) {
            return (num % (int)Math.pow(10, a-i));
    }

    @Override
    public boolean isPalindrome(int num) {
        num = Math.abs(num);
        int a = (num + "").length();
        
        for (int i = 1; i <= a/2; i++) {
                if ((num - chec(num, a, i))/(int)Math.pow(10, a-i) != (chec(num, 0, -i)- chec(num, a , a-i+1))/(int)Math.pow(10, i-1)){
                    return false;
                }
                num = chec(num, a, i);
        }
        return true;
    }
    
}
