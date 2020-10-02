
package SamplePrograms;

public class Example1 {

    public static void main(String[] args) {
        int x[] = {67,7,45,98,0,0,0,0}; //makes it an array
        
        int logicalSize = 4;
        
        int abc[] = new int[5], xyz[];
        
        xyz = abc;
        
        abc[4] = 50;
        System.out.println(xyz[4]); //get50
        
        xyz[1] = 99;
        for (int i = 0; i < abc.length; i++) {
            System.out.format("x[%d] = %d\n", i , abc[i]);
            
        }
        x[1] = 100;
        int ii = 4;
        x[ii-0] = 94;
        int count7=0;
        for (int i = 0; i < logicalSize; i++) {
            System.out.format("x[%d] = %d\n",i,x[i]);
            if(x[i] == 7) count7++;
        }
        System.out.println("There are " + count7 + " 7's in the list");
        
        
        System.out.println("Adding 5th assignment mark");
        if(logicalSize < x.length){
            x[logicalSize] = 82;
            logicalSize ++;
        }
        System.out.println("Updated list of marks: ");
        for(int i=0;i<logicalSize;i++){
            System.out.format("x[%d] = %d\n",i,x[i]);
        }
        x = new int[50];
    }
    
}
