package com.github.catvod.spider.merge.p046l;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p026b.C0309g;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p028c.C0425b;
import com.github.catvod.spider.merge.p028c.C0426c;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p042j.C0576d;
import com.github.catvod.spider.merge.p055q.C0649a;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.l.e */
/* loaded from: classes.dex */
public final class C0613e {

    /* renamed from: a */
    private final Map<String, String> f1171a;

    /* renamed from: b */
    private final List<String> f1172b;

    /* renamed from: c */
    private String f1173c;

    /* renamed from: d */
    private String f1174d;

    /* renamed from: e */
    private String f1175e;

    /* renamed from: f */
    private String f1176f;

    /* renamed from: g */
    private String f1177g;

    /* renamed from: h */
    private String f1178h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0613e() {
        try {
            String m897d = atm.m897d("B1ECA1D597FEB1DFA1D297CFB1E6A1D397F3B1D1A1E297FDB1E2A1D197F0B1E5");
            while (true) {
                switch (m897d.hashCode() ^ (-783269757)) {
                    case -759076992:
                        m897d = atm.m897d("B1DAA1DD97F8B1E2A1D097FFB1E2A1DE97C2B1DFA1ED97C2B1EDA1D797F3B1DFA1D297C0");
                        break;
                    case -493334987:
                        this.f1178h = C0649a.m153c(C0052e.m1418a(new byte[]{-104, -94, -18, -95, 62, 97}, new byte[]{-22, -51, -116, -51, 81, 25, -1, 30}));
                        JSONObject jSONObject = new JSONObject(this.f1178h);
                        long time = new SimpleDateFormat(C0052e.m1418a(new byte[]{-102, 100, -15, -110, 33, 62, 68, 64, -121, 121, -88, -125, 100, 73, 100, 0, -39, 110, -5, -53, 109}, new byte[]{-29, 29, -120, -21, 12, 115, 9, 109}), new Locale(C0052e.m1418a(new byte[]{-73, 29, -91, -49, -108}, new byte[]{-51, 117, -6, -116, -38, -95, 6, 117}))).parse(jSONObject.optString(C0052e.m1418a(new byte[]{-33, -81, -41, 104, 112, -22, 57, -31, -56, -77, -56, Byte.MAX_VALUE}, new byte[]{-68, -38, -91, 26, 21, -124, 77, -66}))).getTime() / 1000;
                        String m897d2 = atm.m897d("B1D2A1DE97CFB1DCA1EA97C0B1E2A1DE97FAB1DBA1D297FCB1E6A1ED97F9B1DEA1DD97C0B1DEA1D497FDB1D1A1EE97FEB1E2A1D397F8");
                        while (true) {
                            switch (m897d2.hashCode() ^ (-1443135471)) {
                                case -1480576668:
                                    this.f1175e = jSONObject.optString(C0052e.m1418a(new byte[]{-13, -65, 112, 71, -82, 16, 72, -11}, new byte[]{-105, -51, 25, 49, -53, 79, 33, -111}));
                                    this.f1176f = jSONObject.optString(C0052e.m1418a(new byte[]{58, 42, -8, -36, 12, -41, 54, 116, 40, 53, -50, -9, 2, -33, 48, Byte.MAX_VALUE}, new byte[]{91, 70, -111, -125, 109, -76, 85, 17}));
                                    this.f1177g = jSONObject.optString(C0052e.m1418a(new byte[]{30, 39, -77, 32, -92, -70, 32, 46, 20, 36, -91, 17, -113, -76, 40, 40, 31}, new byte[]{113, 87, -42, 78, -5, -37, 67, 77}));
                                    break;
                                case -429738750:
                                    break;
                                case -399106870:
                                    if ((System.currentTimeMillis() / 1000) - time <= 7200) {
                                        m897d2 = atm.m897d("B1D2A1EF97CEB1DFA1D197FDB1ECA1DD97FAB1DDA1D997F3B1DEA1E297F8");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1E3A1ED97F0B1E2A1E397C1B1E2A1D797C1B1DBA1E297C0B1E6A1D997F8B1ECA1ED97F9B1D8A1E397C1B1D1A1D797FEB1EDA1D097F0B1DEA1D3");
                                        break;
                                    }
                                case 210750223:
                                    m897d2 = atm.m897d("B1D8A1EF97C0B1E6A1E297C3B1E1A1E997FCB1D2A1D597C0B1E5A1ED97F3B1D8A1EE97C3B1E2A1D797FDB1E1A1D197F0B1E2A1D597FDB1E5");
                                    break;
                            }
                        }
                        break;
                    case 557883575:
                        if (!C0649a.m153c(C0052e.m1418a(new byte[]{111, 123, 110, 66, 109, -85}, new byte[]{29, 20, 12, 46, 2, -45, -50, -69})).isEmpty()) {
                            m897d = atm.m897d("B1E1A1ED97C0B1E6A1EC97CFB1D2A1EE97F0B1E2A1E397CEB1DCA1ED97C4B1DBA1E997FEB1E5A1EF97C7B1DCA1E297F4B1E2A1ED97FFB1E1A1D1");
                            break;
                        } else {
                            m897d = atm.m897d("B1E3A1D997F0B1E2A1EE97F9B1E3A1DD97C1B1DBA1ED97C7B1ECA1ED97F8B1E3A1ED97C0B1DEA1D397FF");
                            break;
                        }
                    case 905189723:
                        break;
                }
            }
            m231j();
        } catch (Exception e) {
            SpiderDebug.log(e);
            Init.show(C0052e.m1418a(new byte[]{34, -57, -6, 60, 90, -85, -113, 121, -111, 38, 33, -80, -93, -32, -31, 97, -18, -119}, new byte[]{118, -88, -111, 89, 52, 78, 8, -61}));
        }
        this.f1172b = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f1171a = hashMap;
        hashMap.put(C0052e.m1418a(new byte[]{-71, -10}, new byte[]{-115, -67, -47, 99, 54, 106, 77, 45}), C0052e.m1418a(new byte[]{13, 2, -67}, new byte[]{88, 74, -7, -71, 29, 53, -107, -45}));
        hashMap.put(C0052e.m1418a(new byte[]{48, 121}, new byte[]{2, 18, -85, -110, -110, 114, -115, 104}), C0052e.m1418a(new byte[]{-7, -93, 36}, new byte[]{-88, -21, 96, 104, -70, -124, 105, -27}));
        hashMap.put(C0052e.m1418a(new byte[]{-55, -3, 106, -83, -107, -17}, new byte[]{33, 75, -17, 75, 45, 106, -126, 65}), C0052e.m1418a(new byte[]{122, 44, 74}, new byte[]{60, 100, 14, 22, Byte.MIN_VALUE, -14, 12, 1}));
        hashMap.put(C0052e.m1418a(new byte[]{6, -16, -52, -51, 114, -47}, new byte[]{-17, 91, 84, 43, -54, 84, -99, -61}), C0052e.m1418a(new byte[]{-24, -101}, new byte[]{-96, -33, 107, -104, 26, -10, -75, 45}));
        hashMap.put(C0052e.m1418a(new byte[]{-67, -120, -123, 82, 29, 60}, new byte[]{91, 32, 28, -76, -91, -71, 64, 50}), C0052e.m1418a(new byte[]{117, -112}, new byte[]{38, -44, 3, 49, -123, 71, -88, 71}));
        hashMap.put(C0052e.m1418a(new byte[]{-118, -5, 80, -96, -35, -15}, new byte[]{108, 78, -47, 70, 71, 83, 32, 64}), C0052e.m1418a(new byte[]{-24, -108}, new byte[]{-92, -48, 66, -88, -81, -29, 89, 44}));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: a */
    public static void m240a(C0613e c0613e) {
        boolean z;
        Iterator it = c0613e.f1172b.iterator();
        while (true) {
            String m897d = atm.m897d("B1DBA1D197C0B1DCA1E997F3B1D1A1D797FFB1E6A1EC97FDB1E3A1ED97FDB1DBA1D197C0B1E2A1D997C7B1EDA1D597F9B1E2A1D997F4B1E1");
            while (true) {
                switch (m897d.hashCode() ^ (-1373848880)) {
                    case -1888417694:
                        return;
                    case -161064985:
                        m897d = it.hasNext() ? atm.m897d("B1DEA1DD97F0B1E2A1D797FCB1E2A1ED97F8B1E0A1EE97FAB1D2A1EF97C3B1D2A1ED") : atm.m897d("B1E3A1D797FCB1E6A1EE97F9B1E2A1E997FEB1DDA1ED97F9B1E3A1D597F8B1EC");
                    case -139118350:
                        m897d = atm.m897d("B1D8A1D297FEB1E5A1D497CEB1E2A1EA97F3B1D8A1EC97CEB1ECA1D297C4B1DDA1DE97F0B1EDA1D797F9B1DF");
                    case 683172294:
                        String str = (String) it.next();
                        try {
                            SpiderDebug.log(C0052e.m1418a(new byte[]{64, -97, 116, 72, -32, 83, 51, -103, 42}, new byte[]{4, -6, 24, 45, -108, 54, 29, -73}) + str);
                            int length = c0613e.m239b(C0052e.m1418a(new byte[]{-89, -4, -64, -97, 18, 35, 75, 92, -12, -73, -48, -105, 16, 37, 12}, new byte[]{-58, -104, -78, -10, 100, 70, 100, 42}), String.format(C0052e.m1418a(new byte[]{96, 79, -105, -103, 6, -15, 31, -38, 111, 30, -57, -58, 44, -1, 88, -53, 116, 9, -100, -34, 77, -1, 88, -51, 105, 4, -109, -103, 40, -19, 30, -117, 33, 79, -64, -113, 85, -88, 88, -49, 114, 1, Byte.MIN_VALUE, -93, 30, -32, 88, -109, 57, 72, -106, -34, 10, -88, 88, -63, 126, 12, -127, -103, 5, -9, 88, -109, 96, 79, -90, -109, 25, -16, 31, -57, 111, 64, -79, -123, 7, -31, 88, -109, 57, 12, -107, -116, 27, -19, 25, -56, 111, 4, -118, -110, 88, -18, 9, -58, 117, 79, -104, -48, 85, -19, 30, -117, 33, 79, -64, -113, 85, -88, 88, -60, 126, 25, -115, -109, 19, -90, 64, -117, 75, 34, -74, -88, 85, -88, 88, -36, 105, 1, -57, -58, 85, -85, 28, -64, 119, 8, -54, -104, 18, -24, 31, -35, 126, 79, -104, -95, 91, -90, 8, -52, 104, 2, -112, -114, 20, -31, 88, -109, 57, 11, -116, -112, 18, -90, 7}, new byte[]{27, 109, -27, -4, 119, -124, 122, -87}), c0613e.f1175e, str, str), true).length();
                            String m897d2 = atm.m897d("B1D8A1D297F3B1EDA1E997C0B1E3A1D097F8B1E2A1ED97F8B1DCA1E297F3");
                            while (true) {
                                switch (m897d2.hashCode() ^ 924974545) {
                                    case -1833018195:
                                        z = false;
                                        break;
                                    case -1257663472:
                                        m897d2 = length == 211 ? atm.m897d("B1DCA1ED97FDB1E6A1DD97C1B1E1A1D597C0B1E2A1EC97FAB1ECA1ED97F8B1DDA1E997C0B1E1A1E397C1B1D2A1D397C4") : atm.m897d("B1E2A1DE97FFB1D8A1E297C1B1EDA1D197C0B1DAA1DE97F0B1E2A1EC97F0B1E2A1EC97FFB1E2A1ED97FAB1DFA1D797FEB1D1A1ED97C0B1DEA1D497C4");
                                    case 1421579273:
                                        z = true;
                                        break;
                                    case 1755459868:
                                        m897d2 = atm.m897d("B1DDA1DD97F8B1E2A1DD97CFB1E1A1EC97FFB1E1A1D297C0B1D2A1E997F8B1D1A1D397C4B1DFA1D397F0B1E2A1EE97FAB1E2A1ED97CFB1E1A1E997C0");
                                }
                            }
                        } catch (Exception e) {
                            z = false;
                        }
                        String m897d3 = atm.m897d("B1E0A1DD97F4B1E3A1D297F4B1D8A1DE97CEB1E1A1DE97F8B1D1A1D397F4B1DDA1D997C0B1E2A1D197C1B1E1A1D497F9B1DBA1ED");
                        while (true) {
                            switch (m897d3.hashCode() ^ 945172511) {
                                case -1306680027:
                                    m897d3 = atm.m897d("B1E3A1DD97FFB1DCA1D797F9B1ECA1D097C7B1DCA1DD97FEB1ECA1DE97F3B1D6A1D297F9B1E2");
                                case -432416489:
                                    break;
                                case -35728587:
                                    m897d3 = z ? atm.m897d("B1EDA1D297C1B1E0A1D097C3B1D2A1E997C0B1DCA1ED97FCB1E5A1DD97C0") : atm.m897d("B1DFA1E297C4B1E2A1D597C2B1DBA1E397F3B1DCA1DD97FDB1DFA1DD97FFB1E2A1ED97C1B1DBA1D297C0");
                                case 681649592:
                                    it.remove();
                                    break;
                            }
                        }
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    private String m239b(String str, String str2, boolean z) {
        String m897d = atm.m897d("B1ECA1DE97FFB1D8A1E397F9B1D6A1EE97C7B1D2A1DE97C2B1D1A1EE97F9B1D8A1D797FEB1DEA1D597F4B1EDA1EC97F9B1E2A1D597C3B1E0");
        StringBuilder sb = null;
        C0576d c0576d = null;
        String str3 = null;
        StringBuilder sb2 = null;
        String str4 = null;
        while (true) {
            switch ((m897d.hashCode() ^ 45) ^ (-1583327881)) {
                case -2096573034:
                    sb.append(str4);
                    m897d = atm.m897d("B1ECA1EA97FFB1D6A1D297C7B1DFA1D997C0B1DBA1D097C1B1DCA1DE97F8B1EDA1E997C1");
                    break;
                case -1783220103:
                    m897d = atm.m897d("B1D8A1E397FFB1E2A1DE97FAB1D8A1D797FAB1E6A1D497F8B1DCA1ED97FFB1DAA1EF97C7B1DEA1DD97C3B1D8A1DD97CFB1E1A1E9");
                    str4 = str;
                    break;
                case -1367660055:
                    String m897d2 = atm.m897d("B1DBA1D197C3B1E1A1D297F9B1DAA1D397F0B1E1A1E397F9B1E2A1E997FAB1D2A1D197F4B1E3A1E997C2B1EC");
                    while (true) {
                        switch (m897d2.hashCode() ^ 1460691071) {
                            case -558601043:
                                m897d2 = c0576d.m301b() == 429 ? atm.m897d("B1DBA1E397FFB1E1A1D097F0B1ECA1D097CFB1ECA1E397F0B1DDA1EA97FEB1E2A1E997C7B1D1A1EC97C4B1E2A1ED97F4B1D2A1ED") : atm.m897d("B1DEA1D297CEB1E0A1EA97C1B1DBA1D597C4B1E2A1EA97FCB1E6A1E397C4B1E6A1ED97C2B1E2A1DD97C0B1E2A1D097C0B1E6A1D497C0B1E2");
                            case 199998266:
                                break;
                            case 1575942232:
                                m897d2 = atm.m897d("B1DCA1EF97CFB1DDA1E297FEB1E1A1D797FDB1E2A1D597F3B1E6A1D097FFB1DBA1D497C0B1DEA1EE97FAB1E2A1DD97F0B1E2A1EE97FEB1D2A1ED");
                            case 2052952939:
                                m897d = atm.m897d("B1D6A1D597F8B1ECA1D297CEB1DDA1D197F0B1E2A1D497FEB1EDA1E997F4B1E6A1ED97CFB1D8A1D797F9B1E6A1D597F3B1D6");
                                break;
                        }
                    }
                    m897d = atm.m897d("B1DFA1ED97FDB1DCA1E397C2B1DAA1ED97CFB1E0A1D597CEB1E1A1D097F3B1EDA1DE97F3B1ECA1E297C2");
                    break;
                case -1004976769:
                    sb = new StringBuilder();
                    m897d = atm.m897d("B1DEA1D297FEB1E2A1E297FCB1D2A1E397F4B1D1A1ED97FFB1D2A1ED97CEB1DDA1EA97FDB1EDA1D197F4B1ED");
                    break;
                case -855291237:
                    m897d = atm.m897d("B1EDA1D097FAB1D2A1ED97FFB1E2A1D497FCB1DEA1EA97F9B1EDA1D397FEB1E0A1D197F3B1E1A1E397F3B1E1A1EC97FCB1ECA1DD97C1B1E3");
                    str4 = str3;
                    break;
                case -686191576:
                    String m897d3 = atm.m897d("B1E1A1EF97FDB1E2A1D597FAB1D8A1DE97CEB1DCA1EC97C2B1DCA1D997C4B1DCA1ED97C1B1DAA1EA");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-967804793)) {
                            case -1801754228:
                                m897d = atm.m897d("B1E5A1E297CEB1E2A1EE97C7B1D6A1D397F4B1DCA1ED97FEB1D6A1D197C4B1E1A1D797F4");
                                break;
                            case -1179457159:
                                m897d3 = z ? atm.m897d("B1EDA1D197C2B1E2A1D197F3B1DDA1D397F4B1E2A1EC97FDB1E2A1D197F9B1D1A1E297FEB1ECA1E997FCB1DAA1EF97CFB1ECA1EC97F4B1DD") : atm.m897d("B1DDA1D997C2B1D2A1D597CFB1DAA1DD97C4B1E2A1ED97F4B1D6A1ED97FDB1E2A1EC97CEB1DEA1D797F9B1E5");
                            case -1078514243:
                                break;
                            case 1304155276:
                                m897d3 = atm.m897d("B1D6A1DD97C3B1D1A1EF97C0B1D8A1D397F3B1E2A1EF97FCB1DEA1E997F0");
                        }
                    }
                    m897d = atm.m897d("B1D6A1EA97FCB1DDA1DE97FEB1DFA1ED97F8B1D6A1E997FFB1E2A1D797FDB1DCA1D097F9B1E2A1D597F9B1DDA1ED97FDB1DFA1EC97F3B1D8");
                    break;
                case -643578450:
                    String sb3 = sb2.toString();
                    m897d = atm.m897d("B1EDA1EF97C7B1E1A1D197F0B1E3A1D097FAB1DAA1E397C2B1DCA1D797FDB1E2A1D497C0B1DBA1D797C2B1DFA1D497F0B1DBA1ED");
                    str3 = sb3;
                    break;
                case -449900305:
                    return m239b(str4, str2, false);
                case -416089824:
                    StringBuilder sb4 = new StringBuilder();
                    m897d = atm.m897d("B1D2A1DD97F9B1D2A1DD97CFB1E5A1E997F3B1DDA1D197C0B1ECA1EE97FDB1E2A1D297F9B1E5A1D497C1B1DB");
                    sb2 = sb4;
                    break;
                case -316355234:
                    sb.append(C0052e.m1418a(new byte[]{106}, new byte[]{70, 7, 68, Byte.MAX_VALUE, 125, -73, 26, 93}));
                    m897d = atm.m897d("B1D8A1D497FEB1E2A1D797CFB1D2A1ED97C2B1DEA1DE97C4B1E3A1EE97FFB1DAA1DD97FCB1DFA1E297C0B1DEA1ED97C0B1E5A1D397C1");
                    break;
                case -189455014:
                    m897d = atm.m897d("B1EDA1D097FAB1D2A1ED97FFB1E2A1D497FCB1DEA1EA97F9B1EDA1D397FEB1E0A1D197F3B1E1A1E397F3B1E1A1EC97FCB1ECA1DD97C1B1E3");
                    break;
                case 325008140:
                    sb.append(c0576d.m302a());
                    m897d = atm.m897d("B1DCA1E397FCB1E5A1D597FEB1DAA1D297C1B1D6A1D097F0B1D2A1D297F0B1DCA1D597F0B1E2A1D497C4B1DDA1ED97C7B1ECA1D297C0");
                    break;
                case 412682119:
                    sb.append(c0576d.m301b());
                    m897d = atm.m897d("B1E3A1EA97C4B1E2A1DD97C7B1DAA1EC97F9B1DBA1EE97F4B1E2A1ED97F3B1D8A1DD97F3B1DAA1D2");
                    break;
                case 428348990:
                    String m897d4 = atm.m897d("B1D2A1E297F4B1DAA1D197FFB1DCA1EE97F3B1E3A1E397FEB1E2A1D997FCB1E5A1EE97C4B1E2A1ED97F3B1E0A1E997C0B1DBA1DE97CEB1E2");
                    while (true) {
                        switch (m897d4.hashCode() ^ (-1462038824)) {
                            case -2123881455:
                                m897d4 = atm.m897d("B1DEA1D497FFB1EDA1D997F3B1E1A1EC97FDB1E2A1D297FEB1DEA1D397FAB1E5A1E397F3B1D6A1DE97FFB1DEA1E997F9B1DCA1EF97C3");
                            case -687934735:
                                m897d = atm.m897d("B1DCA1EC97C7B1DBA1E297FCB1DDA1D297C3B1E2A1D497FFB1E2A1D197F4B1E6A1ED97CEB1D1A1D3");
                                continue;
                            case -212096712:
                                m897d4 = str.startsWith(C0052e.m1418a(new byte[]{-61, -54, -85, 43, 101}, new byte[]{-85, -66, -33, 91, 22, -20, -72, 31})) ? atm.m897d("B1D2A1DE97F0B1D6A1EE97F0B1D1A1EE97F4B1EDA1EF97F3B1DAA1D597CFB1D1A1D397F9B1E2") : atm.m897d("B1DCA1D597FAB1DDA1EC97C4B1D1A1E397CFB1D1A1EF97FEB1E2A1E397F9B1E2A1D997C4B1DBA1ED97C3B1E1");
                            case -87447570:
                                m897d = atm.m897d("B1EDA1D097FDB1E2A1D297FEB1E1A1EE97CFB1DDA1D397F8B1E6A1ED97C2B1E3A1DD");
                                continue;
                        }
                    }
                    break;
                case 507763291:
                    String m897d5 = atm.m897d("B1E5A1D097FEB1E2A1D397CFB1DBA1ED97C0B1ECA1D297F9B1D8A1D397CFB1ECA1DD");
                    while (true) {
                        switch (m897d5.hashCode() ^ (-1047582156)) {
                            case -675820137:
                                m897d5 = atm.m897d("B1E6A1D097FDB1E2A1ED97FFB1E6A1ED97FDB1E1A1EE97FCB1DBA1E297CFB1DFA1D2");
                            case -158040551:
                                m897d5 = c0576d.m301b() == 401 ? atm.m897d("B1D2A1E397FFB1E2A1D197C7B1DEA1D797C1B1ECA1EC97C4B1DAA1DD97F8B1D2A1ED97FDB1D8A1E997C1B1E5A1D097C0B1E2A1D097C0") : atm.m897d("B1ECA1DD97C4B1DCA1D197CEB1E2A1D997C7B1D2A1E297FEB1DCA1EF97C7B1E1A1D597FEB1E2A1E397F3B1E6A1ED97FDB1E2A1D297C0B1D1");
                            case 209208634:
                                break;
                            case 1247150537:
                                m897d = atm.m897d("B1DEA1D497FAB1E3A1D097FCB1D8A1D997C3B1E6A1E397C4B1DFA1D497F9B1D2A1E997C0B1E2");
                                break;
                        }
                    }
                    m897d = atm.m897d("B1D6A1EA97FCB1DDA1DE97FEB1DFA1ED97F8B1D6A1E997FFB1E2A1D797FDB1DCA1D097F9B1E2A1D597F9B1DDA1ED97FDB1DFA1EC97F3B1D8");
                    break;
                case 645265210:
                    C0576d m309d = C0574b.m309d(str4, str2, m233h());
                    m897d = atm.m897d("B1DAA1D297F8B1D2A1DD97FDB1E2A1D597C4B1ECA1ED97C4B1DEA1E297FCB1E2A1E397C0B1D8A1E297C7B1DAA1E397C0B1E2");
                    c0576d = m309d;
                    break;
                case 997702781:
                    return m239b(str4, str2, false);
                case 1265738182:
                    m897d = atm.m897d("B1E6A1D597FCB1DDA1E997CEB1DFA1D397F8B1DFA1ED97C2B1DBA1EF97FE");
                    break;
                case 1327232006:
                    m897d = atm.m897d("B1D8A1E997F9B1E2A1D397CEB1E2A1ED97FEB1DCA1D597FDB1DEA1DD97C0B1DCA1E397CEB1E2A1D297F9B1EDA1E997C1B1DEA1DD97FFB1DF");
                    break;
                case 1333319103:
                    sb2.append(str);
                    m897d = atm.m897d("B1DBA1EA97F0B1D6A1EE97C7B1D6A1DE97F9B1E5A1EF97FAB1E5A1EC97F0B1E2A1ED97CEB1DDA1ED97F9B1D1A1D7");
                    break;
                case 1393567034:
                    m897d = atm.m897d("B1DDA1EF97CEB1E5A1EC97F0B1E1A1EF97C4B1D1A1E397F0B1E6A1E997C0B1E2A1DE97C3B1ED");
                    break;
                case 1457929189:
                    sb2.append(C0052e.m1418a(new byte[]{-27, -120, 63, 18, -125, -20, 16, -86, -20, -116, 34, 76, -111, -70, 86, -4, -8, -110, 47, 16, -103, -96, 90, -85, -18, -109, 38, 77}, new byte[]{-115, -4, 75, 98, -16, -42, 63, -123}));
                    m897d = atm.m897d("B1E0A1D597FAB1E1A1D597FEB1D8A1EA97FEB1E2A1D397C4B1ECA1ED97C2B1DFA1D797CEB1D2A1ED97F3B1E2A1D397F8B1DCA1D397C0B1E6A1D597C7");
                    break;
                case 1509605682:
                    String m897d6 = atm.m897d("B1D1A1D797FEB1E2A1D397C2B1ECA1ED97FAB1DCA1D797F9B1E3A1E397C0B1DDA1DD97C1B1E0A1DD97FDB1E2A1EA97F9B1E3A1EC97FDB1E0A1E297FE");
                    while (true) {
                        switch (m897d6.hashCode() ^ (-294037878)) {
                            case -804527864:
                                break;
                            case 397715245:
                                m897d = atm.m897d("B1DBA1D097FFB1ECA1D397CEB1E2A1D397C1B1E2A1ED97F3B1D2A1ED97C0B1E1A1EA97FDB1E2A1EA97F4B1D2A1EC97F9B1D8A1D797FFB1DEA1D397FDB1EC");
                                break;
                            case 1391125442:
                                m897d6 = atm.m897d("B1E5A1DE97FDB1E2A1E997FEB1D2A1D397C7B1DFA1ED97FFB1E0A1E997C0B1D6A1D197F0B1E1A1EC97C3");
                            case 1801276620:
                                m897d6 = z ? atm.m897d("B1D1A1EE97F9B1D6A1DD97FDB1E2A1EF97F4B1DBA1ED97FCB1E5A1DD97C0B1E5A1D197C1B1D2A1D797FA") : atm.m897d("B1ECA1EF97FEB1E2A1E997C0B1D2A1ED97FAB1DEA1E297F3B1DBA1ED97C0B1E2A1ED97FCB1E2A1EA");
                        }
                    }
                    break;
                case 1782455321:
                    sb.append(C0052e.m1418a(new byte[]{53}, new byte[]{25, 89, -94, 118, 122, -127, -106, 123}));
                    m897d = atm.m897d("B1DAA1EE97CEB1DBA1EA97F4B1E3A1ED97C0B1DAA1ED97C7B1D2A1ED97FAB1DAA1D997C7B1D8A1DE97C2B1D8A1E297FEB1E2");
                    break;
                case 1887514659:
                    SpiderDebug.log(sb.toString());
                    m897d = atm.m897d("B1DDA1EA97F4B1D1A1EA97C7B1DAA1E397FFB1E2A1DD97FFB1E2A1EA97FDB1D1A1D997F0B1E2");
                    break;
                case 2131392279:
                    m897d = atm.m897d("B1DAA1EA97F9B1E2A1E997C4B1DEA1D297C3B1D8A1D297C2B1DBA1ED97FEB1D2A1D397C0B1DBA1ED97C4B1ECA1D597FAB1E2A1D097FAB1D1A1D297F8");
                    break;
                case 2135678816:
                    return c0576d.m302a();
            }
        }
    }

    /* renamed from: c */
    private String m238c(List<String> list) {
        String m897d = atm.m897d("B1D8A1EF97FFB1DCA1EE97C0B1DDA1ED97C0B1E2A1E397F8B1E0A1E397C7B1DEA1EC97FEB1E0A1E997F3B1ECA1ED97C4B1DBA1D997F4B1E2A1EE");
        String str = null;
        Iterator<String> it = null;
        StringBuilder sb = null;
        while (true) {
            switch ((m897d.hashCode() ^ 375) ^ 316857953) {
                case -1990029600:
                    m897d = atm.m897d("B1EDA1E397F4B1ECA1D797F3B1DAA1ED97F0B1E2A1D197F0B1ECA1D297C0B1DDA1ED97C3B1EDA1E297F4B1E0A1D497C2B1DDA1E297F0B1DAA1D9");
                    break;
                case -1433317046:
                    m897d = atm.m897d("B1D8A1D797FDB1DDA1D297C0B1E5A1D997C1B1E5A1D797C2B1E2A1DE97C1B1E3A1D097C4B1E6A1D597C7B1E0A1DE97FCB1DBA1EC97FC");
                    break;
                case -1363542566:
                    StringBuilder sb2 = new StringBuilder();
                    m897d = atm.m897d("B1DAA1EC97FAB1DEA1D997F0B1E0A1DD97FFB1E2A1D397FDB1DEA1D997FAB1D6A1D997C3B1DCA1E997C4B1D2A1ED");
                    sb = sb2;
                    break;
                case -1316193599:
                    m897d = atm.m897d("B1E0A1EF97F8B1DBA1D997C0B1E2A1EF97F3B1EDA1EC97C4B1E5A1D597FEB1DEA1E997F8B1E6A1E397FEB1D2A1D997C4B1DE");
                    str = it.next();
                    break;
                case -664782314:
                    Iterator<String> it2 = list.iterator();
                    m897d = atm.m897d("B1DEA1D997FEB1E2A1D797F8B1D6A1EA97F9B1E0A1E997FFB1E6A1ED97C1B1DBA1D9");
                    it = it2;
                    break;
                case -246646796:
                    m897d = atm.m897d("B1DEA1D997FEB1E2A1D797F8B1D6A1EA97F9B1E0A1E997FFB1E6A1ED97C1B1DBA1D9");
                    break;
                case 687568597:
                    return sb.toString();
                case 1019127759:
                    String m897d2 = atm.m897d("B1ECA1DD97F9B1E0A1D497C3B1DAA1DE97FDB1E2A1D197CEB1DBA1D797FFB1E6A1ED97CEB1D2A1DD97C0");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1088415603)) {
                            case -1355670686:
                                m897d2 = it.hasNext() ? atm.m897d("B1D1A1D497C4B1E2A1D797F9B1D1A1D097F4B1DAA1D597F8B1D2A1ED97C3B1E2A1DD97C4B1DEA1EC") : atm.m897d("B1D1A1D097C0B1D6A1EC97F4B1DFA1D597FAB1E5A1EE97FDB1E3A1E997FDB1E2A1EC97C7B1DDA1DE97CFB1EC");
                            case -1061154161:
                                m897d = atm.m897d("B1E2A1E397F9B1E2A1D497FEB1E6A1D097C3B1D2A1ED97C3B1E2A1D297FEB1E3A1ED");
                                continue;
                            case -851342632:
                                m897d2 = atm.m897d("B1D1A1E297FDB1E2A1ED97FEB1E6A1ED97C4B1D1A1E997C0B1E0A1D297F9B1E2A1EA97FEB1E6A1E397F0B1ECA1ED");
                            case -828385124:
                                m897d = atm.m897d("B1E2A1D297C4B1E2A1D097F3B1DBA1D597F3B1E0A1D597F0B1E2A1DE97FFB1DE");
                                continue;
                        }
                    }
                    break;
                case 1348162275:
                    sb.append(str);
                    m897d = atm.m897d("B1E3A1EE97C2B1D6A1D097FFB1E2A1EC97F4B1DBA1ED97C0B1EDA1DE97CEB1E6A1D097C0B1E6A1DE97FEB1E5A1D197FD");
                    break;
                case 1563772481:
                    sb.append(C0052e.m1418a(new byte[]{78}, new byte[]{101, 108, -31, -11, 94, 50, 5, 106}));
                    m897d = atm.m897d("B1E2A1D297CFB1ECA1D097FCB1D6A1EA97C1B1D2A1E297F8B1E3A1D197C2B1D1A1EE97C4");
                    break;
            }
        }
    }

    /* renamed from: d */
    private String m237d(String str) {
        String m897d = atm.m897d("B1E0A1D097F3B1E6A1D197CEB1DAA1ED97F3B1DAA1D297FFB1DCA1D097CEB1DBA1ED97C2B1D8A1E997C0B1E3A1E997C4B1E2");
        String str2 = null;
        String str3 = null;
        StringBuilder sb = null;
        while (true) {
            switch ((m897d.hashCode() ^ 842) ^ 1161037539) {
                case -2067131829:
                    str2 = m239b(C0052e.m1418a(new byte[]{-13, -78, 97, 36, -120, -76, -47, 46, -96, -7, 113, 44, -118, -78, -106}, new byte[]{-110, -42, 19, 77, -2, -47, -2, 88}), str3, true);
                    m897d = atm.m897d("B1D2A1EE97FDB1DBA1D797F3B1E3A1D097F0B1E2A1EA97C4B1DBA1ED97C2B1E1");
                    continue;
                case -1656648477:
                    m897d = atm.m897d("B1EDA1DD97C3B1EDA1D197C4B1D2A1E297F0B1E2A1E297FDB1D2A1ED97C3B1E6A1ED97C4B1E2A1D197F9B1E2A1EA");
                    continue;
                case -1417842749:
                    m231j();
                    m897d = atm.m897d("B1DAA1D397CFB1DEA1D297FDB1E2A1DD97C4B1DCA1ED97FFB1DEA1ED97C0B1DFA1DE97CF");
                    continue;
                case -1332345426:
                    Init.show(C0052e.m1418a(new byte[]{39, 19, 56, 111, -42, 63, 78, -17, -88, -2, -23, -42, 50, -7, -50, 37, 108, -90, -94, -89}, new byte[]{-63, -120, -116, -119, 91, -99, 42, -99}));
                    m897d = atm.m897d("B1E5A1D497F0B1E1A1E397C4B1E0A1E297F9B1DDA1EE97FAB1E6A1D097CEB1E2");
                    continue;
                case -1297538881:
                    m897d = atm.m897d("B1DEA1D297FAB1E0A1D097FFB1E2A1D597FEB1DDA1ED97CEB1D6A1D097C0B1D1A1ED97C2B1E5A1EE97C4B1E2");
                    continue;
                case -966008190:
                    break;
                case -901680581:
                    SpiderDebug.log(sb.toString());
                    m897d = atm.m897d("B1DEA1D097C2B1DFA1D297C0B1DDA1DD97C0B1D6A1D797C0B1E2A1DD97FAB1ECA1ED97F4B1D2A1ED97CFB1DFA1D397CFB1E2A1D297C0B1DCA1D397C2");
                    continue;
                case -650982311:
                    return m237d(str);
                case -624089587:
                    sb.append(C0052e.m1418a(new byte[]{-40, 35, -116, -69, -22, 48, 75}, new byte[]{-101, 76, -4, -62, -60, 30, 101, -119}));
                    m897d = atm.m897d("B1E6A1D997C1B1ECA1E997CFB1E2A1EF97FEB1E2A1D797FAB1DFA1D497F0B1DCA1D797F4B1E6A1D597FAB1DCA1ED");
                    continue;
                case -412877831:
                    sb.append(str);
                    m897d = atm.m897d("B1DCA1D997F0B1E5A1EE97C4B1E2A1EC97CEB1EDA1EC97F3B1DDA1EE97FAB1DFA1ED97FCB1DD");
                    continue;
                case -269032103:
                    return new JSONObject(str2).getJSONArray(C0052e.m1418a(new byte[]{-102, -70, -11, 98, 92, -42, -83, -65, -101}, new byte[]{-24, -33, -122, 18, 51, -72, -34, -38})).getJSONObject(0).getJSONObject(C0052e.m1418a(new byte[]{10, -87, 109, -15}, new byte[]{104, -58, 9, -120, -13, -122, -54, -93})).getString(C0052e.m1418a(new byte[]{-79, -56, 92, -66, -13, 28, 121}, new byte[]{-41, -95, 48, -37, -84, 117, 29, -51}));
                case -174496580:
                    StringBuilder sb2 = new StringBuilder();
                    m897d = atm.m897d("B1D8A1DE97F0B1EDA1EA97C1B1E6A1D197FDB1E3A1D397FFB1E2A1D097F3B1DEA1DE97FEB1D6A1EE97FCB1D2A1DD97CEB1DFA1ED");
                    sb = sb2;
                    continue;
                case 618819520:
                    String m897d2 = atm.m897d("B1D8A1DD97C4B1ECA1D597FEB1E2A1EA97FAB1DEA1DD97F8B1DDA1D097CEB1ECA1D097C3B1E6A1DE97F8B1DDA1EE97C2B1E3A1E397C4B1DA");
                    while (true) {
                        switch (m897d2.hashCode() ^ 522837246) {
                            case -1785947588:
                                m897d = atm.m897d("B1D2A1EC97C4B1DFA1DD97FFB1EDA1D297FDB1E2A1EE97F0B1E2A1EA97F4B1ECA1ED97F8B1E1A1E2");
                                continue;
                            case 1592557103:
                                m897d2 = !str2.contains(C0052e.m1418a(new byte[]{-97, -121, -71, -49, 111, 107, -23, -51, -73, -90, -92, -3, 99, 125, -32, -63, -86, -101, -94, -62, 104, 33, -53, -63, -75, -115}, new byte[]{-39, -24, -53, -83, 6, 15, -115, -88})) ? atm.m897d("B1E0A1D297F9B1E0A1EF97FEB1DDA1DE97F0B1DCA1D497F0B1E2A1D997F9B1DBA1E997F4B1D6A1EE97F9B1DCA1DE97F3B1EDA1D597FDB1ED") : atm.m897d("B1E0A1D197F3B1DDA1DD97CEB1E2A1DD97F4B1DCA1ED97CEB1D2A1ED97FCB1ECA1E997C0B1D2A1EC97F0B1E2A1EC97C4B1E2A1EF97C0B1D8");
                            case 1698888912:
                                m897d2 = atm.m897d("B1E3A1E297FEB1E2A1EC97F0B1DFA1EC97C3B1DFA1D197C2B1DCA1D797FEB1DBA1D597FAB1DBA1D497FAB1ECA1DD97FEB1E2A1E397FAB1D2");
                            case 1888275060:
                                break;
                        }
                    }
                    break;
                case 1457664535:
                    String m897d3 = atm.m897d("B1D2A1DD97F9B1E2A1D797FFB1E2A1EC97FEB1D8A1EE97F0B1E5A1D597FEB1E2A1EF97C7");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1203196566)) {
                            case 355897844:
                                m897d3 = str2.contains(C0052e.m1418a(new byte[]{-59, -15, 94, -60, -86, 82, 109, -50, -11, -15, 66, -60, -82, 115, 59, -30, -26, -19, 71, -43}, new byte[]{-108, -124, 49, -80, -53, 23, 21, -90})) ? atm.m897d("B1E6A1D997CEB1DBA1E997F8B1DDA1D397FFB1E2A1D397CEB1ECA1ED97C0B1E6A1D597CEB1E5A1D397FCB1ECA1ED97C3B1D2A1ED97C0") : atm.m897d("B1DEA1D297CEB1E2A1DE97C3B1EDA1D397C7B1E1A1D297C1B1D1A1D397CFB1D2A1ED97C0B1ECA1DD97C4B1D8A1D497C0B1E6A1EA");
                            case 452862747:
                                m897d3 = atm.m897d("B1D6A1D597C0B1E1A1D397C0B1E2A1D797FDB1EDA1D197FEB1E2A1EF97FDB1E6");
                            case 789042314:
                                m897d = atm.m897d("B1ECA1E997C0B1E5A1E997CEB1D8A1DD97C0B1E3A1D597C2B1E0A1D597F9B1ECA1D297F3B1DBA1D497C4B1E2A1EC97CEB1D1");
                                continue;
                            case 967204058:
                                m897d = atm.m897d("B1ECA1D797FCB1D8A1EC97C0B1E2A1D397F8B1D8A1DE97FEB1ECA1ED97C2B1DAA1ED97C0B1E0A1EE97C0B1DCA1DE97C1B1DCA1D997C4B1E3A1D197C0");
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1646237417:
                    String format = String.format(C0052e.m1418a(new byte[]{-6, 13, 4, 23, 14, -23, 97, 34, -11, 92, 84, 72, 36, -25, 38, 51, -18, 75, 15, 80, 69, -25, 38, 55, -24, 67, 19, 45, 22, -8, 38, 107, -93, 10, 5, 80, 83, -66, 119, 57, -32, 93, 19, 45, 22, -8, 38, 107, -93, 10, 5, 80, 83, -66, 101, 36, -11, 64, 41, 0, 26, -14, 101, 60, -28, 13, 76, 6, 13, -23, 97, 125, -93, 91, 25, 45, 15, -3, 118, 52, -17, 91, 41, 20, 22, -16, 97, 14, -24, 75, 84, 72, 93, -18, 107, 62, -11, 13, 90, 80, 11, -13, 91, 53, -13, 70, 0, 23, 32, -11, 96, 115, -69, 13, 83, 1, 93, -31, 40, 115, -23, 74, 23, 22, 26, -18, 119, 115, -69, 84, 84, 49, 16, -14, 112, 52, -17, 91, 91, 38, 6, -20, 97, 115, -69, 13, 23, 2, 15, -16, 109, 50, -32, 91, 31, 29, 17, -77, 110, 34, -18, 65, 84, 15, 83, -66, 109, 53, -93, 21, 84, 66, 93, -80, 38, 60, -28, 91, 30, 29, 27, -66, 62, 115, -47, 96, 37, 38, 93, -80, 38, 36, -13, 67, 84, 72, 93, -77, 98, 56, -19, 74, 89, 17, 16, -20, 125, 115, -4, 114, 90, 80, 13, -7, 119, 62, -12, 93, 21, 23, 93, -90, 38, 55, -24, 67, 19, 80, 2}, new byte[]{-127, 47, 118, 114, Byte.MAX_VALUE, -100, 4, 81}), str, this.f1174d, this.f1175e);
                    m897d = atm.m897d("B1D6A1E997FDB1D1A1D597C0B1E2A1E997C3B1DBA1D597F0B1DFA1E297C0B1DBA1E397C4B1DAA1E997FEB1E2A1ED97F0B1E2A1EE");
                    str3 = format;
                    continue;
            }
            m897d = atm.m897d("B1DEA1E397F4B1E2A1EC97FEB1DBA1D597CFB1DBA1D397C4B1E5A1D497C4B1D1A1D297FCB1DBA1E297F8B1DAA1D397FA");
        }
    }

    /* renamed from: e */
    public static C0613e m236e() {
        while (true) {
            switch ((atm.m897d("B1E0A1D597CFB1E5A1DD97C7B1D2A1EF97F9B1E2A1EC97F8B1DDA1D597C0B1E0A1D397FEB1DD").hashCode() ^ 972) ^ 1716120971) {
                case 204013424:
                    return C0612d.f1170a;
            }
        }
    }

    /* renamed from: h */
    private HashMap<String, String> m233h() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1ECA1D197F4B1E5A1D997F3B1D8A1D497F9B1D2A1D997F8B1E5A1DE97CEB1E2A1DD97C7B1DD");
        while (true) {
            switch ((m897d.hashCode() ^ 958) ^ (-1124202841)) {
                case -1923976303:
                    m897d = atm.m897d("B1E0A1ED97FDB1E2A1EC97C1B1DFA1ED97F3B1E6A1ED97F4B1D6A1E397C0B1D6A1D797CFB1ECA1EC97C0B1E3A1EA97FDB1E2A1D197F8B1D1A1D497C4B1E0");
                    break;
                case -266842976:
                    hashMap.put(C0052e.m1418a(new byte[]{115, -79, 112, 48, -43, 105, 62, -17, Byte.MAX_VALUE, -13, 104, 61, -38}, new byte[]{11, -100, 3, 88, -76, 27, 91, -62}), this.f1173c);
                    m897d = atm.m897d("B1EDA1DD97F0B1ECA1EA97F3B1E3A1DD97F9B1E2A1DD97F3B1DCA1E997F4B1E0A1DE97CFB1D2A1EC97CFB1DCA1D097F8B1DF");
                    break;
                case -256776161:
                    hashMap.put(C0052e.m1418a(new byte[]{-96, -45, 97, 119, -49, -124, -49, 99}, new byte[]{-8, -2, 34, 22, -95, -27, -67, 26}), C0052e.m1418a(new byte[]{-58, 65, -98, 39, 125, -58, 111, -121, -53, 73, -123, 45, 122, -42, 126, -89, -43, 93, -54, 35, 119, -64, 59, -80, -64, 1, -127, 39, 97, -63, 59, -87, -53, 16, -127, 118, 61, -127, 124, -9}, new byte[]{-91, 45, -9, 66, 19, -78, 82, -58}));
                    m897d = atm.m897d("B1DEA1D497F9B1DDA1EE97FEB1E2A1EA97C4B1E3A1E297F8B1ECA1D197C7B1D8A1EF97FCB1D2A1D997F4B1E6A1D497FAB1EDA1EC97FDB1E2");
                    break;
                case 231580283:
                    hashMap = m234g();
                    m897d = atm.m897d("B1E5A1DE97C2B1E6A1EF97CFB1ECA1D397FFB1E1A1E997C2B1DCA1E997C0B1E5A1D097F3");
                    break;
                case 1029086937:
                    return hashMap;
                case 1303393961:
                    hashMap.put(C0052e.m1418a(new byte[]{-58, 25, -48, -120, 56, 91, -66, 35, -58, 24, -51, -113, 57}, new byte[]{-89, 108, -92, -32, 87, 41, -41, 89}), this.f1176f);
                    m897d = atm.m897d("B1ECA1ED97F0B1E2A1DD97C4B1E3A1DD97C1B1DFA1D797F0B1D8A1DE97FDB1E2A1D797FDB1E5");
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* renamed from: i */
    private String m232i(JSONObject jSONObject, String str) {
        String m897d = atm.m897d("B1DFA1EF97CEB1DFA1D197C4B1E2A1E297FEB1D2A1ED97F8B1DBA1E397C0B1DBA1E297F0");
        int i = 0;
        JSONObject jSONObject2 = null;
        int i2 = 0;
        JSONArray jSONArray = null;
        while (true) {
            switch ((m897d.hashCode() ^ 138) ^ 875821314) {
                case -1909110360:
                    m897d = atm.m897d("B1D6A1DD97F0B1E1A1D397F4B1D1A1DE97FCB1DDA1D197C2B1DEA1DD97CEB1E0A1EF97F4B1DEA1D597C0B1E2");
                    i2 = 0;
                    break;
                case -1516270870:
                    m897d = atm.m897d("B1ECA1EC97FDB1DBA1EC97F0B1ECA1EE97F4B1DCA1DD97FEB1E2A1D497F4B1E0A1E297CEB1DB");
                    break;
                case -892082580:
                    String m897d2 = atm.m897d("B1E5A1E397CEB1E2A1EE97FEB1DFA1EA97C0B1ECA1ED97FDB1D1A1D297FEB1DEA1E9");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-519775890)) {
                            case -1817507368:
                                m897d2 = atm.m897d("B1E3A1E997F0B1E2A1D397F3B1D2A1ED97C3B1DEA1D497CEB1E5A1D397C0B1E1A1D197F4B1DAA1DE97F3B1DAA1EF97C7");
                            case -1224767164:
                                m897d = atm.m897d("B1E2A1D197F9B1E5A1EC97F0B1E2A1EF97F8B1D6A1E997C7B1DAA1D397F4B1EDA1D297FCB1E6A1D597F3B1DBA1D197FCB1E5A1D597F0B1E2");
                                continue;
                            case -704745613:
                                m897d = atm.m897d("B1E6A1E997C7B1DDA1DD97F8B1DBA1ED97F3B1DBA1D797FFB1DAA1EF97F0B1E2A1D597CFB1DFA1D597FDB1D2A1ED97F8B1DFA1ED");
                                continue;
                            case 1678687767:
                                m897d2 = i2 < jSONArray.length() ? atm.m897d("B1DBA1DE97CEB1E2A1EC97F4B1DBA1E297C4B1E3A1EF97FAB1E6A1D497F3B1DCA1EA97FEB1E2A1EF97FEB1E3") : atm.m897d("B1D1A1D797F4B1E3A1E997FAB1E5A1EE97C1B1DCA1DE97F0B1E2A1E297C0B1D2A1ED97C3B1E5A1D2");
                        }
                    }
                    break;
                case -790295907:
                    String m897d3 = atm.m897d("B1E2A1E297FAB1DFA1D797C1B1D1A1ED97F3B1DFA1DD97CEB1E2A1D2");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1440403828)) {
                            case -1907018685:
                                m897d3 = atm.m897d("B1E2A1D797C0B1E2A1EF97F0B1D1A1EF97C4B1DAA1D297FEB1E2A1E397FDB1D6A1D297FEB1E6A1D097C7B1ECA1D197F3B1E6A1EF97F3B1D2");
                            case -1700307951:
                                m897d3 = jSONObject2.getString(C0052e.m1418a(new byte[]{-76, -19, -16, -100, 77, -14, 78, 45, -97, -31, -7}, new byte[]{-64, -120, -99, -20, 33, -109, 58, 72})).equals(this.f1171a.get(str)) ? atm.m897d("B1DBA1DD97F8B1DEA1D397F0B1E2A1E297C7B1E6A1ED97CFB1E5A1EF97FAB1E5A1D797FEB1D2A1D097C0B1D2A1D997FDB1E2A1D497F8B1D1A1D997CFB1E2") : atm.m897d("B1EDA1DE97CFB1E5A1E297F9B1D8A1ED97FFB1E2A1DD97F9B1E5A1D497FAB1ECA1ED97C0B1DAA1DE97C7B1D8A1DE");
                            case -1465776147:
                                m897d = atm.m897d("B1E2A1D797F8B1DDA1EC97FDB1E2A1EA97C7B1DFA1ED97C1B1DBA1ED97F4B1E3A1D397C0B1DAA1EF97CF");
                                continue;
                            case 1839456092:
                                m897d = atm.m897d("B1D1A1D997FEB1E2A1EF97CEB1DFA1E997FAB1D1A1E997FDB1D6A1D797FAB1ECA1E997FE");
                                continue;
                        }
                    }
                    break;
                case -748638037:
                    return jSONArray.getJSONObject(0).getString(C0052e.m1418a(new byte[]{20, 115, 105}, new byte[]{97, 1, 5, 93, 125, 46, -5, -59}));
                case -641718780:
                    jSONObject2 = jSONArray.getJSONObject(i2);
                    m897d = atm.m897d("B1E5A1ED97FEB1E2A1E297C4B1E5A1E397C3B1DDA1D797FDB1DFA1ED97C0B1E2A1DD97C0B1DEA1D997C3B1E1A1D197F8B1DCA1E997CEB1E2");
                    break;
                case -399147646:
                    JSONArray jSONArray2 = jSONObject.getJSONArray(C0052e.m1418a(new byte[]{110, -45, 77, -124, -40, 61, -95, -58, 108, -55, 88, -114, -29, 32, -67, -64, 93, -50, 90, -110, -20, 22, -65, -50, 113, -50}, new byte[]{2, -70, 59, -31, -121, 73, -45, -89}));
                    m897d = atm.m897d("B1E6A1D397FCB1D1A1D997F8B1EDA1E997C0B1E2A1D797C7B1D2A1ED97F9B1D2A1EC97C7B1DEA1D7");
                    jSONArray = jSONArray2;
                    break;
                case -109510276:
                    m897d = atm.m897d("B1DCA1D197F0B1E2A1D397C2B1E1A1EA97CFB1E3A1D797FAB1E2A1D097FCB1DCA1ED");
                    break;
                case 145485486:
                    m897d = atm.m897d("B1D6A1DD97F0B1E1A1D397F4B1D1A1DE97FCB1DDA1D197C2B1DEA1DD97CEB1E0A1EF97F4B1DEA1D597C0B1E2");
                    break;
                case 330538852:
                    return jSONObject2.getString(C0052e.m1418a(new byte[]{67, 86, 95}, new byte[]{54, 36, 51, 95, 107, -84, -120, -17}));
                case 362034697:
                    m897d = atm.m897d("B1E1A1D497C7B1D1A1EE97C7B1DCA1E997FAB1D6A1D797FAB1DBA1ED97C0B1DDA1D397F9B1D2A1D297F9B1E2A1E397FFB1DAA1D397F4B1DA");
                    break;
                case 1164322481:
                    return "";
                case 1191174420:
                    i = i2 + 1;
                    m897d = atm.m897d("B1E0A1D997F4B1D6A1EC97CFB1DCA1DE97F3B1ECA1D797C0B1E0A1D197C4B1E5A1EC97F8B1D6A1D397F3B1D2A1DD97C0");
                    break;
                case 1610086969:
                    m897d = atm.m897d("B1E5A1D097FFB1E2A1D197FEB1DCA1D997FEB1E0A1ED97C1B1DEA1E997C7B1D2A1E297FEB1DCA1ED97F4B1E0A1E397C0");
                    i2 = i;
                    break;
                case 1755970544:
                    m897d = atm.m897d("B1E5A1DE97FFB1DFA1E297F0B1DDA1EC97C3B1ECA1EC97F8B1E0A1D797F0B1E2A1ED97C4B1DBA1EF97C4B1EDA1D597F4");
                    break;
                case 1773174819:
                    String m897d4 = atm.m897d("B1D6A1D797FEB1DAA1EF97F4B1EDA1EA97C2B1E6A1ED97FCB1D8A1EF97C4B1D1A1D597CEB1E2A1EF97FDB1DBA1E997C0B1DBA1ED");
                    while (true) {
                        switch (m897d4.hashCode() ^ (-707483068)) {
                            case -1968842129:
                                m897d4 = atm.m897d("B1DCA1D297C1B1DAA1E397F3B1DBA1D097C4B1DAA1D397C2B1E1A1E397FFB1D8A1D497C0B1DDA1D597F0B1E2A1E297C4B1E0A1EC97C1B1DB");
                            case -307885057:
                                m897d = atm.m897d("B1E5A1D597C1B1E2A1D397CEB1D8A1D097C7B1ECA1DD97C7B1DBA1D997FD");
                                continue;
                            case 1356586365:
                                m897d = atm.m897d("B1D1A1E397C0B1D8A1EE97FEB1E2A1E397FDB1D1A1E297FCB1E2A1ED97CEB1DFA1D297F8B1E6A1DE97C1B1E0A1E397C0B1D6A1E297F8");
                                continue;
                            case 2079871650:
                                m897d4 = !jSONObject.has(C0052e.m1418a(new byte[]{-51, 33, -31, -58, -71, -113, -108, -125, -49, 59, -12, -52, -126, -110, -120, -123, -2, 60, -10, -48, -115, -92, -118, -117, -46, 60}, new byte[]{-95, 72, -105, -93, -26, -5, -26, -30})) ? atm.m897d("B1E3A1DD97C3B1DDA1EE97F0B1DEA1D497F0B1E2A1D197FCB1D1A1D497C7B1E2A1ED97FCB1DFA1D397F3B1E6A1D597CEB1DDA1EF") : atm.m897d("B1D8A1D297FDB1E3A1E297F3B1EDA1ED97C0B1EDA1E297CEB1DAA1D297F0B1D2A1E297F0B1E5A1D397F9B1E2A1D997F3B1E0");
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: k */
    private List<C0309g> m230k(JSONObject jSONObject) {
        JSONArray jSONArray = null;
        ArrayList arrayList = null;
        int i = 0;
        JSONObject jSONObject2 = null;
        String str = null;
        String str2 = null;
        C0309g c0309g = null;
        int i2 = 0;
        int i3 = 0;
        String m897d = atm.m897d("B1DDA1E397C4B1E5A1D597FEB1D8A1D397CEB1DAA1D297FFB1D2A1D397F3B1E5A1D397FDB1D6A1D0");
        while (true) {
            switch ((m897d.hashCode() ^ 518) ^ 1986901879) {
                case -1868092785:
                    arrayList = new ArrayList();
                    m897d = atm.m897d("B1ECA1D797F9B1DCA1E397F4B1E6A1D497FEB1E2A1D097CFB1E2A1ED97F4B1D1A1E397C0B1DAA1D197C0");
                    break;
                case -1653727820:
                    m897d = atm.m897d("B1E0A1D397C0B1DEA1D597C0B1D6A1DE97C7B1ECA1DE97FCB1DBA1DE97CFB1D8A1D797C2B1D2A1EA97FAB1E2A1D497F4B1E1");
                    break;
                case -1605843186:
                    jSONObject2 = jSONArray.getJSONObject(i3);
                    m897d = atm.m897d("B1E0A1ED97F8B1EDA1E297CFB1DCA1EA97FAB1DBA1D497F8B1DEA1DD97FFB1E2");
                    break;
                case -1531850497:
                    c0309g.m877b(str);
                    m897d = atm.m897d("B1D1A1E297FEB1DEA1D597FDB1D8A1E397C4B1E6A1DD97FDB1E2A1D797FEB1DA");
                    break;
                case -1307378298:
                    String m897d2 = atm.m897d("B1D8A1D997F9B1E2A1EE97C4B1E0A1D097F3B1DEA1DD97FEB1E2A1ED97F4B1D6A1E397C0B1E1A1EA97F9B1E3A1D597FDB1E2A1EA97C0B1DF");
                    while (true) {
                        switch (m897d2.hashCode() ^ 2012936444) {
                            case -1978799203:
                                m897d2 = atm.m897d("B1E2A1D797C2B1D2A1D197FFB1D6A1D197C4B1E2A1E997FCB1D2A1ED97FAB1ECA1E297F0B1D6A1D397F0B1E5A1E297FAB1ECA1DD");
                            case -1065192666:
                                m897d = atm.m897d("B1EDA1EE97FAB1E5A1D497F3B1D1A1EE97C4B1E2A1E397C0B1D2A1D197FCB1E2A1D197C2");
                                continue;
                            case 20494433:
                                m897d = atm.m897d("B1E5A1EA97FDB1E2A1EE97CFB1DDA1D497C3B1E6A1ED97FFB1EDA1EA97F3B1E5A1D0");
                                continue;
                            case 747490695:
                                m897d2 = i3 < jSONArray.length() ? atm.m897d("B1EDA1EA97CEB1E2A1D997F8B1ECA1E397C2B1E0A1D297CEB1D8A1D997C7B1D8A1D497C4B1E1A1EA97FFB1D2A1ED97FFB1D1A1D197CEB1D6A1EC") : atm.m897d("B1E2A1D797FAB1ECA1ED97C7B1ECA1D597F0B1E2A1D997F9B1E6A1EE97F3B1E6A1EA97FAB1DCA1DD97CFB1DDA1D197F0");
                        }
                    }
                    break;
                case -1160412632:
                    m897d = atm.m897d("B1E0A1D397C0B1DEA1D597C0B1D6A1DE97C7B1ECA1DE97FCB1DBA1DE97CFB1D8A1D797C2B1D2A1EA97FAB1E2A1D497F4B1E1");
                    i3 = i;
                    break;
                case -719614820:
                    String m897d3 = atm.m897d("B1D6A1D797C0B1DAA1D797C4B1E2A1EC97FEB1E6A1D297F0B1DDA1DE97C0B1DBA1ED97C3B1ECA1ED97FDB1E5A1ED97C0");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1638787322)) {
                            case -2090652966:
                                m897d3 = !jSONObject.has(C0052e.m1418a(new byte[]{-22, 32, 117, 19, 71, -103, -94, 25, -24, 58, 96, 25, 124, -124, -66, 31, -39, 58, 118, 20, 108, -124, -92, 20, -29, 22, 119, 23, 107, -122, -113, 20, -17, 58, 119}, new byte[]{-122, 73, 3, 118, 24, -19, -48, 120})) ? atm.m897d("B1D1A1EC97C7B1E6A1D097CEB1E2A1EE97F8B1DFA1EA97FDB1D2A1ED97C0B1DDA1ED97FE") : atm.m897d("B1D6A1D297F9B1E2A1EC97C0B1DFA1ED97F8B1E6A1D797FEB1D6A1D797C3B1E2A1E2");
                            case 1012926566:
                                m897d = atm.m897d("B1E0A1E397CEB1DBA1DE97F4B1D6A1E397CEB1E2A1D597FDB1E1A1DD97C3B1D6A1E297F4B1D8");
                                continue;
                            case 1084298337:
                                m897d = atm.m897d("B1E3A1DE97F0B1E2A1EF97CEB1DAA1D997CEB1DCA1D397FDB1E1A1EA97FFB1E0A1D497F3B1DAA1D597CF");
                                continue;
                            case 1867944305:
                                m897d3 = atm.m897d("B1ECA1EC97C1B1D8A1DE97FEB1D2A1EC97C0B1E2A1ED97C2B1DAA1D797F3B1ECA1ED97C0B1EDA1ED97C0B1E2A1DD97C1B1D1A1D397C3");
                        }
                    }
                    break;
                case -581682123:
                    arrayList.add(c0309g.m878a(C0052e.m1418a(new byte[]{41, -101, -60}, new byte[]{95, -17, -80, 91, -33, 38, 7, -7})));
                    m897d = atm.m897d("B1DFA1E997CEB1E2A1D597CEB1DFA1D397FFB1D2A1ED97C4B1E2A1DE97F4B1DCA1D397F8B1DBA1ED97F9B1DBA1D497C0B1D1A1D097F0");
                    break;
                case -578410064:
                    str = jSONObject2.getString(C0052e.m1418a(new byte[]{-119, -44, -35, 1, -40, 64, -85, 37}, new byte[]{-27, -75, -77, 102, -83, 33, -52, 64}));
                    m897d = atm.m897d("B1E2A1DD97C0B1E2A1EF97FFB1E0A1D197C3B1DDA1ED97C4B1D2A1D497C0B1DEA1EF97C1B1ED");
                    break;
                case -458283577:
                    jSONArray = jSONObject.getJSONArray(C0052e.m1418a(new byte[]{-60, 63, -12, -65, 54, -69, -104, 40, -58, 37, -31, -75, 13, -90, -124, 46, -9, 37, -9, -72, 29, -90, -98, 37, -51, 9, -10, -69, 26, -92, -75, 37, -63, 37, -10}, new byte[]{-88, 86, -126, -38, 105, -49, -22, 73}));
                    m897d = atm.m897d("B1E1A1D797FDB1DEA1D297FFB1DAA1D097F9B1ECA1D497C0B1D6A1EC97FFB1E5A1EF97FCB1DCA1E397C4B1E2A1E297FFB1E6A1ED");
                    break;
                case -231269247:
                    return arrayList;
                case -154507956:
                    return Collections.emptyList();
                case -103374192:
                    m897d = atm.m897d("B1D8A1DD97CFB1D1A1EF97F0B1D1A1E997CEB1E2A1D497CFB1ECA1ED97C3B1E1A1D397C0");
                    i3 = i2;
                    break;
                case 9339474:
                    i = 0;
                    m897d = atm.m897d("B1EDA1D797F0B1E1A1D597F0B1DCA1D997FDB1E2A1EA97FEB1E2A1ED97C1B1ECA1D797F0B1EDA1D397FEB1EDA1DD97C0");
                    break;
                case 98979101:
                    m897d = atm.m897d("B1E1A1ED97C7B1DEA1EE97F4B1E0A1DE97FFB1E3A1D797C0B1E2A1D197CFB1DBA1ED97F4B1DFA1EC97C0B1E2A1EF97F0B1DF");
                    break;
                case 199927986:
                    c0309g.m875d(str2);
                    m897d = atm.m897d("B1EDA1EC97C2B1ECA1DD97FFB1E2A1E397FFB1E3A1D497FFB1ECA1D097FDB1ECA1ED97C3B1E0A1D997CFB1E6A1EE97FAB1DEA1D2");
                    break;
                case 304722406:
                    c0309g.m876c(str);
                    m897d = atm.m897d("B1DCA1EE97FEB1DFA1D997CEB1E3A1D797CFB1D1A1E297C2B1E1A1DE");
                    break;
                case 598292269:
                    str2 = jSONObject2.getString(C0052e.m1418a(new byte[]{41, -114, 11}, new byte[]{92, -4, 103, -47, 21, 2, 65, 126}));
                    m897d = atm.m897d("B1E3A1D597F0B1DCA1EF97FCB1D8A1EC97C2B1D1A1D797F9B1DFA1ED97F4B1DBA1D597F4B1D2A1E2");
                    break;
                case 914447009:
                    m897d = atm.m897d("B1EDA1EE97FEB1DAA1EF97FDB1E2A1EC97FCB1D1A1D797C3B1D2A1EE97C1B1D8A1EF97C2B1D6A1EA97F4B1E5");
                    break;
                case 1845287688:
                    c0309g = new C0309g();
                    m897d = atm.m897d("B1E0A1DE97F0B1ECA1DE97CFB1DEA1EE97C0B1E2A1E997C7B1D2A1ED97F4B1DEA1D597FCB1DAA1D297C1B1E6A1D997F8B1DEA1ED");
                    break;
                case 2005500437:
                    i2 = i3 + 1;
                    m897d = atm.m897d("B1D6A1DE97C2B1DEA1D197FDB1DEA1E397C0B1D2A1D597C3B1DAA1D997CFB1DDA1D497CFB1ECA1D597FEB1E2A1D597C0B1E2A1ED97FCB1DBA1D497C0");
                    break;
            }
        }
    }

    /* renamed from: o */
    private void m226o(C0425b c0425b, List<C0425b> list, LinkedHashMap<String, List<String>> linkedHashMap) {
        String m897d = atm.m897d("B1DEA1E297FDB1EDA1D997FAB1DDA1D597FCB1E2A1EE97FDB1E2A1D297C1B1DAA1E397CFB1E2A1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 484) ^ (-1404781571)) {
                case -2040606794:
                    m897d = atm.m897d("B1E5A1D097FFB1E2A1D997FFB1E2A1ED97C2B1ECA1EC97F0B1E5A1EC97F0B1DFA1D997C2B1D8A1EE97FAB1E1A1D397C4B1D6A1D7");
                    break;
                case -1518216115:
                    m897d = atm.m897d("B1DBA1EA97F0B1D8A1EC97C4B1ECA1E297C7B1DEA1D097C3B1DEA1EC97C3");
                    break;
                case -710028176:
                    m897d = atm.m897d("B1DAA1DE97FDB1E2A1D797CEB1DBA1D197FEB1DFA1ED97C2B1D1A1D297FDB1E0A1E297FCB1D6A1EF97FDB1E2A1ED97FCB1DCA1D997C1B1ECA1ED");
                    break;
                case -192343134:
                    return;
                case -126736795:
                    m225p(c0425b, list, linkedHashMap, "");
                    m897d = atm.m897d("B1E3A1EA97F0B1D1A1ED97F8B1E2A1EE97FAB1ECA1D197FEB1D2A1EE97F9B1E2A1DE97FAB1D2A1ED");
                    break;
                case 1383484953:
                    m897d = atm.m897d("B1E2A1ED97F8B1ECA1D197FEB1DCA1E997CEB1E2A1DD97C2B1DDA1DE97C4B1DEA1DD97CEB1ECA1EF97F8B1E6");
                    break;
            }
        }
    }

    /* renamed from: p */
    private void m225p(C0425b c0425b, List<C0425b> list, LinkedHashMap<String, List<String>> linkedHashMap, String str) {
        JSONObject jSONObject = null;
        ArrayList arrayList = null;
        String str2 = null;
        C0425b c0425b2 = null;
        Iterator<C0425b> it = null;
        C0425b c0425b3 = null;
        String str3 = null;
        List<String> list2 = null;
        StringBuilder sb = null;
        Iterator it2 = null;
        String m897d = atm.m897d("B1E6A1D197FDB1DDA1E397FFB1DDA1D097FFB1E2A1D497C1B1E3A1E997C1B1E2A1EC97CEB1D2A1E997F9B1E2A1EA97FCB1E6A1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 245) ^ 1622115106) {
                case -1895204255:
                    m897d = atm.m897d("B1DCA1DD97F0B1DAA1D997FEB1E2A1D297FEB1D6A1D797F0B1DAA1D497C3B1E6A1ED");
                    list2 = linkedHashMap.get(str3);
                    break;
                case -1847358287:
                    m897d = atm.m897d("B1D8A1D597C4B1E2A1E397F3B1ECA1E997FFB1DFA1ED97C3B1ECA1D497F4B1E6A1EE97C4B1D6A1EA");
                    break;
                case -1770066415:
                    arrayList = new ArrayList();
                    m897d = atm.m897d("B1E0A1D997C0B1E2A1DD97F0B1DFA1ED97FEB1DCA1D597F9B1D6A1D097C0B1DCA1EF97C4B1E2");
                    break;
                case -1661950215:
                    String m897d2 = atm.m897d("B1DBA1D397C0B1E2A1D097C7B1D1A1ED97C3B1DDA1EE97C7B1E2A1D597C0B1E3");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1215171887)) {
                            case -1845179281:
                                m897d = atm.m897d("B1E6A1D297F3B1D1A1D997C2B1E2A1EA97CFB1ECA1E997C3B1E6A1D397C0");
                                continue;
                            case -690899445:
                                m897d = atm.m897d("B1E3A1EA97C1B1E6A1DE97F8B1E5A1EA97F9B1E2A1D297C0B1EDA1DD97C0B1DE");
                                continue;
                            case 1278984999:
                                m897d2 = atm.m897d("B1DCA1D797FDB1E0A1E397F0B1E5A1D797C0B1E0A1E997C2B1E2A1D797F4B1D6A1EA97CFB1E6A1D597C1B1E3A1D3");
                            case 1900518516:
                                m897d2 = it2.hasNext() ? atm.m897d("B1E6A1D497F0B1D6A1D497F0B1E5A1D997FAB1DBA1E997C4B1E1A1E397F4B1DBA1EE97F8B1DD") : atm.m897d("B1E6A1EC97F4B1DFA1EC97CEB1D1A1D497FDB1E2A1E997C1B1D6A1EE97CEB1D6");
                        }
                    }
                    break;
                case -1628823856:
                    sb = C0424a.m635a(str3);
                    m897d = atm.m897d("B1E5A1EE97C2B1DBA1E997C0B1E2A1EF97F0B1E6A1D197C3B1E0A1DE97F3B1D1A1EA97FCB1DFA1ED97C3B1E1A1D997FEB1D6A1D197FFB1E2A1D5");
                    break;
                case -1552290128:
                    str2 = m239b(C0052e.m1418a(new byte[]{67, 73, 38, -43, -51, 110, 55, -88, 17, 2, 50, -43, -41, 110, 55, -78, 75, 94, 32}, new byte[]{34, 45, 84, -68, -69, 11, 24, -34}), jSONObject.toString(), true);
                    m897d = atm.m897d("B1E3A1D097CEB1E2A1ED97F9B1D8A1D297CEB1DBA1ED97F0B1E5A1DD97C0B1D1A1D197FEB1E2A1E997FEB1DC");
                    break;
                case -1418070197:
                    m897d = atm.m897d("B1DCA1E397F3B1ECA1E297CEB1E3A1DD97C0B1D8A1E297FDB1E5A1D597CEB1E2A1D197F3B1DCA1ED97CEB1DDA1D597FFB1D1A1D797C2B1E5A1E2");
                    break;
                case -1403018820:
                    m897d = atm.m897d("B1EDA1EF97FDB1E2A1DD97F0B1E1A1E297F8B1ECA1EF97C7B1D1A1EF97F3B1E3A1ED97C2B1D2A1ED97CEB1E3A1EF97F4B1E6A1ED97C4B1E3A1D397C0");
                    break;
                case -1273353039:
                    jSONObject.put(C0052e.m1418a(new byte[]{50, -79, -66, 9, 110, 10}, new byte[]{95, -48, -52, 98, 11, 120, 73, 83}), str);
                    m897d = atm.m897d("B1E2A1D597F4B1E6A1D597CEB1E2A1ED97F9B1DDA1ED97F4B1DAA1D397C0B1E5A1EA97C4B1E2A1D397FDB1E0A1DE97FEB1E2A1D097C4B1DC");
                    break;
                case -1232454508:
                case -530355011:
                case 2058745026:
                    m897d = atm.m897d("B1E1A1D997C1B1EDA1D597C4B1E3A1D997C7B1D8A1D297C0B1E2A1EC97C3B1D8A1E397F8B1DE");
                    break;
                case -937359116:
                    m226o((C0425b) it2.next(), list, linkedHashMap);
                    m897d = atm.m897d("B1EDA1ED97FFB1D8A1D797C0B1E2A1D497C1B1D1A1EA97F0B1DDA1ED97F8B1DAA1E297FCB1D2A1ED97CFB1ECA1D9");
                    break;
                case -928825570:
                    jSONObject.put(C0052e.m1418a(new byte[]{-12, -43, 24, -44, -56}, new byte[]{-104, -68, 117, -67, -68, 85, 28, 67}), 200);
                    m897d = atm.m897d("B1E6A1D497F9B1E2A1D597F9B1E0A1EA97F4B1DFA1ED97F8B1E0A1E397C0B1E5A1EE97CE");
                    break;
                case -825217766:
                    sb.append(C0052e.m1418a(new byte[]{-126, 27, -65}, new byte[]{-62, 91, -1, -38, 94, -70, -126, 125}));
                    m897d = atm.m897d("B1E2A1EC97C0B1E2A1D797F9B1DFA1ED97F0B1EDA1D197F9B1ECA1E997C3");
                    break;
                case -782226045:
                    m897d = atm.m897d("B1E0A1DE97C4B1DDA1E997FFB1E2A1E297FEB1DBA1ED97C7B1D8A1D597CFB1E5A1E997C0B1DEA1EA97C0B1DEA1D297F9");
                    break;
                case -747031883:
                    list2.add(sb.toString());
                    m897d = atm.m897d("B1D2A1DD97FFB1E2A1D297F3B1E5A1E997F9B1DCA1D797F0B1E3A1D397C0B1DBA1DE97C0B1D2A1ED97F9B1E2A1E997F0B1DDA1D197FDB1EDA1D9");
                    break;
                case -538189378:
                    m897d = atm.m897d("B1E6A1EE97F0B1E2A1D397C2B1DDA1EF97F9B1E2A1ED97FCB1E6A1E297FEB1ECA1E997C0B1DFA1EF97F9B1E2A1ED97FDB1E0A1EA97C0B1DDA1EC97F0B1DCA1ED");
                    break;
                case -258505207:
                    String m897d3 = atm.m897d("B1E3A1ED97F9B1EDA1DD97C4B1DCA1D197C4B1E2A1D297CFB1E6A1D597CEB1D2A1ED97F3B1ECA1EA");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-2052761153)) {
                            case -2010518770:
                                m897d3 = atm.m897d("B1D2A1ED97FAB1E6A1E997F0B1E2A1E397FFB1EDA1D997F4B1E6A1D197CEB1D2A1D197C0B1ED");
                            case -1317986182:
                                m897d = atm.m897d("B1E6A1DD97F0B1DBA1D997FDB1E2A1E997FAB1D2A1ED97FCB1E5A1D997CFB1DAA1ED97FEB1D8A1EA97FEB1ECA1E997C4B1D1");
                                continue;
                            case 1063890522:
                                m897d3 = str.length() > 0 ? atm.m897d("B1D6A1D597C1B1DBA1D197CEB1E2A1E997F4B1E5A1EE97F0B1ECA1ED97C2B1E0A1EC97F8B1DDA1E297FAB1DFA1EA") : atm.m897d("B1E0A1D197C4B1E2A1E397FCB1DAA1EA97FEB1E6A1ED97F4B1E5A1EE97F4B1DAA1D397C0B1DBA1D597C4B1E2");
                            case 1748009797:
                                m897d = atm.m897d("B1E2A1D597F4B1E6A1D597CEB1E2A1ED97F9B1DDA1ED97F4B1DAA1D397C0B1E5A1EA97C4B1E2A1D397FDB1E0A1DE97FEB1E2A1D097C4B1DC");
                                continue;
                        }
                    }
                    break;
                case -233124346:
                    String m897d4 = atm.m897d("B1DAA1D197FCB1E1A1EE97F9B1E2A1E997F9B1D8A1D297C2B1DCA1ED97F0B1D8A1D297F0B1D1A1D197C2B1D2A1D397C0B1E5A1E397FDB1E2A1E297C7B1DFA1ED");
                    while (true) {
                        switch (m897d4.hashCode() ^ 193249886) {
                            case -1310456278:
                                m897d = atm.m897d("B1E5A1EA97FAB1DDA1D597C7B1DEA1EC97FDB1E5A1D397FCB1DCA1EA97CEB1E5A1E997C0B1ECA1D597C0B1E2A1E997FCB1ED");
                                continue;
                            case 247187514:
                                m897d4 = !linkedHashMap.containsKey(str3) ? atm.m897d("B1DDA1ED97F9B1E2A1DD97FFB1E5A1D997C0B1DDA1D297FCB1ECA1E297C0B1E2A1D197FFB1D8A1DD97F4B1E1") : atm.m897d("B1DDA1D597FEB1E3A1D497FEB1E6A1D197C4B1E2A1D497C1B1EDA1D497F4B1DEA1EA97CFB1E1");
                            case 761877927:
                                m897d4 = atm.m897d("B1E2A1DE97FDB1E2A1EE97F4B1E2A1DD97C1B1ECA1ED97FFB1DCA1ED97FAB1D1A1EF97F0B1D1A1E997F8B1EDA1D097C0B1D6A1E997FAB1DCA1EF97F9");
                            case 1878404076:
                                m897d = atm.m897d("B1DBA1D097F0B1E2A1EE97C7B1E3A1D197FDB1D6A1EE97C1B1DBA1EC97F8B1DF");
                                continue;
                        }
                    }
                    break;
                case -216564340:
                    arrayList.add(c0425b3);
                    m897d = atm.m897d("B1DBA1E997F8B1D1A1D797FCB1D6A1D797FAB1E2A1D597FDB1E2A1E997C0B1E2A1ED97F8B1DDA1D0");
                    break;
                case -190426302:
                    String m897d5 = atm.m897d("B1DEA1DD97FEB1E2A1D297F9B1DDA1D797C1B1D1A1EC97FFB1E2A1D097FA");
                    while (true) {
                        switch (m897d5.hashCode() ^ 773954159) {
                            case -667982032:
                                m897d5 = atm.m897d("B1DEA1DE97C7B1D6A1DD97C4B1D1A1D297FFB1DDA1D097C7B1E0A1EA97FFB1ECA1D397FDB1DBA1EA97F3");
                            case 733336229:
                                m897d5 = C0652d.m144g(c0425b3.m632c()) ? atm.m897d("B1DEA1D197F3B1E0A1D597F9B1DBA1D297FCB1E1A1EF97FDB1E2A1EA97F8B1DEA1D297FFB1E6A1ED") : atm.m897d("B1D6A1D197FFB1E2A1D597F3B1E2A1D097F0B1DAA1E997CFB1E1A1EA97C2");
                            case 1749396787:
                                m897d = atm.m897d("B1DDA1EC97F8B1E3A1EF97F0B1E2A1D797CFB1DCA1ED97C0B1D1A1E397FFB1DDA1D0");
                                break;
                            case 1823778573:
                                break;
                        }
                    }
                    break;
                case 15028769:
                    sb.append(c0425b3.m631d());
                    m897d = atm.m897d("B1DAA1D297C1B1DFA1D797C7B1D2A1EA97FDB1E2A1EC97C4B1E5A1D997C1B1DBA1EC97FEB1DB");
                    break;
                case 153543549:
                    m225p(c0425b, list, linkedHashMap, c0425b2.m628g());
                    m897d = atm.m897d("B1DDA1D997C2B1D1A1EF97C4B1ECA1EC97C0B1E3A1D797C4B1D2A1D097C2B1DEA1D197F8B1DAA1ED97FEB1DBA1D397FFB1E2A1D497F0B1D1");
                    break;
                case 191200210:
                    jSONObject = new JSONObject();
                    m897d = atm.m897d("B1E0A1D597F9B1DCA1D997FDB1DCA1EA97FFB1DAA1D497C0B1E2A1D397C0B1E6A1ED97F9B1E5A1E297F3B1E1A1E3");
                    break;
                case 521032389:
                    m897d = atm.m897d("B1E0A1E997CEB1E2A1D597C3B1D8A1D197F4B1D2A1D397C4B1DFA1E397F0B1E5A1D497FDB1DE");
                    break;
                case 712522388:
                    it = c0425b2.m630e().iterator();
                    m897d = atm.m897d("B1E1A1D997C1B1EDA1D597C4B1E3A1D997C7B1D8A1D297C0B1E2A1EC97C3B1D8A1E397F8B1DE");
                    break;
                case 777436087:
                    jSONObject.put(C0052e.m1418a(new byte[]{49, -62, -121, -110, 122, -41, 52, -48, 40, -49, -112, -88, 125, -57}, new byte[]{65, -93, -11, -9, 20, -93, 107, -74}), c0425b.m631d());
                    m897d = atm.m897d("B1DEA1D797F9B1E2A1D497C4B1E5A1DD97C3B1E6A1D397C1B1DDA1EC97F0B1DFA1D597FCB1DDA1E397FFB1E1A1EF97F4B1E6A1E297C4");
                    break;
                case 793679628:
                    String m897d6 = atm.m897d("B1E2A1D297CEB1DEA1E997FFB1E2A1D497CFB1D2A1D797F0B1E1A1D197C7B1D1A1ED97C3B1D1A1DE97F3B1DBA1D497C3B1D2A1ED");
                    while (true) {
                        switch (m897d6.hashCode() ^ (-762699271)) {
                            case -1741757191:
                                m897d6 = c0425b2.m628g().length() > 0 ? atm.m897d("B1DDA1D197C0B1E2A1D997F4B1E6A1D197F8B1ECA1D597F9B1DBA1DE97F8B1E5A1D497FAB1D2A1D797CFB1DD") : atm.m897d("B1D2A1D597F0B1E2A1D097C4B1E2A1ED97F0B1DAA1ED97FEB1DAA1DD97C3B1DCA1ED97C1B1E5A1E297FAB1DE");
                            case -117060566:
                                m897d = atm.m897d("B1DDA1D997C2B1D1A1EF97C4B1ECA1EC97C0B1E3A1D797C4B1D2A1D097C2B1DEA1D197F8B1DAA1ED97FEB1DBA1D397FFB1E2A1D497F0B1D1");
                                continue;
                            case 488560105:
                                m897d6 = atm.m897d("B1DCA1EA97CEB1D1A1DD97FFB1E3A1D397FEB1E2A1D597FDB1E1A1DD97FEB1DFA1ED97F0B1DBA1E297C3B1D2");
                            case 1481516105:
                                m897d = atm.m897d("B1E2A1E997F0B1E2A1D997FAB1D6A1E397C3B1E3A1EA97FAB1E2A1D797C3B1E6A1D397C7B1D2A1ED97FEB1ECA1DE97F9B1E1A1ED97C0B1EDA1D097F0B1E2");
                                continue;
                        }
                    }
                    break;
                case 876876871:
                    return;
                case 885743154:
                    c0425b3.m626i(c0425b.m629f());
                    m897d = atm.m897d("B1D1A1D797F9B1E2A1EE97FFB1DDA1D597C0B1ECA1ED97F4B1DAA1DD97C1B1EDA1E997F9B1EC");
                    break;
                case 899255839:
                    str3 = C0652d.m140k(c0425b3.m629f());
                    m897d = atm.m897d("B1DFA1E297F9B1E2A1D797FFB1DBA1EC97FDB1DDA1D597C3B1DBA1D097F9B1DEA1EE97C2B1DEA1D097CEB1E0A1D797FD");
                    break;
                case 988949150:
                    jSONObject.put(C0052e.m1418a(new byte[]{-99, -126, 110, -52, 11, 57, 77, 24, Byte.MIN_VALUE, -107, 105, -35, 16, 9, 71}, new byte[]{-14, -16, 10, -87, 121, 102, 41, 113}), C0052e.m1418a(new byte[]{-95, -1, 94}, new byte[]{-32, -84, 29, 96, -65, -93, 23, Byte.MAX_VALUE}));
                    m897d = atm.m897d("B1E0A1E997FEB1E2A1D197C0B1E0A1E997C1B1DBA1D397CEB1E5A1ED97C1");
                    break;
                case 1007561489:
                    String m897d7 = atm.m897d("B1E6A1EC97C1B1DEA1D797C7B1E2A1DE97F4B1D1A1D997CEB1E6A1E397C4B1E2A1D197C3B1ECA1ED97C4B1E3A1DD");
                    while (true) {
                        switch (m897d7.hashCode() ^ (-127384515)) {
                            case -936021431:
                                m897d7 = atm.m897d("B1E5A1EC97FAB1E0A1EA97C4B1DCA1ED97C0B1E0A1D197C4B1DEA1D797FAB1E6A1EC97FA");
                            case -37180346:
                                m897d7 = !c0425b3.m634a().equals(C0052e.m1418a(new byte[]{29, 13, 12, -47, 16}, new byte[]{107, 100, 104, -76, Byte.MAX_VALUE, -6, 68, -115})) ? atm.m897d("B1E0A1ED97F8B1E3A1D597FDB1E2A1D397C3B1D2A1E297F9B1DBA1ED97C3B1D8A1D497C0B1DEA1EA97C3B1EDA1D497C2B1D1A1EC97C0B1E2") : atm.m897d("B1DAA1E297CEB1ECA1D997FEB1E2A1D497C0B1E1A1EE97C3B1D1A1DD97F9B1E2A1D197F3B1DA");
                            case 1066155585:
                                m897d = atm.m897d("B1E1A1DE97FDB1E6A1ED97C7B1DCA1D497F0B1DFA1D097CEB1D8A1D197C3B1ECA1DE97C3");
                                break;
                            case 1646780917:
                                break;
                        }
                    }
                    m897d = atm.m897d("B1E0A1E997CEB1E2A1D597C3B1D8A1D197F4B1D2A1D397C4B1DFA1E397F0B1E5A1D497FDB1DE");
                    break;
                case 1009384666:
                    m897d = atm.m897d("B1E5A1D397C3B1D8A1D197FAB1DBA1D097FCB1E1A1ED97FEB1E2A1EC97C4B1DBA1ED97C1B1E5A1E2");
                    break;
                case 1067398035:
                    String m897d8 = atm.m897d("B1E2A1E397F9B1E2A1DE97F0B1E0A1ED97C0B1DDA1D497C3B1DCA1E997C1B1DA");
                    while (true) {
                        switch (m897d8.hashCode() ^ 1634496772) {
                            case -1190624254:
                                m897d = atm.m897d("B1D2A1D597FDB1E2A1EC97FDB1DDA1ED97FCB1D1A1DD97C0B1D1A1D197C4B1DAA1D097FCB1DDA1DD97CEB1D8A1E997F4B1D6A1E397FEB1E2A1ED97FFB1DCA1ED");
                                continue;
                            case -1024371505:
                                m897d = atm.m897d("B1D8A1D597CFB1E1A1EC97C4B1D1A1E297C7B1D8A1DD97C2B1E1A1D097FA");
                                continue;
                            case 1125836031:
                                m897d8 = atm.m897d("B1DFA1E297FFB1D1A1EE97F0B1E2A1DD97F8B1E2A1D297CEB1D1A1E997C0B1DCA1ED97CFB1D6A1EA");
                            case 1323976370:
                                m897d8 = c0425b3.m634a().equals(C0052e.m1418a(new byte[]{-78, 89, -62, 96, 76}, new byte[]{-45, 44, -90, 9, 35, 126, -39, 115})) ? atm.m897d("B1E6A1EC97FEB1E6A1D397F8B1EDA1D397C0B1EDA1DE97CEB1DAA1D497F9B1DCA1DD97CF") : atm.m897d("B1E3A1D197F9B1E5A1D097FDB1D8A1E297FAB1DEA1D997FCB1D8A1EC97CEB1E2A1E297F9B1D2A1ED97FFB1DAA1E397C0");
                        }
                    }
                    break;
                case 1335343700:
                    sb.append(c0425b3.m632c());
                    m897d = atm.m897d("B1E0A1ED97CEB1E5A1D497F9B1E2A1D997FDB1DCA1E297C0B1ECA1ED97FDB1E1A1D497CEB1E6A1D097C0B1E2A1D5");
                    break;
                case 1373163771:
                    jSONObject.put(C0052e.m1418a(new byte[]{35, 63, 101, 6, -5, -90, -79, -116}, new byte[]{76, 77, 1, 99, -119, -7, -45, -11}), C0052e.m1418a(new byte[]{92, -68, -105, -107}, new byte[]{50, -35, -6, -16, -31, 51, 1, -60}));
                    m897d = atm.m897d("B1E0A1D997F0B1D6A1E997FDB1E2A1ED97F4B1D2A1EA97C4B1E6A1ED97CEB1DEA1D597F3B1D8A1DD97F9B1E2A1D597C4B1DFA1ED97FAB1E1A1D497C0");
                    break;
                case 1389818542:
                    it2 = arrayList.iterator();
                    m897d = atm.m897d("B1E6A1EE97F0B1E2A1D397C2B1DDA1EF97F9B1E2A1ED97FCB1E6A1E297FEB1ECA1E997C0B1DFA1EF97F9B1E2A1ED97FDB1E0A1EA97C0B1DDA1EC97F0B1DCA1ED");
                    break;
                case 1478877655:
                    String m897d9 = atm.m897d("B1E0A1D597F9B1E2A1ED97C3B1DAA1D597C3B1E0A1EF97FAB1E0A1D097F3B1DCA1ED97FCB1EDA1E297CFB1DEA1EE97C7B1E3A1D1");
                    while (true) {
                        switch (m897d9.hashCode() ^ 1862341808) {
                            case -2028929200:
                                m897d = atm.m897d("B1E6A1D497C2B1DEA1EA97F0B1DDA1D797F3B1D6A1DE97F8B1E0A1E397FFB1D1A1DD97F4B1DCA1EE97CFB1E0A1DE97F9");
                                continue;
                            case -1923105456:
                                m897d = atm.m897d("B1E0A1D597F0B1E2A1D497F8B1E3A1E997F8B1D6A1D497CFB1E1A1E297C4B1EDA1EE97FDB1E0");
                                continue;
                            case -259389915:
                                m897d9 = it.hasNext() ? atm.m897d("B1EDA1D197F0B1DDA1EE97FDB1DFA1D797F3B1D8A1D497FDB1DEA1ED97F8") : atm.m897d("B1DAA1D497C0B1D1A1D097FAB1D8A1EA97C7B1DDA1E997FDB1E2A1D397FDB1DFA1D297C3B1DB");
                            case -91119858:
                                m897d9 = atm.m897d("B1D2A1D097F0B1E2A1EF97C0B1E2A1D297F4B1DBA1EE97F3B1DEA1EC97FFB1EDA1D597C1B1ECA1ED97FCB1D1A1E397FCB1D2A1D397C0B1D2A1D7");
                        }
                    }
                    break;
                case 1646722966:
                    jSONObject.put(C0052e.m1418a(new byte[]{-61, 14, 5, 45, 47, 26, 55, -53}, new byte[]{-80, 102, 100, 95, 74, 69, 94, -81}), this.f1174d);
                    m897d = atm.m897d("B1DBA1ED97FEB1DDA1EC97F9B1E2A1D197CFB1E6A1E997CFB1E6A1E397F4B1E2A1ED97C3B1E3A1EE97F4B1E6A1E997C0B1DEA1D4");
                    break;
                case 1875804168:
                    m897d = atm.m897d("B1D2A1EF97FAB1D8A1EF97C0B1E2A1EC97CEB1E5A1EC97C7B1ECA1D797F4B1DCA1D597C2B1DCA1D397CFB1D8A1D597F3B1DCA1ED");
                    c0425b3 = it.next();
                    break;
                case 1945018510:
                    m897d = atm.m897d("B1ECA1DD97CEB1E6A1D397CEB1E2A1D797FDB1DAA1EC97CEB1DAA1DD97C2B1E2A1EC97C4B1E2A1EC97F4B1E2A1EF97C2B1DAA1D597C1B1E6");
                    c0425b2 = (C0425b) new Gson().fromJson(str2, C0425b.class);
                    break;
                case 1984981425:
                    list.add(c0425b3);
                    m897d = atm.m897d("B1D8A1DD97FFB1E2A1EA97C7B1EDA1DD97CEB1D2A1ED97CFB1E0A1E397C7B1DFA1D097C0B1E6A1E297F8B1DFA1E997FFB1E2A1DE97C0B1DFA1EA97CFB1DC");
                    break;
                case 1991237215:
                    String m897d10 = atm.m897d("B1DCA1D397C3B1DDA1D797FEB1DDA1D397FAB1D2A1D197FEB1E2A1EC97C1B1D8A1D197C3B1DEA1E297CFB1DDA1D197C4B1D2");
                    while (true) {
                        switch (m897d10.hashCode() ^ (-987096316)) {
                            case -1625106639:
                                m897d10 = c0425b3.m627h().equals(C0052e.m1418a(new byte[]{118, 69, 62, -11, 67, -90}, new byte[]{16, 42, 82, -111, 38, -44, -58, -111})) ? atm.m897d("B1E3A1EC97F9B1E2A1E397FFB1E5A1DE97FEB1D6A1D797C1B1EDA1ED97F4B1E6A1D797C1B1E2") : atm.m897d("B1E6A1EA97CEB1DDA1D197C4B1E2A1DE97C3B1DCA1ED97F0B1D6A1D597F9B1DDA1ED97CFB1DEA1DD97C3B1ECA1D097C0");
                            case -789188943:
                                m897d = atm.m897d("B1E6A1DE97F9B1E2A1D197C7B1DAA1EF97F9B1DCA1ED97FAB1D1A1E297C7B1D8A1ED97C7B1D1A1D3");
                                continue;
                            case -574685701:
                                m897d10 = atm.m897d("B1DDA1DE97C0B1E2A1D197F8B1DEA1ED97F9B1E2A1D197C7B1ECA1D597FEB1D1");
                            case 890023777:
                                m897d = atm.m897d("B1D6A1DE97C1B1E2A1D097C1B1E5A1E997FFB1E2A1DE97F4B1DCA1E397FFB1E6");
                                continue;
                        }
                    }
                    break;
                case 2051227986:
                    linkedHashMap.put(str3, new ArrayList());
                    m897d = atm.m897d("B1E5A1EA97FAB1DDA1D597C7B1DEA1EC97FDB1E5A1D397FCB1DCA1EA97CEB1E5A1E997C0B1ECA1D597C0B1E2A1E997FCB1ED");
                    break;
                case 2130175583:
                    sb.append(C0052e.m1418a(new byte[]{96, -2, -122}, new byte[]{32, -66, -58, -65, -120, 4, 81, 94}));
                    m897d = atm.m897d("B1ECA1D997C4B1DCA1D097FCB1E0A1D497C4B1E2A1EA97F4B1ECA1DE97F8B1D8A1D797C7B1E2A1ED");
                    break;
            }
        }
    }

    /* renamed from: q */
    private String m224q(String str, String str2, boolean z) {
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        HashMap<String, String> hashMap = null;
        C0576d c0576d = null;
        StringBuilder sb2 = null;
        String m897d = atm.m897d("B1EDA1DE97F0B1E2A1EF97F8B1DCA1ED97F8B1DAA1D597FEB1EDA1D097FEB1D1");
        while (true) {
            switch ((m897d.hashCode() ^ 365) ^ (-799114637)) {
                case -2129024851:
                    c0576d = C0574b.m309d(str4, str2, hashMap);
                    m897d = atm.m897d("B1D6A1EA97FAB1DCA1D797F0B1E0A1E297FDB1E2A1D197FDB1E1A1D297C1B1DBA1ED97C3B1E0A1ED");
                    continue;
                case -1913018099:
                    sb.append(C0052e.m1418a(new byte[]{85, -83, Byte.MAX_VALUE, 91, -22, -32, 63, 7, 82, -87, 110, 69, -73, -69, 124, 65, 68, -84, 101, 79, -21, -77, 102, 77, 19, -70, 100, 70, -74, -69, 116, 90, 84, -81, 110, 4, -17, -21, 62, 24, 18}, new byte[]{61, -39, 11, 43, -103, -38, 16, 40}));
                    m897d = atm.m897d("B1E5A1EA97F0B1DCA1DD97C1B1E3A1E397CEB1E1A1D597C0B1E2A1D997C2B1EDA1D397F8B1D8");
                    continue;
                case -1845629246:
                    return c0576d.m302a();
                case -1355460777:
                    str3 = sb.toString();
                    m897d = atm.m897d("B1D6A1D197C3B1ECA1D597FFB1E0A1EF97FAB1EDA1EA97C1B1D2A1E297C4B1E2A1D997F8B1EDA1ED97F4B1DBA1ED97F3B1E2A1D597FEB1E3A1D1");
                    continue;
                case -944552341:
                    m897d = atm.m897d("B1EDA1E397FAB1EDA1EF97F0B1E5A1D497C0B1E0A1D997C2B1DAA1ED97C4B1E2A1DE97C1B1EDA1D997FCB1D1A1EE97F9B1E3A1EC97FCB1E2");
                    continue;
                case -873514903:
                    sb2.append(C0052e.m1418a(new byte[]{-13}, new byte[]{-33, -47, 63, 80, 126, 80, -83, 13}));
                    m897d = atm.m897d("B1E6A1D097C0B1DDA1E297C4B1E2A1EE97FEB1D2A1ED97FAB1E2A1D397C0B1DBA1D097F8B1D2A1EC97CEB1DFA1D5");
                    continue;
                case -819888243:
                    hashMap = m234g();
                    m897d = atm.m897d("B1D6A1EE97C0B1E2A1DD97C0B1DAA1D297C0B1EDA1D397C0B1E2A1EF97FEB1DEA1D797F0");
                    continue;
                case -571963856:
                    sb.append(str);
                    m897d = atm.m897d("B1E1A1EE97F8B1D1A1EA97FDB1E0A1D397FFB1E5A1EE97FEB1E2A1EF97FDB1D2A1ED97FEB1E1A1E997C0B1DFA1D597FEB1E5A1D997C0B1E2A1ED97FFB1D6");
                    continue;
                case -269416836:
                    sb2.append(c0576d.m302a());
                    m897d = atm.m897d("B1D8A1EE97C7B1E0A1E997CEB1E2A1E297FAB1DEA1D197F8B1D2A1D097FE");
                    continue;
                case -131731712:
                    SpiderDebug.log(sb2.toString());
                    m897d = atm.m897d("B1EDA1D597FFB1E5A1DE97FEB1E2A1ED97F4B1DCA1ED97FFB1E0A1D797F8B1DDA1E297CFB1E1A1D797F9B1D6A1D997FFB1D1A1D397C3B1E1");
                    continue;
                case 110535170:
                    sb2.append(c0576d.m301b());
                    m897d = atm.m897d("B1D6A1E397F0B1DEA1D097F8B1E1A1D997CEB1DCA1D497FCB1E0A1DD97F0B1E0A1E397C1B1DBA1ED97CEB1E2A1D497CEB1E6A1ED");
                    continue;
                case 122183933:
                    sb2 = new StringBuilder();
                    m897d = atm.m897d("B1E5A1DD97F9B1E6A1ED97C3B1D8A1D397C7B1DAA1E397FEB1E2A1EE97F8B1DCA1ED97F8B1E3A1DD97C0");
                    continue;
                case 502828611:
                    hashMap.put(C0052e.m1418a(new byte[]{-51, 65, -32, 39, 16, -21, -110, 83, -51, 64, -3, 32, 17}, new byte[]{-84, 52, -108, 79, Byte.MAX_VALUE, -103, -5, 41}), this.f1177g);
                    m897d = atm.m897d("B1DEA1EA97FCB1E2A1EE97FFB1D2A1DD97FEB1E2A1EE97C2B1DBA1E397C7B1DCA1ED97FAB1EDA1D297CFB1E6A1DD97FEB1D8A1D197F9B1D6A1D0");
                    continue;
                case 702389180:
                    m897d = atm.m897d("B1E2A1DD97CEB1E2A1DD97FDB1E3A1D097CEB1DEA1E397F9B1D6A1DE97C2B1E5A1ED97F4B1DBA1EF97FEB1E3A1D097C4B1D1");
                    str4 = str;
                    continue;
                case 882846433:
                    m897d = atm.m897d("B1DDA1EC97FAB1E2A1EE97FDB1DDA1D497C0B1DBA1DD97C0B1E6A1DD97FDB1D8A1EA97F0B1D1A1EE97F0B1E2A1E297C1B1DFA1ED97C2B1DFA1EC");
                    continue;
                case 985339123:
                    sb = new StringBuilder();
                    m897d = atm.m897d("B1DEA1DD97C2B1ECA1D497FDB1D6A1D297CEB1D1A1DD97C1B1DEA1E997C4B1E2A1D797C4B1E2A1ED");
                    continue;
                case 1065349003:
                    m897d = atm.m897d("B1D8A1E297FDB1E2A1E297F8B1ECA1D397C7B1DCA1E297C0B1E2A1D497FAB1D6A1D497F0B1E5A1D597CFB1E0A1D297F8B1E6A1E997C7");
                    continue;
                case 1257573638:
                    String m897d2 = atm.m897d("B1DDA1EF97FAB1EDA1D097FAB1E3A1D497FFB1DBA1D297FFB1E2A1D397CEB1E2");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1382621488)) {
                            case -2047033826:
                                break;
                            case -1853234553:
                                m897d2 = c0576d.m301b() == 401 ? atm.m897d("B1E1A1D197FFB1ECA1D997CFB1DAA1EC97F8B1DBA1E997FAB1D2A1D297C0B1D2A1D297C4B1E2") : atm.m897d("B1E6A1E397F0B1E1A1D397C4B1E2A1DE97F0B1E2A1E397C0B1E5A1D397FEB1ECA1DD97F8B1DBA1ED");
                            case -1087186847:
                                m897d2 = atm.m897d("B1DEA1E397FCB1DEA1D197C0B1E2A1D397F3B1E6A1D797F8B1DEA1D197F9B1E2A1E397F9B1E3");
                            case -887553020:
                                m897d = atm.m897d("B1DBA1E997F3B1E6A1EF97FFB1DEA1ED97C1B1E0A1EF97C4B1E2A1EF97C1B1E2A1ED");
                                continue;
                        }
                    }
                    break;
                case 1308676153:
                    sb2.append(str4);
                    m897d = atm.m897d("B1DFA1D797C1B1EDA1D197C4B1DAA1D197FCB1E6A1D797F4B1D2A1D3");
                    continue;
                case 1366953276:
                    m897d = atm.m897d("B1D6A1ED97FEB1E2A1D197FFB1E0A1EE97F9B1E1A1E297CEB1E0A1D197F3B1E6A1ED97C7B1D6A1E397FCB1DBA1D297C0");
                    continue;
                case 1626128498:
                    String m897d3 = atm.m897d("B1D8A1D197FCB1DFA1D797C2B1DFA1D597F8B1DDA1EC97FFB1E1A1EE97C3B1E1A1DE97C0B1E2A1EC97FAB1DF");
                    while (true) {
                        switch (m897d3.hashCode() ^ 2033028114) {
                            case -2015866162:
                                m897d3 = str.startsWith(C0052e.m1418a(new byte[]{-96, -72, 58, -100, -52}, new byte[]{-56, -52, 78, -20, -65, -104, 72, -33})) ? atm.m897d("B1DCA1DE97FFB1DAA1ED97C3B1DBA1D997FCB1E3A1D497C3B1DDA1EA97CFB1DDA1E297C0B1D6A1DE97F4B1E2A1EE97FF") : atm.m897d("B1E1A1E297C1B1D1A1D797F9B1EDA1DD97F3B1E3A1D097F9B1E2A1EC97F3B1E2A1EE97FFB1ECA1DD97C2B1E3A1D197FCB1DF");
                            case -1947634816:
                                m897d = atm.m897d("B1E0A1EE97FDB1E2A1D197FEB1DCA1D197C7B1ECA1DD97C1B1E6A1ED97F8B1DBA1DD97C2B1DBA1EC97FEB1DEA1EE97F9B1DFA1DE");
                                continue;
                                continue;
                            case -1295000610:
                                m897d = atm.m897d("B1DBA1E997F9B1E2A1EA97CFB1E6A1ED97F9B1E1A1D497C0B1E5A1D997F8B1D6A1E397C2B1DBA1E297F4");
                                continue;
                            case 1235728457:
                                m897d3 = atm.m897d("B1DCA1D097F0B1D1A1DD97FCB1DFA1DE97CEB1E2A1D997CEB1DDA1ED97CFB1E5A1ED97FDB1DBA1D597C1B1ECA1ED97CFB1D2A1EC97F8B1D6A1EF");
                        }
                    }
                    break;
                case 1656487810:
                    String m897d4 = atm.m897d("B1E6A1D597FAB1E0A1E997F0B1DCA1E997C2B1D1A1D997FEB1E3A1EA97C0B1DDA1E297F9B1E0A1E397F8");
                    while (true) {
                        switch (m897d4.hashCode() ^ (-562802094)) {
                            case -2147329632:
                                break;
                            case -734630738:
                                m897d4 = z ? atm.m897d("B1DFA1D297CEB1E2A1EF97F3B1E2A1EA97FFB1E6A1ED97FCB1E5A1DD97F3B1D8A1E397FCB1ECA1EF97FFB1DBA1E9") : atm.m897d("B1EDA1D097FEB1D1A1EF97F8B1E1A1E397C2B1DBA1D497C0B1E2A1DD97FEB1DAA1E297F3B1DFA1EE97CEB1DDA1EA97FAB1D6");
                            case 233721185:
                                m897d4 = atm.m897d("B1E3A1E397C4B1E0A1D397FFB1DCA1D297C1B1E6A1D497F3B1EDA1EF97CEB1E2A1DE97C3B1DBA1ED97FFB1E0A1E297F9B1E3");
                            case 1079392788:
                                m897d = atm.m897d("B1DCA1ED97C0B1DCA1D097FCB1E5A1EF97F0B1E2A1EF97F0B1E2A1D297CEB1DDA1E297F8B1DBA1ED");
                                continue;
                        }
                    }
                    break;
                case 1777226137:
                    return m224q(str4, str2, false);
                case 1871676450:
                    m897d = atm.m897d("B1D6A1DD97F3B1DFA1ED97CEB1DFA1EC97FCB1D1A1D197F8B1D6A1D397C0");
                    continue;
                case 1990893862:
                    m897d = atm.m897d("B1D6A1DD97F3B1DFA1ED97CEB1DFA1EC97FCB1D1A1D197F8B1D6A1D397C0");
                    str4 = str3;
                    continue;
                case 2048274892:
                    sb2.append(C0052e.m1418a(new byte[]{-125}, new byte[]{-81, 37, -92, 123, 110, 63, -7, -22}));
                    m897d = atm.m897d("B1E6A1EC97F9B1D8A1ED97CEB1E2A1E397C3B1DAA1E397F0B1DDA1DD97F3B1E2A1ED97C3B1DCA1ED97FEB1D8A1EC97F0B1DC");
                    continue;
            }
            m897d = atm.m897d("B1D2A1EA97C7B1DEA1D497FCB1D8A1DD97FDB1E2A1EC97FDB1ECA1D097C4B1DF");
        }
    }

    /* renamed from: s */
    private String m222s(String str, JSONObject jSONObject) {
        String m897d = atm.m897d("B1E1A1DE97F0B1E2A1E297F0B1E2A1D197F0B1E6A1ED97FAB1E5A1D997CFB1D1A1DD97C0B1DEA1D297C4B1E2A1E397F9B1E0A1ED97FFB1ECA1ED");
        StringBuilder sb = null;
        C0576d c0576d = null;
        String str2 = null;
        StringBuilder sb2 = null;
        String str3 = null;
        while (true) {
            switch ((m897d.hashCode() ^ 41) ^ (-1082797724)) {
                case -1982909353:
                    SpiderDebug.log(sb.toString());
                    m897d = atm.m897d("B1DEA1D197F3B1E0A1D797F3B1E0A1E297C0B1E0A1D997FDB1E2A1D497FCB1DAA1EE97CEB1E1");
                    break;
                case -1818614188:
                    sb = new StringBuilder();
                    m897d = atm.m897d("B1E5A1D997CFB1EDA1D497FAB1DFA1EA97F3B1D1A1D197CFB1E3A1DE97C3B1D1A1DD");
                    break;
                case -900427659:
                    sb.append(str3);
                    m897d = atm.m897d("B1D6A1D097C7B1E1A1D197C1B1EDA1EE97C2B1DDA1DD97F8B1D8A1EC97F0B1E6A1D197C0B1DFA1D797F8B1ECA1D0");
                    break;
                case -556398298:
                    return c0576d.m302a();
                case -373025043:
                    sb.append(C0052e.m1418a(new byte[]{-35}, new byte[]{-15, 19, -62, 68, -50, -39, -54, 80}));
                    m897d = atm.m897d("B1DBA1E397F4B1D8A1EA97C0B1ECA1D097F0B1DFA1EC97CEB1D2A1D797F0B1E2A1D097F4B1DBA1ED97FCB1E6A1DE97C7B1DE");
                    break;
                case -244449909:
                    sb2.append(C0052e.m1418a(new byte[]{47, 72, -76, 109, 101, 77, 105, 118, 38, 76, -87, 51, 119, 27, 47, 32, 50, 82, -92, 111, Byte.MAX_VALUE, 1, 35, 119, 36, 83, -83, 50}, new byte[]{71, 60, -64, 29, 22, 119, 70, 89}));
                    m897d = atm.m897d("B1EDA1EC97FEB1E2A1D597C0B1ECA1ED97FDB1E6A1E397C7B1E1A1ED97C0B1D2A1E297F9B1E2A1EF97C0B1DB");
                    break;
                case -90574416:
                    StringBuilder sb3 = new StringBuilder();
                    m897d = atm.m897d("B1E3A1ED97C4B1E0A1ED97F8B1ECA1D097FEB1E2A1EE97C1B1E6A1ED97F8B1D6A1D097C0B1DDA1D997CEB1E2");
                    sb2 = sb3;
                    break;
                case 107262200:
                    m897d = atm.m897d("B1E0A1EE97F9B1E0A1D297F0B1E2A1D397C4B1D2A1D597F9B1E6A1DD97F3B1DBA1ED97F4B1D2A1EF97FEB1E0A1EA97CEB1E3A1D497F0B1DFA1D497C0");
                    break;
                case 568448277:
                    m897d = atm.m897d("B1D2A1EC97F4B1DFA1E397FFB1E2A1D997F0B1D6A1EF97FFB1ECA1E297F9B1DDA1DE97F8B1E2A1D597F0B1D8A1EF97C4B1E2A1E397F8B1ED");
                    break;
                case 745582478:
                    sb.append(c0576d.m302a());
                    m897d = atm.m897d("B1E2A1D197C3B1D6A1DD97F9B1D6A1D797C3B1D1A1E397C2B1D8A1D997FEB1ECA1D597C2B1DCA1D9");
                    break;
                case 813269336:
                    C0576d m309d = C0574b.m309d(str3, jSONObject.toString(), m234g());
                    m897d = atm.m897d("B1DFA1D297FAB1E1A1DE97F8B1E2A1DE97C1B1E5A1D997FEB1E2A1EE97C2B1E3A1D397C2");
                    c0576d = m309d;
                    break;
                case 952151225:
                    m897d = atm.m897d("B1DDA1D397C3B1E5A1D797C2B1EDA1E397C4B1E2A1DD97FAB1E6A1D097F9B1DDA1ED97C7B1DCA1D597FCB1ECA1ED97FEB1DDA1EA");
                    str3 = str;
                    break;
                case 1288151350:
                    m897d = atm.m897d("B1EDA1ED97FFB1E2A1EA97C7B1DFA1ED97C4B1D1A1E997FCB1DCA1D397C0B1D6A1ED97F9B1E2A1DD97FEB1DBA1ED97FFB1EDA1E397C0B1D8A1D497F3");
                    break;
                case 1299124099:
                    String sb4 = sb2.toString();
                    m897d = atm.m897d("B1E3A1DE97CEB1D1A1E297CEB1E2A1E397F9B1E2A1D997C4B1ECA1E997F9B1D8");
                    str2 = sb4;
                    break;
                case 1392790687:
                    m897d = atm.m897d("B1D2A1EC97F4B1DFA1E397FFB1E2A1D997F0B1D6A1EF97FFB1ECA1E297F9B1DDA1DE97F8B1E2A1D597F0B1D8A1EF97C4B1E2A1E397F8B1ED");
                    str3 = str2;
                    break;
                case 1628224157:
                    sb2.append(str);
                    m897d = atm.m897d("B1DDA1D497C7B1DFA1DE97C2B1E6A1D397FFB1EDA1ED97FFB1E2A1D097C4B1E6A1ED97C0B1DFA1EF97CEB1ECA1ED97F0B1DCA1ED97F8B1E6A1D3");
                    break;
                case 1923093448:
                    m897d = atm.m897d("B1E6A1D397C4B1E2A1E397C7B1ECA1DD97C7B1E1A1EE97C1B1E6A1D797C2B1DCA1ED97C2B1DAA1D9");
                    break;
                case 2017425136:
                    sb.append(C0052e.m1418a(new byte[]{-22}, new byte[]{-58, -43, 125, -75, -74, 25, 27, -82}));
                    m897d = atm.m897d("B1DAA1D097F9B1E1A1D497C0B1DBA1E397F9B1E2A1EA97C4B1E2A1ED97CEB1D6A1D397C0B1EDA1E997C3B1D8A1D097FFB1E2A1ED97C3B1DCA1ED");
                    break;
                case 2056175243:
                    String m897d2 = atm.m897d("B1ECA1D197C0B1D6A1D097F9B1E2A1E997CEB1E2A1EE97FFB1E5A1EC97FCB1ECA1ED97F8B1DFA1EC97FAB1D1A1D397C0B1E5A1DE97FDB1E2");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-705025981)) {
                            case -1481007352:
                                m897d = atm.m897d("B1D6A1D597FFB1DBA1EF97FDB1D8A1D997C0B1E2A1EF97FDB1DCA1ED97CFB1DCA1D397C0B1D8A1EE97FCB1E5A1D397F9B1E2A1ED97C3B1D2A1D997C0B1DC");
                                continue;
                            case 95245090:
                                m897d2 = atm.m897d("B1DAA1D197C0B1E1A1D597C0B1E2A1D197FCB1EDA1EC97C4B1E2A1D297FEB1DC");
                            case 974594705:
                                m897d2 = str.startsWith(C0052e.m1418a(new byte[]{-100, 74, -103, 7, -105}, new byte[]{-12, 62, -19, 119, -28, 92, 56, 54})) ? atm.m897d("B1DBA1E397CEB1D1A1DE97C0B1E2A1EE97FAB1DDA1EE97F8B1DFA1DD97F9B1E3A1D097FAB1DAA1DD97F3B1D2") : atm.m897d("B1D8A1ED97FCB1DFA1EC97FEB1DEA1EA97C0B1E2A1ED97FAB1DBA1ED97F0B1E3A1E297C0B1DFA1D997FEB1DCA1D1");
                            case 1055435827:
                                m897d = atm.m897d("B1E3A1DE97F0B1DAA1E397CEB1E2A1DD97CFB1DEA1E397FFB1DDA1E997C1B1DFA1ED97C2B1E0A1E997C0B1EDA1EE97F4B1D2A1D297FFB1E6A1D197CF");
                                continue;
                        }
                    }
                    break;
                case 2132891590:
                    sb.append(c0576d.m301b());
                    m897d = atm.m897d("B1E2A1D097FEB1E2A1D397CFB1ECA1ED97C3B1D1A1ED97FAB1DFA1D297CEB1DEA1EC");
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: f */
    public final String m235f(String str) {
        try {
            try {
                SpiderDebug.log(C0052e.m1418a(new byte[]{-9, 98, 106, -108, -63, 32, 4, -58, -1, 102, 122, -123, -36, 59, 68, -124, -66}, new byte[]{-112, 7, 30, -48, -82, 87, 106, -86}) + str);
                this.f1172b.add(0, m237d(str));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0052e.m1418a(new byte[]{-39, -58, -4, 96, -90, -93, 15}, new byte[]{-65, -81, -112, 5, -7, -54, 107, -106}), this.f1172b.get(0));
                jSONObject.put(C0052e.m1418a(new byte[]{57, -1, -119, 95, 19, 95, 11, 57}, new byte[]{93, -115, -32, 41, 118, 0, 98, 93}), this.f1175e);
                String string = new JSONObject(m224q(C0052e.m1418a(new byte[]{105, 2, -25, -14, 33, 21, -85, -24, 41, 21, -25, -24, 35, 19, -80, -29, 106, 29, -29, -8, 50, 14, -85}, new byte[]{6, 114, -126, -100, 103, 124, -57, -115}), jSONObject.toString(), true)).getString(C0052e.m1418a(new byte[]{11, -12, 66}, new byte[]{126, -122, 46, -126, -41, 102, 3, 50}));
                Init.execute(new RunnableC0609a(this, 0));
                return string;
            } catch (Exception e) {
                e.printStackTrace();
                Init.execute(new RunnableC0611c(this));
                return "";
            }
        } catch (Throwable th) {
            Init.execute(new RunnableC0610b(this, 0));
            throw th;
        }
    }

    /* renamed from: g */
    public final HashMap<String, String> m234g() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1DAA1DD97C4B1E2A1D097C3B1DBA1ED97FDB1D2A1D597C0B1E6A1ED97CEB1D2A1D9");
        while (true) {
            switch ((m897d.hashCode() ^ 859) ^ (-5143926)) {
                case -2034291197:
                    hashMap.put(C0052e.m1418a(new byte[]{-108, 14, -45, -74, -34, 71, -43}, new byte[]{-58, 107, -75, -45, -84, 34, -89, -70}), C0052e.m1418a(new byte[]{-46, 16, -55, 67, -29, -86, 106, 116, -51, 19, -54, 29, -15, -4, 44, 34, -49, 10, -39, 65, -7, -26, 32, 117, -39, 11, -48, 28}, new byte[]{-70, 100, -67, 51, -112, -112, 69, 91}));
                    m897d = atm.m897d("B1DDA1ED97CEB1E2A1DE97FEB1E5A1D797FEB1DAA1ED97C0B1DFA1EE97C0B1DDA1ED97FCB1D8A1EF97C7B1D2A1EE");
                    break;
                case -2011914703:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1D6A1D597C3B1E2A1D997C4B1E0A1EA97FDB1DEA1D097FAB1E0A1D197FAB1E0A1E397FE");
                    break;
                case -758556925:
                    m897d = atm.m897d("B1E2A1ED97F9B1D6A1D197C2B1DDA1DD97C7B1D2A1D297FFB1E1A1E997FEB1DCA1D597C1B1DEA1ED97C0B1EDA1D797F8B1E2A1EE97C1");
                    break;
                case -241804923:
                    hashMap.put(C0052e.m1418a(new byte[]{-126, -65, -100, -108, -64, -26, -90, -50, -71, -72}, new byte[]{-41, -52, -7, -26, -19, -89, -63, -85}), C0052e.m1418a(new byte[]{-119, -43, 47, 0, -30, 51, -78, -101, -15, -108, 101, 73, -90, 8, -70, -38, -96, -43, 34, 26, -82, 17, -121, -108, -11, -118, 123, 89, -75, Byte.MAX_VALUE, -124, -35, -86, -116, 97, 82, -82, 39, -27, Byte.MIN_VALUE, -19, -102, 20, 25, -2, 51, -74, -29, -95, -40, 30, 0, -6, 112, -26, -121, -13, -108, 102, 95, -82, 119, -104, -4, -112, -9, 25, 69, -82, 51, -70, -33, -95, -102, 18, 12, -19, 52, -68, -99, -28, -7, 61, 27, -31, 50, -74, -101, -11, -118, 108, 71, -66, 113, -29, -102, -12, -102, 6, 8, -24, 62, -95, -35, -21, -113, 102, 94, -96, 108, -27}, new byte[]{-60, -70, 85, 105, -114, 95, -45, -76}));
                    m897d = atm.m897d("B1D8A1D097C4B1E2A1E397C4B1D6A1EA97C0B1DBA1ED97C3B1E1A1E297F4B1E6A1D497C0B1E6A1EF97CF");
                    break;
                case 1998070863:
                    return hashMap;
            }
        }
    }

    /* renamed from: j */
    public final void m231j() {
        String m897d = atm.m897d("B1DEA1DE97FEB1DCA1EC97F8B1DFA1E397F8B1D6A1D597FAB1D6A1D097C0B1DCA1EA97C4B1E2");
        JSONObject jSONObject = null;
        String str = null;
        HashMap hashMap = null;
        while (true) {
            switch ((m897d.hashCode() ^ 698) ^ 254061872) {
                case -1876647198:
                    String m897d2 = atm.m897d("B1E0A1D597F8B1DAA1D197F4B1E3A1D197CFB1D1A1E397C0B1DFA1EA97CFB1D1A1E997CFB1E6");
                    while (true) {
                        switch (m897d2.hashCode() ^ 201316255) {
                            case -2118087825:
                                m897d = atm.m897d("B1D1A1D097F9B1ECA1EA97FAB1D8A1E397C2B1E2A1D797C0B1D8A1D797C7B1DCA1D797F4B1D2A1EA97F0B1ECA1D397F4B1E5A1DD97FA");
                                continue;
                            case -164631619:
                                m897d2 = atm.m897d("B1D8A1D297F9B1E2A1D297F8B1DDA1D797C7B1DFA1ED97FEB1D8A1DD97C0B1E5A1DD97C4B1E2A1EE97C0B1E6A1ED97C4B1DEA1EF97FDB1ECA1D2");
                            case 1691717883:
                                m897d2 = str != null ? atm.m897d("B1DCA1E997F0B1E2A1ED97FEB1E5A1EF97F0B1D1A1ED97C3B1E2A1ED97FCB1DEA1E2") : atm.m897d("B1DBA1ED97FFB1E2A1DD97C4B1D1A1D797CEB1DCA1D097F3B1DCA1ED97CEB1D6A1E397C0B1DAA1EA97CFB1DEA1DD97C4B1DBA1EC97FEB1E2");
                            case 1814290434:
                                m897d = atm.m897d("B1DEA1EA97C0B1E2A1D997FCB1E2A1EA97FFB1DDA1DD97FFB1D6A1DD97F0B1E2");
                                continue;
                        }
                    }
                    break;
                case -1756760605:
                    return;
                case -1467160747:
                    m897d = atm.m897d("B1E0A1D097FEB1DCA1E297FAB1E1A1E297FCB1E1A1D797C3B1DEA1ED97FEB1ECA1EA97CEB1D2A1EC97CEB1DBA1DD97C0");
                    break;
                case -1111214318:
                    this.f1175e = jSONObject.optString(C0052e.m1418a(new byte[]{66, -74, 76, 71, 120, -42, 9, 93}, new byte[]{38, -60, 37, 49, 29, -119, 96, 57}));
                    m897d = atm.m897d("B1E3A1D397F9B1E2A1DD97FFB1D2A1ED97C2B1E5A1D597F0B1E0A1DD97C0B1D2A1E397C3B1E1A1ED97FDB1E5A1D397CEB1E2A1D197FFB1E6A1ED");
                    break;
                case -616518696:
                    jSONObject = new JSONObject(this.f1178h);
                    m897d = atm.m897d("B1D6A1D997FDB1E2A1D797FFB1DDA1D597CEB1EDA1EE97C0B1E6A1DD97FEB1DCA1DE97FAB1DFA1D397F0B1D2A1D597F8B1E6");
                    break;
                case -497845939:
                    m897d = atm.m897d("B1D2A1D297CEB1E2A1EE97FEB1DEA1ED97F3B1DFA1EA97F3B1DEA1D797C1B1D1A1D397C4B1E0A1D197F0B1E2");
                    break;
                case -329453397:
                    hashMap.put(C0052e.m1418a(new byte[]{82, -49, -49, -91, 5, -2, -34, -36, 105, -56}, new byte[]{7, -68, -86, -41, 40, -65, -71, -71}), C0052e.m1418a(new byte[]{92, 8, 108, -74, 120, -19, 34, -20, 36, 73, 38, -1, 60, -42, 42, -83, 117, 8, 97, -84, 52, -49, 23, -29, 32, 87, 56, -17, 47, -95, 20, -86, Byte.MAX_VALUE, 81, 34, -28, 52, -7, 117, -9, 56, 71, 87, -81, 100, -19, 38, -108, 116, 5, 93, -74, 96, -82, 118, -16, 38, 73, 37, -23, 52, -87, 8, -117, 69, 42, 90, -13, 52, -19, 42, -88, 116, 71, 81, -70, 119, -22, 44, -22, 49, 36, 126, -83, 123, -20, 38, -20, 32, 87, 47, -15, 36, -81, 115, -19, 33, 71, 69, -66, 114, -32, 49, -86, 62, 82, 37, -24, 58, -78, 117}, new byte[]{17, 103, 22, -33, 20, -127, 67, -61}));
                    m897d = atm.m897d("B1D2A1E397FFB1E2A1EE97C4B1E1A1D597C3B1D8A1D197FEB1ECA1ED97FEB1DDA1EF");
                    break;
                case -157294713:
                    this.f1176f = jSONObject.optString(C0052e.m1418a(new byte[]{-27, -82, 35, 17, -96, 117, -88, -55, -9, -79, 21, 58, -82, 125, -82, -62}, new byte[]{-124, -62, 74, 78, -63, 22, -53, -84}));
                    m897d = atm.m897d("B1E5A1DD97CFB1ECA1E297F8B1E1A1ED97FEB1E2A1EF97FCB1E2A1EA97FDB1DB");
                    break;
                case -153452748:
                    str = C0574b.m307f(C0052e.m1418a(new byte[]{-122, 119, 1, 58, -33, 106, 119, -47, -104, 106, 17, 47, -61, 126, 44, -54, -102, 117, 91, 34, -42, 126, 59, -124, -63, 113, 26, 40, -64, 63, 32}, new byte[]{-18, 3, 117, 74, -84, 80, 88, -2}), hashMap, null);
                    m897d = atm.m897d("B1E2A1E997F4B1DAA1D597FDB1E0A1E297CEB1E2A1D397FEB1E6A1DE97F8B1E1A1D097FFB1E2A1ED");
                    break;
                case -106595825:
                    Init.show(C0052e.m1418a(new byte[]{-85, 1, 19, -9, -100, -98, 54, -103, -63, 89, 39, -83, 6}, new byte[]{76, -68, -126, 16, 39, 2, -46, 33}));
                    m897d = atm.m897d("B1E0A1D097FEB1DCA1E297FAB1E1A1E297FCB1E1A1D797C3B1DEA1ED97FEB1ECA1EA97CEB1D2A1EC97CEB1DBA1DD97C0");
                    break;
                case 650512172:
                    this.f1178h = C0649a.m153c(C0052e.m1418a(new byte[]{-105, -127, 28, -112, 8, 22}, new byte[]{-27, -18, 126, -4, 103, 110, -50, -74}));
                    m897d = atm.m897d("B1E6A1EA97FEB1E2A1E297C3B1ECA1EC97FAB1EDA1D397F4B1E2A1DD97C3B1DCA1ED97F9B1E3A1D497C0B1D2A1D797FDB1DFA1EC97FAB1E6A1D997C2");
                    break;
                case 663799011:
                    jSONObject.optString(C0052e.m1418a(new byte[]{21, 13, 66, -107, -44, -41, -17, 119, 2, 17, 93, -126}, new byte[]{118, 120, 48, -25, -79, -71, -101, 40}));
                    m897d = atm.m897d("B1EDA1D797CFB1E0A1EE97C4B1E2A1E397FDB1DCA1ED97FCB1D8A1DD97C2B1D6A1E297FFB1E3A1E997FDB1E2");
                    break;
                case 814687107:
                    hashMap.put(C0052e.m1418a(new byte[]{66, -26, 74, -103, 37, -70, -48}, new byte[]{16, -125, 44, -4, 87, -33, -94, -98}), C0052e.m1418a(new byte[]{97, 70, 15, -55, -121, 100, 120}, new byte[]{0, 52, 124, -84, -23, 5, 20, -54}));
                    m897d = atm.m897d("B1E1A1D097C0B1E0A1D197CEB1E2A1EC97FCB1DBA1ED97FEB1DAA1E297F0B1DAA1D497CEB1E6A1D097C0B1DCA1D097C0B1DCA1D397CE");
                    break;
                case 939129447:
                    this.f1177g = jSONObject.optString(C0052e.m1418a(new byte[]{65, -119, -102, -96, -69, 12, 68, -55, 75, -118, -116, -111, -112, 2, 76, -49, 64}, new byte[]{46, -7, -1, -50, -28, 109, 39, -86}));
                    m897d = atm.m897d("B1E6A1D397F3B1D2A1DE97C0B1DAA1ED97FDB1D8A1DD97FDB1E2A1EF97F9B1D2A1D397F0B1E2A1ED97C2B1E2A1DD97C0");
                    break;
                case 1262307721:
                    C0649a.m152d(C0052e.m1418a(new byte[]{33, 14, -52, 20, 107, -100}, new byte[]{83, 97, -82, 120, 4, -28, 3, 0}), str);
                    m897d = atm.m897d("B1E5A1E397CEB1E2A1D297F4B1DFA1ED97F4B1D6A1ED97C0B1E2A1D297FDB1E2A1D197FFB1DCA1ED97C7B1D6A1EE");
                    break;
                case 1440218124:
                    hashMap = new HashMap();
                    m897d = atm.m897d("B1DFA1D097F8B1DFA1EC97C2B1DDA1EE97C0B1E2A1E397C2B1EDA1D597C0B1D2A1ED97C2B1E6A1D397C0B1DFA1D597F9B1E2A1DE97FDB1E2A1ED");
                    break;
            }
        }
    }

    /* renamed from: l */
    public final List<C0309g> m229l(String[] strArr) {
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        String[] strArr2 = null;
        String str2 = null;
        String str3 = null;
        StringBuilder sb = null;
        String str4 = null;
        C0309g c0309g = null;
        C0309g c0309g2 = null;
        int i3 = 0;
        int i4 = 0;
        String m897d = atm.m897d("B1D6A1D097FEB1E2A1DD97F0B1E6A1EE97C0B1ECA1E297F3B1DDA1D097CEB1E3A1DD97FEB1E3A1D097C4");
        while (true) {
            switch ((m897d.hashCode() ^ 509) ^ 97277168) {
                case -2136095208:
                    m897d = atm.m897d("B1E1A1E997F4B1DFA1E297FEB1E2A1EA97C4B1E6A1ED97C0B1E0A1ED97F4B1DBA1D4");
                    break;
                case -1900380380:
                    c0309g = new C0309g();
                    m897d = atm.m897d("B1DCA1D797F9B1E5A1E297F3B1ECA1D797C4B1D8A1D597F3B1E5A1D197F8B1E3A1D297FFB1D8A1D597C0B1E2A1E297FFB1EDA1EE97C3B1DD");
                    break;
                case -1779583114:
                    arrayList = new ArrayList();
                    m897d = atm.m897d("B1DAA1EF97C0B1D1A1DE97FDB1DBA1D597F9B1DFA1D597C0B1E2A1EC97F9B1ECA1ED97CFB1E5A1EC97CEB1E3A1DE97FDB1ECA1D197F8B1DAA1ED");
                    break;
                case -1767353942:
                    c0309g.m876c(str2);
                    m897d = atm.m897d("B1E0A1EF97F9B1E2A1D097C0B1E2A1D097FEB1DEA1EC97FFB1E1A1EA97F3B1DCA1D997F9B1D2A1E997C4B1D8A1D097CFB1DCA1ED");
                    break;
                case -1604179951:
                    i = strArr.length;
                    m897d = atm.m897d("B1DBA1ED97C0B1E2A1D497FDB1E5A1D297F4B1ECA1ED97C1B1D1A1E997C0B1E1A1D397F0B1E2");
                    break;
                case -1566235681:
                    String m897d2 = atm.m897d("B1D2A1E997C3B1EDA1EA97CEB1E3A1EE97CFB1E5A1E297FDB1EDA1ED97F9B1E2");
                    while (true) {
                        switch (m897d2.hashCode() ^ 1956078201) {
                            case -1979217554:
                                m897d2 = !str.contains(C0052e.m1418a(new byte[]{-93, 50, 113}, new byte[]{-29, 114, 49, -90, 85, -17, 82, 13})) ? atm.m897d("B1D8A1EE97C4B1E2A1E997C1B1DFA1E397C4B1DFA1DD97FFB1E6A1E297C3B1ECA1D297C7B1DAA1DD97C4B1E2A1EA97F0B1DEA1EC") : atm.m897d("B1DFA1D097FDB1E2A1EC97FFB1E2A1ED97F8B1D2A1E997F8B1E1A1EE97F8B1D1A1D497CEB1E2A1EF97C4B1DCA1ED97C3B1DEA1E397F0B1DC");
                            case -303839593:
                                m897d = atm.m897d("B1DBA1E397C0B1E2A1D597F9B1D2A1ED97FAB1D6A1ED97C0B1D8A1EF97CEB1DAA1ED97C3B1DFA1ED97C0");
                                continue;
                            case -134484011:
                                m897d = atm.m897d("B1D6A1DE97F3B1EDA1D997C0B1DAA1E997FFB1E2A1EC97C7B1DCA1ED97FCB1E1A1D497F4B1E0A1D497C0");
                                continue;
                            case -7715294:
                                m897d2 = atm.m897d("B1E1A1ED97C4B1DFA1EE97C0B1E2A1E397C7B1DBA1ED97FEB1DDA1D397C0B1E5A1E997F4B1E2A1D797C4B1EDA1D297FEB1E2A1D197FCB1DFA1ED97C0B1D1A1D4");
                        }
                    }
                    break;
                case -1550683320:
                    sb = new StringBuilder();
                    m897d = atm.m897d("B1DBA1E297CFB1EDA1D097FDB1E2A1EF97F4B1DDA1E997CEB1E5A1D797F0B1E2A1D497FCB1DBA1ED97FAB1E1A1DE");
                    break;
                case -1537854349:
                    sb.append(strArr2[2]);
                    m897d = atm.m897d("B1E3A1D797FEB1E3A1E397F4B1E0A1D797C1B1DDA1D297C7B1DCA1E297CFB1EDA1D497FCB1E0A1EC97C4B1E2A1DE97C7B1D2A1ED");
                    break;
                case -1402672191:
                    str = strArr[i4];
                    m897d = atm.m897d("B1D8A1D097C0B1E2A1D997F9B1DCA1EC97FCB1E6A1EF97F3B1EDA1ED97C7B1E3A1E297C2B1E2A1E297C0B1E3A1E997FAB1DCA1D197C4B1E2");
                    break;
                case -1333057526:
                    return arrayList;
                case -1184927100:
                    str2 = strArr2[0];
                    m897d = atm.m897d("B1E1A1D997FFB1E0A1E397C4B1E2A1E297F9B1E2A1E397F0B1D1A1DD97F4B1DA");
                    break;
                case -1174192331:
                    sb.append(Proxy.getUrl());
                    m897d = atm.m897d("B1E2A1D397C0B1E2A1D997F9B1E0A1D397FCB1D1A1EC97C4B1DBA1ED97F8B1EDA1D797CEB1E5A1ED97C0B1DEA1DE97FDB1E6A1EE97FCB1D6A1EA97FC");
                    break;
                case -997012039:
                    i2 = 0;
                    m897d = atm.m897d("B1DBA1DD97C0B1E3A1EC97FEB1E6A1EE97C4B1E2A1EA97F9B1DFA1EE97FD");
                    break;
                case -667274864:
                    m897d = atm.m897d("B1D1A1D397F8B1D1A1EA97CEB1E2A1D397CFB1DDA1D297FFB1EDA1EF97F0B1ECA1ED");
                    i4 = i2;
                    break;
                case -476418207:
                    arrayList.add(c0309g2);
                    m897d = atm.m897d("B1E3A1D197F4B1DDA1EA97FDB1EDA1E397F0B1ECA1D097FEB1E2A1EC97CEB1E1A1E997C2B1D8A1D997F4");
                    break;
                case -258264021:
                    sb.append(C0052e.m1418a(new byte[]{98, 46, -78, -48, -84, -85, 67, -72, 41, 51, -83, -120, -16, -76, 95, -4, 123, 44, -76, -127, -88, -104, 67, -6, 96}, new byte[]{93, 74, -35, -19, -51, -57, 42, -98}));
                    m897d = atm.m897d("B1E1A1EA97FDB1E5A1D097FEB1E2A1D797C4B1DFA1ED97FAB1DFA1D497C4B1D6A1D3");
                    break;
                case 47437008:
                    m897d = atm.m897d("B1D1A1D397F8B1D1A1EA97CEB1E2A1D397CFB1DDA1D297FFB1EDA1EF97F0B1ECA1ED");
                    break;
                case 170336792:
                    c0309g2 = c0309g.m878a(str3);
                    m897d = atm.m897d("B1DCA1E997CFB1DAA1E297CEB1DDA1E997F9B1E2A1D397F9B1DCA1EA97FDB1D2");
                    break;
                case 306363534:
                    str3 = strArr2[1];
                    m897d = atm.m897d("B1D8A1D797FFB1E5A1D097C0B1E2A1E997C7B1E1A1D797CEB1DDA1D497CEB1DDA1D197FEB1DDA1D797F8B1DCA1D997FDB1E1A1D797F9B1E3");
                    break;
                case 431654067:
                    m897d = atm.m897d("B1E5A1DE97F3B1D2A1E997CEB1E2A1EA97C1B1E6A1D597F9B1DDA1ED97FEB1E0A1E997C3B1DFA1D497C0B1ECA1ED97CEB1E2A1E297FCB1EC");
                    break;
                case 517804905:
                    i3 = i4 + 1;
                    m897d = atm.m897d("B1E0A1DE97C4B1E2A1E397CFB1E2A1EE97FAB1E0A1DE97C4B1E1A1EF97F4B1E0A1D097F4B1ECA1ED97F4B1E0A1ED97C0B1DCA1E397F8");
                    break;
                case 596529725:
                    m897d = atm.m897d("B1E3A1D197F4B1DDA1EA97FDB1EDA1E397F0B1ECA1D097FEB1E2A1EC97CEB1E1A1E997C2B1D8A1D997F4");
                    break;
                case 1156561086:
                    str4 = sb.toString();
                    m897d = atm.m897d("B1D8A1EA97C4B1E0A1D997F0B1E2A1D597F0B1DCA1D497F0B1E2A1E297F4B1E3A1D097FAB1E6A1ED");
                    break;
                case 1774731967:
                    m897d = atm.m897d("B1E2A1D997FDB1D8A1D297CEB1E2A1D497FEB1ECA1D497CEB1E5A1D797FEB1E0A1EC97CEB1E5");
                    i4 = i3;
                    break;
                case 1933105825:
                    String m897d3 = atm.m897d("B1DEA1D297CEB1E2A1E297F4B1DCA1ED97CEB1ECA1D397C0B1D6A1ED97F0B1E1A1ED97C0");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1375094019)) {
                            case -1000866560:
                                m897d3 = i4 < i ? atm.m897d("B1D8A1DE97C4B1D8A1E297F3B1EDA1E997F0B1E2A1DD97F0B1E0A1EE97C3B1DCA1D197C1B1DBA1ED97FFB1DEA1D497C0B1DCA1D2") : atm.m897d("B1E5A1D397C3B1D6A1EF97CFB1DEA1D297F8B1E5A1ED97C1B1ECA1DE97C4B1E2A1D997C7B1E6A1ED");
                            case -365560603:
                                m897d = atm.m897d("B1EDA1EE97F9B1EDA1E297C4B1E0A1EC97CEB1E2A1DE97CEB1E2A1DD97F8B1ECA1ED");
                                continue;
                            case 335827213:
                                m897d = atm.m897d("B1E5A1EC97CFB1DEA1E997FFB1D2A1D497F0B1E2A1E997C2B1E1A1D497C7B1D6");
                                continue;
                            case 511150328:
                                m897d3 = atm.m897d("B1D2A1D197F9B1E2A1D297C7B1ECA1ED97C1B1ECA1D197CFB1EDA1E397C0B1E2A1EF97C0B1E2A1D997C0B1E0");
                        }
                    }
                    break;
                case 2010486654:
                    strArr2 = str.split(C0052e.m1418a(new byte[]{-119, -28, 114}, new byte[]{-55, -92, 50, 101, -19, 107, 114, -19}));
                    m897d = atm.m897d("B1DBA1EE97F0B1DCA1E397F9B1E2A1E397F9B1E0A1D097C7B1D6A1D997FAB1DCA1ED97FFB1DBA1DD97F3B1D8A1DD97C0B1DAA1D797C0B1E2A1DD97C2");
                    break;
                case 2063093196:
                    c0309g2.m875d(str4);
                    m897d = atm.m897d("B1DEA1DD97FEB1E1A1ED97C4B1E2A1EE97FCB1DBA1ED97F4B1DFA1EE97FEB1D6A1E397FCB1DAA1D097C0B1DEA1E297CFB1DAA1E297C0B1E2A1D997FAB1DFA1ED");
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: m */
    public final JSONObject m228m(String str) {
        JSONObject jSONObject;
        RunnableC0611c runnableC0611c;
        try {
            try {
                SpiderDebug.log(C0052e.m1418a(new byte[]{-28, 118, 1, 46, 87, 102, -89, -77, -26, 100, 32, 12, 73, 45, -1, -12}, new byte[]{-125, 19, 117, 126, 37, 3, -47, -38}) + str);
                this.f1172b.add(0, m237d(str));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C0052e.m1418a(new byte[]{46, -72, -46, -76, -67, -13, -62}, new byte[]{72, -47, -66, -47, -30, -102, -90, -124}), this.f1172b.get(0));
                jSONObject2.put(C0052e.m1418a(new byte[]{62, 71, -90, -124, 6, 10, 103, -30}, new byte[]{90, 53, -49, -14, 99, 85, 14, -122}), this.f1175e);
                jSONObject2.put(C0052e.m1418a(new byte[]{-58, -28, 29, 22, 0, 56, -55, 54}, new byte[]{-91, -123, 105, 115, 103, 87, -69, 79}), C0052e.m1418a(new byte[]{-22, -44, -35, -115, 32, -100, 32, 106, -24, -50, -56, -121, 27, -127, 60, 108}, new byte[]{-122, -67, -85, -24, Byte.MAX_VALUE, -24, 82, 11}));
                jSONObject2.put(C0052e.m1418a(new byte[]{4, 35, -119, 47, -105, 8, -75, 38, 3, 52, -70, 3, -105, 19}, new byte[]{113, 81, -27, 112, -14, 112, -59, 79}), C0052e.m1418a(new byte[]{-29, 101, -41, -6, 93}, new byte[]{-46, 81, -29, -54, 109, -2, -43, 46}));
                jSONObject = new JSONObject(m224q(C0052e.m1418a(new byte[]{-92, 68, -67, 113, -99, -51, -57, -32, -28, 83, -67, 107, -115, -51, -49, -32, -92, 100, -86, 122, -83, -51, -50, -14, -101, 88, -71, 102, -110, -54, -51, -22}, new byte[]{-53, 52, -40, 31, -37, -92, -85, -123}), jSONObject2.toString(), true)).getJSONObject(C0052e.m1418a(new byte[]{-49, -4, 97, Byte.MAX_VALUE, -15, -68, -16, 123, -36, -29, 108, Byte.MAX_VALUE, -23, -68, -16, 101, -40, -20, 90, 115, -16, -123, -17}, new byte[]{-71, -107, 5, 26, -98, -29, Byte.MIN_VALUE, 9}));
                runnableC0611c = new RunnableC0611c(this);
            } catch (Exception e) {
                e.printStackTrace();
                jSONObject = new JSONObject();
                runnableC0611c = new RunnableC0611c(this);
            }
            Init.execute(runnableC0611c);
            return jSONObject;
        } catch (Throwable th) {
            Init.execute(new RunnableC0611c(this));
            throw th;
        }
    }

    /* renamed from: n */
    public final C0310h m227n(String str, String str2) {
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        ArrayList arrayList = null;
        LinkedHashMap<String, List<String>> linkedHashMap = null;
        JSONArray jSONArray = null;
        String str3 = null;
        String str4 = null;
        JSONObject jSONObject3 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        Iterator it = null;
        C0425b c0425b = null;
        StringBuilder sb = null;
        String str8 = null;
        List<String> list2 = null;
        String str9 = null;
        StringBuilder sb2 = null;
        Iterator<Map.Entry<String, List<String>>> it2 = null;
        String str10 = null;
        String str11 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        C0310h c0310h = null;
        String m897d = atm.m897d("B1DDA1ED97FFB1E2A1D297C3B1E5A1E997F3B1DDA1EA97F4B1D6A1D297F0B1DC");
        while (true) {
            switch ((m897d.hashCode() ^ 644) ^ 215630138) {
                case -2099051369:
                case -1306122899:
                case 1706676921:
                    m897d = atm.m897d("B1DFA1EA97C0B1E2A1E997F4B1D8A1D197FCB1DCA1D297F0B1ECA1ED97F3B1EDA1D7");
                    break;
                case -2087016225:
                    arrayList2 = new ArrayList();
                    m897d = atm.m897d("B1D6A1EF97F8B1ECA1DE97FFB1DCA1EE97C4B1EDA1EE97C4B1E2A1DD97FFB1D1");
                    break;
                case -1996802201:
                    str10 = sb2.toString();
                    m897d = atm.m897d("B1E6A1D097FAB1D8A1DE97C0B1D6A1ED97F0B1E2A1D397C7B1E6A1D197F9B1EDA1EC97C7B1E3A1D597CFB1DFA1E397F0B1DCA1ED97C7B1E6A1D1");
                    break;
                case -1973573313:
                    m897d = atm.m897d("B1E0A1E997CEB1DAA1ED97C0B1E2A1EA97C3B1DFA1ED97F8B1DFA1ED97F8B1DDA1D497C0B1DEA1D397F9B1E5A1E997C4B1E1A1DE");
                    str3 = str2;
                    break;
                case -1958891113:
                    String m897d2 = atm.m897d("B1D8A1D797C0B1DCA1D997CFB1D2A1D497C4B1DEA1ED97F4B1DEA1D797C4B1D6A1E397C0B1E2A1E397C3B1D2A1D497FCB1E0A1E397C0B1E2");
                    while (true) {
                        switch (m897d2.hashCode() ^ 2002394383) {
                            case -109527051:
                                break;
                            case 632880871:
                                m897d2 = list2 != null ? atm.m897d("B1DCA1E397F9B1E5A1EF97C3B1E5A1D197C4B1E2A1DE97C1B1DAA1E9") : atm.m897d("B1E6A1DD97CFB1EDA1D397FFB1E2A1D997FCB1ECA1DE97C7B1D8A1D497F3B1D1A1D797C4B1DBA1ED97CEB1E1A1D197C3B1E6A1D497C0B1E0A1D797FA");
                            case 1630246690:
                                m897d = atm.m897d("B1DEA1D597CFB1E0A1E397CEB1DEA1D097F0B1E2A1D997C7B1DCA1ED97C3B1DCA1E297FDB1E2A1D297FAB1E3A1D097C0B1DCA1E297C2");
                                break;
                            case 1751398901:
                                m897d2 = atm.m897d("B1DEA1D097CEB1E2A1D497FEB1DBA1ED97F0B1E0A1D297CEB1E2A1D197C7B1DBA1EF97F0B1DAA1D097F0B1E5A1DE97F9B1E2A1D597FFB1E1A1E2");
                        }
                    }
                    break;
                case -1932128949:
                    m897d = atm.m897d("B1DFA1EA97C0B1E2A1E997F4B1D8A1D197FCB1DCA1D297F0B1ECA1ED97F3B1EDA1D7");
                    str7 = str6;
                    break;
                case -1920834261:
                    m897d = atm.m897d("B1EDA1DE97F0B1E2A1ED97C2B1DFA1E397F4B1E5A1D297C1B1ECA1ED97C1B1D6A1EC97CEB1D2A1EA97F3B1ECA1D597C4B1DCA1EC97F4B1DEA1E997C0");
                    break;
                case -1756478142:
                    String m897d3 = atm.m897d("B1ECA1ED97FFB1EDA1D297CEB1E2A1D197FFB1DDA1D797C2B1D8A1EC97C0B1D2A1ED97F0B1E1A1E9");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1526054147)) {
                            case -347249984:
                                m897d3 = !TextUtils.isEmpty(str2) ? atm.m897d("B1E5A1DD97C7B1D2A1E997FFB1E5A1D197FDB1E6A1D797FAB1DCA1D597C4B1E5A1EF97FAB1E3A1D397C3") : atm.m897d("B1DFA1D097F9B1DFA1D397C3B1D2A1E397FFB1E3A1EA97F3B1DCA1EE97FCB1E1A1D097C7B1E0A1D597F9B1DBA1D497F3");
                            case -117090099:
                                m897d3 = atm.m897d("B1DEA1E997C4B1E2A1D597FDB1DFA1D197FCB1E5A1EF97FAB1D6A1D597FEB1ED");
                            case 707628806:
                                m897d = atm.m897d("B1E5A1D997F0B1DEA1EF97C7B1DAA1D797C1B1E6A1D097C0B1E0A1EF97FFB1E3A1D3");
                                continue;
                            case 1510117117:
                                m897d = atm.m897d("B1ECA1D597F8B1ECA1ED97CEB1E2A1DE97C3B1D8A1D197F0B1E6A1E997C2B1E2A1E297FFB1D1");
                                continue;
                        }
                    }
                    break;
                case -1753342426:
                    arrayList3.add(TextUtils.join(C0052e.m1418a(new byte[]{98}, new byte[]{65, -28, -99, 6, 51, -93, 91, 21}), arrayList2));
                    m897d = atm.m897d("B1DBA1D197F4B1E2A1EA97FAB1D8A1D797CEB1E2A1EA97FFB1D2A1D297FAB1DAA1D297F0B1DEA1D297FAB1D6A1EC97C0");
                    break;
                case -1713394498:
                    jSONObject = new JSONObject();
                    m897d = atm.m897d("B1DFA1EA97C4B1E2A1D097C4B1D1A1D297FAB1ECA1ED97FDB1E3A1D597FAB1E6A1D597F3B1E6A1D597FFB1E0A1D397C0B1E3A1ED97F3B1EDA1EA97CEB1E2");
                    break;
                case -1555949676:
                    arrayList = new ArrayList();
                    m897d = atm.m897d("B1DCA1D597C4B1E2A1E397C7B1E6A1E997C3B1DBA1ED97FFB1DFA1DD97FAB1DBA1D197FEB1D8A1D997C1B1D1A1D197FEB1D6A1EF97FEB1D1");
                    break;
                case -1454002071:
                    c0310h.m864k(TextUtils.join(C0052e.m1418a(new byte[]{82, -78, -60}, new byte[]{118, -106, -32, 89, -105, -27, -110, -51}), arrayList3));
                    m897d = atm.m897d("B1DFA1EA97F0B1DEA1D397FEB1D2A1E997FEB1E2A1D597FAB1E0A1ED97F8B1DDA1D297FEB1DBA1EC97F0B1DBA1ED97C4B1DCA1D297C2B1E6A1E9");
                    break;
                case -1449324584:
                    i2 = i3 + 1;
                    m897d = atm.m897d("B1D6A1D197FCB1E1A1DD97F0B1DEA1DD97FDB1DDA1E297F4B1DEA1D797C2B1DDA1D497F8B1DDA1D097C0B1E2");
                    break;
                case -1399307194:
                    m897d = atm.m897d("B1E3A1E397C7B1E2A1D997C3B1DCA1DD97FDB1E2A1D197C3B1DFA1D197C1B1DDA1ED97F0B1DFA1ED97CFB1DEA1EF97CFB1ECA1ED");
                    break;
                case -1338004320:
                    jSONObject2 = new JSONObject(m222s(C0052e.m1418a(new byte[]{-20, 62, 32, 31, 122, 100, -26, -49, -66, 117, 33, 30, 109, 115, -84, -26, -31, 51, 60, 29, 35, 102, -84, -51, -46, 41, 58, 23, 126, 100, -106, -37, -12, 5, 51, 24, 99, 111, -80, -44, -30, 47, 33}, new byte[]{-115, 90, 82, 118, 12, 1, -55, -71}), jSONObject));
                    m897d = atm.m897d("B1E1A1ED97CEB1E2A1E397F9B1D6A1D197C7B1DAA1D797C4B1ECA1ED97FDB1E6A1E397C0B1EDA1EE97FE");
                    break;
                case -1333463965:
                    arrayList2.add(sb.toString());
                    m897d = atm.m897d("B1D6A1D497C1B1EDA1E297C1B1DCA1E297F9B1EDA1DE97CFB1D6A1EC97FEB1E2A1D997CFB1DEA1D197C0B1DCA1ED");
                    break;
                case -1316315617:
                    jSONObject3 = jSONArray.getJSONObject(0);
                    m897d = atm.m897d("B1DDA1D597F4B1EDA1DE97FAB1E6A1E297F9B1E2A1E997F3B1D8A1EA97F3B1DFA1D297F4B1E6A1ED97FAB1E2A1D497F4B1EC");
                    break;
                case -1311058917:
                    m225p(new C0425b(str7), arrayList, linkedHashMap, "");
                    m897d = atm.m897d("B1D8A1E997CEB1E6A1EA97F9B1D2A1EF97C3B1ECA1D497CFB1DBA1EE97F9B1DFA1EE97F3");
                    break;
                case -1261882598:
                    String m897d4 = atm.m897d("B1D8A1EE97FEB1E2A1EE97C0B1DDA1ED97F9B1E6A1D097C0B1E1A1EE97C4B1D8A1EE97FFB1E6A1E297F0B1D1A1D197FFB1D8A1DD97C4B1E2");
                    while (true) {
                        switch (m897d4.hashCode() ^ (-740190063)) {
                            case -1913028019:
                                m897d4 = atm.m897d("B1D8A1D097F0B1E2A1EA97C3B1DDA1D797CFB1E6A1ED97F8B1DBA1ED97C0B1DCA1D197C3B1DFA1ED97C2B1DEA1D397C3B1DBA1ED97C4B1E2A1D997CE");
                            case -1449116636:
                                break;
                            case -1435634483:
                                m897d4 = jSONObject3.getString(C0052e.m1418a(new byte[]{46, 117, -84, 5, 26, 79, -18, 114}, new byte[]{77, 20, -40, 96, 125, 32, -100, 11})).equals(C0052e.m1418a(new byte[]{3, 91, -69, 93, 13}, new byte[]{117, 50, -33, 56, 98, 89, -91, 95})) ? atm.m897d("B1D8A1D197C1B1DDA1DE97F9B1E2A1ED97FCB1E1A1E297FCB1DBA1E297F4B1D2A1ED") : atm.m897d("B1DEA1D497F0B1D2A1D097F0B1DAA1EC97FEB1E2A1DE97FCB1D2A1D397FDB1E2");
                            case 1785229395:
                                m897d = atm.m897d("B1DEA1D797C2B1DDA1E297FDB1E1A1D197C4B1E0A1D497C0B1D1A1EA97CFB1E0A1E997F9B1E2A1EC97FAB1DCA1ED");
                                break;
                        }
                    }
                    m897d = atm.m897d("B1E0A1EF97CEB1EDA1EA97C7B1E0A1ED97C0B1DAA1E997C4B1DDA1DE97C3B1DCA1D197CEB1DCA1DD97CEB1E2A1D297FAB1E3");
                    break;
                case -1037688696:
                    m897d = atm.m897d("B1E2A1D397F8B1DBA1D197F0B1D6A1D197FEB1E2A1EF97C1B1ECA1ED97C1B1DEA1EA97C7B1DBA1EF97C0B1DDA1EF");
                    str11 = str9;
                    break;
                case -996812495:
                    sb.append(str11);
                    m897d = atm.m897d("B1E5A1D197FFB1DEA1D197C3B1DCA1D097C7B1E2A1D297F8B1E5A1D097C0B1E5A1D397F4");
                    break;
                case -994630280:
                    m897d = atm.m897d("B1E1A1EF97FFB1D6A1EC97FEB1E2A1D397CEB1E5A1D397C0B1E0A1ED97FFB1E3A1EA97FAB1E2A1E997C0");
                    str7 = str3;
                    break;
                case -923303169:
                    c0310h.m873b(C0052e.m1418a(new byte[]{-113, 68, -119, -117, 66, 51, 85, 65, -44, 59, -83, -58}, new byte[]{102, -36, 54, 98, -59, -65, -68, -38}));
                    m897d = atm.m897d("B1D8A1D097FFB1E2A1EE97F8B1DEA1D597C4B1D8A1E397C1B1DDA1D097C4B1DDA1ED97FDB1D1A1D597FAB1E0A1D397C0B1D2A1D197F0B1E2A1EC97FAB1DA");
                    break;
                case -727788263:
                    i = 0;
                    m897d = atm.m897d("B1DFA1E997C2B1DCA1E297FEB1E2A1D197C7B1DFA1D497F9B1DFA1ED97F8B1DEA1DE97C2B1DDA1E997F9B1E6A1ED97C0B1DEA1DE97C1B1DBA1D097FA");
                    break;
                case -674010084:
                    c0310h.m865j(TextUtils.join(C0052e.m1418a(new byte[]{-12, -127, 87}, new byte[]{-48, -91, 115, 89, -3, 22, 79, 123}), list));
                    m897d = atm.m897d("B1E1A1EA97C4B1EDA1DD97F0B1E2A1D297F3B1E5A1D197F9B1DCA1EE97FAB1DFA1ED");
                    break;
                case -590543953:
                    it = arrayList.iterator();
                    m897d = atm.m897d("B1E3A1E397C7B1E2A1D997C3B1DCA1DD97FDB1E2A1D197C3B1DFA1D197C1B1DDA1ED97F0B1DFA1ED97CFB1DEA1EF97CFB1ECA1ED");
                    break;
                case -571040223:
                    m897d = atm.m897d("B1D6A1D097C3B1E0A1D097C0B1E2A1DE97C0B1DBA1EE97C0B1DDA1ED97FEB1D6A1DD97FAB1E0A1D397CFB1ECA1D397FAB1DFA1D397C2B1D6A1ED97C0");
                    str11 = str10;
                    break;
                case -441264342:
                    c0310h.m866i(jSONObject2.getString(C0052e.m1418a(new byte[]{54, -87, 40, 5, -73, -19}, new byte[]{87, -33, 73, 113, -42, -97, 113, -127})));
                    m897d = atm.m897d("B1E5A1D397F8B1E1A1DD97CEB1E0A1ED97F3B1DFA1D297C1B1E5A1EA97F3B1EDA1D597CFB1E0A1DE97FEB1D6A1E397F4");
                    break;
                case -412051983:
                    sb.append(c0425b.m633b());
                    m897d = atm.m897d("B1DAA1EA97C2B1DAA1EF97C1B1E0A1D997F3B1DEA1D397C0B1E0A1D097F0B1D1A1EF97C0B1D1A1DD97F0B1D2A1EF97F9B1E2");
                    break;
                case -349334938:
                    return c0310h;
                case -221662333:
                    sb = new StringBuilder();
                    m897d = atm.m897d("B1E6A1DD97C4B1E2A1E397FFB1DFA1DD97F3B1E6A1D297C4B1E2A1D597FEB1E1A1EE97F0B1EDA1D097F3B1DA");
                    break;
                case -200437961:
                    m897d = atm.m897d("B1D6A1D097C3B1E0A1D097C0B1E2A1DE97C0B1DBA1EE97C0B1DDA1ED97FEB1D6A1DD97FAB1E0A1D397CFB1ECA1D397FAB1DFA1D397C2B1D6A1ED97C0");
                    break;
                case -169378356:
                    str4 = "";
                    m897d = atm.m897d("B1E6A1E997F0B1ECA1D197C3B1ECA1D497FEB1E2A1D997C1B1DFA1D297FEB1D6");
                    break;
                case -127884213:
                    it2 = linkedHashMap.entrySet().iterator();
                    m897d = atm.m897d("B1E2A1D397F8B1D1A1DD97C0B1DDA1DD97F4B1E6A1DD97CEB1D1A1DE97C4B1E2A1EE97F8B1DBA1ED");
                    break;
                case -116970209:
                    String m897d5 = atm.m897d("B1EDA1E997CEB1E2A1D797FDB1D8A1D497C7B1DFA1ED97F4B1E5A1DD97C1B1E5A1D297C1B1ECA1EE97C1B1E3A1E997C0");
                    while (true) {
                        switch (m897d5.hashCode() ^ (-26489464)) {
                            case -1066622629:
                                m897d5 = atm.m897d("B1DCA1EE97F0B1E2A1DD97F8B1ECA1ED97F9B1DEA1D097C0B1E5A1EC97C0B1E2A1ED97F4B1D2A1EA97F9B1ECA1D397FFB1DCA1ED");
                            case 420166986:
                                m897d = atm.m897d("B1D2A1ED97CFB1E0A1D297F3B1DEA1D597F0B1E1A1EF97FDB1DBA1EE97C0");
                                continue;
                            case 573924022:
                                m897d = atm.m897d("B1E6A1EE97C4B1E2A1E397F8B1E1A1E397C0B1E2A1EA97FDB1E2A1E297F8B1DFA1D397C1B1DCA1ED");
                                continue;
                            case 1501749421:
                                m897d5 = jSONObject3.getString(C0052e.m1418a(new byte[]{46, 30, Byte.MAX_VALUE, 13}, new byte[]{90, 103, 15, 104, -125, -22, 9, 13})).equals(C0052e.m1418a(new byte[]{0, 108, -117, -32, -32, -20}, new byte[]{102, 3, -25, -124, -123, -98, -124, 21})) ? atm.m897d("B1DFA1ED97F8B1DEA1D397FDB1EDA1E297FEB1E2A1E997F9B1DFA1E997F0B1E0A1D297C4B1D2A1EA97CEB1DAA1EF97C7B1ECA1ED") : atm.m897d("B1D8A1D997FFB1EDA1E997F0B1D1A1D797FFB1E3A1D197C4B1E2A1D597C4B1DCA1D597FFB1E6A1D097C7B1DCA1D997FDB1E0A1D197C2B1DBA1ED");
                        }
                    }
                    break;
                case 19691846:
                    m897d = atm.m897d("B1D1A1DD97FDB1D2A1E297FCB1ECA1D597F3B1E2A1DD97CFB1E3A1D497CFB1D1A1D197F9B1E3A1EC97C4B1E2A1E997CFB1DF");
                    break;
                case 36925082:
                    m897d = atm.m897d("B1E1A1ED97F8B1E5A1D597C3B1E6A1EF97C1B1DBA1D297CEB1D8A1E397C4B1E2A1E397F9B1DDA1D197F3B1E1A1D297CEB1DFA1DE97FDB1E3");
                    c0425b = (C0425b) it.next();
                    break;
                case 53335953:
                    String m897d6 = atm.m897d("B1DEA1ED97FEB1E2A1DD97F4B1E3A1ED97C1B1D6A1D197C2B1EDA1EA97F8B1DCA1E997CEB1E2A1D997C1B1E3A1E997FEB1DFA1ED");
                    while (true) {
                        switch (m897d6.hashCode() ^ 536453473) {
                            case -1803460534:
                                m897d = atm.m897d("B1DCA1DE97F0B1E2A1DE97FFB1E6A1ED97C4B1DFA1E997C1B1DDA1D297C4B1E5A1EF");
                                break;
                            case -625900083:
                                break;
                            case -389485631:
                                m897d6 = atm.m897d("B1E2A1D597CEB1D6A1EC97C2B1ECA1E997FCB1DAA1D097C0B1E3A1EC97C7");
                            case 509472138:
                                m897d6 = jSONObject3.getString(C0052e.m1418a(new byte[]{-95, 19, -17, 20}, new byte[]{-43, 106, -97, 113, -103, -10, 16, -29})).equals(C0052e.m1418a(new byte[]{70, -57, -41, 72}, new byte[]{32, -82, -69, 45, -64, 47, 26, 25})) ? atm.m897d("B1E6A1EC97FDB1E2A1D297FFB1D8A1E397C4B1D1A1D197F8B1DFA1D097C1B1DDA1D097F8B1DCA1D197C4B1DC") : atm.m897d("B1D2A1D597FEB1E6A1D297C4B1E2A1E997CFB1E6A1ED97F4B1D6A1EA97CFB1ECA1E397F3B1DAA1D0");
                        }
                    }
                    break;
                case 116811085:
                    m897d = atm.m897d("B1E1A1DD97FCB1D1A1D797FDB1E2A1EE97FDB1D6A1E297C2B1E2A1ED97C1B1DBA1D497C0B1DDA1D097C7B1E3A1DE97F8");
                    break;
                case 210142766:
                    m897d = atm.m897d("B1ECA1D797C0B1E2A1D097F3B1E2A1ED97F3B1DBA1EF97FDB1DFA1DE97FDB1E2A1ED97FFB1E3A1DE97FAB1E6A1D2");
                    break;
                case 367113504:
                    c0310h = new C0310h();
                    m897d = atm.m897d("B1DEA1D397FFB1DFA1EC97F8B1DEA1ED97C0B1D8A1E997FDB1E2A1EE97FEB1DEA1ED97FAB1ECA1EF97FAB1ECA1E297C4B1E2A1ED97C4B1DA");
                    break;
                case 367219862:
                    sb2.append(m238c(it2.next().getValue()));
                    m897d = atm.m897d("B1E0A1EC97C4B1D1A1E997F0B1E2A1D797C4B1E3A1D397C7B1DDA1EF97FAB1D2A1DE97F4B1DA");
                    break;
                case 457002744:
                    m897d = atm.m897d("B1D1A1DD97FDB1D2A1E297FCB1ECA1D597F3B1E2A1DD97CFB1E3A1D497CFB1D1A1D197F9B1E3A1EC97C4B1E2A1E997CFB1DF");
                    i3 = i;
                    break;
                case 510526380:
                    m897d = atm.m897d("B1DCA1D297C2B1E1A1D597C2B1DDA1D197F9B1E2A1D097F4B1E6A1ED97C3B1DEA1D997C7B1DAA1D797FCB1D1");
                    i3 = i2;
                    break;
                case 730583513:
                    sb.append(C0052e.m1418a(new byte[]{3}, new byte[]{39, -92, 61, 69, 115, 56, -9, -115}));
                    m897d = atm.m897d("B1D6A1E297C1B1DDA1EA97F4B1E6A1D797F0B1E2A1EF97C0B1D2A1ED97F3B1E5A1D997CFB1DFA1EA97FEB1E2A1EF97F4B1EDA1D097FAB1EC");
                    break;
                case 878713047:
                    sb.append(c0425b.m631d());
                    m897d = atm.m897d("B1D2A1D497FDB1E2A1DD97F0B1E0A1EC97CEB1DEA1E397C7B1D2A1E997FAB1E3A1D197C4B1DFA1EE97C0B1D6");
                    break;
                case 928970000:
                    String m897d7 = atm.m897d("B1E0A1EE97C1B1E0A1EF97FFB1D6A1D197F9B1DAA1EA97F9B1E2A1EE97FDB1DDA1E297F4B1E5A1D097FA");
                    while (true) {
                        switch (m897d7.hashCode() ^ 1060797797) {
                            case -17106376:
                                m897d = atm.m897d("B1EDA1D997C4B1E2A1E297FCB1DAA1D297F8B1E5A1DD97CFB1DBA1EA97C3B1D1");
                                continue;
                            case 298901279:
                                m897d7 = jSONArray.length() == 0 ? atm.m897d("B1DEA1EA97FFB1D1A1E997FEB1DCA1EA97F8B1E0A1D397C0B1E2A1EC97C0B1DA") : atm.m897d("B1DFA1EF97CEB1E2A1D597C4B1E2A1ED97C1B1DFA1ED97F3B1DDA1ED97FEB1D6A1D3");
                            case 710330002:
                                m897d = atm.m897d("B1E0A1EF97CEB1EDA1EA97C7B1E0A1ED97C0B1DAA1E997C4B1DDA1DE97C3B1DCA1D197CEB1DCA1DD97CEB1E2A1D297FAB1E3");
                                continue;
                            case 1526185394:
                                m897d7 = atm.m897d("B1ECA1D797C3B1ECA1E297CEB1DDA1D797C1B1E2A1EF97FEB1E6A1D097F3B1D1A1E397C0");
                        }
                    }
                    break;
                case 1032039518:
                    str6 = C0052e.m1418a(new byte[]{84, 101, -125, 61}, new byte[]{38, 10, -20, 73, -41, -117, 74, -46});
                    m897d = atm.m897d("B1E3A1EC97C1B1E1A1EF97F9B1E2A1D997FFB1E6A1ED97FAB1DDA1D797F8B1E2A1ED97FEB1D1A1D197FFB1D2A1D9");
                    break;
                case 1119129974:
                    jSONArray = jSONObject2.getJSONArray(C0052e.m1418a(new byte[]{-56, -113, -45, 21, -87, -71, 110, 16, -63, -107}, new byte[]{-82, -26, -65, 112, -10, -48, 0, 118}));
                    m897d = atm.m897d("B1E1A1DD97CEB1E2A1DD97F8B1ECA1ED97CEB1D2A1D997C1B1E5A1EA97FCB1E1A1D597CFB1E2A1D497F0B1E2A1D097C4B1DCA1D197FAB1E0");
                    break;
                case 1165249735:
                    sb2 = new StringBuilder();
                    m897d = atm.m897d("B1DDA1D997FDB1DDA1EF97CEB1E2A1D597FEB1DAA1D997F3B1E0A1D197C2B1DBA1ED97C4B1E1A1EE97C1B1E6A1ED97C0B1ECA1E997FDB1E2");
                    break;
                case 1198695676:
                    String m897d8 = atm.m897d("B1D6A1D197FEB1E2A1E297C1B1E3A1D797F0B1DBA1ED97FCB1D6A1ED97C0B1DBA1DD97F0B1E2A1EE97F8B1E5A1DE97C1B1DCA1ED");
                    while (true) {
                        switch (m897d8.hashCode() ^ 747609357) {
                            case -2105951364:
                                m897d8 = list2.size() > 0 ? atm.m897d("B1DEA1D397C4B1E2A1DE97F9B1E2A1ED97C4B1DCA1DE97FCB1DEA1E397C7B1ECA1E997C0B1D1A1D497C1B1ECA1EA97CFB1D8A1E297C3") : atm.m897d("B1DDA1D497CEB1D1A1D397C7B1DEA1DD97F8B1DBA1D297C0B1DAA1D097F9B1E2A1D197C0B1D8");
                            case -1907829166:
                                m897d8 = atm.m897d("B1DFA1D097CFB1DFA1E397CEB1E2A1E297F4B1DCA1ED97F8B1DBA1D497C0B1E6A1ED97C2B1D1A1D197C4B1E2A1ED97F4B1D2A1DD97C3B1DEA1E397CE");
                            case 1324737482:
                                m897d = atm.m897d("B1EDA1D297C3B1D6A1E997C4B1ECA1D997C0B1E2A1EC97C4B1EDA1ED97C0B1DDA1E397F8B1DBA1ED");
                                break;
                            case 2035704473:
                                break;
                        }
                    }
                    m897d = atm.m897d("B1D2A1D197FEB1EDA1E397C2B1DFA1D597FCB1D2A1ED97CEB1DDA1D297FFB1D1A1D397F3B1E3A1EE");
                    break;
                case 1241248051:
                    String m897d9 = atm.m897d("B1DDA1E397FEB1D2A1EA97FEB1DEA1DD97C0B1DAA1EE97F9B1E2A1EF97C0B1DAA1D397C2B1DCA1ED97FDB1EDA1E297F9B1DBA1EA");
                    while (true) {
                        switch (m897d9.hashCode() ^ 291532327) {
                            case -802776653:
                                m897d9 = atm.m897d("B1D1A1DD97FAB1E3A1D097F0B1DDA1EF97FDB1D8A1D997F3B1E1A1D397F4");
                            case -209841953:
                                m897d = atm.m897d("B1E1A1D297C4B1E2A1D497F8B1DFA1DE97CEB1E2A1D597C4B1D8A1D797C1B1DCA1ED97CFB1DDA1E2");
                                continue;
                            case 1324718035:
                                m897d9 = it.hasNext() ? atm.m897d("B1DCA1E397C2B1DFA1EF97C0B1ECA1EF97FFB1DAA1D797F9B1DEA1EF97FDB1DFA1EA97F9B1E2A1EE97FAB1DC") : atm.m897d("B1E2A1D797F3B1E1A1E297F3B1EDA1D597C7B1EDA1D397C3B1EDA1D397FFB1E2A1D797C4B1DAA1D997CFB1DF");
                            case 1753588252:
                                m897d = atm.m897d("B1D6A1D997FFB1E3A1D397C0B1DEA1EC97FDB1E2A1EA97F4B1E3A1D197C0B1D2A1E997F9B1D8A1ED97F3B1E6A1E297C3");
                                continue;
                        }
                    }
                    break;
                case 1361756727:
                    linkedHashMap = new LinkedHashMap<>();
                    m897d = atm.m897d("B1DFA1EF97C1B1DFA1EA97C2B1D2A1EA97C1B1EDA1D297FDB1E2A1EC97FDB1E2A1E997FAB1D8A1EE97CEB1E5A1D297FCB1E2A1ED97C7B1D2A1D497C0");
                    break;
                case 1385995140:
                    c0310h.m868g(str);
                    m897d = atm.m897d("B1ECA1DE97FEB1E3A1D597FEB1DEA1D597F0B1E2A1DE97FAB1D1A1E297C0B1E2A1DE97F8B1E6A1ED97F4B1DAA1E2");
                    break;
                case 1432444859:
                    arrayList3 = new ArrayList();
                    m897d = atm.m897d("B1DBA1D197F3B1EDA1ED97F3B1DFA1EF97C0B1E2A1DE97FCB1DAA1D497CFB1D2A1ED97C4B1ECA1EA97CEB1DFA1D097C0B1DFA1EF97F0B1E2A1EA");
                    break;
                case 1495881105:
                    str8 = c0425b.m629f();
                    m897d = atm.m897d("B1D2A1D597CFB1DFA1EC97C2B1D2A1DE97F9B1E2A1EF97C3B1DBA1DE97F3B1E6A1ED");
                    break;
                case 1551901389:
                    list = Arrays.asList(C0052e.m1418a(new byte[]{-35, 86, 37, -62, 83, -33}, new byte[]{56, -40, -70, 37, -58, 116, 57, -1}), C0052e.m1418a(new byte[]{-40, -26, 46, 34, 107, 40}, new byte[]{48, 80, -85, -60, -45, -83, 73, 110}), C0052e.m1418a(new byte[]{17, 103, 63, -29, -108, 57}, new byte[]{-8, -52, -89, 5, 44, -68, 65, -28}));
                    m897d = atm.m897d("B1ECA1D597CEB1E2A1EC97FDB1E6A1ED97FDB1D1A1DD97C0B1E2A1D397C4B1DFA1E397CE");
                    break;
                case 1596922533:
                    m897d = atm.m897d("B1DDA1DD97FCB1D2A1EF97C0B1DDA1D797CEB1ECA1D497FFB1E2A1D597C3B1E1A1EC97F4B1D1A1ED97FEB1DFA1ED97FDB1D8A1E297CFB1DBA1D397C0");
                    list2 = linkedHashMap.get(str8.substring(0, str8.lastIndexOf(C0052e.m1418a(new byte[]{-8}, new byte[]{-42, 4, 15, -36, 1, 16, -4, -30}))));
                    break;
                case 1624622068:
                    c0310h.m867h(jSONObject2.getString(C0052e.m1418a(new byte[]{-41, -27, 43, -114, 96, -11, 87, 1, -55, -24}, new byte[]{-92, -115, 74, -4, 5, -86, 57, 96})));
                    m897d = atm.m897d("B1D6A1ED97C7B1D8A1EF97FCB1E5A1EE97F0B1DAA1EC97C0B1DFA1EF97FDB1E6A1D297FE");
                    break;
                case 1648794505:
                    jSONObject.put(C0052e.m1418a(new byte[]{-6, 36, 77, -113, -102, -65, -70, -26}, new byte[]{-119, 76, 44, -3, -1, -32, -45, -126}), this.f1174d);
                    m897d = atm.m897d("B1E5A1E297F8B1E5A1EE97C4B1EDA1D497F8B1D8A1D297C1B1E2A1D497C0B1DBA1D997FCB1E1A1ED97C3");
                    break;
                case 1687928393:
                    m897d = atm.m897d("B1E6A1D497CEB1E2A1D197FEB1ECA1ED97C1B1E2A1E297C3B1D1A1D497C7B1EDA1E997FCB1E1A1E997C0");
                    str7 = str4;
                    break;
                case 1757947548:
                    String m897d10 = atm.m897d("B1EDA1D797C0B1E0A1DE97FDB1E2A1DE97FEB1D2A1ED97FEB1DDA1E297FFB1ECA1ED97FDB1EDA1E297F0B1D2A1ED97FDB1DBA1E397C0B1E1A1DD97F9");
                    while (true) {
                        switch (m897d10.hashCode() ^ 556444759) {
                            case -2087430188:
                                m897d10 = atm.m897d("B1EDA1EF97C2B1D2A1D297C0B1E2A1EA97F4B1E3A1DE97C2B1E2A1D497F3B1D2A1EA97FA");
                            case -2046375911:
                                m897d = atm.m897d("B1E3A1D597FEB1E2A1E997F4B1D8A1EC97FDB1E0A1ED97FDB1E6A1D797FFB1ED");
                                continue;
                            case -1913030909:
                                m897d10 = i3 < list.size() ? atm.m897d("B1DFA1D097FEB1E2A1EC97FDB1DBA1EC97F4B1D2A1D497F9B1DBA1D397F0B1E5A1E997F4B1DB") : atm.m897d("B1E0A1D097C4B1E2A1D397FAB1E2A1ED97C1B1ECA1DD97C0B1E1A1ED97FCB1DCA1E997CEB1D1A1ED97F0B1E2A1D297C0B1E0");
                            case 1566711636:
                                m897d = atm.m897d("B1D1A1D397FAB1DAA1E297FCB1E2A1D397C2B1DEA1DE97F4B1E1A1E397FCB1DCA1E397C0");
                                continue;
                        }
                    }
                    break;
                case 1786233335:
                    Collections.sort(arrayList, new C0426c());
                    m897d = atm.m897d("B1E3A1EC97F0B1E2A1DD97C0B1E3A1D297FAB1D2A1ED97CEB1E5A1E997C2B1DAA1E997C0");
                    break;
                case 1841102867:
                    str5 = jSONObject3.getString(C0052e.m1418a(new byte[]{55, -88, 3, 66, -114, -61, 64}, new byte[]{81, -63, 111, 39, -47, -86, 36, -57}));
                    m897d = atm.m897d("B1DAA1D197F8B1E1A1D797C4B1DCA1ED97C1B1EDA1E997C1B1DCA1D097C0B1D8A1ED97F4B1E3A1D297F9");
                    break;
                case 1861643634:
                    m897d = atm.m897d("B1E2A1D397F8B1D1A1DD97C0B1DDA1DD97F4B1E6A1DD97CEB1D1A1DE97C4B1E2A1EE97F8B1DBA1ED");
                    break;
                case 1862994142:
                    String m897d11 = atm.m897d("B1DBA1D497F3B1E5A1D197CEB1DEA1E397FCB1E3A1D997C0B1E2A1D097F9B1E3A1D997F9B1DFA1ED97C0B1E6A1D9");
                    while (true) {
                        switch (m897d11.hashCode() ^ 686747273) {
                            case -1730182762:
                                m897d = atm.m897d("B1DEA1DE97C3B1D8A1E997FCB1E6A1E397CFB1D2A1D997C2B1E0A1EC97FF");
                                continue;
                            case -405355359:
                                m897d = atm.m897d("B1E0A1E997FCB1D6A1E397F0B1E2A1E397CFB1E3A1E397FEB1D1A1EC97FDB1D8A1EF97CEB1E2A1EC97FAB1EC");
                                continue;
                            case 1343482299:
                                m897d11 = atm.m897d("B1DEA1D597C4B1E2A1D297CFB1D8A1DD97FDB1E1A1E397F8B1E6A1ED97F8B1D1A1D397C0B1DCA1D197C0B1DCA1D797CF");
                            case 1968759691:
                                m897d11 = it2.hasNext() ? atm.m897d("B1E3A1E297C0B1D8A1E997CEB1E2A1DE97FDB1E1A1EE97C1B1DFA1E997C3B1DBA1ED") : atm.m897d("B1D2A1D397C0B1E0A1E397C2B1DDA1D797FAB1E2A1D797FCB1E5A1E397FAB1D8A1D297CEB1E2A1EF97F4B1E6A1ED97FCB1D2A1D197CEB1EDA1E2");
                        }
                    }
                    break;
                case 1868999435:
                    c0310h.m870e(str);
                    m897d = atm.m897d("B1DAA1EC97F3B1DEA1E397C4B1ECA1EF97F9B1DFA1E297C3B1E1A1DE");
                    break;
                case 1898160398:
                    m897d = atm.m897d("B1DFA1D497F4B1D2A1EE97FFB1DBA1D197C0B1E2A1D397C4B1E5A1D397F9B1ECA1ED97F8B1DEA1E397F0B1DAA1ED97C0B1DFA1D297C4B1E2");
                    str7 = str5;
                    break;
                case 1902515541:
                    str9 = m238c(list2);
                    m897d = atm.m897d("B1DDA1D197C0B1E2A1D297F4B1D2A1EA97F9B1D1A1D297C0B1DDA1DE97FDB1E6A1ED97C2B1ECA1ED97C0B1DFA1D097FFB1E2");
                    break;
            }
        }
    }

    /* renamed from: r */
    public final String m223r(String[] strArr, String str) {
        try {
            JSONObject m228m = m228m(strArr[0]);
            String m232i = m232i(m228m, str);
            List<C0309g> m229l = m229l(strArr);
            ((ArrayList) m229l).addAll(m230k(m228m));
            C0308f c0308f = new C0308f();
            c0308f.m880o(m232i);
            c0308f.m881n(m229l);
            c0308f.m892c(m234g());
            return c0308f.toString();
        } catch (Exception e) {
            e.printStackTrace();
            C0308f c0308f2 = new C0308f();
            c0308f2.m880o("");
            return c0308f2.toString();
        }
    }

    /* renamed from: t */
    public final Object[] m221t(Map<String, String> map) {
        String m897d = atm.m897d("B1E3A1DE97C0B1D1A1DD97FEB1DCA1D797F9B1E3A1E397C4B1E2A1DD97F4B1ECA1ED97F4B1DCA1E997C0B1E5A1D297FDB1DCA1D297C0B1E2A1D397C4B1DB");
        String str = null;
        while (true) {
            switch ((m897d.hashCode() ^ 285) ^ 476582236) {
                case -378401919:
                    str = C0574b.m307f(m235f(map.get(C0052e.m1418a(new byte[]{-127, 37, 72, -40, -33, -113, 17}, new byte[]{-25, 76, 36, -67, Byte.MIN_VALUE, -26, 117, -113}))), m233h(), null);
                    m897d = atm.m897d("B1DBA1E297F4B1D1A1D397FFB1EDA1DE97FEB1ECA1D397C4B1E2A1D497CEB1DCA1ED97C4B1DCA1E997C3B1E6A1E997C7B1D2A1D2");
                    break;
                case 400805863:
                    return new Object[]{200, C0052e.m1418a(new byte[]{-85, 81, 58, -57, 64, -118, -27, 53, -93, 78, 36, -124, 70, -118, -16, 36, -66, 12, 57, -33, 91, -116, -27, 44}, new byte[]{-54, 33, 74, -85, 41, -23, -124, 65}), new ByteArrayInputStream(str.getBytes())};
                case 991761669:
                    m897d = atm.m897d("B1D2A1D397F4B1E6A1D397FFB1E2A1D997C7B1DCA1ED97FCB1E0A1ED97C4B1D6A1EE");
                    break;
                case 1094876054:
                    m897d = atm.m897d("B1DEA1DE97FEB1E2A1D097C3B1D1A1D997C7B1DDA1D397CEB1E2A1ED97FFB1D2A1D497C0");
                    break;
            }
        }
    }

    /* renamed from: u */
    public final void m220u(String str) {
        this.f1174d = str;
        try {
            SpiderDebug.log(C0052e.m1418a(new byte[]{116, 60, -65, 101, -50, -34, -89, -12, 110, 56, -85, 114, -1, -62, -92, -62, 104, 119, -9, 57}, new byte[]{6, 89, -39, 23, -85, -83, -49, -89}));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0052e.m1418a(new byte[]{-54, -48, -96, -110, 89, 32, 115, -83}, new byte[]{-71, -72, -63, -32, 60, Byte.MAX_VALUE, 26, -55}), this.f1174d);
            jSONObject.put(C0052e.m1418a(new byte[]{-86, -110, -107, -31, 109, -43, 12, -19, -67}, new byte[]{-39, -6, -12, -109, 8, -118, 124, -102}), "");
            this.f1173c = new JSONObject(m222s(C0052e.m1418a(new byte[]{44, 26, -112, -54, 37, 116, 90, -36, 5, 68, -42, -41, 38, 58, 79, -36, 46, 119, -52, -47, 44, 103, 77, -26, 46, 71, -44, -36, 35}, new byte[]{90, 40, -65, -71, 77, 21, 40, -71}), jSONObject)).getString(C0052e.m1418a(new byte[]{-81, -117, 38, 88, 115, 52, -112, -116, -73, -122, 41}, new byte[]{-36, -29, 71, 42, 22, 107, -28, -29}));
        } catch (Exception e) {
            e.printStackTrace();
            Init.show(C0052e.m1418a(new byte[]{50, 43, 44, -37, 22, -126, 41, -50, 112, 122, 22, -79, 103, -79, 126, -66, 94, 19, 78, -121, 36, -3, 123, -23, 51, 49, 27, -37, 26, -112, 47, -37, 84}, new byte[]{-42, -107, -86, 61, -113, 24, -52, 91}));
        }
    }
}
