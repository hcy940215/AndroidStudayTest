package first;

public class TestMain {
    public static void main(String[] args) {
        SynchronizedDemo synchronizedOne = new SynchronizedDemo();
        SynchronizedDemo synchronizedTwo = new SynchronizedDemo();

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedOne.a();
                //  synchronizedOne.c();
            }
        });
        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //休眠 为了C先执行
                    Thread.sleep(1000);
                    synchronizedOne.b();
                    // synchronizedOne.e();
                    //  SynchronizedDemo.d();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread three = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedOne.e();
                SynchronizedDemo.f();
            }
        });
        one.start();
        two.start();
        three.start();
    }
}
