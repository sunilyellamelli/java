public class MethodOverLoading {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(double a,double b){
        System.out.println(a+b);
    }
    static void add(int [] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        add(20,30);
        add(10,30,20);
        add(19.3,12.3);
        int arr[]={10,20,30};
        add(arr,3);

    }
    
}
