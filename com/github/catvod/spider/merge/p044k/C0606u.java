package com.github.catvod.spider.merge.p044k;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p050n.C0629f;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.u */
/* loaded from: classes.dex */
public final class C0606u extends Spider {

    /* renamed from: g */
    private static final String f1151g;

    /* renamed from: h */
    public static final int f1152h = 0;

    /* renamed from: a */
    private JSONObject f1153a;

    /* renamed from: b */
    private JSONObject f1154b;

    /* renamed from: c */
    private final Pattern f1155c = Pattern.compile(C0052e.m1418a(new byte[]{39, -18, 61, -17, 115, 96, 20, -80, 109, -73, 59, -17, 115, 60, 49, -92, 35, -79, 124, -29, 40, 121, 1}, new byte[]{8, -104, 82, -117, 92, 20, 109, -64}));

    /* renamed from: d */
    private final Pattern f1156d = Pattern.compile(C0052e.m1418a(new byte[]{106, Byte.MIN_VALUE, -111, 84, -1, 34, 80, -3, 36, -97, -110, 31, -71, 34, 26, -95, 25, -110, -43, 25, -2, 46, 65, -28, 41}, new byte[]{69, -10, -2, 48, -48, 70, 53, -119}));

    /* renamed from: e */
    private final Pattern f1157e = Pattern.compile(C0052e.m1418a(new byte[]{0, -87, -65, 4, 34, -124, -78, -87, 86, -16, -71, 4, 34, -36, -126, -84, 4, -10, -1, 19, 100, -112, -15, -32, 115, -69, -5, 73, 34, -102, -73, -84, 0, -9, -116, 4, 38, -35, -16, -96, 91, -78, -68}, new byte[]{47, -33, -48, 96, 13, -12, -34, -56}));

    /* renamed from: f */
    private final Pattern f1158f = Pattern.compile(C0052e.m1418a(new byte[]{-6, -116, -125, 96, 40, 77, 53, -120, -119, -9, -12, 43, 115, 5, 14, -66, -115}, new byte[]{-90, -33, -88, 79, 88, 44, 82, -19}));

    static {
        String m897d = atm.m897d("B1D2A1D497F4B1D1A1E297C4B1DBA1DD97F9B1EDA1D797FEB1E2A1D397CFB1DDA1D797F4B1D2A1ED97C3B1E1A1EC");
        while (true) {
            switch ((m897d.hashCode() ^ 665) ^ (-234975775)) {
                case -2054875944:
                    return;
                case 1245224915:
                    C0052e.m1418a(new byte[]{-70, -84, -89, 14, -81, -93, 124, -112, -85, -21, -88, 4, -77}, new byte[]{-62, -59, -58, 97, -57, -58, 21, -3});
                    m897d = atm.m897d("B1DDA1DD97C4B1E2A1E297CFB1ECA1ED97F3B1E1A1DD97CEB1E6A1D797CEB1E5A1EC97FEB1DBA1ED97F4B1DAA1D1");
                    break;
                case 1972167643:
                    f1151g = C0052e.m1418a(new byte[]{38, -17, 72, -106, -111, -112, 52, -97, 54, -14, 93, -119, -118, -49, 114, -35, 39, -75, 82, -125, -106, -123, 114, -34, 42, -2, 68, -56, -110, -62, 107}, new byte[]{78, -101, 60, -26, -30, -86, 27, -80});
                    m897d = atm.m897d("B1D8A1EC97C4B1E2A1D497FEB1ECA1ED97FDB1DAA1EE97C0B1E0A1DE97C3B1DEA1D497F9B1DBA1D097FFB1DBA1EF97C4B1DAA1EA");
                    break;
            }
        }
    }

    /* renamed from: a */
    protected static HashMap<String, String> m253a() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1DAA1EF97C0B1E3A1D297FFB1ECA1D497C0B1D8A1EF97CEB1DDA1EC");
        while (true) {
            switch ((m897d.hashCode() ^ 296) ^ (-850959994)) {
                case -1738356474:
                    hashMap.put(C0052e.m1418a(new byte[]{-26, 50, -29, 104, -27, 10, 17, 7, -35, 53}, new byte[]{-77, 65, -122, 26, -56, 75, 118, 98}), C0052e.m1418a(new byte[]{-111, -88, 10, -75, 24, 122, 36, 64, -23, -23, 64, -4, 92, 65, 44, 1, -72, -88, 7, -81, 84, 88, 17, 79, -19, -9, 94, -20, 79, 54, 18, 6, -78, -15, 68, -25, 84, 110, 115, 91, -11, -25, 49, -84, 4, 122, 32, 56, -71, -91, 59, -75, 0, 57, 112, 92, -21, -23, 67, -22, 84, 62, 14, 39, -120, -118, 60, -16, 84, 122, 44, 4, -71, -25, 55, -71, 23, 125, 42, 70, -4, -124, 24, -82, 27, 123, 32, 64, -19, -9, 66, -14, 68, 56, 112, 95, -20, -14, 94, -22, 70, 54, 22, 14, -70, -90, 2, -75, 91, 35, 118, 88, -14, -12, 70}, new byte[]{-36, -57, 112, -36, 116, 22, 69, 111}));
                    m897d = atm.m897d("B1E0A1D997C3B1DFA1D297F9B1E2A1D397CEB1D8A1E297CEB1DCA1D197F4B1E2");
                    break;
                case 317189695:
                    return hashMap;
                case 398955920:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1DEA1D597C0B1E2A1EF97C0B1E1A1D797F9B1E5A1D997FFB1DAA1ED97F4B1D8");
                    break;
                case 1489140183:
                    hashMap.put(C0052e.m1418a(new byte[]{-44, -93, -85, 20, 73, -33, 16}, new byte[]{-122, -58, -51, 113, 59, -70, 98, 75}), f1151g);
                    m897d = atm.m897d("B1ECA1EF97C7B1DCA1DE97FCB1DEA1D397FEB1E2A1E297FAB1E6A1ED97F4B1E1A1D497C0B1D1A1D297F0B1E2A1D397FCB1DA");
                    break;
            }
        }
    }

    /* renamed from: b */
    protected final HashMap<String, String> m252b(String str) {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1DAA1EF97C0B1D8A1D997FFB1D6A1EA97FEB1DCA1D197FAB1DAA1D397F8B1DCA1D297FCB1E5A1EE97C3");
        while (true) {
            switch ((m897d.hashCode() ^ 345) ^ 1258948936) {
                case -1876982737:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1DCA1E397C4B1E2A1D797F9B1E2A1D497F4B1E1A1D997F3B1DCA1D097FEB1DDA1D397F4B1E5A1E297CFB1E2A1D597C2B1DDA1EF97FCB1DCA1ED");
                    break;
                case -1655896195:
                    hashMap.put(C0052e.m1418a(new byte[]{124, Byte.MAX_VALUE, -73, 108, -20, 97}, new byte[]{61, 28, -44, 9, -100, 21, -39, 51}), C0052e.m1418a(new byte[]{6, -80, 27, -18, 89, 79, -110, -26, 30, -7, 2, -22, 6, 75, -113, -24, 19, -95, 10, -11, 24, 8, -98, -29, 6, -72, 15, -79, 14, 74, -118, -89, 19, -91, 19, -10, 31, 68, -121, -1, 27, -70, 13, -75, 14, 74, -118, -80, 3, -24, 83, -76, 79, 11, -113, -26, 19, -78, 6, -75, 1, 66, -124, -5, 94, -1, 76, -80, 77, 86, -37, -69, 92, -19}, new byte[]{114, -43, 99, -102, 118, 39, -26, -117}));
                    m897d = atm.m897d("B1DFA1E297F3B1DEA1EC97C4B1E2A1D397C7B1E6A1ED97F9B1DEA1DD97FDB1EDA1E397F3B1DDA1EA");
                    break;
                case -1624760688:
                    m897d = atm.m897d("B1DFA1E397FFB1DFA1D797F8B1D6A1EC97FEB1E2A1E397C0B1DCA1E997C2B1E3A1EE97FAB1DFA1D197FCB1E3");
                    break;
                case -1537337193:
                    m897d = atm.m897d("B1EDA1ED97CFB1E1A1EE97F3B1DDA1D097C2B1ECA1EA97FFB1DDA1E397FEB1E6A1D797F9B1E3A1D197CEB1DDA1ED");
                    break;
                case -1098525197:
                    hashMap.put(C0052e.m1418a(new byte[]{76, 1, 20, -29, 60, -81, -91, -66, 119, 6}, new byte[]{25, 114, 113, -111, 17, -18, -62, -37}), C0052e.m1418a(new byte[]{0, 114, 39, -125, -76, -108, -86, 99, 120, 51, 109, -54, -16, -75, -86, 47, 36, 115, 41, -123, -85, -112, -16, 108, 4, 115, 41, -113, -76, -40, -122, 45, 46, 61, 18, -71, -8, -96, -21, 125, 125, 66, 108, -33, -121, -49, -30, 108, 12, 109, 45, -122, -67, -81, -82, 46, 6, 116, 41, -59, -19, -53, -4, 98, 126, 43, 125, -62, -109, -80, -97, 1, 1, 49, 125, -122, -79, -109, -82, 108, 10, 120, 62, -127, -73, -47, -21, 15, 37, 111, 50, -121, -67, -41, -14, 125, 99, 45, 115, -34, -20, -49, -7, 98, 124, 44, 105, -54, -117, -103, -83, 45, 63, 116, 114, -33, -21, -49, -27, Byte.MAX_VALUE, 123}, new byte[]{77, 29, 93, -22, -40, -8, -53, 76}));
                    m897d = atm.m897d("B1DAA1D997C3B1D2A1D197C2B1E3A1D597C2B1EDA1D497C1B1D1A1DD97C1B1D8A1EF97C1B1E6A1EA97C0B1E2A1EE97FFB1DCA1D397F3");
                    break;
                case -518824637:
                    hashMap.put(C0052e.m1418a(new byte[]{25, 59, -39}, new byte[]{93, 117, -115, 102, -118, -52, 13, -1}), C0052e.m1418a(new byte[]{-79}, new byte[]{Byte.MIN_VALUE, -122, -10, -60, 68, 118, -112, 8}));
                    m897d = atm.m897d("B1DEA1EE97C1B1D2A1E997CEB1DAA1D797C0B1DBA1DE97F8B1ECA1E397FFB1E2A1D397CFB1E5A1D297C3B1DCA1ED97F8B1E5A1ED97C0");
                    break;
                case -180045676:
                    hashMap.put(C0052e.m1418a(new byte[]{119, 6, 54, -95, 41, 47, -37, -42, 87, 11, 50, -79, 56, 60, -109}, new byte[]{54, 101, 85, -60, 89, 91, -10, -102}), C0052e.m1418a(new byte[]{-5, 39, 56, 121, -9, -100, -124, -116, -70, 62, 40, 10, -105, -120, -46, -98, -23, 98, 65, 109, -126, -63, -61, -44, -81, 120, 57, 64, -47, -99, -74, -81, -70, 62, 40, 10, -105, -123, -46, -127, -17, 98, 64, 105, -126, -63, -61, -44, -81, 124, 57, 95, -41, -117, -113, -39, -79, 97, 39}, new byte[]{-127, 79, 21, 58, -71, -80, -2, -28}));
                    m897d = atm.m897d("B1DFA1D097C1B1DAA1ED97C2B1E5A1D797CFB1ECA1D397C2B1DCA1EF97F0B1DEA1D297F9");
                    break;
                case 1205289688:
                    return hashMap;
                case 1265910137:
                    hashMap.put(C0052e.m1418a(new byte[]{-27, 14, 57, -67, -27, -106}, new byte[]{-120, 107, 77, -43, -118, -14, -115, -29}), C0052e.m1418a(new byte[]{-51, -49, 96}, new byte[]{-118, -118, 52, 40, 23, -5, -106, -126}));
                    m897d = atm.m897d("B1E0A1E297F0B1E0A1E997CEB1E2A1DD97C7B1E5A1EE97F3B1E6A1D997CEB1E6A1E397FC");
                    break;
                case 2094855484:
                    hashMap.put(C0052e.m1418a(new byte[]{7, -39, -13, -36, -1, 6, -15, -57, 27, -57, -25, -53, -3, 23, -26, -113, Byte.MAX_VALUE, -5, -15, -33, -21, 7, -25, -98, 33}, new byte[]{82, -87, -108, -82, -98, 98, -108, -22}), C0052e.m1418a(new byte[]{13}, new byte[]{60, -47, 13, 21, -24, 85, Byte.MAX_VALUE, 34}));
                    m897d = atm.m897d("B1DAA1D097F8B1E3A1EA97F4B1DFA1E297FEB1E2A1DE97C3B1E0A1EA97CEB1E6A1ED97CFB1E5A1D197FCB1EDA1ED97C0B1E3A1E997CE");
                    break;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 416
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.lang.String categoryContent(java.lang.String r14, java.lang.String r15, boolean r16, java.util.HashMap<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 2586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0606u.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 485
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.lang.String detailContent(java.util.List<java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 3690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0606u.detailContent(java.util.List):java.lang.String");
    }

    public final String homeContent(boolean z) {
        boolean z2;
        JSONArray jSONArray;
        Iterator<C0293m> it;
        try {
            String str = f1151g;
            C0288h m1414e = C0052e.m1414e(C0629f.m179f(str, m252b(str)));
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{Byte.MIN_VALUE, -50, -49, -68, 114, -40, Byte.MIN_VALUE, 55, -112, -52, -108, -20, Byte.MAX_VALUE, -57, -109, 59}, new byte[]{-11, -94, -31, -46, 19, -82, -83, 90}));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0293m> it2 = m967p0.iterator();
            while (true) {
                String m897d = atm.m897d("B1D1A1D497C0B1E2A1E397C3B1DFA1DE97C3B1E2A1D797F9B1EDA1E297F9B1D2A1E297F9B1E2A1ED");
                while (true) {
                    switch (m897d.hashCode() ^ 787972933) {
                        case 281998853:
                            JSONObject jSONObject = new JSONObject();
                            String m897d2 = atm.m897d("B1E1A1EF97CFB1DFA1D197F3B1D8A1EE97FEB1D1A1DE97F9B1E2A1ED97F9B1D2A1ED97FFB1D1A1ED97C0B1DDA1D297F0B1E2");
                            while (true) {
                                switch (m897d2.hashCode() ^ 207928234) {
                                    case -1103278398:
                                        jSONObject.put(C0052e.m1418a(new byte[]{63, 73, 96, -61, 97, -17, 72}, new byte[]{89, 32, 12, -73, 4, -99, 59, 86}), this.f1154b);
                                        break;
                                    case -22305828:
                                        m897d2 = atm.m897d("B1EDA1EC97F0B1E2A1EA97C0B1E5A1D797F8B1DFA1E297C4B1D2A1ED97F3B1DAA1DD97C2B1DBA1D597F4B1E2A1D7");
                                        break;
                                    case 1155107382:
                                        break;
                                    case 1980446327:
                                        if (!z) {
                                            m897d2 = atm.m897d("B1DEA1ED97F0B1E3A1D597C0B1DDA1D397C7B1D2A1E397F0B1E2A1D997FFB1DFA1ED97CEB1DFA1D397C0B1E2A1EC97C2B1DEA1D397FF");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1EDA1D297C1B1DFA1E397CEB1D1A1EE97FDB1D1A1EC97C4B1E2A1EA97FEB1DCA1ED97FFB1D1A1D197C2B1EDA1D397F0B1DAA1D497F8B1DCA1D5");
                                            break;
                                        }
                                }
                            }
                            jSONObject.put(C0052e.m1418a(new byte[]{87, -31, 21, 22, -86}, new byte[]{52, -115, 116, 101, -39, 109, 40, 69}), jSONArray2);
                            try {
                                C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{92, 87, -46, -41, -14, -108, -67, 21, 95, 84, -104, -42, -30, -110, -96}, new byte[]{41, 59, -4, -70, -117, -31, -44, 56})).get(1).m967p0(C0052e.m1418a(new byte[]{36, 37, 91, 60, 38, -84, -33, -17, 109, 58, 66, 118, 39, -68, -39, -14, 31, 19, 79, 125, 51, -21, -53}, new byte[]{64, 76, 45, 18, 75, -43, -86, -122}));
                                jSONArray = new JSONArray();
                                it = m967p02.iterator();
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                            while (true) {
                                String m897d3 = atm.m897d("B1DAA1D297C4B1D8A1EC97F9B1D1A1D097F9B1E3A1E397FFB1E6A1EE97FDB1E3A1ED97F8B1D2A1D097C0B1E1A1E297C4B1DFA1D197FD");
                                while (true) {
                                    switch (m897d3.hashCode() ^ (-1508634160)) {
                                        case -1320972918:
                                            jSONObject.put(C0052e.m1418a(new byte[]{-126, -57, 1, 6}, new byte[]{-18, -82, 114, 114, -95, -30, -71, 29}), jSONArray);
                                            break;
                                        case -916220866:
                                            m897d3 = it.hasNext() ? atm.m897d("B1E6A1E397F9B1E2A1D297FCB1D8A1D197F9B1DFA1D197C4B1E1A1EA97F4B1ECA1D597FAB1D1") : atm.m897d("B1D2A1EA97C0B1DCA1D397CEB1D2A1D397F9B1E2A1E297CFB1E2A1ED97F3B1E1A1D197F8B1E2A1D297C0B1E1A1D097CF");
                                        case 747547475:
                                            C0293m next = it.next();
                                            String mo925d = next.mo925d(C0052e.m1418a(new byte[]{71, -73, -26, 99, 66}, new byte[]{51, -34, -110, 15, 39, -100, 97, 80}));
                                            String mo925d2 = next.mo925d(C0052e.m1418a(new byte[]{-113, 12, 58, -80, 113, -44, -39, 7, -116, 4, 32, -80, 48}, new byte[]{-21, 109, 78, -47, 92, -69, -85, 110}));
                                            String m960w0 = next.m966q0(C0052e.m1418a(new byte[]{84, -4, -54, -80, 119, -31, 38, 4, 10, -8, -50, -90, 45}, new byte[]{39, -116, -85, -34, 89, -111, 79, 103})).m960w0();
                                            Matcher matcher = this.f1156d.matcher(next.mo925d(C0052e.m1418a(new byte[]{112, -58, 114, -103}, new byte[]{24, -76, 23, -1, -52, -30, -58, -120})));
                                            String m897d4 = atm.m897d("B1D1A1EA97FAB1EDA1D597FDB1E2A1EF97F9B1ECA1ED97FEB1DFA1D097CEB1ECA1D297C0B1E5A1D097C0B1DAA1D297F0B1DDA1D7");
                                            while (true) {
                                                switch (m897d4.hashCode() ^ (-124766790)) {
                                                    case -1969286177:
                                                        break;
                                                    case 725005364:
                                                        m897d4 = !matcher.find() ? atm.m897d("B1D8A1E997FAB1DCA1DE97F8B1EDA1D597FEB1DCA1ED97FAB1EDA1D997F8B1E1A1D097C4B1D2A1E397F9B1DEA1D497F4B1E6A1DE97F0B1E2") : atm.m897d("B1D2A1D097F0B1E2A1D097CEB1E6A1ED97CFB1D8A1DE97C7B1DBA1E997C0B1EDA1D997C2B1DAA1DE97C4B1E2A1E297CEB1E2A1EF97F4B1DDA1DD97FEB1D2");
                                                    case 1033528636:
                                                        String group = matcher.group(1);
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-85, -61, 70, -57, -7, 90}, new byte[]{-35, -84, 34, -104, -112, 62, 54, -22}), group);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{44, 53, -31, 104, 77, -52, -69, -80}, new byte[]{90, 90, -123, 55, 35, -83, -42, -43}), mo925d);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{100, 29, 94, -76, -118, 62, -30}, new byte[]{18, 114, 58, -21, -6, 87, -127, 38}), mo925d2);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-30, 69, 9, -72, -36, -43, 93, -22, -26, 65, 30}, new byte[]{-108, 42, 109, -25, -82, -80, 48, -117}), m960w0);
                                                        jSONArray.put(jSONObject2);
                                                        break;
                                                    case 1643173938:
                                                        m897d4 = atm.m897d("B1DAA1D297CEB1E1A1D097CEB1E2A1D297C1B1D2A1ED97C4B1E1A1DE97FAB1DCA1E997C3B1DBA1E297C1B1E6A1DD97F9B1E2A1D297C0");
                                                }
                                            }
                                            break;
                                        case 1655413983:
                                            m897d3 = atm.m897d("B1EDA1D597CEB1D6A1E297C4B1E2A1EC97F0B1DBA1ED97C4B1D2A1D597F8B1DBA1D597C0B1DFA1D297C0");
                                    }
                                }
                                return jSONObject.toString();
                            }
                        case 571379461:
                            C0293m next2 = it2.next();
                            String m960w02 = next2.m960w0();
                            String m897d5 = atm.m897d("B1ECA1EE97F3B1DDA1E397F8B1DEA1EF97C0B1E2A1D197F8B1DFA1ED97CEB1D8A1DE97C7B1DEA1D297F9B1DAA1D197F3B1DAA1E2");
                            while (true) {
                                switch (m897d5.hashCode() ^ 1127348602) {
                                    case -1492008118:
                                        m897d5 = !m960w02.equals(C0052e.m1418a(new byte[]{-125, 55, -113, 58, 113, 72}, new byte[]{100, -93, 58, -33, -52, -7, 63, 4})) ? atm.m897d("B1DBA1DD97C4B1D8A1D397F0B1DEA1DD97C0B1ECA1D397CFB1EDA1EE97F0B1ECA1D797C4B1E2A1EE97C4B1D2") : atm.m897d("B1DEA1D197C3B1E5A1ED97F9B1E2A1D797CFB1E6A1ED97C1B1E6A1D297FCB1EDA1D597CEB1DAA1D7");
                                    case -1202644025:
                                        m897d5 = atm.m897d("B1E5A1D297FEB1E2A1E997FAB1DBA1D497FEB1E2A1ED97C4B1DBA1E997F9B1D2A1E297C2B1DCA1E997F9B1DAA1D097F8B1E2A1D1");
                                    case 662039661:
                                        String m897d6 = atm.m897d("B1E2A1D297FAB1E5A1E397F8B1DFA1D597C2B1E3A1D597CEB1E6A1ED97C2B1D8A1ED97F4B1E0A1D797CEB1DEA1E297CF");
                                        while (true) {
                                            switch (m897d6.hashCode() ^ (-1360923579)) {
                                                case -1364034451:
                                                    break;
                                                case -1270230735:
                                                    m897d6 = atm.m897d("B1E2A1D097FDB1DFA1D297C0B1E2A1DE97F9B1DFA1D797F8B1DFA1ED97C4B1DEA1D797F3B1E6A1E997C0B1D8A1EE97FEB1DDA1ED97C4B1E2");
                                                case 471512561:
                                                    m897d6 = !m960w02.equals(C0052e.m1418a(new byte[]{42, 33, -77, 31, 94, 46, -9, 89, 106}, new byte[]{-51, -75, 6, -9, -7, -88, 18, -48})) ? atm.m897d("B1DBA1EE97C0B1E0A1D197C0B1E2A1DD97CFB1E5A1E997C0B1E2A1D397CEB1E1A1D997F4B1ECA1EE97C0B1D6A1EE97C1B1D8A1ED97F9B1DBA1ED") : atm.m897d("B1D1A1DE97F4B1DAA1D797F3B1D2A1D097C1B1D1A1D997C4B1E2A1EF97F3B1E6A1D297C2B1E6A1D597FEB1D2");
                                                case 1498189596:
                                                    String m897d7 = atm.m897d("B1E2A1E997C1B1DBA1D397FAB1EDA1D997F0B1DFA1D497C0B1D1A1DD97CFB1D8A1ED97C3B1ECA1EA97FDB1DAA1D497FA");
                                                    while (true) {
                                                        switch (m897d7.hashCode() ^ (-141159515)) {
                                                            case -2029378687:
                                                                m897d7 = atm.m897d("B1E0A1E397F3B1D2A1EE97C4B1E2A1EF97FDB1E5A1D997F3B1DBA1D397FCB1ECA1ED");
                                                            case -784386807:
                                                                String m897d8 = atm.m897d("B1DDA1D297FEB1E5A1DE97F9B1E2A1D397CFB1E0A1DD97FFB1DCA1ED97C4B1E5A1E297C2B1E5A1D397C0B1DDA1E397F3B1DEA1E397F9");
                                                                while (true) {
                                                                    switch (m897d8.hashCode() ^ 1562858871) {
                                                                        case -1615545567:
                                                                            String m897d9 = atm.m897d("B1EDA1D997C1B1EDA1D397FDB1E2A1EC97CFB1E0A1ED97CEB1E6A1D397F8B1DAA1DD97F8B1ECA1ED97FFB1D8A1ED97C0B1E0A1D097C0B1D8A1E397F8");
                                                                            while (true) {
                                                                                switch (m897d9.hashCode() ^ (-1243134025)) {
                                                                                    case -824675066:
                                                                                        m897d9 = atm.m897d("B1D1A1EE97F9B1E2A1ED97F8B1DCA1E997FCB1DBA1D197C4B1E6A1ED97F0B1DFA1D297C0B1E0A1DE97C7B1E5A1DD97F0B1E5A1EE97C4B1E2");
                                                                                    case -274046203:
                                                                                        m897d9 = !m960w02.equals(C0052e.m1418a(new byte[]{-82, 44, 74, 74, 32, -65, 10, 78, -50}, new byte[]{73, -106, -32, -81, -99, 42, -19, -57})) ? atm.m897d("B1D6A1ED97C1B1E1A1E997FDB1E5A1D797FAB1DFA1D997FAB1D1A1DE97FDB1E2A1EF97FAB1E5") : atm.m897d("B1D6A1EF97C1B1D2A1D997FFB1E6A1ED97FDB1E2A1EF97F8B1ECA1ED97C1B1DEA1E297FAB1E6A1E297C3B1DFA1D297C0B1DDA1D297FDB1DEA1DE97F3");
                                                                                    case -212091987:
                                                                                        break;
                                                                                    case 550458970:
                                                                                        String m897d10 = atm.m897d("B1D6A1E397FDB1E2A1ED97F3B1DEA1D497C3B1DCA1ED97FFB1EDA1D497CFB1E6A1D1");
                                                                                        while (true) {
                                                                                            switch (m897d10.hashCode() ^ 1753708545) {
                                                                                                case -1512621873:
                                                                                                    m897d10 = m960w02.equals(C0052e.m1418a(new byte[]{-50, -12, 88, 89, 37, 22}, new byte[]{42, 73, -53, -79, -89, -92, -29, -18})) ? atm.m897d("B1E2A1E397C0B1E2A1E297F4B1DEA1D097F4B1ECA1ED97CEB1DBA1D997FDB1EDA1D497C0B1E1A1D297C2B1E3A1E397CF") : atm.m897d("B1E2A1D197FCB1D6A1D197FDB1D2A1EA97FDB1D2A1EF97FDB1E1A1DD");
                                                                                                case -581416163:
                                                                                                    m897d10 = atm.m897d("B1DCA1D397CFB1DEA1EE97C2B1DAA1EF97FAB1DFA1D297FEB1E2A1D597FAB1DBA1D597F9B1E3A1D597F3B1DE");
                                                                                                case -298996111:
                                                                                                    break;
                                                                                                case 329402854:
                                                                                                    z2 = false;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case -791431891:
                                                                            break;
                                                                        case 148341024:
                                                                            m897d8 = atm.m897d("B1DAA1DE97F9B1E1A1D197F9B1EDA1D297F0B1E2A1ED97C2B1D2A1ED97C1B1DAA1E397C0B1E3A1D797F0B1DFA1DD97FFB1E2A1E297F8B1EDA1E297FDB1D2A1ED");
                                                                        case 858049562:
                                                                            m897d8 = !m960w02.equals(C0052e.m1418a(new byte[]{-95, 106, 63, -39, -42, -61}, new byte[]{70, -47, -125, 49, 95, 121, 96, 39})) ? atm.m897d("B1E3A1D297C4B1D8A1D997FDB1E2A1D797FCB1DFA1D597FDB1E2A1D097FDB1E5A1EC97F4") : atm.m897d("B1E0A1D197FEB1E2A1EE97F4B1ECA1D097F3B1E0A1D597CEB1DDA1ED97F0B1D2A1E997F9B1DFA1EF97C3B1DBA1D497C2B1DF");
                                                                    }
                                                                }
                                                                break;
                                                            case 1393946724:
                                                                m897d7 = !m960w02.equals(C0052e.m1418a(new byte[]{-74, Byte.MIN_VALUE, 28, -30, -126, -61}, new byte[]{83, 10, -76, 4, 62, 104, 11, -7})) ? atm.m897d("B1DFA1D597F9B1E2A1DE97C0B1E2A1DD97F9B1D2A1ED97F9B1DEA1E997FAB1E3A1D097C0B1ECA1D997FEB1DEA1E997F3") : atm.m897d("B1E5A1EA97F9B1E0A1DE97C4B1D6A1EC97C1B1D6A1E997FEB1DAA1D397CE");
                                                            case 2136419641:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2131717097:
                                        break;
                                }
                            }
                            z2 = true;
                            String m897d11 = atm.m897d("B1D6A1E297FEB1D1A1DE97C0B1E2A1D097FFB1DFA1ED97C4B1DEA1D597F9B1DFA1D197FDB1E3A1ED97CEB1E6A1EE97FAB1E6");
                            while (true) {
                                switch (m897d11.hashCode() ^ 1668565494) {
                                    case -1466894966:
                                        break;
                                    case -452185195:
                                        m897d11 = z2 ? atm.m897d("B1E5A1D297F0B1E2A1EA97C7B1E1A1E397C7B1DFA1ED97FCB1D1A1EE97F9B1E5A1E2") : atm.m897d("B1E5A1EC97FDB1D1A1DE97C4B1ECA1DD97C0B1EDA1D597F9B1E2A1D397CEB1DB");
                                    case 1029024460:
                                        Matcher matcher2 = this.f1155c.matcher(next2.mo925d(C0052e.m1418a(new byte[]{81, -81, -73, -41}, new byte[]{57, -35, -46, -79, -58, 59, 126, 72})));
                                        String m897d12 = atm.m897d("B1E1A1D097F4B1D2A1D497F3B1ECA1D797C0B1DCA1DD97C0B1E0A1D097C2B1DEA1D597C3B1D6A1EA97C0");
                                        while (true) {
                                            switch (m897d12.hashCode() ^ (-391497545)) {
                                                case 254937772:
                                                    m897d12 = !matcher2.find() ? atm.m897d("B1E5A1D497FDB1E3A1EF97C3B1E0A1E397F8B1D8A1DE97FEB1DFA1D297C0B1E0A1DE97C3B1E6A1E297F4B1ECA1D397CF") : atm.m897d("B1DEA1D197F3B1DCA1E297F0B1D8A1D497C1B1E1A1E997F8B1E2A1D997CFB1E1A1EC97FEB1ECA1D397FEB1E2A1DE97C4B1DD");
                                                case 512745540:
                                                    break;
                                                case 865851437:
                                                    m897d12 = atm.m897d("B1D1A1DE97FEB1DCA1E297F3B1DAA1D997CFB1DBA1E297F0B1E2A1D997CEB1EDA1D297FDB1DB");
                                                case 1804702313:
                                                    String trim = matcher2.group(1).trim();
                                                    JSONObject jSONObject3 = new JSONObject();
                                                    jSONObject3.put(C0052e.m1418a(new byte[]{-28, -8, -31, -110, -57, 75, 22}, new byte[]{-112, -127, -111, -9, -104, 34, 114, -102}), trim);
                                                    jSONObject3.put(C0052e.m1418a(new byte[]{-2, -113, 36, -46, -120, 126, -91, -67, -17}, new byte[]{-118, -10, 84, -73, -41, 16, -60, -48}), m960w02);
                                                    jSONArray2.put(jSONObject3);
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 1935592882:
                                        m897d11 = atm.m897d("B1DAA1D997F4B1ECA1DE97F9B1E2A1EA97F4B1DCA1EF97FEB1E2A1ED97F0B1ECA1ED97FDB1DBA1D297F4B1DCA1D297FCB1D1");
                                }
                            }
                            break;
                        case 1476925238:
                            m897d = atm.m897d("B1D1A1E997C3B1EDA1D597F0B1D6A1D397F0B1DBA1D397F0B1DBA1D097FEB1E2");
                        case 1876393099:
                            m897d = it2.hasNext() ? atm.m897d("B1E0A1D297F0B1D6A1ED97FEB1DAA1EC97F0B1DAA1DE97FDB1D2A1D797CF") : atm.m897d("B1DAA1D597CFB1E5A1D397C0B1D2A1ED97C4B1E2A1D497C4B1E2A1E297FDB1E3A1EC97F9B1E6");
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
            Matcher matcher = Pattern.compile(C0052e.m1418a(new byte[]{71, -1, -59, -53, -8, 121, 83, -99, 65, -119, -83, -6, -59, 73, Byte.MAX_VALUE, -33, 125, -38, -9, -59, -25, 69, 65, -43, 117, -60, -68, -57, -56, 75, 86, -42, 110, -4, -2, -34, -41, 94, 116, -17, 75, -33, -50, -28, -40, 4, 114, -103, 35, -98, -70, -20, -8, 125, 83, -17, 79, -33, -68, -22, -114, 21, 6, -97, 81, -62, -15, -25, -56, 75, 86, -42, 110, -32, -3, -39, -62, 67, 72, -99, 120, -52, -27, -39, -63, 88, 112, -33, 117, -48, -26}, new byte[]{28, -93, -110, -73, -92, 42, 47, -77})).matcher(C0629f.m179f(C0052e.m1418a(new byte[]{-8, 74, -39, 42, -125, 50, -91, -118, -24, 87, -52, 53, -104, 109, -29, -56, -7, 16, -61, 63, -124, 39, -7, -47, -15, 74, -60, 57, -33, 98, -7, -118, -32, 82, -52, 35, -107, 122, -23, -54, -2, 88, -60, 61, -34, 98, -7}, new byte[]{-112, 62, -83, 90, -16, 8, -118, -91}), null));
            String m897d = atm.m897d("B1D2A1D097F3B1D1A1EA97F9B1E3A1EC97FEB1E2A1D297C1B1E6A1D597C2B1DAA1EC97F3B1ECA1D097CEB1DCA1D497F8B1DFA1ED");
            while (true) {
                switch (m897d.hashCode() ^ (-1548607566)) {
                    case -1857380548:
                        m897d = atm.m897d("B1DDA1DD97FEB1E2A1D097F8B1DEA1DD97CFB1D2A1D497FDB1D2A1E397F9B1DFA1ED97FDB1E6A1DD97C0");
                        break;
                    case -1031352702:
                        if (!matcher.find()) {
                            m897d = atm.m897d("B1E0A1D397C4B1DDA1E997F9B1E2A1ED97FFB1D1A1DD97FDB1DCA1EE97C4B1E1A1D497F0B1D8A1E397F3B1E5A1E397C7B1E6A1ED");
                            break;
                        } else {
                            m897d = atm.m897d("B1DBA1EC97C0B1E3A1ED97C4B1E2A1EE97C1B1D2A1ED97FFB1DEA1E997C0B1DAA1DE97C0B1D8A1D797CFB1DDA1EE97CEB1E2A1D397F9B1D6A1EA97C2B1E2");
                            break;
                        }
                    case 778125015:
                        break;
                    case 1932459924:
                        this.f1153a = new JSONObject(matcher.group(1));
                        break;
                }
            }
            this.f1154b = new JSONObject(atm.m897d("11584B57760311581110357A50581B0729394856581B2D350F584057A9C4DA9FF6CF6E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489FDED2A5C1EC5856573A7A50589FD1EBB1F3FC580860234814584F6EBED2D59FFAFC7A46580C57767A8CC2D590C3E84807560E6E3648405893DBFD83E5D357607A1C584057AACFCF93E5DC6E254601581B6E62489CD6D2ABE6E45856573A7A50589CD9EBBFD4F4580860234814584F6EBDEFCC9FDBCF7A46580C57767A8FFFCC90E2DB48072708602348111F0C6E62481916143F2B4856581B2D350F584057A9D0EC9DCBCE6E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489FECE9A9D1CD9DF3F26E74480C584F6EBDFCE69FFCEBBFE3FD580860234814584F6EBDECE893ECE5BFE3FD58596E2E48405890CACA83E3D392C5DF4807560E6E3648405890C5FF8CF9FF92C5DF485658036E62489FF3D2AADBEF9DF3F26E254601581B6E62489FF0DDA8E5F69DF3F26E74480C584F6EBDE0D29EC8D0BFE3FD580860234814584F6EBDE0D29DE1F7BFFECF9FC8FD7A46580C57767A8FF0D292D8E38DEECF90F1E94807560E6E3648405890DCD48CFADD92C5DF485658036E62489FEAF9AAD8CD9DF3F26E254601581B6E62489FDFF2A9E1D19DF3F26E74480C584F6EBDCFFD9FCCF7BFE3FD580860234814584F6EBEEBEA9CF5DABFE3FD58596E2E48405893CDC88CFAEC92C5DF4807560E6E3648405893CEF48DECEB92C5DF485658036E62489CF8D9ABCEFB9DF3F26E254601581B6E62489CF9FFAADAF09DF3F26E74480C584F6EBEE9F09CF7D6BFE3FD580860234814584F6EBEC7F692FDD2BFE3FD58596E2E48405893E1D482F2E492C5DF4807560E6E3648405892CDE683E0C492C5DF485658036E62489DFBCBA5C2D49DF3F26E254601581B6E62489DF2C4AADBEF9DF3F26E74480C584F6EBFE2CB9CF6C9BFE3FD580860234814584F6EBFE0D59DC8E6BFE3FD58596E2E48405892C6F78DC7D092C5DF4807560E6E3648405892EBC98FC3C192C5DF485658036E62489DDDE4A9E1D19DF3F26E254601581B6E62489DC1FAA9DDD29DF3F26E74480C584F6EBFD1F59FF0F4BFE3FD580860234814584F6EBFD7EB9DCED0BFFECF9FC8FD7A46580C57767A8DC7EB92F7C48DEECF90F1E94807560E6E3648405893C4C08EC0F392C5DF485658036E62489CF2EDA8E2E39DF3F26E253707560E6E330F03584F6E210F1B0857607A041B17106E62489FC3C1A8E3D75856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A045840577E68584958596E2E484058477C6A59580759377A045840577E68584858596E2E484058477C6A58580759377A045840577E68584B58596E2E484058477C6A5B580759377A045840577E68584A58596E2E484058477C6A5A580759377A045840577E685B4358596E2E484058477C6953580759377A045840577E685B4258596E2E484058477C6952580759377A045840577E685B4D58596E2E484058477C695D580759377A045840577E685B4C58596E2E484058477C695C580759377A045840577E685B4F58596E2E484058477C695F580759377A045840577E685B4E58596E2E484058477C695E580759377A045840577E685B4958596E2E484058477C6959580759377A045840577E685B4858596E2E484058477C6958580759377A045840577E685B4B58596E2E484058477C695B580759377A045840577E685B4A58596E2E484058477C695A580759377A045840577E685A4358596E2E484058477C6853580759377A045840577E685A4258596E2E484058477C6852580759377A045840577E685A4D58596E2E484058477C685D580759377A045840577E685A4C58596E2E484058477C685C580759377A045840577E685A4F58596E2E484058477C685F580759377A045840577E685A4E58596E2E484058477C685E580728317411581110357A50581614223F4856581B2D350F584057A4F7C792D2F56E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489FE1C8A4F7C75856573A7A50589FEEF1B0C5D7580860234814584F6EB0E1CB92DAE17A46580C57767A82F1CB9DE3F54807560E6E3648405892FEFC82D5D757607A1C584057ABEACE92D5D86E254601581B6E624893E5DCA4F7C75856573A7A505893EAE5B0C5D7580860234814584F6EBEFDDF92DAE17A46580C57767A8CEDDF9DE3F54807560E6E3648405893FFCD82D5D757607A1C584057AAEBFF92D5D86E254601581B6E62489FC4C2A4F7C75856573A7A50589FCBFBB0C5D7580860234814584F6EB0CFC59DFAE1BFE3E358596E2E4840589DE9E78DF5D792C5C14807560E6E3648405893C8D78FDEDD90C4F1485658036E62489CFEFAA9FCCD9FF2DC6E254601581B6E62489CC9C5A9C3D792D5D86E74480C584F6EBED9CA9FEEF1B0C5D7580860234814584F6EBDEFCC9FDBCF7A46580C57767A8FFFCC90E2DB48072708602348111F0C6E6248180357607A041B17106E62489CF4E7A9E2E55856573A39060F1F57760311581457767A8CEDCC9CDBEC485658036E62480E1318297A17560157227A50589ECFF6BEDAEE58596E2E4840581D252C19580759377A04584057A4F7EE9FF2F36E74480C584F6E2B091508106E25370727596E6A4840210E6E330F03584F6E39181F1B57607A041B17106E62489FE6C5A9D4D05856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9FCCD93E3F36E74480C584F6EBDCEDD93ECCA7A17560157227A50589CCDE3BDE5CA58596E2E48405893F4F78FF5CA57317411581457767A8CEDDF9CD3F1485658036E62489CEDD0A5C7C3580759377A04584057AAF4CD9DC4FB6E74480C584F6EBEC6DD9DCBC27A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D135840572F340B090957607A041B17106E62489FF2F3ABE9D15856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9D9DC9FF9FA6E74480C584F6EBDEBCC9FF6C37A17560157227A50589DFDFDBEE9FF58596E2E48405892C4E98CF9FF57317411581457767A82D2FA93CFDD485658036E624892D2F5AADBEF580759377A04584057A9D7CE92D9F06E74480C584F6EBDE5DE92D6C97A17560157227A50589FFBCABDE5C858596E2E48405890C2DE8FF5C857317411581457767A8DF4FE90F5E3485658036E62489DF4F1A9E1D1580759377A04584057A4E8E79CF2ED6E74480C584F6EB0DAF79CFDD47A17560157227A50589FFBCAB1F3D358596E2E48405890C2DE83E3D357317411581457767A83F9C790F4DA485658036E624893F9C8A9E0E8580759377A04584057ABFFFB9FC3CE6E74480C584F6EBFCDEB9FCCF77A17560157227A50589FF3D7BEFDFF58596E2E48405890CAC38CEDFF57317411581457767A8FECE690C5FF485658036E62489FECE9A9D1CD580759377A04584057AAF5CC9EC4D56E74480C584F6EBEC7DC9ECBEC7A17560157227A50589CC4D3BED3EC58596E2E48405893FDC78CC3EC57317411581457767A8DC7D093EDD0485658036E62489DC7DFAAF9E2580759377A04584057A5C5F89CE2D06E74480C584F6EB1F7E89CEDE97A17560157227A50589FDBFABDD0D758596E2E48405890E2EE8FC0D757317411581457767A8CF2E291F6D1485658036E62489CF2EDA8E2E3580759377A04584057AADAC69DECE46E74480C584F6EBEE8D69DE3DD7A17560157227A50589DDCF3B0DCF058596E2E48405892E5E782CCF057317411581457767A8FD4D190F7EF485658036E62489FD4DEA9E3DD580759377A04584057ABFDF492D5E86E74480C584F6EBFCFE492DAD17A17560157227A50589FE0CABEE2E258596E2E48405890D9DE8CF2E257317411581457767A82D7DC90C0F2485658036E624892D7D3A9D4C0580759377A04584057A9D2C29EC7E96E74480C584F6EBDE0D29EC8D07A17560157227A50589CF6C6BEE8E058596E2E48405893CFD28CF8E057317411581457767A8FF3DD93CFDD485658036E62489FF3D2AADBEF580759377A04584057A9C8E69CFAD26E74480C584F6EBDFAF69CF5EB7A17560157227A50589FD0CBBDD3C158596E2E48405890E9DF8FC3C157310517560157273D13584057353D0B0858596E360B171F57767A8FC3CE91F7E5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058477C695C5856573A7A505848457D6E4807560E6E36484058477C695F5856573A7A505848457D6D4807560E6E36484058477C695E5856573A7A505848457D6C4807560E6E36484058477C69595856573A7A505848457D6B4807560E6E36484058477C69585856573A7A505848457D6A4807560E6E36484058477C695B5856573A7A505848457D694807560E6E36484058477C695A5856573A7A505848457D684807560E6E36484058477C68535856573A7A505848457C614807560E6E36484058477C68525856573A7A505848457C604807560E6E36484058477C685D5856573A7A505848457C6F4807560E6E36484058477C685C5856573A7A505848457C6E4807560E6E36484058477C685F5856573A7A505848457C6D4807560E6E36484058477C685E5856573A7A505848457C6C48072708602348111F0C6E6248161B1B2B7A46581414213D4840589DE3F582D2FA57607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8FE1C79DE3F5485658036E62489FE1C8A4F7C7580759377A04584057A4D3DB92D5D86E74480C584F6EB0E1CB92DAE17A17560157227A50589DC7E8B0C5D758596E2E48405892FEFC82D5D757317411581457767A83E5D39DE3F5485658036E624893E5DCA4F7C7580759377A04584057AACFCF92D5D86E74480C584F6EBEFDDF92DAE17A17560157227A50589CC6D9B0C5D758596E2E48405893FFCD82D5D757317411581457767A8FC4CD9DE3F5485658036E62489FC4C2A4F7C7580759377A04584057A4FDD59DF5D8ABD1F35856573A7A505892D0F3BFE5D79DFCD57A17560157227A50589CF1C3BDCEDD9FFDE57A46580C57767A8CFEF590E8FF8FF2D357317411581457767A8CC9CA90D7E582D5D757607A1C584057AAEBDA9FE1C8A4F7C7580759377A04584057A9DDDC9FD4F66E74480C584F6EBDEFCC9FDBCF7A17270759377A011F0357767A080358596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBEFDCC93E2F87A46580C57767A1E1317106E254601581B6E62489EC0CFAAE8FE5856573A7A5058121C382B4807560E6E364840589DE3DC8FF2FC57607A1C5840573F3B05081F57310517275657787A50210157273D135840572D2A0F1B58596E360B171F57767A8FE6CA90C0E2485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405890E8FF83E3FC57607A1C584057A9FCCD93E3F36E254601581B6E62489CC2DAA9D7DA5856573A7A50589CCDE3BDE5CA580860234814584F6EBEFDDF93EAE57A46580C57767A8CEDDF9CD3F14807560E6E3648405893E0FF8DC4F457607A1C584057AAF4CD9DC4FB6E254601581B6E62489FFFC3A9F6E95856573A7A50589FF0FABDC4F9580811254601581E2921484058162039190958596E360B171F57767A8FF2FC92FDE3485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405892CFF582DBFA57607A1C584057ABDBC792DBF56E254601581B6E62489CDAC9AACEFD5856573A7A50589CD5F0BEFCED580860234814584F6EBEF6C09CFDD47A46580C57767A8CE6C093C4C04807560E6E3648405890FCC98FDFC957607A1C584057A9E8FB9FDFC66E254601581B6E62489DD1EBAAD2EA5856573A7A50589DDED2BEE0FA580860234814584F6EBFCDEB9FCCF77A46580C57767A8DDDEB90F5E34807560E6E364840589CE1CC8FC3C157607A1C584057A5F5FE9FC3CE6E254601581B6E62489DF2F3ABF4FB5856573A7A50589DFDCABFC6EB580860234814584F6EBEE4D29DE5CA7A46580C57767A8CF4D292DCDE4807560E6E3648405890CACA83E3D357607A1C584057A9DEF893E3DC6E254601581B6E62489CFBFEABD0DB5856573A7A50589CF4C7BFE2CB580860234814584F6EBECADB9FEEE17A46580C57767A8CDADB90D7F54807560E6E3648405893FEE38CFEF257607A1C584057AAEAD19CFEFD6E254601581B6E62489CC9D4A5C5C85856573A7A50589CC6EDB1F7D8580860234814584F6EBFC3C592C3C67A46580C57767A8DD3C59DFAD24807560E6E3648405892CDED8FC6F857607A1C584057ABD9DF9FC6F76E254601581B6E624892FAC8ABE6E45856573A7A505892F5F1BFD4F4580860234814584F6EBDE0D29DE1F7BFFECF9FC8FD7A46580C57767A8FF0D292D8E38DEECF90F1E94807560E6E3648405890C9EE8FD4F957607A1C584057A9DDDC9FD4F66E253707560E6E330F03584F6E210F1B0857607A041B17106E62489FC3C1A8E3D75856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A045840577E68584958596E2E484058477C6A59580759377A045840577E68584858596E2E484058477C6A58580759377A045840577E68584B58596E2E484058477C6A5B580759377A045840577E68584A58596E2E484058477C6A5A580759377A045840577E685B4358596E2E484058477C6953580759377A045840577E685B4258596E2E484058477C6952580759377A045840577E685B4D58596E2E484058477C695D580759377A045840577E685B4C58596E2E484058477C695C580759377A045840577E685B4F58596E2E484058477C695F580759377A045840577E685B4E58596E2E484058477C695E580759377A045840577E685B4958596E2E484058477C6959580759377A045840577E685B4858596E2E484058477C6958580759377A045840577E685B4B58596E2E484058477C695B580759377A045840577E685B4A58596E2E484058477C695A580759377A045840577E685A4358596E2E484058477C6853580759377A045840577E685A4258596E2E484058477C6852580759377A045840577E685A4D58596E2E484058477C685D580759377A045840577E685A4C58596E2E484058477C685C580759377A045840577E685A4F58596E2E484058477C685F580759377A045840577E685A4E58596E2E484058477C685E580728317411581110357A50581614223F4856581B2D350F584057A4F7C792D2F56E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489FE1C8A4F7C75856573A7A50589FEEF1B0C5D7580860234814584F6EB0E1CB92DAE17A46580C57767A82F1CB9DE3F54807560E6E3648405892FEFC82D5D757607A1C584057ABEACE92D5D86E254601581B6E624893E5DCA4F7C75856573A7A505893EAE5B0C5D7580860234814584F6EBEFDDF92DAE17A46580C57767A8CEDDF9DE3F54807560E6E3648405893FFCD82D5D757607A1C584057AAEBFF92D5D86E254601581B6E62489FC4C2A4F7C75856573A7A50589FCBFBB0C5D7580860234814584F6EB0CFC59DFAE1BFE3E358596E2E4840589DE9E78DF5D792C5C14807560E6E3648405893C8D78FDEDD90C4F1485658036E62489CFEFAA9FCCD9FF2DC6E254601581B6E62489CC9C5A9C3D792D5D86E74480C584F6EBED9CA9FEEF1B0C5D7580860234814584F6EBDEFCC9FDBCF7A46580C57767A8FFFCC90E2DB48072708602348111F0C6E6248180357607A041B17106E62489CF4E7A9E2E55856573A39060F1F57760311581457767A8CEDCC9CDBEC485658036E62480E1318297A17560157227A50589ECFF6BEDAEE58596E2E4840581D252C19580759377A04584057A4F7EE9FF2F36E74480C584F6E2B091508106E25370727596E6B4840210E6E330F03584F6E39181F1B57607A041B17106E62489FE6C5A9D4D05856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9FCCD93E3F36E74480C584F6EBDCEDD93ECCA7A17560157227A50589CCDE3BDE5CA58596E2E48405893F4F78FF5CA57317411581457767A8CEDDF9CD3F1485658036E62489CEDD0A5C7C3580759377A04584057AAF4CD9DC4FB6E74480C584F6EBEC6DD9DCBC27A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D135840572F340B090957607A041B17106E62489FF2F3ABE9D15856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057ABC4F59EC0CFABFFEA5856573A7A50589DE9D3BCD0C09DD2CC7A17560157227A505893F5C5BFCDFA58596E2E4840589CCCD18DDDFA57317411581457767A8DC7EB92F7E4485658036E62489DC7E4ABE3D6580759377A04584057A4DCDB9FF5D6ABFFEA5856573A7A505892F1FDBDE5D99DD2CC7A17560157227A50589CE5D2BFC6EB58596E2E48405893DCC68DD6EB57317411581457767A8DD1E493C6D8485658036E62489DD1EBAAD2EA580759377A04584057AADBEF9CFEEA6E74480C584F6EBEE9FF9CF1D37A17560157227A505892DBF3B0DAF258596E2E4840589DE2E782CAF257317411581457767A8CC6EE90D8E98EC6E057607A1C584057AAE4FE9FEEC4A8E4F0580759377A04584057AAC1F09EC6EF6E74480C584F6EBEF3E09EC9D67A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D13584057353D0B0858596E360B171F57767A8FC3CE91F7E5485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058477C695C5856573A7A505848457D6E4807560E6E36484058477C695F5856573A7A505848457D6D4807560E6E36484058477C695E5856573A7A505848457D6C4807560E6E36484058477C69595856573A7A505848457D6B4807560E6E36484058477C69585856573A7A505848457D6A4807560E6E36484058477C695B5856573A7A505848457D694807560E6E36484058477C695A5856573A7A505848457D684807560E6E36484058477C68535856573A7A505848457C614807560E6E36484058477C68525856573A7A505848457C604807560E6E36484058477C685D5856573A7A505848457C6F4807560E6E36484058477C685C5856573A7A505848457C6E4807560E6E36484058477C685F5856573A7A505848457C6D4807560E6E36484058477C685E5856573A7A505848457C6C48072708602348111F0C6E6248161B1B2B7A46581414213D4840589DE3F582D2FA57607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8FE1C79DE3F5485658036E62489FE1C8A4F7C7580759377A04584057A4D3DB92D5D86E74480C584F6EB0E1CB92DAE17A17560157227A50589DC7E8B0C5D758596E2E48405892FEFC82D5D757317411581457767A83E5D39DE3F5485658036E624893E5DCA4F7C7580759377A04584057AACFCF92D5D86E74480C584F6EBEFDDF92DAE17A17560157227A50589CC6D9B0C5D758596E2E48405893FFCD82D5D757317411581457767A8FC4CD9DE3F5485658036E62489FC4C2A4F7C7580759377A04584057A4FDD59DF5D8ABD1F35856573A7A505892D0F3BFE5D79DFCD57A17560157227A50589CF1C3BDCEDD9FFDE57A46580C57767A8CFEF590E8FF8FF2D357317411581457767A8CC9CA90D7E582D5D757607A1C584057AAEBDA9FE1C8A4F7C7580759377A04584057A9DDDC9FD4F66E74480C584F6EBDEFCC9FDBCF7A17270759377A011F0357767A080358596E360B171F57767A8CF4E890F6D7485658032D341F1F584F17234814584F6EBEFDCC93E2F87A46580C57767A1E1317106E254601581B6E62489EC0CFAAE8FE5856573A7A5058121C382B4807560E6E364840589DE3DC8FF2FC57607A1C5840573F3B05081F573105172756577E694840210E6E330F03584F6E39181F1B57607A041B17106E62489FE6C5A9D4D05856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9FCCD93E3F36E74480C584F6EBDCEDD93ECCA7A17560157227A50589CCDE3BDE5CA58596E2E48405893F4F78FF5CA57317411581457767A8CEDDF9CD3F1485658036E62489CEDD0A5C7C3580759377A04584057AAF4CD9DC4FB6E74480C584F6EBEC6DD9DCBC27A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D135840572F340B090957607A041B17106E62489FF2F3ABE9D15856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057AACEED9FF6E36E74480C584F6EBEFCFD9FF9DA7A17560157227A50589CFBEEBFDED858596E2E48405893C2FA8DCED857317411581457767A8FFCE191F6D3485658036E62489FFCEEA8E2E1580759377A04584057A4FFC99FD5F36E74480C584F6EB0CDD99FDACA7A17560157227A50589DD2DDBEE0FA58596E2E48405892EBC98CF0FA57317411581457767A8FF4FC90C3EA485658036E62489FF4F3A9D7D8580759377A04584057A8E2D09DF3DC6E74480C584F6EBCD0C09DFCE57A17560157227A505892F2E6BFEECC58596E2E4840589DCBF28DFECC57317411581457767A8FFFCC90E2DB485658036E62489FFFC3A9F6E9580728317411581110357A505803102D2A4856581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E6248484A477F7A46580C57767A584A48466E254601581B6E6248484A477E7A46580C57767A584A48476E254601581B6E6248484A477D7A46580C57767A584A48446E254601581B6E6248484A477C7A46580C57767A584A48456E254601581B6E6248484A44757A46580C57767A584A4B4C6E254601581B6E6248484A44747A46580C57767A584A4B4D6E254601581B6E6248484A447B7A46580C57767A584A4B426E254601581B6E6248484A447A7A46580C57767A584A4B436E254601581B6E6248484A44797A46580C57767A584A4B406E254601581B6E6248484A44787A46580C57767A584A4B416E254601581B6E6248484A447F7A46580C57767A584A4B466E254601581B6E6248484A447E7A46580C57767A584A4B476E254601581B6E6248484A447D7A46580C57767A584A4B446E254601581B6E6248484A447C7A46580C57767A584A4B456E254601581B6E6248484A45757A46580C57767A584A4A4C6E254601581B6E6248484A45747A46580C57767A584A4A4D6E254601581B6E6248484A457B7A46580C57767A584A4A426E254601581B6E6248484A457A7A46580C57767A584A4A436E254601581B6E6248484A45797A46580C57767A584A4A406E254601581B6E6248484A45787A46580C57767A584A4A416E253707560E6E330F03584F6E340B141D57607A041B17106E624892D5D8A4F0EA5856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9C3D792D5D86E74480C584F6EBDF1C792DAE17A17560157227A505892FEFDB0C5D758596E2E4840589DC7E982D5D757317411581457767A8DC8DE9DE3F5485658036E62489DC8D1A4F7C7580759377A04584057A5C7C392D5D86E74480C584F6EB1F5D392DAE17A17560157227A50589CE2E9B0C5D758596E2E48405893DBFD82D5D757317411581457767A8CC9EF9DE3F5485658036E62489CC9E0A4F7C7580759377A04584057A9E6DD92D5D86E74480C584F6EBDD4CD92DAE17A17560157227A505892D0F3BFE5D79DFCD57A46580C57767A82DFC592C3F58DF3E357317411581457767A8CFEF590E8FF8FF2D357607A1C584057AADCE59FDED2A9D0C3580759377A04584057AAEBDA9FE1C8A4F7C75856573A7A50589CC6FCBDF1C792DAE17A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D135840572E214856581B2D350F584057AAD6F89FC0FA6E74480C1B19393D4840210E6E3648405893DBEE83EDCE57607A1C5840573831071F580860234814584F6EBCD0C09CC5D87A46580C57767A02130E066E254601581B6E624892D5F1A9D0EC5856573A7A50580916232A0F5807283105465848456E623101581E2921484058143E3D0B5856572239071F584F6EBDF6CA9FF9F67A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FD1EBB1F3FC58596E2E48405890E8FF83E3FC57317411581457767A8CC2D590C3E8485658036E62489CC2DAA9D7DA580759377A04584057AACFCF93E5DC6E74480C584F6EBEFDDF93EAE57A17560157227A50589CD9EBBFD4F458596E2E48405893E0FF8DC4F457317411581457767A8FFFCC90E2DB485658036E62489FFFC3A9F6E9580728317411581110357A505803102D2A4856581B2D350F584057A9E1DE9EC1C86E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E6248484A477F7A46580C57767A584A48466E254601581B6E6248484A477E7A46580C57767A584A48476E254601581B6E6248484A477D7A46580C57767A584A48446E254601581B6E6248484A477C7A46580C57767A584A48456E254601581B6E6248484A44757A46580C57767A584A4B4C6E254601581B6E6248484A44747A46580C57767A584A4B4D6E254601581B6E6248484A447B7A46580C57767A584A4B426E254601581B6E6248484A447A7A46580C57767A584A4B436E254601581B6E6248484A44797A46580C57767A584A4B406E254601581B6E6248484A44787A46580C57767A584A4B416E254601581B6E6248484A447F7A46580C57767A584A4B466E254601581B6E6248484A447E7A46580C57767A584A4B476E254601581B6E6248484A447D7A46580C57767A584A4B446E254601581B6E6248484A447C7A46580C57767A584A4B456E254601581B6E6248484A45757A46580C57767A584A4A4C6E254601581B6E6248484A45747A46580C57767A584A4A4D6E254601581B6E6248484A457B7A46580C57767A584A4A426E254601581B6E6248484A457A7A46580C57767A584A4A436E254601581B6E6248484A45797A46580C57767A584A4A406E254601581B6E6248484A45787A46580C57767A584A4A416E253707560E6E330F03584F6E340B141D57607A041B17106E624892D5D8A4F0EA5856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9C3D792D5D86E74480C584F6EBDF1C792DAE17A17560157227A505892FEFDB0C5D758596E2E4840589DC7E982D5D757317411581457767A8DC8DE9DE3F5485658036E62489DC8D1A4F7C7580759377A04584057A5C7C392D5D86E74480C584F6EB1F5D392DAE17A17560157227A50589CE2E9B0C5D758596E2E48405893DBFD82D5D757317411581457767A8CC9EF9DE3F5485658036E62489CC9E0A4F7C7580759377A04584057A9E6DD92D5D86E74480C584F6EBDD4CD92DAE17A17560157227A505892D0F3BFE5D79DFCD57A46580C57767A82DFC592C3F58DF3E357317411581457767A8CFEF590E8FF8FF2D357607A1C584057AADCE59FDED2A9D0C3580759377A04584057AAEBDA9FE1C8A4F7C75856573A7A50589CC6FCBDF1C792DAE17A17560157227A50589FF0FABDC4F958596E2E48405890C9EE8FD4F957310517560157273D135840572E214856581B2D350F584057AAD6F89FC0FA6E74480C1B19393D4840210E6E3648405893DBEE83EDCE57607A1C5840573831071F580860234814584F6EBCD0C09CC5D87A46580C57767A02130E066E254601581B6E624892D5F1A9D0EC5856573A7A50580916232A0F580728310517"));
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    public final String playerContent(String str, String str2, List<String> list) {
        try {
            String str3 = C0052e.m1418a(new byte[]{-41, -106, 87, -59, 55, -101, -18, -66, -57, -117, 66, -38, 44, -60, -88, -4, -42, -52, 77, -48, 48, -114, -88, -1, -37, -121, 91, -101, 52, -55, -79, -66, -55, -115, 71, -102, 52, -51, -96, -24, -112, -117, 71, -102}, new byte[]{-65, -30, 35, -75, 68, -95, -63, -111}) + str2 + C0052e.m1418a(new byte[]{16, 118, 30, -75, 43}, new byte[]{62, 30, 106, -40, 71, -9, -113, 43});
            C0459g m967p0 = C0321F.m846d(C0629f.m179f(str3, m252b(str3))).m967p0(C0052e.m1418a(new byte[]{67, -115, 106, 19, 52, -103}, new byte[]{48, -18, 24, 122, 68, -19, 70, 48}));
            JSONObject jSONObject = new JSONObject();
            Iterator<C0293m> it = m967p0.iterator();
            while (true) {
                String m897d = atm.m897d("B1DEA1D397F9B1E0A1DD97C3B1E2A1EC97C0B1E6A1D197FAB1E6A1E297C1B1E2A1D397F9B1E2A1D497C0B1ECA1ED");
                while (true) {
                    switch (m897d.hashCode() ^ 1793694835) {
                        case -1229871705:
                            break;
                        case -800495112:
                            m897d = it.hasNext() ? atm.m897d("B1DCA1D097F0B1E0A1D297C2B1D1A1D197F3B1E6A1D097C7B1D6A1DE97FEB1E0A1D097F0B1D1A1D397C0B1D1A1D797F0B1E2A1ED97CEB1DF") : atm.m897d("B1E3A1EA97F3B1D8A1DD97F9B1D2A1EF97C1B1EDA1D297C0B1E2A1D097F0B1E2");
                        case -128443248:
                            String trim = it.next().m979d0().trim();
                            String m897d2 = atm.m897d("B1DEA1EF97C0B1E2A1E997C0B1E0A1D297C0B1E0A1D797CFB1DEA1D597F0B1D6A1DE97C1B1EDA1D097F3B1DEA1D197C0B1D6A1E297FDB1DCA1ED");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1639823950)) {
                                    case -1656414765:
                                        m897d2 = atm.m897d("B1DBA1E397F9B1E2A1ED97F3B1D2A1ED97FFB1DDA1D597F8B1DDA1EA97F8B1ECA1DD97C0");
                                    case -1337222369:
                                        m897d2 = trim.startsWith(C0052e.m1418a(new byte[]{-126, -118, 83, -37, -109, 54, 116, 118, -111, -103, 126}, new byte[]{-12, -21, 33, -5, -29, 90, 21, 15})) ? atm.m897d("B1D2A1DD97F3B1E0A1E297C4B1E2A1DE97F8B1E6A1D497C3B1E2A1E397C4B1DFA1D797C2B1E5A1D397FFB1DBA1E397C0B1ECA1ED") : atm.m897d("B1DAA1ED97C0B1ECA1D997F0B1DFA1D497CFB1ECA1E397F0B1E2A1EC97C2B1DBA1ED97C4B1D2A1D597FCB1DCA1E297F8B1DAA1ED97C0B1D2A1D097C1");
                                    case -1079427784:
                                        break;
                                    case 684890943:
                                        JSONObject jSONObject2 = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                                        String m897d3 = atm.m897d("B1E6A1DE97C3B1E0A1ED97F0B1DBA1D597F8B1DBA1E397F0B1E2A1DE97C3B1E3A1E397FFB1D2A1ED");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-291343571)) {
                                                case -1113945688:
                                                    break;
                                                case 1088546575:
                                                    if (!this.f1153a.has(jSONObject2.getString(C0052e.m1418a(new byte[]{-52, 110, 123, 56}, new byte[]{-86, 28, 20, 85, -61, -83, Byte.MIN_VALUE, -26})))) {
                                                        m897d3 = atm.m897d("B1E6A1D397C3B1E0A1D297CEB1D2A1EF97FAB1E5A1E397F0B1DDA1D397CFB1E2A1E297CEB1E2A1D497C1B1D6A1EA97FEB1DA");
                                                        break;
                                                    } else {
                                                        m897d3 = atm.m897d("B1DEA1DD97C3B1DFA1E297C7B1DFA1E397F9B1E2A1E397FAB1D6A1E397F4B1EDA1EE97F8B1DCA1EF97FAB1DEA1E997F8B1D6A1DE97CEB1EC");
                                                        break;
                                                    }
                                                case 1321272656:
                                                    m897d3 = atm.m897d("B1DBA1EE97F4B1EDA1DD97C4B1E2A1D497FAB1E5A1E297C1B1E2A1ED97F0B1D8A1E397C2B1E5A1E397C0");
                                                    break;
                                                case 1753463951:
                                                    JSONObject jSONObject3 = this.f1153a.getJSONObject(jSONObject2.getString(C0052e.m1418a(new byte[]{-60, 74, -87, 78}, new byte[]{-94, 56, -58, 35, -16, -20, -4, -8})));
                                                    String string = jSONObject2.getString(C0052e.m1418a(new byte[]{-112, 102, -17}, new byte[]{-27, 20, -125, -111, -81, 83, -125, 114}));
                                                    jSONObject.put(C0052e.m1418a(new byte[]{-55, -17, -58, 75, -84}, new byte[]{-71, -114, -76, 56, -55, 93, 94, 30}), jSONObject3.getInt(C0052e.m1418a(new byte[]{12, 27}, new byte[]{124, 104, 115, 47, 55, 34, 79, -30})));
                                                    jSONObject.put(C0052e.m1418a(new byte[]{-97, 96, -81, 90, 110, -83, 45}, new byte[]{-17, 12, -50, 35, 59, -33, 65, -114}), "");
                                                    jSONObject.put(C0052e.m1418a(new byte[]{27, 87, -48}, new byte[]{110, 37, -68, -61, -100, -45, 1, -59}), Proxy.getUrl() + C0052e.m1418a(new byte[]{26, 21, 17, 124, 34, 43, -19, -112, 77, 87, 10, 56, 42, 39, -79, -110, 22, 4, 70, 103, 47, 48, -32, -62}, new byte[]{37, 113, 126, 65, 90, 66, -116, -1}) + Base64.encodeToString(string.getBytes(), 10));
                                                    jSONObject.put(C0052e.m1418a(new byte[]{-30, 116, -87, 110, -39, 115}, new byte[]{-118, 17, -56, 10, -68, 1, 120, 3}), "");
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 1585563474:
                            m897d = atm.m897d("B1ECA1EA97CEB1E2A1EA97F9B1DDA1ED97FAB1DBA1EC97F0B1DFA1D097C7B1DAA1D197C2B1E3A1DD97FDB1D1A1EE");
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public final String searchContent(String str, boolean z) {
        try {
            C0288h m1414e = C0052e.m1414e(C0629f.m179f(C0052e.m1418a(new byte[]{-126, -46, 33, -16, -92, 123, -78, -48, -99, -47, 34, -82, -80, 46, -14, -104, -122, -61, 123, -29, -72, 44, -78, -116, -113, -57, 39, -29, -65, 126, -20, -62, -103, -49, 33, -27, -14, 114, -36, -121, -125, -57, 58, -24, -78, 40, -16, -106, -60, -56, 48, -12, -4}, new byte[]{-22, -90, 85, Byte.MIN_VALUE, -41, 65, -99, -1}) + URLEncoder.encode(str), m253a()));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<C0293m> it = m1414e.m967p0(C0052e.m1418a(new byte[]{-84, Byte.MIN_VALUE, -64, 36, 20, -89, -85, -127, -86, -113, -106, 107}, new byte[]{-56, -23, -74, 10, 109, -46, -7, -44})).iterator();
            while (true) {
                String m897d = atm.m897d("B1E3A1EE97FFB1DDA1D097C0B1DAA1EF97F0B1DBA1D297FAB1E6A1D197C2B1DCA1EC97C4B1E2A1DE97FEB1E1");
                while (true) {
                    switch (m897d.hashCode() ^ 2035335372) {
                        case -857537441:
                            C0293m next = it.next();
                            String m602e = next.m967p0(C0052e.m1418a(new byte[]{-55, -35}, new byte[]{-95, -18, 36, 67, -104, 120, -98, -7})).m602e();
                            String mo925d = next.mo925d(C0052e.m1418a(new byte[]{126, 24, -81, 21}, new byte[]{22, 106, -54, 115, 69, 52, -25, -34}));
                            Matcher matcher = this.f1156d.matcher(mo925d);
                            String m897d2 = atm.m897d("B1E3A1EA97C0B1DDA1E297FCB1E3A1DE97F3B1DFA1D297FEB1E2A1ED97CFB1DBA1EF97F4B1DBA1ED97F9B1ECA1D197C2B1DAA1ED");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1911641556)) {
                                    case -1806246897:
                                        m897d2 = m602e.contains(str) ? atm.m897d("B1DAA1E997C0B1E2A1E997FDB1DCA1ED97C7B1D6A1ED97C0B1E3A1D297C0B1D2A1D097CEB1D8A1E997F8") : atm.m897d("B1DAA1DD97FDB1E2A1EC97FEB1E3A1E997C7B1D2A1DD97C3B1D2A1E297F3B1D6A1D197FEB1DCA1ED97F9B1DDA1EF97C3B1DFA1D797C1B1DDA1E997C0");
                                    case 230965141:
                                        break;
                                    case 1510803007:
                                        m897d2 = atm.m897d("B1DCA1D297FDB1E0A1D397C4B1E0A1DD97FFB1E3A1D297C4B1E6A1EC97C2B1D2A1E2");
                                    case 1582871207:
                                        String m897d3 = atm.m897d("B1DBA1D297CEB1E5A1DD97FFB1E2A1ED97FAB1D1A1EA97C4B1DBA1ED97FDB1DBA1ED97C0");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-1729685243)) {
                                                case -1691197886:
                                                    m897d3 = matcher.find() ? atm.m897d("B1DCA1D397FAB1E6A1D397C4B1DDA1EE97CEB1E2A1D397C1B1E2A1ED97FDB1E5A1E397CEB1DAA1DD97C0B1DAA1E297C7B1E0A1EA97F9B1E2A1DE97C7B1ECA1ED") : atm.m897d("B1DDA1D397F0B1DEA1EE97FDB1E1A1D797F8B1DDA1DE97CFB1E6A1D297C1B1D6A1DE97C4B1E1A1D497F0B1E2A1D297FDB1E5");
                                                case -1282314408:
                                                    break;
                                                case 673320696:
                                                    m897d3 = atm.m897d("B1DAA1DD97FCB1D2A1DD97C4B1DFA1E997FEB1E2A1DD97C4B1E0A1D097C7B1E2A1ED97C7B1D1A1D5");
                                                case 860433336:
                                                    C0288h m1414e2 = C0052e.m1414e(C0629f.m179f(mo925d, m252b(mo925d)));
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    String group = matcher.group(1);
                                                    String mo925d2 = m1414e2.m966q0(C0052e.m1418a(new byte[]{-30, -47, -100, 4, -69, -96, -116, -126, -20, -101, -99, 20, -67, -67, -2, -85, -9, -105, -124, 16, -84, -23, -56, -103, -28}, new byte[]{-125, -1, -15, 125, -50, -55, -95, -12})).mo925d(C0052e.m1418a(new byte[]{-67, -104, 81, 48, -29, -88, -124, -45, -66, -112, 75, 48, -94}, new byte[]{-39, -7, 37, 81, -50, -57, -10, -70}));
                                                    String m960w0 = m1414e2.m966q0(C0052e.m1418a(new byte[]{-51, -54, -31, 27, -118, 39, 62, -104, -124, -64, -8, 91, -109, 59, 37, -123, -10, -4, -13, 80, -109, 63, 34, -99, -119, -53, -90, 27, -109, 55, 63, -99, -52}, new byte[]{-87, -93, -105, 53, -25, 94, 75, -15})).m960w0();
                                                    Iterator<C0293m> it2 = m1414e2.m967p0(C0052e.m1418a(new byte[]{71, -96, 43, 83, 83, 55, 82, -54, 14, -86, 50, 19, 74, 43, 73, -41, 124, -106, 57, 24, 74, 47, 78, -49, 3, -70, 45, 28, 80, 96, 83, -58, 91, -67, 112, 16, 75, 58, 66, -57}, new byte[]{35, -55, 93, 125, 62, 78, 39, -93})).iterator();
                                                    while (true) {
                                                        String m897d4 = atm.m897d("B1D8A1D197FCB1DFA1D097F4B1DEA1EC97CFB1E5A1EE97F3B1D1A1ED97CFB1D2A1EA97FCB1E5A1DE97C4B1D8A1D997FA");
                                                        while (true) {
                                                            switch (m897d4.hashCode() ^ 1522364709) {
                                                                case -1175029344:
                                                                    m897d4 = atm.m897d("B1DCA1D297F0B1D6A1D097C4B1E2A1DD97C3B1D6A1D797C0B1DFA1ED97C1B1E3A1D597C1B1E3A1EF97F0B1D2A1D497FAB1E0A1D9");
                                                                case -841193226:
                                                                    C0293m next2 = it2.next();
                                                                    String m897d5 = atm.m897d("B1DCA1D197F8B1E2A1D297C0B1E2A1EE97C2B1D8A1D197FAB1DCA1ED97FDB1E1A1D097FEB1E6A1D397F0B1DAA1D497F8B1E1A1D2");
                                                                    while (true) {
                                                                        switch (m897d5.hashCode() ^ (-1137181364)) {
                                                                            case 117047792:
                                                                                String m960w02 = next2.m975h0().m960w0();
                                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-101, -32, 92, 20, -27, 14, 104, 10}, new byte[]{-19, -113, 56, 75, -117, 111, 5, 111}), m960w0);
                                                                                jSONObject2.put(C0052e.m1418a(new byte[]{62, 57, -112, -89, 119, -90, 61, 59, 58, 61, -121}, new byte[]{72, 86, -12, -8, 5, -61, 80, 90}), m960w02);
                                                                                jSONObject2.put(C0052e.m1418a(new byte[]{50, -10, 15, 41, -39, -34}, new byte[]{68, -103, 107, 118, -80, -70, -70, 0}), group);
                                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-38, 54, -62, 107, 6, 1, -115}, new byte[]{-84, 89, -90, 52, 118, 104, -18, 78}), mo925d2);
                                                                                jSONArray.put(jSONObject2);
                                                                                break;
                                                                            case 763351323:
                                                                                break;
                                                                            case 896593034:
                                                                                m897d5 = next2.m960w0().equals(C0052e.m1418a(new byte[]{-115, 14, -87, -121, -57, -10, 69, -57, -15}, new byte[]{107, -107, 29, 97, 81, 70, -86, 123})) ? atm.m897d("B1DEA1D997F8B1ECA1EF97F0B1E2A1EC97F9B1E0A1D397C0B1DFA1E297F0B1D1") : atm.m897d("B1E0A1DE97FAB1E2A1D297C4B1E2A1EF97FFB1E5A1D297C0B1E1A1ED97CFB1E5A1EA97CFB1DCA1ED97F9B1DAA1EA97C3B1ECA1DD97C2");
                                                                            case 1491568161:
                                                                                m897d5 = atm.m897d("B1DCA1D597C7B1D2A1ED97C0B1E2A1E397F9B1E6A1ED97C4B1D2A1EA97FEB1DDA1D397C0B1DCA1DE97FEB1E3A1D297F9");
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1568249048:
                                                                    continue;
                                                                case 1944352807:
                                                                    m897d4 = it2.hasNext() ? atm.m897d("B1E0A1E997F3B1DDA1EE97FDB1DCA1D097F0B1E2A1EE97C0B1ECA1EC97FAB1ECA1ED97C4B1D8A1ED") : atm.m897d("B1ECA1EE97C1B1E1A1D597CFB1ECA1E397FEB1DCA1E997FCB1DBA1ED");
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case -460806592:
                            jSONObject.put(C0052e.m1418a(new byte[]{-103, 120, 27, 69}, new byte[]{-11, 17, 104, 49, -92, -117, -116, -110}), jSONArray);
                            return jSONObject.toString();
                        case -285721035:
                            m897d = atm.m897d("B1D1A1D497CEB1E2A1D097FAB1E6A1ED97C2B1D2A1D097C0B1DEA1E397C4B1DBA1D597F8B1E0A1D1");
                        case 1249975790:
                            m897d = it.hasNext() ? atm.m897d("B1DAA1E397FFB1E2A1EC97C1B1DBA1ED97C4B1DDA1DD97C0B1D8A1D097F9B1EDA1EE97C1B1E1A1DE97C3B1E2A1D597FDB1D2A1D097C0") : atm.m897d("B1EDA1ED97FDB1E2A1D797F4B1ECA1DD97F3B1DFA1ED97C3B1D1A1E997FFB1E5A1D7");
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
