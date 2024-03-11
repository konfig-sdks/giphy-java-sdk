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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * GifImagesFixedHeightStill
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GifImagesFixedHeightStill {
  public static final String SERIALIZED_NAME_FRAMES = "frames";
  @SerializedName(SERIALIZED_NAME_FRAMES)
  private String frames;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_MP4 = "mp4";
  @SerializedName(SERIALIZED_NAME_MP4)
  private String mp4;

  public static final String SERIALIZED_NAME_MP4_SIZE = "mp4_size";
  @SerializedName(SERIALIZED_NAME_MP4_SIZE)
  private String mp4Size;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WEBP = "webp";
  @SerializedName(SERIALIZED_NAME_WEBP)
  private String webp;

  public static final String SERIALIZED_NAME_WEBP_SIZE = "webp_size";
  @SerializedName(SERIALIZED_NAME_WEBP_SIZE)
  private String webpSize;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private String width;

  public GifImagesFixedHeightStill() {
  }

  public GifImagesFixedHeightStill frames(String frames) {
    
    
    
    
    this.frames = frames;
    return this;
  }

   /**
   * The number of frames in this GIF.
   * @return frames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "The number of frames in this GIF.")

  public String getFrames() {
    return frames;
  }


  public void setFrames(String frames) {
    
    
    
    this.frames = frames;
  }


  public GifImagesFixedHeightStill height(String height) {
    
    
    
    
    this.height = height;
    return this;
  }

   /**
   * The height of this GIF in pixels.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The height of this GIF in pixels.")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    
    
    
    this.height = height;
  }


  public GifImagesFixedHeightStill mp4(String mp4) {
    
    
    
    
    this.mp4 = mp4;
    return this;
  }

   /**
   * The URL for this GIF in .MP4 format.
   * @return mp4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://media1.giphy.com/media/cZ7rmKfFYOvYI/giphy.mp4", value = "The URL for this GIF in .MP4 format.")

  public String getMp4() {
    return mp4;
  }


  public void setMp4(String mp4) {
    
    
    
    this.mp4 = mp4;
  }


  public GifImagesFixedHeightStill mp4Size(String mp4Size) {
    
    
    
    
    this.mp4Size = mp4Size;
    return this;
  }

   /**
   * The size in bytes of the .MP4 file corresponding to this GIF.
   * @return mp4Size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25123", value = "The size in bytes of the .MP4 file corresponding to this GIF.")

  public String getMp4Size() {
    return mp4Size;
  }


  public void setMp4Size(String mp4Size) {
    
    
    
    this.mp4Size = mp4Size;
  }


  public GifImagesFixedHeightStill size(String size) {
    
    
    
    
    this.size = size;
    return this;
  }

   /**
   * The size of this GIF in bytes.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32381", value = "The size of this GIF in bytes.")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    
    
    
    this.size = size;
  }


  public GifImagesFixedHeightStill url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The publicly-accessible direct URL for this GIF.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://media1.giphy.com/media/cZ7rmKfFYOvYI/200.gif", value = "The publicly-accessible direct URL for this GIF.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public GifImagesFixedHeightStill webp(String webp) {
    
    
    
    
    this.webp = webp;
    return this;
  }

   /**
   * The URL for this GIF in .webp format.
   * @return webp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://media1.giphy.com/media/cZ7rmKfFYOvYI/giphy.webp", value = "The URL for this GIF in .webp format.")

  public String getWebp() {
    return webp;
  }


  public void setWebp(String webp) {
    
    
    
    this.webp = webp;
  }


  public GifImagesFixedHeightStill webpSize(String webpSize) {
    
    
    
    
    this.webpSize = webpSize;
    return this;
  }

   /**
   * The size in bytes of the .webp file corresponding to this GIF.
   * @return webpSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12321", value = "The size in bytes of the .webp file corresponding to this GIF.")

  public String getWebpSize() {
    return webpSize;
  }


  public void setWebpSize(String webpSize) {
    
    
    
    this.webpSize = webpSize;
  }


  public GifImagesFixedHeightStill width(String width) {
    
    
    
    
    this.width = width;
    return this;
  }

   /**
   * The width of this GIF in pixels.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "320", value = "The width of this GIF in pixels.")

  public String getWidth() {
    return width;
  }


  public void setWidth(String width) {
    
    
    
    this.width = width;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the GifImagesFixedHeightStill instance itself
   */
  public GifImagesFixedHeightStill putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GifImagesFixedHeightStill gifImagesFixedHeightStill = (GifImagesFixedHeightStill) o;
    return Objects.equals(this.frames, gifImagesFixedHeightStill.frames) &&
        Objects.equals(this.height, gifImagesFixedHeightStill.height) &&
        Objects.equals(this.mp4, gifImagesFixedHeightStill.mp4) &&
        Objects.equals(this.mp4Size, gifImagesFixedHeightStill.mp4Size) &&
        Objects.equals(this.size, gifImagesFixedHeightStill.size) &&
        Objects.equals(this.url, gifImagesFixedHeightStill.url) &&
        Objects.equals(this.webp, gifImagesFixedHeightStill.webp) &&
        Objects.equals(this.webpSize, gifImagesFixedHeightStill.webpSize) &&
        Objects.equals(this.width, gifImagesFixedHeightStill.width)&&
        Objects.equals(this.additionalProperties, gifImagesFixedHeightStill.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frames, height, mp4, mp4Size, size, url, webp, webpSize, width, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GifImagesFixedHeightStill {\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    mp4: ").append(toIndentedString(mp4)).append("\n");
    sb.append("    mp4Size: ").append(toIndentedString(mp4Size)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    webp: ").append(toIndentedString(webp)).append("\n");
    sb.append("    webpSize: ").append(toIndentedString(webpSize)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("frames");
    openapiFields.add("height");
    openapiFields.add("mp4");
    openapiFields.add("mp4_size");
    openapiFields.add("size");
    openapiFields.add("url");
    openapiFields.add("webp");
    openapiFields.add("webp_size");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GifImagesFixedHeightStill
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GifImagesFixedHeightStill.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GifImagesFixedHeightStill is not found in the empty JSON string", GifImagesFixedHeightStill.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("frames") != null && !jsonObj.get("frames").isJsonNull()) && !jsonObj.get("frames").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frames` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frames").toString()));
      }
      if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull()) && !jsonObj.get("height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
      if ((jsonObj.get("mp4") != null && !jsonObj.get("mp4").isJsonNull()) && !jsonObj.get("mp4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mp4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mp4").toString()));
      }
      if ((jsonObj.get("mp4_size") != null && !jsonObj.get("mp4_size").isJsonNull()) && !jsonObj.get("mp4_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mp4_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mp4_size").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("webp") != null && !jsonObj.get("webp").isJsonNull()) && !jsonObj.get("webp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webp").toString()));
      }
      if ((jsonObj.get("webp_size") != null && !jsonObj.get("webp_size").isJsonNull()) && !jsonObj.get("webp_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webp_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webp_size").toString()));
      }
      if ((jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull()) && !jsonObj.get("width").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `width` to be a primitive type in the JSON string but got `%s`", jsonObj.get("width").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GifImagesFixedHeightStill.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GifImagesFixedHeightStill' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GifImagesFixedHeightStill> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GifImagesFixedHeightStill.class));

       return (TypeAdapter<T>) new TypeAdapter<GifImagesFixedHeightStill>() {
           @Override
           public void write(JsonWriter out, GifImagesFixedHeightStill value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GifImagesFixedHeightStill read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GifImagesFixedHeightStill instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GifImagesFixedHeightStill given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GifImagesFixedHeightStill
  * @throws IOException if the JSON string is invalid with respect to GifImagesFixedHeightStill
  */
  public static GifImagesFixedHeightStill fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GifImagesFixedHeightStill.class);
  }

 /**
  * Convert an instance of GifImagesFixedHeightStill to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

