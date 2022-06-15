public class Challenge {
    public static void main(String[] args) {

        int[] a={0,1};
        int[] result=algorithm(a);
        System.out.println(result[0] + " ");


    }
    static int[] algorithm(int[] arr){
        arr[0]=arr[1]/2;
        arr[1]=arr[0];
        return arr;

    }
}
