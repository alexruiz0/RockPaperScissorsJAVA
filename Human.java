import java.util.Scanner;

public class Human extends Player{
    private Scanner s = new Scanner(System.in);
    public Human(){
        
    }

    @Override
    public int choose(){
        System.out.println("\nChoose a weapon:\n\t1.Rock\n\t2.Paper\n\t3.Scissors");
        int op = 0;
        while(op < 1 || op > 3){
            op = this.s.nextInt();
        }
        // this.s.close();
        return op;
    }
}
