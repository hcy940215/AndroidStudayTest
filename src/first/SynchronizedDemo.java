package first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SynchronizedDemo {
    public synchronized void a() {
        String date= new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
        System.out.println("执行A之前的时间" + date);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("被Synchronized关键字修饰的普通方法>>>>> A <<<<<正在执行");
                Thread.sleep(1000);
            }
            String dateAfter= new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
            System.out.println("执行A之后的时间" + dateAfter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void b() {
        try {
            String date= new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
            System.out.println("执行B之前的时间" + date);
            for (int i = 0; i < 5; i++) {
                System.out.println("被Synchronized关键字修饰的普通方法>>>>> B <<<<<正在执行");
                Thread.sleep(1000);
            }
            String dateAfter= new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
            System.out.println("执行B之后的时间" + dateAfter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void e() {
        System.out.println("没有被Synchronized关键字修饰的普通方法>>>>> E");
    }

    public static synchronized  void c() {
        try {
            String date= new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
            System.out.println("执行C之前的时间" + date);
            for (int i = 0; i < 5; i++) {
                System.out.println("被Synchronized关键字修饰的静态方法>>>>> C <<<<<正在执行");
                Thread.sleep(1000);
            }
            String dateAfter= new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
            System.out.println("执行C之后的时间" + dateAfter);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void d() {
        System.out.println("被Synchronized关键字修饰的静态方法>>>>> D");
    }
    public static void f() {
        System.out.println("没有被Synchronized关键字修饰的静态方法>>>>> F");
    }


   // public void
}
