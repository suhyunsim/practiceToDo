package com.codesquad.practiceToDo.common.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PracticeJwt {
    public static String createToken() {
        String key = "PoogleSecretKeyJWTToGetSignature";

        Map<String, Object> headers = new HashMap<>();
        headers.put("typ", "JWT");
        headers.put("alg", "HS256");

        Map<String, Object> payloads = new HashMap<>();
        Long expiredTime = 1000 * 60l;
        Date now = new Date();
        now.setTime(now.getTime() + expiredTime);
        payloads.put("exp", now);
        payloads.put("data", "hello");

        String jwt = Jwts.builder()
                .setHeader(headers)
                .setClaims(payloads)
                .signWith(SignatureAlgorithm.HS256, key.getBytes())
                .compact();
        return jwt;
    }

    public static void getToken(String jwtTokenString) throws InterruptedException {
        Claims claims = Jwts.parser()
                .setSigningKey("PoogleSecretKeyJWTToGetSignature".getBytes())
                .parseClaimsJws(jwtTokenString)
                .getBody();

        Date expiration = claims.get("exp", Date.class);
        System.out.println(expiration);
        String data = claims.get("data", String.class);
        System.out.println(data);
    }

    public static void main(String[] args) {
        System.out.println(createToken());
    }
}
