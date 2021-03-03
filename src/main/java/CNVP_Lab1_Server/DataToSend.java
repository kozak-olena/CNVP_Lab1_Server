package CNVP_Lab1_Server;

 import java.io.IOException;

public class DataToSend {
    public static String getDataToSend(String receivedData) throws IOException {
        String data = OperationDispatch.getOperation(receivedData);
        if (data.equals("GetNumberOfMyBrigade")) {
            return OperationDispatch.getBrigadeNumber();
        } else if (data.equals("GetSurnamesOfMyBrigade")) {
            return OperationDispatch.getSurnames();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
