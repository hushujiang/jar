package com.github.catvod.spider.merge.p044k;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.q */
/* loaded from: classes.dex */
public final class C0602q extends Dora {

    /* renamed from: i */
    private static final String f1128i;

    /* renamed from: j */
    private static String f1129j;

    /* renamed from: b */
    protected JSONObject f1130b;

    /* renamed from: c */
    protected JSONObject f1131c;

    /* renamed from: d */
    protected Pattern f1132d = Pattern.compile(C0052e.m1418a(new byte[]{96, 35, -36, 28, 91, 112, -25, 69, 96, 125, -17, 28, 4, 32, -71, 72, 59, 56, -33}, new byte[]{79, 85, -77, 120, 47, 9, -105, 32}));

    /* renamed from: e */
    protected Pattern f1133e = Pattern.compile(C0052e.m1418a(new byte[]{-51, 45, -89, -1, -37, 68, 107, 113, -117, 55, -25, -77, -29, 69, 52, 57, -52, 51, -68, -10, -45}, new byte[]{-30, 91, -56, -101, -65, 33, 31, 16}));

    /* renamed from: f */
    protected Pattern f1134f = Pattern.compile(C0052e.m1418a(new byte[]{-13, -116, -118, -54, -65, -103, -16, 98, -13, -46, -71, -3, -28, -36, -65, 115, -88, -105, -119}, new byte[]{-36, -6, -27, -82, -49, -11, -111, 27}));

    /* renamed from: g */
    protected Pattern f1135g = Pattern.compile(C0052e.m1418a(new byte[]{-1, 55, -32, Byte.MAX_VALUE, -12, 62, -68, -30, -1, 29, -21, 48, -86, 123, -2, -72, -3, 108, -94, 54, -81, 10, -73, -66, -7, 108, -94, 54, -87, 62, -89, -8, -68}, new byte[]{-48, 65, -113, 27, -121, 86, -45, -107}));

    /* renamed from: h */
    private final Pattern f1136h;

    static {
        String m897d = atm.m897d("B1D6A1E997CEB1E2A1ED97F0B1E2A1D597F0B1ECA1ED97C3B1DDA1D097C0B1E2A1D397F0B1DFA1D997FD");
        while (true) {
            switch ((m897d.hashCode() ^ 339) ^ 1040872467) {
                case -512622916:
                    C0052e.m1418a(new byte[]{123, -19, -98, 56, 66, 116, 121, -38, 34, -18, -97}, new byte[]{12, -102, -23, 22, 46, 19, 0, -93});
                    m897d = atm.m897d("B1E0A1D597F4B1D1A1DD97FCB1D6A1D597C4B1E2A1EF97F0B1DAA1E997F8B1E6A1DE97F4B1E0A1D397C7B1D2");
                    break;
                case 600086115:
                    f1128i = C0052e.m1418a(new byte[]{-66, 72, 10, 120, 110, -38, 32, -99, -95, 75, 9, 38, 113, -121, 118, -53, -8, 74, 23, 120}, new byte[]{-42, 60, 126, 8, 29, -32, 15, -78});
                    m897d = atm.m897d("B1E1A1E997CFB1DFA1EC97F9B1ECA1ED97FFB1E2A1E297FFB1DCA1EA97C2B1D8A1D197FD");
                    break;
                case 2023244172:
                    return;
                case 2030227341:
                    f1129j = "";
                    m897d = atm.m897d("B1E5A1EC97C7B1E6A1EF97C4B1E2A1E397C1B1E3A1EE97F9B1ECA1ED97F9B1E6A1E397C4B1E2A1EC97F0B1DEA1EC97C7B1DEA1D297C7B1D6A1EA");
                    break;
            }
        }
    }

    public C0602q() {
        Pattern.compile(C0052e.m1418a(new byte[]{-42, -8, -43, -112, -46, 119, 93, -105, -55, -2, -121, -115, -111, 48, 104, -83, -45, -59, -12, -19, -101, 39, 26, -127, -52, -8, -34, -43, -61}, new byte[]{-96, -103, -89, -80, -79, 24, 51, -15}));
        Pattern.compile(C0052e.m1418a(new byte[]{-97, 92, 19, 104, -45, -100, 97, 17, -55, 0, 65, 111, -114, -75, 81, 17, -75, 110, 60, 98, -103, -57, 42}, new byte[]{-23, 61, 97, 72, -90, -18, 13, 98}));
        this.f1136h = Pattern.compile(C0052e.m1418a(new byte[]{-66, 121, 51, 88, 78, -56, -41, 104, -74, 123, 47, 66, 18, -108, -112, 36, -66, 121, 50, 66, 0, -109}, new byte[]{-106, 70, 15, 101, 59, -70, -69, 27}));
    }

    /* renamed from: a */
    protected final HashMap<String, String> m263a(String str) {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1E6A1ED97F8B1EDA1D097C2B1E2A1D297CFB1D2A1EA97C4B1DFA1D197F9B1D1A1D3");
        while (true) {
            switch ((m897d.hashCode() ^ 222) ^ (-1510792626)) {
                case -1682432566:
                    hashMap.put(C0052e.m1418a(new byte[]{71, 33, -49, -120, 41, 44}, new byte[]{6, 66, -84, -19, 89, 88, 81, 61}), C0052e.m1418a(new byte[]{-41, -91, -31, -124, -107, -7, -13, 100, -49, -20, -8, Byte.MIN_VALUE, -54, -3, -18, 106, -62, -76, -16, -97, -44, -66, -1, 97, -41, -83, -11, -37, -62, -4, -21, 37, -62, -80, -23, -100, -45, -14, -26, 125, -54, -81, -9, -33, -62, -4, -21, 50, -46, -3, -87, -34, -125, -67, -18, 100, -62, -89, -4, -33, -51, -12, -27, 121, -113, -22, -74, -38, -127, -32, -70, 57, -115, -8}, new byte[]{-93, -64, -103, -16, -70, -111, -121, 9}));
                    m897d = atm.m897d("B1D2A1EC97F0B1E2A1ED97C7B1DFA1D097F8B1ECA1D197C2B1DCA1ED97C0B1DCA1E997C0B1DBA1DE97CFB1ECA1DD97C0B1E2");
                    break;
                case -1168254414:
                    m897d = atm.m897d("B1E3A1D597C7B1D1A1EF97F9B1E3A1DD97F8B1D6A1D797F0B1E2A1EE97C1B1DFA1ED");
                    break;
                case -1092202081:
                    String m897d2 = atm.m897d("B1E2A1EC97CFB1DFA1D097F9B1DBA1D597C4B1D8A1EA97CEB1E2A1D197F0B1D2A1D297F8B1D1A1DD97F9B1DBA1ED97C1B1E5A1D797F0B1E3A1D5");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-2119799738)) {
                            case -1988352764:
                                m897d2 = atm.m897d("B1E3A1EC97F8B1DAA1ED97FCB1DEA1D297CEB1E2A1EE97F9B1DBA1ED97CFB1EDA1E297C7B1ECA1E997F8B1E5A1D2");
                            case 1284410698:
                                m897d = atm.m897d("B1DEA1DD97C4B1E2A1DE97FCB1DAA1DD97F3B1DBA1ED97FCB1ECA1DD97C0B1D2A1EA97CFB1EDA1D197C7");
                                continue;
                            case 1386017905:
                                m897d = atm.m897d("B1DDA1DD97C2B1DEA1DE97FEB1E5A1D397FFB1E1A1DD97C7B1E2A1D097F0B1D6A1D3");
                                continue;
                            case 2138383460:
                                m897d2 = f1129j.length() > 0 ? atm.m897d("B1E0A1D097FDB1E2A1EE97F3B1DCA1ED97CFB1E2A1DD97FAB1ECA1E397C0B1E1A1D497F9B1E2A1D497FEB1DB") : atm.m897d("B1DAA1D597FDB1E2A1D797FCB1E3A1E397C7B1DFA1ED97F0B1D6A1E397C0B1E0A1D397C4B1E2A1D797FFB1DAA1D797FEB1DEA1E997CEB1ECA1EA97C7B1DA");
                        }
                    }
                    break;
                case -1082410200:
                    m897d = atm.m897d("B1ECA1D297F8B1D6A1EF97CFB1E2A1D297FDB1E2A1DE97CFB1DFA1D997FFB1D2A1E997FEB1DBA1D397FFB1D2A1E397C0");
                    break;
                case -660828105:
                    hashMap.put(C0052e.m1418a(new byte[]{-124, 67, 22, 21, 40, -59, -96, 5, -65, 68}, new byte[]{-47, 48, 115, 103, 5, -124, -57, 96}), C0052e.m1418a(new byte[]{-88, 124, -9, 73, 48, 57, 111, 3, -48, 61, -67, 0, 116, 24, 111, 79, -116, 125, -7, 79, 47, 61, 53, 12, -84, 125, -7, 69, 48, 117, 67, 77, -122, 51, -62, 115, 124, 13, 46, 29, -43, 76, -68, 21, 3, 98, 39, 12, -92, 99, -3, 76, 57, 2, 107, 78, -82, 122, -7, 15, 105, 102, 57, 2, -42, 37, -83, 8, 23, 29, 90, 97, -87, 63, -83, 76, 53, 62, 107, 12, -94, 118, -18, 75, 51, 124, 46, 111, -115, 97, -30, 77, 57, 122, 55, 29, -53, 35, -93, 20, 104, 98, 60, 2, -44, 34, -71, 0, 15, 52, 104, 77, -105, 122, -94, 21, 111, 98, 32, 31, -45}, new byte[]{-27, 19, -115, 32, 92, 85, 14, 44}));
                    m897d = atm.m897d("B1D6A1D197FAB1D1A1EF97F0B1E2A1D597FAB1E5A1D397F9B1DBA1D597CEB1E2A1D197C3B1DB");
                    break;
                case -294558590:
                    String m897d3 = atm.m897d("B1EDA1ED97FFB1E6A1ED97C0B1E2A1DD97C0B1DFA1ED97C4B1DBA1D497C0B1D1A1ED97FDB1E2A1EA97C1B1E6A1ED97C2B1ECA1D497C0B1D8A1DD97C4");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-655117531)) {
                            case -93731351:
                                m897d3 = !TextUtils.isEmpty(str) ? atm.m897d("B1EDA1D297F9B1E2A1ED97C7B1DCA1D297FEB1DFA1DE97CFB1EDA1EE97FAB1D2A1DD97F4B1D8A1EC97FCB1DAA1D597CEB1DBA1EC97FEB1DCA1ED") : atm.m897d("B1E6A1D997C7B1E0A1E397F3B1E0A1D097F0B1E5A1D797FAB1D1A1EE97C4B1D1A1EE97F0");
                            case 739709647:
                                m897d = atm.m897d("B1DBA1E297C7B1DCA1ED97F0B1ECA1EC97C0B1E2A1ED97F9B1DCA1ED97C7B1D2A1E997C4B1EDA1D2");
                                continue;
                            case 1235394762:
                                m897d3 = atm.m897d("B1E2A1EC97CEB1E2A1DE97F3B1D1A1D497C2B1EDA1D797C0B1D1A1E297F8B1ECA1ED");
                            case 1773137131:
                                m897d = atm.m897d("B1E1A1EE97C7B1E6A1D097C1B1E3A1D597FCB1D8A1D397C0B1E0A1D197C1");
                                continue;
                        }
                    }
                    break;
                case 766218334:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1DCA1D497C7B1DCA1D597FDB1E3A1D097FDB1E2A1D797F4B1D1A1EC97C1B1ECA1D497FEB1DCA1D397CFB1DCA1ED");
                    break;
                case 1169808345:
                    hashMap.put(C0052e.m1418a(new byte[]{-49, 82, 35, 80, 10, -33}, new byte[]{-94, 55, 87, 56, 101, -69, 108, 77}), C0052e.m1418a(new byte[]{110, -29, -113}, new byte[]{41, -90, -37, 92, -29, 86, -98, -75}));
                    m897d = atm.m897d("B1DEA1EC97CFB1E1A1D597CFB1E0A1E997FAB1DFA1E397CFB1E0A1E3");
                    break;
                case 1221516660:
                    hashMap.put(C0052e.m1418a(new byte[]{-74, -17, -11, 39, -7, 9, 98}, new byte[]{-28, -118, -109, 66, -117, 108, 16, 24}), str);
                    m897d = atm.m897d("B1E1A1EE97C7B1E6A1D097C1B1E3A1D597FCB1D8A1D397C0B1E0A1D197C1");
                    break;
                case 1317492709:
                    hashMap.put(C0052e.m1418a(new byte[]{-29, -124, -43, 98, 40, -81}, new byte[]{-96, -21, -70, 9, 65, -54, -68, -33}), f1129j);
                    m897d = atm.m897d("B1DDA1DD97C2B1DEA1DE97FEB1E5A1D397FFB1E1A1DD97C7B1E2A1D097F0B1D6A1D3");
                    break;
                case 1379245421:
                    return hashMap;
            }
        }
    }

    /* renamed from: b */
    protected final String m262b(String str) {
        String str2 = null;
        String str3 = null;
        TreeMap treeMap = null;
        StringBuilder sb = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        StringBuilder sb2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str7 = null;
        String str8 = null;
        StringBuilder sb3 = null;
        String str9 = null;
        List list = null;
        Iterator it = null;
        String str10 = null;
        StringBuilder sb4 = null;
        String str11 = null;
        String str12 = null;
        String m897d = atm.m897d("B1E0A1D197F4B1E3A1EF97F3B1DEA1D397FFB1DEA1DD97C0B1E2A1EC97C1B1DEA1E297C1B1DFA1ED97FFB1DAA1D497C0");
        while (true) {
            switch ((m897d.hashCode() ^ 618) ^ 643003856) {
                case -1931875486:
                    it = list.iterator();
                    m897d = atm.m897d("B1DAA1E997FAB1D8A1D297C0B1E2A1EC97F9B1DDA1D297FCB1DEA1E397CEB1DDA1ED97FAB1D8A1EF97C2B1ECA1ED97F9B1DAA1DD");
                    break;
                case -1833798802:
                    String m897d2 = atm.m897d("B1D8A1D497FDB1DCA1ED97C1B1DCA1DD97F3B1D6A1EA97FAB1EDA1EF");
                    while (true) {
                        switch (m897d2.hashCode() ^ 2105330921) {
                            case -1270875971:
                                m897d2 = atm.m897d("B1DBA1D597FCB1E1A1D797C0B1E5A1E297F0B1E2A1D497FAB1E6A1ED97F4B1E3A1D397CEB1E3A1D597C3B1D8A1DD97C0");
                            case -1044474461:
                                m897d2 = i3 <= str6.length() + (-1) ? atm.m897d("B1DEA1EE97F3B1D1A1ED97CFB1E3A1D597F9B1E2A1D297C3B1DBA1D497F3B1E5A1D797FEB1DCA1DE97C1") : atm.m897d("B1E0A1EC97FAB1D8A1EE97FFB1E1A1D797F3B1E6A1EC97FEB1DDA1D4");
                            case -5454043:
                                m897d = atm.m897d("B1EDA1DE97FFB1DFA1E297F0B1E2A1DE97C4B1D8A1EE97FAB1D8A1EF97FEB1DD");
                                continue;
                            case 1875172547:
                                m897d = atm.m897d("B1DFA1D497FEB1DFA1EE97C2B1D2A1E397C0B1DBA1E297F4B1DDA1EE97F0B1E5A1D497C0B1DBA1EC97FDB1E2A1DD97FDB1E0");
                                continue;
                        }
                    }
                    break;
                case -1828758080:
                    sb4.append(f1129j);
                    m897d = atm.m897d("B1E0A1E297FFB1DAA1D197F4B1E6A1D797FFB1D1A1EF97FDB1E2A1DE97FFB1E6");
                    break;
                case -1788625065:
                    sb3.append(str5);
                    m897d = atm.m897d("B1E2A1ED97F4B1D1A1DD97FFB1E2A1E297C0B1E2A1ED97F9B1DBA1E997C0B1DBA1D597FCB1DAA1E997C0B1E2A1DD97C4B1E1A1EE97C3B1DD");
                    break;
                case -1782922699:
                    str3 = C0574b.m307f(str, m263a(str2), null);
                    m897d = atm.m897d("B1DFA1EE97F9B1E2A1D097C1B1DDA1DD97F0B1D2A1DD97CFB1ECA1EE97F9B1E6A1DE97FFB1D8A1D797CEB1E3A1D097F3B1E2");
                    break;
                case -1773720587:
                    m897d = atm.m897d("B1D1A1E997FAB1DDA1EE97CEB1ECA1EE97C1B1D1A1D497CEB1DBA1D197FDB1E2A1DE97C7B1E2A1ED97CEB1E3A1ED97C0B1E0A1EA97C0B1E2A1E997CEB1ED");
                    str10 = (String) it.next();
                    break;
                case -1750345891:
                    str2 = f1128i;
                    m897d = atm.m897d("B1EDA1D597FEB1DCA1D197FFB1DFA1ED97F4B1DCA1EA97C1B1DCA1D397FFB1E2A1E397FDB1E5A1D497FAB1D6A1D197CEB1D2A1ED97C2B1ECA1D9");
                    break;
                case -1699889468:
                    m897d = atm.m897d("B1D8A1EC97C3B1DFA1E997FEB1D8A1D297FFB1E0A1D297C3B1DDA1D797F0B1E2A1EC97F3B1E2");
                    list = (List) treeMap.get(C0052e.m1418a(new byte[]{-19, -111, -104, -21, -49, -112, 81, -24, -9, -111}, new byte[]{-98, -12, -20, -58, -84, -1, 62, -125}));
                    break;
                case -1659210255:
                    sb3.append(str7);
                    m897d = atm.m897d("B1D1A1ED97C4B1E2A1D797C1B1EDA1D997F4B1DCA1EE97C4B1ECA1D297C4B1E1A1D997F4B1EC");
                    break;
                case -1653259007:
                    sb4.append(str10.split(C0052e.m1418a(new byte[]{-117}, new byte[]{-80, 119, -49, -79, 101, -23, 56, 11}))[0]);
                    m897d = atm.m897d("B1E2A1D097C0B1E2A1E997C0B1DEA1D597FEB1D8A1EA97F3B1DCA1ED97C0B1E0A1D197C3B1D8A1DD97C0");
                    break;
                case -1505754595:
                    i = 0;
                    m897d = atm.m897d("B1ECA1D497C4B1E2A1D797C0B1E6A1D397C1B1E6A1D097FAB1DEA1E997C7B1EC");
                    break;
                case -1425736808:
                    m897d = atm.m897d("B1E5A1D997FDB1E5A1E397C4B1E0A1D097C0B1E6A1D597CEB1ECA1D597FDB1E2A1D097F0B1E5A1EA97C3B1E3A1DD97C0B1E0");
                    str12 = str3;
                    break;
                case -1063811808:
                    String m897d3 = atm.m897d("B1E6A1D297C0B1E3A1DD97CEB1D8A1EF97FCB1D6A1D097FDB1E2A1D397FFB1D1A1EE97F3B1ECA1EF97CFB1E2");
                    while (true) {
                        switch (m897d3.hashCode() ^ 460732222) {
                            case -1298463422:
                                m897d = atm.m897d("B1E5A1D197FEB1E2A1D497F3B1ECA1ED97C3B1DAA1EF97C1B1D1A1ED97C0B1DEA1D197FEB1E2A1E997C2B1DCA1ED97FCB1ECA1ED97C3B1E6A1EE97C2B1D6A1D7");
                                continue;
                            case 354636199:
                                m897d = atm.m897d("B1D8A1E397FDB1E2A1D097FCB1D8A1ED97FFB1DAA1E297F8B1E2A1D297C0B1DFA1ED97C2B1DBA1D097C0B1DFA1D397C0B1E1A1ED97C0");
                                continue;
                            case 356490015:
                                m897d3 = str3.contains(C0052e.m1418a(new byte[]{-7, 2, -50, 44, -76, -49, -1, -99, -109, 81, -16, 72}, new byte[]{31, -71, 95, -55, 62, 103, 22, 55})) ? atm.m897d("B1DAA1D297F0B1E2A1D197C0B1D2A1D397FFB1D8A1EE97FAB1E2A1EE97C1B1D6A1D797F3B1E6A1ED97FDB1DBA1D297C0B1D6A1DD97C0B1DCA1E297FF") : atm.m897d("B1E3A1ED97FCB1E3A1EF97F3B1E3A1E397FDB1DFA1D097FEB1E2A1D197C0B1E2A1EE97FFB1E2A1D097C1B1E6A1ED97F8B1DCA1E297CEB1ECA1D5");
                            case 756991603:
                                m897d3 = atm.m897d("B1D6A1DD97FDB1E2A1D797F4B1DEA1EC97F3B1DEA1EE97FEB1E2A1ED97C3B1ECA1D597CEB1D1A1D297F4B1D1A1E997FFB1E2A1DD");
                        }
                    }
                    break;
                case -1023289456:
                    m897d = atm.m897d("B1E5A1D197FEB1E2A1D497F3B1ECA1ED97C3B1DAA1EF97C1B1D1A1ED97C0B1DEA1D197FEB1E2A1E997C2B1DCA1ED97FCB1ECA1ED97C3B1E6A1EE97C2B1D6A1D7");
                    str12 = str11;
                    break;
                case -972962220:
                    sb4 = new StringBuilder();
                    m897d = atm.m897d("B1DCA1E997FFB1E2A1DD97C2B1DFA1DE97FCB1DCA1ED97CEB1E5A1D397C4B1DAA1D197FDB1E0A1ED97CFB1D2");
                    break;
                case -967853076:
                    return str12;
                case -946345424:
                    sb = C0424a.m635a(str2);
                    m897d = atm.m897d("B1E2A1D997C1B1E2A1EA97C0B1E2A1E297C1B1D1A1ED97F9B1DDA1EF97CFB1E1A1E397C0B1D2A1DE97C4B1E2");
                    break;
                case -761499047:
                    String m897d4 = atm.m897d("B1D8A1EA97CEB1E2A1D297FAB1E2A1ED97FDB1D1A1D997C4B1E6A1ED97FAB1ECA1EA97F8B1E5A1D297FDB1ECA1D597CEB1DEA1E997FF");
                    while (true) {
                        switch (m897d4.hashCode() ^ 636220524) {
                            case -2146349596:
                                m897d = atm.m897d("B1DAA1EF97F9B1E2A1EC97FEB1DBA1ED97F9B1E5A1D997C7B1E1A1D297C1B1E6A1D097C0");
                                continue;
                            case -1889988395:
                                m897d = atm.m897d("B1DAA1EF97F8B1D6A1E997C0B1E2A1EC97C0B1D2A1D397C0B1E0A1E397F0B1E2A1D197C3B1D6A1E397CFB1EDA1EA97C4");
                                continue;
                            case -249956243:
                                m897d4 = atm.m897d("B1E1A1D197FDB1E2A1E997FDB1E3A1E997FEB1DFA1EE97C4B1E2A1EC97F4B1E6");
                            case -201620973:
                                m897d4 = it.hasNext() ? atm.m897d("B1E5A1D797C0B1D6A1EF97F9B1E2A1DE97F0B1DDA1E397CEB1D8A1D997FDB1D6A1D397C4B1E2") : atm.m897d("B1E3A1ED97C1B1E3A1D097F3B1E2A1D597C2B1DEA1D197FEB1E6A1EF97F0B1E2A1D797F9B1D2A1D597FAB1E2A1ED97C0B1E0A1E397C0");
                        }
                    }
                    break;
                case -686866730:
                    i2 = i3 + 1;
                    m897d = atm.m897d("B1DBA1D097C0B1E2A1D197F9B1E2A1D297F9B1DEA1EF97C3B1E6A1D197CEB1E2A1D997C2B1E3A1EE97FCB1DFA1EF97C3B1DE");
                    break;
                case -632407587:
                    sb3.append(C0052e.m1418a(new byte[]{11, 63, 73, 116, -68}, new byte[]{45, 84, 44, 13, -127, 33, 120, 66}));
                    m897d = atm.m897d("B1ECA1D397F9B1DEA1EF97C4B1E2A1D597F8B1E2A1D597F0B1DCA1ED97F8B1E5A1D597FEB1D2A1D4");
                    break;
                case -594328110:
                    m897d = atm.m897d("B1EDA1EC97F9B1DAA1D197CEB1D6A1D397F0B1DDA1E397FAB1D1A1D197C7");
                    break;
                case -539230171:
                    str6 = C0277c.m1073b(str4, C0052e.m1418a(new byte[]{104, Byte.MIN_VALUE, -36, -40, -119, 20, 9, -8, 37, -126, -62, -52, -47, 95, 90, -91, Byte.MAX_VALUE, -126, -62, -52}, new byte[]{64, -65, -32, -27, -1, 117, 101, -115}));
                    m897d = atm.m897d("B1DFA1DD97C4B1E1A1D597C7B1E2A1E397F4B1E2A1E997C4B1E0A1D497CE");
                    break;
                case -97651376:
                    sb3.append(C0052e.m1418a(new byte[]{31, 60, -77, 124, 33, 66, 96}, new byte[]{57, 74, -46, 16, 84, 39, 93, 35}));
                    m897d = atm.m897d("B1D6A1D797FEB1E2A1D297F9B1DBA1ED97C1B1E3A1DE97C2B1ECA1E397C0B1ECA1ED97F0B1D2A1D997C7B1DBA1D797C7B1ECA1D497FEB1EDA1E397F4");
                    break;
                case 27438868:
                    m897d = atm.m897d("B1DBA1E297FFB1D1A1D297F4B1D2A1D097C3B1EDA1E297FFB1E3A1D797CEB1DEA1D197F4");
                    break;
                case 113550534:
                    sb2.append(Integer.parseInt(String.valueOf(Character.codePointAt(str6, i3))) + 1);
                    m897d = atm.m897d("B1ECA1D197CFB1DEA1DE97FEB1DFA1E997FDB1E2A1EF97C0B1DEA1D097FCB1ECA1ED97F4B1E5A1DD97C2B1E6A1E9");
                    break;
                case 455907554:
                    sb3.append(str9);
                    m897d = atm.m897d("B1E1A1EA97F4B1DDA1DE97C4B1DFA1EC97C3B1DEA1D997FDB1DDA1D097FFB1E2");
                    break;
                case 538231630:
                    m897d = atm.m897d("B1DFA1D197FCB1DEA1EC97C1B1D2A1EA97FCB1E2A1D197F3B1D6A1EC97FEB1DDA1ED97C2B1D2A1D297C0B1D8A1EC97F9");
                    i3 = i2;
                    break;
                case 715769514:
                    str5 = C0277c.m1073b(str4, C0052e.m1418a(new byte[]{26, 123, -37, 32, -78, 24, 70, 37, 16, 109, -55, 55, -26, 85, 0, 37, 16, 109}, new byte[]{50, 68, -25, 29, -39, 125, 63, 24}));
                    m897d = atm.m897d("B1D1A1D197F0B1E2A1EF97F8B1DBA1ED97C1B1E5A1ED97FDB1E3A1EC97C4B1DFA1D597C7B1E3A1E2");
                    break;
                case 1005525136:
                    str7 = C0652d.m150a(sb2.toString());
                    m897d = atm.m897d("B1E2A1E997C0B1E2A1E297CEB1D2A1E297FAB1E6A1E397CEB1ECA1ED97F0B1E0A1E397C0");
                    break;
                case 1317197630:
                    sb2 = new StringBuilder();
                    m897d = atm.m897d("B1DAA1D097F9B1E2A1D597F3B1D8A1E397F9B1E6A1ED97FFB1ECA1D397C0B1D2A1DE97F9B1E2A1D797C4B1D2A1ED");
                    break;
                case 1375066956:
                    C0574b.m307f(sb3.toString(), m263a(str9), treeMap);
                    m897d = atm.m897d("B1D2A1E997C4B1DAA1D197C4B1DCA1E997C3B1D8A1D597F0B1D1A1EA97CFB1DEA1D097C0B1E2A1D197CFB1ECA1ED97C0B1ECA1E397C0B1E2A1D797F0B1E2");
                    break;
                case 1419210699:
                    f1129j = sb4.toString();
                    m897d = atm.m897d("B1DBA1D497C0B1E2A1D397FEB1DFA1ED97F4B1D8A1D797C2B1D2A1ED97F0B1E5A1EA97F0B1ED");
                    break;
                case 1425587516:
                    m897d = atm.m897d("B1DAA1E997FAB1D8A1D297C0B1E2A1EC97F9B1DDA1D297FCB1DEA1E397CEB1DDA1ED97FAB1D8A1EF97C2B1ECA1ED97F9B1DAA1DD");
                    break;
                case 1447845487:
                    sb3.append(str8);
                    m897d = atm.m897d("B1D1A1D397FDB1EDA1E397C4B1E2A1D997F9B1E3A1D797FAB1DCA1DD97F9B1E2A1D997FCB1E2A1ED97F3B1D2A1E997C0B1E3A1EC97FDB1E2A1D597F0B1D1");
                    break;
                case 1468769074:
                    str11 = C0574b.m307f(str, m263a(f1128i), treeMap);
                    m897d = atm.m897d("B1DDA1EF97FAB1DFA1EF97F8B1DBA1E397FDB1E0A1D197FEB1E5A1D097C0");
                    break;
                case 1519769970:
                    str4 = C0574b.m307f(sb.toString(), m263a(str2), null);
                    m897d = atm.m897d("B1DEA1EE97C2B1EDA1D197CFB1E1A1DE97F0B1E2A1E297FAB1DBA1DE97C3B1E0A1ED97C2B1DFA1ED");
                    break;
                case 1550041062:
                    treeMap = new TreeMap();
                    m897d = atm.m897d("B1DDA1D497FEB1E2A1D597C0B1D8A1EA97C4B1E5A1D597CEB1DAA1D797F3B1DCA1E397FAB1DBA1ED97C0B1DFA1E297F9B1E1");
                    break;
                case 1595974444:
                    m897d = atm.m897d("B1D6A1D297F0B1D1A1D097C0B1EDA1EF97C0B1DCA1E297FFB1DAA1DE97C4B1DDA1E397F0B1DDA1D797C7B1EDA1E297F0B1DEA1DD97CE");
                    i3 = i;
                    break;
                case 1615249470:
                    list.getClass();
                    m897d = atm.m897d("B1EDA1E297F3B1E5A1EA97FDB1DAA1D497C0B1E2A1E297C2B1EDA1E297F8B1E0");
                    break;
                case 1715364160:
                    sb4.append(C0052e.m1418a(new byte[]{-62}, new byte[]{-7, 34, -53, -38, 109, 30, 25, 23}));
                    m897d = atm.m897d("B1E1A1EC97C0B1E3A1D197F4B1D2A1D197C1B1D1A1D497FCB1D2A1E397F8B1E6A1D497CFB1E3A1D297FEB1E2A1D397CFB1DCA1ED97CFB1ECA1D497C0");
                    break;
                case 1804495419:
                    str9 = f1128i;
                    m897d = atm.m897d("B1DAA1D197C7B1ECA1E297F0B1EDA1D097FAB1E1A1D997FFB1D2A1E397C4B1E2");
                    break;
                case 1908964008:
                    m897d = atm.m897d("B1D6A1D297F0B1D1A1D097C0B1EDA1EF97C0B1DCA1E297FFB1DAA1DE97C4B1DDA1E397F0B1DDA1D797C7B1EDA1E297F0B1DEA1DD97CE");
                    break;
                case 1926961028:
                    sb.append(C0277c.m1073b(str3, C0052e.m1418a(new byte[]{-115, -11, -21, -71, -107, 115, -90, -108, -121, -29, -7, -82, -39, 41, -6, -108, -121, -29}, new byte[]{-91, -54, -41, -124, -26, 1, -59, -87})));
                    m897d = atm.m897d("B1DFA1DE97F0B1E2A1E997C2B1E2A1EE97FFB1E6A1D397C4B1DCA1ED97FCB1DCA1D297CEB1E3A1EC97FCB1DFA1D497C0B1D6A1E297C0B1E2");
                    break;
                case 1955475462:
                    sb3 = new StringBuilder();
                    m897d = atm.m897d("B1E2A1ED97FDB1E2A1D197FEB1E0A1EA97F9B1EDA1D597FCB1D8A1EC97C4B1D8A1ED97FFB1D2A1E397FDB1DEA1EA97F8B1DFA1ED");
                    break;
                case 2087689528:
                    str8 = C0277c.m1073b(str4, C0052e.m1418a(new byte[]{104, 59, 103, 64, 63, 66, 114, 101, 52, 88, 8, 95, 117, 48, 70, 43, 48, 108, 43, 33, 15, 71, 42, 40, Byte.MAX_VALUE, 57, 125, 22, 57, 21, 40, 34, 105}, new byte[]{64, 4, 91, 125, 92, 108, 21, 0}));
                    m897d = atm.m897d("B1E5A1D597C1B1E1A1ED97C4B1E2A1D497F8B1DCA1E397F3B1DDA1E397FCB1DC");
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i2;
        int i3;
        try {
            String m897d = atm.m897d("B1D1A1DE97F9B1E2A1D097F9B1D2A1EC97F8B1E6A1D397C3B1D6A1E397F9B1D6A1EA97FDB1DFA1ED97F8B1DBA1E397C0B1DBA1EE97C0B1D6A1E997F0");
            while (true) {
                switch (m897d.hashCode() ^ (-1493221549)) {
                    case -1108132739:
                        String m897d2 = atm.m897d("B1DDA1EE97C3B1D2A1D997CFB1E1A1EE97C0B1E2A1D097FDB1DDA1E297FFB1ECA1EC97CEB1D6A1ED97FEB1DD");
                        while (true) {
                            switch (m897d2.hashCode() ^ 17447632) {
                                case -1580798139:
                                    if (Integer.parseInt(str2.trim()) <= 1) {
                                        m897d2 = atm.m897d("B1DDA1D297CFB1D2A1D597C3B1D1A1E297C0B1E2A1ED97F4B1EDA1EA97CFB1DD");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1E2A1D397F0B1E2A1EE97FCB1DAA1D797F9B1DFA1D997FCB1E2A1D397F0B1DEA1D197FCB1ECA1D497FAB1ECA1ED97F4B1DDA1D7");
                                        break;
                                    }
                                case -542538960:
                                    i = Integer.parseInt(str2.trim());
                                    break;
                                case -176661267:
                                    m897d2 = atm.m897d("B1E6A1E397C4B1E2A1DE97C1B1E6A1ED97FEB1E5A1D397C0B1DAA1D097CEB1E2A1EF97F4B1DCA1D397FCB1E2A1ED");
                                    break;
                                case 228417300:
                                    break;
                            }
                        }
                        break;
                    case -386876931:
                        m897d = atm.m897d("B1DCA1DD97FEB1E2A1D197CFB1DDA1D197CEB1D8A1E997C7B1D8A1D497FFB1DCA1ED97F3B1DCA1EF97F4B1EDA1EF97F4B1D8A1E997C0B1ECA1ED97C1");
                        break;
                    case 255306579:
                        if (!TextUtils.isEmpty(str2)) {
                            m897d = atm.m897d("B1EDA1D097FDB1E2A1E297C4B1E2A1ED97C4B1DBA1ED97FFB1D6A1EF97FCB1E1A1EF97C1B1E0A1D497CEB1DBA1D397FAB1E2A1E397C0");
                            break;
                        } else {
                            m897d = atm.m897d("B1DBA1D197C7B1ECA1D197FAB1DAA1D797C4B1E2A1E997CEB1E2A1DE97F3B1E1");
                            break;
                        }
                    case 331079296:
                        break;
                }
            }
            i = 1;
            HashMap hashMap2 = new HashMap();
            hashMap2.put(C0052e.m1418a(new byte[]{-81, 34}, new byte[]{-58, 70, -12, 71, 58, -124, 26, -118}), str);
            hashMap2.put(C0052e.m1418a(new byte[]{-38, 43}, new byte[]{-86, 76, -106, 97, 41, 12, -58, -35}), "" + i);
            String m897d3 = atm.m897d("B1E3A1DD97FDB1ECA1E997C4B1E0A1ED97C3B1E5A1D097FCB1DDA1D097F9B1DEA1D797F0B1D1A1EE97F4B1DBA1EE97CFB1E2A1D497F4");
            while (true) {
                switch (m897d3.hashCode() ^ 1787097486) {
                    case -2042795859:
                        break;
                    case -1396118034:
                        String m897d4 = atm.m897d("B1E2A1D797F8B1DAA1EC97C7B1DAA1DD97FEB1E2A1D197F3B1E6A1ED97CFB1DDA1D497FDB1DEA1EC97FFB1DEA1D997FDB1E2A1D397FFB1D6");
                        while (true) {
                            switch (m897d4.hashCode() ^ 201212581) {
                                case -1972712742:
                                    if (hashMap.size() <= 0) {
                                        m897d4 = atm.m897d("B1DCA1D797F9B1E2A1D297C3B1ECA1D497CFB1E0A1E297F9B1DBA1ED97FAB1E1A1D9");
                                        break;
                                    } else {
                                        m897d4 = atm.m897d("B1D1A1D197C0B1E2A1DD97C2B1D2A1ED97FEB1ECA1D097FCB1DCA1E997C0B1DEA1D297FC");
                                        break;
                                    }
                                case -609331509:
                                    hashMap2.putAll(hashMap);
                                    break;
                                case 191538200:
                                    break;
                                case 958654284:
                                    m897d4 = atm.m897d("B1E0A1D397F9B1D8A1D497FFB1DEA1D997F9B1D6A1ED97FAB1D1A1D197C4B1DCA1D497FEB1EDA1DE97F4B1E2A1E297CEB1E2A1DE97C0");
                                    break;
                            }
                        }
                        break;
                    case -1160702860:
                        if (hashMap == null) {
                            m897d3 = atm.m897d("B1DFA1EA97C1B1DEA1DE97C3B1E2A1D997F4B1D2A1EE97F0B1E2A1EA97C4B1E2A1ED");
                            break;
                        } else {
                            m897d3 = atm.m897d("B1D6A1EC97FDB1E2A1D097F8B1DDA1D497FDB1E2A1E297C2B1D1A1D597FAB1DFA1EC97F3B1DBA1ED97FFB1ECA1ED97F9B1D2A1E397C0B1D1A1D797F9B1E2");
                            break;
                        }
                    case -115065734:
                        m897d3 = atm.m897d("B1E3A1D397FEB1E2A1D397F0B1DEA1D197CFB1DCA1D797FAB1D2A1ED97FCB1DCA1EC97FFB1E1A1DD97CEB1DEA1DE");
                        break;
                }
            }
            String m897d5 = atm.m897d("B1E0A1D797F9B1E2A1EA97F9B1DBA1ED97C4B1E1A1EA97FEB1DEA1E997C4B1E0A1E397CEB1E2");
            while (true) {
                switch (m897d5.hashCode() ^ (-1773733986)) {
                    case -1407634344:
                        m897d5 = atm.m897d("B1E1A1D797C4B1E2A1EC97C4B1DBA1D997F4B1EDA1E997F4B1E2A1D297C7B1DBA1D797CFB1E2A1ED97FCB1DBA1ED");
                        break;
                    case -1150705606:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-86, 78}, new byte[]{-61, 42, -125, -49, -74, -45, -47, Byte.MAX_VALUE})) != null) {
                            m897d5 = atm.m897d("B1E5A1EE97F0B1DCA1ED97C0B1E2A1E297CFB1DFA1EE97FEB1E0A1D597F0B1E2A1D997FFB1D2");
                            break;
                        } else {
                            m897d5 = atm.m897d("B1D2A1DD97FEB1E2A1E997C7B1D6A1D097F0B1E1A1D197FEB1DCA1EA97FA");
                            break;
                        }
                    case 1167705979:
                        str3 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-28, -120}, new byte[]{-115, -20, 49, -67, 14, 9, -126, -92}));
                        break;
                    case 1966576567:
                        str3 = "";
                        break;
                }
            }
            String m897d6 = atm.m897d("B1E6A1D497C4B1DAA1EA97C3B1DDA1DD97F0B1E2A1EC97F0B1DCA1ED97C2B1E3A1EA");
            while (true) {
                switch (m897d6.hashCode() ^ (-294466136)) {
                    case -1757614412:
                        m897d6 = atm.m897d("B1DEA1D097FDB1E2A1D597CFB1E2A1ED97F8B1E0A1DD97FCB1D8A1ED97C2B1DFA1D2");
                        break;
                    case -144065267:
                        str4 = "";
                        break;
                    case 262133025:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{19, 17, -103, 96}, new byte[]{114, 99, -4, 1, 104, Byte.MAX_VALUE, 51, -15})) != null) {
                            m897d6 = atm.m897d("B1ECA1E997FFB1E2A1E397FCB1E5A1D797FFB1E1A1E397FAB1E2A1ED97F4B1DCA1E997C0B1D6A1EC97F0B1E2A1D997C2B1E6A1D9");
                            break;
                        } else {
                            m897d6 = atm.m897d("B1E3A1D197C0B1E2A1EE97C1B1D2A1DD97FAB1DDA1ED97FDB1DDA1ED97C3B1E6A1D797C0B1DFA1D997FAB1D8A1D197CFB1E2A1E2");
                            break;
                        }
                    case 2011605585:
                        str4 = (String) hashMap2.get(C0052e.m1418a(new byte[]{117, 79, -86, 40}, new byte[]{20, 61, -49, 73, -49, -107, 49, -44}));
                        break;
                }
            }
            String m897d7 = atm.m897d("B1ECA1DE97C4B1DFA1DD97F8B1E1A1ED97C4B1DDA1D297CEB1E2A1D297F3B1D1A1D197CFB1E1");
            while (true) {
                switch (m897d7.hashCode() ^ (-1295967645)) {
                    case -1906748116:
                        m897d7 = atm.m897d("B1E3A1D197FEB1DEA1ED97FCB1ECA1EE97FFB1EDA1EE97FFB1DAA1EE97CEB1E2A1DD97FDB1EDA1D497F4B1E1A1EF97FEB1E2A1EE97C0B1E2");
                        break;
                    case 83808251:
                        str5 = "";
                        break;
                    case 303912687:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-41, 92}, new byte[]{-75, 37, -39, 68, 23, -47, -16, 42})) != null) {
                            m897d7 = atm.m897d("B1D2A1DE97C1B1DFA1EA97C2B1ECA1DD97CFB1DBA1D297C4B1E2A1DD97FFB1EDA1E997C4B1E3A1E997C7B1DD");
                            break;
                        } else {
                            m897d7 = atm.m897d("B1E0A1D497C4B1EDA1EF97C1B1E5A1EE97F4B1E5A1DE97FFB1E5A1E997C4B1E2A1D797FFB1DFA1D197FEB1DCA1ED");
                            break;
                        }
                    case 1558522213:
                        str5 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-125, -90}, new byte[]{-31, -33, 35, 17, -49, 103, -24, -34}));
                        break;
                }
            }
            String m897d8 = atm.m897d("B1DDA1E997C2B1DFA1EC97C4B1E2A1E297F9B1E5A1D397C4B1DDA1ED97C0B1E2A1D397C0B1E5A1D197FAB1E0A1D497FCB1ECA1DD97FFB1E2");
            while (true) {
                switch (m897d8.hashCode() ^ (-1990854267)) {
                    case -411998663:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-65, 79, -5, 31, -61}, new byte[]{-36, 35, -102, 108, -80, -83, 93, -37})) != null) {
                            m897d8 = atm.m897d("B1DBA1ED97C1B1E1A1EA97FDB1E2A1D397F4B1D1A1D397F9B1E6A1ED97F8B1E0A1E297C4B1E6A1D9");
                            break;
                        } else {
                            m897d8 = atm.m897d("B1D2A1D097FDB1EDA1EA97C1B1D2A1EA97C7B1E0A1E997C7B1D2A1D497FFB1EDA1D197FDB1E2");
                            break;
                        }
                    case 330028951:
                        str6 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-95, 2, 56, -14, -31}, new byte[]{-62, 110, 89, -127, -110, 53, Byte.MAX_VALUE, 50}));
                        break;
                    case 800199055:
                        str6 = "";
                        break;
                    case 1403880277:
                        m897d8 = atm.m897d("B1E3A1D097C7B1D6A1EA97F9B1E2A1EF97FEB1DDA1ED97C0B1DCA1D097C0B1D2A1D097FAB1E2A1D597FDB1D8A1D397F9B1E2A1D997C7B1D1");
                        break;
                }
            }
            String m897d9 = atm.m897d("B1ECA1D997CEB1E2A1D597C2B1D8A1ED97CEB1E6A1ED97C1B1E5A1EE97FEB1EDA1E9");
            while (true) {
                switch (m897d9.hashCode() ^ 1911457380) {
                    case 946707891:
                        m897d9 = atm.m897d("B1DBA1D497C0B1E2A1D397F3B1E3A1D097F3B1E6A1ED97CFB1DAA1E397F8B1DBA1D497CFB1ECA1D397C4B1ECA1D297C0");
                        break;
                    case 1089986029:
                        str7 = "";
                        break;
                    case 1398133796:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-9, -16, -120, 91}, new byte[]{-101, -111, -26, 60, 56, -101, 28, Byte.MIN_VALUE})) != null) {
                            m897d9 = atm.m897d("B1DFA1D397CEB1E2A1EC97CEB1E2A1D597C2B1DBA1E397C0B1EDA1EF97F8B1DBA1ED97CFB1E3A1EC97F3B1EDA1EC97FDB1D6A1E9");
                            break;
                        } else {
                            m897d9 = atm.m897d("B1DFA1D997F0B1E0A1D397CFB1E2A1D597C3B1E1A1EE97C1B1E2A1E397C4B1E0A1D997C1B1D1A1ED97FDB1D8A1D297F3B1D1A1EE");
                            break;
                        }
                    case 1780579928:
                        str7 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-117, 107, 77, 1}, new byte[]{-25, 10, 35, 102, 14, 57, 74, -57}));
                        break;
                }
            }
            String m897d10 = atm.m897d("B1DDA1DE97F9B1E2A1D497C3B1D6A1ED97CFB1D2A1ED97FDB1D8A1D397C0B1DBA1DE97FEB1E1A1EF97FCB1EDA1ED97F8B1E1A1D797C4");
            while (true) {
                switch (m897d10.hashCode() ^ (-1699898892)) {
                    case -925051108:
                        str8 = "";
                        break;
                    case -145989719:
                        m897d10 = atm.m897d("B1DEA1EF97C1B1D8A1ED97F0B1DEA1D497F3B1DBA1D597F0B1DCA1DD97CFB1DCA1D197FEB1EDA1D797FDB1E6A1ED97FEB1DFA1D5");
                        break;
                    case 626460288:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{59, -40}, new byte[]{75, -65, -31, -94, -17, -33, -21, -114})) != null) {
                            m897d10 = atm.m897d("B1DFA1D297FEB1E2A1E297C1B1D6A1DE97CEB1E2A1DE97C1B1E6A1ED97CEB1DBA1D497FDB1ECA1ED");
                            break;
                        } else {
                            m897d10 = atm.m897d("B1DBA1D397C4B1D8A1EC97FCB1ECA1EC97C0B1E5A1DE97C4B1E2A1D797C4B1E0A1EA97C3B1DCA1D197FAB1D6");
                            break;
                        }
                    case 770810246:
                        str8 = (String) hashMap2.get(C0052e.m1418a(new byte[]{98, 102}, new byte[]{18, 1, 115, -99, 51, -92, -118, -117}));
                        break;
                }
            }
            String m897d11 = atm.m897d("B1E3A1D197C3B1DFA1D497FFB1E2A1D497C0B1EDA1E997F0B1DAA1D997C1B1ECA1ED97FDB1DCA1ED97CFB1E2A1D397C0B1DFA1D197F3");
            while (true) {
                switch (m897d11.hashCode() ^ (-953698181)) {
                    case -1261228711:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-88, -43, -67, 91}, new byte[]{-47, -80, -36, 41, -18, 75, 84, -100})) != null) {
                            m897d11 = atm.m897d("B1E2A1D297C0B1E5A1D097F0B1E2A1EA97F4B1DAA1EC97FEB1E1A1E297F4B1D2A1ED");
                            break;
                        } else {
                            m897d11 = atm.m897d("B1E5A1ED97FEB1E2A1EF97CFB1E2A1ED97C7B1E3A1DD97F3B1DCA1E397C1B1E0A1D097F9B1DEA1D497C0");
                            break;
                        }
                    case -467345838:
                        m897d11 = atm.m897d("B1D1A1EF97C7B1E6A1ED97F9B1D1A1D797C2B1E3A1EE97FAB1D6A1D397C0B1DEA1EC97FF");
                        break;
                    case 248004829:
                        str9 = "";
                        break;
                    case 296747716:
                        str9 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-42, 13, -61, -2}, new byte[]{-81, 104, -94, -116, -104, 69, 41, -83}));
                        break;
                }
            }
            C0288h m1414e = C0052e.m1414e(m262b(f1128i + String.format(C0052e.m1418a(new byte[]{16, -69, 16, -61, -10, -43, -63, -47, 16, -24, 12, -118, -96, -50, -125, -125, 76, -32, 90, -44, -88, -104, -35, -117, 18, -32, 82, -126, -10, -112, -125, -117, 26, -66, 81, -49, -15, -48, -62}, new byte[]{63, -51, Byte.MAX_VALUE, -89, -123, -67, -82, -90}), str3, str4, str5, str6, str7, str8, str9)));
            JSONObject jSONObject = new JSONObject();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-31, -41, 9, 101, -50, 85, -73, 7, -91, Byte.MIN_VALUE, 95, 39, -124, 88, -79, 17, -15, -109, 28, 46, -41, 88, -76}, new byte[]{-123, -66, Byte.MAX_VALUE, 70, -66, 52, -48, 98}));
            String m897d12 = atm.m897d("B1D2A1EC97FEB1EDA1D497F4B1DCA1D997F9B1E2A1D297CFB1DBA1D297F0B1E1A1ED97CEB1DFA1ED97FAB1E6A1D397FCB1DB");
            while (true) {
                switch (m897d12.hashCode() ^ (-1787403516)) {
                    case -1638919295:
                        if (m967p0.size() <= 0) {
                            m897d12 = atm.m897d("B1DBA1EC97FEB1E6A1D597CFB1E0A1EE97CFB1DFA1ED97C3B1E0A1EC97F9B1E2A1E397FAB1E1A1EE97F3B1EDA1D297CF");
                            break;
                        } else {
                            m897d12 = atm.m897d("B1DAA1D597C4B1E2A1DE97C3B1D2A1ED97F8B1D6A1EF97F4B1EDA1ED97F0B1EDA1D297C3B1DFA1DD97C0B1DEA1E397C4B1ECA1EC97F9B1E2");
                            break;
                        }
                    case -1266129911:
                        m897d12 = atm.m897d("B1E1A1E997FDB1DFA1DD97CEB1DDA1D297C3B1DBA1E397FCB1DEA1D597C7B1DBA1DD97C7B1D1A1D597C7B1DBA1EA");
                        break;
                    case -393054604:
                        Matcher matcher = this.f1135g.matcher(m967p0.m606a(C0052e.m1418a(new byte[]{-39, -64, -109, -72}, new byte[]{-79, -78, -10, -34, -21, 99, 121, -54})));
                        String m897d13 = atm.m897d("B1D1A1D797FFB1DBA1D397FDB1D1A1E397C4B1E0A1DE97CEB1E2A1D197C3B1DDA1EE97C1B1E2A1EC97FCB1E2A1D397F0");
                        while (true) {
                            switch (m897d13.hashCode() ^ (-1036525553)) {
                                case -1394900194:
                                    if (!matcher.find()) {
                                        m897d13 = atm.m897d("B1DEA1EE97FDB1E2A1D797CFB1D1A1D097F9B1D6A1DD97C1B1DBA1E997F0B1E0A1D197FEB1D2A1ED");
                                        break;
                                    } else {
                                        m897d13 = atm.m897d("B1E5A1EE97FCB1DAA1EF97CEB1E2A1DD97C2B1DFA1ED97C7B1D2A1D097C7B1E2A1ED97C7B1DCA1E997C0");
                                        break;
                                    }
                                case -1276070680:
                                    i2 = Integer.parseInt(matcher.group(1).trim());
                                    break;
                                case -884746464:
                                    m897d13 = atm.m897d("B1D1A1DD97CEB1E2A1ED97F4B1E2A1D497FEB1DEA1D597C3B1D2A1D597F4B1DAA1D997FCB1E5A1EF97C7B1E5A1D097C0");
                                    break;
                                case 1022743611:
                                    break;
                            }
                        }
                        break;
                    case 1618115345:
                        break;
                }
            }
            i2 = 1;
            JSONArray jSONArray = new JSONArray();
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-35, -71, -2, -22, 91, 73, -20, -115, -43, -75, -91, -83, 66, 67, -27, -117, -103, -18, -88, -91, 22}, new byte[]{-71, -48, -120, -60, 54, 38, -120, -8}));
            int i4 = 0;
            while (true) {
                String m897d14 = atm.m897d("B1E5A1E997F9B1E2A1E997F0B1D6A1D397C2B1E2A1DD97F3B1D2A1ED97FDB1E1A1D197FFB1DFA1DD97C0B1E1A1E997FFB1E2A1DD97F8B1E6A1ED");
                while (true) {
                    switch (m897d14.hashCode() ^ (-1176300297)) {
                        case -1088750784:
                            m897d14 = i4 < m967p02.size() ? atm.m897d("B1D6A1EF97C4B1E2A1D597FEB1DBA1ED97F3B1D2A1D597F8B1DFA1D297C0B1DFA1EC97F9B1D8A1EA97C0B1E2A1EE97FCB1DCA1ED97F3B1E2A1EA97C0") : atm.m897d("B1ECA1EC97C4B1E2A1DE97CFB1E1A1DE97C0B1E1A1D997F9B1E0A1D797C7B1DCA1E397F9B1E1");
                        case -943450853:
                            C0293m c0293m = m967p02.get(i4);
                            String mo925d = c0293m.mo925d(C0052e.m1418a(new byte[]{-116, 54, -10, 80, -25}, new byte[]{-8, 95, -126, 60, -126, -16, 16, -93}));
                            String mo925d2 = c0293m.m966q0(C0052e.m1418a(new byte[]{93, -98, 112, 26, 9, 85, 94, 61}, new byte[]{52, -13, 23, 52, 101, 52, 36, 68})).mo925d(C0052e.m1418a(new byte[]{111, 92, 61, 125, -127, -30, -13, -7, 108, 84, 39, 125, -64}, new byte[]{11, 61, 73, 28, -84, -115, -127, -112}));
                            String m960w0 = c0293m.m966q0(C0052e.m1418a(new byte[]{-91, -91, 86, -67, -11, 93, 71, 53, -83, -87, 13, -6, -20, 87, 78, 109, -81, -93, 84, -10}, new byte[]{-63, -52, 32, -109, -104, 50, 35, 64})).m960w0();
                            Matcher matcher2 = this.f1133e.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{-17, 68, 53, -80}, new byte[]{-121, 54, 80, -42, -84, -90, -80, 104})));
                            String m897d15 = atm.m897d("B1E3A1E297FDB1E2A1EA97C7B1ECA1D497C4B1D8A1EF97F3B1ECA1ED97F4B1D6A1EC97FFB1D1A1EF97C4B1D1A1D7");
                            while (true) {
                                switch (m897d15.hashCode() ^ 847766852) {
                                    case -1715518372:
                                        m897d15 = atm.m897d("B1DDA1D397FAB1E5A1DD97C4B1E5A1D497C0B1E3A1D797FDB1E2A1EA97CEB1DFA1D397FCB1DFA1EF97FFB1E3A1D997C4B1DCA1ED");
                                    case -725979963:
                                        m897d15 = matcher2.find() ? atm.m897d("B1ECA1EA97F8B1E3A1E997F0B1E2A1EF97FDB1E5A1D397C3B1ECA1ED97FFB1DEA1E3") : atm.m897d("B1DAA1EA97C0B1E2A1EC97C3B1E2A1ED97C7B1D1A1EA97F4B1D6A1D097C0B1D8A1DE97FEB1DCA1DE97F4B1ECA1ED97FDB1D2");
                                    case -271984233:
                                        String group = matcher2.group(1);
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(C0052e.m1418a(new byte[]{38, -17, -77, Byte.MAX_VALUE, -3, -61}, new byte[]{80, Byte.MIN_VALUE, -41, 32, -108, -89, -52, 39}), group);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{14, 116, 79, -55, -27, 111, 23, -87}, new byte[]{120, 27, 43, -106, -117, 14, 122, -52}), mo925d);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{104, 53, -80, 78, 32, -3, -112}, new byte[]{30, 90, -44, 17, 80, -108, -13, -124}), mo925d2);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-71, 123, 58, -66, 22, 10, 88, -107, -67, Byte.MAX_VALUE, 45}, new byte[]{-49, 20, 94, -31, 100, 111, 53, -12}), m960w0);
                                        jSONArray.put(jSONObject2);
                                        break;
                                    case 277538640:
                                        break;
                                }
                            }
                            i4++;
                            break;
                        case 1197223033:
                            jSONObject.put(C0052e.m1418a(new byte[]{75, -123, 74, 14}, new byte[]{59, -28, 45, 107, -30, 126, -79, -40}), i);
                            jSONObject.put(C0052e.m1418a(new byte[]{-58, 78, -25, -64, -59, -32, -1, -108, -62}, new byte[]{-74, 47, Byte.MIN_VALUE, -91, -90, -113, -118, -6}), i2);
                            jSONObject.put(C0052e.m1418a(new byte[]{-27, -62, 65, -32, -82}, new byte[]{-119, -85, 44, -119, -38, 125, 121, 103}), 36);
                            String m1418a = C0052e.m1418a(new byte[]{42, -45, 45, 65, 83}, new byte[]{94, -68, 89, 32, 63, -110, -36, 74});
                            String m897d16 = atm.m897d("B1DBA1E297F0B1E2A1EF97F9B1D2A1D297FEB1E2A1ED97C2B1E5A1E397C0B1DDA1D497C4B1DBA1EC97F3");
                            while (true) {
                                switch (m897d16.hashCode() ^ (-545565989)) {
                                    case -1135865623:
                                        if (i2 > 1) {
                                            m897d16 = atm.m897d("B1EDA1ED97C2B1DCA1DD97F8B1E5A1E997C4B1E2A1E997C0B1E3A1DD97C1B1DCA1E997F3B1E2A1EA97CEB1DFA1D497C3");
                                            break;
                                        } else {
                                            m897d16 = atm.m897d("B1E1A1D197F9B1D6A1D797F9B1E6A1EF97C7B1D2A1D597C0B1E1A1EA97FDB1E2A1D397CEB1DAA1E997C7B1DAA1E397FCB1E0A1D997FCB1D8");
                                            break;
                                        }
                                    case -201201393:
                                        m897d16 = atm.m897d("B1E3A1D397FCB1DDA1DE97F3B1DDA1EC97F0B1E2A1E997FFB1ECA1D497FAB1DBA1ED97C1B1E2A1EE");
                                        break;
                                    case 118701296:
                                        i3 = jSONArray.length();
                                        break;
                                    case 2017097998:
                                        i3 = i2 * 36;
                                        break;
                                }
                            }
                            jSONObject.put(m1418a, i3);
                            jSONObject.put(C0052e.m1418a(new byte[]{39, -77, -83, -47}, new byte[]{75, -38, -34, -91, 67, 29, -84, 61}), jSONArray);
                            return jSONObject.toString();
                        case 1930764558:
                            m897d14 = atm.m897d("B1D8A1D297F8B1E2A1E297F0B1E3A1E397F4B1E2A1EE97C4B1D8A1D197FAB1E2A1D397FAB1DFA1D197C3B1DBA1D097F8");
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        boolean z;
        try {
            C0288h m1414e = C0052e.m1414e(m262b(C0052e.m1418a(new byte[]{8, 16, 77, -17, -115, 47, 37, -17, 23, 19, 78, -79, -110, 114, 115, -71, 78, 18, 80, -17, -47, 99, 101, -92, 4, 1, 77, -2, -105, 121, 37}, new byte[]{96, 100, 57, -97, -2, 21, 10, -64}) + list.get(0) + C0052e.m1418a(new byte[]{126, 50, 0, -46, -122}, new byte[]{80, 90, 116, -65, -22, -123, -73, -104})));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String mo925d = m1414e.m966q0(C0052e.m1418a(new byte[]{-68, 112, 29, -50, 66, 56, -6, -108, -76, 124, 70, -115, 78, 62, -16, -37, -66, 112, 25, -109, 91, 122, -3, -119, -79, 117, 15, -64, 75, 62, -24, -49, -75, 118, 15, -107, 67, 50, -77, -120, -84, 124, 6, -51, 95, 62, -3, -63, -26, 57, 2, -115, 72}, new byte[]{-40, 25, 107, -32, 47, 87, -98, -31})).mo925d(C0052e.m1418a(new byte[]{72, 90, -36, -18, 110, 55, 19, 119, 75, 82, -58, -18, 47}, new byte[]{44, 59, -88, -113, 67, 88, 97, 30}));
            String m960w0 = m1414e.m966q0(C0052e.m1418a(new byte[]{-37, 2, -67, -44, 55, 102, -18, -7, -45, 14, -26, -105, 59, 96, -28, -74, -39, 2, -71, -119, 46, 36, -23, -28, -42, 7, -81, -38, 62, 96, -4, -94, -46, 4, -81, -113, 54, 108, -89, -27, -47, 13, -92, -41, 50, 108, -21, -24, -42, 5, -84, -38, 100, 41, -30, -67}, new byte[]{-65, 107, -53, -6, 90, 9, -118, -116})).m960w0();
            String m960w02 = m1414e.m966q0(C0052e.m1418a(new byte[]{89, 14, -119, 19, -35, 23, -114, 40, 81, 2, -46, 80, -47, 17, -124, 103, 91, 14, -115, 78, -60, 85, -119, 53, 84, 11, -101, 29, -44, 17, -100, 115, 80, 8, -101, 72, -36, 29, -57, 52, 83, 1, -112, 16, -39, 22, -98, 47, 82, 3, -118, 94, -60, 17, -123, 51, 16, 4, -112, 83, -60, 29, -124, 41, 29, 89, -33, 77}, new byte[]{61, 103, -1, 61, -80, 120, -22, 93})).m960w0();
            jSONObject2.put(C0052e.m1418a(new byte[]{36, -114, 78, -26, -100, 88}, new byte[]{82, -31, 42, -71, -11, 60, -42, -100}), list.get(0));
            jSONObject2.put(C0052e.m1418a(new byte[]{59, 37, -13, -6, -5, -127, -58, 106}, new byte[]{77, 74, -105, -91, -107, -32, -85, 15}), m960w0);
            jSONObject2.put(C0052e.m1418a(new byte[]{110, -92, -61, 7, 62, 75, -44}, new byte[]{24, -53, -89, 88, 78, 34, -73, -93}), mo925d);
            jSONObject2.put(C0052e.m1418a(new byte[]{107, -35, -79, 40, 47, -89, -24, -121, 120, -36, -95}, new byte[]{29, -78, -43, 119, 76, -56, -122, -13}), m960w02);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{11, 36, -61, 3, 104, 98, -18, -37, 3, 40, -104, 89, 100, 111, -89, -57, 27, 40, -40, 13, 59, 45, -7, -34, 14, 35}, new byte[]{111, 77, -75, 45, 5, 13, -118, -82}));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{53, 26, -113, -92, -15, -9, Byte.MIN_VALUE, -121, 61, 22, -44, -6, -16, -7, -99, -33, 61, 26, -118, -2, -79, -5, -117, -100, 37, 22, -105, -2}, new byte[]{81, 115, -7, -118, -100, -104, -28, -14}));
            int i = 0;
            while (true) {
                int i2 = i;
                String m897d = atm.m897d("B1E3A1D297F4B1E1A1E297C0B1E2A1D097C2B1E2A1D997FEB1D1A1E997CEB1DC");
                while (true) {
                    switch (m897d.hashCode() ^ (-1985665651)) {
                        case -2135414807:
                            m897d = i2 < m967p0.size() ? atm.m897d("B1E0A1D497C4B1E2A1D397F8B1DFA1ED97C1B1DEA1E397C0B1E2A1E297F9B1E2A1EA97C7B1DAA1DD97C2B1DDA1D3") : atm.m897d("B1DCA1D097C7B1DFA1EA97FEB1DBA1DE97C0B1ECA1E397C2B1D2A1E297FDB1E0A1D497C0B1D6A1D197FDB1E2");
                        case -1043181624:
                            String m960w03 = m967p0.get(i2).m960w0();
                            Iterator<String> keys = this.f1130b.keys();
                            while (true) {
                                String m897d2 = atm.m897d("B1E6A1D397C3B1DBA1D797CEB1E2A1DD97FDB1ECA1ED97C1B1E5A1D597C4B1E3A1D397F9B1DEA1D497C0B1E2A1EE97C4B1E2");
                                while (true) {
                                    switch (m897d2.hashCode() ^ 1952690382) {
                                        case -1966301771:
                                            m897d2 = keys.hasNext() ? atm.m897d("B1D6A1EA97F3B1ECA1D497F4B1D1A1D497F8B1DDA1D397F0B1DFA1D197CEB1E2A1D297FFB1ECA1ED97FFB1E0A1D797C1B1DDA1D7") : atm.m897d("B1D1A1ED97F0B1E2A1DE97C0B1E2A1E997C0B1D2A1DD97C0B1D1A1D197F4B1E5A1D397C3B1ECA1D197F0B1DE");
                                        case -461960019:
                                            String next = keys.next();
                                            String m897d3 = atm.m897d("B1E6A1DD97C3B1DEA1E297FEB1E2A1EF97C4B1E2A1ED97F9B1E0A1D197F4B1ECA1DE");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ (-1315140494)) {
                                                    case -2086033672:
                                                        z = true;
                                                        break;
                                                    case -1426528730:
                                                        break;
                                                    case 963827662:
                                                        m897d3 = atm.m897d("B1DAA1DD97F0B1E2A1ED97FFB1ECA1D497F9B1DDA1ED97F3B1E6A1D097C0B1D2A1ED97CEB1E1A1EA97F9B1E3A1DD");
                                                    case 1634265502:
                                                        m897d3 = this.f1130b.getJSONObject(next).getString(C0052e.m1418a(new byte[]{17, 43, -83, 20}, new byte[]{98, 67, -62, 99, 52, 68, -100, 83})).equals(m960w03) ? atm.m897d("B1DAA1EF97C0B1E2A1D197FDB1D6A1D397FAB1EDA1D797FFB1D1A1D797C3B1E1A1EA97FEB1DDA1ED97FDB1E0A1DD97C0B1DCA1EA97C0") : atm.m897d("B1DCA1D597F8B1D2A1D597C4B1E2A1E397C3B1E6A1D197F9B1D2A1ED97FCB1E3A1D197C3B1D6A1D497C0B1E3A1EF97CEB1E2A1E297FAB1ECA1D997F9B1DE");
                                                }
                                            }
                                            break;
                                        case -176551977:
                                            z = false;
                                            break;
                                        case 292666046:
                                            m897d2 = atm.m897d("B1ECA1EF97FFB1DEA1DE97C2B1DAA1E297CFB1DCA1DD97FDB1E2A1EF97CFB1DBA1ED97FDB1E0A1E397F0B1D8A1D0");
                                    }
                                }
                            }
                            String m897d4 = atm.m897d("B1E0A1EF97FDB1DDA1D997F3B1DDA1EC97F3B1E0A1EC97C4B1D6A1EF97F0B1E6A1EA97F9B1E2");
                            while (true) {
                                switch (m897d4.hashCode() ^ 1563583076) {
                                    case 359799707:
                                        break;
                                    case 951889579:
                                        m897d4 = z ? atm.m897d("B1E0A1EC97CEB1DDA1E997FEB1EDA1D197F3B1E3A1D297F9B1E1A1DE97C3B1E1A1D797F0B1E2A1D797FFB1D2") : atm.m897d("B1D6A1D297FCB1E6A1DD97C1B1D8A1D297C0B1D6A1D997F3B1DCA1D097FFB1E2A1EE97C1B1DEA1D297C2B1DCA1ED");
                                    case 1326297011:
                                        C0459g m967p03 = m967p02.get(i2).m967p0(C0052e.m1418a(new byte[]{-67}, new byte[]{-36, -62, 44, 76, 108, 0, -77, 26}));
                                        ArrayList arrayList = new ArrayList();
                                        int i3 = 0;
                                        while (true) {
                                            String m897d5 = atm.m897d("B1D1A1D197C0B1DDA1D197C3B1DAA1EE97F0B1E3A1D097FCB1E1A1EC97F9B1E2A1D397F0B1DFA1ED97C3B1E0A1E997FAB1E6A1D397FDB1E5A1DD");
                                            while (true) {
                                                switch (m897d5.hashCode() ^ (-602221513)) {
                                                    case -63799556:
                                                        m897d5 = i3 < m967p03.size() ? atm.m897d("B1ECA1DD97CEB1D8A1D797FDB1E6A1ED97CFB1D2A1EF97CEB1EDA1EA97F4B1E6A1D397F0B1D1A1EA97FF") : atm.m897d("B1E1A1EC97F0B1E2A1D097C3B1E0A1EE97F0B1E2A1D497CEB1E6A1ED97FAB1DCA1D597FAB1EDA1D7");
                                                    case 635388760:
                                                        m897d5 = atm.m897d("B1DFA1E397F3B1DFA1EF97C1B1DAA1D797C2B1EDA1EA97F8B1DCA1D497FFB1DDA1D097CEB1DEA1EF97FDB1E1A1EF97C1");
                                                    case 1347190752:
                                                        String m897d6 = atm.m897d("B1DEA1E397C7B1E3A1D497CFB1E0A1DE97C0B1E2A1D197FDB1E6A1EA97FAB1D8A1DD97C1B1D8A1D097C0B1DDA1EA97F3B1ECA1EA97F9");
                                                        while (true) {
                                                            switch (m897d6.hashCode() ^ (-2138664014)) {
                                                                case -1616111255:
                                                                    m897d6 = atm.m897d("B1D2A1E397FFB1E2A1E997C4B1E6A1ED97C4B1D2A1E297FFB1E1A1D397FFB1DEA1DD");
                                                                case -240329184:
                                                                    m897d6 = arrayList.size() > 0 ? atm.m897d("B1E1A1D097C2B1E5A1D597CEB1E2A1D297FDB1E6A1D197C3B1DCA1D297F8B1E6A1ED97CEB1DFA1D097C0") : atm.m897d("B1D2A1ED97FDB1E3A1EA97F0B1DAA1EE97C0B1E0A1EC97F3B1D8A1D297C4B1E2A1E397F9B1D1A1D497F3B1DFA1D597C7B1ED");
                                                                case -165316933:
                                                                    linkedHashMap.put(m960w03, TextUtils.join(C0052e.m1418a(new byte[]{106}, new byte[]{73, 79, Byte.MIN_VALUE, 70, -21, Byte.MIN_VALUE, 76, -91}), arrayList));
                                                                    continue;
                                                                case 367701010:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1649565238:
                                                        C0293m c0293m = m967p03.get(i3);
                                                        Matcher matcher = this.f1134f.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{76, 90, -105, 89}, new byte[]{36, 40, -14, 63, 64, -44, -104, 24})));
                                                        String m897d7 = atm.m897d("B1E5A1EA97F9B1E5A1D597FEB1E5A1D297F8B1E5A1E297F3B1D1A1ED97CEB1E2A1ED97F4B1DFA1ED97F3B1D6A1EE97F0B1E6A1ED");
                                                        while (true) {
                                                            switch (m897d7.hashCode() ^ (-611558940)) {
                                                                case -1906441285:
                                                                    m897d7 = matcher.find() ? atm.m897d("B1DFA1D097F0B1E2A1EF97C1B1ECA1ED97C3B1DAA1E397F8B1E2A1ED97C0B1E6A1EE97C7B1DEA1D197FC") : atm.m897d("B1D1A1DE97C7B1E1A1D097CEB1DCA1D197C2B1D2A1D397C4B1E6A1E997FF");
                                                                case -1354780580:
                                                                    break;
                                                                case -1221779920:
                                                                    String group = matcher.group(1);
                                                                    arrayList.add(c0293m.m967p0(C0052e.m1418a(new byte[]{39, 10, Byte.MIN_VALUE, -60}, new byte[]{84, 122, -31, -86, 112, -44, -31, 101})).m602e() + C0052e.m1418a(new byte[]{-40}, new byte[]{-4, 34, -61, -63, 57, 65, 76, 11}) + group);
                                                                    break;
                                                                case 949208408:
                                                                    m897d7 = atm.m897d("B1DDA1D297F4B1DEA1EC97F8B1ECA1DE97F0B1E2A1EE97FDB1D8A1D097C1B1ECA1ED97C1B1DDA1DD97C0B1DAA1EA97F8B1E5A1D997C2");
                                                            }
                                                        }
                                                        i3++;
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 1627791956:
                                        m897d4 = atm.m897d("B1E3A1E997CEB1EDA1DD97C0B1EDA1EE97FDB1DBA1D397FEB1E6A1EC97F4B1EDA1D997C1B1ECA1DD97FFB1E1A1E397F0B1E2");
                                }
                            }
                            i = i2 + 1;
                            break;
                        case 197134099:
                            m897d = atm.m897d("B1DFA1D097C7B1DEA1D397C4B1E2A1D797CEB1D2A1D597C0B1E0A1D297C3B1DCA1ED97C2B1E6A1D197F8B1DDA1EC97C3B1D1A1E3");
                        case 1253300435:
                            String m897d8 = atm.m897d("B1E5A1EE97C3B1DAA1EF97CEB1ECA1E397CEB1E2A1D497CFB1ECA1ED97C4B1DAA1D597C4B1E6A1D597F0B1E1A1E997C0");
                            while (true) {
                                switch (m897d8.hashCode() ^ 1537880600) {
                                    case -2041942434:
                                        break;
                                    case -2016938734:
                                        if (linkedHashMap.size() <= 0) {
                                            m897d8 = atm.m897d("B1D8A1D297F4B1E2A1D597F8B1E1A1DD97F8B1DBA1EF97FAB1E1A1DD97C2");
                                            break;
                                        } else {
                                            m897d8 = atm.m897d("B1D8A1D597FDB1E2A1EA97F3B1E6A1ED97C3B1E2A1ED97F8B1DEA1D097F4B1ECA1E397C0B1DFA1D497CEB1E2A1ED97CEB1E6A1ED97FAB1D8A1D497C0");
                                            break;
                                        }
                                    case -1292765672:
                                        String join = TextUtils.join(C0052e.m1418a(new byte[]{-25, 71, -37}, new byte[]{-61, 99, -1, -116, 15, 10, -66, -116}), linkedHashMap.keySet());
                                        String join2 = TextUtils.join(C0052e.m1418a(new byte[]{105, 63, 98}, new byte[]{77, 27, 70, -78, 49, -3, -108, 94}), linkedHashMap.values());
                                        jSONObject2.put(C0052e.m1418a(new byte[]{110, 75, -122, -125, -91, 91, 58, -26, 71, 66, -112, -77, -72}, new byte[]{24, 36, -30, -36, -43, 55, 91, -97}), join);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-2, -51, 19, -47, 107, -37, -73, -37, -41, -41, 5, -30}, new byte[]{-120, -94, 119, -114, 27, -73, -42, -94}), join2);
                                        break;
                                    case -665269982:
                                        m897d8 = atm.m897d("B1EDA1EA97FAB1D1A1EA97F3B1E0A1D297C3B1E1A1DD97C1B1D2A1E397CFB1D1A1DE97C1B1E0A1E297FDB1E6A1EF97CEB1DDA1D197C0");
                                        break;
                                }
                            }
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject2);
                            jSONObject.put(C0052e.m1418a(new byte[]{-25, 27, -121, 13}, new byte[]{-117, 114, -12, 121, -99, -79, -7, 43}), jSONArray);
                            return jSONObject.toString();
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        char c;
        C0459g m967p0;
        JSONArray jSONArray;
        int i;
        char c2 = 6;
        try {
            C0288h m1414e = C0052e.m1414e(m262b(C0052e.m1418a(new byte[]{-123, 13, 35, 119, -122, 40, 122, 78, -102, 14, 32, 41, -103, 117, 44, 24, -61, 15, 62, 119, -38}, new byte[]{-19, 121, 87, 7, -11, 18, 85, 97})));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{4, 124, -74, -30, 43, -37, -18, 122, 3, 61, -15, -8, 47, -64, -1, 37, 29, 121, -90, -19, 17, -59, -2, 126, 23, 58, -91, -85, 60, -62, -24, 111, 8, 96, -3, -85, 23}, new byte[]{113, 16, -104, -116, 74, -83, -116, 27}));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0293m> it = m967p02.iterator();
            while (true) {
                String m897d = atm.m897d("B1E6A1EF97FDB1E2A1E397C2B1E2A1ED97F9B1E6A1D097C1B1DAA1EA97F9B1EDA1D197FAB1DBA1D497CEB1E0A1D797FAB1E5");
                while (true) {
                    switch (m897d.hashCode() ^ 523828628) {
                        case -454012680:
                            C0293m next = it.next();
                            String m960w0 = next.m960w0();
                            byte[] bArr = new byte[8];
                            bArr[0] = 126;
                            bArr[1] = -116;
                            bArr[2] = 59;
                            bArr[3] = -90;
                            bArr[4] = 2;
                            bArr[5] = -66;
                            bArr[c2] = 42;
                            bArr[7] = -51;
                            Matcher matcher = this.f1132d.matcher(next.mo925d(C0052e.m1418a(new byte[]{22, -2, 94, -64}, bArr)));
                            String m897d2 = atm.m897d("B1E1A1D797FEB1E2A1D097FAB1E6A1ED97FDB1DDA1D397C4B1D8A1ED97C2B1E1A1E397C0B1DEA1D197FC");
                            while (true) {
                                switch (m897d2.hashCode() ^ 1835641583) {
                                    case -1484866706:
                                        m897d2 = !matcher.find() ? atm.m897d("B1E2A1DE97F9B1E2A1EA97FFB1DFA1D297F9B1DBA1E397F3B1DFA1DD97CFB1D2A1EA97FFB1D2A1ED97CEB1DBA1EE97C2B1E3A1DD") : atm.m897d("B1E6A1EE97FFB1D6A1D397F8B1EDA1D297C3B1D6A1E397FCB1E6A1E297FDB1DCA1DD97C0B1E2A1D297C4B1DAA1D797F0B1E2A1ED97F0B1DFA1ED");
                                    case -675422975:
                                        m897d2 = atm.m897d("B1E6A1D197F0B1E6A1D297F0B1E2A1EF97C3B1D2A1ED97CEB1DBA1E397C2B1E2A1ED97FFB1E6A1D197CFB1E5A1D197FCB1E2A1D497C0B1DCA1D397C3");
                                    case -459469689:
                                        c = c2;
                                        break;
                                    case -392635610:
                                        String trim = matcher.group(1).trim();
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(C0052e.m1418a(new byte[]{60, -43, -33, 37, 8, 112, 87}, new byte[]{72, -84, -81, 64, 87, 25, 51, 17}), trim);
                                        jSONObject.put(C0052e.m1418a(new byte[]{-81, -56, 113, -17, 35, -16, -102, 12, -66}, new byte[]{-37, -79, 1, -118, 124, -98, -5, 97}), m960w0);
                                        jSONArray2.put(jSONObject);
                                        c = 6;
                                        break;
                                }
                            }
                            c2 = c;
                            break;
                        case 688378128:
                            m897d = it.hasNext() ? atm.m897d("B1E5A1D297C4B1E2A1D997FAB1DCA1ED97F8B1DFA1DE97F3B1E3A1E297F8B1EDA1D397C4B1D8A1DE97F0B1E6A1D397C0B1D6A1DD97FFB1D8A1EC97FDB1E2") : atm.m897d("B1E5A1D197C2B1ECA1DD97C4B1D1A1D397C0B1EDA1D597CEB1E2A1EE97C1B1E0A1EF97CEB1DDA1D497C0B1E1A1EF97CEB1DCA1ED97C0B1DBA1D4");
                        case 957279228:
                            JSONObject jSONObject2 = new JSONObject();
                            String m897d3 = atm.m897d("B1D6A1E997CFB1DEA1DE97FEB1E6A1EC97FAB1DAA1E297FEB1E2A1DE97F4B1E6A1ED97F3B1DEA1ED97C0");
                            while (true) {
                                switch (m897d3.hashCode() ^ (-622641724)) {
                                    case -2132505788:
                                        break;
                                    case -948574744:
                                        if (!z) {
                                            m897d3 = atm.m897d("B1D2A1DD97FDB1E2A1EA97C7B1DAA1D997C4B1E3A1D197C7B1E0A1D297FCB1E2A1EF97C3B1E3");
                                            break;
                                        } else {
                                            m897d3 = atm.m897d("B1E5A1D597FEB1E2A1DE97CFB1DCA1D297C1B1ECA1ED97F8B1E3A1D097C0B1D6A1EC97C3B1E1A1ED");
                                            break;
                                        }
                                    case 1023341760:
                                        m897d3 = atm.m897d("B1E3A1D797F9B1E2A1D797C3B1DDA1EC97F9B1DAA1D597C7B1E2A1ED97FDB1ECA1D3");
                                        break;
                                    case 1217391016:
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-74, 31, -24, -88, 1, 44, -81}, new byte[]{-48, 118, -124, -36, 100, 94, -36, 41}), this.f1131c);
                                        break;
                                }
                            }
                            jSONObject2.put(C0052e.m1418a(new byte[]{33, 108, -18, 73, -117}, new byte[]{66, 0, -113, 58, -8, -120, 4, 17}), jSONArray2);
                            try {
                                m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-23, -4, -46, -32, -34, 51, -45, 71, -5, -16, -124, -81, -28, 56, -43, 75, -21, -65, -103, -23, -55, 63, -61, 74, -24, -31, -59, -89, -45, 119, -6}, new byte[]{-115, -107, -92, -50, -65, 80, -89, 46}));
                                jSONArray = new JSONArray();
                                i = 0;
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                            while (true) {
                                int i2 = i;
                                String m897d4 = atm.m897d("B1EDA1ED97CEB1E2A1D397FAB1D6A1E997C7B1D2A1EC97FEB1D1A1D497F9B1EDA1DD97CFB1E6A1D997F4B1E6A1EA97C3B1DBA1D297F4B1D8");
                                while (true) {
                                    switch (m897d4.hashCode() ^ 1990817302) {
                                        case -2009837751:
                                            jSONObject2.put(C0052e.m1418a(new byte[]{27, -28, -123, -92}, new byte[]{119, -115, -10, -48, 4, 87, 76, -123}), jSONArray);
                                            break;
                                        case 31073585:
                                            C0293m c0293m = m967p0.get(i2);
                                            String mo925d = c0293m.mo925d(C0052e.m1418a(new byte[]{-105, 24, -53, -115, -63}, new byte[]{-29, 113, -65, -31, -92, -114, -123, -36}));
                                            String mo925d2 = c0293m.m966q0(C0052e.m1418a(new byte[]{126, -7, -121, 65, 98, -58, -24, -102}, new byte[]{23, -108, -32, 111, 14, -89, -110, -29})).mo925d(C0052e.m1418a(new byte[]{67, 56, 91, 120, -56, -118, 48, 92, 64, 48, 65, 120, -119}, new byte[]{39, 89, 47, 25, -27, -27, 66, 53}));
                                            String m960w02 = c0293m.m966q0(C0052e.m1418a(new byte[]{-80, -16, -69, 12, 94, 45, 118, 90, -72, -4, -32, 75, 71, 39, Byte.MAX_VALUE, 2, -70, -10, -71, 71}, new byte[]{-44, -103, -51, 34, 51, 66, 18, 47})).m960w0();
                                            Matcher matcher2 = this.f1133e.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{40, -99, -50, -28}, new byte[]{64, -17, -85, -126, 18, -107, -89, -51})));
                                            String m897d5 = atm.m897d("B1E3A1EA97CEB1E2A1DE97C7B1DBA1ED97CFB1E0A1ED97C0B1E3A1ED97FFB1D2A1D3");
                                            while (true) {
                                                switch (m897d5.hashCode() ^ 730911626) {
                                                    case -1841471798:
                                                        String group = matcher2.group(1);
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{-120, -80, -59, 81, -113, 82}, new byte[]{-2, -33, -95, 14, -26, 54, 90, 16}), group);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{88, 115, 123, -25, -78, -118, 67, -40}, new byte[]{46, 28, 31, -72, -36, -21, 46, -67}), mo925d);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{24, 67, -6, 81, 78, 8, -94}, new byte[]{110, 44, -98, 14, 62, 97, -63, 117}), mo925d2);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{-66, -119, 47, -9, 14, -86, -50, -96, -70, -115, 56}, new byte[]{-56, -26, 75, -88, 124, -49, -93, -63}), m960w02);
                                                        jSONArray.put(jSONObject3);
                                                        break;
                                                    case -1352087636:
                                                        break;
                                                    case -126774560:
                                                        m897d5 = atm.m897d("B1D8A1DE97CFB1D6A1D297C2B1E6A1ED97C2B1E3A1E997FFB1E5A1D597C2B1E3A1D497C0B1E0A1E297C4B1E2A1E297FEB1E6");
                                                    case 409738362:
                                                        m897d5 = !matcher2.find() ? atm.m897d("B1DEA1DE97C2B1D6A1D297FFB1E1A1ED97FFB1DEA1D397FDB1E2A1D997F9B1E0A1D197FEB1ECA1ED97C1B1D1A1EA") : atm.m897d("B1E1A1D997C1B1DBA1E397FFB1E2A1EF97C3B1D2A1EE97C0B1E2A1EC97FDB1E2A1ED97C4B1DBA1E997C0B1E0A1D297C4");
                                                }
                                            }
                                            i = i2 + 1;
                                            break;
                                        case 1945172846:
                                            m897d4 = i2 < m967p0.size() ? atm.m897d("B1E2A1D997FEB1E2A1EF97C2B1E2A1ED97FEB1DFA1D097FFB1E3A1D197F0B1E5A1D097FFB1E2A1E297F9B1D6A1DD97C0B1D6A1E997CE") : atm.m897d("B1D2A1D097C4B1E2A1D997C7B1EDA1D397F9B1E2A1ED97FCB1E3A1EF97C3B1EDA1DD97C2B1D1A1D497C2B1E3A1E997C0B1E2A1D097FEB1E2A1E997F3B1D1");
                                        case 2008719575:
                                            m897d4 = atm.m897d("B1D6A1D797C4B1DCA1D297CEB1E2A1D097F3B1E6A1ED97C0B1DDA1D797FFB1DEA1ED97CEB1DAA1D1");
                                    }
                                }
                                return jSONObject2.toString();
                            }
                        case 1570306494:
                            m897d = atm.m897d("B1D8A1D497FEB1E2A1D297F9B1DBA1D597F8B1DEA1E997C1B1E5A1D797C1B1ED");
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
            this.f1130b = new JSONObject(atm.m897d("115803062B3B484001573F30050D584F6EB0F9E79FF0C5BCD2E99DCFF37A465815076E62534343596E28195840577C7A46580A143E2B0F584057242C1E0A094F63771D0D0D5B203F13035403252845090E14383109550A192D210F08550C2536190F54052428550F0819717A1756581139370E0F150F357A5001580624371D584057A4DFC09FC1CFA4CBF79FFFFC6E74481508577661534356573C2B484058456E74480A1B073F3D4840581D382C1A09405A632F1D0D54192B2113540C1C3C77190E1B01253B450A1614353D18551E052039131F085B3C301A450F072065480756573F37020F584F377A191215026E62489CEAE9ABD3FA585657232A4840434C7574480A0957767A5A5856573C3918091F57767A020E0E053F6245550D023B76061D030C622E030A550638391E13195A3C340B031F07632B05120F5B3C301A450F072065480756573D29484001573F30050D584F6EB0EFC492DBE37A465815076E62534343596E28195840577C7A46580A143E2B0F584057242C1E0A094F63771D0D0D5B203F13035403252845090E14383109550A192D210F0855043D761A120A4A392A06475808607A0813161C2E310613584F377A191215026E62489FE9E1A9CBC3585657232A4840434C7574480A0957767A5A5856573C3918091F57767A020E0E053F6245550D023B76061D030C622E030A550638391E13195A3C340B031F07633A0316135B3C301A450F0720654807565735371F110F5776234809121A3B7A50589EC9D4B1EFCD58596E371858404C756146580A066E62484A58596E280B0809106E6248120E013C2B505555023B2F44161D0C35761C130A5A3F2C0B0E13166328061B03103E7713150F1E39761A120A4A392A06475808607A1B13031C6E621158091D232F48405892C4E98FDFFD9DC5E24856581A3E7A5043434C607A1A09584F6E69485658052D2A191F584F6E301E0E0A067677450D0D0262340D03035B3A311A5509012D2C031955052039131F085A3D31131354052428550F0819717A175658182B2C1C58400E6E2B02150D57767A82F0E893D2C44856581A3E7A5043434C607A1A09584F6E68485658052D2A191F584F6E301E0E0A067677450D0D0262340D03035B3A311A5509012D2C031955052039131F085A213F1E0C54052428550F0819717A1756580D253F1F1B584F377A191215026E624892DFCAABCBF6585657232A4840434C7574480A0957767A5A5856573C3918091F57767A480756573C281E0C584F377A191215026E62482A2A211A7A465815076E62534343596E28195840577C7A46580A143E2B0F5840576E2546580D1F216B1F42584F377A191215026E62489CEDD5A9E8D792CFF1AAE2FA585657232A4840434C7574480A0957767A5A5856573C3918091F57767A020E0E053F6245550D023B76061D030C622E030A550638391E13195A3C340B031F07632F1F10131B6228020A45003E34575807596E3410174900747A5001580624371D584057AACFCA9FCAC8A4EDEE9CC0E56E74481508577661534356573C2B484058456E74480A1B073F3D4840581D382C1A09405A632F1D0D54192B2113540C1C3C77190E1B01253B450A1614353D18550D00263104540A1D3C671F0816486E2546581C13216B1F42584F377A191215026E624893E7EBA9DFCB92CFF1AAE2FA585657232A4840434C7574480A0957767A5A5856573C3918091F57767A020E0E053F6245550D023B76061D030C622E030A550638391E13195A3C340B031F07633E0C00035B3C301A450F072065480756573D310F58400E6E2B02150D57767A8EC0C091F6E282CFFE93F6C84856581A3E7A5043434C607A1A09584F6E68485658052D2A191F584F6E301E0E0A067677450D0D0262340D03035B3A311A5509012D2C031955052039131F085A3E2A440A1205732D181647573125"));
            this.f1131c = new JSONObject(atm.m897d("11584B57760311581414213D48405890F5EC8EC1C757607A011F0357767A131F1B076E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E6248484A477F7A46580C57767A584A48466E254601581B6E6248484A477E7A46580C57767A584A48476E254601581B6E6248484A477D7A46580C57767A584A48446E254601581B6E6248484A477C7A46580C57767A584A48456E254601581B6E6248484A44757A46580C57767A584A4B4C6E254601581B6E6248484A44747A46580C57767A584A4B4D6E254601581B6E6248484A447B7A46580C57767A584A4B426E254601581B6E6248484A447A7A46580C57767A584A4B436E254601581B6E6248484A44797A46580C57767A584A4B406E254601581B6E6248484A44787A46580C57767A584A4B416E254601581B6E6248484A447F7A46580C57767A584A4B466E254601581B6E6248484A447E7A46580C57767A584A4B476E254601581B6E6248484A447D7A46580C57767A584A4B446E254601581B6E6248484A447C7A46580C57767A584A4B456E253707560E6E360B171F57767A8FE6CA90C0E24856581E2921484058143E3D0B5856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9FCCD93E3F36E74480C584F6EBDCEDD93ECCA7A17560157227A505893D3D5BED2D558596E2E4840589CEAC18CC2D557317411581457767A8FF5CA93F5E6485658036E62489FF5C5AAE1D4580759377A04584057ABE6E49FE1C86E74480C584F6EBFD4F49FEEF17A17560157227A50589CC6D9BDF1C758596E2E48405893FFCD8FE1C757317411581457767A82F1CB90D7E5485658036E624892F1C4A9C3D7580759377A04584057AACFCF9CE6D96E74480C584F6EBEFDDF9CE9E07A17560157227A505893EAE5BDF1C758596E2E4840589CD3F18FE1C757317411581457767A8FC4CD90D7E5485658036E62489FC4C2A9C3D7580759377A04584057AAEBDA9FE1C86E74480C584F6EBED9CA9FEEF17A17560157227A50589FF8FCBDD0DC58596E2E48405890C1E88FC0DC57317411581457767A8CFEF590E8FF8FF2D357607A1C584057AADCE59FDED2A9D0C3580759377A04584057A4FDD59DF5D8ABD1F35856573A7A505892D0F3BFE5D79DFCD57A17560157227A50589FFFECBEE1C59FD1EB7A46580C57767A8FF0DA93C7E78FDEDD57317411581457767A8FFFCC91F7CE485658036E62489FFFC3A8E3FC580728317411581414213D48405892FDE38FE4F157607A011F0357767A09161B063F7A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8FECE690C5FF485658036E62489FECE9A9D1CD580759377A04584057ABD0DB9CF9F06E74480C584F6EBFE2CB9CF6C97A17560157227A50589DD2DDBDD3C158596E2E48405892EBC98FC3C157317411581457767A8CFBEA93CCCE485658036E62489CFBE5AAD8FC580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE3DD9CF6C97A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A8CF8D692DAC9485658036E62489CF8D9ABCEFB580759377A04584057A9DEF893E3DC6E74480C584F6EBDECE893ECE57A17560157227A50589DFFE3BFD7D058596E2E48405892C6F78DC7D057317411581457767A8FDFFD90F5E3485658036E62489FDFF2A9E1D1580759377A04584057AADBE09CF8EF6E74480C584F6EBEE9F09CF7D67A17560157227A505893E8DEBEF2DF58596E2E4840589CD1CA8CE2DF57317411581457767A8FF0D292D8E3485658036E62489FF0DDABCCD1580728317411581414213D48405893C2CA8FC0F557607A011F0357767A080358596E2E0B160F106E623101581B6E62489CE6F5AACEDA5856573A7A50580E1C213D4807560E6E3648405891F6E28CCAEE57607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5858402E377A041B17106E62489FC3C1A8E3D7585657273D13584057353D0B0858596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580811254601581B2D350F584057A9C4DA9FF6CF6E7448111F0C6E62481B08102D7A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FF3C9BDF6CA58596E2E48405890CADD8FE6CA57317411581457767A83E5D390D7E5485658036E624893E5DCA9C3D7580759377A04584057A5FEF39CC2DA6E74480C584F6EB1CCE39CCDE37A17560157227A50589FFAFCBED3C458596E2E48405890C3E88CC3C457317411581457767A8CEDDF93D0F4485658036E62489CEDD0AAC4C6580759377A04584057ABE6E49FE1C86E74480C584F6EBFD4F49FEEF17A17560157227A50589CC6FCBDF1C758596E2E48405893FFE88FE1C757317411581457767A82F1CB90D7E5485658036E624892F1C4A9C3D7580759377A04584057AACEDA9FF0D5A9C5CB5856573A7A50589CE3FCBDE0DA9FE8ED7A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC573105175601572239071F584F6EBFDBC19FEBC77A46581110357A505819192D2B195856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9D7CE92D9F06E74480C584F6EBDE5DE92D6C97A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A83E7E893D4FD8FFBCC90CFD7485658036E624893E7E7AAC0CF9FFBC3A9DBE5580759377A04584057A9CEF69FF3D26E74480C584F6EBDFCE69FFCEB7A17560157227A50589FDBFABDD0D758596E2E48405890E2EE8FC0D757317411581457767A8DF0D592F1F2485658036E62489DF0DAABE5C0580759377A04584057A9D2C29EC7E96E74480C584F6EBDE0D29EC8D07A17560157227A50589FD0CBBDD3C158596E2E48405890E9DF8FC3C157317411581457767A8FF3DD93CFDD485658036E62489FF3D2AADBEF580759377A04584057A9D6EC9FF5C76E74480C584F6EBDE4FC9FFAFE7A17560157227A50589DCEC3BDEFC258596E2E48405892F7D78FFFC257317411581457767A8EC3DB93D1C9485658036E62489EC3D4AAC5FB580759377A04584057AADBEF9CE3DA6E74480C584F6EBEE9FF9CECE37A17560157227A50589FE0CABEE2E258596E2E48405890D9DE8CF2E257317411581457767A8DC7EB90C5FF485658036E62489DC7E4A9D1CD580759377A04584057A9DDDC9EC1E36E74480C584F6EBDEFCC9ECEDA7A17270759377A041B17106E62489CF4E7A9E2E5585657273D135840572E21485658032D341F1F584F17234814584F6EBEF6FA9CE3FC7A46580C57767A1E1317106E254601581B6E62489EC0CFAAE8FE5856573A7A5058121C382B4807560E6E364840589DE3DC8FF2FC57607A1C5840573F3B05081F573105172756577F7A502101572239071F584F6EBDD3CE9ECEF17A46581110357A505803102D2A485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058477C695C5856573A7A505848457D6E4807560E6E36484058477C695F5856573A7A505848457D6D4807560E6E36484058477C695E5856573A7A505848457D6C4807560E6E36484058477C69595856573A7A505848457D6B4807560E6E36484058477C69585856573A7A505848457D6A4807560E6E36484058477C695B5856573A7A505848457D694807560E6E36484058477C695A5856573A7A505848457D6848072708602348141B18297A50589FE9FCBDE6C058596E330F03584F6E39181F1B57607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8FFCFF90D0E8485658036E62489FFCF0A9C4DA580759377A04584057AAE0C59FF5C56E74480C584F6EBED2D59FFAFC7A17560157227A50589CE2E9B1F5D358596E2E48405893DBFD83E5D357317411581457767A8CD6DD92F2D6485658036E62489CD6D2ABE6E4580728317411581414213D48405893C2CA8FC0F557607A011F0357767A080358596E2E0B160F106E623101581B6E62489CE6F5AACEDA5856573A7A50580E1C213D4807560E6E3648405891F6E28CCAEE57607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5F58402E377A041B17106E62489FC3C1A8E3D7585657273D13584057353D0B0858596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580811254601581B2D350F584057ABE9D19FE4FE6E7448111F0C6E62481916143F2B485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405892D9F28FF3DD57607A1C584057ABCDC09FF3D26E254601581B6E62489FE1C8A9D0F15856573A7A50589FEEF1BDE2E1580860234814584F6EBDE0D29DE1F7BFE3FD58596E2E48405890C6F08DEEC192C5DF48072708602348141B18297A50589CFBDEBDD0F558596E330F03584F6E3A135856573A39060F1F57760311581457767A8CE6FA93DAE8485658036E62480E1318297A17560157227A50589ECFF6BEDAEE58596E2E4840581D252C19580759377A04584057A4F7EE9FF2F36E74480C584F6E2B091508106E2537072708"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03a4, code lost:
        continue;
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String playerContent(java.lang.String r10, java.lang.String r11, java.util.List<java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0602q.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject = new JSONObject(m262b(C0052e.m1418a(new byte[]{-21, 105, 16, -98, 117, -104, -42, 15, -12, 106, 19, -64, 106, -59, Byte.MIN_VALUE, 89, -83, 107, 13, -98, 41, -53, -105, 68, -26, 101, 74, -98, 110, -46, -42, 65, -23, 124, 28, -63, 117, -41, -98, 71, -26, 110, 16, -47, 107, -53, -99, 29, -78, 59, 19, -118, 59}, new byte[]{-125, 29, 100, -18, 6, -94, -7, 32}) + URLEncoder.encode(str) + C0052e.m1418a(new byte[]{24, -56, 47, 19, 4, 75, 33, -123, 14, -126, 50, 23, 0, 90, 111, -64, 95, -55, 54, 67}, new byte[]{62, -92, 70, 126, 109, 63, 28, -76}) + System.currentTimeMillis()));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String m897d = atm.m897d("B1D2A1EA97C4B1EDA1D797F9B1DBA1D297C0B1DFA1D797F9B1D1A1D997C2B1DCA1D397F9B1E2");
            while (true) {
                switch (m897d.hashCode() ^ 639483965) {
                    case -2096775792:
                        if (jSONObject.getInt(C0052e.m1418a(new byte[]{-71, 80, 92, -35, -43}, new byte[]{-51, 63, 40, -68, -71, -35, 93, -117})) <= 0) {
                            m897d = atm.m897d("B1EDA1E297C3B1D1A1D397F0B1E6A1DE97CFB1E6A1EE97FEB1E2A1D097FEB1E2A1D997F4");
                            break;
                        } else {
                            m897d = atm.m897d("B1DDA1D497FEB1DCA1D797C3B1EDA1EE97C1B1DEA1D197C7B1DEA1D097C0B1E2A1D797C7B1E5A1EF97FDB1D8A1EA97C7B1E2A1ED97FFB1E3A1DD97C0");
                            break;
                        }
                    case -296635640:
                        m897d = atm.m897d("B1E5A1D497FFB1E2A1D297F3B1E5A1DE97CEB1E2A1D397F0B1E6A1D297C0B1D2A1ED97FEB1E6A1E3");
                        break;
                    case 274213463:
                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString(C0052e.m1418a(new byte[]{94, 34, -13, -57}, new byte[]{50, 75, Byte.MIN_VALUE, -77, 13, -114, -98, -79})));
                        int i = 0;
                        while (true) {
                            String m897d2 = atm.m897d("B1EDA1D497F8B1DDA1E397C4B1E1A1E997CEB1E2A1E297FEB1D1A1D597C4B1E3A1ED97CFB1D6A1D397FCB1DBA1D197F8");
                            while (true) {
                                switch (m897d2.hashCode() ^ 748648873) {
                                    case -1979619029:
                                        break;
                                    case -1511791909:
                                        m897d2 = atm.m897d("B1DCA1D397FCB1DBA1E297FDB1D2A1E297C1B1DDA1EF97FDB1E6A1D997C3B1DAA1DE97C7B1E2A1E397CEB1E2");
                                    case -100055452:
                                        m897d2 = i < jSONArray2.length() ? atm.m897d("B1EDA1D497F0B1DAA1EA97C1B1E0A1D797F8B1DAA1DE97CFB1E3A1ED97C3B1D8A1D097F9B1E2A1E397CEB1E2") : atm.m897d("B1DBA1D597CFB1E3A1D397C2B1DCA1EC97CEB1E2A1E397FDB1D2A1D997F3B1DDA1D797FAB1EDA1D797F9B1E6A1ED97FEB1DDA1D797C2B1D2A1ED");
                                    case 800412597:
                                        break;
                                }
                            }
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                            String string = jSONObject3.getString(C0052e.m1418a(new byte[]{-3, -96}, new byte[]{-108, -60, -126, -97, -101, -86, 115, -33}));
                            String string2 = jSONObject3.getString(C0052e.m1418a(new byte[]{60, -90, 2, -45}, new byte[]{82, -57, 111, -74, -89, 123, -19, -15}));
                            String string3 = jSONObject3.getString(C0052e.m1418a(new byte[]{3, 29, -116}, new byte[]{115, 116, -17, 4, -45, 68, 4, 111}));
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(C0052e.m1418a(new byte[]{-105, -116, 108, 92, -63, 90}, new byte[]{-31, -29, 8, 3, -88, 62, 118, -109}), string);
                            jSONObject4.put(C0052e.m1418a(new byte[]{104, -32, 6, 71, -30, 114, 58, 107}, new byte[]{30, -113, 98, 24, -116, 19, 87, 14}), string2);
                            jSONObject4.put(C0052e.m1418a(new byte[]{92, -56, -61, -7, -18, -98, 15}, new byte[]{42, -89, -89, -90, -98, -9, 108, -26}), string3);
                            jSONObject4.put(C0052e.m1418a(new byte[]{-102, -50, -85, -67, -44, 35, -125, 122, -98, -54, -68}, new byte[]{-20, -95, -49, -30, -90, 70, -18, 27}), "");
                            jSONArray.put(jSONObject4);
                            i++;
                        }
                        break;
                    case 1438947341:
                        break;
                }
            }
            jSONObject2.put(C0052e.m1418a(new byte[]{-69, 7, -125, 107}, new byte[]{-41, 110, -16, 31, -54, -65, -32, 34}), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e2) {
            e = e2;
            SpiderDebug.log(e);
            return "";
        }
    }
}
