import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class IP_address_check{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

//Write your code here
class MyRegex{
    String zeroto255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])"; // this is the pattern that checks if the number is between 0 - 255
    String pattern = zeroto255+"\\."+zeroto255+"\\."+zeroto255+"\\."+zeroto255;
}