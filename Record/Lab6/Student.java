package CIE;
public class Student {
    protected String name;
    protected int[] marks;
    public Student(String name) {
        this.name = name;
        this.marks = new int[5];
    }
    public String getName() {
        return name;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int[] getMarks() {
        return marks;
    }
}
