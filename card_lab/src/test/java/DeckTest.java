import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck_1;

    @Before
    public void before(){
        deck_1 = new Deck();
    }

    @Test
    public void newDeck(){
        assertEquals(52, deck_1.newDeck().size());
    }

    @Test
    public void cardRemove(){
        deck_1.removeCard();
        assertEquals(51, deck_1.getSize());
    }
}
