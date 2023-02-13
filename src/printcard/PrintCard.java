package printcard;

/**
 * @author Jayesh
 */

public class PrintCard {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        GenerateCard instance = new GenerateCard();
        instance.generate();  
        for(UnoCard count:instance.deck)
        {
            System.out.println(count.getColour() + " "+count.getVal());
        }
        
    }
    
}
