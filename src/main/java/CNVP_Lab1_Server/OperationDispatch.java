package CNVP_Lab1_Server;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

public class OperationDispatch {
    public static String getOperation(String receivedData) throws IOException {
        return JsonParser.convertFromJson(receivedData);
    }

    public static String getBrigadeNumber() throws JsonProcessingException {
        String numberOfBrigade = "2";
        return JsonParser.convertToJson(numberOfBrigade);
    }

    public static String getSurnames() throws JsonProcessingException {
        String surnames = String.join(" ", "ПОЛІЩУК", "ШЕВЧУК", "ПОПОВА", "ХАЧАТУРЯН", "СЕРДЮК");
        return JsonParser.convertToJson(surnames);
    }
}
