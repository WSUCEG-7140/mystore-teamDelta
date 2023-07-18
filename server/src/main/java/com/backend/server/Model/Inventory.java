package com.backend.server.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "inventory")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inventory {
    @Id
    private int itemId;
    private String itemName;
    private String category;
    private int cost;
    private String Supplier;

}
