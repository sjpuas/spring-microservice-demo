package cl.puas.apps.microservices.controllers;

/**
 * Created by Sergio Puas - Bennu.
 * Date: 09-2016
 */

import cl.puas.apps.microservices.object.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    private Message sayHello() {
        Message msg = new Message();
        msg.setMessage("Hello from service!");
        return msg;
    }

}
