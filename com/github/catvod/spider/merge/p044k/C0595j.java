package com.github.catvod.spider.merge.p044k;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Dora;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p048m.C0617a;
import com.github.catvod.spider.merge.p048m.C0618b;
import com.github.catvod.spider.merge.p050n.C0629f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.j */
/* loaded from: classes.dex */
public final class C0595j extends Dora {

    /* renamed from: h */
    private static final String f1096h;

    /* renamed from: b */
    private String f1097b = "";

    /* renamed from: c */
    protected Pattern f1098c = Pattern.compile(C0052e.m1418a(new byte[]{84, 30, -14, 63, 18, -119, 9, 13, 2, 82, -69, 23, 36, -59, 79, 80}, new byte[]{123, 125, -109, 75, 119, -18, 102, Byte.MAX_VALUE}));

    /* renamed from: d */
    protected Pattern f1099d = Pattern.compile(C0052e.m1418a(new byte[]{81, 111, -52, -52, 41, -27, 88, 100, 93, Byte.MAX_VALUE, -63, -49, 116, -81, 5, 36, 22, 51, -28, -17, 113, -10, 88}, new byte[]{57, 27, -72, -68, 90, -33, 119, 75}));

    /* renamed from: e */
    protected Pattern f1100e;

    /* renamed from: f */
    protected Pattern f1101f;

    /* renamed from: g */
    protected Pattern f1102g;

    static {
        String m897d = atm.m897d("B1E6A1E997FFB1E0A1D997F0B1E2A1D197FDB1D2A1D997F0B1D2A1EC97CEB1E2A1D497FDB1E6A1E997CEB1DFA1ED97F9B1E5A1D597FFB1D6A1D0");
        while (true) {
            switch ((m897d.hashCode() ^ 506) ^ (-990101804)) {
                case 1522267713:
                    C0052e.m1418a(new byte[]{-46, -11, 16, -49, 117, 84, -36, 122}, new byte[]{-74, -111, 105, -68, 91, 36, -82, 21});
                    m897d = atm.m897d("B1D1A1DE97F0B1DAA1ED97C1B1E0A1D997CEB1ECA1EF97CFB1DCA1D097C0B1D8A1ED97CEB1E2A1E297F4B1D2A1D197F3");
                    break;
                case 1881009016:
                    f1096h = C0052e.m1418a(new byte[]{-53, 75, -46, 120, 95, -93, -125, 82, -57, 91, -33, 123, 2, -23, -34, 18}, new byte[]{-93, 63, -90, 8, 44, -103, -84, 125});
                    m897d = atm.m897d("B1D1A1D497FEB1E2A1E997F0B1ECA1ED97F3B1E0A1D197FDB1D2A1D097FFB1D2A1D497C4B1E6A1D9");
                    break;
                case 2020144607:
                    return;
            }
        }
    }

    public C0595j() {
        Pattern.compile(C0052e.m1418a(new byte[]{-51, -46, 52, 126, 118, 13, 121, 79, -63, -62, 57, 125, 43, 86, 36, 20, -118, -114, 28, 93, 46, 30, 121}, new byte[]{-91, -90, 64, 14, 5, 55, 86, 96}));
        this.f1100e = Pattern.compile(C0052e.m1418a(new byte[]{56, -33, 50, 76, -68, -105, -62, 103, 75, -92, 69, 48, -25, -33, -7, 81, 79}, new byte[]{100, -116, 25, 99, -52, -10, -91, 2}));
        this.f1101f = Pattern.compile(C0052e.m1418a(new byte[]{43, 24, 77, 69, -102, -66, -93, 23, 43, 24, 77, 10, -37}, new byte[]{119, 75, 102, 109, -14, -54, -41, 103}));
        this.f1102g = Pattern.compile(C0052e.m1418a(new byte[]{110, -92, -54, -21, -93, -87, 122}, new byte[]{50, -9, -31, -61, -115, -125, 83, 118}));
    }

    /* renamed from: a */
    protected static HashMap<String, String> m282a() {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1DDA1D397FEB1DCA1D997C3B1D8A1EE97CEB1DAA1E397FFB1DAA1E997C1B1D2A1D997F0B1E2A1EA97C3B1E5A1D997C0B1EDA1D997C2B1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 948) ^ (-718064975)) {
                case -2057518390:
                    hashMap.put(C0052e.m1418a(new byte[]{-71, 9, 106, -101, -8, -102, 64, -43, -126, 14}, new byte[]{-20, 122, 15, -23, -43, -37, 39, -80}), C0052e.m1418a(new byte[]{120, 47, -48, 32, 56, 68, 51, -1, 0, 110, -102, 105, 124, 101, 51, -77, 92, 46, -34, 38, 39, 64, 105, -16, 124, 46, -34, 44, 56, 8, 31, -79, 86, 96, -27, 26, 116, 112, 114, -31, 5, 31, -101, 124, 11, 31, 123, -16, 116, 48, -38, 37, 49, Byte.MAX_VALUE, 55, -78, 126, 41, -34, 102, 97, 27, 101, -2, 6, 118, -118, 97, 31, 96, 6, -99, 121, 108, -118, 37, 61, 67, 55, -16, 114, 37, -55, 34, 59, 1, 114, -109, 93, 50, -59, 36, 49, 7, 107, -31, 27, 112, -124, 125, 96, 31, 96, -2, 4, 113, -98, 105, 7, 73, 52, -79, 71, 41, -123, 124, 103, 31, 124, -29, 3}, new byte[]{53, 64, -86, 73, 84, 40, 82, -48}));
                    m897d = atm.m897d("B1DCA1E397CEB1D2A1D197FDB1E1A1EA97F4B1DAA1EC97C0B1E6A1E997CF");
                    break;
                case -1960880169:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E1A1EE97F0B1E2A1DE97C1B1E6A1E297F9B1DAA1EA97FAB1ECA1ED97F9B1DFA1E397C4B1DDA1ED97F9B1DAA1D3");
                    break;
                case -1855644943:
                    return hashMap;
                case -105573416:
                    hashMap.put(C0052e.m1418a(new byte[]{-43, 50, -45, 114, 55, 82, -27}, new byte[]{-121, 87, -75, 23, 69, 55, -105, -62}), f1096h);
                    m897d = atm.m897d("B1DDA1D397C7B1E5A1D497C2B1E5A1DD97FEB1E0A1D297C0B1DCA1D597C4B1DCA1D397FEB1DAA1EC97CFB1DBA1EF97F9");
                    break;
            }
        }
    }

    /* renamed from: b */
    private static String m281b(Pattern pattern, String str) {
        String m897d = atm.m897d("B1DEA1DD97FEB1DEA1D097F9B1E6A1D297C3B1D2A1DD97FEB1EDA1EC97CEB1DEA1D497C4B1E2A1E297F9B1DFA1ED97C3B1E1A1E3");
        while (true) {
            switch (m897d.hashCode() ^ 533652186) {
                case -736345711:
                    try {
                        Matcher matcher = pattern.matcher(str);
                        String m897d2 = atm.m897d("B1D6A1DE97FDB1E2A1D997F8B1EDA1D097C0B1D2A1ED97F8B1D1A1D097CEB1D8A1D3");
                        while (true) {
                            switch (m897d2.hashCode() ^ 976595857) {
                                case -1710972308:
                                    return matcher.group(1).trim();
                                case -1263540696:
                                    return str;
                                case -541263067:
                                    if (!matcher.find()) {
                                        m897d2 = atm.m897d("B1D1A1E397F8B1DFA1EA97CEB1DFA1D797F4B1DBA1EA97F8B1D2A1D597F9B1DAA1D997F4B1DFA1D297F3B1EDA1D497F8B1DEA1D097C0");
                                        break;
                                    } else {
                                        m897d2 = atm.m897d("B1ECA1D197C0B1E2A1D097C7B1DCA1E297F4B1DCA1D797FEB1E1A1E397CFB1D2");
                                        break;
                                    }
                                case -4235406:
                                    m897d2 = atm.m897d("B1DCA1DE97FAB1E3A1D497CEB1DDA1D197F0B1E2A1D397FEB1DBA1ED97FFB1E5A1DD97C0");
                                    break;
                            }
                        }
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                        return str;
                    }
                    break;
                case 1226066124:
                    m897d = atm.m897d("B1E2A1E297F0B1E2A1DE97F8B1D1A1E997FCB1DCA1ED97FDB1DDA1ED97C1B1DEA1EE97F8B1D8");
                    break;
                case 1335999802:
                    if (pattern != null) {
                        m897d = atm.m897d("B1ECA1E397FAB1E3A1DD97CEB1E5A1D297FAB1DBA1ED97C0B1E2A1EA97F9B1DEA1ED97C3B1DFA1EE97FAB1D1A1D197FDB1E3A1D997CF");
                        break;
                    } else {
                        m897d = atm.m897d("B1ECA1E997CFB1DCA1EF97FDB1E2A1D397C3B1DBA1D597C1B1DFA1DE97CFB1DFA1D597F0B1E2A1D797C7B1E2A1ED97F0B1E5A1D097F0B1DDA1E2");
                        break;
                    }
                case 2132752743:
                    return str;
            }
        }
    }

    /* renamed from: d */
    public static Object[] m279d(String str) {
        try {
            C0594i c0594i = new C0594i();
            C0629f.m183b(C0629f.m184a(), str, m282a(), c0594i);
            Response m194a = c0594i.m194a();
            String m897d = atm.m897d("B1D1A1EC97F0B1DBA1EA97C2B1EDA1D997CEB1E2A1D097CFB1DCA1EF97FDB1E2A1ED97FDB1DFA1ED97C0B1DAA1D597C2B1DFA1D4");
            while (true) {
                switch (m897d.hashCode() ^ (-1434450699)) {
                    case -958501911:
                        return new Object[]{200, C0052e.m1418a(new byte[]{-90, -127, -2, 27, -100, 65, -18, -31, -82, -98, -32, 88, -102, 65, -5, -16, -77, -36, -3, 3, -121, 71, -18, -8}, new byte[]{-57, -15, -114, 119, -11, 34, -113, -107}), new ByteArrayInputStream(C0052e.m1418a(new byte[]{34, -71, 4, 8, 63, -42}, new byte[]{117, -4, 70, 94, 107, -126, -34, -66}).getBytes())};
                    case -96820984:
                        m897d = atm.m897d("B1E6A1E397F3B1DAA1DD97CFB1D8A1D497FEB1DBA1D297C2B1E1A1D197C4B1D2A1E9");
                        break;
                    case 822614149:
                        if (m194a.code() != 404) {
                            m897d = atm.m897d("B1E2A1D497C4B1E2A1E997C1B1DEA1D797F9B1E6A1ED97F8B1E5A1D497C0B1E5A1DE97F0B1E2");
                            break;
                        } else {
                            m897d = atm.m897d("B1DEA1E297FDB1E2A1D597C2B1EDA1D597FDB1DEA1EE97F4B1EDA1D497CFB1E0A1D997FEB1DEA1E297CEB1DCA1D497F0B1DD");
                            break;
                        }
                    case 1071544634:
                        byte[] bytes = m194a.body().bytes();
                        byte[] copyOfRange = Arrays.copyOfRange(bytes, 0, 16);
                        BufferedReader bufferedReader = new BufferedReader(new StringReader(C0618b.m206a(C0617a.m209a(Arrays.copyOfRange(bytes, 16, bytes.length), copyOfRange, copyOfRange, C0617a.f1185a)).replaceAll(C0052e.m1418a(new byte[]{-126, 14, 60, 41, 119, -72, 120, -78, -50, 41, 106, 47, Byte.MAX_VALUE, -103, 38, -107, -104, 47, 118, 14, 33, -66, 113, -109, -124, 121, 4, 54, 62, -9, 63, -44, -10, 54, 35, 96, 56, -1, 30, -118, -47, 96, 37, 124, 25, -95, 57, -35, -41, 123, 118, 120}, new byte[]{-86, 82, 88, 82, 69, -59, 66, -18}), C0052e.m1418a(new byte[]{-52, -46}, new byte[]{-24, -29, 111, 107, 82, 64, 73, 58})).replaceAll(C0052e.m1418a(new byte[]{-38, 1, 58, 55, -5, -76, -69, -103, -106, 38, 108, 49, -25, -107, -27, -66, -63, 32, 119, 98, -29, -10, -87, -27, -33, 112, 96, 108, -32, -31, -35, -95, -119, 111, 35, 118, -107, -83, -6, -9, -113, 115, 2, 40, -78, -6, -4, -20, -36, 119}, new byte[]{-14, 93, 94, 76, -55, -55, -127, -59}), C0052e.m1418a(new byte[]{2, -82, -76, 78, 124, -70, 55, 17, 2, -92, -86, 89}, new byte[]{50, -98, -114, 106, 77, -98, 5, 33}))));
                        ArrayList arrayList = new ArrayList();
                        int i = 1;
                        String readLine = bufferedReader.readLine();
                        while (true) {
                            String m897d2 = atm.m897d("B1DCA1DD97F8B1E0A1EC97FAB1E2A1D097C4B1E2A1D597C1B1DFA1D597C3B1E2A1ED");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1750750516)) {
                                    case -1572294184:
                                        String m897d3 = atm.m897d("B1E3A1EA97F3B1E1A1DE97F0B1E2A1D597F4B1E3A1E397F0B1E2A1ED97CFB1DDA1D497C0B1DEA1E297F0B1E2A1D097F4B1D6A1DE97CFB1E3");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 641241688) {
                                                case -480671233:
                                                    break;
                                                case 154233361:
                                                    m897d3 = atm.m897d("B1DDA1D597FDB1E5A1EC97FEB1E2A1EC97CFB1DBA1E397F9B1D2A1EA97CEB1D8");
                                                case 191117396:
                                                    m897d3 = readLine.matches(C0052e.m1418a(new byte[]{103, -60, 49, 62, -121, 4, 41, -71, 64, -110, 55, 54, -90, 90, 14, -17, 70, -114, 22, 104, -127, 13, 8, -13, 16, -4, 46, 119, -56, 67, 79, -127, 95, -37, 120, 113, -64, 98, 17, -90, 9, -35, 100, 80, -98, 69, 70, -96}, new byte[]{59, -96, 74, 12, -6, 62, 117, -35})) ? atm.m897d("B1D6A1E297F0B1E2A1E297C0B1DBA1ED97F0B1E2A1D297C0B1DDA1DD97C0B1E2A1D197C1B1EDA1D097FAB1DDA1E297F0B1ED") : atm.m897d("B1D8A1D397F9B1E2A1E997F8B1D6A1D797FDB1E2A1D397FEB1ECA1D997C2B1DFA1ED97C1B1DDA1D1");
                                                case 274483201:
                                                    String m897d4 = atm.m897d("B1D2A1D797C1B1DEA1E397FCB1D8A1EA97FCB1DBA1DE97F3B1DDA1E397F0B1E2A1D297FFB1DFA1ED97FAB1DEA1D1");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ 2063499187) {
                                                            case -2109639519:
                                                                break;
                                                            case 1393344134:
                                                                arrayList.add(i + "");
                                                                i++;
                                                                continue;
                                                            case 1589085323:
                                                                m897d4 = atm.m897d("B1E2A1D597C0B1E0A1D797F0B1E6A1E397F9B1E1A1EE97F9B1DCA1E997CEB1DFA1ED97C0B1D8A1E397C0");
                                                            case 1696215536:
                                                                m897d4 = ((String) arrayList.get(arrayList.size() + (-1))).trim().isEmpty() ? atm.m897d("B1D2A1D997F4B1D2A1D397C0B1E2A1ED97C1B1DBA1ED97C0B1DEA1D197FCB1E6A1D797CEB1D1A1E397FFB1DCA1D297C2B1E6A1EC97F9B1DBA1ED") : atm.m897d("B1D1A1D797FEB1E2A1D497C0B1DBA1ED97C0B1D1A1ED97C0B1E2A1D497FEB1DEA1E397C0B1E2A1EE97C2B1EC");
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        arrayList.add(readLine);
                                        readLine = bufferedReader.readLine();
                                        i = i;
                                        break;
                                    case -1181987389:
                                        m897d2 = atm.m897d("B1E2A1DE97FDB1E2A1D497F8B1DCA1ED97F3B1E6A1D097CEB1E3A1D797FFB1DAA1D197F4B1DCA1D797F4B1E5A1D397C0B1E3A1D097C3B1D8A1EF97CF");
                                    case -1022048492:
                                        return new Object[]{200, C0052e.m1418a(new byte[]{19, 66, 88, -73, -18, -27, -59, -49, 27, 93, 70, -12, -24, -27, -48, -34, 6, 31, 91, -81, -11, -29, -59, -42}, new byte[]{114, 50, 40, -37, -121, -122, -92, -69}), new ByteArrayInputStream(TextUtils.join(atm.m897d("60"), arrayList).getBytes())};
                                    case 711210389:
                                        m897d2 = readLine != null ? atm.m897d("B1E6A1D597C4B1E2A1D097F8B1DCA1ED97C4B1E3A1EC97C3B1D6A1D097C0B1D1A1DD97FCB1D6A1D797CEB1E2A1DE97C4B1DCA1ED97CEB1D1A1D297FDB1E1A1DD") : atm.m897d("B1E6A1DE97C4B1DDA1E397C4B1D1A1D297CFB1D6A1EF97C1B1D1A1D097C0B1E2A1E297FFB1DBA1DD97F9B1E2A1D197F0B1D8A1DD97CEB1D6");
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

    /* renamed from: c */
    protected final HashMap<String, String> m280c(String str) {
        HashMap<String, String> hashMap = null;
        String m897d = atm.m897d("B1E5A1E297F9B1E2A1D797F9B1DBA1ED97F0B1D2A1D497C0B1DEA1D097CFB1E5A1E297CFB1DBA1D797FDB1E0A1D197FAB1DAA1E297C0B1D2A1D797C4B1E2");
        while (true) {
            switch ((m897d.hashCode() ^ 535) ^ 178527103) {
                case -1924926202:
                    hashMap.put(C0052e.m1418a(new byte[]{-102, -82, 31, -107, 86, -70, -116}, new byte[]{-56, -53, 121, -16, 36, -33, -2, -76}), f1096h);
                    m897d = atm.m897d("B1D1A1E397C0B1E2A1E297FDB1DCA1EE97C1B1EDA1D097F8B1DBA1ED97F3B1DDA1D797C0B1DAA1D197CFB1DFA1EE97C1B1E3A1D397C2B1E6A1DE");
                    continue;
                case -1068003637:
                    m897d = atm.m897d("B1E5A1DD97FEB1E2A1D797CEB1E2A1D197F4B1DEA1D797F3B1D8A1ED97C0B1DDA1ED97C1B1DEA1D497F8B1DCA1D397C0B1EDA1D197FEB1EDA1EF97CF");
                    continue;
                case -706875848:
                    hashMap.put(C0052e.m1418a(new byte[]{-1, -12, -87, -39, 67, -109, 35, -56, -60, -13}, new byte[]{-86, -121, -52, -85, 110, -46, 68, -83}), C0052e.m1418a(new byte[]{43, -109, -60, 92, -86, 125, 71, -87, 83, -46, -114, 21, -18, 70, 79, -24, 2, -109, -55, 70, -26, 95, 114, -90, 87, -52, -112, 5, -3, 49, 113, -17, 8, -54, -118, 14, -26, 105, 16, -78, 79, -36, -1, 69, -74, 125, 67, -47, 3, -98, -11, 92, -78, 62, 19, -75, 81, -46, -115, 3, -26, 57, 109, -50, 50, -79, -14, 25, -26, 125, 79, -19, 3, -36, -7, 80, -91, 122, 73, -81, 70, -65, -42, 71, -87, 124, 67, -87, 87, -52, -116, 27, -10, 63, 19, -74, 86, -55, -112, 3, -12, 49, 117, -25, 0, -99, -52, 92, -23, 36, 21, -79, 72, -49, -120}, new byte[]{102, -4, -66, 53, -58, 17, 38, -122}));
                    m897d = atm.m897d("B1DCA1EE97C2B1E2A1D797CFB1ECA1DE97F8B1E3A1EC97F3B1ECA1ED97C3B1DFA1EA97F3B1E1A1EC97F9B1E2A1E397F4B1D2A1E297F0");
                    continue;
                case -264130154:
                    m897d = atm.m897d("B1E5A1D797C1B1D8A1D997FDB1DEA1E397C0B1DEA1EF97C2B1DCA1D997C0B1E2A1D097C2B1EDA1E297FFB1D6");
                    continue;
                case -205543998:
                    return hashMap;
                case -16329958:
                    hashMap = new HashMap<>();
                    m897d = atm.m897d("B1E0A1DE97F0B1DAA1D097FAB1E6A1D297C7B1E5A1D497C2B1E1A1EE97C2");
                    continue;
                case 463125524:
                    String m897d2 = atm.m897d("B1DAA1D597FAB1ECA1EA97FDB1EDA1D497FEB1DCA1D397C4B1E6A1DD97CFB1D1A1D797FEB1EDA1D297FFB1E3A1ED97CE");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-734788436)) {
                            case -1718085038:
                                m897d2 = this.f1097b.length() > 0 ? atm.m897d("B1E5A1EE97FFB1D1A1D397F9B1E2A1E997FFB1E2A1ED97F4B1D8A1E997C4B1EDA1D597CEB1D6") : atm.m897d("B1E3A1E397CEB1E5A1D797F9B1E2A1EA97FFB1D2A1ED97F9B1E2A1D097C0B1E6A1D197F9");
                            case -249187247:
                                m897d2 = atm.m897d("B1E0A1D297CEB1E2A1E397F3B1DAA1D397F8B1DBA1EF97CFB1E1A1D997C1B1ECA1ED97C2B1E2A1ED");
                            case 192737224:
                                break;
                            case 1164507924:
                                m897d = atm.m897d("B1ECA1E997C1B1DFA1E397C2B1D2A1D797C4B1E2A1D097C4B1DEA1D397FFB1D8A1DE97CFB1D2");
                                continue;
                        }
                    }
                    break;
                case 475029353:
                    hashMap.put(C0052e.m1418a(new byte[]{-35, 35, -47, 42, -77, 125}, new byte[]{-98, 76, -66, 65, -38, 24, -83, -122}), this.f1097b);
                    m897d = atm.m897d("B1ECA1EA97F3B1E6A1D397F9B1ECA1E397CFB1E3A1E997F4B1EDA1EF97CEB1E2A1D997C4B1DFA1D597FFB1DFA1ED97F4B1E2A1ED97F9B1ECA1DD");
                    continue;
                case 1815098644:
                    String m897d3 = atm.m897d("B1E1A1EC97FCB1E2A1D197C3B1D2A1E997C0B1DCA1D397C0B1DFA1DE97F4");
                    while (true) {
                        switch (m897d3.hashCode() ^ (-1748900260)) {
                            case -1906048838:
                                break;
                            case -1536128139:
                                m897d3 = !str.contains(C0052e.m1418a(new byte[]{-58, -1, 17, 90, -72, 20}, new byte[]{-95, -112, 126, 61, -44, 113, 123, 70})) ? atm.m897d("B1E3A1EF97FAB1D1A1D497FCB1DCA1EC97F8B1E6A1D397C3B1EDA1EF97C3B1DCA1ED97FDB1E2") : atm.m897d("B1E5A1EA97F9B1E2A1DE97C2B1E5A1D297FAB1D2A1ED97FEB1E0A1EE97C1B1DCA1E3");
                            case -382805424:
                                m897d3 = atm.m897d("B1DDA1EA97F0B1DFA1DD97C2B1DEA1ED97C4B1E2A1EF97CFB1DCA1D297FCB1E2A1ED97FAB1DDA1E997CEB1D6A1D497C0");
                            case 175912937:
                                m897d = atm.m897d("B1DFA1E297C2B1DAA1D097C1B1DEA1D297FCB1E0A1D497FEB1E3A1D397C0");
                                continue;
                        }
                    }
                    break;
            }
            m897d = atm.m897d("B1ECA1EA97F3B1E6A1D397F9B1ECA1E397CFB1E3A1E997F4B1EDA1EF97CEB1E2A1D997C4B1DFA1D597FFB1DFA1ED97F4B1E2A1ED97F9B1ECA1DD");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
        r1 = com.github.catvod.spider.merge.p010K.C0052e.m1418a(new byte[]{-103, 109, -12, -48, -85, -13, -115, -52, -107, 125, -7, -45, -10, -71, -48, -116, -34, 122, -31, -44, -67, -82, -51, -111, -120, 54}, new byte[]{-15, 25, Byte.MIN_VALUE, -96, -40, -55, -94, -29}) + r15;
     */
    @Override // com.github.catvod.spider.Dora
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String categoryContent(java.lang.String r15, java.lang.String r16, boolean r17, java.util.HashMap<java.lang.String, java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 2900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0595j.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final String detailContent(List<String> list) {
        try {
            String str = C0052e.m1418a(new byte[]{-87, -120, -80, 114, 29, 88, -110, -53, -91, -104, -67, 113, 64, 18, -49, -117, -18}, new byte[]{-63, -4, -60, 2, 110, 98, -67, -28}) + list.get(0) + C0052e.m1418a(new byte[]{112}, new byte[]{95, 88, -86, 109, -92, -52, 123, -49});
            C0288h m1414e = C0052e.m1414e(C0629f.m179f(str, m280c(str)));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String m606a = m1414e.m967p0(C0052e.m1418a(new byte[]{100, -42, 100, 104, 124, -18, -53, 107, 32, -42, Byte.MAX_VALUE, 33}, new byte[]{0, -65, 18, 70, 12, -127, -72, 31})).m606a(C0052e.m1418a(new byte[]{-34, 51, -49}, new byte[]{-83, 65, -84, -87, 68, -20, 72, -55}));
            String m602e = m1414e.m967p0(C0052e.m1418a(new byte[]{13, -66, -29, -118, 126, -101, -54, -56, 17, -26, -71, -106, 116}, new byte[]{101, -113, -51, -6, 17, -24, -66, -27})).m602e();
            String m897d = atm.m897d("B1D2A1DE97FDB1D8A1DD97C4B1DAA1D797FAB1DBA1DE97FAB1D1A1D597F8B1DBA1EA97CEB1EDA1E297C3B1D6A1E997F9B1DAA1DD");
            while (true) {
                switch (m897d.hashCode() ^ 1704370123) {
                    case -1772709496:
                        m897d = atm.m897d("B1DDA1D097FCB1E3A1D197FFB1DDA1D597F9B1E2A1D997CEB1EDA1D397C3B1E5A1DD97FEB1E1A1E297FCB1E0A1DE97FCB1DBA1D497C7");
                        break;
                    case -1545947563:
                        jSONObject2.put(C0052e.m1418a(new byte[]{-110, -37, 116, 61, -70, Byte.MAX_VALUE, -45, -82}, new byte[]{-28, -76, 16, 98, -44, 30, -66, -53}), m602e);
                        m1414e.m967p0(C0052e.m1418a(new byte[]{-58, -7, Byte.MIN_VALUE, -27}, new byte[]{-78, -112, -19, Byte.MIN_VALUE, 83, 116, 9, -19})).m602e().getClass();
                        jSONObject2.put(C0052e.m1418a(new byte[]{1, 96, -61, -42, -20, -17, -98, 5, 5, 100, -44}, new byte[]{119, 15, -89, -119, -98, -118, -13, 100}), C0052e.m1418a(new byte[]{-115, 5, -66}, new byte[]{104, Byte.MIN_VALUE, 22, 71, 55, -42, -93, 76}));
                        break;
                    case -180727812:
                        if (!m602e.contains(C0052e.m1418a(new byte[]{-113}, new byte[]{-89, -102, -60, -30, -19, -89, 112, -26}))) {
                            m897d = atm.m897d("B1E3A1D497FDB1E2A1E397F4B1E1A1D197FEB1E6A1D197CFB1E2A1EF97C0B1D1A1EA97FDB1D6A1D397FEB1E2A1DE97C1B1E2A1ED97F4B1ECA1D5");
                            break;
                        } else {
                            m897d = atm.m897d("B1E1A1D297FDB1E2A1DD97FEB1E3A1EE97F4B1D6A1D997FCB1E6A1D297C2B1DAA1ED97FDB1E2");
                            break;
                        }
                    case 1218509208:
                        String[] split = m602e.split(C0052e.m1418a(new byte[]{-71, -73}, new byte[]{-27, -97, 106, -47, -98, Byte.MAX_VALUE, 107, -86}));
                        String str2 = split[0];
                        String replace = split[1].replace(C0052e.m1418a(new byte[]{35}, new byte[]{11, -71, 43, -127, -58, 67, 44, -85}), "");
                        jSONObject2.put(C0052e.m1418a(new byte[]{15, 119, -57, 9, 6, -68, 72, 121}, new byte[]{121, 24, -93, 86, 104, -35, 37, 28}), str2);
                        jSONObject2.put(C0052e.m1418a(new byte[]{-101, 102, 64, -18, -19, 34, -41, 84, -97, 98, 87}, new byte[]{-19, 9, 36, -79, -97, 71, -70, 53}), replace);
                        break;
                }
            }
            String replace2 = m1414e.m967p0(C0052e.m1418a(new byte[]{52, 59, 4, -56, 93, -85, 75, -115, 34, 51, 17, -110}, new byte[]{80, 82, 114, -26, 60, -55, 56, -7})).m602e().replace(atm.m897d("4A"), "").replace(C0052e.m1418a(new byte[]{126, -111, 2, 25}, new byte[]{66, -13, 112, 39, -74, 98, 94, -82}), "").replace(C0052e.m1418a(new byte[]{-50, Byte.MIN_VALUE, 33, 120, -33, -70, 14}, new byte[]{-14, -16, 31, 68, -16, -54, 48, -76}), "");
            String m281b = m281b(Pattern.compile(C0052e.m1418a(new byte[]{-44, -106, 39, -98, -121, -70, -110, 1, 29, 13, -75, -98, -111, -121}, new byte[]{51, 39, -100, 123, 25, 49, -88, 41})), replace2);
            String m281b2 = m281b(Pattern.compile(C0052e.m1418a(new byte[]{108, 51, -98, 93, -29, 35, -50, 45, -89, -96, 3, 94, -10, 30}, new byte[]{-119, -118, 42, -71, 88, -98, -12, 5})), replace2);
            String m281b3 = m281b(Pattern.compile(C0052e.m1418a(new byte[]{-47, -1, 21, 64, 6, -25, 124, 103, 26, 73, -116, 64, 51, -23, -94, -12, -119}, new byte[]{52, 99, -91, -91, -118, 93, 70, 79})), replace2);
            String m281b4 = m281b(Pattern.compile(C0052e.m1418a(new byte[]{-20, 119, -47, 81, 99, 94, -118, 18, 36, -31, 108, 83, 67, 125}, new byte[]{10, -53, 69, -76, -14, -58, -80, 58})), replace2);
            String m281b5 = m281b(Pattern.compile(C0052e.m1418a(new byte[]{-52, 52, -60, -66, -108, 67, -74, 71, 7, -79, 81, -66, -108, 67}, new byte[]{41, -101, 120, 88, 40, -41, -116, 111})), replace2);
            String m281b6 = m281b(Pattern.compile(C0052e.m1418a(new byte[]{23, 30, -48, -78, 116, -71, 3, -65, -34, -102, 121}, new byte[]{-16, -80, 80, 86, -49, 50, 57, -105})), replace2);
            jSONObject2.put(C0052e.m1418a(new byte[]{39, -102, 121, -52, 80, -127}, new byte[]{81, -11, 29, -109, 57, -27, 88, 12}), list.get(0));
            jSONObject2.put(C0052e.m1418a(new byte[]{-32, 3, -5, 13, 51, 29, 121}, new byte[]{-106, 108, -97, 82, 67, 116, 26, 9}), m606a);
            jSONObject2.put(C0052e.m1418a(new byte[]{66, 71, 97, -8, -54, 23, -9, -41, 83}, new byte[]{54, 62, 17, -99, -107, 121, -106, -70}), m281b);
            jSONObject2.put(C0052e.m1418a(new byte[]{7, 76, 61, -88, -12, 105, -111, 69}, new byte[]{113, 35, 89, -9, -115, 12, -16, 55}), m281b2);
            jSONObject2.put(C0052e.m1418a(new byte[]{14, -11, 110, -92, -62, -91, -50, 62}, new byte[]{120, -102, 10, -5, -93, -41, -85, 95}), m281b3);
            jSONObject2.put(C0052e.m1418a(new byte[]{-34, 64, 109, 52, -38, -114, 64, 61, -38}, new byte[]{-88, 47, 9, 107, -69, -19, 52, 82}), m281b4);
            jSONObject2.put(C0052e.m1418a(new byte[]{-78, 112, 87, -112, -84, 107, 74, -49, -89, 107, 92, -67}, new byte[]{-60, 31, 51, -49, -56, 2, 56, -86}), m281b5);
            jSONObject2.put(C0052e.m1418a(new byte[]{105, -67, 78, Byte.MAX_VALUE, 24, -107, 121, -46, 122, -68, 94}, new byte[]{31, -46, 42, 32, 123, -6, 23, -90}), m281b6);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{-49, -73, -77, 3, 40, -21, 4, -7, -115, -87, -80, 90, 117, -12, 6, -14, -120, -80, -73}, new byte[]{-31, -64, -61, 46, 88, -121, 101, Byte.MIN_VALUE}));
            String m1418a = C0052e.m1418a(new byte[]{-73, 104, 125, Byte.MIN_VALUE, -89, 36, -68}, new byte[]{80, -60, -47, -79, 66, -119, 31, 113});
            int i = 0;
            while (true) {
                String m897d2 = atm.m897d("B1DBA1D997C0B1E2A1D397C4B1E2A1D997FFB1D8A1ED97F0B1E0A1D797CEB1DBA1E297FCB1E0A1EE97CEB1DEA1DD97FAB1D6A1E397FCB1DCA1ED");
                while (true) {
                    switch (m897d2.hashCode() ^ (-1837477665)) {
                        case -1693764862:
                            m897d2 = atm.m897d("B1D6A1EC97CEB1DBA1D997FCB1D2A1E397F3B1D1A1ED97F0B1E2A1DE97F3B1DCA1EC97C1B1ECA1ED97FDB1E5A1EC");
                        case 447827057:
                            C0459g m967p02 = m1414e.m967p0(C0052e.m1418a(new byte[]{-43, 45, 114, 36, -87, -90, -56, 104, -100, 56, 48, 57, -88, -26, -38, 108, -119, 46}, new byte[]{-5, 93, 29, 87, -35, -117, -72, 9}));
                            String m897d3 = atm.m897d("B1EDA1EF97C4B1E0A1D597F0B1E2A1EE97FEB1E0A1D297C1B1DCA1D297FFB1EDA1EF97C7B1E3A1DD97F4B1DBA1ED97FCB1D6A1EA");
                            while (true) {
                                switch (m897d3.hashCode() ^ 1037256074) {
                                    case -1356657055:
                                        if (!m967p02.isEmpty()) {
                                            m897d3 = atm.m897d("B1DCA1E997FCB1D8A1E997C3B1DEA1E997F0B1E2A1D997F0B1DEA1D597F3B1DBA1D997C7B1DBA1ED97FCB1E0A1EA");
                                            break;
                                        } else {
                                            m897d3 = atm.m897d("B1D1A1D397F9B1DAA1D797F9B1E2A1DD97C0B1E3A1DD97FDB1D2A1D597C7B1E2A1ED");
                                            break;
                                        }
                                    case 12209034:
                                        break;
                                    case 716943260:
                                        int i2 = 0;
                                        ArrayList arrayList5 = arrayList2;
                                        while (true) {
                                            String m897d4 = atm.m897d("B1D6A1D097FAB1EDA1D197C0B1D2A1DD97F3B1ECA1DD97F9B1E2A1EC97F0B1E6A1ED");
                                            while (true) {
                                                switch (m897d4.hashCode() ^ 1836606515) {
                                                    case -1816080472:
                                                        break;
                                                    case -802947538:
                                                        m897d4 = i2 < m967p02.size() ? atm.m897d("B1D2A1D797C3B1EDA1D297FDB1E6A1D997C2B1DFA1DE97C0B1E2A1D797FCB1ECA1E997C0") : atm.m897d("B1D6A1D297F4B1DFA1DD97FDB1E0A1DD97C0B1DCA1D097F8B1ECA1EC97FE");
                                                    case 397080781:
                                                        C0293m c0293m = m967p02.get(i2);
                                                        String str3 = C0052e.m1418a(new byte[]{-24, 60, 66}, new byte[]{15, -112, -18, -41, -82, 12, -22, -62}) + c0293m.m960w0() + C0052e.m1418a(new byte[]{-87, -76, -60}, new byte[]{76, 25, 103, -45, 119, 121, -122, -85});
                                                        String str4 = C0052e.m1418a(new byte[]{82, 73, 57, -12, -33, 96, 33, 61, 94, 89, 52, -9, -126, 42, 124, 125, 21}, new byte[]{58, 61, 77, -124, -84, 90, 14, 18}) + list.get(0) + C0052e.m1418a(new byte[]{56}, new byte[]{23, 98, -96, 38, -49, -28, -34, -49}) + c0293m.m960w0() + C0052e.m1418a(new byte[]{45}, new byte[]{2, -108, 64, -81, -122, 76, 69, -16});
                                                        C0459g m967p03 = C0052e.m1414e(C0629f.m179f(str4, m280c(str4))).m967p0(C0052e.m1418a(new byte[]{124, -120, -1, 68, 1, -17, -111, 27, 62, -106, -4, 29, 92, -16, -109, 16, 59, -113, -5}, new byte[]{82, -1, -113, 105, 113, -125, -16, 98}));
                                                        int i3 = 0;
                                                        ArrayList arrayList6 = arrayList5;
                                                        while (true) {
                                                            String m897d5 = atm.m897d("B1E2A1D397F0B1D1A1D297FFB1D8A1DD97F8B1D6A1E397F0B1E0A1E397C7B1DCA1EF97C3B1E6A1D497C1B1EDA1ED97F4B1DBA1E297FF");
                                                            while (true) {
                                                                switch (m897d5.hashCode() ^ 408735433) {
                                                                    case -1755235849:
                                                                        break;
                                                                    case -1620258584:
                                                                        m897d5 = i3 < m967p03.size() ? atm.m897d("B1DFA1D397C3B1E3A1EA97CEB1E235AEE783F3A1E2AED483F0A1D2AEEE83CEA1E3AED483F2A1ECAEDB83C2A1E3AED083F1A1D2AED4") : atm.m897d("B1D6A1D497FCB1DDA1EE97F9B1EDA1DD97C0B1E5A1EA97C7B1EDA1D097FFB1D2A1DE97C4B1E2A1EF97C1B1E5");
                                                                    case -6630426:
                                                                        m897d5 = atm.m897d("B1E6A1EC97F0B1E2A1D997FFB1E5A1E297F3B1DFA1D197FCB1DDA1D797F3B1D2A1DE97C7B1E6A1ED97C4B1E6A1ED");
                                                                    case 1686807807:
                                                                        String trim = m967p03.get(i3).m979d0().trim();
                                                                        JSONArray jSONArray = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1)).getJSONArray(C0052e.m1418a(new byte[]{-6, 2, 19, -82, -55, -125}, new byte[]{-114, 112, 114, -51, -94, -16, 114, 61}));
                                                                        int i4 = 0;
                                                                        while (true) {
                                                                            String m897d6 = atm.m897d("B1D8A1D297CEB1E2A1EE97FEB1DAA1D297CFB1EDA1E397FEB1D8A1D097FEB1E2A1D397C0B1DBA1D397C3B1DEA1D497FCB1DFA1ED97FDB1D6A1ED97C0");
                                                                            while (true) {
                                                                                switch (m897d6.hashCode() ^ (-1387640096)) {
                                                                                    case -2131237157:
                                                                                        m897d6 = i4 < jSONArray.length() ? atm.m897d("B1DDA1E297C4B1DDA1D597C0B1E2A1D997F9B1DAA1D297F9B1ECA1ED97FAB1DBA1ED97C0B1DFA1ED97C2") : atm.m897d("B1DEA1D297F9B1DFA1D797C2B1D6A1D297FEB1DEA1D997F3B1DCA1D797FDB1E2A1EE97FCB1E6");
                                                                                    case -758790963:
                                                                                        int i5 = 0;
                                                                                        while (true) {
                                                                                            String m897d7 = atm.m897d("B1DBA1D497F3B1D8A1D297C1B1D6A1EC97F3B1DAA1DE97F9B1D2A1ED97F3B1DBA1D397FDB1ECA1E3");
                                                                                            while (true) {
                                                                                                switch (m897d7.hashCode() ^ 1421641894) {
                                                                                                    case -1872050247:
                                                                                                        break;
                                                                                                    case -1421923279:
                                                                                                        break;
                                                                                                    case -775466880:
                                                                                                        m897d7 = i5 < jSONArray.length() ? atm.m897d("B1EDA1EE97F4B1DAA1E297F3B1DBA1EA97C4B1D6A1DD97C0B1E2A1D297CEB1E6A1D797FEB1DFA1D797FEB1D6A1DD97FCB1DF") : atm.m897d("B1DFA1EA97C2B1EDA1D397FDB1E2A1EC97CEB1D1A1DD97C7B1DEA1D597FDB1ECA1E997F9B1E3A1D297F0B1DE");
                                                                                                    case 1565748261:
                                                                                                        m897d7 = atm.m897d("B1E0A1D997C2B1E0A1DD97FFB1E2A1ED97F0B1DAA1E997CEB1DEA1D297CFB1D1A1D597C3B1DBA1ED97C7B1D6A1D397F4B1DBA1EC");
                                                                                                }
                                                                                            }
                                                                                            JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                                                                                            String string = jSONObject3.getString(C0052e.m1418a(new byte[]{66, 2, -55, -16}, new byte[]{49, 112, -86, -64, 24, Byte.MAX_VALUE, -108, 111}));
                                                                                            String string2 = jSONObject3.getString(C0052e.m1418a(new byte[]{-73, -65, -61, -34}, new byte[]{-60, -51, -96, -20, -14, 105, 39, 77}));
                                                                                            String string3 = jSONObject3.getString(C0052e.m1418a(new byte[]{66, 90, 80, 38, -83, -124, -89}, new byte[]{33, 59, 32, 82, -60, -21, -55, 124}));
                                                                                            StringBuilder sb = new StringBuilder();
                                                                                            sb.append(C0052e.m1418a(new byte[]{98, -14, 104, 90, -120, -88, -7, -37, 125, -88, 120, 78, -126, -31, -8, -124, 120, -23}, new byte[]{10, -122, 28, 42, -5, -110, -42, -12}));
                                                                                            sb.append(string);
                                                                                            sb.append(C0052e.m1418a(new byte[]{-99, 79, -81, 51, -93, 28, 84, 55}, new byte[]{-94, 43, -53, 65, -56, 121, 45, 10}));
                                                                                            sb.append(string2);
                                                                                            String sb2 = sb.toString();
                                                                                            StringBuilder sb3 = new StringBuilder();
                                                                                            sb3.append(C0052e.m1418a(new byte[]{20, -126, -20, -3, -30, 94, 53, 38, 24, -110, -31, -2, -65, 20, 104, 102, 83, -123, -19, -17, -11, 0, 104, 38}, new byte[]{124, -10, -104, -115, -111, 100, 26, 9}));
                                                                                            sb3.append(jSONObject3.getString(C0052e.m1418a(new byte[]{-94, -95, -103, -117, -59, -52}, new byte[]{-47, -44, -5, -8, -73, -81, 16, -54})));
                                                                                            String sb4 = sb3.toString();
                                                                                            StringBuilder sb5 = new StringBuilder();
                                                                                            sb5.append(sb2);
                                                                                            sb5.append(C0052e.m1418a(new byte[]{91}, new byte[]{39, -17, 39, -124, 30, -41, 68, -65}));
                                                                                            sb5.append(sb4);
                                                                                            arrayList4.add(string3 + C0052e.m1418a(new byte[]{3}, new byte[]{39, 20, 45, 118, 112, 22, 31, 93}) + sb5.toString());
                                                                                            i5++;
                                                                                        }
                                                                                        linkedHashMap.put(str3, TextUtils.join(C0052e.m1418a(new byte[]{106}, new byte[]{73, 33, 27, -17, 105, 114, -111, -11}), arrayList6));
                                                                                        linkedHashMap.put(str3 + C0052e.m1418a(new byte[]{55, 99, 84, 9, -99, 31, 70}, new byte[]{13, -123, -31, -66, 120, -69, -48, -68}), TextUtils.join(C0052e.m1418a(new byte[]{40}, new byte[]{11, -64, 30, -33, -21, -111, -84, 34}), arrayList4));
                                                                                        i3++;
                                                                                        break;
                                                                                    case 130895696:
                                                                                        break;
                                                                                    case 1100831942:
                                                                                        m897d6 = atm.m897d("B1DDA1ED97FEB1E2A1E397F9B1DDA1DE97C3B1E0A1D997C2B1DEA1EA97F0B1E5A1D197F3B1D2");
                                                                                }
                                                                            }
                                                                            JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                                                                            String string4 = jSONObject4.getString(C0052e.m1418a(new byte[]{125, -60, 116, 13}, new byte[]{14, -74, 23, 60, -88, 72, 109, 24}));
                                                                            String string5 = jSONObject4.getString(C0052e.m1418a(new byte[]{95, -35, 17, 80, 89, -42, 119}, new byte[]{60, -68, 97, 36, 48, -71, 25, 106}));
                                                                            StringBuilder sb6 = new StringBuilder();
                                                                            sb6.append(C0052e.m1418a(new byte[]{28, -13, 125, 26, 111, 27, 4, 109, 16, -29, 112, 25, 50, 81, 89, 45, 91, -32, 108, 30, 106, 69, 79, 48, 91, -15, 96, 14, 121, 78, 20, 43, 16, -70}, new byte[]{116, -121, 9, 106, 28, 33, 43, 66}));
                                                                            sb6.append(string4);
                                                                            sb6.append(C0052e.m1418a(new byte[]{57, -111, -47, 73, 32, -61, -64, 56, 47, -91, -109, 2, 105, -117, Byte.MIN_VALUE, 101, 34, -104, -47, 92}, new byte[]{31, -11, -72, 36, 29, -14, -16, 0}));
                                                                            String sb7 = sb6.toString();
                                                                            StringBuilder sb8 = new StringBuilder();
                                                                            sb8.append(C0052e.m1418a(new byte[]{-38, 86, -24, 94, 120, -35, -95, 69, -42, 70, -27, 93, 37, -105, -4, 5, -99, 81, -23, 76, 111, -125, -4, 69}, new byte[]{-78, 34, -100, 46, 11, -25, -114, 106}));
                                                                            sb8.append(jSONObject4.getString(C0052e.m1418a(new byte[]{48, -105, -35, -46, 125, 43}, new byte[]{67, -30, -65, -95, 15, 72, -44, 111})));
                                                                            String sb9 = sb8.toString();
                                                                            StringBuilder sb10 = new StringBuilder();
                                                                            sb10.append(sb7);
                                                                            sb10.append(C0052e.m1418a(new byte[]{92}, new byte[]{32, -96, -118, -102, 52, 16, 71, 120}));
                                                                            sb10.append(sb9);
                                                                            arrayList6.add(string5 + C0052e.m1418a(new byte[]{-94}, new byte[]{-122, 12, 18, 33, -61, -19, 38, -118}) + sb10.toString());
                                                                            i4++;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        arrayList6.removeAll(arrayList6);
                                                        arrayList4.removeAll(arrayList4);
                                                        i2++;
                                                        arrayList5 = arrayList6;
                                                        break;
                                                    case 638054439:
                                                        m897d4 = atm.m897d("B1DDA1D197C4B1E6A1D497CFB1E1A1E997F9B1E1A1EA97CFB1DEA1D297FF");
                                                }
                                            }
                                        }
                                        break;
                                    case 1075034204:
                                        m897d3 = atm.m897d("B1E6A1DE97CEB1E2A1ED97F0B1DFA1ED97F8B1DAA1D397FCB1E5A1E997FEB1E3A1D497F9B1D1A1D297F8B1DBA1D497C0");
                                        break;
                                }
                            }
                            String join = TextUtils.join(C0052e.m1418a(new byte[]{-27, 89, -46}, new byte[]{-63, 125, -10, 119, -68, 18, -39, 106}), linkedHashMap.keySet());
                            String join2 = TextUtils.join(C0052e.m1418a(new byte[]{61, -41, -97}, new byte[]{25, -13, -69, 116, -80, 19, -121, -82}), linkedHashMap.values());
                            jSONObject2.put(C0052e.m1418a(new byte[]{-122, -107, -100, 19, 74, 35, -24, 114, -81, -100, -118, 35, 87}, new byte[]{-16, -6, -8, 76, 58, 79, -119, 11}), join);
                            jSONObject2.put(C0052e.m1418a(new byte[]{-15, 65, -85, 82, 23, -17, 18, -127, -40, 91, -67, 97}, new byte[]{-121, 46, -49, 13, 103, -125, 115, -8}), join2);
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(jSONObject2);
                            jSONObject.put(C0052e.m1418a(new byte[]{34, -108, -60, 38}, new byte[]{78, -3, -73, 82, -4, -7, 97, 62}), jSONArray2);
                            return jSONObject.toString();
                        case 493510078:
                            String trim2 = m967p0.get(i).m979d0().trim();
                            JSONArray jSONArray3 = new JSONObject(trim2.substring(trim2.indexOf(123), trim2.lastIndexOf(125) + 1)).getJSONArray(C0052e.m1418a(new byte[]{15, -70, 30, 122, -84, -22}, new byte[]{123, -56, Byte.MAX_VALUE, 25, -57, -103, -27, 26}));
                            int i6 = 0;
                            while (true) {
                                String m897d8 = atm.m897d("B1DAA1EA97C2B1E2A1E997CEB1E2A1E997FDB1D1A1EC97FDB1DFA1D497C0B1DBA1ED97CEB1E1A1E997C2B1DAA1D397C0B1E0A1EA97C3");
                                while (true) {
                                    switch (m897d8.hashCode() ^ (-1599476900)) {
                                        case -1445583727:
                                            m897d8 = i6 < jSONArray3.length() ? atm.m897d("B1E6A1D997CFB1D2A1D097F0B1DCA1EC97CEB1E2A1D797FAB1DEA1D797FEB1D2A1ED") : atm.m897d("B1DEA1D097C7B1DAA1D497C4B1E2A1D797FDB1E0A1EA97F9B1E2A1ED97C4B1DEA1EF97C1B1DEA1D397F0B1EDA1D997C3B1DAA1EE");
                                        case -1430619396:
                                            int i7 = 0;
                                            while (true) {
                                                String m897d9 = atm.m897d("B1DDA1EC97F4B1DCA1EF97CEB1E6A1DD97F8B1DAA1E997CFB1D8A1D997C7B1E3A1EF97FCB1DBA1D597FA");
                                                while (true) {
                                                    switch (m897d9.hashCode() ^ (-381278817)) {
                                                        case -1479286442:
                                                            break;
                                                        case -1155108786:
                                                            m897d9 = atm.m897d("B1D6A1EF97C4B1DCA1D197F9B1DEA1EE97F9B1E2A1D197FEB1E2A1EA97FCB1EDA1D797FDB1DFA1DE97CFB1E2");
                                                        case 147738004:
                                                            break;
                                                        case 2032166489:
                                                            m897d9 = i7 < jSONArray3.length() ? atm.m897d("B1DEA1D297C7B1E3A1E997C0B1DAA1D797CFB1D1A1D597CEB1E2A1EF97F0B1DFA1ED97F4B1ECA1D097C0") : atm.m897d("B1D8A1D397C2B1E2A1E397FDB1E5A1EC97CEB1D2A1D997F9B1ECA1ED97F9B1E2");
                                                    }
                                                }
                                                JSONObject jSONObject5 = jSONArray3.getJSONObject(i7);
                                                String string6 = jSONObject5.getString(C0052e.m1418a(new byte[]{117, -102, -52, -67}, new byte[]{6, -24, -81, -115, -27, 16, -111, -81}));
                                                String string7 = jSONObject5.getString(C0052e.m1418a(new byte[]{-57, 98, -47, 104}, new byte[]{-76, 16, -78, 90, -82, 29, -89, 33}));
                                                String string8 = jSONObject5.getString(C0052e.m1418a(new byte[]{-40, 34, 122, 15, -64, 51, -24}, new byte[]{-69, 67, 10, 123, -87, 92, -122, -92}));
                                                StringBuilder sb11 = new StringBuilder();
                                                sb11.append(C0052e.m1418a(new byte[]{-13, -111, 54, -34, -111, 106, -67, 7, -20, -53, 38, -54, -101, 35, -68, 88, -23, -118}, new byte[]{-101, -27, 66, -82, -30, 80, -110, 40}));
                                                sb11.append(string6);
                                                sb11.append(C0052e.m1418a(new byte[]{-22, 33, -125, 22, -113, 49, -52, -75}, new byte[]{-43, 69, -25, 100, -28, 84, -75, -120}));
                                                sb11.append(string7);
                                                String sb12 = sb11.toString();
                                                StringBuilder sb13 = new StringBuilder();
                                                sb13.append(C0052e.m1418a(new byte[]{-25, -51, -114, -44, 69, 2, -61, 78, -21, -35, -125, -41, 24, 72, -98, 14, -96, -54, -113, -58, 82, 92, -98, 78}, new byte[]{-113, -71, -6, -92, 54, 56, -20, 97}));
                                                sb13.append(jSONObject5.getString(C0052e.m1418a(new byte[]{13, -45, 51, 117, -92, -58}, new byte[]{126, -90, 81, 6, -42, -91, -97, 118})));
                                                String sb14 = sb13.toString();
                                                StringBuilder sb15 = new StringBuilder();
                                                sb15.append(sb12);
                                                sb15.append(C0052e.m1418a(new byte[]{-63}, new byte[]{-67, 107, 116, 111, -47, 76, 24, 87}));
                                                sb15.append(sb14);
                                                String sb16 = sb15.toString();
                                                StringBuilder sb17 = new StringBuilder();
                                                sb17.append(string8);
                                                sb17.append(C0052e.m1418a(new byte[]{11}, new byte[]{47, -40, -65, 24, -91, -127, -56, 121}));
                                                sb17.append(sb16);
                                                arrayList3.add(sb17.toString());
                                                i7++;
                                            }
                                            linkedHashMap.put(m1418a, TextUtils.join(C0052e.m1418a(new byte[]{-100}, new byte[]{-65, -42, 57, -47, -17, -46, -97, Byte.MIN_VALUE}), arrayList));
                                            linkedHashMap.put(m1418a + C0052e.m1418a(new byte[]{98, 43, 117, 57, 109, 26, 114}, new byte[]{88, -51, -64, -114, -120, -66, -28, 13}), TextUtils.join(C0052e.m1418a(new byte[]{-94}, new byte[]{-127, -93, -93, -96, 51, 68, -125, -89}), arrayList3));
                                            i++;
                                            break;
                                        case -83478461:
                                            m897d8 = atm.m897d("B1DCA1D197FDB1E2A1DD97C7B1E5A1EE97C3B1E5A1D297C0B1DAA1EC97C2B1D1");
                                        case 1614783871:
                                            break;
                                    }
                                }
                                JSONObject jSONObject6 = jSONArray3.getJSONObject(i6);
                                String string9 = jSONObject6.getString(C0052e.m1418a(new byte[]{-2, 105, 108, 65}, new byte[]{-115, 27, 15, 112, 80, 61, 66, 81}));
                                String string10 = jSONObject6.getString(C0052e.m1418a(new byte[]{-7, -108, 55, -22, -86, -53, 74}, new byte[]{-102, -11, 71, -98, -61, -92, 36, -40}));
                                StringBuilder sb18 = new StringBuilder();
                                sb18.append(C0052e.m1418a(new byte[]{-74, -61, 8, 61, 30, -40, -65, -11, -70, -45, 5, 62, 67, -110, -30, -75, -15, -48, 25, 57, 27, -122, -12, -88, -15, -63, 21, 41, 8, -115, -81, -77, -70, -118}, new byte[]{-34, -73, 124, 77, 109, -30, -112, -38}));
                                sb18.append(string9);
                                sb18.append(C0052e.m1418a(new byte[]{24, 8, 66, -81, -28, -38, 8, -123, 14, 60, 0, -28, -83, -110, 72, -40, 3, 1, 66, -70}, new byte[]{62, 108, 43, -62, -39, -21, 56, -67}));
                                String sb19 = sb18.toString();
                                StringBuilder sb20 = new StringBuilder();
                                sb20.append(C0052e.m1418a(new byte[]{89, -96, 122, -117, 122, Byte.MIN_VALUE, -117, 0, 85, -80, 119, -120, 39, -54, -42, 64, 30, -89, 123, -103, 109, -34, -42, 0}, new byte[]{49, -44, 14, -5, 9, -70, -92, 47}));
                                sb20.append(jSONObject6.getString(C0052e.m1418a(new byte[]{-68, -10, 60, -124, 47, 98}, new byte[]{-49, -125, 94, -9, 93, 1, -96, -121})));
                                String sb21 = sb20.toString();
                                StringBuilder sb22 = new StringBuilder();
                                sb22.append(sb19);
                                sb22.append(C0052e.m1418a(new byte[]{-83}, new byte[]{-47, -70, 22, 98, -38, -31, 37, -48}));
                                sb22.append(sb21);
                                String sb23 = sb22.toString();
                                StringBuilder sb24 = new StringBuilder();
                                sb24.append(string10);
                                sb24.append(C0052e.m1418a(new byte[]{-102}, new byte[]{-66, -102, 75, -6, 116, -12, -73, -67}));
                                sb24.append(sb23);
                                arrayList.add(sb24.toString());
                                i6++;
                            }
                            break;
                        case 1874059708:
                            m897d2 = i < m967p0.size() ? atm.m897d("B1E5A1EE97C3B1DBA1ED97C1B1DCA1DE97FFB1D1A1D597FFB1DAA1D797C4B1E0A1D397C0B1DEA1EE97C0B1E2A1D097C0B1D6") : atm.m897d("B1E1A1DD97FEB1DCA1D797FAB1D2A1D097FDB1DAA1D797CEB1E1A1EA97F3");
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 485
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.github.catvod.spider.Dora
    public final java.lang.String homeContent(boolean r14) {
        /*
            Method dump skipped, instructions count: 3590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p044k.C0595j.homeContent(boolean):java.lang.String");
    }

    @Override // com.github.catvod.spider.Dora
    public final String playerContent(String str, String str2, List<String> list) {
        String optString;
        try {
            JSONObject jSONObject = new JSONObject();
            String[] split = str2.split(C0052e.m1418a(new byte[]{102, -28}, new byte[]{58, -104, -24, -88, 118, 93, -69, 94}));
            String str3 = split[0];
            String str4 = split[1];
            String m897d = atm.m897d("B1E6A1EC97FEB1E2A1DD97C7B1E2A1DE97FFB1DFA1ED97FFB1ECA1D397CEB1DDA1DD97C0B1DFA1DD97FDB1D2A1EC97FDB1E2A1EA97FEB1D2A1ED");
            while (true) {
                switch (m897d.hashCode() ^ (-164899316)) {
                    case -695823596:
                        String m179f = C0629f.m179f(str3, m280c(str3));
                        System.out.println(m179f);
                        optString = new JSONObject(m179f).optString(C0052e.m1418a(new byte[]{52, -70, -82}, new byte[]{65, -56, -62, 7, -116, 83, 57, -74}));
                        break;
                    case 487063338:
                        if (!str3.contains(C0052e.m1418a(new byte[]{15, 31, 100, -59, 1, 123}, new byte[]{107, 123, 22, -82, 100, 2, 104, -28}))) {
                            m897d = atm.m897d("B1E6A1EF97F8B1DAA1D797C1B1E0A1D497CEB1E2A1EF97C7B1D8A1D197FFB1D6A1D097FAB1EDA1E997FDB1DBA1ED97F4B1E6A1D097C0B1EDA1D197C0");
                            break;
                        } else {
                            m897d = atm.m897d("B1D6A1D297C1B1DFA1D397F4B1EDA1D797F9B1D8A1D397C0B1D2A1E997C7B1E6A1EE97F3");
                            break;
                        }
                    case 584296655:
                        HashMap hashMap = new HashMap();
                        C0629f.m176i(str3, m280c(str3), hashMap);
                        optString = C0629f.m182c(hashMap);
                        break;
                    case 1059175904:
                        m897d = atm.m897d("B1E3A1D597F9B1D8A1EE97F9B1E2A1E297F4B1E0A1D497FDB1DBA1D497FFB1E0A1EE97C2B1DCA1ED");
                        break;
                }
            }
            jSONObject.put(C0052e.m1418a(new byte[]{102, -54, -61, 14, 77}, new byte[]{22, -85, -79, 125, 40, 106, 62, 67}), 0);
            jSONObject.put(C0052e.m1418a(new byte[]{-94, -107, -50, -17, -46, -123, -107}, new byte[]{-46, -7, -81, -106, -121, -9, -7, -45}), "");
            jSONObject.put(C0052e.m1418a(new byte[]{32, 103, -25}, new byte[]{85, 21, -117, 22, -114, -26, 123, -119}), optString);
            jSONObject.put(C0052e.m1418a(new byte[]{33, -115, -72, 29, 49, -74}, new byte[]{73, -24, -39, 121, 84, -60, 38, 115}), "");
            jSONObject.put(C0052e.m1418a(new byte[]{116, 104, 62, 77}, new byte[]{7, 29, 92, 43, 70, -82, -89, 73}), C0052e.m1418a(new byte[]{-12, -127, 47, 100, -34, -19, 122, 103, -10, -49}, new byte[]{-37, -9, 91, 16, -15, -104, 14, 1}));
            String m1418a = C0052e.m1418a(new byte[]{-16, -99, -25, 43}, new byte[]{-125, -24, -123, 95, 83, 24, 66, 95});
            jSONObject.put(m1418a, Proxy.getUrl() + C0052e.m1418a(new byte[]{-124, 48, 94, -123, -11, -28, -33, 34, -99, 33, 67, -44, -84}, new byte[]{-69, 84, 49, -72, -111, Byte.MIN_VALUE, -90, 81}) + URLEncoder.encode(str4));
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override // com.github.catvod.spider.Dora
    public final String searchContent(String str, boolean z) {
        try {
            String str2 = C0052e.m1418a(new byte[]{-63, 12, -20, 99, -49, -39, 92, 94, -51, 28, -31, 96, -110, -109, 1, 30, -122, 71, -21, 46}, new byte[]{-87, 120, -104, 19, -68, -29, 115, 113}) + str + C0052e.m1418a(new byte[]{22, -31, 86, -105, -92, -75, 113, 113, 64, -12, 4, -108, -65, -103, 113}, new byte[]{48, -111, 57, -28, -48, -22, 5, 8});
            C0288h m1414e = C0052e.m1414e(C0629f.m179f(str2, m280c(str2)));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0459g m967p0 = m1414e.m967p0(C0052e.m1418a(new byte[]{53, -14, 100, -30, 66, 32, 108, 99, 124, -8, 125, -94, 70, 42, 113, 99}, new byte[]{81, -101, 18, -52, 50, 79, 31, 23}));
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1E0A1D197FCB1D8A1D797F8B1DCA1D597C2B1EDA1D597CEB1E5A1D497FCB1E6A1EF97CFB1E1A1DD97C4B1D6A1D997F9");
                while (true) {
                    switch (m897d.hashCode() ^ 505967852) {
                        case -724058224:
                            m897d = i < m967p0.size() ? atm.m897d("B1E2A1ED97F0B1E5A1D097F4B1E2A1D797C2B1DFA1EE97C2B1E3A1D497C0B1D8A1EF97F0B1D2A1D297F0B1E2") : atm.m897d("B1DAA1D097F9B1DAA1D597C7B1D8A1D197CEB1E2A1D997F0B1DAA1EC97FEB1E2A1D097F8B1E2A1ED97C4B1DBA1DE97FFB1E1A1D397C0");
                        case 756789741:
                            m897d = atm.m897d("B1E3A1E297F8B1E0A1D797C0B1E2A1E997FCB1D1A1ED97FAB1E2A1DE97FAB1D6A1D497C2B1DDA1D997C0B1E2A1D497C0B1D6A1DD97FD");
                        case 1401822447:
                            jSONObject.put(C0052e.m1418a(new byte[]{12, -58, -94, 61}, new byte[]{96, -81, -47, 73, -102, -7, -16, 75}), jSONArray);
                            return jSONObject.toString();
                        case 1861889624:
                            String m602e = m967p0.get(i).m967p0(C0052e.m1418a(new byte[]{58, 26, 122, -106, 2, 19}, new byte[]{82, 40, 90, -88, 34, 114, 4, 30})).m602e();
                            String m897d2 = atm.m897d("B1DBA1EF97C7B1DDA1D297CEB1E3A1D097F3B1DCA1D397C4B1DEA1DD97CEB1D1A1D497C0B1DEA1D997FD");
                            while (true) {
                                switch (m897d2.hashCode() ^ 1660640629) {
                                    case -1505032134:
                                        break;
                                    case -704608139:
                                        m897d2 = m602e.contains(str) ? atm.m897d("B1D8A1D397F8B1E2A1D297F9B1E2A1EF97C0B1E0A1D597CFB1E2A1ED97FDB1E1A1D497C0B1DFA1EC97C4B1E1A1ED97C1B1DDA1EF97C1B1DBA1D3") : atm.m897d("B1D6A1EF97C4B1E2A1D997FCB1ECA1E397C2B1DEA1E297F4B1E2A1D997C0B1E2A1E297FAB1D2A1ED97F8B1D1A1D597FCB1DEA1D797C7B1E0A1D497C0");
                                    case -211946680:
                                        Matcher matcher = this.f1099d.matcher(m967p0.get(i).m967p0(C0052e.m1418a(new byte[]{15, -88, 88, 12, 67, 11}, new byte[]{103, -102, 120, 50, 99, 106, -6, -49})).m606a(C0052e.m1418a(new byte[]{-113, -80, -113, 30}, new byte[]{-25, -62, -22, 120, 92, 56, -65, -100})));
                                        String m897d3 = atm.m897d("B1E1A1D197C2B1DEA1D297FDB1E2A1D097FDB1ECA1EA97C7B1D2A1D097C1B1E2A1D597FDB1D8");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ (-154305519)) {
                                                case 1208945065:
                                                    m897d3 = atm.m897d("B1DAA1DE97F3B1E3A1D597F3B1E3A1EF97FFB1DCA1D297F4B1EDA1D397C0B1E2A1EF97C7B1DAA1EA97FA");
                                                case 1256893859:
                                                    m897d3 = matcher.find() ? atm.m897d("B1D2A1DE97C4B1DDA1D797FEB1E2A1E397F3B1DEA1D997FDB1D8A1DE97CEB1D2A1ED97FCB1DEA1EA97FDB1DBA1ED") : atm.m897d("B1D2A1EF97FAB1E2A1EA97CEB1D8A1D497C4B1EDA1E397C0B1EDA1E297FDB1D8A1EF97C1B1DBA1DE97C4B1E2");
                                                case 1642997943:
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    String group = matcher.group(1);
                                                    String str3 = C0052e.m1418a(new byte[]{-85, 3, -106, 72, 60, 94, 92, -112, -89, 19, -101, 75, 97, 20, 1, -48, -20}, new byte[]{-61, 119, -30, 56, 79, 100, 115, -65}) + group;
                                                    String m606a = C0052e.m1414e(C0629f.m179f(str3, m280c(str3))).m967p0(C0052e.m1418a(new byte[]{103, -80, 47, -40, 72, -51, -104, -42, 106, -86, 45, -37, 69, -42, -120, -41, 35, -80, 52, -111}, new byte[]{3, -39, 89, -10, 44, -94, -19, -70})).m606a(C0052e.m1418a(new byte[]{-121, 122, -89, -72, 123, -48, 73, -61}, new byte[]{-29, 27, -45, -39, 86, -93, 59, -96}));
                                                    String m897d4 = atm.m897d("B1D1A1EF97FDB1D6A1ED97CEB1E6A1E397F0B1E3A1D097C1B1DEA1EC97FDB1E2A1DD97FFB1DDA1D097F0B1DDA1ED");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ (-711018227)) {
                                                            case -1602063764:
                                                                m897d4 = m602e.contains(C0052e.m1418a(new byte[]{3}, new byte[]{43, 62, -33, -11, 46, Byte.MIN_VALUE, -41, -31})) ? atm.m897d("B1E2A1EC97C3B1DAA1D197C1B1ECA1D597F4B1DFA1E397C0B1E6A1E397C0B1E2A1D997F9B1DBA1ED97FEB1D6A1EF") : atm.m897d("B1D1A1D197FDB1E2A1ED97CEB1E2A1ED97C3B1D1A1ED97C0B1D8A1EE97C7B1D6A1ED97FDB1E2");
                                                            case 618527013:
                                                                String[] split = m602e.split(C0052e.m1418a(new byte[]{40, -20}, new byte[]{116, -60, -125, -67, 85, -106, 102, -47}));
                                                                String str4 = split[0];
                                                                String replace = split[1].replace(C0052e.m1418a(new byte[]{111}, new byte[]{71, -100, -53, 36, -41, Byte.MIN_VALUE, 91, 74}), "").replace(C0052e.m1418a(new byte[]{88}, new byte[]{113, -2, 119, 9, 80, -54, 81, -74}), "");
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{109, -58, 25, 92, -61, 27, -32, -104}, new byte[]{27, -87, 125, 3, -83, 122, -115, -3}), str4);
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-48, 72, 75, 74, -78, 64, 24, -14, -44, 76, 92}, new byte[]{-90, 39, 47, 21, -64, 37, 117, -109}), replace);
                                                                break;
                                                            case 1220734950:
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{70, -87, -24, -4, -127, 33, -116, -9}, new byte[]{48, -58, -116, -93, -17, 64, -31, -110}), m602e);
                                                                jSONObject2.put(C0052e.m1418a(new byte[]{-2, -17, 44, 75, 65, -109, -3, 48, -6, -21, 59}, new byte[]{-120, Byte.MIN_VALUE, 72, 20, 51, -10, -112, 81}), C0052e.m1418a(new byte[]{-70, 12, -33}, new byte[]{95, -119, 119, -108, -120, -55, 63, -104}));
                                                                break;
                                                            case 2132941859:
                                                                m897d4 = atm.m897d("B1DEA1D097FDB1E2A1E297CFB1E2A1D197CFB1DAA1E297CEB1ECA1EC97C0B1D6A1D497C2B1DA");
                                                        }
                                                    }
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{65, 110, -42, -6, 36, 20}, new byte[]{55, 1, -78, -91, 77, 112, 94, -5}), group);
                                                    jSONObject2.put(C0052e.m1418a(new byte[]{-61, -5, 121, -121, -115, 27, 122}, new byte[]{-75, -108, 29, -40, -3, 114, 25, -117}), m606a);
                                                    jSONArray.put(jSONObject2);
                                                    continue;
                                                case 2063913036:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2038396300:
                                        m897d2 = atm.m897d("B1D6A1D197F3B1E5A1DD97C2B1DBA1EF97FDB1DFA1D397FAB1E3A1D997F9B1E2");
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
}
