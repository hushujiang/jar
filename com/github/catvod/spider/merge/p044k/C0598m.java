package com.github.catvod.spider.merge.p044k;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p027b0.C0321F;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.github.catvod.spider.merge.p048m.C0617a;
import com.github.catvod.spider.merge.p048m.C0619c;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.m */
/* loaded from: classes.dex */
public final class C0598m extends Dora {

    /* renamed from: i */
    private static final String f1107i;

    /* renamed from: b */
    protected JSONObject f1108b;

    /* renamed from: c */
    protected JSONObject f1109c;

    /* renamed from: d */
    private String f1110d = "";

    /* renamed from: e */
    protected Pattern f1111e = Pattern.compile(C0052e.m1418a(new byte[]{95, -31, -72, 120, -34, 84, 19, -89, 95, -65, -117, 120, -127, 4, 77, -86, 4, -6, -69}, new byte[]{112, -105, -41, 28, -86, 45, 99, -62}));

    /* renamed from: f */
    protected Pattern f1112f = Pattern.compile(C0052e.m1418a(new byte[]{-62, 75, -52, -33, 108, 54, -52, 51, -124, 81, -116, -109, 84, 55, -109, 123, -61, 85, -41, -42, 100}, new byte[]{-19, 61, -93, -69, 8, 83, -72, 82}));

    /* renamed from: g */
    protected Pattern f1113g = Pattern.compile(C0052e.m1418a(new byte[]{-127, 121, 0, 55, 121, 20, Byte.MIN_VALUE, 47, -127, 39, 51, 0, 34, 81, -49, 62, -38, 98, 3}, new byte[]{-82, 15, 111, 83, 9, 120, -31, 86}));

    /* renamed from: h */
    private final Object f1114h;

    static {
        String m897d = atm.m897d("B1D1A1D997CEB1E2A1D297C4B1E6A1ED97C7B1D8A1D497C2B1D6A1E997C0B1D8A1D497C0B1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 83) ^ 1082385894) {
                case 1526983277:
                    return;
                case 1711700866:
                    f1107i = C0052e.m1418a(new byte[]{-9, 120, 75, 18, 56, -43, -69, -101, -24, 123, 72, 76, 126, -38, -95, -48, -10, 109, 81, 27, 34, -127, -13, -102, -4, 111}, new byte[]{-97, 12, 63, 98, 75, -17, -108, -76});
                    m897d = atm.m897d("B1DBA1D097FDB1E2A1E297C3B1D2A1EE97FEB1DCA1ED97C0B1D8A1D497FAB1E0A1D497C0B1DBA1D997F9B1DEA1E997C1B1D8A1E297C4B1E2");
                    break;
            }
        }
    }

    public C0598m() {
        Pattern.compile(C0052e.m1418a(new byte[]{-124, 121, 73, 120, -111, 108, 46, 52, -15}, new byte[]{-40, 29, 98, 87, -71, 48, 74, 31}));
        this.f1114h = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m278a(C0598m c0598m) {
        String m897d = atm.m897d("B1EDA1E997C0B1E2A1D797C3B1E6A1E397F9B1D2A1ED97F4B1DCA1ED97C0B1E0A1E397C2B1DAA1D597C0");
        while (true) {
            switch ((m897d.hashCode() ^ 893) ^ (-670374457)) {
                case -2061083241:
                    m897d = atm.m897d("B1E5A1D397F9B1DFA1D497C7B1E0A1EF97F9B1E6A1D797F4B1D6A1D597F9B1DBA1DE");
                    break;
                case 863777139:
                    return c0598m.f1114h;
            }
        }
    }

    /* renamed from: b */
    public final JSONObject m277b(String str, String str2) {
        int i;
        int length;
        String m606a;
        JSONObject jSONObject = new JSONObject();
        try {
            C0288h m846d = C0321F.m846d(str);
            C0459g m967p0 = m846d.m967p0(C0052e.m1418a(new byte[]{16, -74, -56, -42, 29, -88, -10, 5, 4, -66, -39, -24, 83, -111, -21, 28, 84, -66, -124, -31, 21, -65, -65, 15, 23, -73, -41, -31, 16}, new byte[]{116, -33, -66, -115, 116, -52, -53, 34}));
            String m897d = atm.m897d("B1D6A1EA97F0B1D1A1EE97FEB1E2A1DD97FFB1D2A1ED97F0B1E6A1D397C0B1D6A1EE97FDB1E2A1D197CEB1E6A1ED97C1B1DCA1EE97C7B1DFA1D2");
            while (true) {
                switch (m897d.hashCode() ^ 946338174) {
                    case -660449679:
                        if (m967p0.size() <= 0) {
                            m897d = atm.m897d("B1EDA1D597FFB1DDA1D297FAB1E1A1DE97F3B1D1A1D397C3B1DFA1E297FDB1E2");
                            break;
                        } else {
                            m897d = atm.m897d("B1D8A1D397F8B1E2A1EC97C3B1DDA1E997F0B1DDA1EF97F8B1D1A1DE97F8B1DBA1EE97FEB1E3A1E3");
                            break;
                        }
                    case -535407329:
                        m897d = atm.m897d("B1DFA1EC97C7B1E5A1D597C4B1EDA1E297C1B1E1A1EF97F0B1E2A1DD97FCB1DCA1D297C4B1E2A1ED97FFB1DFA1DD97C0B1DBA1E397F8");
                        break;
                    case 611827560:
                        String str3 = m967p0.m606a(C0052e.m1418a(new byte[]{-124, -56, -12, -38}, new byte[]{-20, -70, -111, -68, -77, -12, -81, 86})).substring(9, m606a.length() - 5).split(C0052e.m1418a(new byte[]{-109}, new byte[]{-66, 67, -24, 106, 18, -33, -71, -14}))[8];
                        String m897d2 = atm.m897d("B1EDA1E297C4B1E2A1E397C3B1DCA1ED97C2B1DEA1DD97FCB1DCA1ED97F0B1EDA1ED97C0B1ECA1D397C4B1E0A1EC97FFB1DBA1E397F3B1D8A1E397FE");
                        while (true) {
                            switch (m897d2.hashCode() ^ 136764587) {
                                case -148260815:
                                    i = Integer.parseInt(str3);
                                    break;
                                case 567782745:
                                    if (!TextUtils.isEmpty(str3)) {
                                        m897d2 = atm.m897d("B1DFA1ED97F0B1E2A1D297F0B1DAA1D097FEB1E6A1D597C7B1DFA1EF97C3B1D2A1DD97F3B1ECA1D597F4B1E2A1EC97FDB1EDA1ED97FE");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1DFA1ED97F0B1E2A1D397C7B1E2A1D797FDB1DBA1ED97F9B1D8A1D397C0B1DFA1EA97C4B1E2A1D997C7B1E3");
                                        break;
                                    }
                                case 608348460:
                                    break;
                                case 1105984811:
                                    m897d2 = atm.m897d("B1E3A1EF97C4B1E2A1EA97FAB1DBA1ED97FAB1E2A1D297C0B1EDA1EE97C4");
                                    break;
                            }
                        }
                        break;
                    case 941589424:
                        break;
                }
            }
            i = 1;
            JSONArray jSONArray = new JSONArray();
            C0459g m967p02 = m846d.m967p0(C0052e.m1418a(new byte[]{-33, -35, -123, -111, -68, -100, 11, 88, -41, -47, -34, -42, -91, -106, 2, 94, -101, -118, -45, -34, -118, -101, 29, 72, -35, -98, -50, -104, -89, -100, 11, 73, -34, -64, -110, -42, -67, -44, 50}, new byte[]{-69, -76, -13, -65, -47, -13, 111, 45}));
            int i2 = 0;
            while (true) {
                String m897d3 = atm.m897d("B1D8A1D797FEB1E2A1D097FAB1ECA1D997C2B1E3A1D597FEB1ECA1ED97C7B1EDA1DD97C0B1E1A1E997CEB1ED");
                while (true) {
                    switch (m897d3.hashCode() ^ (-509596069)) {
                        case -85869908:
                            C0293m c0293m = m967p02.get(i2);
                            String mo925d = c0293m.mo925d(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, 38, 69, 101, -104}, new byte[]{11, 79, 49, 9, -3, 29, -102, -121}));
                            String mo925d2 = c0293m.m966q0(C0052e.m1418a(new byte[]{10, 71, 56}, new byte[]{99, 42, 95, 113, -100, -8, 110, -45})).mo925d(C0052e.m1418a(new byte[]{31, 25, -54, -33, -24, 3, 116, 116, 28, 17, -48, -33, -87}, new byte[]{123, 120, -66, -66, -59, 108, 6, 29}));
                            String m960w0 = c0293m.m966q0(C0052e.m1418a(new byte[]{106, 120, 59, 7, -54, 99, 66, -92, 98, 116, 96, 64, -45, 105, 75, -4, 96, 126, 57, 76}, new byte[]{14, 17, 77, 41, -89, 12, 38, -47})).m960w0();
                            try {
                                Matcher matcher = this.f1112f.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{101, 18, 1, -108}, new byte[]{13, 96, 100, -14, 27, 16, 65, -1})));
                                String m897d4 = atm.m897d("B1ECA1D597C3B1EDA1DE97FEB1E0A1EE97FCB1E1A1EC97C0B1E2A1EC97F0B1D6A1EA97FFB1E2A1ED97CEB1DDA1DD97C0");
                                while (true) {
                                    switch (m897d4.hashCode() ^ 1015582964) {
                                        case -1713476712:
                                            break;
                                        case -544116085:
                                            m897d4 = atm.m897d("B1E6A1D097F9B1E2A1EA97FDB1D2A1ED97CEB1DAA1D997FAB1DAA1D097C0B1D6A1D797F3B1DCA1E997FEB1DAA1EA97C2");
                                        case 875871858:
                                            m897d4 = matcher.find() ? atm.m897d("B1D1A1D797FFB1E6A1E297CEB1E2A1D497C1B1DFA1DD97FCB1DEA1D397C7B1DDA1D297FEB1DE") : atm.m897d("B1DDA1E397F8B1EDA1EE97C7B1DCA1EE97FCB1DDA1DE97F9B1E2A1E997F3B1DDA1D497C7B1DFA1D097C2B1E2A1ED97C1B1DEA1DE97C4B1E1A1D2");
                                        case 1873688663:
                                            String group = matcher.group(1);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(C0052e.m1418a(new byte[]{17, 61, -118, -88, 4, -90}, new byte[]{103, 82, -18, -9, 109, -62, 41, 19}), group);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{34, 62, 28, 49, -84, -29, 97, -71}, new byte[]{84, 81, 120, 110, -62, -126, 12, -36}), mo925d);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-62, 27, 21, -75, -28, 11, 18}, new byte[]{-76, 116, 113, -22, -108, 98, 113, 44}), mo925d2);
                                            jSONObject2.put(C0052e.m1418a(new byte[]{-123, 75, -123, 125, -11, -74, -103, -102, -127, 79, -110}, new byte[]{-13, 36, -31, 34, -121, -45, -12, -5}), m960w0);
                                            jSONArray.put(jSONObject2);
                                            break;
                                    }
                                }
                                i2++;
                            } catch (Exception e) {
                                return jSONObject;
                            }
                            break;
                        case 1147970302:
                            m897d3 = atm.m897d("B1E3A1D997C0B1E0A1D097F3B1D6A1D497FEB1E2A1D397C1B1E3A1DE97F9B1E5A1D397F0B1E5A1E997C3");
                        case 1173238861:
                            m897d3 = i2 < m967p02.size() ? atm.m897d("B1DBA1E397F0B1E2A1DD97FEB1EDA1DE97FCB1E3A1EE97F9B1DCA1E297CFB1E1A1D9") : atm.m897d("B1E0A1D997CFB1E6A1E297C1B1E2A1EF97CEB1E2A1D997C0B1DCA1ED97F9B1D2A1D997FFB1DEA1ED");
                        case 1785568650:
                            jSONObject.put(C0052e.m1418a(new byte[]{-9, 13, 56, 4}, new byte[]{-121, 108, 95, 97, -70, 14, 17, 37}), str2);
                            jSONObject.put(C0052e.m1418a(new byte[]{125, -102, 10, 56, Byte.MAX_VALUE, -61, -11, -46, 121}, new byte[]{13, -5, 109, 93, 28, -84, Byte.MIN_VALUE, -68}), i);
                            jSONObject.put(C0052e.m1418a(new byte[]{96, -60, 37, -24, -90}, new byte[]{12, -83, 72, -127, -46, -94, 54, 47}), 40);
                            String m1418a = C0052e.m1418a(new byte[]{109, -90, -114, -121, 65}, new byte[]{25, -55, -6, -26, 45, 46, 19, 59});
                            String m897d5 = atm.m897d("B1E0A1EE97C4B1E2A1ED97F4B1D8A1E997F9B1DFA1D497CFB1E6A1ED97F4B1EDA1D097C0");
                            while (true) {
                                switch (m897d5.hashCode() ^ 1495324949) {
                                    case -1963186069:
                                        length = i * 40;
                                        break;
                                    case -1610491031:
                                        m897d5 = atm.m897d("B1D2A1D597C2B1E2A1D197F9B1D8A1EE97C4B1E2A1DE97FEB1D2A1ED97C3B1DEA1D397C0B1D2A1D9");
                                        break;
                                    case -466541689:
                                        length = jSONArray.length();
                                        break;
                                    case 1971085802:
                                        if (i > 1) {
                                            m897d5 = atm.m897d("B1DFA1D197CEB1EDA1D397F8B1D2A1DD97C2B1D6A1D397C4B1E2A1EC97CFB1E2A1EC97C4B1D2A1ED97C1B1E2A1DE97FDB1E3A1DD97C0B1DCA1DE");
                                            break;
                                        } else {
                                            m897d5 = atm.m897d("B1D8A1E297FCB1E5A1DD97C2B1E2A1E997F3B1D8A1E997FAB1D6A1D497C0B1E3A1E397C3B1DDA1EC97FEB1E2A1EF97F9B1E2A1D297C0B1E6A1ED");
                                            break;
                                        }
                                }
                            }
                            jSONObject.put(m1418a, length);
                            jSONObject.put(C0052e.m1418a(new byte[]{19, 116, 103, 72}, new byte[]{Byte.MAX_VALUE, 29, 20, 60, 55, -58, 12, -101}), jSONArray);
                            return jSONObject;
                    }
                }
            }
        } catch (Exception e2) {
        }
    }

    @TargetApi(21)
    /* renamed from: c */
    public final String m276c(String str) {
        String m897d = atm.m897d("B1E3A1D297F4B1E3A1E997F9B1E2A1E297CFB1D2A1DE97FFB1D8A1E997C2B1D2A1ED97F0B1EDA1DE97F9B1E6A1E397F4B1DCA1D597FAB1DBA1EF");
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        CookieManager cookieManager = null;
        while (true) {
            switch ((m897d.hashCode() ^ 953) ^ 708312673) {
                case -2040714754:
                    m897d = atm.m897d("B1DEA1DD97FEB1E2A1EA97FAB1DCA1ED97C1B1E3A1D997CEB1E1A1E397C0B1E0A1EF97C0");
                    continue;
                case -1976266599:
                    m897d = atm.m897d("B1D8A1D797F0B1E2A1DE97C0B1DEA1DD97FCB1DDA1D097F8B1E6A1ED97C7B1D1A1D597FFB1DDA1E997C0B1DBA1EC97F0B1E0A1D997C0B1E2A1D9");
                    continue;
                case -1798748872:
                    str4 = C0574b.m307f(str, m275d(str), null);
                    m897d = atm.m897d("B1E0A1DD97F9B1D2A1D997C2B1D6A1EC97F9B1E2A1D997C2B1E6A1ED97F3B1D6A1E397FAB1D6A1DE97C4B1DFA1D297C0B1D6A1DD97F9");
                    continue;
                case -1680839609:
                    String m897d2 = atm.m897d("B1DDA1EF97C1B1DBA1D197F0B1E2A1EC97FDB1D6A1D397C4B1DAA1DE97FEB1DBA1ED97F3B1E2A1D397C0B1E5A1D997F9B1DBA1E297FE");
                    while (true) {
                        switch (m897d2.hashCode() ^ 924266005) {
                            case -1026924667:
                                m897d2 = i2 < 60 ? atm.m897d("B1D2A1DE97FDB1EDA1DD97F9B1E2A1D597F3B1E2A1ED97FEB1D6A1D097C0B1DBA1D197CEB1E2A1E397F0B1E2A1ED97F8B1E6A1E997C1B1E0A1EF") : atm.m897d("B1EDA1E997C4B1E2A1ED97C7B1E6A1E297C3B1E2A1ED97FEB1D1A1D197F8B1D6A1DD97FFB1E6A1D297F8B1E6A1D997C1B1E3A1D997FAB1DEA1EC");
                            case 600138251:
                                m897d = atm.m897d("B1D1A1E297FAB1E5A1ED97FAB1E0A1D997F9B1DFA1ED97C4B1E6A1D097C0B1E2");
                                continue;
                            case 1038635453:
                                m897d = atm.m897d("B1DEA1EE97FCB1EDA1EC97F9B1E6A1D297F8B1DAA1D197C4B1E2A1D497F9B1DE");
                                continue;
                                continue;
                            case 1832897355:
                                m897d2 = atm.m897d("B1DFA1D397C0B1DDA1D197C3B1DBA1EF97C0B1E2A1ED97C2B1E1A1EF97C2B1E2A1ED97F8B1DAA1D4");
                        }
                    }
                    break;
                case -1582428426:
                    str5 = cookieManager.getCookie(str);
                    m897d = atm.m897d("B1E3A1D297FEB1E2A1DD97FEB1D2A1EF97FAB1D1A1ED97C2B1DDA1DD97C2B1E2A1DD97C0B1D8A1D397C0");
                    continue;
                case -1575545290:
                    cookieManager = CookieManager.getInstance();
                    m897d = atm.m897d("B1D1A1D297C1B1EDA1DE97FAB1DEA1DE97C4B1DEA1E997FEB1DDA1ED97F4");
                    continue;
                case -1290237362:
                    m897d = atm.m897d("B1DEA1DD97FEB1E2A1EA97FAB1DCA1ED97C1B1E3A1D997CEB1E1A1E397C0B1E0A1EF97C0");
                    str3 = str2;
                    continue;
                case -827129209:
                    this.f1110d = str5;
                    m897d = atm.m897d("B1E6A1E997C4B1EDA1D797C4B1E2A1DE97F4B1DFA1ED97FDB1E1A1D197C1B1D8A1ED97C0");
                    continue;
                case -618721339:
                    m897d = atm.m897d("B1D8A1D797F0B1E2A1DE97C0B1DEA1DD97FCB1DDA1D097F8B1E6A1ED97C7B1D1A1D597FFB1DDA1E997C0B1DBA1EC97F0B1E0A1D997C0B1E2A1D9");
                    i2 = 0;
                    continue;
                case -535120956:
                    m897d = atm.m897d("B1DDA1D797CEB1DBA1D497C4B1E2A1D597F8B1D8A1EE97C4B1E6A1ED97F0B1E2A1D297CEB1DEA1D197CFB1E5A1ED97F0B1E0A1D497F8B1DCA1E397C0");
                    continue;
                case -379682148:
                    cookieManager.removeSessionCookies(null);
                    m897d = atm.m897d("B1E6A1ED97CEB1DAA1D097F8B1E0A1D097F9B1DBA1EE97C4B1E2A1ED97CFB1DBA1D397C0");
                    continue;
                case -118531951:
                    C0652d.m141j(str, new C0596k());
                    m897d = atm.m897d("B1D6A1EF97CEB1E2A1D497C3B1DDA1D097C0B1DBA1D997CFB1ECA1DD97F9B1E2A1EC97F3B1DEA1E297F4B1DAA1D597CFB1E6A1ED97C2B1ECA1D4");
                    continue;
                case 27264301:
                    m897d = atm.m897d("B1E3A1D997F3B1E1A1D497C0B1EDA1E297C4B1DFA1EF97FEB1D1A1E297FAB1DCA1EF97F3B1E2A1EE97F4B1DCA1D097C1B1DAA1D597C0B1E2");
                    i2 = i;
                    continue;
                case 50162297:
                    String m897d3 = atm.m897d("B1E2A1D297F9B1DFA1D297C0B1E2A1D397C7B1E6A1ED97F8B1DEA1E397C0B1DEA1E3");
                    while (true) {
                        switch (m897d3.hashCode() ^ 155476289) {
                            case -1381253332:
                                m897d = atm.m897d("B1E2A1E297FAB1D8A1E397C2B1D2A1EE97FEB1D8A1EF97F3B1EDA1EF97F0B1E6A1D097F0B1E2A1EC97CEB1E6A1ED97FCB1E5A1E297C0B1D2A1E2");
                                continue;
                            case -40956800:
                                m897d3 = str5.contains(C0052e.m1418a(new byte[]{-95, 55, 66, -79, -58, 83, 73, 58}, new byte[]{-23, 90, 29, -35, -74, 37, 61, 101})) ? atm.m897d("B1DDA1D097C0B1DDA1D797C2B1EDA1EC97C2B1ECA1EC97C7B1EDA1D797C0B1E2A1DE97C7B1DEA1EC97C4B1DDA1ED97F0B1E6A1E997FAB1D8A1D3") : atm.m897d("B1E1A1DD97F8B1DEA1D297FAB1ECA1D297F3B1E6A1EA97F9B1D1A1ED97F8B1E5A1D597C2B1D1A1ED97FDB1DEA1D297CF");
                            case 973372719:
                                m897d3 = atm.m897d("B1D1A1EC97F9B1DBA1E397C4B1E2A1ED97C4B1E2A1DD97CFB1ECA1DD97F0B1DDA1ED97CFB1D1A1E997C0B1D6A1D097CEB1ECA1D797C4B1E2");
                            case 1085987667:
                                break;
                        }
                    }
                    break;
                case 324474998:
                    m897d = atm.m897d("B1E1A1D997F3B1D2A1EF97C2B1E1A1D097FFB1DDA1EF97FEB1DEA1EE97C2B1E0A1EE97C1B1DCA1E997FDB1DDA1D497CE");
                    str3 = str4;
                    continue;
                case 326517641:
                    cookieManager.flush();
                    m897d = atm.m897d("B1ECA1D097C4B1DDA1DE97C0B1D1A1ED97C4B1D6A1D197C4B1D2A1D797FDB1E2A1E997F3B1E1A1E397C0B1EDA1D797FFB1DC");
                    continue;
                case 433868192:
                    m897d = atm.m897d("B1ECA1D597C1B1D2A1E997FAB1E3A1D297F0B1E2A1D497F8B1ECA1EF97FEB1ECA1ED97C1B1DBA1D9");
                    continue;
                case 574683801:
                    SystemClock.sleep(500L);
                    m897d = atm.m897d("B1DBA1D597C2B1E1A1EE97CEB1E2A1EC97CFB1ECA1ED97F8B1E1A1D097C0B1E5A1EC97F0B1E2A1EA97F3B1ECA1ED97FEB1E2A1D197C4B1EDA1ED");
                    continue;
                case 659103959:
                    cookieManager.removeAllCookies(null);
                    m897d = atm.m897d("B1E6A1E997FDB1DFA1EE97C0B1D6A1E297FFB1DEA1D097FDB1E2A1EC97C1B1ED");
                    continue;
                case 909206683:
                    i = i2 + 1;
                    m897d = atm.m897d("B1D2A1D597FAB1EDA1E997FAB1EDA1EA97CFB1E6A1EE97FEB1DCA1D097C7");
                    continue;
                case 969119272:
                    return str3;
                case 1215729294:
                    str2 = "";
                    m897d = atm.m897d("B1DEA1D497F9B1E1A1ED97C4B1E3A1D297F9B1E2A1DD97F4B1D8A1EE97FAB1EDA1EC97C0B1DCA1ED97F9B1D2A1D5");
                    continue;
                case 1694442482:
                    String m897d4 = atm.m897d("B1D6A1D797CEB1E2A1D597F4B1ECA1ED97F3B1EDA1D097F9B1E0A1D197C3B1DFA1ED97C3B1DEA1EF");
                    while (true) {
                        switch (m897d4.hashCode() ^ 2142090207) {
                            case -1888228613:
                                m897d4 = atm.m897d("B1D1A1EA97FAB1ECA1ED97C0B1E2A1D097FAB1E3A1D597C1B1DBA1EC97F3B1DCA1ED97FDB1D1A1EF97FDB1E2A1D397C0");
                            case -1686579580:
                                m897d4 = str5 != null ? atm.m897d("B1E1A1EA97FEB1E2A1D797FFB1EDA1D497F9B1EDA1EA97CFB1D6A1E997FAB1EDA1D397F8B1D8A1D597FDB1DDA1EF97C0B1DCA1DE97FEB1DFA1ED") : atm.m897d("B1DFA1D297F9B1E2A1EF97F9B1E2A1D097FAB1DAA1DD97FCB1D8A1E397FDB1D8A1DD97CFB1E6A1ED");
                            case -1007532196:
                                break;
                            case 437613766:
                                m897d = atm.m897d("B1DBA1D197C7B1DDA1D297C1B1DDA1E997F4B1DBA1EC97CFB1DAA1D497FF");
                                continue;
                        }
                    }
                    break;
                case 1861940396:
                    m897d = atm.m897d("B1E0A1D497C3B1E2A1ED97C1B1D2A1DD97FFB1E2A1EF97CFB1DCA1ED97FAB1E6A1D197FFB1D2A1D497C0");
                    continue;
            }
            m897d = atm.m897d("B1D6A1D397C2B1D1A1EC97C3B1D1A1E997FFB1DFA1D797C1B1D6A1EE97C4B1DAA1EC97F0B1DCA1D397C0");
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i = 1;
        try {
            String m897d = atm.m897d("B1DAA1E397C4B1E2A1E397C7B1E3A1D597C1B1E6A1D197CFB1EDA1EF97C4B1E1A1E997FEB1DEA1D297C4B1E2");
            while (true) {
                switch (m897d.hashCode() ^ 1251328043) {
                    case -1788885432:
                        if (!TextUtils.isEmpty(str2)) {
                            m897d = atm.m897d("B1EDA1D397C0B1E1A1EC97CEB1E2A1E297F0B1EDA1E297CEB1E6A1D797CFB1DBA1EC97FDB1D8A1E397F9B1DDA1D997C1B1DCA1ED97FCB1D2A1D297C0");
                            break;
                        } else {
                            m897d = atm.m897d("B1E0A1EE97F0B1D1A1DD97F3B1D8A1D497FEB1E2A1DD97FAB1E5A1E397C4B1E1A1DD97F8B1DBA1ED");
                            break;
                        }
                    case -1128877336:
                        String m897d2 = atm.m897d("B1D2A1D097F8B1D2A1EA97F4B1E1A1E397C4B1E2A1EF97CFB1DDA1D597F4B1D8A1EC97C0B1D1");
                        while (true) {
                            switch (m897d2.hashCode() ^ 1874716976) {
                                case -1879562585:
                                    break;
                                case -500113438:
                                    i = Integer.parseInt(str2.trim());
                                    break;
                                case 830357703:
                                    if (Integer.parseInt(str2.trim()) <= 1) {
                                        m897d2 = atm.m897d("B1E3A1EF97C3B1DEA1D497C7B1DFA1D797CFB1E1A1D497C1B1DFA1EC97CFB1DEA1D797C4B1E0A1D797FDB1E2");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1E0A1E397FFB1E6A1D797FDB1DAA1D197C0B1E1A1EF97F0B1E2A1EE97C7B1DCA1ED97C7B1D1A1DE97FDB1E2A1DD97C0B1E1A1D597FDB1E6A1D297C0");
                                        break;
                                    }
                                case 1990992442:
                                    m897d2 = atm.m897d("B1D6A1ED97FEB1E2A1E297F9B1DEA1D097CFB1ECA1ED97C1B1DEA1D997C3B1DFA1D497C0B1DCA1D497C7");
                                    break;
                            }
                        }
                        break;
                    case 863870076:
                        break;
                    case 1840486765:
                        m897d = atm.m897d("B1E1A1D397F3B1D8A1EF97CEB1D2A1D097F9B1E2A1DD97FEB1E5A1EF97CFB1DCA1DD97F9B1D2A1ED");
                        break;
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put(C0052e.m1418a(new byte[]{-71, -83}, new byte[]{-48, -55, 122, 7, 26, -86, 68, -86}), str);
            hashMap2.put(C0052e.m1418a(new byte[]{-68, -52}, new byte[]{-52, -85, 102, -33, 9, 64, -23, 10}), "" + i);
            String m897d3 = atm.m897d("B1D2A1D797C1B1E6A1EC97F4B1D1A1D997F0B1DAA1DD97C0B1E1A1EC97FDB1E1A1DD97F9B1E2A1EE97CFB1DB");
            while (true) {
                switch (m897d3.hashCode() ^ (-1125602894)) {
                    case -795385950:
                        break;
                    case -145907483:
                        m897d3 = atm.m897d("B1E0A1EC97FAB1D2A1EE97CFB1ECA1D297C0B1DDA1D197C1B1DAA1D997F4B1D8A1EE97C7");
                        break;
                    case -107960447:
                        if (hashMap == null) {
                            m897d3 = atm.m897d("B1DBA1D397F0B1D8A1EF97FEB1DEA1D397FDB1E2A1DD97C4B1E0A1D597CEB1D6");
                            break;
                        } else {
                            m897d3 = atm.m897d("B1DEA1EC97F9B1ECA1DD97F0B1D1A1EF97CEB1E2A1D397C2B1E1A1EC97C4B1DFA1ED97F8B1DFA1DD97C0");
                            break;
                        }
                    case 2000515502:
                        String m897d4 = atm.m897d("B1DAA1D197FAB1E6A1E997FEB1DDA1EF97F3B1D2A1EC97C1B1DEA1D297FDB1E2A1D297C7B1DBA1D397F9B1DAA1EA97C0B1DDA1EF97C3B1DD");
                        while (true) {
                            switch (m897d4.hashCode() ^ (-154817018)) {
                                case -1380405020:
                                    if (hashMap.size() <= 0) {
                                        m897d4 = atm.m897d("B1D6A1D397FFB1E2A1E397F0B1E2A1ED97C7B1E3A1D297F3B1D8A1DD97FCB1DDA1DD97C0B1EDA1D797C2B1E5A1E297F9B1E2");
                                        break;
                                    } else {
                                        m897d4 = atm.m897d("B1E0A1E297F4B1E5A1E997C1B1E0A1E397F3B1DBA1DD97C0B1EDA1D497C0B1E2A1D297F8B1D2");
                                        break;
                                    }
                                case -966794708:
                                    break;
                                case 155865968:
                                    m897d4 = atm.m897d("B1DBA1D797FEB1E0A1E997FDB1ECA1D297CEB1E2A1DD97C4B1DEA1D797C3B1DFA1E997CEB1DDA1EE97F3B1EDA1E9");
                                    break;
                                case 1955624979:
                                    hashMap2.putAll(hashMap);
                                    break;
                            }
                        }
                        break;
                }
            }
            String m897d5 = atm.m897d("B1E0A1EE97C2B1E0A1D197FAB1ECA1D397C0B1D1A1D997FEB1E1A1EE97F0B1D8A1D097F4B1E2A1DD97F0B1E2A1D397FFB1DB");
            while (true) {
                switch (m897d5.hashCode() ^ (-1754684668)) {
                    case -1832758457:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-6, 32}, new byte[]{-109, 68, -51, -73, 6, 1, 97, 116})) != null) {
                            m897d5 = atm.m897d("B1E0A1E297F8B1E5A1DD97FDB1E2A1EF97FCB1ECA1ED97FCB1DEA1D497C0B1E1A1D197C3B1E0A1D397F0B1E2A1D197C4B1DEA1D197F3B1DFA1ED");
                            break;
                        } else {
                            m897d5 = atm.m897d("B1DDA1EF97C7B1E0A1E997F0B1E2A1EA97FDB1DCA1ED97FDB1DFA1D397FFB1D2A1E297F0B1DAA1EA97C4B1E0A1D297C1B1DFA1ED");
                            break;
                        }
                    case -1793210658:
                        str3 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-40, 117}, new byte[]{-79, 17, 31, -119, -4, 92, -42, -37}));
                        break;
                    case -1718211840:
                        m897d5 = atm.m897d("B1EDA1E297F3B1D2A1D297C0B1E2A1E397C7B1ECA1D497F3B1DDA1D097FAB1DBA1D397FFB1D6");
                        break;
                    case 1111033445:
                        str3 = "";
                        break;
                }
            }
            String m897d6 = atm.m897d("B1D1A1D197F8B1D2A1D997FDB1DEA1DD97F8B1DFA1D497C0B1E2A1D097C3B1D6A1E297C1B1ECA1ED97F8B1D1A1D7");
            while (true) {
                switch (m897d6.hashCode() ^ (-1164406584)) {
                    case -2074942507:
                        m897d6 = atm.m897d("B1E2A1D297F4B1DCA1D297FDB1DBA1ED97C3B1ECA1EC97FCB1E2A1ED97F0B1D2A1E997C0B1D1A1D197FFB1E3A1E397C0B1E2");
                        break;
                    case -1237898162:
                        str4 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-85, -57, -25, -12}, new byte[]{-54, -75, -126, -107, 36, -24, -108, 62}));
                        break;
                    case -1089213997:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{79, -84, 29, 68}, new byte[]{46, -34, 120, 37, -81, -36, 99, 80})) != null) {
                            m897d6 = atm.m897d("B1DAA1ED97C3B1DEA1D097F9B1E2A1DE97FAB1DFA1ED97C7B1DBA1E297F3B1D2A1EA97C2B1E3A1DD97F4B1E1");
                            break;
                        } else {
                            m897d6 = atm.m897d("B1DBA1EC97FEB1E2A1D197C4B1EDA1D197F8B1DCA1EC97C7B1DCA1ED97F3B1E3A1D597C7B1E2A1EE");
                            break;
                        }
                    case 199394627:
                        str4 = "";
                        break;
                }
            }
            String m897d7 = atm.m897d("B1E1A1D797FEB1E1A1D297CEB1D1A1E997F3B1DDA1D497C3B1DEA1D497C0");
            while (true) {
                switch (m897d7.hashCode() ^ (-1232968183)) {
                    case -2042118017:
                        str5 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-91, -37}, new byte[]{-57, -94, -103, 118, 74, -83, 117, 29}));
                        break;
                    case 195606400:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{32, -17}, new byte[]{66, -106, 69, -113, 66, 63, -30, 83})) != null) {
                            m897d7 = atm.m897d("B1E1A1DE97C0B1E2A1E397C1B1DCA1ED97FDB1ECA1E397C0B1E2A1DD97F0B1D2A1D497C0B1DBA1D297F0B1DEA1D297F0B1E2");
                            break;
                        } else {
                            m897d7 = atm.m897d("B1DFA1D197C3B1E0A1E997FAB1E0A1DE97C4B1DDA1EC97C0B1E1A1D097FCB1DEA1D197F0B1E2A1D397F9B1E2");
                            break;
                        }
                    case 416317275:
                        m897d7 = atm.m897d("B1D6A1E397FFB1E2A1DD97F4B1DAA1D597F0B1E2A1E297F8B1DCA1D597F3B1D2A1ED");
                        break;
                    case 1957904512:
                        str5 = "";
                        break;
                }
            }
            String m897d8 = atm.m897d("B1EDA1E397F3B1D2A1EE97FCB1D1A1D597C4B1E2A1D397FCB1DCA1D497FAB1E3A1D597C3B1D2A1E297C7B1DCA1ED97C2B1E2A1E997C0B1D2A1EF97C4");
            while (true) {
                switch (m897d8.hashCode() ^ 241984862) {
                    case -1903091128:
                        str6 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-19, 103, 39, 0, 74}, new byte[]{-114, 11, 70, 115, 57, -127, -25, -51}));
                        break;
                    case -1759923541:
                        m897d8 = atm.m897d("B1E1A1D297F9B1E2A1DE97C2B1DFA1ED97FFB1D2A1D597FDB1DDA1D397C0B1DBA1E297F3B1D8A1E997F0B1E2A1EF97C0B1DEA1EC97FCB1D6");
                        break;
                    case -734359791:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{-55, 51, -19, 59, -92}, new byte[]{-86, 95, -116, 72, -41, -75, 122, -74})) != null) {
                            m897d8 = atm.m897d("B1DCA1D097FEB1E2A1EC97CEB1DBA1ED97FFB1E6A1D597C0B1E2A1D797FAB1D1A1D297F4B1DCA1ED97FFB1DCA1D197FCB1ECA1ED97C0B1E5A1D297C1");
                            break;
                        } else {
                            m897d8 = atm.m897d("B1D6A1D397FCB1E6A1E997F9B1E5A1EC97FDB1DEA1D297F0B1EDA1E997F8B1DBA1D297FEB1E2A1D597C7B1EC");
                            break;
                        }
                    case -35541038:
                        str6 = "";
                        break;
                }
            }
            String m897d9 = atm.m897d("B1D1A1EE97C1B1DDA1EC97C0B1E2A1E297FEB1E0A1E397F3B1E0A1DD97FEB1DEA1E397CE");
            while (true) {
                switch (m897d9.hashCode() ^ 232651990) {
                    case -473706442:
                        str7 = "";
                        break;
                    case -9245657:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{89, 69, 108, 8}, new byte[]{53, 36, 2, 111, -5, -60, 116, 105})) != null) {
                            m897d9 = atm.m897d("B1DEA1D497CEB1ECA1EC97C0B1D2A1D497C2B1DCA1D597C4B1E2A1D997CFB1DB");
                            break;
                        } else {
                            m897d9 = atm.m897d("B1E1A1EA97C1B1E2A1E297C7B1E3A1DE97CEB1E2A1ED97C3B1E2A1ED97C1B1D8A1D4");
                            break;
                        }
                    case 1444966624:
                        m897d9 = atm.m897d("B1E1A1DD97C3B1DFA1D197F9B1EDA1E397F9B1E2A1D797C1B1D6A1D297F0B1DBA1D997FFB1D6A1D597F9B1DFA1ED97F0B1DEA1D9");
                        break;
                    case 1842545357:
                        str7 = (String) hashMap2.get(C0052e.m1418a(new byte[]{119, 22, 44, -38}, new byte[]{27, 119, 66, -67, -103, -103, -95, -57}));
                        break;
                }
            }
            String m897d10 = atm.m897d("B1DBA1E397C7B1D1A1E397FEB1E2A1D597FFB1DEA1E397F9B1E2A1D297F4B1D8A1E397F4B1DF");
            while (true) {
                switch (m897d10.hashCode() ^ 1772824586) {
                    case -1161216711:
                        m897d10 = atm.m897d("B1E0A1D597C1B1DFA1D497FEB1E2A1DD97C1B1E2A1D097C1B1D2A1E297FDB1D1");
                        break;
                    case -727696603:
                        str8 = "";
                        break;
                    case -275636545:
                        str8 = (String) hashMap2.get(C0052e.m1418a(new byte[]{-25, -7}, new byte[]{-105, -98, -49, -56, 32, 65, 8, 24}));
                        break;
                    case 1277229251:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{28, -9}, new byte[]{108, -112, 19, -84, 25, 124, -68, 21})) != null) {
                            m897d10 = atm.m897d("B1DBA1D197FDB1DEA1DD97C2B1D8A1D497C2B1D2A1ED97C0B1E0A1E997C3B1DFA1E297FAB1EDA1EE97FEB1E5A1ED97C0");
                            break;
                        } else {
                            m897d10 = atm.m897d("B1DBA1D597F4B1DDA1EC97CFB1E0A1EA97C2B1E3A1D797F0B1D8A1D097FDB1E2A1E297FAB1D2A1ED");
                            break;
                        }
                }
            }
            String m897d11 = atm.m897d("B1DEA1EF97C0B1ECA1DD97FFB1E2A1EF97F8B1DBA1EF97FCB1E2A1ED97F9B1E5A1EA97F0B1DAA1E397F3B1E2A1ED97FCB1DBA1EF97C4B1DA");
            while (true) {
                switch (m897d11.hashCode() ^ (-545867855)) {
                    case -1830004644:
                        m897d11 = atm.m897d("B1D8A1D097FFB1DFA1D297F9B1D2A1D797CFB1D2A1D797C2B1DCA1DD97C3");
                        break;
                    case -806192820:
                        str9 = (String) hashMap2.get(C0052e.m1418a(new byte[]{16, 2, -90, -96}, new byte[]{105, 103, -57, -46, -80, 33, -120, 108}));
                        break;
                    case -68573622:
                        str9 = "";
                        break;
                    case 1060658370:
                        if (hashMap2.get(C0052e.m1418a(new byte[]{107, 23, -95, 18}, new byte[]{18, 114, -64, 96, -67, 59, 74, -9})) != null) {
                            m897d11 = atm.m897d("B1D8A1EE97FEB1DAA1D497C4B1E2A1D197F8B1E5A1EE97F8B1D8A1D197C2B1E2A1D297FDB1E2A1D197CFB1E0A1DE97F0B1DCA1ED97FCB1E3A1D9");
                            break;
                        } else {
                            m897d11 = atm.m897d("B1ECA1EA97F8B1D1A1EA97CEB1D1A1D297C1B1E2A1EE97F3B1ECA1E397F0B1D1A1D3");
                            break;
                        }
                }
            }
            String str10 = f1107i + String.format(C0052e.m1418a(new byte[]{65, -102, 56, 85, 84, -37, -34, -88, 65, -55, 36, 28, 2, -64, -100, -6, 29, -63, 114, 66, 10, -106, -62, -14, 67, -63, 122, 20, 84, -98, -100, -14, 75, -97, 121, 89, 83, -34, -35}, new byte[]{110, -20, 87, 49, 39, -77, -79, -33}), str3, str4, str5, str6, str7, str8, str9);
            String m308e = C0574b.m308e(str10, m275d(str10));
            String m897d12 = atm.m897d("B1DBA1E997F0B1E0A1D297C3B1E5A1EE97F3B1DDA1D097FEB1ECA1DD97C2B1D2A1E997F4B1DFA1EE97C3");
            while (true) {
                switch (m897d12.hashCode() ^ 141177939) {
                    case -1714741860:
                        break;
                    case -1298675398:
                        m897d12 = atm.m897d("B1D2A1D797F0B1E2A1D097C3B1ECA1ED97FFB1DCA1EC97FCB1D8A1E397FDB1ECA1D297FEB1D2A1D397F3B1DEA1D497C2B1DBA1D497C0B1DCA1D597FE");
                        break;
                    case -817028473:
                        m308e = m276c(str10);
                        while (true) {
                            String m897d13 = atm.m897d("B1EDA1E297C0B1E2A1EE97F3B1DFA1EE97F9B1E3A1E297F8B1E1A1D797FCB1D8A1D797FDB1D1A1DE97CEB1E5A1EE97C1B1E3A1EC97C4B1D8");
                            while (true) {
                                switch (m897d13.hashCode() ^ 482967124) {
                                    case -1730930150:
                                        break;
                                    case -1446609112:
                                        m897d13 = m308e.contains(C0052e.m1418a(new byte[]{37, -84, -74, -31, -103, 94, -90, 60, 98, -121, -68, -8, -42, 70, -79}, new byte[]{10, -13, -47, -108, -8, 44, -62, 19})) ? atm.m897d("B1D1A1EA97FFB1DDA1D997C3B1E1A1ED97C0B1E2A1D597C4B1D6A1D397F9B1D6A1D997C4B1DDA1ED") : atm.m897d("B1E5A1D397CFB1DBA1D197C7B1E0A1EF97C2B1E1A1ED97CEB1E2A1E397FEB1D1");
                                    case 1681889273:
                                        break;
                                    case 1717913718:
                                        m897d13 = atm.m897d("B1D2A1D597FAB1DCA1EC97F4B1E1A1EC97C2B1D6A1D997C3B1DCA1ED97C2B1E1A1E997CFB1D2A1E397CF");
                                }
                            }
                            SystemClock.sleep(1000L);
                            m308e = C0574b.m308e(str10, m275d(str10));
                        }
                        break;
                    case 741904200:
                        if (!m308e.contains(C0052e.m1418a(new byte[]{54, -40, 60, -4, 63, 36, 124, -30, 113, -13, 54, -27, 112, 60, 107}, new byte[]{25, -121, 91, -119, 94, 86, 24, -51}))) {
                            m897d12 = atm.m897d("B1E6A1D497F3B1E3A1EE97F8B1DBA1D297FAB1DCA1D297F4B1E6A1EF97C3B1E5A1D497C0B1E0A1E997FCB1DDA1DD97C0B1E2A1D597F4B1E2A1ED");
                            break;
                        } else {
                            m897d12 = atm.m897d("B1ECA1D997C4B1E5A1E397F0B1E2A1D197C1B1D1A1EF97F8B1D1A1E997C7B1D6A1EC97F4B1D2A1ED97F4B1EDA1D297C2B1DCA1D297C0");
                            break;
                        }
                }
            }
            return m277b(m308e, str2).toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* renamed from: d */
    protected final HashMap<String, String> m275d(String str) {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1ECA1D197CEB1D2A1E297FEB1E2A1EF97F0B1E0A1DD97CFB1E2A1DE97F4B1DCA1ED97FDB1DCA1D1");
        while (true) {
            switch ((m897d.hashCode() ^ 224) ^ (-1797055165)) {
                case -1606979740:
                    m897d = atm.m897d("B1D2A1E297F8B1DEA1D097C4B1E2A1D797FFB1DEA1D497C1B1DEA1DE97C1B1ECA1E997FFB1D8A1D297C4B1E1A1D197F0B1ED");
                    break;
                case -1499671948:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E6A1E297F9B1D2A1D597FDB1ECA1D997C7B1DDA1EA97FCB1D2A1D297F9B1E2A1D397C1B1DFA1D097CEB1E2A1D297C1B1ECA1ED97F9B1DEA1D3");
                    break;
                case -607949264:
                    hashMap.put(C0052e.m1418a(new byte[]{-92, 105, -23, -76, -89, 105, 69}, new byte[]{-10, 12, -113, -47, -43, 12, 55, -83}), str);
                    m897d = atm.m897d("B1D6A1E397C2B1E3A1D197C0B1E2A1D097F9B1D2A1ED97F3B1DEA1E397C0B1DFA1EF97F4B1E5A1E997F9B1D6A1D397CFB1D8A1EC97F9B1E2A1E297F4B1DC");
                    break;
                case -388368887:
                    hashMap.put(C0052e.m1418a(new byte[]{-87, 120, -110, 65, 80, 52}, new byte[]{-54, 23, -3, 42, 57, 81, -101, 27}), this.f1110d);
                    m897d = atm.m897d("B1DFA1D397FEB1E2A1DD97FCB1D8A1D397C1B1DBA1ED97F8B1EDA1ED97C0B1D1A1EC97F8B1E6A1EC97FDB1E3A1D797C1B1DDA1EA97C3");
                    break;
                case 263148441:
                    hashMap.put(C0052e.m1418a(new byte[]{92, 2, -14, -9, 53, -101}, new byte[]{49, 103, -122, -97, 90, -1, 46, -22}), C0052e.m1418a(new byte[]{85, -113, -111}, new byte[]{18, -54, -59, 107, 85, -105, -105, -123}));
                    m897d = atm.m897d("B1DAA1D497FCB1E6A1ED97F4B1E3A1D197CEB1DEA1E397F8B1DEA1D197F8B1E1A1E397CF");
                    break;
                case 645005366:
                    hashMap.put(C0052e.m1418a(new byte[]{47, 42, 116, 13, -23, -110, -98, 6, 20, 45}, new byte[]{122, 89, 17, Byte.MAX_VALUE, -60, -45, -7, 99}), C0052e.m1418a(new byte[]{-96, 39, -92, 68, 11, -86, 17, -46, -40, 102, -18, 13, 79, -117, 17, -98, -124, 38, -86, 66, 20, -82, 75, -35, -92, 38, -86, 72, 11, -26, 61, -100, -114, 104, -111, 126, 71, -98, 80, -52, -35, 23, -17, 24, 56, -15, 89, -35, -84, 56, -82, 65, 2, -111, 21, -97, -90, 33, -86, 2, 82, -11, 71, -45, -34, 126, -2, 5, 44, -114, 36, -80, -95, 100, -2, 65, 14, -83, 21, -35, -86, 45, -67, 70, 8, -17, 80, -66, -123, 58, -79, 64, 2, -23, 73, -52, -61, 120, -16, 25, 83, -15, 66, -45, -36, 121, -22, 13, 52, -89, 22, -100, -97, 33, -15, 24, 84, -15, 94, -50, -37}, new byte[]{-19, 72, -34, 45, 103, -58, 112, -3}));
                    m897d = atm.m897d("B1E2A1ED97CEB1E2A1ED97C2B1D6A1DE97F0B1E3A1EC97C0B1DEA1D097FDB1DCA1E997FAB1E0A1EA97FEB1DFA1D597C7B1E3A1E397FDB1E6A1ED");
                    break;
                case 660463785:
                    m897d = atm.m897d("B1DDA1EE97F3B1D2A1EA97CEB1E2A1D297C2B1ECA1ED97C4B1DFA1EC97FAB1ECA1E397CEB1E6A1EF97C2B1DDA1D497C0B1D1A1EA97FEB1E2");
                    break;
                case 858950853:
                    hashMap.put(C0052e.m1418a(new byte[]{76, 94, 93, -8, -33, -54}, new byte[]{13, 61, 62, -99, -81, -66, -12, -19}), C0052e.m1418a(new byte[]{99, 26, -105, 92, 110, 78, 97, -118, 123, 83, -114, 88, 49, 74, 124, -124, 118, 11, -122, 71, 47, 9, 109, -113, 99, 18, -125, 3, 57, 75, 121, -53, 118, 15, -97, 68, 40, 69, 116, -109, 126, 16, -127, 7, 57, 75, 121, -36, 102, 66, -33, 6, 120, 10, 124, -118, 118, 24, -118, 7, 54, 67, 119, -105, 59, 85, -64, 2, 122, 87, 40, -41, 57, 71}, new byte[]{23, Byte.MAX_VALUE, -17, 40, 65, 38, 21, -25}));
                    m897d = atm.m897d("B1D8A1DD97C0B1E2A1E397F4B1D2A1E397C0B1DBA1E997C1B1D2A1ED97FAB1DEA1E397FEB1ECA1D1");
                    break;
                case 957846403:
                    String m897d2 = atm.m897d("B1EDA1D597FAB1D6A1DE97C3B1D1A1E397C4B1E2A1D497F0B1DBA1DD97C4B1E3");
                    while (true) {
                        switch (m897d2.hashCode() ^ 1480134160) {
                            case -1867496191:
                                m897d = atm.m897d("B1DFA1D397FEB1E2A1DD97FCB1D8A1D397C1B1DBA1ED97F8B1EDA1ED97C0B1D1A1EC97F8B1E6A1EC97FDB1E3A1D797C1B1DDA1EA97C3");
                                continue;
                            case 70172421:
                                m897d2 = !this.f1110d.isEmpty() ? atm.m897d("B1D6A1D597F8B1DEA1DD97CFB1E3A1D497C0B1D1A1D097F3B1DAA1EA97FCB1D6A1D997F0") : atm.m897d("B1D2A1D497CEB1DFA1D097CEB1E2A1DE97FFB1D2A1D297FDB1D2A1D197F0B1E2A1EE97C3B1DCA1ED97CFB1D2A1DE");
                            case 560136809:
                                m897d = atm.m897d("B1DCA1ED97C4B1E0A1D397FAB1D6A1E997F9B1EDA1DD97FEB1E2A1DD97C2B1DAA1D197CFB1D2A1EF97FEB1DDA1E397C0B1D8A1E997CEB1E2");
                                continue;
                            case 1924579547:
                                m897d2 = atm.m897d("B1DFA1E397FEB1ECA1D497F9B1E3A1D197F4B1E6A1D297C3B1DFA1D297F3");
                        }
                    }
                    break;
                case 1906910078:
                    return hashMap;
                case 1963783727:
                    String m897d3 = atm.m897d("B1D1A1D497F3B1DFA1ED97FFB1E2A1E397C2B1ECA1EA97C4B1E6A1ED97CFB1E3A1E997C0");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1474320561)) {
                            case -1933049907:
                                m897d = atm.m897d("B1D6A1E397C2B1E3A1D197C0B1E2A1D097F9B1D2A1ED97F3B1DEA1E397C0B1DFA1EF97F4B1E5A1E997F9B1D6A1D397CFB1D8A1EC97F9B1E2A1E297F4B1DC");
                                continue;
                            case -443246401:
                                m897d3 = !TextUtils.isEmpty(str) ? atm.m897d("B1DAA1E997F4B1E3A1E997F9B1E2A1EF97CFB1DBA1D297F0B1DBA1EE97CFB1DDA1D997FDB1E2A1E397F4B1DAA1E997C4B1E0A1EF97F0B1D8") : atm.m897d("B1DEA1EF97FDB1E2A1D197C4B1E3A1D597CFB1E5A1E397C1B1EDA1D097C7B1E2A1ED97F0B1D6A1DD97C0B1E5A1D997FDB1E2A1D997F0B1E2A1D597C2B1DC");
                            case 719633957:
                                m897d3 = atm.m897d("B1D2A1EF97C2B1E0A1E397C3B1E6A1EC97C2B1DFA1D197CEB1DEA1D397F0B1E2A1E397FFB1E6A1ED97CEB1D8A1ED97FDB1DFA1D297C0");
                            case 2097898498:
                                m897d = atm.m897d("B1D2A1DE97C1B1DFA1DD97F8B1EDA1D597FDB1E5A1EA97CFB1ECA1D797F9B1E1A1E297FA");
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        boolean z;
        try {
            C0288h m1414e = C0052e.m1414e(C0574b.m308e(C0052e.m1418a(new byte[]{-11, -44, 10, -76, -29, 106, -26, -59, -22, -41, 9, -22, -91, 101, -4, -114, -12, -63, 16, -67, -7, 62, -82, -60, -2, -61, 81, -78, -1, 52, -83, -113, -23, -63, 23, -88, -65}, new byte[]{-99, -96, 126, -60, -112, 80, -55, -22}) + list.get(0) + C0052e.m1418a(new byte[]{55, 58, 92, -89, 42}, new byte[]{25, 82, 40, -54, 70, -10, 71, 62}), m275d(f1107i)));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String mo925d = m1414e.m966q0(C0052e.m1418a(new byte[]{112, 45, -80, 95, 58, -4, -66, -35, 120, 33, -21, 28, 54, -6, -76, -120, 125, 41, -95}, new byte[]{20, 68, -58, 113, 87, -109, -38, -88})).mo925d(C0052e.m1418a(new byte[]{-108, 16, -12, -112, -88, -67, 115, 113, -105, 24, -18, -112, -23}, new byte[]{-16, 113, Byte.MIN_VALUE, -15, -123, -46, 1, 24}));
            String m960w0 = m1414e.m966q0(C0052e.m1418a(new byte[]{-20, 12, 34, 80, -86, 100, -29, 22, -28, 0, 121, 19, -90, 98, -23, 67, -32, 84}, new byte[]{-120, 101, 84, 126, -57, 11, -121, 99})).m960w0();
            String m960w02 = m1414e.m966q0(C0052e.m1418a(new byte[]{103, -18, -58, -72, -80, 120, -57, -126, 111, -30, -99, -5, -68, 126, -51, -41, 103, -18, -58, -72, -80, 120, -57, -126, 111, -30, -99, -1, -77, 113, -52, -38, 106, -23, -60, -28, -78, 115, -42, -108, 119, -18, -33, -8, -16, 116, -52, -103, 119, -30, -34, -30, -3, 41, -45}, new byte[]{3, -121, -80, -106, -35, 23, -93, -9})).m960w0();
            jSONObject2.put(C0052e.m1418a(new byte[]{-111, -27, 98, 112, -38, -86}, new byte[]{-25, -118, 6, 47, -77, -50, 49, -113}), list.get(0));
            jSONObject2.put(C0052e.m1418a(new byte[]{84, 19, -65, -127, 58, -113, 45, 17}, new byte[]{34, 124, -37, -34, 84, -18, 64, 116}), m960w0);
            jSONObject2.put(C0052e.m1418a(new byte[]{0, 40, 118, -74, 23, -57, -49}, new byte[]{118, 71, 18, -23, 103, -82, -84, 78}), mo925d);
            jSONObject2.put(C0052e.m1418a(new byte[]{35, -110, -61, -119, -5, 126, 29, 30, 48, -109, -45}, new byte[]{85, -3, -89, -42, -104, 17, 115, 106}), m960w02);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{27, 78, -12, 32, 60, 84, 78, -47, 6, 10, -14, 23, 52, 73, 63, -97, 12, 83, -91, 38, 117, 67, 3, -105, 17}, new byte[]{Byte.MAX_VALUE, 39, -126, 123, 85, 48, 115, -10}));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-69, -66, -14, -78, -33, -120, -103, -68, -77, -78, -87, -20, -34, -122, -124, -28, -77, -66, -9, -24}, new byte[]{-33, -41, -124, -100, -78, -25, -3, -55}));
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1DCA1E997F9B1E2A1DE97F3B1E1A1E997F0B1EDA1E397C4B1DFA1D497F4B1E2A1ED97C4B1ECA1D7");
                while (true) {
                    switch (m897d.hashCode() ^ 8755741) {
                        case -1171079333:
                            String m960w03 = m967p0.get(i).m960w0();
                            Iterator<String> keys = this.f1108b.keys();
                            while (true) {
                                String m897d2 = atm.m897d("B1DAA1D397FFB1E2A1DE97C3B1E6A1ED97CEB1ECA1E397CEB1ECA1EC97C3B1D6A1D497C3B1DDA1E2");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-1410956764)) {
                                        case -1723972404:
                                            z = false;
                                            break;
                                        case -510702684:
                                            m897d2 = atm.m897d("B1D1A1EA97C0B1E2A1D597FAB1DAA1EE97F9B1E6A1D097F4B1DCA1ED97F8B1E0A1DD97C0");
                                        case 740518309:
                                            m897d2 = keys.hasNext() ? atm.m897d("B1E2A1D597F9B1DEA1D497C3B1DAA1EA97F3B1DCA1D597C4B1E2A1EE97CFB1E3") : atm.m897d("B1E5A1E397C0B1DDA1D397F9B1E2A1EF97FDB1D1A1D297F4B1DCA1DD97CEB1E6A1D997C4B1ECA1ED");
                                        case 1259929611:
                                            String next = keys.next();
                                            String m897d3 = atm.m897d("B1DEA1ED97F9B1E3A1D497C3B1D6A1D097FEB1DBA1DD97C7B1EDA1D197FAB1DCA1D297C0B1E2A1D497CFB1DDA1EA97C4B1E2");
                                            while (true) {
                                                switch (m897d3.hashCode() ^ (-522798277)) {
                                                    case -1548397424:
                                                        break;
                                                    case -340784588:
                                                        m897d3 = this.f1108b.getJSONObject(next).getString(C0052e.m1418a(new byte[]{116, 60, 33, 59}, new byte[]{7, 84, 78, 76, -55, 93, -125, -82})).equals(m960w03) ? atm.m897d("B1DEA1D297F3B1DEA1E397C4B1DFA1EA97FEB1DFA1D797FAB1EDA1EE97F9B1DFA1D797CEB1E2A1EC97C4B1E2A1E397C7B1DCA1E397F0B1E6A1ED") : atm.m897d("B1E0A1D997F0B1E2A1ED97FCB1D2A1E997CFB1E0A1D197C1B1DCA1ED97C0B1DDA1D597C0B1E3A1D397C0B1DFA1EA97C3B1DBA1D097C0");
                                                    case 640581676:
                                                        m897d3 = atm.m897d("B1ECA1D597C3B1E5A1D497C4B1E2A1D297C7B1E1A1ED97FFB1DCA1ED97FAB1DBA1D497CFB1D6A1E397C0B1ECA1D597F0B1E2A1EA97FFB1E1");
                                                    case 2036660142:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                            String m897d4 = atm.m897d("B1E0A1D497F0B1DCA1D397FCB1ECA1D097FDB1DEA1E297F3B1ECA1D597CEB1E3A1D197C3B1E0A1EC97CE");
                            while (true) {
                                switch (m897d4.hashCode() ^ 721916048) {
                                    case -1422528231:
                                        break;
                                    case -1382656304:
                                        C0459g m967p03 = m967p02.get(i).m967p0(C0052e.m1418a(new byte[]{-11, 8, -53, 125, -126, -125, 111, -25, -71, 86, -54, 115, -97, -37, 111, -21, -25, 82, -117, 126, -113, -104, 104}, new byte[]{-108, 38, -90, 18, -26, -10, 3, -126}));
                                        ArrayList arrayList = new ArrayList();
                                        int i2 = 0;
                                        while (true) {
                                            String m897d5 = atm.m897d("B1E0A1D797F0B1DCA1E397FCB1E1A1D197CEB1E2A1EC97FFB1DCA1ED97CEB1D6A1E297C3B1E1A1D297C2B1D2A1EE97F9B1E3A1ED97C2B1DDA1D2");
                                            while (true) {
                                                switch (m897d5.hashCode() ^ (-493836597)) {
                                                    case -571947351:
                                                        m897d5 = i2 < m967p03.size() ? atm.m897d("B1ECA1EE97C4B1E0A1DD97C0B1E2A1D097FDB1E2A1ED97C3B1DAA1E997C0B1E1A1EC97F0B1E5A1ED97F0B1E2") : atm.m897d("B1DAA1E297FFB1D2A1E397F9B1E2A1EE97CEB1E5A1DD97FFB1D1A1EF97FFB1DBA1ED97FAB1DCA1EA97FEB1E2A1D2");
                                                    case 116630278:
                                                        m897d5 = atm.m897d("B1E2A1D097FAB1DBA1ED97F0B1E2A1D497C4B1D2A1ED97C1B1D1A1D197C0B1D6A1E297F4B1E2A1D297F8B1DFA1DD97C7B1DDA1EC");
                                                    case 984375952:
                                                        String m897d6 = atm.m897d("B1DFA1D997C7B1D8A1E997CEB1E6A1E397F4B1D2A1DE97C4B1DEA1D197FDB1E5A1D297C1B1EDA1EF97F9B1D2A1E397FFB1E2A1D097F0B1E3");
                                                        while (true) {
                                                            switch (m897d6.hashCode() ^ (-337877337)) {
                                                                case -1892723916:
                                                                    break;
                                                                case -1050725146:
                                                                    m897d6 = atm.m897d("B1E0A1D497CFB1DCA1E397FAB1DCA1D497F4B1D2A1EE97C4B1E2A1D397F8B1D2A1ED97F9B1DDA1E997FDB1DCA1D1");
                                                                case -94896649:
                                                                    m897d6 = arrayList.size() > 0 ? atm.m897d("B1DBA1ED97F0B1E2A1D397C4B1E2A1ED97C4B1D8A1E997C0B1E0A1EF97C2B1DEA1EF97F8B1E2A1D997C2B1E5A1EA97C0B1D8") : atm.m897d("B1D1A1E397C0B1E2A1E297FFB1E6A1ED97CFB1E0A1EC97F4B1DAA1D097C0B1E0A1ED97C0B1D1A1EC97CFB1D8A1DE97C7B1ECA1D597F4B1ECA1EF97C0");
                                                                case 1256974514:
                                                                    linkedHashMap.put(m960w03, TextUtils.join(C0052e.m1418a(new byte[]{-114}, new byte[]{-83, -26, -67, 80, -98, -91, -83, -37}), arrayList));
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 1280230458:
                                                        C0293m c0293m = m967p03.get(i2);
                                                        Matcher matcher = this.f1113g.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{-54, -82, 122, -2}, new byte[]{-94, -36, 31, -104, -8, 1, -107, -60})));
                                                        String m897d7 = atm.m897d("B1E3A1D797C1B1DDA1E397C4B1E2A1E297F3B1D6A1D097F0B1DFA1ED97C0B1EDA1EA97C3B1D1A1D597CFB1DDA1D597C3B1E3A1EE");
                                                        while (true) {
                                                            switch (m897d7.hashCode() ^ 293228737) {
                                                                case -1960033291:
                                                                    break;
                                                                case 886212977:
                                                                    m897d7 = matcher.find() ? atm.m897d("B1EDA1E997F9B1E1A1ED97FDB1E2A1DD97F9B1DAA1D197C7B1DFA1ED97C4B1E5A1E397C0B1D1A1D197FCB1DDA1EF97FCB1DEA1D2") : atm.m897d("B1EDA1E297C3B1EDA1D597C0B1E6A1D097C0B1E2A1EC97CFB1DCA1D197C3B1DCA1ED97FFB1D1A1D9");
                                                                case 1581705917:
                                                                    String group = matcher.group(1);
                                                                    arrayList.add(c0293m.m960w0() + C0052e.m1418a(new byte[]{5}, new byte[]{33, 73, -35, -93, 79, -97, 33, -96}) + group);
                                                                    break;
                                                                case 1625158710:
                                                                    m897d7 = atm.m897d("B1DBA1DE97C1B1DEA1DD97FAB1ECA1DD97CEB1E2A1ED97F4B1DBA1EE97FCB1E3A1EE97C1B1D6A1EF97F9B1E2A1D197FEB1D8A1D297C1B1DFA1ED");
                                                            }
                                                        }
                                                        i2++;
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case -1132094466:
                                        m897d4 = z ? atm.m897d("B1E1A1EF97F9B1E2A1D597F3B1E1A1DD97CFB1D2A1D597F0B1E5A1DD97C2B1E2A1ED97CEB1D1A1D297C2B1EDA1D497FAB1D1A1D297C7B1D8") : atm.m897d("B1DEA1E397CEB1E2A1D097F4B1DEA1E997FEB1D8A1D197CEB1ECA1ED97F0B1ECA1EF");
                                    case 820981589:
                                        m897d4 = atm.m897d("B1D2A1EC97FEB1D8A1ED97C0B1D8A1EA97FDB1ECA1D397C0B1E1A1E397FDB1E2A1EA97C0B1D6A1D797CEB1EDA1EA97F9B1D2A1ED97C2B1DEA1D2");
                                }
                            }
                            i++;
                            break;
                        case -783007953:
                            String m897d8 = atm.m897d("B1ECA1D597FCB1E1A1D797CEB1E2A1E997C2B1E5A1D397FEB1DDA1DE97F9B1E2A1ED97F4B1E6A1ED97C0B1D8A1DD97FC");
                            while (true) {
                                switch (m897d8.hashCode() ^ 1248441105) {
                                    case -1063904732:
                                        String join = TextUtils.join(C0052e.m1418a(new byte[]{70, 22, -113}, new byte[]{98, 50, -85, 57, -77, 115, -34, 87}), linkedHashMap.keySet());
                                        String join2 = TextUtils.join(C0052e.m1418a(new byte[]{-120, -36, 94}, new byte[]{-84, -8, 122, -16, 80, -72, -127, 88}), linkedHashMap.values());
                                        jSONObject2.put(C0052e.m1418a(new byte[]{36, 78, 39, -87, -38, -3, 19, -50, 13, 71, 49, -103, -57}, new byte[]{82, 33, 67, -10, -86, -111, 114, -73}), join);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{-10, -85, 105, 114, 14, -96, 98, 90, -33, -79, Byte.MAX_VALUE, 65}, new byte[]{Byte.MIN_VALUE, -60, 13, 45, 126, -52, 3, 35}), join2);
                                        break;
                                    case -864170219:
                                        m897d8 = atm.m897d("B1DAA1EF97C0B1E5A1D997FEB1EDA1E397CFB1DEA1E397C1B1D2A1D597F0B1E2A1E997C7");
                                        break;
                                    case -216993570:
                                        if (linkedHashMap.size() <= 0) {
                                            m897d8 = atm.m897d("B1D1A1D197F9B1E2A1E297C3B1E0A1EA97F9B1E2A1EF97F4B1DFA1D197F9B1E2A1ED97F3B1D2A1E997C0B1D8A1D097F9B1E2A1D297C0B1E2A1EC97FCB1DF");
                                            break;
                                        } else {
                                            m897d8 = atm.m897d("B1E1A1E397F9B1ECA1D097C1B1E5A1D097FDB1E2A1E997F8B1ECA1ED97CEB1D2A1ED97F0B1E1A1D597CEB1DAA1DD97FDB1D2A1EE");
                                            break;
                                        }
                                    case 1755256183:
                                        break;
                                }
                            }
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject2);
                            jSONObject.put(C0052e.m1418a(new byte[]{-15, 62, -5, -47}, new byte[]{-99, 87, -120, -91, -36, 81, -81, 34}), jSONArray);
                            return jSONObject.toString();
                        case -176843882:
                            m897d = atm.m897d("B1ECA1EF97FAB1DDA1D197C4B1DAA1D197C0B1E2A1EA97F8B1E1A1E397C4B1DFA1ED97C0B1DCA1EF97FDB1E0A1E397C4B1DFA1EE97C0B1E2A1D497C0");
                        case 958545222:
                            m897d = i < m967p0.size() ? atm.m897d("B1DEA1D497F4B1ECA1D197F3B1E3A1D497C4B1DCA1D597F3B1E1A1EE97FDB1DCA1E297CE") : atm.m897d("B1EDA1D797FCB1E6A1DD97F0B1E2A1D397C7B1E0A1ED97FCB1DCA1D797FFB1D6A1D197FFB1E0A1EC97C3B1DCA1ED97FAB1E3A1DE97F8B1EDA1DE");
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
        C0459g m967p0;
        JSONArray jSONArray;
        int i;
        try {
            C0288h m1414e = C0052e.m1414e(C0574b.m308e(C0052e.m1418a(new byte[]{-10, -14, -48, -112, Byte.MAX_VALUE, 23, -35, -41, -23, -15, -45, -50, 57, 24, -57, -100, -9, -25, -54, -103, 101, 67, -107, -42, -3, -27, -117}, new byte[]{-98, -122, -92, -32, 12, 45, -14, -8}), m275d(f1107i)));
            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-14, -19, -48, 76, 58, 118, 0, 28, -11, -84, -105, 86, 62, 109, 17, 93, -71, -95, -110, 75, 123, 62, 66, 28, -36, -23, -116, 71, 61, 42, 95, 90, -15, -18, -102, 86, 34, 112, 7, 90, -38}, new byte[]{-121, -127, -2, 34, 91, 0, 98, 125}));
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0293m> it = m967p02.iterator();
            while (true) {
                String m897d = atm.m897d("B1E5A1EC97FDB1D8A1E297F9B1D6A1EA97F0B1D6A1D197F0B1E2A1D497CFB1D6A1E397F0B1ECA1DE97FEB1E2");
                while (true) {
                    switch (m897d.hashCode() ^ 536424071) {
                        case -1263118497:
                            JSONObject jSONObject = new JSONObject();
                            String m897d2 = atm.m897d("B1DCA1E397F9B1E2A1D597FCB1E3A1EE97C7B1DFA1EA97C0B1D6A1ED97FDB1ECA1D097C1B1DDA1D597CEB1E2A1ED97F0B1D2A1D2");
                            while (true) {
                                switch (m897d2.hashCode() ^ 2010816458) {
                                    case -1740047699:
                                        if (!z) {
                                            m897d2 = atm.m897d("B1E0A1D597F9B1E2A1D597FCB1DDA1D297F4B1DFA1ED97C0B1DFA1E297C2B1D2A1D397C0B1DDA1EA97CFB1D1A1D497FDB1ECA1DD97CEB1E2A1ED97F8B1E2");
                                            break;
                                        } else {
                                            m897d2 = atm.m897d("B1D8A1D997F3B1E3A1ED97FFB1E1A1D397C0B1E1A1EA97FDB1E2A1D397FAB1ECA1ED97F4B1E6A1E397C0");
                                            break;
                                        }
                                    case -1559094233:
                                        m897d2 = atm.m897d("B1E1A1EF97F4B1E2A1D797FDB1E2A1DD97C3B1EDA1D397FEB1D1A1EF97F9B1E1A1EC97FAB1DFA1D197FDB1E3A1D297F8");
                                        break;
                                    case 757590922:
                                        break;
                                    case 1248782354:
                                        jSONObject.put(C0052e.m1418a(new byte[]{-83, -93, 12, -6, 72, -52, 20}, new byte[]{-53, -54, 96, -114, 45, -66, 103, -113}), this.f1109c);
                                        break;
                                }
                            }
                            jSONObject.put(C0052e.m1418a(new byte[]{-10, 113, 14, -97, 102}, new byte[]{-107, 29, 111, -20, 21, 122, -126, -28}), jSONArray2);
                            try {
                                m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{104, 43, -71, -103, -30, -80, -89, -125, 96, 39, -30, -34, -5, -70, -82, -123, 50, 98, -82, -20, -25, -83, -90, -112, 38, Byte.MAX_VALUE, -24, -63, -32, -69, -89, -109, 120, 35, -90, -37, -88, -126}, new byte[]{12, 66, -49, -73, -113, -33, -61, -10}));
                                jSONArray = new JSONArray();
                                i = 0;
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                            while (true) {
                                int i2 = i;
                                String m897d3 = atm.m897d("B1D8A1DD97C0B1DDA1D797F3B1E0A1E297C0B1E5A1D397F0B1DEA1D197C0B1E2A1D497CEB1D2");
                                while (true) {
                                    switch (m897d3.hashCode() ^ 1549348517) {
                                        case -814191747:
                                            m897d3 = atm.m897d("B1E5A1D797FDB1E2A1D197C4B1DCA1ED97C4B1DFA1EC97F4B1D1A1E397C3B1D1A1EE97F4B1E0A1E397FAB1E5A1D4");
                                        case 255924970:
                                            m897d3 = i2 < m967p0.size() ? atm.m897d("B1D2A1DE97F0B1E0A1EC97C7B1EDA1D197CEB1DBA1ED97C7B1DEA1E997C3B1E1A1EC97C7") : atm.m897d("B1DFA1EF97FDB1E5A1D497C0B1DEA1ED97CFB1DBA1D997F9B1E2A1EA97C1B1E1");
                                        case 543766053:
                                            C0293m c0293m = m967p0.get(i2);
                                            String mo925d = c0293m.mo925d(C0052e.m1418a(new byte[]{21, -19, 82, 110, 82}, new byte[]{97, -124, 38, 2, 55, -25, 5, 94}));
                                            String mo925d2 = c0293m.m966q0(C0052e.m1418a(new byte[]{1, -75, -72}, new byte[]{104, -40, -33, 0, -72, 87, -47, 66})).mo925d(C0052e.m1418a(new byte[]{-31, 50, 44, 108, 41, -96, -43, 38, -30, 58, 54, 108, 104}, new byte[]{-123, 83, 88, 13, 4, -49, -89, 79}));
                                            String m960w0 = c0293m.m966q0(C0052e.m1418a(new byte[]{-55, 56, 25, -28, Byte.MIN_VALUE, 98, -76, 84, -63, 52, 66, -93, -103, 104, -67, 12, -61, 62, 27, -81}, new byte[]{-83, 81, 111, -54, -19, 13, -48, 33})).m960w0();
                                            Matcher matcher = this.f1112f.matcher(c0293m.mo925d(C0052e.m1418a(new byte[]{-78, 116, -69, -60}, new byte[]{-38, 6, -34, -94, 101, -57, -96, 101})));
                                            String m897d4 = atm.m897d("B1ECA1EA97C1B1D2A1E297FAB1D1A1E397C3B1DEA1D997CEB1E2A1D397FCB1DAA1DE97C1B1EDA1EF97FDB1DEA1D997C1B1DA");
                                            while (true) {
                                                switch (m897d4.hashCode() ^ 484343538) {
                                                    case -1393679367:
                                                        m897d4 = atm.m897d("B1DFA1E297C0B1E2A1EC97C0B1E2A1ED97C2B1E6A1E997C0B1D1A1D497C1B1E0A1EE97C0B1DAA1D297FEB1DCA1D3");
                                                    case -927883649:
                                                        String group = matcher.group(1);
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-53, 12, 71, 32, 100, 47}, new byte[]{-67, 99, 35, Byte.MAX_VALUE, 13, 75, 33, -52}), group);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{-55, -79, -126, -85, 19, -58, -22, 65}, new byte[]{-65, -34, -26, -12, 125, -89, -121, 36}), mo925d);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{10, 89, 16, 45, -98, 0, -115}, new byte[]{124, 54, 116, 114, -18, 105, -18, 13}), mo925d2);
                                                        jSONObject2.put(C0052e.m1418a(new byte[]{48, -9, -87, -50, 51, 44, 95, -15, 52, -13, -66}, new byte[]{70, -104, -51, -111, 65, 73, 50, -112}), m960w0);
                                                        jSONArray.put(jSONObject2);
                                                        break;
                                                    case 1240318698:
                                                        m897d4 = !matcher.find() ? atm.m897d("B1E5A1EF97CEB1DEA1E997C4B1D8A1EC97C2B1EDA1D797C4B1E2A1ED97FDB1DDA1D397FFB1DBA1EE97C7B1E6A1DE97F0B1E3") : atm.m897d("B1E2A1DD97F8B1E2A1E397C3B1D8A1EA97CEB1DEA1D297CEB1E2A1DD97FC");
                                                    case 1260618222:
                                                        break;
                                                }
                                            }
                                            i = i2 + 1;
                                            break;
                                        case 696324775:
                                            jSONObject.put(C0052e.m1418a(new byte[]{-61, 64, 103, 54}, new byte[]{-81, 41, 20, 66, -113, -97, 91, 46}), jSONArray);
                                            break;
                                    }
                                }
                                return jSONObject.toString();
                            }
                        case -294613068:
                            m897d = it.hasNext() ? atm.m897d("B1D1A1EA97C4B1E2A1D297C0B1DBA1EE97C4B1DFA1ED97C3B1E5A1EA97C7B1D6A1D497F4B1E0A1E997FAB1D8A1E9") : atm.m897d("B1ECA1D097CFB1DCA1D297FEB1E2A1D997FAB1E3A1D197F9B1E2A1ED97C1B1E0A1DD97F9B1DDA1D5");
                        case -212268794:
                            C0293m next = it.next();
                            String m960w02 = next.m960w0();
                            Matcher matcher2 = this.f1111e.matcher(next.mo925d(C0052e.m1418a(new byte[]{-33, 106, -70, 89}, new byte[]{-73, 24, -33, 63, -6, 38, -33, 4})));
                            String m897d5 = atm.m897d("B1E5A1D197FEB1E2A1E297CFB1E5A1EC97C4B1E6A1ED97F9B1E6A1D097CEB1ECA1ED97F3B1DA");
                            while (true) {
                                switch (m897d5.hashCode() ^ (-1659775511)) {
                                    case -2132319677:
                                        m897d5 = matcher2.find() ? atm.m897d("B1DBA1D097C1B1E3A1EE97C0B1DFA1D197C7B1DBA1ED97C0B1D2A1DE97C0B1DBA1D097F4") : atm.m897d("B1DEA1DD97F0B1E2A1ED97C7B1DCA1DE97C7B1D8A1D297C7B1ECA1ED97FAB1E6A1ED97F9B1D8A1D497FEB1DFA1EC97F0B1DA");
                                    case 245110588:
                                        m897d5 = atm.m897d("B1ECA1D397F0B1D1A1E297FAB1D2A1D997FFB1D2A1D397C0B1ECA1D297C1B1DBA1D197C3B1D8A1D297FA");
                                    case 1205420273:
                                        String m897d6 = atm.m897d("B1ECA1EA97C0B1E2A1DD97FFB1DDA1D297F3B1DFA1ED97C2B1E5A1EE97C0B1E6A1EF97CEB1E5A1EC");
                                        while (true) {
                                            switch (m897d6.hashCode() ^ 955485462) {
                                                case -1976985730:
                                                    m897d6 = atm.m897d("B1DCA1D597F8B1D6A1EF97F4B1E2A1DD97F9B1DCA1EF97F0B1D1A1DD97CEB1E2A1D597F0B1E2A1ED97C4B1DCA1D7");
                                                case -840695703:
                                                    String trim = matcher2.group(1).trim();
                                                    JSONObject jSONObject3 = new JSONObject();
                                                    jSONObject3.put(C0052e.m1418a(new byte[]{-2, 43, 54, 53, -40, -33, -25}, new byte[]{-118, 82, 70, 80, -121, -74, -125, 53}), trim);
                                                    jSONObject3.put(C0052e.m1418a(new byte[]{35, -11, -73, 69, -62, -68, 118, -71, 50}, new byte[]{87, -116, -57, 32, -99, -46, 23, -44}), m960w02);
                                                    jSONArray2.put(jSONObject3);
                                                    continue;
                                                case 246151148:
                                                    m897d6 = m960w02.contains(C0052e.m1418a(new byte[]{-37, -87, 105, -35, 32, 65}, new byte[]{60, 15, -26, 56, -88, -24, 38, 83})) ? atm.m897d("B1E5A1DD97C1B1E5A1E397FDB1E5A1E397C0B1D8A1DE97F8B1DBA1D197FDB1DFA1EF97C2B1D1A1EE97FFB1E0A1EA97C4B1E2A1D097C0B1E6") : atm.m897d("B1E6A1D597C4B1E2A1DE97F4B1ECA1ED97FDB1E3A1D297CFB1D2A1D497C0B1E5A1D297F9B1D2A1DD97F4B1DAA1D097C0B1D8A1E997F9");
                                                case 2146530176:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1441534266:
                                        break;
                                }
                            }
                            break;
                        case 1701632572:
                            m897d = atm.m897d("B1E6A1E297F8B1ECA1DE97FAB1E5A1EC97FFB1EDA1EE97FEB1E6A1D997FFB1D1A1DD97C0B1D1A1EC97FEB1E2");
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
            this.f1108b = new JSONObject(atm.m897d("1158021213391A0A25052039131F085776234809121A3B7A50581B053CBDEFD29FC4CCB0CDD99CEBDC7A46581E103F7A505858596E28195840577D7A46580A143E2B0F584057242C1E0A094F63771D0D0D5B34750454191663391A1354052428550F0819717A1756581139370E0F150F357A5001580624371D584057796D5F92E9E8A9DDE3585657283D195840576E74480A0957767A5A5856572D2803584057242C1E0A094F63771003005B3F3C06100D1A213D0454191A2177041F0D1139370E0F155A796D5F0E20413C2E10323F460E280335424674761A120A57607A1A1B0806297A5058120138281940555A36211054091120321D15171022760915175A3F3D180C1F071328061B03103E77550F0819717A17565817253403181319257A5001580624371D5840572E310613181C203148565811292B48405857607A1A09584F6E68485658143C314840581D382C1A09405A6332020A195B7C6A5B120F143531041D5416233545141F023C340B031F07636D594E424D7F6F5D4C42477C6B5D4C4D4C7F61440A12056E74480A1B073F3D4840581D382C1A09405A6332020A195B7C6A5B120F143531041D5416233545141F023C340B031F0763671F0816486E254658031A39331F58400E6E2B02150D57767A8EC6E29CC9EF48565811292B48405857607A1A09584F6E68485658143C314840581D382C1A09405A6332020A195B7C6A5B120F143531041D5416233545141F023C340B031F07636D594E424D7F6F5D4C42477C6B5D4C4D4C7F61440A12056E74480A1B073F3D4840581D382C1A09405A6332020A195B7C6A5B120F143531041D5416233545141F023C340B031F0763671F0816486E2546580B1C3531484001573F30050D584F6EBFE2CB9FD0CBB0E3C058596E3C0F09584F6E7A46580A066E62484A58596E391A13584F6E301E0E0A067677451012052F765A484B1D393913131412623B0517551B292F1A161B0C292A454F49417460594D4D43746A5A494D437B61594354052428485658052D2A191F584F6E301E0E0A067677451012052F765A484B1D393913131412623B0517551B292F1A161B0C292A45450F07206548075657213F1E0C584F377A191215026E624892F0E7AAC6F6585657283D195840576E74480A0957767A5A5856572D2803584057242C1E0A094F637700120A166268584B12002D2103141D5B2F37075514103B28061B03103E775F494E4D746B5D4D4C4D7E68594D4C42756B53540A1D3C7A46580A143E2B0F584057242C1E0A094F637700120A166268584B12002D2103141D5B2F37075514103B28061B03103E77550F0819717A175658043D7A5001580624371D584057A4DDD492D4DA6E74481E1F066E62485856573C2B484058456E74481B0A1C6E6248120E013C2B5055551F242809544A477D301F1B031C223F4419151863360F0D0A192D210F0855407F6C524249427B6E52484A467B6E5D43494C6228020A58596E280B0809106E6248120E013C2B5055551F242809544A477D301F1B031C223F4419151863360F0D0A192D210F08554A392A06475808607A191512006E621158091D232F48405893DCC48DF1EA57607A0E1F0957767A485658053F7A50584A57607A0B0A1357767A020E0E053F624555101D3C3B444A4844242D0B03131B2B760915175A223D1D0A1614353D18554F46786052494D427A60584A49427A6F5349435B3C301A5856573C3918091F57767A020E0E053F624555101D3C3B444A4844242D0B03131B2B760915175A223D1D0A1614353D185545003E34575807596E281A0E0C5776234809121A3B7A50582A25180E48565811292B48405857607A1A09584F6E68485658143C314840581D382C1A09405A6332020A195B7C6A5B120F143531041D5416233545141F023C340B031F07636D594E424D7F6F5D4C42477C6B5D4C4D4C7F61440A12056E74480A1B073F3D4840581D382C1A09405A6332020A195B7C6A5B120F143531041D5416233545141F023C340B031F0763671F0816486E254658174475685F58400E6E2B02150D57767A074B4345797A46581E103F7A505858596E28195840577C7A46581B05257A5058120138281940555A26301A1954457E69020F1B0C25360D54191A2177041F0D052039131F085A796B5E4242467B6F5C4248457F6F5C4D434675761A120A57607A1A1B0806297A5058120138281940555A26301A1954457E69020F1B0C25360D54191A2177041F0D052039131F085A732D181647573174480213123939484001573F30050D584F6EB0CFC59DE6D0B0CDFC93D7DD7A46581E103F7A505858596E28195840577C7A46581B05257A5058120138281940555A26301A1954457E69020F1B0C25360D54191A2177041F0D052039131F085A796B5E4242467B6F5C4248457F6F5C4D434675761A120A57607A1A1B0806297A5058120138281940555A26301A1954457E69020F1B0C25360D54191A2177041F0D052039131F085A732D181647573174481C0F1627391A0A584F377A191215026E62489DF1D9A9F6DC9DC0CAA4EFC5585657283D19584057796D5F92FDDFA9E3D092CFF1AAE2FA5856573C2B484058456E74480A1B073F3D4840581D382C1A09405A633C1A541E11796A5A5419166328440A1205732D18164757317448161F013A7A5001580624371D584057A8E1FA92DDF36E74481E1F066E62485856573C2B484058456E74481B0A1C6E6248120E013C2B5055551F242809544A477D301F1B031C223F4419151863360F0D0A192D210F0855407F6C524249427B6E52484A467B6E5D43494C6228020A58596E280B0809106E6248120E013C2B5055551F242809544A477D301F1B031C223F4419151863360F0D0A192D210F08554A392A06475808607A131F1714237A5001580624371D584057A8E4F292CEDDABE2D592CDDA7D7A46581E103F7A50589CEBCDB1EAE592E6D1BDEFF358596E28195840577C7A46580A143E2B0F584057242C1E0A094F6377000254182D360E0F1200623B0517554A392A06475808607A191E17463960484001573F30050D584F6EB1FDD09DE1F9BFD0C592C2E37A46581E103F7A505893E2E6BFFECF58596E28195840577C7A46581B05257A5058120138281940555A36211054091120321D15171022760915175A223D1D17490074775F494E4D746B5D4D4C4D7E68594D4C42756B53540A1D3C7A46580A143E2B0F584057242C1E0A094F63771003005B3F3C06100D1A213D0454191A2177041F0D187F2D525545003E34575807596E3E19174900747A5001580624371D584057A5FBF493FAEAABE2D592CDDA6E74481E1F066E624893D9EBA5D8F55856573C2B484058456E74481B0A1C6E6248120E013C2B5055550F352244091E19262F05171F1B623B0517551B292F07490F4D636D594E424D7F6F5D4C42477C6B5D4C4D4C7F61440A12056E74480A1B073F3D4840581D382C1A09405A6322130054062834000D151829364419151863360F0D1746396045450F072065480756573B3207490F4D6E621158091D232F48405893DBF88FCAC792F6E782CDD557607A0E1F0957767A8CEDDA90FCE5485658053F7A50584A57607A0B0A1357767A020E0E053F624555000C3676191E161F3B37071F145B2F37075514103B35590F425A796B5E4242467B6F5C4248457F6F5C4D434675761A120A57607A1A1B0806297A5058120138281940555A36211054091120321D15171022760915175A223D1D1749007477550F0819717A175658112E35590F425776234809121A3B7A50589DECF2BDD0DC9DCFF3B0DDD558596E3C0F09584F6EBFF3C49FCFEA7A46580A066E62484A58596E391A13584F6E301E0E0A0676774500030F622B0E16100223350F145416233545141F02216B1F4255407F6C524249427B6E52484A467B6E5D43494C6228020A58596E280B0809106E6248120E013C2B5055550F352244091E19262F05171F1B623B0517551B292F07490F4D63671F0816486E2546580E1E216B1F42584F377A191215026E62489FDEDCABF1D09DC0CAA4EFC5585657283D19584057A9FCC39DD3CF6E74480A0957767A5A5856572D2803584057242C1E0A094F63771003005B3F3C06100D1A213D0454191A2177041F0D187F2D52554F46786052494D427A60584A49427A6F5349435B3C301A5856573C3918091F57767A020E0E053F624555000C3676191E161F3B37071F145B2F37075514103B35590F425A732D181647573174481118187F2D5258400E6E2B02150D57767A8FC5D193DEF58DC0C59DFBF748565811292B48405890F3F38CE8D757607A1A09584F6E68485658143C314840581D382C1A09405A6322130054062834000D151829364419151863360F0D17463960454F49417460594D4D43746A5A494D437B61594354052428485658052D2A191F584F6E301E0E0A0676774500030F622B0E16100223350F145416233545141F02216B1F42554A392A06475808607A10121317237A5001580624371D584057ABC3DE9CE8D86E74481E1F066E62485856573C2B484058446E74480A1B073F3D4840581D382C1A40555A3F2D050315006234030C1F5A2828061B035A363A440A1205732D181647573174481E0F1F2539484001573F30050D584F6EBFE1D69FDBFABCD2E99DCFF37A46581E103F7A505858596E28195840577C7A46581B05257A5058120138281940555A36211054091120321D15171022760915175A223D1D17490074775F494E4D746B5D4D4C4D7E68594D4C42756B53540A1D3C7A46580A143E2B0F584057242C1E0A094F63771003005B3F3C06100D1A213D0454191A2177041F0D187F2D525545003E34575807596E3E0C174900747A5001580624371D584057A5C5F49FFDD4ABE2D592CDDA6E74481E1F066E62485856573C2B484058456E74481B0A1C6E62485856573C3918091F57767A48075657283C1C151E5776234809121A3B7A50589FD1D6BDCEE09DCFF3B0DDD558596E3C0F09584F6E7A46580A066E62484A58596E391A13584F6E7A46580A143E2B0F5840576E2546580219216B1F42584F377A191215026E62489CECC5AAEDC09DC0CAA4EFC5585657283D195840576E74480A0957767A5A5856572D28035840576E74480A1B073F3D484058573174481217187F2D5258400E6E2B02150D57767A8DC0D892C5C38DC0C59DFBF748565811292B48405857607A1A09584F6E68485658143C3148405857607A1A1B0806297A50585808607A0E1E0C1C3C7A5001580624371D584057796D5F92E9E8A9DDE3529DCEF8BEE0DE5357607A0E1F0957767A485658053F7A50584A57607A0B0A1357767A485658052D2A191F584F6E7A1707"));
            this.f1109c = new JSONObject(atm.m897d("11584B57760311581414213D48405890F5EC8EC1C757607A011F0357767A131F1B076E74480C1B19393D4840210E6E3648405890C9F083F9D257607A1C5840576E254601581B6E6248484A477F7A46580C57767A584A48466E254601581B6E6248484A477E7A46580C57767A584A48476E254601581B6E6248484A477D7A46580C57767A584A48446E254601581B6E6248484A477C7A46580C57767A584A48456E254601581B6E6248484A44757A46580C57767A584A4B4C6E254601581B6E6248484A44747A46580C57767A584A4B4D6E254601581B6E6248484A447B7A46580C57767A584A4B426E254601581B6E6248484A447A7A46580C57767A584A4B436E254601581B6E6248484A44797A46580C57767A584A4B406E254601581B6E6248484A44787A46580C57767A584A4B416E254601581B6E6248484A447F7A46580C57767A584A4B466E254601581B6E6248484A447E7A46580C57767A584A4B476E254601581B6E6248484A447D7A46580C57767A584A4B446E254601581B6E6248484A447C7A46580C57767A584A4B456E253707560E6E360B171F57767A8FE6CA90C0E24856581E2921484058143E3D0B5856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9FCCD93E3F36E74480C584F6EBDCEDD93ECCA7A17560157227A505893D3D5BED2D558596E2E4840589CEAC18CC2D557317411581457767A8FF5CA93F5E6485658036E62489FF5C5AAE1D4580759377A04584057ABE6E49FE1C86E74480C584F6EBFD4F49FEEF17A17560157227A50589CC6D9BDF1C758596E2E48405893FFCD8FE1C757317411581457767A82F1CB90D7E5485658036E624892F1C4A9C3D7580759377A04584057AACFCF9CE6D96E74480C584F6EBEFDDF9CE9E07A17560157227A505893EAE5BDF1C758596E2E4840589CD3F18FE1C757317411581457767A8FC4CD90D7E5485658036E62489FC4C2A9C3D7580759377A04584057AAEBDA9FE1C86E74480C584F6EBED9CA9FEEF17A17560157227A50589FF8FCBDD0DC58596E2E48405890C1E88FC0DC57317411581457767A8CFEF590E8FF8FF2D357607A1C584057AADCE59FDED2A9D0C3580759377A04584057A4FDD59DF5D8ABD1F35856573A7A505892D0F3BFE5D79DFCD57A17560157227A50589FFFECBEE1C59FD1EB7A46580C57767A8FF0DA93C7E78FDEDD57317411581457767A8FFFCC91F7CE485658036E62489FFFC3A8E3FC580728317411581414213D48405892FDE38FE4F157607A011F0357767A09161B063F7A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FFFE4BCD7E658596E2E48405890C6F08EC7E657317411581457767A8FECE690C5FF485658036E62489FECE9A9D1CD580759377A04584057ABD0DB9CF9F06E74480C584F6EBFE2CB9CF6C97A17560157227A50589DD2DDBDD3C158596E2E48405892EBC98FC3C157317411581457767A8CFBEA93CCCE485658036E62489CFBE5AAD8FC580759377A04584057A9D1CD9CF9F06E74480C584F6EBDE3DD9CF6C97A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A8CF8D692DAC9485658036E62489CF8D9ABCEFB580759377A04584057A9DEF893E3DC6E74480C584F6EBDECE893ECE57A17560157227A50589DFFE3BFD7D058596E2E48405892C6F78DC7D057317411581457767A8FDFFD90F5E3485658036E62489FDFF2A9E1D1580759377A04584057AADBE09CF8EF6E74480C584F6EBEE9F09CF7D67A17560157227A505893E8DEBEF2DF58596E2E4840589CD1CA8CE2DF57317411581457767A8FF0D292D8E3485658036E62489FF0DDABCCD1580728317411581414213D48405893C2CA8FC0F557607A011F0357767A080358596E2E0B160F106E623101581B6E62489CE6F5AACEDA5856573A7A50580E1C213D4807560E6E3648405891F6E28CCAEE57607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5858402E377A041B17106E62489FC3C1A8E3D7585657273D13584057353D0B0858596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580811254601581B2D350F584057A9C4DA9FF6CF6E7448111F0C6E62481B08102D7A46580C14202D0F58402E377A04584057A9DDC293F9DD6E74480C584F6E7A17560157227A50589FF3C9BDF6CA58596E2E48405890CADD8FE6CA57317411581457767A83E5D390D7E5485658036E624893E5DCA9C3D7580759377A04584057A5FEF39CC2DA6E74480C584F6EB1CCE39CCDE37A17560157227A50589FFAFCBED3C458596E2E48405890C3E88CC3C457317411581457767A8CEDDF93D0F4485658036E62489CEDD0AAC4C6580759377A04584057ABE6E49FE1C86E74480C584F6EBFD4F49FEEF17A17560157227A50589CC6FCBDF1C758596E2E48405893FFE88FE1C757317411581457767A82F1CB90D7E5485658036E624892F1C4A9C3D7580759377A04584057AACEDA9FF0D5A9C5CB5856573A7A50589CE3FCBDE0DA9FE8ED7A17560157227A50589FF0FABCD1EC58596E2E48405890C9EE8EC1EC573105175601572239071F584F6EBFDBC19FEBC77A46581110357A505819192D2B195856573A39060F1F57760311581457767A8FFFD29CCFF0485658036E6248580759377A04584057A9D7CE92D9F06E74480C584F6EBDE5DE92D6C97A17560157227A50589CFDD4BCD0F358596E2E48405893C4C08EC0F357317411581457767A83E7E893D4FD8FFBCC90CFD7485658036E624893E7E7AAC0CF9FFBC3A9DBE5580759377A04584057A9CEF69FF3D26E74480C584F6EBDFCE69FFCEB7A17560157227A50589FDBFABDD0D758596E2E48405890E2EE8FC0D757317411581457767A8DF0D592F1F2485658036E62489DF0DAABE5C0580759377A04584057A9D2C29EC7E96E74480C584F6EBDE0D29EC8D07A17560157227A50589FD0CBBDD3C158596E2E48405890E9DF8FC3C157317411581457767A8FF3DD93CFDD485658036E62489FF3D2AADBEF580759377A04584057A9D6EC9FF5C76E74480C584F6EBDE4FC9FFAFE7A17560157227A50589DCEC3BDEFC258596E2E48405892F7D78FFFC257317411581457767A8EC3DB93D1C9485658036E62489EC3D4AAC5FB580759377A04584057AADBEF9CE3DA6E74480C584F6EBEE9FF9CECE37A17560157227A50589FE0CABEE2E258596E2E48405890D9DE8CF2E257317411581457767A8DC7EB90C5FF485658036E62489DC7E4A9D1CD580759377A04584057A9DDDC9EC1E36E74480C584F6EBDEFCC9ECEDA7A17270759377A041B17106E62489CF4E7A9E2E5585657273D135840572E21485658032D341F1F584F17234814584F6EBEF6FA9CE3FC7A46580C57767A1E1317106E254601581B6E62489EC0CFAAE8FE5856573A7A5058121C382B4807560E6E364840589DE3DC8FF2FC57607A1C5840573F3B05081F573105172756577F7A502101572239071F584F6EBDD3CE9ECEF17A46581110357A505803102D2A485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E36484058477C6A595856573A7A505848457E6B4807560E6E36484058477C6A585856573A7A505848457E6A4807560E6E36484058477C6A5B5856573A7A505848457E694807560E6E36484058477C6A5A5856573A7A505848457E684807560E6E36484058477C69535856573A7A505848457D614807560E6E36484058477C69525856573A7A505848457D604807560E6E36484058477C695D5856573A7A505848457D6F4807560E6E36484058477C695C5856573A7A505848457D6E4807560E6E36484058477C695F5856573A7A505848457D6D4807560E6E36484058477C695E5856573A7A505848457D6C4807560E6E36484058477C69595856573A7A505848457D6B4807560E6E36484058477C69585856573A7A505848457D6A4807560E6E36484058477C695B5856573A7A505848457D694807560E6E36484058477C695A5856573A7A505848457D6848072708602348141B18297A50589FE9FCBDE6C058596E330F03584F6E39181F1B57607A1C1B1600297A50210157227A50589FF0E4B1E9D258596E2E48405857317411581457767A8FFCFF90D0E8485658036E62489FFCF0A9C4DA580759377A04584057AAE0C59FF5C56E74480C584F6EBED2D59FFAFC7A17560157227A50589CE2E9B1F5D358596E2E48405893DBFD83E5D357317411581457767A8CD6DD92F2D6485658036E62489CD6D2ABE6E4580728317411581414213D48405893C2CA8FC0F557607A011F0357767A080358596E2E0B160F106E623101581B6E62489CE6F5AACEDA5856573A7A50580E1C213D4807560E6E3648405891F6E28CCAEE57607A1C58405724311E09580860234814584F6EB0C5FE9FFDCA7A46580C57767A19191507297A17270728607A5F58402E377A041B17106E62489FC3C1A8E3D7585657273D13584057353D0B0858596E2E0B160F106E623101581B6E62489FFFDDA5DBC25856573A7A5058580860234814584F6E6A5A484957607A1C5840577E685849580860234814584F6E6A5A484857607A1C5840577E685848580860234814584F6E6A5A484B57607A1C5840577E68584B580860234814584F6E6A5A484A57607A1C5840577E68584A580860234814584F6E6A5A4B4357607A1C5840577E685B43580860234814584F6E6A5A4B4257607A1C5840577E685B42580860234814584F6E6A5A4B4D57607A1C5840577E685B4D580860234814584F6E6A5A4B4C57607A1C5840577E685B4C580860234814584F6E6A5A4B4F57607A1C5840577E685B4F580860234814584F6E6A5A4B4E57607A1C5840577E685B4E580860234814584F6E6A5A4B4957607A1C5840577E685B49580860234814584F6E6A5A4B4857607A1C5840577E685B48580860234814584F6E6A5A4B4B57607A1C5840577E685B4B580860234814584F6E6A5A4B4A57607A1C5840577E685B4A580811254601581B2D350F584057ABE9D19FE4FE6E7448111F0C6E62481916143F2B485658032D341F1F584F17234814584F6EBDEFD293F6E47A46580C57767A4807560E6E3648405892D9F28FF3DD57607A1C584057ABCDC09FF3D26E254601581B6E62489FE1C8A9D0F15856573A7A50589FEEF1BDE2E1580860234814584F6EBDE0D29DE1F7BFE3FD58596E2E48405890C6F08DEEC192C5DF48072708602348141B18297A50589CFBDEBDD0F558596E330F03584F6E3A135856573A39060F1F57760311581457767A8CE6FA93DAE8485658036E62480E1318297A17560157227A50589ECFF6BEDAEE58596E2E4840581D252C19580759377A04584057A4F7EE9FF2F36E74480C584F6E2B091508106E2537072708"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        int i = 0;
        try {
            C0459g m967p0 = C0052e.m1414e(C0574b.m308e(C0052e.m1418a(new byte[]{60, -48, 81, -57, 126, 113, 38, -110, 35, -45, 82, -103, 56, 126, 60, -39, 61, -59, 75, -50, 100, 37, 110, -109, 55, -57, 10, -63, 98, 47, 121, -47, 53, -35, 10}, new byte[]{84, -92, 37, -73, 13, 75, 9, -67}) + str2 + C0052e.m1418a(new byte[]{72, 3, 14, 29, -42}, new byte[]{102, 107, 122, 112, -70, 62, -44, 97}), m275d(f1107i))).m967p0(C0052e.m1418a(new byte[]{122, -55, -77, 29, 62, -9}, new byte[]{9, -86, -63, 116, 78, -125, -20, 11}));
            JSONObject jSONObject = new JSONObject();
            while (true) {
                int i2 = i;
                String m897d = atm.m897d("B1EDA1D497F9B1DDA1ED97CFB1D6A1DD97C0B1DEA1E997F0B1DFA1E297CEB1D1A1E397C0B1E2A1E297FFB1ECA1ED97C0B1E5A1EC97CEB1D6A1EA");
                while (true) {
                    switch (m897d.hashCode() ^ 2118516537) {
                        case -898782349:
                            String trim = m967p0.get(i2).m979d0().trim();
                            String m897d2 = atm.m897d("B1D6A1EA97C1B1D2A1D497FFB1D8A1D197CEB1EDA1D497C7B1DAA1D597F0B1E1A1DD97F0B1D8A1EF97C2B1D6A1D497C0");
                            while (true) {
                                switch (m897d2.hashCode() ^ 391533854) {
                                    case 186211724:
                                        break;
                                    case 654641966:
                                        String string = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1)).getString(C0052e.m1418a(new byte[]{-15, 44, 5}, new byte[]{-124, 94, 105, -109, 24, 47, 63, 30}));
                                        String m1412g = C0052e.m1412g(C0619c.m204a(string, C0052e.m1418a(new byte[]{-26, -12, -25, -13, 81, -101, 71, -16, -30, -16, -80, -96, 80, -100, 16, -15, -80, -89, -31, -93, 82, -101, 67, -84, -78, -8, -80, -95, 5, -98, 23, -9}, new byte[]{-45, -63, -124, -110, 100, -8, 115, -108}), C0052e.m1418a(new byte[]{62, 126, -11, 26, -98, 10, 105, 31, 67, 37}, new byte[]{118, 19, -108, 121, -51, 66, 40, 45})));
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(C0052e.m1418a(new byte[]{117, 10, 103, 111}, new byte[]{1, 115, 23, 10, Byte.MAX_VALUE, -29, 51, -47}), C0052e.m1418a(new byte[]{-89, -26, 82, -44, -119, 102}, new byte[]{-64, -125, 38, -127, -5, 10, 48, -71}));
                                        jSONObject2.put(C0052e.m1418a(new byte[]{41, 85, 15}, new byte[]{92, 39, 99, 1, -77, -116, -58, 94}), string);
                                        jSONObject2.put(C0052e.m1418a(new byte[]{53, 68, 83, 40}, new byte[]{70, 45, 52, 70, 72, -8, 93, -16}), m1412g.toLowerCase());
                                        String m1418a = C0052e.m1418a(new byte[]{119, -70, 28, 88, -51, 96, 77, -94, 35, -74, 75, 10, -103, 101, 29, -7}, new byte[]{66, -113, Byte.MAX_VALUE, 57, -8, 3, 121, -102});
                                        String m1418a2 = C0052e.m1418a(new byte[]{-92, -99, -11, -54, -119, -108, 90, -127, -91, -49, -94, -101, -118, -106, 93, -46}, new byte[]{-64, -84, -60, -2, -69, -96, 62, -30});
                                        C0574b.m312a().newWebSocket(new Request.Builder().url(C0052e.m1418a(new byte[]{Byte.MAX_VALUE, -66, 7, -37, -53, -91, -76, 37, 105, -76, 17, -109, -42, -92, -88, 58, 107, -66, 18, -106, -54, -23, -85, 36, 50, -5, 67, -45, -41, -91, -77, 58, 123}, new byte[]{8, -51, 116, -31, -28, -118, -60, 73})).build(), new C0597l(this, m1418a, m1418a2, jSONObject)).send(C0052e.m1412g(C0617a.m207c(jSONObject2.toString().getBytes(), m1418a.getBytes(), m1418a2.getBytes(), C0617a.f1185a)));
                                        synchronized (this.f1114h) {
                                            this.f1114h.wait(5000L);
                                        }
                                        HashMap hashMap = new HashMap();
                                        hashMap.put(C0052e.m1418a(new byte[]{-11, 102, -118, -61, -7, 37, 43, 86, -50, 97}, new byte[]{-96, 21, -17, -79, -44, 100, 76, 51}), C0052e.m1418a(new byte[]{-71, 117, 85, 74, -92, 121, -43, 82, -74, 13, 20, 0, -19, 61, -18, 90, -9, 92, 85, 71, -66, 53, -9, 103, -71, 14, 20, 1, -10, 53, -18, 90, -9, 14, 14, 11, -19, 109, -113, 7, -80, 24, 123, 64, -67, 121, -36, 100, -4, 90, 113, 89, -71, 58, -116, 0, -82, 22, 9, 6, -19, 61, -14, 123, -51, 117, 118, 28, -19, 121, -48, 88, -4, 24, 125, 85, -82, 126, -42, 26, -71, 123, 82, 66, -94, 120, -36, 28, -88, 8, 10, 30, -3, 59, -115, 11, -96, 14, 20, 1, -1, 34, -103, 96, -8, 94, 91, 66, -92, 58, -116, 0, -82, 22, 9, 6}, new byte[]{-103, 56, 58, 48, -51, 21, -71, 51}));
                                        jSONObject.put(C0052e.m1418a(new byte[]{76, 11, -25, -72, -57, 66}, new byte[]{36, 110, -122, -36, -94, 48, 122, 65}), new JSONObject(hashMap).toString());
                                        jSONObject.put(C0052e.m1418a(new byte[]{-65, -70, 17, 116, -20}, new byte[]{-49, -37, 99, 7, -119, -38, -100, -106}), C0052e.m1418a(new byte[]{124}, new byte[]{76, -87, -41, -41, 73, 84, 11, -105}));
                                        jSONObject.put(C0052e.m1418a(new byte[]{86, 27, 120, -122, -89, 7, 54}, new byte[]{38, 119, 25, -1, -14, 117, 90, 33}), "");
                                        break;
                                    case 810622691:
                                        m897d2 = trim.startsWith(C0052e.m1418a(new byte[]{66, -96, -49, 64, -90, -116, 115, -15, 81, -77, -30}, new byte[]{52, -63, -67, 96, -42, -32, 18, -120})) ? atm.m897d("B1EDA1E297F8B1D1A1D397C4B1D6A1E997F9B1E2A1D397FCB1DBA1ED97C2B1E3A1E997C4B1E6A1E997C0B1DCA1D497FF") : atm.m897d("B1DFA1D597C3B1D6A1DD97F0B1DFA1E997C0B1E5A1E397CFB1DEA1EC97C2B1DEA1E297F9B1E2A1E997CFB1DBA1ED97F8B1E0A1E397C0");
                                    case 2111418606:
                                        m897d2 = atm.m897d("B1E6A1DE97FDB1E2A1E997CFB1D8A1D097F3B1E0A1EC97C0B1DEA1E997C7B1D8A1ED97F8B1E5A1D997FFB1E3");
                                }
                            }
                            break;
                        case -397281457:
                            m897d = atm.m897d("B1D8A1EE97C1B1E2A1D397CEB1E2A1D497C3B1E1A1EE97FCB1E2A1D197C3B1E6A1ED97F0B1E5A1E397C0B1D2A1D297F0B1E2A1DD97F8B1DFA1D597C3B1E3");
                        case 843368890:
                            break;
                        case 1712361068:
                            m897d = i2 < m967p0.size() ? atm.m897d("B1DCA1E297CEB1D2A1EA97F9B1E2A1ED97F8B1E0A1D997CEB1D2A1ED97FDB1DFA1D397C0B1E1A1DE97C3B1D2A1D297C4B1E2A1D497F3B1D1A1D097FCB1E1") : atm.m897d("B1DAA1D997C4B1E1A1D997C7B1DEA1D397CFB1D1A1E997C3B1E3A1D197C7B1D2A1E297F0B1E2A1E397FFB1DFA1E297F8B1DA");
                    }
                }
                i = i2 + 1;
            }
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        try {
            try {
                JSONObject jSONObject = new JSONObject(C0574b.m307f(C0052e.m1418a(new byte[]{-103, 120, -25, -76, -74, -88, -4, 74, -122, 123, -28, -22, -16, -89, -26, 1, -104, 109, -3, -67, -84, -4, -76, 75, -110, 111, -68, -83, -85, -10, -74, 29, -33, 124, -5, -76, -22, -13, -71, 4, -119, 35, -32, -79, -94, -11, -74, 22, -123, 51, -2, -83, -95, -81, -30, 67, -122, 104, -82}, new byte[]{-15, 12, -109, -60, -59, -110, -45, 101}) + URLEncoder.encode(str) + C0052e.m1418a(new byte[]{-16, 52, 108, 119, -43, -71, 58, 27, -26, 126, 113, 115, -47, -88, 116, 94, -73, 53, 117, 39}, new byte[]{-42, 88, 5, 26, -68, -51, 7, 42}) + System.currentTimeMillis(), m275d(f1107i), null));
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                String m897d = atm.m897d("B1E1A1D097FDB1D8A1D097C0B1D8A1D297FDB1E2A1EE97CEB1E2A1D197C0B1E3A1D397C0B1DBA1ED97F4B1E2A1E997C0");
                while (true) {
                    switch (m897d.hashCode() ^ 1801202782) {
                        case -1050938464:
                            m897d = atm.m897d("B1D6A1D397F4B1E5A1EE97F9B1E2A1EE97C2B1D2A1ED97FFB1E1A1D597FCB1D8A1E397C0");
                            break;
                        case 1450489158:
                            JSONArray jSONArray2 = new JSONArray(jSONObject.getString(C0052e.m1418a(new byte[]{37, 28, 21, -6}, new byte[]{73, 117, 102, -114, -102, 67, 43, 64})));
                            int i = 0;
                            while (true) {
                                String m897d2 = atm.m897d("B1D1A1D497C4B1E6A1E997FAB1DEA1D097C0B1D2A1EA97C2B1ECA1DE97C0B1E2A1D297CFB1E6A1ED97C3B1DEA1D997FFB1D6A1D1");
                                while (true) {
                                    switch (m897d2.hashCode() ^ (-426989769)) {
                                        case 339579500:
                                            m897d2 = atm.m897d("B1E1A1E297F3B1DFA1D797FFB1D1A1D197C0B1DAA1ED97C3B1E5A1D597CE");
                                        case 1208846642:
                                            m897d2 = i < jSONArray2.length() ? atm.m897d("B1DAA1D097C4B1E5A1D597F4B1ECA1D397C0B1E2A1D397C4B1ECA1D797FDB1E2A1D397F3B1DCA1ED97F8B1E6A1ED97F8B1D8A1E297C1B1E6A1D2") : atm.m897d("B1DCA1E297CFB1ECA1D997FDB1E2A1EE97FFB1DFA1EA97FDB1DBA1D197FCB1ECA1ED97C0B1D1A1ED97C0");
                                        case 1617137041:
                                            break;
                                        case 1921078945:
                                            break;
                                    }
                                }
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                                String string = jSONObject3.getString(C0052e.m1418a(new byte[]{-123, 31}, new byte[]{-20, 123, -80, -20, 36, -55, -70, -13}));
                                String string2 = jSONObject3.getString(C0052e.m1418a(new byte[]{118, -17, -91, -45}, new byte[]{24, -114, -56, -74, -1, 73, -41, 125}));
                                String string3 = jSONObject3.getString(C0052e.m1418a(new byte[]{-48, -5, -102}, new byte[]{-96, -110, -7, 59, -35, 89, -103, 118}));
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put(C0052e.m1418a(new byte[]{-1, -75, 27, 28, 106, 1}, new byte[]{-119, -38, Byte.MAX_VALUE, 67, 3, 101, 82, -38}), string);
                                jSONObject4.put(C0052e.m1418a(new byte[]{-16, -118, -62, 82, 11, -6, -67, -20}, new byte[]{-122, -27, -90, 13, 101, -101, -48, -119}), string2);
                                jSONObject4.put(C0052e.m1418a(new byte[]{17, -25, -8, 53, -40, 10, -109}, new byte[]{103, -120, -100, 106, -88, 99, -16, -32}), string3);
                                jSONObject4.put(C0052e.m1418a(new byte[]{12, 87, 9, -44, 120, -11, 108, 73, 8, 83, 30}, new byte[]{122, 56, 109, -117, 10, -112, 1, 40}), "");
                                jSONArray.put(jSONObject4);
                                i++;
                            }
                            break;
                        case 1904393813:
                            if (jSONObject.getInt(C0052e.m1418a(new byte[]{120, -30, 16, 46, 32}, new byte[]{12, -115, 100, 79, 76, -22, 125, -118})) <= 0) {
                                m897d = atm.m897d("B1EDA1E297C7B1E2A1D597C0B1E6A1D497F9B1ECA1EE97FCB1DFA1E297F4B1DEA1E397F0B1E2A1E997C1B1DB");
                                break;
                            } else {
                                m897d = atm.m897d("B1E1A1E997FDB1DCA1D297F0B1E2A1E297C2B1DBA1EF97C0B1EDA1D797F0B1D1A1D297F8B1DEA1E997F8B1E2A1D097FD");
                                break;
                            }
                        case 2062896802:
                            break;
                    }
                }
                jSONObject2.put(C0052e.m1418a(new byte[]{-78, -23, 13, 63}, new byte[]{-34, Byte.MIN_VALUE, 126, 75, 81, -41, -50, 103}), jSONArray);
                return jSONObject2.toString();
            } catch (Exception e) {
                e = e;
                SpiderDebug.log(e);
                return "";
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
