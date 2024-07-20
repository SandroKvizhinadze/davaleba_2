package davaleba_2;
public class Math{
    public static void main(String[] args){
         int X = 5;
         int Y = 5;
         System.out.println(X + "_ი " + Y + " ის ხარისხში არის: " + Transfer(X, Y) );
    }
 //მეთოდი რომელსაც გადავცემ ორ რიცხვს და დააბრუნებს პირველი რიცხვს მეორე რიხვსი ხარისხში
   static int Transfer(int X , int Y){
       int Z = 1; // პასუხის შენახვა Z ცვლადში
       //while loopის შექმნა ხარისხში აყვანისთვის
       while(Y > 0) { //
         Y--;
         Z *= X; // ხარისხში აყვანა
           }
       return Z;

   }
}

//output:
/*
"C:\Program Files\Java\jdk-22\bin\java.exe" -javaagent:D:\downloads\ideaIC-2024.1.4.win\lib\idea_rt.jar=52818:D:\downloads\ideaIC-2024.1.4.win\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\PC\Desktop\Java\Test\out\production\Test davaleba_2.Math
5_ი 5 ის ხარისხში არის: 3125

Process finished with exit code 0
*/