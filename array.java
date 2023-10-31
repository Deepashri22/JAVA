public class array {
    public static void main(String[] args){
        int nums[][]=new int[3][2];
        nums[0][0]=5; 
        nums[0][1]=2;
        nums[1][1]=1;
        nums[1][0]=3; 
        nums[1][0]=4;
        nums[2][0]=9;   
        for(int i=0;i<=2;i++){
            for(int j=0;j<=1;j++){
                System.out.print(nums[i][j] + " "); 
            }
            System.out.println();
        }
    }
    
}
