package ds.wildcardMatching;

class Solution {
    public static void main(String[] args) {
        System.out.println(isMatch("abhishek", "is"));
    }
    public static boolean isMatch(String s, String p) {
        if(s.isEmpty()) return false;
        if(p.isEmpty()) return false;
        if(p.compareTo("*") == 1) return true;
        char[] ch =s.toCharArray();
        int chLength= ch.length;
        char[] pCh= p.toCharArray();
        int pLength = pCh.length;
        int j=0;
        for(int i=0; i<pLength ; i++){
            while(j<chLength){
                if(pCh[i]==ch[j]) {
                    j++;
                    break;
                }
            }
        }
        return false;
    }
}
