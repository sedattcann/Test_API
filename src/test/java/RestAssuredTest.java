import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.List;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class RestAssuredTest {


    @Test
    public void simpleTest() {
        for (int x=0;x<10;x++)
        {
            baseURI="*************";//

            Response response=given()
                    .log().all()
                    .port(7777)
                    .header("accept-encoding", "gzip")
                    .header("ilKod","14")
                    .header("kurumKod","2")
                    .header("ip","10.6.6.45")
                    .header("tc","**********")
                    .get("*********");

            response.prettyPrint();

            System.out.println("Status Code : " +response.statusCode());
            List res = response.jsonPath().get("value");
            System.out.println("vaka numarası : "+res.get(0));
            if (response.statusCode()==200){
                baseURI="***********";
                String postData="{\n" +
                        "  \"id\": "+res.get(0)+",\n" +
                        "  \"lastModificationDate\": \"2021-12-07 10:15:00.505\",\n" +
                        "  \"cityCode\": 14,\n" +
                        "  \"isAssigned\": 1,\n" +
                        "  \"closable\": false,\n" +
                        "  \"status\": 1,\n" +
                        "  \"priority\": 0,\n" +
                        "  \"isTrue\": 1,\n" +
                        "  \"isUrban\": 0,\n" +
                        "  \"firstPublishedDate\": \"2021-12-07 10:15:00.505\",\n" +
                        "  \"kurumList\": [\n" +
                        "    {\n" +
                        "      \"id\": 2,\n" +
                        "      \"processOption\": 1,\n" +
                        "      \"subInstutitionList\": [],\n" +
                        "      \"olayTuruList\": [\n" +
                        "        {\n" +
                        "          \"id\": 1,\n" +
                        "          \"agencyId\": 2,\n" +
                        "          \"parenttypeId\": 0,\n" +
                        "          \"processOption\": 1,\n" +
                        "          \"closeState\": 0\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"assignedDate\": \"2021-12-07 10:15:00.505\",\n" +
                        "      \"status\": 1,\n" +
                        "      \"identityNumber\": \"11367942902\",\n" +
                        "      \"crudState4Kurum\": 1\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"crudState4KurumOlayTuru\": 1,\n" +
                        "  \"cagriBilgileriList\": [],\n" +
                        "  \"addressList\": [\n" +
                        "    {\n" +
                        "      \"cityCode\": 14,\n" +
                        "      \"cityName\": \"BOLU\",\n" +
                        "      \"institutionId\": 2,\n" +
                        "      \"processOption\": 1,\n" +
                        "      \"coordinateSystem\": {\n" +
                        "        \"id\": 1\n" +
                        "      },\n" +
                        "      \"addressType\": 1\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"actionTypeList\": [\n" +
                        "    {\n" +
                        "      \"id\": 2,\n" +
                        "      \"typeName\": \"KURUMA_ATAMA_YAPILDI\",\n" +
                        "      \"typeDescription\": \"Kuruma Atama Yapıldı.( SAĞLIK)\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"id\": 116,\n" +
                        "      \"typeName\": \"OLAY_TURU_GIRILDI\",\n" +
                        "      \"typeDescription\": \"OLAY_TURU_GIRILDI ( MEDİKAL )\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"id\": 1,\n" +
                        "      \"typeName\": \"YENI_VAKA_OLUSTURULDU\",\n" +
                        "      \"typeDescription\": \"Yeni Vaka Oluşturuldu.\",\n" +
                        "      \"actionTimeInMiliseconds\": 1638794723301\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"id\": 55,\n" +
                        "      \"typeName\": \"VAKA_YAYINLANDI\",\n" +
                        "      \"typeDescription\": \"Vaka Yayınlandı.\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"description\": \" Kuruma Atama Yapıldı.( SAĞLIK) :( MEDİKAL )  Yeni Vaka Oluşturuldu.:  Vaka Yayınlandı.: \",\n" +
                        "  \"ip\": \"10.6.6.46\",\n" +
                        "  \"roleName\": \"SAGLIK_KURUM_YONETICISI\",\n" +
                        "  \"identityNumber\": \"11367942902\",\n" +
                        "  \"updateIsUrbanOnAsos\": false,\n" +
                        "  \"updateOlayTuruOnAsos\": false,\n" +
                        "  \"updateInstitutionAssignedDateOnAsos\": false,\n" +
                        "  \"smsIncidents\": [],\n" +
                        "  \"enabizIncidents\": [],\n" +
                        "  \"eventTypeId\": 0,\n" +
                        "  \"ids\": []\n" +
                        "}";
                Response response1;
                response1 = given()
                        .log().all()
                        .port(7777)
                        .header("accept-encoding", "gzip")
                        .contentType("application/json")
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .header("ilKod","14")
                        .header("kurumKod","2")
                        .header("ip","10.6.6.45")
                        .header("tc","**********")
                        .body(postData)
                        .when()
                        .post("************");


                System.out.println("Status Code : " + response1.statusCode());
                response1.prettyPrint();
            }

        }


    }
}
