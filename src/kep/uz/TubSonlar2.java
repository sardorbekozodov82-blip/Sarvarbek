package kep.uz;

import java.util.*;
import java.io.*;

public class TubSonlar2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;

        int n = Integer.parseInt(line.trim());

        if (n < 2) return;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {

            if (isPrime[p]) {

                for (int i = p * p; i <= n; i += p)
                    isPrime[i] = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}