import java.io.FileOutputStream;
import java.io.OutputStream;

class Outputstream_ex{

    public static void main(String args[]) {
        String data = "Kumar nandeesh surya";

        try {
            OutputStream out = new FileOutputStream("output.txt");

            byte[] dataBytes = data.getBytes();

            out.write(dataBytes);
            System.out.println("Kumar nandeesh surya");

            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}