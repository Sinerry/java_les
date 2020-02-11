package com.sinerry.innerclass;


public class ExtremeValue {
    private int i;
    public static Extreme calc(int...args) {
        if(args == null) {
            return null;
        }
        int max = args[args.length - 1];
        int min = max;
        for(int i = args.length - 2; i >= 0; i--) {
            if(args[i] > max) {
                max = args[i];
            }
            if(args[i] < min) {
                min = args[i];
            }
        }
        return new Extreme(min,max);
    }

    public static class Extreme {
        private int min;
        private int max;
        public int getMin() {
            return min;
        }
        public int getMax() {
            return max;
        }
        public Extreme(int min,int max) {
            this.min = min;
            this.max = max;
        }
    }
}
