package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * counting out class
     */
    private int totalRejected = 0;

    /**
     * return total rejected int
     */
    public int reportRejected() {
        return totalRejected;
    }

    //Addeed Override in 6. Commit

    /**
     * counting total rejected
     * @param in input number to count in
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//kombinacja klawiszy alt+<- i alt+-> pozwala na przelaczanie sie miedzy otwartymi klasami