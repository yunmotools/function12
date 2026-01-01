// Find Max of Three Ints
// Write a function that takes three `int`s and returns the largest (using conditionals).

public class Main {
    public static int integers(int a,int b,int c){
        int largest = 0;
        if(a > b && a > c){
            largest = a ;
        } else if (b > a && b > c){
            largest = b ;
        } else {
            largest = c;
        }
        return largest ;

    }
    public static void main (String[] args){
        System.out.println(integers(5,9,12));
    }

}
// order matters
// (largest = a) != (a = largest)
// essentially its leftside = righside