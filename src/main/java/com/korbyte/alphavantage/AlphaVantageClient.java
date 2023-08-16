package com.korbyte.alphavantage;

import com.korbyte.alphavantage.core.CoreApi;
import lombok.Data;
import okhttp3.*;


@Data
public class AlphaVantageClient {

  private final AlphaVantageConfig config;

  private final CoreApi core;

  /**
   * Constructor
   *
   * @param config AlphaVantageConfig object
   */
  public AlphaVantageClient(AlphaVantageConfig config) {
    this.config = config;
    OkHttpClient client = new OkHttpClient();
    this.core = new CoreApi(config, client);
  }
}