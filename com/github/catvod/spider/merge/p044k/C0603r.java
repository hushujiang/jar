package com.github.catvod.spider.merge.p044k;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p048m.C0620d;
import com.github.catvod.spider.merge.p050n.C0629f;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.r */
/* loaded from: classes.dex */
public final class C0603r extends Spider {

    /* renamed from: g */
    private static final String f1137g;

    /* renamed from: h */
    private static String f1138h;

    /* renamed from: a */
    private JSONObject f1139a;

    /* renamed from: b */
    private JSONObject f1140b;

    /* renamed from: c */
    private final Pattern f1141c = Pattern.compile(C0052e.m1418a(new byte[]{114, -89, 3, 125, 63, -4, 42, -22, 57, -8, 83, 35, 50, -89, 111, -38}, new byte[]{93, -45, 122, 13, 90, -45, 2, -74}));

    /* renamed from: d */
    private final Pattern f1142d = Pattern.compile(C0052e.m1418a(new byte[]{-79, -82, 84, -66, 105, 50, -71, -18, -74, -106, 85, -31, 33, 117, -67, -75, -13, -90}, new byte[]{-98, -54, 49, -54, 8, 91, -43, -63}));

    /* renamed from: e */
    private final Pattern f1143e = Pattern.compile(C0052e.m1418a(new byte[]{-51, -7, 16, -54, 26, 64, -49, 41, -122, -94, 85, -122, 75, 51, -125, 94, -53, -92, 84, -9, 7, 68, -50, 91, -118, -3, 17, -57}, new byte[]{-30, -119, 124, -85, 99, 111, -25, 117}));

    /* renamed from: f */
    private final Pattern f1144f = Pattern.compile(C0052e.m1418a(new byte[]{-71, 7, 37, -18, -62, 94, -5, -119, -59, 95, 100, -81, -35, 5, -66, -71}, new byte[]{-106, 116, 77, -127, -75, 113, -45, -43}));

    static {
        String m897d = atm.m897d("B1DEA1E297F9B1E2A1ED97F9B1D2A1ED97FEB1DDA1D997F8B1D2A1ED97F9B1E6A1D297C0");
        while (true) {
            switch ((m897d.hashCode() ^ 746) ^ (-2100223417)) {
                case -1348902403:
                    return;
                case 347895899:
                    f1138h = "";
                    m897d = atm.m897d("B1D6A1D497CEB1E2A1EA97F3B1DFA1ED97CEB1E0A1D397C0B1DBA1DE97C3B1E6A1D997FEB1E2A1DD97C4B1D1");
                    break;
                case 1840818873:
                    f1137g = C0052e.m1418a(new byte[]{72, -7, -33, 75, -10, -101, -95, 12, 84, -5, -123, 87, -20, -61, -8, 74, 79, -93, -56, 88}, new byte[]{32, -115, -85, 59, -123, -95, -114, 35});
                    m897d = atm.m897d("B1D1A1EA97CEB1E2A1EE97C7B1D6A1E997CFB1DAA1D397C7B1ECA1ED97C7B1DFA1EA97FFB1E0A1E997F3B1E3A1E297F3B1DCA1DD97C0");
                    break;
            }
        }
    }

    /* renamed from: a */
    protected static HashMap<String, String> m261a() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1D2A1D097C0B1E6A1EC97CEB1E2A1EF97C2B1DFA1EC97C4B1E0A1E997F4B1E3A1EC97C3");
        while (true) {
            switch ((m897d.hashCode() ^ 176) ^ 1661426226) {
                case -1689979555:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E5A1D997FFB1DEA1D497FCB1DBA1EA97FCB1DDA1D497C4B1E2A1E397F9B1DCA1D397F3B1DFA1ED");
                    break;
                case 213137471:
                    hashMap.put(C0052e.m1418a(new byte[]{41, -22, 62, 81, -13, -9, 39}, new byte[]{123, -113, 88, 52, -127, -110, 85, 95}), f1137g);
                    m897d = atm.m897d("B1ECA1EA97CFB1D6A1D097CEB1E2A1DE97C2B1DBA1D397FFB1DBA1D097CFB1E6A1ED97C1B1ECA1D097C0");
                    break;
                case 1739349286:
                    hashMap.put(C0052e.m1418a(new byte[]{84, 49, -59, 55, -20, 64, -84, 90, 111, 54}, new byte[]{1, 66, -96, 69, -63, 1, -53, 63}), C0052e.m1418a(new byte[]{-117, -126, 125, -23, -2, 44, 80, 117, -13, -61, 55, -96, -70, 23, 88, 52, -94, -126, 112, -13, -78, 14, 101, 122, -9, -35, 41, -80, -87, 96, 102, 51, -88, -37, 51, -69, -78, 56, 7, 110, -17, -51, 70, -16, -30, 44, 84, 13, -93, -113, 76, -23, -26, 111, 4, 105, -15, -61, 52, -74, -78, 104, 122, 18, -110, -96, 75, -84, -78, 44, 88, 49, -93, -51, 64, -27, -15, 43, 94, 115, -26, -82, 111, -14, -3, 45, 84, 117, -9, -35, 53, -82, -94, 110, 4, 106, -10, -40, 41, -74, -96, 96, 98, 59, -96, -116, 117, -23, -67, 117, 2, 109, -24, -34, 49}, new byte[]{-58, -19, 7, Byte.MIN_VALUE, -110, 64, 49, 90}));
                    m897d = atm.m897d("B1E6A1E397F9B1DCA1D997F9B1E6A1E397FFB1E0A1DE97C3B1E0A1EE97C1B1DEA1D597FFB1DCA1EE97C7B1DBA1ED");
                    break;
                case 1903289975:
                    return hashMap;
            }
        }
    }

    /* renamed from: b */
    private static String m260b(Pattern pattern, String str) {
        String m897d = atm.m897d("B1D2A1E397F9B1E2A1DE97F8B1DEA1D097FDB1DBA1EA97FEB1D6A1D397F3B1D8A1D097FEB1DAA1E297FCB1E6A1ED");
        while (true) {
            switch (m897d.hashCode() ^ 48288034) {
                case -1501546725:
                    if (pattern != null) {
                        m897d = atm.m897d("B1DCA1E297F0B1E2A1E297FAB1ECA1D097FCB1EDA1D597FEB1ECA1ED97C1B1D6A1E397C0");
                        break;
                    } else {
                        m897d = atm.m897d("B1E5A1DD97C1B1DDA1D597C0B1E2A1ED97F8B1DCA1ED97F4B1E6A1D797C4B1D2A1E297C7B1DDA1D497C0");
                        break;
                    }
                case -898550999:
                    try {
                        Matcher matcher = pattern.matcher(str);
                        String m897d2 = atm.m897d("B1E6A1D097FAB1E0A1D397C1B1ECA1EC97C2B1D6A1EA97FDB1E2A1D097CFB1E6A1ED97F0B1E0A1ED97C0");
                        while (true) {
                            switch (m897d2.hashCode() ^ (-565957536)) {
                                case -1927169879:
                                    if (!matcher.find()) {
                                        m897d2 = atm.m897d("B1E1A1D297FDB1DFA1E297C4B1E0A1EA97F8B1EDA1DE97F0B1DFA1D197FEB1E2A1EE97FDB1D1A1D597FFB1E2A1ED97FEB1DAA1D397C0B1D8A1D497C7");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1E2A1D097CEB1E2A1D297C4B1E3A1EE97F0B1ECA1EE97F0B1DCA1DE97F9B1E2A1E997F9B1D1A1D797FAB1E2A1ED97FFB1D6A1E297FDB1DCA1D4");
                                        break;
                                    }
                                case -562440916:
                                    return matcher.group(1).trim();
                                case 1343291095:
                                    m897d2 = atm.m897d("B1D1A1D597FFB1DCA1D397C0B1DFA1EA97F8B1E5A1EA97FFB1E6A1D497F9B1E5A1E3");
                                    break;
                                case 1470317319:
                                    return str;
                            }
                        }
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                        return str;
                    }
                    break;
                case 506047358:
                    return str;
                case 892129689:
                    m897d = atm.m897d("B1DCA1E397FFB1DEA1D197FCB1D2A1D297FEB1E2A1D097CEB1E2A1DD97C4B1E3");
                    break;
            }
        }
    }

    /* renamed from: c */
    private static String m259c(String str) {
        JSONObject jSONObject;
        String m179f = C0629f.m179f(str, m258d());
        String m897d = atm.m897d("B1E2A1DE97CEB1E2A1D597F9B1E1A1ED97F3B1D8A1EE97C7B1DDA1E297FDB1DDA1ED");
        while (true) {
            switch (m897d.hashCode() ^ 1229238909) {
                case -680684890:
                    m897d = atm.m897d("B1E3A1E397C0B1E3A1D597F3B1D2A1DD97C0B1DEA1E397C1B1EDA1EA97FCB1DCA1EC97F8B1D2A1D997CE");
                    break;
                case 18750277:
                    if (!m179f.contains(C0052e.m1418a(new byte[]{-104, -117, 36, 83, -55, -27, 90, 0, -3, -61, 24, 61}, new byte[]{125, 37, -83, -74, 76, 77, -68, -93}))) {
                        m897d = atm.m897d("B1E2A1E297F4B1E5A1D197C2B1ECA1D297F0B1E1A1D197CEB1E2A1E397FCB1D8");
                        break;
                    } else {
                        m897d = atm.m897d("B1D8A1DE97FCB1E5A1EE97F0B1D2A1EE97FDB1E2A1D197C7B1DFA1ED97C0B1D1A1ED97FFB1D8");
                        break;
                    }
                case 260918100:
                    try {
                        JSONObject jSONObject2 = null;
                        Iterator<C0293m> it = C0052e.m1414e(m179f).m967p0(C0052e.m1418a(new byte[]{-123, 23, -83, 56, 85, -63}, new byte[]{-10, 116, -33, 81, 37, -75, 4, 116})).iterator();
                        while (true) {
                            String m897d2 = atm.m897d("B1D8A1DE97FCB1DEA1DD97C7B1D8A1E997C7B1DCA1E297CEB1E2A1EC97C0B1DBA1ED97FAB1E0A1D397C0");
                            while (true) {
                                switch (m897d2.hashCode() ^ 1359247165) {
                                    case -1355112571:
                                        m897d2 = it.hasNext() ? atm.m897d("B1DFA1EF97CFB1ECA1D797C2B1EDA1D297FEB1DCA1D097F8B1E3A1EC97C2B1DEA1D597FFB1EDA1D297C0B1DDA1D397FF") : atm.m897d("B1D1A1ED97C7B1D2A1D997FDB1D1A1E297FFB1DBA1E997F9B1E2A1E397C4B1E5");
                                    case -759995674:
                                        String optString = jSONObject2.optString(C0052e.m1418a(new byte[]{-83, -53, 37, 28, 31, 66, -105, 68, -85}, new byte[]{-50, -93, 68, 112, 115, 39, -7, 35}));
                                        String optString2 = jSONObject2.optString(C0052e.m1418a(new byte[]{-32, 18, -51, -106, -103, 108}, new byte[]{-127, 124, -66, -31, -4, 30, 47, -55}));
                                        int i = 100000;
                                        while (true) {
                                            int i2 = i;
                                            String m897d3 = atm.m897d("B1DAA1D297FDB1D8A1EF97C3B1DAA1D197C0B1D8A1D097C0B1E2A1D997C4B1E2A1D797CFB1EDA1EE97C0B1D2A1ED97F3B1DBA1DE97F9B1DAA1D9");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ 414393859) {
                                                    case -2146434263:
                                                        break;
                                                    case -1637591573:
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(optString);
                                                        sb.append("");
                                                        sb.append(i2);
                                                        String m897d4 = atm.m897d("B1D1A1EA97C4B1E2A1D497FAB1DAA1D997C3B1D2A1EC97C3B1ECA1ED97C7B1D1A1D597C0B1DBA1D097C0B1D6A1ED97F9B1ED");
                                                        while (true) {
                                                            switch (m897d4.hashCode() ^ 912979288) {
                                                                case -1741691553:
                                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-54, 92, 106, 89}, new byte[]{-87, 51, 14, 60, -52, -81, -120, 81}), i2);
                                                                    f1138h = C0052e.m1418a(new byte[]{-76, -81, 86, 8, 100, 105, 23, 3, -97, -90, 72, 3, 105, 48}, new byte[]{-21, -55, 35, 102, 7, 13, 121, 92}) + new JSONObject(C0629f.m180e(C0052e.m1418a(new byte[]{47, 58, -112, 58, -125, -25, -99, 8, 36, 47, -108, 62, -109, -75, -45, 9, 33, 59, -118, 41, -108, -77, -100, 68, 40, 35, -53, 32, -125, -98, -45, 87, 51, 45, -116, 43, -90, -72, -64, 78, 33, 55}, new byte[]{71, 78, -28, 74, -16, -35, -78, 39}), jSONObject2.toString(), m258d())).getString(C0052e.m1418a(new byte[]{53, -14, 84, -92, -17, -114, 94, -1}, new byte[]{83, -111, 11, -48, Byte.MIN_VALUE, -27, 59, -111}));
                                                                    return C0629f.m179f(str, m258d());
                                                                case 31122718:
                                                                    break;
                                                                case 564869779:
                                                                    m897d4 = atm.m897d("B1DBA1EC97CEB1E2A1D597FEB1D2A1D597CFB1E2A1D197C0B1DEA1DE97C2B1E2A1ED97FFB1DCA1E397C0");
                                                                case 678581276:
                                                                    m897d4 = C0620d.m202b(sb.toString()).equals(optString2) ? atm.m897d("B1D1A1D297F8B1DDA1D497F0B1DAA1EE97F0B1E2A1D997C3B1DCA1ED97FAB1DAA1EA") : atm.m897d("B1DBA1D297F0B1E2A1E397C1B1E5A1D397C2B1E1A1D397C0B1E2A1ED97FCB1D1A1D197C2B1DFA1EA97FAB1D2A1E3");
                                                            }
                                                        }
                                                        break;
                                                    case 1530606646:
                                                        m897d3 = atm.m897d("B1E6A1D597C2B1ECA1D997FEB1DEA1DE97F9B1E2A1ED97F9B1DBA1ED97FFB1D1A1D397C0B1DAA1EF97F3B1D6A1E297FEB1E0A1D497F3B1DBA1EC97F4");
                                                    case 1819685618:
                                                        m897d3 = i2 <= 999999 ? atm.m897d("B1DAA1D497FCB1E1A1D497C0B1ECA1ED97C7B1DFA1ED97FDB1E2A1EA97F9B1DAA1D797C2B1E2A1ED97FFB1E0") : atm.m897d("B1DAA1EF97F0B1E2A1E297F8B1D2A1ED97C3B1DFA1D097C0B1E3A1ED97C0B1E6A1E297F0B1DDA1D997CEB1E2A1ED97C3B1E2A1ED97F4B1D1A1E397C0B1EDA1D597CEB1E2");
                                                }
                                            }
                                            i = i2 + 1;
                                        }
                                        break;
                                    case -467452075:
                                        m897d2 = atm.m897d("B1D2A1EF97C4B1E2A1D797C2B1E6A1D197FCB1ECA1ED97C2B1DAA1EC97F0B1E1A1DD97C0B1E3A1ED97F0B1DAA1D497F9");
                                    case 172211912:
                                        String trim = it.next().m979d0().trim();
                                        String m897d5 = atm.m897d("B1DAA1D397FDB1E2A1EC97C0B1D8A1DD97F8B1DEA1DD97F8B1DBA1ED97C2B1D1A1DE97FEB1DBA1D497FAB1E5A1D497C0B1ECA1E297C2");
                                        while (true) {
                                            switch (m897d5.hashCode() ^ 326262127) {
                                                case -1959723247:
                                                    jSONObject = jSONObject2;
                                                    break;
                                                case -1867904249:
                                                    m897d5 = trim.startsWith(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, 21, -117, 58, -1, 1, 6, -81}, new byte[]{9, 116, -7, 26, -101, 96, 114, -50})) ? atm.m897d("B1E0A1E997FDB1EDA1D197F3B1E2A1ED97FFB1E2A1D297F9B1E0A1ED97F8B1ECA1E297C4B1E1A1EF97F8B1DAA1D097F3B1D2A1E397C3") : atm.m897d("B1E2A1D797C0B1DDA1D497C7B1DEA1D497C0B1E2A1EC97F4B1D2A1EA97C4B1E2A1ED");
                                                case -969606011:
                                                    jSONObject = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                                                    break;
                                                case -180577626:
                                                    m897d5 = atm.m897d("B1DDA1DD97C0B1E5A1D397F8B1ECA1EE97F8B1E3A1D497FEB1E2A1EF97CEB1ECA1ED97C7B1EDA1E997CEB1D1A1D297FFB1DEA1D3");
                                            }
                                        }
                                        jSONObject2 = jSONObject;
                                        break;
                                }
                            }
                        }
                    } catch (JSONException e) {
                        SpiderDebug.log(e);
                        return m179f;
                    }
                    break;
                case 424878311:
                    break;
            }
        }
        return m179f;
    }

    /* renamed from: d */
    protected static HashMap<String, String> m258d() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1DAA1D097C0B1E2A1D497FCB1DDA1E997C4B1E3A1D997C4B1DCA1E297C0B1D6A1D097C7B1D6A1D597FCB1EC");
        while (true) {
            switch ((m897d.hashCode() ^ 102) ^ 1840592686) {
                case -1133976736:
                    hashMap.put(C0052e.m1418a(new byte[]{-82, 46, 115, -115, -126, -6, -80}, new byte[]{-4, 75, 21, -24, -16, -97, -62, 109}), f1137g);
                    m897d = atm.m897d("B1DAA1E397FFB1DAA1D497FCB1DFA1E997F0B1EDA1E997C2B1D8A1EA97FA");
                    break;
                case -897917497:
                    String m897d2 = atm.m897d("B1E6A1DD97FDB1E2A1EE97FDB1DDA1E297FAB1E0A1D397FFB1D2A1D297C4B1DFA1ED");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1070743765)) {
                            case -1834134923:
                                m897d = atm.m897d("B1DBA1D497C2B1D6A1ED97F9B1E1A1DD97FAB1E1A1D297F0B1E2A1D597FCB1DBA1ED97C4B1DEA1DD97C1B1D6A1D397C0B1ECA1ED97FDB1E5A1D197FC");
                                continue;
                            case 14741218:
                                m897d = atm.m897d("B1DDA1DD97C2B1D6A1D397FDB1E2A1D997C1B1E2A1EF97C0B1D2A1D997FEB1E2A1D097F9");
                                continue;
                            case 1154538325:
                                m897d2 = f1138h.length() > 0 ? atm.m897d("B1E6A1D497FFB1E2A1ED97F4B1EDA1D497C7B1DDA1D197F3B1E0A1D097C4B1E2A1D597C3B1E6A1E297FAB1DFA1ED97C7B1E6A1D0") : atm.m897d("B1DBA1ED97C0B1ECA1EA97C4B1DFA1D797C1B1ECA1D997C0B1DBA1D297F9B1E2A1DE97CFB1E2A1D097F4B1E6");
                            case 1614180472:
                                m897d2 = atm.m897d("B1DBA1EF97C0B1E2A1EE97F8B1D1A1ED97CFB1ECA1D397F9B1ECA1D497F9B1DCA1ED97FAB1D6A1D097FFB1DBA1D497C0");
                        }
                    }
                    break;
                case -865894147:
                    hashMap.put(C0052e.m1418a(new byte[]{97, 9, -89, -83, -40, -65}, new byte[]{34, 102, -56, -58, -79, -38, 59, 85}), f1138h);
                    m897d = atm.m897d("B1DBA1D497C2B1D6A1ED97F9B1E1A1DD97FAB1E1A1D297F0B1E2A1D597FCB1DBA1ED97C4B1DEA1DD97C1B1D6A1D397C0B1ECA1ED97FDB1E5A1D197FC");
                    break;
                case 332372002:
                    hashMap.put(C0052e.m1418a(new byte[]{-17, 30, 119, 64, -58, 37, -30, -104, -44, 25}, new byte[]{-70, 109, 18, 50, -21, 100, -123, -3}), C0052e.m1418a(new byte[]{3, 50, -117, -25, 83, 7, 25, 20, 123, 115, -63, -82, 23, 60, 17, 85, 42, 50, -122, -3, 31, 37, 44, 27, Byte.MAX_VALUE, 109, -33, -66, 4, 75, 47, 82, 32, 107, -59, -75, 31, 19, 78, 15, 103, 125, -80, -2, 79, 7, 29, 108, 43, 63, -70, -25, 75, 68, 77, 8, 121, 115, -62, -72, 31, 67, 51, 115, 26, 16, -67, -94, 31, 7, 17, 80, 43, 125, -74, -21, 92, 0, 23, 18, 110, 30, -103, -4, 80, 6, 29, 20, Byte.MAX_VALUE, 109, -61, -96, 15, 69, 77, 11, 126, 104, -33, -72, 13, 75, 43, 90, 40, 60, -125, -25, 16, 94, 75, 12, 96, 110, -57}, new byte[]{78, 93, -15, -114, 63, 107, 120, 59}));
                    m897d = atm.m897d("B1DCA1DE97FFB1DDA1E297C4B1E1A1EF97F0B1E2A1EA97C3B1D2A1ED97C0B1E1A1D097C0B1DAA1EE97FCB1E6A1D397F0B1E2");
                    break;
                case 352824615:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1DEA1DD97F9B1ECA1E397C1B1DBA1DD97FAB1E1A1E297C0B1D2A1D797F9");
                    break;
                case 1915517272:
                    return hashMap;
            }
        }
    }

    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i;
        int parseInt;
        int i2;
        try {
            String[] strArr = {"", "", "", "", "", "", "", "", "", "", "", ""};
            strArr[0] = str;
            strArr[8] = str2;
            String m897d = atm.m897d("B1D1A1E397C1B1DCA1D097C7B1E0A1ED97C7B1E6A1D797C3B1D8A1E397F0B1ECA1DE97C2B1D8A1E297FD");
            while (true) {
                switch (m897d.hashCode() ^ 622635306) {
                    case -1564416845:
                        if (hashMap == null) {
                            m897d = atm.m897d("B1D2A1ED97C2B1DAA1E997FCB1DEA1ED97F0B1DDA1D997F3B1D1A1DE97FCB1E5A1D397F0B1E2A1E397FEB1E5");
                            break;
                        } else {
                            m897d = atm.m897d("B1E6A1EC97FEB1D8A1EA97F8B1E3A1D797C7B1EDA1D097C2B1E6A1D197FEB1E1A1DE97FEB1E2");
                            break;
                        }
                    case 233154170:
                        m897d = atm.m897d("B1ECA1E397C4B1ECA1EE97FEB1DFA1EF97F4B1E2A1DD97CFB1ECA1E297C0B1E2A1D597C3B1E2A1ED");
                        break;
                    case 1741761595:
                        String m897d2 = atm.m897d("B1D2A1D297CEB1E2A1D497F0B1E6A1EA97FFB1E2A1ED97F3B1E6A1D097C0B1E3A1D997CEB1E2A1EF97F9B1DDA1ED");
                        while (true) {
                            switch (m897d2.hashCode() ^ 1312054777) {
                                case -498442158:
                                    m897d2 = atm.m897d("B1D1A1E997FDB1DDA1EE97C0B1E2A1E997FAB1E6A1ED97F8B1DBA1DD97FFB1E1A1EE");
                                    break;
                                case -428167525:
                                    break;
                                case 549458771:
                                    Iterator<String> it = hashMap.keySet().iterator();
                                    while (true) {
                                        String m897d3 = atm.m897d("B1D8A1D297F3B1D1A1E397C1B1D2A1D097C0B1DAA1EF97F4B1ECA1D297C4B1DBA1D597FDB1DAA1E997C4B1D2A1D097F0");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 897648283) {
                                                case -1880532642:
                                                    m897d3 = it.hasNext() ? atm.m897d("B1E0A1D997CEB1ECA1D097C4B1E6A1E397C0B1E2A1D097FFB1E2A1ED97C0B1E6A1EA97F8B1DEA1E397F0B1D1") : atm.m897d("B1EDA1EA97F8B1E6A1EE97FEB1DCA1E397C3B1EDA1D397F4B1D2A1EC97FDB1E3A1E997C7B1E0A1E3");
                                                case -1394814844:
                                                    m897d3 = atm.m897d("B1E1A1D097C0B1E2A1E297FCB1E5A1D497FAB1DCA1ED97F0B1DCA1ED97C1B1D8A1D797FCB1EDA1EC97F3B1D2A1D397FDB1DBA1D497C0");
                                                case 1328984894:
                                                    break;
                                                case 1769782155:
                                                    break;
                                            }
                                        }
                                        String next = it.next();
                                        strArr[Integer.parseInt(next)] = URLEncoder.encode(hashMap.get(next));
                                    }
                                    break;
                                case 1804713588:
                                    if (hashMap.size() <= 0) {
                                        m897d2 = atm.m897d("B1EDA1D397C1B1D2A1ED97F9B1DDA1EE97F8B1D2A1ED97F9B1E3A1DE97C0B1E2A1D997F8B1E5A1E297C1B1DFA1ED");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1E0A1EE97F0B1D1A1DD97F3B1ECA1D297F9B1D8A1EC97FDB1E2A1D197F8B1E0");
                                        break;
                                    }
                            }
                        }
                        break;
                    case 1818697646:
                        break;
                }
            }
            String m259c = m259c(C0052e.m1418a(new byte[]{-14, -123, -41, 118, -54, 63, 4, 16, -18, -121, -115, 106, -48, 103, 93, 86, -11, -33, -64, 101, -106, 118, 67, 80, -19, -34}, new byte[]{-102, -15, -93, 6, -71, 5, 43, 63}) + TextUtils.join(C0052e.m1418a(new byte[]{-32}, new byte[]{-51, -54, 39, 82, 0, 111, -7, 65}), strArr) + C0052e.m1418a(new byte[]{-17, -38, 36, 6, 85}, new byte[]{-63, -78, 80, 107, 57, 87, 46, -119}));
            C0288h m1414e = C0052e.m1414e(m259c);
            JSONObject jSONObject = new JSONObject();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{100, -10, -95, 109, -116, 95, 5, -110, 97, -5, -24, 123, -89, 117, 5, -53, 116, -9, -81, 114, -111}, new byte[]{17, -102, -113, 30, -8, 42, 108, -65}));
            String m897d4 = atm.m897d("B1E0A1E297C1B1E5A1E297FEB1E2A1EF97FEB1DEA1EC97C7B1D8A1D997C1B1E0A1EA97C4B1E1A1D797F3B1E2A1D997F3B1DAA1E397F0");
            while (true) {
                switch (m897d4.hashCode() ^ 1808968753) {
                    case -640093423:
                        m897d4 = atm.m897d("B1D2A1E997CFB1E5A1DD97C0B1E3A1EA97F3B1E2A1E997F0B1DCA1D797C0");
                        break;
                    case 909898542:
                        if (m967p0.size() != 0) {
                            m897d4 = atm.m897d("B1D2A1E997C3B1DDA1D597FAB1ECA1EE97F0B1E2A1D297C0B1DAA1ED97FAB1ECA1D097F0B1DEA1E997F4B1ECA1ED97F8B1DDA1E997C0");
                            break;
                        } else {
                            m897d4 = atm.m897d("B1D2A1ED97C7B1EDA1EC97F3B1DDA1EE97C3B1DCA1D997F0B1E3A1D397C0B1D1A1D597F9B1E2A1D297FAB1ECA1ED97F8B1DBA1DE97F9B1D8A1D9");
                            break;
                        }
                    case 1047880704:
                        int parseInt2 = Integer.parseInt(str2);
                        i = parseInt2;
                        parseInt = parseInt2;
                        break;
                    case 1546550803:
                        i = -1;
                        int i3 = 0;
                        while (true) {
                            String m897d5 = atm.m897d("B1E6A1D997FFB1E2A1ED97F3B1ECA1D397F9B1D6A1D297FEB1DAA1DD97C0B1E2A1D097C4B1D6A1D7");
                            while (true) {
                                switch (m897d5.hashCode() ^ (-985621010)) {
                                    case -539240115:
                                        m897d5 = i3 < m967p0.size() ? atm.m897d("B1DDA1D997C4B1E2A1EC97C0B1ECA1ED97FAB1D1A1EC97CFB1DEA1E397C0B1DDA1EC97FFB1DAA1EF97F9B1E2A1D497C3B1D6A1EA97C4B1E5A1D397C0") : atm.m897d("B1DAA1EA97FDB1ECA1D297C4B1E3A1D097C1B1E2A1D997CEB1E0A1ED97C3B1DFA1EF97FDB1DDA1D797C2");
                                    case 283919685:
                                        m897d5 = atm.m897d("B1EDA1E397FFB1E2A1DE97F9B1D2A1D197FEB1DEA1EC97F8B1D6A1D797C1B1EC");
                                    case 488589908:
                                        C0293m c0293m = m967p0.get(i3);
                                        C0293m m966q0 = c0293m.m966q0(C0052e.m1418a(new byte[]{69}, new byte[]{36, 117, 55, -111, -118, 107, 118, -122}));
                                        String m897d6 = atm.m897d("B1D2A1EA97CFB1DFA1D197CEB1D6A1DD97CFB1DCA1DE97C0B1D2A1ED97FDB1DFA1EE97C1B1DCA1D197FCB1E2A1D597F8B1DCA1D997F3");
                                        while (true) {
                                            switch (m897d6.hashCode() ^ (-797961299)) {
                                                case -1932507327:
                                                    String m960w0 = m966q0.m960w0();
                                                    String m897d7 = atm.m897d("B1D2A1D397C0B1DBA1EE97FDB1D8A1EE97C2B1E2A1E997FEB1E2A1DD97FEB1D2A1DD97F0B1E3A1EC97FDB1DEA1D497C0B1E0");
                                                    while (true) {
                                                        switch (m897d7.hashCode() ^ (-2081792151)) {
                                                            case -1398137916:
                                                                break;
                                                            case -933019991:
                                                                m897d7 = i == -1 ? atm.m897d("B1E2A1D797CEB1E2A1D797F0B1E2A1D097FDB1D1A1EE97FEB1E2A1ED97C2B1DEA1ED97C0") : atm.m897d("B1D2A1EE97F9B1E2A1DE97F4B1DFA1D197FCB1DCA1ED97F3B1DCA1DE97FEB1E2A1D397C0B1DFA1EE97C1B1D1A1DD97C0B1E2A1DE97F9B1E1");
                                                            case 128945043:
                                                                m897d7 = atm.m897d("B1DAA1D097FDB1D2A1D497FFB1E2A1D497FEB1E2A1ED97F3B1DCA1D997FCB1DFA1DE97F3B1E1A1D397C1B1E1A1DD");
                                                            case 602518577:
                                                                String m897d8 = atm.m897d("B1DBA1D397FAB1DCA1D397C0B1E2A1DD97F0B1D2A1ED97C4B1DDA1D497F3B1DDA1E397C0B1D2A1D997FC");
                                                                while (true) {
                                                                    switch (m897d8.hashCode() ^ (-1553648227)) {
                                                                        case -1057183650:
                                                                            break;
                                                                        case -456275132:
                                                                            m897d8 = c0293m.m981b0(C0052e.m1418a(new byte[]{-100, 125, 26, 70, -20, 23}, new byte[]{-3, 30, 110, 47, -102, 114, -72, 115})) ? atm.m897d("B1D8A1D397C4B1D6A1EE97F0B1E2A1DE97C0B1DEA1DE97C3B1E6A1ED97C3B1E6A1D797C7B1D1") : atm.m897d("B1DCA1EF97C4B1E5A1DD97CEB1E2A1D197CFB1E2A1ED97FFB1D2A1D997CEB1E2A1ED97C1B1DEA1DE97FFB1E5A1D397F4B1D6A1D7");
                                                                        case 484982396:
                                                                            m897d8 = atm.m897d("B1E2A1DD97C4B1E2A1ED97C7B1DBA1ED97F4B1E5A1EE97C2B1DAA1D097C0B1E0A1EA97C4B1D8A1D397CFB1DEA1E297CEB1EDA1D297F0B1E2");
                                                                        case 1704402189:
                                                                            Matcher matcher = this.f1144f.matcher(m966q0.mo925d(C0052e.m1418a(new byte[]{113, -101, 21, -33}, new byte[]{25, -23, 112, -71, 39, 44, -117, 97})));
                                                                            String m897d9 = atm.m897d("B1D8A1E397F9B1E2A1D397C0B1D8A1D497FCB1DBA1ED97F3B1E2A1D397C0B1D2A1D497F0B1E2");
                                                                            while (true) {
                                                                                switch (m897d9.hashCode() ^ 1668836156) {
                                                                                    case -281760905:
                                                                                        i = 0;
                                                                                        break;
                                                                                    case 110311822:
                                                                                        m897d9 = atm.m897d("B1E2A1E297FEB1ECA1D797F3B1D2A1D797CEB1DFA1D597C0B1E2A1D497F4B1EDA1E397FCB1DBA1ED");
                                                                                    case 234787630:
                                                                                        i = Integer.parseInt(matcher.group(1).split(C0052e.m1418a(new byte[]{-15}, new byte[]{-36, -72, -66, 10, 10, -123, 30, -109}))[8]);
                                                                                        break;
                                                                                    case 1868695835:
                                                                                        m897d9 = matcher.find() ? atm.m897d("B1E0A1D597C2B1E1A1E997F4B1E0A1D297CFB1ECA1D297FAB1DBA1EC97FEB1DFA1E997F4B1DFA1ED97CEB1D8A1E3") : atm.m897d("B1E2A1EA97CEB1E2A1ED97FDB1E5A1DE97CEB1D8A1D197FAB1DDA1E397FAB1D8A1E997F0B1E6A1ED97FEB1DEA1D797CFB1D6A1D4");
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    String m897d10 = atm.m897d("B1DDA1E397FFB1E3A1E997FEB1D2A1ED97FEB1D8A1E997FEB1DAA1E997CEB1D2A1D297C7B1D6A1D097CE");
                                                    while (true) {
                                                        switch (m897d10.hashCode() ^ (-1193602641)) {
                                                            case -2111537607:
                                                                m897d10 = m960w0.equals(C0052e.m1418a(new byte[]{-10, 72, -100, -107, 2, -65}, new byte[]{19, -8, 34, 124, -93, 10, 43, 21})) ? atm.m897d("B1E2A1D597CFB1ECA1E397C4B1E2A1D497CEB1DAA1EA97CFB1ECA1E297CEB1DEA1D097FAB1DCA1ED97C1B1EDA1EF97F0B1DAA1EF97C2B1DDA1EF") : atm.m897d("B1DDA1EC97F9B1DBA1EC97C3B1ECA1EA97C7B1DAA1E397C0B1E1A1D197CFB1E5A1ED97FDB1E2A1EC97FAB1E5A1ED97FCB1DFA1ED");
                                                            case -1220521068:
                                                                break;
                                                            case -210023618:
                                                                m897d10 = atm.m897d("B1ECA1DE97FEB1DBA1D197C3B1E1A1DD97C0B1E2A1D097FCB1DCA1D097FDB1DAA1EF97FAB1E2A1ED97F0B1DFA1E997F9B1E0A1D497C0B1E3A1D997C0");
                                                            case 36265156:
                                                                Matcher matcher2 = this.f1144f.matcher(m966q0.mo925d(C0052e.m1418a(new byte[]{116, -86, 7, -65}, new byte[]{28, -40, 98, -39, -15, 95, -61, 47})));
                                                                String m897d11 = atm.m897d("B1D2A1EF97F3B1DAA1D197C0B1E1A1D597C0B1ECA1EC97C1B1DCA1EC97CFB1DFA1D397C4B1E0A1EE97CEB1D6A1E397CEB1E2A1EA97FEB1D6");
                                                                while (true) {
                                                                    switch (m897d11.hashCode() ^ 175211842) {
                                                                        case -1601074437:
                                                                            if (!matcher2.find()) {
                                                                                m897d11 = atm.m897d("B1ECA1D797C0B1DCA1ED97C7B1D8A1D997C2B1D8A1DE97F9B1E2A1D797FCB1DBA1D197F9B1DD");
                                                                                break;
                                                                            } else {
                                                                                m897d11 = atm.m897d("B1E6A1E297F4B1D1A1EF97C0B1E2A1E997F8B1D6A1D197F0B1E3A1EC97C2B1ECA1D297F0B1DBA1D797CFB1ECA1ED97F4B1E3A1EA");
                                                                                break;
                                                                            }
                                                                        case -865104968:
                                                                            break;
                                                                        case 745998503:
                                                                            parseInt = Integer.parseInt(matcher2.group(1).split(C0052e.m1418a(new byte[]{-62}, new byte[]{-17, -76, -21, -114, 61, -38, -102, -110}))[8]);
                                                                            break;
                                                                        case 1121222785:
                                                                            m897d11 = atm.m897d("B1E6A1EE97C4B1E2A1DD97F4B1E2A1E997C0B1DBA1EE97F8B1D8A1EE97C7B1E2A1ED97FCB1D8A1D997C4B1D8A1D1");
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -1540638588:
                                                    break;
                                                case -59328826:
                                                    m897d6 = atm.m897d("B1E0A1EF97CEB1E0A1E997F4B1E0A1D797C4B1E2A1E297FFB1ECA1D497C7B1DAA1EE97CEB1DDA1D297CFB1D1A1EF97FDB1ED");
                                                case 584044795:
                                                    m897d6 = m966q0 == null ? atm.m897d("B1DEA1ED97F0B1E2A1EE97FFB1DCA1ED97C0B1EDA1DD97C0B1E0A1EE97FDB1ECA1D597CEB1E6A1E397FEB1E2A1EF97FFB1DFA1ED97F9B1ECA1D297C0") : atm.m897d("B1EDA1D397F0B1E2A1D097C2B1EDA1EE97C7B1DBA1ED97F0B1DCA1D797F4B1DFA1EA97CEB1D1A1D497C0");
                                            }
                                        }
                                        i3++;
                                        break;
                                    case 1096895644:
                                        break;
                                }
                            }
                        }
                        parseInt = 0;
                        break;
                }
            }
            JSONArray jSONArray = new JSONArray();
            String m897d12 = atm.m897d("B1D8A1D197FCB1E3A1D497C0B1DEA1E297C0B1DAA1D397FEB1E6A1D097C0B1D1A1D197FAB1D2A1D997C4B1DAA1D797C3B1DAA1EC97C0B1E2");
            while (true) {
                switch (m897d12.hashCode() ^ (-1983872056)) {
                    case 535798229:
                        if (!m259c.contains(C0052e.m1418a(new byte[]{-10, -54, -59, -24, 94, -94, 97, -88, -82, -99, -20, -66, 36, -87, 47, -57, -109, -53, -116, -88, 67, -52, 29, -91, -9, -61, -9, -24, 92, -73, 98, -78, -74}, new byte[]{16, 120, 100, 14, -62, 43, -121, 33}))) {
                            m897d12 = atm.m897d("B1DCA1EA97C3B1EDA1EE97FDB1EDA1EA97CEB1E3A1D997FAB1DEA1D597C0B1DDA1D397FDB1E6A1E397F4B1DDA1EE97FDB1E2A1D197C1B1DFA1ED");
                            break;
                        } else {
                            m897d12 = atm.m897d("B1E1A1D197FAB1DFA1D397FEB1DFA1DE97F8B1D8A1D797F8B1E5A1EE97FDB1E2A1EF97FAB1D2A1DE97C3B1DC");
                            break;
                        }
                    case 1556315251:
                        C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-74, -116, -122, 86, 89, 80, -107, -10, -1, -109, -97, 28, 70, 77, -109, -21, -115, -70, -110, 23, 82}, new byte[]{-46, -27, -16, 120, 42, 36, -32, -97}));
                        int i4 = 0;
                        while (true) {
                            String m897d13 = atm.m897d("B1E2A1D397FFB1D1A1E297F0B1E0A1E397C4B1DDA1ED97CFB1D2A1D297CFB1DEA1ED97C0");
                            while (true) {
                                switch (m897d13.hashCode() ^ 564974821) {
                                    case -1976942342:
                                        m897d13 = atm.m897d("B1DCA1D197F9B1DEA1E297FCB1EDA1ED97FEB1D1A1DE97FFB1DCA1EE97C0B1E2A1ED97C1B1D6");
                                    case -803323920:
                                        m897d13 = i4 < m967p02.size() ? atm.m897d("B1D2A1EA97F0B1D1A1D097C4B1E2A1DE97FFB1E2A1ED97CEB1E5A1EF97FCB1ECA1EA") : atm.m897d("B1D1A1E297CEB1E2A1DE97C3B1E0A1EC97C3B1E2A1ED97FFB1DEA1D997FFB1DEA1D097C0B1E3A1EE97F3B1DAA1EF97C3B1DDA1EA97C4");
                                    case 1152987790:
                                        break;
                                    case 1793882691:
                                        C0293m c0293m2 = m967p02.get(i4);
                                        String m606a = c0293m2.m967p0(C0052e.m1418a(new byte[]{122}, new byte[]{27, 51, -124, 61, 69, -89, -54, 125})).m606a(C0052e.m1418a(new byte[]{42, 20, -39, -114, -67}, new byte[]{94, 125, -83, -30, -40, 108, 90, 52}));
                                        String m606a2 = c0293m2.m967p0(C0052e.m1418a(new byte[]{Byte.MIN_VALUE}, new byte[]{-31, 72, 71, 2, 89, 41, -11, 79})).m606a(C0052e.m1418a(new byte[]{-60, 48, 52, 10, 6, -6, -117, -98, -57, 56, 46, 10, 71}, new byte[]{-96, 81, 64, 107, 43, -107, -7, -9}));
                                        String m602e = c0293m2.m967p0(C0052e.m1418a(new byte[]{-106, -5, -82, 43, -125, 86, -119, 40, -110, -93, -12}, new byte[]{-9, -37, Byte.MIN_VALUE, 91, -22, 53, -92, 92})).m602e();
                                        Matcher matcher3 = this.f1142d.matcher(c0293m2.m967p0(C0052e.m1418a(new byte[]{43}, new byte[]{74, 82, -57, -118, -1, 103, -66, -28})).m606a(C0052e.m1418a(new byte[]{-5, -33, 80, 57}, new byte[]{-109, -83, 53, 95, 61, -7, -97, 106})));
                                        String m897d14 = atm.m897d("B1D2A1DD97C0B1DAA1D397C7B1DFA1E997C4B1E1A1EE97C4B1E2A1EF97C3B1E6");
                                        while (true) {
                                            switch (m897d14.hashCode() ^ (-1413522535)) {
                                                case -1717540472:
                                                    m897d14 = atm.m897d("B1D8A1D297F0B1DBA1DE97C7B1E5A1E397C1B1D8A1D497FEB1DFA1D497FEB1E2A1E997CFB1E1A1D997C2B1E2A1ED");
                                                case -1441662377:
                                                    String group = matcher3.group(1);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{120, 122, 123, -88, 76, -98}, new byte[]{14, 21, 31, -9, 37, -6, -7, 25}), group);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{12, 65, 34, -13, 52, 26, 36, 102}, new byte[]{122, 46, 70, -84, 90, 123, 73, 3}), m606a);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{115, 72, -93, -81, 79, -17, 35}, new byte[]{5, 39, -57, -16, 63, -122, 64, -113}), m606a2);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-7, -118, 26, 57, -104, 18, -56, 103, -3, -114, 13}, new byte[]{-113, -27, 126, 102, -22, 119, -91, 6}), m602e);
                                                    jSONArray.put(jSONObject2);
                                                    break;
                                                case 237377410:
                                                    m897d14 = !matcher3.find() ? atm.m897d("B1D6A1EA97FCB1E5A1DD97FCB1D6A1E297F4B1ECA1D597F8B1E0A1D497FEB1E2A1E297C2B1DCA1ED97F3B1DFA1ED") : atm.m897d("B1E6A1ED97C2B1EDA1D297F3B1DAA1D997C0B1DDA1D997F3B1DBA1ED");
                                                case 568123408:
                                                    break;
                                            }
                                        }
                                        i4++;
                                        break;
                                }
                            }
                        }
                        break;
                    case 1579218623:
                        m897d12 = atm.m897d("B1E5A1E297C0B1DEA1EF97F0B1D1A1D197CFB1DCA1EF97C0B1DAA1D597C2B1ECA1D197F3");
                        break;
                    case 1849018879:
                        break;
                }
            }
            jSONObject.put(C0052e.m1418a(new byte[]{111, Byte.MAX_VALUE, 49, 104}, new byte[]{31, 30, 86, 13, -60, -30, -124, -99}), i);
            jSONObject.put(C0052e.m1418a(new byte[]{-7, -125, 8, -90, -106, 14, 96, -28, -3}, new byte[]{-119, -30, 111, -61, -11, 97, 21, -118}), parseInt);
            jSONObject.put(C0052e.m1418a(new byte[]{-98, -113, 55, 100, -70}, new byte[]{-14, -26, 90, 13, -50, -5, 17, -104}), 48);
            String m1418a = C0052e.m1418a(new byte[]{-51, 114, 115, -124, -96}, new byte[]{-71, 29, 7, -27, -52, 64, -11, -66});
            String m897d15 = atm.m897d("B1E1A1EF97FDB1E2A1D997C3B1E1A1D297FDB1D6A1DD97C1B1D8A1E297C4B1D2A1ED97FAB1DEA1EF");
            while (true) {
                switch (m897d15.hashCode() ^ 1868879276) {
                    case -227111947:
                        i2 = jSONArray.length();
                        break;
                    case 41652746:
                        if (parseInt > 1) {
                            m897d15 = atm.m897d("B1ECA1E997F9B1E2A1EE97FFB1E6A1EA97FFB1E2A1ED97F9B1D2A1EA97FAB1E2A1ED97F0B1ECA1DD97F8B1EDA1EC");
                            break;
                        } else {
                            m897d15 = atm.m897d("B1DAA1E997C1B1DAA1D797F9B1E2A1E397F8B1DDA1EE97CFB1DCA1ED97C1B1DDA1E997FDB1E3A1ED97FEB1DBA1D2");
                            break;
                        }
                    case 42958273:
                        i2 = parseInt * 48;
                        break;
                    case 1957679245:
                        m897d15 = atm.m897d("B1E6A1D297F9B1DCA1D997C0B1E1A1D497FFB1E2A1E997FFB1DAA1EE97FAB1D2A1ED");
                        break;
                }
            }
            jSONObject.put(m1418a, i2);
            jSONObject.put(C0052e.m1418a(new byte[]{-123, -110, 125, 92}, new byte[]{-23, -5, 14, 40, 61, 89, 67, -16}), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public final String detailContent(List<String> list) {
        boolean z;
        C0293m c0293m;
        C0459g c0459g;
        try {
            C0288h m1414e = C0052e.m1414e(m259c(C0052e.m1418a(new byte[]{78, 42, 18, -101, -43, -106, 92, 114, 82, 40, 72, -121, -49, -50, 5, 52, 73, 112, 5, -120, -119, -56, 22, 41, 71, 55, 10, -60}, new byte[]{38, 94, 102, -21, -90, -84, 115, 93}) + list.get(0) + C0052e.m1418a(new byte[]{6, -48, 49, 62, -22}, new byte[]{40, -72, 69, 83, -122, 42, -118, 112})));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String m606a = m1414e.m967p0(C0052e.m1418a(new byte[]{80, -112, -76, 29, 71, 51, 73, 103, 25, -102, -83, 93, 64, 34, 82, 122, 107, -90, -74, 91, 65, 42, 94, 46, 85, -39, -85, 94, 83}, new byte[]{52, -7, -62, 51, 52, 71, 60, 14})).m606a(C0052e.m1418a(new byte[]{89, 35, 49, Byte.MIN_VALUE, -67, -43, 42, -61, 90, 43, 43, Byte.MIN_VALUE, -4}, new byte[]{61, 66, 69, -31, -112, -70, 88, -86}));
            String m602e = m1414e.m967p0(C0052e.m1418a(new byte[]{118, -59, -126, 51, 115, -33, Byte.MAX_VALUE, 1, 63, -49, -101, 115, 116, -50, 100, 28, 77, -13, -112, 120, 116, -54, 99, 4, 50, -60, -59}, new byte[]{18, -84, -12, 29, 0, -85, 10, 104})).m602e();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{81, 95, 79, -24, -118, 70}, new byte[]{33, 113, 43, -119, -2, 39, -27, 5}));
            String m260b = m260b(Pattern.compile(C0052e.m1418a(new byte[]{-80, -74, 81, -113, 29, -13, -115, -1, -51, 47, -74, 57, -88, 81}, new byte[]{87, 7, -22, 106, -125, 120, 98, 67})), m967p0.get(0).m960w0());
            String m260b2 = m260b(Pattern.compile(C0052e.m1418a(new byte[]{65, 77, -121, -80, 3, 73, 91, 115, 62, -7, 107, 6, -92, -38}, new byte[]{-92, -47, 55, 85, -113, -13, -76, -49})), m967p0.get(0).m960w0());
            String m260b3 = m260b(Pattern.compile(C0052e.m1418a(new byte[]{26, 110, 69, Byte.MAX_VALUE, 108, -52, -43, 68, 101, -1, -83, -56, -4, 88}, new byte[]{-1, -41, -15, -101, -41, 113, 58, -8})), m967p0.get(0).m960w0());
            String m260b4 = m260b(Pattern.compile(C0052e.m1418a(new byte[]{-79, 64, -12, 2, -111, -53, 0, -81, -51, -13, 28, -73, 44, 82}, new byte[]{87, -37, 64, -28, 7, 123, -17, 19})), m967p0.get(3).m960w0());
            String m260b5 = m260b(Pattern.compile(C0052e.m1418a(new byte[]{-124, -113, 51, 22, -75, 24, -13, 81, -6, 31, -44, -93, 34, -91}, new byte[]{96, 55, -120, -16, 9, -116, 28, -19})), m967p0.get(1).m960w0());
            String m260b6 = m260b(Pattern.compile(C0052e.m1418a(new byte[]{90, 84, 87, -125, 93, -92, 104, -112, 37, -45, -73, 54, -54, 25}, new byte[]{-65, -5, -21, 101, -31, 48, -121, 44})), m967p0.get(1).m960w0());
            String trim = m1414e.m966q0(C0052e.m1418a(new byte[]{-100, -13, 55, -3, 64, 0, -56, -9, -114, -22, 58, -66, 13, 11, -61, -9, -118, -19, 34}, new byte[]{-17, -125, 86, -109, 110, 100, -83, -125})).m960w0().trim();
            try {
                jSONObject2.put(C0052e.m1418a(new byte[]{-85, 17, 36, -57, 43, 77}, new byte[]{-35, 126, 64, -104, 66, 41, -19, -67}), list.get(0));
                jSONObject2.put(C0052e.m1418a(new byte[]{45, -40, -5, 68, -38, -115, -105, 44}, new byte[]{91, -73, -97, 27, -76, -20, -6, 73}), m602e);
                jSONObject2.put(C0052e.m1418a(new byte[]{-127, 2, 49, 45, -36, -68, -45}, new byte[]{-9, 109, 85, 114, -84, -43, -80, -117}), m606a);
                jSONObject2.put(C0052e.m1418a(new byte[]{5, -82, 77, -28, 59, 78, 87, 67, 20}, new byte[]{113, -41, 61, -127, 100, 32, 54, 46}), m260b);
                jSONObject2.put(C0052e.m1418a(new byte[]{-52, -36, -84, -59, -105, 125, Byte.MAX_VALUE, -91}, new byte[]{-70, -77, -56, -102, -18, 24, 30, -41}), m260b3);
                jSONObject2.put(C0052e.m1418a(new byte[]{18, -102, 51, -47, -124, -63, -80, -127}, new byte[]{100, -11, 87, -114, -27, -77, -43, -32}), m260b2);
                jSONObject2.put(C0052e.m1418a(new byte[]{-19, -51, -93, -6, -15, -85, 116, -73, -23, -55, -76}, new byte[]{-101, -94, -57, -91, -125, -50, 25, -42}), m260b4);
                jSONObject2.put(C0052e.m1418a(new byte[]{-40, 40, -42, 105, -5, -99, -38, -125, -36}, new byte[]{-82, 71, -78, 54, -102, -2, -82, -20}), m260b5);
                jSONObject2.put(C0052e.m1418a(new byte[]{11, 117, 51, -49, -4, -58, -104, -35, 30, 110, 56, -30}, new byte[]{125, 26, 87, -112, -104, -81, -22, -72}), m260b6);
                jSONObject2.put(C0052e.m1418a(new byte[]{-37, -35, 118, 46, 113, 104, 4, 15, -56, -36, 102}, new byte[]{-83, -78, 18, 113, 18, 7, 106, 123}), trim);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{35, -38, -102, -70, -99, 89, -113, 78, 106, -59, -125, -16, -126, 68, -119, 83, 24, -20, -124, -15, -113, 73, -38, 79, 116}, new byte[]{71, -77, -20, -108, -18, 45, -6, 39}));
                C0459g m967p03 = m1414e.m967p0(C0052e.m1418a(new byte[]{119, -12, 20, -87, 35, -28, -93, -117, 97, -9, 84, -82, 50, -1, -66, -7, 93, -24, 86, -69, 46, -3, -93, -43, 118}, new byte[]{2, -104, 58, -38, 87, -111, -54, -90}));
                int i = 0;
                while (true) {
                    String m897d = atm.m897d("B1E0A1E297CFB1E0A1DE97C3B1E6A1EF97C0B1E2A1D797C1B1E2A1E297C3B1D1A1D297C4");
                    while (true) {
                        switch (m897d.hashCode() ^ 375492917) {
                            case -1754246055:
                                String m960w0 = m967p02.get(i).m960w0();
                                try {
                                    Iterator<String> keys = this.f1139a.keys();
                                    while (true) {
                                        String m897d2 = atm.m897d("B1DAA1EF97FDB1E2A1E997FEB1DFA1ED97C3B1DFA1ED97C0B1E5A1E397CEB1E6A1EA97C0B1D1A1DE97FDB1E5A1D297F0B1DEA1D397F9B1D1A1E997C0");
                                        while (true) {
                                            switch (m897d2.hashCode() ^ 991437640) {
                                                case -1346193617:
                                                    z = false;
                                                    break;
                                                case -1329327893:
                                                    m897d2 = atm.m897d("B1EDA1DE97CEB1E0A1EA97F8B1E6A1E397F9B1E2A1E997CEB1E1A1EC97FFB1D8A1D197F4B1DBA1D097F9B1D2A1ED97C0B1DAA1EF");
                                                case 192126114:
                                                    String next = keys.next();
                                                    String m897d3 = atm.m897d("B1EDA1E297CEB1E5A1D597C4B1E2A1EC97C2B1DAA1D797FCB1DAA1D097C7B1DBA1ED97C1B1E5A1D197C0B1DCA1D5");
                                                    while (true) {
                                                        switch (m897d3.hashCode() ^ 1528304575) {
                                                            case -1158238944:
                                                                m897d3 = atm.m897d("B1D8A1ED97CEB1E2A1D097F4B1EDA1EC97FEB1E2A1D197C7B1D1A1D597C0B1E6A1ED97FFB1DBA1D297C0B1DCA1D197C2B1DEA1D797CF");
                                                            case -826780908:
                                                                break;
                                                            case -370080760:
                                                                m897d3 = this.f1139a.getJSONObject(next).getString(C0052e.m1418a(new byte[]{-115, 60, 1, -71}, new byte[]{-2, 84, 110, -50, 96, 83, 45, -7})).equals(m960w0) ? atm.m897d("B1E0A1D997CFB1DEA1D597FEB1EDA1D397F0B1E2A1D297F0B1E3A1EA97F3B1E2A1EC97C4B1D2A1D997C0B1E2") : atm.m897d("B1D1A1DD97C4B1E2A1E397F3B1DEA1D397F3B1E5A1E297FEB1DBA1D997F9B1DDA1EC97F9B1E2A1E297CEB1EC");
                                                            case 1546211110:
                                                                String m897d4 = atm.m897d("B1DAA1D797C4B1E2A1D997C7B1DAA1EA97C1B1DCA1E997F0B1DEA1D197C7B1E6A1E997CFB1ECA1ED");
                                                                while (true) {
                                                                    switch (m897d4.hashCode() ^ (-470262897)) {
                                                                        case -1841984182:
                                                                            z = true;
                                                                            break;
                                                                        case -1417237972:
                                                                            break;
                                                                        case 675415501:
                                                                            m897d4 = atm.m897d("B1E0A1ED97CEB1E2A1D297F9B1D8A1D097F0B1D2A1ED97FAB1DDA1DD97C0B1D8A1EA97C2B1D6A1D297FCB1DBA1EA97CFB1DCA1D397FDB1E2A1ED97FAB1E5");
                                                                        case 1493759756:
                                                                            m897d4 = !this.f1139a.getJSONObject(next).getString(C0052e.m1418a(new byte[]{3, -24, 102, -48}, new byte[]{112, Byte.MIN_VALUE, 9, -89, -95, 112, -45, 108})).contains(C0052e.m1418a(new byte[]{-67, -5, 58}, new byte[]{90, 96, -94, 42, -64, 105, 97, 116})) ? atm.m897d("B1E1A1D997F3B1DEA1D497C1B1DBA1E997C3B1E3A1E397CEB1E3A1D5") : atm.m897d("B1DEA1D597CEB1E2A1DE97C1B1DDA1DE97C3B1E3A1E997C2B1E6A1ED97FFB1DBA1DE97FAB1D8A1EA97C0B1DCA1ED97FCB1DFA1ED");
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1852916485:
                                                    m897d2 = keys.hasNext() ? atm.m897d("B1E6A1D997FDB1E2A1ED97FEB1DBA1EC97C2B1DBA1EF97C1B1DBA1D397C0B1DCA1ED97F4B1EDA1D197FDB1D1A1D997C0B1E0A1E997C2") : atm.m897d("B1E5A1D797FFB1E3A1DE97FAB1DDA1D297FFB1E2A1E997FEB1E2A1EF97F8B1DDA1D097F8B1E6A1ED");
                                            }
                                        }
                                    }
                                    String m897d5 = atm.m897d("B1E3A1D797CEB1E2A1D797C3B1DFA1ED97C2B1DDA1ED97C0B1E3A1D997F9B1DEA1DD97C1B1D2A1ED97F0B1E2A1D497C3B1D1A1ED97FDB1E2A1ED");
                                    while (true) {
                                        switch (m897d5.hashCode() ^ 1858566152) {
                                            case -981254927:
                                                c0459g = m967p02;
                                                break;
                                            case -283713957:
                                                m897d5 = !z ? atm.m897d("B1D2A1D297FFB1DEA1D297C4B1E2A1DD97CEB1E3A1E997CEB1D1A1EC97C3B1D2A1ED97FAB1DCA1D297C0") : atm.m897d("B1D1A1EF97FCB1E6A1EC97FCB1D1A1D597F9B1E0A1D097FFB1E2A1D497C2B1DFA1ED97C0B1E6A1ED97C0B1E3A1E997C0B1DAA1ED97FDB1E2A1D597FCB1D1");
                                            case 1393261317:
                                                String str = "";
                                                C0459g m967p04 = m967p03.get(i).m967p0(C0052e.m1418a(new byte[]{120, -105, -124, -26}, new byte[]{20, -2, -92, -121, 64, 85, -8, -114}));
                                                ArrayList arrayList = new ArrayList();
                                                int i2 = 0;
                                                while (true) {
                                                    String m897d6 = atm.m897d("B1EDA1DE97FDB1EDA1DE97C4B1E2A1D397FEB1DCA1ED97FEB1E3A1E997C0B1D1A1D097C7B1EDA1DD97FCB1E6A1EE97CE");
                                                    while (true) {
                                                        switch (m897d6.hashCode() ^ (-858248546)) {
                                                            case -1907191106:
                                                                m897d6 = atm.m897d("B1E1A1EE97F0B1D6A1DE97C2B1D8A1EE97CEB1E2A1EA97FDB1DFA1ED97C0B1DAA1D397C4B1E1A1EA97CEB1DDA1ED");
                                                            case 362519513:
                                                                m897d6 = i2 < m967p04.size() ? atm.m897d("B1DCA1EC97CEB1E2A1D397F4B1D2A1ED97F3B1D2A1D297FCB1E3A1EF97F0B1DCA1D1") : atm.m897d("B1DEA1E997FDB1E2A1E997FEB1DAA1EC97FAB1E0A1D497F8B1E3A1D797C1B1ECA1D597F9B1DFA1ED");
                                                            case 1075875744:
                                                                Matcher matcher = this.f1143e.matcher(m967p04.get(i2).mo925d(C0052e.m1418a(new byte[]{-57, -126, 64, Byte.MAX_VALUE}, new byte[]{-81, -16, 37, 25, 73, 50, 15, -124})));
                                                                String m897d7 = atm.m897d("B1DAA1D097FDB1EDA1D597C4B1E2A1EA97F0B1D2A1D497C4B1D8A1D497CFB1DCA1ED97F3B1DAA1ED97C0");
                                                                while (true) {
                                                                    switch (m897d7.hashCode() ^ 4287201) {
                                                                        case -456406287:
                                                                            break;
                                                                        case -210384197:
                                                                            arrayList.add(c0293m.m960w0() + C0052e.m1418a(new byte[]{74}, new byte[]{110, -52, -53, 78, 19, 40, -18, 86}) + (matcher.group(1) + C0052e.m1418a(new byte[]{123}, new byte[]{86, 88, -79, -16, 63, 3, -33, 30}) + matcher.group(2) + C0052e.m1418a(new byte[]{-39}, new byte[]{-12, 16, -116, 86, -62, -103, -34, 12}) + matcher.group(3)));
                                                                            break;
                                                                        case 482996235:
                                                                            m897d7 = !matcher.find() ? atm.m897d("B1DBA1E297C3B1DDA1D497CEB1DCA1EE97F3B1EDA1D797F9B1E2A1DE97C7B1EDA1D197C4B1DDA1D397C1B1E3A1DE97F8B1DFA1E397C0") : atm.m897d("B1E5A1D997FDB1EDA1EC97F3B1D1A1EF97FDB1E6A1DE97C4B1EDA1D197F0B1E2A1D097F0B1DFA1D297FAB1ECA1ED");
                                                                        case 1863888248:
                                                                            m897d7 = atm.m897d("B1E5A1DD97C0B1D1A1D197C1B1DCA1DE97FEB1D8A1D497F8B1E6A1ED97C7B1E5A1EC97C1B1E2A1EE97C0B1E2");
                                                                    }
                                                                }
                                                                i2++;
                                                                break;
                                                            case 1961597089:
                                                                String m897d8 = atm.m897d("B1E6A1D497F3B1E0A1D297F4B1DDA1D597C4B1E0A1E297CFB1DBA1D097F0B1E2A1E297C3B1D1A1D297C1B1EDA1D097F4B1D2A1D997CEB1DCA1ED");
                                                                while (true) {
                                                                    switch (m897d8.hashCode() ^ 359297576) {
                                                                        case -273141069:
                                                                            m897d8 = arrayList.size() > 0 ? atm.m897d("B1DDA1D097CEB1E2A1EA97C3B1DBA1ED97C0B1DFA1D297F8B1D6A1D997FEB1D2A1E997C7B1D1A1D597C1B1E3A1D2") : atm.m897d("B1E2A1E997FDB1E2A1DE97C7B1ECA1ED97FAB1DBA1D597FFB1EDA1ED97FDB1E6A1EF97F8B1DAA1EC97F9B1DCA1D397FDB1E3A1E997C0");
                                                                        case 109738436:
                                                                            str = TextUtils.join(C0052e.m1418a(new byte[]{7}, new byte[]{36, 123, 56, -50, 10, -9, 15, 0}), arrayList);
                                                                            break;
                                                                        case 195660463:
                                                                            break;
                                                                        case 2094804092:
                                                                            m897d8 = atm.m897d("B1E5A1DD97CEB1E2A1E297F4B1D1A1EC97FCB1E6A1D297C7B1DBA1E397FFB1E0A1D297F0B1E2A1DE97CEB1D2");
                                                                    }
                                                                }
                                                                String m897d9 = atm.m897d("B1DBA1D297C3B1E3A1D497FDB1EDA1D997C1B1E5A1E297F0B1D1A1D297F8B1E0A1DE97C0B1E2A1ED97F8B1E3A1D997C2B1D2A1ED97F3B1E6A1D5");
                                                                while (true) {
                                                                    switch (m897d9.hashCode() ^ (-2045212925)) {
                                                                        case -2134681686:
                                                                            linkedHashMap.put(m960w0, str);
                                                                            c0459g = m967p02;
                                                                            continue;
                                                                        case -1224337342:
                                                                            m897d9 = str.length() == 0 ? atm.m897d("B1DBA1E297C4B1E2A1ED97FDB1DDA1ED97F4B1D8A1E997C0B1DEA1D597C3B1D6A1D397C2B1D8A1E997C2B1D8A1EC97C0B1E2A1DD97CFB1E3A1EF97FEB1DA") : atm.m897d("B1ECA1D097F0B1D6A1DE97FEB1E2A1EC97F0B1D2A1ED97F3B1DBA1D297F9B1E2A1DD97C0B1D2A1EE97C4B1E3A1D297FAB1E5A1EA97C0B1E2A1D297FDB1DB");
                                                                        case -256987295:
                                                                            c0459g = m967p02;
                                                                            continue;
                                                                        case 1287574269:
                                                                            m897d9 = atm.m897d("B1E2A1D397C7B1E0A1DD97C0B1DFA1DD97F9B1DEA1D997FCB1E5A1D597C2");
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 1855408284:
                                                m897d5 = atm.m897d("B1E2A1D197C4B1EDA1DE97C1B1D8A1E997C2B1D8A1D597F4B1DDA1D297C4B1E0A1E997FFB1DEA1D797CEB1E1A1DD");
                                        }
                                    }
                                    i++;
                                    m967p02 = c0459g;
                                } catch (Exception e) {
                                    e = e;
                                    SpiderDebug.log(e);
                                    return "";
                                }
                                break;
                            case -384721981:
                                m897d = atm.m897d("B1DAA1D997F4B1E0A1ED97C0B1DFA1D997CFB1E5A1ED97F0B1E2A1E397CFB1D2A1ED97FFB1E6A1D797C4B1DBA1ED97C2B1E1A1DD97F0B1DCA1EE");
                            case 549001927:
                                String m897d10 = atm.m897d("B1DCA1E297C0B1E2A1D097FEB1DDA1D297C7B1E2A1ED97F3B1E2A1D497C0B1EDA1D197F8B1EDA1D997C2B1DEA1D797F4");
                                while (true) {
                                    switch (m897d10.hashCode() ^ 507822047) {
                                        case -1738478397:
                                            String join = TextUtils.join(C0052e.m1418a(new byte[]{83, -46, -27}, new byte[]{119, -10, -63, -30, 80, 122, 91, 114}), linkedHashMap.keySet());
                                            String join2 = TextUtils.join(C0052e.m1418a(new byte[]{65, 86, -65}, new byte[]{101, 114, -101, 15, 68, 58, -43, -71}), linkedHashMap.values());
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-46, 48, 38, 110, 15, 54, -117, 97, -5, 57, 48, 94, 18}, new byte[]{-92, 95, 66, 49, Byte.MAX_VALUE, 90, -22, 24}), join);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-75, 64, 50, Byte.MAX_VALUE, -64, -111, 53, -60, -100, 90, 36, 76}, new byte[]{-61, 47, 86, 32, -80, -3, 84, -67}), join2);
                                            break;
                                        case 183570975:
                                            break;
                                        case 372952798:
                                            m897d10 = atm.m897d("B1DCA1ED97FCB1E6A1D197F8B1E2A1D297C0B1DCA1D497FDB1DAA1D097F9B1E6A1DE97C4B1E2A1E997FCB1ECA1D997FFB1DFA1ED");
                                            break;
                                        case 1003509876:
                                            if (linkedHashMap.size() <= 0) {
                                                m897d10 = atm.m897d("B1D6A1EA97CEB1E2A1E997F8B1DDA1D497F0B1DAA1E397C0B1D8A1E397C0B1E6A1D197F0B1DEA1EE");
                                                break;
                                            } else {
                                                m897d10 = atm.m897d("B1D6A1D097F0B1E2A1E397F8B1D1A1EA97C1B1EDA1EC97FDB1E2A1E997F0B1E6A1ED97F4B1D6A1E297C3B1DDA1ED97CFB1E6A1D597F0B1E1A1D497C0");
                                                break;
                                            }
                                    }
                                }
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(jSONObject2);
                                jSONObject.put(C0052e.m1418a(new byte[]{87, -110, 78, 88}, new byte[]{59, -5, 61, 44, 43, -4, 15, 27}), jSONArray);
                                return jSONObject.toString();
                            case 1635356380:
                                m897d = i < m967p02.size() ? atm.m897d("B1E1A1D497F0B1E2A1D297F4B1D6A1EA97FCB1D1A1E297C2B1E2A1D397C4") : atm.m897d("B1DFA1E397FEB1E2A1E397F4B1DCA1ED97F0B1D2A1E397C0B1E0A1D797C7B1DAA1D597FFB1DAA1EC97F0");
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final String homeContent(boolean z) {
        boolean z2;
        C0459g m967p0;
        JSONArray jSONArray;
        int i = 0;
        try {
            C0288h m1414e = C0052e.m1414e(m259c(f1137g));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-89, -82, -18, 12, 5, 5, -1, 78, -70, -89, -95, 27, 20, 2, -55, 60, -65, -89, -82, 10, 81, 28, -1, 67, -77}, new byte[]{-46, -62, -64, Byte.MAX_VALUE, 113, 112, -106, 99}));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0293m> it = m967p02.iterator();
            while (true) {
                String m897d = atm.m897d("B1DAA1EE97F9B1E2A1EC97F3B1DCA1ED97C1B1ECA1EA97FFB1D8A1D997F3B1DFA1EC97CEB1DBA1D097C0B1E2A1ED97C0B1E2A1D797CFB1DF");
                while (true) {
                    switch (m897d.hashCode() ^ (-1335239659)) {
                        case -1981080563:
                            m897d = it.hasNext() ? atm.m897d("B1E6A1E297F8B1E3A1EE97C3B1ECA1D797FDB1D8A1E297C0B1E2A1D797F4B1E1A1D097FEB1DDA1ED97C7B1DEA1D797C1B1E0A1DD") : atm.m897d("B1E2A1E297C7B1E1A1DD97C7B1E5A1EC97F3B1E0A1D097FEB1E2A1E297F9B1D6A1D397F4B1D2A1EF97FCB1D2A1E397F0B1D8A1E997F3B1E6");
                        case 203142205:
                            C0293m next = it.next();
                            String m960w0 = next.m960w0();
                            String m897d2 = atm.m897d("B1DCA1D497F0B1ECA1D597CEB1E2A1DD97C1B1ECA1ED97F9B1DEA1DD97C0B1DEA1EF97C0B1DEA1EC97C7B1DCA1D7");
                            while (true) {
                                switch (m897d2.hashCode() ^ 242500486) {
                                    case -1778296764:
                                        String m897d3 = atm.m897d("B1EDA1EC97F0B1E2A1D497F9B1DCA1ED97FCB1DFA1ED97FAB1E3A1D397F9B1E1A1E997C0");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-5989401)) {
                                                case -1437295325:
                                                    String m897d4 = atm.m897d("B1EDA1D397FAB1DFA1D397F8B1DDA1ED97C0B1DBA1DE97C3B1EDA1D997C3B1DEA1DD97F0B1E2");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ (-552549049)) {
                                                            case -1483902829:
                                                                String m897d5 = atm.m897d("B1DDA1E997C7B1DCA1D997FCB1DBA1D297C4B1E2A1DE97FDB1E2A1D997C0B1D2A1DE97CEB1D8A1D097F0B1DBA1D997C1B1E3");
                                                                while (true) {
                                                                    switch (m897d5.hashCode() ^ 1518928936) {
                                                                        case -1097895927:
                                                                            String m897d6 = atm.m897d("B1ECA1E997F8B1EDA1D997C0B1E2A1E297C7B1E6A1D397FAB1DBA1ED97FCB1DAA1E397C0B1ECA1D997CEB1E2A1EC97C1B1DE");
                                                                            while (true) {
                                                                                switch (m897d6.hashCode() ^ 924129788) {
                                                                                    case -1388755024:
                                                                                        break;
                                                                                    case -1277593121:
                                                                                        z2 = false;
                                                                                        break;
                                                                                    case -1047293014:
                                                                                        m897d6 = m960w0.equals(C0052e.m1418a(new byte[]{87, 7, 3, -30, 86, 31, -13, -35, 22}, new byte[]{-79, -85, -92, 5, -24, -111, 22, 84})) ? atm.m897d("B1DFA1EA97F8B1E5A1E397C0B1ECA1EA97C7B1E0A1D197C0B1E2A1E297C0B1D2A1ED") : atm.m897d("B1DBA1EE97CFB1DEA1DD97CFB1E2A1D797CEB1ECA1DE97FFB1E6A1E297CFB1E5A1ED97C4B1D6A1D397F4B1E0A1EF97FDB1D1A1D997C2");
                                                                                    case 2099093994:
                                                                                        m897d6 = atm.m897d("B1EDA1D097FDB1E2A1E997C1B1E3A1EF97C2B1ECA1D297FFB1E0A1D197F8B1E2A1ED97C7B1D2A1D197FCB1D8A1ED97C0B1E0A1D997FEB1E2A1D497CFB1DE");
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 380924153:
                                                                            m897d5 = !m960w0.equals(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, -51, -105, -107, 38, 108, 81, 90, 62}, new byte[]{-103, 90, 50, 124, -71, -59, -76, -45})) ? atm.m897d("B1DDA1EC97C3B1EDA1D397FEB1E6A1E997F4B1E0A1EC97C4B1E2A1EE97C7B1DAA1D997CFB1DEA1D597C4B1E2") : atm.m897d("B1D8A1EF97FFB1E2A1D397F3B1DBA1D297F0B1D2A1D597F8B1D1A1D297F9");
                                                                        case 608836473:
                                                                            break;
                                                                        case 1289935982:
                                                                            m897d5 = atm.m897d("B1E0A1D197CFB1E1A1D497F3B1DAA1EC97FEB1E2A1D397C1B1D8A1D597C7B1ECA1D097F9B1DCA1ED97C1B1E0A1EE");
                                                                    }
                                                                }
                                                                break;
                                                            case -856734877:
                                                                m897d4 = !m960w0.equals(C0052e.m1418a(new byte[]{17, -65, 45, 65, -59, 27}, new byte[]{-12, 53, -123, -89, 121, -80, 98, 62})) ? atm.m897d("B1E1A1D297F4B1EDA1DD97C0B1D1A1D997F9B1D8A1E297F4B1D6A1D297C4B1E2A1D797C1B1E5A1EA97FAB1EC") : atm.m897d("B1DAA1EC97FFB1D6A1EC97C0B1DAA1E297FDB1E2A1EE97FEB1DBA1ED97FCB1DBA1ED97C0");
                                                            case -31841599:
                                                                break;
                                                            case 971918983:
                                                                m897d4 = atm.m897d("B1DCA1D597F4B1E5A1D497FFB1E2A1E397C3B1DFA1ED97FCB1DBA1D797C3B1E3A1D497FAB1E2A1D797FAB1ECA1ED97F3B1E2A1E397C7B1E3A1D1");
                                                        }
                                                    }
                                                    break;
                                                case -1432773035:
                                                    m897d3 = atm.m897d("B1EDA1D997C2B1EDA1D197FEB1E1A1EC97FEB1E2A1EF97F9B1DEA1EA97C7B1DAA1DE97FDB1DBA1ED97FEB1E1A1D497C0B1DDA1D297C0B1E2");
                                                case -944496288:
                                                    break;
                                                case 1000666389:
                                                    m897d3 = !m960w0.equals(C0052e.m1418a(new byte[]{-41, 92, -73, -62, -60, 84}, new byte[]{50, -43, 16, 43, 95, -46, -105, -39})) ? atm.m897d("B1D8A1D397CEB1E2A1E297FDB1E1A1D497C0B1EDA1D797F8B1ECA1DE97C4B1ECA1ED") : atm.m897d("B1ECA1E297C1B1EDA1EC97FDB1E2A1DE97F9B1DBA1ED97FDB1E6A1D197C3B1D8A1D797C0B1E5A1E3");
                                            }
                                        }
                                        break;
                                    case -614181819:
                                        m897d2 = !m960w0.equals(C0052e.m1418a(new byte[]{-63, -42, -65, 3, 31, 102}, new byte[]{38, 66, 10, -26, -94, -41, -87, -109})) ? atm.m897d("B1D6A1EE97F9B1DAA1D397CEB1D2A1EF97F9B1E1A1E297C2B1EDA1D997FEB1DAA1E297CEB1E2A1E397C2B1DC") : atm.m897d("B1D6A1D297C3B1D6A1EE97F0B1E1A1EE97FCB1EDA1DE97C1B1EDA1E297FDB1E0A1EA97C4B1E2A1D497F8B1ECA1E397F4B1D2A1ED");
                                    case -341332605:
                                        m897d2 = atm.m897d("B1DEA1D797C0B1E2A1DE97FCB1E0A1E397C4B1DBA1DE97FFB1D1A1D997F0B1DAA1D097C0B1ECA1D197FDB1DCA1D397C1");
                                    case 2145956311:
                                        break;
                                }
                            }
                            z2 = true;
                            String m897d7 = atm.m897d("B1D2A1EE97F3B1E3A1DE97C1B1DCA1D597C7B1E2A1D097C2B1E6A1DD97F4B1DFA1D5");
                            while (true) {
                                switch (m897d7.hashCode() ^ 904838643) {
                                    case -1377329249:
                                        break;
                                    case -1088172201:
                                        m897d7 = z2 ? atm.m897d("B1D1A1E397C4B1D2A1E997C3B1D6A1EC97C3B1E5A1DD97CEB1E5A1E997F3B1E6A1EC97C3B1D6A1DD") : atm.m897d("B1E6A1D097CFB1D8A1D197C3B1D6A1D597F0B1E2A1EF97F0B1DDA1ED97CFB1D1A1D097C3B1DFA1D297FCB1DAA1DE97FCB1D2A1D097C0");
                                    case -937671086:
                                        m897d7 = atm.m897d("B1DDA1D297C0B1E2A1EF97CFB1DCA1ED97C4B1DFA1E397C0B1D2A1E297F9B1E2A1D997FEB1EDA1D397C2B1DBA1ED97F4B1DD");
                                    case 1977922032:
                                        Matcher matcher = this.f1141c.matcher(next.mo925d(C0052e.m1418a(new byte[]{-43, 6, -27, 21}, new byte[]{-67, 116, Byte.MIN_VALUE, 115, -104, 53, -55, 37})));
                                        String m897d8 = atm.m897d("B1DDA1EE97C0B1E2A1EC97FDB1DDA1EF97C3B1E5A1D497F9B1E0A1E297FEB1D2A1D497FDB1DBA1E297C0B1E3");
                                        while (true) {
                                            switch (m897d8.hashCode() ^ (-1131186859)) {
                                                case 49752576:
                                                    break;
                                                case 1966998281:
                                                    m897d8 = atm.m897d("B1E6A1E397F3B1D8A1EC97C7B1DEA1D597FDB1E1A1E397CEB1E2A1D297FEB1D2A1ED97FDB1DFA1DE97CEB1D1A1D097C0B1E5A1EF97FD");
                                                case 1979867652:
                                                    m897d8 = !matcher.find() ? atm.m897d("B1E1A1D397FFB1E2A1EC97FEB1DDA1ED97CFB1D2A1E997F0B1DCA1D497C0B1E2A1DE97F0B1E6A1EF97C2B1E5A1EF97FC") : atm.m897d("B1DEA1D097C2B1DDA1D297FCB1D2A1D497C2B1DDA1D397F9B1E2A1D497F0B1DDA1ED97C3B1ECA1E297FAB1E3A1D597F3B1E1A1D797CFB1E2A1D497C0");
                                                case 2124301068:
                                                    String trim = matcher.group(1).trim();
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put(C0052e.m1418a(new byte[]{112, 97, 59, -24, -112, -102, 94}, new byte[]{4, 24, 75, -115, -49, -13, 58, -5}), trim);
                                                    jSONObject.put(C0052e.m1418a(new byte[]{-36, 95, -45, -2, 82, 106, -86, 113, -51}, new byte[]{-88, 38, -93, -101, 13, 4, -53, 28}), m960w0);
                                                    jSONArray2.put(jSONObject);
                                                    continue;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 1192460234:
                            JSONObject jSONObject2 = new JSONObject();
                            String m897d9 = atm.m897d("B1D8A1E997CEB1E2A1D197FEB1DCA1ED97FFB1EDA1EE97C7B1D6A1DD97C1B1ECA1D1");
                            while (true) {
                                switch (m897d9.hashCode() ^ (-2002604803)) {
                                    case -1964209619:
                                        m897d9 = atm.m897d("B1DCA1D197F3B1E5A1ED97FDB1DAA1ED97F0B1E3A1D297FDB1D8A1E397F8B1E3A1D197C7B1DCA1E997C2");
                                        break;
                                    case -1102253655:
                                        break;
                                    case -89373141:
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-25, 56, -42, 2, -119, 94, 19}, new byte[]{-127, 81, -70, 118, -20, 44, 96, -46}), this.f1140b);
                                        break;
                                    case 1056572282:
                                        if (!z) {
                                            m897d9 = atm.m897d("B1DFA1EA97C3B1D2A1E997F3B1D2A1D497FFB1E2A1EC97FDB1DFA1D197C3B1DE");
                                            break;
                                        } else {
                                            m897d9 = atm.m897d("B1D6A1EA97C1B1E5A1D997F9B1D2A1D497C2B1DBA1D097F8B1EDA1D597C3B1DEA1E397F3");
                                            break;
                                        }
                                }
                            }
                            jSONObject2.put(C0052e.m1418a(new byte[]{-2, -47, 98, 85, 48}, new byte[]{-99, -67, 3, 38, 67, -39, -127, 15}), jSONArray2);
                            try {
                                m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{20, -29, -85, 85, 58, 5, -109, 58, 23, -32, -31, 74, 39, 3, -114}, new byte[]{97, -113, -123, 38, 78, 112, -6, 23})).get(0).m967p0(C0052e.m1418a(new byte[]{-82, 13, -57, -95, -86, 8, 43, 26, -25, 18, -34, -21, -75, 21, 45, 7, -107, 59, -45, -32, -95}, new byte[]{-54, 100, -79, -113, -39, 124, 94, 115}));
                                jSONArray = new JSONArray();
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                            while (true) {
                                String m897d10 = atm.m897d("B1DAA1DD97F8B1E2A1D797CEB1E2A1E997CEB1D6A1EC97F0B1DFA1ED97C3B1ECA1D2");
                                while (true) {
                                    switch (m897d10.hashCode() ^ 1251959764) {
                                        case -1684222712:
                                            m897d10 = i < m967p0.size() ? atm.m897d("B1DCA1EA97F8B1E1A1ED97C2B1DAA1E997C7B1DBA1EF97F9B1D6A1D797F4B1E6A1D497FDB1D1A1EA97F0B1E6A1D497CEB1E2A1EF97F0B1D8") : atm.m897d("B1E3A1D297C1B1E3A1D397FDB1E2A1ED97FFB1DEA1EC97F4B1E6A1ED97C2B1ECA1D197C3B1D8A1DD97FCB1DDA1D397C0");
                                        case -607446282:
                                            C0293m c0293m = m967p0.get(i);
                                            String m606a = c0293m.m967p0(C0052e.m1418a(new byte[]{54}, new byte[]{87, -111, 5, -93, 105, -29, 108, -6})).m606a(C0052e.m1418a(new byte[]{33, -123, -72, 62, -105}, new byte[]{85, -20, -52, 82, -14, 84, 117, 92}));
                                            String m606a2 = c0293m.m967p0(C0052e.m1418a(new byte[]{49}, new byte[]{80, -14, 32, 26, 25, -18, 97, 101})).m606a(C0052e.m1418a(new byte[]{-3, 22, 68, -46, 81, -97, Byte.MAX_VALUE, 33, -2, 30, 94, -46, 16}, new byte[]{-103, 119, 48, -77, 124, -16, 13, 72}));
                                            String m602e = c0293m.m967p0(C0052e.m1418a(new byte[]{-51, 30, -16, -75, 120, -90, -78, -3, -55, 70, -86}, new byte[]{-84, 62, -34, -59, 17, -59, -97, -119})).m602e();
                                            Matcher matcher2 = this.f1142d.matcher(c0293m.m967p0(C0052e.m1418a(new byte[]{-125}, new byte[]{-30, -58, 21, 15, 21, 69, Byte.MAX_VALUE, -8})).m606a(C0052e.m1418a(new byte[]{-25, -88, 66, -101}, new byte[]{-113, -38, 39, -3, -33, 73, 124, -121})));
                                            String m897d11 = atm.m897d("B1E0A1D397CEB1E2A1D797C0B1E6A1EE97FFB1DDA1D797F0B1E5A1D197FEB1D1A1EA97C4");
                                            while (true) {
                                                switch (m897d11.hashCode() ^ 1294876297) {
                                                    case -1978441402:
                                                        break;
                                                    case -673148551:
                                                        m897d11 = !matcher2.find() ? atm.m897d("B1DAA1EE97FEB1E2A1DD97C0B1DCA1ED97F3B1E2A1D197F9B1E0A1EA97C0B1ECA1DD97C0") : atm.m897d("B1EDA1D197F0B1E2A1DE97C7B1DCA1D197C7B1ECA1ED97C1B1DCA1D397F0B1DEA1EC97C2B1D2A1ED97C0");
                                                    case 1785410565:
                                                        m897d11 = atm.m897d("B1E1A1EA97FEB1E2A1E397C2B1E6A1ED97FEB1DCA1E997C0B1D6A1ED97C0B1E2A1EF97C1B1D6");
                                                    case 2145571469:
                                                        String group = matcher2.group(1);
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{-112, -93, 82, -22, -72, -82}, new byte[]{-26, -52, 54, -75, -47, -54, -80, 31}), group);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{-1, -43, 67, 18, -15, -58, -77, 119}, new byte[]{-119, -70, 39, 77, -97, -89, -34, 18}), m606a);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{3, 56, 23, 3, 34, 92, 84}, new byte[]{117, 87, 115, 92, 82, 53, 55, -78}), m606a2);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{45, -9, 103, -59, -7, -53, -112, -10, 41, -13, 112}, new byte[]{91, -104, 3, -102, -117, -82, -3, -105}), m602e);
                                                        jSONArray.put(jSONObject3);
                                                        break;
                                                }
                                            }
                                            i++;
                                            break;
                                        case -182807405:
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-91, 97, 76, 2}, new byte[]{-55, 8, 63, 118, 99, 11, 100, 42}), jSONArray);
                                            break;
                                        case 1706610090:
                                            m897d10 = atm.m897d("B1E3A1EA97C4B1D8A1D997C3B1E1A1D297FDB1E2A1EF97FDB1E5A1D597C3B1E6A1ED97C4B1E5A1D097C0B1DAA1D297F9B1EDA1EA97CFB1D8A1DD");
                                    }
                                }
                                return jSONObject2.toString();
                            }
                        case 1843504678:
                            m897d = atm.m897d("B1ECA1D797C4B1E2A1EE97F8B1DCA1ED97FCB1D1A1DE97CFB1E3A1EF97CFB1E6A1D497C0B1DEA1D797F8B1DDA1EF97C4B1D2A1D297FDB1E2");
                    }
                }
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public final void init(Context context) {
        super.init(context);
        try {
            Matcher matcher = Pattern.compile(C0052e.m1418a(new byte[]{-45, -46, 68, 51, 30, -88, 81, 32, -43, -92, 44, 2, 35, -104, 125, 98, -23, -9, 118, 61, 1, -108, 67, 104, -31, -23, 61, 63, 46, -102, 84, 107, -6, -47, Byte.MAX_VALUE, 38, 49, -113, 118, 82, -33, -14, 79, 28, 62, -43, 112, 36, -73, -77, 59, 20, 30, -84, 81, 82, -37, -14, 61, 18, 104, -60, 4, 34, -59, -17, 112, 31, 46, -102, 84, 107, -6, -51, 124, 33, 36, -110, 74, 32, -20, -31, 100, 33, 39, -119, 114, 98, -31, -3, 103}, new byte[]{-120, -114, 19, 79, 66, -5, 45, 14})).matcher(m259c(C0052e.m1418a(new byte[]{47, -69, 107, 7, -5, 66, 36, -1, 51, -71, 49, 27, -31, 26, 125, -71, 40, -31, 124, 20, -89, 11, Byte.MAX_VALUE, -79, 51, -90, 124, 88, -30, 11, 36, -96, 43, -82, 102, 18, -6, 27, 100, -66, 33, -90, 120, 89, -30, 11}, new byte[]{71, -49, 31, 119, -120, 120, 11, -48})));
            String m897d = atm.m897d("B1DCA1D497FDB1E2A1D197C4B1D2A1D397CEB1E5A1D997C3B1E2A1D997C2B1E5");
            while (true) {
                switch (m897d.hashCode() ^ (-1296693006)) {
                    case -483322994:
                        break;
                    case -100059645:
                        this.f1139a = new JSONObject(matcher.group(1));
                        break;
                    case 1495443514:
                        m897d = atm.m897d("B1E1A1D797FCB1DCA1D597C1B1DAA1D797FAB1D6A1D497C0B1E2A1EA97FFB1D6");
                        break;
                    case 2129161895:
                        if (!matcher.find()) {
                            m897d = atm.m897d("B1DFA1DD97CFB1D6A1D497F0B1E2A1D297FDB1DAA1EC97FAB1D6A1D297FAB1D6A1D597FDB1D1A1E397C0B1E0A1EF97F3B1ECA1ED");
                            break;
                        } else {
                            m897d = atm.m897d("B1E3A1DE97C0B1DFA1D597FDB1DFA1DD97FCB1D6A1D497C0B1E2A1D997CEB1DAA1D497CEB1E6A1ED97FAB1EDA1EF97C2B1E5A1D097C0");
                            break;
                        }
                }
            }
            this.f1140b = new JSONObject(atm.m897d("11584B57760311581110357A50584957607A041B17106E62489DCBCEA9C6E15856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9CEF69FF3D26E74480C584F6EBDFCE69FFCEB7A17560157227A50589DFDFDBEE9FF58596E2E48405892C4E98CF9FF57317411581457767A8CFBEA93CCCE485658036E62489CFBE5AAD8FC580759377A04584057A9D2C29EC7E96E74480C584F6EBDE0D29EC8D07A17560157227A50589DD2DDBDD3C158596E2E48405892EBC98FC3C157317411581457767A8FF3DD93CFDD485658036E62489FF3D2AADBEF580759377A04584057AAD0F29EC0FC6E74480C584F6EBEE2E29ECFC57A17560157227A505892D8EABDE6D058596E2E4840589DE1FE8FF6D057317411581457767A8DF0D592F1F2485658036E62489DF0DAABE5C0580759377A04584057A9D2C29DEECE6E74480C584F6EBDE0D29DE1F77A17560157227A50589FD0CBBDD3C158596E2E48405890E9DF8FC3C157317411581457767A8CD7DC91F2F8485658036E62489CD7D3A8E6CA580759377A04584057A9DEF893E3DC6E74480C584F6EBDECE893ECE57A17560157227A50589CEBE6BEE2E258596E2E48405893D2F28CF2E257317411581457767A8CFBEA93CCCE485658036E62489CFBE5AAD8FC580759377A04584057AADAC69DECE46E74480C584F6EBEE8D69DE3DD7A17560157227A50589CF6C6BEE8E058596E2E48405893CFD28CF8E057317411581457767A8DC1F590C9E0485658036E62489DC1FAA9DDD2580759377A04584057A5C5F89CE2D06E74480C584F6EB1F7E89CEDE97A17560157227A50589CE3CBB0E3C058596E2E48405893DADF82F3C057317411581457767A8FC4D492D8ED8FC7CB57607A1C584057A9E6C49DEEC0A9E5DB580759377A04584057A9D7CE92D9F06E74480C584F6EBDE5DE92D6C97A17560157227A50589FFBCABDE5C858596E2E48405890C2DE8FF5C857317411581457767A82C5EA90C6F0485658036E624892C5E5A9D2C2580759377A04584057A9DEF69CE7E46E74480C584F6EBDECE69CE8DD7A17560157227A50589FF1F3BFC1DF58596E2E48405890C8E78DD1DF57310517560157273D135840577D7A46581414213D48405890D0E88FF6C057607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8EC2D790D7E58FDEDD9CD5DE485658036E62489EC2D8A9C3D79FDED2A5C1EC580759377A04584057A8E0C79FE1C8A5FEF39CC2DA6E74480C584F6EBCD2D79FEEF1B1CCE39CCDE37A17560157227A50589ECDE1BDF1C79FFAFCBED3C458596E2E48405891F4F58FE1C790C3E88CC3C457317411581457767A8DC4F490D7E5485658036E62489DC4FBA9C3D7580759377A04584057AAEBFF9FE1C86E74480C584F6EBED9EF9FEEF17A17560157227A505892FEFDBDF1C758596E2E4840589DC7E98FE1C757317411581457767A8CEDDF93D0F4485658036E62489CEDD0AAC4C6580759377A04584057A5C7C39FE1C86E74480C584F6EB1F5D39FEEF17A17560157227A50589FCBFBBDF1C758596E2E48405890F2EF8FE1C757317411581457767A8CC9CA90D7E5485658036E62489CC9C5A9C3D7580759377A04584057A9D5DA9FC0D36E74480C584F6EBDE7CA9FCFEA7A17560157227A50589CF1C3BDCEDD9FFDE57A46580C57767A8CFEF590E8FF8FF2D357317411581457767A82DFC592C3F58DF3E357607A1C584057A4FDD59DF5D8ABD1F3580759377A04584057A9D2CA9CF1CAA9FCCD5856573A7A50589FFFECBEE1C59FD1EB7A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC57310517560157273D135840577D694856581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E6248484A477F7A46580C57767A584A48466E254601581B6E6248484A477E7A46580C57767A584A48476E254601581B6E6248484A477D7A46580C57767A584A48446E254601581B6E6248484A477C7A46580C57767A584A48456E254601581B6E6248484A44757A46580C57767A584A4B4C6E254601581B6E6248484A44747A46580C57767A584A4B4D6E254601581B6E6248484A447B7A46580C57767A584A4B426E254601581B6E6248484A447A7A46580C57767A584A4B436E254601581B6E6248484A44797A46580C57767A584A4B406E254601581B6E6248484A44787A46580C57767A584A4B416E254601581B6E6248484A447F7A46580C57767A584A4B466E254601581B6E6248484A447E7A46580C57767A584A4B476E254601581B6E6248484A447D7A46580C57767A584A4B446E254601581B6E6248484A447C7A46580C57767A584A4B456E254601581B6E6248484A45757A46580C57767A584A4A4C6E254601581B6E6248484A45747A46580C57767A584A4A4D6E254601581B6E6248484A457B7A46580C57767A584A4A426E254601581B6E6248484A457A7A46580C57767A584A4A436E254601581B6E6248484A45797A46580C57767A584A4A406E254601581B6E6248484A45787A46580C57767A584A4A416E254601581B6E6248484A457F7A46580C57767A584A4A466E254601581B6E6248484A457E7A46580C57767A584A4A476E254601581B6E6248484A457D7A46580C57767A584A4A446E254601581B6E6248484A457C7A46580C57767A584A4A456E253707560E6E330F03584F6E6C4856581B2D350F584057A4F7C792D2F56E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E624892F1C4A4F7C75856573A7A505892FEFDB0C5D7580860234814584F6EB1F5D392DAE17A46580C57767A83E5D39DE3F54807560E6E3648405893DBFD82D5D757607A1C584057AACFCF92D5D86E254601581B6E62489CC9E0A4F7C75856573A7A50589CC6D9B0C5D7580860234814584F6EBED9CA92DAE17A46580C57767A8CC9CA9DE3F54807560E6E3648405890F2EF82D5D757607A1C584057A9E6DD92D5D86E254601581B6E62489FF7C5A9E2CC92D5D86E74480C584F6EBDE7CA9FCFEAB0C5D7580860234814584F6EBDF1C792DAE17A46580C57767A8FE1C79DE3F54807560E6E3648405892FEFC82D5D757607A1C584057ABEACE92D5D86E254601581B6E62489EC5F1A4F7C75856573A7A50589ECAC8B0C5D7580860234814584F6EB0CFC59DFAE1BFE3E392DAE17A46580C57767A82DFC592C3F58DF3E39DE3F54807560E6E3648405893C8D78FDEDD90C4F182D5D757607A1C584057AADCE59FDED2A9D0C392D5D86E254601581B6E62489FFFC3A9F6E95856573A7A50589FF0FABDC4F9580811254601581E2921484058476E7448141B18297A50589CFBDEBDD0F558596E2E0B160F106E623101581B6E62489CEDC3A5CFDE5856573A7A50580E1C213D4807560E6E3648405891F6E28CCAEE57607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5858402E377A011F0357767A595856572239071F584F6EBFDBC19FEBC77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FFAE8B0C9FF58596E2E48405890C3FC82D9FF57317411581457767A8CF2E291F6D1485658036E62489CF2EDA8E2E3580759377A04584057A5C5F89CE2D0A9D9DC9FF9FA6E74480C584F6EB1F7E89CEDE9BDEBCC9FF6C37A17560157227A50589FE3D0BDE3DD58596E2E48405890DAC48FF3DD57317411581457767A8FD4CC90F6F5485658036E62489FD4C3A9E2C7580759377A04584057ABD2C59DC7DF6E74480C584F6EBFE0D59DC8E67A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8FDFFD90F5E3485658036E62489FDFF2A9E1D1580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE3DD9CF6C97A17560157227A50589FFBCABDE5C858596E2E48405890C2DE8FF5C857317411581457767A8DC1F590C9E0485658036E62489DC1FAA9DDD2580759377A04584057A8E1CB9CE7E46E74480C584F6EBCD3DB9CE8DD7A17560157227A50589CF6C9BEF3D558596E2E48405893CFDD8CE3D557317411581457767A8FEFFC93C4C0485658036E62489FEFF3AAD0F2580759377A04584057ABE5FB9FF3D26E74480C584F6EBFD7EB9FFCEB7A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC57310517560157273D135840577D7A46581414213D48405890D0E88FF6C057607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8EC2D790D7E58FDEDD9CD5DE485658036E62489EC2D8A9C3D79FDED2A5C1EC580759377A04584057A8E0C79FE1C8A9D7DA9CC3CB6E74480C584F6EBCD2D79FEEF1BDE5CA9CCCF27A17560157227A50589ECDE1BDF1C793D3D5BED2D558596E2E48405891F4F58FE1C79CEAC18CC2D557317411581457767A83E5D390D7E5485658036E624893E5DCA9C3D7580759377A04584057AACFCF9CE6D96E74480C584F6EBEFDDF9CE9E07A17560157227A50589DCBC2BDF1C758596E2E48405892F2D68FE1C757317411581457767A8CC9CA90D7E5485658036E62489CC9C5A9C3D7580759377A04584057A4D3DB9FE1C86E74480C584F6EB0E1CB9FEEF17A17560157227A50589CE3FCBDE0DA9FE8ED7A46580C57767A8CECCA90C6F88FE7DB57317411581457767A8FFFCC91F7CE485658036E62489FFFC3A8E3FC580728317411581110357A50584E57607A041B17106E624892D5D8A4F0EA5856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A4D3DB92D5D86E74480C584F6EB0E1CB92DAE17A17560157227A505893EAE5B0C5D758596E2E4840589CD3F182D5D757317411581457767A8CEDDF9DE3F5485658036E62489CEDD0A4F7C7580759377A04584057AAEBFF92D5D86E74480C584F6EBED9EF92DAE17A17560157227A50589CC6FCB0C5D758596E2E48405893FFE882D5D757317411581457767A8FC4CD9DE3F5485658036E62489FC4C2A4F7C7580759377A04584057A9D5DA9FC0D3A4F7C75856573A7A50589FF8FCBDD0DC92DAE17A17560157227A50589FEEF1B0C5D758596E2E48405890D7E582D5D757317411581457767A8DC8DE9DE3F5485658036E62489DC8D1A4F7C7580759377A04584057A8E7EE92D5D86E74480C584F6EBCD5FE92DAE17A17560157227A505892D0F3BFE5D79DFCD5B0C5D758596E2E4840589DE9E78DF5D792C5C182D5D757317411581457767A8CFEF590E8FF8FF2D39DE3F5485658036E62489CFEFAA9FCCD9FF2DCA4F7C7580759377A04584057A9DDDC9FD4F66E74480C584F6EBDEFCC9FDBCF7A17270759377A011F0357767A5B4B58596E360B171F57767A8FC3CE91F7E5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058477C695C5856573A7A505848457D6E4807560E6E36484058477C695F5856573A7A505848457D6D4807560E6E36484058477C695E5856573A7A505848457D6C4807560E6E36484058477C69595856573A7A505848457D6B4807560E6E36484058477C69585856573A7A505848457D6A4807560E6E36484058477C695B5856573A7A505848457D694807560E6E36484058477C695A5856573A7A505848457D684807560E6E36484058477C68535856573A7A505848457C614807560E6E36484058477C68525856573A7A505848457C604807560E6E36484058477C685D5856573A7A505848457C6F4807560E6E36484058477C685C5856573A7A505848457C6E4807560E6E36484058477C685F5856573A7A505848457C6D4807560E6E36484058477C685E5856573A7A505848457C6C4807560E6E36484058477C68595856573A7A505848457C6B4807560E6E36484058477C68585856573A7A505848457C6A4807560E6E36484058477C685B5856573A7A505848457C694807560E6E36484058477C685A5856573A7A505848457C6848072708602348111F0C6E62484858596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBEFDCC93E2F87A46580C57767A1E1317106E254601581B6E62489EC0CFAAE8FE5856573A7A5058121C382B4807560E6E364840589DE3DC8FF2FC57607A1C5840573F3B05081F57310517275657787A50210157273D135840577F7A46581414213D48405892FDE38FE4F157607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8CF9FF93C8C7485658036E62489CF9F0AADCF5580759377A04584057ABFFFB9FC3CE6E74480C584F6EBFCDEB9FCCF77A17560157227A50589DF6E1B0CBFA58596E2E48405892CFF582DBFA57317411581457767A8CF4D292DCDE485658036E62489CF4DDABC8EC580759377A04584057AAC8F49DD6E46E74480C584F6EBEFAE49DD9DD7A17560157227A50589FF3DEB1F3D358596E2E48405890CACA83E3D357317411581457767A82EAE79DC2D1485658036E624892EAE8A4D6E3580759377A04584057AAF8CB9FE1D86E74480C584F6EBECADB9FEEE17A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8CE6C093C4C0485658036E62489CE6CFAAD0F2580759377A04584057A4E7FA9FF0DD6E74480C584F6EB0D5EA9FFFE47A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A8FCAEB90F5EC485658036E62489FCAE4A9E1DE580759377A04584057A9E8FB9FDFC66E74480C584F6EBDDAEB9FD0FF7A17560157227A50589DD1F2BCD6E058596E2E48405892E8E68EC6E057317411581457767A8FF4E590C4C3485658036E62489FF4EAA9D0F1580759377A04584057A8E2D89FD7E56E74480C584F6EBCD0C89FD8DC7A17560157227A50589DEEC6BEF3C058596E2E48405892D7D28CE3C057317411581457767A8FF0CB90F3CF485658036E62489FF0C4A9E7FD580759377A04584057A9DDDC9EC1E36E74480C584F6EBDEFCC9ECEDA7A17270759377A011F0357767A5B5856572239071F584F6EBDF6CA9FF9F67A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589ECDE1BDF1C758596E2E48405891F4F58FE1C757317411581457767A8CEDDF93D0F4485658036E62489CEDD0AAC4C6580759377A04584057AAF4CD9DC4FB6E74480C584F6EBEC6DD9DCBC27A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC57310517560157273D135840577D694856581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E6248484A477F7A46580C57767A584A48466E254601581B6E6248484A477E7A46580C57767A584A48476E254601581B6E6248484A477D7A46580C57767A584A48446E254601581B6E6248484A477C7A46580C57767A584A48456E254601581B6E6248484A44757A46580C57767A584A4B4C6E254601581B6E6248484A44747A46580C57767A584A4B4D6E254601581B6E6248484A447B7A46580C57767A584A4B426E254601581B6E6248484A447A7A46580C57767A584A4B436E254601581B6E6248484A44797A46580C57767A584A4B406E254601581B6E6248484A44787A46580C57767A584A4B416E254601581B6E6248484A447F7A46580C57767A584A4B466E254601581B6E6248484A447E7A46580C57767A584A4B476E254601581B6E6248484A447D7A46580C57767A584A4B446E254601581B6E6248484A447C7A46580C57767A584A4B456E254601581B6E6248484A45757A46580C57767A584A4A4C6E254601581B6E6248484A45747A46580C57767A584A4A4D6E254601581B6E6248484A457B7A46580C57767A584A4A426E254601581B6E6248484A457A7A46580C57767A584A4A436E254601581B6E6248484A45797A46580C57767A584A4A406E254601581B6E6248484A45787A46580C57767A584A4A416E254601581B6E6248484A457F7A46580C57767A584A4A466E254601581B6E6248484A457E7A46580C57767A584A4A476E254601581B6E6248484A457D7A46580C57767A584A4A446E254601581B6E6248484A457C7A46580C57767A584A4A456E253707560E6E330F03584F6E6A4856581B2D350F584057AAD6F89FC0FA6E74480C1B19393D4840210E6E3648405893DBEE83EDCE57607A1C5840573831071F580860234814584F6EBCD0C09CC5D87A46580C57767A02130E066E254601581B6E624892D5F1A9D0EC5856573A7A50580916232A0F580728310546584B406E623101581E2921484058466E7448141B18297A50589DC4F7BDF4F158596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6EBDE5DE92D6C97A46580C57767A8FF5DE9DEFDD4807560E6E3648405893C4C08EC0F357607A1C584057AAD0F29EC0FC6E254601581B6E624893E7E7AAC0CF9FFBC3A9DBE55856573A7A505893E8DEBEF2DF9FF4FABDE9F5580860234814584F6EBDFCE69FFCEB7A46580C57767A8FECE690C5FF4807560E6E3648405890E2EE8FC0D757607A1C584057A9F6DC9FC0D86E254601581B6E62489DF0DAABE5C05856573A7A50589DFFE3BFD7D0580860234814584F6EBDE0D29EC8D07A46580C57767A8FF0D291F1C44807560E6E3648405890E9DF8FC3C157607A1C584057A9FDED9FC3CE6E254601581B6E62489FF3D2AADBEF5856573A7A50589FFCEBBEE9FF580860234814584F6EBDE4FC9FFAFE7A46580C57767A8FF4FC90C3EA4807560E6E3648405892F7D78FFFC257607A1C584057ABE3E59FFFCD6E254601581B6E62489EC3D4AAC5FB5856573A7A50589ECCEDBEF7EB580860234814584F6EBEE9FF9CECE37A46580C57767A8CF9FF93D5F74807560E6E3648405890D9DE8CF2E257607A1C584057A9CDEC9CF2ED6E254601581B6E62489DC7E4A9D1CD5856573A7A50589DC8DDBDE3DD580860234814584F6EBEE9F09CF7D67A46580C57767A8CF9F093CEC24807560E6E3648405890C9EE8EC1EC57607A1C584057A9DDDC9EC1E36E253707560E6E330F03584F6E694856581B2D350F584057A9C4DA9FF6CF6E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489CEDD0AAC4C65856573A7A50589CE2E9BEF6D6580860234814584F6EB1F5D39FEEF17A46580C57767A83E5D390D7E548072708602348111F0C6E62484B4B57607A041B17106E62489FC3C1A8E3D75856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A045840577E68584958596E2E484058477C6A59580759377A045840577E68584858596E2E484058477C6A58580759377A045840577E68584B58596E2E484058477C6A5B580759377A045840577E68584A58596E2E484058477C6A5A580759377A045840577E685B4358596E2E484058477C6953580759377A045840577E685B4258596E2E484058477C6952580759377A045840577E685B4D58596E2E484058477C695D580759377A045840577E685B4C58596E2E484058477C695C580759377A045840577E685B4F58596E2E484058477C695F580759377A045840577E685B4E58596E2E484058477C695E580759377A045840577E685B4958596E2E484058477C6959580759377A045840577E685B4858596E2E484058477C6958580759377A045840577E685B4B58596E2E484058477C695B580759377A045840577E685B4A58596E2E484058477C695A580759377A045840577E685A4358596E2E484058477C6853580759377A045840577E685A4258596E2E484058477C6852580759377A045840577E685A4D58596E2E484058477C685D580759377A045840577E685A4C58596E2E484058477C685C580759377A045840577E685A4F58596E2E484058477C685F580759377A045840577E685A4E58596E2E484058477C685E580759377A045840577E685A4958596E2E484058477C6859580759377A045840577E685A4858596E2E484058477C6858580759377A045840577E685A4B58596E2E484058477C685B580759377A045840577E685A4A58596E2E484058477C685A580728317411581110357A50584857607A041B17106E62489CF4E7A9E2E55856573A39060F1F57760311581457767A8CEDCC9CDBEC485658036E62480E1318297A17560157227A50589ECFF6BEDAEE58596E2E4840581D252C19580759377A04584057A4F7EE9FF2F36E74480C584F6E2B091508106E25370727596E695C58402E377A011F0357767A595856572239071F584F6EBFDBC19FEBC77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FFAE8B0C9FF58596E2E48405890C3FC82D9FF57317411581457767A8CF2E291F6D1485658036E62489CF2EDA8E2E3580759377A04584057A5C5F89CE2D0A9D9DC9FF9FA6E74480C584F6EB1F7E89CEDE9BDEBCC9FF6C37A17560157227A50589FE3D0BDE3DD58596E2E48405890DAC48FF3DD57317411581457767A8FD4CC90F6F5485658036E62489FD4C3A9E2C7580759377A04584057ABD2C59DC7DF6E74480C584F6EBFE0D59DC8E67A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8FDFFD90F5E3485658036E62489FDFF2A9E1D1580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE3DD9CF6C97A17560157227A50589FFBCABDE5C858596E2E48405890C2DE8FF5C857317411581457767A8DC1F590C9E0485658036E62489DC1FAA9DDD2580759377A04584057A8E1CB9CE7E46E74480C584F6EBCD3DB9CE8DD7A17560157227A50589CF6C9BEF3D558596E2E48405893CFDD8CE3D557317411581457767A8FEFFC93C4C0485658036E62489FEFF3AAD0F2580759377A04584057ABE5FB9FF3D26E74480C584F6EBFD7EB9FFCEB7A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC57310517560157273D135840577D7A46581414213D48405890D0E88FF6C057607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8DC4F490D7E5485658036E62489DC4FBA9C3D7580759377A04584057A4D3DB9FE1C86E74480C584F6EB0E1CB9FEEF17A17560157227A50589FCBFBBDF1C758596E2E48405890F2EF8FE1C757317411581457767A8FF0DA93C7E78FDEDD57607A1C584057A9D2CA9CF1CAA9FCCD580759377A04584057A9DDDC9EC1E36E74480C584F6EBDEFCC9ECEDA7A17270759377A011F0357767A5B4B58596E360B171F57767A8FC3CE91F7E5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058477C695C5856573A7A505848457D6E4807560E6E36484058477C695F5856573A7A505848457D6D4807560E6E36484058477C695E5856573A7A505848457D6C4807560E6E36484058477C69595856573A7A505848457D6B4807560E6E36484058477C69585856573A7A505848457D6A4807560E6E36484058477C695B5856573A7A505848457D694807560E6E36484058477C695A5856573A7A505848457D684807560E6E36484058477C68535856573A7A505848457C614807560E6E36484058477C68525856573A7A505848457C604807560E6E36484058477C685D5856573A7A505848457C6F4807560E6E36484058477C685C5856573A7A505848457C6E4807560E6E36484058477C685F5856573A7A505848457C6D4807560E6E36484058477C685E5856573A7A505848457C6C4807560E6E36484058477C68595856573A7A505848457C6B4807560E6E36484058477C68585856573A7A505848457C6A4807560E6E36484058477C685B5856573A7A505848457C694807560E6E36484058477C685A5856573A7A505848457C6848072708602348111F0C6E62484E58596E360B171F57767A82D5D79DE4D8485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890D7E582D5D757607A1C584057A9C3D792D5D86E254601581B6E62489CEDD0A4F7C75856573A7A50589CE2E9B0C5D7580860234814584F6EB0E1CB92DAE17A46580C57767A82F1CB9DE3F54807560E6E3648405890C9EE8EC1EC57607A1C584057A9DDDC9EC1E36E253707560E6E330F03584F6E6A4856581B2D350F584057AAD6F89FC0FA6E74480C1B19393D4840210E6E3648405893DBEE83EDCE57607A1C5840573831071F580860234814584F6EBCD0C09CC5D87A46580C57767A02130E066E254601581B6E624892D5F1A9D0EC5856573A7A50580916232A0F580728310517"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public final String playerContent(String str, String str2, List<String> list) {
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0052e.m1418a(new byte[]{-51, 89, -27, 54, 9, -22}, new byte[]{-94, 43, -116, 81, 96, -124, -6, -11}), C0052e.m1418a(new byte[]{-63, 19, -110, 34, 49, -121, 4, -95, -50, 12, -111, 33, 111, -104, 87, -20, -105, 18, -119, 120, 39, -127, 80, -95}, new byte[]{-31, 123, -26, 86, 65, -12, 62, -114}));
            jSONObject.put(C0052e.m1418a(new byte[]{59, Byte.MIN_VALUE, -93, -125, -33, 103, 108, 50, 0, -121}, new byte[]{110, -13, -58, -15, -14, 38, 11, 87}), C0052e.m1418a(new byte[]{-94, -72, 63, -88, 111, 113, -105, 63, -83, -64, 126, -30, 38, 53, -74, 63, -31, -100, 62, -90, 105, 110, -109, 101, -94, -68, 62, -90, 99, 113, -37, 19, -29, -106, 112, -99, 85, 61, -93, 126, -77, -59, 15, -29, 51, 66, -52, 119, -94, -76, 32, -94, 106, 120, -84, 59, -32, -66, 57, -90, 41, 40, -56, 105, -84, -58, 102, -14, 46, 86, -77, 10, -49, -71, 124, -14, 106, 116, -112, 59, -94, -78, 53, -79, 109, 114, -46, 126, -63, -99, 34, -67, 107, 120, -44, 103, -77, -37, 96, -4, 50, 41, -52, 108, -84, -60, 97, -26, 38, 78, -102, 56, -29, -121, 57, -3, 51, 46, -52, 112, -79, -61}, new byte[]{-126, -11, 80, -46, 6, 29, -5, 94}));
            jSONObject.put(C0052e.m1418a(new byte[]{-110, 11, -65, -21, -64, 87}, new byte[]{-45, 104, -36, -114, -80, 35, -54, -27}), C0052e.m1418a(new byte[]{52, -20, -19, -68}, new byte[]{20, -58, -62, -106, -14, -4, 67, 24}));
            jSONObject.put(C0052e.m1418a(new byte[]{91, -15, -4, 125, 104, -57, 26, 47, 123, -4, -8, 109, 121, -44, 82}, new byte[]{26, -110, -97, 24, 24, -77, 55, 99}), C0052e.m1418a(new byte[]{-51, -105, -104, 31, -126, 99, -112, -124, -123, -42, -127, 15, -15, 3, -123, -46, -120, -125, -35, 103, -110, 22, -51, -61, -35, -61, -61, 30, -92, 67, -121, -113, -48, -35, -34, 5}, new byte[]{-19, -19, -16, 50, -63, 45, -68, -2}));
            jSONObject.put(C0052e.m1418a(new byte[]{-76, -13, 35, -124, -64, -7, 95, -41, -101, -13, 47, -123, -39, -29, 21}, new byte[]{-11, -112, 64, -31, -80, -115, 114, -110}), C0052e.m1418a(new byte[]{32, -90, -101, 74, -27, 109, -32, 46, 101, -89, -115, 66, -31, 36}, new byte[]{0, -63, -31, 35, -107, 65, -64, 74}));
            jSONObject.put(C0052e.m1418a(new byte[]{-83, 123, 56, 42, 115, 40, 0}, new byte[]{-1, 30, 94, 79, 1, 77, 114, -62}), C0052e.m1418a(new byte[]{63, -34, 123, -26, 23, 33, -14, 38, 48, -63, 120, -27, 73, 62, -95, 107, 105, -33, 96, -68, 1, 39, -90, 38}, new byte[]{31, -74, 15, -110, 103, 82, -56, 9}));
            C0459g m967p0 = C0052e.m1414e(m259c(C0052e.m1418a(new byte[]{59, 43, -39, 36, 0, -69, 40, -114, 39, 41, -125, 56, 26, -29, 113, -56, 60, 113, -50, 55, 92, -15, 107, -64, 42, 112}, new byte[]{83, 95, -83, 84, 115, -127, 7, -95}) + str2 + C0052e.m1418a(new byte[]{-118, 18, 6, -77, -52}, new byte[]{-92, 122, 114, -34, -96, 74, 17, -88}))).m967p0(C0052e.m1418a(new byte[]{82, -105, 34, -91, -58, 41}, new byte[]{33, -12, 80, -52, -74, 93, 30, -97}));
            int i2 = 0;
            while (true) {
                String m897d = atm.m897d("B1E5A1ED97CEB1DDA1D197FEB1E2A1EE97C2B1DAA1D397F0B1D2A1D597CFB1DDA1D197F0B1DFA1ED");
                while (true) {
                    switch (m897d.hashCode() ^ (-1004059745)) {
                        case -1734780951:
                            m897d = i2 < m967p0.size() ? atm.m897d("B1DCA1D197F8B1DDA1E297C4B1D2A1D197FDB1D1A1D097F0B1ECA1D497FDB1E2A1D497F0") : atm.m897d("B1ECA1EE97C1B1E2A1E397CEB1D6A1E397FFB1E2A1E297F8B1ECA1E997C3B1DEA1D297F8B1E2A1ED97C1B1ECA1D497FCB1E6A1ED97C0");
                        case -1659300148:
                            String trim = m967p0.get(i2).m979d0().trim();
                            String m897d2 = atm.m897d("B1DDA1D497FEB1E1A1EF97FDB1D6A1D497F9B1DEA1E297F4B1DEA1EE97FDB1E2A1D497CFB1E0A1D297C1B1D1A1EE97FFB1E1");
                            while (true) {
                                switch (m897d2.hashCode() ^ 1530803811) {
                                    case -1919891305:
                                        JSONObject jSONObject2 = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                                        String m897d3 = atm.m897d("B1DFA1E997F3B1E6A1ED97C7B1DCA1EF97F0B1E2A1EF97C4B1D2A1EE97FCB1E2A1D797FCB1DCA1ED97FFB1D2A1D297F3B1DFA1E997C0");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-894417769)) {
                                                case -1714531419:
                                                    break;
                                                case -12762938:
                                                    m897d3 = atm.m897d("B1ECA1EE97F3B1E1A1E997F4B1D2A1EC97FFB1E0A1D097FAB1E3A1EC97C1B1EDA1D397FA");
                                                case 472023707:
                                                    m897d3 = this.f1139a.has(jSONObject2.getString(C0052e.m1418a(new byte[]{94, -116, -59, 86}, new byte[]{56, -2, -86, 59, 107, 99, -19, Byte.MIN_VALUE}))) ? atm.m897d("B1ECA1E997FAB1EDA1D397CEB1E2A1EF97C7B1DCA1EF97C3B1D8A1D297C4B1DBA1ED97CFB1D6A1E997C0B1DAA1D497F3B1E5A1EC97F3") : atm.m897d("B1E0A1D097C0B1DFA1EE97FFB1D8A1ED97C0B1E2A1DE97C4B1E5A1D597F0B1DBA1ED97C7B1ECA1D297C0B1EDA1D597F8B1DBA1ED97FD");
                                                case 1536044311:
                                                    JSONObject jSONObject3 = this.f1139a.getJSONObject(jSONObject2.getString(C0052e.m1418a(new byte[]{-69, 32, 32, -50}, new byte[]{-35, 82, 79, -93, -21, -92, -114, -95})));
                                                    String m897d4 = atm.m897d("B1E0A1D597F3B1EDA1EE97C2B1D2A1D197C1B1E5A1E997C7B1ECA1EF97C2B1DEA1D397F4B1D8A1EA97FDB1E1A1E997CFB1E3A1D297F9");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ 2123041750) {
                                                            case -1715799721:
                                                                String str3 = C0052e.m1418a(new byte[]{94, -56, 100, 80, 121, -124, -1, -19, 70, -114, 62, 67, 108, -48, -65, -90, 83, -115, 62, 88, 115, -60, -1, -82, 84, -110, 96, 72, 122, -127, -91, -80, 90, -127}, new byte[]{54, -68, 16, 32, 10, -66, -48, -62}) + jSONObject2.getString(C0052e.m1418a(new byte[]{-79, 119, 30}, new byte[]{-60, 5, 114, 50, -71, -83, -8, -107}));
                                                                System.out.println(str3);
                                                                C0288h m1414e = C0052e.m1414e(C0629f.m179f(str3, m261a()));
                                                                Pattern compile = Pattern.compile(C0052e.m1418a(new byte[]{99, 94, -115, 101, -28, 18, -43, -46, 23, 18, -116, 4, -30, 71, -112, -113, 97, 94, -103, 103, -84, 71, -112}, new byte[]{75, 97, -79, 88, -111, 96, -71, -95}));
                                                                C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-68, -67, -60, 29, -23, 4, 116, -88, -73, -94, -44}, new byte[]{-34, -46, -96, 100, -55, 119, 23, -38}));
                                                                while (true) {
                                                                    String m897d5 = atm.m897d("B1DCA1EF97FFB1E6A1E297FDB1E2A1E297F3B1E6A1EF97FDB1DBA1ED97FAB1DEA1D9");
                                                                    while (true) {
                                                                        switch (m897d5.hashCode() ^ (-1015313090)) {
                                                                            case -1716620812:
                                                                                break;
                                                                            case -1032761501:
                                                                                m897d5 = atm.m897d("B1D2A1EA97F0B1E2A1DE97C2B1E3A1DE97C3B1ECA1E397F8B1DBA1ED97FFB1D2A1D597CFB1E5A1D097C0");
                                                                            case 63476936:
                                                                                Matcher matcher = compile.matcher(m967p02.get(i).m979d0().trim());
                                                                                String m897d6 = atm.m897d("B1ECA1D297CEB1E2A1D997FEB1D2A1D797CFB1E2A1ED97C0B1E5A1DD97C0B1E5A1DD97FAB1E1A1ED97C4B1ECA1EF97CF");
                                                                                while (true) {
                                                                                    switch (m897d6.hashCode() ^ (-153849624)) {
                                                                                        case -1623629616:
                                                                                            JSONObject jSONObject4 = new JSONObject();
                                                                                            String group = matcher.group(0);
                                                                                            jSONObject4.put(C0052e.m1418a(new byte[]{-68, -43, 62, 12, 38}, new byte[]{-52, -76, 76, Byte.MAX_VALUE, 67, 54, -125, -82}), 0);
                                                                                            jSONObject4.put(C0052e.m1418a(new byte[]{95, 39, 85, -106, 31, 90, 118}, new byte[]{47, 75, 52, -17, 74, 40, 26, 87}), "");
                                                                                            jSONObject4.put(C0052e.m1418a(new byte[]{-59, -115, 84}, new byte[]{-80, -1, 56, 2, -67, 126, 34, 72}), group);
                                                                                            return jSONObject4.toString();
                                                                                        case -1058751916:
                                                                                            break;
                                                                                        case 603848377:
                                                                                            m897d6 = atm.m897d("B1EDA1EF97C0B1E2A1DE97C0B1D2A1ED97FEB1DCA1EF97F3B1DFA1E997C2B1E5A1D997CEB1D1A1E297F3B1DBA1D797C7B1E5A1D797CFB1DCA1D5");
                                                                                        case 1307447758:
                                                                                            m897d6 = matcher.find() ? atm.m897d("B1E6A1ED97F0B1DDA1EE97F8B1DCA1E997F0B1DBA1D197C0B1E2A1EC97C1B1DFA1ED97C3B1DFA1D297C0B1E3A1EA97C7B1DBA1D997F4B1E6") : atm.m897d("B1DBA1D497C4B1E2A1EE97C3B1E5A1DE97C0B1E2A1ED97F9B1DBA1EF97F8B1DAA1DD97C2");
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1737896927:
                                                                                m897d5 = i < m967p02.size() ? atm.m897d("B1E2A1EA97F4B1DDA1D297CEB1E2A1D297C4B1E2A1ED97F0B1DBA1E297F4B1D1A1D397C7B1ECA1E297FFB1E6A1ED97C1B1D1A1E2") : atm.m897d("B1ECA1E397FDB1E2A1EF97F4B1D6A1D297FEB1D1A1DE97CEB1E3A1D097FEB1E2A1ED");
                                                                        }
                                                                    }
                                                                    i++;
                                                                }
                                                                break;
                                                            case -249611036:
                                                                m897d4 = atm.m897d("B1E5A1D497FAB1DCA1D397C0B1E2A1D197FFB1DEA1D597C7B1D6A1DD97FCB1E6A1D197C1B1ECA1D397C0B1ECA1ED");
                                                                break;
                                                            case 316538530:
                                                                String m897d7 = atm.m897d("B1D1A1DD97F0B1DDA1D297FFB1ECA1D397CEB1E2A1D397C3B1D6A1DE97F9B1E2A1D597FFB1DFA1D597C2B1D6A1D597FAB1E3A1D597FEB1DD");
                                                                while (true) {
                                                                    switch (m897d7.hashCode() ^ (-403353401)) {
                                                                        case -779592528:
                                                                            if (!jSONObject3.getString(C0052e.m1418a(new byte[]{-126, -45, 105, -108}, new byte[]{-15, -69, 6, -29, 10, 65, -48, -71})).equals(C0052e.m1418a(new byte[]{-36, -35, 109, -29, 112, -83, 111, -25}, new byte[]{-99, -108, -117, 113, -35, 75, -5, 89}))) {
                                                                                m897d7 = atm.m897d("B1D6A1D597C0B1E2A1D197FDB1E1A1EF97F9B1D2A1EC97CEB1D8A1D497CFB1D1A1D797CEB1E2A1D597F9B1DBA1ED");
                                                                                break;
                                                                            } else {
                                                                                m897d7 = atm.m897d("B1DFA1EE97CFB1E6A1DD97C0B1D1A1E297C2B1DCA1D297C1B1DDA1EC97F0B1E2A1DE97C4B1ED");
                                                                                break;
                                                                            }
                                                                        case 650499158:
                                                                            String m897d8 = atm.m897d("B1ECA1E997C4B1E6A1D797F9B1ECA1E997FEB1E2A1D397FAB1E6A1ED97FCB1DEA1DE97F4B1D1A1ED");
                                                                            while (true) {
                                                                                switch (m897d8.hashCode() ^ 1432929737) {
                                                                                    case 300625156:
                                                                                        String m897d9 = atm.m897d("B1ECA1D397C3B1D8A1DD97FDB1E2A1E397CFB1D8A1DE97CFB1ECA1D397C4B1D1A1EE97C3");
                                                                                        while (true) {
                                                                                            switch (m897d9.hashCode() ^ 929908671) {
                                                                                                case -1970058089:
                                                                                                    if (!jSONObject2.getString(C0052e.m1418a(new byte[]{-19, 101, -108, -3}, new byte[]{-117, 23, -5, -112, 46, -25, -66, 47})).contains(C0052e.m1418a(new byte[]{12, 14, -56}, new byte[]{109, 98, -95, -26, -25, -103, 70, -30}))) {
                                                                                                        m897d9 = atm.m897d("B1E6A1ED97C1B1E0A1DD97CFB1E2A1EC97F0B1D2A1EA97C3B1E3");
                                                                                                        break;
                                                                                                    } else {
                                                                                                        m897d9 = atm.m897d("B1E0A1D297C4B1E1A1D597F3B1E2A1EF97FCB1E5A1DD97C0B1E5A1EF97CEB1E2A1EE97C1B1D6A1D197C0B1E1A1DE97CEB1EC");
                                                                                                        break;
                                                                                                    }
                                                                                                case -1435316241:
                                                                                                    break;
                                                                                                case -343613004:
                                                                                                    C0288h m1414e2 = C0052e.m1414e(C0629f.m179f(jSONObject3.getString(C0052e.m1418a(new byte[]{102, -114}, new byte[]{22, -5, 41, 87, -106, -111, 9, -79})) + jSONObject2.getString(C0052e.m1418a(new byte[]{-86, 96, -62}, new byte[]{-33, 18, -82, 97, 122, 99, 49, 6})), m261a()));
                                                                                                    Pattern compile2 = Pattern.compile(C0052e.m1418a(new byte[]{12, 8, 85, 2, 10, 79, -16, -38, 4, 10, 73, 24, 86, 19, -73, -106, 12, 8, 84, 24, 68, 20}, new byte[]{36, 55, 105, 63, Byte.MAX_VALUE, 61, -100, -87}));
                                                                                                    C0459g m967p03 = m1414e2.m967p0(C0052e.m1418a(new byte[]{-81, 111, -19, -34, -117, -126, -115, 68, -92, 112, -3}, new byte[]{-51, 0, -119, -89, -85, -15, -18, 54}));
                                                                                                    String m897d10 = atm.m897d("B1D1A1D797F0B1E2A1D297CEB1ECA1D197C3B1ECA1D197F4B1DDA1EC97F0B1E5A1EE97C0B1E5A1D597C0B1E1");
                                                                                                    while (true) {
                                                                                                        switch (m897d10.hashCode() ^ (-724778591)) {
                                                                                                            case -1219352240:
                                                                                                                break;
                                                                                                            case 217046256:
                                                                                                                if (m967p03.size() <= 0) {
                                                                                                                    m897d10 = atm.m897d("B1E6A1D497CEB1DAA1D497C1B1D8A1D197C4B1E2A1EA97C4B1DBA1EC97F9B1E2");
                                                                                                                    break;
                                                                                                                } else {
                                                                                                                    m897d10 = atm.m897d("B1D2A1D497FAB1ECA1D597CEB1E2A1D397CEB1D6A1EF97FCB1ECA1ED97C2B1DDA1E397C0B1DCA1EF97C0B1E2A1D397C2B1D6A1D997FEB1DEA1D797FDB1E6");
                                                                                                                    break;
                                                                                                                }
                                                                                                            case 448490576:
                                                                                                                m897d10 = atm.m897d("B1D8A1D797C0B1DBA1EC97F0B1D2A1D797FEB1E6A1D997CEB1DCA1D797FEB1D8A1EC97CEB1D1A1E297C1");
                                                                                                                break;
                                                                                                            case 1309271399:
                                                                                                                Matcher matcher2 = compile2.matcher(m967p03.get(0).m979d0().trim());
                                                                                                                String m897d11 = atm.m897d("B1EDA1D097C0B1E2A1E297FDB1D2A1ED97F4B1D6A1DE97C2B1E0A1E297C2B1DFA1D797FAB1EC");
                                                                                                                while (true) {
                                                                                                                    switch (m897d11.hashCode() ^ (-1543723629)) {
                                                                                                                        case -1008791903:
                                                                                                                            return "";
                                                                                                                        case -226472512:
                                                                                                                            m897d11 = atm.m897d("B1D2A1E397C4B1ECA1D197F9B1E2A1DD97FCB1DBA1E397C4B1DFA1EF97C7");
                                                                                                                            break;
                                                                                                                        case 277352090:
                                                                                                                            String group2 = matcher2.group(0);
                                                                                                                            JSONObject jSONObject5 = new JSONObject();
                                                                                                                            jSONObject5.put(C0052e.m1418a(new byte[]{-46, -42, 125, 94, -22}, new byte[]{-94, -73, 15, 45, -113, 11, 64, -4}), 0);
                                                                                                                            jSONObject5.put(C0052e.m1418a(new byte[]{-120, 44, -62, -70, -86, -48, 47}, new byte[]{-8, 64, -93, -61, -1, -94, 67, -89}), "");
                                                                                                                            jSONObject5.put(C0052e.m1418a(new byte[]{-121, 58, 8}, new byte[]{-14, 72, 100, -26, 22, 23, 93, -124}), group2);
                                                                                                                            return jSONObject5.toString();
                                                                                                                        case 1605364928:
                                                                                                                            if (!matcher2.find()) {
                                                                                                                                m897d11 = atm.m897d("B1E2A1D197FEB1E2A1D597F8B1D2A1D497F9B1DDA1D997F9B1E1A1D797F9B1DBA1D597C3B1D2A1E397C3B1DBA1ED97F0B1DFA1D5");
                                                                                                                                break;
                                                                                                                            } else {
                                                                                                                                m897d11 = atm.m897d("B1ECA1D797CFB1E2A1EA97F0B1E2A1D397CEB1EDA1DD97C1B1DFA1D197C1B1DCA1EF97FFB1DCA1EC97C0B1DFA1ED");
                                                                                                                                break;
                                                                                                                            }
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 859604750:
                                                                                                    m897d9 = atm.m897d("B1DBA1EA97CEB1E2A1E297FFB1E2A1DE97FCB1DFA1ED97C4B1DCA1E297F9B1DEA1E397C0B1D2A1EA97C1B1E1A1DD97C4");
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 473500952:
                                                                                        C0288h m1414e3 = C0052e.m1414e(C0629f.m179f(C0052e.m1418a(new byte[]{15, 20, 56, -40, 122, 111, 62, -51, 23, 82, 98, -53, 111, 59, 126, -122, 2, 81, 98, -48, 112, 47, 62, -106, 30, 82, 98, -40, 97, 37, 46, -105, 21, 12, 113}, new byte[]{103, 96, 76, -88, 9, 85, 17, -30}) + jSONObject2.getString(C0052e.m1418a(new byte[]{116, -39, -115}, new byte[]{1, -85, -31, 31, -97, -55, 76, -22})), m261a()));
                                                                                        Pattern compile3 = Pattern.compile(C0052e.m1418a(new byte[]{6, 17, -77, -81, -35, -76, -96, -118, 114, 93, -78, -50, -37, -31, -27, -41, 4, 17, -89, -83, -107, -31, -27}, new byte[]{46, 46, -113, -110, -88, -58, -52, -7}));
                                                                                        C0459g m967p04 = m1414e3.m967p0(C0052e.m1418a(new byte[]{-80, -51, 89, 35, 58, 37, 32, -115, -69, -46, 73}, new byte[]{-46, -94, 61, 90, 26, 86, 67, -1}));
                                                                                        while (true) {
                                                                                            String m897d12 = atm.m897d("B1D8A1D797C2B1ECA1E297FDB1E1A1DE97FEB1E2A1D597F4B1E0A1ED97F0B1E1A1EF97C3B1DDA1EF97C3B1D2A1ED");
                                                                                            while (true) {
                                                                                                switch (m897d12.hashCode() ^ 1448349066) {
                                                                                                    case -1764368226:
                                                                                                        Matcher matcher3 = compile3.matcher(m967p04.get(i).m979d0().trim());
                                                                                                        String m897d13 = atm.m897d("B1E0A1EF97FDB1D6A1D397FAB1D1A1D297FCB1D8A1D597C7B1D8A1D097F4B1E6A1E397FFB1DDA1D1");
                                                                                                        while (true) {
                                                                                                            switch (m897d13.hashCode() ^ (-2080954325)) {
                                                                                                                case -1712687114:
                                                                                                                    m897d13 = matcher3.find() ? atm.m897d("B1D8A1D097FFB1DFA1D397F4B1DFA1EF97CEB1D6A1D197CEB1E2A1EA97FFB1DDA1D097C3B1E6A1E297F3B1DE") : atm.m897d("B1D2A1EC97C0B1E2A1ED97C7B1DDA1E397C0B1DDA1DD97FDB1E2A1E997C1B1DEA1D197FFB1DBA1ED");
                                                                                                                case -637033256:
                                                                                                                    JSONObject jSONObject6 = new JSONObject();
                                                                                                                    String group3 = matcher3.group(0);
                                                                                                                    jSONObject6.put(C0052e.m1418a(new byte[]{-70, -102, -101, -106, -18}, new byte[]{-54, -5, -23, -27, -117, -48, 75, -35}), 0);
                                                                                                                    jSONObject6.put(C0052e.m1418a(new byte[]{115, -49, -94, 64, -14, -32, -80}, new byte[]{3, -93, -61, 57, -89, -110, -36, 9}), "");
                                                                                                                    jSONObject6.put(C0052e.m1418a(new byte[]{112, 5, 122}, new byte[]{5, 119, 22, -52, -80, -37, 86, -121}), group3);
                                                                                                                    return jSONObject6.toString();
                                                                                                                case -206902466:
                                                                                                                    m897d13 = atm.m897d("B1D6A1D397F3B1DCA1EA97CEB1DFA1D197FDB1D6A1D497C0B1D1A1D397FEB1E2A1D197FEB1D2A1DD97F9B1E6");
                                                                                                                case 166712503:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case -436516872:
                                                                                                        m897d12 = atm.m897d("B1DDA1EA97FDB1E2A1D397C4B1E2A1ED97FDB1DBA1D497C4B1ECA1D397C0B1DAA1D197C7B1D6A1D397C1");
                                                                                                    case 1303311463:
                                                                                                        break;
                                                                                                    case 1513741764:
                                                                                                        m897d12 = i < m967p04.size() ? atm.m897d("B1E1A1E297FDB1E5A1D297FCB1E3A1EC97C2B1E2A1EF97C0B1D8A1D597FCB1DDA1E397CEB1E3A1D197FEB1E2A1D797F0B1DF") : atm.m897d("B1E1A1D197F3B1ECA1EC97F9B1DEA1EF97C2B1DBA1EE97CEB1E2A1EA97CFB1E3A1D197CFB1E3A1ED97CFB1DBA1E297C3B1D2A1ED");
                                                                                                }
                                                                                            }
                                                                                            i++;
                                                                                        }
                                                                                        break;
                                                                                    case 1030288505:
                                                                                        m897d8 = atm.m897d("B1EDA1EF97F0B1E2A1D297F8B1E6A1ED97C2B1ECA1EC97F3B1D1A1D397CFB1E1A1ED97F0B1E2A1D597C3B1D2A1DE");
                                                                                        break;
                                                                                    case 1348782378:
                                                                                        if (!jSONObject3.getString(C0052e.m1418a(new byte[]{-70, -24, -103, 69}, new byte[]{-55, Byte.MIN_VALUE, -10, 50, 65, -124, 3, 90})).equals(C0052e.m1418a(new byte[]{101, -110, -100, -38, 18, -75, 78, -79, -103}, new byte[]{39, -42, -82, 60, Byte.MIN_VALUE, 24, -88, 37}))) {
                                                                                            m897d8 = atm.m897d("B1DFA1D097C0B1E2A1D597CEB1D6A1E997C1B1D2A1D297C2B1D1A1DE97CFB1DDA1D297C0B1EDA1EF97C2B1E1");
                                                                                            break;
                                                                                        } else {
                                                                                            m897d8 = atm.m897d("B1E6A1ED97C0B1E2A1DE97C7B1DAA1D497F9B1DDA1EA97CEB1DCA1D497C4B1DBA1ED97C0B1D1A1ED97C0B1DEA1E997FD");
                                                                                            break;
                                                                                        }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 674949608:
                                                                            m897d7 = atm.m897d("B1D8A1D997F9B1DEA1D597F3B1D6A1E297F9B1DA35AEDA83C2A1E3AEEE83FDA1DFAED683F0A1E2AEE083F0A1E1");
                                                                            break;
                                                                        case 1205137356:
                                                                            C0288h m1414e4 = C0052e.m1414e(C0629f.m179f(C0052e.m1418a(new byte[]{-29, 21, -51, 63, -100, 83, 51, -15, -5, 79, -38, 41, -127, 6, 120, -69, -70, 79, -63, 54, -107, 70, 125, -73, -91, 17, -47, 63, -48, 28, 110, -78, -74}, new byte[]{-117, 97, -71, 79, -17, 105, 28, -34}) + jSONObject2.getString(C0052e.m1418a(new byte[]{-18, -65, -10}, new byte[]{-101, -51, -102, -69, 100, -76, 84, 83})), m261a()));
                                                                            Pattern compile4 = Pattern.compile(C0052e.m1418a(new byte[]{112, 1, 44, -117, -52, -73, 25, -48, 4, 77, 45, -22, -54, -30, 92, -115, 114, 1, 56, -119, -124, -30, 92}, new byte[]{88, 62, 16, -74, -71, -59, 117, -93}));
                                                                            C0459g m967p05 = m1414e4.m967p0(C0052e.m1418a(new byte[]{-5, -5, -27, -18, -127, 124, 125, 80, -16, -28, -11}, new byte[]{-103, -108, -127, -105, -95, 15, 30, 34}));
                                                                            while (true) {
                                                                                String m897d14 = atm.m897d("B1DCA1E297F9B1E2A1E397F4B1D2A1EA97F3B1E6A1E297FDB1E1A1E397CFB1EDA1E397CEB1DEA1EC97F0B1DD");
                                                                                while (true) {
                                                                                    switch (m897d14.hashCode() ^ (-527639307)) {
                                                                                        case -1363548695:
                                                                                            Matcher matcher4 = compile4.matcher(m967p05.get(i).m979d0().trim());
                                                                                            String m897d15 = atm.m897d("B1E6A1EA97CFB1D6A1E397F8B1D1A1ED97CEB1E2A1E997F0B1E6A1ED97C0B1E3A1D797CEB1E5A1EE97F4B1E2A1E2");
                                                                                            while (true) {
                                                                                                switch (m897d15.hashCode() ^ 1119090669) {
                                                                                                    case -819292623:
                                                                                                        JSONObject jSONObject7 = new JSONObject();
                                                                                                        String group4 = matcher4.group(0);
                                                                                                        jSONObject7.put(C0052e.m1418a(new byte[]{13, -115, -25, -93, 93}, new byte[]{125, -20, -107, -48, 56, -57, 97, 63}), 0);
                                                                                                        jSONObject7.put(C0052e.m1418a(new byte[]{122, 57, -8, -13, 6, -77, -20}, new byte[]{10, 85, -103, -118, 83, -63, Byte.MIN_VALUE, 20}), "");
                                                                                                        jSONObject7.put(C0052e.m1418a(new byte[]{-100, -76, 82}, new byte[]{-23, -58, 62, -12, -94, 10, -46, -113}), group4);
                                                                                                        return jSONObject7.toString();
                                                                                                    case -270556840:
                                                                                                        m897d15 = atm.m897d("B1D6A1ED97CFB1E5A1D497F3B1E6A1ED97C4B1DBA1EE97C0B1E2A1EE97FAB1DDA1D797F9B1ECA1D797C3B1DBA1D197F3");
                                                                                                    case 557087212:
                                                                                                        m897d15 = matcher4.find() ? atm.m897d("B1DDA1D597C0B1D6A1D097C7B1D8A1E297C0B1E2A1DD97F3B1E6A1E397FFB1E2A1ED97F0B1ECA1D497CFB1EDA1D397C0B1DEA1EA97F0B1E2A1EF97FCB1DB") : atm.m897d("B1E1A1D797CFB1E1A1D097FEB1E2A1EE97F4B1D2A1E297CFB1E2A1D497FEB1E2A1D097C0B1DE");
                                                                                                    case 2137636166:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case -686858508:
                                                                                            break;
                                                                                        case 747023734:
                                                                                            m897d14 = i < m967p05.size() ? atm.m897d("B1E0A1E397F9B1D1A1D397F9B1DEA1DD97C7B1DAA1EC97C7B1E6A1D797CEB1E2A1D797CEB1E1A1D997F4B1DAA1D497FAB1DF") : atm.m897d("B1EDA1D297C0B1E2A1D597CEB1DFA1ED97FEB1D6A1EA97C7B1DDA1DD97C0B1E0A1E997C0B1ECA1EC");
                                                                                        case 830448642:
                                                                                            m897d14 = atm.m897d("B1D2A1D297F9B1D8A1E397F3B1DFA1EE97FDB1D2A1D997C2B1DCA1D097CF");
                                                                                    }
                                                                                }
                                                                                i++;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 900732333:
                                                                if (!jSONObject3.getString(C0052e.m1418a(new byte[]{-102, 100, -50, -55}, new byte[]{-23, 12, -95, -66, -63, -116, 28, -3})).equals(C0052e.m1418a(new byte[]{-111, -6, 83, 114, 105, 26, 84, -83}, new byte[]{-39, -66, -75, -32, -60, -4, -64, 19}))) {
                                                                    m897d4 = atm.m897d("B1E3A1ED97F0B1E2A1EC97FDB1D1A1D297F3B1DFA1ED97F4B1E5A1DE97FFB1EDA1DE97F9B1E6A1D097C0B1D2A1E997FDB1DFA1EA97FF");
                                                                    break;
                                                                } else {
                                                                    m897d4 = atm.m897d("B1E0A1D797C3B1DFA1ED97FEB1E2A1D097C2B1DEA1D397FFB1D2A1ED97F9B1E2A1D097C0");
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case -1350110966:
                                        m897d2 = trim.startsWith(C0052e.m1418a(new byte[]{-47, 23, -29, 34, 108, -24, 116, 100, -62, 4, -50}, new byte[]{-89, 118, -111, 2, 28, -124, 21, 29})) ? atm.m897d("B1DBA1D297C4B1DBA1D597F9B1ECA1ED97CEB1D6A1E997FDB1DEA1D197F3B1ECA1D297C0") : atm.m897d("B1ECA1E297CEB1E2A1D597C0B1E0A1DE97F4B1E5A1D097C0B1DEA1EA97FEB1E2A1ED");
                                    case -347729254:
                                        break;
                                    case 1302020426:
                                        m897d2 = atm.m897d("B1D2A1EF97FFB1DFA1D497FFB1DFA1D597C3B1D2A1EC97C3B1E2A1ED97C0B1D8A1D397FCB1D2A1D497FDB1E2");
                                }
                            }
                            i2++;
                            break;
                        case -1233457237:
                            m897d = atm.m897d("B1ECA1D997C0B1E2A1E297C1B1E5A1E297FFB1E5A1EC97C1B1E6A1D197F0B1D2A1ED97C0B1EDA1DE97F4B1ECA1ED97F9B1E2A1E997FFB1E5");
                        case 538728787:
                            break;
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public final String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(m259c(C0052e.m1418a(new byte[]{17, 7, -18, -68, -57, 78, -8, -46, 13, 5, -76, -96, -35, 22, -95, -108, 22, 93, -7, -81, -101, 29, -71, -103, 28, 11, -76, -68, -36, 4, -8, -100, 19, 18, -30, -29, -57, 1, -80, -102, 28, 0, -18, -13, -39, 29, -77, -64, 72, 85, -19, -88, -119}, new byte[]{121, 115, -102, -52, -76, 116, -41, -3}) + URLEncoder.encode(str) + C0052e.m1418a(new byte[]{81, 125, -88, -59, 123, 95, 87, 76, 71, 55, -75, -63, Byte.MAX_VALUE, 78, 25, 9, 22, 124, -79, -107}, new byte[]{119, 17, -63, -88, 18, 43, 106, 125}) + System.currentTimeMillis()));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String m897d = atm.m897d("B1ECA1E297F8B1DDA1EA97F0B1E2A1EE97CEB1ECA1ED97F3B1E6A1E997C7B1DDA1D497FCB1ECA1D197CEB1DBA1ED97C0");
            while (true) {
                switch (m897d.hashCode() ^ (-1458468254)) {
                    case -1368137160:
                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString(C0052e.m1418a(new byte[]{87, 39, 30, -4}, new byte[]{59, 78, 109, -120, 77, 74, -94, 27})));
                        int i = 0;
                        while (true) {
                            String m897d2 = atm.m897d("B1E2A1D597C0B1E2A1D197F8B1DCA1D397F4B1DBA1ED97F0B1DAA1D097FFB1E2A1D297C0");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-192345429)) {
                                    case -1876168775:
                                        break;
                                    case -919004657:
                                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                                        String string = jSONObject3.getString(C0052e.m1418a(new byte[]{98, 15}, new byte[]{11, 107, -121, 120, 35, -5, 77, -87}));
                                        String string2 = jSONObject3.getString(C0052e.m1418a(new byte[]{-69, -75, -89, 24}, new byte[]{-43, -44, -54, 125, 34, 58, -55, 33}));
                                        String string3 = jSONObject3.getString(C0052e.m1418a(new byte[]{125, -100, 123}, new byte[]{13, -11, 24, -126, -27, 125, -118, -73}));
                                        String m897d3 = atm.m897d("B1EDA1D997F9B1E2A1D497FCB1E3A1D197F3B1DAA1E297CEB1DAA1EA97F4B1DFA1EA97C0B1DEA1EA97C7B1E0A1D997C7B1DD");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1480716870) {
                                                case -1411706427:
                                                    m897d3 = atm.m897d("B1DAA1DD97FDB1E2A1E397F9B1D2A1DD97C1B1ECA1ED97C2B1E6A1EE97C4B1E6A1DE97FCB1D2A1ED97F0B1D6A1E9");
                                                case 177860217:
                                                    m897d3 = !TextUtils.isEmpty(string3) ? atm.m897d("B1DDA1D097F4B1E0A1D597C4B1E0A1D197F8B1D1A1D497FFB1E2A1ED97FCB1DE") : atm.m897d("B1E5A1D797F8B1D8A1ED97FFB1D2A1D297CFB1EDA1ED97FAB1E2A1EA97C4B1E2");
                                                case 281753645:
                                                    String m897d4 = atm.m897d("B1D6A1D297F9B1E2A1D097F3B1E0A1E297C2B1DFA1EC97C4B1E5A1E397C4B1D8");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ 742562529) {
                                                            case -1356401697:
                                                                m897d4 = atm.m897d("B1E1A1DE97F9B1E2A1D397C3B1DFA1EE97C1B1E1A1EF97FAB1E1A1EA97CEB1D1");
                                                            case -1226893612:
                                                                string3 = f1137g + string3;
                                                                continue;
                                                            case -664702248:
                                                                break;
                                                            case 928370529:
                                                                m897d4 = !string3.startsWith(C0052e.m1418a(new byte[]{35, -25, -65, 3}, new byte[]{75, -109, -53, 115, 6, 106, 115, -21})) ? atm.m897d("B1E6A1D097FCB1ECA1D797FDB1E1A1EE97CEB1D2A1D197F4B1E6A1E297C0B1E3A1E997FE") : atm.m897d("B1E5A1ED97F0B1E2A1E997FDB1E5A1EA97F3B1ECA1ED97F0B1DBA1D797C1B1ECA1D397F8B1DDA1D397C3B1DEA1D3");
                                                        }
                                                    }
                                                    break;
                                                case 1207612902:
                                                    break;
                                            }
                                        }
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put(C0052e.m1418a(new byte[]{-117, 25, 83, 100, -52, Byte.MAX_VALUE}, new byte[]{-3, 118, 55, 59, -91, 27, 43, -57}), string);
                                        jSONObject4.put(C0052e.m1418a(new byte[]{-87, Byte.MIN_VALUE, 67, 2, -11, 24, -21, -59}, new byte[]{-33, -17, 39, 93, -101, 121, -122, -96}), string2);
                                        jSONObject4.put(C0052e.m1418a(new byte[]{96, 26, -18, -57, -24, -7, 3}, new byte[]{22, 117, -118, -104, -104, -112, 96, -72}), string3);
                                        jSONObject4.put(C0052e.m1418a(new byte[]{42, -125, 9, -45, -71, -11, -30, 21, 46, -121, 30}, new byte[]{92, -20, 109, -116, -53, -112, -113, 116}), "");
                                        jSONArray.put(jSONObject4);
                                        i++;
                                        break;
                                    case -289514213:
                                        m897d2 = i < jSONArray2.length() ? atm.m897d("B1EDA1D797FCB1DFA1E997F3B1DEA1E997F4B1E2A1D297FDB1E2A1D197FEB1DAA1EE97C7B1E6A1ED97FDB1E0A1D497C0B1ECA1D197F9B1E2") : atm.m897d("B1ECA1D497FEB1E2A1D197C2B1DCA1DE97FFB1DCA1D297C7B1E3A1DE97F3B1DFA1ED97C1B1D1A1D497C4B1E6A1DD97C1B1ECA1D797FAB1DF");
                                    case 1903363999:
                                        m897d2 = atm.m897d("B1D1A1D497C0B1E2A1D497F8B1E6A1ED97F9B1D6A1ED97C7B1E5A1E397FEB1E0A1ED97C2B1D8A1E3");
                                }
                            }
                        }
                        break;
                    case -249285943:
                        if (jSONObject.getInt(C0052e.m1418a(new byte[]{91, -10, -88, -37, 124}, new byte[]{47, -103, -36, -70, 16, -96, 54, -46})) <= 0) {
                            m897d = atm.m897d("B1E2A1D497FFB1E2A1EC97C7B1D6A1E397C3B1D2A1ED97FCB1D1A1D497FDB1E3A1D597C0B1E1A1EE97F8B1DAA1D497FFB1E2A1D2");
                            break;
                        } else {
                            m897d = atm.m897d("B1E3A1EF97C4B1E2A1EF97FAB1D2A1ED97FDB1D6A1DD97C0B1DEA1EC97FDB1E2A1E997C4B1E6A1ED97F0B1DCA1EA97C7B1DBA1D497C7B1DAA1ED97C0");
                            break;
                        }
                    case 236582904:
                        break;
                    case 1790320045:
                        m897d = atm.m897d("B1E1A1D197FFB1DAA1E397F9B1E2A1D097CFB1E6A1ED97FCB1DEA1D497C0B1ECA1ED97C0B1E2A1E997F3B1E1");
                        break;
                }
            }
            jSONObject2.put(C0052e.m1418a(new byte[]{30, -5, -127, 70}, new byte[]{114, -110, -14, 50, 88, 71, 92, 94}), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
