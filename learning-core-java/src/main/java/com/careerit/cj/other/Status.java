package com.careerit.cj.other;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public enum Status {

          OPEN("da82800a-0646-45d9-a66a-914ce6671427","Open"),
          PENDING("2f199106-e931-465a-a87b-4a8b8cb4dcd6","Pending"),
          CLOSED("3ccf6b0e-b159-470c-80d4-6bec45debce0","Closed");

          private final String typeId;
          private final String label;

          Status(String typeId,String label){
              this.typeId = typeId;
              this.label = label;
          }
          private static final Map<UUID,Status> valueMap = new HashMap<>();
          static{
              for(Status status:Status.values()){
                  valueMap.put(UUID.fromString(status.typeId),status);
              }
          }
          public static Status fromValue(UUID typeId){
              return valueMap.get(typeId);
          }
          public static Status fromValue(String typeIdStr){
            return valueMap.get(UUID.fromString(typeIdStr));
          }


}
