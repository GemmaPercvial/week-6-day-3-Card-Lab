import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cardsCollection;


    public Deck(){
        this.cardsCollection = newDeck();
    }

    public ArrayList<Card> newDeck(){
        ArrayList<Card> deck = new ArrayList<>();

        CardSuit[] allSuits = CardSuit.values();
        CardHierarchy[] allNumbers = CardHierarchy.values();

        for (CardHierarchy hierarchy : allNumbers){
            for (CardSuit suit : allSuits){
                Card newCard = new Card(suit, hierarchy);
                deck.add(newCard);
            }
        }
        return deck;
    }

    public void shuffle(){
        Collections.shuffle(cardsCollection);
    }

    public Card removeCard(){
        return cardsCollection.remove(0);
    }

    public int getSize(){
        return cardsCollection.size();
    }



}




