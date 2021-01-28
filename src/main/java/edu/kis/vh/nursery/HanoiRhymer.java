package edu.kis.vh.nursery;
//"Sprawdzenie działania alt + <- i alt + ->, pozwala na zmianę bieżącego okna w Intellij"
public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
