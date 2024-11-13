package CIE; 
public class Internal extends Student 
{ 
private int[] internalMarks;  
public Internal(String name, int[] internalMarks) 
{ 
super(name); this.internalMarks = internalMarks; 
this.setMarks(internalMarks); 
} 
public int[] getInternalMarks() 
{ 
return internalMarks; 
} 
public void setInternalMarks(int[] internalMarks) 
{
 this.internalMarks = internalMarks; this.setMarks(internalMarks);  
}
 
}