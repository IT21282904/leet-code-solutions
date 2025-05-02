package org.example;
/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.



Constraints:

    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.



Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

 */

public class ReverseWordString {
    public String reverseWords(String s) {

        int j = 0;
        int p = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(' ');//eleminate cornered words
        sb.append(s);
        sb.append(' ');//eleminate cornered words
        s = new String(sb.toString());
        int k =s.length();
        sb.setLength(0);
        while(k>1){
            j = k;
            p=0;
            for(int i = k;i>1;i--){
                j--;

                if(s.charAt(i-1) == ' '&& s.charAt(i-2)!= ' ')
                    p = j;//find rear index of a word
                else if(s.charAt(i-1) != ' '&& s.charAt(i-2)== ' '){
                    k=j;//find front index of a word
                    break;
                }
                else if(i==2)//prevent having minus indexes
                    k = 1;
            }
            if(p>k){
                for(int i = k;i<p;i++){
                    sb.append(s.charAt(i));//append a word to stringBuilder
                }
                sb.append(' ');//append spaces between words
            }
        }
        sb.deleteCharAt(sb.length() - 1);//remove last space
        return new String(sb.toString());
    }
}
