package com.github.catvod.spider.merge.p044k;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
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

/* renamed from: com.github.catvod.spider.merge.k.e */
/* loaded from: classes.dex */
public final class C0590e extends Dora {

    /* renamed from: h */
    private static final String f1073h;

    /* renamed from: i */
    private static final String f1074i;

    /* renamed from: b */
    private JSONObject f1075b;

    /* renamed from: c */
    private JSONObject f1076c;

    /* renamed from: d */
    private final Pattern f1077d = Pattern.compile(C0052e.m1418a(new byte[]{-71, 23, 118, -2, 116, -101, 56, 77, -71, 73, 69, -2, 43, -53, 102, 64, -30, 12, 117}, new byte[]{-106, 97, 25, -102, 0, -30, 72, 40}));

    /* renamed from: e */
    private final Pattern f1078e = Pattern.compile(C0052e.m1418a(new byte[]{10, 110, -101, 83, -94, 33, 42, -14, 76, 116, -37, 31, -102, 32, 117, -70, 11, 112, Byte.MIN_VALUE, 90, -86}, new byte[]{37, 24, -12, 55, -58, 68, 94, -109}));

    /* renamed from: f */
    private final Pattern f1079f = Pattern.compile(C0052e.m1418a(new byte[]{-94, -16, -64, -46, -17, 47, -22, -61, -94, -82, -13, -46, -76, 106, -90, -110, -47, -30, -124, -97, -78, 107, -41, -34, -90, -81, -127, -34, -21, 46, -25}, new byte[]{-115, -122, -81, -74, -97, 67, -117, -70}));

    /* renamed from: g */
    private final Pattern f1080g = Pattern.compile(C0052e.m1418a(new byte[]{-123, 61, -126, 11, -13, -93, 61, 72, -123, 99, -79, 60, -85, -30, 124, 87, -34, 38, -127}, new byte[]{-86, 75, -19, 111, Byte.MIN_VALUE, -53, 82, 63}));

    static {
        String m897d = atm.m897d("B1DAA1E297C7B1D2A1D497F0B1EDA1ED97C1B1DDA1ED97F0B1E2A1E397C0B1D2A1ED97CFB1DCA1D097C0B1D2A1D797F8B1D1A1D497F9B1E2A1D797FEB1E0");
        while (true) {
            switch ((m897d.hashCode() ^ 71) ^ 658579011) {
                case -1072374306:
                    return;
                case -539740147:
                    f1073h = C0052e.m1418a(new byte[]{-77, -61, 122, 82, 92, 17, 46, -126, -72, -40, 101, 71, 66, 93, 47, -64, -66}, new byte[]{-37, -73, 14, 34, 47, 43, 1, -83});
                    m897d = atm.m897d("B1D8A1D397F8B1E1A1EF97C4B1E2A1EC97FCB1DEA1EF97CFB1E3A1EC97C2B1DFA1ED97F3B1D2A1ED97C0B1E1A1D297FEB1E2A1E997C4B1DFA1E397C0B1DCA1ED");
                    break;
                case 313937684:
                    f1074i = C0052e.m1418a(new byte[]{104, -35, -73, -20, 95, -34, -71, 2, 110}, new byte[]{11, -78, -36, -119, 50, -88, -105, 111});
                    m897d = atm.m897d("B1DFA1D797C3B1E1A1D297C0B1EDA1D597C4B1E2A1D397FDB1DDA1ED97C0B1E1A1D397FEB1DAA1E397C0B1EDA1E297CE");
                    break;
            }
        }
    }

    /* renamed from: a */
    protected static HashMap<String, String> m290a() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1DAA1D997F9B1E2A1DD97F3B1D6A1D097F4B1DFA1D597FCB1EDA1E297F3B1D2A1ED97FFB1E1A1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 991) ^ (-1847535385)) {
                case -2052333892:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E6A1ED97FDB1E2A1D197C2B1DCA1D797C3B1EDA1EF97C1B1DCA1ED97FCB1DEA1D497C0B1DEA1D497FE");
                    break;
                case -1951435162:
                    return hashMap;
                case -512613980:
                    hashMap.put(C0052e.m1418a(new byte[]{-57, -2, 41, -53, -81, 105, -86}, new byte[]{-107, -101, 79, -82, -35, 12, -40, -15}), f1073h);
                    m897d = atm.m897d("B1D6A1D297C0B1E5A1EE97F3B1DBA1EF97FDB1D1A1D097CFB1EDA1ED97C3B1DDA1D797CEB1D8A1E997C0B1DEA1D397C0B1E2A1DE97FFB1EC");
                    break;
                case 1393507196:
                    hashMap.put(C0052e.m1418a(new byte[]{68, 124, 18, 87, -85, -20, 100, -40, Byte.MAX_VALUE, 123}, new byte[]{17, 15, 119, 37, -122, -83, 3, -67}), C0052e.m1418a(new byte[]{13, 72, -33, 87, -82, -17, 123, 28, 117, 9, -107, 30, -22, -44, 115, 93, 36, 72, -46, 77, -30, -51, 78, 19, 113, 23, -117, 14, -7, -93, 77, 90, 46, 17, -111, 5, -30, -5, 44, 7, 105, 7, -28, 78, -78, -17, Byte.MAX_VALUE, 100, 37, 69, -18, 87, -74, -84, 47, 0, 119, 9, -106, 8, -30, -85, 81, 123, 20, 106, -23, 18, -30, -17, 115, 88, 37, 7, -30, 91, -95, -24, 117, 26, 96, 100, -51, 76, -83, -18, Byte.MAX_VALUE, 28, 113, 23, -105, 16, -14, -83, 47, 3, 112, 18, -117, 8, -16, -93, 73, 82, 38, 70, -41, 87, -19, -74, 41, 4, 110, 20, -109}, new byte[]{64, 39, -91, 62, -62, -125, 26, 51}));
                    m897d = atm.m897d("B1D6A1D797F9B1E2A1D797C1B1DBA1ED97C1B1DFA1E997F3B1DAA1D197FCB1D1A1D597C3B1E2A1ED");
                    break;
            }
        }
    }

    /* renamed from: b */
    protected static String m289b(String str) {
        String m897d = atm.m897d("B1D8A1D597FEB1E2A1D597F9B1D6A1ED97F3B1E3A1D097FEB1D2A1ED97C0B1EDA1D097F9B1DCA1E997F3B1D2A1D097C4B1ECA1D597F8B1DCA1DD97C0");
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        while (true) {
            switch ((m897d.hashCode() ^ 621) ^ (-1301129689)) {
                case -1938507077:
                    return str3;
                case -1662301869:
                    m897d = atm.m897d("B1EDA1EC97FDB1E0A1D997FAB1D2A1D197C4B1DCA1D597F9B1E2A1D497FDB1E2");
                    str3 = str;
                    break;
                case -1597172219:
                    sb.append(f1073h);
                    m897d = atm.m897d("B1DBA1D397C0B1E2A1D297CFB1EDA1E297C7B1ECA1D297F9B1E2A1D197CEB1EDA1D797FDB1D1A1DD97FFB1E1A1EF97F4B1D2A1ED97C4B1D6A1E9");
                    break;
                case -1330062310:
                    String m897d2 = atm.m897d("B1D2A1EF97C3B1DFA1EC97C0B1E2A1EA97FDB1D2A1D797CFB1E5A1E997C2B1E6A1ED97CEB1D2A1ED97C7B1D2A1ED");
                    while (true) {
                        switch (m897d2.hashCode() ^ 332069370) {
                            case -663709013:
                                m897d = atm.m897d("B1E3A1EC97F9B1E2A1EC97FCB1D1A1D097FAB1DFA1ED97F8B1DEA1D397C0B1E1A1EA97C0");
                                continue;
                            case -246870670:
                                m897d2 = !str.startsWith(C0052e.m1418a(new byte[]{94, 97, -102, -28}, new byte[]{54, 21, -18, -108, -121, 123, -90, -38})) ? atm.m897d("B1D6A1D197F9B1E2A1DE97F4B1DDA1ED97CFB1DDA1EC97C3B1DCA1D397C1B1D1A1E997C4B1D8A1DD97C3B1DBA1E297F8") : atm.m897d("B1E5A1EA97FAB1ECA1E397FAB1D6A1D497FFB1E2A1E997F8B1DFA1EC97C4B1D8A1EE97F0B1DCA1E297FCB1E3A1D097CEB1D8A1D397FDB1E5");
                            case 850118496:
                                m897d2 = atm.m897d("B1E2A1EA97F9B1E2A1EA97C4B1DDA1DE97FAB1E0A1D797F4B1E6A1EF97F0B1E0");
                            case 1398208892:
                                m897d = atm.m897d("B1DCA1DE97FEB1E2A1DE97FDB1DDA1ED97C3B1E3A1EF97C4B1E5A1E997FFB1E3");
                                continue;
                        }
                    }
                    break;
                case -482992565:
                    m897d = atm.m897d("B1D2A1EA97C7B1EDA1D397C1B1EDA1D097C2B1E0A1D197C1B1DBA1E397C4B1DEA1EE");
                    break;
                case -414498257:
                    StringBuilder sb2 = new StringBuilder();
                    m897d = atm.m897d("B1D6A1DD97C1B1DDA1E997FFB1DCA1E997C4B1E2A1ED97C3B1DBA1D597FEB1D6A1EA97F8B1D8A1D997F9B1EC");
                    sb = sb2;
                    break;
                case -71607831:
                    sb.append(str);
                    m897d = atm.m897d("B1ECA1E997C0B1E2A1D797C7B1D6A1D197C3B1D1A1D197C0B1E5A1D397F0B1DDA1EA97F9B1D8A1D597FEB1E2");
                    break;
                case 696069095:
                    m897d = atm.m897d("B1DCA1DE97FEB1E2A1DE97FDB1DDA1ED97C3B1E3A1EF97C4B1E5A1E997FFB1E3");
                    str3 = str2;
                    break;
                case 1606902301:
                    str2 = sb.toString();
                    m897d = atm.m897d("B1E0A1D297C7B1E1A1D597C0B1ECA1E297F3B1E5A1ED97FFB1D8A1E297CEB1DBA1D597FEB1E2");
                    break;
            }
        }
    }

    /* renamed from: c */
    protected final HashMap<String, String> m288c(String str) {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1E2A1E997F4B1D6A1DE97F4B1DBA1D497F4B1D1A1E997FEB1D2A1E997F0B1E2A1DD97CFB1E3");
        while (true) {
            switch ((m897d.hashCode() ^ 647) ^ (-977601213)) {
                case -1234959466:
                    hashMap.put(C0052e.m1418a(new byte[]{-97, Byte.MAX_VALUE, 34, 6, -114, 32}, new byte[]{-14, 26, 86, 110, -31, 68, -59, -81}), C0052e.m1418a(new byte[]{-50, 99, -109}, new byte[]{-119, 38, -57, 19, 45, 74, -5, 104}));
                    m897d = atm.m897d("B1DEA1D297CEB1E2A1EF97F3B1E3A1E997C0B1EDA1D997FAB1E1A1EA97C1B1D1A1D597C0B1D6A1D397F0B1DDA1EF97C7B1DA");
                    break;
                case -988668532:
                    hashMap.put(C0052e.m1418a(new byte[]{64, -77, -8, 31, -51, -127, -34, 125, 96, -66, -4, 15, -36, -110, -106}, new byte[]{1, -48, -101, 122, -67, -11, -13, 49}), C0052e.m1418a(new byte[]{-39, -118, 30, -37, 15, 74, -60, -18, -104, -109, 14, -88, 111, 94, -110, -4, -53, -49, 103, -49, 122, 23, -125, -74, -115, -43, 31, -30, 41, 75, -10, -51, -104, -109, 14, -88, 111, 83, -110, -29, -51, -49, 102, -53, 122, 23, -125, -74, -115, -47, 31, -3, 47, 93, -49, -69, -109, -52, 1}, new byte[]{-93, -30, 51, -104, 65, 102, -66, -122}));
                    m897d = atm.m897d("B1E2A1ED97C4B1E2A1ED97F3B1E5A1E297F8B1E1A1D097FEB1D2A1D997FFB1EDA1EC97FCB1E1A1D597F0B1D6A1EA97FFB1DEA1EC97FAB1DB");
                    break;
                case -808215482:
                    hashMap.put(C0052e.m1418a(new byte[]{-60, -57, 94, -65, 10, -99, Byte.MIN_VALUE, -110, -40, -39, 74, -88, 8, -116, -105, -38, -68, -27, 92, -68, 30, -100, -106, -53, -30}, new byte[]{-111, -73, 57, -51, 107, -7, -27, -65}), C0052e.m1418a(new byte[]{-4}, new byte[]{-51, 105, -81, 110, 44, -117, -97, -33}));
                    m897d = atm.m897d("B1DBA1DD97F0B1E2A1E397C1B1E2A1D997FEB1DAA1DE97C0B1E2A1D197F0B1EDA1D997F4B1DBA1E997FCB1DDA1EF97FFB1ECA1D297CEB1E5");
                    break;
                case -651333150:
                    hashMap.put(C0052e.m1418a(new byte[]{-85, 62, -13, 121}, new byte[]{-29, 81, Byte.MIN_VALUE, 13, 98, -93, 19, 53}), f1074i);
                    m897d = atm.m897d("B1DFA1D297F4B1ECA1DE97F0B1E2A1D597CFB1DAA1ED97CEB1DEA1D197C2");
                    break;
                case -503131430:
                    hashMap.put(C0052e.m1418a(new byte[]{11, 22, -79, -87, -65, 67, -79, -31, 48, 17}, new byte[]{94, 101, -44, -37, -110, 2, -42, -124}), C0052e.m1418a(new byte[]{118, -49, -87, 2, 48, 75, -56, 79, 14, -114, -29, 75, 116, 106, -56, 3, 82, -50, -89, 4, 47, 79, -110, 64, 114, -50, -89, 14, 48, 7, -28, 1, 88, Byte.MIN_VALUE, -100, 56, 124, Byte.MAX_VALUE, -119, 81, 11, -1, -30, 94, 3, 16, Byte.MIN_VALUE, 64, 122, -48, -93, 7, 57, 112, -52, 2, 112, -55, -89, 68, 105, 20, -98, 78, 8, -106, -13, 67, 23, 111, -3, 45, 119, -116, -13, 7, 53, 76, -52, 64, 124, -59, -80, 0, 51, 14, -119, 35, 83, -46, -68, 6, 57, 8, -112, 81, 21, -112, -3, 95, 104, 16, -101, 78, 10, -111, -25, 75, 15, 70, -49, 1, 73, -55, -4, 94, 111, 16, -121, 83, 13}, new byte[]{59, -96, -45, 107, 92, 39, -87, 96}));
                    m897d = atm.m897d("B1DCA1D597C2B1D6A1EA97FEB1DAA1D797F9B1E2A1D597C0B1D2A1ED97F9B1D1A1DE97C0B1E2A1E297CEB1D1A1D9");
                    break;
                case 279183555:
                    return hashMap;
                case 574361820:
                    m897d = atm.m897d("B1DDA1ED97F0B1D8A1EA97C0B1E2A1EA97C2B1D8A1D397CEB1DFA1ED97C1B1D6A1DD");
                    break;
                case 1203544731:
                    m897d = atm.m897d("B1DCA1EE97F9B1E2A1EE97F8B1E0A1EA97F3B1E1A1E297CFB1DAA1EA97CFB1ECA1DE97C3B1ECA1D597C3B1DBA1E297FCB1E2A1ED97FAB1E1A1D1");
                    break;
                case 1538406409:
                    hashMap.put(C0052e.m1418a(new byte[]{124, -60, 76, -57, 15, 86}, new byte[]{61, -89, 47, -94, Byte.MAX_VALUE, 34, -121, -122}), C0052e.m1418a(new byte[]{74, 55, 7, Byte.MAX_VALUE, 67, -19, 22, 118, 82, 126, 30, 123, 28, -23, 11, 120, 95, 38, 22, 100, 2, -86, 26, 115, 74, 63, 19, 32, 20, -24, 14, 55, 95, 34, 15, 103, 5, -26, 3, 111, 87, 61, 17, 36, 20, -24, 14, 32, 79, 111, 79, 37, 85, -87, 11, 118, 95, 53, 26, 36, 27, -32, 0, 107, 18, 120, 80, 33, 87, -12, 95, 43, 16, 106}, new byte[]{62, 82, Byte.MAX_VALUE, 11, 108, -123, 98, 27}));
                    m897d = atm.m897d("B1DCA1E997FEB1E2A1D197F9B1DAA1E997C1B1E6A1ED97C7B1EDA1D297CFB1D6A1D497FAB1E3A1D097C0B1EDA1D597F4");
                    break;
                case 1880923902:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1D8A1E397FFB1E2A1D297F8B1E6A1E397C0B1DBA1ED97C2B1EDA1DE97FCB1E0A1EF97F3B1D1A1D097C0B1DAA1D597C3B1E6A1D197C3B1DFA1D297F4");
                    break;
                case 1997631793:
                    hashMap.put(C0052e.m1418a(new byte[]{97, -113, -3}, new byte[]{37, -63, -87, -75, 24, 110, 65, 113}), C0052e.m1418a(new byte[]{-110}, new byte[]{-93, 113, 79, Byte.MAX_VALUE, -79, 71, -72, 58}));
                    m897d = atm.m897d("B1E1A1D497F0B1E2A1D997F9B1EDA1EA97FFB1D1A1D497C4B1ECA1E297FDB1DCA1D397F9B1DDA1ED97C0B1DEA1D397C0");
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int parseInt;
        int parseInt2;
        int i;
        int i2;
        try {
            String[] strArr = {"", "", "", "", "", "", "", "", "", "", "", ""};
            strArr[0] = str;
            strArr[8] = str2;
            String m897d = atm.m897d("B1E0A1E997FDB1E2A1D397C7B1DCA1ED97FDB1E6A1E297F9B1E6A1ED97CEB1E0A1D097F9B1DCA1D997F0B1D8");
            while (true) {
                switch (m897d.hashCode() ^ (-1174605925)) {
                    case -1689539322:
                        if (hashMap == null) {
                            m897d = atm.m897d("B1D1A1D497C1B1D1A1EE97C4B1E1A1D097FCB1DCA1D597C0B1D1A1DE97FE");
                            break;
                        } else {
                            m897d = atm.m897d("B1E3A1DE97C0B1DBA1EF97FFB1E3A1EE97C4B1E1A1ED97C1B1DBA1EC97F4B1E3A1D297CFB1E5A1D097C1B1E3A1D197CF");
                            break;
                        }
                    case 1022765506:
                        break;
                    case 1367834692:
                        String m897d2 = atm.m897d("B1DEA1E297C7B1DCA1D497F0B1ECA1D097F8B1D8A1EA97F3B1EDA1EE97FDB1DAA1D997F3");
                        while (true) {
                            switch (m897d2.hashCode() ^ (-887830827)) {
                                case -1840396306:
                                    m897d2 = atm.m897d("B1D8A1E297C4B1D6A1D997FDB1D8A1D097C3B1DDA1D097C4B1DBA1D0");
                                    break;
                                case -1711405571:
                                    Iterator<String> it = hashMap.keySet().iterator();
                                    while (true) {
                                        String m897d3 = atm.m897d("B1EDA1D597FEB1D2A1EF97F3B1ECA1E397C0B1E0A1DD97FDB1E2A1D097FAB1ECA1D097FEB1ECA1ED");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-2139115824)) {
                                                case -1068346778:
                                                    m897d3 = atm.m897d("B1E6A1DE97F0B1E2A1EE97C3B1DBA1ED97CEB1ECA1DD97C0B1DFA1ED97FCB1E3A1D497F4");
                                                case -620685720:
                                                    break;
                                                case 850261385:
                                                    break;
                                                case 1730243599:
                                                    m897d3 = it.hasNext() ? atm.m897d("B1DCA1D997FFB1ECA1D397F8B1EDA1D997FCB1DFA1D397C3B1D8A1D997CEB1E2A1D397C3B1DAA1ED97F3B1DFA1D097FCB1D8") : atm.m897d("B1D8A1EC97F9B1E3A1D397FEB1DEA1D097C2B1DEA1E397F3B1DBA1EE97F9B1DDA1DE97FCB1D1A1E397CEB1E6A1EF97F9B1E2");
                                            }
                                        }
                                        String next = it.next();
                                        strArr[Integer.parseInt(next)] = URLEncoder.encode(hashMap.get(next));
                                    }
                                    break;
                                case -1163713952:
                                    break;
                                case 507660841:
                                    if (hashMap.size() <= 0) {
                                        m897d2 = atm.m897d("B1E6A1EF97C2B1DDA1D597F4B1EDA1EF97C4B1D6A1E997FEB1E2A1EF97FAB1E1A1EF97C2B1DE");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1E3A1DD97CEB1E3A1D797C0B1E2A1EC97C3B1DCA1ED97C0B1EDA1E297FAB1DFA1ED97C0B1EDA1E397F4B1DEA1EC97FE");
                                        break;
                                    }
                            }
                        }
                        break;
                    case 1755731555:
                        m897d = atm.m897d("B1DFA1EA97C3B1D1A1D097F9B1E2A1D297C1B1E6A1D297C4B1D6A1D497FAB1E5");
                        break;
                }
            }
            String str3 = C0052e.m1418a(new byte[]{-87, 97, 84, -64, 56, 78, 112, 65, -94, 122, 75, -43, 38, 2, 113, 3, -92, 58, 86, -33, 47, 7, 55, 1, -74, 58}, new byte[]{-63, 21, 32, -80, 75, 116, 95, 110}) + TextUtils.join(C0052e.m1418a(new byte[]{-126}, new byte[]{-81, -113, -5, 67, 69, -110, -122, -4}), strArr) + C0052e.m1418a(new byte[]{25, 116, -79, 35, -56}, new byte[]{55, 28, -59, 78, -92, 114, -13, 54});
            String m308e = C0574b.m308e(str3, m288c(str3));
            C0288h m1414e = C0052e.m1414e(m308e);
            JSONObject jSONObject = new JSONObject();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{116, 2, 103, 36, 120, 118, -63, 70, 113, 12, 116, 34}, new byte[]{16, 107, 17, Byte.MAX_VALUE, 17, 18, -4, 54}));
            String m897d4 = atm.m897d("B1DAA1EF97CFB1D2A1EA97C3B1E5A1D397FFB1DEA1E397C2B1DAA1D297C0B1E2A1E297C0B1DFA1D197FCB1DD");
            while (true) {
                switch (m897d4.hashCode() ^ (-1605842501)) {
                    case -1864981433:
                        int parseInt3 = Integer.parseInt(str2);
                        parseInt2 = parseInt3;
                        i = parseInt3;
                        break;
                    case -920218718:
                        if (m967p0.size() != 0) {
                            m897d4 = atm.m897d("B1E1A1E997C0B1E2A1E397CEB1DFA1D997F9B1E2A1ED97FAB1DBA1DE97F8B1DDA1D197F8B1D8A1D297F8B1E1A1ED");
                            break;
                        } else {
                            m897d4 = atm.m897d("B1E2A1D197FEB1DEA1EE97C4B1E2A1E997C2B1ECA1D597F0B1E2A1D597C0B1E5A1EA97FAB1D1A1DE97FDB1E6A1D797C4B1D1");
                            break;
                        }
                    case -245636679:
                        int i3 = 0;
                        while (true) {
                            String m897d5 = atm.m897d("B1DBA1ED97F0B1DCA1D497FDB1E2A1D197FEB1DCA1ED97F8B1DDA1E397C0B1D1A1E397C1B1E5A1DD97FD");
                            while (true) {
                                switch (m897d5.hashCode() ^ 653951521) {
                                    case 179497396:
                                        m897d5 = atm.m897d("B1DBA1D297C2B1E2A1D397CEB1D8A1EC97C3B1E0A1EE97C3B1E5A1EA97F3B1EDA1D097C0B1DBA1E297FD");
                                    case 501854535:
                                        String m897d6 = atm.m897d("B1DCA1D797F8B1EDA1E997F3B1E1A1D797F0B1E2A1D797F4B1DEA1D197F9B1D8");
                                        while (true) {
                                            switch (m897d6.hashCode() ^ 1889818035) {
                                                case -1900433142:
                                                    break;
                                                case -583582440:
                                                    m897d6 = atm.m897d("B1E0A1D497FCB1DEA1EC97F0B1E2A1D397C0B1DEA1EA97F3B1D6A1E297C4B1DAA1D297FFB1E6A1E297F4B1DFA1ED");
                                                case 464313758:
                                                    String m602e = m1414e.m967p0(C0052e.m1418a(new byte[]{-67, 66, -65, -114, 101, 4, 108, -90, -85, 31, -67, -107, 57, 6, 104, -81, -70}, new byte[]{-50, 50, -34, -32, 75, 116, 13, -63})).m602e();
                                                    String mo925d = m1414e.m967p0(C0052e.m1418a(new byte[]{89, 53, -102, 76, -9, 19, -114, 87, 92, 59, -119, 74, -66, 22}, new byte[]{61, 92, -20, 23, -98, 119, -77, 39})).m604c().mo925d(C0052e.m1418a(new byte[]{-62, -20, -83, -106}, new byte[]{-86, -98, -56, -16, -31, -125, -97, 3}));
                                                    parseInt = Integer.parseInt(m602e);
                                                    Matcher matcher = this.f1080g.matcher(mo925d);
                                                    String m897d7 = atm.m897d("B1E0A1D797F4B1E5A1DD97F0B1E2A1D197CFB1E3A1D297CFB1DFA1ED97C0B1DCA1ED97CEB1E0A1D9");
                                                    while (true) {
                                                        switch (m897d7.hashCode() ^ (-1927401740)) {
                                                            case -1278909266:
                                                                break;
                                                            case -896722236:
                                                                m897d7 = atm.m897d("B1E6A1E297FFB1E5A1E297F9B1E2A1DD97C3B1DFA1ED97F3B1DEA1D597F0B1E5A1EA97C4B1D8A1D197C7B1DBA1D2");
                                                                break;
                                                            case 1856144925:
                                                                parseInt2 = Integer.parseInt(matcher.group(1).split(C0052e.m1418a(new byte[]{-99}, new byte[]{-80, 101, 9, 81, -78, -70, -47, -24}))[8]);
                                                                i = parseInt;
                                                                break;
                                                            case 2103087070:
                                                                if (!matcher.find()) {
                                                                    m897d7 = atm.m897d("B1DFA1EE97FCB1E6A1EC97C1B1E3A1D997F0B1DEA1DD97FFB1E2A1D997CFB1E0A1EC97C1B1E3A1EA97F8B1E6A1ED97C3B1DDA1EF97FFB1DEA1D7");
                                                                    break;
                                                                } else {
                                                                    m897d7 = atm.m897d("B1E1A1E997C1B1DDA1D497F0B1E2A1D497CEB1D1A1D297CFB1E0A1D397F9B1D8A1D597FCB1DFA1EE97F4B1DAA1DD97C0B1E5");
                                                                    break;
                                                                }
                                                        }
                                                    }
                                                    break;
                                                case 746124023:
                                                    m897d6 = m967p0.get(i3).m966q0(C0052e.m1418a(new byte[]{35}, new byte[]{66, 10, 41, -56, -77, -21, -39, -75})) == null ? atm.m897d("B1D2A1D097F9B1E2A1D497CFB1DFA1ED97FEB1E2A1D297C0B1DCA1D997FEB1D1A1DD97C4B1E2A1ED97FFB1D6A1E397C4B1DAA1D797F4B1DFA1EC97F9B1E2") : atm.m897d("B1EDA1D297FAB1DFA1ED97F4B1D2A1ED97F0B1E2A1EA97CEB1DFA1ED97FCB1DEA1E997C0B1E6A1EA97C4B1E2A1D397FDB1E2");
                                            }
                                        }
                                        break;
                                    case 848013541:
                                        parseInt = -1;
                                        break;
                                    case 1992337355:
                                        m897d5 = i3 < m967p0.size() ? atm.m897d("B1E6A1D397F0B1ECA1DE97CEB1E2A1E997FEB1DEA1D297F0B1EDA1D197C7B1E2A1EE97F3B1E3A1ED97C2B1E1A1EE97FEB1E6") : atm.m897d("B1DEA1D597C0B1E2A1D797FDB1DCA1ED97FFB1D2A1D197FEB1ECA1EC97C3B1D2");
                                }
                            }
                            i3++;
                        }
                        parseInt2 = 0;
                        i = parseInt;
                        break;
                    case 1255161326:
                        m897d4 = atm.m897d("B1E5A1DE97FDB1DAA1E397FFB1E6A1EA97FFB1DBA1D297C1B1E6A1E397CFB1E6A1DE97F9");
                        break;
                }
            }
            JSONArray jSONArray = new JSONArray();
            String m897d8 = atm.m897d("B1DAA1ED97FDB1E2A1D097FAB1DFA1E397F0B1D1A1D097F8B1ECA1ED97FCB1D1A1D497FFB1DCA1DE97CEB1D2A1D597FDB1DEA1D9");
            while (true) {
                switch (m897d8.hashCode() ^ (-1680348124)) {
                    case -1952132402:
                        if (!m308e.contains(C0052e.m1418a(new byte[]{-31, 91, 24, 21, 31, -84, 12, -44, -71, 12, 49, 67, 101, -89, 66, -69, -124, 90, 81, 85, 2, -62, 112, -39, -32, 82, 42, 21, 29, -71, 15, -50, -95}, new byte[]{7, -23, -71, -13, -125, 37, -22, 93}))) {
                            m897d8 = atm.m897d("B1D2A1ED97C7B1E0A1D397FEB1D2A1D397FDB1E3A1D197F3B1EDA1D197F0");
                            break;
                        } else {
                            m897d8 = atm.m897d("B1DCA1EA97F0B1ECA1EE97FAB1D8A1D597F9B1DDA1D597FFB1D2A1EE97CEB1DDA1D297C4B1E2");
                            break;
                        }
                    case -822237874:
                        C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{23, 11, 25, -26, -67, 44, -63, 87, 31, 7, 79, -10, -16, 34}, new byte[]{115, 98, 111, -56, -48, 67, -91, 34}));
                        int i4 = 0;
                        while (true) {
                            String m897d9 = atm.m897d("B1DFA1EF97F4B1DFA1E997F9B1E3A1E397CEB1E2A1D397C0B1DDA1EC97F0B1E2");
                            while (true) {
                                switch (m897d9.hashCode() ^ 1140494805) {
                                    case -1982333286:
                                        break;
                                    case -1882618706:
                                        m897d9 = atm.m897d("B1E6A1D297C7B1E1A1EC97FFB1DFA1D197CFB1D8A1ED97CEB1E6A1E397C3B1E1A1EA97C0");
                                    case 450321587:
                                        m897d9 = i4 < m967p02.size() ? atm.m897d("B1E6A1D797FEB1E2A1D497F9B1E3A1DE97C4B1E6A1ED97F8B1EDA1EE97C7B1ECA1D797F9B1E3A1EF97FDB1D1A1D597F8B1DDA1E397C7B1E2") : atm.m897d("B1E1A1EE97C4B1E5A1EC97FEB1E5A1D997C7B1E3A1D497C0B1D2A1D097C4B1E2A1E997CFB1DFA1D097F3B1DCA1D997FDB1E2A1E397FFB1E6A1ED");
                                    case 1079843653:
                                        C0293m c0293m = m967p02.get(i4);
                                        String m960w0 = c0293m.m966q0(C0052e.m1418a(new byte[]{-2, -38, 101, 67, 59, 71, -35, 124, -10, -42, 62, 29, 57, 91, -51, 108, -24, -98, 122, 25, 51, 69, -108, 125, -13, -57, Byte.MAX_VALUE, 8}, new byte[]{-102, -77, 19, 109, 86, 40, -71, 9})).m960w0();
                                        String mo925d2 = c0293m.m966q0(C0052e.m1418a(new byte[]{4, -9, 114, 91, 114, -37, -68, -111, 1, -11, 116, 17}, new byte[]{109, -102, 21, 117, 30, -70, -58, -24})).mo925d(C0052e.m1418a(new byte[]{-59, 78, 94, 32, -3, 57, 24, Byte.MIN_VALUE, -58, 70, 68, 32, -68}, new byte[]{-95, 47, 42, 65, -48, 86, 106, -23}));
                                        String m960w02 = c0293m.m966q0(C0052e.m1418a(new byte[]{-35, 50, 97, 0, 20, -84, 19, 63, -43, 62, 58, 71, 13, -90, 26, 103, -41, 52, 99, 75}, new byte[]{-71, 91, 23, 46, 121, -61, 119, 74})).m960w0();
                                        Matcher matcher2 = this.f1078e.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{-53, -76, -59, 86}, new byte[]{-93, -58, -96, 48, 111, 78, 32, -67})));
                                        String m897d10 = atm.m897d("B1DEA1E997C7B1EDA1D097FAB1DBA1E397C2B1D2A1D797FEB1E3A1EE97F0B1E2");
                                        while (true) {
                                            switch (m897d10.hashCode() ^ (-1778859794)) {
                                                case -1714360184:
                                                    m897d10 = !matcher2.find() ? atm.m897d("B1E0A1D097CEB1DAA1D797FEB1E2A1EA97F3B1DCA1ED97CEB1DFA1D297CEB1DAA1EA") : atm.m897d("B1DFA1E397C3B1EDA1ED97F9B1DBA1E297C2B1DCA1EA97FAB1ECA1EA97C0B1ECA1D797C4B1E2A1EE97FAB1D8A1E997F3B1DFA1D297C7B1ED");
                                                case -484391897:
                                                    break;
                                                case 111003828:
                                                    m897d10 = atm.m897d("B1DFA1D097F9B1ECA1D197C0B1E2A1EE97C1B1E2A1ED97F3B1D6A1EA97FDB1D6A1EC97C2B1E5A1ED97FAB1D2A1D297C0");
                                                case 495731622:
                                                    String group = matcher2.group(1);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-123, -63, 10, 13, 119, 19}, new byte[]{-13, -82, 110, 82, 30, 119, 70, 45}), group);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-112, -93, 13, -76, -44, -91, -57, 40}, new byte[]{-26, -52, 105, -21, -70, -60, -86, 77}), m960w0);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-122, 125, 78, 39, 45, -27, 8}, new byte[]{-16, 18, 42, 120, 93, -116, 107, 100}), mo925d2);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{29, 47, 115, -96, 4, 73, 3, -43, 25, 43, 100}, new byte[]{107, 64, 23, -1, 118, 44, 110, -76}), m960w02);
                                                    jSONArray.put(jSONObject2);
                                                    break;
                                            }
                                        }
                                        i4++;
                                        break;
                                }
                            }
                        }
                        break;
                    case 35691091:
                        m897d8 = atm.m897d("B1E2A1D097F0B1D8A1D997F4B1DAA1E297C0B1EDA1D997C0B1DFA1E997C0B1DBA1D197C2B1D2A1EA97FCB1E3A1DE97FDB1E5A1D1");
                        break;
                    case 1590422178:
                        break;
                }
            }
            jSONObject.put(C0052e.m1418a(new byte[]{-28, 82, 95, -121}, new byte[]{-108, 51, 56, -30, 88, 68, -15, 5}), i);
            jSONObject.put(C0052e.m1418a(new byte[]{89, 26, -32, -11, 61, -46, 109, 110, 93}, new byte[]{41, 123, -121, -112, 94, -67, 24, 0}), parseInt2);
            jSONObject.put(C0052e.m1418a(new byte[]{55, 19, 105, 39, -19}, new byte[]{91, 122, 4, 78, -103, -41, 108, -55}), 48);
            String m1418a = C0052e.m1418a(new byte[]{55, -112, -18, 12, -114}, new byte[]{67, -1, -102, 109, -30, -59, 7, -39});
            String m897d11 = atm.m897d("B1E3A1DE97FEB1E2A1D997FFB1D2A1E297C7B1EDA1E997F8B1D2A1ED97F4B1DEA1D097C0");
            while (true) {
                switch (m897d11.hashCode() ^ 2125092681) {
                    case 398961580:
                        if (parseInt2 > 1) {
                            m897d11 = atm.m897d("B1D2A1EA97FEB1E2A1D797F3B1E0A1D197F8B1DDA1D597FAB1E2A1D997C3B1D2A1ED97FDB1D8A1D297CFB1DB");
                            break;
                        } else {
                            m897d11 = atm.m897d("B1D1A1EE97FEB1DEA1EE97C1B1DCA1E397FEB1E6A1EF97F3B1DDA1D397C7B1E3A1D397C3B1D6A1ED97F9B1DEA1EC97F3");
                            break;
                        }
                    case 1368829259:
                        i2 = parseInt2 * 48;
                        break;
                    case 1546460283:
                        i2 = jSONArray.length();
                        break;
                    case 2134229467:
                        m897d11 = atm.m897d("B1D8A1EF97C1B1DDA1E297F9B1E2A1ED97F0B1DFA1ED97FAB1EDA1D097C0B1DAA1D297F4");
                        break;
                }
            }
            jSONObject.put(m1418a, i2);
            jSONObject.put(C0052e.m1418a(new byte[]{8, -32, 123, 17}, new byte[]{100, -119, 8, 101, -12, -97, 58, -60}), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        boolean z;
        C0293m c0293m;
        C0459g c0459g;
        try {
            C0288h m1414e = C0052e.m1414e(C0574b.m308e(C0052e.m1418a(new byte[]{64, -31, -71, 62, 33, 113, -64, 20, 75, -6, -90, 43, 63, 61, -63, 86, 77, -70, -69, 33, 54, 47, -118, 79, 73, -4, -95, 97}, new byte[]{40, -107, -51, 78, 82, 75, -17, 59}) + list.get(0) + C0052e.m1418a(new byte[]{35, -68, -107, 7, -127}, new byte[]{13, -44, -31, 106, -19, -7, -123, -74}), m290a()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-96, -115, 72, 59, -107, 112, 98, 0, -88, -127, 19, 124, -116, 122, 107, 88, -89, -117, 72, 112, -118, 33, 98, 28, -78}, new byte[]{-60, -28, 62, 21, -8, 31, 6, 117}));
            String m606a = m967p0.get(0).m967p0(C0052e.m1418a(new byte[]{-29, 67, 112, -63, 88, 20, 79, 3, -21, 79, 43, -122, 65, 30, 70, 91, -9, 67, 101, -47, 92, 22, 76}, new byte[]{-121, 42, 6, -17, 53, 123, 43, 118})).m606a(C0052e.m1418a(new byte[]{93, -89, -69, 2, 91, Byte.MAX_VALUE, -126, 74, 94, -81, -95, 2, 26}, new byte[]{57, -58, -49, 99, 118, 16, -16, 35}));
            String m606a2 = m967p0.get(0).m967p0(C0052e.m1418a(new byte[]{-58, 113, -83, -66, -64, 114, -6, 63, -50, 125, -10, -7, -39, 120, -13, 103, -46, 113, -72, -82, -60, 112, -7}, new byte[]{-94, 24, -37, -112, -83, 29, -98, 74})).m606a(C0052e.m1418a(new byte[]{45, 30, 23}, new byte[]{76, 114, 99, -37, 84, -122, -25, 56}));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{90, -115, 37, -126, -54, 72, -71, 49, 82, -127, 126, -59, -55, 65, -78, 105, 74, -123, 52, -127, -53, 78, -77, 47}, new byte[]{62, -28, 83, -84, -89, 39, -35, 68}));
            String m602e = m967p02.get(2).m967p0(C0052e.m1418a(new byte[]{22}, new byte[]{119, 35, -9, 67, -46, 89, -109, 90})).m602e();
            String m602e2 = m967p02.get(1).m967p0(C0052e.m1418a(new byte[]{-86}, new byte[]{-53, 20, -6, -87, 117, 34, 47, -113})).m602e();
            String m602e3 = m967p02.get(0).m967p0(C0052e.m1418a(new byte[]{-89}, new byte[]{-58, 69, -34, 10, -103, -65, 83, 122})).m602e();
            String m602e4 = m1414e.m967p0(C0052e.m1418a(new byte[]{-15, 17, -91, 98, 105, 50, 66, -64, -7, 29, -2, 37, 106, 59, 73, -104, -4, 22, -89, 62, 107, 57, 83, -42, -31, 17, -68, 34, 41, 62, 73, -37, -31, 29, -67, 56, 36, 99, 86}, new byte[]{-107, 120, -45, 76, 4, 93, 38, -75})).m602e();
            ArrayList arrayList = new ArrayList();
            C0459g m967p03 = m1414e.m967p0(C0052e.m1418a(new byte[]{18, -121, -63, -83, -89, -6, -8, -60, 26, -117, -102, -22, -92, -13, -13, -100, 31, -102, -46, -18, -25, -10, -13, -33, 2, -117, -39, -9}, new byte[]{118, -18, -73, -125, -54, -107, -100, -79})).get(2).m967p0(C0052e.m1418a(new byte[]{44}, new byte[]{77, 59, -123, 81, 103, 4, -89, 78}));
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1E6A1EF97CFB1E3A1D297F3B1E5A1D197FFB1ECA1D997FAB1DEA1EE97CEB1EDA1D997CFB1DFA1DE97F4");
                while (true) {
                    switch (m897d.hashCode() ^ (-1928506308)) {
                        case -1446750834:
                            m897d = atm.m897d("B1D2A1D097F3B1D2A1D497C0B1E2A1D797F3B1EDA1D197FEB1E6A1ED97F9B1DBA1D097CFB1E0A1E997C7B1E6");
                        case -1116439702:
                            break;
                        case 300228201:
                            m897d = i < m967p03.size() ? atm.m897d("B1D6A1D297F3B1D2A1D397FDB1D6A1DE97F0B1DEA1E397CEB1D8A1E297F0B1E2A1E397FEB1DFA1ED97C3B1EDA1DD") : atm.m897d("B1DDA1D297C7B1DDA1DE97FAB1DBA1D497F8B1DCA1E297C3B1EDA1D097C1B1D8A1D197C4B1DBA1EC97F0B1E2");
                        case 960833596:
                            String join = TextUtils.join(C0052e.m1418a(new byte[]{83}, new byte[]{Byte.MAX_VALUE, -110, -110, -55, 96, 119, 32, 99}), arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                C0459g m967p04 = m1414e.m967p0(C0052e.m1418a(new byte[]{-77, 77, 112, -18, -64, -127, -20, 78, -69, 65, 43, -87, -61, -120, -25, 22, -66, 80, 99, -83, Byte.MIN_VALUE, -115, -25, 85, -93, 65, 104, -76}, new byte[]{-41, 36, 6, -64, -83, -18, -120, 59})).get(0).m967p0(C0052e.m1418a(new byte[]{-99}, new byte[]{-4, 45, -119, -127, -14, -25, -40, -6}));
                                int i2 = 0;
                                while (true) {
                                    String m897d2 = atm.m897d("B1D6A1EA97C7B1DDA1D297C0B1E2A1DE97F4B1DBA1ED97C3B1E3A1D397F0B1DCA1D1");
                                    while (true) {
                                        switch (m897d2.hashCode() ^ (-1014628433)) {
                                            case -1872978602:
                                                break;
                                            case -156680507:
                                                String join2 = TextUtils.join(C0052e.m1418a(new byte[]{-37}, new byte[]{-9, 99, -7, -95, -91, 58, -87, -109}), arrayList2);
                                                String trim = m1414e.m966q0(C0052e.m1418a(new byte[]{53, 22, -49, 23, 87, 76, -39, -19, 61, 26, -108, 80, 84, 69, -46, -75, 56, 17, -51, 75, 85, 71, -56, -5, 37, 22, -42, 87, 23, 64, -46, -10, 37, 26, -41, 77, 4, 83}, new byte[]{81, Byte.MAX_VALUE, -71, 57, 58, 35, -67, -104})).m960w0().trim();
                                                jSONObject2.put(C0052e.m1418a(new byte[]{22, -95, 64, -45, 90, 79}, new byte[]{96, -50, 36, -116, 51, 43, 5, 48}), list.get(0));
                                                jSONObject2.put(C0052e.m1418a(new byte[]{-58, -56, 60, 51, -84, 45, -8, 31}, new byte[]{-80, -89, 88, 108, -62, 76, -107, 122}), m606a2);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{121, 46, -121, 59, -107, -15, 14}, new byte[]{15, 65, -29, 100, -27, -104, 109, -122}), m606a);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{-53, 60, -67, -50, 57, 49, -31, -43, -38}, new byte[]{-65, 69, -51, -85, 102, 95, Byte.MIN_VALUE, -72}), m602e);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{95, 59, 35, 49, -9, -105, -68, 52}, new byte[]{41, 84, 71, 110, -114, -14, -35, 70}), m602e3);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{1, -36, -99, 125, 12, -87, 34, 84}, new byte[]{119, -77, -7, 34, 109, -37, 71, 53}), m602e2);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{-28, -59, 85, 76, 14, 33, -116, 35, -32, -63, 66}, new byte[]{-110, -86, 49, 19, 124, 68, -31, 66}), m602e4);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{5, 107, 11, 35, -86, 89, 51, -14, 1}, new byte[]{115, 4, 111, 124, -53, 58, 71, -99}), join);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{83, 111, 1, 20, 106, -68, 81, -49, 70, 116, 10, 57}, new byte[]{37, 0, 101, 75, 14, -43, 35, -86}), join2);
                                                jSONObject2.put(C0052e.m1418a(new byte[]{-6, -103, 30, 86, 88, -25, 82, 88, -23, -104, 14}, new byte[]{-116, -10, 122, 9, 59, -120, 60, 44}), trim);
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                C0459g m967p05 = m1414e.m967p0(C0052e.m1418a(new byte[]{81, 45, -61, -111, 125, 49, 7, 13, 89, 33, -104, -53, 113, 60, 78, 17, 65, 33, -40, -52, 61, 60, 12, 0, 11, 32, -36, -55, 46, 45, 19, 25, 91}, new byte[]{53, 68, -75, -65, 16, 94, 99, 120}));
                                                C0459g m967p06 = m1414e.m967p0(C0052e.m1418a(new byte[]{-81, -9, -2, 126, -13, -40, 82, -11, -89, -5, -91, 60, -9, -60, 66, -66, -81, -9, -2, 126, -13, -40, 82, -11, -89, -5, -91, 32, -14, -42, 79, -83, -89, -9, -5, 36}, new byte[]{-53, -98, -120, 80, -98, -73, 54, Byte.MIN_VALUE}));
                                                int i3 = 0;
                                                while (true) {
                                                    String m897d3 = atm.m897d("B1DAA1DE97C4B1E1A1D797CFB1E3A1DE97FEB1E2A1D097C1B1ECA1ED97F8B1DBA1E997C0B1EDA1DD97C1B1E2A1D297CEB1E2");
                                                    while (true) {
                                                        switch (m897d3.hashCode() ^ (-1281079576)) {
                                                            case -1236454517:
                                                                m897d3 = i3 < m967p05.size() ? atm.m897d("B1D8A1D397FFB1E2A1EC97C4B1E5A1D997CFB1E6A1ED97C7B1DCA1DD97C0B1D1A1D097F9B1E2A1D597C7B1DFA1ED97FCB1E2A1D997FAB1ECA1D3") : atm.m897d("B1E1A1E297F0B1DCA1D997C1B1D6A1D997F9B1E2A1D297F0B1E3A1E397C0B1DFA1ED97C3B1DBA1ED97C7B1DEA1E297FAB1D2A1D997CFB1EDA1ED97C0");
                                                            case 249625399:
                                                                String m960w0 = m967p05.get(i3).m960w0();
                                                                try {
                                                                    Iterator<String> keys = this.f1075b.keys();
                                                                    while (true) {
                                                                        String m897d4 = atm.m897d("B1E2A1ED97C0B1E2A1D197C7B1E3A1EA97C3B1DCA1DD97FAB1DCA1ED97C0B1D2A1D597F9B1ECA1DE97C1B1DBA1DD97FEB1E5A1E997C4B1DF");
                                                                        while (true) {
                                                                            switch (m897d4.hashCode() ^ (-14427610)) {
                                                                                case -1383743988:
                                                                                    m897d4 = keys.hasNext() ? atm.m897d("B1DAA1E997F9B1E2A1DD97F9B1DCA1ED97FFB1E3A1ED97F4B1DAA1D997FFB1D1A1D097C0B1EDA1DD97C0B1E2A1D497FFB1E6A1ED97C2B1E2A1DE") : atm.m897d("B1DCA1D297F4B1D2A1D097C0B1D2A1E997F3B1D2A1DD97C0B1EDA1D097FEB1E2A1D197C0B1DDA1ED97FAB1E1A1EE");
                                                                                case -902866070:
                                                                                    z = false;
                                                                                    break;
                                                                                case 294260693:
                                                                                    m897d4 = atm.m897d("B1E6A1E397CEB1E2A1D097FFB1E2A1DE97C1B1D6A1EC97F9B1DDA1E297C1B1D2A1ED97C2B1DFA1D397C0B1DA");
                                                                                case 1179954960:
                                                                                    String next = keys.next();
                                                                                    String m897d5 = atm.m897d("B1DFA1ED97FFB1DAA1EF97C1B1E3A1D097C2B1DCA1E297FEB1DAA1EF97C2B1EDA1ED97C2");
                                                                                    while (true) {
                                                                                        switch (m897d5.hashCode() ^ 54267890) {
                                                                                            case -1811526848:
                                                                                                m897d5 = atm.m897d("B1D6A1E997C0B1E2A1EE97FEB1DDA1ED97F3B1EDA1D797FDB1DAA1D097C1B1D1A1E997C0");
                                                                                            case -101229507:
                                                                                                break;
                                                                                            case 676380281:
                                                                                                m897d5 = this.f1075b.getJSONObject(next).getString(C0052e.m1418a(new byte[]{4, -30, -20, 80}, new byte[]{119, -118, -125, 39, 23, -81, -98, -30})).equals(m960w0) ? atm.m897d("B1E0A1D297C4B1E3A1D497C7B1DEA1DE97FDB1DFA1D597F3B1E1A1EA97C2B1ECA1DE97FFB1ECA1EA97FEB1E2A1EC97C7B1E6A1E297FAB1ECA1ED") : atm.m897d("B1DBA1EE97CFB1DFA1D497FFB1E6A1EA97C3B1E1A1D997C1B1DCA1D797FEB1E0A1D497FEB1D2A1DE97CFB1DEA1D497FFB1E2");
                                                                                            case 1857332764:
                                                                                                m960w0 = this.f1075b.getJSONObject(next).getString(C0052e.m1418a(new byte[]{87, -117, 23, 93}, new byte[]{36, -29, 120, 42, -13, -69, -31, 84}));
                                                                                                z = true;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                    String m897d6 = atm.m897d("B1E3A1D397FFB1E2A1E297FFB1ECA1EE97FCB1DDA1D497C3B1E2A1ED97FDB1EDA1EC97FEB1DCA1E397C0B1D2A1D497F0B1D2A1DD97C2B1EDA1D097FF");
                                                                    while (true) {
                                                                        switch (m897d6.hashCode() ^ (-1121066985)) {
                                                                            case -2103306640:
                                                                                m897d6 = atm.m897d("B1DAA1E997FAB1DDA1ED97C4B1E2A1EE97FFB1E0A1D197FDB1DDA1EE97FAB1DCA1E997C4B1E2A1D097C1B1DE");
                                                                            case 606377727:
                                                                                String str = "";
                                                                                C0459g m967p07 = m967p06.get(i3).m967p0(C0052e.m1418a(new byte[]{-113, 108, 125, 24, -40, 2, 50, -84, -121, 96, 38, 70, -39, 12, 47, -12, -121, 108, 120, 66, -104, 14, 57, -73, -97, 96, 101, 66, -117, 12}, new byte[]{-21, 5, 11, 54, -75, 109, 86, -39}));
                                                                                ArrayList arrayList3 = new ArrayList();
                                                                                int i4 = 0;
                                                                                while (true) {
                                                                                    String m897d7 = atm.m897d("B1DEA1D797F9B1E2A1E297F8B1D6A1EF97C7B1D6A1EF97C0B1D6A1EC97FEB1DDA1ED97FEB1DFA1E997CEB1DFA1ED97F3B1D6A1E997C0B1D1A1EC97F9");
                                                                                    while (true) {
                                                                                        switch (m897d7.hashCode() ^ (-1846367744)) {
                                                                                            case -1631685449:
                                                                                                m897d7 = i4 < m967p07.size() ? atm.m897d("B1DCA1E397FEB1E2A1E397C1B1DFA1ED97FAB1DCA1EF97C1B1EDA1EA97FDB1E2A1E397C0B1EDA1DE97F3B1EDA1D297C7") : atm.m897d("B1DCA1D597C4B1EDA1D497C4B1E2A1ED97F3B1DCA1D997FFB1DCA1D097C4B1E6A1ED97C7B1D6A1EF97FDB1D2A1E397C0");
                                                                                            case -761600731:
                                                                                                Matcher matcher = this.f1079f.matcher(m967p07.get(i4).mo925d(C0052e.m1418a(new byte[]{2, -106, 65, 7}, new byte[]{106, -28, 36, 97, -79, 46, 69, -5})));
                                                                                                String m897d8 = atm.m897d("B1DAA1EC97F0B1E2A1D297FDB1E5A1E297FEB1E0A1D297FCB1DBA1ED97C2B1D8A1D597CEB1D1A1ED");
                                                                                                while (true) {
                                                                                                    switch (m897d8.hashCode() ^ 1292391958) {
                                                                                                        case -1911158931:
                                                                                                            break;
                                                                                                        case -1108759484:
                                                                                                            m897d8 = !matcher.find() ? atm.m897d("B1DDA1E297FFB1D1A1E997C3B1DDA1E997C7B1E3A1D197F3B1E5A1D297C0B1E2A1E997C3B1EDA1D097CFB1DAA1D497C4B1D6A1DE97F9B1DCA1ED") : atm.m897d("B1ECA1EE97F9B1E5A1D097FEB1E2A1D797F3B1DEA1ED97C7B1EDA1D497C0B1E0A1D997FEB1E2A1D997FFB1DBA1ED97FAB1DCA1DD97F4B1EDA1E997C0");
                                                                                                        case 18129444:
                                                                                                            m897d8 = atm.m897d("B1DFA1D197FDB1ECA1D097C4B1DAA1EC97C7B1DCA1D197C2B1EDA1D197CEB1D2A1D097F0B1E3A1ED97FFB1DFA1EC97C4B1E2A1EF97FDB1DBA1ED");
                                                                                                        case 1480454243:
                                                                                                            arrayList3.add(c0293m.m960w0() + C0052e.m1418a(new byte[]{-92}, new byte[]{Byte.MIN_VALUE, -110, -54, 42, -27, 53, -28, 35}) + (matcher.group(1) + C0052e.m1418a(new byte[]{104}, new byte[]{69, 102, -115, 121, -16, 59, -88, -99}) + matcher.group(2) + C0052e.m1418a(new byte[]{-85}, new byte[]{-122, 22, -39, 67, -100, 80, -74, 90}) + matcher.group(3)));
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                i4++;
                                                                                                break;
                                                                                            case 1201463551:
                                                                                                String m897d9 = atm.m897d("B1E0A1ED97F0B1E2A1D497C3B1E1A1EA97C0B1DCA1ED97C1B1EDA1EF97F9B1DDA1DE97FDB1E0A1EC97F0B1ECA1EF");
                                                                                                while (true) {
                                                                                                    switch (m897d9.hashCode() ^ 609346320) {
                                                                                                        case -1902971353:
                                                                                                            break;
                                                                                                        case -1658449537:
                                                                                                            m897d9 = arrayList3.size() > 0 ? atm.m897d("B1DAA1D997F0B1E5A1D597C3B1D2A1DE97C2B1DEA1E297C7B1DBA1EC97C2B1DEA1E397C3B1ECA1E997C0B1ECA1D497C7") : atm.m897d("B1E0A1DE97C0B1E1A1D597C2B1DBA1D097F3B1DDA1DD97FAB1E2A1EA97C7B1DD");
                                                                                                        case -163555284:
                                                                                                            m897d9 = atm.m897d("B1DFA1E297FEB1E2A1D197FDB1ECA1ED97C0B1D8A1EF97C3B1E3A1DD97C3B1ECA1D197FDB1E6A1D0");
                                                                                                        case 2098598582:
                                                                                                            str = TextUtils.join(C0052e.m1418a(new byte[]{25}, new byte[]{58, 87, 109, -39, -90, -70, -61, 34}), arrayList3);
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                String m897d10 = atm.m897d("B1DDA1EC97FCB1D2A1EA97FFB1E0A1D197F9B1E2A1D397C7B1D2A1ED97C4B1E3A1DE97F0B1E6A1ED97C0B1ECA1ED97FFB1E2A1DE97FDB1DDA1E297CEB1DE");
                                                                                                while (true) {
                                                                                                    switch (m897d10.hashCode() ^ 1868227887) {
                                                                                                        case -907171734:
                                                                                                            m897d10 = str.length() == 0 ? atm.m897d("B1D6A1D997FAB1DBA1DE97CFB1DEA1EC97FAB1E2A1DD97C0B1E0A1EA97C4B1DEA1E297FCB1ECA1D397FEB1E2") : atm.m897d("B1DEA1DE97C0B1E2A1EF97F9B1E1A1EE97FFB1E5A1D597C0B1ECA1ED97FCB1D8A1D397F4B1DCA1DD97FCB1D6A1EF");
                                                                                                        case 766395853:
                                                                                                            m897d10 = atm.m897d("B1D8A1D797C1B1EDA1DE97F9B1E2A1E297F4B1EDA1E397FDB1ECA1D097F0B1D2A1ED97C0B1E5");
                                                                                                        case 1723269260:
                                                                                                            c0459g = m967p05;
                                                                                                            continue;
                                                                                                        case 1776205027:
                                                                                                            linkedHashMap.put(m960w0, str);
                                                                                                            c0459g = m967p05;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 1616752336:
                                                                                                m897d7 = atm.m897d("B1D1A1D797F0B1E2A1E997F4B1E0A1DE97FCB1ECA1ED97F9B1E3A1D097C0B1D2A1E997CEB1E2A1D397F8B1DAA1D597C0B1D2A1EF97F4B1DBA1D097FC");
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 613663170:
                                                                                m897d6 = !z ? atm.m897d("B1D6A1D197C2B1D6A1D397F9B1DCA1D997FFB1E0A1EA97F0B1D8A1DE97C1B1E6A1DD97FDB1E1A1EA97F0B1E2A1D097C4B1D8") : atm.m897d("B1EDA1D097C4B1E2A1E297C0B1D1A1E397FDB1DCA1ED97C3B1E6A1ED97C0B1E0A1D797C3B1D8A1EC");
                                                                            case 1957614587:
                                                                                c0459g = m967p05;
                                                                                break;
                                                                        }
                                                                    }
                                                                    i3++;
                                                                    m967p05 = c0459g;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    SpiderDebug.log(e);
                                                                    return "";
                                                                }
                                                                break;
                                                            case 1001938634:
                                                                m897d3 = atm.m897d("B1DEA1E297C4B1D2A1D097CEB1E2A1EC97C7B1DFA1E397C4B1DCA1D797C3B1E6A1ED97FCB1D6A1EE97C3B1D2A1EA97CEB1E5A1DD97C1B1DCA1DD97C0");
                                                            case 1835713887:
                                                                String m897d11 = atm.m897d("B1DDA1DE97FAB1D6A1D997F9B1E1A1EC97F0B1E2A1D297FEB1DEA1E297FCB1E0A1ED97CFB1DEA1DD97F4B1E2A1ED97FCB1EDA1D397C0B1DFA1DD97F3");
                                                                while (true) {
                                                                    switch (m897d11.hashCode() ^ 698852543) {
                                                                        case 1042185868:
                                                                            if (linkedHashMap.size() <= 0) {
                                                                                m897d11 = atm.m897d("B1ECA1E397CFB1DAA1DD97FEB1DFA1ED97C0B1D2A1D197F9B1E2A1E297C7B1D6A1EE97F4B1E5");
                                                                                break;
                                                                            } else {
                                                                                m897d11 = atm.m897d("B1DDA1D097C0B1E2A1DD97CFB1DFA1EA97C7B1DDA1D997FDB1E0A1D297F4B1D8A1D597C7B1DDA1D097C2B1D8A1EF97CFB1DCA1ED97C1B1DBA1DD97C0");
                                                                                break;
                                                                            }
                                                                        case 1225565060:
                                                                            break;
                                                                        case 1871721480:
                                                                            m897d11 = atm.m897d("B1DEA1D097F4B1D6A1DE97F8B1EDA1EF97C2B1DAA1DD97FEB1E2A1EF97F9B1E6A1E997C3B1E6A1EF97F0B1DCA1E997FAB1E1A1DE97C3");
                                                                            break;
                                                                        case 2029384079:
                                                                            String join3 = TextUtils.join(C0052e.m1418a(new byte[]{85, -118, 34}, new byte[]{113, -82, 6, 51, 113, -101, -55, 101}), linkedHashMap.keySet());
                                                                            String join4 = TextUtils.join(C0052e.m1418a(new byte[]{41, -68, 17}, new byte[]{13, -104, 53, -22, 111, -4, -109, -7}), linkedHashMap.values());
                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{-79, 105, 18, 59, 68, -63, -25, -15, -104, 96, 4, 11, 89}, new byte[]{-57, 6, 118, 100, 52, -83, -122, -120}), join3);
                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{-31, -3, 2, 67, -78, 5, 24, -117, -56, -25, 20, 112}, new byte[]{-105, -110, 102, 28, -62, 105, 121, -14}), join4);
                                                                            break;
                                                                    }
                                                                }
                                                                JSONArray jSONArray = new JSONArray();
                                                                jSONArray.put(jSONObject2);
                                                                jSONObject.put(C0052e.m1418a(new byte[]{26, 29, 41, -56}, new byte[]{118, 116, 90, -68, 22, -89, -51, -18}), jSONArray);
                                                                return jSONObject.toString();
                                                        }
                                                    }
                                                }
                                                break;
                                            case 283970226:
                                                m897d2 = atm.m897d("B1E3A1EE97C2B1E3A1D597C4B1E2A1ED97F8B1DAA1D597FAB1D2A1DE97C3");
                                            case 1396468973:
                                                m897d2 = i2 < m967p04.size() ? atm.m897d("B1D2A1EE97C0B1E2A1D297FCB1DFA1ED97C7B1E5A1EF97C2B1DAA1E997C0B1E6A1EF97F3B1DEA1E997C1B1E0A1ED97FFB1E2A1D097F3B1E5") : atm.m897d("B1E3A1DE97C0B1E2A1E997FCB1E6A1ED97F4B1D8A1D297FFB1ECA1ED97F8B1EDA1D997F3B1E6A1EF97FAB1E0A1EF97C4B1DEA1EF97F9B1DEA1EA");
                                        }
                                    }
                                    arrayList2.add(m967p04.get(i2).m960w0());
                                    i2++;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                            break;
                    }
                }
                arrayList.add(m967p03.get(i).m960w0());
                i++;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        C0459g m967p0;
        JSONArray jSONArray;
        int i = 0;
        try {
            String str = f1073h;
            C0288h m1414e = C0052e.m1414e(C0574b.m308e(str, m288c(str)));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{67, -15, -26, -62, -57, 52, 73, -25, 68, -80, -95, -40, -61, 47, 88, -72, 90, -12, -26, -62, -57, 52, 73, -25, 68, -80, -95, -40, -61, 47, 21, -25}, new byte[]{54, -99, -56, -84, -90, 66, 43, -122}));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0293m> it = m967p02.iterator();
            while (true) {
                String m897d = atm.m897d("B1D8A1E297C0B1E6A1D197FFB1E2A1D797FFB1D8A1EF97C0B1E2A1E297FDB1E2A1ED97C0B1DEA1E397C0B1EDA1D297CEB1E2");
                while (true) {
                    switch (m897d.hashCode() ^ 1520209733) {
                        case -1942419201:
                            m897d = atm.m897d("B1E6A1D097FFB1ECA1ED97C0B1E2A1EE97C1B1DEA1E297F0B1E3A1EE97F9B1D6A1D997CEB1E1A1E997C1B1ECA1EE97F9B1DBA1D197FCB1D6");
                        case -1587789466:
                            JSONObject jSONObject = new JSONObject();
                            String m897d2 = atm.m897d("B1E6A1D297F0B1D6A1D297F8B1E0A1D797FAB1E0A1E397FFB1ECA1D097C0B1DDA1ED97FEB1DBA1D097FE");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-74420188)) {
                                    case -1415619367:
                                        if (!z) {
                                            m897d2 = atm.m897d("B1DFA1D097C0B1DBA1D797FEB1E2A1EC97C4B1E2A1EE97C4B1EDA1D797FCB1DBA1ED97C0B1DDA1DD97C0B1DCA1EA97F3B1D1A1D397FD");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1DEA1D397F0B1D6A1D497FCB1D6A1D997CFB1D2A1EC97F3B1D2A1D497C0B1D8A1ED97FEB1E2");
                                            break;
                                        }
                                    case -1394302147:
                                        jSONObject.put(C0052e.m1418a(new byte[]{-72, -51, -13, -104, -73, -125, -29}, new byte[]{-34, -92, -97, -20, -46, -15, -112, 80}), this.f1076c);
                                        break;
                                    case -865727681:
                                        m897d2 = atm.m897d("B1DAA1EE97FAB1EDA1D797FDB1E2A1EE97FCB1E1A1D097FDB1DFA1D397F3B1E0A1D797F3B1E5");
                                        break;
                                    case 752565496:
                                        break;
                                }
                            }
                            jSONObject.put(C0052e.m1418a(new byte[]{-110, 5, -79, -13, 58}, new byte[]{-15, 105, -48, Byte.MIN_VALUE, 73, 1, -10, 70}), jSONArray2);
                            try {
                                m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-32, 83, -80, -95, -38, 122, -68, -57, -24, 95, -21, -30, -42, 124, -74}, new byte[]{-124, 58, -58, -113, -73, 21, -40, -78})).get(0).m967p0(C0052e.m1418a(new byte[]{115, -12, 4, 126, 99, -119, 6, 36, 123, -8, 95, 57, 122, -125, 15, 34, 41, -4}, new byte[]{23, -99, 114, 80, 14, -26, 98, 81}));
                                jSONArray = new JSONArray();
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                            while (true) {
                                String m897d3 = atm.m897d("B1E5A1EE97F4B1DDA1EA97FCB1DFA1DD97F9B1E2A1E397C1B1E5A1D097C7B1DFA1D997C1B1DEA1EE97C3B1E6");
                                while (true) {
                                    switch (m897d3.hashCode() ^ (-653607645)) {
                                        case -1376932887:
                                            m897d3 = i < m967p0.size() ? atm.m897d("B1D8A1E997F3B1DAA1EA97C0B1DCA1EE97C0B1DCA1D097C1B1E6A1D197FF") : atm.m897d("B1D6A1E997C4B1DBA1ED97FDB1E2A1D997C1B1D2A1D597FEB1E3A1E997FFB1E2A1ED97F9B1D2A1ED97C0");
                                        case 247639299:
                                            jSONObject.put(C0052e.m1418a(new byte[]{6, 6, 40, -87}, new byte[]{106, 111, 91, -35, 44, -37, 63, -81}), jSONArray);
                                            break;
                                        case 1526367049:
                                            C0293m c0293m = m967p0.get(i);
                                            String mo925d = c0293m.mo925d(C0052e.m1418a(new byte[]{-66, 124, 33, 35, -25}, new byte[]{-54, 21, 85, 79, -126, -27, 60, 87}));
                                            String mo925d2 = c0293m.m966q0(C0052e.m1418a(new byte[]{-82, -51, 102, 119, 41, -48, -111, 111, -85, -49, 96, 61}, new byte[]{-57, -96, 1, 89, 69, -79, -21, 22})).mo925d(C0052e.m1418a(new byte[]{85, -86, 44, 91, -82, 59, -32, 66, 86, -94, 54, 91, -17}, new byte[]{49, -53, 88, 58, -125, 84, -110, 43}));
                                            String m960w0 = c0293m.m966q0(C0052e.m1418a(new byte[]{40, -37, 77, 87, -27, -32, 24, -29, 32, -41, 22, 16, -4, -22, 17, -69, 34, -35, 79, 28}, new byte[]{76, -78, 59, 121, -120, -113, 124, -106})).m960w0();
                                            Matcher matcher = this.f1078e.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{106, -8, -47, 63}, new byte[]{2, -118, -76, 89, 33, -53, -49, 44})));
                                            String m897d4 = atm.m897d("B1E2A1D997CFB1DCA1D797F0B1DFA1EE97FDB1EDA1D297C4B1DCA1ED97C1B1EDA1EA97FDB1EDA1EC97FEB1DDA1ED97C7B1DAA1EE");
                                            while (true) {
                                                switch (m897d4.hashCode() ^ (-45135469)) {
                                                    case -2123221902:
                                                        m897d4 = !matcher.find() ? atm.m897d("B1E3A1D397FDB1E2A1D997FDB1E6A1EA97C2B1D2A1ED97C7B1EDA1DE97C4B1EDA1D097C0B1DCA1EE97F0B1DAA1D797F3B1E3A1DD97FEB1E2") : atm.m897d("B1EDA1EF97C1B1E6A1E297C2B1DEA1EC97FDB1E5A1E297C1B1E1A1E997F0B1E1A1D797C4B1E1A1E997C3B1D1A1D397FDB1EDA1EF97F0");
                                                    case -665487298:
                                                        String group = matcher.group(1);
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{7, 66, -96, 16, 68, 20}, new byte[]{113, 45, -60, 79, 45, 112, 28, -47}), group);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{17, -82, -111, 4, -31, -6, -125, -86}, new byte[]{103, -63, -11, 91, -113, -101, -18, -49}), mo925d);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{4, -90, -11, -117, -89, -35, -115}, new byte[]{114, -55, -111, -44, -41, -76, -18, -6}), mo925d2);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{3, 111, -37, 50, 57, 49, -93, -55, 7, 107, -52}, new byte[]{117, 0, -65, 109, 75, 84, -50, -88}), m960w0);
                                                        jSONArray.put(jSONObject2);
                                                        break;
                                                    case -258891271:
                                                        m897d4 = atm.m897d("B1E1A1D297FEB1E6A1D997C4B1D6A1ED97C4B1E2A1D997C1B1E6A1ED97FDB1DEA1E397C0B1E5A1E297FCB1D1A1EE");
                                                    case 1868303499:
                                                        break;
                                                }
                                            }
                                            i++;
                                            break;
                                        case 1655428515:
                                            m897d3 = atm.m897d("B1DBA1D597C3B1DCA1E397FFB1E2A1D097FFB1DEA1D197F3B1DCA1E397C0B1ECA1D997F4B1DEA1D797C1B1D1");
                                    }
                                }
                                return jSONObject.toString();
                            }
                        case -1144493192:
                            C0293m next = it.next();
                            String mo925d3 = next.mo925d(C0052e.m1418a(new byte[]{-104, -58, 101, 91, 95}, new byte[]{-20, -81, 17, 55, 58, 62, 75, -54}));
                            Matcher matcher2 = this.f1077d.matcher(next.mo925d(C0052e.m1418a(new byte[]{49, -3, 98, -5}, new byte[]{89, -113, 7, -99, Byte.MAX_VALUE, -26, 9, 100})));
                            String m897d5 = atm.m897d("B1DDA1EC97FAB1E0A1E297F0B1E2A1EA97CEB1DCA1ED97F0B1E3A1D797F8B1EDA1DD97C2B1D6A1EA97C0B1DAA1EC97F9B1E6A1EC");
                            while (true) {
                                switch (m897d5.hashCode() ^ (-672734277)) {
                                    case -1577680110:
                                        m897d5 = atm.m897d("B1E2A1D597F8B1E5A1EE97CFB1ECA1E397C0B1EDA1D997C7B1E6A1ED97CFB1E0A1E397C2B1D8A1DE97F0B1DAA1DE97F0B1E2");
                                    case -510999879:
                                        break;
                                    case 621618927:
                                        m897d5 = !matcher2.find() ? atm.m897d("B1E2A1EA97C2B1DEA1E397C7B1DCA1DE97F9B1E2A1E997F4B1D1A1D997CEB1E2") : atm.m897d("B1DDA1ED97FDB1E0A1D497F8B1DEA1D197C4B1DEA1D797FEB1D6A1ED97C0B1DBA1ED97F9B1E2A1D997C7B1DBA1E297F4");
                                    case 841826113:
                                        String trim = matcher2.group(1).trim();
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-58, -22, -93, -15, 104, -89, 82}, new byte[]{-78, -109, -45, -108, 55, -50, 54, 85}), trim);
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-45, 83, -28, -63, -77, -107, 3, -8, -62}, new byte[]{-89, 42, -108, -92, -20, -5, 98, -107}), mo925d3);
                                        jSONArray2.put(jSONObject3);
                                        break;
                                }
                            }
                            break;
                        case 991125442:
                            m897d = it.hasNext() ? atm.m897d("B1D2A1D197FAB1E6A1E297C3B1DFA1EA97C4B1E2A1EE97FEB1D1A1D497C4B1E1A1D997F0B1E3A1DD97F4B1E2A1ED97C2B1EDA1DD") : atm.m897d("B1DBA1D997C4B1DEA1D497FEB1D8A1D997FAB1D1A1D797F0B1D1A1EF97FDB1ECA1EE97C0B1E2A1D497FFB1DFA1ED");
                    }
                }
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final void init(Context context) {
        super.init(context);
        try {
            Matcher matcher = Pattern.compile(C0052e.m1418a(new byte[]{-11, -53, 96, -63, -122, -77, -113, 60, -13, -67, 8, -16, -69, -125, -93, 126, -49, -18, 82, -49, -103, -113, -99, 116, -57, -16, 25, -51, -74, -127, -118, 119, -36, -56, 91, -44, -87, -108, -88, 78, -7, -21, 107, -18, -90, -50, -82, 56, -111, -86, 31, -26, -122, -73, -113, 78, -3, -21, 25, -32, -16, -33, -38, 62, -29, -10, 84, -19, -74, -127, -118, 119, -36, -44, 88, -45, -68, -119, -108, 60, -54, -8, 64, -45, -65, -110, -84, 126, -57, -28, 67}, new byte[]{-82, -105, 55, -67, -38, -32, -13, 18})).matcher(C0574b.m307f(C0052e.m1418a(new byte[]{-44, 67, 8, 15, 59, -123, 44, -18, -33, 88, 23, 26, 37, -55, 45, -84, -39, 24, 15, 11, 41, -53, 106, -94, -109, 93, 15, 80, 56, -45, 98, -72, -39, 69, 31, 16, 38, -39, 106, -90, -110, 93, 15, 64, 60, -126, 49, -15, -114, 5, 77, 79, 121, -121}, new byte[]{-68, 55, 124, Byte.MAX_VALUE, 72, -65, 3, -63}), null, null));
            String m897d = atm.m897d("B1EDA1E397FAB1DFA1EE97C7B1E6A1E997FAB1D1A1D597CEB1E2A1D997C4B1DEA1D097F4B1DCA1ED97C0B1D8A1EA97CFB1DEA1D997C3B1D6A1D1");
            while (true) {
                switch (m897d.hashCode() ^ 344610333) {
                    case -2083878060:
                        break;
                    case 643675505:
                        m897d = atm.m897d("B1E2A1EF97C4B1E6A1EF97C0B1E2A1DE97F8B1EDA1D797FDB1D8A1D497FE");
                        break;
                    case 1588721330:
                        if (!matcher.find()) {
                            m897d = atm.m897d("B1DFA1D997FAB1EDA1D997F4B1DAA1ED97FDB1E2A1D197C4B1D2A1EA97FEB1E3");
                            break;
                        } else {
                            m897d = atm.m897d("B1D1A1EF97F8B1DCA1D397FEB1E2A1D297CEB1E2A1D397FCB1D8A1D597FDB1E0A1D097FDB1DFA1ED97FEB1D6A1DD97C0B1DCA1D997F9B1D1A1EA97C3");
                            break;
                        }
                    case 1891316871:
                        this.f1075b = new JSONObject(matcher.group(1));
                        break;
                }
            }
            this.f1076c = new JSONObject(atm.m897d("11584F57760311581110357A504956572239071F584F6EBDE3DD9CF6C97A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FE3D0BDE3DD58596E2E48405890DAC48FF0FD57317411581457767A8DF2CB93CFDD485658036E62489CFEEEAADBEF580759377A04584057AAD9FA9CFAE36E74480C584F6EBEEBEA9CF5DA7A17560157227A50589FFFE4BCD7E658596E2E48405890C7CD8EC7E657317411581457767A8DDDEB90F5E3485658036E62489DDDE4A9E1D1580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE0FD9CF6C97A17560157227A50589CFDD4BCD0F358596E2E48405893C4E88DF2D757317411581457767A8DF0D592F1F2485658036E62489DF0DAABE5C0580759377A04584057A9D2C29DEECE6E74480C584F6EBDE1EF9DE0E77A17560157227A50589FD0CBBDD3C158596E2E48405890E9DF8FC3C157317411581457767A8CF8D692DAC9485658036E62489CFDCDABCEFB580759377A04584057A9E6C49DEEC0A9E5DB5856573A7A50589FCBE2B1F1C19FC8FD7A17270759377A011F035776695B56581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E6248484A477F7A46580C57767A584A48466E254601581B6E6248484A477E7A46580C57767A584A48476E254601581B6E6248484A477D7A46580C57767A584A48446E254601581B6E6248484A477C7A46580C57767A584A48456E254601581B6E6248484A44757A46580C57767A584A4B4C6E254601581B6E6248484A44747A46580C57767A584A4B4D6E254601581B6E6248484A447B7A46580C57767A584A4B426E254601581B6E6248484A447A7A46580C57767A584A4B436E254601581B6E6248484A44797A46580C57767A584A4B406E254601581B6E6248484A44787A46580C57767A584A4B416E254601581B6E6248484A447F7A46580C57767A584A4B466E254601581B6E6248484A447E7A46580C57767A584A4B476E254601581B6E6248484A447D7A46580C57767A584A4B446E254601581B6E6248484A447C7A46580C57767A584A4B456E253707560E6E330F03584F787448141B18297A505892DAE1B0C2FA58596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6EBDF1C792DAE17A46580C57767A8FE6F19DE6C64807560E6E364840589DC7E982D5D757607A1C584057A4D3DB92D0EB6E254601581B6E62489DC8D1A4F7C75856573A7A50589DC7F9B0C0E4580860234814584F6EB1FDC79FF8DBB0C5D758596E2E4840589CDAF18FF7ED9DE6C64807560E6E364840589CD3F182D5D757607A1C584057A5C7F992D0EB6E254601581B6E62489CEDD0A4F7C75856573A7A50589CE2E9B0C0E4580860234814584F6EBED9EF92DAE17A46580C57767A8CC9EF9DE6C64807560E6E3648405890F2EF82D5D757607A1C584057A9E6DD92D0EB6E254601581B6E62489FFFC3A9F6E95856573A7A50589FF0FABDC4F9580811254601581E292148404F596E360B171F57767A8FD7ED93E3D5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058346E74480C584F6E194807560E6E36484058376E74480C584F6E1A4807560E6E36484058366E74480C584F6E1B4807560E6E36484058316E74480C584F6E1C4807560E6E36484058306E74480C584F6E1D4807560E6E36484058336E74480C584F6E1E4807560E6E36484058326E74480C584F6E1F4807560E6E364840583D6E74480C584F6E104807560E6E364840583C6E74480C584F6E114807560E6E364840583F6E74480C584F6E124807560E6E364840583E6E74480C584F6E134807560E6E36484058396E74480C584F6E144807560E6E36484058386E74480C584F6E154807560E6E364840583B6E74480C584F6E164807560E6E364840583A6E74480C584F6E174807560E6E36484058256E74480C584F6E084807560E6E36484058246E74480C584F6E094807560E6E36484058276E74480C584F6E0A4807560E6E36484058266E74480C584F6E0B4807560E6E36484058216E74480C584F6E0C4807560E6E36484058206E74480C584F6E0D4807560E6E36484058236E74480C584F6E0E4807560E6E36484058226E74480C584F6E0F4807560E6E364840582D6E74480C584F6E004807560E6E364840582C6E74480C584F6E014807560E6E364840582F6E74480C584F6E024807560E6E36484058456161485658036E62484A574C6E253707560E6E330F03584F7E7448141B18297A50589CFBDEBDD0F558596E2E0B160F106E623101581B6E62489CEDC3A5CFDE5856573A7A50580E1C213D4807560E6E3648405891F6E28CCAEE57607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5858402E377A011F0357766846581414213D48405892FDE38FE4F157607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E484058476E254601581B6E62489FDED2A5C1EC9FF3D26E74480C584F6E6959580759377A04584057A5FEF39CC2DAA9D1CD5856573A7A50584B416E254601581B6E624893E5DCA9C3D79FF3D26E74480C584F6E695F580759377A04584057AAF4CD9DC4FBA9D1CD5856573A7A50584B436E254601581B6E62489CEDD0AAC4C69FF3D26E74480C584F6E6A5A580759377A04584057A9D7DA9CC3CBA9D1CD5856573A7A505848446E254601581B6E62489CC9C5A9C3D79FF3D26E74480C584F6E6A58580728317411581110357A504B56572239071F584F6EBDF6CA9FF9F67A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589ECDE1BDF1C79FD1EBB1F3FC58596E2E48405891F4F58FE1C790E8FF83E3FC57317411581457767A83E5D390D7E5485658036E624893E5DCA9C3D7580759377A04584057A8E0C79FE1C8A5FEF39CC2DA6E74480C584F6EBCD2D79FEEF1B1CCE39CCDE37A17560157227A50589ECDE1BDF1C79FFAFCBED3C458596E2E48405891F4F58FE1C790C3E88CC3C457317411581457767A8CEDDF93D0F4485658036E62489CEDD0AAC4C6580759377A04584057ABE6E49FE1C86E74480C584F6EBFD4F49FEEF17A17560157227A50589CC6FCBDF1C758596E2E48405893FFE88FE1C757317411581457767A82F1CB90D7E5485658036E624892F1C4A9C3D7580759377A04584057AACEDA9FF0D5A9C5CB5856573A7A50589CE3FCBDE0DA9FE8ED7A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC57310517560157273D135840447D7448141B18297A50589FCCF8BCD1C758596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580860234814584F6E6A5A4A4357607A1C5840577E685A43580860234814584F6E6A5A4A4257607A1C5840577E685A42580860234814584F6E6A5A4A4D57607A1C5840577E685A4D580860234814584F6E6A5A4A4C57607A1C5840577E685A4C580860234814584F6E6A5A4A4F57607A1C5840577E685A4F580860234814584F6E6A5A4A4E57607A1C5840577E685A4E580811254601581E292148404E596E360B171F57767A82D5D79DE4D8485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890D7E582D5D757607A1C584057A9C3D792D5D86E254601581B6E624892F1C4A4F7C75856573A7A505892FEFDB0C5D7580860234814584F6EBFD8DE92DAE17A46580C57767A8DC8DE9DE3F54807560E6E364840589CDBE58FF7ED9DE3F5485658036E624893EDC8A9D5FD92D5D86E254601581B6E624893E5DCA4F7C75856573A7A505893EAE5B0C5D7580860234814584F6EBEFDDF92DAE17A46580C57767A8CEDDF9DE3F54807560E6E3648405890C9EE8FD4F957607A1C584057A9DDDC9FD4F66E253707560E6E330F03584F797448141B18297A50589FD8DBBEC5F758596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E19485658036E62483B580860234814584F6E1A485658036E624838580860234814584F6E1B485658036E624839580860234814584F6E1C485658036E62483E580860234814584F6E1D485658036E62483F580860234814584F6E1E485658036E62483C580860234814584F6E1F485658036E62483D580860234814584F6E10485658036E624832580860234814584F6E11485658036E624833580860234814584F6E12485658036E624830580860234814584F6E13485658036E624831580860234814584F6E14485658036E624836580860234814584F6E15485658036E624837580860234814584F6E16485658036E624834580860234814584F6E17485658036E624835580860234814584F6E08485658036E62482A580860234814584F6E09485658036E62482B580860234814584F6E0A485658036E624828580860234814584F6E0B485658036E624829580860234814584F6E0C485658036E62482E580860234814584F6E0D485658036E62482F580860234814584F6E0E485658036E62482C580860234814584F6E0F485658036E62482D580860234814584F6E00485658036E624822580860234814584F6E01485658036E624823580860234814584F6E02485658036E624820580860234814584F6E68474358596E2E48405845616148072708602348111F0C6E625856581B2D350F584057AAD6F89FC0FA6E74480C1B19393D4840210E6E3648405893DBEE83EDCE57607A1C5840573831071F580860234814584F6EBCD0C09CC5D87A46580C57767A02130E066E254601581B6E624892D5F1A9D0EC5856573A7A50580916232A0F580728310546584B57760311581110357A504A56572239071F584F6EBDE2FC9DC4F77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E694807560E6E3648405890C6F08EC7E692C5DF485658036E62484C580860234814584F6EBDFCE69FFCEBBFE3FD58596E2E484058426E254601581B6E62489DF2C4AADBEF9DF3F26E74480C584F6E604807560E6E3648405892EBC98FC3C192C5DF485658036E624843580860234814584F6EBEEBEA9CF5DABFE3FD58596E2E484058447C7A17560157227A50589FFCEBBEE9FF9DFCCB7A46580C57767A5B4B580860234814584F6EBEE2E29ECFC5BFE3FD58596E2E484058447E7A17560157227A50589DFFE3BFD7D09DFCCB7A46580C57767A5849580860234814584F6EBDCFFD9FCCF7BFE3FD58596E2E48405847787A17560157227A50589CF7E0BFFCEB9DFCCB7A46580C57767A584F580860234814584F6EB0C4CA9FC8D9BFE3FD58596E2E484058477B7A17270759377A011F0357766946581414213D48405890D0E88FF6C057607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8EC2D790D7E58FDEDD9CD5DE485658036E62489EC2D8A9C3D79FDED2A5C1EC580759377A04584057A8E0C79FE1C8A5FEF39CC2DA6E74480C584F6EBCD2D79FEEF1B1CCE39CCDE37A17560157227A50589ECDE1BDF1C79FFAFCBED3C458596E2E48405891F4F58FE1C790C3E88CC3C457317411581457767A8DC4F490D7E5485658036E62489DC4FBA9C3D7580759377A04584057AAEBFF9FE1C86E74480C584F6EBED9EF9FEEF17A17560157227A505892FEFDBDF1C758596E2E4840589DC7E98FE1C757317411581457767A8CEDDF93D0F4485658036E62489CEDD0AAC4C6580759377A04584057A5C7C39FE1C86E74480C584F6EB1F5D39FEEF17A17560157227A50589FCBFBBDF1C758596E2E48405890F2EF8FE1C757317411581457767A8CC9CA90D7E5485658036E62489CC9C5A9C3D7580759377A04584057A9D5DA9FC0D36E74480C584F6EBDE7CA9FCFEA7A17560157227A50589CF1C3BDCEDD9FFDE57A46580C57767A8CFEF590E8FF8FF2D357317411581457767A82DFC592C3F58DF3E357607A1C584057A4FDD59DF5D8ABD1F3580759377A04584057A9D2CA9CF1CAA9FCCD5856573A7A50589FFFECBEE1C59FD1EB7A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC57310517560157273D135840447D7448141B18297A50589FCCF8BCD1C758596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580811254601581E292148404E596E360B171F57767A82D5D79DE4D8485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890D7E582D5D757607A1C584057A9C3D792D5D86E254601581B6E624892F1C4A4F7C75856573A7A505892FEFDB0C5D7580860234814584F6EBFD8DE92DAE17A46580C57767A8DC8DE9DE3F54807560E6E364840589CDBE58FF7ED9DE3F5485658036E624893EDC8A9D5FD92D5D86E254601581B6E624893E5DCA4F7C75856573A7A505893EAE5B0C5D7580860234814584F6EBEFDDF92DAE17A46580C57767A8CEDDF9DE3F54807560E6E3648405893FFCD82D5D757607A1C584057AAEBFF92D5D86E254601581B6E62489FC4C2A4F7C75856573A7A50589FCBFBB0C5D7580860234814584F6EBDEFCC9FDBCF7A46580C57767A8FFFCC90E2DB48072708602348111F0C6E625F56581B2D350F584057A9F5FD9CD5F86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62483B58596E2E484058346E254601581B6E62483858596E2E484058376E254601581B6E62483958596E2E484058366E254601581B6E62483E58596E2E484058316E254601581B6E62483F58596E2E484058306E254601581B6E62483C58596E2E484058336E254601581B6E62483D58596E2E484058326E254601581B6E62483258596E2E4840583D6E254601581B6E62483358596E2E4840583C6E254601581B6E62483058596E2E4840583F6E254601581B6E62483158596E2E4840583E6E254601581B6E62483658596E2E484058396E254601581B6E62483758596E2E484058386E254601581B6E62483458596E2E4840583B6E254601581B6E62483558596E2E4840583A6E254601581B6E62482A58596E2E484058256E254601581B6E62482B58596E2E484058246E254601581B6E62482858596E2E484058276E254601581B6E62482958596E2E484058266E254601581B6E62482E58596E2E484058216E254601581B6E62482F58596E2E484058206E254601581B6E62482C58596E2E484058236E254601581B6E62482D58596E2E484058226E254601581B6E62482258596E2E4840582D6E254601581B6E62482358596E2E4840582C6E254601581B6E62482058596E2E4840582F6E254601581B6E62484A574C6E74480C584F6E684743580811254601581E2921484048596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBEFDCC93E2F87A46580C57767A1E1317106E254601581B6E62489EC0CFAAE8FE5856573A7A5058121C382B4807560E6E364840589DE3DC8FF2FC57607A1C5840573F3B05081F57310517275657787A50210157273D13584045607A041B17106E62489FF2F3ABE9D15856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E62484E580860234814584F6EBDE0D29DE1F7BFFECF9FC8FD7A46580C57767A5E4B580811254601581E2921484049596E360B171F57767A8FF3DD93CFDD485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405893CFDD8CFEE557607A1C584057AADBEF9CFEEA6E254601581B6E62489DDDE4A9E1D15856573A7A50589DD2DDBDD3C1580860234814584F6EBFE9D792D4CC7A46580C57767A8DF9D79DEDD84807560E6E3648405893C2F08DEAFC57607A1C584057AAD6C29DEAF36E254601581B6E62489CEAEBABF4FB5856573A7A50589CE5D2BFC6EB580860234814584F6EBDECE893ECE57A46580C57767A8FFCE89CD5F14807560E6E364840589DDCC582F4F357607A1C584057A4C8F792F4FC6E254601581B6E62489CDAD4A9C3C75856573A7A50589CD5EDBDF1D7580860234814584F6EBDE0D29EC8D07A46580C57767A8FF0D291F1C44807560E6E3648405893D0E28CF2E257607A1C584057AAC4D09CF2ED6E254601581B6E624892C5E5A9D2C25856573A7A505892CADCBDE0D2580860234814584F6EBEE2E29ECFC57A46580C57767A8CF2E291F6D14807560E6E3648405890FCC98FC3CE57607A1C584057A9E8FB9FC3C16E254601581B6E62489FCAE4A9FDD95856573A7A50589FC5DDBDCFC9580860234814584F6EBFCEC49EC9D67A46580C57767A8DDEC491F0C24807560E6E3648405890C2C78FF2E157607A1C584057A9D6F59FF2EE6E254601581B6E62489EC0C7A9F5FA5856573A7A50589ECFFEBDC7EA580860234814584F6EBFF1F09CECF67A46580C57767A8DE1F093D5E24807560E6E3648405890C6E98FC5ED57607A1C584057A9D2DB9FC5E26E254601581B6E62489FFFC3A8E3FC5856573A7A50589FF0FABCD1EC580811254601581E292148404B596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890E8FF83E3FC57607A1C584057A9FCCD93E3F36E254601581B6E624893E5DCA9C3D75856573A7A505893EAE5BDF1C7580860234814584F6EBCD2D79FEEF1B1CCE39CCDE37A46580C57767A8EC2D790D7E583DCE393F4F74807560E6E3648405891F4F58FE1C790C3E88CC3C457607A1C584057A8E0C79FE1C8A9D7DA9CC3CB6E254601581B6E62489CEDD0AAC4C65856573A7A50589CE2E9BEF6D6580860234814584F6EBFD4F49FEEF17A46580C57767A8DC4F490D7E54807560E6E3648405893FFE88FE1C757607A1C584057AAEBDA9FE1C86E254601581B6E624892F1C4A9C3D75856573A7A505892FEFDBDF1C7580860234814584F6EBEFCCA9FFFECBDF7DB58596E2E48405893DAE88FF0DA90D1F94807560E6E3648405890C9EE8EC1EC57607A1C584057A9DDDC9EC1E36E253707560E6E330F03584F7D6946581414213D48405890F5EC8EC1C757607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A584A48466E74480C584F6E6A5A484957317411581457767A584A48476E74480C584F6E6A5A484857317411581457767A584A48446E74480C584F6E6A5A484B57317411581457767A584A48456E74480C584F6E6A5A484A57317411581457767A584A4B4C6E74480C584F6E6A5A4B4357317411581457767A584A4B4D6E74480C584F6E6A5A4B4257317411581457767A584A4B426E74480C584F6E6A5A4B4D57317411581457767A584A4B436E74480C584F6E6A5A4B4C57317411581457767A584A4B406E74480C584F6E6A5A4B4F57317411581457767A584A4B416E74480C584F6E6A5A4B4E57317411581457767A584A4B466E74480C584F6E6A5A4B4957317411581457767A584A4B476E74480C584F6E6A5A4B4857317411581457767A584A4B446E74480C584F6E6A5A4B4B57317411581457767A584A4B456E74480C584F6E6A5A4B4A57310517560157273D13584041607A041B17106E624892D5D8A4F0EA5856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9C3D792D5D86E74480C584F6EBDF1C792DAE17A17560157227A505892FEFDB0C5D758596E2E4840589DC7E982D5D757317411581457767A8DC8DE9DE3F5485658036E62489DC8D1A4F7C7580759377A04584057A5CFD79FF7E2A4F7C75856573A7A505893E2F1BDE7ED92DAE17A17560157227A505893EAE5B0C5D758596E2E4840589CD3F182D5D757317411581457767A8CEDDF9DE3F5485658036E62489CEDD0A4F7C7580759377A04584057A9DDDC9FD4F66E74480C584F6EBDEFCC9FDBCF7A17270759377A011F0357766D46581414213D48405890E1CF8CD5F757607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A2B5856573A7A50583B57317411581457767A285856573A7A50583857317411581457767A295856573A7A50583957317411581457767A2E5856573A7A50583E57317411581457767A2F5856573A7A50583F57317411581457767A2C5856573A7A50583C57317411581457767A2D5856573A7A50583D57317411581457767A225856573A7A50583257317411581457767A235856573A7A50583357317411581457767A205856573A7A50583057317411581457767A215856573A7A50583157317411581457767A265856573A7A50583657317411581457767A275856573A7A50583757317411581457767A245856573A7A50583457317411581457767A255856573A7A50583557317411581457767A3A5856573A7A50582A57317411581457767A3B5856573A7A50582B57317411581457767A385856573A7A50582857317411581457767A395856573A7A50582957317411581457767A3E5856573A7A50582E57317411581457767A3F5856573A7A50582F57317411581457767A3C5856573A7A50582C57317411581457767A3D5856573A7A50582D57317411581457767A325856573A7A50582257317411581457767A335856573A7A50582357317411581457767A305856573A7A50582057317411581457767A5A574357607A1C5840577C7553580728317411581110357A504856572239071F584F6EBEE4E89FCFC37A46580C14202D0F58402E377A04584057AACFDC93EDC16E74480C584F6E2C03171F57317411581457767A8EC0C093FCCC485658036E62481213013F7A17560157227A505892DAC8BDE2FC58596E2E484058062F37181F58081125375658466E623101581E292148404B596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405891F4F58FE1C790E8FF83E3FC57607A1C584057A8E0C79FE1C8A9FCCD93E3F36E254601581B6E624893E5DCA9C3D75856573A7A505893EAE5BDF1C7580811254601581E292148404B44607A041B17106E62489FC3C1A8E3D75856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A045840577E68584958596E2E484058477C6A59580759377A045840577E68584858596E2E484058477C6A58580759377A045840577E68584B58596E2E484058477C6A5B580759377A045840577E68584A58596E2E484058477C6A5A580759377A045840577E685B4358596E2E484058477C6953580759377A045840577E685B4258596E2E484058477C6952580759377A045840577E685B4D58596E2E484058477C695D580759377A045840577E685B4C58596E2E484058477C695C580759377A045840577E685B4F58596E2E484058477C695F580759377A045840577E685B4E58596E2E484058477C695E580759377A045840577E685B4958596E2E484058477C6959580759377A045840577E685B4858596E2E484058477C6958580759377A045840577E685B4B58596E2E484058477C695B580759377A045840577E685B4A58596E2E484058477C695A580759377A045840577E685A4358596E2E484058477C6853580759377A045840577E685A4258596E2E484058477C6852580759377A045840577E685A4D58596E2E484058477C685D580759377A045840577E685A4C58596E2E484058477C685C580759377A045840577E685A4F58596E2E484058477C685F580759377A045840577E685A4E58596E2E484058477C685E580728317411581110357A504E56572239071F584F6EB0C5D792DDCC7A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FEEF1B0C5D758596E2E48405890D7E582D5D757317411581457767A82F1CB9DE3F5485658036E624892F1C4A4F7C7580759377A04584057ABEACE92D5D86E74480C584F6EBFD8DE92DAE17A17560157227A505893E2F1BDE7ED92DAE17A46580C57767A83EDC790C1CF82D5D757317411581457767A83E5D39DE3F5485658036E624893E5DCA4F7C7580759377A04584057AACFCF92D5D86E74480C584F6EBEFDDF92DAE17A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D13584040607A041B17106E62489FD7E2AAF7E75856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A045840570D7A46580C57767A2B580759377A045840570E7A46580C57767A28580759377A045840570F7A46580C57767A29580759377A04584057087A46580C57767A2E580759377A04584057097A46580C57767A2F580759377A045840570A7A46580C57767A2C580759377A045840570B7A46580C57767A2D580759377A04584057047A46580C57767A22580759377A04584057057A46580C57767A23580759377A04584057067A46580C57767A20580759377A04584057077A46580C57767A21580759377A04584057007A46580C57767A26580759377A04584057017A46580C57767A27580759377A04584057027A46580C57767A24580759377A04584057037A46580C57767A25580759377A045840571C7A46580C57767A3A580759377A045840571D7A46580C57767A3B580759377A045840571E7A46580C57767A38580759377A045840571F7A46580C57767A39580759377A04584057187A46580C57767A3E580759377A04584057197A46580C57767A3F580759377A045840571A7A46580C57767A3C580759377A045840571B7A46580C57767A3D580759377A04584057147A46580C57767A32580759377A04584057157A46580C57767A33580759377A04584057167A46580C57767A30580759377A045840577C75535856573A7A50584A58757A17270759377A011F0357766A46581414213D48405893C2CA8FC0F557607A1C1B1600297A50210157227A50589CE2FAB1FDCE58596E2E4840580125350F580759377A04584057A8E2D09CCAE16E74480C584F6E30030E0957317411581457767A82D5FE90C4DE485658036E624809191A3E3D480727081125"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        String m1418a;
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0052e.m1418a(new byte[]{-14, -118, -51, 13, 48, -22}, new byte[]{-99, -8, -92, 106, 89, -124, -45, 90}), C0052e.m1418a(new byte[]{-17, -111, -48, -24, -127, -73, -109, -5, -32, -102, -53, -9, -108, -87, -33, -6, -94, -100}, new byte[]{-49, -7, -92, -100, -15, -60, -87, -44}));
            jSONObject.put(C0052e.m1418a(new byte[]{120, 37, 94, -61, -42, 46, -33, 121, 67, 34}, new byte[]{45, 86, 59, -79, -5, 111, -72, 28}), C0052e.m1418a(new byte[]{10, -23, 102, 99, 69, -25, -94, 74, 5, -111, 39, 41, 12, -93, -125, 74, 73, -51, 103, 109, 67, -8, -90, 16, 10, -19, 103, 109, 73, -25, -18, 102, 75, -57, 41, 86, Byte.MAX_VALUE, -85, -106, 11, 27, -108, 86, 40, 25, -44, -7, 2, 10, -27, 121, 105, 64, -18, -103, 78, 72, -17, 96, 109, 3, -66, -3, 28, 4, -105, 63, 57, 4, -64, -122, Byte.MAX_VALUE, 103, -24, 37, 57, 64, -30, -91, 78, 10, -29, 108, 122, 71, -28, -25, 11, 105, -52, 123, 118, 65, -18, -31, 18, 27, -118, 57, 55, 24, -65, -7, 25, 4, -107, 56, 45, 12, -40, -81, 77, 75, -42, 96, 54, 25, -72, -7, 5, 25, -110}, new byte[]{42, -92, 9, 25, 44, -117, -50, 43}));
            jSONObject.put(C0052e.m1418a(new byte[]{12, 114, 29, -19, 47, 126}, new byte[]{77, 17, 126, -120, 95, 10, -53, 107}), C0052e.m1418a(new byte[]{98, 2, 98, -4}, new byte[]{66, 40, 77, -42, -49, -82, -16, 86}));
            jSONObject.put(C0052e.m1418a(new byte[]{-30, -72, -73, -73, -78, -6, 90, -17, -62, -75, -77, -89, -93, -23, 18}, new byte[]{-93, -37, -44, -46, -62, -114, 119, -93}), C0052e.m1418a(new byte[]{106, -78, 122, 100, -79, -72, 104, 102, 34, -13, 99, 116, -62, -40, 125, 48, 47, -90, 63, 28, -95, -51, 53, 33, 122, -26, 33, 101, -105, -104, Byte.MAX_VALUE, 109, 119, -8, 60, 126}, new byte[]{74, -56, 18, 73, -14, -10, 68, 28}));
            jSONObject.put(C0052e.m1418a(new byte[]{-59, 113, -10, 98, -24, -112, -109, -101, -22, 113, -6, 99, -15, -118, -39}, new byte[]{-124, 18, -107, 7, -104, -28, -66, -34}), C0052e.m1418a(new byte[]{-50, -112, 69, -90, 34, -113, 106, 121, -117, -111, 83, -82, 38, -58}, new byte[]{-18, -9, 63, -49, 82, -93, 74, 29}));
            String str3 = C0052e.m1418a(new byte[]{79, 108, -123, -79, -110, 18, -78, -78, 68, 119, -102, -92, -116, 94, -77, -16, 66, 55, -121, -82, -123, 88, -15, -4, 94, 55}, new byte[]{39, 24, -15, -63, -31, 40, -99, -99}) + str2 + C0052e.m1418a(new byte[]{94, -103, 84, -98, -101}, new byte[]{112, -15, 32, -13, -9, -91, -47, 75});
            C0459g m967p0 = C0052e.m1414e(C0574b.m308e(str3, m288c(str3))).m967p0(C0052e.m1418a(new byte[]{123, 30, 8, 98, -19, 74}, new byte[]{8, 125, 122, 11, -99, 62, 51, -14}));
            JSONObject jSONObject2 = new JSONObject();
            while (true) {
                int i2 = i;
                String m897d = atm.m897d("B1D8A1EE97F9B1E2A1D497C1B1D8A1E297CFB1DBA1D297F9B1E1A1DE97F9B1EDA1D197F3B1E1A1E297FCB1D8");
                while (true) {
                    switch (m897d.hashCode() ^ (-1615578580)) {
                        case -1770028193:
                            String trim = m967p0.get(i2).m979d0().trim();
                            String m897d2 = atm.m897d("B1E1A1DD97FEB1E2A1E997F8B1DFA1D097C3B1E1A1EA97FDB1E2A1DD97FCB1ECA1EF97FEB1E2A1E297C2B1EDA1EA97C1B1DFA1ED97F9B1E0A1DE");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1591611825)) {
                                    case -1640722666:
                                        m897d2 = atm.m897d("B1E5A1D597C0B1E0A1DD97FEB1DDA1D597FFB1D2A1D397FDB1D6A1D497C7B1E3A1D297C0");
                                    case -499895499:
                                        JSONObject jSONObject3 = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                                        String m897d3 = atm.m897d("B1ECA1EA97F3B1E3A1D097F8B1DAA1E297C2B1E6A1E297F8B1D8A1D597C0B1D2A1EA97C7B1D8A1E397CEB1E2A1EC97C2B1ECA1ED");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1310354674) {
                                                case -1488710924:
                                                    m897d3 = atm.m897d("B1DCA1EA97FEB1E2A1D597FEB1E2A1EC97CEB1ECA1ED97F8B1DEA1D797FAB1DCA1D197C4B1E1A1E3");
                                                    break;
                                                case -679966231:
                                                    if (!this.f1075b.has(jSONObject3.getString(C0052e.m1418a(new byte[]{66, 120, 8, -79}, new byte[]{36, 10, 103, -36, 31, 63, -55, 104})))) {
                                                        m897d3 = atm.m897d("B1D2A1EA97C4B1EDA1ED97CEB1DFA1D597FFB1D6A1E297CFB1DCA1D597C1B1E0A1D397F0B1E2A1EA97C4B1E2A1D497FEB1E2A1ED97F0B1DAA1E9");
                                                        break;
                                                    } else {
                                                        m897d3 = atm.m897d("B1EDA1E997F4B1E5A1D197F9B1DEA1D597F3B1E3A1EF97FDB1DBA1EA97F8B1DEA1D497F8B1D1A1D197FEB1E0A1EA97FFB1DCA1ED97C0");
                                                        break;
                                                    }
                                                case 583770365:
                                                    JSONObject jSONObject4 = this.f1075b.getJSONObject(jSONObject3.getString(C0052e.m1418a(new byte[]{-9, -118, -122, -28}, new byte[]{-111, -8, -23, -119, -101, 83, 57, 82})));
                                                    String m897d4 = atm.m897d("B1DFA1EF97C0B1E2A1EF97FAB1E6A1D397F4B1DAA1EC97F0B1E0A1EE97CFB1DBA1ED97F9B1D8A1ED97C0B1DDA1D097F3");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ (-652623273)) {
                                                            case -1648813954:
                                                                if (jSONObject4.getInt(C0052e.m1418a(new byte[]{42, -68}, new byte[]{90, -49, -45, 100, -118, 33, -26, 81})) != 1) {
                                                                    m897d4 = atm.m897d("B1DAA1D797C7B1E2A1EA97CEB1E2A1D097F9B1DDA1D797C4B1ECA1DE97FAB1DB");
                                                                    break;
                                                                } else {
                                                                    m897d4 = atm.m897d("B1E3A1D297CFB1E2A1D597C4B1E2A1D797FDB1DFA1D397F4B1EDA1D097FFB1D8A1D097C4B1DAA1EE97FAB1D1");
                                                                    break;
                                                                }
                                                            case -372175282:
                                                                StringBuilder sb = new StringBuilder();
                                                                String str4 = f1073h;
                                                                sb.append(str4);
                                                                sb.append(jSONObject4.getString(C0052e.m1418a(new byte[]{-15, -104, 13, 120, Byte.MAX_VALUE}, new byte[]{-127, -7, Byte.MAX_VALUE, 11, 26, -113, 0, 80})));
                                                                sb.append(jSONObject3.getString(C0052e.m1418a(new byte[]{43, -12, -79}, new byte[]{94, -122, -35, 70, -124, -36, -12, -19})));
                                                                String sb2 = sb.toString();
                                                                System.out.println(str4 + sb2);
                                                                Matcher matcher = Pattern.compile(C0052e.m1418a(new byte[]{-1, 77, -49, 54, 50, -80, 60, 28, -19, 46, Byte.MIN_VALUE, 41, 110, -20, 122, 1, -1, 77, -50, 41, 110}, new byte[]{-41, 114, -13, 11, 71, -62, 80, 62})).matcher(C0574b.m308e(sb2, m288c(sb2)));
                                                                String m897d5 = atm.m897d("B1DDA1ED97FDB1D2A1DD97F3B1DAA1D397C3B1E1A1D997F0B1DAA1EF97C0B1E2A1E997C0B1DFA1ED97FCB1D6A1E397C0B1E2A1D497FFB1E2");
                                                                while (true) {
                                                                    switch (m897d5.hashCode() ^ (-92403894)) {
                                                                        case -1747698164:
                                                                            if (!matcher.find()) {
                                                                                m897d5 = atm.m897d("B1D2A1D597FDB1E0A1EE97C7B1E2A1EE97C4B1D8A1EE97C0B1DCA1DE97CE");
                                                                                break;
                                                                            } else {
                                                                                m897d5 = atm.m897d("B1E2A1DE97FDB1E2A1D397F9B1D8A1E397C1B1DDA1D997C2B1E0A1D297CFB1E0A1D597F4B1DAA1EC97CEB1E0");
                                                                                break;
                                                                            }
                                                                        case 1016506845:
                                                                            String m289b = m289b(matcher.group(0));
                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{19, 74, 73, -87, 30}, new byte[]{99, 43, 59, -38, 123, -54, -96, -55}), 0);
                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{55, -110, -55, -77, 83, 69, 74}, new byte[]{71, -2, -88, -54, 6, 55, 38, -33}), "");
                                                                            jSONObject2.put(C0052e.m1418a(new byte[]{-86, -125, -108}, new byte[]{-33, -15, -8, -62, 10, 113, 94, -105}), m289b);
                                                                            m1418a = C0052e.m1418a(new byte[]{-18, 72, -3, -19, -20, -84}, new byte[]{-122, 45, -100, -119, -119, -34, 125, 46});
                                                                            break;
                                                                        case 1502910000:
                                                                            break;
                                                                        case 1671149472:
                                                                            m897d5 = atm.m897d("B1DDA1E297FCB1E6A1EF97C3B1E2A1EC97F8B1E0A1ED97C0B1D2A1D297C4B1E2A1D097CEB1DD");
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -119621916:
                                                                String m289b2 = m289b(jSONObject3.getString(C0052e.m1418a(new byte[]{-124, 26, 77}, new byte[]{-15, 104, 33, 118, -72, 114, -20, 84})));
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{35, 106, 94, 81, -17}, new byte[]{83, 11, 44, 34, -118, -87, -16, 106}), 0);
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-78, 93, 5, 9, -8, 40, -10}, new byte[]{-62, 49, 100, 112, -83, 90, -102, -98}), "");
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{12, -27, -69}, new byte[]{121, -105, -41, -43, 103, 11, -15, -103}), m289b2);
                                                                m1418a = C0052e.m1418a(new byte[]{98, 59, 10, -110, 33, 17}, new byte[]{10, 94, 107, -10, 68, 99, 82, 126});
                                                                break;
                                                            case 2093884936:
                                                                m897d4 = atm.m897d("B1E2A1D097FEB1E2A1D197C0B1E1A1D797CEB1D1A1D597F0B1E0A1D197FFB1DFA1ED");
                                                                break;
                                                        }
                                                    }
                                                    jSONObject2.put(m1418a, jSONObject.toString());
                                                    break;
                                                case 1374386845:
                                                    break;
                                            }
                                        }
                                        break;
                                    case -156415225:
                                        break;
                                    case 585667325:
                                        m897d2 = trim.startsWith(C0052e.m1418a(new byte[]{61, -71, 122, -87, -107, -79, 7, 33, 46, -86, 87}, new byte[]{75, -40, 8, -119, -27, -35, 102, 88})) ? atm.m897d("B1E3A1D397FEB1E2A1DD97FCB1E6A1ED97FDB1DCA1E397C0B1E1A1DE97F8B1D8A1D797C1B1E6") : atm.m897d("B1DAA1E397FDB1DEA1D297CEB1E2A1D397C2B1ECA1ED97CEB1E1A1E997F4B1DDA1DE97C2B1DFA1E397C0B1DEA1D197F8B1DDA1EE97FAB1E0A1D597F4");
                                }
                            }
                            break;
                        case -716246289:
                            m897d = atm.m897d("B1DEA1D097C4B1E2A1D197FDB1DFA1ED97F8B1E3A1E997C0B1D2A1E997C1B1E6A1DD97F8B1E1A1DD97CFB1ECA1ED97FAB1E1A1EF97F0B1E2A1D197F3B1DCA1ED");
                        case 576305380:
                            m897d = i2 < m967p0.size() ? atm.m897d("B1D8A1D297FAB1D6A1EA97CFB1E1A1ED97FEB1E3A1D997CEB1E2A1E297F3B1DAA1EA97F0B1E5A1D597F0B1D6") : atm.m897d("B1DDA1D597CFB1DAA1D197F9B1E2A1E997F9B1DFA1ED97C2B1DDA1EA97FFB1E2A1D297C0B1E5A1E397F9B1E2A1E397C7B1ECA1ED");
                        case 1925300848:
                            break;
                    }
                }
                i = i2 + 1;
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        try {
            String str2 = C0052e.m1418a(new byte[]{61, 42, -15, 24, 90, -102, -45, -98, 54, 49, -18, 13, 68, -42, -46, -36, 48, 113, -20, 6, 77, -59, -124, -97, 37, 54, -11, 71, 72, -54, -99, -55, 122, 45, -16, 15, 78, -59, -113, -59, 106, 51, -20, 12, 20, -111, -38, -58, 49, 99}, new byte[]{85, 94, -123, 104, 41, -96, -4, -79}) + URLEncoder.encode(str) + C0052e.m1418a(new byte[]{-64, 11, -88, 98, -10, -70, -52, 93, -42, 65, -75, 102, -14, -85, -126, 24, -121, 10, -79, 50}, new byte[]{-26, 103, -63, 15, -97, -50, -15, 108}) + System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(C0574b.m307f(str2, m288c(str2), null));
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                String m897d = atm.m897d("B1DCA1E397F9B1E2A1D797CEB1D2A1D297C4B1D8A1EC97C7B1E2A1ED97FAB1E0A1D097C0B1E1A1E397FAB1E1A1ED97CFB1DAA1D097C2");
                while (true) {
                    switch (m897d.hashCode() ^ (-1428224067)) {
                        case -1769466804:
                            if (jSONObject.getInt(C0052e.m1418a(new byte[]{-44, -91, -19, -54, 2}, new byte[]{-96, -54, -103, -85, 110, -72, -115, -105})) <= 0) {
                                m897d = atm.m897d("B1DFA1ED97FDB1DEA1E397F9B1D6A1D997C7B1DEA1E297F9B1E1A1E297CEB1E2");
                                break;
                            } else {
                                m897d = atm.m897d("B1D8A1EE97FCB1D8A1D997F0B1E2A1E397C3B1DEA1E297C2B1E0A1D597C3B1E3A1D197FDB1DFA1D197C0B1E2A1D097FAB1D6");
                                break;
                            }
                        case -1659682771:
                            JSONArray jSONArray2 = new JSONArray(jSONObject.getString(C0052e.m1418a(new byte[]{-42, 120, -122, 84}, new byte[]{-70, 17, -11, 32, -3, 11, -20, -34})));
                            int i = 0;
                            while (true) {
                                int i2 = i;
                                String m897d2 = atm.m897d("B1D2A1E997F8B1D1A1D797FDB1DCA1D297C4B1D2A1D097FFB1E2A1D597C1B1D2A1E397C4B1E3A1D397FAB1E1A1D497FEB1E0A1EF97FA");
                                while (true) {
                                    switch (m897d2.hashCode() ^ 1012096777) {
                                        case -1807786816:
                                            m897d2 = i2 < jSONArray2.length() ? atm.m897d("B1DBA1D397C4B1E2A1EC97C1B1E6A1ED97FDB1E0A1E997C0B1D2A1EF97C0B1D6A1D597CEB1E5A1EF97C0B1E2A1D497C3B1E0A1D997C7B1E0") : atm.m897d("B1D1A1EC97CEB1DDA1DE97FDB1E2A1D797F9B1D2A1ED97FFB1EDA1D297C3B1E2A1E297F3B1E6A1D297FFB1ECA1ED");
                                        case -583064987:
                                            m897d2 = atm.m897d("B1ECA1ED97F0B1DFA1D397FEB1E2A1EF97F0B1DFA1D397C0B1DEA1D397F0B1E0A1D997F3B1DBA1ED97F0B1E6A1D797C0B1DFA1D097CEB1E1A1D2");
                                        case -521753033:
                                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                                            String string = jSONObject3.getString(C0052e.m1418a(new byte[]{-119, 17}, new byte[]{-32, 117, 9, -96, -57, 96, 117, -41}));
                                            String string2 = jSONObject3.getString(C0052e.m1418a(new byte[]{-21, 102, -126, 113}, new byte[]{-123, 7, -17, 20, -97, -122, 78, -29}));
                                            String string3 = jSONObject3.getString(C0052e.m1418a(new byte[]{-50, 101, 119}, new byte[]{-66, 12, 20, -15, -5, -60, -18, 82}));
                                            String m897d3 = atm.m897d("B1DEA1DD97C0B1DAA1D397F9B1D1A1D597CEB1DEA1EC97F4B1E3A1D197FA");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ (-1610807707)) {
                                                    case -431852033:
                                                        m897d3 = !TextUtils.isEmpty(string3) ? atm.m897d("B1D1A1D397F4B1E1A1D197C7B1E0A1D997F9B1DCA1EE97C0B1E2A1D997F4B1DBA1D197CFB1E5A1DD97C1B1E2A1ED97FCB1DEA1DD97C2B1E1A1E9") : atm.m897d("B1DBA1E397F8B1ECA1EC97F4B1E6A1D497FDB1E5A1EF97FDB1E2A1D297C3B1E3A1D197FCB1E2A1DE97C4B1D8");
                                                    case 206054953:
                                                        String m897d4 = atm.m897d("B1E2A1D597F3B1EDA1EF97F4B1D2A1E297FAB1DDA1E397FCB1E2A1D397C4B1DFA1D397C0B1DDA1D197F0B1E2A1D997F3B1DFA1ED97F0B1E3A1DD");
                                                        while (true) {
                                                            switch (m897d4.hashCode() ^ (-287806456)) {
                                                                case -1238182788:
                                                                    break;
                                                                case -128519598:
                                                                    m897d4 = atm.m897d("B1DAA1E997F9B1E2A1ED97F8B1DEA1D797FCB1E6A1D397FCB1D2A1DD97C4B1E2");
                                                                case -67546941:
                                                                    string3 = f1073h + string3;
                                                                    break;
                                                                case 303555919:
                                                                    m897d4 = !string3.startsWith(C0052e.m1418a(new byte[]{-55, 69, -119, -104}, new byte[]{-95, 49, -3, -24, 85, 15, Byte.MAX_VALUE, -7})) ? atm.m897d("B1E5A1E997C2B1E3A1D597C3B1D2A1E997CEB1E0A1EE97F9B1E2A1D197F0B1DCA1ED97C2B1DDA1E997C0B1DEA1D097C1B1D8A1D397FCB1DCA1E397C0B1E2") : atm.m897d("B1EDA1EA97C4B1E2A1DD97FEB1E1A1D297F9B1E2A1D197FAB1DFA1ED97F9B1E1A1EE97F9B1D2A1D3");
                                                            }
                                                        }
                                                        break;
                                                    case 545179147:
                                                        break;
                                                    case 1951749131:
                                                        m897d3 = atm.m897d("B1E0A1E997F8B1DDA1D397C7B1D8A1E297F4B1DFA1DE97F0B1D2A1D497FCB1ECA1DE97C4B1E2A1E397C2B1E5");
                                                }
                                            }
                                            JSONObject jSONObject4 = new JSONObject();
                                            jSONObject4.put(C0052e.m1418a(new byte[]{-80, -107, 43, 20, 83, 17}, new byte[]{-58, -6, 79, 75, 58, 117, -93, -124}), string);
                                            jSONObject4.put(C0052e.m1418a(new byte[]{-117, -52, -12, 16, -30, 18, 108, -88}, new byte[]{-3, -93, -112, 79, -116, 115, 1, -51}), string2);
                                            jSONObject4.put(C0052e.m1418a(new byte[]{96, -8, 109, -116, -83, 25, -79}, new byte[]{22, -105, 9, -45, -35, 112, -46, -5}), string3);
                                            jSONObject4.put(C0052e.m1418a(new byte[]{-34, 124, 119, -103, -94, -60, 119, 63, -38, 120, 96}, new byte[]{-88, 19, 19, -58, -48, -95, 26, 94}), "");
                                            jSONArray.put(jSONObject4);
                                            i = i2 + 1;
                                            break;
                                        case 1657010573:
                                            break;
                                    }
                                }
                            }
                            break;
                        case -377783657:
                            break;
                        case 752646963:
                            m897d = atm.m897d("B1D2A1D097FFB1DFA1D397FAB1E0A1D797F9B1E2A1D397C0B1DCA1ED97F9B1DAA1EF97C0B1DBA1EC97FCB1E0A1D597C7B1EDA1E997C1B1DA");
                            break;
                    }
                }
                jSONObject2.put(C0052e.m1418a(new byte[]{123, 73, -77, 32}, new byte[]{23, 32, -64, 84, 39, 80, -53, -55}), jSONArray);
                return jSONObject2.toString();
            } catch (Exception e) {
                e = e;
                SpiderDebug.log(e);
                return "";
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
