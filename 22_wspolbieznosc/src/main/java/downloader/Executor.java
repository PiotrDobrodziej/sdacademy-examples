package downloader;

public interface Executor {
  void execut(Runnable codeToExecute, TaskFinishedListener listener);
}
