package io.agora.json;

import com.alibaba.fastjson.JSON;

public class JsonUtil {
    public String toJson(Object object) {
        return JSON.toJSONString(object);
    }
}
