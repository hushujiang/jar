package com.github.catvod.spider.merge.p044k;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p048m.C0617a;
import com.github.catvod.spider.merge.p048m.C0618b;
import com.github.catvod.spider.merge.p048m.C0620d;
import com.github.catvod.spider.merge.p050n.C0629f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.h */
/* loaded from: classes.dex */
public final class C0593h extends Dora {

    /* renamed from: b */
    private static final Pattern f1081b;

    /* renamed from: c */
    private static final Pattern f1082c;

    /* renamed from: d */
    private static final Pattern f1083d;

    /* renamed from: e */
    private static final Pattern f1084e;

    /* renamed from: f */
    private static final Pattern f1085f;

    /* renamed from: g */
    private static final Pattern f1086g;

    /* renamed from: h */
    private static final Pattern f1087h;

    /* renamed from: i */
    private static final Pattern f1088i;

    /* renamed from: j */
    private static final Pattern f1089j;

    /* renamed from: k */
    private static final Pattern f1090k;

    /* renamed from: l */
    private static final Pattern f1091l;

    /* renamed from: m */
    private static final Pattern f1092m;

    /* renamed from: n */
    private static final Pattern f1093n;

    /* renamed from: o */
    private static String f1094o;

    /* renamed from: p */
    private static final String f1095p;

    static {
        String m897d = atm.m897d("B1DDA1D497C0B1DAA1D497FCB1D8A1D097FFB1EDA1EE97C7B1D8A1E397C0B1DCA1DE97F9B1E2A1EF97FDB1E1A1EC97C4B1E1A1D297FFB1E1");
        while (true) {
            switch ((m897d.hashCode() ^ 209) ^ 1268413211) {
                case -2125146158:
                    f1092m = Pattern.compile(C0052e.m1418a(new byte[]{-59, 50, 117, 45, 5, -85, 117, -44, -109, 110, 39, 86, 86, -32, 69, -103, -24, 13, 32, 47, 44, -23, 49, -22, -108, 113, 90}, new byte[]{-77, 83, 7, 13, 113, -62, 24, -79}));
                    m897d = atm.m897d("B1DEA1EF97C1B1DBA1EE97F9B1ECA1D197C4B1DCA1ED97FEB1E2A1E397FAB1DDA1E397C2B1DFA1ED97C2B1D8A1ED");
                    break;
                case -2067588475:
                    f1095p = C0052e.m1418a(new byte[]{-20, -75, 34, 12, -66, 120, 14, 48, -25, -69, 44, 5, -3, 113, 15, 124, -21, -84}, new byte[]{-124, -63, 86, 124, -51, 66, 33, 31});
                    m897d = atm.m897d("B1E6A1D097FAB1ECA1EF97C0B1E2A1EE97C3B1D8A1DD97C0B1DCA1D997FEB1DCA1ED97FEB1DFA1E397FE");
                    break;
                case -1896834256:
                    f1090k = Pattern.compile(C0052e.m1418a(new byte[]{-58, -76, -13, -7, 67, 20, 71, 97, -112, -114, -90, -5, 107, 93, 60, 2, -105, -9, -36, -14, 31, 46, 64, 126, -19}, new byte[]{-80, -43, -127, -39, 54, 117, 103, 92}));
                    m897d = atm.m897d("B1DEA1D597F0B1E2A1E397C0B1D6A1E397FDB1DCA1D397CEB1DFA1ED97C1B1E3A1D597FFB1E5A1ED");
                    break;
                case -668995779:
                    f1082c = Pattern.compile(C0052e.m1418a(new byte[]{-60, 97, 28, -114, 39, 96, -32, -7, -55, 125, 10, -121, 114, 122, -30, -115, -23, 86, 90, -74, 99, 115, -30}, new byte[]{-78, 8, 120, -21, 72, 90, -64, -91}));
                    m897d = atm.m897d("B1D6A1D997CEB1E6A1D297F8B1DEA1D397F8B1D1A1D097C1B1EDA1D997FAB1DBA1D0");
                    break;
                case -439033738:
                    f1091l = Pattern.compile(C0052e.m1418a(new byte[]{60, 21, -26, 106, 125, -79, -74, -50, 119, 84, -49, 109, 60, -123, -18, -75, 20, 83, -74, 23, 53, -15, -99, -55, 104, 41}, new byte[]{74, 116, -108, 74, 30, -40, -58, -18}));
                    m897d = atm.m897d("B1E0A1D097CFB1DFA1E297FCB1E5A1D597F9B1D2A1EF97F9B1E2A1EF97C3B1E6");
                    break;
                case -372787354:
                    f1081b = Pattern.compile(C0052e.m1418a(new byte[]{18, -3, 88, -4, -109, 39, -54, 28, 18, -18, 117, -61, -61, 90, -70, 105, 84, -119, 116, -1, -102, 71, -121, 64, 94, -74, 119, -53, -34, 20, -63, 81, 94, -74, 113, -37, -97, 80, -116, 81, 5, -5, 102, -52, -46, 84, -76, 65, 86, -19, 45, -46, -48, 8, -110, 80, 108, -3, 33, -118, -22, 38, -123, 105, 71, -120, 40, -117, -109, 84, -53, 88, 84, -32, 45, -57, -33, 25, -49, 96, 68, -77, 59, -116, -63, 27, -109, 70, 85, -119, 43, -118, -22, 38, -123, 104, 27, -4, 95, -117}, new byte[]{48, -43, 3, -94, -79, 122, -31, 53}));
                    m897d = atm.m897d("B1E3A1E297F8B1E0A1D597F9B1E2A1D097FDB1D1A1D997C4B1ECA1ED97CEB1DBA1D5");
                    break;
                case -274418288:
                    f1086g = Pattern.compile(C0052e.m1418a(new byte[]{-18, 10, -39, 106, 6, 91, -1, -19, -91, 81, -111}, new byte[]{-63, 122, -72, 13, 99, 116, -41, -79}));
                    m897d = atm.m897d("B1DBA1ED97C3B1E6A1DD97FDB1DEA1E997C0B1E2A1E997F8B1D1A1D297FDB1E2A1EA97FFB1ECA1ED97F0B1DEA1EA97F0B1D6A1EE97F0B1E5A1ED");
                    break;
                case -58269530:
                    f1088i = Pattern.compile(C0052e.m1418a(new byte[]{-21, -35, 25, -2, -113, 18, 83, 71, -67, -127, 75, -123, -34, 91, 107, 22, -58, -30, 76, -4, -92, 82, 31, 101, -70, -98, 54}, new byte[]{-99, -68, 107, -34, -7, 121, 54, 62}));
                    m897d = atm.m897d("B1E2A1E997C2B1DBA1EE97F4B1EDA1D597C4B1DEA1D097F9B1E5A1DD97C0B1D8A1E297F3");
                    break;
                case 291250810:
                    f1089j = Pattern.compile(C0052e.m1418a(new byte[]{-92, -55, -111, -31, 6, -44, 53, -47, -85, -120, -34, -31, 59, -123, 124, -23, -6, -13, -67, -26, 66, -1, 117, -99, -119, -113, -63, -100}, new byte[]{-46, -88, -29, -63, 96, -94, 94, -76}));
                    m897d = atm.m897d("B1E5A1D797FEB1E2A1EE97C2B1ECA1D597C7B1E2A1D597FCB1E0A1D297FA");
                    break;
                case 478566739:
                    f1084e = Pattern.compile(C0052e.m1418a(new byte[]{119, 96, 9, Byte.MAX_VALUE, -114, 114, -16, -30, 90, 53, 55, 110, -14, 123, -69, -54, 119, 59, 77, 105}, new byte[]{4, 18, 106, 69, -82, 85, -40, -71}));
                    m897d = atm.m897d("B1DFA1EC97F0B1EDA1D197FDB1E1A1D497F9B1E2A1D797C0B1D1A1D197CEB1D6A1D997FFB1DAA1E297F9B1DCA1ED97F3B1D2A1ED97CFB1E0A1D097C0");
                    break;
                case 655448902:
                    f1093n = Pattern.compile(C0052e.m1418a(new byte[]{3, -101, -75, -37, -60, 26, -119, 103, 72, -38, -100, -36, -109, 53, -51, 28, 43, -35, -27, -90, -102, 65, -66, 96, 87, -89}, new byte[]{117, -6, -57, -5, -79, 104, -27, 71}));
                    m897d = atm.m897d("B1DBA1EE97C0B1D1A1E997FEB1E5A1E297CFB1DFA1D097C1B1D2A1EC97FAB1E2A1E297FDB1E2A1D297FEB1DD");
                    break;
                case 702835323:
                    f1083d = Pattern.compile(C0052e.m1418a(new byte[]{-83, 41, 8, -95, 0, -127, -113, -113, -28, 124, 54, -82, 28, -121, -113, -48, -4, 116, 49, -117, 75, -88, -56, -74, -16, 42, 30, -95, 64, -41}, new byte[]{-34, 92, 106, -43, 105, -11, -29, -22}));
                    m897d = atm.m897d("B1D6A1D197C4B1E0A1D997C7B1EDA1E997F0B1D1A1D997CFB1E0A1E397F3B1D6A1ED97C0");
                    break;
                case 864343612:
                    f1094o = "";
                    m897d = atm.m897d("B1ECA1DD97F8B1D1A1D197C2B1DDA1DD97CEB1E2A1D297C1B1ECA1ED97C7B1DAA1E397C0");
                    break;
                case 1431232807:
                    return;
                case 1617994153:
                    f1087h = Pattern.compile(C0052e.m1418a(new byte[]{72, -94, 19, 32, 122, 29, 112, 86, 79, -6, 102, 121, 74, 82, 97, 13, 10, -72}, new byte[]{103, -44, 76, 80, 22, 124, 9, 121}));
                    m897d = atm.m897d("B1DEA1D197CEB1E2A1D197C2B1DAA1D197FEB1DCA1ED97FCB1E6A1E297C4B1EDA1E997C0B1DFA1EF97C3");
                    break;
                case 1619377212:
                    f1085f = Pattern.compile(C0052e.m1418a(new byte[]{60, -6, -96, -10, 117, 117, -79, -44, 79, -13, -28, -87, 50, 120, -22, -111, Byte.MAX_VALUE}, new byte[]{19, -105, -49, Byte.MIN_VALUE, 28, 16, -98, -4}));
                    m897d = atm.m897d("B1DCA1EF97F3B1D6A1EF97FFB1E5A1E297C3B1DEA1EA97C7B1DBA1E997FEB1DCA1D097FDB1E2");
                    break;
            }
        }
    }

    /* renamed from: a */
    protected static HashMap<String, String> m287a() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1E5A1EC97CFB1E2A1D597C0B1E5A1D297F4B1D8A1D397C4B1D8A1D797FAB1DCA1E997F9");
        while (true) {
            switch ((m897d.hashCode() ^ 198) ^ (-877775686)) {
                case -1337596166:
                    return hashMap;
                case -1319548586:
                    String m897d2 = atm.m897d("B1E1A1D497C7B1E3A1D797C4B1E1A1D597C7B1D2A1E397F0B1E0A1DD97CFB1DAA1D997C1B1EDA1E297FCB1DEA1ED97C0B1EDA1E397C0");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-959224170)) {
                            case -1807965459:
                                m897d2 = f1094o.length() > 0 ? atm.m897d("B1EDA1D597C0B1E5A1D097C1B1E1A1DD97F9B1E2A1E997F8B1D8A1DE97FDB1ECA1DD97CEB1DDA1DE97F0B1E1A1D497FDB1DC") : atm.m897d("B1E6A1D097FAB1ECA1EC97C1B1E3A1DE97FDB1D1A1EE97C0B1DDA1EA97FCB1D6A1D597FC");
                            case -244003680:
                                m897d = atm.m897d("B1DAA1E297C7B1D1A1D797F4B1D2A1D397FFB1DEA1E397C4B1E6A1D097C0B1DAA1D997C0B1E2A1EC97F8B1E0");
                                continue;
                            case 340415201:
                                m897d2 = atm.m897d("B1ECA1DD97FEB1E2A1D497C1B1DBA1D497C3B1DDA1E997F4B1DEA1D097FFB1E2A1D497FEB1DCA1EF97FFB1D2A1D297C1B1E2A1ED97FEB1E3A1E2");
                            case 1133691128:
                                m897d = atm.m897d("B1DAA1EA97C3B1EDA1E997CEB1E2A1EE97FAB1D2A1EE97C4B1E3A1EF97C4B1DDA1D397FCB1DFA1D397F0B1DBA1ED");
                                continue;
                        }
                    }
                    break;
                case 361561879:
                    hashMap.put(C0052e.m1418a(new byte[]{-21, -44, 73, -68, 85, -26, 31}, new byte[]{-71, -79, 47, -39, 39, -125, 109, 9}), f1095p);
                    m897d = atm.m897d("B1DCA1EE97C4B1E2A1D797F4B1DFA1D397F9B1DCA1ED97FDB1D1A1E997C0B1E0A1D197FEB1DFA1D597FAB1E6A1D197CE");
                    break;
                case 807949407:
                    hashMap.put(C0052e.m1418a(new byte[]{28, -80, 30, -96, -87, -1, 76, -50, 39, -73}, new byte[]{73, -61, 123, -46, -124, -66, 43, -85}), C0052e.m1418a(new byte[]{-47, 67, -6, -45, 96, -113, 8, 47, -87, 2, -80, -102, 36, -82, 8, 99, -11, 66, -12, -43, Byte.MAX_VALUE, -117, 82, 32, -43, 66, -12, -33, 96, -61, 36, 97, -1, 12, -49, -23, 44, -69, 73, 49, -84, 115, -79, -113, 83, -44, 64, 32, -35, 92, -16, -42, 105, -76, 12, 98, -41, 69, -12, -107, 57, -48, 94, 46, -81, 26, -96, -110, 71, -85, 61, 77, -48, 0, -96, -42, 101, -120, 12, 32, -37, 73, -29, -47, 99, -54, 73, 67, -12, 94, -17, -41, 105, -52, 88, 48, -84, 2, -80, -108, 56, -37, 80, 54, -78, 27, -75, -102, 95, -126, 15, 97, -18, 69, -81, -113, 63, -44, 71, 51, -86}, new byte[]{-100, 44, Byte.MIN_VALUE, -70, 12, -29, 105, 0}));
                    m897d = atm.m897d("B1E0A1E997C3B1D6A1D397C2B1D1A1EA97C7B1E5A1DE97FAB1D2A1D797F0B1D1A1D297FDB1E2");
                    break;
                case 1506863596:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E2A1D997F9B1E2A1EA97C2B1D8A1E297C4B1E2A1D097CEB1E2A1D297F0B1E2A1ED97FEB1E6A1E997C0");
                    break;
                case 1653793097:
                    hashMap.put(C0052e.m1418a(new byte[]{-7, -106, 99, 108, 92, -9}, new byte[]{-70, -7, 12, 7, 53, -110, 44, 97}), f1094o);
                    m897d = atm.m897d("B1DAA1E297C7B1D1A1D797F4B1D2A1D397FFB1DEA1E397C4B1E6A1D097C0B1DAA1D997C0B1E2A1EC97F8B1E0");
                    break;
            }
        }
    }

    /* renamed from: d */
    public static Object[] m284d(String str) {
        try {
            C0591f c0591f = new C0591f();
            C0629f.m183b(C0629f.m184a(), str, m287a(), c0591f);
            Response m194a = c0591f.m194a();
            String m897d = atm.m897d("B1DBA1D397FDB1E2A1DD97F4B1DFA1D797F0B1E2A1D997CEB1D2A1D497C1B1E2A1ED97F9B1EDA1E397C0B1E2A1EA97C4B1E3A1D3");
            while (true) {
                switch (m897d.hashCode() ^ (-51469926)) {
                    case -1678100340:
                        return new Object[]{200, C0052e.m1418a(new byte[]{-7, -64, 77, 125, 85, -8, 126, 118, -15, -33, 83, 62, 83, -8, 107, 103, -20, -99, 78, 101, 78, -2, 126, 111}, new byte[]{-104, -80, 61, 17, 60, -101, 31, 2}), new ByteArrayInputStream(C0052e.m1418a(new byte[]{-34, 6, 46, -119, -97, -101}, new byte[]{-119, 67, 108, -33, -53, -49, -62, 39}).getBytes())};
                    case -355627673:
                        if (m194a.code() != 404) {
                            m897d = atm.m897d("B1DAA1EF97CEB1E2A1D997C0B1DAA1D097F4B1DBA1EA97C4B1DBA1ED97C4B1DDA1ED97C0B1E1A1DE97FDB1E5A1EC97F4");
                            break;
                        } else {
                            m897d = atm.m897d("B1DDA1D297CFB1E3A1D097C7B1E0A1D297FEB1E2A1D997C3B1D8A1DD97CEB1E6A1ED");
                            break;
                        }
                    case 1753511512:
                        m897d = atm.m897d("B1DCA1EF97F0B1E2A1D497FCB1DCA1EE97C0B1DDA1ED97C2B1D8A1EA97FEB1ECA1EF97C0B1DBA1EA");
                        break;
                    case 1759755972:
                        byte[] bytes = m194a.body().bytes();
                        byte[] copyOfRange = Arrays.copyOfRange(bytes, 0, 16);
                        BufferedReader bufferedReader = new BufferedReader(new StringReader(C0618b.m206a(C0617a.m209a(Arrays.copyOfRange(bytes, 16, bytes.length), copyOfRange, copyOfRange, C0617a.f1185a)).replaceAll(C0052e.m1418a(new byte[]{87, 84, 125, -45, 89, 20, -55, -51, 27, 115, 43, -43, 81, 53, -105, -22, 77, 117, 55, -12, 15, 18, -64, -20, 81, 35, 69, -52, 16, 91, -114, -85, 35, 108, 98, -102, 22, 83, -81, -11, 4, 58, 100, -122, 55, 13, -120, -94, 2, 33, 55, -126}, new byte[]{Byte.MAX_VALUE, 8, 25, -88, 107, 105, -13, -111}), C0052e.m1418a(new byte[]{53, 1}, new byte[]{17, 48, -23, 87, 78, 77, 40, 117})).replaceAll(C0052e.m1418a(new byte[]{99, 105, 114, 8, 3, -44, 123, -126, 47, 78, 36, 14, 31, -11, 37, -91, 120, 72, 63, 93, 27, -106, 105, -2, 102, 24, 40, 83, 24, -127, 29, -70, 48, 7, 107, 73, 109, -51, 58, -20, 54, 27, 74, 23, 74, -102, 60, -9, 101, 31}, new byte[]{75, 53, 22, 115, 49, -87, 65, -34}), C0052e.m1418a(new byte[]{-43, 47, -63, 112, 28, 24, 6, -10, -43, 37, -33, 103}, new byte[]{-27, 31, -5, 84, 45, 60, 52, -58})).replaceAll(C0052e.m1418a(new byte[]{66, 65, 5, -36, -37, 69, -103, -41, 86, 65, 5, -53, -37, 69, -103, -41, 66, 65, 5, -36}, new byte[]{126, 111, 47, -30, -25, 107, -77, -23}), C0052e.m1418a(new byte[]{-13, 41}, new byte[]{-41, 24, 83, -69, 98, 58, 90, 14})).replaceAll(C0052e.m1418a(new byte[]{-29, 66, 63, 109, -86, 36}, new byte[]{-59, 106, 17, 71, -125, 31, 24, 110}), "").replaceAll(C0052e.m1418a(new byte[]{96, 70, -37, 106, -127, 46, 82, 87}, new byte[]{78, 108, -107, 37, -43, 107, 124, 125}), "")));
                        ArrayList arrayList = new ArrayList();
                        int i = 1;
                        String readLine = bufferedReader.readLine();
                        while (true) {
                            String m897d2 = atm.m897d("B1D2A1E997F4B1DCA1EC97F0B1DDA1E997F3B1E6A1D197F0B1EDA1EF97CFB1D8A1D797C0B1E2A1D597C1B1E2A1E397F4B1D6A1D297C3B1E5");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-2032347189)) {
                                    case -2013399477:
                                        String m897d3 = atm.m897d("B1DEA1EE97FDB1E2A1EC97F8B1E2A1D097CEB1E2A1D797FEB1D2A1EE97F9B1E3A1DE97C2B1D1");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-846142762)) {
                                                case -1674025381:
                                                    m897d3 = readLine.matches(C0052e.m1418a(new byte[]{71, 59, 90, -113, 61, 92, 38, 48, 96, 109, 92, -121, 28, 2, 1, 102, 102, 113, 125, -39, 59, 85, 7, 122, 48, 3, 69, -58, 114, 27, 64, 8, Byte.MAX_VALUE, 36, 19, -64, 122, 58, 30, 47, 41, 34, 15, -31, 36, 29, 73, 41}, new byte[]{27, 95, 33, -67, 64, 102, 122, 84})) ? atm.m897d("B1E2A1ED97F3B1D1A1D097CFB1E2A1EF97C1B1D1A1EF97F9B1E2A1E297F9B1E3A1DE97FAB1DEA1D797F3") : atm.m897d("B1DEA1D797C1B1DCA1D297F3B1D6A1D397F8B1D1A1E997F9B1D6A1D097F8B1E2A1D497C0B1D1A1EE97F0B1DB");
                                                case 204467793:
                                                    String m897d4 = atm.m897d("B1E1A1D297FDB1E6A1ED97C7B1E0A1ED97C4B1E2A1E397FFB1D8A1D797F3B1D2A1ED97C4B1EDA1ED97CEB1E6A1EA97C0B1DBA1D097C0B1E0");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ 1767157998) {
                                                            case -995985422:
                                                                m897d4 = ((String) arrayList.get(arrayList.size() + (-1))).trim().isEmpty() ? atm.m897d("B1E1A1E397CEB1E2A1ED97F3B1E0A1DD97C3B1E3A1EE97FFB1D6A1E397C0B1DDA1ED") : atm.m897d("B1DBA1D497F8B1D6A1D397F0B1DFA1EF97F0B1D2A1EA97C7B1EDA1D797FE");
                                                            case -89132810:
                                                                break;
                                                            case 233992921:
                                                                m897d4 = atm.m897d("B1DAA1ED97FDB1E2A1ED97F9B1D2A1DE97C3B1DEA1D597CEB1E3A1DD97FFB1DFA1D097F3B1D1A1D997CFB1E2A1ED97F9B1D1A1EA97C7B1ED");
                                                            case 1743263566:
                                                                arrayList.add(i + "");
                                                                i++;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 445907300:
                                                    m897d3 = atm.m897d("B1E5A1DD97F0B1D2A1E997F0B1E2A1D097CEB1E2A1D497CEB1DAA1E997C2B1E6A1D097FFB1DAA1EC97FFB1EDA1D597C7B1DAA1D197F4");
                                                case 1045790908:
                                                    break;
                                            }
                                        }
                                        arrayList.add(readLine);
                                        readLine = bufferedReader.readLine();
                                        i = i;
                                        break;
                                    case -1973110994:
                                        m897d2 = atm.m897d("B1DFA1E997FFB1E2A1EA97FEB1E2A1D997C3B1E6A1D097C0B1DAA1ED97FCB1E0A1D0");
                                    case -865459924:
                                        m897d2 = readLine != null ? atm.m897d("B1E6A1D297F3B1D6A1EF97F0B1E2A1D497C0B1ECA1EF97C0B1E1A1D997C1B1D6A1DD97C4B1E2A1EE97CEB1DB") : atm.m897d("B1D6A1EE97C4B1E2A1E297F8B1D2A1ED97FAB1D6A1EF97FDB1D2A1D297F8B1E0A1E997C0B1D8A1E397FDB1E2A1D297CFB1DCA1ED97F9B1DDA1EE97C2B1E5A1E2");
                                    case -597405441:
                                        return new Object[]{200, C0052e.m1418a(new byte[]{83, -125, -59, 67, 49, 5, 71, 64, 91, -100, -37, 0, 55, 5, 82, 81, 70, -34, -58, 91, 42, 3, 71, 89}, new byte[]{50, -13, -75, 47, 88, 102, 38, 52}), new ByteArrayInputStream(TextUtils.join(atm.m897d("60"), arrayList).getBytes())};
                                }
                            }
                        }
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return null;
        }
    }

    /* renamed from: e */
    private String m283e(String str) {
        int i = 0;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0052e.m1418a(new byte[]{-115, -59, 93}, new byte[]{-64, -127, 104, 117, -74, 113, 27, -89}));
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            while (true) {
                String m897d = atm.m897d("B1ECA1DE97FFB1DFA1EC97FFB1DCA1E397F9B1E6A1E997FAB1E2A1EA97FC");
                while (true) {
                    switch (m897d.hashCode() ^ 2048864442) {
                        case -1910870062:
                            m897d = atm.m897d("B1D2A1EC97C7B1DAA1D797C1B1D1A1D497FFB1E2A1D397C3B1E6A1ED97C2B1D8A1D197CEB1E5A1D2");
                        case -1178275471:
                            m897d = i < length ? atm.m897d("B1DEA1D997C3B1EDA1D197FCB1D6A1D797C7B1E1A1DD97FFB1D1A1D297FEB1E2A1D497CFB1DB") : atm.m897d("B1E1A1DD97C1B1EDA1D997C0B1DEA1D197C1B1D6A1DE97F4B1E1A1D797CE");
                        case -984754823:
                            StringBuilder sb2 = new StringBuilder(Integer.toHexString(digest[i] & 255));
                            while (true) {
                                String m897d2 = atm.m897d("B1E5A1EE97FCB1DAA1EF97F9B1E2A1D597FDB1DBA1ED97C7B1DFA1EA97C4B1E1A1DE97FEB1DDA1E297CFB1E1A1EA97C7B1D2A1D097C0");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-664571972)) {
                                        case -1851899691:
                                            break;
                                        case -1059924205:
                                            m897d2 = atm.m897d("B1D1A1D297C2B1DEA1D197CFB1DEA1D197F0B1E2A1DD97CEB1E1A1EE97FFB1E6A1D097FFB1D8A1E397C7B1EC");
                                        case 174132517:
                                            break;
                                        case 1654864981:
                                            m897d2 = sb2.length() < 2 ? atm.m897d("B1D6A1D997FDB1DDA1DE97C1B1E1A1D097CEB1E2A1D297FEB1E5A1DE97F9B1D6A1D597C1B1E0") : atm.m897d("B1D8A1EE97C7B1E0A1D797F9B1E2A1EA97F0B1DCA1DE97FDB1DCA1D297FDB1DBA1ED");
                                    }
                                }
                                sb2.insert(0, C0052e.m1418a(new byte[]{87}, new byte[]{103, 114, 25, 93, 91, -69, -61, -92}));
                            }
                            sb.append((CharSequence) sb2);
                            i++;
                            break;
                        case 1510982622:
                            return sb.toString();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    protected final String m286b(String str) {
        TreeMap treeMap = null;
        String str2 = null;
        TreeMap treeMap2 = null;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        StringBuilder sb2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str6 = null;
        String str7 = null;
        StringBuilder sb3 = null;
        Iterator it = null;
        Map.Entry entry = null;
        String str8 = null;
        String str9 = null;
        TreeMap treeMap3 = null;
        StringBuilder sb4 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        PrintStream printStream = null;
        StringBuilder sb5 = null;
        PrintStream printStream2 = null;
        StringBuilder sb6 = null;
        StringBuilder sb7 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str13 = null;
        String str14 = null;
        StringBuilder sb8 = null;
        List list = null;
        Iterator it2 = null;
        String str15 = null;
        StringBuilder sb9 = null;
        String str16 = null;
        String str17 = null;
        TreeMap treeMap4 = null;
        String str18 = null;
        StringBuilder sb10 = null;
        String str19 = null;
        StringBuilder sb11 = null;
        String str20 = null;
        StringBuilder sb12 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        List list2 = null;
        Iterator it3 = null;
        String str26 = null;
        String str27 = null;
        StringBuilder sb13 = null;
        String m897d = atm.m897d("B1D1A1D297CFB1D6A1EF97C2B1E3A1D997F9B1DFA1D397F3B1E3A1DE97FDB1E2A1D297F0B1E1A1EE97F8B1DBA1ED97C0B1DFA1D1");
        while (true) {
            switch ((m897d.hashCode() ^ 931) ^ (-15808446)) {
                case -2127296302:
                    f1094o = sb13.toString();
                    m897d = atm.m897d("B1E0A1D097C2B1E6A1EF97C4B1DCA1EE97FAB1DCA1D297C0B1DEA1E297FEB1E2A1E297F8B1D2");
                    continue;
                case -2110846793:
                    i = 0;
                    m897d = atm.m897d("B1E1A1E297F0B1E2A1DD97F3B1DBA1ED97FDB1DBA1D297C0B1EDA1D097C3B1E1A1E397C0B1DAA1D197FFB1D6A1D297F9B1E2A1D997C4B1E5A1D097C2B1DE");
                    continue;
                case -2081862787:
                    sb4.append(C0277c.m1073b(str9, C0052e.m1418a(new byte[]{86, -47, 122, -118, -76, -126, -72, 78, 92, -57, 104, -99, -8, -40, -28, 78, 92, -57}, new byte[]{126, -18, 70, -73, -57, -16, -37, 115})));
                    m897d = atm.m897d("B1E3A1EA97CEB1E2A1ED97C4B1DBA1EA97CEB1D2A1ED97F8B1DBA1EC97F9B1DFA1EA97C1B1DCA1EC97FFB1DBA1D297C0B1D8A1D5");
                    continue;
                case -1998954668:
                    m897d = atm.m897d("B1E3A1D397C4B1DCA1DE97FDB1DBA1E297F9B1E5A1D497F8B1E2A1EE97FAB1EDA1D397FFB1EDA1E397C0B1DFA1EF97C0B1D1A1E997F4");
                    str17 = str9;
                    continue;
                case -1983253698:
                    str24 = m286b(str22);
                    m897d = atm.m897d("B1ECA1D297F0B1D2A1DD97C4B1DEA1E397F0B1DEA1DD97FEB1E6A1EE97FEB1E2A1E297CFB1DCA1EA97CEB1D8A1EA97C1B1EC");
                    continue;
                case -1979016527:
                    m897d = atm.m897d("B1DCA1EA97FFB1E3A1DD97F0B1DDA1DE97CEB1E2A1D297C1B1DDA1E997C0B1E0A1D797C0B1DDA1ED97C2B1E0A1D397FCB1DFA1E397FCB1E2A1E9");
                    sb12 = sb11;
                    continue;
                case -1973625638:
                    m897d = atm.m897d("B1DEA1EA97F3B1E5A1D997FAB1E2A1D497FAB1E1A1E397F9B1E2A1E297F4B1E1A1EF97C1B1E2A1ED97FAB1E5A1E997C0B1E1A1EE97F0B1D2A1EA97F0B1E2");
                    str27 = (String) it3.next();
                    continue;
                case -1916077554:
                    str6 = C0277c.m1072c(sb2.toString(), C0620d.f1187b);
                    m897d = atm.m897d("B1EDA1D797C0B1E6A1D997F0B1E2A1EA97F0B1DFA1D497F9B1DAA1D097F3B1E2A1DE97CF");
                    continue;
                case -1845254479:
                    String m897d2 = atm.m897d("B1DCA1ED97F9B1D1A1D397F9B1D2A1D197C1B1EDA1D097FDB1DCA1D997F4B1D2A1D997FDB1E2A1EF97FCB1DFA1EE97C4B1E6A1ED97F0B1E5A1D397C0");
                    while (true) {
                        switch (m897d2.hashCode() ^ 1458365475) {
                            case -243332585:
                                m897d2 = atm.m897d("B1E3A1D297CEB1E2A1E997FDB1EDA1DD97C0B1E5A1EA97C7B1D1A1ED97F4B1DCA1ED97F0B1D8A1E997C2B1D2A1D397C7B1E6");
                            case -220925958:
                                m897d = atm.m897d("B1ECA1EA97C4B1E2A1DD97F8B1DEA1D297F0B1DCA1EC97F9B1DCA1ED97FCB1E3A1D797F8B1D2A1ED97FCB1D1A1E997C7B1E1A1E397C0");
                                continue;
                            case 1520345910:
                                m897d2 = it2.hasNext() ? atm.m897d("B1E3A1D197C7B1D2A1E397C0B1ECA1DE97C4B1E3A1EA97C3B1E5A1D597CEB1E2A1D997FFB1D1A1DD97CFB1D6") : atm.m897d("B1D2A1E997F3B1DCA1E397C0B1E6A1D197C4B1E2A1ED97C2B1DCA1D997FCB1DAA1EC97FEB1E5");
                            case 1775508336:
                                m897d = atm.m897d("B1D2A1D397F0B1E2A1D197C7B1DCA1D397FCB1DBA1D597FCB1E2A1D197F4B1DBA1D197C3");
                                continue;
                                continue;
                        }
                    }
                    break;
                case -1825956317:
                    sb8 = new StringBuilder();
                    m897d = atm.m897d("B1D6A1EE97CFB1EDA1DD97FFB1E2A1EF97C2B1DDA1E997C4B1DFA1D297F8B1E1A1D297FAB1DA");
                    continue;
                case -1809704828:
                    m897d = atm.m897d("B1D6A1EE97FAB1E6A1EC97C2B1EDA1D297F9B1DEA1DE97CEB1DCA1ED97F8B1E3A1EC97CEB1E2");
                    str25 = str23;
                    continue;
                case -1704669669:
                    m897d = atm.m897d("B1E6A1D497CFB1E3A1EC97CFB1DFA1D797CEB1D1A1E297CEB1E2A1DE97C7B1DCA1ED97C7B1DBA1EA97F0B1E2A1E997F0B1ECA1DD97C0");
                    str9 = str8;
                    continue;
                case -1662314155:
                    f1094o = sb9.toString();
                    m897d = atm.m897d("B1E1A1D097F9B1E2A1DE97C1B1DEA1DD97F0B1E2A1E997F0B1EDA1D397FAB1E0A1EC97F3B1D2A1ED");
                    continue;
                case -1603387433:
                    sb2.append(Integer.toString(str5.charAt(i3)));
                    m897d = atm.m897d("B1E3A1D497FEB1E1A1EE97F0B1D1A1E397FDB1E2A1ED97CFB1DEA1E997FFB1D8A1D097F0B1DDA1ED97F0B1E5A1D097C0");
                    continue;
                case -1532519040:
                    m897d = atm.m897d("B1D2A1EF97C7B1DFA1DE97C4B1E2A1EF97FAB1DBA1D197C0B1D6A1D197F9B1D2");
                    str9 = str2;
                    continue;
                case -1491763180:
                    str23 = C0629f.m178g(str22, m287a(), treeMap4);
                    m897d = atm.m897d("B1E6A1E297FAB1E1A1DD97C4B1EDA1D297FEB1E2A1E997C4B1D2A1ED97C0B1DCA1D297C0B1DCA1D097F8B1E5A1DE97C1");
                    continue;
                case -1462654665:
                    str20 = C0052e.m1418a(new byte[]{-86, 33, 125, 111, -98, 99, -57, -28}, new byte[]{-123, 30, 31, 27, -23, 2, -95, -39});
                    m897d = atm.m897d("B1DEA1E397F0B1E2A1EE97FEB1E6A1D797C0B1ECA1ED97F8B1D2A1ED97C0B1D2A1E997C7B1D6A1EF97FEB1E2A1D997F4B1E0A1D197C7B1E3A1EF97FDB1E1");
                    continue;
                case -1451417003:
                    f1094o = "";
                    m897d = atm.m897d("B1E3A1E397F9B1DDA1D997C3B1DFA1D497C1B1DDA1D597C7B1E6A1D597FEB1E2A1EC97CEB1EDA1E297F4B1E0A1EC97CEB1D8A1EC97F9B1DFA1ED");
                    continue;
                case -1445693951:
                    sb5 = new StringBuilder();
                    m897d = atm.m897d("B1E0A1EA97CFB1D6A1D597C4B1EDA1E997FDB1E2A1E397CFB1E2A1ED97FAB1DAA1E997C0B1D6A1D597F0B1E2");
                    continue;
                case -1417121607:
                    sb9 = new StringBuilder();
                    m897d = atm.m897d("B1DAA1D797CFB1E3A1EA97FEB1E2A1D297FCB1DFA1ED97CEB1E5A1D797C7B1EDA1EA97FDB1E1A1DD97C2B1DDA1EF97F0B1E2A1ED");
                    continue;
                case -1408663362:
                    str3 = C0629f.m179f(sb.toString(), m287a());
                    m897d = atm.m897d("B1DBA1D197C3B1D6A1E997FFB1D6A1D397C4B1E2A1EE97FEB1E1A1D797F9B1DCA1ED97F8B1ECA1D397C3B1E0A1EE97FCB1ECA1EF");
                    continue;
                case -1385271281:
                    String m897d3 = atm.m897d("B1E2A1E297F0B1E1A1D097C0B1E2A1D397C7B1ECA1ED97C7B1DAA1ED97C0B1EDA1EC97F0B1E2A1D297C1B1DBA1EF97F0B1E6A1ED97FCB1E3A1EA97F9B1DAA1EF");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-280135859)) {
                            case -984448701:
                                m897d3 = atm.m897d("B1DBA1EE97F4B1ECA1D797F9B1E2A1D797C1B1E1A1EA97C1B1ECA1DD97F0B1E2A1E397F3B1DBA1ED97F4B1E1A1D597FEB1DBA1D9");
                            case -402836815:
                                m897d = atm.m897d("B1DCA1E997FEB1E2A1E297FFB1D2A1ED97C0B1E0A1D097C0B1EDA1EC97CEB1E2A1E397CFB1E6A1DE97FFB1DBA1ED97CEB1E5A1DD97C0");
                                continue;
                                continue;
                            case 847525274:
                                m897d = atm.m897d("B1EDA1D197FEB1E1A1D397FEB1E2A1E297FAB1D6A1EC97F9B1E3A1D397CEB1DFA1ED97FDB1DEA1EE");
                                continue;
                            case 1973648036:
                                m897d3 = str.contains(C0052e.m1418a(new byte[]{14, 84, 11, 93, -46, -7, 58, 73}, new byte[]{118, 39, 120, 56, -77, -117, 89, 33})) ? atm.m897d("B1DCA1D297FCB1E5A1D297F0B1E2A1DE97F8B1E1A1EF97FFB1E1A1D497F0B1E2A1ED97FCB1DDA1D997FAB1DFA1D097F3B1E1A1D4") : atm.m897d("B1DFA1DE97CEB1E2A1D197F4B1E6A1D497C4B1DAA1EA97FDB1E2A1E297CEB1E1A1E297F4B1DBA1D497FCB1D1A1D597FEB1DB");
                        }
                    }
                    break;
                case -1352684893:
                    m897d = atm.m897d("B1EDA1D497C4B1EDA1DD97C3B1DDA1EF97C4B1D2A1D297FAB1D6A1D197FEB1E6A1EA97C4B1E2A1DD97FCB1E3A1D497CF");
                    sb12 = sb10;
                    continue;
                case -1271865036:
                    treeMap4 = new TreeMap();
                    m897d = atm.m897d("B1DEA1ED97F3B1D6A1E397C2B1E5A1D097C4B1DEA1D497C7B1E3A1D597C3B1E2A1D397C0");
                    continue;
                case -1264748407:
                    String m897d4 = atm.m897d("B1DEA1EF97CEB1E2A1E397FFB1E3A1D497F3B1E6A1ED97F3B1ECA1D097F9B1DBA1D797F4B1D8");
                    while (true) {
                        switch (m897d4.hashCode() ^ 1599689716) {
                            case -950465286:
                                m897d4 = atm.m897d("B1ECA1D397CEB1E1A1D997C4B1E2A1D097FFB1DBA1ED97F8B1E0A1D797F9B1E2");
                            case -906685273:
                                m897d = atm.m897d("B1DDA1EE97C7B1EDA1E997CFB1D8A1DD97CFB1DEA1E297FFB1E2A1ED97F3B1E1A1D597FDB1E2A1D197F0B1ECA1ED");
                                continue;
                            case -797219997:
                                m897d = atm.m897d("B1EDA1D997C3B1DFA1EC97C3B1DBA1D497C0B1DFA1EE97F9B1E2A1EA97C4B1DFA1ED97F8B1E6A1D397F8B1D2A1D297FCB1DAA1D197FAB1D1A1E9");
                                continue;
                                continue;
                            case 12209760:
                                m897d4 = str23.contains(C0052e.m1418a(new byte[]{-110, 96, 118, 78, 65, -51, -20, -126, -39}, new byte[]{116, -61, -10, -88, -12, 70, 8, 58})) ? atm.m897d("B1D2A1E997F0B1DAA1EC97C2B1D1A1EF97FCB1D8A1DD97C4B1E6A1E9") : atm.m897d("B1D6A1ED97C4B1D6A1EE97FEB1D6A1D797C3B1E0A1EE97F0B1DCA1D497FEB1D8A1D997F4B1DAA1D497C0");
                        }
                    }
                    break;
                case -1227706769:
                    str12 = C0277c.m1073b(str10, C0052e.m1418a(new byte[]{112, 121, 91, -125, 56, 45, 99, -98, 61, 123, 69, -105, 96, 102, 48, -61, 103, 123, 69, -105}, new byte[]{88, 70, 103, -66, 78, 76, 15, -21}));
                    m897d = atm.m897d("B1D1A1D997C4B1EDA1D997F3B1E0A1E397C0B1E0A1DD97C2B1E0A1D197CEB1E2");
                    continue;
                case -1226406336:
                    m897d = atm.m897d("B1EDA1D097FFB1EDA1D197F4B1D8A1D597F8B1EDA1DE97C2B1E3A1D997FAB1DBA1EA97C1B1DBA1D597F0B1E2A1DD97C4B1E2A1ED97F8B1DCA1D7");
                    continue;
                case -1217397130:
                    printStream = System.out;
                    m897d = atm.m897d("B1D2A1E397C3B1DDA1EF97C7B1DBA1E997FDB1E2A1D197F0B1EDA1EF97FAB1E3A1D997F9");
                    continue;
                case -1196436412:
                    sb = new StringBuilder();
                    m897d = atm.m897d("B1DCA1D197F9B1E0A1EF97C4B1E2A1D797C0B1DBA1E397C1B1DCA1E997FDB1DCA1ED97FAB1E0A1EC97F3B1EDA1DD97C3B1DDA1E997CFB1D8A1D397C0");
                    continue;
                case -1130113714:
                    sb3 = new StringBuilder();
                    m897d = atm.m897d("B1DCA1E297FFB1ECA1E997CEB1E2A1D197FEB1E6A1ED97FAB1DDA1DD97FCB1D1A1D7");
                    continue;
                case -1128396074:
                    sb13 = new StringBuilder();
                    m897d = atm.m897d("B1DCA1EA97CEB1DEA1EF97FDB1E2A1DD97FFB1E2A1ED97F8B1EDA1E997FCB1E5A1EA97C7B1E1A1DE97FDB1ECA1ED");
                    continue;
                case -1080183827:
                    list.getClass();
                    m897d = atm.m897d("B1DEA1DE97CFB1DCA1D297C4B1DAA1D797F8B1D6A1DE97C7B1DDA1EA97FEB1E2A1DD97FFB1DCA1ED97FEB1D6A1D997C7B1DAA1D597F4B1E0A1D3");
                    continue;
                case -1072569116:
                    sb3.append(C0052e.m1418a(new byte[]{43, -4, -113, 82, 17, 101, 31}, new byte[]{13, -118, -18, 62, 100, 0, 34, 126}));
                    m897d = atm.m897d("B1DBA1D197FDB1D2A1D597C0B1ECA1E397F3B1D1A1EC97CFB1D6A1ED97FEB1E2A1D597FFB1E1");
                    continue;
                case -1058510589:
                    str5 = C0277c.m1073b(str3, C0052e.m1418a(new byte[]{-98, 96, 48, -35, -123, -111, 26, -68, -45, 98, 46, -55, -35, -38, 73, -31, -119, 98, 46, -55}, new byte[]{-74, 95, 12, -32, -13, -16, 118, -55}));
                    m897d = atm.m897d("B1E6A1EA97FFB1E0A1E297FDB1E2A1EA97C3B1DBA1D497C0B1D2A1ED97C0B1DDA1D097FFB1E0A1D0");
                    continue;
                case -1032008856:
                    sb6.append(C0052e.m1418a(new byte[]{-24, 51, -87, 17, 118, -124, 9, 43}, new byte[]{-98, 82, -59, 100, 19, -92, 41, 11}));
                    m897d = atm.m897d("B1D1A1D497C0B1E2A1EE97C4B1ECA1E397FDB1D6A1E397C1B1DFA1ED97CFB1D8A1D497FAB1D2A1D0");
                    continue;
                case -889546126:
                    sb10 = C0424a.m635a(str);
                    m897d = atm.m897d("B1E3A1EE97C4B1D6A1D797FEB1E0A1DD97F0B1E2A1D397FFB1DDA1E997C4B1EDA1E997C7B1DAA1D297C3B1DFA1DD97F0B1DB");
                    continue;
                case -844059143:
                    sb3.append(str7);
                    m897d = atm.m897d("B1DDA1EE97FDB1E2A1D097F0B1DFA1D197C2B1E1A1D097C1B1ECA1ED97FFB1E6A1D797FAB1DFA1D097C4B1D6A1E297FAB1E0A1E997C0B1E0A1EC97FEB1E2");
                    continue;
                case -825323576:
                    i5 = i6 + 1;
                    m897d = atm.m897d("B1D2A1D397FCB1E1A1DD97FDB1E2A1E997FDB1DCA1D597FFB1D6A1D197FDB1E2");
                    continue;
                case -800294598:
                    C0629f.m178g(sb3.toString(), m287a(), treeMap2);
                    m897d = atm.m897d("B1D2A1EA97FCB1DDA1D397C0B1E2A1D097CFB1DCA1ED97F0B1DDA1D297FFB1E2A1DE97C3B1DEA1DD97C1B1DCA1EA");
                    continue;
                case -766457085:
                    m897d = atm.m897d("B1DBA1D497C4B1DAA1EC97F8B1DAA1EC97FEB1E1A1D497C0B1E2A1EF97FAB1D2");
                    str15 = (String) it2.next();
                    continue;
                case -756666792:
                    str14 = C0277c.m1073b(str10, C0052e.m1418a(new byte[]{Byte.MAX_VALUE, 39, 14, 40, 87, 107, -27, -72, 35, 68, 97, 55, 29, 25, -47, -10, 39, 112, 66, 73, 103, 110, -67, -11, 104, 37, 20, 126, 81, 60, -65, -1, 126}, new byte[]{87, 24, 50, 21, 52, 69, -126, -35}));
                    m897d = atm.m897d("B1DEA1D397FFB1E2A1EA97F9B1DDA1E397F0B1E2A1E397C0B1DFA1DD97C2B1E3A1DE97F3B1D2A1D097CF");
                    continue;
                case -725045857:
                    m897d = atm.m897d("B1E0A1EC97CFB1D1A1E297F0B1E6A1D597F0B1ECA1ED97F9B1E6A1DD97F0B1E2A1ED97FDB1EDA1D297CFB1D2A1ED");
                    i6 = i4;
                    continue;
                case -655621114:
                    String m897d5 = atm.m897d("B1DBA1D297FDB1D8A1DE97F3B1E3A1E997C4B1E2A1D497C2B1DEA1EF97C2B1DCA1ED97F4B1E3A1EE97C0B1DDA1E297C2B1D6A1D397FAB1DB");
                    while (true) {
                        switch (m897d5.hashCode() ^ (-1870853781)) {
                            case 591120853:
                                m897d5 = it3.hasNext() ? atm.m897d("B1DAA1D997C4B1DAA1D797F0B1D8A1D997F9B1ECA1ED97C7B1DCA1EF97C4B1EDA1D097C0") : atm.m897d("B1DFA1E297FEB1E6A1ED97F9B1DEA1D397F9B1DAA1D797F0B1ECA1ED97FFB1E2A1D797C0B1DFA1ED97FDB1E1A1D9");
                            case 709043477:
                                m897d5 = atm.m897d("B1D1A1E297F4B1E0A1DE97F3B1DFA1EF97FDB1E2A1E997C0B1E6A1ED97C2B1E1A1E397C7B1D6A1D097C0B1E3A1D797C0");
                            case 1729902431:
                                m897d = atm.m897d("B1D6A1E397F0B1D1A1D297CEB1DBA1E297C7B1DEA1D297C4B1EDA1D397F0B1D2");
                                continue;
                            case 1885452265:
                                break;
                        }
                    }
                    break;
                case -610902116:
                    String m897d6 = atm.m897d("B1DFA1EC97C7B1E1A1DD97C0B1E2A1D497F9B1D2A1ED97FDB1DFA1E397F0B1E5A1EF97C4B1DDA1D397C2B1D1A1DD97C0");
                    while (true) {
                        switch (m897d6.hashCode() ^ 450856504) {
                            case -1831242264:
                                m897d = atm.m897d("B1ECA1D597F3B1E2A1EF97C3B1E5A1DD97F3B1E5A1EC97CFB1DEA1E997F9B1E2A1E297C1B1E6A1ED");
                                continue;
                            case -1654610049:
                                m897d6 = str2.contains(C0052e.m1418a(new byte[]{112, 45, -9, -38, 102, -2, -7, -120, 13, 104, -11, -77, 30, -20, -85, -47, 10, 58, -68, -112, 124, -77, -103, -100, 121, 60, -40, -41, 85, -31, -10, -97, 27, 103, -7, -74}, new byte[]{-106, Byte.MIN_VALUE, 84, 63, -6, 86, 17, 55})) ? atm.m897d("B1DAA1EF97C4B1DEA1EF97F8B1D2A1E997C0B1E2A1ED97FCB1D2A1D297FEB1D8A1E397FEB1E2A1E297F0B1E5A1E397C3B1DEA1DD97F3") : atm.m897d("B1DDA1E297FCB1E1A1EF97C1B1D1A1ED97C3B1E0A1EE97FCB1DCA1D797C2B1D6A1D497C7");
                            case -1568744415:
                                m897d6 = atm.m897d("B1D2A1E297FEB1E2A1ED97F4B1E2A1ED97C4B1DAA1E997C4B1ECA1D497C0B1ECA1D597FEB1E2");
                            case 547133375:
                                m897d = atm.m897d("B1E6A1D497CFB1E3A1EC97CFB1DFA1D797CEB1D1A1E297CEB1E2A1DE97C7B1DCA1ED97C7B1DBA1EA97F0B1E2A1E997F0B1ECA1DD97C0");
                                continue;
                                continue;
                        }
                    }
                    break;
                case -583536201:
                    sb8.append(C0052e.m1418a(new byte[]{-51, -7, -59, -14, 79}, new byte[]{-21, -110, -96, -117, 114, 12, 41, -46}));
                    m897d = atm.m897d("B1E3A1EF97CEB1D6A1DE97F0B1E2A1ED97FAB1E1A1D497C7B1DBA1D997FCB1E6");
                    continue;
                case -560744630:
                    sb8.append(f1095p);
                    m897d = atm.m897d("B1E2A1DD97FFB1DCA1E997FCB1E6A1E997C3B1DDA1D397CFB1DDA1D5");
                    continue;
                case -514141590:
                    f1094o = TextUtils.join(C0052e.m1418a(new byte[]{56}, new byte[]{3, -58, -78, 103, 65, 13, -85, -126}), (Iterable) entry.getValue());
                    m897d = atm.m897d("B1D6A1EA97F8B1D8A1E997C0B1E2A1D097FAB1DCA1ED97F4B1DFA1D997F8B1D6A1D4");
                    continue;
                case -463926468:
                    sb5.append(str11);
                    m897d = atm.m897d("B1D2A1D097F9B1E2A1EC97F4B1DDA1D297C7B1E3A1D097F9B1DFA1ED97F9B1ECA1E997C0B1D2A1D797C7B1DFA1EA97F3");
                    continue;
                case -429613213:
                    sb9.append(f1094o);
                    m897d = atm.m897d("B1D8A1D297FAB1E0A1EA97F9B1ECA1EE97FEB1E2A1EE97F9B1EDA1D497F8B1D1");
                    continue;
                case -418586548:
                    str7 = C0277c.m1073b(str3, C0052e.m1418a(new byte[]{50, 117, 117, 82, -65, 30, -117, 51, 110, 22, 26, 77, -11, 30, -58, 105, 50, 117, 116, 77, -11}, new byte[]{26, 74, 73, 111, -36, 48, -20, 86}));
                    m897d = atm.m897d("B1D8A1DE97FDB1E2A1ED97F9B1DEA1EF97F0B1E2A1DD97FFB1DFA1DE97C0B1E3A1D097C2B1D1A1EE97F9B1E6A1E997C4B1DBA1EF97C7B1DE");
                    continue;
                case -399092036:
                    C0629f.m178g(sb8.toString(), m287a(), treeMap3);
                    m897d = atm.m897d("B1D2A1D397FFB1DDA1D197FEB1ECA1EC97FCB1DBA1E397C0B1DDA1E397C7");
                    continue;
                case -365558233:
                    m897d = atm.m897d("B1E6A1D797C3B1E5A1EA97C2B1DFA1EC97CEB1D8A1D197C2B1DD");
                    i3 = i2;
                    continue;
                case -324564889:
                    sb11 = C0424a.m635a(str);
                    m897d = atm.m897d("B1DCA1D797C4B1DFA1E397F4B1D8A1D297F0B1E2A1ED97FAB1D2A1ED97FAB1E6A1EF");
                    continue;
                case -323761003:
                    sb2 = new StringBuilder();
                    m897d = atm.m897d("B1DBA1D797C3B1D8A1E997F0B1E6A1DE97F3B1D2A1D997C4B1E2A1E997C1B1DEA1D197FFB1E3A1EC97F8B1DFA1ED97FCB1DCA1DE97CFB1DBA1ED");
                    continue;
                case -288241617:
                    sb8.append(str11);
                    m897d = atm.m897d("B1E6A1EA97FDB1DEA1E997C1B1E5A1D097C4B1DFA1D197CEB1E0A1DD97CE");
                    continue;
                case -242261517:
                    m897d = atm.m897d("B1DAA1D497FDB1E0A1D797FFB1D6A1E397F9B1E2A1D597FFB1EDA1EA97CEB1ECA1ED97F9B1ECA1D5");
                    i3 = i;
                    continue;
                case -233751395:
                    m897d = atm.m897d("B1E0A1EC97CFB1D1A1E297F0B1E6A1D597F0B1ECA1ED97F9B1E6A1DD97F0B1E2A1ED97FDB1EDA1D297CFB1D2A1ED");
                    continue;
                case -231080136:
                    m897d = atm.m897d("B1D1A1D597FDB1DCA1EF97FDB1E2A1D297F4B1E3A1E997F3B1D8A1D997C0");
                    str21 = str19;
                    continue;
                case -159348422:
                    str18 = C0277c.m1073b(str17, C0052e.m1418a(new byte[]{-98, -55, 67, 21, -94, 74, -97, -88, -48, -53, 86, 6, -22, 1, -64, -10, -117, -44, 86}, new byte[]{-74, -10, Byte.MAX_VALUE, 40, -64, 62, -24, -55}));
                    m897d = atm.m897d("B1DFA1E297F4B1DAA1DD97FFB1E2A1E397CFB1DDA1D297C4B1DCA1DD97F3B1E3A1EE97F8B1DFA1EE97F9");
                    continue;
                case -151965428:
                    sb8.append(str14);
                    m897d = atm.m897d("B1E1A1D097CEB1DCA1D297C4B1E2A1D397C3B1D1A1D497FDB1DCA1ED97F3B1DDA1D197FEB1E6A1E997F0B1EDA1D297C3B1DDA1D397C0B1D6A1EF97FDB1E2");
                    continue;
                case -125345703:
                    m897d = atm.m897d("B1E5A1D297F3B1DFA1D097F0B1DAA1E997F0B1ECA1E397C4B1E2A1EE97C1B1E2A1ED");
                    str21 = str20;
                    continue;
                case -116053100:
                    sb6 = new StringBuilder();
                    m897d = atm.m897d("B1DEA1D397C2B1D2A1DD97FAB1D8A1E397C0B1ECA1EC97FFB1E3A1EC97F8B1DFA1EF97FDB1E1A1EE97FEB1DFA1D597CEB1E2");
                    continue;
                case -109578604:
                    it = treeMap2.entrySet().iterator();
                    m897d = atm.m897d("B1D1A1EC97CEB1E2A1D097F4B1ECA1ED97C4B1DBA1DE97FCB1E5A1E397C0B1DBA1D097F0B1E2");
                    continue;
                case -90036104:
                    sb13.append(C0052e.m1418a(new byte[]{-104}, new byte[]{-93, 96, 109, -87, 71, 102, -54, -102}));
                    m897d = atm.m897d("B1E5A1D197FFB1E1A1D297F0B1D1A1D297F8B1DBA1EA97CEB1E2A1ED97C4B1DFA1D497FFB1DCA1D597FCB1E1A1D497C0B1E2");
                    continue;
                case -84319962:
                    it3 = list2.iterator();
                    m897d = atm.m897d("B1EDA1D097FFB1EDA1D197F4B1D8A1D597F8B1EDA1DE97C2B1E3A1D997FAB1DBA1EA97C1B1DBA1D597F0B1E2A1DD97C4B1E2A1ED97F8B1DCA1D7");
                    continue;
                case 17793557:
                    sb3.append(f1095p);
                    m897d = atm.m897d("B1DDA1E997F0B1D6A1E997C2B1E2A1D297F9B1E2A1D397FCB1E2A1ED97F3B1E6A1D797F0B1D8A1D597F3B1DAA1DD97C0B1ECA1DD97C7");
                    continue;
                case 27175894:
                    m897d = atm.m897d("B1EDA1D097FAB1DFA1D997FCB1DFA1EF97C7B1D2A1DD97FEB1DAA1DD97FDB1D8A1D0");
                    str26 = str25;
                    continue;
                case 62553767:
                    sb4 = new StringBuilder();
                    m897d = atm.m897d("B1EDA1D797FEB1E2A1DE97FDB1EDA1E997C4B1DFA1ED97C0B1E0A1D097CEB1DDA1DD97C1B1DEA1D597C2B1E3A1D497C0B1E3A1EF97C0");
                    continue;
                case 86675097:
                    i2 = i3 + 1;
                    m897d = atm.m897d("B1DAA1D797F9B1D1A1D797CEB1E5A1D397C3B1DBA1E297FDB1E2A1D397F8B1DFA1EC97FEB1E0A1D397FDB1EDA1E297F4B1D2A1ED97F9B1ECA1D097C0");
                    continue;
                case 95938888:
                    m897d = atm.m897d("B1D6A1DE97C4B1E2A1D397F4B1D1A1EA97FCB1DFA1ED97FDB1DEA1EA97F4B1D6A1EF97FDB1E2A1DE");
                    i6 = i5;
                    continue;
                case 112665132:
                    sb5.append(C0052e.m1418a(new byte[]{102, -120, -10, -31, 117, 120}, new byte[]{13, -19, -113, -63, 85, 88, 120, -5}));
                    m897d = atm.m897d("B1E5A1EE97F4B1E1A1EA97C0B1DFA1EF97CEB1DCA1E997C4B1E2A1EC97F9B1DCA1ED97FDB1D1A1D9");
                    continue;
                case 124320563:
                    return str26;
                case 211162674:
                    m897d = atm.m897d("B1DEA1E997FEB1DCA1DD97C0B1E2A1D797FFB1DBA1D197CEB1E6A1ED97C7B1E2A1EF");
                    continue;
                case 213448193:
                    treeMap2 = new TreeMap();
                    m897d = atm.m897d("B1E5A1D597CEB1DDA1EE97F9B1E3A1E997C3B1D1A1E397FFB1E1A1EC97F0B1DFA1EF97F0");
                    continue;
                case 272441874:
                    sb8.append(str13);
                    m897d = atm.m897d("B1D6A1EA97C7B1E1A1D797CEB1D2A1D097F9B1D6A1D097C7B1DCA1D597C3B1DBA1D797C2");
                    continue;
                case 418128537:
                    str16 = C0629f.m178g(str, m287a(), treeMap3);
                    m897d = atm.m897d("B1E6A1EA97F0B1EDA1D497FEB1E2A1D397F4B1DFA1EA97F8B1D6A1ED97C2B1D6");
                    continue;
                case 420004410:
                    treeMap = new TreeMap();
                    m897d = atm.m897d("B1D1A1E397CEB1E2A1D397FCB1D2A1D497FDB1E3A1E397F4B1ECA1EF97F8B1DFA1ED");
                    continue;
                case 427461084:
                    sb7.append(Integer.parseInt(String.valueOf(Character.codePointAt(str12, i6))) + 1);
                    m897d = atm.m897d("B1DDA1E297FEB1E1A1EF97FFB1E1A1EE97C4B1EDA1EC97C0B1D8A1EC97CFB1DCA1D597CF");
                    continue;
                case 444500477:
                    sb13.append(f1094o);
                    m897d = atm.m897d("B1EDA1D797C7B1D2A1D397C4B1E3A1D397F0B1E2A1D197C7B1D8A1D997F8B1E5A1EF97FFB1E6A1ED97F8B1D8A1DD97F4B1E3A1D397F0B1E0A1D4");
                    continue;
                case 485330184:
                    m897d = atm.m897d("B1DBA1D797FEB1E5A1EA97C1B1D8A1EA97FFB1D8A1EC97F0B1E2A1DE97F4B1DA");
                    str26 = str17;
                    continue;
                case 490932505:
                    str8 = C0629f.m178g(str, m287a(), treeMap2);
                    m897d = atm.m897d("B1D6A1E397CEB1E0A1EF97FFB1D6A1D297FDB1D1A1D797C3B1ECA1EF97C4B1DBA1EA97C2B1DCA1E297FC");
                    continue;
                case 506036380:
                    sb6.append(str12);
                    m897d = atm.m897d("B1E1A1ED97CEB1E2A1D397FAB1D2A1ED97C0B1DFA1ED97C2B1EDA1D997C7B1D1A1D797FDB1E6A1D497FEB1EDA1D397C0");
                    continue;
                case 554300323:
                    String m897d7 = atm.m897d("B1D1A1ED97FDB1E2A1D097CFB1ECA1D297CFB1ECA1ED97CEB1E1A1D197C1B1DDA1E997F0B1DFA1EA97C2B1E1A1D997FDB1DFA1D397C0B1D2A1D397F4");
                    while (true) {
                        switch (m897d7.hashCode() ^ 117070133) {
                            case -1541392364:
                                m897d = atm.m897d("B1E2A1D197F9B1E3A1D097F9B1E2A1D597FDB1E2A1D997C2B1DBA1EF97C3B1D8A1D497C7B1E0A1D997F3B1DBA1EF97F8");
                                continue;
                            case -629624470:
                                break;
                            case 210604539:
                                m897d7 = str17.contains(C0052e.m1418a(new byte[]{69, -109, 54, 77, 41, 62, 64, 49, 14}, new byte[]{-93, 48, -74, -85, -100, -75, -92, -119})) ? atm.m897d("B1D8A1EF97F9B1E2A1D297FDB1E3A1DE97C2B1E2A1ED97F3B1D6A1D297FDB1DCA1D997C4B1E2A1E997F9B1D1") : atm.m897d("B1DBA1DE97C0B1D6A1E997FEB1E2A1E297FAB1D8A1DE97F8B1DAA1D297FFB1D2A1E297C4B1E0A1DE97CFB1E6");
                            case 2132501919:
                                m897d7 = atm.m897d("B1DAA1D497F9B1DDA1EC97C7B1E1A1E397FDB1E2A1DE97FAB1E2A1D2");
                        }
                    }
                    break;
                case 568037638:
                    m897d = atm.m897d("B1DDA1D497CEB1E1A1EE97CEB1E5A1DE97F0B1E2A1E397CEB1D6A1D497C0B1E3A1D997CEB1E0A1D497C7B1E6A1D197FD");
                    continue;
                case 577472560:
                    sb.append(C0277c.m1073b(str2, C0052e.m1418a(new byte[]{115, -36, 57, 53, 55, 94, 84, 109, 121, -54, 43, 34, 123, 4, 8, 109, 121, -54}, new byte[]{91, -29, 5, 8, 68, 44, 55, 80})));
                    m897d = atm.m897d("B1DBA1E297FAB1D1A1E397C7B1D2A1DD97C4B1E2A1E297C3B1E6A1ED97F3B1DDA1D297FFB1DCA1D097C2B1DFA1D597CFB1DFA1D397C4B1E3A1ED97C0");
                    continue;
                case 594329590:
                    sb3.append(str4);
                    m897d = atm.m897d("B1E0A1D297FEB1DAA1DD97F9B1DDA1E997C0B1E2A1D797CFB1DDA1E397F4B1E2");
                    continue;
                case 606574018:
                    m897d = atm.m897d("B1D6A1EA97FEB1E2A1D997C7B1DBA1ED97CFB1D6A1D997FAB1E5A1D297C1B1DDA1ED97F3B1DDA1DD97CFB1E5A1EC97F3B1DFA1D597FEB1DBA1D097C0");
                    str26 = str25;
                    continue;
                case 636033787:
                    sb3.append(str6);
                    m897d = atm.m897d("B1DFA1D997CEB1D2A1DD97FFB1DFA1EC97C4B1D1A1E997C0B1ECA1DD97CEB1D8A1EF97C1B1E6A1D097CFB1EDA1E997FFB1E2A1D997CF");
                    continue;
                case 642760121:
                    m897d = atm.m897d("B1E1A1D397C4B1DBA1D997F0B1E2A1EF97CFB1E6A1D497FEB1DFA1ED97F9B1ECA1DD97C0");
                    continue;
                case 690590825:
                    sb8.append(C0052e.m1418a(new byte[]{-74, -109, -90, 3, 14, 106, 5}, new byte[]{-112, -27, -57, 111, 123, 15, 56, -14}));
                    m897d = atm.m897d("B1DDA1D497F0B1DAA1EE97F9B1E2A1D497FCB1D1A1D297CFB1DDA1E297FEB1E2A1D297CFB1E2A1ED97C2B1DEA1D2");
                    continue;
                case 750584411:
                    String m897d8 = atm.m897d("B1D2A1D097F0B1DFA1EC97CEB1E2A1D397C7B1DFA1ED97C7B1ECA1D997C0B1DCA1E997C0B1E2A1E997FFB1E2A1E397C2B1E2A1ED97C4B1E5");
                    while (true) {
                        switch (m897d8.hashCode() ^ (-104136398)) {
                            case -1516649028:
                                m897d8 = atm.m897d("B1D1A1ED97F0B1E2A1EF97C3B1E0A1DE97CEB1D8A1ED97C2B1DCA1ED97FFB1EC");
                            case -1065033319:
                                m897d = atm.m897d("B1DBA1D797C7B1E5A1D297C1B1E6A1E997C4B1E2A1D097FFB1DAA1EC97FFB1DBA1ED97FFB1DDA1D497C0");
                                continue;
                                continue;
                            case 753660332:
                                m897d = atm.m897d("B1D8A1E397C1B1ECA1DD97F9B1E2A1D397FCB1E1A1E997C0B1DFA1ED97F3B1E0A1D397C0B1EDA1E397C7B1DDA1EE97F4");
                                continue;
                            case 1304834556:
                                m897d8 = !((String) entry.getKey()).equals(C0052e.m1418a(new byte[]{-11, -92, 118, 126, -111, 85, -45, -49, -17, -92}, new byte[]{-122, -63, 2, 83, -14, 58, -68, -92})) ? atm.m897d("B1E5A1E297F3B1D8A1D297C0B1E2A1EF97C2B1DEA1D197F4B1EDA1D197C4B1DFA1ED97F4B1DDA1D597F9B1E2A1ED97C0") : atm.m897d("B1DEA1EA97FFB1D2A1E297F8B1DAA1E297F0B1D1A1D797FAB1E1A1D197C4B1DBA1ED97C3B1DCA1D997F8B1E2A1EC");
                        }
                    }
                    break;
                case 752424329:
                    sb13.append(str27.split(C0052e.m1418a(new byte[]{-127}, new byte[]{-70, 115, -98, -104, -114, -95, -117, -114}))[0]);
                    m897d = atm.m897d("B1E6A1D997C1B1DCA1D597FFB1D8A1DD97FEB1E2A1E397C3B1E1A1E997FEB1D2A1ED97C1B1DCA1ED97CEB1ECA1E397C0");
                    continue;
                case 778314331:
                    str11 = C0277c.m1073b(str10, C0052e.m1418a(new byte[]{97, 39, 37, 25, 102, 35, 67, 108, 107, 49, 55, 14, 50, 110, 5, 108, 107, 49}, new byte[]{73, 24, 25, 36, 13, 70, 58, 81}));
                    m897d = atm.m897d("B1DCA1D197FCB1D1A1D597FDB1E2A1D397C3B1DEA1EF97F4B1D1A1EE97F4B1D1A1EC97FD");
                    continue;
                case 811156447:
                    String m897d9 = atm.m897d("B1DBA1E997C7B1E2A1DD97C0B1E1A1D097FEB1E2A1EF97CFB1E1A1E297CEB1E1A1D197CEB1D2A1ED97F8B1D1A1D9");
                    while (true) {
                        switch (m897d9.hashCode() ^ 727916012) {
                            case -404046480:
                                m897d = atm.m897d("B1D2A1D397C7B1EDA1EA97CEB1DAA1D997F9B1E6A1D197C0B1E3A1D997F3B1DAA1E397F3B1DFA1DD97C0B1DBA1EA97FE");
                                continue;
                            case 1004678189:
                                m897d9 = it.hasNext() ? atm.m897d("B1DEA1D097FFB1E5A1E997C0B1EDA1EF97F4B1E3A1EF97F9B1D2A1EE97FDB1DBA1EF97F4B1E3A1E397F8B1DCA1D397C0B1DBA1D597FDB1E2") : atm.m897d("B1D2A1D397F0B1E2A1D997C4B1E6A1E997F4B1D8A1D197C4B1E6A1ED97F3B1E3A1D2");
                            case 1065723389:
                                m897d = atm.m897d("B1D6A1EA97F8B1D8A1E997C0B1E2A1D097FAB1DCA1ED97F4B1DFA1D997F8B1D6A1D4");
                                continue;
                                continue;
                            case 1594507064:
                                m897d9 = atm.m897d("B1D8A1E997C4B1E6A1D197C4B1DEA1ED97C0B1EDA1D097FEB1DCA1E297F3B1DCA1EE97FDB1E2");
                        }
                    }
                    break;
                case 825116381:
                    sb7 = new StringBuilder();
                    m897d = atm.m897d("B1D8A1D997CFB1DBA1E297C7B1EDA1EC97C1B1E5A1D397C0B1E1A1EF97C7B1D6A1E297C0B1E2A1EC97FEB1E6A1ED");
                    continue;
                case 837076148:
                    m897d = atm.m897d("B1EDA1D997C3B1DFA1EC97C3B1DBA1D497C0B1DFA1EE97F9B1E2A1EA97C4B1DFA1ED97F8B1E6A1D397F8B1D2A1D297FCB1DAA1D197FAB1D1A1E9");
                    str25 = str24;
                    continue;
                case 858040270:
                    String m897d10 = atm.m897d("B1DCA1D397C0B1E2A1E397C7B1E5A1D797FEB1DBA1ED97F8B1E3A1EE97C2B1E6A1E9");
                    while (true) {
                        switch (m897d10.hashCode() ^ 1452325706) {
                            case -1084002869:
                                m897d10 = atm.m897d("B1E0A1D197FEB1E3A1D197F0B1E2A1D597F3B1E6A1D297F3B1ECA1ED97FAB1DDA1EC97C1B1DFA1DD97C0B1DDA1ED97CEB1D2A1D597FE");
                            case -957769501:
                                m897d10 = i6 <= str12.length() + (-1) ? atm.m897d("B1D6A1ED97FAB1E5A1D397F0B1E2A1D797FDB1DFA1ED97C1B1E6A1ED97FFB1E6A1E997F8B1E0A1D397C0") : atm.m897d("B1D8A1ED97F0B1E2A1E997C3B1DBA1EF97C0B1DFA1ED97C1B1DDA1ED97CFB1DCA1E397C0B1E3A1E297FAB1DDA1E397FAB1DDA1E397C7");
                            case 53158387:
                                m897d = atm.m897d("B1DBA1EF97CEB1E2A1D397C1B1DFA1ED97C2B1E2A1EC97FEB1E5A1D797FEB1D1A1DE97F3B1EDA1D797F4B1D2A1ED");
                                continue;
                                continue;
                            case 1634539161:
                                m897d = atm.m897d("B1DEA1D197FDB1E2A1EC97C1B1DBA1ED97FDB1DEA1D297F4B1E0A1E397FCB1D1A1DD97C0B1ECA1E397FE");
                                continue;
                        }
                    }
                    break;
                case 942587887:
                    m897d = atm.m897d("B1D1A1D297CEB1D8A1EE97C4B1E3A1EA97C0B1DDA1EC97CEB1D8A1EF97F8B1E3A1EA97FFB1D6A1D097C1");
                    list = (List) treeMap3.get(C0052e.m1418a(new byte[]{-41, -13, 117, 100, 16, -124, -58, 66, -51, -13}, new byte[]{-92, -106, 1, 73, 115, -21, -87, 41}));
                    continue;
                case 953704617:
                    str19 = C0052e.m1418a(new byte[]{49, 108, -8, 102, -101, -69, -107}, new byte[]{23, 14, -116, 17, -6, -35, -88, 80});
                    m897d = atm.m897d("B1DAA1E397F3B1D8A1D597C2B1E6A1D997C0B1E2A1D497FAB1E1A1EC97F3B1D8A1EC97FDB1DCA1D497F9B1DDA1D597F0B1DEA1EF97FDB1DC");
                    continue;
                case 956555620:
                    str13 = C0277c.m1072c(sb7.toString(), C0620d.f1187b);
                    m897d = atm.m897d("B1ECA1E297FEB1DDA1D297CFB1DCA1D197C0B1E1A1D797C4B1E2A1E297FFB1E2A1ED97F4B1E2A1D197C3B1D8A1D597C1B1E1A1E2");
                    continue;
                case 961467553:
                    sb.append(f1095p);
                    m897d = atm.m897d("B1E3A1D097F3B1E0A1D297C1B1E5A1EC97F3B1DEA1E397F9B1DFA1EE97F8B1D6A1D097C0B1DAA1EF97FEB1E2A1EE97CFB1E3");
                    continue;
                case 1042795314:
                    sb4.append(f1095p);
                    m897d = atm.m897d("B1E2A1EE97C0B1E2A1E397F9B1D2A1D297F4B1DFA1ED97C0B1D6A1D497C0B1D1A1D997FAB1D6A1E997CEB1D2A1D497C1B1DEA1D7");
                    continue;
                case 1107036460:
                    printStream.println(sb5.toString());
                    m897d = atm.m897d("B1DAA1E397CEB1E2A1D797F8B1D2A1D297C1B1DCA1ED97C2B1D8A1DD97FDB1DAA1EF");
                    continue;
                case 1118546192:
                    sb9.append(str15.split(C0052e.m1418a(new byte[]{50}, new byte[]{9, -35, 10, -57, 69, 48, 62, -10}))[0]);
                    m897d = atm.m897d("B1DEA1D397C2B1DFA1D397C1B1D2A1D397F9B1E2A1D797F8B1E1A1D397FAB1E1A1D397F8B1D1A1D997C0B1E2A1D597C4B1DDA1E297CEB1E1");
                    continue;
                case 1127645920:
                    sb12.append(str21);
                    m897d = atm.m897d("B1DBA1EA97FDB1E2A1E997C2B1ECA1ED97FDB1E3A1E297FEB1D8A1E397CFB1DAA1EC97F4B1DAA1D097F4B1D1A1EF");
                    continue;
                case 1173282503:
                    printStream2.println(sb6.toString());
                    m897d = atm.m897d("B1E2A1E297F0B1D6A1D397CEB1D6A1D197F0B1E2A1E297CEB1E6A1EF97FAB1DFA1ED97F0B1DFA1D497C0B1DDA1D497FCB1ECA1D797FDB1E2A1E997FFB1E5");
                    continue;
                case 1288409218:
                    sb9.append(C0052e.m1418a(new byte[]{-7}, new byte[]{-62, -71, Byte.MAX_VALUE, 47, 40, 65, 112, 77}));
                    m897d = atm.m897d("B1EDA1EF97C0B1ECA1D197C7B1DAA1D397FEB1DEA1E997C0B1E2A1D197FFB1D8A1D797C0B1DDA1D097F3");
                    continue;
                case 1352686105:
                    m897d = atm.m897d("B1E5A1D297F3B1DFA1D097F0B1DAA1E997F0B1ECA1E397C4B1E2A1EE97C1B1E2A1ED");
                    continue;
                case 1405154230:
                    String m897d11 = atm.m897d("B1EDA1D997F8B1E2A1EA97F9B1E6A1EA97F4B1DBA1D797CFB1D6A1D997C4B1E2A1EC97F3B1DFA1ED");
                    while (true) {
                        switch (m897d11.hashCode() ^ 1771500103) {
                            case -1354096906:
                                m897d11 = atm.m897d("B1D1A1D097C2B1ECA1EA97C4B1E2A1ED97FDB1E2A1E297C0B1ECA1ED97FDB1DCA1E297FDB1E3A1EA97CEB1E1A1DD97CEB1DBA1DD");
                            case -1118188038:
                                m897d11 = ((String) entry.getKey()).equals(C0052e.m1418a(new byte[]{-125, -57, -125, -66, -56, -64, -78, 52, -71, -57}, new byte[]{-48, -94, -9, -109, -117, -81, -35, 95})) ? atm.m897d("B1DFA1D597C0B1EDA1D397FEB1E1A1D797C3B1E3A1EE97C7B1E6A1ED97F0B1E2A1E297FCB1E2A1ED97F4B1DEA1DE97F8B1E6A1D997F0B1DA") : atm.m897d("B1DEA1DD97F3B1EDA1E997FAB1EDA1D197C2B1DEA1EA97C0B1DDA1D097FCB1DCA1EA97FDB1E2");
                            case 188932203:
                                m897d = atm.m897d("B1D1A1EC97CEB1E2A1D097F4B1ECA1ED97C4B1DBA1DE97FCB1E5A1E397C0B1DBA1D097F0B1E2");
                                continue;
                                continue;
                            case 2071620223:
                                m897d = atm.m897d("B1DBA1D797C7B1E5A1D297C1B1E6A1E997C4B1E2A1D097FFB1DAA1EC97FFB1DBA1ED97FFB1DDA1D497C0");
                                continue;
                        }
                    }
                    break;
                case 1567768692:
                    str22 = sb12.toString();
                    m897d = atm.m897d("B1ECA1DD97F4B1E6A1D797FDB1E2A1D097C4B1DDA1ED97FEB1E2A1E997C2B1DA");
                    continue;
                case 1593083455:
                    String m897d12 = atm.m897d("B1ECA1D797C2B1E3A1D197C4B1D8A1EC97FEB1DFA1D997F4B1DFA1EE97FDB1DFA1D297F9");
                    while (true) {
                        switch (m897d12.hashCode() ^ (-2030994241)) {
                            case -242502986:
                                m897d12 = i3 < str5.length() ? atm.m897d("B1D2A1ED97C1B1D8A1EF97C4B1D2A1ED97FEB1E1A1D397CEB1DEA1EA97FEB1E2A1DD97F9B1DEA1DE97C2B1E2A1D597F3B1E5") : atm.m897d("B1D2A1D497C0B1E6A1D597FDB1D6A1D397FFB1ECA1EF97F0B1D1A1D797C4B1DFA1E297F3B1ECA1EF97FDB1E1A1D497FFB1E2A1D497FDB1E6");
                            case 794584454:
                                m897d12 = atm.m897d("B1DFA1D197C0B1D1A1D097FCB1D2A1EF97C1B1E1A1E297CEB1D6A1E297F3B1ECA1D297C4B1DDA1EE");
                            case 800065266:
                                m897d = atm.m897d("B1DEA1D497C4B1DFA1D397C7B1EDA1DE97F9B1D2A1EE97FAB1E2A1D797C2");
                                continue;
                                continue;
                            case 1211063964:
                                m897d = atm.m897d("B1D1A1D797F9B1ECA1D797FDB1E2A1D197C1B1DBA1EF97F9B1E3A1E297C4B1E6A1D497C3B1D6A1DE97F9B1EC");
                                continue;
                        }
                    }
                    break;
                case 1666399505:
                    str4 = C0277c.m1073b(str3, C0052e.m1418a(new byte[]{21, -36, -40, -3, -80, -54, 115, 93, 86, -122, -99, -3, -28, -126, 47, 87, 2, -53, -37, -3, -28, -126}, new byte[]{61, -29, -28, -64, -58, -85, 1, 125}));
                    m897d = atm.m897d("B1DBA1D297FDB1DFA1D297C7B1D1A1D497C4B1E2A1D097FAB1E2A1EE97C4B1DFA1ED97F8B1E6A1D597FFB1ECA1E3");
                    continue;
                case 1792682739:
                    sb12.append(str18);
                    m897d = atm.m897d("B1D8A1EA97FEB1DBA1D997CFB1ECA1D397C4B1E2A1E397C4B1E2A1D497CEB1E2A1EF97C4B1E6A1D797F3B1DCA1ED");
                    continue;
                case 1843921658:
                    String m897d13 = atm.m897d("B1DEA1E997CEB1E6A1DE97F9B1E6A1D997C7B1EDA1D097C1B1DDA1D097C7B1D1A1DE97C1B1EDA1DE97F9B1E2A1DD97C4B1E0A1EE97FAB1E2A1ED");
                    while (true) {
                        switch (m897d13.hashCode() ^ 2095754593) {
                            case 787486566:
                                m897d13 = atm.m897d("B1E3A1D397C4B1DDA1EA97F8B1DBA1D097F9B1E2A1D197F4B1EDA1D597C1B1DB");
                            case 1006898971:
                                m897d13 = list2 != null ? atm.m897d("B1DCA1DE97CFB1DEA1EC97C4B1DBA1D497CFB1DBA1D597C0B1ECA1D597C7B1EDA1DE97FDB1D2A1D097F0B1E2A1D297FEB1DBA1ED97CFB1DFA1DE") : atm.m897d("B1DEA1EE97F4B1E3A1EA97FEB1E6A1E997C4B1E3A1D997F3B1DDA1DE97FAB1DBA1DE97C7B1DBA1D7");
                            case 1166850430:
                                break;
                            case 2020912140:
                                m897d = atm.m897d("B1D8A1EE97F9B1D2A1D097FDB1D2A1E297F9B1DFA1D597F4B1E2A1DD97F4B1D1A1EA97F0B1E1A1D397FAB1DDA1E997FEB1D6A1D597CEB1E2");
                                continue;
                        }
                    }
                    break;
                case 1887648949:
                    String m897d14 = atm.m897d("B1DDA1EF97FEB1DFA1EF97F9B1E2A1D397C3B1E0A1E997CFB1D8A1D797F4B1D2A1ED97FAB1E6A1D397C0");
                    while (true) {
                        switch (m897d14.hashCode() ^ (-1791866231)) {
                            case -569816914:
                                m897d14 = str9.contains(C0052e.m1418a(new byte[]{-119, -44, -44, 64, 43, 36, 55, -9, -29, -121, -22, 36}, new byte[]{111, 111, 69, -91, -95, -116, -34, 93})) ? atm.m897d("B1D6A1E997C2B1DEA1DE97FFB1ECA1E297CEB1E0A1DD97F8B1E3A1D397FEB1E2A1D997C3B1D2A1E397CFB1E1") : atm.m897d("B1E5A1D297F0B1DDA1EA97C4B1DCA1DD97FCB1DEA1DD97FCB1DAA1EF97F0B1E2A1E297CFB1E2A1D797FFB1DCA1ED");
                            case -462813163:
                                m897d = atm.m897d("B1E2A1DE97F0B1E2A1E997FFB1E6A1EA97FFB1DCA1E997FDB1ECA1E397C0B1DF");
                                continue;
                            case -238285446:
                                m897d14 = atm.m897d("B1E3A1D197F9B1DBA1E297CFB1EDA1E397F8B1E6A1D797F9B1D6A1E297F0B1E2A1E397C3B1DB");
                            case 1303947018:
                                m897d = atm.m897d("B1DDA1EA97F8B1E0A1EA97F0B1E2A1DE97FFB1DDA1D297C3B1E1A1DE97FFB1DFA1EF97F8B1E6A1ED97FEB1EDA1D597FFB1D1A1EF97F8B1ECA1ED");
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1911239671:
                    str10 = C0629f.m179f(sb4.toString(), m287a());
                    m897d = atm.m897d("B1DCA1DD97F3B1ECA1D097C4B1E2A1D397C2B1DCA1ED97CEB1DAA1ED97FAB1D1A1D497C3B1E3A1E9");
                    continue;
                case 1914860884:
                    printStream2 = System.out;
                    m897d = atm.m897d("B1DFA1D597FDB1E2A1D197F9B1DDA1ED97FEB1E3A1D297FCB1D8A1D797C4B1D8A1D097C0B1E0A1ED97F3B1E0A1D797FD");
                    continue;
                case 1965259932:
                    m897d = atm.m897d("B1DDA1EA97F8B1E0A1EA97F0B1E2A1DE97FFB1DDA1D297C3B1E1A1DE97FFB1DFA1EF97F8B1E6A1ED97FEB1EDA1D597FFB1D1A1EF97F8B1ECA1ED");
                    str17 = str16;
                    continue;
                case 1967869590:
                    it2 = list.iterator();
                    m897d = atm.m897d("B1E1A1D397C4B1DBA1D997F0B1E2A1EF97CFB1E6A1D497FEB1DFA1ED97F9B1ECA1DD97C0");
                    continue;
                case 1983522701:
                    m897d = atm.m897d("B1DAA1D497FDB1E0A1D797FFB1D6A1E397F9B1E2A1D597FFB1EDA1EA97CEB1ECA1ED97F9B1ECA1D5");
                    continue;
                case 2067795865:
                    m897d = atm.m897d("B1EDA1D397FCB1DCA1D397F9B1E2A1EF97C3B1DDA1D997C0B1DDA1ED97F9B1D8A1D097FFB1E2A1E397C7B1DB");
                    entry = (Map.Entry) it.next();
                    continue;
                case 2073735776:
                    str2 = C0629f.m178g(str, m287a(), treeMap);
                    m897d = atm.m897d("B1D2A1E997CFB1D8A1D197FDB1ECA1D197C0B1E0A1EF97FEB1DCA1ED97FDB1DAA1DE97CEB1DBA1D297F3B1E3A1D097CEB1E0");
                    continue;
                case 2081257575:
                    treeMap3 = new TreeMap();
                    m897d = atm.m897d("B1EDA1E997CEB1D6A1EF97C2B1DDA1E397C0B1E2A1DE97F9B1E2A1D097C7B1D1A1D097F8B1DBA1ED97FDB1DEA1DD97F0B1DFA1D497FEB1DC");
                    continue;
                case 2096554175:
                    i4 = 0;
                    m897d = atm.m897d("B1DDA1D497FEB1E1A1D797C4B1E2A1DE97C2B1EDA1E297C3B1DAA1D497C0B1DBA1E397FFB1E5A1EA97FAB1E3A1E297C0B1D1A1EC97CFB1ED");
                    continue;
                case 2130397221:
                    m897d = atm.m897d("B1E2A1E297F4B1DEA1DE97FDB1E2A1D397FDB1DCA1DD97FDB1DBA1D597F3B1DC");
                    list2 = (List) treeMap4.get(C0052e.m1418a(new byte[]{-114, 59, 35, 57, -20, -33, 64, 0, -108, 59}, new byte[]{-3, 94, 87, 20, -113, -80, 47, 107}));
                    continue;
            }
            m897d = atm.m897d("B1E6A1DD97FFB1E2A1E297F9B1E2A1ED97C0B1E5A1D097C0B1E6A1D497F9B1E2A1D997C3B1D2A1ED97C0B1D1A1EC97F4B1D1A1D297FFB1D2A1D197CFB1D8A1D7");
        }
    }

    /* renamed from: c */
    protected final String m285c(String str) {
        TreeMap treeMap = null;
        HashMap hashMap = null;
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        Iterator it = null;
        HashMap hashMap2 = null;
        String str5 = null;
        String str6 = null;
        String m897d = atm.m897d("B1E2A1D797C2B1D8A1D497F0B1E2A1DD97FEB1ECA1D797F0B1ECA1ED97C0B1D6A1EC97F0B1E3A1D397C0");
        String str7 = null;
        StringBuilder sb2 = null;
        String str8 = null;
        while (true) {
            switch ((m897d.hashCode() ^ 711) ^ (-791678263)) {
                case -2061991035:
                    String m897d2 = atm.m897d("B1E5A1EE97FDB1E2A1DE97FAB1DEA1ED97C3B1EDA1ED97FDB1D8A1E997C3B1DAA1E997C4B1ECA1ED97C3B1DCA1D497F8B1DCA1EA97C2B1E1");
                    while (true) {
                        switch (m897d2.hashCode() ^ 2073285401) {
                            case -1260986352:
                                m897d = atm.m897d("B1E3A1D097F8B1ECA1ED97C4B1E2A1EF97CFB1E2A1DE97C4B1DCA1ED97F3B1ECA1E397C0B1DBA1D597C0B1E2A1D597FAB1DFA1ED");
                                continue;
                            case 726851025:
                                m897d2 = str4.contains(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, -48, 94, -118, 2, -106, 113, 98, 23, -126, 75, -19}, new byte[]{-101, 106, -28, 108, -98, 44, -104, -56})) ? atm.m897d("B1E3A1E397FCB1D6A1D397CEB1E2A1D197C0B1E1A1E397C2B1D2A1D497F3B1DC") : atm.m897d("B1ECA1D297FEB1E2A1ED97FDB1DBA1D597F4B1E2A1D597F9B1E2A1D397FFB1DC");
                            case 1099762888:
                                m897d = atm.m897d("B1DEA1D497C4B1E6A1DD97F9B1DEA1D397C0B1E5A1EA97F0B1DEA1D597C4");
                                continue;
                            case 1291163941:
                                m897d2 = atm.m897d("B1D1A1D797F4B1E1A1DE97C3B1DEA1E397C1B1DEA1D197FEB1E2A1D797C1B1E1A1ED97C7B1DCA1ED97FAB1ECA1E297C4B1D8A1E397C0");
                        }
                    }
                    break;
                case -1959478138:
                    sb2.append(URLEncoder.encode(str));
                    m897d = atm.m897d("B1DBA1D197CEB1E5A1DE97CEB1DEA1D797FDB1E1A1EC97F3B1DDA1EF97F8B1E5A1D197F9B1D2A1D597F0B1DFA1E997C0B1DDA1D597FA");
                    break;
                case -1769274334:
                    StringBuilder sb3 = new StringBuilder();
                    m897d = atm.m897d("B1D6A1EF97F0B1E2A1D797FCB1D6A1D197C1B1DCA1ED97C0B1D8A1EF97C3B1DFA1D997C1B1E5A1D3");
                    sb2 = sb3;
                    break;
                case -1726236642:
                    hashMap.put(C0052e.m1418a(new byte[]{-49, 1, -63, 101, 25, 0}, new byte[]{-67, 100, -78, 16, 117, 116, 53, 80}), str2);
                    m897d = atm.m897d("B1DEA1D197F9B1E6A1EA97C7B1E5A1D097C0B1E2A1ED97FDB1DEA1D197C1B1E5A1D597CEB1E2A1ED97FFB1D1A1E997C0B1ECA1D297C1");
                    break;
                case -1672930674:
                    m897d = atm.m897d("B1DBA1D597FDB1E2A1D797F0B1D1A1D797FEB1DEA1EF97C3B1DBA1EF97FDB1DDA1ED97C1B1DCA1D2");
                    str6 = str4;
                    break;
                case -1573285621:
                    str3 = sb.toString();
                    m897d = atm.m897d("B1D2A1D297C4B1DAA1D397CFB1E3A1ED97CEB1E2A1DE97F0B1E6A1ED97F4B1E1A1D097C0B1E3A1EC97F0B1DFA1DE97C4");
                    break;
                case -1455992080:
                    StringBuilder sb4 = new StringBuilder();
                    m897d = atm.m897d("B1E2A1EC97CEB1E2A1EF97F0B1D2A1D397C1B1DBA1D797F3B1E3A1D297C7B1DC");
                    sb = sb4;
                    break;
                case -1383822388:
                    String m897d3 = atm.m897d("B1E3A1EC97F4B1DAA1DD97C0B1DDA1D797CEB1D6A1D797C0B1E2A1D397C3B1D2A1E397FFB1E2A1ED");
                    while (true) {
                        switch (m897d3.hashCode() ^ 443352218) {
                            case 1217146398:
                                m897d3 = atm.m897d("B1E2A1D297CFB1DAA1ED97F9B1E2A1D197F9B1DCA1E997FEB1E5A1EF97C0B1DDA1D197C0B1E2A1ED97FFB1E5A1D197FAB1DDA1E997FAB1ECA1D3");
                            case 1300050669:
                                m897d3 = str8.contains(C0052e.m1418a(new byte[]{64, -127, 52, 39, -11, 109}, new byte[]{50, -28, 71, 82, -103, 25, -83, -43})) ? atm.m897d("B1DEA1D097C4B1E2A1D797FFB1E3A1D497FFB1DFA1EE97F3B1E2A1E297FAB1E5A1D297F3B1E0A1D397F0B1E2A1D497FAB1E3") : atm.m897d("B1DEA1EC97FCB1EDA1E997CEB1E2A1D097FEB1DCA1ED97F4B1DDA1E397CEB1E0A1EF97F4B1DCA1D297FCB1DBA1D4");
                            case 2132352737:
                                m897d = atm.m897d("B1EDA1D197F9B1D8A1E397F4B1DCA1EA97FAB1E3A1D297CEB1E2A1E297F4B1DCA1D797C2B1E0A1D497F9B1DBA1ED97FEB1EDA1EA");
                                continue;
                            case 2143535319:
                                m897d = atm.m897d("B1DFA1DE97FCB1DFA1EC97C4B1DAA1D297CEB1E2A1D797F4B1E2A1ED97CEB1EDA1DD97C2B1E6A1D097C0");
                                continue;
                        }
                    }
                    break;
                case -1036875605:
                    sb.append(URLEncoder.encode(str));
                    m897d = atm.m897d("B1E3A1D197FDB1E2A1D597CFB1ECA1D397F9B1DBA1E397CFB1ECA1D297C4");
                    break;
                case -677854077:
                    return str6;
                case -486390204:
                    String m177h = C0629f.m177h(C0629f.m184a(), str5, hashMap, hashMap2, null, C0629f.f1202b);
                    m897d = atm.m897d("B1E1A1D197C4B1E2A1ED97FEB1DBA1EE97C1B1D1A1E997C0B1D1A1EC97FDB1DDA1EC97FEB1D2A1EE97F3B1DBA1DE97C4B1EDA1EE97FDB1E2");
                    str7 = m177h;
                    break;
                case -293848815:
                    String str9 = str8.split(C0052e.m1418a(new byte[]{-107}, new byte[]{-82, 64, 112, -79, -58, 124, 113, 22}))[0].split(C0052e.m1418a(new byte[]{-35}, new byte[]{-32, -13, 17, -74, 50, 44, 119, 91}))[1];
                    m897d = atm.m897d("B1E0A1D497C7B1DDA1D797C7B1EDA1D197C4B1E2A1D397F4B1ECA1ED97FEB1DBA1EA97F0B1E2A1E397C0B1E0A1D097C4B1E3A1EA97FD");
                    break;
                case -159127833:
                    m897d = atm.m897d("B1E3A1D097F8B1ECA1ED97C4B1E2A1EF97CFB1E2A1DE97C4B1DCA1ED97F3B1ECA1E397C0B1DBA1D597C0B1E2A1D597FAB1DFA1ED");
                    str6 = str7;
                    break;
                case 74649142:
                    Iterator it2 = ((List) treeMap.get(C0052e.m1418a(new byte[]{-29, 48, 69, 40, -67, -97, 20, -86, -7, 48}, new byte[]{-112, 85, 49, 5, -34, -16, 123, -63}))).iterator();
                    m897d = atm.m897d("B1EDA1D197F9B1D8A1E397F4B1DCA1EA97FAB1E3A1D297CEB1E2A1E297F4B1DCA1D797C2B1E0A1D497F9B1DBA1ED97FEB1EDA1EA");
                    it = it2;
                    break;
                case 228985025:
                    hashMap2.put(C0052e.m1418a(new byte[]{-54, 43, Byte.MAX_VALUE, 43, 12, -92}, new byte[]{-87, 68, 16, 64, 101, -63, -92, -64}), C0052e.m1418a(new byte[]{-99, 34, 67, -93, -11, 7, -126, 110, -101, 57, Byte.MAX_VALUE, -97, -25, 18, -105, Byte.MAX_VALUE, -112, 48, 29, -51}, new byte[]{-8, 81, 32, -4, -122, 98, -29, 28}));
                    m897d = atm.m897d("B1EDA1D797F0B1E2A1EE97F0B1E0A1D097FEB1ECA1ED97C7B1DCA1EF97C1B1D1A1D497C0B1DCA1EE97F0");
                    break;
                case 647931266:
                    str5 = sb2.toString();
                    m897d = atm.m897d("B1E0A1E297F0B1DCA1E297F9B1E2A1EA97FEB1E2A1E397FAB1DDA1DD97FEB1E2A1D097FAB1DFA1D297C7B1DBA1ED97FFB1D1A1DD");
                    break;
                case 700036281:
                    String m1418a = C0052e.m1418a(new byte[]{-85}, new byte[]{-102, -105, -36, 72, 16, 18, -102, -101});
                    m897d = atm.m897d("B1DAA1D997FFB1DDA1EA97C4B1E0A1EC97C7B1D1A1E297F9B1E2A1EC97CEB1E6A1DE97C0B1DBA1D397F8B1E3");
                    str2 = m1418a;
                    break;
                case 740657683:
                    m897d = atm.m897d("B1D8A1DE97FEB1DAA1D197F0B1E2A1D197C2B1E2A1ED97C2B1E3A1E297FCB1DAA1E397C0B1E5A1D797F0B1E2");
                    str8 = (String) it.next();
                    break;
                case 779986027:
                    m897d = atm.m897d("B1D6A1D497C0B1E2A1D497F9B1DCA1ED97C4B1EDA1D297F0B1E2A1DD97C0B1DBA1D397C0");
                    break;
                case 886455776:
                    treeMap = new TreeMap();
                    m897d = atm.m897d("B1E5A1D397F0B1D8A1EA97CEB1E2A1DD97FAB1E6A1EF97F3B1DBA1ED97FDB1DCA1E997FFB1E3A1D797F9B1DCA1E397FCB1DDA1D597FEB1D6A1DD");
                    break;
                case 1154830773:
                    sb2.append(C0052e.m1418a(new byte[]{44, -22, 17, -92, 118, -37, -72, 53, 39, -28, 31, -83, 53, -46, -71, 121, 43, -13, 74, -21, 118, -36}, new byte[]{68, -98, 101, -44, 5, -31, -105, 26}));
                    m897d = atm.m897d("B1D1A1E297C0B1DAA1EA97FDB1E2A1E997F3B1DBA1EF97C1B1DBA1ED97F8B1E2A1ED97FFB1D8A1D597FEB1DAA1D997FAB1E5A1DD");
                    break;
                case 1227555007:
                    String m897d4 = atm.m897d("B1D6A1D997F9B1E2A1D397FCB1E6A1ED97C1B1DBA1ED97C3B1DBA1D197C3B1D1A1DE97FFB1DFA1E397C0B1D1A1D297C1B1D6A1D797C0B1E0A1EA97FC");
                    while (true) {
                        switch (m897d4.hashCode() ^ 1785130711) {
                            case -1835670891:
                                m897d = atm.m897d("B1DEA1D097F3B1DAA1D097C0B1E5A1D297FEB1E2A1E397FCB1E2A1ED97C4B1DFA1E997C0B1DFA1D797FDB1E2A1D997F0B1DFA1D797C0B1EC");
                                continue;
                            case -1139110185:
                                m897d4 = atm.m897d("B1E1A1D797F9B1E5A1EC97FDB1DCA1E297F0B1E2A1E297CEB1EDA1D797FFB1DFA1ED97FCB1ECA1D397C0");
                            case -1108915578:
                                m897d = atm.m897d("B1E0A1D497C7B1DDA1D797C7B1EDA1D197C4B1E2A1D397F4B1ECA1ED97FEB1DBA1EA97F0B1E2A1E397C0B1E0A1D097C4B1E3A1EA97FD");
                                continue;
                            case 1213155625:
                                m897d4 = it.hasNext() ? atm.m897d("B1DCA1DE97FFB1DFA1D797FEB1E2A1D497FCB1E2A1D797FDB1EDA1EC97C1B1DCA1D397F3B1E1") : atm.m897d("B1E2A1D797C3B1E2A1D997CFB1D6A1D297FDB1E2A1E397C2B1D1A1D397FAB1D2A1D297F0B1D2A1ED97FDB1E5A1E297F8B1ECA1E997FAB1DEA1DD97C0");
                        }
                    }
                    break;
                case 1324898601:
                    hashMap2 = new HashMap();
                    m897d = atm.m897d("B1ECA1E997FFB1E2A1EF97CFB1EDA1DD97C7B1ECA1D297FAB1E6A1D097FAB1ECA1ED97CFB1E0A1EC97C0B1E0A1EF97F8B1DDA1ED97F8B1DE");
                    break;
                case 1714632265:
                    m897d = atm.m897d("B1DEA1E397CEB1E2A1D797FAB1E1A1ED97F0B1E6A1D597C4B1E6A1EF97FCB1D8A1D997FCB1E1A1DE97C4B1ECA1D597FEB1E2A1ED");
                    break;
                case 1719499088:
                    str4 = C0629f.m177h(C0629f.m184a(), str3, hashMap, null, treeMap, C0629f.f1202b);
                    m897d = atm.m897d("B1DEA1E397F0B1DAA1E397F3B1DBA1D297F0B1D2A1D097FDB1DBA1D397F8B1DBA1D497CE");
                    break;
                case 2052890203:
                    sb.append(C0052e.m1418a(new byte[]{-122, -13, 27, 43, 105, 23, -37, 30, -115, -3, 21, 34, 42, 30, -38, 82, -127, -22, 64, 100, 105, 16}, new byte[]{-18, -121, 111, 91, 26, 45, -12, 49}));
                    m897d = atm.m897d("B1EDA1D497FDB1E2A1ED97C3B1DCA1D297C2B1DAA1D797F9B1E5A1E997F8B1D8");
                    break;
                case 2147417017:
                    hashMap = new HashMap();
                    m897d = atm.m897d("B1E2A1ED97C0B1E5A1D297FFB1E2A1D397C1B1EDA1D197CEB1E0A1D297C0B1ECA1D497F0");
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                C0288h m1414e = C0052e.m1414e(m286b(C0052e.m1418a(new byte[]{50, 35, 71, -13, -115, 16, 114, Byte.MAX_VALUE, 57, 45, 73, -6, -50, 25, 115, 51, 53, 58, 28}, new byte[]{90, 87, 51, -125, -2, 42, 93, 80}) + str + C0052e.m1418a(new byte[]{30, 61, -114, -68, 126, 125}, new byte[]{49, 77, -17, -37, 27, 82, -9, -84}) + str2));
                int parseInt = Integer.parseInt(str2);
                int parseInt2 = Integer.parseInt(str2);
                Matcher matcher = f1086g.matcher(m1414e.m967p0(C0052e.m1418a(new byte[]{-28, -27, -101, -125, -89, -67, -112, 104, -18, -19, -101, -60, -120, -88, -113, 121, -96, -78, -51, -52, -7, -71, -113, 121, -27, -30, -119}, new byte[]{Byte.MIN_VALUE, -116, -19, -83, -41, -36, -9, 13})).m604c().mo925d(C0052e.m1418a(new byte[]{-110, -33, 24, 31}, new byte[]{-6, -83, 125, 121, 23, -101, -80, -52})));
                String m897d = atm.m897d("B1E5A1EA97C2B1DBA1D597F9B1E0A1DE97C1B1E1A1E997C4B1E2A1DD97C1B1D8A1ED97C1B1DAA1ED97C3B1E5");
                while (true) {
                    switch (m897d.hashCode() ^ (-1112132689)) {
                        case -10958242:
                            if (!matcher.find()) {
                                m897d = atm.m897d("B1E1A1DD97FFB1E2A1EA97FFB1E3A1D797FEB1E6A1D197FEB1ECA1D597F4B1EDA1DE97C7B1D1A1EF97F9B1DAA1E997CEB1DFA1ED");
                                break;
                            } else {
                                m897d = atm.m897d("B1DBA1EE97C0B1E0A1D197C3B1E3A1D197C0B1D1A1E997FCB1DDA1E997C0");
                                break;
                            }
                        case 311045115:
                            i = Integer.parseInt(matcher.group(1));
                            break;
                        case 442434468:
                            i = parseInt2;
                            break;
                        case 929962245:
                            m897d = atm.m897d("B1E0A1DE97CFB1EDA1EE97C2B1D8A1E397F0B1E5A1D797F8B1DFA1D497CEB1E1A1E297F9B1E2");
                            break;
                    }
                }
                C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{29, 104, -54, -50, -120, -44, 96, -69, 28, 94, -41, -124, -59, -125, 31, -96, 21, 33, -126, -64, -119, -44}, new byte[]{121, 1, -68, -32, -27, -67, 63, -43}));
                JSONArray jSONArray = new JSONArray();
                Iterator<C0293m> it = m967p0.iterator();
                while (true) {
                    String m897d2 = atm.m897d("B1E5A1DD97F9B1E2A1D497CEB1DEA1DE97C7B1DCA1ED97C0B1E5A1D497C0B1DFA1D097C0B1EDA1E997FEB1D2A1EF97FDB1E2");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1486846578)) {
                            case -1881203453:
                                m897d2 = atm.m897d("B1D6A1ED97F0B1E2A1D297FAB1DDA1D997C1B1DFA1D797C7B1EDA1D397C1B1EDA1D097CFB1E3A1D397CFB1D2A1ED97C4B1DEA1E3");
                            case -1772151848:
                                jSONObject.put(C0052e.m1418a(new byte[]{-81, 118, 87, 118}, new byte[]{-61, 31, 36, 2, 6, -125, 87, -114}), jSONArray);
                                jSONObject.put(C0052e.m1418a(new byte[]{-90, -64, -18, -49}, new byte[]{-42, -95, -119, -86, 101, 4, -54, -105}), parseInt);
                                jSONObject.put(C0052e.m1418a(new byte[]{-57, 99, 11, -41, 96, 106, 94, 35, -61}, new byte[]{-73, 2, 108, -78, 3, 5, 43, 77}), i);
                                jSONObject.put(C0052e.m1418a(new byte[]{4, 88, -61, 18, 95}, new byte[]{104, 49, -82, 123, 43, 15, 70, -112}), 24);
                                String m1418a = C0052e.m1418a(new byte[]{18, -52, 109, 57, -12}, new byte[]{102, -93, 25, 88, -104, -71, 122, 105});
                                String m897d3 = atm.m897d("B1E3A1D097FAB1DCA1EA97C4B1E2A1DE97C2B1E2A1ED97C7B1E6A1EC97FCB1E5");
                                while (true) {
                                    switch (m897d3.hashCode() ^ (-891836325)) {
                                        case -1954072995:
                                            i2 = i * 24;
                                            break;
                                        case 618589389:
                                            m897d3 = atm.m897d("B1EDA1EA97F8B1DCA1DD97C4B1E2A1D797C2B1E6A1D497F3B1D6A1DE97CEB1DFA1D997F9B1EDA1D597F8B1E2A1D797C1B1E2A1ED");
                                            break;
                                        case 1616515398:
                                            if (i > 1) {
                                                m897d3 = atm.m897d("B1D6A1D997C3B1D6A1E997CEB1E2A1ED97C4B1D6A1D197C1B1D1A1EE97CEB1D2A1ED");
                                                break;
                                            } else {
                                                m897d3 = atm.m897d("B1D8A1D597C2B1DFA1D597C4B1DEA1E397FEB1DFA1EF97F0B1E3A1D197F0B1ECA1EF97C4B1EDA1E297F9B1E2");
                                                break;
                                            }
                                        case 2029250728:
                                            i2 = jSONArray.length();
                                            break;
                                    }
                                }
                                jSONObject.put(m1418a, i2);
                                return jSONObject.toString();
                            case -707991178:
                                C0293m next = it.next();
                                Matcher matcher2 = f1085f.matcher(next.m967p0(C0052e.m1418a(new byte[]{28}, new byte[]{125, 21, 45, 122, 44, 81, 32, -41})).m606a(C0052e.m1418a(new byte[]{86, -32, 81, -89}, new byte[]{62, -110, 52, -63, -12, 54, 116, -52})));
                                String m897d4 = atm.m897d("B1ECA1DD97FDB1E2A1DD97F0B1DCA1EA97FAB1DEA1EF97FAB1DAA1ED97CEB1E6A1ED97C4B1D1A1DD97F9B1E3A1D397C0B1D6A1DE97F9B1E2");
                                while (true) {
                                    switch (m897d4.hashCode() ^ (-674526390)) {
                                        case -438634849:
                                            String group = matcher2.group(1);
                                            String trim = next.m967p0(C0052e.m1418a(new byte[]{-110, 24, -68}, new byte[]{-5, 117, -37, -96, -109, 33, 108, 88})).m606a(C0052e.m1418a(new byte[]{104, 0, 120}, new byte[]{9, 108, 12, -56, -64, 82, -83, -31})).trim();
                                            String trim2 = next.m967p0(C0052e.m1418a(new byte[]{-30, 81, -77}, new byte[]{-117, 60, -44, -32, -58, -12, 38, -114})).m606a(C0052e.m1418a(new byte[]{118, -63, -75, -96, -28, -19, -113, -75, 117, -55, -81, -96, -91}, new byte[]{18, -96, -63, -63, -55, -126, -3, -36})).trim();
                                            String trim3 = next.m967p0(C0052e.m1418a(new byte[]{-118, 96, 22, -120, -28, -65, -92, 0, -120, 102, 64, -104, -84, -88, -67, 15, Byte.MIN_VALUE}, new byte[]{-18, 9, 96, -90, -116, -37, -51, 110})).m602e().trim();
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(C0052e.m1418a(new byte[]{104, 88, 101, 80, 96, -45}, new byte[]{30, 55, 1, 15, 9, -73, 103, -98}), group);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-103, 101, 121, 111, -56, 51, -13, -46}, new byte[]{-17, 10, 29, 48, -90, 82, -98, -73}), trim);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-51, -87, -99, -24, 116, 21, -103}, new byte[]{-69, -58, -7, -73, 4, 124, -6, -55}), trim2);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-6, -37, 89, 76, 81, -2, 89, -56, -2, -33, 78}, new byte[]{-116, -76, 61, 19, 35, -101, 52, -87}), trim3);
                                            jSONArray.put(jSONObject2);
                                            break;
                                        case -192896320:
                                            m897d4 = atm.m897d("B1D1A1D497FDB1E2A1D997F4B1EDA1ED97C7B1E6A1ED97FDB1D8A1E397C0B1DCA1D497F8");
                                        case 799593645:
                                            m897d4 = matcher2.find() ? atm.m897d("B1DDA1EC97CEB1E5A1D997FCB1DBA1DE97C1B1DDA1ED97FCB1EDA1EE97C0B1E2A1DD97FCB1D6A1D397F0B1DB") : atm.m897d("B1E2A1D197CEB1E5A1D797CFB1D2A1D497FDB1E6A1EC97FDB1ECA1D297C0B1E3A1D597FEB1DEA1EF97F3");
                                        case 849525853:
                                            break;
                                    }
                                }
                                break;
                            case 1416319439:
                                m897d2 = it.hasNext() ? atm.m897d("B1E5A1D297C1B1ECA1EC97C7B1D1A1EC97CEB1DEA1ED97F8B1DFA1D097C4") : atm.m897d("B1EDA1EA97C4B1DFA1D597F8B1D8A1EC97C4B1E2A1EF97C4B1ECA1ED97CEB1EDA1EC97CFB1E5A1D497C0B1D8A1D597C2B1DCA1EF97FCB1D2A1EE97C0B1E2");
                        }
                    }
                }
            } catch (Exception e) {
                e = e;
                SpiderDebug.log(e);
                return "";
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        String str;
        String str2;
        char c;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            try {
                C0288h m1414e = C0052e.m1414e(m286b(C0052e.m1418a(new byte[]{-75, -81, -95, 99, -65, -81, 40, 110, -66, -95, -81, 106, -4, -90, 41, 34, -78, -74, -6, 126, -93, -29, 110, 36, -14}, new byte[]{-35, -37, -43, 19, -52, -107, 7, 65}) + list.get(0) + C0052e.m1418a(new byte[]{61, -34, -15, 42, -15}, new byte[]{19, -74, -123, 71, -99, -29, -108, 26})));
                String trim = m1414e.m967p0(C0052e.m1418a(new byte[]{-110, 120, 81, 31, 57, -67, -107, 107, -109, 117, 83, 84, 53, -69, -113, 93, -126, 101, 7, 15, 116, -70, -46}, new byte[]{-10, 17, 39, 49, 84, -46, -29, 2})).m602e().trim();
                String m606a = m1414e.m967p0(C0052e.m1418a(new byte[]{40, 2, 9, 54, 117, -106, 12, -32, 43, 75, 65, 56, 120, -126, 2}, new byte[]{76, 107, Byte.MAX_VALUE, 24, 17, -17, 101, -115})).m606a(C0052e.m1418a(new byte[]{72, -64, -25}, new byte[]{59, -78, -124, -98, 90, -11, -107, 60}));
                Iterator<C0293m> it = m1414e.m967p0(C0052e.m1418a(new byte[]{94, -26, -55, -25, 9, -89, -79, -35, 79, -2, -126, -21, 15, -67, -121, -44, 66, -7, -109, -86, 88, -15, -76, -47}, new byte[]{43, -118, -25, -118, 102, -47, -40, -72})).iterator();
                String str3 = "";
                String str4 = "";
                String str5 = "";
                String str6 = "";
                String str7 = "";
                String str8 = "";
                while (true) {
                    String m897d = atm.m897d("B1D2A1D797C4B1E2A1DE97F3B1DFA1DD97FAB1DAA1D397C1B1DEA1DE97FFB1EDA1EE97FDB1E2A1EC97FDB1E2A1D497C0B1DD");
                    while (true) {
                        switch (m897d.hashCode() ^ 662021935) {
                            case -1983057666:
                                m897d = it.hasNext() ? atm.m897d("B1E0A1D197FDB1E2A1EC97C2B1DBA1ED97CEB1E5A1DE97F8B1D2A1DE97FDB1DBA1EA") : atm.m897d("B1DEA1DE97FEB1E2A1D197C2B1D8A1EF97CEB1E2A1ED97FEB1DDA1D297FDB1DBA1DD97F0B1DBA1D297F4B1D8A1D497CFB1DCA1EA97C0");
                            case -1810725982:
                                m897d = atm.m897d("B1E2A1D397CEB1E2A1E997FAB1ECA1D197C7B1E6A1ED97F3B1DDA1E997F3B1DEA1EF");
                            case -1505755435:
                                jSONObject2.put(C0052e.m1418a(new byte[]{-58, -79, -75, 10, 51, -87}, new byte[]{-80, -34, -47, 85, 90, -51, 84, -74}), list.get(0));
                                jSONObject2.put(C0052e.m1418a(new byte[]{43, 45, 20, 72, -110, -85, 116, -63}, new byte[]{93, 66, 112, 23, -4, -54, 25, -92}), trim);
                                jSONObject2.put(C0052e.m1418a(new byte[]{92, -7, -48, -118, -43, -58, 97}, new byte[]{42, -106, -76, -43, -91, -81, 2, -72}), m606a);
                                jSONObject2.put(C0052e.m1418a(new byte[]{-81, -125, 56, 55, -40, 88, 30, 42, -66}, new byte[]{-37, -6, 72, 82, -121, 54, Byte.MAX_VALUE, 71}), str3);
                                jSONObject2.put(C0052e.m1418a(new byte[]{17, -11, 12, 75, 20, 77, 80, Byte.MAX_VALUE}, new byte[]{103, -102, 104, 20, 109, 40, 49, 13}), str8);
                                jSONObject2.put(C0052e.m1418a(new byte[]{-6, -15, 23, 115, -113, -97, 78, 71}, new byte[]{-116, -98, 115, 44, -18, -19, 43, 38}), str4);
                                jSONObject2.put(C0052e.m1418a(new byte[]{15, 31, -101, 44, 36, 97, 7, -2, 11, 27, -116}, new byte[]{121, 112, -1, 115, 86, 4, 106, -97}), str7);
                                jSONObject2.put(C0052e.m1418a(new byte[]{-25, -64, 29, 104, -72, 42, -4, -13, -29}, new byte[]{-111, -81, 121, 55, -39, 73, -120, -100}), str6);
                                jSONObject2.put(C0052e.m1418a(new byte[]{-94, 34, 45, 9, 104, -25, -44, -121, -73, 57, 38, 36}, new byte[]{-44, 77, 73, 86, 12, -114, -90, -30}), str5);
                                jSONObject2.put(C0052e.m1418a(new byte[]{86, -3, 14, 74, -90, 35, -75, 56, 69, -4, 30}, new byte[]{32, -110, 106, 21, -59, 76, -37, 76}), m1414e.m967p0(C0052e.m1418a(new byte[]{49, 47, -9, 48, -62, 101, -14, -31, 58, 40, -11, 123, -61, 97}, new byte[]{85, 70, -127, 30, -69, 21, -83, -126})).m602e().trim());
                                jSONObject2.put(C0052e.m1418a(new byte[]{-21, -26, 30, 86, -13, -98, 44, -65, -62, -17, 8, 102, -18}, new byte[]{-99, -119, 122, 9, -125, -14, 77, -58}), C0052e.m1418a(new byte[]{13, -41, -62, 65, 85, -77, 1, -60, 108, -65, -6, 56}, new byte[]{-24, 89, 64, -88, -64, 12, -23, 113}));
                                ArrayList arrayList = new ArrayList();
                                Iterator<C0293m> it2 = m1414e.m967p0(C0052e.m1418a(new byte[]{-98, -41, -67, -105, 18, -121, -94, 67, -91, -46, -94, -54, 22, -71, -84, 78, -108, -98, -11, -103, 3}, new byte[]{-6, -66, -53, -71, 98, -26, -50, 58})).iterator();
                                while (true) {
                                    String m897d2 = atm.m897d("B1DFA1D197FAB1E3A1D297C3B1E3A1E297FFB1DFA1D797F9B1E1A1DE97F8B1DFA1D197C1B1E6A1E397C0B1DDA1E997CEB1E3A1D097F9B1E2");
                                    while (true) {
                                        switch (m897d2.hashCode() ^ (-165684572)) {
                                            case -1756854159:
                                                m897d2 = it2.hasNext() ? atm.m897d("B1E2A1D597F9B1E2A1DE97F0B1ECA1D097C4B1DAA1D097F9B1D1A1D097C0B1E2A1ED97F4B1DAA1DD97C0B1DCA1D397C0B1DFA1ED97F0B1EDA1DD97FDB1E2") : atm.m897d("B1DDA1D797FDB1E2A1EA97FAB1E6A1D297F0B1DDA1EE97C3B1E1A1E297C3B1D2A1D997FAB1D6A1E297FCB1DCA1ED97FFB1ECA1E9");
                                            case -1275540776:
                                                jSONObject2.put(C0052e.m1418a(new byte[]{21, 107, -118, -74, -33, 14, -4, 6, 60, 113, -100, -123}, new byte[]{99, 4, -18, -23, -81, 98, -99, Byte.MAX_VALUE}), TextUtils.join(C0052e.m1418a(new byte[]{-90}, new byte[]{-123, 8, 68, -82, -29, -38, 98, -86}), arrayList));
                                                jSONArray.put(jSONObject2);
                                                jSONObject.put(C0052e.m1418a(new byte[]{-73, 8, 25, -105}, new byte[]{-37, 97, 106, -29, -47, 84, -97, 121}), jSONArray);
                                                return jSONObject.toString();
                                            case -1027732260:
                                                m897d2 = atm.m897d("B1E1A1EC97F0B1EDA1EC97C0B1DAA1E997C1B1E6A1EE97C3B1E0A1EC97CE");
                                            case -764705144:
                                                C0293m next = it2.next();
                                                Matcher matcher = f1087h.matcher(next.mo925d(C0052e.m1418a(new byte[]{-50, -99, 94, -34}, new byte[]{-90, -17, 59, -72, 4, 111, 85, 77})));
                                                String m897d3 = atm.m897d("B1E2A1D497C2B1ECA1D497C7B1D8A1EA97C4B1E2A1D997F0B1E3A1EA97FFB1EDA1D497F8B1D8A1D197FEB1E2A1ED97FAB1D1A1E397C0B1DDA1D097FD");
                                                while (true) {
                                                    switch (m897d3.hashCode() ^ (-664573062)) {
                                                        case -155173692:
                                                            break;
                                                        case 447779847:
                                                            m897d3 = atm.m897d("B1DAA1EF97FDB1E3A1EC97F3B1D6A1E997F0B1E2A1EE97C2B1E2A1DE97F3B1DCA1EE97FAB1DF");
                                                        case 896503007:
                                                            m897d3 = matcher.find() ? atm.m897d("B1DDA1EA97F3B1D2A1D997CEB1E6A1E297FDB1D1A1E297F9B1E2A1D397F4B1ECA1ED97FAB1D6A1D797C0B1DBA1E397C0B1E5A1D497F4") : atm.m897d("B1DFA1DD97FAB1E5A1D397FDB1D8A1D497C4B1E1A1E997F9B1E2A1D597FEB1ECA1ED");
                                                        case 2060147435:
                                                            arrayList.add(next.m960w0() + C0052e.m1418a(new byte[]{57}, new byte[]{29, 81, 126, -85, -88, 118, 111, 120}) + matcher.group(1));
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }
                                break;
                            case -350513033:
                                String trim2 = it.next().m960w0().trim();
                                int length = trim2.length();
                                String m897d4 = atm.m897d("B1E0A1D797FFB1E0A1D097C0B1D1A1D797F9B1E2A1EF97F4B1D2A1ED97CEB1DCA1D597FAB1DAA1D097C0B1DEA1ED97CE");
                                while (true) {
                                    switch (m897d4.hashCode() ^ (-1928882384)) {
                                        case -1737112177:
                                            m897d4 = length >= 4 ? atm.m897d("B1D8A1D297FCB1E1A1D797F4B1E3A1D397F3B1E5A1D497C7B1E3A1EE97C1") : atm.m897d("B1D8A1D497C1B1E3A1D997FAB1DBA1E997CEB1ECA1D997CFB1E5A1D397C0B1E2A1DD97F9B1EDA1EA97C4B1E2A1EE97FEB1D6A1ED97F0B1DB");
                                        case -598295773:
                                            try {
                                                String substring = trim2.substring(0, 2);
                                                String substring2 = trim2.substring(3);
                                                switch (substring.hashCode()) {
                                                    case 649273:
                                                        boolean equals = substring.equals(C0052e.m1418a(new byte[]{28, 45, 74, 104, 123, 30}, new byte[]{-8, -107, -15, -114, -57, -118, -91, 110}));
                                                        String m897d5 = atm.m897d("B1EDA1D197CEB1E2A1D997FDB1E1A1DD97C3B1E2A1E997F0B1ECA1D997C2B1DD");
                                                        while (true) {
                                                            switch (m897d5.hashCode() ^ 932549687) {
                                                                case -1348520205:
                                                                    c = 4;
                                                                    break;
                                                                case -763040357:
                                                                    m897d5 = atm.m897d("B1E3A1E397FFB1E2A1D197C4B1DBA1ED97C3B1E6A1ED97F9B1D8A1D297C0B1ECA1E297F9B1D2A1ED");
                                                                case 752614486:
                                                                    m897d5 = equals ? atm.m897d("B1E6A1EA97FAB1DEA1D497F3B1D6A1E397C2B1DBA1E397FEB1E2A1ED97C2B1EC") : atm.m897d("B1E5A1DE97F4B1E1A1EE97F3B1EDA1D197FCB1D8A1D397F0B1EDA1EA97C4B1E2A1E997C7B1DAA1DE");
                                                                case 1140415005:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 713226:
                                                        String m897d6 = atm.m897d("B1E1A1E297C2B1DCA1D597C2B1ECA1D797C7B1DDA1D497C1B1E1A1D297F4");
                                                        while (true) {
                                                            switch (m897d6.hashCode() ^ 616660996) {
                                                                case -1675462826:
                                                                    m897d6 = substring.equals(C0052e.m1418a(new byte[]{25, 97, -74, 88, -78, -23}, new byte[]{-4, -3, 6, -67, 62, 83, -59, -122})) ? atm.m897d("B1D1A1EE97FEB1E2A1EF97C3B1D2A1ED97FDB1E3A1E397FCB1DFA1EC97C1B1D8A1D597F3B1D2A1ED97F4B1D2A1D297C0B1DAA1D997CE") : atm.m897d("B1DCA1D097C2B1D8A1D797F9B1EDA1D597C1B1DFA1D097CEB1DBA1D297C3B1D1A1D797FEB1DAA1EC97C1");
                                                                case -1504201228:
                                                                    m897d6 = atm.m897d("B1DEA1D597CFB1D2A1D297FDB1ECA1D597FEB1E2A1EC97FEB1EDA1ED97FCB1DD");
                                                                case -243323876:
                                                                    c = 1;
                                                                    break;
                                                                case -221835522:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 758424:
                                                        String m897d7 = atm.m897d("B1D2A1D797FEB1DAA1EE97C7B1EDA1EF97F8B1E2A1D497C0B1E0A1DD97FEB1E2A1E397FFB1E2A1EA97FFB1E1A1D497C4B1DFA1ED97CEB1DDA1E3");
                                                        while (true) {
                                                            switch (m897d7.hashCode() ^ 1581849565) {
                                                                case -1748963481:
                                                                    c = 3;
                                                                    break;
                                                                case -1261998584:
                                                                    m897d7 = atm.m897d("B1D1A1D997F3B1D1A1D597FEB1DBA1EE97C3B1EDA1D997F8B1DCA1D597C7B1E0A1D297FDB1E2A1EC97FEB1D2A1D297F3B1E3A1D397CEB1E2");
                                                                case -213713746:
                                                                    break;
                                                                case 686826140:
                                                                    m897d7 = substring.equals(C0052e.m1418a(new byte[]{-46, -116, -89, 92, 77, -93}, new byte[]{55, 35, 27, -70, -15, 55, 23, -96})) ? atm.m897d("B1D2A1DD97C0B1E2A1E997FCB1DAA1E297C2B1E5A1EA97CEB1DDA1EF97F3B1DEA1D197CEB1D2A1ED97FEB1D8A1EE97F9B1ECA1D5") : atm.m897d("B1EDA1EE97FDB1E6A1DD97FDB1D6A1D597CFB1DFA1D397FAB1DEA1EF97F9B1DAA1DE97C3B1EDA1D397CEB1EDA1D597F3B1E5A1E397F8");
                                                            }
                                                        }
                                                        break;
                                                    case 769801:
                                                        String m897d8 = atm.m897d("B1DFA1D297F9B1EDA1D497CEB1E2A1E997F3B1DBA1ED97FAB1DDA1ED97C0B1D1A1D597FEB1D6A1EE97C1B1EDA1D097F0B1DCA1EE97FDB1E2");
                                                        while (true) {
                                                            switch (m897d8.hashCode() ^ 2114799225) {
                                                                case -1717535041:
                                                                    break;
                                                                case -1622467376:
                                                                    c = 2;
                                                                    break;
                                                                case -509509462:
                                                                    m897d8 = substring.equals(C0052e.m1418a(new byte[]{-40, -64, 17, 38, -86, 104}, new byte[]{61, 121, -91, -62, 17, -43, -111, -30})) ? atm.m897d("B1ECA1D097F9B1E2A1D097FDB1ECA1ED97FAB1DEA1DE97F0B1DBA1D497C0B1DDA1D597C7B1DDA1EE97C1B1DBA1D297FEB1E2A1EF97C0B1DDA1ED97FAB1D1A1E397C0") : atm.m897d("B1DBA1ED97F0B1E1A1D997F0B1E2A1E997CFB1E1A1D797F3B1E6A1D797FFB1E6A1ED");
                                                                case 1800689851:
                                                                    m897d8 = atm.m897d("B1ECA1D297FAB1DDA1E997CFB1DFA1EF97FCB1D6A1E997FCB1E3A1EC97F0B1E3A1D297C7B1E6A1E997F0");
                                                            }
                                                        }
                                                        break;
                                                    case 1010288:
                                                        String m897d9 = atm.m897d("B1DAA1E397FEB1E1A1EF97CFB1E2A1D997C3B1ECA1EF97F9B1E2A1DE97F4B1E6A1ED97CFB1D1A1D997F9B1DEA1E997C7B1E5A1E397C1");
                                                        while (true) {
                                                            switch (m897d9.hashCode() ^ (-1041074664)) {
                                                                case -1910405813:
                                                                    c = 0;
                                                                    break;
                                                                case -923443432:
                                                                    m897d9 = atm.m897d("B1E1A1E297FCB1E6A1D997F0B1DEA1D197FAB1D2A1EE97C4B1E0A1D397CEB1DEA1DE97C2B1E6A1D497C0");
                                                                case -614785917:
                                                                    m897d9 = substring.equals(C0052e.m1418a(new byte[]{-99, -85, -60, 20, 68, 0}, new byte[]{122, 26, Byte.MAX_VALUE, -15, -38, -117, 42, -110})) ? atm.m897d("B1DFA1EA97C0B1E2A1D297F0B1DAA1E397C1B1D2A1D597FEB1D2A1DE97F0B1DAA1E297F4B1EC") : atm.m897d("B1DBA1ED97FFB1E2A1ED97CEB1E6A1ED97FCB1D2A1D397FAB1DCA1E997C0B1DFA1E997F8B1D1A1D597FAB1D8A1D497C0B1D8A1DD97FA");
                                                                case -366924801:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1143133:
                                                        String m897d10 = atm.m897d("B1DCA1E397FFB1DEA1E397C0B1E2A1E297FFB1D6A1ED97FAB1DDA1EF97F0B1DBA1E397FDB1E2");
                                                        while (true) {
                                                            switch (m897d10.hashCode() ^ 523287370) {
                                                                case -1570315470:
                                                                    c = 5;
                                                                    break;
                                                                case 95175050:
                                                                    m897d10 = substring.equals(C0052e.m1418a(new byte[]{-116, 17, 108, -75, 33, 76}, new byte[]{100, -96, -22, 82, -78, -17, 42, 53})) ? atm.m897d("B1E3A1E297F9B1DBA1EF97FEB1E2A1ED97C0B1DCA1ED97FEB1D2A1D197FDB1DAA1D097F9B1E0") : atm.m897d("B1DFA1EF97F4B1E3A1D397F4B1DAA1EF97C3B1DFA1ED97FDB1E2A1E297C3B1DAA1E397CEB1D6");
                                                                case 1064932395:
                                                                    m897d10 = atm.m897d("B1DBA1D297F9B1D8A1ED97F9B1EDA1D297C1B1E0A1EE97FDB1E2A1EE97F4B1E1A1D197C0B1E2A1D397FEB1E5");
                                                                case 1612931493:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        c = 65535;
                                                        break;
                                                }
                                                String m897d11 = atm.m897d("B1E2A1D197F0B1E2A1D997FEB1E6A1D797C3B1E2A1ED97C3B1E5A1D397FDB1D6A1DD97C0B1DEA1D097C0B1E1A1EC97CF");
                                                while (true) {
                                                    switch (m897d11.hashCode() ^ 314477804) {
                                                        case -699169398:
                                                            str = str5;
                                                            str2 = str6;
                                                            str3 = substring2;
                                                            continue;
                                                        case 666322959:
                                                            String m897d12 = atm.m897d("B1ECA1E297FAB1E3A1DE97CFB1E0A1E297FDB1DFA1EA97F8B1DFA1D297F3");
                                                            while (true) {
                                                                switch (m897d12.hashCode() ^ 1380948015) {
                                                                    case -1395561575:
                                                                        str = str5;
                                                                        str2 = str6;
                                                                        str4 = substring2;
                                                                        continue;
                                                                    case -925827613:
                                                                        String m897d13 = atm.m897d("B1ECA1ED97CEB1E2A1DD97C0B1E5A1E397F8B1DBA1ED97F3B1E2A1D497C0B1E3A1D597CEB1E2A1DE97FAB1EDA1D997FAB1D2");
                                                                        while (true) {
                                                                            switch (m897d13.hashCode() ^ 1645251500) {
                                                                                case -1266225384:
                                                                                    String m897d14 = atm.m897d("B1DBA1DE97CEB1ECA1DD97FEB1DCA1E297FCB1E1A1D597FFB1ECA1D997FF");
                                                                                    while (true) {
                                                                                        switch (m897d14.hashCode() ^ (-1426221409)) {
                                                                                            case -1969338107:
                                                                                                m897d14 = c != 3 ? atm.m897d("B1E3A1E997FFB1D2A1EA97F9B1E2A1D197F4B1E0A1D497CFB1EDA1EE97F0B1DFA1EC97FAB1E1A1D797FAB1E2A1EC97C2") : atm.m897d("B1DCA1E397F0B1E2A1D397CEB1DCA1EC97FCB1ECA1EE97CEB1DBA1ED97C2B1E0A1D497C0B1D1A1EE97FCB1D1A1DE97F9B1DBA1E997C2B1DEA1D597C7");
                                                                                            case -1671685841:
                                                                                                String m897d15 = atm.m897d("B1DDA1EA97FEB1E2A1D997CEB1DFA1DD97F4B1E2A1ED97F8B1D6A1ED97C0B1D8A1D397FDB1DBA1E997FAB1D2A1DE97F4B1E6A1EE97C0B1DEA1E397C0");
                                                                                                while (true) {
                                                                                                    switch (m897d15.hashCode() ^ (-1283267295)) {
                                                                                                        case -1098577702:
                                                                                                            m897d15 = atm.m897d("B1D8A1D497FCB1E2A1D797C7B1D2A1DD97F8B1DFA1D197FFB1D8A1D397CEB1DBA1D097CEB1D2A1E397C2B1E3A1D997C3B1DDA1EA97C4");
                                                                                                        case -807839951:
                                                                                                            String m897d16 = atm.m897d("B1ECA1D597C4B1E0A1D097FDB1D1A1D797C1B1E3A1EC97CEB1E2A1D397FDB1DCA1D097C7B1E0");
                                                                                                            while (true) {
                                                                                                                switch (m897d16.hashCode() ^ 2097608612) {
                                                                                                                    case -1569074556:
                                                                                                                        m897d16 = atm.m897d("B1DEA1EC97FEB1E2A1D197FDB1D6A1D297FDB1E0A1D097C0B1E2A1ED97CFB1DAA1E997FDB1D6A1ED97C0");
                                                                                                                    case -1464046255:
                                                                                                                        m897d16 = c != 5 ? atm.m897d("B1E0A1D997C7B1E6A1D597F4B1DAA1E997F0B1E2A1D497F4B1E2A1D397C0B1DAA1EE97C0B1E2A1EF97FCB1E5A1D797F4B1E6A1ED97FAB1DDA1D097C0") : atm.m897d("B1D6A1DE97F9B1E2A1EA97FEB1E0A1D397C4B1DDA1EF97F4B1D2A1ED97F0B1DDA1D997CEB1DEA1D797FCB1D2A1D497C0B1DFA1D197C1");
                                                                                                                    case -575176218:
                                                                                                                        str = str5;
                                                                                                                        str2 = str6;
                                                                                                                        str7 = substring2;
                                                                                                                        continue;
                                                                                                                    case 1694152171:
                                                                                                                        str = str5;
                                                                                                                        str2 = str6;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 1446136666:
                                                                                                            str = str5;
                                                                                                            str2 = substring2;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 2145907118:
                                                                                                            m897d15 = c != 4 ? atm.m897d("B1D6A1E997CFB1E3A1D597F0B1E2A1D497F0B1DDA1ED97CEB1E2A1ED97C3B1DCA1ED97F4B1E5A1EE") : atm.m897d("B1DEA1D497F0B1E2A1E397FCB1EDA1EC97FDB1E1A1DE97C3B1EDA1EF97FAB1DCA1ED97FAB1DDA1D397C2B1E3A1D497C1B1DEA1EC97CEB1DBA1D297C0");
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case -462650288:
                                                                                                str = substring2;
                                                                                                str2 = str6;
                                                                                                continue;
                                                                                            case 1885930785:
                                                                                                m897d14 = atm.m897d("B1E5A1D197CFB1DAA1EC97C7B1D6A1DE97C1B1DFA1DD97FEB1E2A1D997C4B1DAA1EE97F9B1D1");
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case -826496249:
                                                                                    m897d13 = c != 2 ? atm.m897d("B1E5A1D197C4B1E2A1D497F3B1ECA1ED97F9B1E5A1D397CFB1E0A1D197C2B1D6A1EE97FAB1DBA1ED97CFB1EDA1E397C0") : atm.m897d("B1ECA1EF97C2B1EDA1EE97FAB1DAA1E297C4B1DAA1D497FCB1DAA1DD97FFB1ECA1EC97C0B1E6");
                                                                                case -38011188:
                                                                                    str = str5;
                                                                                    str2 = str6;
                                                                                    str8 = substring2;
                                                                                    continue;
                                                                                case 58604788:
                                                                                    m897d13 = atm.m897d("B1DCA1EE97FDB1D6A1EF97FDB1E2A1D397F0B1D6A1E397FEB1DDA1D497FFB1E2");
                                                                            }
                                                                        }
                                                                        break;
                                                                    case -157078744:
                                                                        m897d12 = c != 1 ? atm.m897d("B1DBA1E397F9B1E2A1ED97CFB1DBA1D097CEB1E5A1D497C2B1EDA1D397F8") : atm.m897d("B1E6A1D597FAB1DEA1EE97C7B1ECA1EC97C7B1E6A1D497CEB1D6A1D397C0B1E0A1D297FA");
                                                                    case 1720918767:
                                                                        m897d12 = atm.m897d("B1DEA1E297FDB1E2A1D997C7B1E5A1EF97C2B1ECA1E297C1B1D2A1ED97F0B1DEA1D597C1B1E0A1E397C0B1D6A1D397C1B1DDA1EE97FEB1E5A1D297F4");
                                                                }
                                                            }
                                                            break;
                                                        case 993653584:
                                                            m897d11 = c != 0 ? atm.m897d("B1E3A1E397F4B1E2A1D797C7B1E6A1EF97C2B1E0A1D397CFB1EDA1D197FDB1E2A1D297FAB1D2A1ED97FFB1D2A1DE") : atm.m897d("B1DAA1E397F0B1EDA1D797F9B1E2A1EE97C4B1DFA1ED97C4B1D2A1D397C0B1D8A1D097C2B1DFA1DD97FEB1E2");
                                                        case 1996164166:
                                                            m897d11 = atm.m897d("B1EDA1EA97FEB1E2A1D997F0B1DFA1ED97C4B1D1A1D397FEB1D6A1DD97C0B1DFA1DD97FEB1E2A1EF97C7B1DB");
                                                    }
                                                }
                                            } catch (Exception e) {
                                                SpiderDebug.log(e);
                                                str = str5;
                                                str2 = str6;
                                                break;
                                            }
                                            break;
                                        case -441500862:
                                            m897d4 = atm.m897d("B1DDA1E997C3B1DFA1DE97FDB1E6A1D597C3B1D8A1E297C0B1E2A1DD97CFB1DDA1D497F4B1E6A1EE97F3B1DBA1ED");
                                        case 733892191:
                                            str = str5;
                                            str2 = str6;
                                            break;
                                    }
                                }
                                str5 = str;
                                str6 = str2;
                                break;
                        }
                    }
                }
            } catch (Exception e2) {
                return "";
            }
        } catch (Exception e3) {
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                C0288h m1414e = C0052e.m1414e(m286b(f1095p));
                C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-15, -8, -90, -20, 115, -49, 73, -106, -1, -88, -25, -10, 118, -122, 4, -62, -66}, new byte[]{-33, -106, -57, -102, 31, -90, 58, -30}));
                JSONArray jSONArray = new JSONArray();
                Iterator<C0293m> it = m967p0.iterator();
                while (true) {
                    String m897d = atm.m897d("B1DCA1E397CFB1DBA1E297FEB1E2A1D797FDB1E6A1ED97C7B1DDA1D397C0B1EDA1D497FEB1E2A1ED97F9B1E2A1D297FF");
                    while (true) {
                        switch (m897d.hashCode() ^ 1091397948) {
                            case -1451823785:
                                m897d = it.hasNext() ? atm.m897d("B1DAA1ED97FCB1DDA1EA97F0B1E2A1D997CEB1E1A1DD97F3B1E0A1DE97FEB1E2A1EF97F9B1DEA1EC97FEB1DCA1ED97F3B1DAA1DD97C0B1DFA1DD97FF") : atm.m897d("B1DBA1DD97FFB1E2A1DD97F4B1DFA1ED97FFB1DFA1E997C0B1E0A1D197F4B1D6A1EE97FAB1E3A1EC97F0B1E6A1D1");
                            case -7685712:
                                C0293m next = it.next();
                                String mo925d = next.mo925d(C0052e.m1418a(new byte[]{84, -39, -89, 105}, new byte[]{60, -85, -62, 15, -23, 53, 84, 125}));
                                String m897d2 = atm.m897d("B1DCA1D497F0B1EDA1ED97FDB1D1A1D997F3B1D6A1ED97C0B1D6A1D5");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-191835551)) {
                                        case -2071432180:
                                            m897d2 = mo925d.length() > 1 ? atm.m897d("B1DAA1EC97F3B1D6A1E397C0B1E2A1D597F0B1ECA1ED97FAB1E1A1D297F3B1E2A1D397C1B1E3A1EF97FDB1DDA1D397C0B1DCA1ED97C0") : atm.m897d("B1DDA1D797CEB1E2A1E297C1B1DDA1D497F0B1E5A1D797F0B1E3A1EF97F3B1DAA1D797F9B1E5");
                                        case -1119710552:
                                            m897d2 = atm.m897d("B1E6A1ED97F0B1E2A1ED97FFB1D6A1D097C7B1EDA1E297F3B1DDA1D797C3B1DDA1DD97C4B1DBA1D497FCB1DC");
                                        case -1031358276:
                                            String substring = mo925d.substring(1);
                                            String trim = next.m960w0().trim();
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(C0052e.m1418a(new byte[]{26, -113, -32, 5, 99, 45, -54}, new byte[]{110, -10, -112, 96, 60, 68, -82, -90}), substring);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{21, 109, 89, 28, 77, 114, 68, 47, 4}, new byte[]{97, 20, 41, 121, 18, 28, 37, 66}), trim);
                                            jSONArray.put(jSONObject2);
                                            break;
                                        case -1030346923:
                                            break;
                                    }
                                }
                                break;
                            case 598395162:
                                m897d = atm.m897d("B1D8A1D297CEB1E3A1DE97F0B1E2A1D597C1B1DDA1D297CFB1EDA1D597FCB1DFA1ED97F3B1DDA1EA97C1B1E5A1E397F3B1DDA1ED97C0");
                            case 1999876810:
                                jSONObject.put(C0052e.m1418a(new byte[]{-94, 23, -77, -89, 84}, new byte[]{-63, 123, -46, -44, 39, 6, -52, -52}), jSONArray);
                                C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-10, -68, -91, -79, 63, 6, 18, 70, -9, -118, -72, -5, 114, 81, 109, 93, -2, -11, -19, -65, 62, 6}, new byte[]{-110, -43, -45, -97, 82, 111, 77, 40}));
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator<C0293m> it2 = m967p02.iterator();
                                while (true) {
                                    String m897d3 = atm.m897d("B1E2A1EA97C3B1D2A1D197CEB1E2A1D797CEB1E5A1D797FAB1E2A1E997FCB1E6A1E397CEB1ECA1ED97F9B1DFA1E397C0");
                                    while (true) {
                                        switch (m897d3.hashCode() ^ 2120478829) {
                                            case -1710988705:
                                                jSONObject.put(C0052e.m1418a(new byte[]{53, -65, 80, 22}, new byte[]{89, -42, 35, 98, -31, -76, -97, 32}), jSONArray2);
                                                return jSONObject.toString();
                                            case -1454790224:
                                                m897d3 = it2.hasNext() ? atm.m897d("B1D8A1E397F0B1ECA1E297F4B1E0A1DE97FEB1E2A1D297F9B1E1A1EF97FCB1DEA1D197C4B1DCA1ED97F9B1DFA1E397C0B1D8A1D997F4B1DBA1D297C1") : atm.m897d("B1D2A1DD97FAB1DFA1D397F9B1E2A1ED97F3B1DCA1ED97F8B1DAA1D097C4B1E2A1E997C0B1DBA1E297F9B1E2A1EA97C4B1DBA1ED97F3B1DEA1E397C0B1DEA1EA97FF");
                                            case -612710816:
                                                C0293m next2 = it2.next();
                                                Matcher matcher = f1085f.matcher(next2.m967p0(C0052e.m1418a(new byte[]{-65}, new byte[]{-34, 43, -46, 51, -34, -104, -71, -92})).m606a(C0052e.m1418a(new byte[]{92, 106, -77, -66}, new byte[]{52, 24, -42, -40, -7, 89, 46, -19})));
                                                String m897d4 = atm.m897d("B1E5A1E997F3B1E0A1E997F0B1D1A1D097F0B1E2A1EF97FEB1DCA1ED97F8B1DFA1D097C1B1D8A1E997C0");
                                                while (true) {
                                                    switch (m897d4.hashCode() ^ 1656801451) {
                                                        case -1902064083:
                                                            break;
                                                        case -1231359730:
                                                            m897d4 = matcher.find() ? atm.m897d("B1D8A1ED97F0B1E2A1EA97CFB1DFA1ED97FEB1DEA1D497C0B1DAA1DD97C4B1E2A1E297F8B1DCA1ED97F3B1DB") : atm.m897d("B1D1A1E997FFB1E2A1EE97FCB1DEA1D297F3B1E6A1ED97FAB1EDA1E297F0B1E2A1D597FCB1DFA1D197C3B1DF");
                                                        case -453641681:
                                                            String group = matcher.group(1);
                                                            String trim2 = next2.m967p0(C0052e.m1418a(new byte[]{-36, 15, -8}, new byte[]{-75, 98, -97, -60, -117, -70, 93, -43})).m606a(C0052e.m1418a(new byte[]{-8, -52, 121}, new byte[]{-103, -96, 13, -29, 105, 42, 5, -77})).trim();
                                                            String trim3 = next2.m967p0(C0052e.m1418a(new byte[]{23, 64, 24}, new byte[]{126, 45, Byte.MAX_VALUE, 34, -13, -68, 59, -90})).m606a(C0052e.m1418a(new byte[]{-43, -43, 21, 124, Byte.MAX_VALUE, -17, -32, 40, -42, -35, 15, 124, 62}, new byte[]{-79, -76, 97, 29, 82, Byte.MIN_VALUE, -110, 65})).trim();
                                                            String trim4 = next2.m967p0(C0052e.m1418a(new byte[]{-96, -116, -72, -66, -81, 55, 62, -13, -94, -118, -18, -82, -25, 32, 39, -4, -86}, new byte[]{-60, -27, -50, -112, -57, 83, 87, -99})).m602e().trim();
                                                            JSONObject jSONObject3 = new JSONObject();
                                                            jSONObject3.put(C0052e.m1418a(new byte[]{-110, 1, -12, -3, 11, 110}, new byte[]{-28, 110, -112, -94, 98, 10, 50, -27}), group);
                                                            jSONObject3.put(C0052e.m1418a(new byte[]{19, 54, 113, 59, 63, -95, 121, -69}, new byte[]{101, 89, 21, 100, 81, -64, 20, -34}), trim2);
                                                            jSONObject3.put(C0052e.m1418a(new byte[]{8, 125, 9, -94, -102, 106, 83}, new byte[]{126, 18, 109, -3, -22, 3, 48, 81}), trim3);
                                                            jSONObject3.put(C0052e.m1418a(new byte[]{38, 23, -28, -69, 55, -65, -51, -72, 34, 19, -13}, new byte[]{80, 120, Byte.MIN_VALUE, -28, 69, -38, -96, -39}), trim4);
                                                            jSONArray2.put(jSONObject3);
                                                            break;
                                                        case 479906416:
                                                            m897d4 = atm.m897d("B1E3A1DE97C2B1EDA1E397FEB1EDA1DE97F3B1DDA1D997FEB1E2A1EA97C0B1DAA1EC97CEB1E3A1D997F4");
                                                    }
                                                }
                                                break;
                                            case 135933465:
                                                m897d3 = atm.m897d("B1E6A1D197C4B1E2A1D197C1B1E1A1EA97C4B1ECA1D097FCB1DDA1D297CFB1D8A1DE97C0B1E1");
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
            } catch (Exception e) {
                e = e;
                SpiderDebug.log(e);
                return "";
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x058b, code lost:
        r0 = com.github.catvod.spider.merge.atm.m897d("B1D2A1D597C3B1DCA1DE97C1B1DDA1DE97CFB1EDA1D797CFB1E3A1D997F3B1DCA1DD97F4B1DCA1DE97FDB1E2A1D097C1B1E3A1D097F0B1E1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0593, code lost:
        r0 = com.github.catvod.spider.merge.atm.m897d("B1ECA1EC97F9B1E2A1EA97F3B1E3A1EE97F0B1E5A1D097CEB1E2A1D297C1B1D2A1D997F3B1D2A1ED97FCB1E2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x059b, code lost:
        r2.put(com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{19, -41, 91, -82}, new byte[]{96, -94, 57, -56, 90, 20, 74, 42}), com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{-47, -103, -102, 3, -8, -27, 21, -46, -45, -41}, new byte[]{-2, -17, -18, 119, -41, -112, 97, -76}));
        r0 = com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{-127, 93, -52, 81}, new byte[]{-14, 40, -82, 37, -122, 76, 48, 13});
        r2.put(r0, com.github.catvod.spider.Proxy.getUrl() + com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{-108, -16, -107, 118, 100, -17, -20, -19, -37, -78, -113, 57, 107, -88}, new byte[]{-85, -108, -6, 75, 7, -107, -97, -99}) + java.net.URLEncoder.encode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
        r2 = new org.json.JSONObject();
        r2.put(com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{-113, -66, 40, -114, 77}, new byte[]{-1, -33, 90, -3, 40, -92, -28, -109}), com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{31}, new byte[]{47, 43, -84, -47, -104, -56, 94, -61}));
        r2.put(com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{-70, 20, -52, 66, -17, 4, -76}, new byte[]{-54, 120, -83, 59, -70, 118, -40, -83}), "");
        r2.put(com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{94, -40, -98}, new byte[]{43, -86, -14, 29, -27, -58, 122, -42}), r0);
        r2.put(com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{-2, -105, 58, 32, 103, 22}, new byte[]{-106, -14, 91, 68, 2, 100, -3, -35}), "");
        r0 = com.github.catvod.spider.merge.atm.m897d("B1E2A1E297F9B1D2A1D197FEB1DDA1E997C3B1D8A1D497C2B1ECA1DE97FFB1E5A1E297FDB1D2A1D097FEB1E2A1EC97F8B1DCA1ED97FEB1D1A1E3");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0173, code lost:
        switch((r0.hashCode() ^ (-45060447))) {
            case -1872361872: goto L36;
            case -603762074: goto L55;
            case -562943071: goto L46;
            case 962493168: goto L49;
            default: goto L56;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:?, code lost:
        return r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017b, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017d, code lost:
        r0 = com.github.catvod.spider.merge.atm.m897d("B1E3A1D397FAB1EDA1DD97FAB1DEA1ED97FFB1E0A1E397F9B1E6A1D297C7B1D8A1ED97FEB1DBA1E997C0B1DDA1EA97F3");
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String playerContent(java.lang.String r14, java.lang.String r15, java.util.List<java.lang.String> r16) {
        /*
            Method dump skipped, instructions count: 2268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0593h.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            C0459g m967p0 = C0321F.m846d(m285c(str)).m967p0(C0052e.m1418a(new byte[]{-91, -3, -126, -26, -111, 119, 85, -57, -92, -53, -97, -84, -36, 32, 42, -36, -83, -76, -54, -24, -112, 119}, new byte[]{-63, -108, -12, -56, -4, 30, 10, -87}));
            JSONArray jSONArray = new JSONArray();
            Iterator<C0293m> it = m967p0.iterator();
            while (true) {
                String m897d = atm.m897d("B1D6A1D097F9B1E2A1E397FAB1D8A1D997C2B1ECA1DD97FDB1DFA1D997FEB1EDA1D397F3B1DCA1D597F0B1E6");
                while (true) {
                    switch (m897d.hashCode() ^ 554142) {
                        case 536810262:
                            jSONObject.put(C0052e.m1418a(new byte[]{-51, 85, -87, 43}, new byte[]{-95, 60, -38, 95, 74, 7, 96, -117}), jSONArray);
                            return jSONObject.toString();
                        case 721432948:
                            m897d = it.hasNext() ? atm.m897d("B1D8A1D597F9B1E2A1D097F8B1DEA1D497C4B1E0A1ED97C1B1DEA1D097C7B1E0") : atm.m897d("B1E2A1ED97F0B1E2A1D497FAB1D2A1ED97FFB1DCA1D097C0B1EDA1D797FFB1DCA1EC97C3B1DBA1D997CEB1EDA1D797C7");
                        case 1310029782:
                            m897d = atm.m897d("B1D1A1EA97FEB1E2A1E397F0B1E1A1E397FAB1EDA1EF97FDB1D6A1D797F0B1DCA1EA97C0B1D2A1ED97F9B1E0A1EC97F8B1E0A1EF97C0B1E0A1D4");
                        case 1910824561:
                            C0293m next = it.next();
                            Matcher matcher = f1085f.matcher(next.m967p0(C0052e.m1418a(new byte[]{43}, new byte[]{74, -15, -58, 51, -5, -94, -64, 42})).m606a(C0052e.m1418a(new byte[]{71, -8, -63, -120}, new byte[]{47, -118, -92, -18, -71, 30, -117, 108})));
                            JSONObject jSONObject2 = new JSONObject();
                            String m897d2 = atm.m897d("B1D8A1D197F4B1DFA1E997F8B1EDA1D997FFB1DBA1D097C4B1DDA1E997C7B1E6A1DD");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1265615348)) {
                                    case -638835063:
                                        m897d2 = atm.m897d("B1D6A1E997C4B1E0A1EC97F0B1E6A1D197C4B1DFA1EF97F0B1D1A1ED");
                                    case -94398651:
                                        break;
                                    case 172101226:
                                        String group = matcher.group(1);
                                        String trim = next.m967p0(C0052e.m1418a(new byte[]{22, 30, 53}, new byte[]{Byte.MAX_VALUE, 115, 82, -23, -16, 124, Byte.MAX_VALUE, 14})).m606a(C0052e.m1418a(new byte[]{-12, 6, -115}, new byte[]{-107, 106, -7, -26, Byte.MAX_VALUE, 93, 86, -78})).trim();
                                        String m897d3 = atm.m897d("B1D8A1E997FEB1DDA1E397F0B1E2A1D997FAB1D2A1ED97C0B1DCA1D297FAB1DBA1E997F9B1D1A1D097C0B1D2A1E397F3B1D2A1EC97FDB1D8A1E997C1");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1332776326) {
                                                case -570849533:
                                                    break;
                                                case -327271056:
                                                    m897d3 = trim.contains(str) ? atm.m897d("B1DBA1D097C4B1E2A1D197C0B1EDA1EE97F3B1DCA1ED97FCB1DAA1E297CFB1D8A1D397C0B1ECA1EF97F9B1E2A1EE97F8B1DEA1ED97CEB1E2A1ED") : atm.m897d("B1E1A1EF97CFB1D2A1D197C0B1ECA1D797C4B1E2A1ED97F8B1EDA1E397C2B1D8A1EF97FEB1D6");
                                                case 607472585:
                                                    m897d3 = atm.m897d("B1D8A1E297F9B1E2A1E297F0B1E1A1DD97C7B1DEA1EE97C4B1DDA1D797FEB1EC");
                                                case 1769625469:
                                                    String trim2 = next.m967p0(C0052e.m1418a(new byte[]{-62, 31, Byte.MIN_VALUE}, new byte[]{-85, 114, -25, 15, 115, 113, 27, -29})).m606a(C0052e.m1418a(new byte[]{-20, -113, 121, -20, -42, 102, -116, 21, -17, -121, 99, -20, -105}, new byte[]{-120, -18, 13, -115, -5, 9, -2, 124})).trim();
                                                    String m602e = next.m967p0(C0052e.m1418a(new byte[]{-97, 93, -31, 96, 90, -45, 115, -52, -48, 89}, new byte[]{-79, 55, -120, 4, 51, -13, 0, -68})).m602e();
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-91, 79, 104, -49, -85, 67}, new byte[]{-45, 32, 12, -112, -62, 39, 120, 111}), group);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{10, 27, -108, -93, 101, 62, 55, 45}, new byte[]{124, 116, -16, -4, 11, 95, 90, 72}), trim);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-100, 76, 92, -42, -127, -19, 59}, new byte[]{-22, 35, 56, -119, -15, -124, 88, -55}), trim2);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{117, 32, 20, 71, 46, 84, -103, -52, 113, 36, 3}, new byte[]{3, 79, 112, 24, 92, 49, -12, -83}), m602e);
                                                    jSONArray.put(jSONObject2);
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 2095695037:
                                        m897d2 = !matcher.find() ? atm.m897d("B1DFA1ED97FFB1E2A1DE97FCB1D8A1E297C4B1D1A1D997F4B1E1A1D397F0B1DFA1D097CFB1DA") : atm.m897d("B1ECA1ED97F9B1E2A1D297CEB1E3A1E997CEB1E1A1EF97FAB1EDA1DD97CEB1E5A1D497FCB1E1A1E297CF");
                                }
                            }
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
