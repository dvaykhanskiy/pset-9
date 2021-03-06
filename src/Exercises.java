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
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return new ArrayList<String>();
		}

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return new ArrayList<String>();
			}
		}

		int middle = (int)(Math.ceil(values.size() / 2));
		ArrayList<String> numbers = new ArrayList<String>();

		numbers.add(values.get(middle - 1));
		numbers.add(values.get(middle));
		numbers.add(values.get(middle + 1));

		return numbers;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers ==  null || numbers.size() < 3) {
			return false;
		}

		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > numbers.get(i - 1) && numbers.get(i) < numbers.get(i + 1)) {
				return true;
			}
		}

		return false;
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		}

		for (int i = 1; i < numbers.size() - 1; i ++) {
			if (!(numbers.get(i) == x || numbers.get(i - 1) == x || numbers.get(i + 1) == x)) {
				return false;
			}
		}

		return true;
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		for (int i = 1; i < numbers.size() - 1; i++) {
			if ((numbers.get(i) % 2 == 0) && (numbers.get(i - 1) % 2 == 0) && (numbers.get(i + 1) % 2 == 0)) {
				return true;
			}
			if ((numbers.get(i) % 2 == 1) && (numbers.get(i - 1) % 2 == 1) && (numbers.get(i + 1) % 2 == 1)) {
				return true;
			}
		}

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) {
			return false;
		}

		for (int i = 0; i < numbers.size(); i++) {
			int sumLeft = 0;
			int sumRight = 0;
			for (int j = 0; j < i; j++) {
				sumLeft += numbers.get(j);
			}
			for (int k = i; k < numbers.size(); k++) {
				sumRight += numbers.get(k);
			}
			if (sumLeft == sumRight) {
				return true;
			}
		}

		return false;
	}

	public int clumps(ArrayList<String> values) {
		if (values == null) {
			return -1;
		}
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return -1;
			}
		}

		int count = 0;
		String lastValue = "";
		for (int i = 0; i < values.size() - 1; i++) {
			if (values.size() > 1) {
				if ((values.get(i).equals(values.get(i + 1))) && !(values.get(i).equals(lastValue))) {
					count++;
					lastValue = values.get(i);
				}
		} else {
			return 0;
		}
		}

		return count;
	}
}
