package com.konfigthis.client;

import com.konfigthis.client.api.GifsApi;
import com.konfigthis.client.api.StickersApi;

public class Giphy {
    private ApiClient apiClient;
    public final GifsApi gifs;
    public final StickersApi stickers;

    public Giphy() {
        this(null);
    }

    public Giphy(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.gifs = new GifsApi(this.apiClient);
        this.stickers = new StickersApi(this.apiClient);
    }

}
