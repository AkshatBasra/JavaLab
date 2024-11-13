package CIE;
public class Internal extends Student {
    int[] internalMarks;
    public Internal(String name, int[] internalMarks) {
        super(name);
        this.internalMarks = internalMarks;
        this.setMarks(internalMarks);
    }
}
