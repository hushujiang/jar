package com.github.catvod.spider.merge.p044k;

import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p048m.C0620d;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.p */
/* loaded from: classes.dex */
public final class C0601p extends Dora {

    /* renamed from: b */
    private final String f1127b = C0052e.m1418a(new byte[]{94, -8, 13, -13, -60, -120, 122, 11, 52, -88, 79, -75, -115, -53, 25, 80, 116, -20, 25, -66, -115, -74, 110, 25, 91, -9, 5, -9, -62, -118, 49, 25}, new byte[]{26, -103, 97, -123, -83, -29, 85, 57}) + Build.VERSION.RELEASE + C0052e.m1418a(new byte[]{-107, -94}, new byte[]{-82, -126, 75, -118, 49, 107, 43, -113}) + Build.MODEL + C0052e.m1418a(new byte[]{28, 68, 100, -40, -66, -122, 98}, new byte[]{60, 6, 17, -79, -46, -30, 77, -33}) + Build.ID + C0052e.m1418a(new byte[]{24}, new byte[]{49, 70, 20, -40, -75, 94, 4, 22});

    static {
        String m897d = atm.m897d("B1D1A1D497FEB1E6A1EA97CFB1DFA1D097C0B1E2A1DE97FDB1E2A1EC97F9B1ECA1ED97F8B1DBA1E997C7B1DCA1E297C1B1DFA1E297CEB1E6A1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 463) ^ (-64136701)) {
                case -68629268:
                    C0052e.m1418a(new byte[]{28, -10, -42, -16, -95, 92, 83, 58, 4, -21, -116, -21, -18, 29, 5, 46, 67, -75, -116, -29, -12, 30}, new byte[]{116, -126, -94, Byte.MIN_VALUE, -101, 115, 124, 91});
                    m897d = atm.m897d("B1DEA1ED97F0B1D2A1E397C4B1E6A1ED97F9B1E2A1E297F9B1E3A1EF97F3B1DDA1D597FCB1D1A1E997FEB1E6");
                    break;
                case 325952819:
                    return;
            }
        }
    }

    /* renamed from: a */
    private HashMap m265a() {
        HashMap hashMap = null;
        String m897d = atm.m897d("B1E2A1E297CFB1E3A1EE97F0B1E2A1EF97FFB1DBA1D197F3B1DCA1ED97F3B1EDA1E297C0B1ECA1D497C0");
        while (true) {
            switch ((m897d.hashCode() ^ 572) ^ 191346095) {
                case -2103668722:
                    m897d = atm.m897d("B1DDA1D097F8B1D1A1EE97CFB1DDA1EC97FCB1EDA1DD97FEB1E2A1D997FDB1D6A1EF97F8B1D1A1D997FDB1E1A1D497FEB1E2A1EE97F4B1DB");
                    break;
                case -810643314:
                    hashMap = new HashMap();
                    m897d = atm.m897d("B1E0A1E397FCB1DBA1ED97C4B1E2A1E997CEB1E3A1D297FFB1ECA1D397C4B1DFA1ED97F9B1DBA1D997FDB1E2A1DD97C0");
                    break;
                case 355987751:
                    hashMap.put(C0052e.m1418a(new byte[]{109, -39, 96, -114, -107, -12, -72, 43, 118, -34}, new byte[]{24, -86, 5, -4, -72, -107, -33, 78}), this.f1127b);
                    m897d = atm.m897d("B1D1A1D297F8B1D2A1D097C4B1E2A1DD97F9B1E6A1EF97F3B1D8A1D497C1B1DBA1ED97F4B1D6A1EF97C2B1E1A1E997FDB1E0A1D4");
                    break;
                case 742048482:
                    return hashMap;
            }
        }
    }

    /* renamed from: b */
    private String m264b(long j, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            URL url = new URL(str);
            String path = url.getPath();
            String[] split = url.getQuery().split(C0052e.m1418a(new byte[]{-88}, new byte[]{-114, -13, -101, -17, 87, Byte.MAX_VALUE, 109, 26}));
            int length = split.length;
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1DFA1EC97CFB1EDA1D597C0B1E6A1D997C4B1E2A1E297C7B1DCA1EE97F4B1E1A1EC97FCB1DCA1D597FFB1ECA1ED97C7B1ECA1D0");
                while (true) {
                    switch (m897d.hashCode() ^ (-333969107)) {
                        case -1924921565:
                            m897d = i < length ? atm.m897d("B1DBA1E997C1B1DBA1E997C0B1D6A1E397FEB1E2A1D297F3B1D1A1EE97F3B1E2A1ED97CFB1DAA1EE") : atm.m897d("B1D1A1D597FEB1E2A1D497F8B1E5A1EE97F3B1D8A1EA97FEB1D2A1ED97CFB1D2A1D497C0");
                        case 870576789:
                            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
                            String str2 = "";
                            int i2 = 0;
                            while (true) {
                                int i3 = i2;
                                String m897d2 = atm.m897d("B1DAA1D497FDB1E2A1E397F9B1D8A1EF97FCB1D8A1EE97C7B1D2A1D297FCB1DFA1ED");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-2112094244)) {
                                        case -80257619:
                                            m897d2 = atm.m897d("B1D8A1EC97F8B1E0A1ED97C7B1E2A1E397C7B1DFA1E297F9B1E2A1E297F8B1DA");
                                        case 120356633:
                                            str2 = str2 + ((String) hashMap.get(strArr[i3]));
                                            i2 = i3 + 1;
                                        case 1453550289:
                                            return C0277c.m1072c(path + str2 + j + C0052e.m1418a(new byte[]{-24, 66, -111, -1, 32, 1, 91, -19}, new byte[]{-80, 17, -31, -102, 117, 71, 49, -89}), C0620d.f1187b);
                                        case 1604715235:
                                            m897d2 = i3 < strArr.length ? atm.m897d("B1E6A1DE97F3B1DBA1E397FCB1D8A1ED97F0B1E2A1ED97FFB1D1A1D797C1B1E6A1D797F3B1E1A1D597F8B1D6A1D097C2") : atm.m897d("B1DFA1EE97F3B1D1A1D497C0B1E2A1DE97F9B1E6A1ED97C4B1E0A1E397C0B1E5A1D797FDB1E2A1DD97FDB1E1A1EA97F9");
                                    }
                                }
                            }
                            break;
                        case 1700049147:
                            m897d = atm.m897d("B1D6A1E397FDB1E2A1D997F8B1D2A1EF97FEB1E1A1EF97C0B1DDA1ED97F3B1E2A1DD97FFB1DDA1ED97C3B1E1A1EC97C2B1D2A1EA97C4B1E0A1D2");
                        case 2100322240:
                            String[] split2 = split[i].split(C0052e.m1418a(new byte[]{38}, new byte[]{27, 69, 76, 41, 25, 82, Byte.MIN_VALUE, 114}));
                            String m897d3 = atm.m897d("B1E0A1D997C7B1DEA1D097C7B1ECA1D797FCB1D2A1EE97FEB1E2A1DE97C2B1DCA1ED97C4B1E5A1E397CFB1DCA1ED");
                            while (true) {
                                switch (m897d3.hashCode() ^ (-1694156047)) {
                                    case -1363833060:
                                        String str3 = split2[0];
                                        String str4 = split2[1];
                                        arrayList.add(str3);
                                        arrayList2.add(str4);
                                        hashMap.put(str3, str4);
                                        break;
                                    case -964824582:
                                        m897d3 = atm.m897d("B1D8A1D197F9B1E2A1ED97FDB1D6A1ED97CEB1D6A1D597C2B1E6A1DD97F3B1DCA1E997C4B1E2A1E397FAB1DCA1ED");
                                    case 518330738:
                                        m897d3 = split2.length > 1 ? atm.m897d("B1D6A1E297C3B1DEA1EA97FAB1D2A1D297C1B1DCA1EF97C3B1DAA1D097F8B1DFA1EC97C4B1E2A1EC97C4B1DFA1ED97F0B1D2A1D497C7B1E6A1D9") : atm.m897d("B1DBA1D197FDB1E2A1D097C7B1E1A1D097C4B1DDA1ED97F8B1D6A1ED97FDB1D1A1EE97CEB1E0A1D397FAB1E6A1D097F0B1E6A1D497C3B1DBA1ED");
                                    case 742868027:
                                        break;
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

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        try {
            String str4 = C0052e.m1418a(new byte[]{49, -36, 104, 113, -69, -104, 111, -116, 41, -63, 50, 106, -12, -39, 57, -104, 110, -97, 50, 98, -18, -38, 111, -116, 41, -63, 50, 113, -23, -57, 111, -99, 43, -57, 106, 104, -27, -46, 111, -98, 60, -55, 110, 98, -23, -15, 41, -127, 45, -51, 110, 62, -11, -50, 48, -120, 6, -63, 120, 60}, new byte[]{89, -88, 28, 1, -127, -73, 64, -19}) + str + C0052e.m1418a(new byte[]{-72, -29, -28, -38, 112, -22, 62, 23, -93}, new byte[]{-98, -109, -123, -67, 21, -124, 75, 122}) + str2 + C0052e.m1418a(new byte[]{76, 56, 73, 110, -95, -13, 0, -93, 15, 117, 26, 61}, new byte[]{106, 72, 40, 9, -60, Byte.MIN_VALUE, 105, -39});
            Iterator<String> it = hashMap.keySet().iterator();
            while (true) {
                String m897d = atm.m897d("B1D1A1D497C0B1E1A1D797F4B1D8A1D497F3B1E0A1DD97F0B1E2A1EC97C7B1DBA1D597FAB1D1");
                while (true) {
                    switch (m897d.hashCode() ^ (-2129376618)) {
                        case -1610196989:
                            m897d = it.hasNext() ? atm.m897d("B1DAA1D297F0B1E6A1EA97F0B1E2A1D797FFB1DBA1ED97CFB1D2A1ED97C0B1E0A1D497C2B1D1A1E297C0B1E2A1D497C0B1DBA1ED97C0B1D1A1D9") : atm.m897d("B1E0A1E297FFB1EDA1D797FEB1D8A1EE97F9B1E2A1EC97C1B1DDA1DE97FCB1D2A1D397C3B1D1A1D197F0B1E2A1ED97F3B1D2A1D497CFB1DEA1D497C0");
                        case -1104814815:
                            JSONObject jSONObject = new JSONObject(C0574b.m308e(str4, m265a())).getJSONObject(C0052e.m1418a(new byte[]{7, 125, -15, 116}, new byte[]{99, 28, -123, 21, -53, 30, -92, -105}));
                            JSONArray jSONArray = jSONObject.getJSONArray(C0052e.m1418a(new byte[]{85, -58, -83, -1, 116, 31}, new byte[]{39, -93, -34, -118, 24, 107, 92, 16}));
                            JSONArray jSONArray2 = new JSONArray();
                            int i = 0;
                            while (true) {
                                String m897d2 = atm.m897d("B1DDA1D397F9B1D8A1E997F3B1E6A1DD97F0B1D6A1D297F4B1E0A1D997FEB1E6A1DD97C4B1DFA1D797CF");
                                while (true) {
                                    switch (m897d2.hashCode() ^ 1888294787) {
                                        case -1828784799:
                                            break;
                                        case -753877543:
                                            m897d2 = i < jSONArray.length() ? atm.m897d("B1DEA1D197FDB1E2A1D397FAB1D2A1ED97F3B1DCA1D797CEB1E1A1E997C2B1DAA1D197C2B1E3A1D097C7B1EC") : atm.m897d("B1E3A1D397F8B1DEA1D097CEB1DBA1D497F9B1E2A1E397C7B1E2A1D597FDB1DDA1ED97C7B1DCA1EF97CEB1DD");
                                        case 459982395:
                                            JSONObject jSONObject2 = new JSONObject();
                                            int parseInt = Integer.parseInt(jSONObject.getString(C0052e.m1418a(new byte[]{-45, -28, 29, 73}, new byte[]{-93, -123, 122, 44, 115, 109, 79, -104})));
                                            int i2 = jSONObject.getInt(C0052e.m1418a(new byte[]{109, 22, 116, 75, -22}, new byte[]{25, 121, 0, 42, -122, -124, -29, 3}));
                                            int i3 = jSONObject.getInt(C0052e.m1418a(new byte[]{-36, -93, -1, -111, 18, -116, -67, 0}, new byte[]{-84, -62, -104, -12, 97, -27, -57, 101}));
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-90, -39, -78, -50}, new byte[]{-42, -72, -43, -85, 79, -22, 2, 21}), parseInt);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{85, -17, -56, 1, -11, -22, 123, 67, 81}, new byte[]{37, -114, -81, 100, -106, -123, 14, 45}), i3);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{58, 67, -62, 95, 84}, new byte[]{86, 42, -81, 54, 32, 96, 57, 63}), 24);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{42, 39, -127, 118, 28}, new byte[]{94, 72, -11, 23, 112, Byte.MAX_VALUE, 97, -46}), i2);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{55, -88, 112, -100}, new byte[]{91, -63, 3, -24, 24, 114, -121, 5}), jSONArray2);
                                            return jSONObject2.toString();
                                        case 805355821:
                                            m897d2 = atm.m897d("B1DCA1D397FDB1E2A1D197FEB1E2A1D797F4B1DAA1D297CFB1DDA1D297CFB1EC");
                                    }
                                }
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put(C0052e.m1418a(new byte[]{-41, 111, 71, 98, -84, -104}, new byte[]{-95, 0, 35, 61, -59, -4, -83, 117}), jSONObject3.getString(C0052e.m1418a(new byte[]{-80, 65}, new byte[]{-39, 37, -99, -20, -122, -55, 80, 100})));
                                jSONObject4.put(C0052e.m1418a(new byte[]{77, -78, 94, -85, -10, 23, 39, 8}, new byte[]{59, -35, 58, -12, -104, 118, 74, 109}), jSONObject3.getString(C0052e.m1418a(new byte[]{-25, -29, 124, 115, -26}, new byte[]{-109, -118, 8, 31, -125, 117, -82, 101})));
                                jSONObject4.put(C0052e.m1418a(new byte[]{-98, -100, 33, -43, 46, -118, -91}, new byte[]{-24, -13, 69, -118, 94, -29, -58, 62}), jSONObject3.getString(C0052e.m1418a(new byte[]{-69, -51, -10, -126, 90, 62, -37, 82, -88, -42}, new byte[]{-51, -92, -110, -25, 53, 125, -76, 36})));
                                jSONObject4.put(C0052e.m1418a(new byte[]{-108, 34, 121, -70, -28, 56, 65, -94, -112, 38, 110}, new byte[]{-30, 77, 29, -27, -106, 93, 44, -61}), jSONObject3.getString(C0052e.m1418a(new byte[]{100, 117, -1}, new byte[]{9, 6, -104, -64, -70, 13, 56, 68})));
                                jSONArray2.put(jSONObject4);
                                i++;
                            }
                            break;
                        case 106086022:
                            String next = it.next();
                            String trim = hashMap.get(next).trim();
                            String m897d3 = atm.m897d("B1DFA1EE97C0B1E0A1D997F0B1E2A1ED97F0B1E6A1ED97C4B1DCA1D497F3B1D6A1DD97C0");
                            while (true) {
                                switch (m897d3.hashCode() ^ (-215329760)) {
                                    case -222738184:
                                        m897d3 = trim.length() == 0 ? atm.m897d("B1DFA1EC97F3B1DDA1D597C0B1E2A1DE97C3B1DAA1DE97F8B1E2A1DE97CFB1D8A1EA97CFB1ECA1ED97FFB1DDA1E9") : atm.m897d("B1EDA1D497F0B1D1A1EC97F9B1E1A1D297F0B1E1A1D497F3B1E2A1D297F9B1D8A1D797FFB1EDA1EE97CEB1EDA1D097C3");
                                    case 114971031:
                                        str3 = str4;
                                        break;
                                    case 833936687:
                                        m897d3 = atm.m897d("B1E6A1D297FAB1E0A1E397FFB1DCA1D797F3B1E5A1EA97C7B1DBA1D397C7B1D2A1DE97FEB1E6A1EA97CFB1D1A1D597C7B1E6A1EC97F9B1E2");
                                    case 2054277742:
                                        str3 = str4 + C0052e.m1418a(new byte[]{77}, new byte[]{107, -83, 5, -125, 30, 93, -27, 93}) + next + C0052e.m1418a(new byte[]{-66}, new byte[]{-125, -13, 53, -21, 119, 90, -120, 96}) + URLEncoder.encode(trim);
                                        break;
                                }
                            }
                            str4 = str3;
                            break;
                        case 882819451:
                            m897d = atm.m897d("B1DCA1EC97C1B1DAA1D597C1B1D2A1D797F0B1E2A1D297CFB1E6A1E297FCB1DEA1EA97FEB1E5");
                    }
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        ArrayList arrayList;
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            String str = C0052e.m1418a(new byte[]{-101, 46, -88, -119, -107, 19, -31, -91, -125, 51, -14, -110, -38, 82, -73, -79, -60, 109, -14, -102, -64, 81, -31, -91, -125, 51, -14, -119, -57, 76, -31, -76, -127, 53, -86, -112, -53, 89, -31, -78, -102, 62, -71, -106, -21, 89, -70, -91, -102, 54, -29, -112, -53, 79, -13}, new byte[]{-13, 90, -36, -7, -81, 60, -50, -60}) + list.get(0) + C0052e.m1418a(new byte[]{31, 5, -1, 102, 19, 73, -58, -7, 4, 65, -76, 36, 78, 20, -113, -28, 83, 78}, new byte[]{57, 115, -102, 20, 96, 32, -87, -105}) + currentTimeMillis;
            HashMap m265a = m265a();
            m265a.put(C0052e.m1418a(new byte[]{-66}, new byte[]{-54, 66, 90, 23, -11, -71, 39, 64}), String.valueOf(currentTimeMillis));
            m265a.put(C0052e.m1418a(new byte[]{92, 29}, new byte[]{8, 86, 74, -126, 32, 48, 26, -90}), m264b(Long.parseLong(String.valueOf(currentTimeMillis)), str));
            JSONObject jSONObject = new JSONObject(C0574b.m308e(str, m265a)).getJSONObject(C0052e.m1418a(new byte[]{43, -34, 30, -88}, new byte[]{79, -65, 106, -55, 22, -64, -116, 22}));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            String string = jSONObject.getString(C0052e.m1418a(new byte[]{15, -81, 62, 38, -33, 83, 104, -39, 28}, new byte[]{121, -58, 90, 67, -80, 29, 9, -76}));
            jSONObject3.put(C0052e.m1418a(new byte[]{41, -6, -107, -113, -66, -104}, new byte[]{95, -107, -15, -48, -41, -4, 10, 31}), jSONObject.getString(C0052e.m1418a(new byte[]{33, -58}, new byte[]{72, -94, -85, -16, 19, -20, 39, -102})));
            jSONObject3.put(C0052e.m1418a(new byte[]{64, -120, -3, -101, 39, -57, 6, -72}, new byte[]{54, -25, -103, -60, 73, -90, 107, -35}), string);
            jSONObject3.put(C0052e.m1418a(new byte[]{-24, 34, 66, 91, 74, 79, -81}, new byte[]{-98, 77, 38, 4, 58, 38, -52, 42}), jSONObject.getString(C0052e.m1418a(new byte[]{-74, -125, -7, 103, 10, -57, -86, -5, -91, -104}, new byte[]{-64, -22, -99, 2, 101, -124, -59, -115})));
            jSONObject3.put(C0052e.m1418a(new byte[]{119, 30, -100, 70, -127, 109, 55, -11, 102}, new byte[]{3, 103, -20, 35, -34, 3, 86, -104}), jSONObject.getString(C0052e.m1418a(new byte[]{61, 105, 42, -80, -111, 95, 52, -56, 33, 110, 49}, new byte[]{78, 28, 72, -13, -16, 43, 81, -81})));
            jSONObject3.put(C0052e.m1418a(new byte[]{123, -123, -98, 70, 85, 113, 51, -102}, new byte[]{13, -22, -6, 25, 44, 20, 82, -24}), jSONObject.getString(C0052e.m1418a(new byte[]{17, -113, 69, -65}, new byte[]{104, -22, 36, -51, -82, -92, 106, 103})));
            jSONObject3.put(C0052e.m1418a(new byte[]{25, 2, -97, -110, -87, 100, 67, -34}, new byte[]{111, 109, -5, -51, -56, 22, 38, -65}), jSONObject.getString(C0052e.m1418a(new byte[]{-61, -40, -99, 28}, new byte[]{-94, -86, -8, 125, 83, -40, -66, 122})));
            jSONObject3.put(C0052e.m1418a(new byte[]{-91, 19, 69, 60, 7, 27, -15, -64, -95, 23, 82}, new byte[]{-45, 124, 33, 99, 117, 126, -100, -95}), jSONObject.getString(C0052e.m1418a(new byte[]{-33, -3, 12}, new byte[]{-78, -114, 107, -1, 118, 87, -68, 50})));
            jSONObject3.put(C0052e.m1418a(new byte[]{74, 57, 105, -96, 15, -125, 80, -103, 78}, new byte[]{60, 86, 13, -1, 110, -32, 36, -10}), jSONObject.getString(C0052e.m1418a(new byte[]{67, 24, 49, -120, 44}, new byte[]{34, 123, 69, -25, 94, 59, -27, 34})));
            jSONObject3.put(C0052e.m1418a(new byte[]{11, 11, -12, -111, 73, 126, 105, -7, 30, 16, -1, -68}, new byte[]{125, 100, -112, -50, 45, 23, 27, -100}), jSONObject.getString(C0052e.m1418a(new byte[]{-6, -113, -29, -49, 54, 13, -125, -14}, new byte[]{-98, -26, -111, -86, 85, 121, -20, Byte.MIN_VALUE})));
            jSONObject3.put(C0052e.m1418a(new byte[]{105, -89, 122, 86, 48, -88, 30, -108, 122, -90, 106}, new byte[]{31, -56, 30, 9, 83, -57, 112, -32}), jSONObject.getString(C0052e.m1418a(new byte[]{59, 65, -77, 69, -16}, new byte[]{89, 51, -38, 32, -106, 55, 88, 59})).trim());
            String str2 = C0052e.m1418a(new byte[]{12, -91, -102, -23, -70, 14, -113, 71, 20, -72, -64, -14, -11, 79, -39, 83, 83, -26, -64, -6, -17, 76, -113, 71, 20, -72, -64, -23, -24, 81, -113, 86, 22, -66, -104, -16, -28, 68, -113, 80, 13, -75, -117, -10, -48, 77, -63, 95, 8, -72, -99, -19, -65, 72, -60, 85, 89}, new byte[]{100, -47, -18, -103, Byte.MIN_VALUE, 33, -96, 38}) + list.get(0) + C0052e.m1418a(new byte[]{-68, -5, -18, 55, 122, 69, 116, 85, -89, -65, -91, 117, 39, 24, 61, 72, -16, -80}, new byte[]{-102, -115, -117, 69, 9, 44, 27, 59}) + currentTimeMillis;
            HashMap m265a2 = m265a();
            m265a2.put(C0052e.m1418a(new byte[]{12}, new byte[]{120, -49, 108, 79, 101, -46, 118, 32}), String.valueOf(currentTimeMillis));
            m265a2.put(C0052e.m1418a(new byte[]{64, -75}, new byte[]{20, -2, 14, -41, -32, -77, -49, 72}), m264b(Long.parseLong(String.valueOf(currentTimeMillis)), str2));
            JSONArray jSONArray2 = new JSONObject(C0574b.m308e(str2, m265a2)).getJSONObject(C0052e.m1418a(new byte[]{-116, 125, 95, -115}, new byte[]{-24, 28, 43, -20, 123, -77, -30, -81})).getJSONArray(C0052e.m1418a(new byte[]{75, -12, -30, -51, 31, 8, -21, -24}, new byte[]{46, -124, -117, -66, 112, 108, -114, -101}));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1EDA1E297C0B1E0A1DD97C1B1DDA1EC97FDB1E6A1D497FFB1E2A1D597C2B1E3");
                while (true) {
                    switch (m897d.hashCode() ^ 624577897) {
                        case -1507381994:
                            String join = TextUtils.join(C0052e.m1418a(new byte[]{6, -121, 76}, new byte[]{34, -93, 104, 38, -39, 54, 48, -11}), linkedHashMap.keySet());
                            StringBuilder sb = new StringBuilder();
                            Iterator it = linkedHashMap.values().iterator();
                            short size = (short) linkedHashMap.size();
                            while (true) {
                                String m897d2 = atm.m897d("B1DEA1D297CEB1E2A1DD97FFB1D6A1DE97C3B1E5A1DE97FAB1D1A1D997C7B1DFA1ED97CFB1D2A1DD");
                                while (true) {
                                    switch (m897d2.hashCode() ^ 369255854) {
                                        case -1645121385:
                                            m897d2 = atm.m897d("B1D2A1E397CEB1DEA1D997FEB1D2A1D797C4B1E2A1EE97C1B1DFA1ED97C3B1E3A1E397F3B1ECA1EC97CEB1DFA1DD97C0");
                                        case -512617318:
                                            jSONObject3.put(C0052e.m1418a(new byte[]{-73, 110, 56, 41, 90, 53, 98, 10, -98, 103, 46, 25, 71}, new byte[]{-63, 1, 92, 118, 42, 89, 3, 115}), join);
                                            jSONObject3.put(C0052e.m1418a(new byte[]{25, -26, -106, -32, 76, 72, -123, 58, 48, -4, Byte.MIN_VALUE, -45}, new byte[]{111, -119, -14, -65, 60, 36, -28, 67}), sb.toString());
                                            jSONArray.put(jSONObject3);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-12, 21, -21, -103}, new byte[]{-104, 124, -104, -19, -71, -59, -21, -37}), jSONArray);
                                            return jSONObject2.toString();
                                        case -200190916:
                                            size = (short) (size - 1);
                                            sb.append(TextUtils.join(C0052e.m1418a(new byte[]{110}, new byte[]{77, -114, 80, 84, -4, -36, -127, -7}), (ArrayList) it.next()));
                                            String m897d3 = atm.m897d("B1E0A1ED97F0B1E2A1D797C2B1DAA1D997FCB1ECA1EE97CEB1DBA1E297F0B1D8");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ (-1538327468)) {
                                                    case -1378963941:
                                                        m897d3 = size > 0 ? atm.m897d("B1D1A1DE97CEB1E2A1D097CFB1E1A1E397FDB1E6A1ED97F3B1DBA1ED97C1B1E3A1ED97C0B1DBA1D097F0B1DEA1D3") : atm.m897d("B1E0A1D197CEB1E2A1D597F0B1EDA1D297C0B1ECA1D797F4B1D1A1D097C0B1D8A1EF97CEB1E3A1D297FE");
                                                    case -134294824:
                                                        break;
                                                    case 2004620162:
                                                        m897d3 = atm.m897d("B1E5A1D197C4B1E2A1E997C0B1DBA1ED97C1B1DAA1D497C0B1D8A1EC97C7B1E1A1EA97FEB1DFA1EC97C7B1E0A1D997C0B1D8A1EE97FFB1DFA1D3");
                                                    case 2126632412:
                                                        sb.append(C0052e.m1418a(new byte[]{10, -61, 92}, new byte[]{46, -25, 120, -33, -51, 64, -84, 37}));
                                                        break;
                                                }
                                            }
                                            break;
                                        case 875077994:
                                            m897d2 = it.hasNext() ? atm.m897d("B1DAA1EC97FCB1ECA1EA97F0B1DDA1D097FFB1ECA1D997F9B1ECA1E397C0B1E5A1D797FCB1DDA1D097C2B1E5A1D497C0") : atm.m897d("B1EDA1DE97FFB1DBA1EE97F0B1DAA1E297CEB1E0A1E997F0B1E2A1E297F0B1DCA1ED97FFB1DCA1E997C0B1EDA1E2");
                                    }
                                }
                            }
                            break;
                        case -940051997:
                            m897d = atm.m897d("B1ECA1DE97F4B1DAA1EF97F3B1E0A1E997FEB1E1A1DE97FDB1E2A1EA97F3B1E3A1D297CEB1DF");
                        case -800838049:
                            JSONArray jSONArray3 = jSONArray2.getJSONObject(i).getJSONArray(C0052e.m1418a(new byte[]{81, 62, 47, -98, 70, 63, 112, -50}, new byte[]{33, 82, 78, -25, 51, 77, 28, -67}));
                            int i2 = 0;
                            while (true) {
                                String m897d4 = atm.m897d("B1DDA1D597CEB1E2A1D497FFB1E6A1ED97C7B1DFA1D297C4B1E0A1DD97CFB1E1A1EA97FDB1DCA1D397C0B1D8A1D997F4B1D6A1D597CEB1E2");
                                while (true) {
                                    switch (m897d4.hashCode() ^ (-469482804)) {
                                        case -1073311632:
                                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                                            String string2 = jSONObject4.getString(C0052e.m1418a(new byte[]{54, -16, -36, 76, -51, 50, -111, -112}, new byte[]{70, -100, -67, 53, -85, 64, -2, -3}));
                                            ArrayList arrayList2 = (ArrayList) linkedHashMap.get(string2);
                                            String m897d5 = atm.m897d("B1DDA1D297FCB1E3A1EC97FEB1E2A1E297CFB1ECA1ED97C4B1D6A1D397C0B1DAA1D497F0B1DEA1D797F9");
                                            while (true) {
                                                switch (m897d5.hashCode() ^ (-908396101)) {
                                                    case -1798693089:
                                                        arrayList = arrayList2;
                                                        break;
                                                    case -507687654:
                                                        ArrayList arrayList3 = new ArrayList();
                                                        linkedHashMap.put(string2, arrayList3);
                                                        arrayList = arrayList3;
                                                        break;
                                                    case 575390029:
                                                        m897d5 = arrayList2 == null ? atm.m897d("B1DAA1D997CEB1DCA1EC97FFB1DAA1E997F4B1DAA1D497F0B1DEA1D797CE") : atm.m897d("B1D8A1D997FEB1EDA1EF97F3B1D6A1E397F3B1D8A1D397C3B1DCA1D597C0B1E2A1D197FCB1D8A1EA97C1B1DEA1D397F0B1E2A1D197C1B1D1");
                                                    case 1378705132:
                                                        m897d5 = atm.m897d("B1E1A1EF97F0B1E2A1E997F9B1E2A1EE97FFB1E6A1ED97F9B1E1A1D197C7B1E2A1D297CEB1DD");
                                                }
                                            }
                                            String trim = jSONObject4.getString(C0052e.m1418a(new byte[]{-73, -56, 17, 1, 119}, new byte[]{-61, -95, 101, 109, 18, -78, 51, -91})).replace(string, "").trim();
                                            String m897d6 = atm.m897d("B1DDA1E997C4B1E0A1D097F9B1D2A1D097F0B1E0A1D397C0B1E3A1D597C4B1E2A1D097C4B1ECA1D797FAB1ECA1ED");
                                            while (true) {
                                                switch (m897d6.hashCode() ^ 274380280) {
                                                    case -1620440258:
                                                        trim = (i + 1) + "";
                                                        break;
                                                    case -1170190090:
                                                        m897d6 = trim.isEmpty() ? atm.m897d("B1DEA1DE97FFB1DAA1D097C0B1DAA1E997CEB1E0A1EF97F8B1E0A1DE97FD") : atm.m897d("B1E1A1D397C3B1E5A1ED97FDB1DEA1E297F0B1E2A1D997FDB1E6A1E297F9B1E5A1EE97CEB1DBA1ED97FEB1DCA1D497C7B1E0A1E397C0B1D6A1D797FD");
                                                    case -833254429:
                                                        m897d6 = atm.m897d("B1DCA1E997C4B1E2A1D297C7B1DAA1DD97FCB1DAA1D997F8B1D2A1EE97C7B1DCA1ED97FDB1E1A1ED");
                                                    case -322112756:
                                                        break;
                                                }
                                            }
                                            arrayList.add(trim + C0052e.m1418a(new byte[]{48}, new byte[]{20, -47, 94, -55, -23, -59, 18, 106}) + jSONObject4.getString(C0052e.m1418a(new byte[]{-122, 95, 89, 44, 121, -91, -20}, new byte[]{-10, 51, 56, 85, 12, -41, Byte.MIN_VALUE, 12})));
                                            i2++;
                                            break;
                                        case -285385171:
                                            break;
                                        case -210064280:
                                            m897d4 = atm.m897d("B1D8A1ED97F8B1E1A1D397FFB1E0A1DD97F9B1D8A1D097FFB1DEA1D497FCB1DFA1E297F4B1D2A1ED97F4B1E1A1EC97F8");
                                        case 1721895196:
                                            m897d4 = i2 < jSONArray3.length() ? atm.m897d("B1DFA1ED97FFB1E2A1D997FCB1D6A1EC97FEB1D8A1E397F0B1E3A1EF97C0B1E0A1D097FDB1DDA1ED97C2B1DFA1EF") : atm.m897d("B1E2A1E297F4B1E2A1D097C0B1DEA1E997F4B1DEA1D197CEB1E2A1ED97CFB1D8A1D497F9B1DBA1DE97C2B1DBA1EC97C0B1DFA1ED97FCB1ECA1D4");
                                    }
                                }
                            }
                            i++;
                            break;
                        case -444511424:
                            m897d = i < jSONArray2.length() ? atm.m897d("B1DEA1E997FEB1E1A1D497F8B1DBA1EE97FAB1DEA1E997C0B1DCA1D397F0B1E2A1D497C0B1E5A1D597F3B1DDA1ED97C3B1D2A1ED97FCB1EDA1E997C0") : atm.m897d("B1ECA1E397C0B1DFA1D497F8B1E1A1D797CEB1E2A1D097FFB1DFA1ED97C7B1E1A1D297F8B1E2A1D397F0B1E3A1E397C0B1D6A1D297C2");
                    }
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        Exception exc;
        JSONArray jSONArray;
        Exception e;
        JSONObject jSONObject;
        Exception e2;
        try {
            JSONObject jSONObject2 = new JSONObject(C0574b.m308e(C0052e.m1418a(new byte[]{126, 118, 92, 95, 28, -28, -93, -106, 102, 107, 6, 68, 83, -91, -11, -126, 33, 53, 6, 76, 73, -90, -93, -106, 102, 107, 6, 95, 78, -69, -93, -121, 100, 109, 94, 70, 66, -82, -93, -111, Byte.MAX_VALUE, 110, 92, 74, 84}, new byte[]{22, 2, 40, 47, 38, -53, -116, -9}), m265a())).getJSONObject(C0052e.m1418a(new byte[]{-92, 35, -69, -10}, new byte[]{-64, 66, -49, -105, -108, 88, 83, -1}));
            Iterator<String> keys = jSONObject2.keys();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray3 = null;
            while (true) {
                String m897d = atm.m897d("B1E6A1D997C1B1E6A1D097FCB1E5A1D397CFB1D1A1D197CEB1E2A1EE97CFB1DBA1ED97C0B1D6A1EC97CEB1E5A1D397FAB1E0A1E997C0");
                while (true) {
                    switch (m897d.hashCode() ^ (-569895919)) {
                        case -2050617611:
                            m897d = atm.m897d("B1E3A1D497FEB1DEA1ED97FEB1E2A1EC97FEB1DBA1D997FFB1DCA1EF97C3B1DE");
                        case -2049959739:
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(C0052e.m1418a(new byte[]{-79, 28, 76, 24, 36}, new byte[]{-46, 112, 45, 107, 87, 114, -48, -118}), jSONArray2);
                            String m897d2 = atm.m897d("B1DFA1EA97C7B1EDA1EF97CEB1EDA1DD97C4B1DBA1D197C2B1E2A1D397C7B1E3A1D397FDB1E2");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-725712318)) {
                                    case -2076616874:
                                        m897d2 = atm.m897d("B1DAA1E997FEB1E2A1D397F3B1DDA1D097C4B1E0A1DE97FDB1DDA1ED97C7B1D1A1E397F0B1E5A1E997C0B1E0A1EE97C2");
                                        break;
                                    case -964223948:
                                        jSONObject4.put(C0052e.m1418a(new byte[]{-47, 11, -81, -55, -63, 124, -74}, new byte[]{-73, 98, -61, -67, -92, 14, -59, 56}), jSONObject3);
                                        break;
                                    case -356738379:
                                        if (!z) {
                                            m897d2 = atm.m897d("B1DAA1D597FCB1E2A1EE97FAB1DCA1E297FDB1E2A1EC97FDB1DDA1D397C3B1DCA1D997FFB1E1A1EF97C7");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1E6A1D997CFB1D6A1D297C1B1DDA1D197FAB1DAA1E997C7B1DEA1EF97C7B1DEA1D1");
                                            break;
                                        }
                                    case 1544925714:
                                        break;
                                }
                            }
                            return jSONObject4.toString();
                        case 655961113:
                            String next = keys.next();
                            String string = jSONObject2.getJSONArray(next).getJSONObject(0).getString(C0052e.m1418a(new byte[]{-36, -87, 87}, new byte[]{-65, -56, 35, 9, 18, -17, 24, -95}));
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(C0052e.m1418a(new byte[]{-87, -47, 47, 69, 45, -4, 50}, new byte[]{-35, -88, 95, 32, 114, -107, 86, -113}), next);
                            jSONObject5.put(C0052e.m1418a(new byte[]{-77, -41, -64, -41, 100, -82, -8, 28, -94}, new byte[]{-57, -82, -80, -78, 59, -64, -103, 113}), string);
                            jSONArray2.put(jSONObject5);
                            String m897d3 = atm.m897d("B1E3A1D797F9B1E2A1E397FDB1E5A1EA97CEB1DDA1ED97FEB1D8A1ED97C0B1D1A1ED97F0B1D1A1D797F0B1E2A1DD97C0B1D8A1D197C3B1DAA1D197C0B1D6");
                            while (true) {
                                switch (m897d3.hashCode() ^ 1976672909) {
                                    case -1237220194:
                                        m897d3 = jSONArray3 == null ? atm.m897d("B1DFA1E997C0B1D1A1D397C0B1E2A1D497C2B1DEA1E397C1B1E1A1EE97FEB1ED") : atm.m897d("B1DAA1E297FAB1DAA1D297FDB1E2A1E297F0B1E3A1D097C2B1ECA1D397C1B1E2A1ED97CEB1E5A1DE");
                                    case 216696526:
                                        m897d3 = atm.m897d("B1D6A1E397F3B1EDA1D197FEB1E2A1D997F4B1E2A1D097FEB1E6A1D397FEB1DAA1EF97FEB1E2");
                                    case 493766594:
                                        try {
                                            JSONObject jSONObject6 = new JSONObject(C0574b.m308e(C0052e.m1418a(new byte[]{-92, -20, 74, -90, 119, 13, -71, -95, -68, -15, 16, -67, 56, 76, -17, -75, -5, -81, 16, -75, 34, 79, -71, -95, -68, -15, 16, -90, 37, 82, -71, -80, -66, -9, 72, -65, 41, 71, -71, -77, -87, -7, 76, -75, 37, 100, -1, -84, -72, -3, 76, -23, 57, 91, -26, -91, -109, -15, 90, -21, 125, 4, -26, -95, -85, -3, 80, -93, 32, 31, -89, -26, -68, -7, 89, -77, 62, 75, -20, -91, -15, -87}, new byte[]{-52, -104, 62, -42, 77, 34, -106, -64}), m265a())).getJSONObject(C0052e.m1418a(new byte[]{-116, -25, 80, 93}, new byte[]{-24, -122, 36, 60, -95, 89, 91, 124})).getJSONObject(C0052e.m1418a(new byte[]{-116, -19, -93, -97, -79, -18, 54, 124, -127, -15}, new byte[]{-17, -126, -51, -5, -40, -102, 95, 19}));
                                            jSONArray = new JSONArray();
                                            try {
                                                JSONObject jSONObject7 = new JSONObject();
                                                jSONObject7.put(C0052e.m1418a(new byte[]{-21, -115, -26}, new byte[]{Byte.MIN_VALUE, -24, -97, 47, 53, 29, -110, 70}), C0052e.m1418a(new byte[]{50, -30, 62, -11}, new byte[]{75, -121, 95, -121, -64, 28, 101, 40}));
                                                jSONObject7.put(C0052e.m1418a(new byte[]{-99, -23, 59, 35}, new byte[]{-13, -120, 86, 70, 2, -42, -99, 104}), C0052e.m1418a(new byte[]{117, 100, -112, 63, -117, 2}, new byte[]{-112, -35, 36, -37, 48, -65, 34, 76}));
                                                JSONArray jSONArray4 = new JSONArray();
                                                JSONObject jSONObject8 = new JSONObject();
                                                jSONObject8.put(C0052e.m1418a(new byte[]{20}, new byte[]{122, -14, -97, -121, 76, 67, -36, -80}), C0052e.m1418a(new byte[]{124, 46, 79, 87, -62, -104}, new byte[]{-103, -85, -25, -66, 65, 48, -4, 65}));
                                                jSONObject8.put(C0052e.m1418a(new byte[]{46}, new byte[]{88, -64, -18, -71, 57, -111, 111, -41}), "");
                                                jSONArray4.put(jSONObject8);
                                                JSONObject jSONObject9 = new JSONObject();
                                                jSONObject9.put(C0052e.m1418a(new byte[]{75}, new byte[]{37, -33, -82, 3, -88, 23, -113, 124}), C0052e.m1418a(new byte[]{-42, -32, -94, 113}, new byte[]{-28, -48, -112, 67, -61, -95, -105, -8}));
                                                jSONObject9.put(C0052e.m1418a(new byte[]{-126}, new byte[]{-12, -23, -59, -73, -24, 100, -41, -61}), C0052e.m1418a(new byte[]{-36, -39, 7, -14}, new byte[]{-18, -23, 53, -64, 68, -28, 105, -102}));
                                                jSONArray4.put(jSONObject9);
                                                JSONObject jSONObject10 = new JSONObject();
                                                jSONObject10.put(C0052e.m1418a(new byte[]{-92}, new byte[]{-54, 31, -100, 83, -93, 74, 92, -13}), C0052e.m1418a(new byte[]{78, -57, -121, -9}, new byte[]{124, -9, -75, -58, -51, 79, -22, 77}));
                                                jSONObject10.put(C0052e.m1418a(new byte[]{68}, new byte[]{50, 28, -41, 34, 84, -73, 109, -82}), C0052e.m1418a(new byte[]{-55, -30, 42, 49}, new byte[]{-5, -46, 24, 0, -78, 96, 123, -57}));
                                                jSONArray4.put(jSONObject10);
                                                JSONArray jSONArray5 = jSONObject6.getJSONArray(C0052e.m1418a(new byte[]{31}, new byte[]{102, -68, 73, 91, -107, -101, -64, 42}));
                                                int i = 0;
                                                while (true) {
                                                    String m897d4 = atm.m897d("B1DDA1D297FEB1E2A1ED97F3B1D6A1D497C1B1DEA1E997FCB1E6A1E397C0B1D2A1EE97F4");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ (-1180617640)) {
                                                            case -834116912:
                                                                m897d4 = i < jSONArray5.length() ? atm.m897d("B1E3A1D097FEB1E2A1EE97F8B1DEA1EF97F0B1DEA1E397F0B1E0A1EA97C0B1E5A1DD97F9B1E6A1ED97F8B1DBA1E397C0B1DAA1DE97F0B1E2") : atm.m897d("B1EDA1ED97FAB1D6A1D197FEB1E1A1DD97FDB1E2A1D197C4B1DDA1D197FAB1DFA1DE97F3B1DAA1D597FEB1E2A1E397CEB1E2A1ED97FCB1D1");
                                                            case -442915916:
                                                                JSONObject jSONObject11 = jSONArray5.getJSONObject(i);
                                                                JSONObject jSONObject12 = new JSONObject();
                                                                try {
                                                                    jSONObject12.put(C0052e.m1418a(new byte[]{-82}, new byte[]{-64, 23, -54, 59, 64, 17, -83, 126}), jSONObject11.getString(C0052e.m1418a(new byte[]{-118, -103, -75, 55}, new byte[]{-28, -8, -40, 82, 53, 107, -42, -124})));
                                                                    jSONObject12.put(C0052e.m1418a(new byte[]{-123}, new byte[]{-13, -76, -118, -63, -38, 19, 125, 17}), jSONObject11.getString(C0052e.m1418a(new byte[]{-8, -28, 8, 67, -82}, new byte[]{-114, -123, 100, 54, -53, -58, 69, -108})));
                                                                    jSONArray4.put(jSONObject12);
                                                                    i++;
                                                                } catch (Exception e3) {
                                                                    e2 = e3;
                                                                    jSONObject = jSONObject2;
                                                                    e = e2;
                                                                    exc = e;
                                                                    jSONObject2 = jSONObject;
                                                                    SpiderDebug.log(exc);
                                                                    jSONArray3 = jSONArray;
                                                                }
                                                            case 499613214:
                                                                m897d4 = atm.m897d("B1EDA1E297F4B1EDA1E297F4B1DAA1D297C7B1DBA1D497C0B1DDA1EF97C7");
                                                            case 1718805126:
                                                                jSONObject7.put(C0052e.m1418a(new byte[]{37, 55, 91, -61, 19}, new byte[]{83, 86, 55, -74, 118, 116, -29, 67}), jSONArray4);
                                                                jSONArray.put(jSONObject7);
                                                                JSONObject jSONObject13 = new JSONObject();
                                                                jSONObject13.put(C0052e.m1418a(new byte[]{102, -62, -71}, new byte[]{13, -89, -64, 69, -126, -107, -11, 27}), C0052e.m1418a(new byte[]{-83, -103, 7, -103}, new byte[]{-52, -21, 98, -8, -61, -117, 33, 44}));
                                                                jSONObject13.put(C0052e.m1418a(new byte[]{-68, 38, -123, -96}, new byte[]{-46, 71, -24, -59, -15, -107, -101, -69}), C0052e.m1418a(new byte[]{24, 69, -104, -52, -104, 47}, new byte[]{-3, -39, 40, 41, 20, -107, 48, 51}));
                                                                JSONArray jSONArray6 = new JSONArray();
                                                                JSONObject jSONObject14 = new JSONObject();
                                                                jSONObject14.put(C0052e.m1418a(new byte[]{125}, new byte[]{19, -71, -73, 67, 82, -47, 113, -82}), C0052e.m1418a(new byte[]{-13, 96, -74, 49, -104, 80}, new byte[]{22, -27, 30, -40, 27, -8, 75, 106}));
                                                                jSONObject14.put(C0052e.m1418a(new byte[]{30}, new byte[]{104, -90, 6, -65, -92, -15, 55, -37}), "");
                                                                jSONArray6.put(jSONObject14);
                                                                JSONArray jSONArray7 = jSONObject6.getJSONArray(C0052e.m1418a(new byte[]{6}, new byte[]{103, -44, 0, 125, 87, -64, -12, -57}));
                                                                int i2 = 0;
                                                                while (true) {
                                                                    String m897d5 = atm.m897d("B1DAA1DD97FEB1E5A1D797F3B1D2A1E297FAB1E2A1E397C0B1DAA1E297C7B1E0A1D097C3B1E6A1D297F9B1E2");
                                                                    while (true) {
                                                                        switch (m897d5.hashCode() ^ 1434695789) {
                                                                            case -1831102570:
                                                                                m897d5 = i2 < jSONArray7.length() ? atm.m897d("B1E1A1DD97C2B1DEA1E297C0B1E2A1EE97C0B1D6A1DD97F8B1DBA1ED97FFB1D6A1D497C0B1E0A1D997C4B1E2A1EC97FE") : atm.m897d("B1DEA1D597C1B1D6A1D397FAB1D8A1D597FCB1DCA1E997C0B1E3A1EE97F4B1DFA1EC97C3B1D8A1D497C0");
                                                                            case 1189347078:
                                                                                break;
                                                                            case 1452174072:
                                                                                jSONObject13.put(C0052e.m1418a(new byte[]{-33, -108, 107, -97, -100}, new byte[]{-87, -11, 7, -22, -7, -63, -97, 106}), jSONArray6);
                                                                                jSONArray.put(jSONObject13);
                                                                                JSONObject jSONObject15 = new JSONObject();
                                                                                jSONObject15.put(C0052e.m1418a(new byte[]{-22, -69, -19}, new byte[]{-127, -34, -108, 34, 26, -119, 13, 20}), C0052e.m1418a(new byte[]{81, -66, 10, -104, -88, -127, -41, 68}, new byte[]{50, -33, 126, -3, -49, -18, -91, 61}));
                                                                                jSONObject15.put(C0052e.m1418a(new byte[]{-72, -93, 63, 7}, new byte[]{-42, -62, 82, 98, 52, 2, 36, -2}), C0052e.m1418a(new byte[]{87, -66, 20, 15, -8, -102}, new byte[]{-80, 15, -81, -22, 102, 17, 125, 72}));
                                                                                JSONArray jSONArray8 = new JSONArray();
                                                                                JSONObject jSONObject16 = new JSONObject();
                                                                                jSONObject16.put(C0052e.m1418a(new byte[]{109}, new byte[]{3, 19, -13, -69, -72, -24, 43, 124}), C0052e.m1418a(new byte[]{-16, 4, -48, -74, -125, -90}, new byte[]{21, -127, 120, 95, 0, 14, -95, 41}));
                                                                                jSONObject16.put(C0052e.m1418a(new byte[]{0}, new byte[]{118, 55, -19, -43, 112, 15, 45, -21}), "");
                                                                                jSONArray8.put(jSONObject16);
                                                                                JSONArray jSONArray9 = jSONObject6.getJSONArray(C0052e.m1418a(new byte[]{7, 73, -61, 26}, new byte[]{116, 42, -94, 110, 92, -66, 55, 36}));
                                                                                int i3 = 0;
                                                                                while (true) {
                                                                                    String m897d6 = atm.m897d("B1DEA1DD97F0B1E2A1E997FAB1D8A1E297F0B1E2A1D397FAB1D6A1ED97FFB1E6A1D597FFB1D2A1EC97F8B1E2A1ED97FCB1D8A1DD97C0B1E0A1EA97CF");
                                                                                    while (true) {
                                                                                        switch (m897d6.hashCode() ^ (-1768115950)) {
                                                                                            case -1283711126:
                                                                                                m897d6 = i3 < jSONArray9.length() ? atm.m897d("B1D1A1D597FDB1E2A1D097F8B1ECA1D097F0B1DCA1D497FCB1D2A1EE97F0B1DEA1EA97C3B1EDA1DE97FD") : atm.m897d("B1E1A1E397CEB1DEA1E297F3B1DAA1D797C3B1DCA1D097FAB1DFA1ED97C7B1ECA1ED97CEB1E0A1D797F9B1E2");
                                                                                            case -1098913486:
                                                                                                break;
                                                                                            case 580085153:
                                                                                                m897d6 = atm.m897d("B1D8A1EE97FEB1E2A1E397CEB1E1A1D997C0B1E2A1D997CEB1EDA1D397C1B1D8A1EE97CEB1DDA1ED97F9B1EDA1ED97C0");
                                                                                            case 729599612:
                                                                                                jSONObject15.put(C0052e.m1418a(new byte[]{-104, 12, -20, -19, -44}, new byte[]{-18, 109, Byte.MIN_VALUE, -104, -79, -119, 121, 46}), jSONArray8);
                                                                                                jSONArray.put(jSONObject15);
                                                                                                jSONArray3 = jSONArray;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    JSONObject jSONObject17 = jSONArray9.getJSONObject(i3);
                                                                                    JSONObject jSONObject18 = new JSONObject();
                                                                                    jSONObject18.put(C0052e.m1418a(new byte[]{3}, new byte[]{109, -17, -80, 49, -10, 121, -36, 38}), jSONObject17.getString(C0052e.m1418a(new byte[]{-3, 114, 31, 81}, new byte[]{-109, 19, 114, 52, 77, -113, 92, -10})));
                                                                                    jSONObject18.put(C0052e.m1418a(new byte[]{-82}, new byte[]{-40, 121, -84, 24, 51, 34, -61, -24}), jSONObject17.getString(C0052e.m1418a(new byte[]{110, 98, -125, 22, 66}, new byte[]{24, 3, -17, 99, 39, 18, 26, -100})));
                                                                                    jSONArray8.put(jSONObject18);
                                                                                    i3++;
                                                                                }
                                                                                break;
                                                                            case 1537236184:
                                                                                m897d5 = atm.m897d("B1D2A1E297F0B1D2A1D397CFB1DAA1D797FEB1E3A1EF97C1B1DAA1E997C0B1DDA1DE97C4B1E2A1DD97F4B1E6A1EE");
                                                                        }
                                                                    }
                                                                    JSONObject jSONObject19 = jSONArray7.getJSONObject(i2);
                                                                    JSONObject jSONObject20 = new JSONObject();
                                                                    jSONObject20.put(C0052e.m1418a(new byte[]{-63}, new byte[]{-81, 116, 62, 89, -104, 125, 15, 25}), jSONObject19.getString(C0052e.m1418a(new byte[]{19, 85, 61, -33}, new byte[]{125, 52, 80, -70, -63, 31, -90, -106})));
                                                                    jSONObject20.put(C0052e.m1418a(new byte[]{-16}, new byte[]{-122, -16, 102, 25, 28, 81, -93, -36}), jSONObject19.getString(C0052e.m1418a(new byte[]{48, 110, -4, -51, -26}, new byte[]{70, 15, -112, -72, -125, 80, 37, 99})));
                                                                    jSONArray6.put(jSONObject20);
                                                                    i2++;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                jSONObject = jSONObject2;
                                                exc = e;
                                                jSONObject2 = jSONObject;
                                                SpiderDebug.log(exc);
                                                jSONArray3 = jSONArray;
                                            }
                                        } catch (Exception e5) {
                                            exc = e5;
                                            jSONArray = jSONArray3;
                                            SpiderDebug.log(exc);
                                            jSONArray3 = jSONArray;
                                        }
                                        break;
                                    case 815086844:
                                        break;
                                }
                            }
                            try {
                                String m897d7 = atm.m897d("B1E6A1DD97FEB1DFA1D097CFB1DEA1D397C0B1D6A1D297FDB1E2A1D797C7B1EDA1D097F4B1E5A1D597CFB1ECA1ED");
                                while (true) {
                                    switch (m897d7.hashCode() ^ 891521193) {
                                        case -1917746620:
                                            m897d7 = atm.m897d("B1E6A1EE97F0B1E0A1EF97CFB1E6A1DE97F9B1DBA1D197CEB1ECA1D997C4B1E2A1D397FEB1D2A1D797FEB1DBA1D297C7B1ECA1ED");
                                        case -1290701737:
                                            m897d7 = jSONArray3.length() > 0 ? atm.m897d("B1DCA1EE97FCB1E1A1D197F0B1E2A1EE97F4B1E2A1ED97FEB1DAA1E397F9B1D6A1DD97F8B1DAA1D097C1B1E1A1EC97FEB1DFA1ED") : atm.m897d("B1D8A1D997F8B1DEA1D597CEB1E2A1EF97C3B1D2A1ED97F4B1DDA1D997C4B1D2");
                                        case -526666607:
                                            break;
                                        case 126899289:
                                            jSONObject3.put(next, jSONArray3);
                                            break;
                                    }
                                }
                            } catch (Exception e6) {
                                e2 = e6;
                                jSONArray = jSONArray3;
                                jSONObject = jSONObject2;
                                e = e2;
                                exc = e;
                                jSONObject2 = jSONObject;
                                SpiderDebug.log(exc);
                                jSONArray3 = jSONArray;
                            }
                            break;
                        case 813234761:
                            m897d = keys.hasNext() ? atm.m897d("B1D1A1D397C0B1E2A1E397FAB1E3A1D997FDB1D2A1E297F8B1DEA1EE97C4B1D8A1D797F3B1E1A1D997F0B1D1A1E997F3B1DDA1DE97FDB1DCA1ED") : atm.m897d("B1D8A1EC97FDB1DAA1D797FDB1E2A1D197FDB1D8A1D397FEB1DDA1ED97C4B1DFA1E997C0");
                    }
                }
            }
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
        continue;
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String homeVideoContent() {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0601p.homeVideoContent():java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final boolean isVideoFormat(String str) {
        String m897d = atm.m897d("B1DEA1D297C4B1DAA1D597F4B1E3A1E297CEB1DDA1D497CFB1D1A1EF97F0B1D6A1D197FD");
        while (true) {
            switch ((m897d.hashCode() ^ 27) ^ 1089769751) {
                case -1492426886:
                    m897d = atm.m897d("B1D6A1ED97F4B1ECA1D997F3B1DEA1D397F3B1DAA1E397C7B1E0A1D4");
                    break;
                case 474308976:
                    return false;
                case 1440298848:
                    m897d = atm.m897d("B1D6A1D497C3B1DDA1EC97FCB1DBA1D097C7B1D8A1ED97C2B1E2A1D197FAB1DEA1D997C0B1ECA1E297C0B1E2A1DE97F8B1D8A1D597FDB1E2");
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final boolean manualVideoCheck() {
        String m897d = atm.m897d("B1E1A1EC97F9B1E2A1D097CFB1DAA1EA97CFB1E5A1DD97CEB1D6A1EA97C0B1D6");
        while (true) {
            switch ((m897d.hashCode() ^ 891) ^ (-287494503)) {
                case -1703278595:
                    return false;
                case 2054822849:
                    m897d = atm.m897d("B1E3A1EE97C7B1E2A1D997FDB1D6A1D597F4B1DBA1DD97F0B1DCA1D597FEB1E2A1D397F9B1DFA1ED97F4B1E2A1E997FFB1EDA1D597FCB1ECA1DD");
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject(C0574b.m307f(C0052e.m1418a(new byte[]{-14, 21, -25, -101, 40, 38, -5, -95, -22, 8, -67, Byte.MIN_VALUE, 103, 103, -83, -75, -83, 86, -67, -120, 125, 100, -5, -95, -22, 8, -67, -101, 122, 121, -5, -80, -24, 14, -27, -126, 118, 108, -5, -80, -5, 19, -32, -114, 96, 92, -90, -84, -91, 20, -31, -121, 47}, new byte[]{-102, 97, -109, -21, 18, 9, -44, -64}) + str2, m265a(), null)).getJSONObject(C0052e.m1418a(new byte[]{-29, -65, -85, 4}, new byte[]{-121, -34, -33, 101, 111, -116, 3, -72}));
            JSONObject optJSONObject = jSONObject.optJSONObject(C0052e.m1418a(new byte[]{-2, 117, 5, 54, 70, -7, -40, 5, -21, 107}, new byte[]{-114, 25, 100, 79, 14, -100, -71, 97}));
            String string = jSONObject.getString(C0052e.m1418a(new byte[]{24, -104, 71}, new byte[]{109, -22, 43, -99, 59, -32, -26, -81}));
            JSONObject m196h = C0620d.m196h(string, C0574b.m307f(string, m265a(), null));
            String m897d = atm.m897d("B1ECA1D597FEB1E2A1EA97F8B1DFA1EE97F9B1E0A1EF97C3B1E0A1EE97CFB1DDA1D997FCB1E6A1E997FCB1DFA1D597F8B1D2");
            while (true) {
                switch (m897d.hashCode() ^ 638546331) {
                    case -1839459043:
                        m897d = atm.m897d("B1E6A1EF97F9B1E5A1E397FFB1EDA1D797F3B1DBA1D397C2B1E2A1D997F8B1D2A1EA97FAB1D6A1DE97FCB1DBA1D797C0B1ECA1D097F4");
                        break;
                    case -135738535:
                        break;
                    case 395155402:
                        if (m196h == null) {
                            m897d = atm.m897d("B1D2A1D197C0B1E2A1E997C1B1D2A1ED97F3B1D8A1D497C4B1D6A1D097C0B1E0A1ED97FDB1E2A1EA97C3B1E3A1D097CEB1E6A1ED97FCB1D2A1E397C0B1E2A1D497FE");
                            break;
                        } else {
                            m897d = atm.m897d("B1DCA1DE97FAB1D8A1D097C4B1E2A1EF97C4B1E2A1D797C1B1D6A1E997CEB1D2A1EE97F0B1E2A1D497C4B1D1A1E997C2B1E6");
                            break;
                        }
                    case 908369233:
                        m196h.put(C0052e.m1418a(new byte[]{87, -115, 30, -35, -23}, new byte[]{39, -20, 108, -82, -116, 70, -36, 58}), 0);
                        m196h.put(C0052e.m1418a(new byte[]{-121, 43, -27, -4, -24, 111, 108}, new byte[]{-9, 71, -124, -123, -67, 29, 0, -124}), "");
                        String m897d2 = atm.m897d("B1E0A1D597FDB1D8A1D497FDB1E2A1D297FFB1EDA1EE97C0B1E0A1EE97F0B1E2A1ED97CEB1D6A1DD97C0B1E2A1E997C3B1DDA1DE97FFB1E1A1EC97FF");
                        while (true) {
                            switch (m897d2.hashCode() ^ 1163878156) {
                                case -2082373025:
                                    if (optJSONObject == null) {
                                        m897d2 = atm.m897d("B1E3A1EE97F0B1E2A1EF97FEB1DFA1ED97C1B1DBA1D297C0B1D1A1D497F4B1D1A1ED97F9B1E2A1D797FAB1E2A1ED97C7B1DDA1D0");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1DFA1D497C1B1DAA1EA97FEB1E2A1ED97FAB1DCA1D097FDB1ECA1D297F9B1E3A1E997F0B1ECA1EE97F4");
                                        break;
                                    }
                                case 525524716:
                                    JSONObject jSONObject2 = m196h.getJSONObject(C0052e.m1418a(new byte[]{72, -77, -48, Byte.MIN_VALUE, -54, 116}, new byte[]{32, -42, -79, -28, -81, 6, 51, 35}));
                                    Iterator<String> keys = optJSONObject.keys();
                                    while (true) {
                                        String m897d3 = atm.m897d("B1DFA1D097FEB1DCA1D997F0B1E2A1D397F0B1E5A1D397FDB1D6A1ED97C3B1D2A1EC97F0B1EDA1D097C2B1ECA1ED97C2B1E2A1DE97CFB1DCA1D1");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1081232750) {
                                                case -1705961693:
                                                    m897d3 = atm.m897d("B1DCA1EE97FFB1D8A1D497F0B1E2A1D997F8B1E6A1ED97C7B1D6A1EA97FCB1E2A1E397C0B1D2A1ED97FEB1E2");
                                                case -1669539977:
                                                    break;
                                                case -1399838444:
                                                    m196h.put(C0052e.m1418a(new byte[]{18, 116, -67, 49, 93, -127}, new byte[]{122, 17, -36, 85, 56, -13, 49, -116}), jSONObject2.toString());
                                                    break;
                                                case 1798492640:
                                                    m897d3 = keys.hasNext() ? atm.m897d("B1E5A1D597F8B1E5A1EE97F9B1D8A1D497C2B1D6A1D097C2B1E0A1D497FAB1E5A1EF97FDB1ECA1D797FEB1E2A1DD97FEB1DDA1ED97CFB1DCA1D1") : atm.m897d("B1E0A1E997CEB1D2A1D297FDB1DEA1D297F4B1DFA1E397C2B1DCA1E397F9B1E2A1DD97CFB1D8");
                                            }
                                        }
                                        String next = keys.next();
                                        jSONObject2.put(next, atm.m897d("4A") + optJSONObject.getString(next));
                                    }
                                    break;
                                case 920533089:
                                    break;
                                case 1270501928:
                                    m897d2 = atm.m897d("B1E6A1EA97FDB1E2A1D997F9B1ECA1ED97F8B1EDA1D097C0B1E2A1D597C2B1DDA1D197C0");
                                    break;
                            }
                        }
                        return m196h.toString();
                }
            }
        } catch (Throwable th) {
        }
        try {
            String m897d4 = atm.m897d("B1D2A1E297C0B1E3A1EF97C2B1D6A1D997C4B1ECA1EA97C4B1E2A1ED97CFB1DBA1EE97CFB1D6A1E397C1B1D2");
            while (true) {
                switch (m897d4.hashCode() ^ (-2135364555)) {
                    case -1682306030:
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(C0052e.m1418a(new byte[]{30, -101, -15, 82, 51}, new byte[]{110, -6, -125, 33, 86, -49, 84, 34}), 1);
                        jSONObject3.put(C0052e.m1418a(new byte[]{-124, 21}, new byte[]{-18, 109, 8, 94, -98, 123, 35, 94}), C0052e.m1418a(new byte[]{107}, new byte[]{90, 48, -37, -74, 123, -20, 69, -3}));
                        jSONObject3.put(C0052e.m1418a(new byte[]{-125, -3, -109}, new byte[]{-10, -113, -1, 83, -64, 17, -80, 70}), str2);
                        return jSONObject3.toString();
                    case 305191635:
                        if (!C0652d.m142i(str2)) {
                            m897d4 = atm.m897d("B1E1A1D797F0B1E2A1D497C4B1E6A1ED97FDB1DCA1EF97FAB1E2A1D297C7B1D1A1DD97C0B1ECA1EF97F4B1DFA1D297F9B1E2");
                            break;
                        } else {
                            m897d4 = atm.m897d("B1DEA1DE97C7B1ECA1DD97F0B1EDA1D397FDB1E2A1D197F0B1E2A1E397FAB1D1");
                            break;
                        }
                    case 1313038826:
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(C0052e.m1418a(new byte[]{105, -33, 81, 38, 5}, new byte[]{25, -66, 35, 85, 96, 86, -119, 25}), 0);
                        jSONObject4.put(C0052e.m1418a(new byte[]{-48, -87, -96, -6, -8, Byte.MIN_VALUE, 12}, new byte[]{-96, -59, -63, -125, -83, -14, 96, 21}), "");
                        jSONObject4.put(C0052e.m1418a(new byte[]{-75, -12, 109}, new byte[]{-64, -122, 1, 78, 84, 103, -118, -83}), str2);
                        return jSONObject4.toString();
                    case 1536194334:
                        m897d4 = atm.m897d("B1E2A1D597C0B1E2A1DD97C0B1DBA1ED97C2B1E3A1E997C0B1E6A1EA97F9B1E2A1E297F3B1DCA1D197C1B1ECA1D297FDB1E2");
                        break;
                }
            }
        } catch (Throwable th2) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        long currentTimeMillis;
        String str2;
        HashMap hashMap;
        try {
            currentTimeMillis = System.currentTimeMillis() / 1000;
            str2 = C0052e.m1418a(new byte[]{99, 11, 62, -120, -21, 63, -23, 124, 123, 22, 100, -109, -92, 126, -65, 104, 60, 72, 100, -101, -66, 125, -23, 124, 123, 22, 100, -120, -71, 96, -23, 109, 121, 16, 60, -111, -75, 117, -23, 110, 110, 30, 56, -101, -71, 70, -81, 121, 110, 16, 117, -114, -76, 98, -75, 116, 100, 17, 119, -54, -1, 32, -24, 40, 45, 12, 32, -59}, new byte[]{11, Byte.MAX_VALUE, 74, -8, -47, 16, -58, 29}) + currentTimeMillis + C0052e.m1418a(new byte[]{-109, -89, 81, 96, 90, 82, 107, -5, -44, -71, 81, 60}, new byte[]{-75, -44, 52, 1, 40, 49, 3, -75}) + str + C0052e.m1418a(new byte[]{-32, 122, -56, 31, -88}, new byte[]{-58, 10, -81, 34, -103, -17, 61, -91});
            hashMap = new HashMap();
            hashMap.put(C0052e.m1418a(new byte[]{-95, -4, 109, 92, 88, 52, 2, -5, -70, -5}, new byte[]{-44, -113, 8, 46, 117, 85, 101, -98}), C0052e.m1418a(new byte[]{110, -49, -17, 103, 9, -61, Byte.MIN_VALUE, 77, 47, -107, -75, 61, 77}, new byte[]{1, -92, -121, 19, 125, -77, -81, 126}));
            hashMap.put(C0052e.m1418a(new byte[]{-95}, new byte[]{-43, -50, 56, -61, 86, 38, 37, 50}), String.valueOf(currentTimeMillis));
        } catch (Throwable th) {
        }
        try {
            hashMap.put(C0052e.m1418a(new byte[]{29, -26}, new byte[]{73, -83, 123, -115, 14, 82, 108, 64}), m264b(Long.parseLong(String.valueOf(currentTimeMillis)), str2));
            JSONArray jSONArray = new JSONObject(C0574b.m307f(str2, hashMap, null)).getJSONArray(C0052e.m1418a(new byte[]{112, 45, -94, 73}, new byte[]{20, 76, -42, 40, 85, -120, -33, 96}));
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1DAA1EC97F3B1DEA1EC97FFB1DCA1D097F9B1E3A1EC97CEB1E2A1DD97F4B1ECA1ED97C7B1D6A1D2");
                while (true) {
                    switch (m897d.hashCode() ^ 276747751) {
                        case -1984582597:
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(C0052e.m1418a(new byte[]{125, 18, -20, -57}, new byte[]{17, 123, -97, -77, -97, -47, -33, -5}), jSONArray2);
                            return jSONObject.toString();
                        case 1049952151:
                            m897d = i < jSONArray.length() ? atm.m897d("B1E0A1E297C0B1E2A1D497F9B1E5A1D597C1B1EDA1D997C0B1DBA1EC97FEB1E2A1EA97F9B1E6A1ED") : atm.m897d("B1D8A1EC97FDB1E2A1EC97C0B1D1A1D597C7B1E1A1D597C4B1E2A1EF97F3B1DCA1E997F3B1ECA1ED97C1B1E2A1EE97F0B1E1A1D397C0B1D1A1DD97CEB1E2");
                        case 1459846022:
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            JSONObject jSONObject3 = new JSONObject();
                            String string = jSONObject2.getString(C0052e.m1418a(new byte[]{-67, 51, -108, -67, -72, -78, -86, 19, -82}, new byte[]{-53, 90, -16, -40, -41, -4, -53, 126}));
                            String m897d2 = atm.m897d("B1E1A1D497FDB1E5A1EE97C4B1DCA1D397F0B1D8A1D597FCB1EDA1D797F0B1DEA1EE97FEB1E5A1D197F8B1E0A1E297FCB1DBA1E397C4B1E2");
                            while (true) {
                                switch (m897d2.hashCode() ^ 302159849) {
                                    case -2032776606:
                                        break;
                                    case -2012534522:
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-19, -127, -65, 63, -34, 78}, new byte[]{-101, -18, -37, 96, -73, 42, -35, 103}), jSONObject2.getString(C0052e.m1418a(new byte[]{-5, 37}, new byte[]{-110, 65, -60, -90, -93, -63, 2, 87})));
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-81, 101, -78, -71, -107, -68, 116, 93}, new byte[]{-39, 10, -42, -26, -5, -35, 25, 56}), string);
                                        jSONObject3.put(C0052e.m1418a(new byte[]{-80, -122, -27, -3, 120, 95, 114}, new byte[]{-58, -23, -127, -94, 8, 54, 17, 100}), jSONObject2.getString(C0052e.m1418a(new byte[]{-79, -12, -63, 93, 79, 26, 59, -81, -94, -17}, new byte[]{-57, -99, -91, 56, 32, 89, 84, -39})));
                                        jSONObject3.put(C0052e.m1418a(new byte[]{4, 14, 91, 2, -5, 79, 62, 48, 0, 10, 76}, new byte[]{114, 97, 63, 93, -119, 42, 83, 81}), jSONObject2.getString(C0052e.m1418a(new byte[]{70, -88, -126}, new byte[]{43, -37, -27, -117, 68, -101, 119, 37})));
                                        jSONArray2.put(jSONObject3);
                                        break;
                                    case -1992288473:
                                        m897d2 = !string.contains(str) ? atm.m897d("B1DEA1D397FAB1ECA1EF97F0B1E1A1E397FEB1E2A1D197C1B1E6A1D097F8B1E2A1ED") : atm.m897d("B1DEA1EC97CEB1E2A1D797F8B1E6A1D597F9B1E1A1EC97C2B1DDA1D797FEB1DFA1ED97F4B1E3A1D397C0B1ECA1EA97F9B1D6A1EF97F4");
                                    case -1134728168:
                                        m897d2 = atm.m897d("B1D1A1D597FFB1E0A1E997C1B1E2A1D097FAB1DFA1DE97C4B1E2A1D397CFB1DEA1D597FEB1E2A1D297C7B1ECA1ED");
                                }
                            }
                            i++;
                            break;
                        case 1488899799:
                            m897d = atm.m897d("B1D6A1D197C3B1D1A1D597C7B1DCA1DE97C4B1E2A1E297CEB1DFA1E397F8B1DDA1E297CFB1E1A1D297FAB1E2");
                    }
                }
            }
        } catch (Throwable th2) {
            return "";
        }
    }
}
