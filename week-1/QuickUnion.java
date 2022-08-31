/**
 * @author Joana Mamley Teye
 * 
 * @Date 31/08/2022
 */

public class QuickUnion {
    
    private int myArray[];

    public QuickUnion(int n){
        myArray = new int[n];

        for(int i=0; i<n; i++){
            myArray[i] = i;
        }
    }

    public int root(int id){

        while(myArray[id] != id){
            id = myArray[id];
        }

        return id;
    }

    public boolean connected(int firstNumber, int secondNumber){
        return root(firstNumber) == root(secondNumber);
    }

    public void union(int firstNumber, int secondNumber){
        int firstNumberRoot = root(firstNumber);
        int secondNumberRoot = root(secondNumber);
        myArray[firstNumberRoot] = secondNumberRoot;
    }
}
