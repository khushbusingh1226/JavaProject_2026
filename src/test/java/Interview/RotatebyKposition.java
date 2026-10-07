package Interview;

public class RotatebyKposition {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k =3;
        int [] result = new int [arr.length];
        int n = arr.length;
        for(int i = 0; i < n; i++){
            result[(i+k)%n] = arr[i];
        }
        for(int x: result){
            System.out.print(x+" ");
        }


    }
}
