package com.github.catvod.spider.merge.p044k;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p055q.C0649a;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.b */
/* loaded from: classes.dex */
public final class C0587b extends Dora {

    /* renamed from: g */
    private static String f1058g = "";

    /* renamed from: b */
    String f1059b = C0052e.m1418a(new byte[]{79, -5, 5, -127, 25, 120, -79, 74, 69, -35, 27, -127, 55, 52, -64, 112, 54, -33, 61, -14, 13, 45, -9, 47, Byte.MAX_VALUE, -22, 122, -64, 4, 28, -44, 72}, new byte[]{28, -87, 78, -94, 124, 93, -123, 31});

    /* renamed from: c */
    String f1060c = C0052e.m1418a(new byte[]{10, 34, 57, -2, 21, 43, 21, 87, 80, 124, 36, -124, 10, 37, 124, 91}, new byte[]{101, 20, 74, -89, 120, 70, 63, 47});

    /* renamed from: d */
    private String f1061d = C0052e.m1418a(new byte[]{97, -70, -104, -116, -76, -7, 116, 14, 105, -72, -102, -118, -78, -5, 118, 0}, new byte[]{80, -120, -85, -72, -127, -49, 67, 54});

    /* renamed from: e */
    private String f1062e = C0052e.m1418a(new byte[]{80, -104, 38, -33, 112, 89, -44, -35}, new byte[]{97, -86, 21, -21, 69, 111, -29, -27});

    /* renamed from: f */
    private final Map<String, List<String>> f1063f = new HashMap();

    /* renamed from: a */
    public static byte[] m297a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0052e.m1418a(new byte[]{-39, -25, -47}, new byte[]{-104, -94, -126, 59, 18, -76, -9, -100}));
            Cipher cipher = Cipher.getInstance(str);
            String m897d = atm.m897d("B1E3A1E997C3B1E1A1D097F0B1E2A1D197C0B1D8A1D097C2B1DDA1E997FDB1ECA1D297C7B1DEA1EF97CFB1E3A1D997F0");
            while (true) {
                switch (m897d.hashCode() ^ 771194137) {
                    case -2120125322:
                        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                        break;
                    case -1281516283:
                        m897d = atm.m897d("B1DFA1ED97F4B1EDA1D797F0B1E2A1D397F4B1E6A1EA97FDB1ECA1EE97C1B1DCA1ED97F9B1E1A1EF97FDB1E0A1D3");
                        break;
                    case 196021167:
                        cipher.init(2, secretKeySpec);
                        break;
                    case 938367290:
                        if (bArr3 == null) {
                            m897d = atm.m897d("B1DAA1E997C4B1E2A1D497F9B1DDA1ED97CEB1EDA1D497C0B1D2A1D797CEB1E2A1DE97C0B1E3A1EA97C1B1E2A1ED97FEB1DAA1D797C7B1DBA1ED97C0B1D2A1D497C4B1E2");
                            break;
                        } else {
                            m897d = atm.m897d("B1D1A1D497C4B1D8A1EA97FCB1D6A1EA97C0B1DBA1D497C4B1E2A1D097C2B1EDA1EF97C1B1DDA1D397F0B1E2A1ED97FEB1DDA1D0");
                            break;
                        }
                }
            }
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* renamed from: b */
    private void m296b() {
        String m897d = atm.m897d("B1E0A1EA97F4B1D2A1EE97F0B1E2A1D297C4B1D2A1D097FDB1ECA1E997C2B1E5A1ED97C7B1ECA1ED");
        JSONObject jSONObject = null;
        while (true) {
            switch ((m897d.hashCode() ^ 763) ^ (-1760345158)) {
                case -859438159:
                    C0649a.m152d(C0052e.m1418a(new byte[]{-63, -75, -12, -80}, new byte[]{-107, -31, -99, -58, -12, -40, -93, -106}), jSONObject.optString(C0052e.m1418a(new byte[]{52, -81}, new byte[]{93, -39, -77, -8, -50, -24, -121, -127})));
                    m897d = atm.m897d("B1DDA1EA97F9B1E1A1D797C3B1DAA1E397FEB1D8A1EE97F9B1E2A1EF97F8B1DFA1ED");
                    break;
                case 240469272:
                    C0649a.m152d(C0052e.m1418a(new byte[]{9, 99, -116, 76, -81}, new byte[]{93, 55, -25, 41, -42, 111, -57, -100}), jSONObject.optString(C0052e.m1418a(new byte[]{22, -9, 74}, new byte[]{125, -110, 51, 103, -102, 85, -60, 48})));
                    m897d = atm.m897d("B1E0A1D197F4B1ECA1E997CEB1E3A1D597C0B1E2A1D597FCB1DDA1D397F4B1DE");
                    break;
                case 281294780:
                    m897d = atm.m897d("B1D8A1EE97CFB1D6A1ED97FEB1DEA1D097F8B1D1A1D297C1B1D2A1DD97C3B1EDA1EE97C2B1D6A1ED97FEB1E2A1D297C3B1DCA1E997FDB1ECA1ED");
                    break;
                case 714222543:
                    return;
                case 892588427:
                    jSONObject = new JSONObject(C0574b.m307f(C0052e.m1418a(new byte[]{-31, -32, -33, -12, 68, -32, -90, -5, -1, -3, -49, -31, 88, -12, -3, -32, -3, -30, -123, -20, 77, -12, -22, -82, -90, -28, -34, -26, 91, -77, -22, -6, -29, -25, -60, -22}, new byte[]{-119, -108, -85, -124, 55, -38, -119, -44}), null, null)).optJSONObject(C0052e.m1418a(new byte[]{-18, 25, -86, -71, 125, 79}, new byte[]{-98, 112, -55, -55, 20, 44, -95, -8}));
                    m897d = atm.m897d("B1EDA1DD97F9B1E2A1DE97C1B1DBA1ED97F8B1DDA1D097F4B1D8A1E397C0B1DCA1D497F8B1EDA1E997C2");
                    break;
            }
        }
    }

    /* renamed from: c */
    private String m295c(String str) {
        byte[] bArr;
        byte[] bytes = Long.toString(System.currentTimeMillis()).getBytes();
        byte[] bytes2 = this.f1061d.getBytes();
        byte[] bytes3 = this.f1062e.getBytes();
        String m1418a = C0052e.m1418a(new byte[]{-119, 17, 19, 92, 53, -100, 10, -42, -104, 31, 3, 32, 67, -104, 57, -99, -84, 61, 46, 20}, new byte[]{-56, 84, 64, 115, 118, -56, 88, -7});
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, C0052e.m1418a(new byte[]{86, -20, 9}, new byte[]{23, -87, 90, 41, 87, 89, -14, 91}));
            Cipher cipher = Cipher.getInstance(m1418a);
            String m897d = atm.m897d("B1DFA1D997FEB1E2A1D097F8B1DEA1D797F0B1D1A1D797F9B1ECA1E297FEB1E2A1ED97C7B1DAA1DD97C1B1DFA1ED97FDB1DBA1DD97FEB1E1A1EC");
            while (true) {
                switch (m897d.hashCode() ^ (-1942127085)) {
                    case -916004504:
                        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes3));
                        break;
                    case 158306941:
                        if (bytes3 == null) {
                            m897d = atm.m897d("B1DDA1D797C7B1DEA1ED97CEB1E2A1E997CFB1E0A1E997F3B1DFA1ED97FDB1DBA1D997F8B1E1A1DD97FEB1ECA1EA97F9B1DDA1ED");
                            break;
                        } else {
                            m897d = atm.m897d("B1D1A1EF97C1B1ECA1D597FCB1DDA1EA97FCB1DAA1D997C2B1ECA1EC97C2B1ECA1ED97CFB1D6A1E2");
                            break;
                        }
                    case 1026264008:
                        m897d = atm.m897d("B1DAA1EE97C4B1DAA1D097FCB1ECA1ED97F8B1D1A1D997C2B1E6A1E397FCB1E2A1EE97F9B1DEA1E297C3");
                        break;
                    case 1720560116:
                        cipher.init(1, secretKeySpec);
                        break;
                }
            }
            bArr = cipher.doFinal(bytes);
        } catch (Exception e) {
            SpiderDebug.log(e);
            bArr = null;
        }
        String encodeToString = Base64.encodeToString(bArr, 8);
        StringBuilder m635a = C0424a.m635a(str);
        m635a.append(C0052e.m1418a(new byte[]{-48, 84, 107, 10, -61, 35, 65}, new byte[]{-10, 32, 4, 97, -90, 77, 124, -29}));
        m635a.append(encodeToString);
        return m635a.toString();
    }

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        LinkedList linkedList;
        Iterator it;
        JSONObject jSONObject = new JSONObject();
        try {
            str3 = f1058g + "";
            HashMap hashMap2 = new HashMap();
            String m897d = atm.m897d("B1D8A1E397C3B1DCA1EA97FCB1E6A1E297C4B1E2A1D097FFB1E2A1ED97FDB1D6A1D797CFB1D2A1D097F0B1E6A1D9");
            while (true) {
                switch (m897d.hashCode() ^ (-379919838)) {
                    case -681442080:
                        if (hashMap == null) {
                            m897d = atm.m897d("B1DDA1D597F9B1DBA1D597FDB1DEA1DD97CEB1DEA1E997CFB1E6A1D197FAB1D2A1EE97C3B1E2A1E297CE");
                            break;
                        } else {
                            m897d = atm.m897d("B1D1A1D297C0B1E2A1DD97C3B1DEA1EE97C3B1DEA1D097F8B1E6A1EC97C0B1DDA1D097FCB1D6");
                            break;
                        }
                    case 377163802:
                        hashMap2.putAll(hashMap);
                        break;
                    case 423198332:
                        break;
                    case 525946741:
                        m897d = atm.m897d("B1EDA1D997FFB1E0A1E297F3B1E0A1D997F8B1DCA1DD97C1B1E1A1E297F9B1E2");
                        break;
                }
            }
            hashMap2.put(C0052e.m1418a(new byte[]{41, 95, -62, -99}, new byte[]{93, 38, -78, -8, -30, 0, 3, -11}), str);
            hashMap2.put(C0052e.m1418a(new byte[]{98, -48, -127, 77}, new byte[]{18, -79, -26, 40, 12, 53, -37, 115}), str2);
            hashMap2.put(C0052e.m1418a(new byte[]{-36, 102, 5, 111, -37}, new byte[]{-80, 15, 104, 6, -81, 30, -32, 88}), C0052e.m1418a(new byte[]{8, -97}, new byte[]{58, -81, -21, -60, -110, 56, -2, 37}));
            linkedList = new LinkedList();
            it = hashMap2.entrySet().iterator();
        } catch (Exception e) {
            e = e;
        }
        while (true) {
            String m897d2 = atm.m897d("B1E2A1D397C3B1E2A1EA97CEB1E2A1D097C2B1D2A1ED97C0B1ECA1D397C0B1DFA1EA97F0B1E2A1D197FDB1DEA1ED97C4B1E5A1EE97F3B1E1");
            while (true) {
                switch (m897d2.hashCode() ^ 1885737882) {
                    case -1631196088:
                        try {
                            JSONObject optJSONObject = new JSONObject(C0574b.m308e(m295c(str3 + C0052e.m1418a(new byte[]{-71}, new byte[]{-122, -42, 42, -97, -92, -15, 7, 112}) + TextUtils.join(C0052e.m1418a(new byte[]{-55}, new byte[]{-17, -69, 66, -92, -10, 77, -76, -57}), linkedList)), m294d())).optJSONObject(C0052e.m1418a(new byte[]{-56, -113, -105, -91}, new byte[]{-84, -18, -29, -60, 52, -105, -112, 80}));
                            JSONArray jSONArray = new JSONArray();
                            JSONArray optJSONArray = optJSONObject.optJSONArray(C0052e.m1418a(new byte[]{-91, -60, -91, 0}, new byte[]{-55, -83, -42, 116, 96, -112, 28, 56}));
                            int i = 0;
                            while (true) {
                                String m897d3 = atm.m897d("B1E3A1E397CEB1D2A1D797F3B1ECA1D997C3B1E5A1D297F9B1E2A1E997C3B1DBA1ED97C0B1E1A1EA97CEB1EDA1EF97CFB1DFA1EC97FFB1DBA1EF");
                                while (true) {
                                    switch (m897d3.hashCode() ^ 1042843449) {
                                        case -2070492051:
                                            m897d3 = i < optJSONArray.length() ? atm.m897d("B1DAA1D997CEB1E2A1D797FEB1E2A1E397F0B1E6A1ED97C1B1DCA1D097C0B1DBA1D097C2B1DFA1D497FAB1DBA1EE97CE") : atm.m897d("B1E2A1D997F4B1EDA1D997F3B1DCA1EC97F0B1EDA1D397CEB1E2A1EA97C2B1DA");
                                        case -1974566044:
                                            int parseInt = Integer.parseInt(str2);
                                            jSONObject.put(C0052e.m1418a(new byte[]{98, -110, 92, 72}, new byte[]{18, -13, 59, 45, -14, -98, 65, -29}), parseInt);
                                            String m897d4 = atm.m897d("B1DDA1D797FEB1E2A1D297CFB1E5A1DE97C3B1DFA1ED97C1B1D2A1D997CFB1E6A1E997C0B1E3A1D797C0B1E1A1D597C1B1DEA1D797C1B1ECA1ED97F9B1E2");
                                            while (true) {
                                                switch (m897d4.hashCode() ^ (-2038629248)) {
                                                    case -668434741:
                                                        break;
                                                    case -134832546:
                                                        m897d4 = atm.m897d("B1DEA1D397FDB1E2A1D197CFB1DCA1DE97F4B1DFA1EC97CEB1E6A1EA97FFB1ECA1E397CFB1D2");
                                                        break;
                                                    case 1145444854:
                                                        if (jSONArray.length() != 20) {
                                                            m897d4 = atm.m897d("B1DDA1E397F8B1D1A1D997C4B1E2A1E997C0B1D6A1ED97F9B1E5A1EF97F8B1E0A1DD97FDB1DAA1E997FDB1DBA1ED97C3B1DBA1E397C0");
                                                            break;
                                                        } else {
                                                            m897d4 = atm.m897d("B1DCA1E397FCB1E5A1EE97C2B1D6A1D497F8B1EDA1DD97F9B1E2A1ED97CFB1DC");
                                                            break;
                                                        }
                                                    case 1918447410:
                                                        parseInt++;
                                                        break;
                                                }
                                            }
                                            jSONObject.put(C0052e.m1418a(new byte[]{-29, 27, -58, -55, 70, 33, -11, 67, -25}, new byte[]{-109, 122, -95, -84, 37, 78, Byte.MIN_VALUE, 45}), parseInt);
                                            jSONObject.put(C0052e.m1418a(new byte[]{89, -114, -56, 103, 2}, new byte[]{53, -25, -91, 14, 118, -55, -67, 93}), 20);
                                            jSONObject.put(C0052e.m1418a(new byte[]{121, 98, 31, 15, 112}, new byte[]{13, 13, 107, 110, 28, 100, -17, 23}), optJSONObject.optInt(C0052e.m1418a(new byte[]{122, 61, 7, -73, -114}, new byte[]{14, 82, 115, -42, -30, -16, -113, -39})));
                                            jSONObject.put(C0052e.m1418a(new byte[]{-75, 21, -78, 30}, new byte[]{-39, 124, -63, 106, 55, 35, -110, -81}), jSONArray);
                                            break;
                                        case 620556338:
                                            break;
                                        case 902171361:
                                            m897d3 = atm.m897d("B1D1A1D797C3B1E0A1D997FDB1DDA1D797F3B1DEA1E297F0B1DDA1D597F9B1E2A1D197CEB1D6A1DE97F8B1E5A1D497C0");
                                    }
                                }
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put(C0052e.m1418a(new byte[]{-53, -73, -83, -30, 100, 73}, new byte[]{-67, -40, -55, -67, 13, 45, 104, -60}), jSONObject2.getString(C0052e.m1418a(new byte[]{-42, -3, -24, -108, -2, -51}, new byte[]{-96, -110, -116, -53, -105, -87, 79, -102})));
                                jSONObject3.put(C0052e.m1418a(new byte[]{100, -54, -30, -94, -71, 115, -35, -49}, new byte[]{18, -91, -122, -3, -41, 18, -80, -86}), jSONObject2.getString(C0052e.m1418a(new byte[]{-21, 105, 58, -26, -44, -103, -78, 26}, new byte[]{-99, 6, 94, -71, -70, -8, -33, Byte.MAX_VALUE})));
                                jSONObject3.put(C0052e.m1418a(new byte[]{-17, 28, -11, 6, -61, 80, -105}, new byte[]{-103, 115, -111, 89, -77, 57, -12, -55}), jSONObject2.getString(C0052e.m1418a(new byte[]{93, Byte.MIN_VALUE, 59, 124, -98, 18, 19}, new byte[]{43, -17, 95, 35, -18, 123, 112, 82})));
                                jSONObject3.put(C0052e.m1418a(new byte[]{42, -6, 88, 9, -78, 16, -30, -16, 46, -2, 79}, new byte[]{92, -107, 60, 86, -64, 117, -113, -111}), jSONObject2.getString(C0052e.m1418a(new byte[]{117, 40, -35, -111, -87, 25, -60, 48, 113, 44, -54}, new byte[]{3, 71, -71, -50, -37, 124, -87, 81})));
                                jSONArray.put(jSONObject3);
                                i++;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            SpiderDebug.log(e);
                            return jSONObject.toString();
                        }
                        break;
                    case 934910436:
                        m897d2 = it.hasNext() ? atm.m897d("B1E0A1EE97F9B1E2A1D997F8B1DAA1ED97FAB1EDA1E997C0B1E6A1D297F9B1DAA1D797F4B1DDA1D297C2B1D8A1D997F9B1E2") : atm.m897d("B1DBA1D297FFB1ECA1EF97C0B1E2A1D097C7B1E6A1DD97C7B1DDA1DE97FDB1E5");
                    case 1354697994:
                        break;
                    case 1740006472:
                        m897d2 = atm.m897d("B1D2A1D597C0B1DCA1EC97C7B1DCA1ED97FDB1E2A1E997C0B1DFA1ED97C1B1D2A1EA");
                }
            }
            return jSONObject.toString();
            Map.Entry entry = (Map.Entry) it.next();
            linkedList.add(((String) entry.getKey()) + C0052e.m1418a(new byte[]{-93}, new byte[]{-98, 81, 55, -24, -17, 60, 17, 38}) + ((String) entry.getValue()));
        }
    }

    /* renamed from: d */
    public final HashMap<String, String> m294d() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1E5A1EA97FAB1D2A1E997F8B1D2A1D497FFB1DEA1D797F8B1EDA1DE97F8B1D1A1DE97F9B1D1A1EF97C7");
        while (true) {
            switch ((m897d.hashCode() ^ 947) ^ 62735537) {
                case -1180067406:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1DDA1D097FDB1E2A1D497CEB1D8A1D497C0B1E0A1D997C2B1E2A1D797FDB1DBA1ED97CEB1E0A1D497C0");
                    break;
                case -644448385:
                    m897d = atm.m897d("B1E5A1D497C1B1E3A1D397FDB1E2A1EF97FCB1E0A1E297F4B1EDA1DD97C0B1E2A1ED97C0B1DBA1E397C2B1E2A1D7");
                    break;
                case 588516199:
                    return hashMap;
                case 718565370:
                    hashMap.put(C0052e.m1418a(new byte[]{-27, 47, -73, -56, 115, 104, 73, -70, -34, 40}, new byte[]{-80, 92, -46, -70, 94, 41, 46, -33}), C0052e.m1418a(new byte[]{-40, Byte.MIN_VALUE, 60, 0, -60, 45, 111, 30, -78, -48, 126, 70}, new byte[]{-100, -31, 80, 118, -83, 70, 64, 44}));
                    m897d = atm.m897d("B1E6A1D497F3B1DBA1EC97C7B1D8A1D497FEB1D2A1D397C0B1E2A1DE97C4B1DAA1D797C1B1E6A1ED97F4B1DBA1D497C0B1DEA1DE97CE");
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        TreeMap treeMap;
        int i;
        String[] split;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject optJSONObject = new JSONObject(C0574b.m308e(m295c(f1058g + C0052e.m1418a(new byte[]{81, 57, 77, -8, 112, -26, 67, -83, 31, 41, 73, -77, 111, -27, 75, -106, 23, 57, 21}, new byte[]{126, 93, 40, -116, 25, -118, 47, -55}) + list.get(0)), m294d())).optJSONObject(C0052e.m1418a(new byte[]{-52, -36, -82, -124}, new byte[]{-88, -67, -38, -27, 48, -51, -56, -62}));
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(C0052e.m1418a(new byte[]{-69, 86, -16, -80, 79, 76, -114, Byte.MIN_VALUE, -94}, new byte[]{-51, 63, -108, -43, 32, 5, -32, -26}));
            jSONObject = new JSONObject();
            jSONObject.put(C0052e.m1418a(new byte[]{18, 119, 104, -98, 4, -3}, new byte[]{100, 24, 12, -63, 109, -103, 105, 48}), optJSONObject2.getString(C0052e.m1418a(new byte[]{10, 126, -78, -127, 101, 52}, new byte[]{124, 17, -42, -34, 12, 80, -106, -88})));
            jSONObject.put(C0052e.m1418a(new byte[]{-51, 72, -11, 58, 60, 40, -66, 53}, new byte[]{-69, 39, -111, 101, 82, 73, -45, 80}), optJSONObject2.getString(C0052e.m1418a(new byte[]{114, 2, -38, 13, 103, -45, 8, 42}, new byte[]{4, 109, -66, 82, 9, -78, 101, 79})));
            jSONObject.put(C0052e.m1418a(new byte[]{-53, Byte.MIN_VALUE, -97, -110, 113, 25, 41}, new byte[]{-67, -17, -5, -51, 1, 112, 74, 117}), optJSONObject2.getString(C0052e.m1418a(new byte[]{44, -11, 122, 117, -94, -23, -50}, new byte[]{90, -102, 30, 42, -46, Byte.MIN_VALUE, -83, -97})));
            jSONObject.put(C0052e.m1418a(new byte[]{18, 114, 99, 91, -12, -99, -33, -30, 3}, new byte[]{102, 11, 19, 62, -85, -13, -66, -113}), optJSONObject2.optString(C0052e.m1418a(new byte[]{11, 99, 43, 33, -74, -58, 37, -71, 14}, new byte[]{125, 12, 79, 126, -43, -86, 68, -54})));
            jSONObject.put(C0052e.m1418a(new byte[]{8, -79, 89, -37, -120, -70, 65, 90}, new byte[]{126, -34, 61, -124, -15, -33, 32, 40}), optJSONObject2.optString(C0052e.m1418a(new byte[]{77, 116, -101, -58, -70, -63, -14, 122}, new byte[]{59, 27, -1, -103, -61, -92, -109, 8})));
            jSONObject.put(C0052e.m1418a(new byte[]{48, 62, 98, 47, -13, -33, -9, -103}, new byte[]{70, 81, 6, 112, -110, -83, -110, -8}), optJSONObject2.optString(C0052e.m1418a(new byte[]{-4, -36, 92, -98, 89, 126, -89, 12}, new byte[]{-118, -77, 56, -63, 56, 12, -62, 109})));
            jSONObject.put(C0052e.m1418a(new byte[]{94, 21, -77, 48, -90, -124, 111, -26, 90, 17, -92}, new byte[]{40, 122, -41, 111, -44, -31, 2, -121}), optJSONObject2.optString(C0052e.m1418a(new byte[]{101, -118, -11, -98, 71, -95, -15, -6, 97, -114, -30}, new byte[]{19, -27, -111, -63, 53, -60, -100, -101})));
            jSONObject.put(C0052e.m1418a(new byte[]{31, 32, -6, 19, -67, 115, 95, -42, 27}, new byte[]{105, 79, -98, 76, -36, 16, 43, -71}), optJSONObject2.optString(C0052e.m1418a(new byte[]{2, 35, -52, 10, -92, -18, 7, -40, 6}, new byte[]{116, 76, -88, 85, -59, -115, 115, -73})));
            jSONObject.put(C0052e.m1418a(new byte[]{-4, -84, -79, -56, 34, -22, 47, 45, -17, -83, -95}, new byte[]{-118, -61, -43, -105, 65, -123, 65, 89}), optJSONObject2.optString(C0052e.m1418a(new byte[]{8, -50, 53, 126, -37, 68, 54, -18, 27, -49, 37}, new byte[]{126, -95, 81, 33, -72, 43, 88, -102})).trim());
            jSONArray = optJSONObject.getJSONArray(C0052e.m1418a(new byte[]{5, 110, -41, -101, 79, -124}, new byte[]{118, 1, -94, -23, 44, -31, -13, 77}));
            treeMap = new TreeMap(new Comparator() { // from class: com.github.catvod.spider.merge.k.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((String) obj).contains(C0052e.m1418a(new byte[]{24, -79, -98, -79}, new byte[]{117, -126, -21, -119, 20, -103, -12, 53})) || ((String) obj2).contains(C0052e.m1418a(new byte[]{94, -105, Byte.MIN_VALUE, 107}, new byte[]{28, -50, -57, 42, -36, 83, -104, -84}))) ? 1 : -1;
                }
            });
            i = 0;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        while (true) {
            String m897d = atm.m897d("B1ECA1DE97CEB1E2A1E997FAB1EDA1D597F0B1E3A1EE97C1B1E3A1E997C1B1EC");
            while (true) {
                switch (m897d.hashCode() ^ (-454682075)) {
                    case -1633735696:
                        m897d = i < jSONArray.length() ? atm.m897d("B1D6A1D097CFB1D2A1DE97F0B1DFA1D397CFB1DCA1D297C7B1DFA1EA97C3B1E0A1E997FDB1E2") : atm.m897d("B1DDA1EF97F0B1E2A1D097CFB1E2A1D497FEB1DBA1D397C4B1D1A1D597FFB1DB");
                    case -319025246:
                        m897d = atm.m897d("B1DDA1E297C4B1E2A1D197C3B1E5A1D997FAB1D1A1EC97C4B1D8A1EA97F9B1E2A1EC97C2B1DFA1ED");
                    case 1432975771:
                        String join = TextUtils.join(C0052e.m1418a(new byte[]{30, 18, -109}, new byte[]{58, 54, -73, 118, -91, -106, -40, 124}), treeMap.keySet());
                        String join2 = TextUtils.join(C0052e.m1418a(new byte[]{-98, 47, 93}, new byte[]{-70, 11, 121, -22, 64, -25, 48, -73}), treeMap.values());
                        jSONObject.put(C0052e.m1418a(new byte[]{8, -89, 125, -27, -29, 31, 16, 11, 33, -82, 107, -43, -2}, new byte[]{126, -56, 25, -70, -109, 115, 113, 114}), join);
                        jSONObject.put(C0052e.m1418a(new byte[]{124, -86, 19, 80, 29, 10, -123, -127, 85, -80, 5, 99}, new byte[]{10, -59, 119, 15, 109, 102, -28, -8}), join2);
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(jSONObject);
                        jSONObject2.put(C0052e.m1418a(new byte[]{9, 93, -46, 53}, new byte[]{101, 52, -95, 65, -104, -112, 81, 14}), jSONArray2);
                        break;
                    case 1837992577:
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        JSONObject optJSONObject3 = jSONObject3.optJSONObject(C0052e.m1418a(new byte[]{-52, -18, Byte.MAX_VALUE, 21, -73, 19, 11, -78, -46, -28, 113}, new byte[]{-68, -126, 30, 108, -46, 97, 84, -37}));
                        String optString = optJSONObject3.optString(C0052e.m1418a(new byte[]{36, -63, -81, 29}, new byte[]{66, -77, -64, 112, 4, 10, -22, 102}));
                        String optString2 = optJSONObject3.optString(C0052e.m1418a(new byte[]{-127, 38, -123, -3, 27}, new byte[]{-15, 71, -9, -114, 126, -22, -82, 15}));
                        String[] strArr = new String[0];
                        String m897d2 = atm.m897d("B1D1A1D497C0B1E2A1D997C0B1DAA1D197C2B1DAA1D097FEB1E2A1D197C7B1ECA1ED97F8B1E0A1EC");
                        while (true) {
                            switch (m897d2.hashCode() ^ 483863875) {
                                case -95918078:
                                    m897d2 = atm.m897d("B1D8A1D997CFB1D2A1D197C4B1E2A1ED97FAB1E6A1ED97C1B1E2A1ED97CEB1DDA1EF97F3B1E5A1D397C1B1E2A1D097F4B1DFA1D597C4B1D2A1D1");
                                case -26062717:
                                    split = optString2.replace(C0052e.m1418a(new byte[]{-14, 126}, new byte[]{-36, 80, -32, -5, -19, 112, -24, -115}), C0052e.m1418a(new byte[]{46}, new byte[]{0, 96, 37, 23, -45, -44, 117, 101})).split(C0052e.m1418a(new byte[]{-36}, new byte[]{-16, -115, -84, -29, 86, 40, 8, 88}));
                                    break;
                                case 120079892:
                                    m897d2 = !TextUtils.isEmpty(optString2) ? atm.m897d("B1D6A1DD97FFB1E2A1EA97C7B1ECA1D397CEB1DAA1D297FFB1D2A1D097FFB1DE") : atm.m897d("B1E5A1E297C4B1E2A1D197C7B1DFA1D297F8B1E3A1DE97F4B1DFA1D597FFB1ECA1ED");
                                case 1066710336:
                                    split = strArr;
                                    break;
                            }
                        }
                        String m897d3 = atm.m897d("B1E2A1D397C4B1E2A1D097FAB1DDA1D597FCB1D2A1EE97F8B1D2A1D097C0B1E2A1E997C3B1D6");
                        while (true) {
                            switch (m897d3.hashCode() ^ 1907411077) {
                                case -1753868190:
                                    break;
                                case 710876442:
                                    m897d3 = atm.m897d("B1D8A1E297FEB1E2A1E297C3B1E2A1EC97FCB1E2A1EE97F4B1DCA1EF97FDB1E2A1ED97FEB1DBA1D397C0B1DCA1D197C1B1DEA1D797F9B1E2");
                                case 1644531362:
                                    m897d3 = !this.f1063f.containsKey(optString) ? atm.m897d("B1DDA1E297F0B1E2A1EE97F0B1DAA1D297F3B1DCA1D597C7B1DAA1EF97FDB1E6") : atm.m897d("B1DAA1D197F0B1E2A1D997F0B1E2A1D997C0B1D2A1ED97FFB1D8A1D397C0B1DBA1E297CEB1EDA1D097C3B1DCA1D997C3B1DCA1EA97FFB1E1A1EC97FEB1E2");
                                case 1997542022:
                                    String m897d4 = atm.m897d("B1D2A1D797F8B1ECA1EF97FDB1E2A1EA97C3B1DCA1EF97C0B1EDA1ED97FEB1DAA1E297F0B1DEA1EF97F3B1DDA1DE97C7B1D2A1ED97FEB1E1A1D497C0");
                                    while (true) {
                                        switch (m897d4.hashCode() ^ (-1696198035)) {
                                            case -1704590088:
                                                break;
                                            case -1244908741:
                                                m897d4 = atm.m897d("B1D2A1E397C3B1D6A1EA97C0B1E0A1D397C3B1DEA1D397C2B1DBA1DE97FDB1E2A1EE97FCB1DC");
                                            case 136913298:
                                                this.f1063f.put(optString, Arrays.asList(split));
                                                break;
                                            case 1783697588:
                                                m897d4 = split.length > 0 ? atm.m897d("B1E1A1EE97F3B1D2A1E297FDB1D8A1E397C1B1D8A1D597F3B1E5A1E997C0B1E5A1D997C1B1D2A1D097CFB1D2A1DD") : atm.m897d("B1E0A1E397F8B1D1A1EF97C7B1ECA1DD97F9B1E2A1D097FEB1DFA1ED97F0B1DAA1D497C0B1E0A1D197CF");
                                        }
                                    }
                                    break;
                            }
                        }
                        JSONArray optJSONArray = jSONObject3.optJSONArray(C0052e.m1418a(new byte[]{95, -62, -71, -90}, new byte[]{51, -85, -54, -46, -29, -18, -113, 107}));
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            String m897d5 = atm.m897d("B1D1A1D997C4B1DCA1ED97F0B1EDA1D797C4B1E2A1D997C3B1DCA1D197FEB1ECA1E397F4B1DE");
                            while (true) {
                                switch (m897d5.hashCode() ^ 1801565427) {
                                    case -1612187077:
                                        break;
                                    case -1403032258:
                                        m897d5 = atm.m897d("B1DCA1D597FDB1DEA1E297F3B1E0A1D597F8B1D2A1D797C0B1E2A1D997CFB1DFA1ED97C3B1E2A1D497C2B1E1A1DD");
                                    case -825445348:
                                        m897d5 = i2 < optJSONArray.length() ? atm.m897d("B1D6A1EC97C0B1D6A1EE97F0B1E6A1EC97C7B1DFA1ED97FFB1ECA1DD97F4B1E0A1DD97C0B1ECA1D497FEB1E2") : atm.m897d("B1DDA1EF97CFB1DDA1D597F9B1E2A1E397C0B1D8A1EE97FFB1DBA1ED97F9B1DFA1ED97F3B1ECA1D497FAB1D8A1D497FCB1E2A1D097C0B1E6A1D397CF");
                                    case 594704773:
                                        String m897d6 = atm.m897d("B1E5A1D397FFB1D6A1EE97C0B1D2A1D997CEB1E2A1EA97FEB1D2A1ED97FFB1D6A1D097C0B1DEA1EF97FEB1E2A1E297FCB1E5A1E997CFB1DD");
                                        while (true) {
                                            switch (m897d6.hashCode() ^ (-457061121)) {
                                                case -1631407559:
                                                    break;
                                                case -1363491436:
                                                    m897d6 = atm.m897d("B1ECA1D297C4B1E2A1ED97CFB1DCA1DE97F9B1ECA1ED97C4B1E0A1DD97F4B1E2A1D297F4B1D6A1D097FAB1E0A1D097FA");
                                                case -1072146849:
                                                    m897d6 = arrayList.size() > 0 ? atm.m897d("B1E5A1DD97F4B1D1A1EC97C0B1E2A1D597F9B1DCA1E297C4B1D2A1ED97C4B1E0A1DD97C0B1E2A1E297F9") : atm.m897d("B1DAA1E397FDB1E2A1E397C7B1DEA1DD97C0B1E6A1D297FEB1E1A1D397C1B1E1");
                                                case 1662622440:
                                                    treeMap.put(optString, TextUtils.join(C0052e.m1418a(new byte[]{-79}, new byte[]{-110, -112, 10, 74, -31, 38, -44, 11}), arrayList));
                                                    break;
                                            }
                                        }
                                        i++;
                                        break;
                                }
                            }
                            arrayList.add(optJSONArray.optString(i2));
                            i2++;
                        }
                        break;
                }
            }
            return jSONObject2.toString();
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            String m897d = atm.m897d("B1E1A1EE97F3B1DFA1ED97FEB1E2A1D297C4B1E2A1ED97F0B1D6A1ED97F9B1DAA1DD97C0");
            while (true) {
                switch (m897d.hashCode() ^ (-2029296781)) {
                    case -789542530:
                        m897d = atm.m897d("B1E2A1ED97F0B1E2A1E997FAB1EDA1D297F4B1D2A1DD97F0B1E0A1EA97CF");
                        break;
                    case 583559747:
                        break;
                    case 1339967715:
                        jSONObject.put(C0052e.m1418a(new byte[]{-5, -11, -47, 100, 83, 10, 33}, new byte[]{-99, -100, -67, 16, 54, 120, 82, -73}), new JSONObject(atm.m897d("11584B57760311581110357A505819192D2B195856572239071F584F6EBFDBC19FEBC77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FE3D0BDE3DD58596E2E48405890DAC48FF3DD57317411581457767A8DF2CB93CFDD485658036E62489DF2C4AADBEF580759377A04584057AAD9FA9CFAE36E74480C584F6EBEEBEA9CF5DA7A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8DDDEB90F5E3485658036E62489DDDE4A9E1D1580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE3DD9CF6C97A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A82D7DC90C0F2485658036E624892D7D3A9D4C0580759377A04584057ABD2C59DC7DF6E74480C584F6EBFE0D59DC8E67A17560157227A50589FFFE4BFFEC158596E2E48405890C6F08DEEC157317411581457767A8FDFFD90F5E3485658036E62489FDFF2A9E1D1580759377A04584057AAF5CC9EC4D56E74480C584F6EBEC7DC9ECBEC7A17560157227A50589FF3DEB1F3D358596E2E48405890CACA83E3D357317411581457767A8CE4D093C4C0485658036E62489CE4DFAAD0F2580759377A04584057AAD9FA9CFAE36E74480C584F6EBEEBEA9CF5DA7A17560157227A50589CF7E0BFFCEB58596E2E48405893CEF48DECEB57317411581457767A8CF9F093CEC2485658036E62489CF9FFAADAF0580759377A04584057ABE3E59FFFCD6E74480C584F6EBFD1F59FF0F47A17560157227A505893E8DEBEF2DF58596E2E4840589CD1CA8CE2DF57317411581457767A8CECFD9DC5E2485658036E62489CECF2A4D1D0580759377A04584057A9E6C49DEEC0A9E5DB5856573A7A50589FCBE2BFFECF9FC8FD7A17560157227A50589FFAE8B0C9FF58596E2E48405890C3FC82D9FF57317411581457767A8FF4FC90C3EA485658036E62489FF4F3A9D7D8580759377A04584057A4E7FA9FF0DD6E74480C584F6EB0D5EA9FFFE47A17560157227A50589FF3D0BEF7EB58596E2E48405890CAC48CE7EB57317411581457767A8FFEC592E7FD485658036E62489FFECAABF3CF580759377A04584057ABE5FB9DC1E9ABCCDF9FC7C46E74480C584F6EBFD7EB9DCED0BFFECF9FC8FD7A17560157227A50589CF6C9B0E3C858596E2E48405893CFDD82F3C857310517560157273D135840572D2A0F1B58596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890E8FF83E3FC57607A1C584057A9FCCD93E3F36E254601581B6E624893DCECAAE0C55856573A7A505893D3D5BED2D5580860234814584F6EBDE5CA9CCCF27A46580C57767A8FF5CA93F5E64807560E6E3648405892F2D68FE1C757607A1C584057ABE6E49FE1C86E254601581B6E62489CC9E0A9C3D75856573A7A50589CC6D9BDF1C7580860234814584F6EB0E1CB9FEEF17A46580C57767A82F1CB90D7E54807560E6E3648405893DBFD8CE6D657607A1C584057AACFCF9CE6D96E254601581B6E624893E5DCA9C3D75856573A7A505893EAE5BDF1C7580860234814584F6EBDD4CD9FEEF17A46580C57767A8FC4CD90D7E54807560E6E3648405893FFE88FE1C757607A1C584057AAEBDA9FE1C86E254601581B6E62489FF7C5A9E2CC5856573A7A50589FF8FCBDD0DC580860234814584F6EBEEEF59FD1EBBDE2D358596E2E48405893C8D78FDEDD90C4F14807560E6E364840589DE9E78DF5D792C5C1485658036E624892DFCAABD7C79DF3EC6E254601581B6E62489FF0D5AAD3D59FDED26E74480C584F6EBDE0DA9CFEF3BDCEDD580860234814584F6EBDEFCC9ECEDA7A46580C57767A8FFFCC91F7CE48072708602348111F0C6E6248031F143E7A46581414213D48405890F5EC8EC1C757607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A584A48466E74480C584F6E6A5A484957317411581457767A584A48476E74480C584F6E6A5A484857317411581457767A584A48446E74480C584F6E6A5A484B57317411581457767A584A48456E74480C584F6E6A5A484A57317411581457767A584A4B4C6E74480C584F6E6A5A4B4357317411581457767A584A4B4D6E74480C584F6E6A5A4B4257317411581457767A584A4B426E74480C584F6E6A5A4B4D57317411581457767A584A4B436E74480C584F6E6A5A4B4C57317411581457767A584A4B406E74480C584F6E6A5A4B4F57317411581457767A584A4B416E74480C584F6E6A5A4B4E57317411581457767A584A4B466E74480C584F6E6A5A4B4957317411581457767A584A4B476E74480C584F6E6A5A4B4857317411581457767A584A4B446E74480C584F6E6A5A4B4B57317411581457767A584A4B456E74480C584F6E6A5A4B4A57310517560157273D135840572039041D58596E360B171F57767A82D5D79DE4D8485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890D7E582D5D757607A1C584057A9C3D792D5D86E254601581B6E624892F1C4A4F7C75856573A7A505892FEFDB0C5D7580860234814584F6EBFD8DE92DAE17A46580C57767A8DC8DE9DE3F54807560E6E364840589CDBE58FF7ED9DE3F5485658036E624893EDC8A9D5FD92D5D86E254601581B6E624893E5DCA4F7C75856573A7A505893EAE5B0C5D7580860234814584F6EBEFDDF92DAE17A46580C57767A8CEDDF9DE3F54807560E6E3648405893FFCD82D5D757607A1C584057AAEBFF92D5D86E254601581B6E62489FC4C2A4F7C75856573A7A50589FCBFBB0C5D7580860234814584F6EBDEFCC9FDBCF7A46580C57767A8FFFCC90E2DB48072708602348111F0C6E62489CF4E7A9E2E55856572239071F584F6EBEE4E89FCFC37A46580C14202D0F58402E377A04584057AACFDC93EDC16E74480C584F6E2C03171F57317411581457767A8EC0C093FCCC485658036E62481213013F7A17560157227A505892DAC8BDE2FC58596E2E484058062F37181F58081125375658476E623101581E2921484058162039190958596E360B171F57767A8DCBC190D2D3485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890C3FC82D9FF57607A1C584057A9D7CE92D9F06E254601581B6E62489CF2EDA8E2E35856573A7A50589CFDD4BCD0F3580860234814584F6EB1F7E89CEDE9BDEBCC9FF6C37A46580C57767A83E7E893D4FD8FFBCC90CFD74807560E6E3648405890DAC48FF3DD57607A1C584057A9CEF69FF3D26E254601581B6E62489FD4C3A9E2C75856573A7A50589FDBFABDD0D7580860234814584F6EBFE0D59DC8E67A46580C57767A8DF0D592F1F24807560E6E3648405890C6F08EC7E657607A1C584057A9D2C29EC7E96E254601581B6E62489FDFF2A9E1D15856573A7A50589FD0CBBDD3C1580860234814584F6EBDE3DD9CF6C97A46580C57767A8FF3DD93CFDD4807560E6E3648405890C2DE8FF5C857607A1C584057A9D6EC9FF5C76E254601581B6E62489DC1FAA9DDD25856573A7A50589DCEC3BDEFC2580860234814584F6EBCD3DB9CE8DD7A46580C57767A8EC3DB93D1C94807560E6E3648405893CFDD8CE3D557607A1C584057AADBEF9CE3DA6E254601581B6E62489FEFF3AAD0F25856573A7A50589FE0CABEE2E2580860234814584F6EBFD7EB9FFCEB7A46580C57767A8DC7EB90C5FF4807560E6E3648405890C9EE8EC1EC57607A1C584057A9DDDC9EC1E36E253707560E6E330F03584F6E39181F1B57607A041B17106E62489FE6C5A9D4D05856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9DEEF9FE6C56E74480C584F6EBDECFF9FE9FC7A17560157227A505893EAE5BDF1C758596E2E4840589CD3F18FE1C757317411581457767A83DCE393F4F7485658036E624893DCECAAE0C5580759377A04584057A9D7DA9CC3CB6E74480C584F6EBDE5CA9CCCF27A17560157227A50589CE2E9BEF6D658596E2E48405893DBFD8CE6D657317411581457767A8DC4F490D7E5485658036E62489DC4FBA9C3D7580759377A04584057AAEBDA9FE1C86E74480C584F6EBED9CA9FEEF17A17560157227A505892FEFDBDF1C758596E2E4840589DC7E98FE1C757317411581457767A8CECCA90C6F88FE7DB57607A1C584057AACEDA9FF0D5A9C5CB580759377A04584057A9DDDC9EC1E36E74480C584F6EBDEFCC9ECEDA7A17270759377A011F0357767A131F1B076E7448141B18297A50589FCCF8BCD1C758596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580811254601581E2921484058192D360D5856572239071F584F6EB0C5D792DDCC7A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FEEF1B0C5D758596E2E48405890D7E582D5D757317411581457767A82F1CB9DE3F5485658036E624892F1C4A4F7C7580759377A04584057ABEACE92D5D86E74480C584F6EBFD8DE92DAE17A17560157227A505893E2F1BDE7ED92DAE17A46580C57767A83EDC790C1CF82D5D757317411581457767A83E5D39DE3F5485658036E624893E5DCA4F7C7580759377A04584057AACFCF92D5D86E74480C584F6EBEFDDF92DAE17A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D13584057AAD6F89FC0FA6E7448141B18297A50589CFBDEBDD0F558596E2E0B160F106E623101581B6E62489CEDC3A5CFDE5856573A7A50580E1C213D4807560E6E3648405891F6E28CCAEE57607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5958402E377A011F0357767A09161B063F7A46581414213D48405892FDE38FE4F157607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8CF9FF93C8C7485658036E62489CF9F0AADCF5580759377A04584057ABFFFB9FC3CE6E74480C584F6EBFCDEB9FCCF77A17560157227A50589DF6E1B0CBFA58596E2E48405892CFF582DBFA57317411581457767A8CF4D292DCDE485658036E62489CF4DDABC8EC580759377A04584057AAC8F49DD6E46E74480C584F6EBEFAE49DD9DD7A17560157227A50589FF3DEB1F3D358596E2E48405890CACA83E3D357317411581457767A82EAE79DC2D1485658036E624892EAE8A4D6E3580759377A04584057AAF8CB9FE1D86E74480C584F6EBECADB9FEEE17A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8CE6C093C4C0485658036E62489CE6CFAAD0F2580759377A04584057A4E7FA9FF0DD6E74480C584F6EB0D5EA9FFFE47A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A8FCAEB90F5EC485658036E62489FCAE4A9E1DE580759377A04584057A9E8FB9FDFC66E74480C584F6EBDDAEB9FD0FF7A17560157227A50589DD1F2BCD6E058596E2E48405892E8E68EC6E057317411581457767A8FF4E590C4C3485658036E62489FF4EAA9D0F1580759377A04584057A8E2D89FD7E56E74480C584F6EBCD0C89FD8DC7A17560157227A50589DEEC6BEF3C058596E2E48405892D7D28CE3C057317411581457767A8FF0CB90F3CF485658036E62489FF0C4A9E7FD580759377A04584057A9DDDC9EC1E36E74480C584F6EBDEFCC9ECEDA7A17270759377A011F0357767A0B081F146E7448141B18297A50589FE9FCBDE6C058596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6EBDF1C79ECFEB7A46580C57767A8FE1C791F6FF4807560E6E3648405893DBFD8CE6D657607A1C584057AACFCF9CE6D96E254601581B6E62489CD6D2ABE6E45856573A7A50589CD9EBBFD4F4580860234814584F6EBDEFCC9ECEDA7A46580C57767A8FFFCC91F7CE48072708602348111F0C6E6248031F143E7A46581414213D48405890F5EC8EC1C757607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A584A48466E74480C584F6E6A5A484957317411581457767A584A48476E74480C584F6E6A5A484857317411581457767A584A48446E74480C584F6E6A5A484B57317411581457767A584A48456E74480C584F6E6A5A484A57317411581457767A584A4B4C6E74480C584F6E6A5A4B4357317411581457767A584A4B4D6E74480C584F6E6A5A4B4257317411581457767A584A4B426E74480C584F6E6A5A4B4D57317411581457767A584A4B436E74480C584F6E6A5A4B4C57317411581457767A584A4B406E74480C584F6E6A5A4B4F57317411581457767A584A4B416E74480C584F6E6A5A4B4E57317411581457767A584A4B466E74480C584F6E6A5A4B4957317411581457767A584A4B476E74480C584F6E6A5A4B4857317411581457767A584A4B446E74480C584F6E6A5A4B4B57317411581457767A584A4B456E74480C584F6E6A5A4B4A57310517560157273D135840572039041D58596E360B171F57767A82D5D79DE4D8485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890D7E582D5D757607A1C584057A9C3D792D5D86E254601581B6E624892F1C4A4F7C75856573A7A505892FEFDB0C5D7580860234814584F6EBFD8DE92DAE17A46580C57767A8DC8DE9DE3F54807560E6E364840589CDBE58FF7ED9DE3F5485658036E624893EDC8A9D5FD92D5D86E254601581B6E624893E5DCA4F7C75856573A7A505893EAE5B0C5D7580860234814584F6EBEFDDF92DAE17A46580C57767A8CEDDF9DE3F54807560E6E3648405890C9EE8FD4F957607A1C584057A9DDDC9FD4F66E253707560E6E330F03584F6EBEE4E89FCFC37A46581414213D48405893C2CA8FC0F557607A1C1B1600297A50210157227A50589CE2FAB1FDCE58596E2E4840580125350F580759377A04584057A8E2D09CCAE16E74480C584F6E30030E0957317411581457767A82D5FE90C4DE485658036E624809191A3E3D480727081174484E584F172348111F0C6E62481916143F2B4856581B2D350F584057ABE9D19FE4FE6E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E624893FAFCABFFEA5856573A7A505893F5C5BFCDFA580860234814584F6EBEE9FF9CF1D37A46580C57767A8CF9FF93C8C74807560E6E364840589DE2E782CAF257607A1C584057A4F6D592CAFD6E254601581B6E62489CE8D8AAD2CF5856573A7A50589CE7E1BEE0DF580860234814584F6EBEFDFF9CCDF47A46580C57767A8CEDFF93F4E04807560E6E364840589CD3EB8EC3EA57607A1C584057A5C7D99EC3E56E254601581B6E62489DC4FBA5FBF55856573A7A50589DCBC2B1C9E5580860234814584F6EBFD0D09FDBD27A46580C57767A8DC0D090E2C64807560E6E3648405893D7EA82F3C057607A1C584057AAC3D892F3CF6E254601581B6E62489DEEEAAAECD15856573A7A50589DE1D3BEDEC1580860234814584F6EBED2C29CFDC3BCD0E89FFFE47A46580C57767A8CC2C293C4D78EC0E890C6F04807560E6E364840589DF8FA8DC1F557607A1C584057A4ECC89DC1FA6E254601581B6E62489CCBF7A4D9E65856573A7A50589CC4CEB0EBF6580811254601581E2921484058143E3D0B5856572239071F584F6EBDF6CA9FF9F67A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FF3C9BDF6CA58596E2E48405890CADD8FE6CA57317411581457767A8CC2D590C3E8485658036E62489CC2DAA9D7DA580759377A04584057AACFCF93E5DC6E74480C584F6EBEFDDF93EAE57A17560157227A50589CD9EBBFD4F458596E2E48405893E0FF8DC4F457310517560157273D13584057353D0B0858596E360B171F57767A8FC3CE91F7E5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058477C695C5856573A7A505848457D6E4807560E6E36484058477C695F5856573A7A505848457D6D4807560E6E36484058477C695E5856573A7A505848457D6C4807560E6E36484058477C69595856573A7A505848457D6B4807560E6E36484058477C69585856573A7A505848457D6A4807560E6E36484058477C695B5856573A7A505848457D694807560E6E36484058477C695A5856573A7A505848457D6848072708602348111F0C6E6248161B1B2B7A46581414213D4840589DE3F582D2FA57607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8FE1C79DE3F5485658036E62489FE1C8A4F7C7580759377A04584057A4D3DB92D5D86E74480C584F6EB0E1CB92DAE17A17560157227A50589DC7E8B0C5D758596E2E48405892FEFC82D5D757317411581457767A83EDC790C1CF82D5D757607A1C584057A5CFD79FF7E2A4F7C7580759377A04584057A5C7C392D5D86E74480C584F6EB1F5D392DAE17A17560157227A50589CE2E9B0C5D758596E2E48405893DBFD82D5D757317411581457767A8FFFCC90E2DB485658036E62489FFFC3A9F6E9580728317411581110357A50589CFBDEBDD0F558596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBEFDCC93E2F87A46580C57767A1E1317106E254601581B6E62489EC0CFAAE8FE5856573A7A5058121C382B4807560E6E364840589DE3DC8FF2FC57607A1C5840573F3B05081F573105172707")));
                        break;
                    case 1646535597:
                        if (!z) {
                            m897d = atm.m897d("B1DCA1E997C1B1DDA1E397F0B1E0A1E997FDB1E2A1D497C2B1DBA1D297FCB1D2A1E997C7B1E6A1ED97FEB1E3A1ED97C0B1E3A1D297CEB1E2");
                            break;
                        } else {
                            m897d = atm.m897d("B1DCA1E297C4B1E2A1EE97C2B1E1A1E297CEB1E3A1E297CEB1ECA1EC97F4B1D8A1DE97F9B1E2A1EF97C3B1DCA1ED97F0B1D8A1EC");
                            break;
                        }
                }
            }
            JSONArray jSONArray = new JSONArray();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(C0052e.m1418a(new byte[]{-75}, new byte[]{-124, -62, -45, 23, 26, 12, -47, -122}), C0052e.m1418a(new byte[]{-64, -78, -86, -102, 13, -107}, new byte[]{39, 38, 31, Byte.MAX_VALUE, -80, 36, -64, -79}));
            linkedHashMap.put(C0052e.m1418a(new byte[]{42}, new byte[]{24, 106, 116, 18, 8, -53, -77, 6}), C0052e.m1418a(new byte[]{102, -71, -57, -84, -32, -113, -27, -49, 41}, new byte[]{-114, 6, 89, 75, 91, 34, 0, 70}));
            linkedHashMap.put(C0052e.m1418a(new byte[]{-48}, new byte[]{-29, 12, 126, 28, 67, 65, 37, 80}), C0052e.m1418a(new byte[]{-53, 6, 31, 31, 65, -98}, new byte[]{46, -116, -73, -7, -3, 53, 122, 105}));
            linkedHashMap.put(C0052e.m1418a(new byte[]{-48}, new byte[]{-28, -115, 89, -14, -94, -124, 47, 21}), C0052e.m1418a(new byte[]{-48, 96, -37, 13, -113, -73}, new byte[]{55, -37, 103, -27, 6, 13, 47, -99}));
            Iterator it = linkedHashMap.keySet().iterator();
            while (true) {
                String m897d2 = atm.m897d("B1D2A1EF97C3B1D2A1D997FDB1EDA1EA97CEB1E2A1EE97F4B1DDA1D597F0B1E2A1EF97F9B1D2");
                while (true) {
                    switch (m897d2.hashCode() ^ 670980157) {
                        case -999922440:
                            m897d2 = it.hasNext() ? atm.m897d("B1DAA1D397C2B1D8A1D797F8B1D1A1D497FDB1E2A1ED97C1B1E5A1E997F3B1E2A1ED97FEB1DBA1D1") : atm.m897d("B1D1A1D597FFB1E3A1E397C4B1E5A1DE97C4B1E2A1EF97C2B1D8A1E297C1B1D2A1EA97C4B1DB");
                        case -522197652:
                            m897d2 = atm.m897d("B1DAA1ED97C2B1D1A1D197FAB1D8A1EA97F4B1D2A1E997FCB1ECA1E297F0B1E2A1D297F8B1DCA1ED97F9B1E0A1EE97C3B1DCA1EE97F8B1E6A1D7");
                        case 104056502:
                            jSONObject.put(C0052e.m1418a(new byte[]{-96, 18, 72, 8, -54}, new byte[]{-61, 126, 41, 123, -71, 18, 19, -11}), jSONArray);
                            return jSONObject.toString();
                        case 1677049865:
                            break;
                    }
                }
                String str = (String) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C0052e.m1418a(new byte[]{-37, 107, 20, 8, -48, 94, 64}, new byte[]{-81, 18, 100, 109, -113, 55, 36, -1}), str);
                jSONObject2.put(C0052e.m1418a(new byte[]{-6, 80, -72, 82, -64, -16, 39, 119, -21}, new byte[]{-114, 41, -56, 55, -97, -98, 70, 26}), linkedHashMap.get(str));
                jSONArray.put(jSONObject2);
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeVideoContent() {
        JSONArray optJSONArray;
        JSONArray jSONArray;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            String m295c = m295c(f1058g + C0052e.m1418a(new byte[]{-126, 102, -79, -87, -67, 52, 7, -102, -39, 96, -87, -73, -70, 38, 5, -52, -39, 124, -76, -66, -116, 60, 21, -50, -99}, new byte[]{-83, 5, -60, -37, -45, 85, 113, -13}));
            String m307f = C0574b.m307f(m295c, m294d(), null);
            String m897d = atm.m897d("B1DDA1E297C7B1E5A1D297F9B1E2A1D197CFB1E6A1D197F0B1ECA1ED97FDB1E2A1ED97C0B1E3A1D497F9B1DAA1EA97CFB1D8A1D797F9B1E1A1EE97F0B1E2");
            while (true) {
                switch (m897d.hashCode() ^ (-1139858598)) {
                    case -2143439331:
                        m897d = atm.m897d("B1DEA1D197F3B1E0A1EF97C4B1E2A1EC97F9B1E6A1ED97F0B1ECA1D197FCB1E5A1EF");
                        break;
                    case 165887374:
                        m296b();
                        m307f = C0574b.m307f(m295c, m294d(), null);
                        break;
                    case 1078897881:
                        break;
                    case 1632622404:
                        if (!m307f.contains(C0052e.m1418a(new byte[]{50, 62, -76, -126, 74, 44, -79, -90, 111, 85, -123, -30}, new byte[]{-44, -68, 28, 100, -42, -122, 86, 63}))) {
                            m897d = atm.m897d("B1ECA1E297F3B1E0A1D097FDB1DDA1EF97FAB1E0A1D997F0B1DFA1D397C3");
                            break;
                        } else {
                            m897d = atm.m897d("B1E0A1EA97F9B1E2A1EE97FEB1E3A1D397F0B1DCA1D997C3B1DFA1DE");
                            break;
                        }
                }
            }
            System.out.println(m307f);
            optJSONArray = new JSONObject(m307f).optJSONObject(C0052e.m1418a(new byte[]{-92, 25, 98, 95}, new byte[]{-64, 120, 22, 62, 54, 60, 100, -111})).optJSONArray(C0052e.m1418a(new byte[]{-116, -115, 60, 28, -32, -60, 35, -79, -116, -114}, new byte[]{-1, -6, 85, 108, -123, -74, 111, -40}));
            jSONArray = new JSONArray();
            i = 0;
        } catch (Exception e2) {
            e = e2;
            SpiderDebug.log(e);
            return jSONObject.toString();
        }
        while (true) {
            String m897d2 = atm.m897d("B1EDA1E397C1B1D8A1ED97F0B1E2A1EC97C1B1E3A1D997F8B1ECA1ED97CEB1D1A1D497CFB1E0A1EE");
            while (true) {
                switch (m897d2.hashCode() ^ 1803993253) {
                    case -1560684392:
                        break;
                    case -1225879824:
                        jSONObject.put(C0052e.m1418a(new byte[]{93, -28, -65, -6}, new byte[]{49, -115, -52, -114, -48, -48, 91, -43}), jSONArray);
                        break;
                    case -500163970:
                        m897d2 = i < optJSONArray.length() ? atm.m897d("B1E1A1D597F4B1E6A1EA97C7B1E1A1EE97F0B1ECA1DE97FEB1DFA1D597F0B1E2A1DD97FCB1DD") : atm.m897d("B1D6A1DD97FFB1DFA1EE97C0B1E2A1D197F9B1E5A1ED97FAB1D2A1DE97F8B1DCA1D397F0B1D6A1EA97C2B1DCA1ED97C2B1E3A1E2");
                    case -67673913:
                        m897d2 = atm.m897d("B1E5A1ED97FEB1E2A1D497CEB1DBA1ED97C3B1DCA1D397FFB1DCA1EA97F8B1E0A1EC97F8B1E0A1EF");
                }
            }
            return jSONObject.toString();
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C0052e.m1418a(new byte[]{26, -13, 15, 26, -16, 96}, new byte[]{108, -100, 107, 69, -103, 4, -99, -6}), jSONObject2.getString(C0052e.m1418a(new byte[]{86, 61, -57, -23, -80, -25}, new byte[]{32, 82, -93, -74, -39, -125, 53, 28})));
            jSONObject3.put(C0052e.m1418a(new byte[]{27, -51, 91, -120, -68, 1, -11, 99}, new byte[]{109, -94, 63, -41, -46, 96, -104, 6}), jSONObject2.getString(C0052e.m1418a(new byte[]{-48, 43, -108, 51, -124, 69, 43, 68}, new byte[]{-90, 68, -16, 108, -22, 36, 70, 33})));
            jSONObject3.put(C0052e.m1418a(new byte[]{-119, -48, 28, Byte.MAX_VALUE, -59, 7, 49}, new byte[]{-1, -65, 120, 32, -75, 110, 82, 117}), jSONObject2.getString(C0052e.m1418a(new byte[]{-67, 58, -99, -113, 31, 102, -42}, new byte[]{-53, 85, -7, -48, 111, 15, -75, 66})));
            jSONObject3.put(C0052e.m1418a(new byte[]{98, 46, 17, 23, -6, -121, 3, -53, 102, 42, 6}, new byte[]{20, 65, 117, 72, -120, -30, 110, -86}), jSONObject2.getString(C0052e.m1418a(new byte[]{-97, -110, 59, -41, -69, 90, 25, 32, -101, -106, 44}, new byte[]{-23, -3, 95, -120, -55, 63, 116, 65})));
            jSONArray.put(jSONObject3);
            i++;
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final void init(Context context) {
        super.init(context);
        try {
            JSONArray jSONArray = new JSONObject(new String(m297a(Base64.decode(C0574b.m307f(C0052e.m1418a(new byte[]{-89, 37, 29, 96, -76, -93, -30, 4, -65, 56, 71, 100, -6, -71, -11, 75, -69, 39, 70, 115, -31, -30, -85, 12, -88, 126, 29, 100, -6, -6, -29, 15, -68, 62, 7}, new byte[]{-49, 81, 105, 16, -114, -116, -51, 101}), null, null), 2), this.f1059b.getBytes(), this.f1060c.getBytes(), C0052e.m1418a(new byte[]{-117, -75, 112, 120, -52, -62, -19, 21, -102, -69, 96, 4, -70, -58, -34, 94, -82, -103, 77, 48}, new byte[]{-54, -16, 35, 87, -113, -106, -65, 58})))).getJSONArray(C0052e.m1418a(new byte[]{-33, -106, 60, 82, -17}, new byte[]{-84, -1, 72, 55, -100, 7, -100, -63}));
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1DAA1D797C7B1D8A1D597F0B1D2A1E997FDB1E2A1EA97FAB1DDA1D597C3B1DCA1E997FFB1E6A1D597F4B1E1");
                while (true) {
                    switch (m897d.hashCode() ^ (-412998718)) {
                        case -2092984425:
                            m897d = atm.m897d("B1E5A1D997F9B1E2A1EE97FEB1E2A1EA97F0B1E5A1EF97C3B1D1A1D597C2B1D1A1E397FDB1E1A1E397F8");
                        case -1872723072:
                            String m897d2 = atm.m897d("B1DAA1E997C0B1D2A1E397FDB1E2A1D497C1B1E5A1ED97C3B1E2A1ED97FDB1E5A1E997C0B1E6A1EF97FEB1E2A1E997C3B1D6");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1319440794)) {
                                    case -1091001206:
                                        break;
                                    case 146016853:
                                        m897d2 = atm.m897d("B1DFA1DE97FDB1E6A1EC97CEB1E2A1EC97FFB1E6A1E297C7B1DFA1ED97CFB1D8A1DD");
                                        break;
                                    case 721603580:
                                        if (!C0649a.m153c(C0052e.m1418a(new byte[]{98, 42, 42, 37, 29}, new byte[]{54, 126, 65, 64, 100, 21, -93, 16})).isEmpty()) {
                                            m897d2 = atm.m897d("B1DCA1D497F9B1D2A1D297C1B1EDA1EC97CEB1E2A1D397FAB1E5A1D497FAB1DBA1ED97C7B1ECA1EA97F3B1DCA1D097C0");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1D8A1E297FCB1E2A1EA97FEB1E2A1ED97C3B1DFA1ED97C3B1D1A1EF97F9B1D8A1EC97FCB1E3A1D797FCB1E3A1EF97C7B1DAA1D497F0");
                                            break;
                                        }
                                    case 1123637172:
                                        String m897d3 = atm.m897d("B1DDA1DE97C0B1DAA1D397C4B1D1A1D797FAB1DEA1E997C3B1DFA1D197F8");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1557360431) {
                                                case -2092691714:
                                                    m897d3 = atm.m897d("B1D8A1EA97F4B1E0A1E397FFB1EDA1D097C7B1DFA1DD97FEB1DDA1D997F0B1E3A1E297C0B1DEA1D397FDB1DCA1DE97C2B1ECA1E997F8");
                                                    break;
                                                case -1413486862:
                                                    break;
                                                case -285680504:
                                                    if (!C0649a.m153c(C0052e.m1418a(new byte[]{12, 20, 76, 126}, new byte[]{88, 64, 37, 8, -50, Byte.MIN_VALUE, -116, 62})).isEmpty()) {
                                                        m897d3 = atm.m897d("B1EDA1ED97FFB1E2A1EF97F3B1ECA1ED97C0B1DDA1EE97CFB1DFA1DD97F8B1D2A1ED");
                                                        break;
                                                    } else {
                                                        m897d3 = atm.m897d("B1E1A1EE97F0B1E2A1EC97C0B1D2A1D997FDB1D2A1D197C0B1D2A1ED97C3B1DBA1E997FFB1DBA1EC97FFB1E0A1D2");
                                                        break;
                                                    }
                                                case 1869729004:
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            m296b();
                            this.f1061d = C0649a.m153c(C0052e.m1418a(new byte[]{30, -46, 13, -118, 96}, new byte[]{74, -122, 102, -17, 25, 25, -98, 24}));
                            this.f1062e = C0649a.m153c(C0052e.m1418a(new byte[]{95, 103, -53, 54}, new byte[]{11, 51, -94, 64, 15, -70, 120, -43}));
                            return;
                        case -1524422501:
                            m897d = i < jSONArray.length() ? atm.m897d("B1D1A1ED97C2B1D8A1E397FFB1DAA1EE97C1B1DCA1E297F8B1E1A1EF97F3") : atm.m897d("B1E6A1D097FCB1D8A1D397CEB1E2A1D797FCB1E6A1EF97C7B1DEA1DD");
                        case -1105357792:
                            String m897d4 = atm.m897d("B1E5A1E997FAB1D2A1D597CEB1D1A1D797FCB1D6A1D197FDB1D2A1D497FCB1ECA1EC97C0");
                            while (true) {
                                switch (m897d4.hashCode() ^ 998544777) {
                                    case -1833918838:
                                        m897d4 = jSONArray.getJSONObject(i).getString(C0052e.m1418a(new byte[]{-113, 44, -84}, new byte[]{-18, 92, -59, -25, 66, 118, -96, 95})).contains(C0052e.m1418a(new byte[]{121, 75, -12, -63, -119}, new byte[]{56, 59, -124, -107, -35, 84, -19, -35})) ? atm.m897d("B1D8A1E297F9B1E5A1E997CFB1E6A1D597F9B1E2A1D297FDB1DDA1E297C0B1ECA1ED97FCB1D2A1D3") : atm.m897d("B1E1A1D997FAB1D2A1D497C2B1E5A1EF97F0B1E2A1EE97FFB1DCA1ED97FFB1E5A1ED");
                                    case -1655149714:
                                        break;
                                    case -1375262890:
                                        m897d4 = atm.m897d("B1D2A1D097C4B1DFA1E997F4B1DAA1D997F0B1E2A1D097C1B1ECA1ED97C2B1E2A1D3");
                                    case 1417468745:
                                        f1058g = jSONArray.getJSONObject(i).getString(C0052e.m1418a(new byte[]{-117, 96, -126}, new byte[]{-18, 24, -10, 114, -18, 60, 108, -113})) + C0052e.m1418a(new byte[]{-4, -12, -84, -36, 12, -54, -112, 103, -21, -75, -21, -124, 19, -58}, new byte[]{-99, -124, -59, -14, 124, -94, -32, 72});
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
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final boolean isVideoFormat(String str) {
        String m897d = atm.m897d("B1DBA1D997C7B1DCA1D197F8B1DEA1E297F8B1E5A1E297F8B1EDA1D597F3B1E1A1EE97F9B1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 393) ^ 1588020243) {
                case 631671814:
                    m897d = atm.m897d("B1D1A1E297C4B1E2A1DE97CFB1DBA1D597F0B1ECA1ED97C7B1D8A1EF97F9B1E0A1D097C7B1DDA1D997F9B1D1A1E397C0B1DEA1D997F9");
                    break;
                case 1662979850:
                    m897d = atm.m897d("B1DCA1D497F4B1E2A1E997F4B1DBA1DE97C0B1DBA1E397F4B1DFA1E297CEB1E2A1E397F4B1DCA1ED");
                    break;
                case 2064066031:
                    return super.isVideoFormat(str);
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final boolean manualVideoCheck() {
        String m897d = atm.m897d("B1D8A1EE97C4B1DCA1EE97C7B1DAA1D397C3B1DDA1EE97F9B1E2A1ED97CFB1DBA1ED97FCB1DBA1D297C0B1DFA1DD97FFB1E3A1EC97FDB1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 297) ^ 1245587973) {
                case -75164042:
                    m897d = atm.m897d("B1DDA1E297F0B1E2A1D397F4B1DCA1ED97C2B1DEA1ED97C0B1DCA1E397FFB1E2A1D197F9B1E0");
                    break;
                case 237833782:
                    return super.manualVideoCheck();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0052e.m1418a(new byte[]{-73, 80, 98, 51, 50}, new byte[]{-57, 49, 16, 64, 87, -110, -45, -55}), C0052e.m1418a(new byte[]{Byte.MIN_VALUE}, new byte[]{-80, 121, 84, -56, Byte.MIN_VALUE, 35, 47, 122}));
            String m897d = atm.m897d("B1DCA1E297C1B1E6A1EC97C7B1E5A1D997FEB1ECA1D797F0B1ECA1E397FEB1E2A1EC97C4B1E1A1D097C1B1E2A1ED97FDB1E6A1D7");
            while (true) {
                switch (m897d.hashCode() ^ (-1012296636)) {
                    case -700322585:
                        m897d = atm.m897d("B1DEA1D397F0B1E2A1D097F3B1DCA1EE97F0B1DCA1ED97FEB1E5A1E397C0B1EDA1DE97F0B1E2A1D797F8B1DEA1EA97C2B1EDA1D297F9B1DFA1D297CFB1E3");
                        break;
                    case -563993948:
                        jSONObject.put(C0052e.m1418a(new byte[]{106, -85, 41}, new byte[]{31, -39, 69, -117, -28, -31, -47, 99}), str2);
                        break;
                    case -242202230:
                        if (!C0652d.m143h(str2)) {
                            m897d = atm.m897d("B1D2A1D197CEB1E2A1D997C4B1D2A1ED97F9B1E1A1EF97F3B1E1A1ED97C3B1DEA1EF97C2B1DFA1E397C0");
                            break;
                        } else {
                            m897d = atm.m897d("B1EDA1D597C2B1DAA1ED97CEB1E2A1E997F9B1DCA1ED97F4B1DCA1D397C0B1E6A1D097FFB1E2A1EF97C3B1D2A1ED97FDB1E5A1D297C2B1D6A1EC97F8B1D6A1D7");
                            break;
                        }
                    case 979690812:
                        String m897d2 = atm.m897d("B1E0A1D597F8B1E2A1E397C2B1E0A1ED97C0B1E6A1D197C0B1ECA1DD97FDB1D8A1EF97F9B1DEA1D497C2B1ECA1EF97F4");
                        while (true) {
                            switch (m897d2.hashCode() ^ 1588503113) {
                                case -1287124165:
                                    jSONObject.put(C0052e.m1418a(new byte[]{-17, 82, -8}, new byte[]{-102, 32, -108, -6, 88, 4, 60, 67}), new JSONObject(new String(m297a(Base64.decode(C0574b.m307f(m295c(((String) ((List) this.f1063f.get(str)).get(0)) + str2), m294d(), null), 2), this.f1061d.getBytes(), this.f1062e.getBytes(), C0052e.m1418a(new byte[]{-19, 44, 22, 31, 13, 72, -104, -101, -4, 34, 6, 99, 123, 76, -85, -48, -56, 0, 43, 87}, new byte[]{-84, 105, 69, 48, 78, 28, -54, -76})))).optString(C0052e.m1418a(new byte[]{90, -89, 81}, new byte[]{47, -43, 61, -62, -103, 111, -38, 77})));
                                    break;
                                case -1178638881:
                                    m897d2 = atm.m897d("B1E3A1EE97C7B1EDA1D297C1B1E1A1D497F9B1E2A1D797FAB1E5A1D097F3B1DBA1ED97FAB1EDA1EC97FAB1E6A1D497C4B1D6A1D397C0B1D1A1E297CE");
                                    break;
                                case 54729712:
                                    if (!this.f1063f.containsKey(str)) {
                                        m897d2 = atm.m897d("B1D2A1DD97FEB1E5A1D797F0B1E2A1D797C7B1E2A1D197FAB1E3A1D997C1B1DBA1ED97F8B1D1A1D797FAB1E3A1DE97FEB1E6A1E997C0B1D2A1DD97F4");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1DBA1D297CFB1DBA1D497C2B1E5A1E397C0B1E2A1D297F8B1EDA1D197FDB1DBA1D797FDB1E3A1EE97FEB1DBA1ED");
                                        break;
                                    }
                                case 1659047625:
                                    break;
                            }
                        }
                        break;
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        JSONArray optJSONArray;
        JSONArray jSONArray;
        int i;
        String m897d = atm.m897d("B1E3A1EE97C4B1E2A1EA97FAB1E2A1E297FAB1E6A1ED97C3B1EDA1DD97C1B1E6A1D997FEB1ECA1D197C4B1DAA1D397FCB1D6A1D097F3B1E2");
        while (true) {
            switch (m897d.hashCode() ^ (-1233561938)) {
                case -1419346225:
                    if (!z) {
                        m897d = atm.m897d("B1DAA1EA97FDB1D6A1E997F0B1D8A1D497C7B1D1A1D497C4B1E2A1E297FDB1DBA1ED97C7B1D6A1D097C0B1E6A1EF97FFB1D6A1DE97FDB1E0A1D097CE");
                        break;
                    } else {
                        m897d = atm.m897d("B1E1A1D297C2B1E6A1D097C1B1E2A1ED97C4B1D6A1D597CFB1D2A1D497FFB1DBA1E997FAB1EDA1ED97F8");
                        break;
                    }
                case -457671252:
                    return "";
                case -5962329:
                    JSONObject jSONObject = new JSONObject();
                    try {
                        try {
                            optJSONArray = new JSONObject(C0574b.m307f(m295c(f1058g + C0052e.m1418a(new byte[]{122, 115, 92, -41}, new byte[]{69, 4, 56, -22, -29, -86, -103, -9}) + str + C0052e.m1418a(new byte[]{-37, 2, 73, 69, 117, -42}, new byte[]{-3, 114, 40, 34, 16, -21, -104, -63})), m294d(), null)).optJSONObject(C0052e.m1418a(new byte[]{-119, 13, -6, -75}, new byte[]{-19, 108, -114, -44, 101, 19, 114, -65})).optJSONArray(C0052e.m1418a(new byte[]{-19, -8, 120, 0}, new byte[]{-127, -111, 11, 116, 125, 42, 102, 23}));
                            jSONArray = new JSONArray();
                            i = 0;
                        } catch (Exception e) {
                        }
                    } catch (Exception e2) {
                    }
                    while (true) {
                        String m897d2 = atm.m897d("B1E5A1E297F9B1ECA1EA97CEB1E0A1EC97F8B1D2A1D097C0B1E2A1E397F3B1E2A1ED97CFB1EDA1EF97F9B1E1A1DD97C2B1DBA1D9");
                        while (true) {
                            switch (m897d2.hashCode() ^ 1982874110) {
                                case -1936129579:
                                    m897d2 = atm.m897d("B1D6A1EA97F0B1E2A1E997C2B1E3A1D497C3B1D6A1D197CEB1ECA1ED97F4B1DEA1EA97CFB1D6A1EF97F4B1EDA1EA97C1B1D6A1D5");
                                case -986035538:
                                    jSONObject.put(C0052e.m1418a(new byte[]{-71, -58, -71, 94}, new byte[]{-43, -81, -54, 42, 59, -4, 103, -4}), jSONArray);
                                    break;
                                case -447580197:
                                    break;
                                case -224959172:
                                    m897d2 = i < optJSONArray.length() ? atm.m897d("B1DBA1E297C0B1E2A1EA97FDB1DFA1EA97FDB1D1A1D097CFB1DDA1E297F3B1E2A1D997C7B1DBA1EF97C0B1E2A1D997FDB1DBA1DE97FFB1E2") : atm.m897d("B1D8A1E297F4B1E3A1ED97C0B1E2A1D297F3B1DEA1DD97C1B1EDA1E397F4B1DFA1ED97C3B1DC");
                            }
                        }
                        return jSONObject.toString();
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(C0052e.m1418a(new byte[]{-64, 94, 47, -92, -63, 81}, new byte[]{-74, 49, 75, -5, -88, 53, 126, -54}), jSONObject2.optString(C0052e.m1418a(new byte[]{-22, -75, -5, 74, 56, -12}, new byte[]{-100, -38, -97, 21, 81, -112, -110, 119})));
                        jSONObject3.put(C0052e.m1418a(new byte[]{29, 49, -25, 124, -121, 126, 19, -31}, new byte[]{107, 94, -125, 35, -23, 31, 126, -124}), jSONObject2.optString(C0052e.m1418a(new byte[]{-79, 0, 41, -15, -98, 51, 51, -84}, new byte[]{-57, 111, 77, -82, -16, 82, 94, -55})));
                        jSONObject3.put(C0052e.m1418a(new byte[]{109, -8, -48, -40, -96, 28, -62}, new byte[]{27, -105, -76, -121, -48, 117, -95, -1}), jSONObject2.optString(C0052e.m1418a(new byte[]{-40, -112, -13, 51, 49, 1, -33}, new byte[]{-82, -1, -105, 108, 65, 104, -68, -34})));
                        jSONObject3.put(C0052e.m1418a(new byte[]{13, -50, -100, -4, -120, -94, 100, 33, 9, -54, -117}, new byte[]{123, -95, -8, -93, -6, -57, 9, 64}), jSONObject2.optString(C0052e.m1418a(new byte[]{-69, 28, 94, -66, -18, 91, 37, -7, -65, 24, 73}, new byte[]{-51, 115, 58, -31, -100, 62, 72, -104})));
                        jSONArray.put(jSONObject3);
                        i++;
                        break;
                    }
                case 1923339731:
                    m897d = atm.m897d("B1DEA1D297FDB1E1A1ED97C3B1D6A1D397F8B1E1A1D797C0B1E2A1D797CEB1E2A1D797C3B1DAA1E397FDB1E2A1E397F9B1D8");
                    break;
            }
        }
    }
}
