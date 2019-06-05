public class Methods {

    public static void main(String[] args){

        dislpyHighScorePosition("Ashu", 1500);
        dislpyHighScorePosition("Ashu", 900);

        dislpyHighScorePosition("Ashu", 400);

        dislpyHighScorePosition("Ashu", 10);


    }


    private static void dislpyHighScorePosition(String name, int highScore){
        System.out.println( name+ " managed to get into position " + calculateHighScorePosition(highScore) + " on the high score table" );

    }

    private static int calculateHighScorePosition( int position){

        if (position > 1000)
            return 1;
        else if (position > 500 && position < 1000)
            return 2;
        else if (position > 100 && position < 500)
            return 3;
        else
            return 4;

    }


}


