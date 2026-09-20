public class PassByReference
{
    
    static void passByReference(int[] arr)
    {
        arr[1] = 10;
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static void makeItHalf(Data myData)
    {
        myData.number = myData.number/2;
        System.out.println(myData.number);
        myData.num = myData.num/2;
    }


    public static void main(String[] args)
    {
        

        int[] num = {1,2,3,4,5};

        passByReference(num);

        for(int i = 0; i<num.length; i++)
        {
        System.out.println(num[i]);
        }

        Data newData = new Data();        //created a object for Data class 
        newData.number = 100; 
        newData.num =   10;        // assigning value to number variable ;
        makeItHalf(newData);              // pass by reference 
        System.out.println(newData.number);
        System.out.println(newData.num);
        

    }    
}
