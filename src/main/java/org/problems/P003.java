//  Reverse of order of words in sentence

package org.problems;

public class P003 {
    public static void main(String[] args) {
        String sentence = "I am a Java Developer";

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            StringBuilder word = new StringBuilder(words[i]);
            if(i%2 != 0){
                reversedSentence.append(word.reverse()).append(" ");
            }
            else {
                reversedSentence.append(word).append(" ");
            }
        }

        System.out.println(reversedSentence);
    }

}
