 // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i < ar.length; i++){
            if(hm.containsKey(ar[i])){
                int val = hm.get(ar[i]);
                hm.put(ar[i], val + 1);
            } else {
                hm.put(ar[i], 1);
            }
        }

        int pairs = 0;

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            Integer v = entry.getValue();
            if(v >= 2) {
                pairs += v/2;
            }
        }
        return pairs;
    }
