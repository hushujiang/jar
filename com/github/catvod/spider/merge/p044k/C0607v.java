package com.github.catvod.spider.merge.p044k;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p048m.C0620d;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.v */
/* loaded from: classes.dex */
public final class C0607v extends Dora {

    /* renamed from: c */
    private static String f1159c;

    /* renamed from: b */
    private JSONObject f1160b;

    static {
        String m897d = atm.m897d("B1E2A1D397FDB1D2A1EF97C2B1D6A1D397CEB1E2A1E397F8B1D2A1ED97C3B1D2A1DD97C0B1D8A1E397C2B1DBA1EE97C4B1E2A1D397CFB1D1A1EF97CFB1D2A1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 540) ^ 683394282) {
                case -1460457505:
                    return;
                case -1105121863:
                    f1159c = C0052e.m1418a(new byte[]{33, -37, -120, 48, 17, -79, 74, -57, 33, -60, -47, 33, 18, -30, 72, -117, 47, -127, -123, 49, 9, -66, 83, -35, 112, -127, -97, 47, 15, -92}, new byte[]{73, -81, -4, 64, 98, -117, 101, -24});
                    m897d = atm.m897d("B1DFA1D097FEB1E2A1D597C3B1E5A1DD97C0B1D1A1D497C1B1EDA1E297C7B1D2A1ED97C7B1E3A1EF97C3B1D8A1D097C2B1DFA1EE97C7B1D6A1EF");
                    break;
            }
        }
    }

    /* renamed from: a */
    public static String m251a(String str, String str2, String str3) {
        try {
            byte[] bytes = str3.getBytes();
            byte[] bytes2 = str.getBytes();
            byte[] bytes3 = str2.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, C0052e.m1418a(new byte[]{27, -41, -42}, new byte[]{90, -110, -123, 15, 106, -115, -40, 6}));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes3);
            Cipher cipher = Cipher.getInstance(C0052e.m1418a(new byte[]{-104, -59, -49, -111, -57, -122, 55, -61, -119, -53, -33, -19, -79, -108, 21, -120, -67, -23, -14, -39}, new byte[]{-39, Byte.MIN_VALUE, -100, -66, -124, -60, 116, -20}));
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return m246f(cipher.doFinal(bytes));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private HashMap<String, String> m250b() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1DBA1D097F8B1E3A1ED97C4B1E2A1DD97F8B1E1A1D497FCB1E2A1E397FFB1DE");
        while (true) {
            switch ((m897d.hashCode() ^ 661) ^ 1406308772) {
                case -1266615050:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E1A1EC97C4B1D8A1E997F0B1DCA1D497F9B1DEA1D997F8B1E1A1D597F8B1D2A1EE97F8B1DDA1E997C3B1D2A1EF97F4");
                    break;
                case 1214538393:
                    hashMap.put(C0052e.m1418a(new byte[]{15, 79, -20, 110, 83, -98, -47, 0, 52, 72}, new byte[]{90, 60, -119, 28, 126, -33, -74, 101}), C0052e.m1418a(new byte[]{-61, 26, -117, 51, -115, 118, -23, -85, -126, 64, -47, 105, -56}, new byte[]{-84, 113, -29, 71, -7, 6, -58, -104}));
                    m897d = atm.m897d("B1E2A1E997F8B1E0A1D997FEB1D1A1EC97FCB1DCA1D497C7B1D2A1E297F9B1D1A1DE97FEB1DDA1E397FFB1E2");
                    break;
                case 1271666591:
                    return hashMap;
                case 1383624795:
                    m897d = atm.m897d("B1DBA1E997FCB1E2A1ED97F9B1E1A1E997C4B1E2A1ED97C3B1DDA1D097FEB1DBA1DD97F4B1DCA1ED");
                    break;
                case 1635384843:
                    hashMap.put(C0052e.m1418a(new byte[]{-63, 52, -81, -80, -33, -46, -9, -40, -5, 40, -93}, new byte[]{-126, 88, -58, -43, -79, -90, -38, -116}), C0052e.m1418a(new byte[]{75, -126}, new byte[]{31, -44, 37, 18, 14, -60, 94, -59}));
                    m897d = atm.m897d("B1D6A1EF97F0B1E2A1DD97FFB1ECA1DD97F9B1DAA1ED97C0B1E2A1D597CEB1E6A1ED97F9B1DAA1D097C0");
                    break;
            }
        }
    }

    /* renamed from: c */
    public static int m249c(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            long currentTimeMillis = System.currentTimeMillis();
            httpURLConnection.connect();
            long currentTimeMillis2 = System.currentTimeMillis();
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append(C0052e.m1418a(new byte[]{4, -124, 48, -21, 123, -46, 98, 34, 121, -51, 103, -82}, new byte[]{80, -19, 93, -114, 91, -6, 15, 81}));
            long j = currentTimeMillis2 - currentTimeMillis;
            sb.append(j);
            printStream.println(sb.toString());
            PrintStream printStream2 = System.out;
            printStream2.println(C0052e.m1418a(new byte[]{-3, -2, 121, -58, -14, -59, -51, 31}, new byte[]{-83, -105, 23, -95, -46, -79, -94, 63}) + str + C0052e.m1418a(new byte[]{82, -61, -87, 77, -97, -10, -119, -61, 17, -47, -69, 77}, new byte[]{114, -76, -56, 62, -65, -123, -4, -96}));
            return (int) j;
        } catch (Exception e) {
            return 10000;
        }
    }

    /* renamed from: d */
    public static String m248d(String str, byte[] bArr) {
        byte[] bArr2;
        String str2 = null;
        byte[] bArr3 = new byte[16];
        byte[] decode = Base64.decode(C0052e.m1418a(new byte[]{103, -39, -80, 60, 50, 38, 44, 70, 24, -127, -70, 67, 124, 53, 0, 98, 111, -88, -97, 77, 28, 79, 104, 14}, new byte[]{46, -17, -5, 117, 68, 30, 85, 51}), 0);
        System.arraycopy(bArr, 8, bArr3, 0, 4);
        System.arraycopy(decode, 0, bArr3, 4, 4);
        System.arraycopy(bArr, 19, bArr3, 8, 4);
        System.arraycopy(decode, 7, bArr3, 12, 4);
        try {
            try {
                bArr2 = m245g(Base64.decode(str, 0), bArr3, 2);
            } catch (Exception e) {
                e.printStackTrace();
                bArr2 = null;
            }
            String m897d = atm.m897d("B1D2A1D197C1B1DFA1D297C4B1E2A1DE97CEB1E5A1DD97FAB1D8A1D097F8B1ECA1D097C3B1E3A1ED97F9B1E2");
            while (true) {
                switch (m897d.hashCode() ^ (-770867424)) {
                    case -2009059077:
                        str2 = new String(bArr2, C0052e.m1418a(new byte[]{-56, 24, -22, -111, 18}, new byte[]{-99, 76, -84, -68, 42, 50, 82, -73}));
                        return str2;
                    case -1700435947:
                        return null;
                    case 369433720:
                        if (bArr2 == null) {
                            m897d = atm.m897d("B1EDA1E297FFB1DCA1D397F9B1E2A1E297C7B1ECA1DE97C0B1DCA1D797C2B1DBA1EF97F4B1DD");
                            break;
                        } else {
                            m897d = atm.m897d("B1ECA1D397C0B1E1A1DD97C0B1EDA1EE97FFB1E5A1D297C0B1DDA1D297FCB1DDA1D397F0");
                            break;
                        }
                    case 1890260629:
                        m897d = atm.m897d("B1DEA1E997FDB1E1A1D797F0B1E2A1DE97C4B1E2A1D097F0B1E2A1ED97F9B1DDA1E397C0B1E3A1D797F3B1EDA1D197FFB1E5A1D497CEB1D2A1D397FF");
                        break;
                }
            }
        } catch (Exception e2) {
            return str2;
        }
    }

    /* renamed from: e */
    public static String m247e(String str) {
        byte[] bArr;
        String m1418a = C0052e.m1418a(new byte[]{-66, 99, 44, -6, -57, 84, 13, -55, -20, 99, 42, -10, -112, 85, 87, -55}, new byte[]{-40, 83, 30, -62, -95, 98, 53, -3});
        String m1418a2 = C0052e.m1418a(new byte[]{88, 33, -40, -35, 76, 92, -79, -109, 43, 80, -81, -84, 63, 45, -63, -101}, new byte[]{25, 99, -101, -103, 9, 26, -7, -94});
        byte[] bytes = (C0052e.m1418a(new byte[]{124, 30, -43, -9}, new byte[]{5, 111, -66, -52, 110, -103, -20, -121}) + (System.currentTimeMillis() / 1000)).getBytes();
        byte[] bytes2 = m1418a.getBytes();
        byte[] bytes3 = m1418a2.getBytes();
        String m1418a3 = C0052e.m1418a(new byte[]{-67, -81, -91, 52, -77, -112, -78, -73, -84, -95, -75, 72, -59, -126, -112, -4, -104, -125, -104, 124}, new byte[]{-4, -22, -10, 27, -16, -46, -15, -104});
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, C0052e.m1418a(new byte[]{21, 74, -68}, new byte[]{84, 15, -17, -29, 31, 67, -78, -127}));
            Cipher cipher = Cipher.getInstance(m1418a3);
            String m897d = atm.m897d("B1E3A1D197FCB1E2A1D197C2B1EDA1EA97C4B1E2A1D297C2B1E6A1D797F8B1E1A1E397C0B1E6A1EC97C1B1DCA1E997C3B1DFA1EA97CE");
            while (true) {
                switch (m897d.hashCode() ^ 1733398883) {
                    case -242726233:
                        if (bytes3 == null) {
                            m897d = atm.m897d("B1E5A1DD97F0B1EDA1E397F0B1DAA1D497FDB1E2A1D597C7B1E1A1E997CEB1E0");
                            break;
                        } else {
                            m897d = atm.m897d("B1DEA1EF97CFB1E6A1D397FEB1DAA1D197C4B1E2A1EA97C0B1E6A1D097FD");
                            break;
                        }
                    case 53288897:
                        cipher.init(1, secretKeySpec);
                        break;
                    case 652157803:
                        m897d = atm.m897d("B1E0A1D797F0B1E2A1D197FEB1D8A1EF97F8B1D2A1ED97C3B1D2A1EA97F0B1E6A1D297C0B1E5A1DE97C3B1DAA1D297FAB1DAA1D097FFB1E2");
                        break;
                    case 1616328536:
                        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes3));
                        break;
                }
            }
            bArr = cipher.doFinal(bytes);
        } catch (Exception e) {
            SpiderDebug.log(e);
            bArr = null;
        }
        String m246f = m246f(bArr);
        StringBuilder m635a = C0424a.m635a(str);
        m635a.append(C0052e.m1418a(new byte[]{-120, -56, 62, 31, 18}, new byte[]{-73, -79, 79, 116, 47, 111, -6, -39}));
        m635a.append(m246f);
        return m635a.toString();
    }

    /* renamed from: f */
    public static String m246f(byte[] bArr) {
        String m897d = atm.m897d("B1DFA1ED97FFB1E2A1D797FEB1DCA1ED97FFB1D6A1D997FAB1D6A1E297F0B1DBA1D4");
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        StringBuilder sb = null;
        while (true) {
            switch ((m897d.hashCode() ^ 469) ^ 1220990606) {
                case -2046612388:
                    i = i2 + 1;
                    m897d = atm.m897d("B1EDA1E997C2B1E3A1D397F3B1D6A1E997C1B1DBA1DD97FAB1D6A1DD97F3");
                    break;
                case -1613001033:
                    sb.append(str);
                    m897d = atm.m897d("B1DAA1DE97FEB1DCA1E397F9B1E2A1E297F8B1D1A1EF97C4B1E6A1ED97FFB1E0A1ED");
                    break;
                case -1422875713:
                    m897d = atm.m897d("B1DDA1D797C0B1E2A1E397C1B1D1A1D797C7B1E5A1D597F4B1D8A1D797FAB1DE");
                    break;
                case -1387049689:
                    int length = bArr.length;
                    m897d = atm.m897d("B1E3A1D797F9B1D6A1EF97FAB1DBA1EA97C2B1DAA1D597FCB1DCA1D597FF");
                    i3 = length;
                    break;
                case -862675144:
                    String m897d2 = atm.m897d("B1DAA1DE97C2B1D6A1D497F4B1D6A1EE97F0B1E5A1EC97F9B1E2A1D597FCB1D2A1ED97FFB1D2A1DE");
                    while (true) {
                        switch (m897d2.hashCode() ^ 168062936) {
                            case -1561564158:
                                m897d2 = atm.m897d("B1E3A1E397C4B1E2A1E997C7B1DFA1ED97FFB1DAA1DD97C0B1E5A1D397F9B1E2A1D397C3B1E0A1D797C4B1DAA1D497F8B1E1");
                            case -918372718:
                                m897d = atm.m897d("B1E0A1EA97C0B1E2A1EC97CEB1E1A1D097C0B1EDA1DD97F3B1D1A1D497FFB1E2A1D097C1B1E6A1EF97FEB1E2A1ED97FCB1E6A1E997FAB1D1A1E3");
                                continue;
                            case 504213405:
                                m897d = atm.m897d("B1E1A1EC97CEB1E2A1D397FFB1E2A1EE97C2B1E6A1ED97F0B1D8A1D497C4B1DAA1E9");
                                continue;
                            case 1220181612:
                                m897d2 = i2 < i3 ? atm.m897d("B1E0A1D597FFB1E2A1D597F0B1D6A1DE97CEB1DEA1DE97C0B1E3A1E397F4B1E6A1D997FEB1E2A1D597FEB1E6A1ED") : atm.m897d("B1D6A1D097C2B1D6A1EC97C3B1ECA1EE97CEB1E0A1E397FDB1D1A1D797C2B1EDA1D297F3B1E1A1EA97FAB1EDA1EC97F0B1D2A1EF97FDB1E2");
                        }
                    }
                    break;
                case -302990606:
                    m897d = atm.m897d("B1E1A1EF97FAB1DCA1E997FCB1E5A1D097FCB1DBA1E297C7B1E5A1E997C4");
                    break;
                case 45264243:
                    m897d = atm.m897d("B1E3A1ED97C3B1D1A1D197C3B1E1A1D297FAB1DBA1D097F3B1D6A1DD97C1B1E2A1EE97FDB1D2A1D097CEB1E3A1D097F4B1D2A1EF97CF");
                    break;
                case 423171662:
                    sb.append(0);
                    m897d = atm.m897d("B1DFA1D297F9B1E2A1D997CEB1DBA1ED97CEB1DBA1D997C2B1DEA1ED97CFB1DBA1D097C3B1E2A1E397F8B1ECA1D2");
                    break;
                case 463788505:
                    StringBuilder sb2 = new StringBuilder(bArr.length);
                    m897d = atm.m897d("B1DDA1E297FDB1DAA1EE97FEB1E2A1E297FDB1D6A1DD97FDB1E3A1E397FEB1DCA1ED97FAB1DDA1EC97FDB1E6A1DD97C0B1D8A1DD97C3");
                    sb = sb2;
                    break;
                case 584288344:
                    str = Integer.toHexString(bArr[i2] & 255);
                    m897d = atm.m897d("B1D1A1EC97F9B1E2A1EF97F4B1E2A1D397F4B1DBA1EE97CFB1D2A1D397CEB1DCA1ED97C2B1DDA1E297C0B1DAA1EA97FAB1E2A1D9");
                    break;
                case 1029853234:
                    m897d = atm.m897d("B1DDA1D797C0B1E2A1E397C1B1D1A1D797C7B1E5A1D597F4B1D8A1D797FAB1DE");
                    i2 = 0;
                    break;
                case 1554471631:
                    m897d = atm.m897d("B1E5A1D397F9B1ECA1ED97FFB1D1A1D797F9B1DEA1D997F0B1E2A1EC97F8B1E2A1D797F8B1DDA1D097FFB1D2A1E297CFB1ECA1ED97F8B1D1A1ED97C0");
                    i2 = i;
                    break;
                case 1979470574:
                    String m897d3 = atm.m897d("B1DDA1EC97F4B1ECA1ED97C0B1E0A1EA97F9B1D2A1D397C4B1DCA1EC97C0");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1435165570)) {
                            case -1686160493:
                                m897d = atm.m897d("B1E2A1D297FDB1E2A1E397F9B1E6A1ED97C1B1D8A1ED97C1B1D1A1D597CFB1DEA1ED97C0");
                                continue;
                            case -99812362:
                                m897d3 = atm.m897d("B1DDA1D397C0B1E2A1D297C7B1E3A1E397F9B1DBA1ED97C3B1E1A1DD97C0B1D2A1E297F9B1E2A1D597FCB1D2A1D297C2B1D2A1ED");
                            case 685918522:
                                m897d = atm.m897d("B1DFA1D297F9B1E2A1D997CEB1DBA1ED97CEB1DBA1D997C2B1DEA1ED97CFB1DBA1D097C3B1E2A1E397F8B1ECA1D2");
                                continue;
                            case 1492563801:
                                m897d3 = str.length() < 2 ? atm.m897d("B1E3A1D797F0B1E2A1EF97F9B1E3A1EC97C4B1DAA1EF97C3B1E6A1ED97C0B1E5A1D397FFB1D1A1D197F9B1ECA1EA") : atm.m897d("B1D1A1D297CFB1E5A1DE97FFB1E3A1EC97CEB1DBA1D797FCB1D2A1D197C2B1E3A1E997C0");
                        }
                    }
                    break;
                case 2055672339:
                    return sb.toString();
            }
        }
    }

    /* renamed from: g */
    private static byte[] m245g(byte[] bArr, byte[] bArr2, int i) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0052e.m1418a(new byte[]{39, 88, -107}, new byte[]{102, 29, -58, -21, 106, 19, 39, -39}));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(C0052e.m1418a(new byte[]{-31, 94, -28, 40, 42, -35, -122, -17, -59, 94, -122, 106, 117, -10, -111, -4}, new byte[]{-96, 115, -43, 30, 7, -97, -1, -101}).getBytes(C0052e.m1418a(new byte[]{-63, -99, 74, 120, 36}, new byte[]{-108, -55, 12, 85, 28, 45, -47, 3})));
            Cipher cipher = Cipher.getInstance(C0052e.m1418a(new byte[]{-54, Byte.MIN_VALUE, 72, 115, -9, 1, -95, 68, -37, -114, 88, 15, -127, 19, -125, 15, -17, -84, 117, 59}, new byte[]{-117, -59, 27, 92, -76, 67, -30, 107}));
            cipher.init(i, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m244h(byte[] bArr) {
        String m897d = atm.m897d("B1E1A1D297CEB1E2A1E297FFB1E6A1D497C1B1DDA1E997C3B1D2A1ED97F9B1E2A1D497FDB1DDA1D497C0B1E1A1D197C7B1D6A1EA97C4B1E2A1D397C0B1E2A1ED");
        int i = 0;
        String str = null;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            switch ((m897d.hashCode() ^ 210) ^ (-1116777542)) {
                case -1951185785:
                    String m897d2 = atm.m897d("B1D6A1EC97FDB1DDA1ED97C3B1DBA1E297F3B1E1A1E397CEB1E2A1D797F9B1E5A1DE97F4B1DAA1DE97FAB1ECA1ED97C3B1D1A1EC97F8B1D1A1D1");
                    while (true) {
                        switch (m897d2.hashCode() ^ 10628176) {
                            case -2107136935:
                                break;
                            case -1206978024:
                                m897d2 = i2 < bArr.length ? atm.m897d("B1DFA1D597C7B1DDA1D297FFB1D1A1D297F0B1D6A1D397C2B1D2A1EA97FFB1DDA1E997C1B1D8A1ED97F9") : atm.m897d("B1DCA1DE97C0B1E2A1EC97FDB1ECA1ED97F9B1E2A1D497F3B1E5A1ED97C0B1E3A1DE97F0B1E2A1EF97C2B1E6A1ED");
                            case 97198352:
                                m897d2 = atm.m897d("B1ECA1DE97F0B1E2A1DE97C1B1D8A1DE97C0B1E2A1ED97FFB1D1A1ED97C0B1D6A1D297F4B1D8A1DE97F4B1D8A1EC97C0");
                            case 1630698911:
                                m897d = atm.m897d("B1E0A1D297C0B1E0A1EF97F4B1DAA1D297F9B1D6A1D097C0B1DFA1D797CEB1E0A1EA97CEB1E5A1D397F0B1E2A1D597F0B1DFA1ED");
                                continue;
                        }
                    }
                    break;
                case -1809247607:
                    m897d = atm.m897d("B1E5A1D197CEB1E2A1D597C3B1E6A1EC97C0B1DEA1EE97F4B1DEA1D497FEB1E1A1ED97C4B1D6A1D097FEB1DBA1D597F8B1DCA1DD97F9B1E3");
                    i2 = i;
                    continue;
                case -1486412127:
                    return sb.toString().toUpperCase();
                case -923843118:
                    i = i2 + 1;
                    m897d = atm.m897d("B1D2A1E997C1B1ECA1D297CFB1DAA1D997FEB1E2A1DE97FAB1DDA1D297C1B1DBA1EA97C0B1E2");
                    continue;
                case -653165150:
                    String m897d3 = atm.m897d("B1DDA1EC97FEB1DFA1EA97C3B1E3A1EA97C4B1E2A1DD97CFB1E0A1EC97FCB1E6A1EE97FEB1DBA1ED97C0B1DFA1ED97C0B1E2A1D497F9B1E2A1EF97F9B1DDA1ED");
                    while (true) {
                        switch (m897d3.hashCode() ^ 70986529) {
                            case -1845712129:
                                m897d = atm.m897d("B1E0A1E997C2B1EDA1DD97C2B1E1A1EA97F9B1E2A1D097C4B1D8A1D797C2B1DEA1D197C3B1E6A1ED97C2B1DEA1E997C0B1E2A1EC97F8B1E5A1D397FF");
                                continue;
                                continue;
                            case -545602541:
                                m897d = atm.m897d("B1E0A1D397FEB1DDA1E997FEB1E2A1EC97C4B1E1A1D797C0B1ECA1ED97F9B1D8A1DE97FCB1DEA1D397C0");
                                continue;
                            case -169524963:
                                m897d3 = str.length() == 1 ? atm.m897d("B1E2A1DD97F9B1DDA1EA97F9B1E2A1D197FDB1E0A1D597FDB1D6A1D297FFB1DCA1D797C4B1D2A1ED") : atm.m897d("B1E6A1D297F9B1E2A1E297FAB1DFA1E397F9B1E1A1EA97FDB1E1A1E997C4B1E2A1D597F4B1E2A1ED97F9B1DEA1D997F0B1DDA1E997F0B1DDA1ED");
                            case 532195427:
                                m897d3 = atm.m897d("B1D2A1DD97C3B1D6A1D197C7B1DBA1D297C7B1ECA1D397CEB1E2A1EA97FAB1DCA1D797FEB1ECA1ED97C4B1E0A1EF97FAB1D8A1D1");
                        }
                    }
                    break;
                case -337292900:
                    m897d = atm.m897d("B1E2A1EC97FEB1E5A1E397C3B1D2A1DE97FDB1E1A1EC97CEB1ECA1D497C0B1E2A1D097F8B1DCA1E997FEB1E5A1D597F9B1D1A1E997C2B1DCA1ED");
                    continue;
                case -279247144:
                    StringBuilder sb2 = new StringBuilder();
                    m897d = atm.m897d("B1DCA1E997FEB1E2A1D597FEB1E5A1DE97F3B1E2A1D597F3B1E6A1ED97FFB1ECA1ED97FFB1DBA1D297C0B1DDA1DE97C1B1ECA1D097C0B1DCA1D797CF");
                    sb = sb2;
                    continue;
                case -265174865:
                    sb.append(str);
                    m897d = atm.m897d("B1E5A1EC97FAB1E1A1EA97F0B1E2A1E997FCB1E1A1EA97F8B1D6A1D297FFB1E2A1ED97C0B1D1A1EE97F4B1EDA1E397C0B1E1A1E297CF");
                    continue;
                case -209740362:
                    String m897d4 = atm.m897d("B1EDA1D997C0B1E6A1D497FAB1E1A1EA97C4B1E5A1D397C0B1EDA1D297FFB1EDA1D297C7B1E5A1D597CEB1DDA1DD97CEB1E2A1D597FFB1E3");
                    while (true) {
                        switch (m897d4.hashCode() ^ 1846120945) {
                            case -1894552804:
                                m897d = atm.m897d("B1DAA1D297C1B1EDA1D597C1B1E2A1D297FDB1E5A1DD97CEB1DFA1DE97FDB1E2A1D097FCB1ECA1ED97FFB1DBA1EF97FDB1D2A1D297C0B1DBA1DE");
                                continue;
                            case -1725067375:
                                break;
                            case 671889700:
                                m897d4 = atm.m897d("B1ECA1ED97C4B1D2A1D797C3B1E6A1D197F9B1D6A1E397FEB1E2A1EA97FFB1E3A1DD97C3B1ECA1ED97C2B1E6A1D097C0");
                            case 1491203252:
                                m897d4 = bArr != null ? atm.m897d("B1E5A1E297FEB1E2A1D097C3B1E6A1ED97FDB1E3A1D097FAB1D8A1DD97C0B1E1A1EE97C0B1E6A1DE97CEB1E2A1E297F3B1E2A1E297C1B1ED") : atm.m897d("B1E5A1E997C4B1DDA1EE97C1B1E3A1EA97C3B1E0A1EC97F4B1ECA1D297C0B1D8A1D997C1B1DBA1E397FEB1E2A1D797FCB1D2A1D497C7B1ED");
                        }
                    }
                    break;
                case -57205576:
                    str = Integer.toHexString(bArr[i2] & 255);
                    m897d = atm.m897d("B1D1A1D097C1B1E6A1ED97C4B1D2A1D397FEB1D8A1E997C4B1E2A1D497C2B1DA");
                    continue;
                case 246545733:
                    sb.append('0');
                    m897d = atm.m897d("B1E0A1E997C2B1EDA1DD97C2B1E1A1EA97F9B1E2A1D097C4B1D8A1D797C2B1DEA1D197C3B1E6A1ED97C2B1DEA1E997C0B1E2A1EC97F8B1E5A1D397FF");
                    continue;
                case 932654921:
                    m897d = atm.m897d("B1DCA1ED97F9B1E2A1EA97FEB1E2A1D597FFB1E0A1D297FDB1D1A1EE97C0B1E5");
                    continue;
                case 1620586152:
                    m897d = atm.m897d("B1E2A1E397FAB1D8A1D797FDB1E3A1EC97FAB1D8A1D397CEB1E0A1D2");
                    i2 = 0;
                    continue;
                case 1807073160:
                    m897d = atm.m897d("B1E2A1E397FAB1D8A1D797FDB1E3A1EC97FAB1D8A1D397CEB1E0A1D2");
                    continue;
            }
            m897d = atm.m897d("B1E5A1ED97C7B1ECA1EE97C0B1E2A1E397CEB1DFA1ED97FDB1DDA1ED97FCB1D2A1ED97C0B1ECA1EF97F0B1E2A1EA97C1B1E6A1ED97C7B1DCA1E3");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0685, code lost:
        r3.append(r2);
        r3 = r3.toString();
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String categoryContent(java.lang.String r17, java.lang.String r18, boolean r19, java.util.HashMap<java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 3724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0607v.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    @TargetApi(19)
    public final String detailContent(List<String> list) {
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        String str4;
        JSONArray jSONArray;
        String str5;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            boolean startsWith = list.get(0).startsWith(C0052e.m1418a(new byte[]{-94, 9, -87, 86, -50, 67, 114, 6}, new byte[]{-43, 102, -37, 58, -86, 32, 7, 118}));
            String m897d = atm.m897d("B1D6A1EE97FEB1DDA1D197F9B1E1A1D297C0B1E5A1E997FEB1D6A1ED97CFB1DBA1EE97FEB1E1A1E297CF");
            while (true) {
                try {
                    switch (m897d.hashCode() ^ (-820238885)) {
                        case -1842468106:
                            m897d = atm.m897d("B1DBA1D197F8B1DEA1D997CEB1D6A1D997C1B1E1A1D197FEB1DAA1EE97CF");
                            break;
                        case -1214836996:
                            JSONObject jSONObject4 = new JSONObject(C0574b.m308e(f1159c + C0052e.m1418a(new byte[]{-102, 57, 105, -29, 104, -4, -106, 14, -44, 58, 99, -92, 123, -87, -51, 82, -98, 102, 103, -87, 106, -98, -37, 86, -98, 45, 117, -96, 123, -119, -35, 74, -102, 32, 108, -65, 33, -92, -36, 3}, new byte[]{-5, 73, 0, -52, 30, -51, -72, 62}) + list.get(0).substring(8), m250b())).getJSONObject(C0052e.m1418a(new byte[]{-83, 73, 86, 18}, new byte[]{-55, 40, 34, 115, -17, -18, -87, -41}));
                            jSONObject3.put(C0052e.m1418a(new byte[]{-115, 42, -38, -48, 62, -10}, new byte[]{-5, 69, -66, -113, 87, -110, 114, 6}), list.get(0));
                            String m1418a = C0052e.m1418a(new byte[]{100, 10, 72, 60, 62, 79, -97, 56}, new byte[]{18, 101, 44, 99, 80, 46, -14, 93});
                            jSONObject3.put(m1418a, jSONObject4.getString(C0052e.m1418a(new byte[]{-50, -103, -26, -74, 30, -109, 3, -24, -24, -105, -26, -74}, new byte[]{-90, -10, -117, -45, 74, -10, 98, -123})) + C0052e.m1418a(new byte[]{59, -76, 38, 10}, new byte[]{27, -62, 85, 42, -57, -12, -110, -101}) + jSONObject4.getString(C0052e.m1418a(new byte[]{15, 113, -38, -108, 27, -74, -64, 40, 32, 103, -42, -120}, new byte[]{110, 6, -69, -19, 79, -45, -95, 69})));
                            jSONObject3.put(C0052e.m1418a(new byte[]{Byte.MIN_VALUE, 30, 46, -60, -11, 103, -50}, new byte[]{-10, 113, 74, -101, -123, 14, -83, 62}), jSONObject4.getString(C0052e.m1418a(new byte[]{-71, -80, 1, -81, -7, -62, 111, 125, -99, -80, 11, -91}, new byte[]{-47, -33, 108, -54, -83, -89, 14, 16})));
                            String m1418a2 = C0052e.m1418a(new byte[]{-1, 57, -102, 3, -35, -66, -47, 33, -18}, new byte[]{-117, 64, -22, 102, -126, -48, -80, 76});
                            jSONObject3.put(m1418a2, jSONObject4.getString(C0052e.m1418a(new byte[]{-10, 121, -11, -70, 27, -37, 100, -121, -48, 119, -11, -70}, new byte[]{-98, 22, -104, -33, 79, -66, 5, -22})) + C0052e.m1418a(new byte[]{-28, -46, 79, -39}, new byte[]{-60, -92, 60, -7, 39, 112, 68, 55}) + jSONObject4.getString(C0052e.m1418a(new byte[]{6, 104, 63, -37, 57, -39, 37, 69, 41, 126, 51, -57}, new byte[]{103, 31, 94, -94, 109, -68, 68, 40})));
                            jSONObject3.put(C0052e.m1418a(new byte[]{34, -119, 13, -19, -73, -36, 75, 14}, new byte[]{84, -26, 105, -78, -50, -71, 42, 124}), "");
                            jSONObject3.put(C0052e.m1418a(new byte[]{-39, -16, 60, 86, 7, 70, -54, -127}, new byte[]{-81, -97, 88, 9, 102, 52, -81, -32}), jSONObject4.getString(C0052e.m1418a(new byte[]{43, -76, 121, 97}, new byte[]{69, -43, 20, 4, -14, -123, 66, 25})));
                            String m1418a3 = C0052e.m1418a(new byte[]{64, -26, 114, 82, 125, 41, -9, -117, 68, -30, 101}, new byte[]{54, -119, 22, 13, 15, 76, -102, -22});
                            jSONObject3.put(m1418a3, jSONObject4.getString(C0052e.m1418a(new byte[]{103, 79, -6, -48, 105, -115, 37, -68, 111, 92}, new byte[]{2, 57, -97, -66, 29, -2, 107, -35})) + atm.m897d("4A") + jSONObject4.getString(C0052e.m1418a(new byte[]{99, -42, 25, -36}, new byte[]{13, -73, 116, -71, 120, 124, -21, 56})));
                            jSONObject3.put(C0052e.m1418a(new byte[]{-104, Byte.MIN_VALUE, -27, -6, -55, 45, -63, 71, -100}, new byte[]{-18, -17, -127, -91, -88, 78, -75, 40}), "");
                            jSONObject3.put(C0052e.m1418a(new byte[]{-121, 50, 73, -83, -70, -74, -65, 30, -110, 41, 66, Byte.MIN_VALUE}, new byte[]{-15, 93, 45, -14, -34, -33, -51, 123}), "");
                            jSONObject3.put(C0052e.m1418a(new byte[]{44, -7, -100, 84, -20, 11, 61, -52, 63, -8, -116}, new byte[]{90, -106, -8, 11, -113, 100, 83, -72}), "");
                            JSONArray jSONArray2 = jSONObject4.getJSONObject(C0052e.m1418a(new byte[]{-77, 97, -127, 41, 45, 40, 7, 71, -109, 109, -100, 62, 42, 56}, new byte[]{-64, 2, -23, 76, 73, 93, 107, 34})).getJSONArray(C0052e.m1418a(new byte[]{116, 84, -35, 26, -5, 77, -33, -51, 103, 93, -16, 10, -37, 86}, new byte[]{4, 56, -68, 99, -88, 34, -86, -65}));
                            int i = 0;
                            while (true) {
                                String m897d2 = atm.m897d("B1E5A1D297FCB1E3A1DE97FDB1DAA1EA97F0B1E1A1EF97CFB1E0A1D297CEB1E2A1EF97F9B1E2A1ED");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-859492574)) {
                                        case -1852986238:
                                            break;
                                        case -1611501602:
                                            m897d2 = i < jSONArray2.length() ? atm.m897d("B1EDA1D497C4B1E2A1D297F0B1DCA1ED97F0B1EDA1EA97C7B1DCA1E997FEB1DCA1ED97C0") : atm.m897d("B1E0A1D497CEB1E2A1D197FEB1DAA1D597F9B1D1A1E997C4B1E2A1EA97FEB1DAA1EC97F8B1ECA1ED97F0B1DAA1ED97C0B1EDA1D197FC");
                                        case -1524092970:
                                            JSONObject jSONObject5 = jSONArray2.getJSONObject(i);
                                            String optString = jSONObject5.optString(C0052e.m1418a(new byte[]{54, 30, -5, 29}, new byte[]{88, Byte.MAX_VALUE, -106, 120, -81, -49, 84, 103}));
                                            JSONArray optJSONArray = jSONObject5.optJSONArray(C0052e.m1418a(new byte[]{41, -46, 2, -47, 22, -6, 77, 63, 53, -45, 26}, new byte[]{92, -96, 110, -104, 120, -100, 34, 115}));
                                            int i2 = 0;
                                            while (true) {
                                                int i3 = i2;
                                                String m897d3 = atm.m897d("B1DEA1D297C4B1E5A1D097FCB1E2A1E397F0B1E2A1EE97F3B1E5A1D197C2B1E1A1D997C0B1DFA1D397FEB1E2A1ED97C4B1DCA1D997F9B1E1A1E397C0");
                                                while (true) {
                                                    switch (m897d3.hashCode() ^ 1250042668) {
                                                        case -1074966684:
                                                            JSONObject jSONObject6 = optJSONArray.getJSONObject(i3);
                                                            String string = jSONObject6.getString(C0052e.m1418a(new byte[]{-35, -62, -41}, new byte[]{-88, -80, -69, 19, 104, -52, 12, 31}));
                                                            String m897d4 = atm.m897d("B1E0A1EC97F0B1E6A1DD97F4B1DBA1DD97F4B1EDA1D397F8B1DAA1EF97CF");
                                                            while (true) {
                                                                switch (m897d4.hashCode() ^ (-1849045527)) {
                                                                    case -1980022189:
                                                                        m897d4 = jSONObject6.has(C0052e.m1418a(new byte[]{79, -89, -35, -89, 23, 10, -117, 55, 81, -89}, new byte[]{60, -62, -79, -62, 116, 126, -59, 86})) ? atm.m897d("B1E0A1D597C4B1E2A1D997FCB1D6A1D497CEB1E6A1ED97C7B1EDA1D197CEB1E0A1D497C0B1D2A1EC97F3B1DFA1DE97F9B1E2") : atm.m897d("B1DEA1D297FAB1D2A1D097C1B1DBA1D497F9B1E2A1DE97F9B1E2A1E297FDB1E5A1D197C2B1E1");
                                                                    case -1387276565:
                                                                        str5 = optString;
                                                                        break;
                                                                    case 618537253:
                                                                        str5 = jSONObject6.getString(C0052e.m1418a(new byte[]{8, -104, 97, 26, 44, 33, 32, -69, 22, -104}, new byte[]{123, -3, 13, Byte.MAX_VALUE, 79, 85, 110, -38}));
                                                                        break;
                                                                    case 1060646778:
                                                                        m897d4 = atm.m897d("B1D1A1ED97CEB1E2A1E997F0B1DDA1D097FCB1ECA1ED97F3B1EDA1DD97C7B1E6");
                                                                }
                                                            }
                                                            arrayList.add(str5 + C0052e.m1418a(new byte[]{101}, new byte[]{65, -42, -32, -102, 108, -61, 27, -110}) + string);
                                                            i2 = i3 + 1;
                                                            break;
                                                        case -462704542:
                                                            m897d3 = i3 < optJSONArray.length() ? atm.m897d("B1D6A1EE97C1B1DCA1EA97C3B1DCA1D197FEB1E5A1D297C4B1E2A1E397F4B1DD") : atm.m897d("B1E1A1EA97C4B1E2A1D497C7B1EDA1ED97CFB1DFA1D297C2B1D8A1D797F3B1DFA1ED97F4B1E2A1D397F9B1D8A1D597F8B1E3A1D397C0B1DAA1D2");
                                                        case 77090265:
                                                            break;
                                                        case 1376488593:
                                                            m897d3 = atm.m897d("B1DEA1D097F0B1E0A1E297FEB1ECA1E997F8B1E3A1E397C3B1DEA1EA97FDB1E6A1D297CF");
                                                    }
                                                }
                                            }
                                            linkedHashMap.put(optString, TextUtils.join(C0052e.m1418a(new byte[]{-86}, new byte[]{-119, 98, 103, 51, 106, 53, -12, -81}), arrayList));
                                            arrayList.removeAll(arrayList);
                                            i++;
                                            break;
                                        case 1174909212:
                                            m897d2 = atm.m897d("B1E3A1D397F4B1E0A1E397C0B1DFA1DE97C3B1DBA1D397C7B1E2A1EF97C0");
                                    }
                                }
                            }
                            break;
                        case -627513813:
                            if (!startsWith) {
                                m897d = atm.m897d("B1DBA1E297FEB1D2A1E297F9B1ECA1D797FAB1D8A1D997C0B1E2A1ED97C1B1D2A1ED97FCB1ECA1D097C0");
                                break;
                            } else {
                                m897d = atm.m897d("B1DCA1EE97FCB1D6A1EF97F8B1DAA1D397F9B1E0A1EE97C4B1E2A1E397FCB1DEA1E297FAB1E1A1EC97FEB1E0A1DD97CEB1E3");
                                break;
                            }
                        case 1735343951:
                            String[] split = list.get(0).split(C0052e.m1418a(new byte[]{-48, -38}, new byte[]{-116, -90, -115, 7, 117, 69, -98, 39}));
                            String m251a = m251a(C0052e.m1418a(new byte[]{-100, -53, -7, -12, -23, 72, -110, -109, -50, -53, -1, -8, -66, 73, -56, -109}, new byte[]{-6, -5, -53, -52, -113, 126, -86, -89}), C0052e.m1418a(new byte[]{-100, 74, 65, Byte.MAX_VALUE, -57, 2, -52, 118, -17, 59, 54, 14, -76, 115, -68, 126}, new byte[]{-35, 8, 2, 59, -126, 68, -124, 71}), C0052e.m1418a(new byte[]{103, 123, -98, -13}, new byte[]{30, 10, -11, -56, 56, 61, -4, 116}) + (System.currentTimeMillis() / 1000));
                            JSONObject jSONObject7 = new JSONObject(C0574b.m308e(f1159c + C0052e.m1418a(new byte[]{-73, -114, 25, -86, 115, 88, 35, -15, -7, -109, 31, -13, 108, 12, 34, -89, -77, -118, 52, -32, 113, 8, 100, -84, -23, -109, 31, -13, 108, 12, 68, -92, -21}, new byte[]{-42, -2, 112, -123, 5, 105, 13, -64}) + split[0] + C0052e.m1418a(new byte[]{115, -86, 37, -101, -77, 25, 24, 33, 49, -8}, new byte[]{85, -59, 71, -15, -42, 122, 108, 104}) + m251a, m250b())).getJSONObject(C0052e.m1418a(new byte[]{-92, 74, -64, -106}, new byte[]{-64, 43, -76, -9, 11, Byte.MIN_VALUE, -87, -7}));
                            boolean has = jSONObject7.has(C0052e.m1418a(new byte[]{116, 70, -39, 56}, new byte[]{26, 39, -76, 93, -43, -80, Byte.MAX_VALUE, -95}));
                            String m897d5 = atm.m897d("B1DBA1D197C7B1EDA1D397F0B1D8A1D297FDB1D8A1D297FFB1DDA1D997FEB1E2A1E997C1B1ECA1ED97CEB1E1A1E2");
                            while (true) {
                                switch (m897d5.hashCode() ^ (-90066035)) {
                                    case -770881739:
                                        str = "";
                                        break;
                                    case 1017286443:
                                        m897d5 = atm.m897d("B1E1A1EA97F4B1D8A1EA97C3B1DAA1EF97FDB1DCA1D497FCB1DDA1EC97C0B1E0A1D197CEB1D1A1E297FEB1E2A1EC97F9B1D2");
                                        break;
                                    case 1253549125:
                                        str = jSONObject7.getString(C0052e.m1418a(new byte[]{3, 100, Byte.MIN_VALUE, 7}, new byte[]{109, 5, -19, 98, 102, 74, -48, -117}));
                                        break;
                                    case 2065810352:
                                        if (!has) {
                                            m897d5 = atm.m897d("B1DDA1EA97F8B1ECA1EA97FDB1E2A1EF97F0B1D6A1E997F9B1ECA1ED97CFB1ECA1D797C0B1DDA1E397CEB1EDA1D497C0B1D2A1EA97F4");
                                            break;
                                        } else {
                                            m897d5 = atm.m897d("B1E0A1D497FDB1E2A1D597CEB1E1A1D797FEB1DBA1EC97FEB1DFA1EF97C1B1DBA1ED97FDB1ECA1D797C3B1DFA1D397CFB1D1A1D4");
                                            break;
                                        }
                                }
                            }
                            String m897d6 = atm.m897d("B1DAA1E297FEB1DEA1D497C3B1EDA1E297CFB1D1A1D097C7B1ECA1D397FFB1DDA1D597F4");
                            while (true) {
                                switch (m897d6.hashCode() ^ 1468869209) {
                                    case -1084329477:
                                        m897d6 = atm.m897d("B1D6A1EC97FEB1E2A1DE97C1B1DAA1D597F9B1DEA1ED97C2B1D2A1D797FDB1DCA1EC97F0B1E2A1EC97CFB1D1");
                                        break;
                                    case -1013382240:
                                        if (str.length() <= 0) {
                                            m897d6 = atm.m897d("B1D6A1D497C2B1D6A1D297C4B1E2A1E297F0B1E1A1E297F3B1DBA1ED97CEB1D6A1EE97C2B1D2A1E997F4B1DEA1D097F8B1DCA1DE");
                                            break;
                                        } else {
                                            m897d6 = atm.m897d("B1DFA1D597CEB1ECA1DD97C7B1DEA1EA97CFB1DDA1E997C0B1E0A1D397F0B1DCA1D597C4B1E2A1D597FDB1DBA1D397C2B1D1A1EC97FCB1DB");
                                            break;
                                        }
                                    case -730601917:
                                        str = C0052e.m1418a(new byte[]{29}, new byte[]{45, -32, 126, -17, -96, -9, 106, -116});
                                        break;
                                    case 953971848:
                                        break;
                                }
                            }
                            boolean has2 = jSONObject7.has(C0052e.m1418a(new byte[]{-114, -108, 98, 43, 68, 107, -38, -106, -119, -103, 109, 45}, new byte[]{-3, -4, 3, 89, 33, 40, -75, -8}));
                            String m897d7 = atm.m897d("B1E0A1D797FDB1E2A1D397F0B1D2A1D997F4B1D2A1ED97C3B1E6A1E997C0B1E2A1EA97F4B1E6A1E297FEB1E2A1DD97C4B1DCA1ED");
                            while (true) {
                                switch (m897d7.hashCode() ^ 325876084) {
                                    case -1028330796:
                                        if (!has2) {
                                            m897d7 = atm.m897d("B1ECA1DD97CFB1DDA1D497C7B1D2A1D297C0B1DEA1D797F8B1D6A1E997FFB1E2");
                                            break;
                                        } else {
                                            m897d7 = atm.m897d("B1D8A1ED97CEB1DBA1D997C4B1E2A1D297F3B1DDA1E297F3B1D6A1D797C0B1E5A1E297F4B1EDA1DD97F3B1DAA1EA97C0B1DBA1ED97F4B1DAA1D7");
                                            break;
                                        }
                                    case -676546622:
                                        m897d7 = atm.m897d("B1E2A1D397F8B1D6A1EA97F3B1E0A1D497C2B1ECA1D097F8B1D8A1EC97C0B1E2");
                                        break;
                                    case -666453730:
                                        str2 = "";
                                        break;
                                    case 1786921455:
                                        str2 = jSONObject7.getString(C0052e.m1418a(new byte[]{-48, -15, 71, -7, 79, 9, 113, -109, -41, -4, 72, -1}, new byte[]{-93, -103, 38, -117, 42, 74, 30, -3}));
                                        break;
                                }
                            }
                            String m897d8 = atm.m897d("B1E0A1EF97FDB1DAA1D797CEB1D8A1D197CFB1D2A1EE97FEB1E2A1D297C0B1D2A1D997FFB1EDA1EA97FFB1ECA1ED");
                            while (true) {
                                switch (m897d8.hashCode() ^ 860678396) {
                                    case -1337748774:
                                        break;
                                    case 38798648:
                                        m897d8 = atm.m897d("B1E2A1DD97F0B1DEA1D597C3B1E2A1D397CEB1EDA1EE97FDB1D6A1D597CFB1E6A1D097FDB1E5A1EF97C0B1E3A1D297C7B1D2A1EA97CEB1E2");
                                        break;
                                    case 577668802:
                                        str2 = C0052e.m1418a(new byte[]{92}, new byte[]{108, 32, -13, 122, -44, -96, 115, -31});
                                        break;
                                    case 1133160038:
                                        if (str2.length() <= 0) {
                                            m897d8 = atm.m897d("B1E0A1EE97C4B1DAA1DE97FDB1E2A1D297FAB1DBA1ED97FEB1E0A1EA97C0B1EDA1D397C2B1DAA1DE");
                                            break;
                                        } else {
                                            m897d8 = atm.m897d("B1D2A1ED97FAB1D6A1DD97F3B1E1A1EE97C2B1E5A1D497FEB1E2A1D397F9B1E2A1D997C2B1E6A1D597CEB1DAA1D797FFB1E6A1E997F9B1E2");
                                            break;
                                        }
                                }
                            }
                            boolean has3 = jSONObject7.has(C0052e.m1418a(new byte[]{-13, -20, 29, -32, -10, 42, -61, 110}, new byte[]{-105, -123, 111, -123, -107, 94, -84, 28}));
                            String m897d9 = atm.m897d("B1E6A1EE97F9B1D8A1D497FDB1E2A1E297FDB1D1A1D797FCB1ECA1ED97C3B1ECA1D797C2B1DBA1E997C0B1DDA1D197F0B1E2");
                            while (true) {
                                switch (m897d9.hashCode() ^ (-930702684)) {
                                    case -2128039046:
                                        m897d9 = atm.m897d("B1E5A1D997FDB1E2A1EA97C7B1D8A1D197C1B1DEA1E997CEB1DCA1ED97C3B1DBA1E997C0B1D6A1D797C4B1E0A1D797C3B1DBA1EF97F0");
                                        break;
                                    case -1567641501:
                                        str3 = "";
                                        break;
                                    case 1887052995:
                                        str3 = jSONObject7.getString(C0052e.m1418a(new byte[]{95, 126, 116, 22, 116, 56, -18, -77}, new byte[]{59, 23, 6, 115, 23, 76, -127, -63}));
                                        break;
                                    case 1975451982:
                                        if (!has3) {
                                            m897d9 = atm.m897d("B1ECA1E297CEB1D8A1E297FDB1E2A1D497FFB1ECA1E997F3B1DCA1EE97FDB1E6A1D997F0B1DEA1ED97C3B1DE");
                                            break;
                                        } else {
                                            m897d9 = atm.m897d("B1E0A1E997C0B1E2A1E297F8B1E6A1ED97F8B1DCA1E997C0B1E0A1EE97FFB1DEA1ED97CFB1DDA1E397FEB1E2A1EC97F9B1DDA1DE97F3B1EC");
                                            break;
                                        }
                                }
                            }
                            String m897d10 = atm.m897d("B1E5A1E397C4B1E0A1D197F9B1E5A1D997FDB1E2A1E397F0B1E6A1ED97C3B1D8A1ED97FDB1DA");
                            while (true) {
                                switch (m897d10.hashCode() ^ (-1970809536)) {
                                    case -158210365:
                                        break;
                                    case -84724593:
                                        str3 = C0052e.m1418a(new byte[]{-126}, new byte[]{-78, 8, -65, -59, -113, 11, -51, -85});
                                        break;
                                    case 1201813953:
                                        m897d10 = atm.m897d("B1E1A1EA97FEB1DEA1EC97C0B1E1A1EE97F9B1E2A1D397C0B1D1A1DD97C1B1DFA1ED97C4B1D6A1D797C4B1DBA1E997C0B1E1A1D097FCB1E5A1DD97C0");
                                        break;
                                    case 2040294284:
                                        if (str3.length() <= 0) {
                                            m897d10 = atm.m897d("B1E1A1EC97C2B1DBA1D397FEB1E2A1ED97C4B1D2A1D797FCB1D2A1ED97F9B1DFA1D097C0B1D1A1D397FCB1E5A1EC97F4B1DFA1D097F0B1E1A1D297F8");
                                            break;
                                        } else {
                                            m897d10 = atm.m897d("B1E3A1EC97CEB1E0A1EF97CFB1D8A1D297FFB1E6A1D097FDB1DDA1D097FFB1E2A1EC97F8B1E5A1DD97CEB1D6A1D397C0B1EDA1E397C0B1E2");
                                            break;
                                        }
                                }
                            }
                            boolean has4 = jSONObject7.has(C0052e.m1418a(new byte[]{-47, -23, 25, -71, 94, 111, 44}, new byte[]{-80, -118, 109, -53, 59, 28, 95, -109}));
                            String m897d11 = atm.m897d("B1EDA1D997C2B1E0A1E297C7B1E2A1DE97FDB1E2A1D097F0B1E6A1D297FEB1E3A1D297C7B1E2A1D197FFB1E1A1DD97C7B1E1A1DD97F3B1DBA1ED");
                            while (true) {
                                switch (m897d11.hashCode() ^ (-620090281)) {
                                    case 74860925:
                                        str4 = "";
                                        break;
                                    case 418047957:
                                        if (!has4) {
                                            m897d11 = atm.m897d("B1D6A1EA97FFB1D1A1D297C0B1E2A1D797C3B1E3A1D097FAB1DFA1ED97F9B1E5A1E997C0B1D6A1D597FAB1E6A1ED97CEB1E2A1D597C7B1E1");
                                            break;
                                        } else {
                                            m897d11 = atm.m897d("B1EDA1EA97F0B1E2A1EF97F3B1DBA1ED97C2B1D8A1D597F9B1DFA1E397C0B1DEA1EC97F3B1DDA1E297C7B1EDA1D797C2B1DAA1D597C1B1DFA1EE97FD");
                                            break;
                                        }
                                    case 949983513:
                                        m897d11 = atm.m897d("B1E2A1D197CEB1E2A1D497C4B1D2A1D797FFB1E6A1ED97C0B1DCA1D497FAB1D8A1EE");
                                        break;
                                    case 1339477919:
                                        str4 = jSONObject7.getString(C0052e.m1418a(new byte[]{-80, -4, -118, 108, -99, 61, -1}, new byte[]{-47, -97, -2, 30, -8, 78, -116, -10}));
                                        break;
                                }
                            }
                            jSONObject3.put(C0052e.m1418a(new byte[]{-117, 114, -45, 124, 60, -121}, new byte[]{-3, 29, -73, 35, 85, -29, 93, 122}), list.get(0));
                            jSONObject3.put(C0052e.m1418a(new byte[]{125, 66, 116, -76, -32, -68, 38, 80}, new byte[]{11, 45, 16, -21, -114, -35, 75, 53}), jSONObject7.getString(C0052e.m1418a(new byte[]{-49, 108, -89, -21}, new byte[]{-95, 13, -54, -114, -74, -6, 103, -84})));
                            jSONObject3.put(C0052e.m1418a(new byte[]{83, -17, -3, -95, 119, 90, 96}, new byte[]{37, Byte.MIN_VALUE, -103, -2, 7, 51, 3, -110}), jSONObject7.getString(C0052e.m1418a(new byte[]{17, 10, -101}, new byte[]{97, 99, -8, -52, -66, 93, 59, 16})));
                            jSONObject3.put(C0052e.m1418a(new byte[]{54, -114, -35, -54, -14, -84, 114, -29, 39}, new byte[]{66, -9, -83, -81, -83, -62, 19, -114}), jSONObject7.getString(C0052e.m1418a(new byte[]{-123, -78, 31, 94, 76, -78, 42, -5, -125}, new byte[]{-26, -34, 126, 45, 63, -26, 83, -117})));
                            jSONObject3.put(C0052e.m1418a(new byte[]{-57, Byte.MAX_VALUE, -24, -21, -27, 57, -4, -88}, new byte[]{-79, 16, -116, -76, -100, 92, -99, -38}), jSONObject7.getString(C0052e.m1418a(new byte[]{-111, 84, 16, -2}, new byte[]{-24, 49, 113, -116, 122, -107, -59, -119})));
                            jSONObject3.put(C0052e.m1418a(new byte[]{-35, -37, 104, -88, 17, 80, -35, 42}, new byte[]{-85, -76, 12, -9, 112, 34, -72, 75}), jSONObject7.getString(C0052e.m1418a(new byte[]{-91, 67, 102, -46}, new byte[]{-60, 49, 3, -77, -61, -22, -101, -80})));
                            String m1418a4 = C0052e.m1418a(new byte[]{-99, 90, 56, 1, 120, -4, -115, 106, -103, 94, 47}, new byte[]{-21, 53, 92, 94, 10, -103, -32, 11});
                            jSONObject3.put(m1418a4, C0052e.m1418a(new byte[]{81, -65, 34, -19, -113, 72, 30, -76, 57}, new byte[]{-73, 36, -106, 11, 25, -8, -6, 14}) + split[1]);
                            jSONObject3.put(C0052e.m1418a(new byte[]{2, 63, 42, -67, 57, 61, 36, -29, 6}, new byte[]{116, 80, 78, -30, 88, 94, 80, -116}), str4);
                            jSONObject3.put(C0052e.m1418a(new byte[]{-36, -119, 12, 56, -27, -60, -110, -117, -55, -110, 7, 21}, new byte[]{-86, -26, 104, 103, -127, -83, -32, -18}), str3);
                            jSONObject3.put(C0052e.m1418a(new byte[]{71, 114, -39, -55, -57, 73, -59, Byte.MAX_VALUE, 84, 115, -55}, new byte[]{49, 29, -67, -106, -92, 38, -85, 11}), jSONObject7.getString(C0052e.m1418a(new byte[]{3, 78, 73, 60, 42, 125, 19, 20, 30, 73, 82, 32}, new byte[]{106, 32, 61, 78, 69, 25, 102, 119})));
                            JSONArray jSONArray3 = jSONObject7.getJSONArray(C0052e.m1418a(new byte[]{104, -53, -56, -101, -115, -44, 113, 47, 105}, new byte[]{26, -82, -69, -12, -8, -90, 18, 74}));
                            int i4 = 0;
                            String str6 = str;
                            while (true) {
                                int length = jSONArray3.length();
                                String m897d12 = atm.m897d("B1E6A1E297CEB1D2A1E297F9B1DFA1EE97FEB1D8A1ED97F0B1DCA1D597FEB1DCA1EC97FEB1ECA1E997FEB1DEA1DE97FEB1D1A1D297C0");
                                while (true) {
                                    switch (m897d12.hashCode() ^ (-950942621)) {
                                        case -1828447489:
                                            m897d12 = atm.m897d("B1E1A1D097F8B1E5A1D097FAB1ECA1E297FDB1DDA1D197F8B1E5A1D597C1B1D2A1E297FCB1E6A1D097C0");
                                        case -1346491120:
                                            break;
                                        case -608429586:
                                            try {
                                                JSONObject jSONObject8 = jSONArray3.getJSONObject(i4);
                                                String string2 = jSONObject8.getString(C0052e.m1418a(new byte[]{95, -63, -124, 79}, new byte[]{49, -96, -23, 42, -40, -41, -22, -103}));
                                                String optString2 = jSONObject8.optString(C0052e.m1418a(new byte[]{95, -127, 104, 91, 55, -94, 21, 58}, new byte[]{43, -8, 24, 62, 121, -61, 120, 95}));
                                                JSONArray optJSONArray2 = jSONObject8.optJSONArray(C0052e.m1418a(new byte[]{34, 125, 67, 69, -89, -109, -64, -108}, new byte[]{70, 28, 55, 36, -53, -6, -77, -32}));
                                                int i5 = 0;
                                                while (true) {
                                                    String m897d13 = atm.m897d("B1DAA1D097C4B1D1A1EA97CFB1DFA1E297F4B1DDA1D597FEB1DCA1EF97F0B1DEA1DD97F8B1D2A1D297C4B1E2");
                                                    while (true) {
                                                        switch (m897d13.hashCode() ^ (-199807854)) {
                                                            case -1623287120:
                                                                m897d13 = i5 < optJSONArray2.length() ? atm.m897d("B1DEA1D597CEB1E2A1E997F8B1E1A1D997C1B1E6A1DE97C2B1D2A1ED97C7B1DBA1EA97C7B1E6A1D097C0B1EDA1D097C2B1D6A1EA97F4B1E0A1EA97F9B1E2") : atm.m897d("B1DCA1ED97FDB1E2A1EC97F3B1E3A1D297FEB1E2A1ED97FAB1DCA1ED97F3B1E2A1DD97C0B1E1A1EE97CEB1DFA1D097FA");
                                                            case -1386682034:
                                                                try {
                                                                    linkedHashMap.put(string2, TextUtils.join(C0052e.m1418a(new byte[]{113}, new byte[]{82, 28, 56, -123, -84, -92, -81, 62}), arrayList));
                                                                    arrayList.removeAll(arrayList);
                                                                    i4++;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    SpiderDebug.log(e);
                                                                    jSONObject = jSONObject2;
                                                                    return jSONObject.toString();
                                                                }
                                                            case -857281225:
                                                                JSONObject jSONObject9 = optJSONArray2.getJSONObject(i5);
                                                                String optString3 = jSONObject9.optString(C0052e.m1418a(new byte[]{59, -110, 12, 17}, new byte[]{85, -13, 97, 116, -72, 112, -84, 37}));
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append(split[0]);
                                                                sb.append(str3);
                                                                sb.append(str2);
                                                                sb.append(str6);
                                                                String m248d = m248d(jSONObject9.optString(C0052e.m1418a(new byte[]{21, -86, 8, -40, 67, -88, -41}, new byte[]{116, -50, 108, -86, 38, -37, -92, -94})), MessageDigest.getInstance(C0052e.m1418a(new byte[]{-120, -31, -2, -68, -39, -36, -126}, new byte[]{-37, -87, -65, -111, -21, -23, -76, 108})).digest(sb.toString().substring(3).getBytes(C0052e.m1418a(new byte[]{50, 45, 118, 92, 1}, new byte[]{103, 121, 48, 113, 57, -32, -109, -38}))));
                                                                StringBuilder sb2 = new StringBuilder();
                                                                sb2.append(optString3);
                                                                sb2.append(C0052e.m1418a(new byte[]{44}, new byte[]{8, 107, 59, -62, 113, -100, -40, 121}));
                                                                sb2.append(m248d);
                                                                sb2.append(C0052e.m1418a(new byte[]{58}, new byte[]{70, 20, -110, -94, -3, -22, 31, -3}));
                                                                sb2.append(optString2);
                                                                arrayList.add(sb2.toString());
                                                                i5++;
                                                            case 1018927891:
                                                                m897d13 = atm.m897d("B1DBA1D597FCB1D8A1D997F0B1E2A1EA97C3B1E2A1E297F3B1E5A1D397F0B1E6A1D097F9B1D6A1E297C4B1D2A1D297F9B1ECA1EA97C1B1E6");
                                                        }
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                            }
                                            break;
                                        case -358004578:
                                            m897d12 = i4 < length ? atm.m897d("B1D2A1D997F4B1EDA1EF97F8B1D1A1DD97C4B1DEA1EC97F4B1E6A1D097F0B1E5A1D597FFB1E0A1D997CFB1EDA1D797C0B1E2") : atm.m897d("B1E3A1ED97F9B1D6A1EA97C1B1E6A1D097C0B1E3A1D997F9B1DEA1D097F9B1E0A1EA97F9B1ECA1D097C2B1DEA1D997C3B1DFA1D497CE");
                                    }
                                }
                            }
                            break;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            jSONObject = jSONObject2;
            try {
                jSONObject3.put(C0052e.m1418a(new byte[]{-115, 70, 44, -106, 11, -60, 111, 86, -92, 79, 58, -90, 22}, new byte[]{-5, 41, 72, -55, 123, -88, 14, 47}), TextUtils.join(C0052e.m1418a(new byte[]{72, -86, 72}, new byte[]{108, -114, 108, -77, -112, -100, 59, -63}), linkedHashMap.keySet()));
                jSONObject3.put(C0052e.m1418a(new byte[]{-104, 122, 64, -67, 32, -111, -6, -55, -79, 96, 86, -114}, new byte[]{-18, 21, 36, -30, 80, -3, -101, -80}), TextUtils.join(C0052e.m1418a(new byte[]{-17, -108, 13}, new byte[]{-53, -80, 41, -119, -113, -14, 41, 103}), linkedHashMap.values()));
                jSONArray = new JSONArray();
                jSONArray.put(jSONObject3);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            jSONObject = jSONObject2;
        }
        try {
            jSONObject.put(C0052e.m1418a(new byte[]{-23, 72, 54, -22}, new byte[]{-123, 33, 69, -98, 124, -13, -37, -96}), jSONArray);
        } catch (Exception e6) {
            e = e6;
            jSONObject2 = jSONObject;
            SpiderDebug.log(e);
            jSONObject = jSONObject2;
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        String str;
        try {
            JSONArray jSONArray = new JSONObject(C0574b.m307f(f1159c + C0052e.m1418a(new byte[]{26, 88, 118, -87, -47, 27, 96, 50, 84, 92, 105, -87, -54, 69, 56, 107, 30, 7, 120, -29, -45, 126, 56, 78, 26, 74, 122, -22}, new byte[]{123, 40, 31, -122, -89, 42, 78, 2}), m250b(), null)).getJSONArray(C0052e.m1418a(new byte[]{97, 10, -14, 74}, new byte[]{5, 107, -122, 43, -106, -93, 25, -12}));
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1DFA1D497FDB1E2A1D397C4B1D1A1EC97FDB1ECA1ED97C0B1D2A1EE97FFB1E0A1D5");
                while (true) {
                    switch (m897d.hashCode() ^ 20065822) {
                        case -2069460472:
                            m897d = i < jSONArray.length() ? atm.m897d("B1E3A1D497C4B1E2A1EA97C3B1ECA1EC97C4B1DDA1D097C4B1E3A1D297FDB1E3A1D597F4B1E6A1E397F4B1EDA1E997F9") : atm.m897d("B1E5A1EF97FDB1EDA1DE97FAB1D2A1DE97CEB1E2A1D997FAB1D6A1DD97FEB1DCA1E397CFB1EDA1EC97C3B1DFA1EF97FDB1D2A1ED97F4B1E1A1EA");
                        case -1255190909:
                            m897d = atm.m897d("B1ECA1EA97C4B1E2A1ED97CFB1E6A1EA97FDB1DFA1E297FDB1D8A1EA97C7B1DCA1D197F8");
                        case 255758059:
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string = jSONObject.getString(C0052e.m1418a(new byte[]{-88, 85, -23, -79}, new byte[]{-58, 52, -124, -44, -39, 62, 75, -106}));
                            String m897d2 = atm.m897d("B1DCA1D497C1B1D6A1DD97FDB1E2A1EE97F0B1E3A1D997F9B1ECA1ED97FDB1DAA1D197C4B1EDA1DE");
                            while (true) {
                                switch (m897d2.hashCode() ^ 1571624023) {
                                    case -1692428041:
                                        break;
                                    case -870656508:
                                        String m897d3 = atm.m897d("B1D8A1ED97F4B1E2A1D097FEB1DAA1ED97CEB1ECA1D597F8B1DCA1D997F4B1D1A1E397C7B1ECA1D797CEB1E2");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-1907752395)) {
                                                case -811606961:
                                                    str = "";
                                                    break;
                                                case -563653800:
                                                    m897d3 = atm.m897d("B1D1A1D497C0B1E2A1D597C1B1D2A1E297F0B1DDA1E297C0B1D2A1D397CEB1E0A1E997C3B1E0A1DD97C0");
                                                case 1574317758:
                                                    str = jSONObject.getString(C0052e.m1418a(new byte[]{59, -34, 104, 61, -62, 120, -119, 51, 51, -42, 113, 38, -34}, new byte[]{86, -79, 30, 84, -89, 59, -24, 71}));
                                                    break;
                                                case 2058868450:
                                                    m897d3 = jSONObject.has(C0052e.m1418a(new byte[]{-110, 105, 9, -120, -61, -39, 40, -92, -102, 97, 16, -109, -33}, new byte[]{-1, 6, Byte.MAX_VALUE, -31, -90, -102, 73, -48})) ? atm.m897d("B1DEA1D397F9B1D2A1D997C4B1ECA1EC97C1B1EDA1D297F9B1E2A1DE97F9B1DFA1ED") : atm.m897d("B1E2A1D497C3B1E1A1D197CEB1E0A1D397C1B1DAA1D397F0B1ECA1D397C2");
                                            }
                                        }
                                        String m897d4 = atm.m897d("B1D8A1D797F8B1DAA1D297F0B1E2A1ED97C2B1E5A1D597FCB1DFA1ED97C0B1DDA1EA97FEB1E1A1D397C0B1DBA1D597FD");
                                        while (true) {
                                            switch (m897d4.hashCode() ^ (-2050926240)) {
                                                case -331592244:
                                                    m897d4 = TextUtils.isEmpty(str) ? atm.m897d("B1DEA1D397F9B1DFA1D597FEB1E2A1EE97F4B1E0A1D997CFB1E2A1D197F8B1E6A1DE97FDB1E3A1E397FDB1DCA1EC97C2B1D6A1D097C4B1ECA1ED") : atm.m897d("B1D2A1EF97C3B1E1A1EC97F9B1E2A1D497F9B1E6A1EF97FCB1E0A1D797FCB1DAA1D197C3B1DFA1E997F0B1D8A1D197FAB1E2A1ED");
                                                case -104365870:
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-16, 60, 69, -6, -31, 80, 64}, new byte[]{-124, 69, 53, -97, -66, 57, 36, -2}), str);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-100, 122, -55, 77, 51, 84, -88, 48, -115}, new byte[]{-24, 3, -71, 40, 108, 58, -55, 93}), string);
                                                    jSONArray2.put(jSONObject2);
                                                    continue;
                                                case 744457980:
                                                    m897d4 = atm.m897d("B1E0A1ED97C1B1D1A1D497FAB1E6A1D497F3B1E0A1E397C4B1DBA1D997FCB1EDA1D497C4B1E2");
                                                case 1660436500:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 360240170:
                                        m897d2 = atm.m897d("B1DFA1E297F0B1E2A1ED97FAB1E6A1ED97CFB1D6A1D397FDB1E2A1E997FFB1E6A1D797F9B1E0A1D3");
                                    case 2143823754:
                                        m897d2 = string.contains(C0052e.m1418a(new byte[]{-13, 97, -24, 78, -93, -69}, new byte[]{21, -17, 64, -90, 46, 43, -52, 86})) ? atm.m897d("B1D2A1D597F4B1EDA1E997CEB1E2A1D297FDB1EDA1EC97FEB1EDA1D497F8B1E2A1ED97FDB1D2A1E297C3B1E6A1D097C0") : atm.m897d("B1D6A1EF97CFB1E5A1D397F9B1DEA1D097CFB1D8A1DE97C2B1D8A1D197CEB1DFA1D797C0");
                                }
                            }
                            i++;
                            break;
                        case 1105764723:
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(C0052e.m1418a(new byte[]{23, -65, 8, 28, -117}, new byte[]{116, -45, 105, 111, -8, 52, 94, -113}), jSONArray2);
                            String m897d5 = atm.m897d("B1DEA1ED97FDB1D2A1E997C7B1DBA1EC97C1B1EDA1EC97C2B1E5A1D497C0B1D2A1D797F4B1E1A1DE97FDB1E2A1E997C7B1D2A1ED97C0B1DFA1EA");
                            while (true) {
                                switch (m897d5.hashCode() ^ 1292640362) {
                                    case -1224863610:
                                        try {
                                            jSONObject3.put(C0052e.m1418a(new byte[]{89, -119, -54, -25, 62, -92, -88}, new byte[]{63, -32, -90, -109, 91, -42, -37, -53}), this.f1160b);
                                            break;
                                        } catch (Exception e) {
                                            e = e;
                                            SpiderDebug.log(e);
                                            return "";
                                        }
                                    case -253638971:
                                        if (!z) {
                                            m897d5 = atm.m897d("B1DAA1E297FAB1ECA1D997C2B1E6A1E297FFB1E0A1E997C4B1E2A1D097C2B1E2A1EE97FCB1E5A1D597F4B1D2A1E397FAB1E2A1D597FD");
                                            break;
                                        } else {
                                            m897d5 = atm.m897d("B1E3A1D197C4B1E2A1EC97F8B1D8A1E297F9B1E2A1EE97CFB1D2A1ED97FEB1DEA1E997C0B1DCA1EF97FDB1E2");
                                            break;
                                        }
                                    case 493820877:
                                        m897d5 = atm.m897d("B1E5A1E397FFB1DEA1DD97FFB1E2A1E297FCB1E1A1E397C2B1ECA1DD97C3B1D2");
                                        break;
                                    case 863093747:
                                        break;
                                }
                            }
                            return jSONObject3.toString();
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0285, code lost:
        r1.append(r0);
        r1 = r1.toString();
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String homeVideoContent() {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0607v.homeVideoContent():java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final void init(Context context) {
        super.init(context);
        try {
        } catch (JSONException e) {
            e = e;
        }
        try {
            this.f1160b = new JSONObject(atm.m897d("11583C1C20354840210E6E330F03584F6E39181F1B57607A041B17106E62489FE6C5A9D4D05856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248574B57317411581457767A8FDEDD9CD5DE485658036E624839121C22394807560E6E364840589CEAC18CC2D557607A1C58405704334807560E6E3648405892F2D68FE1C757607A1C584057190B2B580759377A04584057A5C7C39FE1C86E74480C584F6E1305081F146E254601581B6E62489CEDD0AAC4C65856573A7A505830143C3904580759377A04584057A9D7DA9CC3CB6E74480C584F6E0C0B130D14227A17560157227A50589CC6FCBDF1C758596E2E48405821243903161B1B287A17560157227A50589CE3FCBDE0DA9FE8ED7A46580C57767A391314122D2805081F57317411581457767A83D3D693D1FD82DFC591F6C2485658036E6248371B192D2119131B57317411581457767A8FF7CA90F6FE485658036E624833141125394807560E6E364840589DC7E98FE1C757607A1C58405719134807560E6E3648405893FFCD8FE1C757607A1C5840570A2A0B1419106E254601581B6E62489FF0D5AAD3D59FDED26E74480C584F6E1B0B141B112D7A17560157227A505892D0F3BFE5D79DFCD57A46580C57767A390A1B1C227A17560157227A50589ECAC8BFD7ED9CE3E37A46580C57767A380F090625394807560E6E3648405890C9EE8EC1EC57607A1C584057032C021F0857310517560157273D1358405738211A1F58596E360B171F57767A8DCBC190D2D3485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6EBFE2CB9CF6C97A46580C57767A8DF2CB93CFDD4807560E6E3648405892EBC98FC3C157607A1C584057ABFFFB9FC3CE6E254601581B6E62489FECE9A9D1CD5856573A7A50589FE3D0BDE3DD580860234814584F6EBDE0D29EC8D07A46580C57767A8FF0D291F1C44807560E6E3648405890C6F08DEEC157607A1C584057A9D2C29DEECE6E254601581B6E62489CFBE5AAD8FC5856573A7A50589CF4DCBEEAEC580860234814584F6EBFE0D59DC8E67A46580C57767A8DF0D592F1F24807560E6E3648405891F6EA8FD7EA57607A1C584057A8E2D89FD7E56E254601581B6E62489CCBC8A4E5CC5856573A7A50589CC4F1B0D7DC580860234814584F6EBEE9F09CF7D67A46580C57767A8CF9F093CEC24807560E6E3648405893CEF48DECEB57607A1C584057AADAC69DECE46E254601581B6E62489FF3D2AADBEF5856573A7A50589FFCEBBEE9FF580860234814584F6EBCD6DC9DE5CA7A46580C57767A8EC6DC92DCDE4807560E6E364840589DE4D88CF9FF57607A1C584057A4F0EA9CF9F06E254601581B6E62489DDFEBA4F7F75856573A7A50589DD0D2B0C5E7580860234814584F6EBFC3C592C3C67A46580C57767A8DD3C59DFAD24807560E6E3648405892F1F28CDBF257607A1C584057ABE5C09CDBFD6E254601581B6E624892CAF8AAD0F25856573A7A505892C5C1BEE2E2580860234814584F6EB1F7E89CEDE97A46580C57767A83E7E893D4FD4807560E6E3648405890E2EE8FC0D757607A1C584057A9F6DC9FC0D86E254601581B6E62489FFCEEAACFEF5856573A7A50589FF3D7BEFDFF580860234814584F6EBDFFFC9CFDD47A46580C57767A8FEFFC93C4C04807560E6E3648405890E2F38FC1CD57607A1C584057A9F6C19FC1C26E254601581B6E62489FF4F3A9D7D85856573A7A50589FFBCABDE5C8580860234814584F6EBDE5DE92D6C97A46580C57767A8FF5DE9DEFDD4807560E6E3648405893E1FE8EC4DA57607A1C584057AAF5CC9EC4D56E254601581B6E62489FFCE9AAC5FB5856573A7A50589FF3D0BEF7EB580860234814584F6EBDEBCC9FF6C37A46580C57767A8FFBCC90CFD74807560E6E3648405890F5EC8EC1D957607A1C584057A9E1DE9EC1D66E254601581B6E624893F9C8A9E0E85856573A7A505893F6F1BDD2F8580860234814584F6EBFD7EB9DCED07A46580C57767A8DC7EB92F7C44807560E6E3648405893DEF58CF0DF57607A1C584057AACAC79CF0D06E254601581B6E624893E5C6A8E1FA5856573A7A505893EAFFBCD3EA580860234814584F6EBEFDFF92D4C07A46580C57767A8CEDFF9DEDD44807560E6E3648405892D7E08EC0C857607A1C584057ABC3D29EC0C76E254601581B6E624892FBF9A9C4D05856573A7A505892F4C0BDF6C0580860234814584F6EB0EECB9FFAEFBFCDFA58596E2E4840589DC8E98FF5D992EBD84807560E6E3648405890FCC98FFEC557607A1C584057A9E8FB9FFECA6E254601581B6E62489DC4FBA5FBF55856573A7A50589DCBC2B1C9E5580860234814584F6EBEF1C892FCF67A46580C57767A8CE1C89DC5E24807560E6E3648405893D5C28EC6E057607A1C584057AAC1F09EC6EF6E254601581B6E62489CF9F0AADCF55856573A7A50589CF6C9BEEEE5580860234814584F6EBEFDCC9FC5D67A46580C57767A8CEDCC90FCC24807560E6E364840589CCCD18DDDFA57607A1C584057A5D8E39DDDF56E254601581B6E62489CC2CDAAD0E55856573A7A50589CCDF4BEE2F5580860234814584F6EBEFAE49DD9DD7A46580C57767A8CEAE492E0C94807560E6E364840589DE2E782CAF257607A1C584057A4F6D592CAFD6E254601581B6E62489DE6EAA8E2D09DDDF56E74480C584F6EBFF6E59ECFF6BFCDFA580860234814584F6EBEE2E29ECFC57A46580C57767A8CF2E291F6D14807560E6E3648405892CFF582DBFA57607A1C584057ABDBC792DBF56E254601581B6E62489CDAC9AACEFD5856573A7A50589CD5F0BEFCED580860234814584F6EBCD7E992F7FE7A46580C57767A8EC7E99DCEEA4807560E6E3648405890E2F88DF3D357607A1C584057A9F6CA9DF3DC6E254601581B6E62489FFCE7A5C1C35856573A7A50589FF3DEB1F3D3580860234814584F6EBDDAEB9FD0FF7A46580C57767A8FCAEB90E9EB4807560E6E3648405890E9DF8FC3C157607A1C584057A9FDED9FC3CE6E254601581B6E62489CF4DDABC8EC5856573A7A50589CFBE4BFFAFC580860234814584F6EBFC1E49CFFCC7A46580C57767A8DD1E493C6D84807560E6E3648405893D0E28CF2E257607A1C584057AAC4D09CF2ED6E254601581B6E624892FAC8ABE6E45856573A7A505892F5F1BFD4F4580860234814584F6EBFF3C49FE5C47A46580C57767A8DE3C490DCD04807560E6E3648405892F6F28FC7EF92C5DF485658036E62489DC0DFA9E5FF9DF3F26E254601581B6E62489CDAD4A9C3C75856573A7A50589CD5EDBDF1D7580860234814584F6EBFEBC493EFF27A46580C57767A8DFBC49CD6E64807560E6E3648405892F7D78FFFC257607A1C584057ABE3E59FFFCD6E254601581B6E62489FFECAABF3CF5856573A7A50589FF1F3BFC1DF580860234814584F6EBEEBF19DFDFD7A46580C57767A8CFBF192C4E94807560E6E364840589CE1CC8FC3C157607A1C584057A5F5FE9FC3CE6E254601581B6E624892CED7ABE3E55856573A7A505892C1EEBFD1F5580860234814584F6EBEC7F69CEEFEB1EAF39DD2CC7A46580C57767A8CD7F693D7EA83FAF392EBD84807560E6E3648405893DBDD8CC2C257607A1C584057AACFEF9CC2CD6E254601581B6E62489CC8CEAADCE25856573A7A50589CC7F7BEEEF2580860234814584F6EBDEFCC9ECEDA7A46580C57767A8FFFCC91F7CE48072708602348111F0C6E6248031F143E7A46581414213D48405890F5EC8EC1C757607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E484058587D7A17560157227A505848457E6B485658036E6248484A477F7A17560157227A505848457E6A485658036E6248484A477E7A17560157227A505848457E69485658036E6248484A477D7A17560157227A505848457E68485658036E6248484A477C7A17560157227A505848457D61485658036E6248484A44757A17560157227A505848457D60485658036E6248484A44747A17560157227A505848457D6F485658036E6248484A447B7A17560157227A50584B4561695C9FC3C16E74480C584F6E6A5A4B4A587E685B4C580860234814584F6E685A9FC3C1A8E3C95856573A7A505848457C6847484A45757A17560157227A50584345A9E1DE9EC1D66E74480C584F6E6953434A587D615343580860234814584F6E605A9FC3C1A8E3C95856573A7A50584B4C7468474B434D757A17560157227A50589CEEF8BEFDD358596E2E484058497169534D4357310517560157273D135840573F37180E58596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBEF6FA9CE3FCBFE9D79CEDEC7A46580C57767A474B580860234814584F6EBEF6FA93DED4B0C5FE9FFDCA7A46580C57767A39191507297A17560157227A50589CE9CCBDCEE09FE3D0BEC6D858596E2E4840583925330F580759377A04584057AAC4EA92C5E4AAC3DE9CECC56E74480C584F6E0D1A1E1B01297A17270759377A011F0357767A07150C1C2928061B030135280F5856572239071F584F6EBDEFD293F6E47A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E755B580759377A045840571A113A5856573A7A50582C3C1C0739150F072F3D4807560E6E3648405890C9D582CEC357607A1C5840570A2A0F1F58081125375658263C37180E0957760311581110357A5058171A3A310F0A1614352C130A1F57607A041B17106E62489FFFDDA5DBC25856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248574B57317411581457767A3C332A57607A1C5840571A113A25291A392A091F580860234814584F6EBDEFF792C1F57A46580C57767A2C081F106E25370727596E1E05150E172D340658402E377A011F0357767A07150C1C2928061B030135280F5856572239071F584F6EBDEFD293F6E47A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E755B580759377A045840571A113A5856573A7A50582C3C1C0739150F072F3D4807560E6E3648405890C9D582CEC357607A1C5840570A2A0F1F58081125375658211A0B0F0813103F7A50210157273D135840572D2A0F1B58596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6EBDF1C79ECFEB7A46580C57767A2912131B2D7A17560157227A50589DCBC2BDE3DD58596E2E484058201F194807560E6E364840589CD3F18FF3DD57607A1C5840570737181F1B57317411581457767A8CEDDF90C5FF485658036E6248301B052D364807560E6E3648405893FFE88FF3DD57607A1C58405718300B131614223C4807560E6E3648405890C3E88FF3DD57607A1C5840571839030D1B1B6E254601581B6E62489CC2DAA9D1CD5856573A7A5058321E6E254601581B6E62489FFFC3A8E3FC5856573A7A50583501243D18580728317411581110357A505803102D2A4856581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C58405761694807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058447C755B4C9FCCF87A46580C57767A584A4B45616A5A4B4C57317411581457767A5A4A9FCCF8BCD1D958596E2E484058477C685A5748457C614807560E6E364840584C7CBDD3CE9ECEEF7A46580C57767A5B434345616953434357317411581457767A524A9FCCF8BCD1D958596E2E4840584475605A574B4C74614807560E6E3648405893D7EC8CEDD357607A1C58405770655B434D4C6E253707560E6E330F03584F6E2B05080E57607A041B17106E62489CF4E7A9E2E55856573A39060F1F57760311581457767A8CE6FA93DAE88DF9D793D4F8485658036E6248574B57317411581457767A8CE6FA9CE7C082D5FE90C4DE485658036E624829191A3E3D4807560E6E3648405893D0D88FDEE090DAC48CD6D857607A1C5840570031011F580860234814584F6EBEF6FA92CADDBEF1CE9CE3FC7A46580C57767A3F0A1E14383D48072708602348111F0C6E6248171503253D1A161B0C38211A1F58596E360B171F57767A8FFFD29CCFF0485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6E0E232A58596E2E484058230508352915003E3B0F580759377A04584057A9DDE792CECC6E74480C584F6E1E181F1F573105172756570D350F0813162D7A50210157273D1358405738211A1F58596E360B171F57767A8DCBC190D2D3485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6EBFE2CB9CF6C97A46580C57767A8DF2CB93CFDD4807560E6E3648405892EBC98FC3C157607A1C584057ABFFFB9FC3CE6E254601581B6E62489FECE9A9D1CD5856573A7A50589FE3D0BDE3DD580860234814584F6EBDE0D29EC8D07A46580C57767A8FF0D291F1C44807560E6E3648405890C6F08DEEC157607A1C584057A9D2C29DEECE6E254601581B6E62489CFBE5AAD8FC5856573A7A50589CF4DCBEEAEC580860234814584F6EBFE0D59DC8E67A46580C57767A8DF0D592F1F24807560E6E3648405891F6EA8FD7EA57607A1C584057A8E2D89FD7E56E254601581B6E62489CCBC8A4E5CC5856573A7A50589CC4F1B0D7DC580860234814584F6EBEE9F09CF7D67A46580C57767A8CF9F093CEC24807560E6E3648405893CEF48DECEB57607A1C584057AADAC69DECE46E254601581B6E62489FF3D2AADBEF5856573A7A50589FFCEBBEE9FF580860234814584F6EBCD6DC9DE5CA7A46580C57767A8EC6DC92DCDE4807560E6E364840589DE4D88CF9FF57607A1C584057A4F0EA9CF9F06E254601581B6E62489DDFEBA4F7F75856573A7A50589DD0D2B0C5E7580860234814584F6EBFC3C592C3C67A46580C57767A8DD3C59DFAD24807560E6E3648405892F1F28CDBF257607A1C584057ABE5C09CDBFD6E254601581B6E624892CAF8AAD0F25856573A7A505892C5C1BEE2E2580860234814584F6EB1F7E89CEDE97A46580C57767A83E7E893D4FD4807560E6E3648405890E2EE8FC0D757607A1C584057A9F6DC9FC0D86E254601581B6E62489FFCEEAACFEF5856573A7A50589FF3D7BEFDFF580860234814584F6EBDFFFC9CFDD47A46580C57767A8FEFFC93C4C04807560E6E3648405890E2F38FC1CD57607A1C584057A9F6C19FC1C26E254601581B6E62489FF4F3A9D7D85856573A7A50589FFBCABDE5C8580860234814584F6EBDE5DE92D6C97A46580C57767A8FF5DE9DEFDD4807560E6E3648405893E1FE8EC4DA57607A1C584057AAF5CC9EC4D56E254601581B6E62489FFCE9AAC5FB5856573A7A50589FF3D0BEF7EB580860234814584F6EBDEBCC9FF6C37A46580C57767A8FFBCC90CFD74807560E6E3648405890F5EC8EC1D957607A1C584057A9E1DE9EC1D66E254601581B6E624893F9C8A9E0E85856573A7A505893F6F1BDD2F8580860234814584F6EBFD7EB9DCED07A46580C57767A8DC7EB92F7C44807560E6E3648405893DEF58CF0DF57607A1C584057AACAC79CF0D06E254601581B6E624893E5C6A8E1FA5856573A7A505893EAFFBCD3EA580860234814584F6EBEFDFF92D4C07A46580C57767A8CEDFF9DEDD44807560E6E3648405892D7E08EC0C857607A1C584057ABC3D29EC0C76E254601581B6E624892FBF9A9C4D05856573A7A505892F4C0BDF6C0580860234814584F6EB0EECB9FFAEFBFCDFA58596E2E4840589DC8E98FF5D992EBD84807560E6E3648405890FCC98FFEC557607A1C584057A9E8FB9FFECA6E254601581B6E62489DC4FBA5FBF55856573A7A50589DCBC2B1C9E5580860234814584F6EBEF1C892FCF67A46580C57767A8CE1C89DC5E24807560E6E3648405893D5C28EC6E057607A1C584057AAC1F09EC6EF6E254601581B6E62489CF9F0AADCF55856573A7A50589CF6C9BEEEE5580860234814584F6EBEFDCC9FC5D67A46580C57767A8CEDCC90FCC24807560E6E364840589CCCD18DDDFA57607A1C584057A5D8E39DDDF56E254601581B6E62489CC2CDAAD0E55856573A7A50589CCDF4BEE2F5580860234814584F6EBEFAE49DD9DD7A46580C57767A8CEAE492E0C94807560E6E364840589DE2E782CAF257607A1C584057A4F6D592CAFD6E254601581B6E62489DE6EAA8E2D09DDDF56E74480C584F6EBFF6E59ECFF6BFCDFA580860234814584F6EBEE2E29ECFC57A46580C57767A8CF2E291F6D14807560E6E3648405892CFF582DBFA57607A1C584057ABDBC792DBF56E254601581B6E62489CDAC9AACEFD5856573A7A50589CD5F0BEFCED580860234814584F6EBCD7E992F7FE7A46580C57767A8EC7E99DCEEA4807560E6E3648405890E2F88DF3D357607A1C584057A9F6CA9DF3DC6E254601581B6E62489FFCE7A5C1C35856573A7A50589FF3DEB1F3D3580860234814584F6EBDDAEB9FD0FF7A46580C57767A8FCAEB90E9EB4807560E6E3648405890E9DF8FC3C157607A1C584057A9FDED9FC3CE6E254601581B6E62489CF4DDABC8EC5856573A7A50589CFBE4BFFAFC580860234814584F6EBFC1E49CFFCC7A46580C57767A8DD1E493C6D84807560E6E3648405893D0E28CF2E257607A1C584057AAC4D09CF2ED6E254601581B6E624892FAC8ABE6E45856573A7A505892F5F1BFD4F4580860234814584F6EBFF3C49FE5C47A46580C57767A8DE3C490DCD04807560E6E3648405892F6F28FC7EF92C5DF485658036E62489DC0DFA9E5FF9DF3F26E254601581B6E62489CDAD4A9C3C75856573A7A50589CD5EDBDF1D7580860234814584F6EBFEBC493EFF27A46580C57767A8DFBC49CD6E64807560E6E3648405892F7D78FFFC257607A1C584057ABE3E59FFFCD6E254601581B6E62489FFECAABF3CF5856573A7A50589FF1F3BFC1DF580860234814584F6EBEEBF19DFDFD7A46580C57767A8CFBF192C4E94807560E6E364840589CE1CC8FC3C157607A1C584057A5F5FE9FC3CE6E254601581B6E624892CED7ABE3E55856573A7A505892C1EEBFD1F5580860234814584F6EBEC7F69CEEFEB1EAF39DD2CC7A46580C57767A8CD7F693D7EA83FAF392EBD84807560E6E3648405893DBDD8CC2C257607A1C584057AACFEF9CC2CD6E254601581B6E62489CC8CEAADCE25856573A7A50589CC7F7BEEEF2580860234814584F6EBDEFCC9ECEDA7A46580C57767A8FFFCC91F7CE48072708602348111F0C6E6248031F143E7A46581414213D48405890F5EC8EC1C757607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E484058587D7A17560157227A505848457E6B485658036E6248484A477F7A17560157227A505848457E6A485658036E6248484A477E7A17560157227A505848457E69485658036E6248484A477D7A17560157227A505848457E68485658036E6248484A477C7A17560157227A505848457D61485658036E6248484A44757A17560157227A505848457D60485658036E6248484A44747A17560157227A505848457D6F485658036E6248484A447B7A17560157227A50584B4561695C9FC3C16E74480C584F6E6A5A4B4A587E685B4C580860234814584F6E685A9FC3C1A8E3C95856573A7A505848457C6847484A45757A17560157227A50584345A9E1DE9EC1D66E74480C584F6E6953434A587D615343580860234814584F6E605A9FC3C1A8E3C95856573A7A50584B4C7468474B434D757A17560157227A50589CEEF8BEFDD358596E2E484058497169534D4357310517560157273D135840573F37180E58596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBEF6FA9CE3FCBFE9D79CEDEC7A46580C57767A474B580860234814584F6EBEF6FA93DED4B0C5FE9FFDCA7A46580C57767A39191507297A17560157227A50589CE9CCBDCEE09FE3D0BEC6D858596E2E4840583925330F580759377A04584057AAC4EA92C5E4AAC3DE9CECC56E74480C584F6E0D1A1E1B01297A17270759377A011F0357767A07150C1C2928061B030135280F5856572239071F584F6EBDEFD293F6E47A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E755B580759377A045840571A113A5856573A7A50582C3C1C0739150F072F3D4807560E6E3648405890C9D582CEC357607A1C5840570A2A0F1F580811253756583E232A0F1B584F172348111F0C6E62480E0305297A46581414213D48405892FDE38FE4F157607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E484058587D7A17560157227A50589DFDFDBEE9FF58596E2E48405892C4E98CF9FF57317411581457767A8DDDEB90F5E3485658036E62489DDDE4A9E1D1580759377A04584057A9CEF69FF3D26E74480C584F6EBDFCE69FFCEB7A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8FF0D292D8E3485658036E62489FF0DDABCCD1580759377A04584057AAD9FA9CFAE36E74480C584F6EBEEBEA9CF5DA7A17560157227A50589DFFE3BFD7D058596E2E48405892C6F78DC7D057317411581457767A8EC0C890E1C8485658036E62489EC0C7A9F5FA580759377A04584057AAE9D792C7D36E74480C584F6EBEDBC792C8EA7A17560157227A50589CF6C6BEE8E058596E2E48405893CFD28CF8E057317411581457767A8CF8D692DAC9485658036E62489CF8D9ABCEFB580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE3DD9CF6C97A17560157227A50589EC9EABFFAFC58596E2E48405891F0FE8DEAFC57317411581457767A82D2FA93CFDD485658036E624892D2F5AADBEF580759377A04584057ABFDF492D5E86E74480C584F6EBFCFE492DAD17A17560157227A50589DDCF3B0DCF058596E2E48405892E5E782CCF057317411581457767A8DC7D093EDD0485658036E62489DC7DFAAF9E2580759377A04584057A4E8E79CF2ED6E74480C584F6EB0DAF79CFDD47A17560157227A505893E8DEBEF2DF58596E2E4840589CD1CA8CE2DF57317411581457767A8FD4CC90F6F5485658036E62489FD4C3A9E2C7580759377A04584057A9DEF19CEDF06E74480C584F6EBDECE19CE2C97A17560157227A50589FE0CABEE2E258596E2E48405890D9DE8CF2E257317411581457767A8FD4D190F7EF485658036E62489FD4DEA9E3DD580759377A04584057A9D6EC9FF5C76E74480C584F6EBDE4FC9FFAFE7A17560157227A50589FFAE8B0C9FF58596E2E48405890C3FC82D9FF57317411581457767A8CD7DC91F2F8485658036E62489CD7D3A8E6CA580759377A04584057A9DEF69CE7E46E74480C584F6EBDECE69CE8DD7A17560157227A50589FF4FABDE9F558596E2E48405890CDEE8FF9F557317411581457767A8FC3CE91F7FB485658036E62489FC3C1A8E3C9580759377A04584057A5DBD79FC2F76E74480C584F6EB1E9C79FCDCE7A17560157227A50589DC8DDBFD1E658596E2E48405892F1C98DC1E657317411581457767A8CE8D793C6FD485658036E62489CE8D8AAD2CF580759377A04584057A5C7D99EC3E56E74480C584F6EB1F5C99ECCDC7A17560157227A50589CE2C9B0CBF658596E2E48405893DBDD82DBF657317411581457767A8DE1C291F6EA485658036E62489DE1CDA8E2D8580759377A04584057A4D9E69FE6CF6E74480C584F6EB0EBF69FE9F67A17560157227A505892F1FDBDE5D99DD2CC7A46580C57767A82FECB90C3FB8DDDFA57317411581457767A8FCAEB90C8E7485658036E62489FCAE4A9DCD5580759377A04584057ABE6E493D9EA6E74480C584F6EBFD4F493D6D37A17560157227A50589CEEFEB0E3C058596E2E48405893D7EA82F3C057317411581457767A8CE3E091F0C2485658036E62489CE3EFA8E4F0580759377A04584057AADBEF9CFEEA6E74480C584F6EBEE9FF9CF1D37A17560157227A50589CE2FABDDAE058596E2E48405893DBEE8FCAE057317411581457767A83FAF392EBD8485658036E624893FAFCABFFEA580759377A04584057AAE0D29CF2FA6E74480C584F6EBED2C29CFDC37A17560157227A50589CE5D2BFC6EB58596E2E48405893DCC68DD6EB57317411581457767A82D4C59DFCD0485658036E624892D4CAA4E8E2580759377A04584057ABC4F59EC0CFABFFEA5856573A7A50589DE9D3BCD0C09DD2CC7A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A8DF9D79DEDD8485658036E62489DF9D8A4F9EA580759377A04584057AAF8D69CECE26E74480C584F6EBECAC69CE3DB7A17560157227A50589EC8DFB0E8C858596E2E48405891F1CB82F8C857317411581457767A8FD4DA92C5F1485658036E62489FD4D5ABD1C3580759377A04584057A9DEF893E3DC6E74480C584F6EBDECE893ECE57A17560157227A50589FC5DDBDCFC958596E2E48405890FCC98FDFC957317411581457767A8FDFFD90F5E3485658036E62489FDFF2A9E1D1580759377A04584057AAD6C29DEAF36E74480C584F6EBEE4D29DE5CA7A17560157227A50589DDED2BEE0FA58596E2E48405892E7C68CF0FA57317411581457767A8CE6C093C4C0485658036E62489CE6CFAAD0F2580759377A04584057A4D8D79DC4FB6E74480C584F6EB0EAC79DCBC27A17560157227A50589DECF2BDFAF258596E2E48405892D5E68FEAF257317411581457767A8DC0D090F1CD8DF3FD57607A1C584057ABE2C09FC7E0ABD1ED580759377A04584057AAF8CB9FE1D86E74480C584F6EBECADB9FEEE17A17560157227A50589DF4F2B1F0C458596E2E48405892CDE683E0C457317411581457767A8DC1F590C9E0485658036E62489DC1FAA9DDD2580759377A04584057A9DCD59DD1D06E74480C584F6EBDEEC59DDEE97A17560157227A50589CF4C7BFE2CB58596E2E48405893CDD38DF2CB57317411581457767A83D7EE90F5E3485658036E624893D7E1A9E1D1580759377A04584057A4ECC89DC1FA6E74480C584F6EB0DED89DCEC37A17560157227A50589CD8C0BEF1C893F5C5BFCDFA58596E2E48405893E1D48CE1C89CCCD18DDDFA57317411581457767A8CEDFF93F4E0485658036E62489CEDF0AAE0D2580759377A04584057AAEAD19CFEFD6E74480C584F6EBED8C19CF1C47A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC57310517560157273D13584057353D0B0858596E360B171F57767A8FC3CE91F7E5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E695A574B43A9E1DE5856573A7A505848457D6847484A447A7A17560157227A50584A45A9E1DE9EC1D66E74480C584F6E6A5A4A4A587E685A43580860234814584F6E615A9FC3C1A8E3C95856573A7A50584B4C7568474B434C757A17560157227A50584245A9E1DE9EC1D66E74480C584F6E6953424A587D615243580860234814584F6EBEF1CE9CE2E57A46580C57767A56474B4C7B6148072708602348111F0C6E6248091507387A46581414213D48405893C2CA8FC0F557607A1C1B1600297A50210157227A50589CE9CCBEFCCA9DF6E1BEF2DA58596E2E484058587D7A17560157227A50589CE9CCB1C1E292DAC8BDE2FC58596E2E484058262F37181F580860234814584F6EBEF6FA9FD1D6BDFCE69CD9EE7A46580C57767A261311106E254601581B6E62489CE6F5A4E7FB9CE1C1AACEDA5856573A7A50582F0528391E1F580811254601581E292148405818232E031F0A192D211E030A106E7448141B18297A50589FF0E4B1E9D258596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A505857446E254601581B6E62482C33256E74480C584F6E0E232A2526232D18191F57317411581457767A8FFFF79DF8E1485658036E62483C0810297A17270728607A3C1B081C292C1329121A3B7A50210157273D135840572D2A0F1B58596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6EBDCEDD93ECCA7A46580C57767A2912131B2D7A17560157227A505893D3D5BED2D558596E2E4840583D277A17560157227A50589DCBC2BDF1C758596E2E484058201F194807560E6E364840589CD3F18FE1C757607A1C5840570737181F1B57317411581457767A8CEDDF93D0F4485658036E6248301B052D364807560E6E3648405890C3E88CC3C457607A1C5840571839030D1B1B6E254601581B6E62489CC9C5A9C3D75856573A7A50582E1D2D31061B14116E254601581B6E62489CECC5A9D2CA9FE7D46E74480C584F6E0B03141D143C37181F580860234814584F6EB1C3D69CE8E9B0CFC59ECFD67A46580C57767A271B1614352B031B580860234814584F6EBDE7CA9FCFEA7A46580C57767A23141E1C2D7A17560157227A505892FEFDBDF1C758596E2E48405820077A17560157227A50589CC6D9BDF1C758596E2E484058333E3904191F57317411581457767A8FF0DA93C7E78FDEDD57607A1C5840570F39041B1E146E254601581B6E624892DFCAABD7C79DF3EC6E74480C584F6E0B1A1B131B6E254601581B6E62489EC5F1ABE5FD9CECDA6E74480C584F6E0A1F09091C2D7A17560157227A50589FF0FABCD1EC58596E2E4840583A38300F08580811254601581E29214840580135280F5856572239071F584F6EBFDBC19FEBC77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E755B580759377A04584057ABC4F59EC0CFABFFEA5856573A7A50589DE9D3BCD0C09DD2CC7A17560157227A505893EAFFBCD3EA58596E2E4840589CD3EB8EC3EA57317411581457767A8CEDFF9DEDD4485658036E62489CEDF0A4F9E6580759377A04584057A4DCDB9FF5D6ABFFEA5856573A7A505892F1FDBDE5D99DD2CC7A17560157227A50589DCBC2B1C9E558596E2E48405892F2D683D9E557317411581457767A8CF9FF93C8C7485658036E62489CF9F0AADCF5580728317411581110357A505803102D2A4856581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C58405761694807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058447C755B4C9FCCF87A46580C57767A584A4B45616A5A4B4C57317411581457767A5A4A9FCCF8BCD1D958596E2E484058477C685A5748457C614807560E6E364840584C7CBDD3CE9ECEEF7A46580C57767A5B434345616953434357317411581457767A524A9FCCF8BCD1D958596E2E4840584475605A574B4C74614807560E6E3648405893D7EC8CEDD357607A1C58405770655B434D4C6E253707560E6E330F03584F6E2B05080E57607A041B17106E62489CF4E7A9E2E55856573A39060F1F57760311581457767A8CE6FA93DAE88DF9D793D4F8485658036E6248574B57317411581457767A8CE6FA9CE7C082D5FE90C4DE485658036E624829191A3E3D4807560E6E3648405893D0D88FDEE090DAC48CD6D857607A1C5840570031011F580860234814584F6EBEF6FA92CADDBEF1CE9CE3FC7A46580C57767A3F0A1E14383D48072708602348111F0C6E6248171503253D1A161B0C38211A1F58596E360B171F57767A8FFFD29CCFF0485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6E0E232A58596E2E484058230508352915003E3B0F580759377A04584057A9DDE792CECC6E74480C584F6E1E181F1F573105172756570D3603171F57760311581110357A50581B0729394856581B2D350F584057A9C4DA9FF6CF6E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C58405761694807560E6E3648405890D7E58CC6D157607A1C5840570F3003141B57317411581457767A8CEDDF93F0F3485658036E6248301B052D364807560E6E364840589CD3F18CC6D157607A1C5840570737181F1B57317411581457767A8DC4F493F0F3485658036E62482F29346E254601581B6E62489FFFC3A8E3FC5856573A7A50583501243D18580728317411581110357A505803102D2A4856581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C58405761694807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058447C755B4C9FCCF87A46580C57767A584A4B45616A5A4B4C57317411581457767A5A4A9FCCF8BCD1D958596E2E484058477C685A5748457C614807560E6E364840584C7CBDD3CE9ECEEF7A46580C57767A5B434345616953434357317411581457767A524A9FCCF8BCD1D958596E2E4840584475605A574B4C74614807560E6E3648405893D7EC8CEDD357607A1C58405770655B434D4C6E253707560E6E330F03584F6E2B05080E57607A041B17106E62489CF4E7A9E2E55856573A39060F1F57760311581457767A8CE6FA93DAE88DF9D793D4F8485658036E6248574B57317411581457767A8CE6FA9CE7C082D5FE90C4DE485658036E624829191A3E3D4807560E6E3648405893D0D88FDEE090DAC48CD6D857607A1C5840570031011F580860234814584F6EBEF6FA92CADDBEF1CE9CE3FC7A46580C57767A3F0A1E14383D48072708602348111F0C6E6248171503253D1A161B0C38211A1F58596E360B171F57767A8FFFD29CCFF0485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6E0E232A58596E2E484058230508352915003E3B0F580759377A04584057A9DDE792CECC6E74480C584F6E1E181F1F573105172756570837090F1710222C0B080357760311581110357A5058171A3A310F0A1614352C130A1F57607A041B17106E62489FFFDDA5DBC25856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248574B57317411581457767A3C332A57607A1C5840571A113A25291A392A091F580860234814584F6EBDEFF792C1F57A46580C57767A2C081F106E25370727596E011B11584F172348111F0C6E6248171503253D1A161B0C38211A1F58596E360B171F57767A8FFFD29CCFF0485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6E0E232A58596E2E484058230508352915003E3B0F580759377A04584057A9DDE792CECC6E74480C584F6E1E181F1F573105172756570E3919111F012E390616584F172348111F0C6E6248171503253D1A161B0C38211A1F58596E360B171F57767A8FFFD29CCFF0485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A474B580860234814584F6E0E232A58596E2E484058230508352915003E3B0F580759377A04584057A9DDE792CECC6E74480C584F6E1E181F1F573105172707"));
            JSONArray jSONArray = new JSONObject(C0574b.m307f(C0052e.m1418a(new byte[]{3, 123, 77, -57, 90, -84, 54, 14, 10, Byte.MAX_VALUE, 80, -103, 80, -25, 114, 64, 27, Byte.MAX_VALUE, 23, -44, 70, -5, 54, 64, 27, 102, 22, -63, 24, -72, 41, 14, 7, 102, 87, -36, 6, -15, 124, 85, 40, 103, 92, -44, 66, -46, 118, 76, 10, 102, 87, -5, 64, -27, 109}, new byte[]{107, 15, 57, -73, 41, -106, 25, 33}), m250b(), null)).getJSONObject(C0052e.m1418a(new byte[]{-13, -58, -19, 80}, new byte[]{-105, -89, -103, 49, -85, -28, -49, -58})).getJSONArray(C0052e.m1418a(new byte[]{-8, -111, 10, 5, 24, -90, 44, 50, -22, -107}, new byte[]{-103, -31, 99, 80, 106, -54, 96, 91}));
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1DCA1E397C2B1D1A1EF97C2B1E0A1D297F9B1E6A1D797C2B1D1A1D497FAB1DFA1D497CEB1D2A1D997F9");
                while (true) {
                    switch (m897d.hashCode() ^ (-1875327911)) {
                        case 317585632:
                            Iterator it = arrayList.iterator();
                            int i2 = Integer.MAX_VALUE;
                            while (true) {
                                String m897d2 = atm.m897d("B1E2A1EA97F3B1DBA1ED97C0B1E2A1D497FAB1DCA1ED97F0B1DDA1E397C0B1E1A1EE97F0B1E2");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-1219230349)) {
                                        case -1624170100:
                                            m897d2 = it.hasNext() ? atm.m897d("B1DBA1D997C0B1E2A1ED97F8B1ECA1ED97F8B1DEA1E997C0B1D6A1E397FDB1D8A1D997C3B1DBA1D497FDB1ECA1D097FAB1E3A1D997CEB1D2A1EE97C4") : atm.m897d("B1DCA1D197CFB1E5A1DE97CEB1E2A1ED97FFB1E2A1D097C3B1E0A1E397C1B1E0A1DE97FEB1E1");
                                        case -665340180:
                                            m897d2 = atm.m897d("B1D6A1DD97FEB1E2A1DE97FDB1E6A1ED97FDB1DAA1D297FDB1D2A1D497FEB1DAA1DD97FCB1DEA1DE");
                                        case 1179005888:
                                            Integer num = (Integer) it.next();
                                            String m897d3 = atm.m897d("B1DAA1EA97FFB1D6A1D797F8B1E1A1DD97F9B1D6A1EC97F3B1DEA1EF97F4");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ (-1701915828)) {
                                                    case -1971577443:
                                                        break;
                                                    case -411646458:
                                                        m897d3 = num.intValue() < i2 ? atm.m897d("B1E6A1DD97FEB1E2A1EC97FCB1E2A1ED97FCB1EDA1D797F8B1DAA1D597C2B1E3A1D497C0B1D1A1E297CEB1E2A1D797F3B1E5A1EA97FAB1DFA1ED") : atm.m897d("B1DCA1EC97CEB1E2A1D197CFB1DCA1D597CEB1DCA1D197F8B1D6A1D397FAB1E6A1D997F9B1DCA1ED97F4B1DFA1D997C3B1ECA1EE97CEB1EDA1DD");
                                                    case -397685982:
                                                        m897d3 = atm.m897d("B1DDA1D497CEB1E2A1D097C0B1DAA1D497CEB1E2A1ED97CFB1DBA1ED97C0B1DFA1EF97FDB1E3A1E997C0");
                                                    case 2033616825:
                                                        i2 = num.intValue();
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1494998904:
                                            f1159c = jSONObject.getString(String.valueOf(i2));
                                            return;
                                    }
                                }
                            }
                            break;
                        case 730504823:
                            m897d = i < jSONArray.length() ? atm.m897d("B1DAA1E997C2B1E0A1DE97F9B1D6A1ED97FAB1DBA1EE97CEB1E2A1D997F8B1ED") : atm.m897d("B1DAA1E397C1B1E6A1DE97FDB1E2A1E397CFB1DAA1D097C0B1D1A1D397C7B1E5A1D497FCB1D2A1ED97C2B1DFA1D097F0B1DEA1D097F3B1E0");
                        case 1921400413:
                            break;
                        case 2026649146:
                            m897d = atm.m897d("B1DAA1E997F0B1E2A1E397C3B1D2A1E297FAB1EDA1D097FFB1DCA1DD97C2B1DF");
                    }
                }
                String string = jSONArray.getJSONObject(i).getString(C0052e.m1418a(new byte[]{-101, -58, -2}, new byte[]{-18, -76, -110, -68, -61, -99, 58, -29}));
                int m249c = m249c(string);
                arrayList.add(Integer.valueOf(m249c));
                jSONObject.put(String.valueOf(m249c), string);
                i++;
            }
        } catch (JSONException e2) {
            e = e2;
            SpiderDebug.log(e);
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObject;
        String m1418a;
        JSONObject jSONObject2 = new JSONObject();
        String str3 = C0052e.m1418a(new byte[]{-109, -45, -9, -115, 104, -34, 125, -67, -24, -18}, new byte[]{-34, -105, -109, -66, 1, -112, 78, -46}) + C0620d.m201c(Long.valueOf(System.currentTimeMillis()), C0052e.m1418a(new byte[]{-16, 26, -19, -34, -57, -52}, new byte[]{-119, 99, -108, -89, -118, -127, -83, -3}));
        C0052e.m1418a(new byte[]{-73, 3, 42, 79, 21, -106, 15, -78, -109, 3, 72, 13, 74, -67, 24, -95}, new byte[]{-10, 46, 27, 121, 56, -44, 118, -58});
        try {
            String[] split = str2.split(C0052e.m1418a(new byte[]{1, 105}, new byte[]{93, 21, 77, -92, 88, -99, 49, 95}));
            String m897d = atm.m897d("B1D2A1D597C1B1E6A1E297CEB1E2A1D997FEB1E0A1E997C0B1D2A1DD97CFB1D8A1D397C0B1E6A1D197F0B1DAA1ED97F4B1DCA1ED97FAB1E6A1EA");
            while (true) {
                switch (m897d.hashCode() ^ 2047499083) {
                    case -2010292934:
                        m897d = atm.m897d("B1DFA1EE97CEB1D6A1D297C3B1DFA1DD97FFB1E1A1DE97C0B1E2A1EC97F8B1E2A1ED97F3B1D2A1E397FCB1D8A1EA97C0B1DFA1D797F8B1E1A1E397C0");
                        break;
                    case -1799763217:
                        if (!C0652d.m142i(split[0])) {
                            m897d = atm.m897d("B1D2A1EE97C4B1E2A1DE97F9B1E3A1E297C2B1EDA1E297FAB1DBA1ED97CEB1E3A1D397C0B1DB");
                            break;
                        } else {
                            m897d = atm.m897d("B1E6A1E297CEB1E2A1EC97F3B1E2A1D997CEB1DAA1D497F8B1DCA1ED97C2B1D6A1ED97F8B1DFA1EF97F0B1DEA1EE97FAB1ECA1E2");
                            break;
                        }
                    case 545842916:
                        String m244h = m244h(m245g(split[0].getBytes(), str3.getBytes(), 1));
                        String string = new JSONObject(C0574b.m308e(f1159c + C0052e.m1418a(new byte[]{Byte.MIN_VALUE, 71, -90, -24, -50, 95, 42, -43, -50, 90, -96, -79, -47, 11, 43, -126, -124, 67, -97, -85, -39, 23, 64, Byte.MIN_VALUE, -107, 86, -90, -85, -121, 13, 107, -117, -107, 82, -95, -77, -123}, new byte[]{-31, 55, -49, -57, -72, 110, 4, -27}) + Base64.encodeToString(m244h.getBytes(), 0) + C0052e.m1418a(new byte[]{68, -18, -50, -17, -69, 98, 7, 6, 3, -6, -11, -32, -94, 98, 106}, new byte[]{98, -125, -95, -103, -46, 7, 87, 106}) + split[1], m250b())).getString(C0052e.m1418a(new byte[]{109, 66, -56, 86}, new byte[]{9, 35, -68, 55, 46, -107, -90, -8}));
                        String m897d2 = atm.m897d("B1D6A1EC97FCB1D2A1D597C3B1E6A1D097F8B1D6A1DE97FAB1DAA1D197F4B1D8A1E397FEB1E2A1D297C7B1ECA1ED97F0B1D6A1E397C0B1E2A1ED97F4");
                        while (true) {
                            switch (m897d2.hashCode() ^ (-1051688113)) {
                                case -1357911118:
                                    jSONObject2.put(C0052e.m1418a(new byte[]{84, -62, 117, -50, 61}, new byte[]{36, -93, 7, -67, 88, -85, 89, 16}), C0052e.m1418a(new byte[]{-49}, new byte[]{-1, 65, 94, -34, 6, Byte.MAX_VALUE, 36, -1}));
                                    jSONObject2.put(C0052e.m1418a(new byte[]{50, -12, -47}, new byte[]{71, -122, -67, -51, 38, 100, -9, 1}), string);
                                    jSONObject = new JSONObject();
                                    jSONObject.put(C0052e.m1418a(new byte[]{60, 69, -125, 3, -59, -65, 95, 113, 7, 66}, new byte[]{105, 54, -26, 113, -24, -2, 56, 20}), "");
                                    m1418a = C0052e.m1418a(new byte[]{-6, -14, 76, -72, -64, 42}, new byte[]{-110, -105, 45, -36, -91, 88, -38, -42});
                                    break;
                                case -233543143:
                                    if (!TextUtils.isEmpty(string)) {
                                        m897d2 = atm.m897d("B1DFA1DE97C7B1D8A1DE97C3B1E0A1D497F3B1DEA1D197CFB1ECA1EF97FAB1D1A1D197C0B1E2");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1D2A1EA97F3B1DDA1D097CFB1DEA1D597F3B1D8A1EC97FAB1E5A1D497C0B1DAA1D097C0B1D6A1D797CEB1E5A1E297C0B1E3A1E997C4");
                                        break;
                                    }
                                case 53353748:
                                    jSONObject2.put(C0052e.m1418a(new byte[]{-33, 117, 82, 68, -121}, new byte[]{-81, 20, 32, 55, -30, -63, 53, 69}), C0052e.m1418a(new byte[]{100}, new byte[]{85, 7, 53, -23, -90, -5, 118, 105}));
                                    jSONObject2.put(C0052e.m1418a(new byte[]{93, 60}, new byte[]{55, 68, 53, -116, -87, 72, -6, -87}), C0052e.m1418a(new byte[]{17}, new byte[]{32, -114, -37, 77, 0, -5, -108, -1}));
                                    jSONObject2.put(C0052e.m1418a(new byte[]{-75, 116, -49}, new byte[]{-64, 6, -93, 112, -62, 7, -55, 8}), split[0]);
                                    new JSONObject();
                                    jSONObject2.put(C0052e.m1418a(new byte[]{-94, -12, -125, -5, -74, 85}, new byte[]{-54, -111, -30, -97, -45, 39, -125, 56}), "");
                                    break;
                                case 1013733572:
                                    m897d2 = atm.m897d("B1D6A1ED97F4B1DEA1D997FCB1E1A1D097C2B1DEA1E297C4B1E0A1EE97CEB1E2A1D197FCB1DFA1ED97FAB1DEA1DD97C0");
                                    break;
                            }
                        }
                        break;
                    case 724911457:
                        jSONObject2.put(C0052e.m1418a(new byte[]{-22, -17, 124, -123, 59}, new byte[]{-102, -114, 14, -10, 94, 31, -47, -111}), C0052e.m1418a(new byte[]{-114}, new byte[]{-66, 47, -52, -38, 11, Byte.MIN_VALUE, 106, -80}));
                        jSONObject2.put(C0052e.m1418a(new byte[]{39, -57, 25}, new byte[]{82, -75, 117, 58, -33, -94, -122, -28}), m247e(split[0]));
                        jSONObject = new JSONObject();
                        jSONObject.put(C0052e.m1418a(new byte[]{64, 126, -40, -106, 90, -26, -77, -7, 123, 121}, new byte[]{21, 13, -67, -28, 119, -89, -44, -100}), C0052e.m1418a(new byte[]{55, 55, 64, -45, 48, 4, 14, -34, 79, 118, 10, -102, 116, 63, 6, -97, 30, 55, 77, -55, 124, 38, 59, -47, 75, 104, 20, -118, 103, 72, 56, -104, 20, 110, 14, -127, 124, 16, 89, -59, 83, 120, 123, -54, 44, 4, 10, -90, 31, 58, 113, -45, 40, 71, 90, -62, 77, 118, 9, -116, 124, 64, 36, -71, 46, 21, 118, -106, 124, 4, 6, -102, 31, 120, 125, -33, 63, 3, 0, -40, 90, 27, 82, -56, 51, 5, 10, -34, 75, 104, 3, -108, 108, 70, 95, -33, 74, 120, 105, -37, 58, 9, 29, -104, 85, 109, 9, -115, 114, 91, 89}, new byte[]{122, 88, 58, -70, 92, 104, 111, -15}));
                        m1418a = C0052e.m1418a(new byte[]{93, 62, -54, -84, -29, -91}, new byte[]{53, 91, -85, -56, -122, -41, 85, -86});
                        break;
                }
            }
            jSONObject2.put(m1418a, jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject2.toString();
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        JSONArray optJSONArray;
        JSONArray jSONArray;
        int i;
        long j;
        String str2;
        String m1418a;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        try {
            optJSONArray = new JSONObject(C0574b.m308e(f1159c + C0052e.m1418a(new byte[]{-64, 2, 79, 23, -78, 19, -85, -83, -114, 1, 67, 89, -74, 65, -19, -78, -58, 23, 82, 117, -85, 84, -20, -8, -29, 11, 105, 72, -80, 75, -22, -13, -46, 77, 87, 5}, new byte[]{-95, 114, 38, 56, -60, 34, -123, -99}) + URLEncoder.encode(str) + C0052e.m1418a(new byte[]{-44, -34, 53, -116, 101, 64, -63, 38, -105, -42, 105, -38, 38, 121, -50, 37, -105, -3, 61, -111, 101, 52, -99, 112}, new byte[]{-14, -82, 84, -21, 0, 9, -81, 66}), m250b())).getJSONObject(C0052e.m1418a(new byte[]{-17, -23, 104, -65}, new byte[]{-117, -120, 28, -34, -85, 99, -65, -109})).optJSONArray(C0052e.m1418a(new byte[]{-45, 72, -20, 94, 29}, new byte[]{-70, 60, -119, 51, 110, -66, -85, 9}));
            jSONArray = new JSONArray();
            i = 0;
        } catch (Exception e) {
        }
        while (true) {
            int i2 = i;
            String m897d = atm.m897d("B1DBA1DE97C1B1EDA1EF97FCB1DFA1D397FEB1E2A1E297F3B1E2A1D597FDB1DCA1ED97CFB1E2A1E997C0B1DCA1D797F8");
            while (true) {
                switch (m897d.hashCode() ^ 1834502637) {
                    case -1376295781:
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        JSONObject jSONObject3 = new JSONObject();
                        String m897d2 = atm.m897d("B1DAA1DD97FAB1DDA1D297C3B1E5A1D797F9B1E2A1D497F0B1E2A1EF97FFB1D1A1EF97C1B1ECA1ED97C3B1E2A1D397F9B1E3A1E3");
                        while (true) {
                            switch (m897d2.hashCode() ^ (-514191726)) {
                                case -1979360386:
                                    m897d2 = atm.m897d("B1D8A1E997FEB1DCA1E297C4B1E0A1EC97FDB1E2A1D797F0B1DDA1D497C0B1D8A1D297C7B1DBA1ED97FEB1D6A1D097C0B1E0A1D097F9B1E2");
                                case -1869644250:
                                    j = 0;
                                    break;
                                case -123636404:
                                    m897d2 = jSONObject2.has(C0052e.m1418a(new byte[]{47, -21, 66, 38, 81, 21, -3, 86, 47, -31}, new byte[]{66, -124, 38, 79, 55, 108, -87, 63})) ? atm.m897d("B1D8A1D797C0B1E5A1D597C3B1DEA1DE97C7B1EDA1D197FFB1D2A1E297C7") : atm.m897d("B1DFA1DE97C1B1D2A1EC97FEB1DEA1D997F0B1E2A1EE97F9B1E2A1ED97C0B1DAA1DE97C1B1E2A1E997FEB1DA");
                                case -9989545:
                                    j = jSONObject2.getLong(C0052e.m1418a(new byte[]{34, -53, -14, 113, 81, 96, -98, -17, 34, -63}, new byte[]{79, -92, -106, 24, 55, 25, -54, -122}));
                                    break;
                            }
                        }
                        String m897d3 = atm.m897d("B1ECA1D097FFB1E2A1EF97CEB1E1A1EE97F8B1ECA1ED97F9B1DDA1D197C0B1E3A1D497FFB1DCA1D297C0B1D8A1D997C0B1E2A1D197FDB1E2A1ED");
                        while (true) {
                            switch (m897d3.hashCode() ^ 678965564) {
                                case -1739250209:
                                    m897d3 = j > 0 ? atm.m897d("B1EDA1EF97FDB1E2A1E297C1B1D1A1D497F9B1DEA1D197F0B1DDA1EC97C4B1ED") : atm.m897d("B1E1A1EA97CEB1E2A1D997F4B1E6A1D397FFB1D2A1D097F0B1DAA1E997C4B1E6");
                                case -756559924:
                                    str2 = "";
                                    break;
                                case 1152756891:
                                    str2 = C0620d.m201c(Long.valueOf(j), C0052e.m1418a(new byte[]{-92, 107, -58, -75, 73, 38, -29, -37, -32, 103, -127, -62, 105, 100, -70, -61}, new byte[]{-64, 15, -23, -8, 4, 9, -102, -94}));
                                    break;
                                case 1318061214:
                                    m897d3 = atm.m897d("B1D6A1D197FDB1DCA1D197C1B1E3A1D497F4B1ECA1EF97C4B1E2A1D197C1B1E6A1ED");
                            }
                        }
                        String m897d4 = atm.m897d("B1D8A1EC97CEB1E6A1D397F0B1E2A1E297FEB1ECA1ED97FEB1D2A1EF97C7B1DEA1DE97F0B1DEA1D497C0");
                        while (true) {
                            switch (m897d4.hashCode() ^ (-29004421)) {
                                case -898756765:
                                    m1418a = jSONObject2.getString(C0052e.m1418a(new byte[]{-56, -91, 108, 2, -56, 11, -75, 31, -34, -109, 106, 10, -35, 18, -81}, new byte[]{-69, -64, 30, 107, -87, 103, -36, 101}));
                                    break;
                                case -671015252:
                                    m1418a = C0052e.m1418a(new byte[]{31}, new byte[]{47, 74, -79, 33, -44, 34, 60, 37});
                                    break;
                                case 1145015088:
                                    m897d4 = jSONObject2.has(C0052e.m1418a(new byte[]{83, -61, -23, 16, -40, 124, -119, 73, 69, -11, -17, 24, -51, 101, -109}, new byte[]{32, -90, -101, 121, -71, 16, -32, 51})) ? atm.m897d("B1D8A1E297FFB1D8A1D597F8B1DDA1D297CEB1E2A1E297C4B1E2A1D497C4B1D8A1D597FAB1DDA1EF97F3") : atm.m897d("B1EDA1E297FDB1E2A1D597CFB1E6A1ED97FCB1DDA1D797C4B1D8A1EC97FAB1E0A1EA97C2B1ECA1D297CFB1D8A1D5");
                                case 1777517355:
                                    m897d4 = atm.m897d("B1D6A1E997C0B1E2A1D397FDB1E1A1D297C3B1DFA1ED97FFB1E5A1E397FEB1EDA1D397F3B1DBA1D197FEB1E2A1D097C0B1DFA1E397FCB1DDA1D197C7");
                            }
                        }
                        String m897d5 = atm.m897d("B1DAA1D797CEB1E1A1EA97FEB1D8A1D797C3B1DFA1D797CFB1D6A1D997F4B1D6A1E397CEB1E2A1D997C0B1E3A1DD97F8B1E1");
                        while (true) {
                            switch (m897d5.hashCode() ^ 390659892) {
                                case -1785617686:
                                    m897d5 = atm.m897d("B1E6A1E297F0B1E5A1D997F0B1DDA1D097C1B1E0A1EF97FAB1E3A1EA97F9B1E2A1E997C1B1E6A1ED97F3B1E3A1D797FCB1D1A1D797F3B1E6");
                                case -887664395:
                                    m897d5 = m1418a.equals(C0052e.m1418a(new byte[]{41}, new byte[]{24, 126, 98, 54, 75, -100, -32, 34})) ? atm.m897d("B1E1A1D497F9B1E2A1D597FAB1E2A1D397C1B1DFA1D197CEB1E2A1EE97C2B1DCA1ED") : atm.m897d("B1DDA1D797F9B1D6A1D297C2B1E2A1D997FFB1DDA1D197C3B1D6A1D297F4B1DDA1DE97C0B1E2");
                                case 142272791:
                                    String m897d6 = atm.m897d("B1D1A1E997C0B1E2A1E997FEB1DCA1ED97C4B1DFA1D797C0B1DFA1D597CEB1E0A1DD97FAB1D2A1D797FDB1E6A1E297C3B1DDA1D497C0");
                                    while (true) {
                                        switch (m897d6.hashCode() ^ 1363489681) {
                                            case -1648098509:
                                                str3 = C0052e.m1418a(new byte[]{51, -8, 65, 118, 67, 30, 124, 95, 102}, new byte[]{-43, 99, -11, -112, -43, -82, -108, -40}) + jSONObject2.getString(C0052e.m1418a(new byte[]{56, -95, -93, 30, -9, -95, 81, 46}, new byte[]{76, -41, -19, 107, -102, -61, 52, 92})) + C0052e.m1418a(new byte[]{-43, -67, 32}, new byte[]{60, 38, -90, 86, -62, -56, 29, -85});
                                                break;
                                            case -1060793110:
                                                str3 = "";
                                                break;
                                            case 673222773:
                                                m897d6 = jSONObject2.has(C0052e.m1418a(new byte[]{74, -102, -61, 105, -5, -97, 121, -6}, new byte[]{62, -20, -115, 28, -106, -3, 28, -120})) ? atm.m897d("B1EDA1D497FAB1D6A1D997CEB1E2A1D597C4B1DCA1ED97F8B1DFA1D097FFB1DFA1ED97C2B1D2A1D297C0") : atm.m897d("B1EDA1D197C4B1E0A1EE97C7B1E2A1D297C7B1E1A1D297FFB1DBA1D197CEB1DAA1D297FDB1E2A1E297C7");
                                            case 1976179088:
                                                m897d6 = atm.m897d("B1DDA1DE97CEB1E2A1E297C1B1E1A1D097FEB1DBA1D197F4B1EDA1D1");
                                        }
                                    }
                                    break;
                                case 223464005:
                                    String m897d7 = atm.m897d("B1DFA1ED97FEB1E2A1D397C7B1DFA1D397C0B1E1A1EA97FAB1DCA1EC97FFB1D2A1D597FEB1E6A1ED97C3B1D8A1E997C0");
                                    while (true) {
                                        switch (m897d7.hashCode() ^ 1495158826) {
                                            case -968835907:
                                                str3 = "";
                                                break;
                                            case -43759202:
                                                str3 = C0052e.m1418a(new byte[]{-113, 31, -6}, new byte[]{106, -102, 75, -29, 106, -24, 95, 58}) + jSONObject2.getString(C0052e.m1418a(new byte[]{120, 113, -91, 47, 22, -62, -97, -68}, new byte[]{12, 7, -21, 90, 123, -96, -6, -50})) + C0052e.m1418a(new byte[]{-76, 97, -57}, new byte[]{93, -6, 65, -101, 103, 123, -88, -43});
                                                break;
                                            case 605768468:
                                                m897d7 = jSONObject2.has(C0052e.m1418a(new byte[]{26, 98, -59, 93, -122, -68, 106, 103}, new byte[]{110, 20, -117, 40, -21, -34, 15, 21})) ? atm.m897d("B1DEA1E397CEB1E2A1EE97C2B1DEA1E997F0B1E2A1ED97C3B1ECA1ED97C0B1EDA1ED97FCB1DBA1D097FDB1EDA1D997F3") : atm.m897d("B1DFA1D997F9B1E5A1EC97CFB1E6A1DD97FEB1E2A1ED97C1B1DDA1ED97FAB1DFA1ED97FEB1DCA1D397C0B1D8A1D397F8B1D2A1EC97C7B1DFA1D597C0");
                                            case 2019396714:
                                                m897d7 = atm.m897d("B1DEA1D597F9B1E6A1D197F3B1DEA1D397F4B1D8A1DE97CFB1DEA1D297FDB1DDA1D997C1");
                                        }
                                    }
                                    break;
                            }
                        }
                        String m897d8 = atm.m897d("B1DAA1E397F9B1E2A1D197C0B1DBA1ED97F0B1E2A1E297F9B1DBA1D097C4B1ECA1D2");
                        while (true) {
                            switch (m897d8.hashCode() ^ 1937158853) {
                                case -2070697086:
                                    str4 = "";
                                    break;
                                case -1197696831:
                                    m897d8 = atm.m897d("B1E1A1E397C2B1D2A1EF97FFB1DDA1E997C2B1D8A1D197F9B1DEA1ED97FCB1D8A1D297FAB1ECA1D197FEB1D8A1E397C2");
                                case 205807890:
                                    m897d8 = jSONObject2.has(C0052e.m1418a(new byte[]{-42, 75, 63, 56, 114}, new byte[]{-91, 40, 80, 74, 23, 120, -125, 57})) ? atm.m897d("B1E1A1D197F9B1E2A1ED97FAB1E2A1E997FFB1D1A1E297CFB1DFA1D197F0B1ECA1ED97C1B1ECA1D397C0B1DAA1E297F9B1E2A1DD97FDB1ED") : atm.m897d("B1E0A1DD97C0B1D2A1D397FEB1E2A1DD97C1B1DCA1ED97FDB1DAA1DE97CFB1ECA1EC");
                                case 1093093806:
                                    str4 = jSONObject2.getString(C0052e.m1418a(new byte[]{-8, -26, 39, -126, 125}, new byte[]{-117, -123, 72, -16, 24, -85, 123, 94})) + C0052e.m1418a(new byte[]{-40, -14, -119}, new byte[]{61, 122, 15, -96, -76, 63, 42, -49});
                                    break;
                            }
                        }
                        jSONObject3.put(C0052e.m1418a(new byte[]{-31, -4, 61, -114, 50, -8}, new byte[]{-105, -109, 89, -47, 91, -100, -82, 75}), jSONObject2.getString(C0052e.m1418a(new byte[]{105, -125, -56, 43, 92, -60, -84}, new byte[]{4, -20, -66, 66, 57, -115, -56, 100})) + C0052e.m1418a(new byte[]{-118}, new byte[]{-10, -116, 6, -55, -121, -113, -94, 66}) + str2);
                        jSONObject3.put(C0052e.m1418a(new byte[]{115, -59, -57, -24, 79, 69, -75, 20}, new byte[]{5, -86, -93, -73, 33, 36, -40, 113}), jSONObject2.getString(C0052e.m1418a(new byte[]{84, 111, 24, 6}, new byte[]{58, 14, 117, 99, 9, -90, -119, 12})));
                        jSONObject3.put(C0052e.m1418a(new byte[]{-81, 47, 11, -55, 94, -94, 85}, new byte[]{-39, 64, 111, -106, 46, -53, 54, -9}), jSONObject2.getString(C0052e.m1418a(new byte[]{22, -62, -6}, new byte[]{102, -85, -103, 37, -45, 31, -56, -20})));
                        jSONObject3.put(C0052e.m1418a(new byte[]{96, 86, -3, 74, 25, 122, -5, 103, 100, 82, -22}, new byte[]{22, 57, -103, 21, 107, 31, -106, 6}), str4 + atm.m897d("4A") + str3);
                        jSONArray.put(jSONObject3);
                        i = i2 + 1;
                        break;
                    case -31287071:
                        jSONObject.put(C0052e.m1418a(new byte[]{-76, -92, 71, -121}, new byte[]{-40, -51, 52, -13, 92, -54, 45, -48}), jSONArray);
                        break;
                    case 480545057:
                        m897d = atm.m897d("B1DDA1ED97C4B1DCA1E397CEB1E3A1EE97F0B1E2A1D097C3B1DBA1ED97F4B1DBA1D497C2B1D1A1EC");
                    case 1161767548:
                        m897d = i2 < optJSONArray.length() ? atm.m897d("B1DAA1E397C4B1E2A1D397FCB1D1A1D297C1B1D2A1ED97FAB1DBA1E997FFB1ECA1D497C0B1DEA1D397C2B1E0A1EE97C4B1DBA1D197C0") : atm.m897d("B1ECA1EA97F0B1E2A1ED97C7B1EDA1E997F9B1E3A1EA97CEB1E2A1DE97FCB1D6A1E997F0B1DD");
                }
            }
            return jSONObject.toString();
        }
    }
}
