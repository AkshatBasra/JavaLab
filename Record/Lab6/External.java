package SEE; 
import CIE.Student; 
public class External extends Student 
{ private int[] externalMarks;  
public External(String name, int[] externalMarks) 
{ 
super(name); 
this.externalMarks = externalMarks; 
this.setMarks(externalMarks);
} 
public int[] getExternalMarks() 
{ 
return externalMarks; 
} 
public void setExternalMarks(int[] externalMarks) 
{ this.externalMarks = externalMarks; 
this.setMarks(externalMarks); }
 }