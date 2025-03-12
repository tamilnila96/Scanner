public class Fibonacci {
    public static void main(String[] args){

        int f = 0;
        int s=1;
        int t;
        for( int i = 1;i<=20;i++){
            if(f==21){
                System.out.println(f);
                t=f+s;
                f=s;
                s=t;

            }
        }
    }
}

