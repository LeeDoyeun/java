package human20221013;

public class ArrayPractice {
	
	static int[][] arr = new int[3][3]; 
	
	public static void main(String[] args) {
//		practice_01();
//		practice_02();
//		practice_03();
//		practice_04();
//		practice_05();
//		practice_06();
//		practice_07();

		}

	private static void practice_07() {
		for(int i=0; i<arr.length; i++) { 
			 for(int j=0; j<arr[i].length; j++) {
				 arr[i][j] = 9-i-j*3;
				 System.out.print(arr[i][j]+" ");
			 } 
			 System.out.println();
			}	
	}

	private static void practice_06() {
		for(int i=0; i<arr.length; i++) { 
			 for(int j=0; j<arr[i].length; j++) {
				 arr[i][j] = 9-i*3-j;
				 System.out.print(arr[i][j]+" ");
			 } 
			 System.out.println();
			}	
	}

	private static void practice_05() {
		int num = 1;
		for(int i=0; i<arr.length; i++) { 
		 for(int j=0; j<arr[i].length; j++) {
			 arr[j][i] = num;
			 num++;
		 }
		}
		for(int i=0; i<arr.length; i++) { 
			 for(int j=0; j<arr[i].length; j++) {
				 System.out.print(arr[i][j] + " ");		 
			 }
			 System.out.println();
		}
	}

	private static void practice_04() {
		int num = 1;
		for(int i=0; i<arr.length; i++) { 
		 for(int j=0; j<arr[i].length; j++) {
			 arr[i][j]=num;
			 System.out.print(arr[i][j]+" "); 
			 num++;
		 } 
		 System.out.println(); 
		} 	
	}

	private static void practice_03() {
		for(int i=0; i<arr.length; i++) { 
		 for(int j=0; j<arr[i].length; j++) { 
			 arr[i][j]=j+1;
			 System.out.print(arr[i][j] + " "); 
		 } 
		 System.out.println(); 
		} 
	}

	private static void practice_02() { 
		for(int i=0; i<arr.length; i++) { 
		 for(int j=0; j<arr[i].length; j++) { 
			 arr[i][j]=i+1;
			 System.out.print(arr[i][j] + " "); 		 
		 } 
		 System.out.println(); 
		} 
	}

	private static void practice_01() { 
		for(int i=0; i<arr.length; i++) { 
		 for(int j=0; j<arr[i].length; j++) { 
			 arr[i][j]=1;
			 System.out.print(arr[i][j] + " "); 
		 } 
		 System.out.println(); 
		} 
		}

	}

