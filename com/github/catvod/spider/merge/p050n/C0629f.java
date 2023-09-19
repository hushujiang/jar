package com.github.catvod.spider.merge.p050n;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* renamed from: com.github.catvod.spider.merge.n.f */
/* loaded from: classes.dex */
public final class C0629f {

    /* renamed from: a */
    public static final String f1201a;

    /* renamed from: b */
    public static final String f1202b;

    /* renamed from: c */
    private static final Object f1203c;

    /* renamed from: d */
    private static OkHttpClient f1204d;

    /* renamed from: e */
    private static OkHttpClient f1205e;

    static {
        String m897d = atm.m897d("B1E2A1E997FAB1D1A1E997F9B1E2A1EF97F8B1D1A1D797F8B1E6A1DE97FEB1D1");
        while (true) {
            switch ((m897d.hashCode() ^ 329) ^ 1840897362) {
                case -1921998153:
                    return;
                case -1778412801:
                    f1202b = C0052e.m1418a(new byte[]{99, -30, 29, 24}, new byte[]{51, -83, 78, 76, -65, 66, -126, 89});
                    m897d = atm.m897d("B1D8A1DD97F3B1E1A1D797C0B1E2A1DD97C7B1E3A1ED97F0B1DEA1D797FDB1DBA1D097F8B1DAA1D497F4");
                    break;
                case -1288618074:
                    f1205e = null;
                    m897d = atm.m897d("B1EDA1EA97FEB1E2A1E997F9B1DAA1D397FFB1E0A1EC97FAB1D1A1EC97F3B1D6A1D297CEB1E3A1D997FDB1E5");
                    break;
                case -1029804374:
                    f1201a = C0052e.m1418a(new byte[]{69, -93, -91}, new byte[]{2, -26, -15, 122, -87, 4, -82, -125});
                    m897d = atm.m897d("B1E0A1E297FDB1E2A1E397C2B1E6A1ED97FCB1DAA1D397C0B1DFA1E997CEB1ECA1EC");
                    break;
                case -957002581:
                    f1203c = new Object();
                    m897d = atm.m897d("B1DAA1E297C0B1E3A1D097C4B1E2A1D197CEB1DFA1ED97FCB1E5A1D497FFB1ECA1D797F4B1DDA1D7");
                    break;
                case 1889811479:
                    f1204d = null;
                    m897d = atm.m897d("B1E0A1E297C4B1E2A1ED97F0B1D8A1E397F9B1E1A1D797FDB1D8A1D197C3B1DCA1ED97F8B1DFA1E297FFB1DBA1ED");
                    break;
            }
        }
    }

    /* renamed from: a */
    public static OkHttpClient m184a() {
        OkHttpClient okHttpClient;
        synchronized (f1203c) {
            String m897d = atm.m897d("B1E0A1EA97C2B1E3A1EE97F9B1E2A1E297CEB1E3A1E297FFB1DEA1D397C0B1ECA1EA97F8B1EDA1D197C0B1E3A1EF97F8B1E0");
            while (true) {
                switch (m897d.hashCode() ^ 554524397) {
                    case -1893222631:
                        break;
                    case -1275736284:
                        if (f1204d != null) {
                            m897d = atm.m897d("B1ECA1D597FDB1E2A1D597C4B1E0A1E397CEB1E2A1D197F0B1DAA1D997C4B1EDA1EA97F8B1ED");
                            break;
                        } else {
                            m897d = atm.m897d("B1E1A1E297C1B1DCA1EE97FFB1E5A1D997F3B1EDA1EE97FCB1D1A1D197CFB1D1A1ED97FFB1E2A1D197F3B1D2");
                            break;
                        }
                    case 464251968:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        OkHttpClient.Builder retryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                        X509TrustManager x509TrustManager = C0631h.f1208d;
                        f1204d = retryOnConnectionFailure.sslSocketFactory(new C0631h(x509TrustManager), x509TrustManager).build();
                        break;
                    case 1964991089:
                        m897d = atm.m897d("B1ECA1D397FEB1E2A1ED97C7B1D8A1EE97F0B1DBA1DD97CEB1E2A1D197CFB1ECA1ED97F8B1E5A1EA97C2B1D8A1EC97C1B1E0A1E997C3B1D2A1D5");
                        break;
                }
            }
            okHttpClient = f1204d;
        }
        return okHttpClient;
    }

    /* renamed from: b */
    public static void m183b(OkHttpClient okHttpClient, String str, Map map, AbstractC0626c abstractC0626c) {
        String m897d = atm.m897d("B1DDA1D497F4B1D8A1EC97FFB1E0A1E997FAB1DFA1D297FCB1E6A1EA97FDB1E2A1D097C3B1DF");
        while (true) {
            switch ((m897d.hashCode() ^ 86) ^ (-458001540)) {
                case -1936482886:
                    m897d = atm.m897d("B1DBA1D397FDB1E2A1E397F8B1E2A1ED97F4B1DBA1ED97F8B1D2A1EC97FAB1D1A1E397F4B1DCA1D297C0B1D8A1D397FDB1ECA1D297C7B1DBA1EA97CF");
                    break;
                case -1087383141:
                    return;
                case -952458765:
                    m897d = atm.m897d("B1D8A1EE97CFB1E6A1EE97C1B1D1A1ED97C0B1E1A1E297F9B1E2A1D797C3B1DBA1ED97C3B1DDA1D497C0B1E5A1E397F9B1E2A1EF97FDB1E2A1D797C0B1D2A1ED");
                    break;
                case -655518911:
                    m897d = atm.m897d("B1D2A1D597FEB1E2A1D997FFB1ECA1DD97F8B1D8A1EC97FAB1D1A1D997F0B1D8A1D997F4B1D2");
                    break;
                case -527872799:
                    new C0627d(f1201a, str, (Map<String, String>) null, map, abstractC0626c).m188a(okHttpClient);
                    m897d = atm.m897d("B1EDA1DE97F3B1DAA1D197C2B1E3A1D197C0B1E3A1E297C4B1E2A1D997C3B1DFA1ED97C0B1ECA1E997FDB1D8A1E297FDB1D8A1D497C0B1D6A1ED97CF");
                    break;
                case 2072486670:
                    m897d = atm.m897d("B1DCA1ED97C0B1E2A1D597F9B1DFA1D797FAB1DCA1ED97F4B1ECA1EE97C1B1D1A1D297C0B1E5A1E297C1B1EDA1D097C0B1DDA1D097FA");
                    break;
            }
        }
    }

    /* renamed from: c */
    public static String m182c(Map<String, List<String>> map) {
        String m897d = atm.m897d("B1E2A1E397F9B1E6A1D597F9B1E2A1DD97F3B1DCA1ED97FFB1DCA1EA97CFB1E2A1E397C0B1DEA1ED97C0B1E6A1D197FEB1E2");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            switch ((m897d.hashCode() ^ 613) ^ (-1034489251)) {
                case -2076043311:
                    return null;
                case -882080300:
                    m897d = atm.m897d("B1EDA1E397F0B1D1A1EF97FEB1D2A1D797FFB1E3A1EF97F4B1E5A1D997CF");
                    break;
                case -526172714:
                    m897d = atm.m897d("B1EDA1D197F8B1E5A1D997F9B1D2A1D797C0B1E2A1DE97FDB1DDA1D797F9B1E2");
                    break;
                case -265458304:
                    m897d = atm.m897d("B1E2A1D397CFB1DBA1D597CEB1E2A1EA97FEB1DFA1D597F8B1E2A1ED97C2B1EDA1E297FAB1E0A1ED97C4B1DEA1D797F4B1E2");
                    str2 = str3;
                    break;
                case 170321212:
                    m897d = atm.m897d("B1EDA1E397F0B1D1A1EF97FEB1D2A1D797FFB1E3A1EF97F4B1E5A1D997CF");
                    str2 = str;
                    break;
                case 767277407:
                    String m897d2 = atm.m897d("B1E6A1EA97C0B1DCA1D797FDB1DAA1D397C0B1ECA1D797C4B1E2A1EC97C3B1E5A1D397C7B1DD");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-1950389908)) {
                            case -1448562597:
                                m897d2 = map.containsKey(C0052e.m1418a(new byte[]{108, -96, 112, 45, 33, 76, 77, -16}, new byte[]{0, -49, 19, 76, 85, 37, 34, -98})) ? atm.m897d("B1DBA1D197F9B1E2A1EE97C7B1DDA1DE97C0B1E6A1EF97C2B1E5A1EC97FFB1EDA1E297FAB1DEA1D397CFB1E6A1ED97CFB1DAA1E397C0") : atm.m897d("B1D1A1D997CEB1E1A1EF97FFB1E1A1DD97C2B1E5A1D097FDB1DDA1DD97C2B1ECA1EE97CEB1E2");
                            case -652663955:
                                m897d2 = atm.m897d("B1DFA1DE97C2B1ECA1D497C7B1D8A1D997FCB1D1A1D197F0B1DBA1D397C2B1DEA1EC97FAB1E3A1D597C2B1DEA1ED97C0");
                            case 17641047:
                                m897d = atm.m897d("B1DAA1D997F9B1E2A1EF97F9B1D6A1E997FDB1DDA1ED97FCB1E2A1DD97C2B1E0A1EC97C0B1DFA1D397C0B1DCA1E997C0B1DBA1D497C4B1EDA1EC97FC");
                                continue;
                            case 1384719730:
                                m897d = atm.m897d("B1DBA1D197FAB1ECA1E997C3B1E6A1E397F8B1E6A1D397FAB1E2A1E297C7");
                                continue;
                        }
                    }
                    break;
                case 1189323920:
                    String m897d3 = atm.m897d("B1D1A1D397C0B1DAA1D797CEB1E2A1D397C0B1DAA1E397FDB1E2A1EF97C4B1DCA1ED97FFB1D8A1D997F0B1DBA1E997C0B1E0A1D497FDB1DFA1D297FEB1E2");
                    while (true) {
                        switch (m897d3.hashCode() ^ 1703403522) {
                            case -1720983348:
                                m897d3 = atm.m897d("B1DCA1EA97C3B1D8A1D297C4B1DDA1D797FAB1ECA1E397F9B1D6A1EF97C0B1DDA1E297CEB1E3A1D497F0B1E2A1D197F0B1DA");
                            case -1201899077:
                                m897d = atm.m897d("B1EDA1D997FCB1DEA1EC97FDB1E2A1D397FFB1E2A1ED97F9B1D2A1D397FEB1D8A1D0");
                                continue;
                            case 149729406:
                                m897d3 = map.containsKey(C0052e.m1418a(new byte[]{90, -56, -35, 122, 47, 26, 17, -115}, new byte[]{22, -89, -66, 27, 91, 115, 126, -29})) ? atm.m897d("B1ECA1EE97FAB1E1A1ED97FCB1E0A1EC97CEB1D6A1D197F3B1E3A1D097FFB1E2A1D797FEB1D2A1D397F9B1E2A1ED97F4B1D8A1E997C0") : atm.m897d("B1D6A1EF97FDB1DAA1EF97F0B1E1A1D597C7B1E5A1E297FAB1DEA1D397FA");
                            case 672449339:
                                m897d = atm.m897d("B1E6A1ED97C3B1D1A1D997CFB1E5A1E397CEB1DFA1D797FFB1DFA1DE97CEB1E2A1E297FEB1D8");
                                continue;
                        }
                    }
                    break;
                case 1363338438:
                    return map.get(str2).get(0);
                case 1464543930:
                    str = C0052e.m1418a(new byte[]{124, 15, -53, 16, 67, 107, 36, 71}, new byte[]{48, 96, -88, 113, 55, 2, 75, 41});
                    m897d = atm.m897d("B1ECA1EC97C7B1DBA1D197CFB1ECA1DD97C4B1E2A1DE97FAB1E6A1ED97CEB1E5A1DD97C0B1DBA1D597C1B1D6A1E997C4");
                    break;
                case 1630458240:
                    str3 = C0052e.m1418a(new byte[]{-22, -71, 108, -45, Byte.MAX_VALUE, 72, -96, -110}, new byte[]{-122, -42, 15, -78, 11, 33, -49, -4});
                    m897d = atm.m897d("B1EDA1DE97F9B1E2A1EF97F0B1D8A1D997CEB1E2A1D397C4B1DFA1ED97F3B1E0A1DD97F0B1D6A1D2");
                    break;
            }
        }
    }

    /* renamed from: d */
    public static void m181d(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0626c abstractC0626c) {
        String m897d = atm.m897d("B1EDA1DD97C3B1E3A1DE97CEB1DFA1E997C4B1E5A1D497FDB1E2A1D797C1B1DAA1D197C0B1E3A1D197FF");
        while (true) {
            switch ((m897d.hashCode() ^ 968) ^ (-1076663978)) {
                case -1537266847:
                    m897d = atm.m897d("B1DEA1D597F8B1E5A1D497C2B1DFA1EC97C3B1E1A1D597FAB1DFA1EA97C0B1E1A1EC97CEB1E0A1EA97C0B1DEA1D297F4B1DCA1E997F4");
                    break;
                case -620963824:
                    m897d = atm.m897d("B1D8A1EA97F3B1E3A1EA97C1B1D1A1DE97C3B1DEA1D597FDB1EDA1D097F9B1E6A1D1");
                    break;
                case 292073319:
                    return;
                case 800323403:
                    new C0627d(f1202b, str, map, map2, abstractC0626c).m188a(okHttpClient);
                    m897d = atm.m897d("B1DDA1D397F9B1E2A1DE97C2B1E6A1D497C0B1DCA1D497C1B1DCA1D797F9B1E2A1ED97FCB1D1A1D797F8B1ECA1ED97FCB1DFA1E997C0");
                    break;
                case 915240482:
                    m897d = atm.m897d("B1E1A1E297C1B1ECA1ED97FEB1E2A1D797F0B1DEA1DD97F0B1DDA1D797C1B1DFA1E397FCB1E6A1ED97FAB1DDA1D397C0B1D8A1D197C3B1DDA1DD97C4");
                    break;
                case 1104945334:
                    m897d = atm.m897d("B1DBA1D597FEB1E0A1D397FDB1E2A1D097F4B1DFA1ED97C7B1D8A1D297CEB1E6A1D397FFB1D6A1D097C0B1E5A1EF97F9B1E2A1D297F0B1E1A1E297FEB1E2");
                    break;
                case 1957325737:
                    m897d = atm.m897d("B1D1A1D597C1B1DBA1D597C3B1D6A1EA97C0B1DFA1D597FDB1D2A1D197F4B1E2A1E397F3B1DDA1EE");
                    break;
            }
        }
    }

    /* renamed from: e */
    public static String m180e(String str, String str2, Map<String, String> map) {
        C0625b c0625b = null;
        String m897d = atm.m897d("B1E3A1EA97F8B1D8A1D097C4B1E2A1ED97FCB1ECA1ED97F9B1E2A1D197FAB1D6A1D397C0");
        while (true) {
            switch ((m897d.hashCode() ^ 68) ^ (-235401430)) {
                case -1646764187:
                    new C0627d(f1202b, str, str2, map, c0625b).m188a(m184a());
                    m897d = atm.m897d("B1E0A1D997FFB1D8A1DD97F9B1D2A1EE97C4B1E2A1D097F0B1D8A1EA97CFB1D6A1D497C2B1D2A1ED");
                    break;
                case -1033730964:
                    m897d = atm.m897d("B1DFA1D597FEB1D8A1EC97C1B1D8A1EE97FDB1EDA1D397FFB1E2A1EA97F8B1DCA1EE97F9B1D8");
                    break;
                case -706389950:
                    m897d = atm.m897d("B1DBA1E997C2B1DEA1D297C1B1DFA1EC97F9B1E6A1D497FFB1E2A1EE97F0B1E6A1D097FCB1D6A1EA97C7B1E2A1DD97F4");
                    break;
                case -644867492:
                    m897d = atm.m897d("B1D1A1D097F9B1D6A1D597C0B1D2A1EF97C1B1DCA1D497F8B1EDA1EF97C3B1DEA1D397CF");
                    break;
                case -455992227:
                    return c0625b.m194a();
                case -173753962:
                    c0625b = new C0625b();
                    m897d = atm.m897d("B1E1A1EC97FDB1E2A1EA97C3B1E3A1D497F8B1D8A1ED97F8B1EDA1E997C3B1E2A1ED97FCB1D6A1D197C1B1D8A1D197C1B1DCA1EC97FAB1ED");
                    break;
            }
        }
    }

    /* renamed from: f */
    public static String m179f(String str, Map<String, String> map) {
        String m897d = atm.m897d("B1E1A1EE97F8B1DCA1EA97C1B1E3A1D497CEB1D8A1D997F0B1E2A1EA97CEB1DFA1ED97C0B1D1A1D497C0B1E0A1E397F9B1E2A1E397C0B1E2A1D097CEB1D8");
        while (true) {
            switch ((m897d.hashCode() ^ 683) ^ 841303558) {
                case -429777273:
                    m897d = atm.m897d("B1DBA1D397C4B1E2A1E397F9B1DCA1ED97FFB1EDA1D397C0B1DBA1D197F9B1DBA1D997FCB1EDA1D097C0B1E2A1DD97FEB1E2A1EA97FDB1D6A1D497FCB1DCA1ED");
                    break;
                case 271489431:
                    return m177h(m184a(), str, null, map, null, f1201a);
                case 881163687:
                    m897d = atm.m897d("B1D2A1D497FAB1DCA1D397FAB1DBA1E997C0B1DBA1E297FDB1DFA1E997C4");
                    break;
            }
        }
    }

    /* renamed from: g */
    public static String m178g(String str, Map<String, String> map, Map<String, List<String>> map2) {
        String m897d = atm.m897d("B1D2A1DE97CEB1E2A1EA97CFB1E5A1EF97F4B1E1A1EA97C3B1E0A1D397C3B1D6A1E997C0B1DCA1D497C4B1E2A1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 931) ^ 1719471816) {
                case -478761682:
                    m897d = atm.m897d("B1E1A1ED97FFB1DBA1EA97FAB1E1A1D797CEB1E2A1EA97FAB1D8A1DE97FFB1ECA1D597C4B1DFA1ED97FFB1EDA1D097C0B1DBA1EC97F9B1DAA1D597C0");
                    break;
                case 362421127:
                    m897d = atm.m897d("B1E5A1D397C0B1E1A1D197FAB1D8A1D197FEB1E2A1ED97FAB1DBA1ED97CEB1E0A1DD97C1B1E3A1DE97C4B1DAA1ED");
                    break;
                case 701759028:
                    m897d = atm.m897d("B1DBA1ED97F0B1E2A1D597C7B1DAA1E297FEB1E6A1EA97FEB1ECA1ED97F3B1D2A1ED97FFB1E5A1E997C0B1DAA1DD97FFB1E2");
                    break;
                case 1493879131:
                    return m177h(m184a(), str, null, map, map2, f1201a);
            }
        }
    }

    /* renamed from: h */
    public static String m177h(OkHttpClient okHttpClient, String str, Map map, Map map2, Map map3, String str2) {
        String m897d = atm.m897d("B1E3A1ED97FFB1E2A1D297FDB1D1A1D597FDB1E1A1D397F8B1ECA1ED97C1B1E6A1D497FDB1D8A1ED97C0B1DCA1DE97C2B1ECA1D797F8");
        C0627d c0627d = null;
        C0628e c0628e = null;
        while (true) {
            switch ((m897d.hashCode() ^ 624) ^ 1887779558) {
                case -1252850172:
                    c0627d.m187b();
                    m897d = atm.m897d("B1D8A1D997CFB1E1A1ED97FAB1DBA1DD97FFB1E2A1D597C3B1D8A1D497FFB1DCA1E997CEB1E6A1DD97CFB1DFA1E397F0B1EDA1ED97C0");
                    break;
                case -1099660022:
                    C0627d c0627d2 = new C0627d(str2, str, map, map2, c0628e);
                    m897d = atm.m897d("B1ECA1ED97C4B1DEA1EF97F8B1DFA1D297F3B1DEA1D597C4B1E0A1E997C3B1E0A1EF97FEB1E1A1EA97C3B1DEA1ED97F0B1D6A1D497C0");
                    c0627d = c0627d2;
                    break;
                case -928097209:
                    c0628e = new C0628e(map3);
                    m897d = atm.m897d("B1E2A1D997FEB1E2A1D497CFB1DCA1DD97C7B1DAA1DE97FDB1DBA1ED97C3B1DBA1D097C0B1D1A1EF97C2B1E6A1EF97FEB1E5A1E397C1");
                    break;
                case -458241711:
                    m897d = atm.m897d("B1EDA1D497FDB1E1A1E297F3B1D8A1EF97FDB1E2A1D297FDB1E2A1D497FEB1D1A1DE97F3");
                    break;
                case 599810520:
                    m897d = atm.m897d("B1E5A1D497FCB1E5A1D997C1B1DCA1D797F3B1EDA1E997C2B1E5A1E397C0");
                    break;
                case 681554547:
                    m897d = atm.m897d("B1E2A1D397C1B1EDA1EE97FFB1E5A1D797C3B1E0A1E397F9B1E2A1DE97FEB1DAA1DD97C2B1E3A1D397C2B1DAA1D097FFB1D2A1ED");
                    break;
                case 735818525:
                    m897d = atm.m897d("B1E3A1EE97FDB1E2A1E297C4B1E3A1D497C3B1E2A1ED97C7B1E6A1E997F0B1D1A1D497C0B1E0A1D297FEB1DBA1D997F9B1E0A1DE97C4");
                    break;
                case 1344621887:
                    m897d = atm.m897d("B1E6A1D797C3B1D2A1D297C0B1DDA1E997C0B1D6A1EA97FAB1D8A1D097CFB1E2A1DD97C2B1E1A1EA97C3B1DDA1E997FEB1D8A1EE");
                    break;
                case 1556823832:
                    return c0628e.m194a();
                case 1778282302:
                    c0627d.m188a(okHttpClient);
                    m897d = atm.m897d("B1DAA1E297C4B1DAA1D597C7B1D6A1DD97FFB1ECA1D397C4B1DDA1E997C7B1DFA1DD97F9B1E2A1EC97CFB1ECA1DE97CEB1DCA1EE97C2B1E3");
                    break;
                case 1865966255:
                    m897d = atm.m897d("B1D1A1D197F0B1E2A1ED97C7B1DEA1D297F4B1DDA1D197FAB1D2A1EF97FAB1D1");
                    break;
            }
        }
    }

    /* renamed from: i */
    public static String m176i(String str, Map<String, String> map, Map<String, List<String>> map2) {
        OkHttpClient okHttpClient;
        synchronized (f1203c) {
            String m897d = atm.m897d("B1E0A1D397F9B1E6A1D097C0B1E2A1D197C1B1DCA1D797C3B1DAA1E997F3B1E0A1D097C1B1D1A1E297F9B1DBA1D997C7B1ECA1ED97FDB1DFA1D1");
            while (true) {
                switch (m897d.hashCode() ^ (-2102564056)) {
                    case -2072164251:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        OkHttpClient.Builder retryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                        X509TrustManager x509TrustManager = C0631h.f1208d;
                        f1205e = retryOnConnectionFailure.sslSocketFactory(new C0631h(x509TrustManager), x509TrustManager).build();
                        break;
                    case -1657712912:
                        if (f1205e != null) {
                            m897d = atm.m897d("B1E0A1E397C1B1DAA1D797FEB1E2A1D297F9B1DAA1D097CFB1DDA1ED97FDB1ECA1ED97F9B1EDA1D297F9B1D6A1E997C0B1DBA1EF97C4B1E2A1EE97FAB1E2");
                            break;
                        } else {
                            m897d = atm.m897d("B1DBA1DE97C2B1DEA1DD97FFB1ECA1D097FFB1DBA1D097FDB1E6A1DE97C7B1D2A1E997F0B1E3A1D397C3");
                            break;
                        }
                    case -794686213:
                        break;
                    case 225606438:
                        m897d = atm.m897d("B1E6A1EF97F8B1ECA1EA97FAB1DAA1D197F0B1E2A1D297C1B1ECA1ED97CEB1D6A1E997FFB1DCA1E297F4B1DCA1D997C0B1D8A1D097FCB1ED");
                        break;
                }
            }
            okHttpClient = f1205e;
        }
        return m177h(okHttpClient, str, null, map, map2, f1201a);
    }
}
