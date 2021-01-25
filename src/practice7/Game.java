package practice7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Game
{
    public static void main(String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> player1 = new ArrayDeque();
        ArrayDeque<Integer> player2 = new ArrayDeque();
        for(int i = 0; i < 5;i++) {
            player1.add(scanner.nextInt());
        }
        for(int i = 0; i < 5;i++) {
            player2.add(scanner.nextInt());
        }
        int count = 0;
        while(player1.peek() != null && player2.peek() != null )
        {
            int i;
            if(player1.peekFirst()>player2.peekFirst() && (player2.peekFirst() != 0 || player1.peekFirst() != 9))
            {
                i = player1.pop();
                player1.add(i);
                i = player2.pop();
                player1.add(i);
            }
            else
            {
                i = player2.pop();
                player2.add(i);
                i = player1.pop();
                player2.add(i);
            }
            count++;
            if(count == 103)
                break;
        }
        if(count == 103)
        {
            System.out.println("botva");
        }else {
            if (player1.peek() == null)
                System.out.println("second\n" + count);
            else
                System.out.println("first\n" + count);
        }
    }
}
