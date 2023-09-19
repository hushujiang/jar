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
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.n */
/* loaded from: classes.dex */
public final class C0599n extends Dora {

    /* renamed from: i */
    private static final String f1115i;

    /* renamed from: b */
    protected JSONObject f1116b;

    /* renamed from: c */
    protected JSONObject f1117c;

    /* renamed from: d */
    protected Pattern f1118d = Pattern.compile(C0052e.m1418a(new byte[]{117, -67, 34, 117, 118, 70, -104, 0, 117, -29, 17, 117, 41, 22, -57}, new byte[]{90, -53, 77, 17, 2, 63, -24, 101}));

    /* renamed from: e */
    protected Pattern f1119e = Pattern.compile(C0052e.m1418a(new byte[]{28, -107, -73, 80, -90, 35, -50, 94, 90, -113, -9, 28, -98, 34, -111, 22, 28}, new byte[]{51, -29, -40, 52, -62, 70, -70, 63}));

    /* renamed from: f */
    protected Pattern f1120f = Pattern.compile(C0052e.m1418a(new byte[]{78, 4, 89, -2, 48, -38, -73, -12, 78, 90, 106, -2, 107, -97, -5, -91, 61, 22, 29, -77, 109, -98, -118, -23, 74, 91, 25}, new byte[]{97, 114, 54, -102, 64, -74, -42, -115}));

    /* renamed from: g */
    protected Pattern f1121g = Pattern.compile(C0052e.m1418a(new byte[]{-84, -105, 122, 103, 87, -124, -31, 0, -84, -67, 113, 40, 9, -63, -93, 90, -82, -52, 56, 46, 12, -80, -22, 92, -86, -52, 56, 46, 11}, new byte[]{-125, -31, 21, 3, 36, -20, -114, 119}));

    /* renamed from: h */
    private final String f1122h = C0052e.m1418a(new byte[]{8, 101, 9, 96, 126, 92, -102, -126, 81, 125, 30, 56, 96, 7, Byte.MIN_VALUE, -51, 81, 125, 71, -14, Byte.MIN_VALUE, -14, 10, 63, -6, -96, -33, -91, -5, -40, 64, 85, -49, -49, -125, Byte.MIN_VALUE, -111, -119, 120, 12, -100, -5, -20, 56, 63, 77, -117, -33, 0, 101, 95, 56, 49, 67, -51, -54, 0, 101, 95, 56, 34, 77, -61, -104, 3, 38, 23, 105, 118, 77, -43, -104, 27, 51, 17, 106, 96, 85, -64, -107, 16, 42, 22, 52, 122, 4, -114, -44, 10, 52, 75, 110, 101, 64, -122, -47, 18, 41, 7, 124, 98, 2, -102, -45, 92, 41, 12, 121, 114, 6, -115, -49, 23, 38, 10, 109, 124, 21, -114, -45, 29, 38, 75, 106, 123, 31, -48, -49, 1, 43, 88, 56, 110, 67, -51, -42, 22, 44, 4, 116, 105, 22, -104, -104, 73, 60, 71, 105, 123, 0, -104, -104, 73, 101, -126, -110, -94, -120, 115, 49, -105, -1, -10, -3, -121, -57, 0, 6, -5, -93, -39, -126, -10, -22, 103, 92, -3, -17, -115, -105, -125, Byte.MIN_VALUE, 83, 51, 81, 107, 71, 126, 118, 28, -51, Byte.MIN_VALUE, 81, 101, 73, 56, 99, 28, -51, Byte.MIN_VALUE, 81, 118, 71, 54, 49, 31, -114, -56, 0, 34, 71, 32, 49, 7, -101, -50, 3, 52, 95, 53, 60, 12, -126, -55, 93, 46, 14, 123, 125, 22, -100, -108, 7, 49, 74, 115, 120, 14, -127, -40, 21, 54, 8, 111, 122, 64, -127, -45, 16, 38, 12, 120, 102, 11, -114, -43, 4, 40, 31, 123, 122, 1, -114, -108, 3, 47, 21, 37, 102, 29, -125, -121, 81, 58, 73, 56, 117, 9, -126, -119, 6, Byte.MAX_VALUE, 71, 32, 104, 77, -100, -46, 28, 48, 71, 32, 49, -121, 124, 39, -106, -62, -20, -3, -87, -48, 7, 13, -36, 117, -118, -90, -101, -119, 117, 56, -107, -48, -45, -11, -81, -26, -51, -106, 81, 35, 0, 105, 49, 85, -51, -104, 95, 101, 21, 105, 49, 85, -51, -117, 81, 107, 71, 106, 114, 29, -100, -33, 81, 125, 71, 114, 103, 27, -97, -55, 73, 104, 74, 121, 126, 28, -63, -45, 24, 38, 11, 99, 96, 65, -101, -52, 92, 46, 14, 123, 125, 13, -119, -53, 30, 50, 12, 53, 125, 6, -116, -37, 26, 37, 16, 126, 114, 0, -104, -43, 9, 38, 12, 116, 114, 65, -97, -46, 3, 120, 16, 104, Byte.MAX_VALUE, 82, -51, -57, 14}, new byte[]{115, 71, 101, 26, 19, 111, -17, -70});

    static {
        String m897d = atm.m897d("B1EDA1D997F9B1E2A1D197C7B1DAA1EF97F8B1E2A1D497CFB1E6A1DD97FDB1DEA1EC97C3B1DFA1D397FCB1E6A1DE97C0B1E2A1EE97FAB1E0");
        while (true) {
            switch ((m897d.hashCode() ^ 18) ^ (-1821084612)) {
                case 317899155:
                    f1115i = C0052e.m1418a(new byte[]{-43, 70, -37, -15, 87, 59, -1, -105, -44, 89, -50, -17, 93, 114, -2, -52, -53}, new byte[]{-67, 50, -81, -127, 36, 1, -48, -72});
                    m897d = atm.m897d("B1D1A1D497FAB1DCA1EA97C2B1DDA1D997C0B1DDA1D497FDB1E2A1E397F9B1DFA1D297FEB1DAA1D297F8B1D2");
                    break;
                case 543458863:
                    return;
                case 1773018419:
                    C0052e.m1418a(new byte[]{-60, 104, 9, -119, -57, 41, 114, -114, -37}, new byte[]{-83, 3, 104, -25, -66, 90, 92, -6});
                    m897d = atm.m897d("B1DCA1EE97FCB1DCA1D797CEB1ECA1EA97C4B1E2A1E997F8B1DCA1ED97C4B1D6A1E397C7B1DAA1ED97C0");
                    break;
            }
        }
    }

    /* renamed from: a */
    protected final HashMap<String, String> m274a(String str) {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1ECA1DE97F8B1DFA1D497C4B1E2A1D797FCB1D6A1D397F4B1D1A1EE97C3B1DFA1E397F0B1E2A1D497F8B1DBA1D497C2B1DBA1ED97FFB1E1A1D097C0");
        while (true) {
            switch ((m897d.hashCode() ^ 960) ^ 915386239) {
                case -1434807217:
                    String m897d2 = atm.m897d("B1DEA1D797C0B1E2A1DE97F8B1D2A1ED97F8B1DEA1D297F4B1D6A1D597F0B1DDA1E3");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-22473351)) {
                            case -1278722533:
                                m897d2 = atm.m897d("B1E5A1ED97FFB1E1A1D397FDB1E2A1DD97C7B1DBA1ED97CEB1DEA1EC97F9B1DBA1ED97FDB1DCA1E997F9B1E3A1D4");
                            case 1202984684:
                                m897d = atm.m897d("B1E0A1DD97C0B1E2A1EA97CEB1D2A1EA97C3B1DFA1D497FFB1DEA1EE97C2");
                                continue;
                            case 1629542318:
                                m897d2 = !TextUtils.isEmpty(str) ? atm.m897d("B1E0A1E297F8B1EDA1EA97FDB1D2A1E997C0B1E6A1D797F0B1ECA1D597F3B1D6A1D997C3B1DAA1D397C2") : atm.m897d("B1E3A1E997F0B1D2A1EC97F9B1E2A1D397C3B1DCA1ED97F8B1D8A1E997FCB1DCA1E997C0B1D8A1EC97F0");
                            case 1988106612:
                                m897d = atm.m897d("B1DCA1D997F3B1E2A1D397F9B1E2A1EE97CEB1ECA1EC97FAB1E0A1ED97CEB1ECA1D497FEB1E3A1D097F0B1D2A1D097FD");
                                continue;
                        }
                    }
                    break;
                case -1404797409:
                    hashMap.put(C0052e.m1418a(new byte[]{3, -49, -22, -76, 35, -97}, new byte[]{110, -86, -98, -36, 76, -5, -42, -53}), C0052e.m1418a(new byte[]{-9, 51, -126}, new byte[]{-80, 118, -42, 109, 80, -1, -39, 25}));
                    m897d = atm.m897d("B1D1A1D197FAB1E6A1EC97C7B1DFA1DD97C2B1D1A1D197FCB1EDA1D297C4B1D2A1ED97FCB1E3A1D097CFB1E5A1EC");
                    break;
                case -18756730:
                    return hashMap;
                case 873664261:
                    m897d = atm.m897d("B1D1A1D997F8B1DDA1D597FEB1DDA1EA97C2B1D8A1DE97FCB1D2A1DD97C0B1EDA1DE97F9B1E2A1EF97C2B1E3A1EE97FFB1D6A1EC97CFB1DB");
                    break;
                case 901866694:
                    hashMap.put(C0052e.m1418a(new byte[]{46, 64, -39, 88, 101, -26}, new byte[]{111, 35, -70, 61, 21, -110, -113, -111}), C0052e.m1418a(new byte[]{96, -116, 119, 92, -98, -43, 48, -121, 120, -59, 110, 88, -63, -47, 45, -119, 117, -99, 102, 71, -33, -110, 60, -126, 96, -124, 99, 3, -55, -48, 40, -58, 117, -103, Byte.MAX_VALUE, 68, -40, -34, 37, -98, 125, -122, 97, 7, -55, -48, 40, -47, 101, -44, 63, 6, -120, -111, 45, -121, 117, -114, 106, 7, -58, -40, 38, -102, 56, -61, 32, 2, -118, -52, 121, -38, 58, -47}, new byte[]{20, -23, 15, 40, -79, -67, 68, -22}));
                    m897d = atm.m897d("B1DAA1DE97F3B1ECA1ED97FFB1E2A1EC97FEB1D6A1EA97CEB1ECA1ED97FCB1E2");
                    break;
                case 950283112:
                    hashMap.put(C0052e.m1418a(new byte[]{117, 113, -30, 59, 60, 0, -112}, new byte[]{39, 20, -124, 94, 78, 101, -30, 24}), str);
                    m897d = atm.m897d("B1DCA1D997F3B1E2A1D397F9B1E2A1EE97CEB1ECA1EC97FAB1E0A1ED97CEB1ECA1D497FEB1E3A1D097F0B1D2A1D097FD");
                    break;
                case 1033183894:
                    hashMap.put(C0052e.m1418a(new byte[]{-55, 67, 96, -108, -21, -110, 20, -20, -14, 68}, new byte[]{-100, 48, 5, -26, -58, -45, 115, -119}), C0052e.m1418a(new byte[]{27, 97, 117, -30, -38, 22, 73, -110, 99, 32, 63, -85, -98, 55, 73, -34, 63, 96, 123, -28, -59, 18, 19, -99, 31, 96, 123, -18, -38, 90, 101, -36, 53, 46, 64, -40, -106, 34, 8, -116, 102, 81, 62, -66, -23, 77, 1, -99, 23, 126, Byte.MAX_VALUE, -25, -45, 45, 77, -33, 29, 103, 123, -92, -125, 73, 31, -109, 101, 56, 47, -93, -3, 50, 124, -16, 26, 34, 47, -25, -33, 17, 77, -99, 17, 107, 108, -32, -39, 83, 8, -2, 62, 124, 96, -26, -45, 85, 17, -116, 120, 62, 33, -65, -126, 77, 26, -109, 103, 63, 59, -85, -27, 27, 78, -36, 36, 103, 32, -66, -123, 77, 6, -114, 96}, new byte[]{86, 14, 15, -117, -74, 122, 40, -67}));
                    m897d = atm.m897d("B1D8A1E397CFB1ECA1D497FCB1DCA1EA97F9B1E2A1D397C1B1E2A1ED97C2B1ECA1ED97F4B1DCA1E997C0");
                    break;
                case 1213299837:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E2A1DE97FEB1D8A1EE97FAB1D1A1E297CEB1DAA1EE97F9B1DCA1D197FDB1E2A1D297C7B1DEA1D797F3B1E2A1E997CEB1DDA1E297F0B1E2");
                    break;
                case 1617546687:
                    m897d = atm.m897d("B1E6A1EF97F3B1E1A1D097F4B1E1A1D997C0B1ECA1D297C0B1EDA1EC97CEB1E2A1EC97F3B1E2A1DE97CFB1DAA1EE97C2B1D2");
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
        StringBuilder sb;
        String str10;
        int i2;
        int i3;
        try {
            boolean isEmpty = TextUtils.isEmpty(str2);
            String m897d = atm.m897d("B1E3A1D597F3B1DEA1EE97FFB1D6A1D097F0B1E2A1D597F4B1D6A1E397FEB1D1A1D497C1B1E6A1ED97FFB1DDA1D397C7B1DFA1D497C7B1DDA1D5");
            while (true) {
                switch (m897d.hashCode() ^ (-661730714)) {
                    case -1675092438:
                        break;
                    case -710350852:
                        try {
                            String m897d2 = atm.m897d("B1D1A1DD97FEB1E2A1D597C4B1DAA1E997C1B1DBA1ED97C0B1DEA1DE97F4B1E3");
                            while (true) {
                                switch (m897d2.hashCode() ^ 299097524) {
                                    case -181786294:
                                        break;
                                    case 845770971:
                                        i = Integer.parseInt(str2.trim());
                                        break;
                                    case 1704842242:
                                        m897d2 = atm.m897d("B1D8A1D797FDB1E2A1D397C7B1D1A1D797C7B1E1A1D397C0B1E1A1ED97C1B1DFA1E997CFB1E2A1ED97FAB1D6A1E997C0B1EDA1D797F3B1E5A1D197C1");
                                        break;
                                    case 1867704343:
                                        if (Integer.parseInt(str2.trim()) <= 1) {
                                            m897d2 = atm.m897d("B1D2A1EA97C2B1E2A1E297CFB1DFA1DD97C4B1E2A1EF97C0B1E1A1DE97C2B1DAA1D497F9B1DEA1D397C3B1ECA1ED97C3B1ECA1D9");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1E1A1D797F8B1DDA1E297F4B1DDA1DD97F9B1E2A1D097FDB1DCA1D297F3B1E3A1EF97F9B1DD");
                                            break;
                                        }
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            SpiderDebug.log(e);
                            return "";
                        }
                        break;
                    case 538612249:
                        if (!isEmpty) {
                            m897d = atm.m897d("B1DBA1D397CEB1DCA1D297C0B1E3A1D397F9B1E2A1D497FEB1DBA1ED97F4B1D2A1DD");
                            break;
                        } else {
                            m897d = atm.m897d("B1E5A1EE97FAB1DAA1D097FFB1E2A1ED97C1B1DEA1D797FEB1E6A1E997F3B1DCA1D997FDB1E5A1E397FA");
                            break;
                        }
                    case 708395136:
                        m897d = atm.m897d("B1E6A1D997FDB1E2A1D397FDB1D2A1D297C4B1EDA1E397C3B1DBA1ED97CFB1E3A1D597FFB1DDA1D397CEB1ECA1EF");
                        break;
                }
            }
            i = 1;
            HashMap hashMap2 = new HashMap();
            hashMap2.put(C0052e.m1418a(new byte[]{9, -127}, new byte[]{96, -27, 26, -48, -115, -93, 68, -17}), str);
            hashMap2.put(C0052e.m1418a(new byte[]{63, 80}, new byte[]{79, 55, -111, 81, -127, -22, -67, 112}), "" + i);
            String m897d3 = atm.m897d("B1D8A1EA97C0B1E2A1D597FDB1E0A1D597C3B1DFA1D497C0B1D8A1EA97CEB1DF");
            while (true) {
                switch (m897d3.hashCode() ^ 325902870) {
                    case -2134037053:
                        if (hashMap == null) {
                            m897d3 = atm.m897d("B1E5A1D197FDB1E2A1DD97F9B1D1A1D997C2B1DDA1E297C2B1E0A1D097FAB1D6A1D797CFB1E6A1ED97C3B1E6A1D397F9B1ECA1EC97FCB1E3A1EA");
                            break;
                        } else {
                            m897d3 = atm.m897d("B1E6A1E297FDB1E2A1D397C2B1DCA1EF97F8B1D1A1EF97F9B1E2A1ED97F3B1ECA1DD97C0B1D2A1D497FEB1E2A1D097F0B1D6A1D997FCB1ECA1ED97FFB1E2A1ED");
                            break;
                        }
                    case -1789759232:
                        String m897d4 = atm.m897d("B1E1A1DD97FFB1EDA1EA97C0B1D1A1ED97F3B1E0A1EA97FEB1DCA1D797F0B1E2");
                        while (true) {
                            switch (m897d4.hashCode() ^ 1316059379) {
                                case 1179006579:
                                    hashMap2.putAll(hashMap);
                                    break;
                                case 1541504214:
                                    break;
                                case 1570781046:
                                    if (hashMap.size() <= 0) {
                                        m897d4 = atm.m897d("B1D2A1E997F0B1D2A1E297C4B1E2A1D497FCB1D1A1D497C3B1E3A1DD97FFB1DEA1EC97CEB1DEA1D997C1");
                                        break;
                                    } else {
                                        m897d4 = atm.m897d("B1D1A1EC97FDB1E2A1D597FCB1D6A1D097F8B1E6A1D997FAB1E6A1ED97F8B1DBA1D097C0");
                                        break;
                                    }
                                case 1928597331:
                                    m897d4 = atm.m897d("B1D6A1D497FDB1DEA1E397C4B1E0A1E997F9B1E2A1D797FDB1D6A1DD97C7B1DFA1ED");
                                    break;
                            }
                        }
                        break;
                    case -649027563:
                        break;
                    case 582018052:
                        m897d3 = atm.m897d("B1E0A1D797C1B1E1A1D297C0B1E2A1EC97F8B1EDA1E297FCB1DCA1ED97FEB1DDA1EA97FFB1ECA1D497F9B1E0A1EC97FCB1D1A1E2");
                        break;
                }
            }
            String m897d5 = atm.m897d("B1DBA1E297C7B1E0A1EA97F9B1E2A1EC97C1B1DCA1EA97C7B1ECA1EF97FEB1E0A1D997CFB1E3");
            while (true) {
                switch (m897d5.hashCode() ^ (-656597384)) {
                    case -1768716649:
                        str3 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-26, 122}, new byte[]{-113, 30, 55, 99, 72, 38, -19, -47}));
                        break;
                    case -74805651:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-42, 109}, new byte[]{-65, 9, 61, 49, 105, -65, 29, -43})) != null) {
                            m897d5 = atm.m897d("B1DAA1E397F9B1E2A1D597FCB1EDA1D997F3B1DCA1E997F3B1ECA1ED97FDB1DFA1EA97FDB1ECA1EC97C1B1E2A1ED97CFB1D2A1D397C0B1EDA1DE97FC");
                            break;
                        } else {
                            m897d5 = atm.m897d("B1E2A1D797FDB1E2A1EC97F9B1DAA1EA97F9B1D2A1D797C1B1EDA1D197C3B1DAA1DD97C2");
                            break;
                        }
                    case 837343747:
                        str3 = "";
                        break;
                    case 1187464222:
                        m897d5 = atm.m897d("B1DDA1E997CEB1EDA1DE97F4B1E2A1D597C1B1DFA1D597FDB1E2A1ED97F3B1EC");
                        break;
                }
            }
            String m897d6 = atm.m897d("B1E0A1D097C4B1E2A1DE97F9B1E2A1ED97F0B1DAA1DD97C0B1E2A1EA97C0B1E2A1D497F8B1DFA1ED97F0B1DEA1E997CFB1DBA1D397C0");
            while (true) {
                switch (m897d6.hashCode() ^ (-1251013274)) {
                    case 198322841:
                        m897d6 = atm.m897d("B1E6A1D797C0B1DEA1EA97C0B1E2A1D497C2B1D2A1D997F3B1E1A1D197C0B1DD");
                        break;
                    case 500655832:
                        str4 = (String) hashMap2.get(C0052e.m1418a(new byte[]{18, -32, -72, 68}, new byte[]{115, -110, -35, 37, -120, 99, 67, 104}));
                        break;
                    case 1367375583:
                        str4 = "";
                        break;
                    case 1915338328:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{109, 101, 100, 58}, new byte[]{12, 23, 1, 91, 35, 113, -9, 117})) != null) {
                            m897d6 = atm.m897d("B1DEA1DE97F9B1D6A1EC97F3B1EDA1D397F0B1D6A1EC97FFB1DEA1E397FFB1E2A1DE97F9B1E6");
                            break;
                        } else {
                            m897d6 = atm.m897d("B1D2A1E397F9B1D6A1DE97FFB1ECA1EF97C0B1E2A1D497C0B1DEA1D797F8B1DCA1EC97F0B1E0A1D497C3B1E6A1EA97F3B1D8A1D797FDB1DDA1ED");
                            break;
                        }
                }
            }
            String m897d7 = atm.m897d("B1D6A1D397F9B1E2A1EA97C7B1EDA1D497FEB1D6A1D597FEB1E3A1EE97CEB1DCA1ED97FDB1E2A1D297C1B1DFA1D097C0");
            while (true) {
                switch (m897d7.hashCode() ^ 846393555) {
                    case -937193113:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{116, 52}, new byte[]{22, 77, 123, -94, 112, 59, 44, 52})) != null) {
                            m897d7 = atm.m897d("B1D8A1D297FDB1DCA1D797C1B1DDA1D797F0B1DAA1D297FDB1E2A1EE97F9B1DBA1ED97FAB1DDA1D597C0B1EDA1E397C0B1E2A1D997F9B1D6A1EA97C2");
                            break;
                        } else {
                            m897d7 = atm.m897d("B1E1A1ED97C7B1D6A1D497FAB1DAA1D097FFB1D8A1D397C1B1E0A1D797FCB1D6A1EE97FDB1E2A1D397C4B1EDA1EA97F4B1E6A1ED");
                            break;
                        }
                    case 591995639:
                        str5 = "";
                        break;
                    case 905361401:
                        m897d7 = atm.m897d("B1E3A1D197F4B1DFA1EA97CFB1ECA1D797F0B1DDA1DD97F4B1DBA1EF97C0B1E2");
                        break;
                    case 1672717948:
                        str5 = (String) hashMap2.get(C0052e.m1418a(new byte[]{104, -66}, new byte[]{10, -57, -28, 90, -40, -39, 28, -79}));
                        break;
                }
            }
            String m897d8 = atm.m897d("B1E1A1E397CEB1DAA1D997C2B1D1A1D597C4B1E2A1ED97FFB1D1A1D497C1B1E0A1E997C2B1D2A1ED");
            while (true) {
                switch (m897d8.hashCode() ^ 1720658843) {
                    case -2079426423:
                        str6 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-61, -58, -101, 116, -91}, new byte[]{-96, -86, -6, 7, -42, 30, 33, -70}));
                        break;
                    case -2046055975:
                        str6 = "";
                        break;
                    case -2037161651:
                        m897d8 = atm.m897d("B1D1A1EC97FAB1DBA1DD97FEB1E2A1D597C0B1DAA1EF97C0B1DBA1ED97F9B1D1A1E997C0B1E2A1D297F0B1D1A1EF97C2B1E5A1EC");
                        break;
                    case 1899649667:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{78, -31, -124, 16, -93}, new byte[]{45, -115, -27, 99, -48, -108, -111, -110})) != null) {
                            m897d8 = atm.m897d("B1E5A1EE97FDB1E2A1D297FFB1DBA1ED97F8B1EDA1EA97FEB1D8A1E997FFB1E5A1DD");
                            break;
                        } else {
                            m897d8 = atm.m897d("B1E5A1D997FFB1E0A1EC97FEB1DBA1D397C4B1E2A1D397FCB1DBA1ED97FEB1E3");
                            break;
                        }
                }
            }
            String m897d9 = atm.m897d("B1DDA1DD97F0B1D1A1E997F0B1E2A1E997FCB1E2A1D597C0B1DCA1EF97F8B1DAA1D297CFB1E2A1ED97F3B1D1A1EA97C2B1DBA1D097C0");
            while (true) {
                switch (m897d9.hashCode() ^ (-984537175)) {
                    case -1598793736:
                        m897d9 = atm.m897d("B1D1A1EA97F0B1E2A1D997F0B1E6A1ED97FAB1E5A1D197C4B1DFA1E997FFB1D1A1D597FAB1D8A1ED97FFB1E2A1D5");
                        break;
                    case 125803426:
                        str7 = "";
                        break;
                    case 774825692:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-54, 35, -32, -115}, new byte[]{-90, 66, -114, -22, -21, -59, -64, -24})) != null) {
                            m897d9 = atm.m897d("B1D1A1E297C7B1EDA1E397F9B1E3A1E997F8B1DAA1D497CEB1EDA1EA97FCB1D8A1E397FDB1E2A1D497F0B1D1");
                            break;
                        } else {
                            m897d9 = atm.m897d("B1E5A1DD97F9B1E2A1D297C7B1DFA1D197FFB1D1A1E397CFB1ECA1ED97F3B1EDA1D297F3B1E3A1DD97CEB1EDA1DD97C0B1E3A1EE97F9");
                            break;
                        }
                    case 1536265217:
                        str7 = (String) hashMap2.get(C0052e.m1418a(new byte[]{109, 12, -7, -44}, new byte[]{1, 109, -105, -77, -71, 3, -48, 40}));
                        break;
                }
            }
            String m897d10 = atm.m897d("B1D6A1EE97C2B1DAA1D097C4B1E2A1D197CFB1D6A1D097F3B1E6A1D197F8B1E2A1ED");
            while (true) {
                switch (m897d10.hashCode() ^ (-746488043)) {
                    case 423499380:
                        str8 = "";
                        break;
                    case 462417296:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-82, 65}, new byte[]{-34, 38, -57, 108, -71, 61, -61, 76})) != null) {
                            m897d10 = atm.m897d("B1E3A1D097C7B1DCA1EC97CFB1DCA1ED97C7B1D2A1D797C1B1DFA1E397C0B1E1A1DE97FDB1E2");
                            break;
                        } else {
                            m897d10 = atm.m897d("B1DEA1E997C1B1DFA1ED97CFB1DEA1EF97FEB1D1A1D097F9B1D6A1D597FCB1DCA1D597C1B1DEA1D497F8B1D1A1E997CF");
                            break;
                        }
                    case 811290450:
                        str8 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-105, 30}, new byte[]{-25, 121, 17, 32, -30, 52, -32, 8}));
                        break;
                    case 1852479993:
                        m897d10 = atm.m897d("B1E6A1EC97C4B1E2A1D497C7B1E2A1ED97CFB1D1A1ED97C7B1ECA1D997C2B1ECA1E997C0B1EDA1D197CEB1E2A1EF97FAB1E2");
                        break;
                }
            }
            String m897d11 = atm.m897d("B1EDA1DD97FFB1E2A1EF97F0B1DEA1D597CFB1E1A1E397F4B1D2A1ED97F0B1E3A1EF03");
            while (true) {
                switch (m897d11.hashCode() ^ (-1819172422)) {
                    case -48349877:
                        str9 = "";
                        break;
                    case 186586342:
                        m897d11 = atm.m897d("B1E6A1DD97FEB1D6A1D497C7B1DFA1E997F8B1E1A1DE97F0B1D2A1EF97FEB1E2A1D797FEB1E6A1EA97C7B1DC");
                        break;
                    case 667243238:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{72, 125, -92, -124}, new byte[]{49, 24, -59, -10, 67, 107, 44, 101})) != null) {
                            m897d11 = atm.m897d("B1E6A1DE97F4B1E3A1D197FEB1E2A1EF97C1B1D2A1ED97C1B1E6A1D097C0B1DDA1D197F3B1E3A1EF97FFB1E1A1EC");
                            break;
                        } else {
                            m897d11 = atm.m897d("B1E0A1E297C3B1DEA1EA97F0B1DCA1D797C4B1E2A1DD97FCB1DCA1ED97C7B1DCA1ED97C0");
                            break;
                        }
                    case 1484617263:
                        str9 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-38, -47, 52, -8}, new byte[]{-93, -76, 85, -118, -2, 101, Byte.MIN_VALUE, -122}));
                        break;
                }
            }
            sb = new StringBuilder();
            str10 = f1115i;
            sb.append(str10);
        } catch (Exception e2) {
            e = e2;
        }
        try {
            sb.append(String.format(C0052e.m1418a(new byte[]{19, 22, 34, -117, 18, -76, 26, 125, 19, 69, 62, -62, 68, -81, 88, 47, 79, 77, 104, -100, 76, -7, 6, 39, 17, 77, 96, -54, 18, -15, 88, 39, 25, 19, 98}, new byte[]{60, 96, 77, -17, 97, -36, 117, 10}), str3, str4, str5, str6, str7, str8, str9));
            C0288h m1414e = C0052e.m1414e(C0574b.m308e(sb.toString(), m274a(str10)));
            JSONObject jSONObject = new JSONObject();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-6, 41, -39, -11, 116, 60, -69, -122, -1, 39, -54, -13, 61, 57}, new byte[]{-98, 64, -81, -82, 29, 88, -122, -10}));
            String m897d12 = atm.m897d("B1DDA1E297CEB1DDA1D597FAB1DCA1DE97F9B1E2A1EF97C3B1E5A1DD97FEB1E2A1D997C0B1DAA1D497C7B1ECA1ED97F9B1E5A1EE");
            while (true) {
                switch (m897d12.hashCode() ^ 2146904668) {
                    case -1615030770:
                        Matcher matcher = this.f1121g.matcher(m967p0.m604c().mo925d(C0052e.m1418a(new byte[]{-98, 73, -19, -36}, new byte[]{-10, 59, -120, -70, -125, 114, -15, 79})));
                        String m897d13 = atm.m897d("B1D6A1E297C2B1EDA1D397C2B1E1A1D497F0B1E2A1D597C2B1ECA1D397F8B1D2A1DD97F3B1D2A1E997FCB1DE");
                        while (true) {
                            switch (m897d13.hashCode() ^ (-1132105949)) {
                                case 757769746:
                                    break;
                                case 1179584787:
                                    m897d13 = atm.m897d("B1DEA1E397C3B1DFA1D997F9B1E2A1D497F9B1E6A1ED97F9B1E5A1ED97C1B1DDA1ED97C1B1E3A1ED97C0B1E6A1E297F4B1E2A1D4");
                                    break;
                                case 1237776792:
                                    if (!matcher.find()) {
                                        m897d13 = atm.m897d("B1EDA1D497CEB1E2A1D197F9B1E6A1D197F0B1DAA1EC97FEB1D8A1D597C7B1D2A1ED97F9B1D2A1EA97CFB1E2A1D097C0");
                                        break;
                                    } else {
                                        m897d13 = atm.m897d("B1E2A1D397C0B1E0A1E997FEB1E2A1D797FFB1DFA1ED97FEB1DFA1E997C7B1D6A1EA97C0B1ECA1EC");
                                        break;
                                    }
                                case 1570172932:
                                    i2 = Integer.parseInt(matcher.group(1).trim());
                                    break;
                            }
                        }
                        break;
                    case -1171682668:
                        break;
                    case -1031167720:
                        if (m967p0.size() <= 0) {
                            m897d12 = atm.m897d("B1E5A1EF97CFB1DBA1D097F9B1D1A1D497C4B1DBA1D097FCB1D6A1E997FEB1D8A1E997CEB1ECA1D097CEB1DBA1EA97F4");
                            break;
                        } else {
                            m897d12 = atm.m897d("B1D1A1DD97FEB1E2A1DE97FCB1ECA1ED97F3B1DAA1D497F4B1DEA1E997F9B1D8A1E9");
                            break;
                        }
                    case 1344850789:
                        m897d12 = atm.m897d("B1DEA1D997CEB1DAA1D797CEB1E0A1D397C4B1D2A1EA97C7B1EDA1EC97C2B1E3A1D797C2B1DCA1D4");
                        break;
                }
            }
            i2 = 1;
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-76, -80, -57, 36, 51, 101, -65, -47, -68, -68, -111, 107, 112, 103, -76, -64, -91, -75, -44, 39, 55, 126, -66, -55}, new byte[]{-48, -39, -79, 10, 94, 10, -37, -92}));
            JSONArray jSONArray = new JSONArray();
            int i4 = 0;
            while (true) {
                String m897d14 = atm.m897d("B1D8A1E397C7B1E2A1DD97F9B1E2A1E397FDB1E2A1E997C0B1D8A1EE97F9B1E6A1ED97C7B1D1A1D397C0B1E2A1EF97C4B1DDA1EA97FCB1E0A1E297CE");
                while (true) {
                    switch (m897d14.hashCode() ^ (-909342429)) {
                        case -1256678195:
                            m897d14 = atm.m897d("B1DBA1D397F8B1DFA1E997C4B1D1A1E297C4B1DEA1ED97CEB1E2A1DE97F3B1E1A1ED97C1");
                        case -261260709:
                            m897d14 = i4 < m967p02.size() ? atm.m897d("B1EDA1EA97F0B1D2A1D097FFB1E2A1D997C2B1DFA1E397F3B1DCA1D097F3B1DBA1EF97F0B1EDA1D797C0B1E2A1ED97F0B1E2A1D397C0") : atm.m897d("B1E1A1ED97FCB1E5A1D097CEB1ECA1D497C0B1E2A1D097C4B1DAA1D497C7B1E0A1E297C7");
                        case 320825347:
                            JSONObject jSONObject2 = new JSONObject();
                            C0293m c0293m = m967p02.get(i4);
                            Matcher matcher2 = this.f1119e.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{-99, 44, 98, 49}, new byte[]{-11, 94, 7, 87, 9, -106, 88, -29})));
                            String m897d15 = atm.m897d("B1DBA1D397CEB1D8A1ED97CFB1E0A1DD97CEB1E2A1EA97F4B1D6A1D097C0B1D2A1EC97F8B1E5A1E297F0B1E2A1D397FFB1E1");
                            while (true) {
                                switch (m897d15.hashCode() ^ (-365591960)) {
                                    case -1265254023:
                                        m897d15 = atm.m897d("B1E6A1D797FCB1D8A1E397FEB1E2A1ED97FEB1DFA1ED97FFB1E2A1EF97F4B1DAA1EC");
                                    case -812180195:
                                        m897d15 = !matcher2.find() ? atm.m897d("B1E1A1DE97FDB1D1A1E297C3B1E6A1E997FDB1E5A1E997CEB1DDA1D597F9B1E2A1D297C0B1ECA1ED") : atm.m897d("B1D2A1D097CEB1DCA1D297C2B1DDA1EE97C3B1ECA1EA97CFB1DAA1D797F0B1E1A1D397F9B1E2A1DE97CFB1ECA1ED");
                                    case -627840791:
                                        break;
                                    case -228485049:
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-115, 10, -65, 118, -34, 111}, new byte[]{-5, 101, -37, 41, -73, 11, -76, -62}), matcher2.group(1));
                                        jSONObject2.put(C0052e.m1418a(new byte[]{113, -75, 86, -14, -109, 30, 10, -74}, new byte[]{7, -38, 50, -83, -3, Byte.MAX_VALUE, 103, -45}), c0293m.mo925d(C0052e.m1418a(new byte[]{-18, -82, -5, -28, 29}, new byte[]{-102, -57, -113, -120, 120, 103, 83, -56})));
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-32, 98, -26, -45, 75, 116, 52}, new byte[]{-106, 13, -126, -116, 59, 29, 87, 51}), C0652d.m148c(f1115i, c0293m.m966q0(C0052e.m1418a(new byte[]{100, 39, -90, -95, -37, -17, -93, 59, 108, 43, -3, -26, -62, -27, -86, 99, 112, 39, -77, -81, -33, -19, -96}, new byte[]{0, 78, -48, -113, -74, Byte.MIN_VALUE, -57, 78})).mo925d(C0052e.m1418a(new byte[]{-21, 66, -13, 63, -97, 43, -126, -40, -24, 74, -23, 63, -34}, new byte[]{-113, 35, -121, 94, -78, 68, -16, -79}))));
                                        C0293m m966q0 = c0293m.m966q0(C0052e.m1418a(new byte[]{36, 103, -44, 37, -91, 67, 75, -51, 44, 107, -113, 98, -68, 73, 66, -107, 46, 97, -42, 110}, new byte[]{64, 14, -94, 11, -56, 44, 47, -72}));
                                        String m897d16 = atm.m897d("B1D1A1ED97FEB1D2A1D097C0B1E3A1D497CFB1E5A1E297C7B1E1A1EA97C2B1D8A1D397C0B1E2A1ED97F4B1E0A1DD");
                                        while (true) {
                                            switch (m897d16.hashCode() ^ 188127816) {
                                                case -1681242170:
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-34, 125, -85, -61, -37, 121, -84, -25, -38, 121, -68}, new byte[]{-88, 18, -49, -100, -87, 28, -63, -122}), c0293m.m966q0(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, 5, -24, -98, 77, -8, -49, -101, 119, 9, -77, -39, 84, -14, -58, -61, Byte.MAX_VALUE, 3, -21, -46, 65, -7}, new byte[]{27, 108, -98, -80, 32, -105, -85, -18})).m960w0().trim());
                                                    break;
                                                case -1154918390:
                                                    m897d16 = m966q0 != null ? atm.m897d("B1DFA1EF97CFB1DCA1D097C4B1E2A1E397C2B1ECA1D297CFB1E1A1EC97F9B1DB") : atm.m897d("B1ECA1DD97C3B1D1A1EC97F9B1E2A1EF97F3B1D6A1D397F0B1E2A1D097FCB1EC");
                                                case -127967991:
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-35, 8, 27, -71, -80, -93, -20, -12, -39, 12, 12}, new byte[]{-85, 103, Byte.MAX_VALUE, -26, -62, -58, -127, -107}), m966q0.m960w0().trim());
                                                    break;
                                                case 1801465451:
                                                    m897d16 = atm.m897d("B1E6A1D797CEB1E2A1D397C7B1ECA1EE97FDB1E2A1D797C4B1ECA1ED97F8B1E5A1E297C2B1ECA1D197F4B1E2A1EE97FAB1E3A1D7");
                                            }
                                        }
                                        jSONArray.put(jSONObject2);
                                        break;
                                }
                            }
                            i4++;
                            break;
                        case 1596543404:
                            jSONObject.put(C0052e.m1418a(new byte[]{-93, 116, -116, 39}, new byte[]{-45, 21, -21, 66, 71, -113, 7, 102}), i);
                            jSONObject.put(C0052e.m1418a(new byte[]{71, 5, -94, 56, 42, -43, 101, 117, 67}, new byte[]{55, 100, -59, 93, 73, -70, 16, 27}), i2);
                            jSONObject.put(C0052e.m1418a(new byte[]{123, -75, 126, 103, -61}, new byte[]{23, -36, 19, 14, -73, -39, 18, 118}), 72);
                            String m1418a = C0052e.m1418a(new byte[]{66, -19, -58, -57, 40}, new byte[]{54, -126, -78, -90, 68, 80, -85, -90});
                            String m897d17 = atm.m897d("B1D8A1D797F9B1DCA1EC97F0B1E2A1D297CFB1E0A1D597C1B1DBA1DD97FEB1E2A1EF97C7B1DD");
                            while (true) {
                                switch (m897d17.hashCode() ^ 1861709859) {
                                    case -1804946295:
                                        if (i2 > 1) {
                                            m897d17 = atm.m897d("B1D8A1EE97F9B1D8A1D497FEB1E2A1D397F9B1E5A1D497F3B1E6A1D597C1B1E6A1E297F0B1DCA1ED");
                                            break;
                                        } else {
                                            m897d17 = atm.m897d("B1ECA1EE97C0B1E3A1D797F3B1DBA1ED97C4B1E1A1EE97CEB1E2A1D397F4B1E6A1ED");
                                            break;
                                        }
                                    case -1296256378:
                                        i3 = jSONArray.length();
                                        break;
                                    case -572124676:
                                        i3 = i2 * 72;
                                        break;
                                    case 1569382905:
                                        m897d17 = atm.m897d("B1E5A1D997F9B1E2A1D597F0B1DCA1D597C7B1E6A1ED97F0B1E2A1EC97FEB1DDA1EA97F9B1D6A1DD97C0");
                                        break;
                                }
                            }
                            jSONObject.put(m1418a, i3);
                            jSONObject.put(C0052e.m1418a(new byte[]{-51, 69, 86, -73}, new byte[]{-95, 44, 37, -61, 124, 9, 122, -76}), jSONArray);
                            return jSONObject.toString();
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        String str;
        boolean z;
        C0293m c0293m;
        try {
            C0288h m1414e = C0052e.m1414e(C0574b.m308e(C0052e.m1418a(new byte[]{-101, 120, 62, -78, -81, -38, 7, -37, -102, 103, 43, -84, -91, -109, 6, Byte.MIN_VALUE, -123, 35, 60, -83, -72, -124, 77, Byte.MIN_VALUE, -110, 101, 38, -19}, new byte[]{-13, 12, 74, -62, -36, -32, 40, -12}) + list.get(0) + C0052e.m1418a(new byte[]{-43}, new byte[]{-6, -76, -12, -123, 73, 9, -25, -3}), m274a(f1115i)));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String mo925d = m1414e.m966q0(C0052e.m1418a(new byte[]{-76, -13, -102, 57, 85, 95, -63, -115, -68, -1, -63, 126, 86, 86, -54, -43, -96, -11, -97, 99, 93, 66, -123, -100, -71, -20, -52, 115, 81, 70, -123, -111, -67, -3}, new byte[]{-48, -102, -20, 23, 56, 48, -91, -8})).mo925d(C0052e.m1418a(new byte[]{-74, -71, -16, 72, 20, -64, 8, 114, -75, -79, -22, 72, 85}, new byte[]{-46, -40, -124, 41, 57, -81, 122, 27}));
            String m960w0 = m1414e.m966q0(C0052e.m1418a(new byte[]{-7, 107, -62, 85, 94, -46, 89, 60, -15, 103, -103, 18, 93, -37, 82, 100, -11, 103, -43, 31, 90, -45, 90, 105, -11, 51}, new byte[]{-99, 2, -76, 123, 51, -67, 61, 73})).m960w0();
            C0293m m966q0 = m1414e.m966q0(C0052e.m1418a(new byte[]{91, 12, -78, 100, -123, -89, -67, 59, 83, 0, -23, 35, -122, -82, -74, 99, 86, 11, -80, 56, -121, -84, -84, 45, 75, 12, -85, 36, -59, -85, -74, 32, 75, 0, -86, 62, -56, -72}, new byte[]{63, 101, -60, 74, -24, -56, -39, 78}));
            String m897d = atm.m897d("B1EDA1EF97FDB1DFA1E997C1B1E2A1EE97FFB1ECA1ED97C0B1E3A1EE97F9B1E2");
            while (true) {
                switch (m897d.hashCode() ^ 461121179) {
                    case -1961905493:
                        str = "";
                        break;
                    case -1623488944:
                        if (m966q0 == null) {
                            m897d = atm.m897d("B1D6A1ED97C0B1E3A1D597C1B1DBA1D397FAB1E6A1D997F4B1E3A1D997C0B1E2A1EA97F0B1E1A1EF97FEB1ECA1ED97CFB1DDA1DD97FFB1DD");
                            break;
                        } else {
                            m897d = atm.m897d("B1D1A1EE97C4B1E0A1D297F9B1E2A1EE97C2B1E0A1ED97F9B1E5A1EC97C3B1D2A1ED");
                            break;
                        }
                    case -1026074683:
                        str = m966q0.m960w0();
                        break;
                    case -531506714:
                        m897d = atm.m897d("B1ECA1EA97F0B1D2A1DD97F4B1E0A1E397FFB1E2A1EE97C3B1D2A1EA97F4B1E1A1D997FFB1E3");
                        break;
                }
            }
            jSONObject2.put(C0052e.m1418a(new byte[]{-106, 58, -85, -42, 110, -32}, new byte[]{-32, 85, -49, -119, 7, -124, -75, 67}), list.get(0));
            jSONObject2.put(C0052e.m1418a(new byte[]{100, -118, 12, 2, -68, 71, -25, -63}, new byte[]{18, -27, 104, 93, -46, 38, -118, -92}), m960w0);
            jSONObject2.put(C0052e.m1418a(new byte[]{-104, 66, 4, -68, -111, -101, -38}, new byte[]{-18, 45, 96, -29, -31, -14, -71, -59}), mo925d);
            jSONObject2.put(C0052e.m1418a(new byte[]{-124, -125, -118, 72, -113, -70, -68, 41, -105, -126, -102}, new byte[]{-14, -20, -18, 23, -20, -43, -46, 93}), str);
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-12, 86, 126, 39, -48, -76, 36, 40, -4, 90, 37, 96, -45, -67, 47, 112, -7, 75, 109, 100}, new byte[]{-112, 63, 8, 9, -67, -37, 64, 93}));
            int i = 0;
            while (true) {
                String m897d2 = atm.m897d("B1DAA1D997C2B1E5A1DD97FFB1E0A1D497FFB1DFA1EA97C0B1E2A1D597C0B1E1A1EF97FDB1ECA1DD97FDB1DCA1E397CFB1D8A1D197F4B1E6");
                while (true) {
                    switch (m897d2.hashCode() ^ (-963055330)) {
                        case -1496452524:
                            m897d2 = i < m967p0.size() ? atm.m897d("B1DBA1EA97CFB1E2A1D597C0B1E2A1DE97C3B1D2A1ED97F0B1EDA1E997F8B1DAA1E397C0B1DCA1E997FFB1E2A1D597F8B1E5A1EE97C2B1DFA1D497C0B1E2") : atm.m897d("B1E1A1DD97CEB1D6A1EE97F0B1E2A1E397FEB1E6A1ED97F9B1E1A1E297FFB1EDA1D097F0B1D1A1D197C3B1DBA1ED97C0");
                        case 220371112:
                            C0459g m967p02 = m967p0.get(i).m967p0(C0052e.m1418a(new byte[]{-37, -29, 34, 114}, new byte[]{-88, -109, 67, 28, 54, -118, -53, 98}));
                            String m897d3 = atm.m897d("B1E1A1D797C3B1DEA1D497CEB1E3A1EE97C0B1E2A1D197F9B1DBA1D297F0B1E6A1D597CEB1ECA1ED97CEB1D8A1EC97FFB1D8A1EC");
                            while (true) {
                                switch (m897d3.hashCode() ^ 131789087) {
                                    case -1382171328:
                                        break;
                                    case -860928754:
                                        m897d3 = atm.m897d("B1E0A1D197F0B1E2A1EC97C4B1DAA1EF97F8B1DEA1D797FFB1DBA1D097C0B1E2A1D097CEB1D6A1D997C1B1D2A1DE97CEB1DBA1D497FEB1EC");
                                    case 1492219168:
                                        String m602e = m967p02.m602e();
                                        String m897d4 = atm.m897d("B1D6A1D997FFB1ECA1D197C4B1EDA1DE97FDB1E2A1D597F4B1DFA1D197F3B1D8A1D497FCB1DEA1E297F3B1E2A1ED97CEB1DDA1ED97C3B1DDA1D5");
                                        while (true) {
                                            switch (m897d4.hashCode() ^ (-380456404)) {
                                                case -1658738024:
                                                    break;
                                                case -1204397730:
                                                    m897d4 = m602e.contains(C0052e.m1418a(new byte[]{85, -112, 70, 101, -30, -23}, new byte[]{-80, 63, -6, -125, 94, 125, -25, 10})) ? atm.m897d("B1E2A1DE97C0B1E3A1EF97FDB1DAA1D597FAB1ECA1D097C4B1E2A1D197F8B1D8") : atm.m897d("B1EDA1D497F9B1E0A1EE97F9B1E2A1D297C3B1ECA1ED97C0B1DFA1D097C0B1DFA1D597C0B1EDA1EF97FFB1DA");
                                                case -777435884:
                                                    m897d4 = atm.m897d("B1E1A1D397F4B1DCA1EE97F4B1DFA1E297F8B1D2A1D497C0B1E2A1D297FEB1DBA1ED97F9B1D1A1D197F3B1EDA1E997C0");
                                                case 248447447:
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-109, 103, 92, 47, 27, 94, 36, -44, -122, 124, 87, 2}, new byte[]{-27, 8, 56, 112, Byte.MAX_VALUE, 55, 86, -79}), m967p0.get(i).m967p0(C0052e.m1418a(new byte[]{-56}, new byte[]{-87, 122, 58, 58, -110, -21, 5, -82})).m602e());
                                                    break;
                                            }
                                        }
                                        String m897d5 = atm.m897d("B1DFA1E997FCB1ECA1D497FDB1E2A1D597F3B1E6A1EE97C7B1DFA1ED97CFB1D6A1E397F9B1DEA1D197CEB1E0A1D397C0");
                                        while (true) {
                                            switch (m897d5.hashCode() ^ (-674238435)) {
                                                case -1067784146:
                                                    m897d5 = m602e.contains(C0052e.m1418a(new byte[]{56, 80, -108, -81, -81, -67}, new byte[]{-36, -24, 47, 73, 19, 41, 82, -40})) ? atm.m897d("B1D6A1D097F9B1DCA1EE97FDB1D8A1E997FDB1D6A1D197C3B1E3A1DE97FC") : atm.m897d("B1E3A1ED97FDB1E2A1D497F0B1DEA1D597C3B1E1A1D597C2B1E1A1EF97C3B1DCA1E397C7B1EDA1DD97F9B1E2A1D797FEB1D2A1DD97FFB1EC");
                                                case -852182491:
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-7, 82, 39, 18, -102, 21, -15, 65, -3}, new byte[]{-113, 61, 67, 77, -5, 118, -123, 46}), m967p0.get(i).m967p0(C0052e.m1418a(new byte[]{-111}, new byte[]{-16, -67, 12, 71, -124, 113, 1, 90})).m602e());
                                                    break;
                                                case -332564224:
                                                    break;
                                                case 657225231:
                                                    m897d5 = atm.m897d("B1DFA1E997F9B1E2A1D997F0B1D1A1D497FFB1ECA1EF97F0B1DEA1DD97F3B1D8A1D997FAB1D2A1E997CEB1E2A1D997FFB1E1A1E997FCB1E6");
                                            }
                                        }
                                        String m897d6 = atm.m897d("B1E0A1D397FDB1E2A1EC97CFB1DCA1D297F9B1E6A1ED97FEB1D1A1E397C0B1E0A1E397F0B1DBA1DE97FF");
                                        while (true) {
                                            switch (m897d6.hashCode() ^ (-1248600071)) {
                                                case -1827087154:
                                                    m897d6 = m602e.contains(C0052e.m1418a(new byte[]{-40, -86, -52, -99, 108, -114}, new byte[]{62, 49, 120, 123, -6, 62, 33, 87})) ? atm.m897d("B1E5A1E297CEB1DBA1D297FEB1D8A1ED97FFB1E0A1D397C4B1E2A1D0") : atm.m897d("B1D6A1DE97F9B1E5A1D797FAB1D8A1D297F3B1DCA1EE97C1B1ECA1EF97C7B1E6A1E397F8B1D2A1E397C2B1D2A1D597F0B1D2A1E297FDB1E2");
                                                case -1482327581:
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-94, -111, -31, -6, -125, -21, 102, -100}, new byte[]{-44, -2, -123, -91, -6, -114, 7, -18}), m967p0.get(i).m967p0(C0052e.m1418a(new byte[]{68}, new byte[]{52, -1, -14, 88, 65, 9, -108, -127})).m602e());
                                                    break;
                                                case -106387465:
                                                    m897d6 = atm.m897d("B1DBA1DE97CEB1DEA1EF97FFB1ECA1E397F0B1D2A1D797C1B1DFA1DE97F4B1DEA1D597F8");
                                                case -47020747:
                                                    break;
                                            }
                                        }
                                        String m897d7 = atm.m897d("B1ECA1EE97F9B1DBA1ED97F9B1E2A1D597F0B1E2A1D197C3B1E6A1ED97F8B1DBA1D797FFB1D6A1EF97FDB1E2");
                                        while (true) {
                                            switch (m897d7.hashCode() ^ 1390776378) {
                                                case -2025520838:
                                                    break;
                                                case -1762229533:
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-120, -81, 103, -105, -34, 83, -110, 80, -116, -85, 112}, new byte[]{-2, -64, 3, -56, -84, 54, -1, 49}), m967p0.get(i).m967p0(C0052e.m1418a(new byte[]{-101, 27, -120}, new byte[]{-1, 114, -2, 23, -103, -61, 89, -72})).m602e());
                                                    continue;
                                                case 333170714:
                                                    m897d7 = m602e.contains(C0052e.m1418a(new byte[]{-25, 20, 19, 41, 69, 84}, new byte[]{14, -113, -107, -49, -48, -28, 61, 98})) ? atm.m897d("B1E0A1EE97F3B1D8A1D997C4B1E2A1D397CFB1D2A1ED97FEB1E1A1ED97C0B1E0A1EC97F0B1D1A1D497CEB1E2A1EF97C1B1DF") : atm.m897d("B1DFA1EA97C7B1D1A1E997C0B1E0A1EE97FDB1E2A1DD97C2B1DEA1DE97F3B1D1A1EC97C7B1E2A1ED97FAB1ECA1E397C0B1EDA1EC97FEB1E3A1D197C4B1E2");
                                                case 1448492561:
                                                    m897d7 = atm.m897d("B1DBA1D797C4B1E2A1D397CEB1E1A1EF97FDB1DFA1ED97C7B1E0A1D797FEB1D1A1E997C0B1E2A1E997FDB1E5A1D197C2B1E3A1DE97C0B1D8A1E297FC");
                                            }
                                        }
                                        break;
                                    case 1602026008:
                                        m897d3 = m967p02.size() == 0 ? atm.m897d("B1DCA1D097C3B1D8A1D297C4B1E2A1EE97FAB1D2A1EA97FEB1E2A1E397C2B1E5A1DD97F4B1EDA1E397C4B1E6") : atm.m897d("B1E3A1EA97FEB1D2A1D097FDB1E3A1ED97C2B1DDA1DD97FAB1E6A1E397FF");
                                }
                            }
                            i++;
                            break;
                        case 602950821:
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C0459g m967p03 = m1414e.m967p0(C0052e.m1418a(new byte[]{82, -103, -92, 71, 108, -40, -109, 37, 90, -107, -1, 29, 96, -43, -38, 57, 66, -107, -65, 26, 44, -43, -104, 40, 22, -50, -14, 13, 104, -63, -39, 36, 87, -110, -1, 0, 117, -46, -102}, new byte[]{54, -16, -46, 105, 1, -73, -9, 80}));
                            C0459g m967p04 = m1414e.m967p0(C0052e.m1418a(new byte[]{69, 115, 83, 31, -68, 126, -113, 79, 77, Byte.MAX_VALUE, 8, 65, -67, 112, -110, 23, 77, 115, 86, 69, -4, 114, -124, 84, 85, Byte.MAX_VALUE, 75, 69}, new byte[]{33, 26, 37, 49, -47, 17, -21, 58}));
                            int i2 = 0;
                            while (true) {
                                int i3 = i2;
                                String m897d8 = atm.m897d("B1DEA1D097C2B1DEA1D797FDB1E0A1EE97C0B1DEA1DE97CEB1DBA1D497FAB1DCA1EA97FD");
                                while (true) {
                                    switch (m897d8.hashCode() ^ 1478794902) {
                                        case -2033972960:
                                            String m897d9 = atm.m897d("B1E0A1D797C7B1D8A1D797C2B1E1A1D397FDB1E2A1E297CEB1EDA1D297CEB1D6A1EA97CFB1E0A1E9");
                                            while (true) {
                                                switch (m897d9.hashCode() ^ (-1697870750)) {
                                                    case -590095918:
                                                        String join = TextUtils.join(C0052e.m1418a(new byte[]{-92, -117, 43}, new byte[]{Byte.MIN_VALUE, -81, 15, 82, 100, -100, -104, -56}), linkedHashMap.keySet());
                                                        String join2 = TextUtils.join(C0052e.m1418a(new byte[]{4, 108, 90}, new byte[]{32, 72, 126, -56, -66, 1, -78, 122}), linkedHashMap.values());
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{15, 101, 115, 91, -97, -88, -99, -44, 38, 108, 101, 107, -126}, new byte[]{121, 10, 23, 4, -17, -60, -4, -83}), join);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-30, -16, -59, 58, 70, 117, 67, -13, -53, -22, -45, 9}, new byte[]{-108, -97, -95, 101, 54, 25, 34, -118}), join2);
                                                        break;
                                                    case -61620572:
                                                        m897d9 = atm.m897d("B1DEA1E397C0B1E2A1E397FFB1DBA1ED97FAB1D8A1D397C0B1D6A1E997F4B1DAA1ED97C3B1E1A1EE97FAB1E1A1EC97F8B1DDA1D597FAB1E3A1E297C4B1E2");
                                                        break;
                                                    case 116169858:
                                                        if (linkedHashMap.size() <= 0) {
                                                            m897d9 = atm.m897d("B1E6A1D097FEB1E3A1D097C3B1D6A1D497FFB1E1A1EC97FCB1DCA1DE97FEB1E2A1DD97C3B1E6");
                                                            break;
                                                        } else {
                                                            m897d9 = atm.m897d("B1D6A1EC97FDB1D1A1E397C0B1D8A1EA97C1B1E2A1EE97C2B1E2A1E297F4B1DBA1D597CFB1DEA1ED97C4B1D1A1E997FC");
                                                            break;
                                                        }
                                                    case 446330254:
                                                        break;
                                                }
                                            }
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.put(jSONObject2);
                                            jSONObject.put(C0052e.m1418a(new byte[]{-118, 83, 49, 75}, new byte[]{-26, 58, 66, 63, -37, 99, -89, 84}), jSONArray);
                                            return jSONObject.toString();
                                        case -1009280514:
                                            String m960w02 = m967p03.get(i3).m966q0(C0052e.m1418a(new byte[]{-51, -61, -104, -12}, new byte[]{-66, -77, -7, -102, 83, -96, 21, 84})).m960w0();
                                            Iterator<String> keys = this.f1116b.keys();
                                            while (true) {
                                                String m897d10 = atm.m897d("B1DDA1D297FEB1E1A1DE97CEB1E2A1D497FAB1E2A1EC97F8B1DEA1D497FEB1DDA1DD97FCB1E1A1D997C0B1E3");
                                                while (true) {
                                                    switch (m897d10.hashCode() ^ (-474189801)) {
                                                        case -1897716460:
                                                            m897d10 = atm.m897d("B1DDA1ED97FDB1E1A1EE97C4B1E5A1EC97FDB1E1A1D497C0B1DFA1D597F0B1E2A1EF97FFB1E6A1ED97F8B1D2A1D597F3B1ECA1D097C4B1D8A1D497C0");
                                                        case -628839883:
                                                            String next = keys.next();
                                                            String m897d11 = atm.m897d("B1EDA1D597C3B1E6A1EC97FAB1E0A1D497F9B1E2A1EC97FCB1E0A1EC97FFB1DEA1D097C3B1E2A1EF97C4B1E6A1ED97F3B1DDA1DE97FEB1E5A1D7");
                                                            while (true) {
                                                                switch (m897d11.hashCode() ^ (-77454721)) {
                                                                    case -2100468494:
                                                                        break;
                                                                    case -2055671939:
                                                                        m897d11 = this.f1116b.getJSONObject(next).getString(C0052e.m1418a(new byte[]{-15, 101, 18, 10}, new byte[]{-126, 13, 125, 125, -112, -116, 98, 10})).equals(m960w02) ? atm.m897d("B1D8A1ED97FEB1EDA1D197F0B1D2A1D797FDB1E2A1DE97CEB1DBA1ED97FD") : atm.m897d("B1E3A1D297C3B1E3A1DE97C7B1DEA1E997FCB1E1A1DD97FFB1E1A1E397CE");
                                                                    case -1723620872:
                                                                        m960w02 = this.f1116b.getJSONObject(next).getString(C0052e.m1418a(new byte[]{4, -13, -23, 14}, new byte[]{119, -101, -122, 121, 21, -23, -77, 24}));
                                                                        z = true;
                                                                        break;
                                                                    case -262258252:
                                                                        m897d11 = atm.m897d("B1DFA1ED97C7B1D2A1D097FEB1E2A1D597CFB1E2A1D197FFB1D2A1D397FEB1DC");
                                                                }
                                                            }
                                                            break;
                                                        case 794483493:
                                                            m897d10 = keys.hasNext() ? atm.m897d("B1D8A1E297F4B1E1A1E997F8B1D2A1E997C3B1D1A1E297C0B1E2A1D597F4B1E6A1ED97CFB1E2A1D497C0B1E0A1EA97C2B1D1A1E297C1") : atm.m897d("B1E5A1ED97F9B1DFA1DE97FCB1DAA1DD97CEB1E2A1E397CEB1ECA1D397C4B1E5");
                                                        case 994571940:
                                                            z = false;
                                                            break;
                                                    }
                                                }
                                            }
                                            String m897d12 = atm.m897d("B1D2A1EC97F0B1D8A1EA97FCB1DBA1D797FDB1DEA1E397C0B1EDA1D797FEB1D1A1DE97FDB1E2");
                                            while (true) {
                                                switch (m897d12.hashCode() ^ (-1289869641)) {
                                                    case -857395843:
                                                        break;
                                                    case -683774214:
                                                        m897d12 = atm.m897d("B1E0A1DD97FFB1DBA1D597C1B1E3A1EE97F9B1E1A1EA97FFB1DDA1D497C0B1E2A1D397C1B1E6");
                                                    case 1884757451:
                                                        m897d12 = !z ? atm.m897d("B1E2A1D997F0B1E2A1D497F3B1E5A1EC97F0B1D2A1ED97FEB1DDA1D997F8B1D2A1DD97F8B1DEA1D297C4B1DEA1D397C0B1E5A1D097F3") : atm.m897d("B1DCA1D797FDB1E2A1D997FFB1EDA1D797C2B1DBA1EC97F8B1DCA1E2");
                                                    case 2103466019:
                                                        String str2 = "";
                                                        C0459g m967p05 = m967p04.get(i3).m967p0(C0052e.m1418a(new byte[]{-89}, new byte[]{-58, -41, 23, -68, -31, -10, -54, 110}));
                                                        ArrayList arrayList = new ArrayList();
                                                        int i4 = 0;
                                                        while (true) {
                                                            String m897d13 = atm.m897d("B1DAA1D997CEB1D2A1EC97F9B1DBA1ED97FEB1D6A1EE97F8B1E3A1EC97F9B1E2A1D597C3B1E0A1E397FDB1E1");
                                                            while (true) {
                                                                switch (m897d13.hashCode() ^ (-1544558191)) {
                                                                    case -1365459811:
                                                                        m897d13 = atm.m897d("B1ECA1D497FDB1DBA1EA97FEB1E2A1EF97CEB1DAA1DD97C4B1EDA1ED97C4B1DEA1D197F9B1E2A1ED97F9B1D6A1EC97C4B1E2A1D097F0B1D8A1E397C0");
                                                                    case -290602022:
                                                                        Matcher matcher = this.f1120f.matcher(m967p05.get(i4).mo925d(C0052e.m1418a(new byte[]{-111, -31, 19, -54}, new byte[]{-7, -109, 118, -84, -12, -49, -113, -9})));
                                                                        String m897d14 = atm.m897d("B1DDA1D997F9B1E5A1D497CEB1E2A1D097FAB1E6A1DD97FEB1DAA1E297FAB1ECA1EF97FAB1E5");
                                                                        while (true) {
                                                                            switch (m897d14.hashCode() ^ (-1383999993)) {
                                                                                case -371236536:
                                                                                    m897d14 = !matcher.find() ? atm.m897d("B1D1A1D397F0B1E2A1D397FFB1DCA1ED97C4B1DDA1EF97FDB1E5A1ED97C0B1D2A1D397CEB1DCA1DD97F3B1D6A1DD97F3B1D6A1EA97CEB1E2A1EC97C7B1E0") : atm.m897d("B1E0A1EC97F0B1EDA1D397FDB1D8A1D397C1B1E6A1D197C4B1E2A1EC97FDB1D8A1EE97F0B1D1A1E297F9B1E0A1EA97F9B1E2");
                                                                                case -304051843:
                                                                                    arrayList.add(c0293m.m960w0() + C0052e.m1418a(new byte[]{-118}, new byte[]{-82, -53, 81, 3, 87, 26, -85, 95}) + (matcher.group(1) + C0052e.m1418a(new byte[]{-8}, new byte[]{-43, -74, 120, 55, -27, -99, 29, -105}) + matcher.group(2) + C0052e.m1418a(new byte[]{-118}, new byte[]{-89, -103, -84, -95, -113, -98, -115, 83}) + matcher.group(3)));
                                                                                    break;
                                                                                case 514761451:
                                                                                    m897d14 = atm.m897d("B1EDA1E297F9B1D8A1EA97C2B1E2A1ED97C4B1E2A1D097FAB1D2A1ED97C2B1D8A1D797FCB1DBA1DE97F8B1D6A1E997FFB1D2A1D4");
                                                                                case 2054868974:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        i4++;
                                                                        break;
                                                                    case 185884701:
                                                                        m897d13 = i4 < m967p05.size() ? atm.m897d("B1E6A1DD97F3B1E1A1E997FAB1DFA1DD97C0B1E2A1EE97C7B1D6A1D797FAB1DDA1D297FCB1D8A1ED97FFB1E6A1ED97F4B1DCA1EE97C7B1E5A1D4") : atm.m897d("B1E0A1EF97F4B1E3A1DE97CFB1E1A1EE97CEB1E2A1D497C3B1DFA1D197F0B1E2A1EC97CE");
                                                                    case 812861104:
                                                                        String m897d15 = atm.m897d("B1E5A1D797F9B1E2A1D197FDB1E5A1D197CFB1D2A1D297C0B1D6A1D997F0B1D2A1ED97FCB1DDA1D097C0B1DBA1ED97CEB1D6A1D397FEB1E2");
                                                                        while (true) {
                                                                            switch (m897d15.hashCode() ^ (-1024240782)) {
                                                                                case -791953897:
                                                                                    str2 = TextUtils.join(C0052e.m1418a(new byte[]{-98}, new byte[]{-67, -16, 64, 88, -109, 20, -37, -88}), arrayList);
                                                                                    break;
                                                                                case -321767913:
                                                                                    m897d15 = atm.m897d("B1E5A1D197FCB1EDA1D097C0B1E2A1E997CFB1E5A1DD97C7B1D6A1D297FDB1DCA1ED97FEB1EDA1DD97CEB1E6A1DE97FEB1DBA1EF97FAB1DE");
                                                                                case 147866402:
                                                                                    break;
                                                                                case 1361430605:
                                                                                    m897d15 = arrayList.size() > 0 ? atm.m897d("B1DEA1D797F3B1DBA1D497C3B1DAA1D597FCB1DAA1D797C3B1DAA1E297C0B1E2A1D797F4B1E6A1ED97CFB1D2A1E3") : atm.m897d("B1D8A1D597FEB1D2A1EF97FEB1E2A1E997FDB1E2A1D497CEB1E2A1D597F0B1DAA1E397C2B1D6A1D197C3B1ED");
                                                                            }
                                                                        }
                                                                        String m897d16 = atm.m897d("B1DEA1ED97FDB1E2A1D997FEB1DDA1ED97CEB1E6A1E297C3B1E3A1D497C0B1D2A1EE97C1B1E6A1DE97FEB1E1A1EA97F3");
                                                                        while (true) {
                                                                            switch (m897d16.hashCode() ^ 734620395) {
                                                                                case -1338678145:
                                                                                    linkedHashMap.put(m960w02, str2);
                                                                                    continue;
                                                                                case 1292026089:
                                                                                    m897d16 = str2.length() == 0 ? atm.m897d("B1D2A1D297C7B1ECA1D397C2B1D2A1EF97FDB1DAA1E397F9B1E2A1EE97F3B1DCA1E297C2B1DDA1E397FCB1D2A1D997F4B1D1A1D997C2B1D6") : atm.m897d("B1E1A1E997FEB1D6A1E397C4B1E1A1EF97C3B1EDA1DE97C1B1D8A1EF97C7B1E1A1D097C2B1DFA1D297FFB1EDA1E997C0B1ECA1E297FA");
                                                                                case 1854707330:
                                                                                    m897d16 = atm.m897d("B1E6A1D297F4B1DFA1D097C0B1E6A1D197CFB1DCA1EC97C2B1E3A1D597FDB1E2A1EF97C3B1E5A1D197CEB1E1A1E397C0B1E0");
                                                                                case 2047759215:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            i2 = i3 + 1;
                                            break;
                                        case -22168602:
                                            m897d8 = i3 < m967p03.size() ? atm.m897d("B1EDA1D397F8B1E6A1E997FFB1DBA1E297F8B1E3A1D497FEB1DFA1EC97FFB1DCA1D797FD") : atm.m897d("B1EDA1E997FEB1E2A1DE97F0B1D2A1D097FCB1E1A1D397F4B1E2A1ED97FEB1E2A1EC97FAB1DFA1DD97CEB1E0A1D397FDB1DAA1E397C0B1E3A1EF97CEB1E2");
                                        case 736789622:
                                            m897d8 = atm.m897d("B1E2A1D097C0B1DDA1EA97CEB1D1A1EC97FCB1D8A1DE97F0B1D1A1E997FEB1E2A1D597FFB1ECA1ED");
                                    }
                                }
                            }
                            break;
                        case 1803006107:
                            m897d2 = atm.m897d("B1EDA1D797F8B1EDA1D397C0B1D1A1DE97FEB1E2A1EE97F0B1E3A1EA97FCB1DFA1ED97C1B1DEA1D597F3B1DFA1D297CFB1DFA1EF");
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
        String m1418a;
        C0459g m967p0;
        JSONArray jSONArray;
        int i = 0;
        try {
            C0288h m1414e = C0052e.m1414e(C0574b.m308e(C0052e.m1418a(new byte[]{100, 89, 58, -7, 81, -123, 27, -6, 101, 70, 47, -25, 91, -52, 26, -95, 122, 2}, new byte[]{12, 45, 78, -119, 34, -65, 52, -43}), m274a(f1115i)));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-8, 126, 94, 61, 31, 126, 20, 115, -3, 101, 8, 102, 29, 49, 12, 112, -22, 117, 73, 97, 92, 118, 22, 116, -15, 100, 8, Byte.MAX_VALUE, 24, 63, 3}, new byte[]{-100, 23, 40, 19, 113, 31, 98, 17}));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0293m> it = m967p02.iterator();
            while (true) {
                String m897d = atm.m897d("B1E5A1EA97C7B1DAA1EE97C2B1DFA1EA97C2B1EDA1DE97CEB1E2A1DE97C0B1DBA1ED97F8B1E2A1D297F0B1DBA1ED");
                while (true) {
                    switch (m897d.hashCode() ^ (-543721715)) {
                        case -1823684967:
                            JSONObject jSONObject = new JSONObject();
                            String m897d2 = atm.m897d("B1E6A1DE97FEB1E0A1ED97C7B1D2A1D997F3B1DDA1D297F4B1EDA1D397F8B1DFA1EA97FFB1EDA1EC97F3B1E6A1D997F3B1E1A1EE");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-997882852)) {
                                    case -1408552190:
                                        jSONObject.put(C0052e.m1418a(new byte[]{20, 61, -113, -49, -124, 46, 50}, new byte[]{114, 84, -29, -69, -31, 92, 65, 34}), this.f1117c);
                                        break;
                                    case -1405951008:
                                        m897d2 = atm.m897d("B1DFA1D197C4B1EDA1D997FFB1EDA1EA97F3B1DCA1D397F3B1D2A1E297FCB1DCA1DD97FCB1DBA1EF97F9");
                                        break;
                                    case 1461665953:
                                        if (!z) {
                                            m897d2 = atm.m897d("B1DFA1DD97FEB1D1A1D197F9B1DDA1DD97FAB1DCA1D297F9B1E2A1EF97C2B1ECA1ED97F4B1E1A1EE97F4B1D6A1ED97F0B1E5A1ED97C0B1D2");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1DDA1DE97FEB1E1A1D497C7B1D2A1D497C2B1E0A1EF97C3B1DAA1DE");
                                            break;
                                        }
                                    case 1470743379:
                                        break;
                                }
                            }
                            jSONObject.put(C0052e.m1418a(new byte[]{6, 82, 18, 71, -19}, new byte[]{101, 62, 115, 52, -98, 77, -67, -10}), jSONArray2);
                            try {
                                m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-113, 86, -102, -80, -19, -10, 27, 90, -121, 90, -63, -13, -31, -16, 17, 15, -43, 31, -120, -9, -10, -73, 18, 64, -113, 74, Byte.MIN_VALUE, -5, -83, -16, 11, 74, -122, 76}, new byte[]{-21, 63, -20, -98, Byte.MIN_VALUE, -103, Byte.MAX_VALUE, 47})).get(0).m967p0(C0052e.m1418a(new byte[]{-63}, new byte[]{-96, 52, 25, -122, 125, -99, 64, 30}));
                                jSONArray = new JSONArray();
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                            while (true) {
                                String m897d3 = atm.m897d("B1E1A1D597F9B1D1A1EA97FDB1E2A1EE97C1B1DBA1E397FDB1EDA1D997F9B1DDA1EA97C4B1D2A1DE97F3B1E6A1EC97CEB1E0");
                                while (true) {
                                    switch (m897d3.hashCode() ^ (-256198593)) {
                                        case -2023069718:
                                            JSONObject jSONObject2 = new JSONObject();
                                            C0293m c0293m = m967p0.get(i);
                                            Matcher matcher = this.f1119e.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{-93, 109, 123, 70}, new byte[]{-53, 31, 30, 32, 117, 111, -107, -60})));
                                            String m897d4 = atm.m897d("B1D6A1EE97F0B1E2A1D597CFB1E6A1ED97FCB1D2A1D497FEB1D8A1ED97FCB1ECA1D397FAB1DAA1DD97C0B1DDA1EF97CEB1E2A1E397C2B1DCA1E997FC");
                                            while (true) {
                                                switch (m897d4.hashCode() ^ (-1186143236)) {
                                                    case -1598383083:
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{83, 103, -34, 107, -11, -72}, new byte[]{37, 8, -70, 52, -100, -36, -22, -47}), matcher.group(1));
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-113, 45, 2, 107, -33, -62, -45, 12}, new byte[]{-7, 66, 102, 52, -79, -93, -66, 105}), c0293m.mo925d(C0052e.m1418a(new byte[]{31, -124, 97, -22, 12}, new byte[]{107, -19, 21, -122, 105, 124, -29, -115})));
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-126, 49, 72, -92, 103, -101, 109}, new byte[]{-12, 94, 44, -5, 23, -14, 14, -55}), C0652d.m148c(f1115i, c0293m.m966q0(C0052e.m1418a(new byte[]{90, 14, 76, 58, -58, 124, 99, 88, 82, 2, 23, 125, -33, 118, 106, 0, 78, 14, 89, 52, -62, 126, 96}, new byte[]{62, 103, 58, 20, -85, 19, 7, 45})).mo925d(C0052e.m1418a(new byte[]{-81, 30, -33, -95, 30, 126, -12, -14, -84, 22, -59, -95, 95}, new byte[]{-53, Byte.MAX_VALUE, -85, -64, 51, 17, -122, -101}))));
                                                        C0293m m966q0 = c0293m.m966q0(C0052e.m1418a(new byte[]{-9, 35, 78, 102, -103, -113, -13, -82, -1, 47, 21, 33, Byte.MIN_VALUE, -123, -6, -10, -3, 37, 76, 45}, new byte[]{-109, 74, 56, 72, -12, -32, -105, -37}));
                                                        String m897d5 = atm.m897d("B1DEA1DE97FEB1ECA1D097C1B1EDA1EE97CFB1E3A1EC97FEB1DFA1DD97CEB1E0A1D797F0B1DCA1D097FFB1DAA1E397C0B1E6A1D397CE");
                                                        while (true) {
                                                            switch (m897d5.hashCode() ^ 567348243) {
                                                                case -1962426772:
                                                                    jSONObject2.put(C0052e.m1418a(new byte[]{97, -79, 54, 54, -88, 0, 53, 115, 101, -75, 33}, new byte[]{23, -34, 82, 105, -38, 101, 88, 18}), c0293m.m966q0(C0052e.m1418a(new byte[]{46, -7, -73, 33, -2, -41, 83, -67, 38, -11, -20, 102, -25, -35, 90, -27, 46, -1, -76, 109, -14, -42}, new byte[]{74, -112, -63, 15, -109, -72, 55, -56})).m960w0().trim());
                                                                    break;
                                                                case -1402322349:
                                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-56, -49, -66, -59, -109, -110, -123, 75, -52, -53, -87}, new byte[]{-66, -96, -38, -102, -31, -9, -24, 42}), m966q0.m960w0().trim());
                                                                    break;
                                                                case 411493452:
                                                                    m897d5 = atm.m897d("B1E0A1E397CFB1ECA1EC97C4B1E2A1EE97F3B1E0A1EE97C2B1D6A1EE97FDB1DD");
                                                                case 921412852:
                                                                    m897d5 = m966q0 != null ? atm.m897d("B1E2A1EA97C4B1E2A1D797FFB1DEA1EE97CFB1DBA1ED97C7B1E3A1EA97C4B1E6A1E997C4B1EDA1D597C2B1DDA1D097C0") : atm.m897d("B1D6A1EF97CFB1DAA1D997FDB1DFA1EE97FDB1E2A1EC97C3B1EDA1D297C0B1DAA1EE97CEB1DFA1D397F0B1E2");
                                                            }
                                                        }
                                                        jSONArray.put(jSONObject2);
                                                        break;
                                                    case 591742954:
                                                        break;
                                                    case 1448850952:
                                                        m897d4 = atm.m897d("B1DDA1E997C0B1E2A1D397FEB1ECA1ED97FFB1E0A1E397C0B1E5A1EA97C7B1D1A1EA97F8B1DEA1ED97CEB1DFA1D097FCB1DDA1D7");
                                                    case 2082707768:
                                                        m897d4 = !matcher.find() ? atm.m897d("B1D6A1EE97F0B1E2A1D997C2B1DCA1ED97C4B1DBA1DD97FEB1E2A1E997C7B1DBA1E297FFB1EDA1D197CFB1DC") : atm.m897d("B1D2A1D397C4B1EDA1D597FDB1E2A1ED97CEB1DAA1EE97C7B1E0A1D597CEB1E6A1ED97FEB1E0A1DD97C3B1DFA1D2");
                                                }
                                            }
                                            i++;
                                            break;
                                        case -202894221:
                                            jSONObject.put(C0052e.m1418a(new byte[]{-56, -22, 63, 96}, new byte[]{-92, -125, 76, 20, -50, -102, -84, 105}), jSONArray);
                                            break;
                                        case 218017346:
                                            m897d3 = atm.m897d("B1DEA1D397FDB1E0A1DE97FFB1E3A1E997F0B1E2A1E997FCB1D6A1EE97F0B1E0A1ED97FDB1E1A1D497F8B1DCA1ED97F4B1DBA1DD97C4B1DAA1E9");
                                        case 1006383037:
                                            m897d3 = i < m967p0.size() ? atm.m897d("B1DFA1EE97FEB1E2A1DD97F3B1ECA1ED97C7B1EDA1E397C0B1D1A1D797F4B1D1A1DE97F8B1E5A1ED97FCB1D2A1D197C0B1DDA1EA97CEB1E2") : atm.m897d("B1DAA1D397F9B1E2A1E997CFB1EDA1EC97C1B1E1A1EC97FFB1D1A1EE97C4B1DAA1EC97FCB1D8A1EF97F3B1ECA1ED97FCB1EDA1EE97F8B1EDA1EA");
                                    }
                                }
                                return jSONObject.toString();
                            }
                        case -1560179545:
                            m897d = it.hasNext() ? atm.m897d("B1ECA1E297FAB1D6A1E297F8B1DFA1E997C2B1E5A1DD97F9B1D6A1D197F0B1EDA1D2") : atm.m897d("B1DBA1E397C1B1DCA1E297C4B1EDA1DD97C7B1DFA1E297CEB1D6A1ED97FFB1E3A1D997C1B1D8A1E297FAB1E2A1D297F0");
                        case -400233929:
                            C0293m next = it.next();
                            String m960w0 = next.m960w0();
                            String m897d6 = atm.m897d("B1DAA1D797FEB1D6A1E297F0B1E2A1D297C2B1D2A1ED97CEB1D6A1EE97FAB1E2A1D197C4B1E3A1D097C0B1E2A1D497C4B1DDA1E997C3");
                            while (true) {
                                switch (m897d6.hashCode() ^ 1414237706) {
                                    case -469951256:
                                        m1418a = m960w0;
                                        break;
                                    case -297425336:
                                        m897d6 = atm.m897d("B1D2A1D997F8B1DEA1E397C0B1E2A1E397C0B1DFA1ED97FAB1E5A1D297FFB1D8A1E397C7B1DCA1E397C0B1E3A1ED97C0B1DCA1D097C0B1E2A1E397F8B1DFA1ED");
                                    case 1879092018:
                                        m1418a = C0052e.m1418a(new byte[]{58, -80, -109, 17, 2, 6}, new byte[]{-35, 36, 38, -12, -65, -73, 66, -123});
                                        break;
                                    case 2014336292:
                                        m897d6 = m960w0.contains(C0052e.m1418a(new byte[]{105, -13, 19, -64, 70, 68}, new byte[]{-114, 103, -90, 37, -5, -11, 7, 110})) ? atm.m897d("B1ECA1D397FEB1D1A1DE97C3B1DAA1D997F8B1E0A1D397C4B1EDA1D797FDB1E2A1E397C0B1DCA1ED97F3B1DEA1EA97FCB1E5A1ED97F0B1DEA1DD") : atm.m897d("B1E1A1E297C3B1E5A1EE97F9B1E2A1EF97C7B1DDA1E297C0B1E1A1DD97C7B1D2A1ED97C1B1DDA1D397C0B1D6A1EC97F8");
                                }
                            }
                            String m897d7 = atm.m897d("B1E2A1D497F9B1E2A1D397CEB1ECA1ED97F8B1E5A1D197C7B1E2A1D097C0B1DEA1DE97FDB1D2A1E997CE");
                            while (true) {
                                switch (m897d7.hashCode() ^ (-1989473375)) {
                                    case -1733555861:
                                        Matcher matcher2 = this.f1118d.matcher(next.mo925d(C0052e.m1418a(new byte[]{101, -17, -126, -5}, new byte[]{13, -99, -25, -99, 95, -119, 21, -79})));
                                        String m897d8 = atm.m897d("B1DBA1D997F3B1DCA1D097C0B1EDA1D397FDB1E6A1ED97C0B1DDA1D997CFB1D2A1D497C0B1D6A1EF97CFB1E2A1D997FCB1D6A1EA97FF");
                                        while (true) {
                                            switch (m897d8.hashCode() ^ (-802438361)) {
                                                case -1439948794:
                                                    m897d8 = !matcher2.find() ? atm.m897d("B1D2A1ED97C1B1E2A1D997F9B1ECA1EE97FAB1E0A1D197CFB1EDA1E297FEB1EDA1D297C3") : atm.m897d("B1DDA1EC97FAB1E5A1D097C0B1E0A1D097F0B1D1A1D597FEB1D8A1D197FEB1E2");
                                                case -410520499:
                                                    String trim = matcher2.group(1).trim();
                                                    JSONObject jSONObject3 = new JSONObject();
                                                    jSONObject3.put(C0052e.m1418a(new byte[]{-124, 36, 73, -90, 118, -49, -109}, new byte[]{-16, 93, 57, -61, 41, -90, -9, -72}), trim);
                                                    jSONObject3.put(C0052e.m1418a(new byte[]{-118, -103, -72, -42, 89, 64, -43, 41, -101}, new byte[]{-2, -32, -56, -77, 6, 46, -76, 68}), m1418a);
                                                    jSONArray2.put(jSONObject3);
                                                    continue;
                                                case 427480545:
                                                    break;
                                                case 1588252158:
                                                    m897d8 = atm.m897d("B1E3A1EE97C7B1E3A1E397C7B1DEA1EE97CEB1D6A1DD97C1B1D2A1DD97C0B1D1A1E997C0B1E2");
                                            }
                                        }
                                        break;
                                    case -1021902686:
                                        m897d7 = Arrays.asList(C0052e.m1418a(new byte[]{-38, -41, 37, -59, 74, -17, -51, -80, -70}, new byte[]{61, 109, -113, 32, -9, 122, 42, 57}), C0052e.m1418a(new byte[]{-63, 67, 94, -27, -7, 66}, new byte[]{36, -40, -29, 0, 113, -39, 47, -92}), C0052e.m1418a(new byte[]{-118, 125, 64, 34, 49, -101}, new byte[]{109, -24, -22, -57, -72, 60, -109, 86}), C0052e.m1418a(new byte[]{-85, 79, -106, 24, 40, -59, -32, -89, -56}, new byte[]{77, -37, 40, -2, -80, 101, 5, 41})).contains(m1418a) ? atm.m897d("B1E5A1D497F9B1E1A1EC97F0B1E3A1D797CFB1E1A1E297F0B1DEA1D097F9B1D6A1D497FEB1E2") : atm.m897d("B1DFA1DD97C0B1D8A1E997F0B1E2A1ED97F9B1D8A1EC97CFB1DFA1EE97FEB1D2A1ED97FCB1D1A1D297F8B1D8A1E397F9B1D8A1EE97F3B1ED");
                                    case -665445377:
                                        m897d7 = atm.m897d("B1DCA1E397F8B1E6A1EC97C4B1E2A1DD97FFB1E2A1DE97F0B1E3A1DD97C0");
                                    case 1888435325:
                                        break;
                                }
                            }
                            break;
                        case 1638473722:
                            m897d = atm.m897d("B1E5A1EA97F0B1E2A1EC97C1B1E0A1E397FDB1DAA1EE97FAB1DAA1E297C4B1DCA1DE97FEB1D2A1ED");
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
            this.f1116b = new JSONObject(this.f1122h);
            this.f1117c = new JSONObject(atm.m897d("11584B57760311581110357A505819192D2B195856572239071F584F6EBFDBC19FEBC77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FE3D0BDE3DD58596E2E48405890DAC48FF3DD57317411581457767A8DF2CB93CFDD485658036E62489DF2C4AADBEF580759377A04584057AAD9FA9CFAE36E74480C584F6EBEEBEA9CF5DA7A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8DDDEB90F5E3485658036E62489DDDE4A9E1D1580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE3DD9CF6C97A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A82D7DC90C0F2485658036E624892D7D3A9D4C0580759377A04584057ABD2C59DC7DF6E74480C584F6EBFE0D59DC8E67A17560157227A50589FFFE4BFFEC158596E2E48405890C6F08DEEC157317411581457767A8FDFFD90F5E3485658036E62489FDFF2A9E1D1580759377A04584057AAF5CC9EC4D56E74480C584F6EBEC7DC9ECBEC7A17560157227A50589FF3DEB1F3D358596E2E48405890CACA83E3D357317411581457767A8CE4D093C4C0485658036E62489CE4DFAAD0F2580759377A04584057AAD9FA9CFAE36E74480C584F6EBEEBEA9CF5DA7A17560157227A50589CF7E0BFFCEB58596E2E48405893CEF48DECEB57317411581457767A8CF9F093CEC2485658036E62489CF9FFAADAF0580759377A04584057ABE3E59FFFCD6E74480C584F6EBFD1F59FF0F47A17560157227A505893E8DEBEF2DF58596E2E4840589CD1CA8CE2DF57317411581457767A8CECFD9DC5E2485658036E62489CECF2A4D1D0580759377A04584057A9E6C49DEEC0A9E5DB5856573A7A50589FCBE2BFFECF9FC8FD7A17560157227A50589FFAE8B0C9FF58596E2E48405890C3FC82D9FF57317411581457767A8FF4FC90C3EA485658036E62489FF4F3A9D7D8580759377A04584057A4E7FA9FF0DD6E74480C584F6EB0D5EA9FFFE47A17560157227A50589FF3D0BEF7EB58596E2E48405890CAC48CE7EB57317411581457767A8FFEC592E7FD485658036E62489FFECAABF3CF580759377A04584057ABE5FB9DC1E9ABCCDF9FC7C46E74480C584F6EBFD7EB9DCED0BFFECF9FC8FD7A17270759377A011F0357767A0B081F146E7448141B18297A50589FE9FCBDE6C058596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6EBDCEDD93ECCA7A46580C57767A8FDEDD9CD5DE4807560E6E364840589CEAC18CC2D557607A1C584057A5FEF39CC2DA6E254601581B6E62489FF5C5AAE1D45856573A7A50589FFAFCBED3C4580860234814584F6EBFD4F49FEEF17A46580C57767A8DC4F490D7E54807560E6E3648405893FFCD8FE1C757607A1C584057AAEBFF9FE1C86E254601581B6E624892F1C4A9C3D75856573A7A505892FEFDBDF1C7580860234814584F6EBEFDDF9CE9E07A46580C57767A8CEDDF93D0F44807560E6E364840589CD3F18FE1C757607A1C584057A5C7C39FE1C86E254601581B6E62489FC4C2A9C3D75856573A7A50589FCBFBBDF1C7580860234814584F6EBED9CA9FEEF17A46580C57767A8CC9CA90D7E54807560E6E3648405890C1E88FC0DC57607A1C584057A9D5DA9FC0D36E254601581B6E62489CFEFAA9FCCD9FF2DC6E74480C584F6EBEEEF59FD1EBBDE2D3580860234814584F6EB0CFC59DFAE1BFE3E358596E2E4840589DE9E78DF5D792C5C14807560E6E3648405890C6F88CF1C590E8FF485658036E62489FF0D5AAD3D59FDED26E254601581B6E62489FFFC3A8E3FC5856573A7A50589FF0FABCD1EC580811254601581E2921484058192D360D5856572239071F584F6EB0C5D792DDCC7A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FEEF1B0C5D758596E2E48405890D7E582D5D757317411581457767A82F1CB9DE3F5485658036E624892F1C4A4F7C7580759377A04584057ABEACE92D5D86E74480C584F6EBFD8DE92DAE17A17560157227A505893E2F1BDE7ED92DAE17A46580C57767A83EDC790C1CF82D5D757317411581457767A83E5D39DE3F5485658036E624893E5DCA4F7C7580759377A04584057AACFCF92D5D86E74480C584F6EBEFDDF92DAE17A17560157227A50589CC6D9B0C5D758596E2E48405893FFCD82D5D757317411581457767A8FC4CD9DE3F5485658036E62489FC4C2A4F7C7580759377A04584057A9DDDC9FD4F66E74480C584F6EBDEFCC9FDBCF7A17270759377A011F0357767A131F1B076E7448141B18297A50589FCCF8BCD1C758596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580811254601581E292148405817357A46581414213D48405893C2CA8FC0F557607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8CE6FA93DAE8485658036E62480E1318297A17560157227A50589CE9CCBFE9D758596E2E4840581D252C19580759377A04584057A4F7EE9FF2F36E74480C584F6E2B091508106E25370727596E6A4840210E6E330F03584F6E3B061B09066E7448141B18297A50589DC4F7BDF4F158596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6EBDE5DE92D6C97A46580C57767A8FF5DE9DEFDD4807560E6E3648405893C4C08EC0F357607A1C584057AAD0F29EC0FC6E254601581B6E624893E7E7AAC0CF9FFBC3A9DBE55856573A7A505893E8DEBEF2DF9FF4FABDE9F5580860234814584F6EBDFCE69FFCEB7A46580C57767A8FECE690C5FF4807560E6E3648405890E2EE8FC0D757607A1C584057A9F6DC9FC0D86E254601581B6E62489DF0DAABE5C05856573A7A50589DFFE3BFD7D0580860234814584F6EBDE0D29EC8D07A46580C57767A8FF0D291F1C44807560E6E3648405890E9DF8FC3C157607A1C584057A9FDED9FC3CE6E254601581B6E62489FF3D2AADBEF5856573A7A50589FFCEBBEE9FF580860234814584F6EBDE4FC9FFAFE7A46580C57767A8FF4FC90C3EA4807560E6E3648405892F7D78FFFC257607A1C584057ABE3E59FFFCD6E254601581B6E62489EC3D4AAC5FB5856573A7A50589ECCEDBEF7EB580860234814584F6EBEE9FF9CECE37A46580C57767A8CF9FF93D5F74807560E6E3648405890D9DE8CF2E257607A1C584057A9CDEC9CF2ED6E254601581B6E62489DC7E4A9D1CD5856573A7A50589DC8DDBDE3DD580860234814584F6EBDEFCC9ECEDA7A46580C57767A8FFFCC91F7CE48072708602348111F0C6E62481B08102D7A46581414213D48405890D0E88FF6C057607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8FFCFF90D0E8485658036E62489FFCF0A9C4DA580759377A04584057A5C7C39FE1C86E74480C584F6EB1F5D39FEEF17A17560157227A505893D3D5BED2D558596E2E4840589CEAC18CC2D557317411581457767A8FF5CA93F5E6485658036E62489FF5C5AAE1D4580759377A04584057AACFCF9CE6D96E74480C584F6EBEFDDF9CE9E07A17560157227A50589DCBC2BDF1C758596E2E48405892F2D68FE1C757317411581457767A8CC9CA90D7E5485658036E62489CC9C5A9C3D7580759377A04584057A4D3DB9FE1C86E74480C584F6EB0E1CB9FEEF17A17560157227A50589CE3FCBDE0DA9FE8ED7A46580C57767A8CECCA90C6F88FE7DB57317411581457767A8FFFCC91F7CE485658036E62489FFFC3A8E3FC580728317411581110357A50581614223F4856581B2D350F584057A4F7C792D2F56E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489FE1C8A4F7C75856573A7A50589FEEF1B0C5D7580860234814584F6EB0E1CB92DAE17A46580C57767A82F1CB9DE3F54807560E6E3648405892FEFC82D5D757607A1C584057ABEACE92D5D86E254601581B6E624893EDC8A9D5FD92D5D86E74480C584F6EB1FDC79FF8DBB0C5D7580860234814584F6EB1F5D392DAE17A46580C57767A83E5D39DE3F54807560E6E3648405893DBFD82D5D757607A1C584057AACFCF92D5D86E254601581B6E62489FFFC3A9F6E95856573A7A50589FF0FABDC4F9580811254601581E29214840580C2939185856572239071F584F6EBDD3CE9ECEF17A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A505848457E6B485658036E6248484A477F7A17560157227A505848457E6A485658036E6248484A477E7A17560157227A505848457E69485658036E6248484A477D7A17560157227A505848457E68485658036E6248484A477C7A17560157227A505848457D61485658036E6248484A44757A17560157227A505848457D60485658036E6248484A44747A17560157227A505848457D6F485658036E6248484A447B7A17560157227A505848457D6E485658036E6248484A447A7A17560157227A505848457D6D485658036E6248484A44797A17560157227A505848457D6C485658036E6248484A44787A17560157227A505848457D6B485658036E6248484A447F7A17560157227A505848457D6A485658036E6248484A447E7A17560157227A505848457D69485658036E6248484A447D7A17560157227A505848457D68485658036E6248484A447C7A17560157227A505848457C61485658036E6248484A45757A17560157227A505848457C60485658036E6248484A45747A17560157227A505848457C6E485658036E6248484A457A7A17560157227A505848457C6D485658036E6248484A45797A17560157227A505848457C6C485658036E6248484A45787A17270759377A011F0357767A080358596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405893D0D88CECCA57607A1C5840573831071F580860234814584F6EBEF6FA9DF6E17A46580C57767A02130E066E254601581B6E624892D5F1A9D0EC5856573A7A50580916232A0F580728310546584957760311581110357A505819192D2B195856572239071F584F6EBFDBC19FEBC77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A505893F5C5BFCDFA58596E2E4840589CCCD18DDDFA57317411581457767A8CF9FF93C8C7485658036E62489CF9F0AADCF5580759377A04584057A4F6D592CAFD6E74480C584F6EB0C4C592C5C47A17560157227A50589CE7E1BEE0DF58596E2E48405893DEF58CF0DF57317411581457767A8CEDFF93F4E0485658036E62489CEDF0AAE0D2580759377A04584057A5C7D99EC3E56E74480C584F6EB1F5C99ECCDC7A17560157227A50589DCBC2B1C9E558596E2E48405892F2D683D9E557317411581457767A8DC0D090E2C6485658036E62489DC0DFA9F6F4580759377A04584057AAC3D892F3CF6E74480C584F6EBEF1C892FCF67A17560157227A50589DE1D3BEDEC158596E2E48405892D8C78CCEC157317411581457767A8CC2C293C4D78EC0E890C6F0485658036E62489CC2CDAAD0E59EC0E7A9D2C2580759377A04584057A4ECC89DC1FA6E74480C584F6EB0DED89DCEC37A17560157227A50589CC4CEB0EBF658596E2E48405893FDDA82FBF657310517560157273D135840572D2A0F1B58596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890CADD8FE6CA57607A1C584057A9DEEF9FE6C56E254601581B6E62489CC2DAA9D7DA5856573A7A50589CCDE3BDE5CA580860234814584F6EBEFDDF93EAE57A46580C57767A8CEDDF9CD3F14807560E6E3648405893E0FF8DC4F457607A1C584057AAF4CD9DC4FB6E253707560E6E330F03584F6E340B141D57607A041B17106E624892D5D8A4F0EA5856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9C3D792D5D86E74480C584F6EBDF1C792DAE17A17560157227A505892FEFDB0C5D758596E2E4840589DC7E982D5D757317411581457767A8DC8DE9DE3F5485658036E62489DC8D1A4F7C7580759377A04584057A5CFD79FF7E2A4F7C75856573A7A505893E2F1BDE7ED92DAE17A17560157227A505893EAE5B0C5D758596E2E4840589CD3F182D5D757317411581457767A8CEDDF9DE3F5485658036E62489CEDD0A4F7C7580759377A04584057A9DDDC9FD4F66E74480C584F6EBDEFCC9FDBCF7A17270759377A011F0357767A131F1B076E7448141B18297A50589FCCF8BCD1C758596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580860234814584F6E6A5A4A4357607A1C5840577E685A43580860234814584F6E6A5A4A4257607A1C5840577E685A42580860234814584F6E6A5A4A4D57607A1C5840577E685A4D580860234814584F6E6A5A4A4C57607A1C5840577E685A4C580860234814584F6E6A5A4A4F57607A1C5840577E685A4F580860234814584F6E6A5A4A4E57607A1C5840577E685A4E580811254601581E292148405817357A46581414213D48405893C2CA8FC0F557607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8CE6FA93DAE8485658036E62480E1318297A17560157227A50589CE9CCBFE9D758596E2E4840581D252C19580759377A04584057A4F7EE9FF2F36E74480C584F6E2B091508106E25370727596E6C4840210E6E330F03584F6E3B061B09066E7448141B18297A50589DC4F7BDF4F158596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6EBEE9FF9CF1D37A46580C57767A8CF9FF93C8C74807560E6E3648405892EBC98FC3C157607A1C584057ABFFFB9FC3CE6E254601581B6E62489DF9D8A4F9EA5856573A7A50589DF6E1B0CBFA580860234814584F6EBEE4D29DE5CA7A46580C57767A8CF4D292DCDE4807560E6E3648405893DCC68DD6EB57607A1C584057AAC8F49DD6E46E254601581B6E62489FFCE7A5C1C35856573A7A50589FF3DEB1F3D3580860234814584F6EB0FAE792FBC57A46580C57767A82EAE79DC2D14807560E6E3648405893ECF98FE1D757607A1C584057AAF8CB9FE1D86E254601581B6E62489FF0DDA8E5F65856573A7A50589FFFE4BCD7E6580860234814584F6EBEF6C09CFDD47A46580C57767A8CE6C093C4C04807560E6E364840589DF3C88FF0D257607A1C584057A4E7FA9FF0DD6E254601581B6E62489CF2EDA8E2E35856573A7A50589CFDD4BCD0F3580860234814584F6EBDDAEB9FCCF87A46580C57767A8FCAEB90F5EC4807560E6E3648405890FCC98FDFC957607A1C584057A9E8FB9FDFC66E254601581B6E62489DDECBA8E4F05856573A7A50589DD1F2BCD6E0580860234814584F6EBDE4E59FFDD77A46580C57767A8FF4E590C4C34807560E6E3648405891F6EA8FD7EA57607A1C584057A8E2D89FD7E56E254601581B6E62489DE1FFAAC1D05856573A7A50589DEEC6BEF3C0580860234814584F6EBDE0CB9FCADB7A46580C57767A8FF0CB90F3CF4807560E6E3648405890C9EE8EC1EC57607A1C584057A9DDDC9EC1E36E253707560E6E330F03584F6E39181F1B57607A041B17106E62489FE6C5A9D4D05856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9C3D79EC0D26E74480C584F6EBDF1C79ECFEB7A17560157227A50589CE2E9BEF6D658596E2E48405893DBFD8CE6D657317411581457767A8CD6DD92F2D6485658036E62489CD6D2ABE6E4580759377A04584057A9DDDC9EC1E36E74480C584F6EBDEFCC9ECEDA7A17270759377A011F0357767A061B14126E7448141B18297A505892DAE1B0C2FA58596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6EBDF1C792DAE17A46580C57767A8FE1C79DE3F54807560E6E364840589DC7E982D5D757607A1C584057A4D3DB92D5D86E254601581B6E62489DC8D1A4F7C75856573A7A50589DC7E8B0C5D7580860234814584F6EB1FDC79FF8DBB0C5D758596E2E4840589CDBE58FF7ED9DE3F54807560E6E364840589CD3F182D5D757607A1C584057A5C7C392D5D86E254601581B6E62489CEDD0A4F7C75856573A7A50589CE2E9B0C5D7580860234814584F6EBDEFCC9FDBCF7A46580C57767A8FFFCC90E2DB48072708602348111F0C6E6248031F143E7A46581414213D48405890F5EC8EC1C757607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A584A48466E74480C584F6E6A5A484957317411581457767A584A48476E74480C584F6E6A5A484857317411581457767A584A48446E74480C584F6E6A5A484B57317411581457767A584A48456E74480C584F6E6A5A484A57317411581457767A584A4B4C6E74480C584F6E6A5A4B4357317411581457767A584A4B4D6E74480C584F6E6A5A4B4257317411581457767A584A4B426E74480C584F6E6A5A4B4D57317411581457767A584A4B436E74480C584F6E6A5A4B4C57317411581457767A584A4B406E74480C584F6E6A5A4B4F57317411581457767A584A4B416E74480C584F6E6A5A4B4E57317411581457767A584A4B466E74480C584F6E6A5A4B4957317411581457767A584A4B476E74480C584F6E6A5A4B4857317411581457767A584A4B446E74480C584F6E6A5A4B4B57317411581457767A584A4B456E74480C584F6E6A5A4B4A57317411581457767A584A4A4C6E74480C584F6E6A5A4A4357317411581457767A584A4A4D6E74480C584F6E6A5A4A4257317411581457767A584A4A426E74480C584F6E6A5A4A4D57317411581457767A584A4A436E74480C584F6E6A5A4A4C57317411581457767A584A4A406E74480C584F6E6A5A4A4F57317411581457767A584A4A416E74480C584F6E6A5A4A4E57310517560157273D135840572E214856581B2D350F584057AAD6F89FC0FA6E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489CE6F5AACEDA5856573A7A50580E1C213D4807560E6E3648405893D0D88DF9D757607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5F58402E377A011F0357767A09161B063F7A46581414213D48405892FDE38FE4F157607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857310517560157273D135840572D2A0F1B58596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A48072708602348111F0C6E6248161B1B2B7A46581414213D4840589DE3F582D2FA57607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857310517560157273D13584057353D0B0858596E360B171F57767A8FC3CE91F7E5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A48072708602348111F0C6E6248180357607A041B17106E62489CF4E7A9E2E55856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057AAC4EA9CECC56E74480C584F6E2C03171F57317411581457767A8CE6FA92CFF5485658036E62481213013F7A17560157227A505892DAC8BDE2FC58596E2E484058062F37181F580811253707"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0098, code lost:
        continue;
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String playerContent(java.lang.String r13, java.lang.String r14, java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0599n.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        String m897d = atm.m897d("B1D1A1D797F9B1E2A1E997C0B1ECA1EA97F0B1D1A1DD97FDB1D6A1D197C0B1ECA1ED97CEB1DDA1D597F0B1E0A1D397C0B1D8A1EF97F3B1E3A1E997C0B1E2");
        while (true) {
            switch (m897d.hashCode() ^ 2058104597) {
                case -1235391385:
                    if (!z) {
                        m897d = atm.m897d("B1D1A1EE97FDB1E0A1E297FEB1E2A1EA97FFB1DFA1ED97CEB1D8A1D397F8B1E6A1EA97C7B1D2A1D497C0B1DAA1ED97C2");
                        break;
                    } else {
                        m897d = atm.m897d("B1D1A1ED97C0B1DCA1EA97CFB1D6A1D997F9B1D2A1EE97FFB1EDA1D297FFB1DFA1EE97FAB1D2A1E297F0B1E2");
                        break;
                    }
                case 89885004:
                    return "";
                case 1718517391:
                    try {
                        try {
                            JSONObject jSONObject = new JSONObject(C0574b.m307f(C0052e.m1418a(new byte[]{16, 69, -60, 72, 81, 92, 35, -92, 17, 90, -47, 86, 91, 21, 34, -1, 14, 30, -39, 86, 70, 3, 116, -91, 8, 89, -64, 23, 67, 12, 109, -13, 87, 66, -59, 95, 69, 3, Byte.MAX_VALUE, -1, 71, 92, -39, 92, 31, 87, 42, -4, 28, 12}, new byte[]{120, 49, -80, 56, 34, 102, 12, -117}) + URLEncoder.encode(str) + C0052e.m1418a(new byte[]{9, 22, -29, 10, 5, 124, -85, -42, 31, 92, -2, 14, 1, 109, -27, -109, 78, 23, -6, 90}, new byte[]{47, 122, -118, 103, 108, 8, -106, -25}) + System.currentTimeMillis(), m274a(f1115i), null));
                            JSONObject jSONObject2 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            String m897d2 = atm.m897d("B1DAA1D997F0B1DEA1D497FFB1E6A1D197C0B1E2A1ED97F3B1DBA1ED97F0B1D2A1D097C0B1ECA1ED97FFB1D2A1D997C1");
                            while (true) {
                                switch (m897d2.hashCode() ^ 953670723) {
                                    case -1518785583:
                                        break;
                                    case -1247660428:
                                        m897d2 = atm.m897d("B1DBA1D997C7B1DDA1DE97C3B1D6A1D097C3B1E6A1D497C4B1E2A1EC97F9B1DDA1ED");
                                        break;
                                    case -275622912:
                                        if (jSONObject.getInt(C0052e.m1418a(new byte[]{37, 68, -81, -76, -34}, new byte[]{81, 43, -37, -43, -78, 111, -29, -57})) <= 0) {
                                            m897d2 = atm.m897d("B1E3A1D297FEB1E2A1D197CFB1E1A1D097F9B1DBA1EC97C4B1ECA1ED97C0B1EDA1D097C0B1DCA1DD97C4B1E2");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1DCA1ED97F4B1E3A1D097F9B1E2A1D397FEB1DCA1EC97F8B1E2A1ED97FEB1E3A1E397F4B1E2A1D397C0B1E6A1D397C4B1E2A1DD97F8B1E0A1E297C4B1DD");
                                            break;
                                        }
                                    case 2083841978:
                                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString(C0052e.m1418a(new byte[]{39, 54, -124, -9}, new byte[]{75, 95, -9, -125, -29, 98, -96, -34})));
                                        int i = 0;
                                        while (true) {
                                            String m897d3 = atm.m897d("B1E3A1D197F0B1E2A1D997FDB1E3A1D097F3B1ECA1ED97F0B1DDA1ED97C0B1DAA1ED97FEB1E2A1E297F8B1E1");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ 1363440517) {
                                                    case -1761644752:
                                                        break;
                                                    case -969890375:
                                                        m897d3 = i < jSONArray2.length() ? atm.m897d("B1D6A1D297F4B1EDA1E297C0B1E2A1EA97F3B1DBA1ED97F4B1D8A1E397FDB1DCA1D197C0B1E0A1E3") : atm.m897d("B1DCA1E297F9B1D1A1DD97F0B1E2A1DE97F3B1E2A1EF97FEB1D2A1ED97C4B1DDA1EF");
                                                    case -697429219:
                                                        break;
                                                    case 1468781880:
                                                        m897d3 = atm.m897d("B1E5A1E997FDB1E2A1D097CFB1E3A1D297CEB1D8A1D297C4B1D2A1D097F8B1DDA1D597FAB1D6");
                                                }
                                            }
                                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                                            String string = jSONObject3.getString(C0052e.m1418a(new byte[]{-11, 64}, new byte[]{-100, 36, -61, 77, 16, 69, -52, -98}));
                                            String string2 = jSONObject3.getString(C0052e.m1418a(new byte[]{42, -85, -32, -62}, new byte[]{68, -54, -115, -89, 115, 14, 3, -112}));
                                            String string3 = jSONObject3.getString(C0052e.m1418a(new byte[]{-50, -34, 98}, new byte[]{-66, -73, 1, -108, 66, -92, -86, 78}));
                                            JSONObject jSONObject4 = new JSONObject();
                                            jSONObject4.put(C0052e.m1418a(new byte[]{0, -103, -67, -16, -15, -51}, new byte[]{118, -10, -39, -81, -104, -87, 48, -120}), string);
                                            jSONObject4.put(C0052e.m1418a(new byte[]{-102, -9, -56, -59, -84, 59, -98, 48}, new byte[]{-20, -104, -84, -102, -62, 90, -13, 85}), string2);
                                            jSONObject4.put(C0052e.m1418a(new byte[]{105, 29, -108, -43, 82, 32, 17}, new byte[]{31, 114, -16, -118, 34, 73, 114, 87}), string3);
                                            jSONObject4.put(C0052e.m1418a(new byte[]{10, -96, 119, 69, 113, -110, -118, -47, 14, -92, 96}, new byte[]{124, -49, 19, 26, 3, -9, -25, -80}), "");
                                            jSONArray.put(jSONObject4);
                                            i++;
                                        }
                                        break;
                                }
                            }
                            jSONObject2.put(C0052e.m1418a(new byte[]{76, -81, -6, -59}, new byte[]{32, -58, -119, -79, 79, -99, 116, -34}), jSONArray);
                            return jSONObject2.toString();
                        } catch (Exception e) {
                            e = e;
                            SpiderDebug.log(e);
                            return "";
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                    break;
                case 1986497551:
                    m897d = atm.m897d("B1ECA1EC97C4B1E2A1EE97F0B1D1A1EA97C3B1E2A1ED97C2B1ECA1D797CEB1DFA1EF97F0B1E2A1D397C0B1D2A1D497F9B1E2A1E397F9B1E6A1ED");
                    break;
            }
        }
    }
}
