class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < 10; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }
        
        return answer = Integer.parseInt(s);
    }
}