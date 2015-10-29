package com.toyknight.aeii.net.task;

import com.toyknight.aeii.AsyncTask;

/**
 * @author toyknight 9/7/2015.
 */
public abstract class MessageSendingTask extends AsyncTask<Void> {

    protected final String message;

    public MessageSendingTask(String message) {
        this.message = message;
    }

}
