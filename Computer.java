import java.util.Random;

public class Computer extends Player{
    
    public void Computer(){
    }

    @Override
    public int choose(){
        Random r = new Random();
        int w = r.nextInt(3)+1;
        return w;
    }
}
