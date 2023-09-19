package com.github.catvod.spider.merge.p050n;

import android.text.TextUtils;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.n.d */
/* loaded from: classes.dex */
final class C0627d {

    /* renamed from: a */
    private String f1193a;

    /* renamed from: b */
    private Object f1194b;

    /* renamed from: c */
    private final Map<String, String> f1195c;

    /* renamed from: d */
    private final Map<String, String> f1196d;

    /* renamed from: e */
    private final AbstractC0626c f1197e;

    /* renamed from: f */
    private Request f1198f;

    /* renamed from: g */
    private Request.Builder f1199g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0627d(String str, String str2, String str3, Map<String, String> map, AbstractC0626c abstractC0626c) {
        this(str, str2, str3, null, map, abstractC0626c);
    }

    private C0627d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, AbstractC0626c abstractC0626c) {
        char c;
        String next;
        String str4;
        RequestBody build;
        this.f1194b = null;
        this.f1193a = str2;
        this.f1195c = map;
        this.f1196d = map2;
        this.f1197e = abstractC0626c;
        this.f1199g = new Request.Builder();
        int hashCode = str.hashCode();
        String m897d = atm.m897d("B1DCA1E997FEB1E3A1D997FDB1E2A1D097C7B1D2A1EC97F4B1DDA1EF97F0B1E6A1ED");
        while (true) {
            switch (m897d.hashCode() ^ 1817710394) {
                case -1732342964:
                    String m897d2 = atm.m897d("B1ECA1EF97CEB1E3A1E297F3B1E5A1D597C3B1E5A1D497FDB1D1A1DE97F8B1E6A1EF97C4B1DFA1EF");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1002401789)) {
                            case -1806713176:
                                c = 0;
                                break;
                            case -852651500:
                                if (!str.equals(C0052e.m1418a(new byte[]{89, -56, 42}, new byte[]{30, -115, 126, 6, 43, 71, -16, -51}))) {
                                    m897d2 = atm.m897d("B1D2A1EC97C4B1E2A1E997C2B1E3A1DD97F0B1E6A1ED97C4B1E1A1ED97C0B1E0A1ED97C0B1DDA1E997FFB1DDA1ED97CEB1E2A1E997CEB1E1A1D097F0B1DBA1ED");
                                    break;
                                } else {
                                    m897d2 = atm.m897d("B1EDA1E997C2B1E2A1EE97F0B1E2A1EF97FDB1DAA1D297F9B1D6A1DE97C0B1E3A1D397CEB1E1A1EE97FFB1D6A1DE97C4");
                                    break;
                                }
                            case -356251762:
                                m897d2 = atm.m897d("B1D1A1D497FEB1E2A1EC97C4B1DDA1ED97FFB1DFA1E397C0B1D8A1D397C4B1E2A1D397FAB1E5A1EE97FEB1D1A1D297F0B1D2A1ED97C7B1ECA1D9");
                                break;
                            case 299130212:
                                break;
                        }
                    }
                    break;
                case -692754759:
                    m897d = atm.m897d("B1ECA1EF97F0B1E2A1D097CEB1DAA1D097FAB1E5A1D097C3B1D2A1ED97F4B1E3A1ED97C7B1E1A1E997C4B1ECA1E9");
                    break;
                case 1670842746:
                    String m897d3 = atm.m897d("B1E5A1ED97CEB1E2A1D497C1B1DCA1D797C3B1D2A1EA97CFB1D2A1ED97F0B1ECA1D097C0");
                    while (true) {
                        switch (m897d3.hashCode() ^ 1143203441) {
                            case -1393643436:
                                if (hashCode == 2461856) {
                                    m897d3 = atm.m897d("B1DAA1EF97F9B1E0A1EC97C4B1DAA1D797C1B1E3A1D997F0B1E1A1D097FAB1DEA1EC97FEB1E0A1D497FE");
                                    break;
                                } else {
                                    m897d3 = atm.m897d("B1EDA1D097FAB1E6A1D397F9B1E2A1EE97C7B1DBA1ED97C4B1DAA1DD97F9B1DBA1D297FFB1D2A1D397CFB1D2A1DD");
                                    break;
                                }
                            case -868886069:
                                break;
                            case -501248332:
                                m897d3 = atm.m897d("B1DBA1E297FFB1D2A1EC97FAB1E5A1ED97FFB1E2A1EF97C0B1E2A1ED97F8B1EDA1E997C0B1E0A1D597C3");
                                break;
                            case -68637309:
                                String m897d4 = atm.m897d("B1E2A1DD97F9B1E2A1D297F4B1E2A1ED97C0B1D8A1D597FAB1E1A1DD97F8B1E5A1EA97F9B1D1A1D297CEB1E2A1E9");
                                while (true) {
                                    switch (m897d4.hashCode() ^ (-722368956)) {
                                        case 436189124:
                                            c = 1;
                                            break;
                                        case 1367629596:
                                            if (!str.equals(C0052e.m1418a(new byte[]{119, -116, -3, 9}, new byte[]{39, -61, -82, 93, 11, -21, 95, -40}))) {
                                                m897d4 = atm.m897d("B1EDA1D797F4B1DDA1D197F0B1D2A1D397C3B1E1A1E297F8B1E1A1E997C4B1E2A1D297CEB1EDA1DE97FDB1DCA1ED97CFB1E2A1E997C0");
                                                break;
                                            } else {
                                                m897d4 = atm.m897d("B1E0A1D297FEB1E2A1D497FCB1E2A1D597F4B1D1A1D197C3B1D2A1EA97C4B1E6A1D597CFB1ECA1ED97C0B1E1A1ED97C0B1ECA1ED97FDB1E2A1E397C1B1D1");
                                                break;
                                            }
                                        case 1368437156:
                                            m897d4 = atm.m897d("B1DBA1ED97FCB1DDA1DE97F9B1E2A1EA97C2B1DBA1ED97C2B1E3A1D297CEB1E5A1E2");
                                            break;
                                        case 1739293959:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1950515644:
                    if (hashCode == 70454) {
                        m897d = atm.m897d("B1DBA1D797F8B1DDA1D197FFB1D8A1D997C2B1DFA1EA97C1B1E2A1DE97C4B1DFA1E397C0B1EDA1E997C0B1E6A1D497CE");
                        break;
                    } else {
                        m897d = atm.m897d("B1DCA1ED97FEB1DFA1E397CEB1E6A1D997FDB1DAA1D997F0B1E2A1D497CEB1D2A1ED97F4B1E2A1D997CFB1E3A1D5");
                        break;
                    }
            }
        }
        c = 65535;
        String m897d5 = atm.m897d("B1DCA1D797F9B1E2A1D997FCB1DEA1DE97C7B1D6A1D497FCB1D2A1E297FEB1E6A1ED97F8B1EDA1D097C0B1DAA1D297F0B1E2A1EA97C0B1DDA1ED");
        while (true) {
            switch (m897d5.hashCode() ^ (-881653653)) {
                case -2048980964:
                    String m897d6 = atm.m897d("B1D8A1EE97FDB1E2A1D597C1B1E2A1EE97F4B1E2A1DE97C4B1DEA1D297CE");
                    while (true) {
                        switch (m897d6.hashCode() ^ (-2138602097)) {
                            case -41637375:
                                if (map == null) {
                                    m897d6 = atm.m897d("B1DEA1E297CFB1DCA1DD97CFB1E0A1D397F0B1E2A1E397FAB1ECA1ED97FDB1ECA1D097F4B1DFA1DD97C0B1DFA1D0");
                                    break;
                                } else {
                                    m897d6 = atm.m897d("B1EDA1E997F0B1E2A1E997C0B1E2A1D997FEB1E6A1ED97C2B1DFA1EC97F0B1E3A1D997FAB1E5A1EA97F4B1DEA1E997FDB1EDA1D197C7B1DBA1E2");
                                    break;
                                }
                            case 1030562573:
                                break;
                            case 1654411264:
                                m897d6 = atm.m897d("B1DEA1EA97FEB1E2A1D497C3B1ECA1D597F3B1D6A1E297FEB1E2A1D497C2B1E6");
                                break;
                            case 1981134563:
                                this.f1193a += C0052e.m1418a(new byte[]{Byte.MIN_VALUE}, new byte[]{-65, -94, -38, -126, 78, 28, 118, -77});
                                Iterator<String> it = map.keySet().iterator();
                                while (true) {
                                    String m897d7 = atm.m897d("B1DAA1D397FAB1EDA1D297C2B1D6A1D497F8B1E2A1DD97CFB1D2A1D0");
                                    while (true) {
                                        switch (m897d7.hashCode() ^ 720553224) {
                                            case -1968068179:
                                                m897d7 = atm.m897d("B1E0A1EE97CEB1E2A1E397F9B1DCA1E397C2B1DBA1ED97C1B1E3A1EA97C2B1E3A1D797C0B1D1A1D497CFB1D6A1DE97CFB1DAA1D2");
                                            case -1287761545:
                                                break;
                                            case -1271004241:
                                                m897d7 = it.hasNext() ? atm.m897d("B1DCA1EA97FEB1E3A1EA97C4B1E2A1E997C1B1DCA1ED97FFB1E5A1D097C0B1E6A1ED97FAB1DFA1D497FDB1DCA1EA97FFB1E6A1EA") : atm.m897d("B1DCA1E297F9B1E0A1D597CEB1E5A1E997CEB1EDA1D997C3B1D2A1E297C0B1D1A1E397FCB1E6A1E297FCB1DBA1EA");
                                            case -598427742:
                                                this.f1193a = this.f1193a.substring(0, str4.length() - 1);
                                                break;
                                        }
                                    }
                                    this.f1193a += it.next() + C0052e.m1418a(new byte[]{44}, new byte[]{17, 31, 126, 15, -10, 0, -114, 48}) + this.f1195c.get(next) + C0052e.m1418a(new byte[]{122}, new byte[]{92, 55, -90, -50, -83, 23, -5, -72});
                                }
                                break;
                        }
                    }
                    break;
                case -1316932093:
                    String m897d8 = atm.m897d("B1D8A1D597CEB1ECA1DE97FEB1DDA1E297C4B1E2A1D997C2B1DAA1D597CEB1EDA1D197C0B1E2A1D397C4B1E2A1DE97C1B1E6A1D997C2B1ECA1ED");
                    while (true) {
                        switch (m897d8.hashCode() ^ 636843231) {
                            case -2116935646:
                                break;
                            case 1073789587:
                                Request.Builder builder = this.f1199g;
                                String m897d9 = atm.m897d("B1DAA1ED97CFB1DEA1E297FAB1E0A1D497C2B1E0A1D097F8B1ECA1E297FC");
                                while (true) {
                                    switch (m897d9.hashCode() ^ (-2143369438)) {
                                        case -1313874075:
                                            m897d9 = atm.m897d("B1E5A1D097CEB1E2A1E397F0B1D2A1D397FFB1D6A1D197C1B1D2A1EC97C7B1E0A1D297CFB1E5A1D197CEB1DFA1DE97F3B1ECA1ED97C1B1E3A1DD");
                                            break;
                                        case -429434522:
                                            build = RequestBody.create(MediaType.parse(C0052e.m1418a(new byte[]{115, -44, 55, -91, 30, -24, 94, -35, 123, -53, 41, -26, 29, -8, 80, -57, 41, -124, 36, -95, 22, -7, 76, -52, 102, -103, 50, -67, 17, -90, 7}, new byte[]{18, -92, 71, -55, 119, -117, 63, -87})), str3);
                                            break;
                                        case 841176051:
                                            if (!TextUtils.isEmpty(str3)) {
                                                m897d9 = atm.m897d("B1E6A1E297C0B1E2A1EA97F0B1E6A1E297FEB1D1A1E397FFB1E2A1ED97FAB1DFA1D097C0B1E2A1D597FDB1E0A1D097FAB1E6A1E397FE");
                                                break;
                                            } else {
                                                m897d9 = atm.m897d("B1DAA1D797FDB1D2A1E297F8B1EDA1D797C2B1D2A1D597C4B1DFA1D997C0B1E2A1D297C7B1D2A1D497F4B1D6");
                                                break;
                                            }
                                        case 1928446297:
                                            FormBody.Builder builder2 = new FormBody.Builder();
                                            String m897d10 = atm.m897d("B1E2A1E297FEB1E2A1EE97FCB1E1A1E297C4B1ECA1ED97C1B1DEA1D397CEB1DEA1D497C0B1DEA1DD97C0B1DAA1EE97CEB1E2A1DD97F0");
                                            while (true) {
                                                switch (m897d10.hashCode() ^ 26208330) {
                                                    case -320770765:
                                                        if (map == null) {
                                                            m897d10 = atm.m897d("B1DCA1D197F0B1D2A1ED97FDB1D2A1D397FDB1E2A1DE97C3B1E6A1ED97FEB1EDA1DD97C0");
                                                            break;
                                                        } else {
                                                            m897d10 = atm.m897d("B1DEA1EC97F8B1EDA1D197F8B1D6A1D197C3B1E0A1ED97FDB1DDA1D097C4B1E2A1EE97F9B1DE");
                                                            break;
                                                        }
                                                    case 247793347:
                                                        break;
                                                    case 1165362322:
                                                        m897d10 = atm.m897d("B1DBA1EF97FDB1E5A1D597F8B1DBA1D097C0B1DFA1D497F0B1E5A1E297C2");
                                                        break;
                                                    case 1602878685:
                                                        Iterator<String> it2 = map.keySet().iterator();
                                                        while (true) {
                                                            String m897d11 = atm.m897d("B1E6A1D797C4B1DCA1EA97F0B1E2A1D997FDB1E0A1D397C3B1ECA1ED97CEB1D8A1DD97C1B1D2A1DD");
                                                            while (true) {
                                                                switch (m897d11.hashCode() ^ (-1167883234)) {
                                                                    case -822225784:
                                                                        m897d11 = it2.hasNext() ? atm.m897d("B1DCA1ED97FCB1E3A1DD97FEB1E2A1D197FEB1E3A1D097C4B1E0A1D097CFB1DDA1D597FEB1D6A1DE97FAB1ECA1D797FFB1E6A1E297FDB1DD") : atm.m897d("B1DBA1EC97CFB1EDA1EA97FAB1E0A1E297C4B1D8A1DE97FFB1D1A1D197C2B1E3A1D197FD");
                                                                    case 957376015:
                                                                        m897d11 = atm.m897d("B1E1A1D597C1B1E2A1EF97CFB1D6A1D297CFB1DCA1E297F9B1E0A1D597C0B1E2A1D197F0B1E3");
                                                                    case 1411552708:
                                                                        break;
                                                                    case 1846024205:
                                                                        break;
                                                                }
                                                            }
                                                            String next2 = it2.next();
                                                            builder2.add(next2, this.f1195c.get(next2));
                                                        }
                                                        break;
                                                }
                                            }
                                            build = builder2.build();
                                            break;
                                    }
                                }
                                builder.post(build);
                                break;
                            case 1311789939:
                                if (c == 1) {
                                    m897d8 = atm.m897d("B1D6A1D997C0B1E2A1E997C2B1E5A1D997C3B1D6A1D197FCB1E6A1D397C0B1EDA1EF97C3B1DBA1ED97C7B1E6A1D597F8B1DEA1D097FAB1EDA1E997C0");
                                    break;
                                } else {
                                    m897d8 = atm.m897d("B1DFA1EA97CEB1DCA1DD97F4B1E2A1D797C4B1E2A1D397F4B1E6A1DE97FDB1ECA1ED97F8B1E3A1D197CEB1DCA1D797CEB1ECA1D1");
                                    break;
                                }
                            case 1863939328:
                                m897d8 = atm.m897d("B1ECA1DE97FDB1DEA1EE97C7B1E3A1D197CEB1DDA1EE97C1B1ECA1EC97FEB1E2A1D297C3B1E3A1EC97FDB1DFA1ED");
                                break;
                        }
                    }
                    break;
                case -1045496713:
                    if (c == 0) {
                        m897d5 = atm.m897d("B1D1A1D297CEB1DCA1E297C0B1D6A1D297FDB1E2A1ED97FDB1E3A1E997C7B1D1");
                        break;
                    } else {
                        m897d5 = atm.m897d("B1E2A1E997FDB1D2A1DD97C0B1E5A1DE97C0B1E2A1E297FFB1E2A1ED97FAB1EDA1EC97C0B1DAA1E997C0B1E3A1D097FEB1DEA1D397F0B1E2A1EC97FEB1E1");
                        break;
                    }
                case 922836092:
                    m897d5 = atm.m897d("B1DDA1ED97FAB1DCA1DE97CEB1E2A1E297F0B1D8A1DD97C0B1EDA1E297F0B1D6A1D497C3B1DFA1D097C0B1ECA1E997FFB1E2");
                    break;
            }
        }
        this.f1199g.url(this.f1193a);
        Object obj = this.f1194b;
        String m897d12 = atm.m897d("B1E1A1D797C0B1E3A1D797FAB1DFA1D397C4B1D6A1EA97FEB1D6A1D397CEB1E2A1EC97CEB1ECA1ED");
        while (true) {
            switch (m897d12.hashCode() ^ 1691548361) {
                case -1999785840:
                    break;
                case -1820583938:
                    this.f1199g.tag(obj);
                    break;
                case -984427067:
                    m897d12 = atm.m897d("B1E1A1EE97FAB1D8A1E397FDB1E2A1E397C4B1E6A1ED97F8B1DFA1E997C0B1D2A1D397CEB1E2A1EA97FDB1E2A1ED97FDB1D6A1DD97C0B1DBA1E997FDB1E2");
                    break;
                case -450207726:
                    if (obj == null) {
                        m897d12 = atm.m897d("B1ECA1D797C2B1E2A1EA97FCB1DFA1ED97C0B1E2A1D297F9B1E6A1ED97FFB1D6A1D797FCB1D1A1E297CFB1E3A1D3");
                        break;
                    } else {
                        m897d12 = atm.m897d("B1EDA1EF97FFB1DDA1D297FDB1E2A1EF97C0B1E2A1ED97C3B1DBA1ED97C0B1EDA1E297CEB1D1A1DE97FF");
                        break;
                    }
            }
        }
        Map<String, String> map3 = this.f1196d;
        String m897d13 = atm.m897d("B1D6A1EF97FEB1DAA1D197C4B1E2A1D797FAB1DFA1ED97C2B1E6A1D797CFB1EDA1E297C4B1E2A1ED97F8B1DFA1D4");
        while (true) {
            switch (m897d13.hashCode() ^ (-764242865)) {
                case -323935449:
                    Iterator<String> it3 = map3.keySet().iterator();
                    while (true) {
                        String m897d14 = atm.m897d("B1E2A1DE97F0B1DCA1D297C0B1DEA1EA97C4B1E2A1D097F9B1DCA1EA97C2B1DBA1EA97F3B1DCA1E297CFB1DCA1D997C7B1DEA1D597C0");
                        while (true) {
                            switch (m897d14.hashCode() ^ 1664402482) {
                                case -958140198:
                                    m897d14 = it3.hasNext() ? atm.m897d("B1E5A1D197C0B1E6A1EF97FCB1E6A1DE97C0B1E2A1D797FCB1ECA1D197F4B1DCA1ED97F0B1E1A1DD97C0B1DBA1EE97C2B1DCA1EE97FCB1DFA1D397FFB1E2") : atm.m897d("B1D1A1EE97FDB1E2A1EC97FFB1DAA1ED97FDB1DEA1D097CEB1DDA1ED97CEB1D6A1D297C2B1ECA1EE97C2B1D2A1D497F8B1DBA1D097FEB1DCA1ED");
                                case -453616675:
                                    break;
                                case 767778573:
                                    break;
                                case 1319593602:
                                    m897d14 = atm.m897d("B1ECA1D797F8B1D6A1D097F9B1E2A1D497FAB1E2A1D397C0B1EDA1EF97C4B1EDA1E997C0");
                            }
                        }
                        String next3 = it3.next();
                        this.f1199g.addHeader(next3, this.f1196d.get(next3));
                    }
                    break;
                case 1189786090:
                    m897d13 = atm.m897d("B1DFA1D597C4B1E2A1D297FAB1DEA1EF97F0B1E2A1ED97F8B1DCA1E997CEB1D8A1EF97CEB1EDA1D397F4B1E3A1D7");
                    break;
                case 1768452173:
                    if (map3 == null) {
                        m897d13 = atm.m897d("B1E5A1D397F0B1E2A1DD97F8B1DFA1ED97CFB1E0A1D097F8B1D6A1D397C0B1E3A1D997FCB1E3A1DD97C0B1DDA1D597C0B1E6A1D497C4B1EDA1E297C2");
                        break;
                    } else {
                        m897d13 = atm.m897d("B1D1A1EC97FDB1E2A1D997F3B1E1A1D097FEB1DCA1ED97FAB1DCA1D597C2B1E6A1EE97C3B1E1A1EF97F4B1DFA1E397C0B1DEA1E397F4B1D1A1D997CE");
                        break;
                    }
                case 1844193379:
                    break;
            }
        }
        this.f1198f = this.f1199g.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0627d(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC0626c abstractC0626c) {
        this(str, str2, null, map, map2, abstractC0626c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m188a(OkHttpClient okHttpClient) {
        Call newCall = okHttpClient.newCall(this.f1198f);
        try {
            Response execute = newCall.execute();
            AbstractC0626c abstractC0626c = this.f1197e;
            String m897d = atm.m897d("B1EDA1D997FEB1EDA1EF97FEB1E2A1D097FAB1E6A1D097C2B1ECA1EE97FAB1DBA1D397F4B1D2A1ED97FDB1E3A1E997CFB1DFA1E997C0B1DDA1DE97FE");
            while (true) {
                switch (m897d.hashCode() ^ 469797270) {
                    case -1741273426:
                        return;
                    case -1456941426:
                        if (abstractC0626c == null) {
                            m897d = atm.m897d("B1DDA1DE97F3B1D2A1DD97FDB1E2A1DD97FCB1EDA1ED97C7B1D2A1ED97F3B1E0A1DD97F0B1D6A1E997FFB1D1A1D497C0B1DEA1DD97FDB1D8A1DE");
                            break;
                        } else {
                            m897d = atm.m897d("B1DBA1DD97C4B1E2A1D397FCB1DEA1D797F8B1DCA1ED97F4B1DBA1ED97CEB1E1A1D397FCB1DCA1D9");
                            break;
                        }
                    case 543910039:
                        abstractC0626c.m190f(newCall, execute);
                        return;
                    case 795060687:
                        m897d = atm.m897d("B1E5A1D597F0B1E2A1D197F4B1E6A1ED97C4B1D8A1DE97FEB1E3A1E397F4B1DFA1E397C3B1ECA1D397FAB1E2A1DE97C7B1ECA1E397C0B1D2A1D797F0");
                        break;
                }
            }
        } catch (IOException e) {
            AbstractC0626c abstractC0626c2 = this.f1197e;
            String m897d2 = atm.m897d("B1DFA1D497C4B1D2A1E397FFB1E5A1EA97C0B1E2A1EE97CEB1D6A1DD97F8B1DCA1D797C3B1D1A1D397CEB1E3");
            while (true) {
                switch (m897d2.hashCode() ^ 1248404254) {
                    case -1865488030:
                        m897d2 = atm.m897d("B1DFA1D097C0B1E2A1EE97F3B1D8A1DD97C1B1D8A1D497C0B1E2A1ED97F0B1DDA1DD97F0B1E5");
                        break;
                    case -1289070189:
                        if (abstractC0626c2 == null) {
                            m897d2 = atm.m897d("B1E3A1E297FAB1D2A1DE97C2B1E5A1D997FAB1D6A1D797F0B1E2A1E997CEB1E2A1D597FCB1DBA1EA97F0B1E2");
                            break;
                        } else {
                            m897d2 = atm.m897d("B1DCA1D297CEB1D6A1D997FAB1E0A1D597C0B1E2A1E397CEB1E3A1ED97FDB1DCA1EE97CFB1E0A1E297C7B1D2A1D497FFB1ED");
                            break;
                        }
                    case 531949142:
                        return;
                    case 1927044212:
                        abstractC0626c2.mo193b(newCall, e);
                        return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m187b() {
        String m897d = atm.m897d("B1EDA1D297F0B1E2A1EC97C7B1DAA1E297FCB1DCA1ED97F3B1D2A1D597C0B1DCA1E997C0B1DAA1D097FDB1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 20) ^ 749349200) {
                case -423696216:
                    m897d = atm.m897d("B1E0A1EC97FDB1E1A1D297C4B1E2A1D397FCB1E6A1ED97FCB1EDA1E397C0B1E2A1D997FDB1E2A1D397FDB1E5");
                    break;
                case 428031992:
                    this.f1194b = null;
                    m897d = atm.m897d("B1E6A1EC97F9B1E5A1EF97FEB1DCA1E297FFB1ECA1D197FCB1DEA1D597FEB1D6A1D597FF");
                    break;
                case 2142530740:
                    return;
            }
        }
    }
}
