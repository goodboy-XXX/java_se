package club.banyuan.practice03;


public class TimerImpl implements Timer {

    private long startTime;
    private long endTime;
    boolean isStart = true;
    boolean isEnd = true;

    @Override
    public void start() throws IllegalStateException {
        if (!isStart){
            throw new IllegalStateException();
        }
        startTime = System.currentTimeMillis();
    }

    @Override
    public void stop() throws IllegalStateException {
        if (!isEnd){
            throw new IllegalStateException();
        }
        endTime = System.currentTimeMillis();
    }

    @Override
    public void reset() {
        startTime = 0;
        endTime = 0;
    }

    @Override
    public long getTimeMillisecond() {
        return endTime - startTime;
    }
}
