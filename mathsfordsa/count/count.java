// class countdigit{
//     public int count(int num){
//         if(num==0){
//             return 1;
//         }
//         if(num<0){
//             num=-1*num;

//         }
//         return (int)Math.log10(num) + 1;
//     }
// }
// public class count {
//     public static void main(String[] args) {
//         countdigit cd = new countdigit();
//         System.out.println(cd.count(9234793));

//     }
// }

public class count{
    public static void main(String[] args){
        int n=3424421;
        if(n<0){
            n=-1*n;
        }
        if(n==0){
            System.out.println(1);
        }
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}