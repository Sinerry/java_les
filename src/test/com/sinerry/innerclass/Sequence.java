package com.sinerry.innerclass;


public class Sequence{
    private Object [] data;
    private int next;
    public Sequence(int size) {
        data = new Object[size];
    }

    public boolean add(Object e) {
        if(next < data.length) {
            data[next++] = e;
            return true;
        }
        return false;
    }

    public Operator getInstance(boolean flag) {
        if(flag) {
            return new OperatorImpl();
        }
        return new OperatorReverseImpl();
    }


    public class OperatorImpl implements Operator {
        private int index;
        @Override
        public boolean end() {
            return index >= data.length;
        }

        @Override
        public Object current() {
            if(index < data.length) {
                return data[index];
            }
            return null;
        }

        @Override
        public void next() {
            if(index >= data.length) return;
            index++;
        }
    }

    public class OperatorReverseImpl implements Operator {
        private int index;
        public OperatorReverseImpl() {
            index = data.length - 1;
        }
        @Override
        public boolean end() {
            return index < 0;
        }

        @Override
        public Object current() {
          if(index < 0) return null;
          return data[index];
        }

        @Override
        public void next() {
           if(index < 0) return;
           index--;
        }
    }
}
