package com.github.catvod.spider.merge.p044k;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.s */
/* loaded from: classes.dex */
public final class C0604s extends Dora {

    /* renamed from: b */
    private String f1145b = null;

    /* renamed from: c */
    private String f1146c = null;

    static {
        String m897d = atm.m897d("B1E5A1EF97F3B1DFA1EA97CEB1E2A1ED97F8B1D2A1D297CFB1DBA1D197C4B1DAA1D397C1B1D6A1E297C2B1DE");
        while (true) {
            switch ((m897d.hashCode() ^ 696) ^ 847132637) {
                case -515127594:
                    C0052e.m1418a(new byte[]{39, 69, -85, -68, -102, -83, -89, 92, 59, 31, -72, -66, -59, -18, -31, 83, 39, 69, -74, -94, -57, -84, -21, 90, 96, 80, -81, -91, -114, -14, -32, 68}, new byte[]{79, 49, -33, -52, -96, -126, -120, 52});
                    m897d = atm.m897d("B1D1A1D197C0B1DAA1E397FFB1D8A1EA97FEB1EDA1D097FDB1E2A1DE97F4B1DBA1ED97F4B1E6A1E2");
                    break;
                case 697878066:
                    return;
            }
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    private HashMap m256b(String str) {
        String str2;
        byte[] bArr;
        HashMap hashMap = new HashMap();
        String m897d = atm.m897d("B1ECA1D797F9B1E2A1D597FCB1E2A1D097C2B1E6A1DD97CEB1D8A1D497CEB1D8");
        while (true) {
            switch (m897d.hashCode() ^ (-563037890)) {
                case -1204890431:
                    break;
                case -1095849798:
                    m897d = atm.m897d("B1D6A1EA97F3B1E0A1DD97F0B1E2A1EA97FAB1D8A1DE97C4B1D1A1E397F9B1E2A1ED97F9B1E2A1D597C7B1DEA1DD97F4B1D2A1D497CFB1E6A1EE");
                    break;
                case -800553671:
                    byte[] bytes = this.f1145b.getBytes();
                    String str3 = this.f1146c;
                    String m897d2 = atm.m897d("B1ECA1DD97C0B1E2A1EE97FAB1E3A1DE97FDB1D6A1E997C1B1E5A1D097C0B1ECA1ED");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1082766460)) {
                            case -1817527447:
                                m897d2 = atm.m897d("B1E6A1D497FEB1EDA1E997C7B1D2A1D797FEB1E2A1E297FAB1E2A1ED97C1B1DFA1ED97C0B1E6A1EA97FFB1DDA1D797F9");
                                break;
                            case -1797620198:
                                str2 = C0052e.m1418a(new byte[]{122, 74, 53, 81, 94, 24, 85, -101}, new byte[]{34, 26, 124, 31, 25, 95, 0, -44});
                                break;
                            case 343604285:
                                str2 = str3;
                                break;
                            case 1932665537:
                                if (str3 != null) {
                                    m897d2 = atm.m897d("B1E5A1D197FAB1DBA1DE97C4B1E2A1D397C3B1D6A1D097C7B1E2A1D097FEB1E2A1EA97FCB1D1");
                                    break;
                                } else {
                                    m897d2 = atm.m897d("B1D8A1DE97C1B1DAA1E997FFB1E2A1EE97F0B1D2A1ED97C0B1E5A1E997C0B1DCA1D597CEB1E2A1E297C1B1DCA1ED");
                                    break;
                                }
                        }
                    }
                    byte[] bytes2 = str2.getBytes();
                    byte[] bArr2 = new byte[333];
                    int i = 0;
                    while (true) {
                        String m897d3 = atm.m897d("B1D2A1D797F9B1E6A1D097F3B1D6A1EC97FDB1E2A1EF97C1B1E0A1ED97C7B1E1A1E297C1B1E0A1EA97CFB1E0");
                        while (true) {
                            switch (m897d3.hashCode() ^ 704032) {
                                case -1724136386:
                                    m897d3 = i < 333 ? atm.m897d("B1EDA1EC97F9B1DAA1EE97FEB1E2A1DE97F3B1DBA1D397C1B1DDA1D497C0B1E2A1EC97C0B1DFA1ED") : atm.m897d("B1DEA1E297CEB1E2A1D497CFB1D6A1ED97FEB1EDA1EA97F4B1E1A1DE97F3B1DEA1DE97C1");
                                case -679093556:
                                    String m897d4 = atm.m897d("B1DDA1E297F9B1DDA1EA97FFB1D8A1EE97C4B1D2A1D097C4B1DFA1D097CEB1E2");
                                    while (true) {
                                        switch (m897d4.hashCode() ^ 947511183) {
                                            case -1952851373:
                                                m897d4 = atm.m897d("B1D2A1D497F3B1D6A1D197CFB1DAA1D397C0B1EDA1EF97C4B1D8A1E297F0B1E2");
                                                break;
                                            case -1000329674:
                                                bArr = null;
                                                break;
                                            case 652266323:
                                                int i2 = 0;
                                                int i3 = 0;
                                                int i4 = 0;
                                                while (true) {
                                                    String m897d5 = atm.m897d("B1DAA1EE97F4B1D8A1D797CEB1E2A1D797F8B1DEA1D197F4B1E0A1D497F4B1D6A1D097C3B1D1A1DD97F3B1E1A1EC");
                                                    while (true) {
                                                        switch (m897d5.hashCode() ^ 855380115) {
                                                            case -1991903995:
                                                                m897d5 = atm.m897d("B1DCA1E997FAB1E2A1DE97C4B1E2A1DD97FAB1E3A1EE97C3B1D6A1DD97F8B1E6A1D497F9B1DCA1ED97F0B1E5A1D797F0B1E2A1D497C0");
                                                            case -1902059273:
                                                                break;
                                                            case 1044346030:
                                                                bArr = bArr2;
                                                                break;
                                                            case 1905308007:
                                                                m897d5 = i3 < 333 ? atm.m897d("B1E5A1ED97F3B1EDA1E297F0B1E2A1D497F0B1ECA1D797C3B1D6A1EC97F8B1DEA1D997C7B1E2A1ED97CFB1DBA1E997C0B1DEA1D797F8B1DEA1DD") : atm.m897d("B1DFA1D797C0B1EDA1EF97C7B1D8A1E997FDB1E2A1D597C4B1DCA1E297C3B1D8A1D097F9B1D8A1D097CFB1DBA1D597C0B1E6A1ED97FCB1DAA1ED");
                                                        }
                                                    }
                                                    i4 = (((bytes2[i2] & 255) + (bArr2[i3] & 255)) + i4) % 333;
                                                    byte b = bArr2[i3];
                                                    bArr2[i3] = bArr2[i4];
                                                    bArr2[i4] = b;
                                                    i3++;
                                                    i2 = (i2 + 1) % bytes2.length;
                                                }
                                                break;
                                            case 1002349459:
                                                if (bytes2.length != 0) {
                                                    m897d4 = atm.m897d("B1D6A1EF97FEB1E2A1EC97FDB1D1A1EF97FDB1D2A1D297F3B1DFA1E297CEB1E6A1EA97FCB1E6A1EC97FDB1D1A1DE97FD");
                                                    break;
                                                } else {
                                                    m897d4 = atm.m897d("B1DCA1D597C1B1DEA1ED97FFB1E2A1D597FEB1DDA1ED97C1B1D1A1D397C0B1D8A1E297CEB1E2A1D797CEB1E2A1D497CEB1DBA1D197FA");
                                                    break;
                                                }
                                        }
                                    }
                                    byte[] bArr3 = new byte[bytes.length];
                                    int i5 = 0;
                                    int i6 = 0;
                                    int i7 = 0;
                                    while (true) {
                                        String m897d6 = atm.m897d("B1E1A1D397CFB1D1A1D797F8B1D1A1EE97F9B1E2A1D997FCB1D2A1D097FEB1E6");
                                        while (true) {
                                            switch (m897d6.hashCode() ^ (-954338161)) {
                                                case -696754115:
                                                    String encodeToString = Base64.encodeToString(bArr3, 2);
                                                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                                    String str4 = this.f1145b + str + currentTimeMillis;
                                                    try {
                                                        MessageDigest messageDigest = MessageDigest.getInstance(C0052e.m1418a(new byte[]{-4, -61, -38}, new byte[]{-79, -121, -17, 101, 73, -33, -26, -83}));
                                                        messageDigest.update(str4.getBytes());
                                                        str4 = new BigInteger(1, messageDigest.digest()).toString(16);
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                    String substring = str4.substring(8, 12);
                                                    hashMap.put(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, 17, 44, -121, -32}, new byte[]{11, 126, 71, -30, -114, -9, 74, 44}), encodeToString);
                                                    hashMap.put(C0052e.m1418a(new byte[]{120, 87, 80, -117}, new byte[]{16, 54, 35, -29, 92, 114, 50, -123}), substring);
                                                    hashMap.put(C0052e.m1418a(new byte[]{-2, 6, 98, 87, -24, 117, -114, -5, -6}, new byte[]{-118, 111, 15, 50, -101, 1, -17, -106}), currentTimeMillis + "");
                                                    String m897d7 = atm.m897d("B1E0A1D197CFB1E2A1EE97CEB1E2A1D597C1B1E6A1ED97F9B1D2A1E997C0B1E6A1D197FEB1E2A1E997C7B1E2A1ED");
                                                    while (true) {
                                                        switch (m897d7.hashCode() ^ 788982907) {
                                                            case -1066196335:
                                                                m897d7 = atm.m897d("B1D2A1ED97CEB1D8A1D597C1B1DEA1D297F9B1E2A1D797C1B1DFA1DE97C2B1DEA1DD97F8B1E3A1EA97C7B1E0");
                                                                break;
                                                            case -1005767012:
                                                                if (this.f1146c != null) {
                                                                    m897d7 = atm.m897d("B1E3A1EE97FEB1D8A1EF97FCB1DCA1E397FEB1E2A1D197C7B1E1A1D997FCB1E2A1EA97F9B1DBA1ED");
                                                                    break;
                                                                } else {
                                                                    m897d7 = atm.m897d("B1D2A1EE97F0B1E6A1D297C4B1E2A1D497C4B1ECA1ED97C7B1E3A1ED97FFB1E1A1D797FFB1DFA1EC97C1B1D8A1D097F4B1E6A1DD97C0");
                                                                    break;
                                                                }
                                                            case 885615192:
                                                                break;
                                                            case 1398168468:
                                                                hashMap.put(C0052e.m1418a(new byte[]{-7, -46, -82, 61, 86, -64, -57}, new byte[]{-113, -73, -36, 78, 63, -81, -87, -40}), C0052e.m1418a(new byte[]{-98, 76, -111, -56, -45, -38, -100, 92, -68, 108, -5, -3, -18, -10, -76, 21, -72, 106, -95, -13, -14, -12, -10, 4, -81, 101, -28, -76, -83, -67, -19}, new byte[]{-33, 2, -43, -102, -100, -109, -40, 124}));
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 891742559:
                                                    break;
                                                case 1004549984:
                                                    m897d6 = i6 < bytes.length ? atm.m897d("B1DDA1ED97C0B1E5A1D397FCB1E2A1E397C7B1DBA1E997FFB1DBA1D9") : atm.m897d("B1D8A1D497F0B1EDA1EC97F0B1E2A1E997FAB1E3A1D797FAB1DFA1ED97C4B1DCA1ED97FFB1D6A1EF");
                                                case 1267620899:
                                                    m897d6 = atm.m897d("B1DFA1D097F0B1E2A1EF97FCB1E2A1ED97C0B1E3A1EA97C4B1DAA1D497F0B1DAA1E997C2B1E5");
                                            }
                                        }
                                        int i8 = (i5 + 1) % 333;
                                        i7 = ((bArr[i8] & 255) + i7) % 333;
                                        byte b2 = bArr[i8];
                                        bArr[i8] = bArr[i7];
                                        bArr[i7] = b2;
                                        bArr3[i6] = (byte) (bArr[((bArr[i8] & 255) + (bArr[i7] & 255)) % 333] ^ bytes[i6]);
                                        i6++;
                                        i5 = i8;
                                    }
                                    break;
                                case 1179855494:
                                    break;
                                case 1519568180:
                                    m897d3 = atm.m897d("B1ECA1D297C0B1E2A1ED97FDB1DEA1EA97FAB1E2A1ED97FDB1E1A1D597C3B1DFA1DD97C0B1D1A1E397C0B1DBA1D597CF");
                            }
                        }
                        bArr2[i] = (byte) i;
                        i++;
                    }
                    break;
                case -258707887:
                    if (str == null) {
                        m897d = atm.m897d("B1EDA1D997FEB1E2A1EC97C7B1E0A1EC97C4B1DBA1ED97C0B1DEA1D797FDB1DAA1D497CEB1DAA1D5");
                        break;
                    } else {
                        m897d = atm.m897d("B1E1A1E397F9B1DBA1E997F9B1D1A1D297C2B1DDA1E997C3B1DAA1D997C4B1E2A1D597FFB1E2A1ED97F4B1DFA1D297C0B1E2A1E997FEB1E2A1DD97F0B1E1");
                        break;
                    }
            }
        }
        hashMap.put(C0052e.m1418a(new byte[]{-91, -55, -123, 103, 14, 93, 11, -36, -98, -50}, new byte[]{-16, -70, -32, 21, 35, 28, 108, -71}), C0052e.m1418a(new byte[]{-1, Byte.MAX_VALUE, -64, 21, -39, -43, 79, -57, -66, 45, -122, 80}, new byte[]{-112, 20, -88, 97, -83, -91, 96, -13}));
        return hashMap;
    }

    /* renamed from: a */
    final String m257a() {
        String str;
        int i = 0;
        String m1418a = C0052e.m1418a(new byte[]{-123, -63, 95}, new byte[]{-53, -18, 30, -20, -82, -29, -42, 63});
        try {
            str = Build.class.getField(C0052e.m1418a(new byte[]{-104, -55, -41, 116, 43, 109}, new byte[]{-53, -116, -123, 61, 106, 33, 36, 41})).get(null).toString();
        } catch (Exception e) {
            str = m1418a;
        }
        try {
            String str2 = (String) Class.forName(C0052e.m1418a(new byte[]{Byte.MIN_VALUE, -83, -109, -80, -53, -23, 15, -13, -114, -80, -39, -111, -35, -13, 31, -72, -116, -109, -123, -83, -44, -27, 25, -87, -120, -90, -124}, new byte[]{-31, -61, -9, -62, -92, Byte.MIN_VALUE, 107, -35})).getDeclaredMethod(C0052e.m1418a(new byte[]{39, -40, -47}, new byte[]{64, -67, -91, -5, 107, 14, -45, 81}), String.class).invoke(null, C0052e.m1418a(new byte[]{49, 81, 82, 102, 54, 115, 36, -101, 109, 88, 21, 106, 36, Byte.MAX_VALUE, 58, -113, 49, 87, 18, 112}, new byte[]{67, 62, 124, 4, 67, 26, 72, -1}));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append("");
            sb.append(C0052e.m1418a(new byte[]{-92, 107}, new byte[]{-40, 23, 33, 18, -117, 1, -10, 120}));
            sb.append("");
            sb.append(C0052e.m1418a(new byte[]{-91, -40}, new byte[]{-39, -92, 38, -19, -18, 43, 49, 4}));
            byte[] bArr = new byte[6];
            new Random().nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & (-2));
            StringBuilder sb2 = new StringBuilder(18);
            int i2 = 0;
            while (true) {
                String m897d = atm.m897d("B1E0A1D297F0B1D2A1EA97CFB1E1A1D397F8B1E0A1EF97FCB1E5A1D097CEB1DBA1D797C1B1D1A1D197F3B1D6A1DD97F4B1DEA1DE");
                while (true) {
                    switch (m897d.hashCode() ^ 1936485098) {
                        case -722885658:
                            m897d = atm.m897d("B1D8A1DD97FEB1E2A1EA97FFB1DCA1D597C0B1D8A1D497CEB1E2A1D097F8B1DCA1EE97C0B1E0");
                        case -416396165:
                            break;
                        case -123192005:
                            sb.append(sb2.toString());
                            sb.append(C0052e.m1418a(new byte[]{95, 79}, new byte[]{35, 51, 17, 38, -77, -97, -9, -30}));
                            String m1418a2 = C0052e.m1418a(new byte[]{10, 41, -40, 30, 118, 27, 56, 94, 2, 33, -48, 22, 126, 19, 48, 70, 26, 57, -56, 14, 102, 11, 40, 78, 18, 49, -6, 56, 80, 57, 26, 112, 44, 3, -14, 48, 88, 49, 18, 120, 36, 27, -22, 40, 64, 41, 10, 96, 60, 19, -30, 32, 35, 76, 109, 5, 95, 126, -115}, new byte[]{107, 75, -69, 122, 19, 125, 95, 54});
                            Random random = new Random();
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String m897d2 = atm.m897d("B1DBA1E997FFB1E0A1D597C4B1E2A1E397F3B1DFA1ED97FDB1DCA1EC97F0B1D1A1EA97FFB1DBA1D497C0B1DDA1D797FEB1E2A1D397F9B1D2A1ED97C7B1ECA1D2");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-483990600)) {
                                        case -2029117371:
                                            break;
                                        case -1307000875:
                                            m897d2 = i < 16 ? atm.m897d("B1E6A1D297C4B1E2A1DE97F9B1E0A1DE97F8B1DEA1D797F8B1D2A1EC97C0B1E5A1D497FEB1DAA1D097C0B1D6A1DD97FCB1D8") : atm.m897d("B1EDA1D297FFB1DBA1EA97C2B1DAA1DE97C0B1EDA1EA97C7B1EDA1D797F9");
                                        case -801873416:
                                            m897d2 = atm.m897d("B1DFA1D797FEB1E2A1EC97FEB1E6A1D397C0B1E2A1D097F0B1DFA1EA97C1B1DCA1ED97CFB1D1A1EC");
                                        case 1470589023:
                                            sb.append(stringBuffer.toString());
                                            sb.append(C0052e.m1418a(new byte[]{-75, 102}, new byte[]{-55, 26, -53, -3, 29, 120, -65, -46}));
                                            sb.append(str);
                                            sb.append(C0052e.m1418a(new byte[]{104, 4}, new byte[]{20, 120, 119, 15, -69, -8, 18, 94}));
                                            sb.append(str2);
                                            return sb.toString();
                                    }
                                }
                                stringBuffer.append(m1418a2.charAt(random.nextInt(m1418a2.length())));
                                i++;
                            }
                            break;
                        case 1671986219:
                            m897d = i2 < 6 ? atm.m897d("B1DCA1D197F0B1E2A1D197C2B1E6A1D197F3B1DFA1EE97C7B1ECA1D997CEB1D2A1ED97C0B1E0A1EA97F0B1DAA1DE97FFB1DFA1D3") : atm.m897d("B1E6A1D797F0B1E2A1D097FEB1E6A1ED97C7B1D6A1D997F8B1E2A1DE97C3B1E6A1E297C3B1DCA1DE97F3B1E1A1D397F0B1D8A1D397C0");
                    }
                }
                sb2.append(String.format(C0052e.m1418a(new byte[]{-52, 62, 33, 54}, new byte[]{-23, 14, 19, 110, -7, -77, -61, -118}), Byte.valueOf(bArr[i2])));
                i2++;
            }
        } catch (Exception e2) {
            return "";
        }
    }

    /* renamed from: c */
    final void m255c() {
        String m897d = atm.m897d("B1E3A1EC97C1B1D6A1DE97C1B1EDA1D797FAB1D2A1D997F9B1E2A1E397F0B1E2A1E297CFB1DCA1ED97FFB1DEA1D997C4B1DAA1D597C4B1DCA1D097C0");
        while (true) {
            switch (m897d.hashCode() ^ (-582046245)) {
                case -1033705662:
                    m897d = atm.m897d("B1D6A1E997FAB1E0A1E297FDB1E3A1D297F8B1E2A1D597FCB1D2A1DD97C1B1DBA1D197FDB1DAA1EF97CEB1E2");
                    break;
                case -648809068:
                    try {
                        this.f1146c = new JSONObject(C0574b.m310c(C0052e.m1418a(new byte[]{-19, -24, -58, -78, -94, 47, 39, 51, -15, -78, -43, -80, -3, 108, 97, 60, -19, -24, -37, -84, -1, 46, 107, 53, -86, -3, -62, -85, -74, 112, 96, 43, -86, -22, Byte.MIN_VALUE, -20, -19, 115, 109, 41, -86, -24, -35, -87, -3, 110, 100, 52, -30, -11, -36}, new byte[]{-123, -100, -78, -62, -104, 0, 8, 91}), null, m256b(C0052e.m1418a(new byte[]{72, 65, 8, 41, -8, 110, Byte.MAX_VALUE, -56, 106, 97, 98, 28, -59, 66, 87, -127, 110, 103, 56, 18, -39, 64, 21, -112, 121, 104, 125, 85, -122, 9, 14}, new byte[]{9, 15, 76, 123, -73, 39, 59, -24})))).getJSONObject(C0052e.m1418a(new byte[]{14, 45, -9, -45}, new byte[]{106, 76, -125, -78, -46, -92, 2, 24})).getString(C0052e.m1418a(new byte[]{-109, 101, 101, -34, 67, 0, 95, -109, -118, 115}, new byte[]{-26, 22, 0, -84, 28, 116, 54, -25}));
                        return;
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                        return;
                    }
                case -467634646:
                    if (this.f1146c == null) {
                        m897d = atm.m897d("B1E3A1E997C2B1DFA1D597FAB1E5A1DD97FDB1E2A1E997F3B1DFA1ED97F9B1DFA1D197FCB1D1A1DD");
                        break;
                    } else {
                        m897d = atm.m897d("B1D2A1D097FDB1EDA1D597F9B1E2A1D097F9B1E2A1D297C7B1D1A1E397CFB1DEA1D497FDB1E2A1EE97F8B1E2A1D797F9B1DFA1E397F4");
                        break;
                    }
                case 829292414:
                    return;
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        try {
            m255c();
            String m897d = atm.m897d("B1DFA1D197C0B1E2A1EA97F4B1DFA1D097F0B1E0A1E997F9B1DDA1ED97F8B1ECA1D397F8B1D1A1D197CEB1DCA1D497C3B1ECA1D997F4B1EDA1D1");
            while (true) {
                switch (m897d.hashCode() ^ 1150554365) {
                    case -1497481269:
                        str3 = hashMap.get(C0052e.m1418a(new byte[]{-23, -20, -60, 21}, new byte[]{-120, -98, -95, 116, 72, -70, 114, -109}));
                        break;
                    case -1386326874:
                        m897d = atm.m897d("B1D6A1D097F0B1DDA1D297CEB1DAA1EF97FDB1E2A1E297C2B1E1A1D197F3B1EDA1D097F9B1E2A1DD97FCB1E6A1ED97FEB1DBA1EC");
                        break;
                    case -269480163:
                        str3 = "";
                        break;
                    case -54274559:
                        if (!hashMap.containsKey(C0052e.m1418a(new byte[]{-59, 92, -121, -98}, new byte[]{-92, 46, -30, -1, 82, 57, 35, 26}))) {
                            m897d = atm.m897d("B1E2A1DE97CEB1DBA1EA97CEB1DFA1EF97F8B1DEA1DE97C0B1D2A1DD97C3");
                            break;
                        } else {
                            m897d = atm.m897d("B1E2A1ED97C7B1D8A1EC97F9B1E2A1E997CFB1D1A1D797F0B1EDA1EF97F0B1E2A1E397C3B1E6");
                            break;
                        }
                }
            }
            String m897d2 = atm.m897d("B1D6A1D597C7B1D2A1D097F8B1E0A1E397F3B1DAA1D997C7B1DFA1DD97FE");
            while (true) {
                switch (m897d2.hashCode() ^ (-2063207035)) {
                    case -143612111:
                        m897d2 = atm.m897d("B1D2A1DE97FEB1E2A1D597F3B1D1A1DD97F3B1D6A1EC97FCB1D2A1E297FFB1DC");
                        break;
                    case 502506851:
                        str4 = "";
                        break;
                    case 742352370:
                        str4 = hashMap.get(C0052e.m1418a(new byte[]{21, -78, 47, -81}, new byte[]{108, -41, 78, -35, 42, -64, 78, 106}));
                        break;
                    case 1482358562:
                        if (!hashMap.containsKey(C0052e.m1418a(new byte[]{2, -19, 8, -20}, new byte[]{123, -120, 105, -98, -106, -111, -52, 78}))) {
                            m897d2 = atm.m897d("B1D1A1EA97CEB1ECA1D10383C2A1DDAEEE83CFA1E3AED483F2A1ECAEE883C6");
                            break;
                        } else {
                            m897d2 = atm.m897d("B1E5A1D297FCB1E1A1D297F4B1DEA1E397F0B1E1A1EE97FEB1ECA1D197C0B1DEA1D297C2B1E2A1D497C1B1DEA1DE97F0B1E2A1E997FFB1DF");
                            break;
                        }
                }
            }
            Iterator<String> it = hashMap.keySet().iterator();
            String str5 = C0052e.m1418a(new byte[]{-60, -110, -118, 111, 5, -121, -11, -86, -40, -56, -103, 109, 90, -60, -77, -91, -60, -110, -105, 113, 88, -122, -71, -84, -125, -121, -114, 118, 17, -40, -78, -78, -125, -112, -52, 49, 73, -57, -66, -19, -51, -120, -102, 109, 80, -63, -66, -92, -59, -118, -118, 122, 77, -105, -86, -93, -53, -125, -61}, new byte[]{-84, -26, -2, 31, 63, -88, -38, -62}) + str2 + C0052e.m1418a(new byte[]{38, 107, -54, 8, 106, -18}, new byte[]{0, 31, -77, 120, 15, -45, -96, -6}) + str;
            while (true) {
                String m897d3 = atm.m897d("B1D8A1ED97C4B1E2A1D097CFB1DEA1ED97C1B1EDA1DE97FAB1E1A1E297FCB1E1A1D097F4B1E6A1ED97C2B1E3A1D997FFB1E2A1D397FEB1E1A1D397C0");
                while (true) {
                    switch (m897d3.hashCode() ^ (-1918457090)) {
                        case -614354730:
                            String next = it.next();
                            String trim = hashMap.get(next).trim();
                            String m897d4 = atm.m897d("B1D6A1D597CEB1ECA1D397F0B1E2A1D497F0B1D2A1ED97F8B1DCA1ED97FEB1EDA1DE");
                            while (true) {
                                switch (m897d4.hashCode() ^ (-1859933279)) {
                                    case -2142946128:
                                        m897d4 = atm.m897d("B1DDA1ED97CEB1E2A1D097C2B1E6A1D397F4B1E2A1EE97F0B1D1A1EA97FEB1E2A1DD97FCB1ECA1ED97FAB1DEA1D397CFB1E3");
                                    case 1021199083:
                                        str5 = str5 + C0052e.m1418a(new byte[]{23}, new byte[]{49, -77, 85, 89, -41, -17, -100, 52}) + next + C0052e.m1418a(new byte[]{-127}, new byte[]{-68, 103, -24, -20, -16, 35, -114, 3}) + URLEncoder.encode(trim);
                                        break;
                                    case 1261737846:
                                        break;
                                    case 1270944352:
                                        m897d4 = trim.length() == 0 ? atm.m897d("B1E5A1EA97C4B1DDA1E397F9B1EDA1DE97F0B1D6A1DE97C0B1DAA1EF97FE") : atm.m897d("B1DEA1D397C0B1E6A1EE97C2B1DCA1D997FEB1E2A1EC97CFB1DCA1ED97FEB1E6A1DD97C0B1E3A1EA97FDB1DEA1D397C0");
                                }
                            }
                            break;
                        case 633241889:
                            try {
                                JSONArray jSONArray = new JSONObject(C0574b.m308e(str5, m256b(str3 + str4))).getJSONArray(C0052e.m1418a(new byte[]{115, -75, 43, 61}, new byte[]{23, -44, 95, 92, 60, 20, -68, -62}));
                                JSONArray jSONArray2 = new JSONArray();
                                int i = 0;
                                while (true) {
                                    String m897d5 = atm.m897d("B1EDA1EE97CEB1E5A1D597C2B1DAA1D397CFB1DBA1EF97C2B1DEA1D497C0B1E3A1E997C0B1D6A1D797FDB1E2");
                                    while (true) {
                                        switch (m897d5.hashCode() ^ (-1484642908)) {
                                            case -1349382224:
                                                break;
                                            case 385340506:
                                                m897d5 = atm.m897d("B1ECA1EA97FEB1D8A1D197FEB1E2A1EE97F0B1E2A1D297FEB1D6A1E297F0B1E3A1EA97F0B1E2A1ED97F3B1DDA1E397FAB1E0A1EE97FAB1DDA1D5");
                                            case 521023102:
                                                m897d5 = i < jSONArray.length() ? atm.m897d("B1DBA1E397F8B1D6A1E397C3B1E5A1D497F8B1DEA1E397F4B1E2A1E297FFB1ECA1EA97C2B1DDA1EE97C7B1DBA1E997C1") : atm.m897d("B1E1A1D197CFB1E0A1ED97F9B1EDA1E997C2B1D2A1E997FFB1E2A1E397F0B1DBA1ED97FFB1DCA1D297FAB1EDA1DD97C0B1E0A1DE97CF");
                                            case 1787515363:
                                                JSONObject jSONObject = new JSONObject();
                                                int parseInt = Integer.parseInt(str2);
                                                jSONObject.put(C0052e.m1418a(new byte[]{90, -106, -67, 83}, new byte[]{42, -9, -38, 54, 72, -35, -10, -87}), parseInt);
                                                String m897d6 = atm.m897d("B1D1A1DD97F9B1DDA1D997C4B1DBA1E297F3B1D8A1D297F8B1DAA1D097FFB1DBA1EE97FF");
                                                while (true) {
                                                    switch (m897d6.hashCode() ^ 138590253) {
                                                        case -1012216948:
                                                            m897d6 = atm.m897d("B1D6A1E397F0B1E3A1D097FDB1E2A1ED97C7B1DFA1E997CFB1DEA1EE97C0B1DDA1ED97FCB1E3A1EC97F4B1E1A1ED97CFB1E3A1E397C0");
                                                            break;
                                                        case -468270359:
                                                            if (jSONArray2.length() != 20) {
                                                                m897d6 = atm.m897d("B1E2A1D197CEB1E2A1DD97C1B1E6A1ED97C3B1D6A1ED97C0B1E1A1D797C3B1E5A1ED97F0B1E2");
                                                                break;
                                                            } else {
                                                                m897d6 = atm.m897d("B1DAA1D597C4B1E0A1DD97C7B1EDA1E297CFB1ECA1ED97C4B1E1A1D1");
                                                                break;
                                                            }
                                                        case 580001436:
                                                            break;
                                                        case 680019954:
                                                            parseInt++;
                                                            break;
                                                    }
                                                }
                                                jSONObject.put(C0052e.m1418a(new byte[]{-60, -102, -36, 57, -78, -1, -6, 72, -64}, new byte[]{-76, -5, -69, 92, -47, -112, -113, 38}), parseInt);
                                                jSONObject.put(C0052e.m1418a(new byte[]{55, -115, -23, -22, -58}, new byte[]{91, -28, -124, -125, -78, 97, -116, 105}), 20);
                                                jSONObject.put(C0052e.m1418a(new byte[]{59, 53, -37, 79, -90}, new byte[]{79, 90, -81, 46, -54, -105, -102, 78}), Integer.MAX_VALUE);
                                                jSONObject.put(C0052e.m1418a(new byte[]{-5, -45, 62, 104}, new byte[]{-105, -70, 77, 28, -80, -6, -15, -100}), jSONArray2);
                                                return jSONObject.toString();
                                        }
                                    }
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put(C0052e.m1418a(new byte[]{112, 74, 88, -82, -49, 89}, new byte[]{6, 37, 60, -15, -90, 61, 103, 17}), jSONObject2.getString(C0052e.m1418a(new byte[]{122, 122}, new byte[]{19, 30, -11, 121, 27, -8, 95, 24})));
                                    jSONObject3.put(C0052e.m1418a(new byte[]{93, -79, 71, -40, 44, -57, -113, -69}, new byte[]{43, -34, 35, -121, 66, -90, -30, -34}), jSONObject2.getString(C0052e.m1418a(new byte[]{-66, -99, 65, -41}, new byte[]{-48, -4, 44, -78, -47, 61, -92, 42})));
                                    jSONObject3.put(C0052e.m1418a(new byte[]{22, 71, -12, -24, 2, -81, 116}, new byte[]{96, 40, -112, -73, 114, -58, 23, -12}), jSONObject2.getString(C0052e.m1418a(new byte[]{-71, -124, -93}, new byte[]{-55, -19, -64, -93, 5, 91, 55, 44})));
                                    jSONObject3.put(C0052e.m1418a(new byte[]{101, 50, 22, 21, 113, 44, 18, 13, 97, 54, 1}, new byte[]{19, 93, 114, 74, 3, 73, Byte.MAX_VALUE, 108}), jSONObject2.getString(C0052e.m1418a(new byte[]{44, 101, -31, -30, 73, -87, -37, -29, 63, 122}, new byte[]{89, 21, -123, -125, 61, -52, -110, -115})));
                                    jSONArray2.put(jSONObject3);
                                    i++;
                                }
                            } catch (Exception e) {
                                e = e;
                                SpiderDebug.log(e);
                                return "";
                            }
                            break;
                        case 1175089068:
                            m897d3 = it.hasNext() ? atm.m897d("B1E3A1D797F8B1DBA1D097C4B1D6A1D297C0B1E2A1D597C7B1D1A1E297F4B1D2A1E397CEB1DDA1D497C4B1D6") : atm.m897d("B1DCA1E297C3B1E0A1E997FCB1DFA1E297C7B1D8A1EA97C2B1E0A1EF97FEB1DFA1D3");
                        case 1570359059:
                            m897d3 = atm.m897d("B1DFA1D297FEB1E2A1ED97FAB1E0A1ED97F9B1D1A1EE97F9B1DDA1ED97C4B1EDA1D5");
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        try {
            m255c();
            try {
                JSONObject jSONObject = new JSONObject(C0574b.m308e(C0052e.m1418a(new byte[]{-31, -90, Byte.MAX_VALUE, -73, 125, -5, 116, -112, -3, -4, 108, -75, 34, -72, 50, -97, -31, -90, 98, -87, 32, -6, 56, -106, -90, -77, 123, -82, 105, -92, 51, -120, -90, -92, 57, -23, 49, -69, 63, -41, -3, -92, 111, -94, 51, -75, 50, -108, -74, -92, 100, -93, 24, -67, 63, -59}, new byte[]{-119, -46, 11, -57, 71, -44, 91, -8}) + list.get(0), m256b(list.get(0))));
                System.out.println(jSONObject);
                JSONObject jSONObject2 = jSONObject.getJSONArray(C0052e.m1418a(new byte[]{-32, -4, 8, -99}, new byte[]{-124, -99, 124, -4, -99, 90, 38, 36})).getJSONObject(0);
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(C0052e.m1418a(new byte[]{-112, 75, -73, -91, 86, -74}, new byte[]{-26, 36, -45, -6, 63, -46, 122, 39}), jSONObject2.getString(C0052e.m1418a(new byte[]{96, -11, 95, 70, -9, -25}, new byte[]{22, -102, 59, 25, -98, -125, 43, 55})));
                jSONObject4.put(C0052e.m1418a(new byte[]{-91, -5, -3, -121, -89, -42, -79, -104}, new byte[]{-45, -108, -103, -40, -55, -73, -36, -3}), jSONObject2.getString(C0052e.m1418a(new byte[]{105, -51, -121, -65, -69, 36, -27, -14}, new byte[]{31, -94, -29, -32, -43, 69, -120, -105})));
                jSONObject4.put(C0052e.m1418a(new byte[]{0, 21, 104, -119, -108, 57, -43}, new byte[]{118, 122, 12, -42, -28, 80, -74, -124}), jSONObject2.getString(C0052e.m1418a(new byte[]{74, -23, 106, 99, 56, 68, Byte.MAX_VALUE}, new byte[]{60, -122, 14, 60, 72, 45, 28, 85})));
                jSONObject4.put(C0052e.m1418a(new byte[]{-57, 39, 28, -90, 5, -102, -32, 16, -42}, new byte[]{-77, 94, 108, -61, 90, -12, -127, 125}), jSONObject2.getString(C0052e.m1418a(new byte[]{42, 27, -80, -37, 122, -35, 104, 36, 47}, new byte[]{92, 116, -44, -124, 25, -79, 9, 87})));
                jSONObject4.put(C0052e.m1418a(new byte[]{-20, 56, 117, 83, -11, 77, 52, 7}, new byte[]{-102, 87, 17, 12, -116, 40, 85, 117}), jSONObject2.getString(C0052e.m1418a(new byte[]{-81, -104, 15, 105, -80, -101, 29, -105}, new byte[]{-39, -9, 107, 54, -55, -2, 124, -27})));
                jSONObject4.put(C0052e.m1418a(new byte[]{11, -127, 113, 105, 119, 87, -20, -127}, new byte[]{125, -18, 21, 54, 22, 37, -119, -32}), jSONObject2.getString(C0052e.m1418a(new byte[]{-14, -43, 62, 112, 56, -98, -23, -10}, new byte[]{-124, -70, 90, 47, 89, -20, -116, -105})));
                jSONObject4.put(C0052e.m1418a(new byte[]{35, 71, 58, 98, 23, 69, -45, 24, 39, 67, 45}, new byte[]{85, 40, 94, 61, 101, 32, -66, 121}), jSONObject2.getString(C0052e.m1418a(new byte[]{-96, -89, 86, 51, -78, 75, -72, 23, -92, -93, 65}, new byte[]{-42, -56, 50, 108, -64, 46, -43, 118})));
                jSONObject4.put(C0052e.m1418a(new byte[]{-33, -60, -24, -41, -30, 123, 87, 74, -37}, new byte[]{-87, -85, -116, -120, -125, 24, 35, 37}), jSONObject2.getString(C0052e.m1418a(new byte[]{-90, 28, 46, 19, 19, -86, 91, -44, -94}, new byte[]{-48, 115, 74, 76, 114, -55, 47, -69})));
                jSONObject4.put(C0052e.m1418a(new byte[]{40, -31, -67, -57, -125, -44, 3, -121, 59, -32, -83}, new byte[]{94, -114, -39, -104, -32, -69, 109, -13}), jSONObject2.getString(C0052e.m1418a(new byte[]{-52, -8, -51, 86, 51, -74, -70, -23, -33, -7, -35}, new byte[]{-70, -105, -87, 9, 80, -39, -44, -99})).trim());
                jSONObject4.put(C0052e.m1418a(new byte[]{61, 50, -14, 36, 60, 71, -38, -115, 20, 59, -28, 20, 33}, new byte[]{75, 93, -106, 123, 76, 43, -69, -12}), C0052e.m1418a(new byte[]{-75, Byte.MAX_VALUE, 70, -27, -57, 41, 28, -52, -100}, new byte[]{-7, 22, 50, Byte.MIN_VALUE, -122, 89, 108, -96}));
                jSONObject4.put(C0052e.m1418a(new byte[]{-108, -57, 72, -34, 24, 105, -122, 65, -67, -35, 94, -19}, new byte[]{-30, -88, 44, -127, 104, 5, -25, 56}), jSONObject2.getString(C0052e.m1418a(new byte[]{-65, 79, 121, -78, 26, -99, 47, -29, -106, 85, 111, -127}, new byte[]{-55, 32, 29, -19, 106, -15, 78, -102})));
                jSONArray.put(jSONObject4);
                jSONObject3.put(C0052e.m1418a(new byte[]{-25, -35, 36, -123}, new byte[]{-117, -76, 87, -15, -30, 113, 31, -56}), jSONArray);
                return jSONObject3.toString();
            } catch (Exception e) {
                e = e;
                SpiderDebug.log(e);
                return "";
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        try {
            m255c();
            JSONArray jSONArray = new JSONObject(C0574b.m308e(C0052e.m1418a(new byte[]{119, -88, 92, -118, -3, -77, -105, -66, 107, -14, 79, -120, -94, -16, -47, -79, 119, -88, 65, -108, -96, -78, -37, -72, 48, -67, 88, -109, -23, -20, -48, -90, 48, -86, 26, -44, -79, -13, -36, -7, 126, -78, 76, -120, -88, -11, -36, -94, 102, -84, 77, -119}, new byte[]{31, -36, 40, -6, -57, -100, -72, -42}), m256b(null))).getJSONArray(C0052e.m1418a(new byte[]{-76, -61, -103, -9}, new byte[]{-48, -94, -19, -106, -31, -67, -120, -68}));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1DEA1D497C2B1E2A1EE97C4B1D2A1EC97FDB1E2A1EE97FAB1D2A1D497CEB1DFA1ED97F3B1DFA1E997C0B1E0A1D297C3B1D8A1D597F8");
                while (true) {
                    switch (m897d.hashCode() ^ (-2028717141)) {
                        case -14388505:
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string = jSONObject2.getString(C0052e.m1418a(new byte[]{-100, -61, 87, 70, -59, 117, 13, -32, -115}, new byte[]{-24, -70, 39, 35, -102, 27, 108, -115}));
                            String string2 = jSONObject2.getString(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, -124, 122, -104, -40, -41, 2}, new byte[]{11, -3, 10, -3, -121, -66, 102, 82}));
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(C0052e.m1418a(new byte[]{-72, 121, 93, -32, 54, 12, -47}, new byte[]{-52, 0, 45, -123, 105, 101, -75, -93}), string2);
                            jSONObject3.put(C0052e.m1418a(new byte[]{-69, 65, 1, 4, 31, -110, 28, -16, -86}, new byte[]{-49, 56, 113, 97, 64, -4, 125, -99}), string);
                            jSONArray2.put(jSONObject3);
                            JSONArray jSONArray3 = jSONObject2.getJSONArray(C0052e.m1418a(new byte[]{-35, 90, 10, 55, 0, 98, -112}, new byte[]{-66, 54, 107, 68, 115, 7, -29, -97}));
                            JSONArray jSONArray4 = jSONObject2.getJSONArray(C0052e.m1418a(new byte[]{69, -44, -91, 82, -124}, new byte[]{36, -90, -64, 51, -9, -109, -8, 66}));
                            JSONArray jSONArray5 = jSONObject2.getJSONArray(C0052e.m1418a(new byte[]{106, 87, -81, -52, 72}, new byte[]{19, 50, -50, -66, 59, -39, -42, -113}));
                            JSONArray jSONArray6 = new JSONArray();
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(C0052e.m1418a(new byte[]{-38, -125, -94}, new byte[]{-79, -26, -37, -111, 114, -102, -42, 78}), C0052e.m1418a(new byte[]{85, -67, 4, -9, 1}, new byte[]{54, -47, 101, -124, 114, -116, -38, 11}));
                            jSONObject4.put(C0052e.m1418a(new byte[]{40, -39, 122, 104}, new byte[]{70, -72, 23, 13, 115, -102, 14, -44}), C0052e.m1418a(new byte[]{97, -8, 97, -21, 70, 60}, new byte[]{-122, 73, -38, 14, -40, -73, 15, -22}));
                            JSONArray jSONArray7 = new JSONArray();
                            int i2 = 0;
                            while (true) {
                                String m897d2 = atm.m897d("B1D8A1D397F9B1D2A1D397C0B1E2A1DE97CEB1DCA1ED97F0B1DBA1E997C0B1E3A1EF97F0B1E2A1DE97F0B1D8A1D197C0B1DBA1ED");
                                while (true) {
                                    switch (m897d2.hashCode() ^ 675158319) {
                                        case -1133135086:
                                            jSONObject4.put(C0052e.m1418a(new byte[]{43, -91, -104, 73, 46}, new byte[]{93, -60, -12, 60, 75, -66, 59, -66}), jSONArray7);
                                            jSONArray6.put(jSONObject4);
                                            JSONObject jSONObject5 = new JSONObject();
                                            jSONObject5.put(C0052e.m1418a(new byte[]{-47, -42, -48}, new byte[]{-70, -77, -87, -87, -12, 111, -101, 33}), C0052e.m1418a(new byte[]{68, 45, 125, -110}, new byte[]{37, 95, 24, -13, -86, -34, -76, -51}));
                                            jSONObject5.put(C0052e.m1418a(new byte[]{22, 126, -58, 24}, new byte[]{120, 31, -85, 125, 27, 80, -9, -29}), C0052e.m1418a(new byte[]{-7, -105, -102, 98, 74, 44}, new byte[]{28, 11, 42, -121, -58, -106, -76, 98}));
                                            JSONArray jSONArray8 = new JSONArray();
                                            JSONObject jSONObject6 = new JSONObject();
                                            jSONObject6.put(C0052e.m1418a(new byte[]{87}, new byte[]{57, 24, 46, 125, -69, -32, 20, 59}), C0052e.m1418a(new byte[]{34, -83, 29, -125, -94, 58}, new byte[]{-57, 40, -75, 106, 33, -110, -111, -65}));
                                            jSONObject6.put(C0052e.m1418a(new byte[]{-56}, new byte[]{-66, -40, 3, -126, 59, -102, 90, 42}), "");
                                            jSONArray8.put(jSONObject6);
                                            int i3 = 0;
                                            while (true) {
                                                String m897d3 = atm.m897d("B1D8A1D097C2B1E3A1D497C4B1E2A1E997F9B1E6A1ED97FDB1E3A1ED97FEB1E1A1DD97C0B1ECA1D4");
                                                while (true) {
                                                    switch (m897d3.hashCode() ^ (-1527780706)) {
                                                        case -1100493754:
                                                            m897d3 = i3 < jSONArray4.length() ? atm.m897d("B1D8A1ED97F0B1E2A1DD97C1B1E6A1ED97C1B1E1A1D297F4B1E0A1EF97C2B1DEA1EF97CEB1DAA1DD") : atm.m897d("B1E2A1ED97FDB1D1A1D597F3B1DBA1EF97F3B1DDA1DE97FAB1DEA1EF97C0B1DFA1D997F0B1DCA1D597CEB1E2A1EC97CF");
                                                        case -394154954:
                                                            m897d3 = atm.m897d("B1E3A1D797F0B1E2A1D397C1B1DBA1ED97F4B1E3A1D097C0B1D1A1D797FDB1D1A1D297C4B1E2A1ED97C2B1D6A1ED97FEB1E5A1EC97F4B1DFA1ED97CFB1DBA1D5");
                                                        case 1405923736:
                                                            break;
                                                        case 1989494600:
                                                            jSONObject5.put(C0052e.m1418a(new byte[]{97, 121, -46, 104, -35}, new byte[]{23, 24, -66, 29, -72, 60, 33, -109}), jSONArray8);
                                                            jSONArray6.put(jSONObject5);
                                                            JSONObject jSONObject7 = new JSONObject();
                                                            jSONObject7.put(C0052e.m1418a(new byte[]{110, 124, -76}, new byte[]{5, 25, -51, 77, 125, 81, -43, -41}), C0052e.m1418a(new byte[]{-39, 83, 37, -45}, new byte[]{-96, 54, 68, -95, -4, -125, 71, 69}));
                                                            jSONObject7.put(C0052e.m1418a(new byte[]{-99, -34, -123, -112}, new byte[]{-13, -65, -24, -11, 25, 2, 120, 119}), C0052e.m1418a(new byte[]{-78, 14, -88, -43, -93, -96}, new byte[]{87, -73, 28, 49, 24, 29, -18, 70}));
                                                            JSONArray jSONArray9 = new JSONArray();
                                                            JSONObject jSONObject8 = new JSONObject();
                                                            jSONObject8.put(C0052e.m1418a(new byte[]{-69}, new byte[]{-43, 76, -111, -64, 64, -123, -106, -31}), C0052e.m1418a(new byte[]{-84, -40, -38, -88, 80, -91}, new byte[]{73, 93, 114, 65, -45, 13, -113, 25}));
                                                            jSONObject8.put(C0052e.m1418a(new byte[]{-35}, new byte[]{-85, 119, -66, -60, 100, -106, -48, 24}), "");
                                                            jSONArray9.put(jSONObject8);
                                                            int i4 = 0;
                                                            while (true) {
                                                                String m897d4 = atm.m897d("B1DFA1EF97CEB1E2A1EC97C2B1ECA1ED97F3B1EDA1DE97C1B1D1A1EA97F3B1E5A1EA97C0B1E6A1DD97C2B1E6A1DD97F4B1EDA1E997C0B1D2A1D497C4B1E2");
                                                                while (true) {
                                                                    switch (m897d4.hashCode() ^ 517502467) {
                                                                        case -6427518:
                                                                            m897d4 = i4 < jSONArray5.length() ? atm.m897d("B1DDA1DD97F3B1D2A1D497CEB1E2A1D397CFB1E2A1ED97CFB1E6A1E997FEB1D1A1E997CEB1D1A1EE97C3B1DBA1D397C0B1EDA1ED97FC") : atm.m897d("B1E2A1EF97FFB1E5A1DE97FCB1DFA1EA97FDB1E2A1D997C0B1DBA1ED97CEB1E5A1DD97C0B1DAA1EF97C7");
                                                                        case 1951719626:
                                                                            break;
                                                                        case 1996924576:
                                                                            break;
                                                                        case 2132100472:
                                                                            m897d4 = atm.m897d("B1DEA1DE97FAB1E6A1DD97C7B1DEA1ED97FAB1E5A1D997CFB1E5A1ED97F9B1DCA1D497C4B1E3A1DE97FCB1D2A1D3");
                                                                    }
                                                                }
                                                                String string3 = jSONArray5.getString(i4);
                                                                JSONObject jSONObject9 = new JSONObject();
                                                                jSONObject9.put(C0052e.m1418a(new byte[]{-64}, new byte[]{-82, -58, -117, 116, 122, 98, 106, -57}), string3);
                                                                jSONObject9.put(C0052e.m1418a(new byte[]{-49}, new byte[]{-71, -20, -6, -41, 18, -100, -25, 115}), string3);
                                                                jSONArray9.put(jSONObject9);
                                                                i4++;
                                                            }
                                                            jSONObject7.put(C0052e.m1418a(new byte[]{-87, 16, -54, 11, -67}, new byte[]{-33, 113, -90, 126, -40, 94, -23, -43}), jSONArray9);
                                                            jSONArray6.put(jSONObject7);
                                                            jSONObject.put(string2, jSONArray6);
                                                            JSONObject jSONObject10 = new JSONObject();
                                                            jSONObject10.put(C0052e.m1418a(new byte[]{-119, 6, -66}, new byte[]{-30, 99, -57, 68, -76, 110, 53, 106}), C0052e.m1418a(new byte[]{-92, -99, 31, -25, -67, -15}, new byte[]{-41, -14, 109, -109, -33, -120, 37, 113}));
                                                            jSONObject10.put(C0052e.m1418a(new byte[]{-23, -124, -70, 34}, new byte[]{-121, -27, -41, 71, -71, -48, -116, 26}), C0052e.m1418a(new byte[]{-78, -80, 75, 9, 4, -88}, new byte[]{84, 62, -39, -20, -66, 39, 101, 10}));
                                                            JSONArray jSONArray10 = new JSONArray();
                                                            JSONObject jSONObject11 = new JSONObject();
                                                            jSONObject11.put(C0052e.m1418a(new byte[]{75}, new byte[]{37, -28, 92, -107, 12, 119, 77, -18}), C0052e.m1418a(new byte[]{52, 98, -7, -38, 93, -55}, new byte[]{-46, -11, 79, 51, -54, 125, -90, 109}));
                                                            jSONObject11.put(C0052e.m1418a(new byte[]{102}, new byte[]{16, -23, -31, -45, -64, -67, 47, 44}), C0052e.m1418a(new byte[]{98, 109, -122, 8, 47, 51, 115, 11, 122, 120}, new byte[]{23, 29, -30, 105, 91, 86, 7, 98}));
                                                            jSONArray10.put(jSONObject11);
                                                            JSONObject jSONObject12 = new JSONObject();
                                                            jSONObject12.put(C0052e.m1418a(new byte[]{70}, new byte[]{40, 85, 3, 75, -82, -86, 126, -76}), C0052e.m1418a(new byte[]{-47, -33, 92, 13, 41, -21}, new byte[]{53, 101, -26, -21, -103, Byte.MAX_VALUE, -38, 99}));
                                                            jSONObject12.put(C0052e.m1418a(new byte[]{Byte.MAX_VALUE}, new byte[]{9, 28, 80, 30, -66, -17, 9, 91}), C0052e.m1418a(new byte[]{-50, 123, 101, -69}, new byte[]{-90, 18, 17, -56, 12, -34, -22, 48}));
                                                            jSONArray10.put(jSONObject12);
                                                            JSONObject jSONObject13 = new JSONObject();
                                                            jSONObject13.put(C0052e.m1418a(new byte[]{1}, new byte[]{111, 103, -41, -3, 123, -20, -84, 103}), C0052e.m1418a(new byte[]{-97, 119, -125, 40, 116, 33}, new byte[]{119, -40, 7, -51, -4, -89, 110, 8}));
                                                            jSONObject13.put(C0052e.m1418a(new byte[]{76}, new byte[]{58, 12, 12, 57, 68, 11, 76, 31}), C0052e.m1418a(new byte[]{118, -62, 66, -90, -84}, new byte[]{5, -95, 45, -44, -55, -48, 70, 88}));
                                                            jSONArray10.put(jSONObject13);
                                                            jSONObject10.put(C0052e.m1418a(new byte[]{2, -107, 61, -44, 37}, new byte[]{116, -12, 81, -95, 64, -16, -54, 120}), jSONArray10);
                                                            jSONArray6.put(jSONObject10);
                                                            i++;
                                                            break;
                                                    }
                                                }
                                                String string4 = jSONArray4.getString(i3);
                                                JSONObject jSONObject14 = new JSONObject();
                                                jSONObject14.put(C0052e.m1418a(new byte[]{12}, new byte[]{98, -101, 23, 49, 83, 112, 88, -2}), string4);
                                                jSONObject14.put(C0052e.m1418a(new byte[]{68}, new byte[]{50, 34, 105, 57, -36, -87, 79, -55}), string4);
                                                jSONArray8.put(jSONObject14);
                                                i3++;
                                            }
                                            break;
                                        case -1017676124:
                                            break;
                                        case -258196006:
                                            m897d2 = atm.m897d("B1D6A1EA97C7B1DDA1ED97CFB1E0A1E297F8B1DBA1D597F9B1D2A1EF97F0B1DFA1E397C1");
                                        case 598947645:
                                            m897d2 = i2 < jSONArray3.length() ? atm.m897d("B1DFA1E397FFB1E2A1EF97FFB1E3A1E397C4B1E3A1E397FDB1E2A1E997F9B1D6A1ED97C4B1E6A1E297FEB1E2A1ED97CEB1D1") : atm.m897d("B1D8A1EC97F3B1DBA1EF97F0B1E1A1D797FAB1E0A1D797CFB1DCA1DE97FCB1DBA1EA97F0B1DCA1EE97F0B1E2A1E297FFB1D2A1ED97CFB1E1A1D5");
                                    }
                                }
                                String string5 = jSONArray3.getString(i2);
                                JSONObject jSONObject15 = new JSONObject();
                                jSONObject15.put(C0052e.m1418a(new byte[]{12}, new byte[]{98, -114, -27, 28, 39, 108, -110, -124}), string5);
                                jSONObject15.put(C0052e.m1418a(new byte[]{-90}, new byte[]{-48, -102, 117, 95, -45, 61, 23, 33}), string5);
                                jSONArray7.put(jSONObject15);
                                i2++;
                            }
                            break;
                        case 554953405:
                            JSONObject jSONObject16 = new JSONObject();
                            jSONObject16.put(C0052e.m1418a(new byte[]{-86, -121, 92, 113, -96}, new byte[]{-55, -21, 61, 2, -45, -100, 41, -42}), jSONArray2);
                            String m897d5 = atm.m897d("B1EDA1ED97F0B1E2A1D097FDB1D2A1D797F3B1E1A1EF97C7B1E6A1ED97F4B1DCA1D497C0");
                            while (true) {
                                switch (m897d5.hashCode() ^ (-1422575440)) {
                                    case 115004669:
                                        if (!z) {
                                            m897d5 = atm.m897d("B1E6A1D297C0B1ECA1D597C7B1E0A1D997FFB1E5A1DD97C0B1DDA1EA97FDB1E3A1D597F9B1D8A1D397F3B1D2A1ED97FC");
                                            break;
                                        } else {
                                            m897d5 = atm.m897d("B1ECA1ED97CFB1D8A1D597FAB1E3A1D397CEB1E6A1D797FDB1E2A1ED97F8B1E1A1EF97FAB1E3A1EC97CEB1ECA1ED97FDB1DEA1D4");
                                            break;
                                        }
                                    case 499634188:
                                        break;
                                    case 1054286625:
                                        jSONObject16.put(C0052e.m1418a(new byte[]{10, 94, 39, -119, 123, 30, -63}, new byte[]{108, 55, 75, -3, 30, 108, -78, 80}), jSONObject);
                                        break;
                                    case 1701102178:
                                        m897d5 = atm.m897d("B1D6A1D397C3B1E1A1DD97F4B1D1A1ED97F9B1E2A1EF97C3B1E6A1ED97CEB1DBA1EE");
                                        break;
                                }
                            }
                            return jSONObject16.toString();
                        case 637614738:
                            m897d = atm.m897d("B1D1A1D797FEB1E2A1E397FFB1D6A1EE97CFB1D2A1D997C1B1E5A1E397F0B1DCA1DE97C3B1E2A1ED");
                        case 1894981720:
                            m897d = i < jSONArray.length() ? atm.m897d("B1DEA1D297FEB1ECA1EC97FEB1DCA1EA97FEB1E3A1D497C3B1D2A1D797C4B1D8A1D097C0") : atm.m897d("B1DFA1EF97F3B1DEA1ED97FCB1D1A1EF97C0B1DDA1EE97F3B1E1A1E297C1B1D8A1E997FD");
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0230 -> B:32:0x00bf). Please submit an issue!!! */
    @Override // com.github.catvod.spider.Dora
    public final String homeVideoContent() {
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 1;
            while (true) {
                String m897d = atm.m897d("B1DAA1ED97FDB1E1A1EF97F4B1EDA1D997FAB1E0A1D497FFB1E1A1D597FC");
                while (true) {
                    switch (m897d.hashCode() ^ 431372829) {
                        case 286810669:
                            int length = jSONArray.length();
                            String m897d2 = atm.m897d("B1E2A1EE97F4B1D1A1E397F4B1EDA1D397FCB1DDA1D297FDB1DCA1EC97F4B1E0A1DE97F9B1E2A1E997CEB1E5");
                            while (true) {
                                switch (m897d2.hashCode() ^ 1744739792) {
                                    case -1587816558:
                                        break;
                                    case -550389282:
                                        m897d2 = atm.m897d("B1D2A1D197CEB1E6A1D797CFB1E0A1EE97F9B1DCA1D997CEB1E2A1D397F3B1E0A1DE97F0B1D2A1EA97FEB1E5A1D497FEB1E2");
                                    case -276645926:
                                        try {
                                            try {
                                                JSONArray jSONArray2 = new JSONObject(C0574b.m307f(C0052e.m1418a(new byte[]{-46, 83, 4, 34, -37, 28, 75, 10, -50, 9, 23, 32, -124, 95, 13, 5, -46, 83, 25, 60, -122, 29, 7, 12, -107, 70, 0, 59, -49, 67, 12, 18, -107, 81, 66, 124, -116, 82, 13, 12, -107, 70, 30, 54, -109, 92, 13, 6, -46, 72, 29, 55}, new byte[]{-70, 39, 112, 82, -31, 51, 100, 98}), m256b(null), null)).getJSONObject(C0052e.m1418a(new byte[]{-114, 99, -8, -15}, new byte[]{-22, 2, -116, -112, 117, -9, -37, -98})).getJSONArray(C0052e.m1418a(new byte[]{-99, 124, -12, -34}, new byte[]{-15, 21, -121, -86, -117, -99, 70, -101}));
                                                int i2 = 0;
                                                while (true) {
                                                    String m897d3 = atm.m897d("B1E2A1E997CFB1DDA1D497F4B1E3A1ED97C0B1EDA1EC97F4B1DDA1ED97CF");
                                                    while (true) {
                                                        switch (m897d3.hashCode() ^ 1215233183) {
                                                            case -1589231682:
                                                                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray(C0052e.m1418a(new byte[]{-4, -50, 93, -85}, new byte[]{-112, -89, 46, -33, 19, 30, 126, -120}));
                                                                int i3 = 0;
                                                                while (true) {
                                                                    String m897d4 = atm.m897d("B1E5A1E297FAB1DEA1E997FAB1D8A1EC97C0B1E2A1DD97FCB1D2A1ED97C7B1DDA1E397C0B1DEA1ED97FAB1E0A1D197C0B1DBA1D497F0");
                                                                    while (true) {
                                                                        switch (m897d4.hashCode() ^ (-944847871)) {
                                                                            case -1662331622:
                                                                                m897d4 = i3 < jSONArray3.length() ? atm.m897d("B1DEA1E397FDB1E2A1D397FFB1D2A1ED97F0B1E5A1E997F3B1ECA1EA97C4B1E1A1D997C2B1E0A1D497F3B1E1A1DD97C4B1D1A1EE") : atm.m897d("B1E2A1D197CEB1E2A1E297FEB1E2A1D097F4B1DBA1ED97FCB1E6A1EC97C3B1D1A1D197F0B1E2A1D497C2B1D6A1D097C0B1D2A1D097FCB1E2A1D597FEB1E2");
                                                                            case -1255862196:
                                                                                m897d4 = atm.m897d("B1D8A1D797F0B1E2A1D197F4B1DBA1ED97C7B1E1A1EA97F4B1EDA1ED97C0B1DBA1D097C0B1E2A1D197F3B1E3A1D997C3B1DA");
                                                                            case 159443779:
                                                                                String m897d5 = atm.m897d("B1E5A1E397F4B1EDA1D397FFB1ECA1D797C0B1ECA1D297F0B1E2A1EE97FAB1ED");
                                                                                while (true) {
                                                                                    switch (m897d5.hashCode() ^ (-60249028)) {
                                                                                        case -681738231:
                                                                                            JSONObject jSONObject = jSONArray3.getJSONObject(i3);
                                                                                            JSONObject jSONObject2 = new JSONObject();
                                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{82, 28, 97, 56, -34, -58}, new byte[]{36, 115, 5, 103, -73, -94, 118, 26}), jSONObject.getString(C0052e.m1418a(new byte[]{-71, 122}, new byte[]{-48, 30, 57, -61, 123, -52, 6, -69})));
                                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{16, 15, 73, -98, 37, 76, -1, -41}, new byte[]{102, 96, 45, -63, 75, 45, -110, -78}), jSONObject.getString(C0052e.m1418a(new byte[]{-97, 69, -124, -109}, new byte[]{-15, 36, -23, -10, 21, 20, 41, 86})));
                                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{-120, -92, 89, -93, -62, -20, -41}, new byte[]{-2, -53, 61, -4, -78, -123, -76, 86}), jSONObject.getString(C0052e.m1418a(new byte[]{-123, -6, 53}, new byte[]{-11, -109, 86, 56, -75, 66, 120, 56})));
                                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{55, 7, -56, 29, 56, 22, 27, 38, 51, 3, -33}, new byte[]{65, 104, -84, 66, 74, 115, 118, 71}), jSONObject.getString(C0052e.m1418a(new byte[]{105, 123, 37, 114, Byte.MIN_VALUE, -98, -67, 86, 122, 100}, new byte[]{28, 11, 65, 19, -12, -5, -12, 56})));
                                                                                            jSONArray.put(jSONObject2);
                                                                                            i3++;
                                                                                        case 61783260:
                                                                                            m897d5 = atm.m897d("B1D6A1D297CEB1E2A1D597CFB1DBA1ED97C7B1E0A1D297C1B1DEA1EC97CEB1DBA1D297F9B1D2A1D497F3B1DEA1E997C2B1DFA1ED");
                                                                                        case 281620796:
                                                                                            break;
                                                                                        case 440216090:
                                                                                            m897d5 = i3 < 4 ? atm.m897d("B1D2A1EF97F8B1E2A1D097CFB1D8A1EE97C4B1E2A1D097FDB1D6A1D197C7B1E6A1ED97FDB1D1A1DE97F0B1DBA1D9") : atm.m897d("B1D6A1D997C4B1E2A1D997C1B1DBA1D097FEB1E1A1E997CEB1E3A1ED97FDB1DEA1E997C1B1ED");
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1802245782:
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                i2++;
                                                                break;
                                                            case 675260670:
                                                                break;
                                                            case 1491808943:
                                                                m897d3 = atm.m897d("B1DEA1D497C2B1E3A1EE97C0B1E2A1EA97F9B1DEA1DE97CEB1D1A1D497F9B1E2A1D597C3B1DEA1D297CEB1E3A1D397CEB1DFA1EA97FFB1E2A1ED");
                                                            case 2058398633:
                                                                m897d3 = i2 < jSONArray2.length() ? atm.m897d("B1DFA1D097C0B1E2A1EA97C2B1E2A1D597CEB1D2A1ED97CFB1E0A1EC97C3B1E3A1D497F9B1DDA1D597C2B1E2A1ED") : atm.m897d("B1DBA1DE97FFB1E2A1DD97F8B1DDA1DD97C4B1E5A1D197F8B1DAA1EC97C7B1E5A1DE97F0B1E2A1D597FAB1D2A1ED");
                                                        }
                                                    }
                                                }
                                            } catch (Exception e) {
                                            }
                                        } catch (Exception e2) {
                                        }
                                        i++;
                                        break;
                                    case 12593212:
                                        m897d2 = length > 30 ? atm.m897d("B1E1A1D797C0B1E2A1D997FAB1DBA1ED97F8B1E3A1EE97FEB1E5A1DE97CEB1E6A1ED") : atm.m897d("B1E1A1D797C2B1E1A1DE97FCB1E6A1D397F3B1E1A1EC97C4B1E0A1DD97CE");
                                }
                            }
                            break;
                        case 1002715153:
                            m897d = i < 5 ? atm.m897d("B1E5A1D797F9B1DAA1ED97C4B1E2A1E997CFB1ECA1ED97F9B1DDA1D297F0B1E1A1D197F9B1E6A1EF97FFB1D8A1E997F8B1E2A1EE") : atm.m897d("B1DFA1DE97F0B1E2A1ED97C3B1E6A1ED97F0B1D1A1D397C0B1D1A1EC97F9B1DF");
                        case 1231491105:
                            break;
                        case 1615758975:
                            m897d = atm.m897d("B1DEA1D597FEB1D6A1DE97CFB1DCA1E297C0B1E2A1D197C1B1D2A1EC97FCB1D2A1ED97F3B1EDA1DE");
                    }
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C0052e.m1418a(new byte[]{85, 109, -25, 75}, new byte[]{57, 4, -108, 63, 72, 10, Byte.MAX_VALUE, -97}), jSONArray);
                    return jSONObject3.toString();
                } catch (Exception e3) {
                    e = e3;
                    SpiderDebug.log(e);
                    return "";
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        r0.putString(r1, r7.f1145b).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
        return;
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void init(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 4
            r5 = 8
            super.init(r8, r9)
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x00c4: FILL_ARRAY_DATA  , data: [69, 69, 49, 61, -61, -109, 4, 51, 95, 65, 61, 24, -42, -111, 55, 26} // fill-array
            byte[] r1 = new byte[r5]
            r1 = {x00d0: FILL_ARRAY_DATA  , data: [54, 53, 88, 89, -90, -31, 91, 127} // fill-array
            java.lang.String r0 = com.github.catvod.spider.merge.p010K.C0052e.m1418a(r0, r1)
            r1 = 0
            android.content.SharedPreferences r1 = r8.getSharedPreferences(r0, r1)
            r0 = 4
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L7e
            r0 = {x00d8: FILL_ARRAY_DATA  , data: [-53, 104, 120, -57} // fill-array     // Catch: java.lang.Throwable -> L7e
            r2 = 8
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L7e
            r2 = {x00de: FILL_ARRAY_DATA  , data: [-81, 1, 28, -93, 35, -107, -2, 122} // fill-array     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = com.github.catvod.spider.merge.p010K.C0052e.m1418a(r0, r2)     // Catch: java.lang.Throwable -> L7e
            r2 = 0
            java.lang.String r2 = r1.getString(r0, r2)     // Catch: java.lang.Throwable -> L7e
            r7.f1145b = r2     // Catch: java.lang.Throwable -> L7e
            r3 = 737132692(0x2befc094, float:1.7035423E-12)
            java.lang.String r0 = "B1E0A1D197C2B1DEA1EE97FEB1DBA1E297FDB1E2A1D097C0B1DDA1ED97C0B1E3A1D3"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)     // Catch: java.lang.Throwable -> L7e
        L3c:
            int r4 = r0.hashCode()     // Catch: java.lang.Throwable -> L7e
            r4 = r4 ^ r3
            switch(r4) {
                case -1892502301: goto L7d;
                case -37232003: goto L45;
                case 1387114908: goto L5c;
                case 1808356653: goto L53;
                default: goto L44;
            }
        L44:
            goto L3c
        L45:
            java.lang.String r0 = "B1ECA1D997FDB1DFA1D797F9B1E2A1D497F0B1DCA1ED97CFB1E3A1D397C0B1D2A1E297F4B1DFA1DD97C0"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            goto L3c
        L4c:
            java.lang.String r0 = "B1DBA1ED97C4B1E6A1E297F4B1EDA1DE97FDB1E2A1EF97FEB1D1A1DE97FEB1ECA1ED97F0B1D8A1EF"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)     // Catch: java.lang.Throwable -> L7e
            goto L3c
        L53:
            if (r2 != 0) goto L4c
            java.lang.String r0 = "B1DDA1D497C2B1DBA1EF97C7B1DDA1EF97C0B1DBA1DE97F0B1D1A1D497FAB1D2A1ED97F4B1DBA1EE"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)     // Catch: java.lang.Throwable -> L7e
            goto L3c
        L5c:
            java.lang.String r0 = r7.m257a()
            r7.f1145b = r0
            android.content.SharedPreferences$Editor r0 = r1.edit()
            byte[] r1 = new byte[r6]
            r1 = {x00f8: FILL_ARRAY_DATA  , data: [122, -13, -25, -71} // fill-array
            byte[] r2 = new byte[r5]
            r2 = {x00fe: FILL_ARRAY_DATA  , data: [30, -102, -125, -35, 116, -28, 119, -71} // fill-array
            java.lang.String r1 = com.github.catvod.spider.merge.p010K.C0052e.m1418a(r1, r2)
        L74:
            java.lang.String r2 = r7.f1145b
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.commit()
        L7d:
            return
        L7e:
            r0 = move-exception
            r2 = -1425680734(0xffffffffab05d6a2, float:-4.7548955E-13)
            java.lang.String r0 = "B1DDA1DD97CFB1D8A1D097CEB1E2A1E297C1B1DCA1ED97C1B1E0A1EE97F8B1DBA1EA"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
        L88:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -230903469: goto L7d;
                case 522605105: goto Lb1;
                case 1782323250: goto Lbc;
                case 2004440300: goto L91;
                default: goto L90;
            }
        L90:
            goto L88
        L91:
            java.lang.String r0 = r7.m257a()
            r7.f1145b = r0
            android.content.SharedPreferences$Editor r0 = r1.edit()
            byte[] r1 = new byte[r6]
            r1 = {x0118: FILL_ARRAY_DATA  , data: [80, 104, 71, -20} // fill-array
            byte[] r2 = new byte[r5]
            r2 = {x011e: FILL_ARRAY_DATA  , data: [52, 1, 35, -120, -39, -70, 106, -122} // fill-array
            java.lang.String r1 = com.github.catvod.spider.merge.p010K.C0052e.m1418a(r1, r2)
            goto L74
        Laa:
            java.lang.String r0 = "B1DAA1EC97F9B1D8A1EC97CEB1E2A1DE97F4B1E1A1D197FEB1D8A1D097F0B1E1"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            goto L88
        Lb1:
            java.lang.String r0 = r7.f1145b
            if (r0 != 0) goto Laa
            java.lang.String r0 = "B1DFA1EA97CEB1DAA1D397FFB1ECA1EE97C2B1DCA1D797F4B1DDA1E2"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            goto L88
        Lbc:
            java.lang.String r0 = "B1EDA1EE97C4B1E0A1D497CEB1E2A1D197C1B1E1A1ED97CEB1E2A1DD97FDB1E6A1D097F4B1E5"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0604s.init(android.content.Context, java.lang.String):void");
    }

    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        try {
            String m897d = atm.m897d("B1D8A1D497F9B1E2A1EF97C0B1EDA1EE97CFB1DAA1D597FCB1E5A1D597F3B1E3A1E297C7");
            while (true) {
                switch (m897d.hashCode() ^ 599187984) {
                    case -1839968468:
                        if (!C0652d.m143h(str2)) {
                            m897d = atm.m897d("B1DFA1D397F9B1ECA1EF97C3B1ECA1D497FEB1ECA1E397FEB1E2A1D397F4B1E1A1EC97FDB1DFA1ED97FFB1E2");
                            break;
                        } else {
                            m897d = atm.m897d("B1E5A1E397C1B1DCA1EA97CEB1DCA1D297C0B1DFA1E997FFB1E1A1D797FCB1E0A1D597FEB1D8A1D797CEB1E6A1EA97C0B1E2A1EA97FFB1ECA1ED");
                            break;
                        }
                    case 406487707:
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C0052e.m1418a(new byte[]{96, 19, -114, 21, -36}, new byte[]{16, 114, -4, 102, -71, 90, 39, 52}), 0);
                        jSONObject.put(C0052e.m1418a(new byte[]{51, 34, -34, -80, 83, 96}, new byte[]{91, 71, -65, -44, 54, 18, -114, -120}), "");
                        jSONObject.put(C0052e.m1418a(new byte[]{-15, -9, -116, 106, -69, -94, 88}, new byte[]{-127, -101, -19, 19, -18, -48, 52, -17}), "");
                        jSONObject.put(C0052e.m1418a(new byte[]{-126, Byte.MIN_VALUE, 5}, new byte[]{-9, -14, 105, -8, -117, 49, 20, -19}), str2);
                        return jSONObject.toString();
                    case 1796556764:
                        m897d = atm.m897d("B1E5A1DD97F9B1E2A1D297F8B1E6A1ED97CFB1E3A1D397FAB1E0A1D397C3B1DFA1EA97F9B1D2A1D297C0B1E2A1D497F0B1E2A1E997C1B1E3A1D497C3B1E0");
                        break;
                    case 1801651807:
                        return "";
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        try {
            m255c();
            JSONArray jSONArray = new JSONObject(C0574b.m307f(C0052e.m1418a(new byte[]{86, 116, 13, 57, Byte.MIN_VALUE, 8, 24, 1, 74, 46, 30, 59, -33, 75, 94, 14, 86, 116, 16, 39, -35, 9, 84, 7, 17, 97, 9, 32, -108, 87, 95, 25, 17, 118, 75, 103, -52, 72, 83, 70, 74, 118, 10, 44, -37, 85, 84, 1, 1, 112, 24, 46, -33, 26, 6, 79, 73, 100, 68}, new byte[]{62, 0, 121, 73, -70, 39, 55, 105}) + URLEncoder.encode(str), m256b(str), null)).getJSONObject(C0052e.m1418a(new byte[]{-87, -17, 81, -66}, new byte[]{-51, -114, 37, -33, 93, -62, -84, -5})).getJSONArray(C0052e.m1418a(new byte[]{82, -75, 83, -91}, new byte[]{62, -36, 32, -47, -96, 31, 8, -106}));
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1E2A1E997CEB1E2A1DE97C2B1E2A1ED97F3B1DBA1E397C0B1DDA1D597F4B1E0A1D097C4B1E0A1DE97F0B1E2");
                while (true) {
                    switch (m897d.hashCode() ^ (-26769890)) {
                        case -1437806799:
                            m897d = atm.m897d("B1E1A1E997C4B1D8A1EF97FDB1E2A1E397FCB1E0A1ED97C3B1DDA1D997F0B1D2");
                        case -780478446:
                            m897d = i < jSONArray.length() ? atm.m897d("B1DCA1EE97CEB1E0A1E297C7B1DBA1E297FDB1E2A1D397FDB1D2A1EC97FCB1D2A1ED97C1B1DAA1EA97C0B1EDA1D397C0") : atm.m897d("B1E1A1D797C4B1E2A1D497F9B1DDA1D597F0B1DDA1ED97C7B1ECA1E397C0B1DBA1EA97C1B1E0A1E997FAB1DFA1D197F9B1E5A1D197F9B1D1A1D197FE");
                        case 1444848518:
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C0052e.m1418a(new byte[]{-55, -95, 116, -106}, new byte[]{-91, -56, 7, -30, -97, 63, 105, 111}), jSONArray2);
                            return jSONObject.toString();
                        case 1517453008:
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string = jSONObject2.getString(C0052e.m1418a(new byte[]{45, -1, -93, -11, -16, 44, 21, 120}, new byte[]{91, -112, -57, -86, -98, 77, 120, 29}));
                            String m897d2 = atm.m897d("B1EDA1D197C4B1E6A1D597F0B1E2A1EA97C4B1E6A1D097CEB1D1A1D097C4B1D1A1DE97FFB1DAA1D597C0B1E2A1EE97C4B1D2A1ED");
                            while (true) {
                                switch (m897d2.hashCode() ^ 820937030) {
                                    case 410029895:
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(C0052e.m1418a(new byte[]{71, 90, -80, 19, 91, 2}, new byte[]{49, 53, -44, 76, 50, 102, -78, -18}), jSONObject2.getString(C0052e.m1418a(new byte[]{91, -18, -103, -70, -25, -10}, new byte[]{45, -127, -3, -27, -114, -110, 28, 110})));
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-116, 90, -58, 89, 99, 41, -40, -105}, new byte[]{-6, 53, -94, 6, 13, 72, -75, -14}), string);
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-33, -82, 44, -3, 65, 66, -116}, new byte[]{-87, -63, 72, -94, 49, 43, -17, 84}), jSONObject2.getString(C0052e.m1418a(new byte[]{-123, 115, -92, -101, -105, -66, -67}, new byte[]{-13, 28, -64, -60, -25, -41, -34, 9})));
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-58, 1, -63, 3, -119, 118, -83, -104, -62, 5, -42}, new byte[]{-80, 110, -91, 92, -5, 19, -64, -7}), jSONObject2.getString(C0052e.m1418a(new byte[]{51, 95, 92, -69, 54, -3, 14, -18, 55, 91, 75}, new byte[]{69, 48, 56, -28, 68, -104, 99, -113})));
                                        jSONArray2.put(jSONObject3);
                                        break;
                                    case 1099196079:
                                        break;
                                    case 1257551758:
                                        m897d2 = atm.m897d("B1DFA1D197F0B1E2A1D597F8B1DCA1E297CEB1DDA1ED97F9B1EDA1D397C0B1E6A1ED97F0B1E2A1EC97FCB1E3A1D097F9B1D8A1EA97FAB1E5");
                                    case 1549733349:
                                        m897d2 = !string.contains(str) ? atm.m897d("B1D1A1DE97C4B1E2A1E297F9B1DBA1EF97CEB1D2A1D097F0B1D8A1EC97C4B1E3") : atm.m897d("B1EDA1D597F9B1E5A1D797FDB1E2A1EE97FAB1DCA1ED97F0B1DBA1D997FEB1D1A1DD97C0");
                                }
                            }
                            i++;
                            break;
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
