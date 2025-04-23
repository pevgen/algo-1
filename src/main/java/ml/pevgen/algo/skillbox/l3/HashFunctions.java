package ml.pevgen.algo.skillbox.l3;

public class HashFunctions {

    public int hashFromChars(String str) {
        int result = 0;
        for (char ch : str.toCharArray()) {
            result = result + ch;
        }
        return result;
    }

    public int hashFromIntDigits(int input) {
        int result = 1;
        while (input > 10) {
            result = result * (input%10);
            input = input/10;
        }
        return result * input;
    }


    public int hashFromObject(Student obj) {
        return hashFromChars(obj.getName()) & hashFromIntDigits(obj.getAge());
    }

}
