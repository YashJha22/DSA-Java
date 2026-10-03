// Number of Steps to Reduce a Number to Zero
// Given an integer num, return the number of steps to reduce it to zero.
// If num is even, divide it by 2.
// If num is odd, subtract 1 from it.

class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            steps++;
        }

        return steps;
    }
}