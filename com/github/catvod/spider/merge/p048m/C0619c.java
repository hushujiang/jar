package com.github.catvod.spider.merge.p048m;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.github.catvod.spider.merge.m.c */
/* loaded from: classes.dex */
public final class C0619c {
    static {
        String m897d = atm.m897d("B1DDA1D597C0B1DAA1D197FEB1E2A1ED97F9B1D2A1ED97C4B1E1A1D197CEB1D8A1D797FFB1ECA1D097C0");
        while (true) {
            switch ((m897d.hashCode() ^ 676) ^ (-376108793)) {
                case -1942401539:
                    C0052e.m1418a(new byte[]{72, -42, -10, -100, -34, -109, 76, 117, 53, -115}, new byte[]{0, -69, -105, -1, -115, -37, 13, 71});
                    m897d = atm.m897d("B1ECA1D197FDB1DBA1E997F4B1DFA1EC97CFB1ECA1D097F9B1E5A1ED97C0B1D6A1D597FCB1DBA1EC97C7");
                    break;
                case -1847781438:
                    C0052e.m1418a(new byte[]{41, 15, -2, -78, 123, -28, 74, 109}, new byte[]{97, 98, -97, -47, 40, -84, 11, 92});
                    m897d = atm.m897d("B1DDA1EA97FFB1E0A1D597C0B1DCA1D397F9B1DBA1D097C1B1E5A1D197FDB1E2A1D497FFB1DDA1D497C2B1E2A1D597C2B1DBA1ED");
                    break;
                case -98103634:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m204a(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), str3);
            Mac mac = Mac.getInstance(str3);
            mac.init(secretKeySpec);
            return mac.doFinal(str.getBytes());
        } catch (Exception e) {
            return null;
        }
    }
}
