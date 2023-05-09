import java.lang.Package;
class Main{
    public static void main(String[] args) {
        recursionText(0, "Hello World!");
        recursionText(0, "Mr. Beast");
    }
public static String recursionText(int num, String str){//Recursion method, always set num to 0
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        System.exit(-1);
    }
    System.out.print(str.substring(num, num + 1));
    num++;
    if(num == str.length())
    {
        System.out.println();
        return "";
    }
    return recursionText(num, str);
}

}
