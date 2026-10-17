public class ShopAShopB_23 
{

    static int savedAmountByBuyingCheaperCostComapreToShopA(int[] arr1 , int[] arr2)
    {
        if(arr1 == null || arr1.length == 0)
        {
            return -1;
        }
        int AshopCount = 0;
        int sumOfCheaperCost = 0;

        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] < arr2[i])
            {
                sumOfCheaperCost = sumOfCheaperCost + arr1[i];
            }
            else
            {
                sumOfCheaperCost = sumOfCheaperCost + arr2[i];
            }
            AshopCount = AshopCount + arr1[i];
        }
        return AshopCount - sumOfCheaperCost;

    }
    public static void main(String[] args) 
    {
        int[] arr1 = { 100,250,80,40};
        int[] arr2 = { 90,260,70,45};

        System.out.println(savedAmountByBuyingCheaperCostComapreToShopA(arr1, arr2));
}
}