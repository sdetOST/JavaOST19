package a01;

public class duplicatedNums {
	    public static void main(String[] args) {
	        int[] arr = {1,1,1,2,3,3,4,5,6,6};
	        
	        //#7(if we dont care about order of chars)
	////    ArrayList<Integer> list = new ArrayList<>();
//	      String item = "Umbrellaaaaabbmns";
//	      String str  = "";
//	      Set<Character> list = new HashSet<>();
//	      for(int i = 0 ; i <= item.length()-1 ; i++) {
//	      list.add(item.charAt(i));
//	      }System.out.println(list);
	        
	        
	        //#6( w/ String)
//	      String item = "Umbrellaaaaabbmns";
//	      String str  = "";
//	      for(int i = 0 ; i <= item.length()-1 ; i++) {
//	          if(!str.contains(""+item.charAt(i))){
//	              str += item.charAt(i);
//	          }
//	      }System.out.println(str);
	        
	        //#5
//	      Set<String> list = new TreeSet<>(Arrays.asList("a","a","bb","bb","ccc","ab"));
//	      System.out.println(list);
	        
	        //#4
//	      Set<Integer> list = new HashSet<>(Arrays.asList(1,5,3,2,7,12,12,1));
//	      System.out.println(list);
	        
	        //#3
//	      for(int i = 0 ; i <= arr.length-1 ; i++) {
//	          if(arr[i]==arr[i+1] && !list.contains(arr[i])) {
//	              list.add(arr[i]);
//	              i++;                
//	          }else if(arr[i]!=arr[i+1] && !list.contains(arr[i])) {
//	              list.add(arr[i]);
//	              
//	          }
//	      }System.out.println(list);
	        
	        //#2
//	      for(int i = 0 ; i <= arr.length-1 ; i++) {
//	          int count = 0;
//	          for(int j = 0 ; j <= arr.length-1 ; j++) {
//	              if(arr[i]==arr[j])
//	                  count++;                
//	          }if(count==1) {
//	              list.add(arr[i]);
//	          }
//	      }
//	      System.out.println(list);
	        
	        //#1
//	      for(int i = 0 ; i <= arr.length-1 ; i++) {
//	          if(!list.contains(arr[i])) {
//	              list.add(arr[i]);
//	              }
//	      }
//	      System.out.println(list);
	    }
	}