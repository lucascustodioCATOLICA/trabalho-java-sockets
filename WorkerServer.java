import java.io.*;
import java.net.*;
import java.util.*;
import org.json.*;

public class WorkerServer {

    private int porta;
    private boolean metadeSuperior;
    private List<JSONObject> baseDados;

    public WorkerServer(int porta, boolean metadeSuperior) {
        this.porta = porta;
        this.metadeSuperior = metadeSuperior;
        carregarBaseDados();
    }
}
