package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TOTAL = 11;
    public static final int MAX_OF_NUMBERS = 12;
    public static final int ERROR = -1;
    public static final int NONE_NUMBERS = -1;
    private final int[] NUMBERS = new int[MAX_OF_NUMBERS];

    public int total = NONE_NUMBERS;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == NONE_NUMBERS;
    }

    public boolean isFull() {
        return total == TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;

        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return NUMBERS[total--];
    }

}
