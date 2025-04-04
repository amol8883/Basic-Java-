package basic.testProgram;

public class ReverseNumUsingFor {

    public static void main(String[] args) {
        int num=123456;
        int reversenum =0;
        for (;num!=0;num=num/10){ //  num=num/10 remove the last digit
            int digit = num%10;  // extract last digit reminder = 6,5,4,...
            reversenum =reversenum*10+digit;// 0+6=6 1st, 6*10+5=65, 65*10+4=650+4=654,..... etc
        }
        System.out.println(reversenum);
    }
}
