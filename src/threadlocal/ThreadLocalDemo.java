package threadlocal;

public class ThreadLocalDemo extends Thread{
	 private ResultData data;

	    public ThreadLocalDemo(ResultData data) {
	        this.data = data;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 3; i++) {
	            System.out.println(Thread.currentThread().getName() + "---" + "i---" + i + "--num:" + data.getNum());
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        ResultData data = new ResultData();
	        ThreadLocalDemo threadLocaDemo1 = new ThreadLocalDemo(data);
	        ThreadLocalDemo threadLocaDemo2 = new ThreadLocalDemo(data);
	        ThreadLocalDemo threadLocaDemo3 = new ThreadLocalDemo(data);
	        threadLocaDemo1.start();
	        threadLocaDemo2.start();
	        threadLocaDemo3.start();
	        Thread.sleep(300);
	        System.out.println(ResultData.count);
	    }

	}

	class ResultData{
	    // 生成序列号共享变量
	    public static Integer count=0;
	    private static ThreadLocal<Integer> threadLocal=new ThreadLocal<Integer>(){
	        protected Integer initialValue() {
	            return 0;
	        }
	    };
	    public Integer getNum() {
	        int count = threadLocal.get() + 1;
	        threadLocal.set(count);
	        return count;
	    }
	}
