import java.util.ArrayList;
import java.util.Scanner;


public class UserArrayList extends Main{
    private Scanner scanner;
    private int numIntegers;
    ArrayList<Integer> list;
    public UserArrayList() {
        this.numIntegers = 0;
        this.list = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    
    }
    
    
    public void add(int num) {
        list.add(num);
    }
    public void print(){
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");
    }
    public int size(){
        return list.size();
    }
    public int get(int index){
        return list.get(index);
    }
    public void set(int index, int value ){
        list.set(index, value);
    }
    public void randomList(int rIntegers){
        for (int i = 0; i < rIntegers; i++){
            int randomNum = (int)(Math.random() * 100);
            list.add(randomNum);
        }
    }
    public void manualList(int numIntegers){
        for( int i = 0; i < numIntegers; i++) {
            System.out.print("Enter an integer: " + (i + 1) + ": ");
            int num = scanner.nextInt();
            list.add(num);
        }
    }
    public void swap(int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

    }
}
