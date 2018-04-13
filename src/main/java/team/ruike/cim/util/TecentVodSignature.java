package team.ruike.cim.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

@SuppressWarnings("restriction")
@Component
public class TecentVodSignature {

    @Value("${com.qcloud.config.api.secretid}")
    private String secretId;
    @Value("${com.qcloud.config.api.secretkey}")
    private String secretKey;
    private long currentTime;
    private int random;
    private int signValidDuration;

    private static final String HMAC_ALGORITHM = "HmacSHA1";
    private static final String CONTENT_CHARSET = "UTF-8";

    public static byte[] byteMerger(byte[] byte1, byte[] byte2) {
        byte[] byte3 = new byte[byte1.length + byte2.length];
        System.arraycopy(byte1, 0, byte3, 0, byte1.length);
        System.arraycopy(byte2, 0, byte3, byte1.length, byte2.length);
        return byte3;
    }

    public String getUploadSignature() {
        String strSign = "";
        String contextStr = "";

        currentTime = System.currentTimeMillis() / 1000;
        random = new Random().nextInt(Integer.MAX_VALUE);
        signValidDuration = 3600 * 24 * 2;
        System.out.println("getUploadSignature, sid:" + secretId);
        try {
            long endTime = (currentTime + signValidDuration);
            contextStr += "secretId=" + java.net.URLEncoder.encode(secretId, "utf8");
            contextStr += "&currentTimeStamp=" + currentTime;
            contextStr += "&expireTime=" + endTime;
            contextStr += "&random=" + random;
            contextStr += "&procedure=QCVB_SimpleProcessFile(1,0,0,0)";

            Mac mac = Mac.getInstance(HMAC_ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(this.secretKey.getBytes(CONTENT_CHARSET), mac.getAlgorithm());
            mac.init(secretKey);

            byte[] hash = mac.doFinal(contextStr.getBytes(CONTENT_CHARSET));
            byte[] sigBuf = byteMerger(hash, contextStr.getBytes("utf8"));
            strSign = new String(new BASE64Encoder().encode(sigBuf).getBytes());
            strSign = strSign.replace(" ", "").replace("\n", "").replace("\r", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strSign;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public void setSignValidDuration(int signValidDuration) {
        this.signValidDuration = signValidDuration;
    }
}