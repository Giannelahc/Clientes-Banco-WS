
package com.banco.clientes;

import javax.jws.WebService;

@WebService(endpointInterface = "com.banco.clientes.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}
