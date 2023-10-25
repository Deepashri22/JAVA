class test
{
    int a=9; 
    String name="Sheena"; 
    public static void main(String[] args){
        int num= 9; // primitive variable
        test obj= new test(); //reference variable 
        test obj1= new test();
        //class name variable name= new class name 
        //obj is called as reference variable in java
        //System.out.println(name);//static variable 
        obj.name="deepu";
        System.out.println(obj.name); //gets printed due to connection with object
        System.out.println(obj.a); 
        System.out.println(obj1.name); //gets printed due to connection with object
        System.out.println(obj1.a);

    }
}