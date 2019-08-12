package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Data {
    @JsonProperty("test_mode")
    private boolean testMode;
    private int accountID;
    private int productID;
    private int planID;
    @JsonProperty("etisalat_account_number")
    private int etisalatAccountnumber;

}
