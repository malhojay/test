package printcard;

/** raw data for the card Color,value
 * model the card - model class
 * @author Jayesh
 * 
 * TASK 4 & 5 : Since this code implements 2 major concepts such as loose coupling and high cohesion, this helps 
 *              us to extend and reuse the code for completely change game with the couple of modification in the code 
 *              itself. 
 *                      As loose coupling represents low or minimal dependency to other modules, while for high cohesion 
 *              it means logically and functionally putting same behavior elements in under same module to achieve a 
 *              particular goal.
 * 
 */
public class UnoCard {
    
    public enum Color {RED,YELLOW,GREEN,BLUE};
    public enum Value {ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD};    
    private Color colour;
    private Value val;
    
    public UnoCard(Color colour,Value val)
    {
        this.colour=colour;
        this.val=val;
    }

    /**
     * @return the Colour
     */
    
    public Color getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    
    public void setColour(Color colour) {
        this.colour = colour;
    }

    /**
     * @return the val
     */
    
    public Value getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    
    public void setVal(Value val) {
        this.val = val;
    }
            
}
