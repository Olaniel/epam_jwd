package by.tc.task01.entity;

import java.util.Map;

public class Appliance {// абсолютно бессмысленная иерархия классов. Мы на код-ревью разбирали такие случаи - смотри занятия, чтобы не делать грубых ошибок программирования

    private String type;

    private Map<String, Object> properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

}
