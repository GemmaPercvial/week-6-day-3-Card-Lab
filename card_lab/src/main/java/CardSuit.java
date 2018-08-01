public enum CardSuit {
    HEARTS(3),
    DIAMONDS(2),
    SPADE(4),
    CLUBS(1);

    private final int value;

    CardSuit(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
