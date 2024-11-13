package SEE;
import CIE.Student;
public class External extends Student {
    int[] externalMarks;
    public External(String name, int[] externalMarks) {
        super(name);
        this.externalMarks = externalMarks;
        this.setMarks(externalMarks);
    }
}
