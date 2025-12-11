package rvt;

import org.w3c.dom.css.Counter;

public class overloadedcounter {

    

    private int counter;

    public overloadedcounter (int startValue) {
        this.counter = startValue;
    }

    public overloadedcounter() {
        this(0);
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        this.counter--;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.counter = this.counter + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.counter = this.counter - decreaseBy;
        }
    }
    
    @Override
    public String toString(){
        return "Count: " + this.counter;
    }

    public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        overloadedcounter count = new overloadedcounter(15);
        
        count.increase();
        System.out.println(count);
        count.increase(10);
        System.out.println(count);
        count.increase(-10);
        System.out.println(count);
        count.decrease();
        System.out.println(count);
        count.decrease(11);
        System.out.println(count);
        count.decrease(-11);
        System.out.println(count);
    }

}

}

