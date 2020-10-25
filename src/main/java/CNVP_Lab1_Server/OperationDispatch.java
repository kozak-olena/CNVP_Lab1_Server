package CNVP_Lab1_Server;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class OperationDispatch {
    public static String getOperation(String receivedData) throws IOException {
        return JsonParser.convertFromJson(receivedData);
    }

    public static String getBrigadeNumber() throws JsonProcessingException {
        String numberOfBrigade = getNumber();
        return JsonParser.convertToJson(numberOfBrigade);
    }

    public static String getNumber() {
        return "2";
    }

    public static String getSurnames() throws JsonProcessingException {
        String surnames = String.join(" ", "ПОЛІЩУК", "ШЕВЧУК", "ПОПОВА", "ХАЧАТУРЯН", "СЕРДЮК");
        return JsonParser.convertToJson(surnames);

    }

}
