package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestData {
    private String email;
    private int planID;
    @JsonProperty("etisalat_account_number")
    private int etisalatAccountnumber;
    @JsonProperty("contact_number")
    private String contactNumber;
    private int productID;

}
