import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
            
	    // Reading primitive data types from a file
            int intValue = dis.readInt();            
            double doubleValue = dis.readDouble();   
            boolean booleanValue = dis.readBoolean();
            String utfString = dis.readUTF();        
            
            // Displaying the read data
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Boolean: " + booleanValue);
            System.out.println("String: " + utfString);
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
    }
}

