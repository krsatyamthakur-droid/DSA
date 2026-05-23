// public class insert{
//     public static void main(String[] args){
//         // this is logic for add at last 
//         int n=3423;
//         n=n*10+6;
//         System.out.println(n);
//         // this is for add at any position
//         int pos=2;
//         int digit=5;
//         int temp=n;
//         int mul=1;
//         for(int i=0;i<pos;i++){
//             mul*=10;
//         }
//         n=(temp/mul)*10+digit+(temp%mul);
//         System.out.println(n);
//     }
// }

public class insert{
    public static void main(String[] args){
        int n=234523;
        int digit=8;
        int pos=4;
        int temp=n;
        int multi=1;
        for(int i=0;i<pos;i++){
            multi*=10;
        }
      int left=temp/multi;
      int right=temp%multi;
      int result=(left*10+digit)*multi+right;
      System.out.println(result);
    }
}