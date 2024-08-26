class Solution {
    public void swap(char[] s, int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public void rev(char[] s, int index){
        if(index==s.length/2) return;
         swap(s,index,s.length-index-1);
        rev(s,index+1);
       
    }
    public void reverseString(char[] s) {
       rev(s,0); 
        
    }
}
