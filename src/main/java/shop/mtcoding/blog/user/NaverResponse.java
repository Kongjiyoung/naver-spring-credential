package shop.mtcoding.blog.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


public class NaverResponse {

    @Data // getter, setter
    public static class TokenDTO {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private Integer expiresIn;
        @JsonProperty("error")
        private String error;
        @JsonProperty("error_description")
        private String errorDescription;

    }

    @Data
    public static class NaverUserDTO {
        private String resultcode;
        private String message;
        private Response response;

        @Data
        class Response {
            private String id;
            private String name;
            private String email;
        }
    }


}
