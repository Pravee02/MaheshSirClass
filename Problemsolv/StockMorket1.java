public class StockMorket1
{
    static double findMaxProfit(double[] arr)
    {
        double maxProfit = Integer.MIN_VALUE;

        for(int currentBuy = 0; currentBuy < arr.length; currentBuy++)
        {
            double buyDayPrice = arr[currentBuy];
            double sellDayPrice = Integer.MIN_VALUE; 
        
            for(int currentsell = currentBuy + 1; currentsell < arr.length; currentsell++)
            {
                if(arr[currentsell] > buyDayPrice)
                {
                    if(arr[currentsell] > sellDayPrice)
                    {
                        sellDayPrice = arr[currentsell];
                    }
                } 
            }
            double currentProfit = sellDayPrice - buyDayPrice;
            if(currentProfit > maxProfit)
            {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }


    static double findMAxProfit1(double[] arr)
    {
        double maxProfit = Integer.MIN_VALUE;

        for(int currentBuy = 0; currentBuy < arr.length; currentBuy++)
        {
            for(int currentSell = currentBuy+1; currentSell < arr.length; currentSell++)
            {
                double currentProfit = arr[currentSell] - arr[currentBuy];
                
                if(currentProfit > maxProfit)
                {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

    static double optimizedfindMaxProfit2(double[] arr){
        double maxProfit = Integer.MIN_VALUE;
        double buyDay = arr[0];

        for(int sell = 1; sell < arr.length; sell++){
            if(arr[sell] > buyDay){
                double currentProfit = arr[sell] - buyDay;

                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }

            if(arr[sell] < buyDay){
                buyDay = arr[sell];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args)
    {
        double[] arr = { 1.2, 1.5, 6.4, 3.2, 0.5, 5.7};
        double result = findMaxProfit(arr);
        System.out.println(result);

        System.out.println(findMAxProfit1(arr));

        System.out.println(optimizedfindMaxProfit2(arr));

    }
}
