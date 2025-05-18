import java.util.*;
public class RearangeSignElement2{
    public static void main(String[] args){
        int n=6;
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1,2,-4,-5,3,4));
        
        ArrayList<Integer> ans= RearrangebySign(A,n);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) +" ");
        }
    }

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n){

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(A.get(i) > 0){
                pos.add(A.get(i));
            }
            else {
                neg.add(A.get(i));
            }
        }

        //If positives are lesser than the negatives
        if(pos.size() < neg.size()){

            for(int i=0; i<pos.size(); i++){
                A.set(2*i, pos.get(i));
                A.set(2*i+1, neg.get(i));
            }

            int index = pos.size() * 2;
            for(int i=pos.size(); i< neg.size(); i++){
                A.set(index, neg.get(i));
                index++;
            }
        }

        //If negatives are lesser than the positives
        else{
            
            for(int i=0; i<neg.size(); i++){
                A.set(2*i, pos.get(i));
                A.set(2*i+1, neg.get(i));
            }

            int index = neg.size() * 2;
            for(int i=neg.size(); i<pos.size(); i++){
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }
}
