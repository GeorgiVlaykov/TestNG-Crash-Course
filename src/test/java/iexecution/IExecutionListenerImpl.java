package iexecution;

import org.testng.IExecutionListener;

public class IExecutionListenerImpl implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        System.out.println("IExecutionListenerImpl:onExecutionStart()");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("IExecutionListenerImpl:onExecutionFinish()");
    }
}
