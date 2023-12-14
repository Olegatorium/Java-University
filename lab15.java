public class Student {
    private String name;
    private String surname;
    private double score;

    public Student(String name, String surname, double score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public  boolean isMerd(){return  this.score ==5;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", score=" + score +
                '}';
    }
}




import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       // TreeSet<String> namesList = readNamesFromFile("names.txt");

        //for (var item : namesList){
         //   System.out.println(item);
       // }



       ArrayList<Student> students = new ArrayList<>();

       fillTheList(students);

       System.out.println("Students with score 5:");
       students.stream()
         .filter((student -> student.getScore() ==5))
               .forEach(System.out::println);

       System.out.println("Avarage score: " +
               students.stream()
                       .mapToDouble(Student::getScore)
                       .average()
                       .getAsDouble());

       System.out.println("Number of students with score 5: " +
               students.stream()
                       .filter((student -> student.getScore() == 5))
                       .count());

    }


    static void fillTheList(ArrayList<Student> students){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("studentsEN.txt"))) {

            String line;

            while((line = bufferedReader.readLine()) != null){
                String[]words = line.split("\\s");
                String surname = words[0].trim();
                String name = words[1].trim();
                String score = words[2].trim();
                students.add(new Student(name,surname,Double.parseDouble(score)));
            }

        } catch (IOException e) {
            throw new RuntimeException("Failed to read names from file: " +  e);
        }
    }



    private static TreeSet<String> readNamesFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            TreeSet<String> namesList = new TreeSet<>();
            String data;
            while ((data = br.readLine()) != null) {
                namesList.add(data);
            }
            return namesList;
        } catch (IOException e) {
            throw new RuntimeException("Failed to read names from file: " + filename, e);
        }
    }
}
