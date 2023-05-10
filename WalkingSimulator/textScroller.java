package WalkingSimulator;

public class textScroller{ //Two for one requirement deal only at taco bell. In other words, fills both recursion and inheritance as every other class that prints inherits from this class
    public String recursionText(int num, String str){//Recursion method, always set num to 0
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
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.exit(-1);
            }
            return "";
        }
        return recursionText(num, str);
    }
}
