/**
 * @author Joana Mamley Teye
 * 
 * @Date 31/08/2022
 */

public class QuickFind{

    private int myArray[];



    public QuickFind(int n){
        myArray = new int[n];

        for (int i = 0; i < n; i++){
            myArray[i] = i;
        }
    }


    public boolean connected(int firstNumber, int secondNumber){
        return myArray[firstNumber] == myArray[secondNumber];
    }

    public void union(int firstNumber, int secondNumber){
        int firstNumberEntry = myArray[firstNumber];
        int secondNumberEntry = myArray[secondNumber];

        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == firstNumberEntry) myArray[i] = secondNumberEntry;
        }
    }
}