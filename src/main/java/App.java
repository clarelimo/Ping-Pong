import models.PingPong;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a number");

        String stringUserNumber = null;
        try {
            stringUserNumber = bufferedReader.readLine();
            int inUserNumber = Integer.parseInt(stringUserNumber);

            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(inUserNumber);

            System.out.println( pingPongResult);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
