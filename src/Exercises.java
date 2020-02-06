import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            return false;
        }

        if ((a.get(0) == b.get(0)) || ( a.get(a.size()-1) == b.get(b.size()-1)) ) {
            return true;
        }

        return false;
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
    ArrayList<String> emptyList = new ArrayList();
    if (values == null || values.isEmpty() || n < 0 || values.size() < n) {
        return emptyList;
    }

    ArrayList<String> newList = new ArrayList();

    for (int i = 0; i < n; i++) {
        newList.add(values.get(i));
    }

		 int backCount = n;
    for (int i = n; i < n * 2; i++) {
        newList.add(values.get(values.size() - backCount));
        backCount--;
    }

    return newList;
  }

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;
		}
		int min = numbers[0];
		int max = numbers[0];

		for (int i : numbers) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}

		return max - min;
	}

	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
