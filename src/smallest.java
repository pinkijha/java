public class smallest{

    public static void main(String args[]){
        int[] numbers={10,20,30,14,50,60};

        int S=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            if((numbers[i]<S)){
                S=numbers[i];
            }
        }

        System.out.println("smallest number in aaray is::" +S);


    }
}