package com.github.catvod.spider.merge.p048m;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.github.catvod.spider.merge.m.a */
/* loaded from: classes.dex */
public final class C0617a {

    /* renamed from: a */
    public static String f1185a;

    static {
        String m897d = atm.m897d("B1EDA1EF97CFB1D6A1DE97FDB1E2A1D397FFB1E0A1D797F0B1E1A1E997C4B1DCA1EC97FAB1E3A1DD97F9B1E6A1D497C7B1DFA1D497F8B1DCA1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 340) ^ 1600536117) {
                case -1575505731:
                    C0052e.m1418a(new byte[]{6, 97, -80, -96, 21, -77, 34, -26, 23, 111, -96, -36, 101, -96, 1, -83, 35, 77, -115, -24}, new byte[]{71, 36, -29, -113, 80, -16, 96, -55});
                    m897d = atm.m897d("B1E2A1D197CEB1D6A1E297FEB1D1A1D397FEB1EDA1EC97CEB1DFA1EF97C7B1DFA1D997C4");
                    break;
                case -938466842:
                    C0052e.m1418a(new byte[]{121, 61, -82, -53, 90, -2, -87, Byte.MAX_VALUE, 104, 51, -66, -73, 44, -20, -117, 52, 92, 17, -109, -125}, new byte[]{56, 120, -3, -28, 25, -68, -22, 80});
                    m897d = atm.m897d("B1D8A1D497C0B1E2A1D097F4B1E5A1D997C2B1E2A1ED97FDB1E2A1D097C0B1E1A1E997F8B1DEA1E297F0B1EDA1D097F9B1E2A1DD97F3B1D2A1ED");
                    break;
                case -762118726:
                    C0052e.m1418a(new byte[]{42, -17, -102, 110, 107, 43, -106, 59, 59, -31, -118, 18, 25, 56, -75, 112, 15, -61, -89, 38}, new byte[]{107, -86, -55, 65, 46, 104, -44, 20});
                    m897d = atm.m897d("B1E5A1DD97F0B1E6A1EC97C7B1DAA1DE97C2B1DBA1ED97F4B1E3A1EA97F8B1E1A1D197CEB1E2");
                    break;
                case -402919055:
                    return;
                case 403596512:
                    f1185a = C0052e.m1418a(new byte[]{18, 75, 109, -89, 9, -26, -42, -110, 3, 69, 125, -37, 125, -12, -12, -39, 55, 103, 80, -17}, new byte[]{83, 14, 62, -120, 74, -92, -107, -67});
                    m897d = atm.m897d("B1D2A1D097C7B1DDA1D097FEB1EDA1E397F9B1E2A1DD97C2B1D6A1EA97C3B1E3A1D497CFB1DBA1D297F9B1D6A1EE97F0B1DBA1ED97C0B1DBA1EF");
                    break;
                case 1211788548:
                    C0052e.m1418a(new byte[]{-66, -90, 46, -72, -39, -39, 13, -28, -81, -88, 62, -60, -81, -35, 62, -81, -101, -118, 19, -16}, new byte[]{-1, -29, 125, -105, -102, -115, 95, -53});
                    m897d = atm.m897d("B1E1A1D497F9B1D6A1D397CEB1E2A1D597F8B1DDA1DD97CEB1DEA1D297F3B1E0");
                    break;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m209a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0052e.m1418a(new byte[]{-35, -14, -40}, new byte[]{-100, -73, -117, 115, 5, -58, 116, -46}));
            Cipher cipher = Cipher.getInstance(str);
            String m897d = atm.m897d("B1E3A1D097C2B1DBA1EF97FAB1D6A1D397C0B1E2A1EC97F4B1DBA1EE97F0B1DDA1ED97C7B1ECA1D0");
            while (true) {
                switch (m897d.hashCode() ^ 220701001) {
                    case -1577503778:
                        if (bArr3 == null) {
                            m897d = atm.m897d("B1DAA1D297C4B1E0A1ED97FEB1E2A1EA97CEB1EDA1D797CEB1ECA1ED97FDB1DEA1E997C0B1DFA1D097CEB1D1A1DE97F9B1EDA1D597FEB1E2");
                            break;
                        } else {
                            m897d = atm.m897d("B1E3A1E997C3B1DFA1EC97CEB1E3A1EE97FCB1D8A1ED97C4B1EDA1E297C7B1DAA1D397C3B1DDA1EE97C7");
                            break;
                        }
                    case -1172201394:
                        m897d = atm.m897d("B1E1A1E997FAB1E0A1ED97C0B1E6A1EA97C3B1DDA1E997F9B1DBA1E397FEB1E2A1EC97FCB1DEA1D297F8B1D8");
                        break;
                    case -214106213:
                        cipher.init(2, secretKeySpec);
                        break;
                    case 1669521293:
                        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                        break;
                }
            }
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m208b(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        String m897d = atm.m897d("B1ECA1E997C0B1E2A1D797FDB1DFA1D197C7B1DBA1D597FDB1DDA1ED97C0B1E6A1DD97C0B1E3A1DE97CEB1E2A1DE97F0B1ED");
        while (true) {
            switch ((m897d.hashCode() ^ 560) ^ 327852763) {
                case -1231553735:
                    m897d = atm.m897d("B1D2A1DE97C1B1D2A1E397FAB1D6A1EC97CFB1DCA1EC97C4B1E2A1E297C2B1DBA1EF97F9B1E2A1EA97C3B1D8A1E397FFB1D2A1ED97C1B1DFA1D0");
                    break;
                case -403305880:
                    return new String(m209a(bArr, bArr2, bArr3, str));
                case -160903999:
                    m897d = atm.m897d("B1E0A1EC97C4B1DDA1E297F4B1E6A1D497FEB1E2A1D597FFB1E5A1D597F9B1D8A1D197F8B1E3A1EC97FCB1E6");
                    break;
                case 799107211:
                    m897d = atm.m897d("B1E3A1EA97FFB1D6A1EE97FEB1E2A1EF97FAB1E1A1E297FAB1DAA1DD97F0B1EDA1D397C1B1DCA1D397C3B1D2A1D997FCB1E3A1D197FFB1E1");
                    break;
                case 1146842488:
                    m897d = atm.m897d("B1D2A1D097CFB1DCA1D197C0B1E2A1EF97CEB1D2A1ED97FAB1E5A1E997C0B1E5A1D297F0");
                    break;
            }
        }
    }

    /* renamed from: c */
    public static byte[] m207c(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, C0052e.m1418a(new byte[]{-38, -54, 94}, new byte[]{-101, -113, 13, 39, 49, 97, 90, 39}));
            Cipher cipher = Cipher.getInstance(str);
            String m897d = atm.m897d("B1EDA1D097FDB1E0A1EA97F8B1DAA1D197F8B1DDA1EF97C7B1D8A1DE97FF");
            while (true) {
                switch (m897d.hashCode() ^ (-2096501580)) {
                    case -1949393075:
                        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                        break;
                    case -1705373460:
                        m897d = atm.m897d("B1DDA1D197F3B1E6A1DE97F0B1DDA1D097FEB1DFA1E997C0B1E2A1ED97F9B1EC");
                        break;
                    case 27526974:
                        if (bArr3 == null) {
                            m897d = atm.m897d("B1D2A1D797C4B1ECA1D197CEB1E2A1D797FCB1ECA1D997C1B1E2A1EE97CEB1DEA1DD97F4");
                            break;
                        } else {
                            m897d = atm.m897d("B1EDA1DE97F9B1E3A1D997FDB1E2A1D397F0B1DBA1ED97FFB1E2A1DE97F9B1DCA1DD97C0B1E1A1ED97F8B1DAA1D497F9B1E2");
                            break;
                        }
                    case 947769936:
                        cipher.init(1, secretKeySpec);
                        break;
                }
            }
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }
}
