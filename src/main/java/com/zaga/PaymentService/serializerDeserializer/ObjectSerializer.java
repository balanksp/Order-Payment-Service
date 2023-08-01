package com.zaga.PaymentService.serializerDeserializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// import org.springframework.core.serializer.Serializer;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.web.context.annotation.ApplicationScope;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.Entity.PaymentDetails;

@ApplicationScope
public class ObjectSerializer implements Serializer<CreditCardDTO> {

    @Override
    public byte[] serialize(String topic, CreditCardDTO data) {
         try {
            ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
            ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
            objectStream.writeObject(data);
            objectStream.flush();
            return byteStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Error serializing MyObject: " + e);
        }
    }

   
    
}


