/*
* Your mission is to write a small Java program that proves whether Green Eggs and Ham 
* really uses only 50 different words. You’ll start with two things: an empty Main class 
* and a text file that contains the entire story. Your job is to read the file line by 
* line and use appropriate skills to see count the number of words. How you do this is up to you!
* 
* Things to consider:
* 1. Capitalization! "Green" and "green" are the same word. The method .toLowerCase() can be used
*    on Strings to return a version with all lower case letters. For example, line = line.toLowerCase()
     would change a String into an all lowercase version of itself
* 2. Punctuation! "ham." and "ham" are the same word. We can replace individual letters in a String 
     by using .replace(..., ...). For example, line = line.replace(",", "") would delete any commas 
     in String line.
* 3. Hyphened words! "Sam-I-am" is not a word, it should be record as three words: "Sam", "I", "am". 
     Consider what tools you can use to break up an existing word

* The hard part of this challenge will be the cleaning of the text! Consider the three clarifications 
  above as you work through your code.

*/

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

}
