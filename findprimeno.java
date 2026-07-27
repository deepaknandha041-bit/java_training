public class findprimeno {
    public static void main(String[] args){
        int num =12;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                return;
            }
        }
        System.out.println(num+" is a prime number");

    }
    
}
