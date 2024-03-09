Concurrency: 

`Thread` is a lightweight and smallest unit of processing that can be managed independently by a scheduler.

Thread states in the life cycle:
1. New
2. Runnable
3. Running
4. Waiting/Blocked
5. Dead/Terminated

join() method will wait for others thread to die.
sleep() method in java is used to block a thread for the particular time.

`MultiThreading`: Which is a process of running multiple threads simultaneously.

When multiple threads are working on same data, and the value of our data is changing then this scenario is not thread safe. And this will give us inconsistent result.

When thread is already working on an object and preventing another thread on working on same object, this process called as thread safety. 

We can achieve thread safety with these ways:
1. using `Synchronization`.
2. using `volatile keyword`.
3. using `Atomic variables`.
4. using `final keyword`. 

#### Synchronization: It is a process to allowing only one thread at a time to complete the particular task.

### **Runnable vs Callable**


