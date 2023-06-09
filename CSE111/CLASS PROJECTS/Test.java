class Test {
    int x = 2;
    int y = 4;
    int sum = 6;
    Test t;
    void methodOne() 
    {
        t = new Test();
        t.sum += sum;
        System.out.println(t.sum);
    }
    int methodTwo() {
        System.out.println(++x);
        methodOne();
        System.out.println(y++);
        return x * y * sum;
    }
    int methodThree() {
        t.sum += methodTwo();
        System.out.println(++t.sum);
        return --sum;
    }
}
