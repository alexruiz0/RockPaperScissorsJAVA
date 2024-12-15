import java.util.Scanner;

public class Human extends Player{
    public void Human(){
        
    }

    @Override
    public int choose(){
        System.out.println("\nChoose a weapon:\n\t1.Rock\n\t2.Paper\n\t3.Scissors");
        Scanner s = new Scanner(System.in);
        int op = 0;
        while(op < 1 || op > 3){
            op = s.nextInt();
        }
        s.close();
        return op;
    }
}
