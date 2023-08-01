package rosa.felipe.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rosa.felipe.model.Adress;

@RestController("/address")
public class AddressController {

    @GetMapping("")
    public Adress getAddress() {
        Adress address = new Adress();
        address.setCountryName("Brazil");
        address.setLocality("São Paulo");
        address.setRegion("SP");
        address.setStreetAddress("Rua dos Bobos, 0");
        return address;
    }

}
