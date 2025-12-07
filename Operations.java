package EnumExamples;

public enum Operations {

    Add{
        public int apply (int a, int b){
            return a+b;
        }
    },
    Sub{
        public int apply(int a ,int b){
            return a-b;
        }
    },
    Mul{
        public int apply (int a, int b){
            return a*b;
        }
    },
    Div{
        public int apply(int a, int b){
            return a/b;
        }
    };



    public abstract int apply(int a , int b);

}
