import java.io.*;

public class iostreamEx {
    public static void main(String args[]){
        int  num=0;
        BufferedReader br=null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            System.out.println(n);
        }
        finally{
            br.close();
        }
    }
}
