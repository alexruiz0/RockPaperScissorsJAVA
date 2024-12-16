import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
        Scanner sexo = new Scanner(System.in);
        Human p1 = new Human(sexo);
        Computer p2 = new Computer();
        RockPaperScissors game = new RockPaperScissors(p1,p2);
        for(int i=0;i<10;++i){
            game.play();
        }
        sexo.close();
    }
}
