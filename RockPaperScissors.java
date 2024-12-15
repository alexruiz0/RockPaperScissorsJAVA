
public class RockPaperScissors {
    private Player p1;
    private Player p2;

    public void RockPaperScissors(p11, p22){
        this.p1 = p11;
        this.p2 = p22;
    }

    public int play(){
        int res1 = p1.choose();
        int res2 = p2.choose();

        if(res1 == res2){
            System.out.println("Tie");
            return 0;
        }
        if((res1 == 1 && res2 == 3) || (res1 == 2 && res2 == 1) || (res1 == 3 && res2 == 2)){
            System.out.println("Player 1 win");
            return 1;
        }
        if((res2 == 1 && res1 == 3) || (res2 == 2 && res1 == 1) || (res2 == 3 && res1 == 2)){
            System.out.println("Player 2 win");
            return 2;
        }
    }
}
