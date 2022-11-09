public class AverageDoubleArrays {


// Complete these methods

    public double count(double[] aa) {
        return aa.length;
    }

    public double sum(double[] aa) {
        double totalSum = 0;
        for (int i = 0; i < aa.length; i++) {
            totalSum = totalSum + aa[i];
        }
        return totalSum;
    }

    public double average(double[] aa) {
        double totalSum = 0;
        for (int i = 0; i < aa.length; i++) {
            totalSum += aa[i];
        }
        double avg = totalSum / aa.length;
        return avg;
    }

}
