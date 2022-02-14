package APIRequests;

import Domain.Utente;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoginAPI {

    public static boolean LoginRequest( String username, String password ) {

        try {
            Utente u = new Utente(username, password);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(u);
            System.out.println(json) ;

            URL url = new URL("http://localhost:8080/login");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type","application/json; utf-8");
            con.setDoOutput(true) ;
            OutputStream os = con.getOutputStream() ;
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8") ;
            osw.write(json) ;
            osw.flush() ;
            osw.close() ;
            os.close();
            con.connect() ;
            //con.addRequestProperty("", json) ;

            int status = con.getResponseCode() ;
            System.out.println(status) ;

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine) ;
                if ( inputLine.equals("true") ) return true ;
            }
            in.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false ;
    }
}
