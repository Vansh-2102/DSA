class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num :nums){
            if(num<0){
                neg.add(num);
            }
            else{
                 pos.add(num);
            }
        }

        if(neg.size()==0){
            for(int i=0;i<pos.size();i++)
                pos.set(i,pos.get(i)*pos.get(i));
            return pos.stream().mapToInt(Integer::intValue).toArray();
            
        }

        if(pos.size()==0){
            for(int i=0;i<neg.size();i++)
                neg.set(i,neg.get(i)*neg.get(i));
                Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
            
        }

        int i=0,j=0,k=0;
        int no[] = new int[pos.size()+neg.size()];

        for(i=0 ;i < pos.size(); i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }

        for(j=0; j < neg.size(); j++){
            neg.set(j,neg.get(j)*neg.get(j));
        }
        Collections.reverse(neg);

        i=0;
        j=0;

        while(i<pos.size()&&j<neg.size()){
            if(pos.get(i)<neg.get(j)){
                no[k]=pos.get(i);
                k++;
                i++;
            }else{
                 no[k]=neg.get(j);
                k++;
                j++;
            }
        }

        while(i<pos.size()){
            no[k]=pos.get(i);
             k++;
             i++;
        }

         while(j<neg.size()){
            no[k]=neg.get(j);
             k++;
             j++;
        }

        return no;
    }
}