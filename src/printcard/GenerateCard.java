package printcard;

/**
 * @author Jayesh
 */

public class GenerateCard
{
private int size = 60;
UnoCard[] deck = new UnoCard[size];
public void generate()
{
    int count = 0;
    for(UnoCard.Color colour :UnoCard.Color.values()) 
    {
      
        for(  UnoCard.Value val:UnoCard.Value.values() ) 
        {
            deck[count] = new UnoCard(colour,val); 
            count++;
        }
    }
}
}
