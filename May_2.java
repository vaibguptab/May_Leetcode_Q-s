package may;

public class May_2 {
    public static void main(String[] args) {
        int[] arr = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(sign(arr));
    }

    private static int sign(int[] arr) {
        for (int e: arr) if (e==0) return 0;
        int nega = 0;
        for (int e:arr) if (e<0) nega++;
        if (nega%2==0) return 1;
        else return -1;

//        int num=1;
//        for (int i=0;i<arr.length;i++){
//            num = num * arr[i];
//        }
//        return signfunc(num);
    }

    private static int signfunc(int num) {
        if (num<0) return -1;
        else if (num>0)  return 1;
        else return 0;
    }
}
