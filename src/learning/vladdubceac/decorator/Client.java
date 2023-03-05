package learning.vladdubceac.decorator;

import java.io.*;

public class Client {

    public static void main(String[] args) {
        int c;

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Vlad Dubceac\n");
        stringBuffer.append("aBBBcccDDDD");
        byte[] bytes = stringBuffer.toString().getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
