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
		if (numbers == null || numbers.size() < 1 || numbers.isEmpty()) {
			return -1;
		}
		int min = numbers.get(0);
		int max = numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < min) {
				min = numbers.get(i);
			}
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}

		return max - min;
	}

	public double biggest(ArrayList<Double> numbers) {
  	if (numbers == null || numbers.isEmpty() || numbers.size() % 2 == 0 || numbers.size() < 3) {
      return -1;
  	}

  	for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) < 0) {
        return -1;
      }
  	}

  	double firstNumber = numbers.get(0);
  	double lastNumber = numbers.get(numbers.size() - 1);
  	double middleNumber = numbers.get(numbers.size() / 2);

  	if (firstNumber > lastNumber && firstNumber > middleNumber) {
      return firstNumber;
  	} else if (lastNumber > middleNumber && lastNumber > firstNumber) {
      return lastNumber;
  	} else if (middleNumber > lastNumber && middleNumber > firstNumber) {
      return middleNumber;
  	} else if (middleNumber == lastNumber && middleNumber == firstNumber) {
      return firstNumber;
  	}

  	return -1;        // default return value to ensure compilation
}

	public ArrayList<String> middle(ArrayList<String> values) {
		String emptyString[] = new String[0];
		if (values == null  || values.length % 2 == 0 || values.length < 3) {
			return emptyString;
		}
		for (String i : values) {
			if (i == null) {
				return emptyString;
			}
		}

		String newString[] = new String[3];
		for (int i = 0; i < 3; i++) {
			newString[i] = values[((values.length + 1) / 2) - 2 + i];
		}


		return newString;
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
