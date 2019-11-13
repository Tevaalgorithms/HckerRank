    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        if(a.length < 1) return a;
        int s = 0;
        // NOTE: a.lenght - 1. Otherwise, you'll get error :) 
        int e = a.length - 1;
        while(s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
        return a;
    }

