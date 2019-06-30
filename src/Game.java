import java.util.List;
import java.util.Stack;

public class Game implements I_deal
{
    Card karta;
    Stack<Card> talia = new Stack<>();
    Stack<Card> reka = new Stack<>();
    Table stol;
    Player gracz;
    List<Player> players;


    @Override
    public void deal()
    {
    }
}
