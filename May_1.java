package may;

public class May_1 {
    public static void main(String[] args) {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(func(salary));
    }

    private static double func(int[] salary) {
        int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int e:salary){
            if (e<min) min = Math.min(min,e);
            if (e>max) max = Math.max(max,e);
        }
        int sum=0;
        for (int e:salary) {
            if (e == min) continue;
            else if (e == max) continue;
            else sum += e;
        }
        return sum/(salary.length-2);
    }
}
