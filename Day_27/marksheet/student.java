
import java.io.*;
import java.util.*;

public class student implements Serializable {

    String name;
    String rollNo;
    int age;
    String branch;
    String semester;
    String mobNo;
    String address;
    HashMap<Integer, int[]> marks = new HashMap<>();
    double cgpa;
}
