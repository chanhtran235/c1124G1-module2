package ss3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr ={1,2};
         changeArray(arr);
        System.out.println(" bên ngoài hàm"+ Arrays.toString(arr));
    }

    public static void changeArray(int[] array){
        array= new int[]{100, 200};
        System.out.println(" bên trong hàm"+ Arrays.toString(array));
    }
}
