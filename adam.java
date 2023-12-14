import java.io.*;

public class Main {
    public static void main(String[] args) {

        Task2();
    }

    public static void Task1() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("vistula.txt");
            fw = new FileWriter("task.txt");
            int c = fr.read();
            while (c != -1) {
                if ((char) c == ' ') c = '-';
                fw.write(c);
                c = fr.read();
            }
        } catch (IOException e) {
            System.out.println("error");
        } finally {
            close(fr);
            close(fw);
        }
    }

    public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch (IOException e) {
            System.out.println("Error to close");
        }
    }

    public static void Task2() {


        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Task2.txt"));

            String line;

            while ((line = bufferReader.readLine()) != null) {
                String parts[] = line.split(" ");

                int grade = Integer.parseInt(parts[2]);

                if (grade == 5) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }

            bufferReader.close();
            bufferedWriter.close();


        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
