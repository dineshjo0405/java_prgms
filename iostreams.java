import java.io.*;
public class iostreams {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter the number");
        // int num=System.in.read();
        // System.out.println(num);
        // System.out.println(num-48);
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        
        int num = Integer.parseInt(bf.readLine());
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        System.out.println(num);
        bf.close();
    }
}