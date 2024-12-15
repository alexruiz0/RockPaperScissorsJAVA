public class main{
    public static void main(String[] args) {
        Human p1 = new Human();
        Computer p2 = new Computer();
        RockPaperScissors game = new RockPaperScissors(p1,p2);
        game.play();
    }
}