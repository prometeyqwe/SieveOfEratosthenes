import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    static Vector<Integer> vec1 = new Vector<Integer>();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the upper limted: ");
        int size = in.nextInt();
        System.out.println(size);


        for(int i=2, j=0; j < size; i++, j++){
            vec1.add(new Integer(i));
        }

        int p = 2;
        sieve(p, vec1.lastElement().intValue(), vec1.size());
        for(int i = 0; i < size; i++){
            if(vec1.elementAt(i)>0)
                System.out.print(vec1.elementAt(i) + " ");
        }
    }


    static void sieve(int p, int max, int size){
        for(int num_p = 2; num_p*p <= max; num_p++){
            for(int i=0; i < size; i++){
                if(vec1.elementAt(i) == num_p*p){
                    vec1.setElementAt(new Integer(-1), i);
                    break;
                }
            }
        }
        int next_num;
        for(next_num=0; next_num < size; next_num++){
            if(vec1.elementAt(next_num) > p && vec1.elementAt(next_num) > 0){
                break;
            }
        }

        if(vec1.elementAt(next_num)*2<size){
            sieve(vec1.elementAt(next_num), max, size);
        }
    }
}

