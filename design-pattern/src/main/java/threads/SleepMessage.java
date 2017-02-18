package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by felix on 14.02.17.
 */
public class SleepMessage {

    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        List<String> array = Arrays.asList(importantInfo);

        array.forEach( item -> {
                    try {
                        Thread.sleep(4000);
                        System.out.println(item);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );


    }






}
