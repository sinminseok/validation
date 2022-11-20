package hello.itemservice.validation;

import org.junit.jupiter.api.Test;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;


public class MessageCodesResolverTest {

    MessageCodesResolver codesResolver = new DefaultMessageCodesResolver();

    @Test
    void messageCodesResolveObject(){
        String[] messageCodes = codesResolver.resolveMessageCodes("required","item");
        System.out.println("messageCodes"+messageCodes[1]);
    }

    @Test
    void messageCodesResolverFiele(){
        String[] messageCodes = codesResolver.resolveMessageCodes("required","item","itemName",String.class);

    }
}
