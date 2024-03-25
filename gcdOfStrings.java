class Solution {
    public int gcd(int x, int y){
        if(y==0){
            return x;
        }else {
            return gcd(y,x % y);
        }
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        //get gcd length
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0,gcdLength);
    }
 }
 //Time - O(m+n) -> o(m+n) is for concatenate, log(m.n) for GCD using binary Euclidean algorithm
 //Space - O(m+n) -> compare the two concatenations
 