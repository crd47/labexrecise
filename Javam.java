package singleton;
import java.util.*;
public class Javam{
    public static void add_arr(){
        int maxsize;
        Scanner input=new Scanner(System.in);
        System.out.println("insert the maximum number of the array could insert");
        maxsize=input.nextInt();
        int []p=new int[maxsize];
        int []z=new int[maxsize];
        int []d=new int[maxsize];
        for(int i=0;i<maxsize;i++){
            System.out.println("insert the number");
            z[i]=input.nextInt();
            p[i]= input.nextInt();
        }
        for(int i=0;i<maxsize;i++){
            d[i]=z[i]+p[i];
        }
        for(int i=0;i<maxsize;i++){
            System.out.println(d[i]+"is at index"+i);
        }
    }
    public static void arr_comp(){
        Scanner input=new Scanner(System.in);
        int size;
        System.out.println("insert the size");
        size=input.nextInt();
        int []k=new int[size];
        int []l=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("insert the numbers to compare");
            k[i]=input.nextInt();
            l[i]= input.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(k[i]==l[j])
                    System.out.println(k[i]+"at index"+i+""+"and"+l[j]+"at the index"+j);
                else continue;
            }
        }

    }
    public static void main(String[]args){
        add_arr();
        arr_comp();
    }
}