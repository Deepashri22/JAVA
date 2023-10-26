
public class demo {
    public static void main(String[] args){
        int nums[]={5,4,3,7}; 
        int a=8; 
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        for (int i=0;i<=3;i++){
            System.out.println(nums[i]);
        }
        int nums1[]=new int[4]; //initializing an array in the heap memory through objects
        nums1[0]=5; 
        nums1[1]=6;
        nums1[2]=24;
        nums1[3]=55; 

        System.out.println(nums1[2]);

    }
}
