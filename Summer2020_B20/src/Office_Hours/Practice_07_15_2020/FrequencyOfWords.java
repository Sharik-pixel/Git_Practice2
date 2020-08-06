package Office_Hours.Practice_07_15_2020;

    /*
    write the program that can find  the frequency  of a word from a string (not  from a sentence)

	Ex:
		input :
			CatCatCat
			Cat

		output:
			2
    */

public class FrequencyOfWords {

    public static void main(String[] args) {
        String original = "catcatcat";

        String str = original;

        int count = 0; // 1 + 1 + 1

        while(str.contains("cat") ){ //: true true true false
            count++;
           str = str.replaceFirst("cat", "");
                    // "cat cat
                   // "cat
                  // " "
        }

        System.out.println(count);
        System.out.println(str);







    }
}
