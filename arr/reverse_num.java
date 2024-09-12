public class reverse_num {
    public int rev_num(int number){
        //int number=987654;
        boolean signed =true;
        if(number<0){
            signed=false;
        }
        number=Math.abs(number);
        long reverse=0;
        while(number>0){
            int lastdigit=number%10;
            reverse=(int)(reverse*10)+lastdigit;
            number=number/10;
            if(number>Integer.MAX_VALUE){
                return 0;
            }
        }
        if(signed==false){
            return -1*(int)reverse;
        }
        return (int)reverse;
    }
    public static void main(String args[]){
        reverse_num rn=new reverse_num();
        int number=987654;
        System.out.println(rn.rev_num(number));
    }

}
