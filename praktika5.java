import java.util.*;

public class Praktika5 {

    //Тут хранится последнее число счетчика
    private static int tmp = 1;
    private static int n;

    public static void main(String[]args)
    {


        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        n = input.nextInt();

        try{
            counter();
        } catch(Exception e) {
            System.out.print(e.getMessage());
        }
    }

    private static void counter() throws Exception {
        if(tmp != n)
        {
            System.out.println(tmp);
            tmp++;
            counter();
        } else {
            System.out.println(tmp);
            throw new Exception("Recursion end");
        }
    }
}
