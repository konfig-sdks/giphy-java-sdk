# StickersApi

All URIs are relative to *https://api.giphy.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findAnimatedStickers**](StickersApi.md#findAnimatedStickers) | **GET** /stickers/search | Search Stickers |
| [**getRandom**](StickersApi.md#getRandom) | **GET** /stickers/random | Random Sticker |
| [**getTrending**](StickersApi.md#getTrending) | **GET** /stickers/trending | Trending Stickers |
| [**translatePhraseToSticker**](StickersApi.md#translatePhraseToSticker) | **GET** /stickers/translate | Translate phrase to Sticker |


<a name="findAnimatedStickers"></a>
# **findAnimatedStickers**
> StickersFindAnimatedStickersResponse findAnimatedStickers(q).limit(limit).offset(offset).rating(rating).lang(lang).execute();

Search Stickers

Replicates the functionality and requirements of the classic GIPHY search, but returns animated stickers rather than GIFs. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StickersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.giphy.com/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    Giphy client = new Giphy(configuration);
    String q = "q_example"; // Search query term or prhase.
    Integer limit = 25; // The maximum number of records to return.
    Integer offset = 0; // An optional results offset.
    String rating = "rating_example"; // Filters results by specified rating.
    String lang = "lang_example"; // Specify default language for regional content; use a 2-letter ISO 639-1 language code.
    try {
      StickersFindAnimatedStickersResponse result = client
              .stickers
              .findAnimatedStickers(q)
              .limit(limit)
              .offset(offset)
              .rating(rating)
              .lang(lang)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#findAnimatedStickers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StickersFindAnimatedStickersResponse> response = client
              .stickers
              .findAnimatedStickers(q)
              .limit(limit)
              .offset(offset)
              .rating(rating)
              .lang(lang)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#findAnimatedStickers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **q** | **String**| Search query term or prhase. | |
| **limit** | **Integer**| The maximum number of records to return. | [optional] [default to 25] |
| **offset** | **Integer**| An optional results offset. | [optional] [default to 0] |
| **rating** | **String**| Filters results by specified rating. | [optional] |
| **lang** | **String**| Specify default language for regional content; use a 2-letter ISO 639-1 language code. | [optional] |

### Return type

[**StickersFindAnimatedStickersResponse**](StickersFindAnimatedStickersResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search results |  -  |
| **400** | Your request was formatted incorrectly or missing required parameters. |  -  |
| **403** | You weren&#39;t authorized to make your request; most likely this indicates an issue with your API Key. |  -  |
| **404** | The particular GIF you are requesting was not found. This occurs, for example, if you request a GIF by an id that does not exist. |  -  |
| **429** | Your API Key is making too many requests. Read about [requesting a Production Key](https://developers.giphy.com/docs/#access) to upgrade your API Key rate limits.  |  -  |

<a name="getRandom"></a>
# **getRandom**
> StickersGetRandomResponse getRandom().tag(tag).rating(rating).execute();

Random Sticker

Returns a random GIF, limited by tag. Excluding the tag parameter will return a random GIF from the GIPHY catalog. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StickersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.giphy.com/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    Giphy client = new Giphy(configuration);
    String tag = "tag_example"; // Filters results by specified tag.
    String rating = "rating_example"; // Filters results by specified rating.
    try {
      StickersGetRandomResponse result = client
              .stickers
              .getRandom()
              .tag(tag)
              .rating(rating)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#getRandom");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StickersGetRandomResponse> response = client
              .stickers
              .getRandom()
              .tag(tag)
              .rating(rating)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#getRandom");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tag** | **String**| Filters results by specified tag. | [optional] |
| **rating** | **String**| Filters results by specified rating. | [optional] |

### Return type

[**StickersGetRandomResponse**](StickersGetRandomResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Your request was formatted incorrectly or missing required parameters. |  -  |
| **403** | You weren&#39;t authorized to make your request; most likely this indicates an issue with your API Key. |  -  |
| **404** | The particular GIF you are requesting was not found. This occurs, for example, if you request a GIF by an id that does not exist. |  -  |
| **429** | Your API Key is making too many requests. Read about [requesting a Production Key](https://developers.giphy.com/docs/#access) to upgrade your API Key rate limits.  |  -  |

<a name="getTrending"></a>
# **getTrending**
> StickersGetTrendingResponse getTrending().limit(limit).offset(offset).rating(rating).execute();

Trending Stickers

Fetch Stickers currently trending online. Hand curated by the GIPHY editorial team. Returns 25 results by default. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StickersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.giphy.com/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    Giphy client = new Giphy(configuration);
    Integer limit = 25; // The maximum number of records to return.
    Integer offset = 0; // An optional results offset.
    String rating = "rating_example"; // Filters results by specified rating.
    try {
      StickersGetTrendingResponse result = client
              .stickers
              .getTrending()
              .limit(limit)
              .offset(offset)
              .rating(rating)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#getTrending");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StickersGetTrendingResponse> response = client
              .stickers
              .getTrending()
              .limit(limit)
              .offset(offset)
              .rating(rating)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#getTrending");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of records to return. | [optional] [default to 25] |
| **offset** | **Integer**| An optional results offset. | [optional] [default to 0] |
| **rating** | **String**| Filters results by specified rating. | [optional] |

### Return type

[**StickersGetTrendingResponse**](StickersGetTrendingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Your request was formatted incorrectly or missing required parameters. |  -  |
| **403** | You weren&#39;t authorized to make your request; most likely this indicates an issue with your API Key. |  -  |
| **404** | The particular GIF you are requesting was not found. This occurs, for example, if you request a GIF by an id that does not exist. |  -  |
| **429** | Your API Key is making too many requests. Read about [requesting a Production Key](https://developers.giphy.com/docs/#access) to upgrade your API Key rate limits.  |  -  |

<a name="translatePhraseToSticker"></a>
# **translatePhraseToSticker**
> StickersTranslatePhraseToStickerResponse translatePhraseToSticker(s).execute();

Translate phrase to Sticker

The translate API draws on search, but uses the GIPHY &#x60;special sauce&#x60; to handle translating from one vocabulary to another. In this case, words and phrases to GIFs. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StickersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.giphy.com/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    Giphy client = new Giphy(configuration);
    String s = "s_example"; // Search term.
    try {
      StickersTranslatePhraseToStickerResponse result = client
              .stickers
              .translatePhraseToSticker(s)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#translatePhraseToSticker");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StickersTranslatePhraseToStickerResponse> response = client
              .stickers
              .translatePhraseToSticker(s)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StickersApi#translatePhraseToSticker");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **s** | **String**| Search term. | |

### Return type

[**StickersTranslatePhraseToStickerResponse**](StickersTranslatePhraseToStickerResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Your request was formatted incorrectly or missing required parameters. |  -  |
| **403** | You weren&#39;t authorized to make your request; most likely this indicates an issue with your API Key. |  -  |
| **404** | The particular GIF you are requesting was not found. This occurs, for example, if you request a GIF by an id that does not exist. |  -  |
| **429** | Your API Key is making too many requests. Read about [requesting a Production Key](https://developers.giphy.com/docs/#access) to upgrade your API Key rate limits.  |  -  |

