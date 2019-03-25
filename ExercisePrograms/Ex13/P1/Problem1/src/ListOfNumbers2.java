import java.io.*;
//import java.util.Vector;

public class ListOfNumbers2 {
	
	private static final int SIZE = 10;
    private Integer victor[];

    public ListOfNumbers2 () {
        victor = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++)
            victor[i] = i;
     // write your code for readList (input filename: "infile.txt"), and writeList of this object.
        readList("./infile.txt");
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + victor[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public void readList(String fileName) {
        String line = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            int idx = 0;
            while ((line = raf.readLine()) != null) {
                Integer i = new Integer(Integer.parseInt(line));
                System.out.println(i);
                victor[idx++] = i;
            }
            raf.close();
            
        // write code for catching "ArrayIndexOutOfBoundsException", "FileNotFoundException", and "IOException" with proper handling routing as you want to show the running result.
        } catch (FileNotFoundException e) {// 指定されたパス名でファイルが開けない場合
        	System.err.println("File Not Found");
        } catch (IOException e) {// なんらかの入出力例外が発生した場合
        	System.err.println("IOException Occured");
        } catch (ArrayIndexOutOfBoundsException e) { // 不正なインデックスを使って配列がアクセスされた場合
        	System.err.println("Array accessed by illigal index.");
        }

    }

	
    public static void main(String[] args) {
		new ListOfNumbers2();
	}

}
