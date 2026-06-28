
import java.io.*;
import java.util.*;

public class Student implements Serializable {

    String name;
    String rollNo;
    int age;
    String branch;
    String semester;
    String mobNo;
    String email;
    String address;
    HashMap<Integer, int[]> marks = new HashMap<>();
    double cgpa;
    double attendence;
    int feepaid;
    int totalFee;
}
