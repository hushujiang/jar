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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.d */
/* loaded from: classes.dex */
public final class C0589d extends Dora {

    /* renamed from: h */
    private static final String f1065h;

    /* renamed from: i */
    public static final int f1066i = 0;

    /* renamed from: b */
    private JSONObject f1067b;

    /* renamed from: c */
    private JSONObject f1068c;

    /* renamed from: d */
    private final Pattern f1069d = Pattern.compile(C0052e.m1418a(new byte[]{-104, 126, 8, 113, -35, -80, 31, -37, -39, 50, 49, 126, -40, -15, 68, -33, -37}, new byte[]{-73, 86, 84, 6, -10, -103, 48, -78}));

    /* renamed from: e */
    private final Pattern f1070e = Pattern.compile(C0052e.m1418a(new byte[]{-103, -78, -122, 107, 68, 3, 63, 26, -99, -75, -122, 107, 68, 5, 76}, new byte[]{-74, -102, -38, 28, 111, 44, 99, 109}));

    /* renamed from: f */
    private final Pattern f1071f = Pattern.compile(C0052e.m1418a(new byte[]{20, -117, -54, 74, 76, 110, -112, 22, 23, -117, -54, 74, 76, 110, -68, 13, 93, -35, -69, 97, 3, 106, -31, 61, 88, -113, -72, 85, 19, 44, -96, 72}, new byte[]{60, -92, -106, 61, 103, 65, -52, 97}));

    /* renamed from: g */
    private final Pattern f1072g = Pattern.compile(C0052e.m1418a(new byte[]{-124, -114, 91, 75, -115, 62, 8, -90, -49, -52, 28, 1, Byte.MIN_VALUE, 50, 77, -106}, new byte[]{-85, -25, 53, 47, -24, 70, 32, -6}));

    static {
        String m897d = atm.m897d("B1EDA1D497FCB1DFA1ED97C4B1DCA1D797FFB1E2A1EF97FEB1D2A1D097C0B1E3A1D797C4B1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 844) ^ 685727838) {
                case -2015748502:
                    return;
                case -1079579065:
                    C0052e.m1418a(new byte[]{-101, -117, 126, 64, 87, -54, -71, 0, -105}, new byte[]{-6, -2, 27, 52, 50, -28, -38, 111});
                    m897d = atm.m897d("B1E3A1E397C0B1E2A1D997C7B1E6A1DD97C1B1E3A1D497C2B1DBA1D997F0B1E1A1D397FDB1D2A1D097C0B1DB");
                    break;
                case 726884810:
                    f1065h = C0052e.m1418a(new byte[]{53, 26, -66, -92, 38, 105, 121, 104, 60, 27, -81, -96, 48, 125, 53, 40, 48}, new byte[]{93, 110, -54, -44, 85, 83, 86, 71});
                    m897d = atm.m897d("B1DBA1E397CFB1EDA1D797C0B1E5A1DE97FEB1E2A1D597C1B1DAA1EA97C3B1E0A1D397FDB1DCA1D597F3B1DDA1D097FD");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ JSONObject m292b(C0589d c0589d) {
        String m897d = atm.m897d("B1DCA1E997F4B1DAA1D197F8B1E1A1DE97CEB1E2A1D497F3B1D2A1DD97FAB1DBA1DE97F4B1E6A1D997FFB1DFA1ED97FDB1DEA1D2");
        while (true) {
            switch ((m897d.hashCode() ^ 46) ^ (-1106414196)) {
                case -1938293228:
                    return c0589d.f1067b;
                case 112974978:
                    m897d = atm.m897d("B1ECA1EC97F9B1E2A1D197FCB1ECA1ED97FFB1DCA1E997C0B1E2A1EE97FCB1DCA1D497FFB1E2");
                    break;
            }
        }
    }

    /* renamed from: a */
    protected final HashMap<String, String> m293a() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1ECA1D397CFB1D8A1EE97FDB1E3A1D097CEB1D6A1D597C7B1D6A1DD97C0");
        while (true) {
            switch ((m897d.hashCode() ^ 215) ^ 2125165767) {
                case -619124380:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1D6A1ED97C2B1E5A1D097F0B1E2A1EE97CFB1D8A1D297F4B1DAA1E397FCB1DCA1E397FCB1D2A1DD97F3B1EDA1D297CFB1DDA1D597C4B1E2");
                    break;
                case 1416755460:
                    return hashMap;
                case 1995737102:
                    hashMap.put(C0052e.m1418a(new byte[]{-93, -53, -75, -76, 14, 48, -101, -38, -104, -52}, new byte[]{-10, -72, -48, -58, 35, 113, -4, -65}), C0052e.m1418a(new byte[]{-22, -71, -21, 15, -4, 92, -77, 15, -110, -8, -95, 70, -72, 125, -77, 67, -50, -72, -27, 9, -29, 88, -23, 0, -18, -72, -27, 3, -4, 16, -97, 65, -60, -10, -34, 53, -80, 104, -14, 17, -105, -119, -96, 83, -49, 7, -5, 0, -26, -90, -31, 10, -11, 103, -73, 66, -20, -65, -27, 73, -91, 3, -27, 14, -108, -32, -79, 78, -37, 120, -122, 109, -21, -6, -79, 10, -7, 91, -73, 0, -32, -77, -14, 13, -1, 25, -14, 99, -49, -92, -2, 11, -11, 31, -21, 17, -119, -26, -65, 82, -92, 7, -32, 14, -106, -25, -91, 70, -61, 81, -76, 65, -43, -65, -66, 83, -93, 7, -4, 19, -111}, new byte[]{-89, -42, -111, 102, -112, 48, -46, 32}));
                    m897d = atm.m897d("B1E2A1E997FEB1E2A1D297F8B1D1A1DE97C0B1D8A1D397F8B1DBA1D797FDB1DBA1ED97FDB1DFA1D997C7B1D8A1D097C0B1DFA1D997FDB1E2");
                    break;
                case 2122002918:
                    m897d = atm.m897d("B1DFA1D497F9B1E2A1ED97F3B1E2A1ED97FCB1E0A1D997F0B1E3A1D597F0B1E2A1DE97FAB1D1A1DD97C2B1DFA1D097C7B1E6");
                    break;
            }
        }
    }

    /* renamed from: c */
    protected final String m291c(String str) {
        String m897d = atm.m897d("B1DCA1EF97FAB1DFA1EE97CEB1E2A1D597FFB1E2A1EC97FEB1DDA1ED97FAB1EDA1E2");
        String str2 = null;
        String str3 = null;
        String str4 = null;
        TreeMap treeMap = null;
        while (true) {
            switch ((m897d.hashCode() ^ 699) ^ 1140217918) {
                case -2075941867:
                    String m897d2 = atm.m897d("B1E5A1E297FDB1D2A1E397CFB1D8A1D497C0B1E6A1D597FAB1ECA1E397C1");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-353757046)) {
                            case -670538336:
                                m897d = atm.m897d("B1DCA1EF97C2B1EDA1EE97CEB1E2A1E997FFB1D2A1ED97FCB1E1A1D397C0B1D8A1D797F3");
                                continue;
                            case 757723314:
                                m897d2 = treeMap.containsKey(C0052e.m1418a(new byte[]{-11, 99, -91, 78, 11, -120, 31, 71}, new byte[]{-103, 12, -58, 47, Byte.MAX_VALUE, -31, 112, 41})) ? atm.m897d("B1ECA1EF97FEB1E6A1E397FCB1D2A1D997F8B1E5A1D297C7B1E3A1D197FEB1E2A1D197C0B1E3A1D497C7B1DFA1D797C4B1E2") : atm.m897d("B1D8A1EA97F4B1D8A1EC97C3B1DFA1D097FDB1E2A1D797F4B1DCA1ED97C4B1E0A1D997C0B1DDA1D097C0B1DEA1D497FDB1E2");
                            case 873045526:
                                m897d2 = atm.m897d("B1E2A1DD97FCB1E6A1D797F3B1D1A1DE97FDB1E2A1D997F0B1ECA1E997C4B1DCA1ED97C4B1DDA1D497C0");
                            case 1961088470:
                                m897d = atm.m897d("B1DAA1EF97CFB1DEA1D097FFB1D2A1D497CFB1E5A1D397CFB1D2A1DE97CEB1E2A1D597F0B1E2A1D097CEB1DBA1D597C1B1DC");
                                continue;
                        }
                    }
                    break;
                case -981857848:
                    return str3;
                case -842824580:
                    m897d = atm.m897d("B1DCA1DE97C1B1DCA1D197FDB1E3A1E397C4B1E2A1D397F9B1DFA1ED97F8B1ECA1D297C0B1EDA1DD97F3");
                    break;
                case -504614638:
                    m897d = atm.m897d("B1DAA1EF97CFB1DEA1D097FFB1D2A1D497CFB1E5A1D397CFB1D2A1DE97CEB1E2A1D597F0B1E2A1D097CEB1DBA1D597C1B1DC");
                    str3 = str2;
                    break;
                case 246599742:
                    str2 = C0574b.m307f((String) ((List) treeMap.get(C0052e.m1418a(new byte[]{59, -105, 63, 94, -108, 76, -32, -43}, new byte[]{87, -8, 92, 63, -32, 37, -113, -69}))).get(0), m293a(), null);
                    m897d = atm.m897d("B1E0A1EA97C4B1D8A1EF97F9B1E2A1E397F0B1E3A1EF97FFB1E6A1D197F0B1DAA1E997F0B1E2A1ED97C7B1D6A1DE97C4B1DAA1EA");
                    break;
                case 927136410:
                    m897d = atm.m897d("B1DFA1D197C4B1DCA1E297F0B1E2A1D997F8B1E3A1EA97FEB1ECA1ED97F4B1D6A1D397C0B1E1A1D097F3B1EDA1EF97CEB1E2A1EE97FFB1E2A1ED");
                    str3 = str4;
                    break;
                case 1220342123:
                    treeMap = new TreeMap();
                    m897d = atm.m897d("B1E0A1D597F9B1DEA1E397F3B1DCA1ED97FFB1E2A1EF97FDB1DFA1D497C0B1D1");
                    break;
                case 1724537022:
                    str4 = C0574b.m307f(str, m293a(), treeMap);
                    m897d = atm.m897d("B1DFA1D797C2B1DFA1D497C3B1E1A1D097F0B1DDA1D297C0B1E2A1DD97F9B1DDA1E997FCB1E3");
                    break;
                case 1871105436:
                    m897d = atm.m897d("B1E3A1E997FDB1E2A1D097F0B1D2A1D597C4B1E6A1ED97F3B1EDA1D297FAB1EDA1E2");
                    break;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 434
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.github.catvod.spider.Dora
    public final java.lang.String categoryContent(java.lang.String r16, java.lang.String r17, boolean r18, java.util.HashMap<java.lang.String, java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 2724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0589d.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        String str;
        boolean z;
        C0293m c0293m;
        String str2;
        String str3 = "";
        try {
            C0288h m1414e = C0052e.m1414e(m291c(C0052e.m1418a(new byte[]{-89, -48, -108, -56, -40, -87, -9, 109, -82, -47, -123, -52, -50, -67, -69, 45, -94, -117}, new byte[]{-49, -92, -32, -72, -85, -109, -40, 66}) + list.get(0) + C0052e.m1418a(new byte[]{-10}, new byte[]{-39, -120, -14, -50, 88, -25, -23, 25})));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String mo925d = m1414e.m966q0(C0052e.m1418a(new byte[]{71, -4, 57, -74, 31, -80, 78, -68, 81, -75, 46}, new byte[]{35, -107, 79, -104, 124, -33, 56, -39})).mo925d(C0052e.m1418a(new byte[]{0, 32, -83, 87}, new byte[]{104, 82, -56, 49, 26, 42, -2, 36}));
            String mo925d2 = m1414e.m966q0(C0052e.m1418a(new byte[]{119, -65, -118, -52, 114, -69, 4, 125, 97, -10, -99}, new byte[]{19, -42, -4, -30, 17, -44, 114, 24})).mo925d(C0052e.m1418a(new byte[]{107, 25, 17, -54, -64}, new byte[]{31, 112, 101, -90, -91, 65, -54, -116}));
            String m960w0 = m1414e.m967p0(C0052e.m1418a(new byte[]{37, -104, -23, 17, -121, -29, -33, 0, 32, -106, -6, 1, -102}, new byte[]{65, -15, -97, 63, -22, -122, -84, 115})).get(m1414e.m967p0(C0052e.m1418a(new byte[]{-119, -117, -20, -27, 91, -9, -75, -5, -116, -123, -1, -11, 70}, new byte[]{-19, -30, -102, -53, 54, -110, -58, -120})).size() - 1).m960w0();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-69, 53, 101, -73, -91, 97, 29, 15, -66, 59, 118, -89, -72}, new byte[]{-33, 92, 19, -103, -56, 4, 110, 124}));
            String str4 = "";
            int i = 0;
            String str5 = "";
            String str6 = "";
            String str7 = "";
            String str8 = "";
            String str9 = "";
            while (true) {
                String m897d = atm.m897d("B1E2A1D297FEB1E2A1D097C3B1E0A1DD97C1B1E5A1E397FFB1DDA1ED97CEB1E3A1EF97FFB1DAA1EC97F0B1DCA1DD97C2B1DFA1ED");
                while (true) {
                    switch (m897d.hashCode() ^ (-553779316)) {
                        case -871724412:
                            C0293m c0293m2 = m967p0.get(i);
                            String m960w02 = c0293m2.m960w0();
                            try {
                                boolean contains = m960w02.contains(C0052e.m1418a(new byte[]{-10, Byte.MAX_VALUE, -28, -121, -3, -85}, new byte[]{19, -9, 98, 96, 76, 16, -89, -118}));
                                String m897d2 = atm.m897d("B1E3A1DD97F0B1E2A1D397C4B1E2A1ED97CFB1DAA1E297CEB1E5A1EC97C1B1D1A1DD97C0B1E2A1D7");
                                while (true) {
                                    switch (m897d2.hashCode() ^ 1069786159) {
                                        case -2054603470:
                                            boolean contains2 = m960w02.contains(C0052e.m1418a(new byte[]{123, 86, -78, 73, -17, -20}, new byte[]{-98, -17, 6, -83, 84, 81, -57, -10}));
                                            String m897d3 = atm.m897d("B1E0A1D097FCB1ECA1ED97F3B1E0A1D997F0B1E2A1EE97FEB1E2A1ED97CFB1D2A1DD97C0B1DFA1EF97CEB1EDA1D397FEB1DFA1EE97C0B1E2A1DE97C1");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ (-1347501588)) {
                                                    case -790594511:
                                                        m897d3 = atm.m897d("B1E3A1E997C1B1DBA1D497C0B1E5A1D597FCB1DEA1DD97FEB1E2A1D997CFB1ECA1ED");
                                                    case -736404664:
                                                        try {
                                                            str9 = c0293m2.m960w0().split(C0052e.m1418a(new byte[]{108, 60}, new byte[]{86, 28, -91, 81, -62, 42, -14, -88}))[1];
                                                            str = str5;
                                                            continue;
                                                        } catch (Exception e) {
                                                            str9 = "";
                                                            str = str5;
                                                            break;
                                                        }
                                                    case 624589043:
                                                        boolean contains3 = m960w02.contains(C0052e.m1418a(new byte[]{-42, 125, -23, 4, -109, 21}, new byte[]{51, -31, 89, -31, 31, -81, 102, 65}));
                                                        String m897d4 = atm.m897d("B1DCA1DE97F3B1D1A1D297CEB1E2A1D997CFB1D1A1E297FEB1DBA1ED97F9B1E6A1E397C0B1DDA1E997FFB1D6A1EE97C1B1DDA1D297CEB1DFA1EC97FF");
                                                        while (true) {
                                                            switch (m897d4.hashCode() ^ 593564892) {
                                                                case -1968367447:
                                                                    try {
                                                                        str = c0293m2.m960w0().split(C0052e.m1418a(new byte[]{-109, -20}, new byte[]{-87, -52, -69, -16, 59, -80, -14, -65}))[1];
                                                                        continue;
                                                                    } catch (Exception e2) {
                                                                        str = "";
                                                                        break;
                                                                    }
                                                                case -1064096506:
                                                                    m897d4 = atm.m897d("B1E5A1D997FFB1DBA1D297F9B1E3A1D997C0B1E5A1D197FEB1E2A1D497C3");
                                                                case -997967096:
                                                                    m897d4 = contains3 ? atm.m897d("B1DCA1EA97F0B1E2A1D497FCB1D2A1ED97F8B1E5A1D797F9B1E1A1D997C3B1D8A1D9") : atm.m897d("B1ECA1ED97C1B1E0A1EE97FAB1EDA1EF97C3B1E0A1D997F3B1D8A1DD97C0B1ECA1E397FFB1E2");
                                                                case 1289797796:
                                                                    boolean contains4 = m960w02.contains(C0052e.m1418a(new byte[]{30, -117, 27, -12, 82, 30, 2, 41, 124, -48, 25, -69}, new byte[]{-5, 54, -86, 19, -37, -103, -25, -115}));
                                                                    String m897d5 = atm.m897d("B1ECA1D497F4B1D2A1D197F0B1E2A1D797CFB1DCA1EF97CEB1DDA1D097C7B1DE");
                                                                    while (true) {
                                                                        switch (m897d5.hashCode() ^ 1127537295) {
                                                                            case -1614240310:
                                                                                try {
                                                                                    str6 = c0293m2.m960w0().split(C0052e.m1418a(new byte[]{39, 100}, new byte[]{29, 68, 65, -116, 102, 48, -24, -35}))[1];
                                                                                    str = str5;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                } catch (Exception e3) {
                                                                                    str6 = "";
                                                                                    str = str5;
                                                                                    break;
                                                                                }
                                                                            case -1410202804:
                                                                                m897d5 = contains4 ? atm.m897d("B1D1A1D797FDB1E3A1D497FEB1E2A1ED97FCB1DEA1D597F0B1DEA1E397FFB1DFA1D797FCB1DCA1D197CFB1E0A1EF97FEB1E2") : atm.m897d("B1D6A1E297FCB1EDA1D597F3B1DDA1D797CFB1E1A1E997C0B1DCA1D797FEB1E2A1EE97FAB1D6A1DD97C0B1DDA1ED97CEB1D1A1D497CEB1E6A1DD");
                                                                            case 2098678638:
                                                                                m897d5 = atm.m897d("B1ECA1EC97C2B1DCA1EF97FAB1E6A1D497C1B1E6A1E997FAB1DCA1DE97FDB1DCA1D997C3B1EDA1D7");
                                                                            case 2112682885:
                                                                                boolean contains5 = m960w02.contains(C0052e.m1418a(new byte[]{-122, 23, -20, -25, 66, 98}, new byte[]{99, -72, 80, 1, -2, -10, 58, -42}));
                                                                                String m897d6 = atm.m897d("B1E2A1EA97F9B1E2A1E397F8B1DEA1D997FAB1E5A1EA97FDB1ECA1ED97F9B1DBA1D197C2B1DDA1EF97C1B1E6A1DE97C3B1DDA1E997C0B1DCA1D497FF");
                                                                                while (true) {
                                                                                    switch (m897d6.hashCode() ^ (-995545219)) {
                                                                                        case -1480031417:
                                                                                            m897d6 = contains5 ? atm.m897d("B1E2A1E297C0B1E2A1D797FDB1DFA1ED97F4B1E1A1EF97CFB1D6A1E397C0B1DCA1DE97C2B1DCA1D997CFB1EDA1D797F9B1E5A1D297FDB1E2A1D797C0B1ECA1ED") : atm.m897d("B1DFA1ED97CEB1E2A1D097F9B1ECA1DE97CFB1DEA1D597C4B1DDA1DE97C1B1D6A1E297CEB1DCA1D397F8B1DEA1D597F3B1E2A1ED");
                                                                                        case -668945591:
                                                                                            boolean contains6 = m960w02.contains(C0052e.m1418a(new byte[]{-66, 110, 1, -12, 104, 60}, new byte[]{90, -42, -70, 18, -44, -88, 60, -80}));
                                                                                            String m897d7 = atm.m897d("B1ECA1E997C0B1E2A1D997FFB1E2A1ED97FCB1ECA1EA97F4B1E3A1E397C3B1D2A1EC97F4B1DFA1D397C3B1D6A1E397F8B1E0A1DD97FF");
                                                                                            while (true) {
                                                                                                switch (m897d7.hashCode() ^ 2027975463) {
                                                                                                    case -1483357272:
                                                                                                        str = str5;
                                                                                                        continue;
                                                                                                    case -434773209:
                                                                                                        m897d7 = contains6 ? atm.m897d("B1ECA1E297C0B1DBA1D297F0B1DDA1D197C1B1E3A1D397C3B1DAA1E997FCB1DAA1D997F0B1D6A1D597FCB1DEA1EE97C4B1E2A1D097CEB1E2A1ED") : atm.m897d("B1EDA1ED97C4B1E2A1D397CEB1ECA1D297F0B1DBA1D997F3B1EDA1D797C1B1DDA1EF97FFB1D6A1EE97C3B1E6A1D497FEB1DA");
                                                                                                    case 667523428:
                                                                                                        m897d7 = atm.m897d("B1D6A1EC97F0B1E2A1D097C4B1E6A1ED97FFB1E3A1ED97C0B1EDA1ED97F3B1EDA1E997C0");
                                                                                                    case 848146380:
                                                                                                        try {
                                                                                                            str7 = c0293m2.m960w0().split(C0052e.m1418a(new byte[]{104, -39}, new byte[]{82, -7, 91, -77, 40, -34, -61, -104}))[1];
                                                                                                            str = str5;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        } catch (Exception e4) {
                                                                                                            str7 = "";
                                                                                                            str = str5;
                                                                                                            break;
                                                                                                        }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case -586755151:
                                                                                            try {
                                                                                                str8 = c0293m2.m960w0().split(C0052e.m1418a(new byte[]{61, -7}, new byte[]{7, -39, 21, 41, -111, -51, -16, -100}))[1];
                                                                                                str = str5;
                                                                                                continue;
                                                                                                continue;
                                                                                            } catch (Exception e5) {
                                                                                                str8 = "";
                                                                                                str = str5;
                                                                                                break;
                                                                                            }
                                                                                        case 557107549:
                                                                                            m897d6 = atm.m897d("B1D2A1D297CEB1E5A1DE97C7B1EDA1D997FEB1D6A1ED97F0B1DDA1DD97FEB1E2A1EE97F0B1E6A1ED97C4B1D2A1D297CEB1ECA1D1");
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 2032510964:
                                                        m897d3 = contains2 ? atm.m897d("B1D1A1EE97FFB1DEA1D497FFB1D8A1E997C7B1DCA1D297FEB1E6A1D3") : atm.m897d("B1E5A1E997F4B1EDA1E397F4B1DFA1DD97C0B1D8A1EC97C2B1D1A1E297F0B1E2A1D597F0B1E3A1EC97C4B1D1");
                                                }
                                            }
                                            break;
                                        case 1353851348:
                                            try {
                                                str4 = c0293m2.m960w0().split(C0052e.m1418a(new byte[]{87, 106}, new byte[]{109, 74, 77, 93, -97, -110, 30, -74}))[1];
                                                str = str5;
                                                break;
                                            } catch (Exception e6) {
                                                str4 = "";
                                                str = str5;
                                                break;
                                            }
                                        case 1391003020:
                                            m897d2 = contains ? atm.m897d("B1E6A1D197F0B1D2A1EC97FEB1E2A1D997C1B1ECA1ED97FFB1E6A1D797FDB1D2A1EF97FCB1DFA1D297C1B1E6A1DD97CFB1E6A1ED97C0B1D1A1EF") : atm.m897d("B1DAA1D997C1B1E3A1D597FDB1E2A1D197F0B1E2A1ED97F4B1DBA1E397C0B1E0A1D797FDB1E2");
                                        case 1918522848:
                                            m897d2 = atm.m897d("B1D6A1D997F9B1E2A1ED97FFB1ECA1ED97FAB1EDA1ED97CFB1D1A1D497C3B1DBA1D297C0B1DAA1E297FFB1D2A1DD97F3B1E1A1EF97F3B1D2A1D997FF");
                                    }
                                }
                                i++;
                                str5 = str;
                            } catch (Exception e7) {
                                e = e7;
                                SpiderDebug.log(e);
                                return str3;
                            }
                            break;
                        case -492431307:
                            m897d = i < m967p0.size() + (-2) ? atm.m897d("B1D2A1D197FDB1D2A1EF97C2B1EDA1E397C0B1E2A1D197F9B1D6A1EF97FEB1DEA1D297F9B1DAA1E297FAB1E6A1ED97FEB1DDA1D997CFB1DEA1E2") : atm.m897d("B1DDA1DD97F0B1E2A1D397F3B1DAA1D597CEB1DAA1D597C4B1ECA1ED97FDB1ECA1EA97C3B1DBA1ED97C0");
                        case 1018859401:
                            m897d = atm.m897d("B1DFA1EC97FCB1DEA1D197C7B1DCA1D197FAB1D1A1E297FFB1E0A1D997F8");
                        case 1672927610:
                            jSONObject2.put(C0052e.m1418a(new byte[]{121, 69, 37, 25, -14, 104}, new byte[]{15, 42, 65, 70, -101, 12, 37, 23}), list.get(0));
                            jSONObject2.put(C0052e.m1418a(new byte[]{9, -98, 34, 101, -17, 98, -51, -1}, new byte[]{Byte.MAX_VALUE, -15, 70, 58, -127, 3, -96, -102}), mo925d2);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-126, 73, Byte.MIN_VALUE, -54, 3, 122, 92}, new byte[]{-12, 38, -28, -107, 115, 19, 63, 34}), mo925d);
                            jSONObject2.put(C0052e.m1418a(new byte[]{32, 42, -97, 27, 66, 94, -94, -72, 49}, new byte[]{84, 83, -17, 126, 29, 48, -61, -43}), str4);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-108, -124, 40, 0, -43, 102, 116, -102}, new byte[]{-30, -21, 76, 95, -84, 3, 21, -24}), str9);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-31, 75, 54, -37, -55, -32, 75, 55}, new byte[]{-105, 36, 82, -124, -88, -110, 46, 86}), str5);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-127, -107, 89, 61, -120, 21, -57, 73, -123, -111, 78}, new byte[]{-9, -6, 61, 98, -6, 112, -86, 40}), str6);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-99, -122, -21, 41, 122, 88, 109, 21, -103}, new byte[]{-21, -23, -113, 118, 27, 59, 25, 122}), str7);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-42, -37, -72, 82, -77, -116, -35, 22, -61, -64, -77, Byte.MAX_VALUE}, new byte[]{-96, -76, -36, 13, -41, -27, -81, 115}), str8);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-108, -65, -20, -96, 40, 6, -122, -56, -121, -66, -4}, new byte[]{-30, -48, -120, -1, 75, 105, -24, -68}), m960w0);
                            TreeMap treeMap = new TreeMap(new C0588c(this));
                            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-109, 125, 107, -91, 86, -96, -118, -122, -110, 102, 66, -22, 79, -65, -97, -63, -97, 38}, new byte[]{-9, 20, 29, -122, 38, -52, -21, -1}));
                            C0459g m967p03 = m1414e.m967p0(C0052e.m1418a(new byte[]{68, 69, 50, 42, 13, 24, 28, -52, 69, 94, 27, 101, 20, 7, 9, -117, 85, 64}, new byte[]{32, 44, 68, 9, 125, 116, 125, -75}));
                            int i2 = 0;
                            while (true) {
                                String m897d8 = atm.m897d("B1DBA1EE97C2B1DBA1D997F9B1E2A1D497FEB1DCA1D297C0B1DCA1D097C7");
                                while (true) {
                                    switch (m897d8.hashCode() ^ (-591754645)) {
                                        case -2146537679:
                                            m897d8 = atm.m897d("B1EDA1EC97FDB1DEA1E397C0B1E2A1E397CFB1D2A1D197CEB1E6A1EF97C1B1E2A1EF97FEB1E1A1DE97FD");
                                        case -2139137629:
                                            String str10 = m967p02.get(i2).m960w0().split(C0052e.m1418a(new byte[]{-117, 95, 6}, new byte[]{104, -33, -119, 71, 47, -112, -18, 108}))[1].split(C0052e.m1418a(new byte[]{-50, -7, -76}, new byte[]{33, 69, 46, -97, 62, 21, 43, 9}))[0];
                                            Iterator<String> keys = this.f1067b.keys();
                                            while (true) {
                                                String m897d9 = atm.m897d("B1ECA1DE97F4B1DFA1D997C4B1E6A1D997CFB1D2A1EF97CEB1D6A1D297C0B1E2A1D397CEB1DF");
                                                while (true) {
                                                    switch (m897d9.hashCode() ^ 1215993973) {
                                                        case -734310807:
                                                            String next = keys.next();
                                                            String m897d10 = atm.m897d("B1D2A1D297F0B1E2A1DE97F9B1E6A1ED97C1B1D1A1D197FFB1D8A1D397F8B1E3A1D397C0B1DFA1D297FFB1D8A1D597F9B1ECA1EC97C0B1E2A1ED97F8B1E5");
                                                            while (true) {
                                                                switch (m897d10.hashCode() ^ 1941198947) {
                                                                    case -767658407:
                                                                        m897d10 = atm.m897d("B1E6A1D797C0B1E1A1DE97F9B1E2A1D497C0B1E6A1ED97FCB1E1A1D297C2B1DCA1EF97FFB1D6A1D1");
                                                                    case -488356394:
                                                                        z = true;
                                                                        str10 = next;
                                                                        break;
                                                                    case 1453188628:
                                                                        break;
                                                                    case 1975528658:
                                                                        m897d10 = this.f1067b.getJSONObject(next).getString(C0052e.m1418a(new byte[]{19, 64}, new byte[]{96, 40, -105, -89, 21, -34, -124, 30})).equals(str10) ? atm.m897d("B1EDA1D597CEB1E2A1D197F3B1E6A1ED97CFB1DAA1E997F9B1E2A1D997FCB1E0A1D497C0B1EDA1E397CE") : atm.m897d("B1D2A1D797FEB1DCA1ED97FFB1DEA1E297FAB1E0A1EF97FFB1E0A1E297C4B1D1A1DD97C2B1E5A1D597F9B1E2");
                                                                }
                                                            }
                                                            break;
                                                        case -244342710:
                                                            m897d9 = keys.hasNext() ? atm.m897d("B1DEA1D497FDB1D1A1ED97FDB1E2A1D797F8B1E5A1ED97C1B1E6A1ED97C0B1D1A1D5") : atm.m897d("B1E3A1D497F4B1E3A1EE97C4B1E3A1E297FEB1D1A1D397C7B1E2A1D997CFB1D1A1EF97F0");
                                                        case 919987074:
                                                            m897d9 = atm.m897d("B1E5A1DE97C0B1E2A1D597C3B1ECA1D297C3B1E6A1EC97C2B1E3A1EC97F9B1ECA1ED97FCB1E0A1D497C0B1ECA1E9");
                                                        case 2116693277:
                                                            z = false;
                                                            break;
                                                    }
                                                }
                                            }
                                            String m897d11 = atm.m897d("B1EDA1D397FDB1E2A1D497FCB1ECA1ED97F8B1D6A1D197FAB1DDA1DD97C7B1DCA1D997F9B1E5A1D497C0B1D1A1EF97FEB1E5A1D797C7");
                                            while (true) {
                                                switch (m897d11.hashCode() ^ (-2107733461)) {
                                                    case -1695969562:
                                                        m897d11 = !z ? atm.m897d("B1D1A1DE97F9B1DDA1DE97CEB1EDA1E297C2B1E3A1DD97C4B1D8A1ED97CEB1E3A1DE97F4B1DEA1DE97F4") : atm.m897d("B1E6A1D197C0B1E2A1E997FAB1E3A1D497FAB1E0A1ED97FAB1DFA1EF97F9B1D6");
                                                    case -769471149:
                                                        C0459g m967p04 = m967p03.get(i2).m967p0(C0052e.m1418a(new byte[]{40, 19, -46, 21, 27, -100}, new byte[]{68, 122, -14, 43, 59, -3, 119, -86}));
                                                        ArrayList arrayList = new ArrayList();
                                                        int i3 = 0;
                                                        while (true) {
                                                            String m897d12 = atm.m897d("B1E1A1DE97FDB1E2A1EF97C1B1DDA1E997FDB1D2A1E397FAB1D6A1D097F4B1E5");
                                                            while (true) {
                                                                switch (m897d12.hashCode() ^ (-1253905757)) {
                                                                    case -216202056:
                                                                        m897d12 = atm.m897d("B1E5A1D297F8B1DAA1D497FEB1E6A1E997CFB1DEA1D597C0B1E6A1D197CEB1E2");
                                                                    case 352354577:
                                                                        m897d12 = i3 < m967p04.size() ? atm.m897d("B1D1A1D797FDB1E2A1EA97F0B1E1A1EE97F4B1EDA1ED97FCB1D2A1E397C4B1DBA1ED") : atm.m897d("B1E5A1EC97F9B1D2A1D497F9B1E6A1E397FEB1DDA1D297F0B1E2A1D197C3B1DBA1E397FCB1DAA1D997CFB1E6A1EA97F4B1ECA1ED97CEB1EDA1EE");
                                                                    case 580025886:
                                                                        String m897d13 = atm.m897d("B1DAA1EF97FEB1DBA1D997C0B1E2A1D197C1B1DDA1DD97FCB1EDA1EA97FEB1DFA1E297CFB1D6A1EA97FFB1E1");
                                                                        while (true) {
                                                                            switch (m897d13.hashCode() ^ 1490269389) {
                                                                                case -844438768:
                                                                                    str2 = "";
                                                                                    break;
                                                                                case -744706335:
                                                                                    m897d13 = atm.m897d("B1D6A1EC97FCB1E6A1D497F3B1D6A1DE97CEB1D6A1DE97CEB1E2A1EA97F3B1E6A1ED97C7B1DFA1DD97F3B1E0A1EC");
                                                                                case 567893928:
                                                                                    m897d13 = arrayList.size() > 0 ? atm.m897d("B1DCA1D397FDB1E5A1D497F9B1E3A1D497FDB1DBA1D197FAB1E1A1D597FDB1E2A1D497CEB1DDA1ED97F3B1D1A1D497C0B1E0A1ED97C3") : atm.m897d("B1DBA1D997C7B1E5A1D497FAB1E1A1D097F4B1D2A1D297FDB1E2A1EF97F9B1E1A1E397FCB1DFA1E297C7B1DCA1EE97FFB1DBA1EA");
                                                                                case 1582289300:
                                                                                    str2 = TextUtils.join(C0052e.m1418a(new byte[]{-30}, new byte[]{-63, -44, -116, -5, 87, -30, 44, -122}), arrayList);
                                                                                    break;
                                                                            }
                                                                        }
                                                                        String m897d14 = atm.m897d("B1E5A1D197CEB1DAA1ED97C4B1E2A1DD97C7B1DCA1ED97FCB1DBA1D397C0B1ECA1E997F0B1E5A1D397FE");
                                                                        while (true) {
                                                                            switch (m897d14.hashCode() ^ 1313258451) {
                                                                                case -1084051191:
                                                                                    m897d14 = str2.length() == 0 ? atm.m897d("B1ECA1D797C4B1E2A1EF97FEB1E3A1E997C4B1E6A1D097C2B1DFA1DD97C0B1E2A1DE97C0B1E2A1D597FDB1E2A1E997FDB1E2") : atm.m897d("B1D1A1D497FDB1E2A1D497C4B1ECA1ED97FAB1E5A1EC97C0B1D8A1E397C0B1EDA1D297F0B1E2A1EE97FDB1E6A1EE97FFB1DFA1D197F4B1DC");
                                                                                case 62731732:
                                                                                    break;
                                                                                case 676281451:
                                                                                    m897d14 = atm.m897d("B1D2A1D497C2B1EDA1D797CFB1DFA1E297F9B1E2A1EF97FDB1DDA1D397CEB1E5");
                                                                                case 2075562566:
                                                                                    treeMap.put(str10, str2);
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 729936415:
                                                                        Matcher matcher = this.f1071f.matcher(m967p04.get(i3).mo925d(C0052e.m1418a(new byte[]{-34, -93, 36, 45}, new byte[]{-74, -47, 65, 75, -95, -22, 9, -120})));
                                                                        String m897d15 = atm.m897d("B1ECA1D197F9B1D6A1EC97F3B1E3A1EF97C2B1DAA1D997FDB1E2A1DD97FCB1DFA1ED97F9B1DBA1D597CFB1E6A1D397C0B1DFA1D997C2");
                                                                        while (true) {
                                                                            switch (m897d15.hashCode() ^ (-1604719772)) {
                                                                                case -1351883565:
                                                                                    arrayList.add(c0293m.m960w0() + C0052e.m1418a(new byte[]{47}, new byte[]{11, -1, -64, 125, -2, 43, 14, -104}) + matcher.group(1));
                                                                                    break;
                                                                                case -1157414212:
                                                                                    m897d15 = !matcher.find() ? atm.m897d("B1E1A1E997C0B1E2A1D097CEB1DDA1EF97FDB1DBA1D397FDB1DEA1EF97FDB1D2") : atm.m897d("B1D8A1E297FEB1E1A1D297C4B1D8A1D297F0B1DDA1EA97F9B1E5A1D597F4B1ECA1D397C0B1D8A1D397C0B1E1A1D397F9B1E2A1D597F8B1D1");
                                                                                case -1039310846:
                                                                                    break;
                                                                                case 1525585245:
                                                                                    m897d15 = atm.m897d("B1DBA1DE97F8B1D8A1D297F3B1E3A1D097F8B1D2A1D997F9B1DBA1E397CFB1ECA1E397F9B1E2A1D497CFB1DBA1ED97CFB1DFA1D397F8B1E1A1D9");
                                                                            }
                                                                        }
                                                                        i3++;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 225591084:
                                                        m897d11 = atm.m897d("B1E0A1D797FFB1E2A1D097CFB1E2A1EE97F0B1D2A1D297C0B1E5A1D497FDB1DBA1D997CFB1E2A1D497C0B1E3A1D097C7");
                                                    case 1815757863:
                                                        break;
                                                }
                                            }
                                            i2++;
                                            break;
                                        case -739370949:
                                            m897d8 = i2 < m967p02.size() ? atm.m897d("B1DBA1D797C3B1E1A1D197C4B1E2A1E997C2B1E2A1EF97FFB1DCA1DD97C7B1E2A1ED97CFB1E1A1EC97C7B1EDA1D497FFB1DCA1D397C0") : atm.m897d("B1D8A1EE97C4B1E2A1D297F8B1E2A1D997F3B1DBA1EA97C1B1DAA1E397C7B1DFA1ED");
                                        case 2075606401:
                                            String m897d16 = atm.m897d("B1DBA1DE97F4B1D1A1EE97F9B1D8A1D197FFB1E3A1E297C1B1DFA1EE");
                                            while (true) {
                                                switch (m897d16.hashCode() ^ 540677287) {
                                                    case -1620242843:
                                                        m897d16 = atm.m897d("B1DCA1ED97F0B1E2A1E297FFB1DCA1D397F8B1DFA1E997FCB1D2A1EC97F9B1E2A1ED97C0B1E0A1D097F9B1D2A1EF97C4B1DAA1EA");
                                                        break;
                                                    case -1565432899:
                                                        String join = TextUtils.join(C0052e.m1418a(new byte[]{-107, -20, 42}, new byte[]{-79, -56, 14, 65, 123, -70, -64, -83}), treeMap.keySet());
                                                        String join2 = TextUtils.join(C0052e.m1418a(new byte[]{-84, -55, 11}, new byte[]{-120, -19, 47, -86, -73, -5, 17, -31}), treeMap.values());
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{15, Byte.MAX_VALUE, -22, -61, 109, -117, -29, 116, 38, 118, -4, -13, 112}, new byte[]{121, 16, -114, -100, 29, -25, -126, 13}), join);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-88, 38, -34, -120, 104, 29, -61, -10, -127, 60, -56, -69}, new byte[]{-34, 73, -70, -41, 24, 113, -94, -113}), join2);
                                                        break;
                                                    case -218702775:
                                                        break;
                                                    case 1852771964:
                                                        if (treeMap.size() <= 0) {
                                                            m897d16 = atm.m897d("B1E1A1EF97C4B1E2A1E997C2B1D2A1EC97FCB1DAA1EF97C2B1ECA1ED97C1B1DDA1D1");
                                                            break;
                                                        } else {
                                                            m897d16 = atm.m897d("B1DCA1EF97C7B1ECA1E997FFB1E2A1D797C3B1D2A1ED97FAB1D8A1E997C0B1D8A1EC97F8");
                                                            break;
                                                        }
                                                }
                                            }
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.put(jSONObject2);
                                            jSONObject.put(C0052e.m1418a(new byte[]{-10, 121, -23, 22}, new byte[]{-102, 16, -102, 98, -14, 90, 109, 79}), jSONArray);
                                            str3 = jSONObject.toString();
                                            return str3;
                                    }
                                }
                            }
                            break;
                    }
                }
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String homeContent(boolean z) {
        boolean z2;
        C0459g m967p0;
        JSONArray jSONArray;
        int i = 0;
        try {
            C0288h m1414e = C0052e.m1414e(m291c(f1065h));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{49, 17, -116, 16, 27, -1, 57, 48, 121, 90, -71, 18, 1, -4, 43, 49, 105, 19, -74, 5, 87, -13, 56, 110, 37, 8, -93, 28, 80, -61, 116, 99, 40, 20, -9, 18}, new byte[]{68, 125, -41, 115, 119, -98, 74, 67}));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0293m> it = m967p02.iterator();
            while (true) {
                String m897d = atm.m897d("B1E2A1EE97C7B1DCA1D497C3B1D2A1E397F9B1E2A1EA97FAB1D2A1ED97C2B1ECA1D597C7B1D1A1D397C0");
                while (true) {
                    switch (m897d.hashCode() ^ (-809329892)) {
                        case -1870795910:
                            m897d = it.hasNext() ? atm.m897d("B1DCA1D297FFB1D6A1EC97C4B1E3A1EC97C3B1DAA1D597F0B1E2A1EE97F0B1DBA1DD97C3B1ECA1EF97F0B1ED") : atm.m897d("B1D8A1D197C2B1E3A1D397F9B1E2A1DD97CFB1DCA1ED97F8B1ECA1D497F0B1EDA1D397C3B1E3A1EE97FEB1DDA1ED");
                        case 207160676:
                            m897d = atm.m897d("B1DEA1ED97C0B1E2A1D597C4B1DDA1EF97C2B1DDA1D297F9B1DAA1EF97C2B1DDA1EA97F9B1DAA1D297FCB1DDA1D397C4B1E2A1D997F3B1DF");
                        case 325943005:
                            C0293m next = it.next();
                            String m960w0 = next.m960w0();
                            String m897d2 = atm.m897d("B1E3A1EE97FDB1E2A1E297CEB1E6A1ED97F9B1E3A1E397C0B1D2A1EF97F3B1D6A1D397F9B1E2A1D097C4B1EDA1EC97C4B1E2A1D297FEB1DD");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-542192386)) {
                                    case -1550824563:
                                        m897d2 = !m960w0.equals(C0052e.m1418a(new byte[]{-8, Byte.MIN_VALUE, 99, -29, 46, -41}, new byte[]{31, 20, -42, 6, -109, 102, -108, -88})) ? atm.m897d("B1DAA1EF97F9B1E0A1D097FDB1E2A1E997FFB1D1A1D497F0B1E2A1D297C0B1E2A1D397FCB1E2A1EA97F8B1E6A1ED") : atm.m897d("B1D8A1E997F4B1DCA1D397F0B1E2A1DE97F8B1ECA1E397FCB1DCA1E997C2B1E6A1D397F0B1E2");
                                    case -1359395400:
                                        m897d2 = atm.m897d("B1DCA1EF97CEB1E2A1D297FFB1D1A1E397FEB1DBA1ED97C4B1D1A1D397C4B1E1A1D997FCB1E5A1D497C0");
                                    case 1342321167:
                                        break;
                                    case 1853346362:
                                        String m897d3 = atm.m897d("B1E6A1EA97FCB1E3A1D097CFB1EDA1E397C2B1DFA1E297C0B1E2A1D097CFB1D2A1ED97F3B1ECA1D997CEB1E0A1DE97F4B1E0A1D097CEB1DBA1E397C0");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1794018164) {
                                                case -1472547811:
                                                    break;
                                                case -329219283:
                                                    String m897d4 = atm.m897d("B1DFA1D297C0B1ECA1EC97F0B1E2A1D597FCB1DEA1D097C3B1E2A1D797FDB1DDA1EA97C1B1D1A1D597FFB1EC");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ (-1214316376)) {
                                                            case 28780395:
                                                                break;
                                                            case 377153748:
                                                                String m897d5 = atm.m897d("B1DDA1D997C1B1DAA1ED97C4B1E1A1D597FDB1E2A1ED97FAB1DFA1ED97CEB1DCA1DE");
                                                                while (true) {
                                                                    switch (m897d5.hashCode() ^ 410911890) {
                                                                        case -1447016154:
                                                                            m897d5 = atm.m897d("B1E5A1E997F0B1E1A1E397F0B1E2A1D297CEB1DDA1ED97C4B1D2A1D197FFB1EDA1E397C0B1D8A1D497F9B1E2A1DE97FCB1DB");
                                                                        case -690922708:
                                                                            String m897d6 = atm.m897d("B1D1A1D397CFB1ECA1DD97CEB1D2A1D497C4B1E5A1E997C4B1E6A1D797F8");
                                                                            while (true) {
                                                                                switch (m897d6.hashCode() ^ 246602996) {
                                                                                    case 192762940:
                                                                                        m897d6 = atm.m897d("B1DBA1D397FFB1E2A1E397FAB1ECA1ED97F0B1DDA1ED97C0B1ECA1EF97F4B1E1A1EF97F0");
                                                                                    case 462438971:
                                                                                        z2 = false;
                                                                                        break;
                                                                                    case 1143127536:
                                                                                        break;
                                                                                    case 1962357762:
                                                                                        m897d6 = m960w0.equals(C0052e.m1418a(new byte[]{84, -22, -4, 36, 91, 107}, new byte[]{-79, 111, 74, -64, -32, -3, 30, -17})) ? atm.m897d("B1DEA1E397C3B1E5A1DE97C3B1DEA1E397FAB1D1A1DE97FAB1E0A1ED97F0B1E5A1D797FAB1DBA1D497CEB1DBA1ED97F0B1E5A1EF97F3") : atm.m897d("B1DCA1E997CEB1DAA1EE97FDB1E2A1D497C4B1E5A1E997FAB1ECA1ED97CEB1D6A1E997C3B1E1A1E997FFB1D8");
                                                                                }
                                                                            }
                                                                            break;
                                                                        case -25444924:
                                                                            m897d5 = !m960w0.equals(C0052e.m1418a(new byte[]{108, 108, 57, 76, 66, -28}, new byte[]{-119, -26, -111, -86, -2, 79, -68, -100})) ? atm.m897d("B1D8A1D197FDB1E2A1DE97FDB1E2A1D297C0B1DCA1ED97F0B1ECA1E297CFB1DAA1EE97FCB1D6A1D497C0B1DEA1D597C7B1E3A1DE97CEB1D2A1D597F9") : atm.m897d("B1EDA1D597C4B1E2A1EE97C3B1E2A1ED97C7B1DDA1D397C0B1EDA1D097CEB1DDA1D197FE");
                                                                        case 213670770:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 685732479:
                                                                m897d4 = !m960w0.equals(C0052e.m1418a(new byte[]{-95, 40, -45, 120, 37, -92}, new byte[]{70, -109, 111, -112, -84, 30, -99, -33})) ? atm.m897d("B1E5A1D297FCB1D1A1E297C3B1DAA1EC97C2B1EDA1DE97C7B1DAA1D397C0B1DAA1DD97CEB1ECA1D597FDB1ECA1D797C0B1E2") : atm.m897d("B1D6A1DE97FDB1E5A1EF97F9B1E2A1D397C1B1D8A1EE97F4B1DCA1D297F4B1E2A1ED");
                                                            case 1529160582:
                                                                m897d4 = atm.m897d("B1E6A1D397F3B1EDA1D197F4B1E1A1D197C0B1D2A1EE97CEB1E2A1EC97CEB1DCA1ED97F4B1E1A1D397FAB1E6A1ED97C0");
                                                        }
                                                    }
                                                    break;
                                                case 186261453:
                                                    m897d3 = atm.m897d("B1D1A1DE97FDB1E2A1EA97F0B1E2A1E297FCB1D1A1D397FFB1E6A1D497CEB1DBA1DD97C0B1E6");
                                                case 1677289101:
                                                    m897d3 = !m960w0.equals(C0052e.m1418a(new byte[]{28, -2, -71, 36, 44, -1, 31, -103, 92}, new byte[]{-5, 106, 12, -52, -117, 121, -6, 16})) ? atm.m897d("B1EDA1E297FEB1E2A1D297FFB1D2A1D097C0B1E1A1D597C1B1DEA1DD97FEB1EDA1EA97F9B1E3A1EE97F8B1E5A1D297CEB1ECA1ED97C3B1ECA1DD") : atm.m897d("B1DEA1E997F9B1E2A1D297C4B1DCA1D597FCB1DFA1D797FCB1D2A1D797FDB1DEA1E297FAB1E6A1ED97C2B1DDA1E2");
                                            }
                                        }
                                        break;
                                }
                            }
                            z2 = true;
                            String m897d7 = atm.m897d("B1E5A1D297C0B1EDA1E997FAB1E0A1E997F9B1DAA1DD97FDB1E2A1E997FDB1D2A1DD97F9");
                            while (true) {
                                switch (m897d7.hashCode() ^ 1895749829) {
                                    case -2129099977:
                                        Matcher matcher = this.f1069d.matcher(next.mo925d(C0052e.m1418a(new byte[]{49, -99, 87, 8}, new byte[]{89, -17, 50, 110, -70, -61, 45, -96})));
                                        String m897d8 = atm.m897d("B1DFA1EE97F9B1DDA1EA97F4B1ECA1D497C0B1E0A1D497CEB1DDA1DE97F4B1DAA1ED97FCB1DCA1D5");
                                        while (true) {
                                            switch (m897d8.hashCode() ^ 2065829482) {
                                                case -1716229678:
                                                    String trim = matcher.group(1).trim();
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put(C0052e.m1418a(new byte[]{-47, 103, -9, -75, -1, 93, -58}, new byte[]{-91, 30, -121, -48, -96, 52, -94, -99}), trim);
                                                    jSONObject.put(C0052e.m1418a(new byte[]{25, 71, -32, -5, -57, 89, -6, 121, 8}, new byte[]{109, 62, -112, -98, -104, 55, -101, 20}), m960w0);
                                                    jSONArray2.put(jSONObject);
                                                    continue;
                                                case -835509309:
                                                    break;
                                                case 365116931:
                                                    m897d8 = !matcher.find() ? atm.m897d("B1E0A1E297CFB1DFA1D197C4B1E2A1D197FFB1E0A1D297C0B1E3A1D797C0B1D1A1DE97F3B1E2A1EE97F9B1D2A1DD97C4B1E0A1EA97F4B1D1") : atm.m897d("B1D2A1EC97F0B1E6A1D997C2B1DFA1EC97F3B1E6A1D097FFB1E2A1EC97F9B1DBA1E997CFB1ECA1ED");
                                                case 1359808891:
                                                    m897d8 = atm.m897d("B1DAA1E297FDB1E5A1D297F0B1DBA1ED97C0B1EDA1D397F0B1DDA1EF97FE");
                                            }
                                        }
                                        break;
                                    case -1017223442:
                                        m897d7 = z2 ? atm.m897d("B1D2A1EC97C1B1DDA1E997F4B1D8A1D297FDB1ECA1E397C3B1DBA1DE97F8B1DEA1DE97FEB1E2") : atm.m897d("B1E2A1D797CEB1E2A1D397C0B1D1A1D797F0B1DDA1ED97CEB1E6A1D097C4B1DAA1E297F9B1DCA1ED97F4B1DBA1DD97C2B1E1A1EC97FAB1DAA1E3");
                                    case -853321443:
                                        break;
                                    case -203833568:
                                        m897d7 = atm.m897d("B1DDA1EE97F4B1E3A1D297C1B1D2A1D097CFB1EDA1EF97F0B1E2A1EE97F0B1ECA1ED97FCB1E2A1E997F4B1E2A1ED97FAB1D1A1DD97F9B1DFA1DD");
                                }
                            }
                            break;
                        case 1484762495:
                            JSONObject jSONObject2 = new JSONObject();
                            String m897d9 = atm.m897d("B1DDA1DD97C4B1DDA1ED97F8B1DBA1EE97FDB1D6A1D397C3B1E1A1E397F3B1E6A1E297F8B1E0A1E297C1B1E6A1EF");
                            while (true) {
                                switch (m897d9.hashCode() ^ (-1203172018)) {
                                    case -984978027:
                                        if (!z) {
                                            m897d9 = atm.m897d("B1DEA1D397FEB1E2A1D597C3B1DCA1ED97C4B1DEA1EF97FCB1E2A1EF97F4B1E6A1D297CEB1ECA1DD97C2B1E1A1ED97C0");
                                            break;
                                        } else {
                                            m897d9 = atm.m897d("B1DFA1D797F9B1E2A1D397F9B1DDA1D397C7B1DBA1D097FDB1DCA1D997C4B1E2");
                                            break;
                                        }
                                    case 552289917:
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-113, -31, 120, 0, 48, -54, -93}, new byte[]{-23, -120, 20, 116, 85, -72, -48, 91}), this.f1068c);
                                        break;
                                    case 1548058249:
                                        break;
                                    case 2119403356:
                                        m897d9 = atm.m897d("B1E2A1DD97C0B1D2A1D297F0B1DFA1ED97F8B1E2A1E397FFB1DAA1EE97C3B1D2A1ED");
                                        break;
                                }
                            }
                            jSONObject2.put(C0052e.m1418a(new byte[]{21, 43, 98, 8, -116}, new byte[]{118, 71, 3, 123, -1, -124, -27, 67}), jSONArray2);
                            try {
                                m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-99, -124, -87, 11, 119, -106, -80, 39, -116, -124, -18, 12, 107}, new byte[]{-24, -24, -121, Byte.MAX_VALUE, 31, -28, -43, 70})).get(0).m967p0(C0052e.m1418a(new byte[]{64, -25}, new byte[]{44, -114, -91, 11, 22, -117, -52, 41}));
                                jSONArray = new JSONArray();
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                            while (true) {
                                String m897d10 = atm.m897d("B1EDA1D297C1B1E1A1D497CEB1DFA1D397C7B1D8A1D197FDB1DBA1EC97C4B1DEA1ED97C2B1E2A1D497FCB1D1A1E297C4B1E3A1DE97C0");
                                while (true) {
                                    switch (m897d10.hashCode() ^ (-145510053)) {
                                        case -1906261216:
                                            C0293m c0293m = m967p0.get(i);
                                            String mo925d = c0293m.m966q0(C0052e.m1418a(new byte[]{53, -48, 36, 20}, new byte[]{93, -30, 4, 117, -12, 64, 23, 13})).mo925d(C0052e.m1418a(new byte[]{53, 0, 103, 117, 1}, new byte[]{65, 105, 19, 25, 100, 67, 122, 107}));
                                            String mo925d2 = c0293m.m966q0(C0052e.m1418a(new byte[]{-4, -59, -71, 95, -30}, new byte[]{-99, -27, -48, 50, -123, 28, -123, -4})).mo925d(C0052e.m1418a(new byte[]{-69, -58, 104}, new byte[]{-56, -76, 11, 101, -60, -22, 114, -113}));
                                            String m960w02 = c0293m.m966q0(C0052e.m1418a(new byte[]{20, -62, 95, -50, -108, -8, 118, -38}, new byte[]{117, -30, 61, -69, -32, -116, 25, -76})).m960w0();
                                            Matcher matcher2 = this.f1070e.matcher(c0293m.m966q0(C0052e.m1418a(new byte[]{30}, new byte[]{Byte.MAX_VALUE, -53, -87, -32, 13, 18, 83, -81})).mo925d(C0052e.m1418a(new byte[]{-117, 98, -121, -91}, new byte[]{-29, 16, -30, -61, 54, 95, -38, 89})));
                                            String m897d11 = atm.m897d("B1D8A1D797F4B1D6A1ED97F0B1E2A1EF97FAB1E6A1D097C7B1DFA1ED97FDB1DDA1ED97F0B1D6A1E397C0B1E3A1D797C225");
                                            while (true) {
                                                switch (m897d11.hashCode() ^ (-2037859158)) {
                                                    case -621165397:
                                                        m897d11 = !matcher2.find() ? atm.m897d("B1ECA1D097C3B1E0A1D097C0B1E5A1D797C1B1E2A1EE97F9B1E2A1EF97C2B1DDA1E997FEB1DBA1EA97C0B1E2A1ED97C0B1DBA1E997FFB1E0") : atm.m897d("B1ECA1D497F8B1ECA1E997FCB1DDA1DE97C3B1E2A1ED97F4B1DDA1E297FFB1E1A1ED97FAB1E5A1E997FAB1DBA1D597FEB1DEA1E997FF");
                                                    case -251651548:
                                                        m897d11 = atm.m897d("B1E3A1E297FFB1DEA1EE97FEB1DBA1EC97C4B1E2A1ED97FCB1E1A1DE97F8B1DDA1D797FDB1E6A1ED97FFB1D6A1E997C0");
                                                    case 595567351:
                                                        break;
                                                    case 1994709675:
                                                        String group = matcher2.group(1);
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{120, 102, 91, -75, -110, 33}, new byte[]{14, 9, 63, -22, -5, 69, -100, -66}), group);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{-101, -75, -8, 12, -11, 73, -81, 76}, new byte[]{-19, -38, -100, 83, -101, 40, -62, 41}), mo925d);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{-96, 53, 99, -79, 87, -36, 100}, new byte[]{-42, 90, 7, -18, 39, -75, 7, -123}), mo925d2);
                                                        jSONObject3.put(C0052e.m1418a(new byte[]{35, 47, 77, -86, -114, -64, -94, -20, 39, 43, 90}, new byte[]{85, 64, 41, -11, -4, -91, -49, -115}), m960w02);
                                                        jSONArray.put(jSONObject3);
                                                        break;
                                                }
                                            }
                                            i++;
                                            break;
                                        case -1761844902:
                                            jSONObject2.put(C0052e.m1418a(new byte[]{0, 126, 86, -108}, new byte[]{108, 23, 37, -32, -69, 73, 108, 67}), jSONArray);
                                            break;
                                        case 195394776:
                                            m897d10 = i < m967p0.size() ? atm.m897d("B1DAA1ED97FEB1DBA1ED97C1B1E1A1D297CEB1E2A1D797C3B1D8A1D497CFB1DFA1D397F8B1E6A1D297F4B1D1A1D797FCB1ECA1EC97F9B1DCA1ED") : atm.m897d("B1D6A1D297FAB1E5A1EE97CEB1E2A1D597C3B1E6A1E397FDB1DCA1D097F3B1EDA1DE97FCB1DCA1ED97CFB1E3A1D1");
                                        case 1057344569:
                                            m897d10 = atm.m897d("B1E1A1DE97F9B1DAA1D397FEB1E2A1EA97C1B1DCA1ED97FFB1E6A1DD97FAB1E3A1D597CEB1DEA1E397C0");
                                    }
                                }
                                return jSONObject2.toString();
                            }
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
            this.f1067b = new JSONObject(atm.m897d("1158180C3936484001573F3048405891F6C98CE8D737ABE2D55856573C2D48405857607A1914584F7C74481508577661534307596E3C1A121E57762348091257767A8EC0EB93DEF52B9DC0CA6E74480A0F57767A48565806227A504A5657232A4840434C75254658190C3936484001573F3048405891F6C98CE8D736ABE2D55856573C2D48405857607A1914584F7C74481508577661534307596E3C08174900747A50015806247A50589ECFDDBEF8D73E92F6E748565805397A505858596E2B04584045607A0508584F75615307565725600358400E6E2B02584057A8E2FB9CE8D809BFD0C558596E281F5840576E74480914577668465815076E6253434308607A07490F4D243C484001573F3048405891F6C98CE8D733ABE2D55856573C2D4840581D382C1A09405A63391F1F0E106237181D55143C3145450F07206548565806227A504B5657232A4840434C752546581614223F1F1B14126E621158091D6E62489EC0E4AACAC73D9DCFF37A46580A006E6248120E013C2B50555514393D1E1F541A3E3F451B0A1C63671F0816486E74480914577669465815076E6253434308607A02030F1B6E621158091D6E62489EC0E4AACAC7329DCFF37A46580A006E6248120E013C2B50555514393D1E1F541A3E3F451B0A1C63671F0816486E74480914577669465815076E6253434308607A01030F1B6E621158091D6E62489EC0E4AACAC7319DCFF37A46580A006E6248120E013C2B50555514393D1E1F541A3E3F451B0A1C63671F0816486E74480914577669465815076E6253434308607A080A030029211F58400E6E2B02584057A8E2FB9CE8D8ABEACE92D5D86E74480A0F57767A48565806227A504A5657232A4840434C7525465818052B2D05030F57762348091257767A8EC0EB93DEF58FE1C79DE3F548565805397A505858596E2B04584045607A0508584F75615307565720211F14584F377A1912584F6EBCD0EB9CE7E1148DC0C557607A1A0F584F6E301E0E0A067677451B0F10383D4415081263391A13554A392A064758596E2B04584044607A0508584F75615307565721211F14584F377A1912584F6EBCD0EB9CE7E1158DC0C557607A1A0F584F6E7A4658091B6E625A56581A3E7A5043434C3174481E0A57762348091257767A2E0A1614353D185856573C2D48405857607A1914584F7C74481508577661534307596E21130F1457762348091257767A8EC0EB93DEF5339DC0CA6E74480A0F57767A48565806227A504A5657232A4840434C752517"));
            this.f1068c = new JSONObject(atm.m897d("1158371A3A310F58402E377A011F0357766846581414213D48405890C4DE8DCBC157607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8FECE690C5FF8DF3FD57607A1C58405734321A580759377A04584057A9D2C29EC7E9ABD1ED5856573A7A50581E0F3C7A17560157227A50589DFDFDBEE9FF9DFCCB7A46580C57767A0B0B0A57317411581457767A8DDDEB90F5E38DF3FD57607A1C58405727301A580759377A04584057AAD9FA9CFAE3ABD1ED5856573A7A505811173C7A17560157227A50589CF6C6BEE8E09DFCCB7A46580C57767A00090A57317411581457767A8CF2E291F6D18DF3FD57607A1C58405736221A580759377A04584057A9D1CD9CF9F0ABD1ED5856573A7A505810043C7A17270728607A3E0C584F172348111F0C6E625A56581B2D350F584057A9D0EC9DCBCE6E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E62489DC4FBA9D1CD5856573A7A50581500213D03580759377A04584057A5C7C39FF3D26E74480C584F6E300B1410006E254601581B6E62489CEDD0A9D1CD5856573A7A5058081C262D4807560E6E3648405893FFE88FF3DD57607A1C58405735391E1B131F397A17560157227A50589DC8DDBDE3DD58596E2E484058022D360D100F57317411581457767A8FF5CA90C5FF485658036E62480E1B1C262D4807560E6E3648405890D7E58EC0DD57607A1C584057223D031E1357317411581457767A8CC2D590C5FF485658036E62480E0C172B3248072708117448200357760311581110357A504A56572239071F584F6EBDE2FC9DC4F77A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FEEF1BFD1C658596E2E484058123937101514126E254601581B6E624893E5DCABE3D65856573A7A50581214222205141D57317411581457767A8DC4F492F7E4485658036E6248171F1C3637041D5808112537565831217A50210157273D13584045607A041B17106E62489FF2F3ABE9D15856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9D2C29DEECE6E74480C584F6E3C05141D1D39394807560E6E3648405893DBFD8CC6D157607A1C5840573E31071B1457317411581457767A8FE1C793F0F3485658036E62481D0F1A213904580759377A04584057ABE6E49CC6DE6E74480C584F6E350F131714227A17270728607A1B130E146E623101581E292148404A596E360B171F57767A8FF2FC92FDE3485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405892F6F28FC7EF92C5DF485658036E62483016056E254601581B6E62489DC1FAA9DDD29DF3F26E74480C584F6E120E0A580860234814584F6EBFD1F59FF0F4BDE3DD58596E2E4840583F28324807560E6E3648405892F1C98FDEDD92D8ED8FC7CB57607A1C5840573B341A580759377A04584057A9C3D79EC0D2A4D8EB9DEEC0A9E5DB5856573A7A50581614233C031B140C25360D580728310517"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0298, code lost:
        r4.put(r3, "");
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String playerContent(java.lang.String r13, java.lang.String r14, java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0589d.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        try {
            C0288h m1414e = C0052e.m1414e(m291c(C0052e.m1418a(new byte[]{-111, -36, -122, -115, 7, 32, 126, 37, -104, -35, -105, -119, 17, 52, 50, 101, -108, -121, -109, -120, 17, 110, 52, 121, -106, -122, -126, -107, 4, 37, 34, 111, -104, -38, -111, -107, 3, 117, 35, 110, -60}, new byte[]{-7, -88, -14, -3, 116, 26, 81, 10}) + str));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<C0293m> it = m1414e.m967p0(C0052e.m1418a(new byte[]{114, -4, -55, -110, 15, -118, 5, 65, 59, -9, -48, -40, 21, -43, 2, 73, 40, -7, -42, -110, 1, -114, 19, 76, 119}, new byte[]{22, -107, -65, -68, 108, -21, 119, 37})).iterator();
            while (true) {
                String m897d = atm.m897d("B1D1A1EC97C0B1DCA1E297F8B1D1A1D597C2B1DAA1E297F0B1E2A1ED97FDB1E5A1D597FDB1DFA1ED97C1B1E6A1EF97F8B1E0A1DD97C0B1EDA1ED97F4");
                while (true) {
                    switch (m897d.hashCode() ^ (-615334778)) {
                        case -2027303327:
                            jSONObject.put(C0052e.m1418a(new byte[]{54, -104, -72, 10}, new byte[]{90, -15, -53, 126, 106, -93, 20, 23}), jSONArray);
                            return jSONObject.toString();
                        case -1604417589:
                            m897d = it.hasNext() ? atm.m897d("B1D6A1D097F9B1E2A1E297C0B1DFA1D597CEB1D6A1D397FAB1D1A1DE97C2B1DBA1ED97FEB1E6A1D497C0B1D8A1D797CFB1DBA1D497F9") : atm.m897d("B1D8A1D397FCB1E0A1D097CFB1DCA1DE97C7B1DEA1EF97C4B1E2A1EA97F3B1DAA1ED97F3B1E2A1ED");
                        case -297671926:
                            C0293m next = it.next();
                            String m602e = next.m967p0(C0052e.m1418a(new byte[]{-64, 9, 11, -62, 74, -60, 71, 11, -59, 77, 31, -125, 67, -40, 29, 6, -51, 22, 83, -97, 82, -61, 73, 7, -57, 20, 67, -115, 25, -46, 83, 3, -54}, new byte[]{-92, 96, 125, -20, 39, -95, 35, 98})).m602e();
                            String m960w0 = next.m966q0(C0052e.m1418a(new byte[]{94, -59, -73, 95, -42, -102, -32, 121, 91, -127, -93, 30, -33, -122, -70, 116, 83, -38, -17, 21, -106, -103, -24, 117, 66, -110, -91, 24, -51, -47, -16, 117, 66, -40, -20, 28, -50, -117, -31, 116, 4, -33, -79, 16, -43}, new byte[]{58, -84, -63, 113, -69, -1, -124, 16})).m960w0();
                            Matcher matcher = this.f1070e.matcher(next.m967p0(C0052e.m1418a(new byte[]{-111, -52, 97, -21, 67, 124, 42, -72, -108, -120, 117, -86, 74, 96, 112, -75, -100, -45, 57, -74, 91, 123, 36, -76, -106, -47, 41, -92}, new byte[]{-11, -91, 23, -59, 46, 25, 78, -47})).m606a(C0052e.m1418a(new byte[]{-102, 15, 2, -32}, new byte[]{-14, 125, 103, -122, 62, 26, 10, -101})));
                            String m897d2 = atm.m897d("B1E2A1EC97FEB1E2A1D197FFB1DCA1ED97FCB1D6A1D197C0B1D8A1D497C0B1E6A1D597C0B1E2A1D297C4B1D2A1ED97C0B1EDA1EE");
                            while (true) {
                                switch (m897d2.hashCode() ^ 427889571) {
                                    case -538243877:
                                        String group = matcher.group(1);
                                        JSONObject jSONObject2 = new JSONObject();
                                        String mo925d = C0052e.m1414e(m291c(C0052e.m1418a(new byte[]{-20, -99, 60, 63, -111, -110, -75, -87, -27, -100, 45, 59, -121, -122, -7, -23, -23, -58}, new byte[]{-124, -23, 72, 79, -30, -88, -102, -122}) + group + C0052e.m1418a(new byte[]{91}, new byte[]{116, -80, 98, 0, 32, -22, -11, -84}))).m966q0(C0052e.m1418a(new byte[]{-51, -2, 101, 98, 116, 107, -85, 68, -37, -73, 114}, new byte[]{-87, -105, 19, 76, 23, 4, -35, 33})).mo925d(C0052e.m1418a(new byte[]{-126, 106, 44, -84}, new byte[]{-22, 24, 73, -54, 78, -118, 51, 73}));
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-62, 5, -70, 11, -52, -40}, new byte[]{-76, 106, -34, 84, -91, -68, -44, -96}), group);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{106, -111, 32, 56, -81, -29, 1, 11}, new byte[]{28, -2, 68, 103, -63, -126, 108, 110}), m602e);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-121, -87, 18, 115, -61, 95, 98}, new byte[]{-15, -58, 118, 44, -77, 54, 1, -32}), mo925d);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-19, 7, 14, -25, 30, -45, -102, 107, -23, 3, 25}, new byte[]{-101, 104, 106, -72, 108, -74, -9, 10}), m960w0);
                                        jSONArray.put(jSONObject2);
                                        break;
                                    case 184984317:
                                        m897d2 = !matcher.find() ? atm.m897d("B1E0A1D197FCB1E5A1D197C4B1E2A1EE97F8B1DBA1ED97CFB1DFA1E397C0B1DCA1D197CEB1E2A1D997F8B1E0A1D597C1B1E0A1D397CE") : atm.m897d("B1ECA1EF97FDB1E2A1ED97FFB1DCA1ED97CEB1DBA1D297F8B1D8A1D997CFB1ECA1ED97C3B1D1A1EE");
                                    case 818005139:
                                        break;
                                    case 2020222609:
                                        m897d2 = atm.m897d("B1EDA1EC97FAB1DCA1D597F0B1E2A1D297F8B1DFA1ED97C3B1D6A1D597FCB1E6A1D397C3B1DCA1D997FAB1D6A1EE97FCB1D1A1E297FCB1DBA1ED");
                                }
                            }
                            break;
                        case 1967369548:
                            m897d = atm.m897d("B1EDA1EA97C4B1E2A1E997FCB1DCA1ED97C1B1E3A1D497C0B1DFA1D097FEB1E2A1E397FCB1DBA1ED");
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
