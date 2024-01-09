package main.api.telegram.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {

  private String label;

  private Integer amount;

}
