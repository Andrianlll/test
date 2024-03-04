import java.util.*;
import java.io.*;
public class Sum {
    public static void main (String[] args) throws IOException{
     Scanner inputScanner=new Scanner (System.in);
     byte x=inputScanner.nextByte();
     short s=0;
     while (x!=0){
         s+=x;
         x=inputScanner.nextByte();
        }
        PrintWriter outPrint =new PrintWriter(System.out);
        outPrint.print(s);
        outPrint.close();
    }

}
