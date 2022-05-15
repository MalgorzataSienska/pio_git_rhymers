package edu.kis.vh.nursery;
//settery przez pomylke usunelam przy pierwszym cwiczeniu

public class DefaultCountingOutRhymer {

    private static final int TOTAL = 11;
    private static final int MAX_OF_NUMBERS = 12;
    private static final int ERROR = -1;
    private static final int NONE_NUMBERS = -1;
    private final int[] NUMBERS = new int[getMaxOfNumbers()];

    public static int getTOTAL() {
        return TOTAL;
    } // TODO: Delete unnecessary getter

    public static int getMaxOfNumbers() {
        return MAX_OF_NUMBERS;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getNoneNumbers() {
        return NONE_NUMBERS;
    }

    public int getTotal() {
        return total;
    }


    public int total = getNoneNumbers();

    public void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    public boolean callCheck() {
        return total == getNoneNumbers();
    }

    public boolean isFull() {
        return total == getTOTAL();
    }

    protected int peekaboo() {
        if (callCheck())
            return getERROR();

        return getNUMBERS()[total];
    }

    public int countOut() {
        if (callCheck())
            return getERROR();
        return getNUMBERS()[total--];
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }
}
