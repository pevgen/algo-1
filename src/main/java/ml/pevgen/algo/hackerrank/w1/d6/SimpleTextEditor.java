package ml.pevgen.algo.hackerrank.w1.d6;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

public class SimpleTextEditor {

    //1 append - Append string  to the end of .
//2 delete - Delete the last  characters of .
//3 print - Print the  character of .
//4 undo - Undo the last (not previously undone) operation of type  or ,
//       reverting  to the state it was in prior to that operation.
    private final StringBuilder stringBuilder = new StringBuilder();

    private Deque<Operation> ops = new ArrayDeque<>();

    private static class Operation {
        int type;
        int count;
        String str;
    }

    public void append(String string) {
        Operation op = new Operation();
        op.type = 1;
        op.count = string.length();
        ops.push(op);

        justAppend(string);
    }

    private void justAppend(String string) {
        stringBuilder.append(string);
    }


    public void delete(int count) {

        Operation op = new Operation();
        op.type = 2;
        op.str = stringBuilder.substring(stringBuilder.length() - count, stringBuilder.length());
        ops.push(op);

        justDelete(count);

    }

    private void justDelete(int count) {
        stringBuilder.delete(stringBuilder.length() - count, stringBuilder.length());
    }

    public String print(int index) {
        return stringBuilder.substring(index - 1, index);
    }

    public void undo() {
        if (ops.isEmpty()) {
            return;
        }
        Operation op = ops.pop();

        if (op.type == 1) {  // append
            justDelete(op.count);
        } else {  // delete
            justAppend(op.str);
        }
    }

    public int length() {
        return stringBuilder.length();
    }


    /**
     * 8       Q = 8
     * 1 abc   ops[0] = '1 abc'
     * 3 3     ops[1] = '3 3'
     * 2 3     ...
     * 1 xy
     * 3 2
     * 4
     * 4
     * 3 1
     */

    /**
     * Implement a simple text editor. The editor initially contains an empty string, . Perform  operations of the following  types:
     * <p>
     * 1 append - Append string  to the end of .
     * 2 delete - Delete the last  characters of .
     * 3 print - Print the  character of .
     * 4 undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        SimpleTextEditor editor = new SimpleTextEditor();

        IntStream.range(0, n).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int op = Integer.parseInt(firstMultipleInput[0]);
                if (op == 1) {
                    editor.append(firstMultipleInput[1]);
                } else if (op == 2) {
                    editor.delete(Integer.parseInt(firstMultipleInput[1]));
                } else if (op == 3) {
                    String printResult = editor.print(Integer.parseInt(firstMultipleInput[1]));
                    bufferedWriter.write(String.valueOf(printResult));
                    bufferedWriter.newLine();
                } else {
                    editor.undo();
                }


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

}
