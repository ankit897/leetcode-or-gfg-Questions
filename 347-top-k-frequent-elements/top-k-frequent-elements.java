class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
       PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
       for(Map.Entry<Integer,Integer> es : mp.entrySet()){
           pq.add(es);
       }
       int output[] = new int[k];
       for(int i =0;i<k;i++){
         output[i] =  pq.poll().getKey();
       }
       return output;
    }
}