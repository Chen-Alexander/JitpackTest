package io.agora.codec;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {
    public String encode(String data) {
        return Base64.encodeBase64String(data.getBytes());
    }
}
