package recursion_Package;

//driver class; only starts the program
//takes us to non-static class called recursion

public class recursionDriver {
// excerpt 1
    public static void main(String args[]) throws InterruptedException{
    recursion NewRec = new recursion();	//creates new instance of the recursion class
    NewRec.rTest();						//goes to the method rTest in the newly named class
    }
} //end class