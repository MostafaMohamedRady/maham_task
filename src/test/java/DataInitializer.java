import entity.RequestData;
import entity.ResponseData;
import service.RestClientService;

public class DataInitializer {

    public static RequestData getAccountCreationData() {
        RequestData requestData = new RequestData();
        requestData.setEmail("test788098154@test.com");
        requestData.setEtisalatAccountnumber(1755088127);
        requestData.setPlanID(127);
        requestData.setContactNumber("555 5555");
        return requestData;
    }

    public static RequestData getAccountSuspensionData() {
        RequestData requestData = new RequestData();
        requestData.setEtisalatAccountnumber(1755088127);
        return requestData;
    }

    public static RequestData getProductCreationData() {
        RequestData requestData = new RequestData();
        requestData.setEtisalatAccountnumber(2105642438);
        requestData.setPlanID(127);
        return requestData;
    }

    public static RequestData getProductSuspensionData() {
        RequestData requestData = new RequestData();
        requestData.setEtisalatAccountnumber(168799500);
        requestData.setProductID(43290060);
        return requestData;
    }

    public static RequestData getProductReactivationData() {
        RequestData requestData = new RequestData();
        requestData.setEtisalatAccountnumber(135631022);
        requestData.setProductID(1434174232);
        return requestData;
    }

}
