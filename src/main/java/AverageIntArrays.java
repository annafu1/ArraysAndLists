public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int totalSum = 0;
        for (int i = 0; i < aa.length; i++) {
            totalSum = totalSum + aa[i];
        }
        return totalSum;
    }

    public int average(int[] aa) {
        int totalSum = 0;
        for (int i = 0; i < aa.length; i++) {
            totalSum += aa[i];
        }
        int avg = totalSum / aa.length;
        return avg;
    }

}
