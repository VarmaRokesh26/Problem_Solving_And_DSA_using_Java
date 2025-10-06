package DataStructuresAndAlgorithms.src.LeetCodeQuestions.October2025;

public class Oct1st {

    public int numWaterBottles(int numBottles, int numExchange) {
        int consumedBottles = 0;

        while (numBottles >= numExchange) {
            consumedBottles += numExchange;
            numBottles -= numExchange;

            numBottles++;
        }

        return consumedBottles + numBottles;
    }
}