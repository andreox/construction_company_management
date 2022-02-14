package APIRequests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject ;
import org.json.simple.JSONArray ;
import org.json.simple.parser.JSONParser;

public class ClientiAPI {

    public static void findAllClients() {

        try {
            URL url = new URL("http://localhost:8080/clienti");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            System.out.println(status);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine) ;
                JSONParser parser = new JSONParser() ;
                JSONArray arr = (JSONArray) parser.parse(inputLine) ;
                JSONObject cliente = (JSONObject) arr.get(0) ;
                System.out.println(cliente.get("nome")) ;
                System.out.println(cliente.get("indirizzo")) ;

            }
            in.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
     }
}
