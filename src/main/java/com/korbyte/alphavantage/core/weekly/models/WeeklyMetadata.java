package com.korbyte.alphavantage.core.weekly.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.korbyte.alphavantage.baseModels.BaseMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class WeeklyMetadata extends BaseMetadata {

  @JsonProperty(value = "4. Time Zone")
  private String timeZone;
}
