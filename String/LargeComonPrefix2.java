public class LargeComonPrefix2 {
    public static String largestCommonPrefix(String[] strs){
        if(strs.length==0){
            return " ";
        }
        int plen=0;
        while(true){
            if(plen<strs[0].length()){
                boolean allWell=true;
                char ch = strs[0].charAt(plen);

                for(int i=1; i<strs.length; i++){
                    if(plen < strs[i].length() && strs[i].charAt(plen)==ch){
                        //nothing to do
                    }
                    else{
                        allWell=false;
                        break;
                    }
                }
                if(allWell){
                    plen++;
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,plen);
    }
    public static void main(String[] args) {
        String[] str={"club", "clap", "clove"};
        String result = largestCommonPrefix(str);
        System.out.println(result);
    }
}
