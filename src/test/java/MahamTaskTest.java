import entity.RequestData;
import entity.ResponseData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.RestClientService;

public class MahamTaskTest {

    RestClientService restClientService;

    @Before
    public void setUp() {
        restClientService=new RestClientService();
    }

    @Test
    public void testAccountCreation(){
        System.out.println("=====testAccountCreation=====");
        ResponseData response = restClientService.accountCreation(DataInitializer.getAccountCreationData());
        System.out.println(response.toString());
        Assert.assertNull(response.getError());
        Assert.assertNotNull(response.getData());
        Assert.assertEquals(1111111,response.getData().getAccountID());
//        Assert.assertEquals(1480332081,response.getData().getProductID());
//        Assert.assertEquals(127,response.getData().getPlanID());
//        Assert.assertEquals(1755088127,response.getData().getEtisalatAccountnumber());

    }

    @Test
    public void testAccountSuspension(){
        System.out.println("=====testAccountSuspension=====");
        ResponseData response = restClientService.accountSuspension(DataInitializer.getAccountSuspensionData());
        System.out.println(response.toString());
        System.out.println(response.toString());
        Assert.assertNull(response.getError());
        Assert.assertNotNull(response.getData());
        Assert.assertEquals(1111111,response.getData().getAccountID());
        Assert.assertEquals(1755088127,response.getData().getEtisalatAccountnumber());
    }

    @Test
    public void testProductCreation(){
        System.out.println("=====testProductCreation=====");
        ResponseData response = restClientService.productCreation(DataInitializer.getProductCreationData());
        System.out.println(response.toString());
        Assert.assertNull(response.getError());
        Assert.assertNotNull(response.getData());
        Assert.assertEquals(1111111,response.getData().getAccountID());
//        Assert.assertEquals(1113938820,response.getData().getProductID());
        Assert.assertEquals(127,response.getData().getPlanID());
        Assert.assertEquals(2105642438,response.getData().getEtisalatAccountnumber());
    }

    @Test
    public void testProductSuspension(){
        System.out.println("=====testProductSuspension=====");
        ResponseData response = restClientService.productSuspension(DataInitializer.getProductSuspensionData());
        System.out.println(response.toString());
        Assert.assertNull(response.getError());
        Assert.assertNotNull(response.getData());
        Assert.assertEquals(43290060,response.getData().getProductID());
        Assert.assertEquals(168799500,response.getData().getEtisalatAccountnumber());
    }

    @Test
    public void testProductReactivation(){
        System.out.println("=====testProductReactivation=====");
        ResponseData response = restClientService.productReactivation(DataInitializer.getProductReactivationData());
        System.out.println(response.toString());
        Assert.assertNull(response.getError());
        Assert.assertNotNull(response.getData());
        Assert.assertEquals(1434174232,response.getData().getProductID());
        Assert.assertEquals(135631022,response.getData().getEtisalatAccountnumber());
    }
}
