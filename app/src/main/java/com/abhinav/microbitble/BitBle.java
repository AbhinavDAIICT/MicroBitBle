package com.abhinav.microbitble;

/**
 * Created by abhin on 12/4/2016.
 */

public interface BitBle {
    public void startScan();
    public void stopScan();
    public void showReminderList();
    public void enableAdapter();
}
