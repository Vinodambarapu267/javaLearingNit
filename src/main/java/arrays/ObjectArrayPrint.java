package arrays;



public class ObjectArrayPrint {
    public static void main(String[] args) {
        Object arr[] = {1, "java", 10.15f, 5, 4, 'A', true};
        int sum = 0;
        for (Object obj : arr) {
            if (obj instanceof Integer) {
                sum += (Integer) obj;
            }
        }
        System.out.println(sum);
    }

}
