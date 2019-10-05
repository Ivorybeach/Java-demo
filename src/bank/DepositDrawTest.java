package bank;

class DrawThread extends Thread {
    // ģ���û��˻�
    private Account account;
    // ÿ��ȡǮ��
    private int drawAmount;

    public DrawThread(String name, Account account, int drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(drawAmount);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class DepositThread extends Thread {
    // ģ���û��˻�
    private Account account;
    // ÿ�δ�Ǯ��
    private int depositAmount;

    public DepositThread(String name, Account account, int depositAmount) {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(depositAmount);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class DepositDrawTest {

    public static void main(String[] args) {
        // ����һ���˻�����ʼ�ʻ����Ϊ0
        Account acct = new Account(0);

        // ע�������ȡ�������balance����ֵ��Ҫƥ�䣬
        // ���������ɴ���������ô棬Ȼ����û����ȡ��³����޷�������ֹ�����⡣
        new DrawThread("ȡǮ��1", acct, 400).start();
        new DrawThread("ȡǮ��2", acct, 600).start();
        new DepositThread("����߼�", acct, 600).start();
        new DepositThread("�������", acct, 200).start();
        new DepositThread("����߱�", acct, 400).start();
    }
}