<div align="center">

[![Visit Giphy](./header.png)](https://giphy.com)

# [Giphy](https://giphy.com)

Giphy API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Giphy&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>giphy-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:giphy-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/giphy-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.giphy.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GifsApi* | [**getById**](docs/GifsApi.md#getById) | **GET** /gifs/{gifId} | Get GIF by Id
*GifsApi* | [**getByIds**](docs/GifsApi.md#getByIds) | **GET** /gifs | Get GIFs by ID
*GifsApi* | [**getRandomGif**](docs/GifsApi.md#getRandomGif) | **GET** /gifs/random | Random GIF
*GifsApi* | [**getTrendingGifs**](docs/GifsApi.md#getTrendingGifs) | **GET** /gifs/trending | Trending GIFs
*GifsApi* | [**searchGifs**](docs/GifsApi.md#searchGifs) | **GET** /gifs/search | Search GIFs
*GifsApi* | [**translatePhraseGif**](docs/GifsApi.md#translatePhraseGif) | **GET** /gifs/translate | Translate phrase to GIF
*StickersApi* | [**findAnimatedStickers**](docs/StickersApi.md#findAnimatedStickers) | **GET** /stickers/search | Search Stickers
*StickersApi* | [**getRandom**](docs/StickersApi.md#getRandom) | **GET** /stickers/random | Random Sticker
*StickersApi* | [**getTrending**](docs/StickersApi.md#getTrending) | **GET** /stickers/trending | Trending Stickers
*StickersApi* | [**translatePhraseToSticker**](docs/StickersApi.md#translatePhraseToSticker) | **GET** /stickers/translate | Translate phrase to Sticker


## Documentation for Models

 - [Gif](docs/Gif.md)
 - [GifImages](docs/GifImages.md)
 - [GifImagesDownsized](docs/GifImagesDownsized.md)
 - [GifImagesDownsizedLarge](docs/GifImagesDownsizedLarge.md)
 - [GifImagesDownsizedMedium](docs/GifImagesDownsizedMedium.md)
 - [GifImagesDownsizedSmall](docs/GifImagesDownsizedSmall.md)
 - [GifImagesDownsizedStill](docs/GifImagesDownsizedStill.md)
 - [GifImagesFixedHeight](docs/GifImagesFixedHeight.md)
 - [GifImagesFixedHeightDownsampled](docs/GifImagesFixedHeightDownsampled.md)
 - [GifImagesFixedHeightSmall](docs/GifImagesFixedHeightSmall.md)
 - [GifImagesFixedHeightSmallStill](docs/GifImagesFixedHeightSmallStill.md)
 - [GifImagesFixedHeightStill](docs/GifImagesFixedHeightStill.md)
 - [GifImagesFixedWidth](docs/GifImagesFixedWidth.md)
 - [GifImagesFixedWidthDownsampled](docs/GifImagesFixedWidthDownsampled.md)
 - [GifImagesFixedWidthSmall](docs/GifImagesFixedWidthSmall.md)
 - [GifImagesFixedWidthSmallStill](docs/GifImagesFixedWidthSmallStill.md)
 - [GifImagesFixedWidthStill](docs/GifImagesFixedWidthStill.md)
 - [GifImagesLooping](docs/GifImagesLooping.md)
 - [GifImagesOriginal](docs/GifImagesOriginal.md)
 - [GifImagesOriginalStill](docs/GifImagesOriginalStill.md)
 - [GifImagesPreview](docs/GifImagesPreview.md)
 - [GifImagesPreviewGif](docs/GifImagesPreviewGif.md)
 - [GifsGetByIdResponse](docs/GifsGetByIdResponse.md)
 - [GifsGetByIdsResponse](docs/GifsGetByIdsResponse.md)
 - [GifsGetRandomGifResponse](docs/GifsGetRandomGifResponse.md)
 - [GifsGetTrendingGifsResponse](docs/GifsGetTrendingGifsResponse.md)
 - [GifsSearchGifsResponse](docs/GifsSearchGifsResponse.md)
 - [GifsTranslatePhraseGifResponse](docs/GifsTranslatePhraseGifResponse.md)
 - [Image](docs/Image.md)
 - [Meta](docs/Meta.md)
 - [Pagination](docs/Pagination.md)
 - [StickersFindAnimatedStickersResponse](docs/StickersFindAnimatedStickersResponse.md)
 - [StickersGetRandomResponse](docs/StickersGetRandomResponse.md)
 - [StickersGetTrendingResponse](docs/StickersGetTrendingResponse.md)
 - [StickersTranslatePhraseToStickerResponse](docs/StickersTranslatePhraseToStickerResponse.md)
 - [User](docs/User.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
