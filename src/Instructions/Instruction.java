package Instructions;

import java.net.Socket;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class Instruction implements Runnable {
    protected Socket ctrlSocket;
    protected Socket dataSocket;
    protected String[] params;

    public void setCtrlSocket(Socket ctrlSocket) {
        this.ctrlSocket = ctrlSocket;
    }

    public void setDataSocket(Socket dataSocket) {
        this.dataSocket = dataSocket;
    }

    public void setParams(String[] params) {
        this.params = params;
    }
}
