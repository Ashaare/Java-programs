package TCS_NQT1;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*Explanation:
Here, the number N=99
Sum of the digits N: 9+9 = 18
Repeat step 2 ‘R’ times i.e. 3 tims  (9+9)+(9+9)+(9+9) = 18+18+18 =54
Add digits of 54 as we need a single digit 5+4
Hence , the output is 9.*/
        public class Digits {
            public static int sum1(int x){
                int temp=x;
                int sum=0;
                while(temp>0){
                    int term=temp%10;
                    sum+=term;
                    temp/=10;
                }
                return sum;
            }
            public static void main(String[] args) {
                int n=99;
                int m=3;
                int total=0;
                while(m>=0){
                    total+= sum1(n);
                    m--;
                }
                int v=sum1(total);
                System.out.println(v);
            }
        }

