# GifsApi

All URIs are relative to *https://api.giphy.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](GifsApi.md#getById) | **GET** /gifs/{gifId} | Get GIF by Id |
| [**getByIds**](GifsApi.md#getByIds) | **GET** /gifs | Get GIFs by ID |
| [**getRandomGif**](GifsApi.md#getRandomGif) | **GET** /gifs/random | Random GIF |
| [**getTrendingGifs**](GifsApi.md#getTrendingGifs) | **GET** /gifs/trending | Trending GIFs |
| [**searchGifs**](GifsApi.md#searchGifs) | **GET** /gifs/search | Search GIFs |
| [**translatePhraseGif**](GifsApi.md#translatePhraseGif) | **GET** /gifs/translate | Translate phrase to GIF |


<a name="getById"></a>
# **getById**
> GifsGetByIdResponse getById(gifId).execute();

Get GIF by Id

Returns a GIF given that GIF&#39;s unique ID 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GifsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.giphy.com/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    Giphy client = new Giphy(configuration);
    Integer gifId = 56; // Filters results by specified GIF ID.
    try {
      GifsGetByIdResponse result = client
              .gifs
              .getById(gifId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GifsGetByIdResponse> response = client
              .gifs
              .getById(gifId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#getById");
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
| **gifId** | **Integer**| Filters results by specified GIF ID. | |

### Return type

[**GifsGetByIdResponse**](GifsGetByIdResponse.md)

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

<a name="getByIds"></a>
# **getByIds**
> GifsGetByIdsResponse getByIds().ids(ids).execute();

Get GIFs by ID

A multiget version of the get GIF by ID endpoint. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GifsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.giphy.com/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    Giphy client = new Giphy(configuration);
    String ids = "ids_example"; // Filters results by specified GIF IDs, separated by commas.
    try {
      GifsGetByIdsResponse result = client
              .gifs
              .getByIds()
              .ids(ids)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#getByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GifsGetByIdsResponse> response = client
              .gifs
              .getByIds()
              .ids(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#getByIds");
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
| **ids** | **String**| Filters results by specified GIF IDs, separated by commas. | [optional] |

### Return type

[**GifsGetByIdsResponse**](GifsGetByIdsResponse.md)

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

<a name="getRandomGif"></a>
# **getRandomGif**
> GifsGetRandomGifResponse getRandomGif().tag(tag).rating(rating).execute();

Random GIF

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
import com.konfigthis.client.api.GifsApi;
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
      GifsGetRandomGifResponse result = client
              .gifs
              .getRandomGif()
              .tag(tag)
              .rating(rating)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#getRandomGif");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GifsGetRandomGifResponse> response = client
              .gifs
              .getRandomGif()
              .tag(tag)
              .rating(rating)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#getRandomGif");
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

[**GifsGetRandomGifResponse**](GifsGetRandomGifResponse.md)

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

<a name="getTrendingGifs"></a>
# **getTrendingGifs**
> GifsGetTrendingGifsResponse getTrendingGifs().limit(limit).offset(offset).rating(rating).execute();

Trending GIFs

Fetch GIFs currently trending online. Hand curated by the GIPHY editorial team.  The data returned mirrors the GIFs showcased on the GIPHY homepage. Returns 25 results by default. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GifsApi;
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
      GifsGetTrendingGifsResponse result = client
              .gifs
              .getTrendingGifs()
              .limit(limit)
              .offset(offset)
              .rating(rating)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getPagination());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#getTrendingGifs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GifsGetTrendingGifsResponse> response = client
              .gifs
              .getTrendingGifs()
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
      System.err.println("Exception when calling GifsApi#getTrendingGifs");
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

[**GifsGetTrendingGifsResponse**](GifsGetTrendingGifsResponse.md)

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

<a name="searchGifs"></a>
# **searchGifs**
> GifsSearchGifsResponse searchGifs(q).limit(limit).offset(offset).rating(rating).lang(lang).execute();

Search GIFs

Search all GIPHY GIFs for a word or phrase. Punctuation will be stripped and ignored.  Use a plus or url encode for phrases. Example paul+rudd, ryan+gosling or american+psycho. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GifsApi;
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
      GifsSearchGifsResponse result = client
              .gifs
              .searchGifs(q)
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
      System.err.println("Exception when calling GifsApi#searchGifs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GifsSearchGifsResponse> response = client
              .gifs
              .searchGifs(q)
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
      System.err.println("Exception when calling GifsApi#searchGifs");
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

[**GifsSearchGifsResponse**](GifsSearchGifsResponse.md)

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

<a name="translatePhraseGif"></a>
# **translatePhraseGif**
> GifsTranslatePhraseGifResponse translatePhraseGif(s).execute();

Translate phrase to GIF

The translate API draws on search, but uses the GIPHY &#x60;special sauce&#x60; to handle translating from one vocabulary to another. In this case, words and phrases to GIF 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Giphy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GifsApi;
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
      GifsTranslatePhraseGifResponse result = client
              .gifs
              .translatePhraseGif(s)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#translatePhraseGif");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GifsTranslatePhraseGifResponse> response = client
              .gifs
              .translatePhraseGif(s)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GifsApi#translatePhraseGif");
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

[**GifsTranslatePhraseGifResponse**](GifsTranslatePhraseGifResponse.md)

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

