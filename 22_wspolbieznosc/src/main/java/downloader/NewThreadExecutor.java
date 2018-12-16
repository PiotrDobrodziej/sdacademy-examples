//package downloader;
//
//public class NewThreadExecutor implements Executor{
//  @Override
//  public void execute(Runnable codeToExecute, TaskFinishedListener listener) {
//    Thread thread = new Thread(() -> {
//      codeToExecute.run();
//      listener.taskFinished();
//    });
//    thread.start();
//  }
//
//
//}
