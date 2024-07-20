package davaleba_2;
public class Animal {
    public static void main(String[] args){
        System.out.println(AnimalScanner("dog")); // გატესტვა;
    }

    //მეთოდი რომელსაც გადაეცმემა ცხოველის სახელი სტრინგად;
    static String AnimalScanner(String animal){
        // პირობა რომელიც ამოიცნობს ცხოველებს;
        switch (animal){
            case "dog":
                return "l am the dog";
            case "cat":
                return "l am the cat";
            case "lion":
                 return "l am the lion";
            case "pig":
                 return "l am the pig";
            default:
                 return  "l Am an Animal"; // სხვა ცხოველების შემთხვევაში

        }
    }
}
/*
 "C:\Program Files\Java\jdk-22\bin\java.exe" -javaagent:D:\downloads\ideaIC-2024.1.4.win\lib\idea_rt.jar=52834:D:\downloads\ideaIC-2024.1.4.win\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\PC\Desktop\Java\Test\out\production\Test davaleba_2.Animal
l am the dog

Process finished with exit code 0
 */