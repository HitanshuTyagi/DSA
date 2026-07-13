class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>li=new ArrayList<>();
        String s="123456789";
        for(int i=2;i<=9;i++){
            for(int j=0;j+i<=9;j++){
                int num=Integer.parseInt(s.substring(j,i+j));
                if(num>=low && num<=high)li.add(num);
            }
        }
        return li;
        // for(int i=low;i<=high;i++){
        //     String num=Integer.toString(i);
        //     boolean flag=true;
        //     for(int j=1;j<num.length();j++){
        //         if(num.charAt(j)-num.charAt(j-1)!=1){
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag)li.add(i);
        // }
        // return li;
    }
}