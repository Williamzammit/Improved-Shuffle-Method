import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


    //Creates an ArrayList called "test"
     ArrayList<Integer> test = new ArrayList<Integer>();

     //This for loop adds twenty values to the ArrayList
     for (int i = 1; i <= 20; i++){
     test.add(i);
    }
    
        
    //This for loop shuffles the ArrayList 
        for (int i = 0; i <= 19; i++){
        //Gets a random number in the ArrayList
        int x = (int)(Math.random()*19) +1;
        //Sets a placeholder value
        int x2 = test.get(x);
        //Gets another random number
        int y = (int)(Math.random()*19) +1;
        //Another placeholder
        int y2 = test.get(y);

        //Swap placements
            test.set(x, y2);
            test.set(y, x2);
        }
            
        //Creates the Iterator
        Iterator<Integer> itTest = test.iterator();
        
        //Prints out all values of the now shuffled ArrayList in order
        //You could posistion the itTest.next() placement in a "drawCard" method whenever you want to draw another card.
        //This code will simulate a deck in the sense that once a card is played it will not be played again
        while(itTest.hasNext()){
            System.out.println(itTest.next());
    }
}
}