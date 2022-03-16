import java.io.*;


public class Day10BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        long digit =1;
        long binary =0;
        int sum = 0;

        while(n >= 2){

            binary += digit * (n % 2);

            //System.out.println(binary);
            n = (int) Math.floor(n/2);
            //System.out.println(n);
            digit *= 10;
            //System.out.println(digit);

        }

        binary += n*digit;

        //System.out.println(binary);
        String seek = Long.toString(binary);

        String[] arr = seek.split("0");
        for(int i = 0 ; i < arr.length ; i++){
            if(sum < arr[i].length())
                sum = arr[i].length();
        }
        System.out.println(sum);

    }
}
