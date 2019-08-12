package service;

import entity.RequestData;
import entity.ResponseData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientService {

    private ResponseData callPost(RequestData requestData,String serviceUri){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor("saas_test", "Gh7Kjas.a12w"));
        HttpEntity<RequestData> request=new HttpEntity<RequestData>(requestData);
        ResponseEntity<ResponseData> responseDataResponseEntity = restTemplate.postForEntity("https://etisalat.adverit.com/etisalat_saas_test/"+serviceUri, request, ResponseData.class);
        responseDataResponseEntity.getStatusCodeValue();
        return responseDataResponseEntity.getBody();
    }

    public ResponseData accountCreation(RequestData requestData){
        return callPost(requestData,"AccountCreation");
    }

    public ResponseData accountSuspension(RequestData requestData){
        return callPost(requestData,"AccountSuspension");
    }

    public ResponseData productCreation(RequestData requestData){
        return callPost(requestData,"ProductCreation");
    }

    public ResponseData productSuspension(RequestData requestData){
        return callPost(requestData,"ProductSuspension");
    }

    public ResponseData productReactivation(RequestData requestData){
        return callPost(requestData,"ProductReactivation");
    }


}
