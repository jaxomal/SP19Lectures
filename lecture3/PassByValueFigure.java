public class PassByValueFigure {
    public static void main(String[] args) {
           Walrus walrus = new Walrus(3500, 10.5);
           int x = 9;

           doStuff(walrus, x);
           System.out.println(walrus);
           System.out.println(x);
    }

    public static void doStuff(Walrus W, int x) {
           W.weight = W.weight - 100;
           x = x - 5;
    }
}

/* Does the call to doStuff have an effect on walrus and/or x?
Hint: We only need to know the GRoE to solve this problem. */

/* Answer: It has an effect on walrus but not x */