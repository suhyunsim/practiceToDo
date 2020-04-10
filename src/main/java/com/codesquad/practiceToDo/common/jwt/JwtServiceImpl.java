package com.codesquad.practiceToDo.common.jwt;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JwtServiceImpl {

    private static final String headerString = "PoogleSecretKeyJWTToGetSignature";

    private Logger logger = LoggerFactory.getLogger(JwtServiceImpl.class);

    public boolean checkJwt(String jwt) throws Exception {
        try {
            Claims claims = Jwts.parser().setSigningKey(headerString)
                    .parseClaimsJws(jwt).getBody();
            logger.info("exp Time: " + claims.getExpiration());
            return true;
        } catch (ExpiredJwtException exception) {
            logger.info("토큰 만료");
            return false;
        } catch (JwtException exception) {
            logger.info("토큰 변조");
            return false;
        }
    }
}
