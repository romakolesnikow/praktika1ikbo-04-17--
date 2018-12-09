import java.util.Scanner;

public class Game {

    static Queue deck1;
    static Queue deck2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[])
    {
        deck1 = new Queue(10);
        System.out.println("Deck of Player 1: ");
        for(int i = 0; i<4; i++)
        {
            int y = deck1.push(scanner.nextInt());
            if (y==-1)
            {
                i--;
            }

        }
            deck1.push(scanner.nextInt());
        deck2 = new Queue(10);
        System.out.println("Deck of Player 2: ");
        for(int i = 0; i<5; i++){
            int y = deck2.push(scanner.nextInt(), deck1);
            if (y==-1)
                i--;
        }


        System.out.println(endshpil(deck1, deck2));
    }

    private static String endshpil(Queue queue1, Queue queue2) {
        int counter = 0;
        String winner = "botva";
        while(!queue1.isEmpty() && !queue2.isEmpty() && (counter<106)) {
            counter++;
            System.out.println("1:"+queue1.readHead());
            System.out.println("2:"+queue2.readHead());
            if(((queue1.readHead() > queue2.readHead()) && queue2.readHead()!=0) || (queue1.readHead()==0 && queue2.readHead()==9)) {
                queue1.push(queue1.readHead());
                queue1.Remove();
                queue1.push(queue2.Remove());
            } else {
                int tempValue = queue2.Remove();
                queue2.push(queue1.readHead());
                queue2.push(tempValue);
                queue1.Remove();
            }
        }
        if(queue2.isEmpty()) winner = "first ";
        if(queue1.isEmpty()) winner = "second ";

        return (winner + " " + counter);
    }

}