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
 * The User Object contains information about the user associated with a GIF and URLs to assets such as that user&#39;s avatar image, profile, and more.
 */
@ApiModel(description = "The User Object contains information about the user associated with a GIF and URLs to assets such as that user's avatar image, profile, and more.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class User {
  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_BANNER_URL = "banner_url";
  @SerializedName(SERIALIZED_NAME_BANNER_URL)
  private String bannerUrl;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_TWITTER = "twitter";
  @SerializedName(SERIALIZED_NAME_TWITTER)
  private String twitter;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public User() {
  }

  public User avatarUrl(String avatarUrl) {
    
    
    
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL for this user&#39;s avatar image.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://media1.giphy.com/avatars/election2016/XwYrZi5H87o6.gif", value = "The URL for this user's avatar image.")

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    
    
    
    this.avatarUrl = avatarUrl;
  }


  public User bannerUrl(String bannerUrl) {
    
    
    
    
    this.bannerUrl = bannerUrl;
    return this;
  }

   /**
   * The URL for the banner image that appears atop this user&#39;s profile page.
   * @return bannerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://media4.giphy.com/avatars/cheezburger/XkuejOhoGLE6.jpg", value = "The URL for the banner image that appears atop this user's profile page.")

  public String getBannerUrl() {
    return bannerUrl;
  }


  public void setBannerUrl(String bannerUrl) {
    
    
    
    this.bannerUrl = bannerUrl;
  }


  public User displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name associated with this user (contains formatting the base username might not).
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JoeCool4000", value = "The display name associated with this user (contains formatting the base username might not).")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public User profileUrl(String profileUrl) {
    
    
    
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * The URL for this user&#39;s profile.
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://giphy.com/cheezburger/", value = "The URL for this user's profile.")

  public String getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(String profileUrl) {
    
    
    
    this.profileUrl = profileUrl;
  }


  public User twitter(String twitter) {
    
    
    
    
    this.twitter = twitter;
    return this;
  }

   /**
   * The Twitter username associated with this user, if applicable.
   * @return twitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "@joecool4000", value = "The Twitter username associated with this user, if applicable.")

  public String getTwitter() {
    return twitter;
  }


  public void setTwitter(String twitter) {
    
    
    
    this.twitter = twitter;
  }


  public User username(String username) {
    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * The username associated with this user.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "joecool4000", value = "The username associated with this user.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    
    
    this.username = username;
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
   * @return the User instance itself
   */
  public User putAdditionalProperty(String key, Object value) {
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
    User user = (User) o;
    return Objects.equals(this.avatarUrl, user.avatarUrl) &&
        Objects.equals(this.bannerUrl, user.bannerUrl) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.profileUrl, user.profileUrl) &&
        Objects.equals(this.twitter, user.twitter) &&
        Objects.equals(this.username, user.username)&&
        Objects.equals(this.additionalProperties, user.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, bannerUrl, displayName, profileUrl, twitter, username, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    bannerUrl: ").append(toIndentedString(bannerUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("avatar_url");
    openapiFields.add("banner_url");
    openapiFields.add("display_name");
    openapiFields.add("profile_url");
    openapiFields.add("twitter");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to User
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("avatar_url") != null && !jsonObj.get("avatar_url").isJsonNull()) && !jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
      if ((jsonObj.get("banner_url") != null && !jsonObj.get("banner_url").isJsonNull()) && !jsonObj.get("banner_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banner_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banner_url").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("profile_url") != null && !jsonObj.get("profile_url").isJsonNull()) && !jsonObj.get("profile_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_url").toString()));
      }
      if ((jsonObj.get("twitter") != null && !jsonObj.get("twitter").isJsonNull()) && !jsonObj.get("twitter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitter").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
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
           public User read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             User instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
