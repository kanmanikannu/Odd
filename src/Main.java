public class Main {
    public static void main(String[] args) {
        System.out.println("Odd Numbers---");
        odd_numbers(7);
        System.out.println("Even Numbers---");
        odd_numbers(4);
    }
    static int odd_numbers(int number)
    {
        if(number==1)
        {
            System.out.println(number);
            return 0;
        }
        if(number%2!=0)
        {
            System.out.println(number);
            odd_numbers(number-2);
        }
        if(number%2==0)
        {
            odd_numbers(number-1);
        }

        return 1;
    }
}