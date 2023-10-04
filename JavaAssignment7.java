import java.util.*;
class JavaAssignment7
{
    
    int[] data;
    public static void main(String[] args) 
    {
        JavaAssignment7 myMap = new JavaAssignment7();

        // Putting key-value pairs into the map
        myMap.put(1, 100);
        myMap.put(2, 200);
        myMap.put(3, 300);
    
        // Getting values by keys
        System.out.println("Value for key 1: " + myMap.get(1));
        System.out.println("Value for key 2: " + myMap.get(2));
        System.out.println("Value for key 3: " + myMap.get(3));
    
        // Removing a key-value pair
        myMap.remove(2);
    
        // Checking if a key exists after removal
        if (myMap.get(2) == -1) {
            System.out.println("Key 2 has been removed.");
        } else {
            System.out.println("Key 2 is still present.");
        }
    }
    public JavaAssignment7() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }
    
    public void put(int key, int value) {
          data[key] = value;
    }
    
    public int get(int key) {
         return data[key];
    }
    
    public void remove(int key) {
        data[key] = -1;
    }
}