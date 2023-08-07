import java.util.Arrays;

public class InsertLastEment {
    public static void main(String args[]){
        int originalArray[]={10,20,30,40,50,60,70};


    int newElement=80;
    int[] newArray= Arrays.copyOf(originalArray,originalArray.length+1);
        newArray[newArray.length-1]=newElement;
                System.out.println("original Array:" +Arrays.toString(originalArray));
                System.out.println("new Array:" +Arrays.toString(newArray));




    }
}


