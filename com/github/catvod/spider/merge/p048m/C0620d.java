package com.github.catvod.spider.merge.p048m;

import android.net.Uri;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.m.d */
/* loaded from: classes.dex */
public final class C0620d {

    /* renamed from: a */
    private static final Pattern f1186a;

    /* renamed from: b */
    public static Charset f1187b;

    static {
        String m897d = atm.m897d("B1DFA1ED97F9B1E2A1EA97CEB1DEA1DE97C0B1DBA1DD97FAB1EDA1D497C2B1ECA1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 613) ^ 290277075) {
                case -2060072726:
                    f1187b = Charset.forName(C0052e.m1418a(new byte[]{105, -60, -119, 120, Byte.MAX_VALUE}, new byte[]{60, -112, -49, 85, 71, 103, -51, -29}));
                    m897d = atm.m897d("B1D2A1EA97F0B1E2A1ED97F4B1ECA1EE97FDB1E6A1ED97C7B1DDA1EF97C1B1DAA1E397C0B1DCA1D297FAB1EDA1DE97F3B1E6A1ED97F4");
                    break;
                case -2050184125:
                    f1186a = Pattern.compile(atm.m897d("020E0E056470555B120138284354530E7E6E46074529627007490F4D30351A4E0613202E161B0C1C3035010C060721241D170C0921280D53264A627216120E013C7042455B1D382C1A53545C376A5C560729627007490F4D30351A4E0613202E161B0C1C3035010C060721241D170C0921280D53061D382C1A52524A6D301E0E0A5C627111484C593167451749007404550A0E48216B1F42545F30301E0E0A5D64674B120E013C714453504A283D0C1B0F1938044413021C2B2D0B265416233545545009242C1E0A525D7379020E0E056576435045162836470E150617063645275F30301E0E0A5D64674B120E013C714453504A633708105501232B3124264A117216120E013C76404555052039131F085A216B1F420A192D2136540A1D3C04550F081971764006120138284450455A3C340B031F076376404521051C05061B03296228020A264A392A0647545F30301E0E0A5B6667450A1614353403090E5A216B1F425529732E031E475B6624020E0E05627255265405242836450E0C3C3D57174900747E4450061D382C1A54504A633C050D141923390E541B063C203645545F30301E0E0A5B6667451B0A1C632D1A251B0525761A120A2973764006120138281954504A10765C4C031E10760914545F30301E0E0A5D64674B120E013C714453504A223D1E1F1B06290444191518633E03161F5A6272"));
                    new ArrayList();
                    m897d = atm.m897d("B1DDA1D197C0B1E2A1E397FAB1DAA1EC97FDB1E6A1ED97FEB1D1A1DD97C0B1D2A1D797F3B1DBA1E997FEB1E2A1E397C2B1DEA1EF97FFB1E5");
                    break;
                case -173548751:
                    C0052e.m1418a(new byte[]{29, 2, -122, -18, 44, -85, -96, -93, 101, 67, -52, -89, 104, -112, -88, -30, 52, 2, -117, -12, 96, -119, -107, -84, 97, 93, -46, -73, 123, -25, -106, -27, 62, 91, -56, -68, 96, -65, -9, -72, 121, 77, -67, -9, 48, -85, -92, -37, 53, 15, -73, -18, 52, -24, -12, -65, 103, 67, -49, -79, 96, -17, -118, -60, 4, 32, -80, -85, 96, -85, -88, -25, 53, 77, -69, -30, 35, -84, -82, -91, 112, 46, -108, -11, 47, -86, -92, -93, 97, 92, -50, -87, 112, -23, -15, -94, 96, 77, -81, -26, 38, -90, -77, -27, Byte.MAX_VALUE, 88, -49, -80, 110, -12, -9}, new byte[]{80, 109, -4, -121, 64, -57, -63, -116});
                    m897d = atm.m897d("B1E2A1EA97FDB1E2A1D497C1B1E6A1D997F4B1DBA1EE97F9B1E2A1ED97C0B1DDA1EC97FEB1D6A1EE97FAB1E3A1E397C0");
                    break;
                case -21094602:
                    Charset.forName(C0052e.m1418a(new byte[]{-63, 29, -97, 77, Byte.MAX_VALUE, -3, -93, -89, -91, Byte.MAX_VALUE}, new byte[]{-120, 78, -48, 96, 71, -59, -106, -98}));
                    m897d = atm.m897d("B1E1A1D297FCB1D1A1E297F0B1E2A1E397F8B1DCA1EE97F3B1E1A1EC97C3B1E1A1D797CFB1D2A1ED97FDB1D8A1D3");
                    break;
                case 1052843384:
                    Charset.forName(C0052e.m1418a(new byte[]{-102, 81, -15, -46, 9, -102, -107, -39}, new byte[]{-49, 2, -36, -109, 90, -39, -36, -112}));
                    m897d = atm.m897d("B1E0A1E397FCB1D8A1D497F3B1DBA1D097FEB1E2A1E297C1B1DBA1EA97CFB1E5A1E997FEB1ECA1ED");
                    break;
                case 1767953911:
                    C0052e.m1418a(new byte[]{-38, -77, 32, -49, -96, -120, -33, 54, -94, -14, 106, -122, -28, -88, -41, 119, -30, -92, 97, -122, -115, -118, -38, 107, -8, -75, 62, -122, -6, -54, -114, 55, -90, -25, 122, -24, -87, -100, -53, 106, -73, -21, 115, -122, -115, -108, -50, 117, -14, -117, 63, -60, -121, -115, -54, 54, -94, -17, 109, -120, -1, -46, -98, 49, -36, -108, 14, -21, Byte.MIN_VALUE, -56, -98, 117, -2, -73, 63, -122, -117, -127, -35, 114, -8, -11, 122, -27, -92, -106, -47, 116, -14, -13, 109, -106, -30, -44, -112, 42, -94, -17, 98, -120, -3, -43, -114, 57, -60, -67, 60, -57, -66, -115, -111, 44, -92, -21, 116, -107, -6}, new byte[]{-105, -36, 90, -90, -52, -28, -66, 25});
                    m897d = atm.m897d("B1DEA1D097C4B1E2A1D197F8B1E2A1ED97F9B1ECA1D597C3B1E5A1ED97C0B1E2A1EF97FCB1D8A1DD97FF");
                    break;
                case 2140102744:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static String m203a(String str, String str2) {
        Matcher matcher = null;
        String m897d = atm.m897d("B1D1A1EC97FDB1DFA1DD97FFB1E2A1D597F0B1DBA1ED97C1B1EDA1ED97C0B1E3A1EA97F3B1D2A1D497CF");
        while (true) {
            switch ((m897d.hashCode() ^ 930) ^ (-1857606087)) {
                case -1465271879:
                    matcher = Pattern.compile(str2).matcher(str);
                    m897d = atm.m897d("B1ECA1D997FEB1E2A1EC97CEB1DBA1DE97F4B1E3A1D297FAB1E6A1D497F4B1D8A1DD97F4B1D2A1DE97FAB1E6A1EA97C4B1D1A1ED97C0");
                    break;
                case -213857657:
                    m897d = atm.m897d("B1E1A1EC97FFB1D2A1D197FCB1E6A1DE97C0B1E2A1E297F3B1E5A1E397C2B1ECA1ED97FAB1DFA1E297C3B1D1A1D097C0B1DEA1E397C4B1E2");
                    break;
                case -14019910:
                    m897d = atm.m897d("B1DFA1DD97FCB1E0A1D797F9B1D8A1D197FDB1DAA1EF97F3B1ECA1DD97C0B1E1A1E2");
                    break;
                case 1210517408:
                    String m897d2 = atm.m897d("B1D1A1D297FEB1DBA1D097C7B1E1A1EE97F3B1D2A1DD97F9B1E0A1D597C3B1E6A1D297FCB1E0A1D997C4B1E2A1D197F3B1E3A1E397F0");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-263942399)) {
                            case -1315007060:
                                m897d = atm.m897d("B1D2A1EC97FFB1D8A1E397C1B1D6A1DD97FFB1E2A1DD97C7B1DDA1D297FFB1D2A1ED97C0B1D6A1E397C0B1DAA1EA97C4");
                                continue;
                            case -604235094:
                                m897d2 = matcher.find() ? atm.m897d("B1E1A1D397C3B1D1A1D597FCB1E0A1D497FDB1DCA1D797F3B1DBA1DE97FA") : atm.m897d("B1D1A1E397C0B1DAA1E297C1B1DEA1E397FAB1E0A1D997C4B1E2A1ED97C4B1E6A1E9");
                            case 1240949865:
                                m897d2 = atm.m897d("B1E3A1ED97FDB1E2A1E997FFB1D2A1EF97F0B1E6A1ED97CFB1DEA1E997FDB1DBA1E397C0B1DDA1D097FDB1E2A1E997FFB1DE");
                            case 1354102193:
                                m897d = atm.m897d("B1E2A1D297FDB1E2A1D597CEB1DFA1D097C2B1E0A1DE97FAB1E1A1EC97CFB1DBA1D097C3B1DC");
                                continue;
                        }
                    }
                    break;
                case 1403231810:
                    return matcher.group(0);
                case 1990738488:
                    return "";
            }
        }
    }

    /* renamed from: b */
    public static String m202b(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(C0052e.m1418a(new byte[]{-8, -87, 0}, new byte[]{-75, -19, 53, -103, 2, 16, -57, -74})).digest(str.getBytes(f1187b));
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1E5A1D797FEB1E0A1E397C1B1E3A1D297C0B1E2A1D797F9B1D1A1DD97C4B1EDA1D497FAB1ECA1D397C2B1E6A1ED97F8B1DEA1ED97C0");
                while (true) {
                    switch (m897d.hashCode() ^ 1216746910) {
                        case -1067287556:
                            return sb.toString().toLowerCase();
                        case -329273516:
                            m897d = i < digest.length ? atm.m897d("B1DCA1D997CEB1DDA1D797FDB1DFA1D297C4B1E0A1D097C1B1E1A1DD97C0B1E2A1DE97FAB1E0A1D797CEB1D2A1DE97C4B1D8A1D397CEB1E0") : atm.m897d("B1E1A1EC97F9B1E2A1D997C7B1DCA1ED97C1B1DAA1DD97C0B1E2A1ED97CFB1DEA1D797FE");
                        case 1542542491:
                            m897d = atm.m897d("B1E0A1EF97C4B1E2A1D097C3B1DEA1EA97CEB1D8A1EE97FFB1E2A1D997F3B1D6A1D797CEB1E6A1D597FDB1E0A1EA97C2B1E2A1ED");
                        case 1912618492:
                            String hexString = Integer.toHexString(digest[i] & 255);
                            String m897d2 = atm.m897d("B1E1A1D097FDB1DDA1EA97C1B1DCA1EE97F4B1DEA1ED97F3B1DBA1D297C0B1D6A1D797FF");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-1179269348)) {
                                    case -1511408946:
                                        break;
                                    case -660484049:
                                        sb.append(0);
                                        break;
                                    case -307654677:
                                        m897d2 = atm.m897d("B1EDA1D997CEB1EDA1ED97C0B1E3A1ED97F9B1E2A1EA97F4B1E5A1D097FEB1DAA1E997CE");
                                    case 96158393:
                                        m897d2 = hexString.length() < 2 ? atm.m897d("B1D6A1DE97FFB1D6A1D397C4B1E2A1D497CEB1D2A1ED97C1B1E1A1E397C0B1D6A1E297C2B1DDA1E297CFB1E5A1E397F8B1E5A1D9") : atm.m897d("B1DEA1EA97C4B1E1A1E297F0B1E2A1D597CFB1E6A1ED97C4B1DAA1DD97FAB1E3A1D497C0B1E3A1EF97F9B1DBA1DE97FDB1E3A1D397F4B1D6A1D497C1");
                                }
                            }
                            sb.append(hexString);
                            i++;
                            break;
                    }
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m201c(Long l, String str) {
        Timestamp timestamp = null;
        String m897d = atm.m897d("B1E1A1EA97FFB1E5A1EC97CEB1DDA1DD97FCB1E5A1D097FFB1E3A1ED97FFB1E2A1DD97FFB1E6A1ED97F0B1E1A1EC97CEB1E2A1D297C0B1EDA1EF97FA");
        while (true) {
            switch ((m897d.hashCode() ^ 190) ^ 234596978) {
                case -1734291137:
                    timestamp = new Timestamp(l.longValue());
                    m897d = atm.m897d("B1DDA1EC97FAB1D1A1D597C2B1DCA1EC97F9B1E6A1D597C4B1D8A1D297F4B1E3A1EC97CEB1D2A1DD97C2B1D1A1EF97C3");
                    break;
                case 881871588:
                    m897d = atm.m897d("B1EDA1D597CEB1DFA1EF97C7B1EDA1E397F0B1DBA1D997C2B1D2A1EC97C1");
                    break;
                case 1564413033:
                    m897d = atm.m897d("B1DEA1E397FDB1DCA1EA97FFB1DAA1D997C0B1E5A1D097C4B1D2A1EC97FCB1DBA1D797C1B1E2A1EA97FDB1D6A1E997CF");
                    break;
                case 1643463052:
                    return new SimpleDateFormat(str, Locale.ENGLISH).format((Date) timestamp);
            }
        }
    }

    /* renamed from: d */
    public static JSONObject m200d(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String m897d = atm.m897d("B1E3A1D497FAB1DDA1D097FEB1E5A1D397FFB1D1A1ED97C3B1E3A1D497FAB1D6A1D397C4B1E5A1EC97FEB1DDA1DD97C3B1DEA1E297FC");
        while (true) {
            switch ((m897d.hashCode() ^ 927) ^ 999020815) {
                case -1986494512:
                    str6 = C0052e.m1418a(new byte[]{116, -28, -88, Byte.MIN_VALUE, 95, 113, 30, 105, 123, -100, -23, -54}, new byte[]{84, -87, -57, -6, 54, 29, 114, 8});
                    m897d = atm.m897d("B1E2A1D397C3B1D1A1EF97F3B1E2A1D497CEB1E2A1D097C3B1E2A1D997FAB1E6A1ED97C0B1DCA1DE97C4B1E6A1D097C0B1D1A1E397CEB1E2A1D197F9B1E2");
                    break;
                case -1863822938:
                    return jSONObject3;
                case -1772004449:
                    jSONObject2 = new JSONObject();
                    m897d = atm.m897d("B1E1A1EC97FFB1D6A1EC97F0B1E2A1DD97FFB1E5A1DE97F8B1E6A1EF97CEB1ECA1D997FAB1DF");
                    break;
                case -1487023841:
                    String m897d2 = atm.m897d("B1E3A1D797F3B1DEA1D097FFB1E2A1D297F4B1ECA1ED97FAB1EDA1D597F4B1DD");
                    while (true) {
                        switch (m897d2.hashCode() ^ 1103884075) {
                            case -1776956256:
                                m897d2 = jSONObject == null ? atm.m897d("B1ECA1D197F0B1E2A1EF97CFB1DBA1ED97FCB1EDA1ED97C0B1D2A1E397C1B1D1A1ED97FEB1E2A1E397CF") : atm.m897d("B1E5A1E297FEB1E2A1D197F4B1D8A1DE97FFB1D8A1DD97FFB1DBA1ED97FDB1E2A1E397C0B1DFA1EA97C7B1DCA1D497CEB1E2A1EA97FDB1E1");
                            case -167431198:
                                m897d = atm.m897d("B1E2A1E397C3B1ECA1D997FEB1E2A1D197FEB1E1A1D397C3B1D2A1EE97C2B1E6A1D297CFB1EDA1D797C7B1E2A1ED97C3B1D6A1D3");
                                continue;
                            case -28551955:
                                m897d2 = atm.m897d("B1D1A1EA97C4B1DCA1D397F3B1DBA1ED97C0B1E2A1D597CFB1DBA1ED97C1B1D1A1E997C0B1D8A1E397FAB1D2A1EE97FEB1E0A1D997CFB1E1A1D197C4");
                            case 1058819071:
                                m897d = atm.m897d("B1ECA1DE97F9B1E2A1E297C1B1DFA1ED97C4B1D1A1D397C0B1DEA1DE97FCB1D2A1DE97F9B1DFA1EF97FEB1D2A1EE97F9");
                                continue;
                        }
                    }
                    break;
                case -1431462385:
                    jSONObject3.put(C0052e.m1418a(new byte[]{124, -101, 103, -48, -103, 45, 110}, new byte[]{46, -2, 1, -75, -21, 72, 28, 13}), atm.m897d("4A"));
                    m897d = atm.m897d("B1E6A1D097CFB1D2A1EC97F9B1DEA1D297FEB1E2A1D397FDB1E2A1D197CEB1DCA1ED97FFB1E3A1D597F9B1D8A1D7");
                    break;
                case -1415853139:
                    jSONObject3.put(C0052e.m1418a(new byte[]{16, -79, -50, 50, 92, 44, -106}, new byte[]{66, -44, -88, 87, 46, 73, -28, -60}), C0052e.m1418a(new byte[]{-104, -105, -20, 49, -49, -89, -17, 22, -105, -120, -17, 50, -111, -74, -68, 85, -47, -99, -15, 41, -42, -6, -74, 86, -43, -48}, new byte[]{-72, -1, -104, 69, -65, -44, -43, 57}));
                    m897d = atm.m897d("B1DCA1EA97FFB1EDA1DD97C4B1DCA1EF97F0B1DDA1EC97CEB1E2A1D197C0B1DCA1ED97FFB1D8A1E9");
                    break;
                case -1347395828:
                    m897d = atm.m897d("B1ECA1D597FCB1DCA1DD97C1B1DEA1D397F9B1E1A1DD97F8B1E5A1D297C0B1E2A1D297C2B1E3A1D197C1B1E6A1ED97C7B1EDA1D0");
                    break;
                case -1156250529:
                    m897d = atm.m897d("B1D6A1EF97FCB1DDA1D097F0B1E2A1D397F4B1E6A1ED97F4B1EDA1D597C3B1DEA1E397C4B1DDA1ED");
                    jSONObject3 = jSONObject;
                    break;
                case -1062411863:
                    str8 = C0052e.m1418a(new byte[]{-20, 54, -124, -118, -21, 109, -88, 25, -29, 78, -59, -64, -94, 41, -109, 17, -94, 31, -124, -121, -15, 33, -118, 44, -20, 74, -37, -34, -78, 58, -28, 47, -91, 21, -35, -60, -71, 33, -68, 78, -8, 82, -53, -79, -14, 113, -88, 29, -101, 30, -119, -69, -21, 117, -21, 77, -1, 76, -59, -61, -76, 33, -20, 51, -124, 47, -90, -68, -82, 33, -88, 17, -89, 30, -53, -73, -25, 98, -81, 23, -27, 91, -88, -104, -16, 110, -87, 29, -29, 74, -38, -62, -84, 49, -22, 72, -30, 75, -53, -93, -29, 103, -91, 10, -91, 84, -34, -61, -75, 47, -9, 78}, new byte[]{-52, 123, -21, -16, -126, 1, -60, 120});
                    m897d = atm.m897d("B1E6A1D597C4B1E2A1D197CEB1E2A1ED97FFB1DEA1D097F8B1D1A1D597C0B1D2A1D1");
                    break;
                case -1060967311:
                    jSONObject3.put(C0052e.m1418a(new byte[]{-73, -93, 8, 112, 60, -14, -64}, new byte[]{-27, -58, 110, 21, 78, -105, -78, -67}), atm.m897d("4A"));
                    m897d = atm.m897d("B1D1A1EF97FEB1E2A1E997F0B1ECA1ED97FAB1E3A1E397C0B1E1A1D397FFB1E2A1ED97F9B1DDA1D997C0B1E1A1E297C0B1E5A1D297C3B1D1");
                    break;
                case -1046850541:
                    m897d = atm.m897d("B1DDA1E297F0B1E2A1DE97FDB1DDA1D597FCB1D1A1DD97F9B1ECA1EA97C7B1E6A1E397CFB1D1");
                    str9 = str6;
                    break;
                case -892542808:
                    m897d = atm.m897d("B1EDA1DE97C1B1E1A1E997F4B1D2A1EC97F0B1DAA1E297FEB1DAA1EF97C4B1E2A1EF97FCB1DBA1ED97C7B1DFA1ED97FFB1E0A1E397C3B1E5");
                    str10 = str3;
                    break;
                case -383876866:
                    str5 = C0052e.m1418a(new byte[]{48, -14, -27, Byte.MIN_VALUE, 42, 4, -17, -27, 11, -11}, new byte[]{101, -127, Byte.MIN_VALUE, -14, 7, 69, -120, Byte.MIN_VALUE});
                    m897d = atm.m897d("B1DFA1D497F0B1E2A1D797F9B1DBA1ED97C3B1DAA1DD97C0B1D2A1EA97C0B1ECA1D197C7B1DBA1E297F3B1E1A1D397C1");
                    break;
                case -299849712:
                    String m897d3 = atm.m897d("B1E5A1DD97C3B1DBA1D297FAB1E5A1D497CFB1DEA1DE97F9B1E1A1DE97C0");
                    while (true) {
                        switch (m897d3.hashCode() ^ 580545291) {
                            case -1645196430:
                                m897d3 = str.contains(C0052e.m1418a(new byte[]{57, 33, -112, -63, 6, 94, -44, 33, 96, 53, -120, -126}, new byte[]{78, 86, -25, -17, 107, 57, -96, 87})) ? atm.m897d("B1D6A1D297C0B1ECA1D797CFB1E0A1EA97C1B1DFA1D597F9B1E2A1EC97F8B1DCA1EA97F4B1E1A1D497CFB1E1A1E397C3B1E2A1EE97F9B1ECA1ED") : atm.m897d("B1D1A1D997CFB1E2A1D797C3B1DFA1EC97F9B1E1A1E297C4B1E6A1E297F0B1E2A1DE97FCB1ECA1ED97F9B1E1A1D397F0B1E3A1D097FAB1EDA1D1");
                            case -1287480648:
                                m897d = atm.m897d("B1E1A1D597FDB1DFA1D497F4B1D1A1D197FDB1E2A1D797F0B1D8A1EC97C4B1E2A1ED97C3B1E3A1D397C0B1E2A1EC97F0B1D8A1EE97C4B1E3A1EE97C0");
                                continue;
                            case 168766286:
                                m897d = atm.m897d("B1DFA1EA97C4B1DDA1E397CFB1E1A1ED97C3B1DAA1E997FDB1E2A1D097C0B1E2A1ED97FEB1DFA1ED");
                                continue;
                            case 1164558134:
                                m897d3 = atm.m897d("B1DEA1D397F8B1ECA1ED97FFB1E2A1EA97FFB1E3A1D397FEB1DDA1DE97C4B1E1A1EA97C3B1DFA1D997CEB1E3A1D997F0");
                        }
                    }
                    break;
                case -185487758:
                    m897d = atm.m897d("B1ECA1DE97F9B1E2A1E297C1B1DFA1ED97C4B1D1A1D397C0B1DEA1DE97FCB1D2A1DE97F9B1DFA1EF97FEB1D2A1EE97F9");
                    jSONObject3 = jSONObject2;
                    break;
                case -89843286:
                case 344759681:
                    m897d = atm.m897d("B1E1A1E297CEB1E2A1E297C2B1EDA1DE97F9B1DDA1ED97F0B1DDA1D397F8B1DFA1EA97CFB1DFA1E397CEB1DAA1E297CFB1EDA1EE");
                    break;
                case -12189344:
                    str7 = C0052e.m1418a(new byte[]{-57, 110, -39, 33, -122, 103, Byte.MAX_VALUE, -76, -4, 105}, new byte[]{-110, 29, -68, 83, -85, 38, 24, -47});
                    m897d = atm.m897d("B1D6A1E397FCB1DEA1EA97CFB1DCA1E297FDB1DEA1DE97C4B1E2A1EE97FFB1E0");
                    break;
                case 106616745:
                    str3 = C0052e.m1418a(new byte[]{17, 66, -99, 15, -108, 84, 86, -110, 42, 69}, new byte[]{68, 49, -8, 125, -71, 21, 49, -9});
                    m897d = atm.m897d("B1DEA1D797F3B1E6A1D597F0B1E2A1EE97FFB1E2A1ED97FCB1D1A1D597FFB1E0A1DD97F0B1D1A1D597C0B1DCA1EC97FF");
                    break;
                case 145315695:
                    m897d = atm.m897d("B1ECA1DE97FEB1E2A1D197CEB1E5A1EA97F3B1D6A1EC97C2B1E6A1ED97F0B1D2A1E997F9B1DDA1D197C3B1DFA1D197CEB1DAA1D997C0B1E2A1ED97C0");
                    break;
                case 381014757:
                    m897d = atm.m897d("B1DCA1DD97C2B1DDA1E997FDB1E5A1ED97F4B1D8A1DD97FDB1D2A1D197CEB1E3A1E997F9B1DEA1ED97FA");
                    str9 = str8;
                    break;
                case 466009686:
                    m897d = atm.m897d("B1E1A1E297CEB1E2A1E297C2B1EDA1DE97F9B1DDA1ED97F0B1DDA1D397F8B1DFA1EA97CFB1DFA1E397CEB1DAA1E297CFB1EDA1EE");
                    str10 = str7;
                    break;
                case 712907258:
                    m897d = atm.m897d("B1D2A1D297FDB1E2A1ED97FAB1E6A1E997CFB1E3A1EF97C0B1E2A1E397C7B1E2A1EA97FEB1DAA1D497C4B1E1");
                    str9 = str4;
                    break;
                case 761334193:
                    m897d = atm.m897d("B1ECA1DE97C4B1E2A1D397C1B1E5A1EF97F9B1DFA1ED97FCB1E2A1E397FAB1ECA1D797C7B1D2A1D397C0");
                    break;
                case 1140960925:
                    String m897d4 = atm.m897d("B1ECA1EA97F9B1E2A1E297C3B1E3A1E997F4B1E3A1E997FFB1E2A1EA97CFB1DDA1D497CFB1DDA1EF97C7B1E1");
                    while (true) {
                        switch (m897d4.hashCode() ^ (-447173666)) {
                            case -391899451:
                                m897d4 = str.contains(C0052e.m1418a(new byte[]{20, -53, 122, -98, -119, 56, -106, 15}, new byte[]{118, -94, 22, -9, -21, 81, -6, 102})) ? atm.m897d("B1D2A1D297C4B1E2A1D797C3B1DAA1D397F4B1E6A1E997C4B1DCA1D497F8B1ECA1DD97FEB1D2A1ED97CEB1D2A1D497C0B1E2A1EC97FEB1E2") : atm.m897d("B1ECA1E997C4B1D8A1EE97CEB1E2A1EF97CFB1ECA1ED97F8B1DAA1D297F4B1E1A1D797CFB1E2A1DD97FFB1DFA1E297FFB1DFA1E397C0");
                            case -150801424:
                                m897d = atm.m897d("B1DAA1DE97F0B1E2A1ED97F8B1ECA1ED97C7B1E3A1DE97CFB1E3A1EC97F9");
                                continue;
                            case 1039990971:
                                m897d4 = atm.m897d("B1E0A1D397F9B1EDA1D297FDB1DEA1E297F9B1E2A1DD97FEB1E2A1ED97CFB1DCA1EF97FFB1DEA1ED97CEB1E3A1EA97FAB1E0A1DD97C0B1E1A1EE");
                            case 1063207634:
                                m897d = atm.m897d("B1ECA1DD97C4B1DAA1D797CEB1E2A1D097FEB1ECA1ED97C0B1D1A1EA97CEB1E5A1D397C2B1ECA1D397C0B1D2A1D397F3");
                                continue;
                        }
                    }
                    break;
                case 1459159574:
                    jSONObject3.put(str10, str9);
                    m897d = atm.m897d("B1DAA1DE97F0B1E2A1ED97F8B1ECA1ED97C7B1E3A1DE97CFB1E3A1EC97F9");
                    break;
                case 1526700055:
                    String m897d5 = atm.m897d("B1DBA1D597C1B1ECA1EF97F3B1E6A1ED97C0B1E5A1E997FDB1E1A1EA97FEB1E2A1D197F4");
                    while (true) {
                        switch (m897d5.hashCode() ^ 1628602348) {
                            case -2022313893:
                                m897d5 = str2.contains(C0052e.m1418a(new byte[]{105, 113, -36, Byte.MIN_VALUE, -107, 122, 46, -79, 105, 110}, new byte[]{29, 24, -88, -31, -5, 84, 67, -42})) ? atm.m897d("B1DEA1E997F8B1E1A1D297FEB1DBA1D297F0B1E2A1D797FAB1ECA1EF97FEB1DF") : atm.m897d("B1DCA1D197FFB1D2A1D297CEB1DBA1D297C7B1DAA1E397C1B1D1A1E997C7B1EDA1D197C4B1E2A1D397F8B1E3");
                            case -789418100:
                                m897d = atm.m897d("B1E5A1D397F0B1E2A1D397F8B1E3A1DE97FEB1DDA1ED97F0B1E2A1D397FEB1E2A1D4");
                                continue;
                            case -257347742:
                                m897d = atm.m897d("B1E1A1E397C3B1E0A1D797C4B1E0A1D797CFB1DCA1EE97F0B1DCA1EE97C4B1E2A1D097F3B1DCA1ED");
                                continue;
                            case 575993351:
                                m897d5 = atm.m897d("B1D1A1EF97F0B1DAA1D097FEB1DCA1D597FAB1DBA1EE97F9B1E2A1ED97F0B1ECA1ED97F9B1ECA1D3");
                        }
                    }
                    break;
                case 1807500456:
                    m897d = atm.m897d("B1DBA1ED97F9B1E1A1EC97F9B1DDA1D497F9B1DBA1D997CFB1DDA1D397C1B1D1A1DD97C4");
                    str10 = str5;
                    break;
                case 1974624736:
                    str4 = C0052e.m1418a(new byte[]{-36, -117, -97, 61, 71, 32, -84, 116, -45, -13, -34, 119}, new byte[]{-4, -58, -16, 71, 46, 76, -64, 21});
                    m897d = atm.m897d("B1D1A1D097FEB1E2A1D197F0B1E0A1E397C3B1D1A1DE97F0B1E0A1E397C7B1EDA1EE97C0B1E2A1E397CEB1E0A1D597CFB1E1");
                    break;
            }
        }
    }

    /* renamed from: e */
    public static boolean m199e(String str) {
        String m897d = atm.m897d("B1E3A1ED97F8B1E6A1ED97FCB1ECA1E397F9B1DEA1D597FDB1D6A1EA97FDB1E0A1EF97FAB1ECA1DD97FDB1E2");
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch ((m897d.hashCode() ^ 240) ^ 672090104) {
                case -1917032405:
                    return z2;
                case -1270763231:
                    m897d = atm.m897d("B1DEA1D797C0B1E2A1D797FAB1DCA1D397FCB1ECA1DE97FEB1D6A1D097C1B1DCA1ED97C4B1E2A1D097FEB1E6A1D497C0B1E5A1ED97C3B1E3A1EC97CE");
                    z2 = z;
                    continue;
                case -964526829:
                    m897d = atm.m897d("B1E1A1EC97C3B1DFA1ED97F9B1E5A1D097CFB1EDA1E397C0B1E6A1EA");
                    z2 = false;
                    continue;
                case -735879092:
                    m897d = atm.m897d("B1DAA1D397F0B1E2A1D297FCB1DCA1D797F8B1E3A1D497FEB1E2A1ED97C4B1DFA1D097CEB1E3A1E9");
                    continue;
                case -540343801:
                    m897d = atm.m897d("B1D8A1EE97FEB1E2A1E997C1B1E3A1D197FFB1E6A1ED97FCB1E6A1D397F8B1D8A1EE");
                    continue;
                case -436624109:
                    break;
                case -49667785:
                    z = true;
                    m897d = atm.m897d("B1EDA1DE97C2B1DCA1E397C0B1EDA1ED97FDB1D2A1DD97CEB1E2A1D097FCB1DBA1ED97C1B1ECA1D397C0");
                    continue;
                case 1027984890:
                    String m897d2 = atm.m897d("B1EDA1EA97F0B1ECA1EE97FCB1D2A1E397F4B1D8A1EC97F9B1E3A1D797F0B1E2A1D297FEB1DDA1ED");
                    while (true) {
                        switch (m897d2.hashCode() ^ (-100103494)) {
                            case -720581961:
                                m897d2 = atm.m897d("B1D6A1EE97F9B1DFA1EA97FEB1E6A1EA97FCB1D2A1EE97FDB1E5A1D397FFB1D8A1ED97C7B1E0A1D197FAB1E2A1EE97C3B1E1A1EF97F4");
                            case -582318870:
                                m897d = atm.m897d("B1DAA1EE97FEB1E2A1DD97CEB1E6A1E997F9B1DFA1D197C1B1E2A1ED97F0B1DCA1DD97C0B1DAA1D997FDB1E2A1D097FCB1D6A1D397C0B1E6A1ED97C7B1EDA1D4");
                                continue;
                                continue;
                            case 22971235:
                                m897d = atm.m897d("B1DCA1D497FEB1D2A1EE97C0B1ECA1EC97FDB1E2A1EF97CFB1D6A1DE97C1B1D2");
                                continue;
                            case 1112077166:
                                m897d2 = str.contains(C0052e.m1418a(new byte[]{-31, 59, 109, 58, -6}, new byte[]{-49, 93, 4, 78, -64, 115, -16, -122})) ? atm.m897d("B1DBA1D797C4B1E2A1D297F8B1DEA1E297CFB1DBA1ED97C3B1DFA1ED97CEB1DCA1D097C0B1DBA1EF97C2B1ECA1D597C2B1D8A1EC97C7") : atm.m897d("B1E3A1EC97FEB1D8A1DD97C0B1E2A1E997FCB1E5A1EA97FEB1DCA1ED97FDB1DCA1D397C4B1D1A1E997C0B1D6A1E997CEB1E2A1EA97C4B1E6A1DD97FFB1D2A1ED");
                        }
                    }
                    break;
                case 1438898850:
                    String m897d3 = atm.m897d("B1E3A1EA97CEB1E2A1D797C1B1E2A1E997FFB1ECA1D397FCB1D2A1ED97C4B1E1A1E397F0B1E1A1EA97FAB1D6A1D797FFB1DEA1D397C0");
                    while (true) {
                        switch (m897d3.hashCode() ^ 315164912) {
                            case -1379625551:
                                m897d3 = atm.m897d("B1DBA1EE97CFB1E3A1D197FFB1EDA1D297FEB1E2A1EA97FFB1E1A1E997C0B1ECA1E997FCB1D6A1E997F4B1EC");
                            case -261551783:
                                break;
                            case 155604794:
                                m897d = atm.m897d("B1DAA1E997F0B1DAA1D397C3B1D1A1D097FEB1E0A1E397F0B1E5A1D097C7B1DBA1D197C1B1E2A1E397CEB1E1A1EA97C4B1E2");
                                continue;
                            case 454924098:
                                m897d3 = !str.contains(C0052e.m1418a(new byte[]{-80, -37, -92, 61, 101, -121, 23, -54, -16, -106}, new byte[]{-119, -20, -105, 4, 82, -76, 57, -78})) ? atm.m897d("B1EDA1D297FCB1DAA1E997C2B1DFA1D797F9B1E6A1D997CEB1E3A1D397C1B1E2A1D197F0B1E2A1E297C1B1E5") : atm.m897d("B1EDA1D497FDB1E2A1D197CFB1E0A1D197C2B1DCA1EC97FEB1E5A1D597F4B1DAA1D497C4B1D6");
                        }
                    }
                    break;
                case 1789962324:
                    m897d = atm.m897d("B1DEA1D797C0B1E2A1D797FAB1DCA1D397FCB1ECA1DE97FEB1D6A1D097C1B1DCA1ED97C4B1E2A1D097FEB1E6A1D497C0B1E5A1ED97C3B1E3A1EC97CE");
                    continue;
            }
            m897d = atm.m897d("B1DBA1E997C2B1D8A1DE97C4B1E2A1EC97FFB1E0A1D397F3B1DEA1D397C1B1DFA1ED97CEB1D8A1D497C0B1D1A1DD97CEB1E2");
        }
    }

    /* renamed from: f */
    public static boolean m198f(String str) {
        String m897d = atm.m897d("B1DFA1EA97C0B1DBA1D397C3B1DBA1DE97C4B1E2A1D397C0B1D8A1D197F3B1ECA1ED97F4B1D1");
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch ((m897d.hashCode() ^ 607) ^ (-1442812042)) {
                case -2049997204:
                    String m897d2 = atm.m897d("B1E2A1D097CFB1DFA1D397CEB1DFA1D397FFB1DBA1D097FFB1E2A1D397FDB1E6A1ED97C7B1E2A1EF97FEB1D1A1D397CEB1EDA1EE97C0B1E6A1D097C0");
                    while (true) {
                        switch (m897d2.hashCode() ^ 1304066782) {
                            case -1690160985:
                                break;
                            case 52013495:
                                m897d = atm.m897d("B1E2A1D597F9B1EDA1D797CFB1DDA1D197FAB1D2A1ED97CEB1DBA1D097C2B1D6A1D497F9B1E2A1EA97C4B1E1A1D097FDB1DD");
                                continue;
                            case 1508682552:
                                m897d2 = f1186a.matcher(str).find() ? atm.m897d("B1DCA1D397C4B1DAA1DD97FFB1E2A1EA97FEB1DEA1D097FFB1E3A1D197CEB1E6A1D297C3B1E1A1DD97F9B1DDA1ED97C1B1EDA1E3") : atm.m897d("B1DBA1E997F0B1E5A1D097CFB1DDA1D997F0B1E2A1EE97C3B1ECA1ED97FFB1D6A1E297C3B1DCA1D097C0B1D6A1D797C1B1D8A1E297C2B1DDA1ED97F9");
                            case 1913282556:
                                m897d2 = atm.m897d("B1DAA1ED97C1B1D8A1DD97C1B1E2A1DE97FCB1D2A1ED97FEB1E5A1ED97F0B1E2A1D197C1B1E6A1D097C3B1EDA1EF97C3B1DE");
                        }
                    }
                    break;
                case -1287360753:
                    m897d = atm.m897d("B1DCA1EE97F0B1DAA1D397C0B1E6A1DD97C4B1E2A1EE97C1B1E6A1D997F9B1ECA1E997F9B1E3A1ED97C2B1DBA1ED");
                    continue;
                case -357731426:
                    String m897d3 = atm.m897d("B1DBA1D597C3B1E0A1D397C2B1D2A1DE97C7B1E6A1EA97F0B1D8A1D197C3B1D1A1D797C4B1E2");
                    while (true) {
                        switch (m897d3.hashCode() ^ 522344373) {
                            case -1274080925:
                                m897d = atm.m897d("B1DBA1EE97C0B1E2A1EC97F3B1DAA1D297F8B1DFA1E297CEB1E6A1ED97CEB1DDA1EF97F3B1E3A1D397C0B1E5A1D997CE");
                                continue;
                            case -1237518812:
                                m897d3 = str.contains(C0052e.m1418a(new byte[]{-28, 65, 4, 14, 55, 34, -119}, new byte[]{-121, 37, 106, 35, 67, 77, -6, -101})) ? atm.m897d("B1D2A1EA97FAB1D6A1EC97FAB1E3A1E397CFB1DAA1D097F9B1E0A1ED97CFB1E1A1DD97F8B1E2A1EA97C1B1E0A1EF97F9B1D8A1D397CF") : atm.m897d("B1D1A1EF97FEB1E2A1D997F3B1DCA1ED97FAB1E2A1E297C0B1E2A1ED97C0B1E5A1D9");
                            case -1133410007:
                                m897d = atm.m897d("B1D6A1E997FEB1E0A1D797F8B1D1A1D197CEB1EDA1EC97C4B1DBA1D297F8B1E6A1DE97C2B1DAA1EE97F3B1E5A1D797FEB1E2A1EC97F4B1E2");
                                continue;
                                continue;
                            case 1907617131:
                                m897d3 = atm.m897d("B1D6A1E297C7B1D1A1D197C4B1DBA1E297FAB1DAA1EE97FDB1E2A1EE97C7B1E5A1EA97FDB1D6");
                        }
                    }
                    break;
                case -17495687:
                    z2 = true;
                    m897d = atm.m897d("B1E0A1E997CEB1E2A1D497C3B1E6A1D597F0B1E0A1DE97FAB1D2A1D097FEB1E1");
                    continue;
                case 147463450:
                    String m897d4 = atm.m897d("B1E2A1D397C4B1E5A1E297C4B1D1A1E297C3B1E3A1D297FDB1E0A1D797F9");
                    while (true) {
                        switch (m897d4.hashCode() ^ 749012289) {
                            case 396668078:
                                m897d = atm.m897d("B1D6A1E997FEB1E0A1D797F8B1D1A1D197CEB1EDA1EC97C4B1DBA1D297F8B1E6A1DE97C2B1DAA1EE97F3B1E5A1D797FEB1E2A1EC97F4B1E2");
                                continue;
                            case 779357146:
                                m897d4 = !str.contains(C0052e.m1418a(new byte[]{-9, -18, -84}, new byte[]{-39, -124, -33, -17, 103, 115, 27, -101})) ? atm.m897d("B1DAA1EF97CFB1DCA1D497F9B1E2A1D297F9B1D1A1DE97C3B1DCA1ED97FDB1D6A1D197C1B1D2A1E397FEB1D1A1DE97F9B1ECA1D497FCB1E6A1D7") : atm.m897d("B1DAA1EE97F0B1E2A1DD97FCB1D6A1DE97CEB1E2A1D997CFB1DEA1EC97C7B1D1");
                            case 1005869877:
                                break;
                            case 1098995895:
                                m897d4 = atm.m897d("B1DCA1D797F8B1E0A1DD97F8B1E2A1DE97FAB1DDA1D297C2B1D2A1ED97C0B1EDA1D197FDB1E2");
                        }
                    }
                    break;
                case 150943107:
                    m897d = atm.m897d("B1DCA1EE97F0B1DAA1D397C0B1E6A1DD97C4B1E2A1EE97C1B1E6A1D997F9B1ECA1E997F9B1E3A1ED97C2B1DBA1ED");
                    z = false;
                    continue;
                case 458157459:
                    m897d = atm.m897d("B1D6A1ED97F9B1E2A1D097FEB1DFA1ED97FAB1DEA1D597C3B1E1A1D397C0B1DCA1D097CFB1D2A1D497C1B1E1A1D497F0B1E2A1D397CEB1EDA1EF97F8B1E1");
                    continue;
                case 974333578:
                    m897d = atm.m897d("B1DBA1EA97F0B1E2A1D397FDB1D2A1D597C7B1D1A1D397F8B1E2A1D497C4B1D8A1DD97FCB1DA");
                    continue;
                case 1274538250:
                    return z;
                case 1296426868:
                    m897d = atm.m897d("B1D8A1D297C4B1E2A1D797FDB1DCA1ED97C1B1D2A1ED97C0B1E5A1DE97CEB1EDA1D097FDB1E2");
                    z = z2;
                    continue;
            }
            m897d = atm.m897d("B1EDA1D597CEB1EDA1DE97F8B1E3A1EA97C0B1DEA1ED97C0B1DBA1E397C0B1E2A1D097FDB1DFA1ED97C7B1E5A1D397F0B1DEA1D9");
        }
    }

    /* renamed from: g */
    public static boolean m197g(String str) {
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {C0052e.m1418a(new byte[]{66, -110, -30, -125, 120, 110, 65, 60, 70}, new byte[]{43, -29, -117, -6, 17, 64, 34, 83}), C0052e.m1418a(new byte[]{-5, 13, -21, 116, -27, -36, -35, -60}, new byte[]{-115, 35, -102, 5, -53, -65, -78, -87}), C0052e.m1418a(new byte[]{-5, 107, 96, 81, 87, -70, -85, -39, -17}, new byte[]{-126, 4, 21, 58, 34, -108, -56, -74}), C0052e.m1418a(new byte[]{16, 44, -93, 62, -67, 46}, new byte[]{124, 73, -115, 93, -46, 67, -14, 46}), C0052e.m1418a(new byte[]{122, 114, -8, -99, Byte.MIN_VALUE, 12, -121, -115, 99}, new byte[]{14, 7, -100, -14, -11, 34, -28, -30}), C0052e.m1418a(new byte[]{-6, 44, 59, -7, -61, -10, 82, 44}, new byte[]{-105, 75, 79, -113, -19, -107, 61, 65}), C0052e.m1418a(new byte[]{-113, -6, -62, -24, 120, -2, -44, -108}, new byte[]{-4, -107, -86, -99, 86, -99, -69, -7}), C0052e.m1418a(new byte[]{52, -99, 33, 113, 100, 51, 48, -29}, new byte[]{85, -2, 71, 4, 10, 29, 83, -115}), C0052e.m1418a(new byte[]{61, 109, 63, 100, -26, 94, 100, -92, 113, 103, 60, 96}, new byte[]{95, 4, 83, 13, -124, 55, 8, -51}), C0052e.m1418a(new byte[]{47, 103, 83, -55, 52, -92, -59, 99, 46, 105, 81}, new byte[]{77, 6, 60, -81, 81, -54, -94, 77}), C0052e.m1418a(new byte[]{93, 1, 4, 20, -19, 1, 110, 119}, new byte[]{45, 113, 112, 98, -61, 98, 1, 26})};
            int i = 0;
            while (true) {
                String m897d = atm.m897d("B1E3A1D797F0B1DEA1DD97CEB1E2A1E397C3B1E2A1E297FCB1E6A1ED97F9B1E5A1D997C3B1E6A1E997C0B1E0A1E997C1");
                while (true) {
                    switch (m897d.hashCode() ^ 1438932069) {
                        case -1826100342:
                            return false;
                        case -1531230138:
                            m897d = i < 11 ? atm.m897d("B1DAA1EF97F3B1E5A1E297F9B1DAA1D997FFB1DEA1E997FDB1DAA1DD97FEB1DCA1ED97F4B1DCA1E297F3B1E5A1D797CFB1DAA1E397FEB1E2") : atm.m897d("B1DAA1EA97C4B1E2A1EA97C1B1D6A1D197F0B1E3A1EC97F3B1E6A1ED97CFB1D8A1D3");
                        case -158359731:
                            m897d = atm.m897d("B1D6A1DD97FEB1E2A1D297CFB1DEA1D497C0B1D8A1D397F0B1E0A1D997C3B1DEA1E997F8B1E3A1EA97FEB1E0");
                        case 1076890117:
                            String m897d2 = atm.m897d("B1D6A1EA97CEB1E2A1D997F8B1D2A1ED97C4B1DBA1E997C0B1D8A1DE97F0B1DCA1EE97C3B1DAA1D797F8");
                            while (true) {
                                switch (m897d2.hashCode() ^ (-802040026)) {
                                    case -1295471573:
                                        break;
                                    case -730184824:
                                        m897d2 = atm.m897d("B1DFA1D197C4B1EDA1D497C0B1DAA1D497F4B1DEA1EF97FEB1D1A1E397C0B1E2A1D497FAB1DBA1ED97FCB1E5A1D597C0B1DEA1D4");
                                    case -523301477:
                                        m897d2 = host.contains(strArr[i]) ? atm.m897d("B1DAA1E997FCB1DFA1D297C4B1E2A1D497F4B1DAA1D297F4B1D6A1ED97CEB1DE") : atm.m897d("B1DBA1D597C3B1DFA1D297FEB1E2A1D397F0B1DEA1E297FCB1E5A1E297C1B1ECA1ED97C4B1DFA1E997C7B1D8A1D097F3B1D1A1D5");
                                    case 1945137935:
                                        String m897d3 = atm.m897d("B1E1A1D797F9B1ECA1D297C3B1E2A1EF97F9B1E2A1E297FFB1D2A1ED97F4B1DEA1E397FAB1D8A1E397FDB1D1A1E997C0B1DDA1D097C4B1E2A1D797C1B1DF");
                                        while (true) {
                                            switch (m897d3.hashCode() ^ 1937198206) {
                                                case -1976260048:
                                                    m897d3 = atm.m897d("B1E2A1EF97F8B1DFA1EC97C7B1E0A1EC97C1B1E0A1D397F9B1E2A1E297C2B1D8A1DE97FDB1D2A1ED");
                                                case -196154329:
                                                    String m897d4 = atm.m897d("B1DBA1ED97C7B1DDA1DD97CFB1D2A1D597C7B1E0A1D297FEB1DFA1D797FDB1DCA1EA97C0B1D8A1EE97F8");
                                                    while (true) {
                                                        switch (m897d4.hashCode() ^ (-692223026)) {
                                                            case -1123111350:
                                                                m897d4 = atm.m897d("B1DCA1D397F3B1D2A1D297F4B1E5A1D497CEB1E2A1D297CEB1E6A1ED97CEB1E5A1D297FDB1DCA1D997C1B1E2A1ED97C4B1D1A1D197C3B1ECA1D0");
                                                            case -811960866:
                                                                String m897d5 = atm.m897d("B1D1A1D297CEB1D8A1DE97FEB1DAA1D397F0B1E2A1D997FFB1EDA1D397C3B1E3A1EE97F8B1DBA1ED97FAB1DFA1D097CFB1ECA1E997C3B1DF");
                                                                while (true) {
                                                                    switch (m897d5.hashCode() ^ (-1717251794)) {
                                                                        case -2047947176:
                                                                            m897d5 = atm.m897d("B1DAA1DD97C0B1E1A1DE97C4B1DCA1E997C4B1DDA1EF97F0B1DFA1DE97F9B1E2");
                                                                        case -462947884:
                                                                            break;
                                                                        case -35765140:
                                                                            m897d5 = !str.contains(C0052e.m1418a(new byte[]{-18, -6, -50, -59, -2, 27, 96, -32, -22, -92, -48, -29}, new byte[]{-121, -117, -89, -68, -105, 53, 3, -113})) ? atm.m897d("B1DEA1D597F4B1DEA1DD97FDB1E2A1D297FEB1E2A1D997CFB1ECA1ED97F0B1ECA1D997C4B1E3A1DD97FCB1D2A1ED97F4B1ECA1EA97F8B1D8A1D0") : atm.m897d("B1DEA1E297F8B1D2A1D197F0B1E2A1EA97C1B1DFA1ED97F9B1E5A1D197F3B1ECA1D097C0B1E5A1EA97C0");
                                                                        case 1609618182:
                                                                            boolean contains = str.contains(C0052e.m1418a(new byte[]{107, -48, 63, 107, -44, 85, 58, 41, 111, -114, 32, 77}, new byte[]{2, -95, 86, 18, -67, 123, 89, 70}));
                                                                            String m897d6 = atm.m897d("B1E3A1EA97C0B1E0A1E997C0B1DCA1D797F0B1D6A1E397F9B1E0A1E297CF");
                                                                            while (true) {
                                                                                switch (m897d6.hashCode() ^ (-2027658128)) {
                                                                                    case -1936854633:
                                                                                        break;
                                                                                    case -1925108190:
                                                                                        m897d6 = atm.m897d("B1DBA1E297CFB1DDA1D297F3B1E5A1D397C2B1ECA1EA97F3B1D8A1D497C7");
                                                                                    case -442655249:
                                                                                        break;
                                                                                    case 1104131163:
                                                                                        m897d6 = contains ? atm.m897d("B1E1A1E997F3B1D1A1ED97CEB1E3A1EF97C4B1DDA1E997CFB1E5A1D097C3B1D2A1EA97FDB1E5A1E997F0B1E1A1D097F0") : atm.m897d("B1DBA1DD97FFB1E2A1EC97FAB1E1A1EA97F3B1D8A1ED97C4B1DCA1ED97C2B1E5A1E397C1B1E0A1D097CEB1E0A1DD");
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 826730474:
                                                                break;
                                                            case 1797662718:
                                                                m897d4 = !str.contains(C0052e.m1418a(new byte[]{36, 51, -11, 69, 12, 14, 22, 67, 32, 109, -3, 99}, new byte[]{77, 66, -100, 60, 101, 32, 117, 44})) ? atm.m897d("B1D6A1E397C0B1E2A1EF97F8B1DCA1ED97FCB1DCA1E397C0B1ECA1D397F4B1E3A1EA97F8") : atm.m897d("B1D2A1D497F4B1E3A1E297CFB1D6A1DE97F0B1E2A1D297C1B1E6A1EF97CFB1EC");
                                                        }
                                                    }
                                                    break;
                                                case 598265226:
                                                    break;
                                                case 1689057999:
                                                    m897d3 = C0052e.m1418a(new byte[]{-7, -85, -79, -54, 113, 54, 66, -15, -3}, new byte[]{-112, -38, -40, -77, 24, 24, 33, -98}).equals(strArr[i]) ? atm.m897d("B1DBA1E397F9B1E5A1D497FFB1E2A1EA97F0B1DDA1EE97C0B1DCA1EC97F4B1DEA1EE97FEB1E2A1ED97FDB1E6A1EA97C1B1E1A1EA97F9B1DCA1EF") : atm.m897d("B1D8A1D297F3B1D2A1EE97F3B1D2A1EA97FDB1E2A1D097C0B1DBA1ED97FCB1DCA1DD97C0B1DCA1EE97F8B1E0A1D097FAB1D6A1DE97C2B1D1A1ED97F0B1E2");
                                            }
                                        }
                                        break;
                                }
                            }
                            i++;
                            break;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 595
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: h */
    public static org.json.JSONObject m196h(java.lang.String r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 3822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p048m.C0620d.m196h(java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
