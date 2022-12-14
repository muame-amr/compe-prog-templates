package templates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ReadInput {
    public static void main(String[] args) throws IOException
    {
  
        // Reading input separated by space
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
  
        // Storing in array
        int[] arr = Stream.of(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        System.out.println(Arrays.toString(arr));
  
        // Using streams concepts to parse map to integer
        // later on collecting via Collectors via toList()
        // method and storing it an integer list
        List<Integer> arrayList
            = Stream.of(br.readLine().split(" "))
                  .mapToInt(Integer::parseInt)
                  .boxed()
                  .collect(Collectors.toList());
  
        // Print the above List as created
        System.out.println(arrayList);
        
    }
}
