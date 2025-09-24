import java.util.Scanner;
public class binarySearch{
    static int binarySearch(int A[], int left, int right, int x){
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(A[mid]==x){
                return mid;
            }
            else if(A[mid]>x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int A[]=new int [n];
        System.out.println("Enter element for array:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        int temp=0;
        for(int j=0;j<n;j++){
            for (int k=j+1;k<n;k++){
                if(A[j]>A[k]){
                    temp=A[j];
                    A[j]=A[k];
                    A[k]=temp;
                }
            }   
        }
        System.out.print("Array after sorting:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("Enter element to be searched");
        int x=sc.nextInt();

        int result=binarySearch(A,0,n-1,x);
        if(result==-1){
            System.out.println("Element not found:"+x);
        }
        else{
            System.out.println("Element found at index:"+result);
        }
    }
}