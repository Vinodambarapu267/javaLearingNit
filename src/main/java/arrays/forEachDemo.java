package arrays;

public class forEachDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        for (int x:a){
            System.out.print(x);
        }
    }
}
