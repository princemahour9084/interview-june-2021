package exam;

public class CountCombinations {
 static void find(int arr[], int index,
                                 int num, int reducedNum)
{
    
    if (reducedNum < 0)
        return;
 
    if (reducedNum == 0)
    
    {
    //    for(int j=0;j<index;j++){
  //      if(arr[j]<=3){
    
        for (int i = 0; i < index; i++)
            if(arr[i]<=3){
                System.out.print (arr[i] + " ");
            }System.out.println();
            
        return;
        }
  //  }
  // }
    int prev = (index == 0) ?
                          1 : arr[index - 1];
 
    for (int k = prev; k <= num ; k++)
    {
        arr[index] = k;
 
        
        find(arr, index + 1, num,
                                 reducedNum - k);
    }
}
  public int getNumberOfWays(final int total, final int k) {
    int arr[] = new int [n];
findCombination(arr, 0, n , n);
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return 0;
  }

}
