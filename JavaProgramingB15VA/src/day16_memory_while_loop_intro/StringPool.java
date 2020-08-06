package day16_memory_while_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1 = "java"; // string pool
        String word2 = "java"; // string pool, re-use
        String word3 = new String("java"); // outside pool in Heap

        System.out.println(word1 == word2); //true.both are pointing to same object in Pool

        System.out.println((word1 == word3)); //false
        //false. because word1 and word3  use are pointing to different object in Heap.
        // when we use ==, it does not check if values are matching.
        //it only checks  if variable are pointing to same object in memory.

        String word4 = new String("java"); //outside  Pool in Heap
        //check if word3 and word4 are point to same object
        System.out.println(word3 == word4); //false. both pointing to different objects in memory

        String word5 = word4; //point to same object as word4

        System.out.println(word5 == word4); //true. they point to same object in Heap

        System.out.println(word1 == word4); //false. different objects in memory
        System.out.println(word1.equals(word4)); //true. values match "java",
        // because checking characters not where is the of memory, how it was created

        String str = "macbook"; //string Pool in HEAP
        String str2 = "macbook"; // re-use "macbook" in Pool
        String str3 = str; // point to same object as str


    }
}
