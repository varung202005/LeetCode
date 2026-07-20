class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack=new Stack<>();
        String t = s.toLowerCase();
        for(int i=0;i<t.length();i++){
            if(Character.isLetterOrDigit(t.charAt(i))){
            stack.push(t.charAt(i));
        }
        }
          for(int i=0;i<t.length();i++){
            if(Character.isLetterOrDigit(t.charAt(i))){
            if(t.charAt(i)!=stack.pop()){
                return false;
            }
        }
        }

        return true;
    }
}