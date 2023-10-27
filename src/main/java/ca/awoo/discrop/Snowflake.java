package ca.awoo.discrop;

import java.util.Date;

import ca.awoo.json.CustomSerializer;
import ca.awoo.json.JsonDeserializationException;
import ca.awoo.json.JsonSerializationException;
import ca.awoo.json.types.JsonNumber;
import ca.awoo.json.types.JsonString;
import ca.awoo.json.types.JsonValue;

public class Snowflake implements CustomSerializer{
    public long value;

    public Snowflake(){}

    public Snowflake(long value){
        this.value = value;
    }

    public Date getDate(){
        return new Date((value >> 22) + 1420070400000L);
    }

    public void deserialize(JsonValue<?> json) throws JsonDeserializationException {
        if(json instanceof JsonString){
            value = Long.parseLong(((JsonString)json).getValue());
        }else if(json instanceof JsonNumber){
            value = ((JsonNumber)json).getValue().longValue();
        }else{
            throw new JsonDeserializationException(json, "Invalid type for Snowflake: " + json.getClass().getName());
        }
    }

    public JsonValue<?> serialize() throws JsonSerializationException{
        return new JsonString(Long.toString(value));
    }
}
