package collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class QueueTest {
	// BlockingQueue是Queue的子接口
	BlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<String>();
	BlockingQueue<String> synchronousQueue = new SynchronousQueue<String>();
	BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(3);
	//PriorityBlockingQueue、DelayQueue
}
