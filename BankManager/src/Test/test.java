package Test;

import java.util.Arrays;
import java.util.Random;

public class test
{
    public static void main(String[] args)
    {
        String str = "";
        Random r = new Random();
        long[] longs = r.longs(0, 9).limit(10).toArray();
        for (long x : longs)
        {
            str += String.valueOf(x);
        }
    }
}
