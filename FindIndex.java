/*
Find out the array index or position
where sum of numbers preceeding the index is equals to sum of numbers
succeeding the index.
*/
public class FindIndex{

	public static int FindIndex(int[] numbers) throws Exception{

		int endIndex = numbers.length -1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;

		while(true){
			if(sumLeft > sumRight){
				sumRight += numbers[endIndex--];
			}
			else{
				sumLeft += numbers[startIndex++];
			}
			if(startIndex > endIndex){
				if(sumLeft == sumRight){
					break;
				}
				else{
					throw new Exception(
						"Wrong array as input");
				}
			}
		}
		return endIndex;
	}

	public static void main(String args[]){
		int[] num = {2, 4, 4, 5, 4, 1,2, 4, 4, 5, 4, 1};
		
		try{
			System.out.println("Starting from index 0 adding numbers till index " + FindIndex(num) + " and");
			System.out.println("adding remaining numbers can be equal");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
