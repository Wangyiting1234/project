package com.pro.pro.service;


import com.pro.pro.Entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
//@RunWith:run this unit test
@RunWith(SpringRunner.class)
public class CartServiceTests {
    @Autowired
    private ICartService cartService;
    @Test
    public void addNewCart(){
//        cartService.addNewCart(3,2,3,"small","black","156047813333");
        cartService.addNewCart(2,4,4,"small","blue","156047813332");
    }
    @Test
    public void getByUserId(){
        cartService.getByUserId(9);
    }
//   @Test
//    public void addNewAddress(){
//       Address address = new Address();
//       address.setreceiverName("kkkk");
//       addressService.addNewAddress(13,"15604781345",address);
//   }
//   @Test
//    public void setDefault(){
//        addressService.setDefault(6,14,"14566666666");
//   }
//   @Test
//    public void deleteByAddId(){
//       addressService.deleteAddress(10,14);
//   }
//   @Test
//    public void updateAddress(){
//       Address address = new Address();
//       address.setpostCode("015000");
//       address.setisDefault(0);
//       address.setProvince("biejing");
//       address.setCity("beijing");
//       address.setArea("dong");
//       address.setreceiverName("1231");
//       address.setreceiverPhone("1387993233");
//       address.setAddress("asddads");
//       addressService.updateAddress(4,"14098982222",9,address);
//   }


}
