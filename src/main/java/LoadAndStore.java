import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadAndStore {

    public int[] loadIntArrayFromFile(String filename) {
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile(filename);
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i);
        return arr;
    }

    public ArrayList<Integer> loadIntegerArrayListFromFile(String filename) {
        // Creating an object of BufferedReader class
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                Integer number = Integer.parseInt(line);
                result.add(number);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    // Build these out:

    // use testDoubleData2.txt to test

    public double[] loadDoubleArrayFromFile(String filename) {
        ArrayList<Double> arr = loadDoubleArrayListFromFile(filename);
        double[] doubleArr = new double[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            doubleArr[i] = arr.get(i);
        }
        return doubleArr;
    }

    public ArrayList<Double> loadDoubleArrayListFromFile(String filename) {
        BufferedReader read = null; // we have a buffer reader
        try {
            read = new BufferedReader((new FileReader(filename))); // going to read the new buffer reader of a file name
        } catch (FileNotFoundException e) { //going to make sure that it is going to catch any file not found while reading
            e.printStackTrace();
        }
        String line = ""; // create empty string
        ArrayList<Double> outcome = new ArrayList<>(); // takes array list of results and creating a new arraylist

        while(true) {
            try {
                if ((line = read.readLine()) == null) break; //if the line has nothing/null stop reading
                if (line.startsWith("//")) continue; //if the line has // then we continue to read as it will ignore
                Double num = Double.parseDouble(line); // will parse the line with double number
                outcome.add(num); // result will be to add the number
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return outcome;
    }

    // use testStringData3.txt to test

    public String[] loadStringArrayFromFile(String filename) {
        ArrayList<String> arr = loadStringArrayListFromFile(filename);
        String[] strArr = new String[arr.size()];
        for (int i = 0; i < arr.size();i++) {
            strArr[i] = arr.get(i);
        }
        return strArr;
    }

    public ArrayList<String> loadStringArrayListFromFile(String filename) {
        BufferedReader read = null; // we have a buffer reader
        try {
            read = new BufferedReader((new FileReader(filename))); // going to read the new buffer reader of a file name
        } catch (FileNotFoundException e) { //going to make sure that it is going to catch any file not found while reading
            e.printStackTrace();
        }
        String line = ""; // create empty string
        ArrayList<String> outcome = new ArrayList<>(); // takes array list of results and creating a new arraylist

        while(true) {
            try {
                if ((line = read.readLine()) == null) break; //if the line has nothing/null stop reading
                if (line.startsWith("//")) continue; //if the line has // then we continue to read as it will ignore
                String str = line; // will parse the str
                outcome.add(str); // add to the str
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return outcome;
    }

    //
    // Finally:
    //
    // Is there some way to re-factor these routines so that
    // loadStringArrayListFromFile() becomes the general case routine
    // and is the only one with IO code in it?
    // All the others become like loadIntArrayFromFile(),
    // where it calls the general case routine?
}

