import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public double count(ArrayList<Double> aa) {
        return aa.size();
    }
    public double sum(ArrayList<Double> aa) {
        double totalSum = 0.0;
        for (int i = 0; i < aa.size(); i++) {
            totalSum += aa.get(i);
        }
        return totalSum;
    }
    public double average(ArrayList<Double> aa) {
        double totalSum = 0.0;
        for (int i = 0; i < aa.size(); i++) {
            totalSum += aa.get(i);
        }
        double avg = totalSum / aa.size();
        return avg;
    }

}
