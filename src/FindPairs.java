package src;

public class FindPairs {

    public static void main(String[] args) {
        int snr []= {2,3,4,5,6,7};


        findPairs(snr, 10);

    }

    public static void findPairs(int arr [], int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]== num) {
                    System.out.println(arr[i]+"+"+arr[j]+"="+num);
                }
            }
        }

    }
}



