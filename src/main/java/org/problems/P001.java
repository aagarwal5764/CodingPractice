//  First non-repeating char in a string

package org.problems;

class P001{
    public static void main(String args[]){
        String s = "Ankit Agarwal, Sopra Banking Software";
        char result = firstNonRepeatingChar(s);
        System.out.println(result);
    }

    public static char firstNonRepeatingChar(String s){
        int[] freq = new int[256];

        for(char c : s.toCharArray()){
            freq[c]++;
        }

        for(char c : s.toCharArray()){
            if(freq[c] == 1){
                return c;
            }
        }

        return '\0';
    }
}