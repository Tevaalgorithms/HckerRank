 static int countingValleys(int n, String s) {
        int valley = 0;
        char[] steps = new char[s.length()];
        steps = s.toCharArray();
        int ini = 0;
        for(int i=0; i < n; i++) {
            if(steps[i] == 'U') {
                ini += 1;
            } else if(steps[i] == 'D') {
                ini -= 1;
            }
            if(ini == 0 && steps[i] != 'D') {
                valley += 1;
            }
        }
        return valley;
    }
