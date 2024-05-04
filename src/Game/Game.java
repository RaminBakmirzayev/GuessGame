package Game;

import java.util.Random;

public class Game {

private static Game instance =new Game();


private Game(){}

    public static Game getInstance(){
    return instance;
    }

    public int startGame(int low,int high){
        Random random=new Random();
        int result=random.nextInt((high-low)+low);
return result;
    }
}
