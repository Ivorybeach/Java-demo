package bank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    // ������
    private final Lock lock = new ReentrantLock();
    // Condition����
    private final Condition condDeposit = lock.newCondition();
    private final Condition condWithdraw = lock.newCondition();

    // Ϊ����double���ͼ������balance�������Ϊint��
    private int balance;
    
    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int drawAmount) {
        // ����
        lock.lock();
        try {
            // ����ʻ����㣬��ȡǮ��������
            while (balance < drawAmount)
                condWithdraw.await();

            // ִ��ȡǮ
            balance -= drawAmount;
            System.out.println(Thread.currentThread().getName() + " ȡǮ:" + drawAmount + "�˻����Ϊ��"
                    + balance);

            // ���Ѵ���߳�
            condDeposit.signal();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    // ����Ŀǰ��ƣ��ʻ�������1000���ô�������ȡ�������ٴ档
    // ������ʵҵ���߼������ϣ�ֻ�Ǽ�������Ҫ��������ģ�������һ����ȫ����Ͳ������ˡ�
    public void deposit(int depositAmount) {
        lock.lock();
        try {
            // ����ʻ�������1000����Ǯ��������
            while (balance > 1000)
                condDeposit.await();

            // ִ�д��
            balance += depositAmount;
            System.out.println(Thread.currentThread().getName() + " ���:" + depositAmount + "�˻����Ϊ��"
                    + balance);

            // ����ȡ���߳�
            condWithdraw.signal();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}