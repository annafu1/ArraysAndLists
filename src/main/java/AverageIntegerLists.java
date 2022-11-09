import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int totalSum = 0;
        for (int i = 0; i < aa.size(); i++) {
            totalSum += aa.get(i);
        }
        return totalSum;
    }

    public int average(ArrayList<Integer> aa) {
        int totalSum = 0;
        for (int i = 0; i < aa.size(); i++) {
            totalSum += aa.get(i);
        }
        int avg = totalSum / aa.size();
        return avg;
    }
}
