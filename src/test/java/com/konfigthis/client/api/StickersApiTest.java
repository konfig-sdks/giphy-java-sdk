/*
 * Giphy API
 * Giphy API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@giphy.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.StickersFindAnimatedStickersResponse;
import com.konfigthis.client.model.StickersGetRandomResponse;
import com.konfigthis.client.model.StickersGetTrendingResponse;
import com.konfigthis.client.model.StickersTranslatePhraseToStickerResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StickersApi
 */
@Disabled
public class StickersApiTest {

    private static StickersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new StickersApi(apiClient);
    }

    /**
     * Search Stickers
     *
     * Replicates the functionality and requirements of the classic GIPHY search, but returns animated stickers rather than GIFs. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAnimatedStickersTest() throws ApiException {
        String q = null;
        Integer limit = null;
        Integer offset = null;
        String rating = null;
        String lang = null;
        StickersFindAnimatedStickersResponse response = api.findAnimatedStickers(q)
                .limit(limit)
                .offset(offset)
                .rating(rating)
                .lang(lang)
                .execute();
        // TODO: test validations
    }

    /**
     * Random Sticker
     *
     * Returns a random GIF, limited by tag. Excluding the tag parameter will return a random GIF from the GIPHY catalog. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRandomTest() throws ApiException {
        String tag = null;
        String rating = null;
        StickersGetRandomResponse response = api.getRandom()
                .tag(tag)
                .rating(rating)
                .execute();
        // TODO: test validations
    }

    /**
     * Trending Stickers
     *
     * Fetch Stickers currently trending online. Hand curated by the GIPHY editorial team. Returns 25 results by default. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTrendingTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String rating = null;
        StickersGetTrendingResponse response = api.getTrending()
                .limit(limit)
                .offset(offset)
                .rating(rating)
                .execute();
        // TODO: test validations
    }

    /**
     * Translate phrase to Sticker
     *
     * The translate API draws on search, but uses the GIPHY &#x60;special sauce&#x60; to handle translating from one vocabulary to another. In this case, words and phrases to GIFs. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translatePhraseToStickerTest() throws ApiException {
        String s = null;
        StickersTranslatePhraseToStickerResponse response = api.translatePhraseToSticker(s)
                .execute();
        // TODO: test validations
    }

}
