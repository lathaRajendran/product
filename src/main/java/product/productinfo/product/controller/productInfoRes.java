package product.productinfo.product.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
@RestController
@RequestMapping("/info")
public class productInfoRes {
    @RequestMapping("/{id}")
        // @Produces("application/json")
        public String getProductInfo(@PathVariable long id){
        if(id == 1)
            return "Samsung new gen phone with 128GB storage, front-rear camera";
        else
            return "Nokia XI with 256 GB storage, in build noise cancellation";
        }
}
