import java.util.*;
public class patterns{

    public void verticalRectangle(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patterns obj=new patterns();
        obj.triangle(5);
        
    }

}