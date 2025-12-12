import java.util.*;

class CountFrequency{
    public static Map<String, Integer> countFreq(String arr[]){
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String str : arr){
            if(frequencyMap.containsKey(str)){
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
                
            }
            return frequencyMap;            
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String[] input = new String[5];
            System.out.println("Enter array elements");
            for(int i=0; i<5; i++){
                input[i] = sc.nextLine();
            }
            Map<String, Integer> result = countFreq(input);
            System.out.println(result);

            sc.close();
        }
        
    }

